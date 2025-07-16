package com.jagex;/* Class437 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public final class LinkedList implements Iterable {
	Node[] table;
	Node next;
	long key;
	int capacity;
	Node prev;
	int current = 0;
	static int anInt5518;

	public void clear() {
			for (int index = 0; index < 577108745 * capacity; index++) {
				Node node = table[index];
				for (;;) {
					Node previous = node.previous;
					if (node == previous) {
						break;
					}
					previous.unlink();
				}
			}
			next = null;
			prev = null;
	}

	public Node get(long key) {
			this.key = key * -1039549200087996967L;
			Node previousNode = (table[(int) (key & 577108745 * capacity - 1)]);
			for (next = previousNode.previous; next != previousNode; next = next.previous) {
				if ((next.key * 7051297995265073167L) == key) {
					Node nextNode = next;
					next = next.previous;
					return nextNode;
				}
			}
			next = null;
			return null;
	}

	public Node poll() {
			if (null == next) {
				return null;
			}
			for (Node node = (table[(int) ((key * -6131383980927776151L) & (capacity * 577108745) - 1)]); next != node; next = next.previous) {
                if (key * -6131383980927776151L == (next.key * 7051297995265073167L)) {
                    Node nextNode = next;
                    next = next.previous;
                    return nextNode;
                }
            }
			next = null;
			return null;
	}

	public int getSize() {
			int capacity = 0;
			for (int index = 0; index < this.capacity * 577108745; index++) {
				Node node = table[index];
				for (Node class298_6_ = node.previous; node != class298_6_; class298_6_ = class298_6_.previous) {
					capacity++;
				}
			}
			return capacity;
	}

	public Node method5815() {
			if (-1375920843 * current > 0 && (prev != (table[current * -1375920843 - 1]))) {
				Node prev = this.prev;
				this.prev = prev.previous;
				return prev;
			}
			while_102_: do {
				Node current;
				do {
					if (this.current * -1375920843 >= 577108745 * capacity) {
						break while_102_;
					}
					current = (table[((this.current += -1552413411) * -1375920843) - 1].previous);
				} while (current == (table[-1375920843 * this.current - 1]));
				prev = current.previous;
				return current;
			} while (false);
			return null;
	}

	public Iterator iterator() {
			return new Class460(this);
	}

	public Node method5816() {
			current = 0;
			return method5815();
	}

	public void connect(Node node, long key) {
			if (node.next != null) {
				node.unlink();
			}
			Node class298_7_ = (table[(int) (key & capacity * 577108745 - 1)]);
			node.next = class298_7_.next;
			node.previous = class298_7_;
			node.next.previous = node;
			node.previous.next = node;
			node.key = 4191220306876042991L * key;
	}

	public static int getNextBitValue(int maxKey) {
			maxKey = --maxKey | maxKey >>> 1;
			maxKey |= maxKey >>> 2;
			maxKey |= maxKey >>> 4;
			maxKey |= maxKey >>> 8;
			maxKey |= maxKey >>> 16;
			return 1 + maxKey;
	}

	public LinkedList(int capacity) {
		this.capacity = 1594491705 * capacity;
		table = new Node[capacity];
		for (int index = 0; index < capacity; index++) {
			Node node = table[index] = new Node();
			node.previous = node;
			node.next = node;
		}
	}
}
