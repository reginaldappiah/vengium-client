package com.jagex;/* Class348 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class SoftCache {

	LinkedList linkedList;
	CircularDoubleLinkedList circularDoubleLinkedList = new CircularDoubleLinkedList();
	int capacity;
	int defaultCapacity;

	void method4182(Class298_Sub37_Sub9 class298_sub37_sub9) {
			if (null != class298_sub37_sub9) {
				class298_sub37_sub9.unlink();
				class298_sub37_sub9.unlinkCache();
				capacity += -1044171843 * class298_sub37_sub9.anInt9600;
			}
	}

	public int method4183() {
			int i_0_ = 0;
			for (Class298_Sub37_Sub9 class298_sub37_sub9 = (Class298_Sub37_Sub9) circularDoubleLinkedList.first(); class298_sub37_sub9 != null; class298_sub37_sub9 = (Class298_Sub37_Sub9) circularDoubleLinkedList.next()) {
				if (!class298_sub37_sub9.method3438()) {
					i_0_++;
				}
			}
			return i_0_;
	}

	public Object get(long key) {
			Class298_Sub37_Sub9 class298_sub37_sub9 = ((Class298_Sub37_Sub9) linkedList.get(key));
			if (null == class298_sub37_sub9) {
				return null;
			}
			Object object = class298_sub37_sub9.method3437(-1395408926);
			if (null == object) {
				class298_sub37_sub9.unlink();
				class298_sub37_sub9.unlinkCache();
				capacity += (class298_sub37_sub9.anInt9600 * -1044171843);
				return null;
			}
			if (class298_sub37_sub9.method3438()) {
				Class298_Sub37_Sub9_Sub1 class298_sub37_sub9_sub1 = new Class298_Sub37_Sub9_Sub1(object, (1980662847 * (class298_sub37_sub9.anInt9600)));
				linkedList.connect(class298_sub37_sub9_sub1, class298_sub37_sub9.key * 7051297995265073167L);
				circularDoubleLinkedList.offer(class298_sub37_sub9_sub1);
				class298_sub37_sub9_sub1.cachedKey = 0L;
				class298_sub37_sub9.unlink();
				class298_sub37_sub9.unlinkCache();
			} else {
				circularDoubleLinkedList.offer(class298_sub37_sub9);
				class298_sub37_sub9.cachedKey = 0L;
			}
			return object;
	}

	public void put(Object object, long l, int i) {
			if (i > defaultCapacity * 2087531591) {
				throw new IllegalStateException();
			}
			method4193(l);
			capacity -= -1846372093 * i;
			while (1177262507 * capacity < 0) {
				Class298_Sub37_Sub9 class298_sub37_sub9 = (Class298_Sub37_Sub9) circularDoubleLinkedList.poll();
				method4182(class298_sub37_sub9);
			}
			Class298_Sub37_Sub9_Sub1 class298_sub37_sub9_sub1 = new Class298_Sub37_Sub9_Sub1(object, i);
			linkedList.connect(class298_sub37_sub9_sub1, l);
			circularDoubleLinkedList.offer(class298_sub37_sub9_sub1);
			class298_sub37_sub9_sub1.cachedKey = 0L;

	}

	public void method4186(int i) {
			for (Class298_Sub37_Sub9 class298_sub37_sub9 = (Class298_Sub37_Sub9) circularDoubleLinkedList.first(); class298_sub37_sub9 != null; class298_sub37_sub9 = (Class298_Sub37_Sub9) circularDoubleLinkedList.next()) {
				if (class298_sub37_sub9.method3438()) {
					if (class298_sub37_sub9.method3437(1618549592) == null) {
						class298_sub37_sub9.unlink();
						class298_sub37_sub9.unlinkCache();
						capacity += -1044171843 * class298_sub37_sub9.anInt9600;
					}
				} else if ((class298_sub37_sub9.cachedKey += 1476940603538232441L) * -5533549728640346679L > i) {
					Class298_Sub37_Sub9_Sub2 class298_sub37_sub9_sub2 = (new Class298_Sub37_Sub9_Sub2(class298_sub37_sub9.method3437(1802409899), (class298_sub37_sub9.anInt9600) * 1980662847));
					linkedList.connect(class298_sub37_sub9_sub2, 7051297995265073167L * class298_sub37_sub9.key);
					NodeCollection.method5973(class298_sub37_sub9_sub2, class298_sub37_sub9, -2008394772);
					class298_sub37_sub9.unlink();
					class298_sub37_sub9.unlinkCache();
				}
		}
	}

	public void clear() {
			circularDoubleLinkedList.clear();
			linkedList.clear();
			capacity = 1537477589 * defaultCapacity;
	}

	public int getDefaultCapacity() {
			return defaultCapacity * 2087531591;
	}

	public SoftCache(int i) {
		this(i, i);
	}

	public void sweep() {
			for (Class298_Sub37_Sub9 class298_sub37_sub9 = (Class298_Sub37_Sub9) circularDoubleLinkedList.first(); null != class298_sub37_sub9; class298_sub37_sub9 = (Class298_Sub37_Sub9) circularDoubleLinkedList.next()) {
				if (class298_sub37_sub9.method3438()) {
					class298_sub37_sub9.unlink();
					class298_sub37_sub9.unlinkCache();
					capacity += -1044171843 * class298_sub37_sub9.anInt9600;
				}
			}
	}

	public Object method4190() {
			Class298_Sub37_Sub9 class298_sub37_sub9 = ((Class298_Sub37_Sub9) linkedList.method5816());
			while_82_: do {
				Object object;
				for (;;) {
					if (null == class298_sub37_sub9) {
						break while_82_;
					}
					object = class298_sub37_sub9.method3437(-709026193);
					if (object != null) {
						break;
					}
					Class298_Sub37_Sub9 class298_sub37_sub9_3_ = class298_sub37_sub9;
					class298_sub37_sub9 = (Class298_Sub37_Sub9) linkedList.method5815();
					class298_sub37_sub9_3_.unlink();
					class298_sub37_sub9_3_.unlinkCache();
					capacity += -1044171843 * class298_sub37_sub9_3_.anInt9600;
				}
				return object;
			} while (false);
			return null;
	}

	public Object method4191() {
			Class298_Sub37_Sub9 class298_sub37_sub9 = ((Class298_Sub37_Sub9) linkedList.method5815());
			while_83_: do {
				Object object;
				for (;;) {
					if (class298_sub37_sub9 == null) {
						break while_83_;
					}
					object = class298_sub37_sub9.method3437(110174403);
					if (object != null) {
						break;
					}
					Class298_Sub37_Sub9 class298_sub37_sub9_4_ = class298_sub37_sub9;
					class298_sub37_sub9 = (Class298_Sub37_Sub9) linkedList.method5815();
					class298_sub37_sub9_4_.unlink();
					class298_sub37_sub9_4_.unlinkCache();
					capacity += -1044171843 * class298_sub37_sub9_4_.anInt9600;
				}
				return object;
			} while (false);
			return null;

	}

	public int getCapacity() {
			return capacity * 1177262507;
	}

	public void method4193(long l) {
			Class298_Sub37_Sub9 class298_sub37_sub9 = ((Class298_Sub37_Sub9) linkedList.get(l));
			method4182(class298_sub37_sub9);
	}

	public void put(Object object, long l) {
			put(object, l, 1);
	}

	public SoftCache(int capacity, int maximum) {
		defaultCapacity = capacity * -1371130505;
		this.capacity = capacity * -1846372093;
		
		int index;
		for (index = 1; index + index < capacity && index < maximum; index += index);
		
		linkedList = new LinkedList(index);
	}

	public static Class413[] method4196() {
			return (new Class413[] { Class413.aClass413_6580, Class413.aClass413_6583, Class413.aClass413_6579, Class413.aClass413_6586, Class413.aClass413_6587, Class413.aClass413_6576, Class413.aClass413_6585, Class413.aClass413_6581, Class413.aClass413_6577, Class413.aClass413_6575, Class413.aClass413_6584, Class413.aClass413_6588, Class413.aClass413_6582, Class413.aClass413_6578 });
	}

	public static int method4197(int i, int i_8_, boolean bool) {
			Class298_Sub9 class298_sub9 = StaticMethods.method2437(i, bool);
			if (null == class298_sub9) {
				return 0;
			}
			if (i_8_ == -1) {
				return 0;
			}
			int i_10_ = 0;
			for (int index = 0; index < class298_sub9.anIntArray7227.length; index++) {
				if (i_8_ == class298_sub9.anIntArray7226[index]) {
					i_10_ += (class298_sub9.anIntArray7227[index]);
				}
			}
			return i_10_;
	}

}
