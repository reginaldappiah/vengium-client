package com.jagex;/* Class340 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class340 {
	int anInt3639;
	CircularDoubleLinkedList aClass461_3640 = new CircularDoubleLinkedList();
	LinkedList aClass437_3641;
	int anInt3642;

	public final void method4127(Object object, Interface18 interface18) {
		method4130(object, interface18, 1);
	}

	final void method4128(Interface18 interface18) {
		long l = interface18.method231();
		for (Class298_Sub37_Sub1 class298_sub37_sub1 = ((Class298_Sub37_Sub1) this.aClass437_3641.get(l)); class298_sub37_sub1 != null; class298_sub37_sub1 = (Class298_Sub37_Sub1) this.aClass437_3641.poll()) {
			if (class298_sub37_sub1.anInterface18_9575.method232(interface18)) {
				method4129(class298_sub37_sub1);
				break;
			}
		}
	}

	final void method4129(Class298_Sub37_Sub1 class298_sub37_sub1) {
		if (class298_sub37_sub1 != null) {
			class298_sub37_sub1.unlink();
			class298_sub37_sub1.unlinkCache();
			this.anInt3642 += class298_sub37_sub1.anInt9576;
		}
	}

	final void method4130(Object object, Interface18 interface18, int i) {
		if (i > this.anInt3639)
			throw new IllegalStateException();
		method4128(interface18);
		this.anInt3642 -= i;
		while (this.anInt3642 < 0) {
			Class298_Sub37_Sub1 class298_sub37_sub1 = ((Class298_Sub37_Sub1) this.aClass461_3640.poll());
			method4129(class298_sub37_sub1);
		}
		Class298_Sub37_Sub1_Sub1 class298_sub37_sub1_sub1 = new Class298_Sub37_Sub1_Sub1(interface18, object, i);
		this.aClass437_3641.connect(class298_sub37_sub1_sub1, interface18.method231());
		this.aClass461_3640.offer(class298_sub37_sub1_sub1);
		class298_sub37_sub1_sub1.cachedKey = 0L;
	}

	public final void method4131(int i) {
		for (Class298_Sub37_Sub1 class298_sub37_sub1 = ((Class298_Sub37_Sub1) this.aClass461_3640.first()); class298_sub37_sub1 != null; class298_sub37_sub1 = ((Class298_Sub37_Sub1) this.aClass461_3640.next())) {
			if (class298_sub37_sub1.method3407()) {
				if (class298_sub37_sub1.method3406() == null) {
					class298_sub37_sub1.unlink();
					class298_sub37_sub1.unlinkCache();
					this.anInt3642 += (class298_sub37_sub1.anInt9576);
				}
			} else if (((class298_sub37_sub1.cachedKey += 1476940603538232441L) * -5533549728640346679L) > (long) i) {
				Class298_Sub37_Sub1_Sub2 class298_sub37_sub1_sub2 = (new Class298_Sub37_Sub1_Sub2((class298_sub37_sub1.anInterface18_9575), class298_sub37_sub1.method3406(), (class298_sub37_sub1.anInt9576)));
				this.aClass437_3641.connect(class298_sub37_sub1_sub2, class298_sub37_sub1.key * 7051297995265073167L);
				NodeCollection.method5973(class298_sub37_sub1_sub2, class298_sub37_sub1, -1652592361);
				class298_sub37_sub1.unlink();
				class298_sub37_sub1.unlinkCache();
			}
		}
	}

	public final void method4132() {
		this.aClass461_3640.clear();
		this.aClass437_3641.clear();
		this.anInt3642 = this.anInt3639;
	}

	public final int method4133() {
		return this.anInt3639;
	}

	public final Object method4134(Interface18 interface18) {
		long l = interface18.method231();
		for (Class298_Sub37_Sub1 class298_sub37_sub1 = ((Class298_Sub37_Sub1) this.aClass437_3641.get(l)); class298_sub37_sub1 != null; class298_sub37_sub1 = (Class298_Sub37_Sub1) this.aClass437_3641.poll()) {
			if (class298_sub37_sub1.anInterface18_9575.method232(interface18)) {
				Object object = class298_sub37_sub1.method3406();
				if (object == null) {
					class298_sub37_sub1.unlink();
					class298_sub37_sub1.unlinkCache();
					this.anInt3642 += (class298_sub37_sub1.anInt9576);
				} else {
					if (class298_sub37_sub1.method3407()) {
						Class298_Sub37_Sub1_Sub1 class298_sub37_sub1_sub1 = (new Class298_Sub37_Sub1_Sub1(interface18, object, (class298_sub37_sub1.anInt9576)));
						this.aClass437_3641.connect(class298_sub37_sub1_sub1, (class298_sub37_sub1.key * 7051297995265073167L));
						this.aClass461_3640.offer(class298_sub37_sub1_sub1);
						class298_sub37_sub1_sub1.cachedKey = 0L;
						class298_sub37_sub1.unlink();
						class298_sub37_sub1.unlinkCache();
					} else {
						this.aClass461_3640.offer(class298_sub37_sub1);
						class298_sub37_sub1.cachedKey = 0L;
					}
					return object;
				}
			}
		}
		return null;
	}

	public Class340(int i) {
		this.anInt3639 = i;
		this.anInt3642 = i;
		int i_0_;
		for (i_0_ = 1; i_0_ + i_0_ < i; i_0_ += i_0_) {
			/* empty */
		}
		this.aClass437_3641 = new LinkedList(i_0_);
	}

	public final int method4135() {
		return this.anInt3642;
	}

	public final void method4136() {
		for (Class298_Sub37_Sub1 class298_sub37_sub1 = ((Class298_Sub37_Sub1) this.aClass461_3640.first()); class298_sub37_sub1 != null; class298_sub37_sub1 = ((Class298_Sub37_Sub1) this.aClass461_3640.next())) {
			if (class298_sub37_sub1.method3407()) {
				class298_sub37_sub1.unlink();
				class298_sub37_sub1.unlinkCache();
				this.anInt3642 += class298_sub37_sub1.anInt9576;
			}
		}
	}
}
