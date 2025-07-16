package com.jagex;/* Class453 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Collection;
import java.util.Iterator;

public class Class453 implements Iterable, Collection {
	public Node aClass298_5643 = new Node();
	Node aClass298_5644;

	public void pushBack(Node node) {
			if (null != node.next)
				node.unlink();
			node.next = aClass298_5643.next;
			node.previous = aClass298_5643;
			node.next.previous = node;
			node.previous.next = node;
	}

	public Node popHead() {
			Node node = aClass298_5643.previous;
			if (node == aClass298_5643)
				return null;
			node.unlink();
			return node;
	}

	void method5937(Class453 class453_0_, Node class298) {
			Node class298_1_ = aClass298_5643.next;
			aClass298_5643.next = class298.next;
			class298.next.previous = aClass298_5643;
			if (aClass298_5643 != class298) {
				class298.next = class453_0_.aClass298_5643.next;
				class298.next.previous = class298;
				class298_1_.previous = class453_0_.aClass298_5643;
				class453_0_.aClass298_5643.next = class298_1_;
			}
	}

	public void method5938(Class453 class453_2_) {
			if (aClass298_5643 != aClass298_5643.previous)
				method5937(class453_2_, aClass298_5643.previous);
	}

	public Node method5939() {
			return method5945(null);
	}

	Node method5940(Node node) {
			Node class298_3_;
			if (null == node)
				class298_3_ = aClass298_5643.next;
			else
				class298_3_ = node;
			if (aClass298_5643 == class298_3_) {
				this.aClass298_5644 = null;
				return null;
			}
			this.aClass298_5644 = class298_3_.next;
			return class298_3_;
	}

	Node[] method5941() {
			Node[] class298s = new Node[size2()];
			int i_4_ = 0;
			for (Node class298 = aClass298_5643.previous; class298 != aClass298_5643; class298 = class298.previous)
				class298s[i_4_++] = class298;
			return class298s;
	}

	public Iterator iterator() {
			return new Class446(this);
	}

	public boolean isEmpty() {
			return method5946();
	}

	public boolean contains(Object object) {
			throw new RuntimeException();
	}

	public Object[] toArray() {
			return method5941();
	}

	public Node method5942() {
			return method5940(null);
	}

	public boolean remove(Object object) {
			throw new RuntimeException();
	}

	public boolean containsAll(Collection collection) {
			throw new RuntimeException();
	}

	public boolean addAll(Collection collection) {
			throw new RuntimeException();
	}

	public boolean removeAll(Collection collection) {
			throw new RuntimeException();
	}

	public boolean retainAll(Collection collection) {
			throw new RuntimeException();
	}

	public void clear() {
			clean();
	}

	public boolean add(Object object) {
			return method5949((Node) object);
	}

	public boolean equals(Object object) {
			return super.equals(object);
	}

	public int hashCode() {
			return super.hashCode();
	}

	public void clean() {
			while (aClass298_5643.previous != aClass298_5643)
				aClass298_5643.previous.unlink();
	}

	public Object[] toArray(Object[] objects) {
			int i = 0;
			for (Node class298 = aClass298_5643.previous; aClass298_5643 != class298; class298 = class298.previous)
				objects[i++] = class298;
			return objects;
	}

	public Node method5944() {
			Node class298 = this.aClass298_5644;
			if (aClass298_5643 == class298) {
				this.aClass298_5644 = null;
				return null;
			}
			this.aClass298_5644 = class298.previous;
			return class298;
	}

	Node method5945(Node class298) {
			Node class298_5_;
			if (class298 == null)
				class298_5_ = aClass298_5643.previous;
			else
				class298_5_ = class298;
			if (aClass298_5643 == class298_5_) {
				this.aClass298_5644 = null;
				return null;
			}
			this.aClass298_5644 = class298_5_.previous;
			return class298_5_;
	}

	public Class453() {
		aClass298_5643.previous = aClass298_5643;
		aClass298_5643.next = aClass298_5643;
	}

	public int size() {
			return size2();
	}

	public boolean method5946() {
			return aClass298_5643 == aClass298_5643.previous;
	}

	public Node method5947() {
			Node class298 = this.aClass298_5644;
			if (class298 == aClass298_5643) {
				this.aClass298_5644 = null;
				return null;
			}
			this.aClass298_5644 = class298.next;
			return class298;
	}

	public int size2() {
			int i_6_ = 0;
			for (Node node = aClass298_5643.previous; aClass298_5643 != node; node = node.previous)
				i_6_++;
			return i_6_;
	}

	boolean method5949(Node node) {
			pushBack(node);
			return true;
	}

}
