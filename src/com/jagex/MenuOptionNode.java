package com.jagex;/* MenuOptionNode - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class MenuOptionNode extends Cacheable {
	public int getTotalMenus;
	CircularDoubleLinkedList circularDoubleLinkedList;
	String aString9585;

	boolean method3416(MenuOption menuOption) {
		try {
			boolean bool = true;
			menuOption.unlinkCache();
			MenuOption menuOption_0_ = ((MenuOption) this.circularDoubleLinkedList.first());
			while (menuOption_0_ != null) {
				if (Class473.method6069((menuOption.componentID * 946432351), (menuOption_0_.componentID * 946432351))) {
					Class63.method742(menuOption, menuOption_0_);
					this.getTotalMenus += -130647835;
					return !bool;
				}
				menuOption_0_ = (MenuOption) this.circularDoubleLinkedList.next();
				bool = false;
			}
			this.circularDoubleLinkedList.offer(menuOption);
			this.getTotalMenus += -130647835;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aij.f(").append(')').toString());
		}
	}

	MenuOptionNode(String string) {
		this.aString9585 = string;
        this.circularDoubleLinkedList = new CircularDoubleLinkedList();
	}

	int method3417() {
			if ((this.circularDoubleLinkedList.DELIMETER) != (this.circularDoubleLinkedList.DELIMETER.next_cache))
				return ((((MenuOption) this.circularDoubleLinkedList.DELIMETER.next_cache).componentID) * 946432351);
			return -1;
	}

	boolean method3418(MenuOption menuOption) {
		try {
			int i_1_ = method3417();
			menuOption.unlinkCache();
			this.getTotalMenus -= -130647835;
			if (-628325139 * this.getTotalMenus == 0) {
				unlink();
				unlinkCache();
				Class436.anInt5479 -= -1658575779;
				Class436.aClass348_5464.put(this, ((menuOption.unlocker) * 6619564980435866523L));
				return false;
			}
			return i_1_ != method3417();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aij.b(").append(')').toString());
		}
	}

}
