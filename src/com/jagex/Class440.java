package com.jagex;/* Class440 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class440 {
	Node[] aClass298Array5576;
	int anInt5577;
	long aLong5578;
	Node aClass298_5579;
	Node aClass298_5580;
	int anInt5581 = 0;
	public static Class205 aClass205_5582;

	public Node method5852(long l) {
		try {
			this.aLong5578 = l * 236245195989619781L;
			Node class298 = (this.aClass298Array5576[(int) (l & (long) (1721892305 * this.anInt5577 - 1))]);
			for (this.aClass298_5580 = class298.previous; class298 != this.aClass298_5580; this.aClass298_5580 = this.aClass298_5580.previous) {
				if ((this.aClass298_5580.key * 7051297995265073167L) == l) {
					Node class298_0_ = this.aClass298_5580;
					this.aClass298_5580 = this.aClass298_5580.previous;
					return class298_0_;
				}
			}
			this.aClass298_5580 = null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("se.a(").append(')').toString());
		}
	}

	public Node method5853(int i) {
		try {
			if (this.aClass298_5580 == null)
				return null;
			for (Node class298 = (this.aClass298Array5576[(int) ((this.aLong5578 * 4770221757987511949L) & (long) ((1721892305 * this.anInt5577) - 1))]); class298 != this.aClass298_5580; this.aClass298_5580 = this.aClass298_5580.previous) {
				if ((this.aClass298_5580.key * 7051297995265073167L) == 4770221757987511949L * this.aLong5578) {
					Node class298_1_ = this.aClass298_5580;
					this.aClass298_5580 = this.aClass298_5580.previous;
					return class298_1_;
				}
			}
			this.aClass298_5580 = null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("se.f(").append(')').toString());
		}
	}

	public int method5854(Node[] class298s, int i) {
		try {
			int i_2_ = 0;
			for (int i_3_ = 0; i_3_ < 1721892305 * this.anInt5577; i_3_++) {
				Node class298 = this.aClass298Array5576[i_3_];
				for (Node class298_4_ = class298.previous; class298_4_ != class298; class298_4_ = class298_4_.previous)
					class298s[i_2_++] = class298_4_;
			}
			return i_2_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("se.b(").append(')').toString());
		}
	}

	public int method5855(int i) {
		try {
			int i_5_ = 0;
			for (int i_6_ = 0; i_6_ < 1721892305 * this.anInt5577; i_6_++) {
				Node class298 = this.aClass298Array5576[i_6_];
				for (Node class298_7_ = class298.previous; class298_7_ != class298; class298_7_ = class298_7_.previous)
					i_5_++;
			}
			return i_5_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("se.p(").append(')').toString());
		}
	}

	public Node method5856(int i) {
		try {
			this.anInt5581 = 0;
			return method5857((byte) -79);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("se.k(").append(')').toString());
		}
	}

	public Node method5857(byte i) {
		try {
			if (1311298783 * this.anInt5581 > 0 && (this.aClass298_5579 != (this.aClass298Array5576[this.anInt5581 * 1311298783 - 1]))) {
				Node class298 = this.aClass298_5579;
				this.aClass298_5579 = class298.previous;
				return class298;
			}
			while_103_: do {
				Node class298;
				do {
					if (1311298783 * this.anInt5581 >= 1721892305 * this.anInt5577)
						break while_103_;
					class298 = (this.aClass298Array5576[((this.anInt5581 += 489154335) * 1311298783) - 1].previous);
				} while ((this.aClass298Array5576[this.anInt5581 * 1311298783 - 1]) == class298);
				this.aClass298_5579 = class298.previous;
				return class298;
			} while (false);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("se.d(").append(')').toString());
		}
	}

	public Class440(int i) {
		this.anInt5577 = -249857231 * i;
		this.aClass298Array5576 = new Node[i];
		for (int i_8_ = 0; i_8_ < i; i_8_++) {
			Node class298 = this.aClass298Array5576[i_8_] = new Node();
			class298.previous = class298;
			class298.next = class298;
		}
	}

	public void method5858(Node class298, long l) {
		try {
			if (null != class298.next)
				class298.unlink();
			Node class298_9_ = (this.aClass298Array5576[(int) (l & (long) (this.anInt5577 * 1721892305 - 1))]);
			class298.next = class298_9_.next;
			class298.previous = class298_9_;
			class298.next.previous = class298;
			class298.previous.next = class298;
			class298.key = l * 4191220306876042991L;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("se.i(").append(')').toString());
		}
	}

	static final void method5859(ScriptRuntime class403, byte i) {
		try {
			int i_10_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			PublicMessage class102 = PublicMessage.getMessageCharacterCount(i_10_);
			String string = "";
			if (null != class102 && null != class102.playerMessageRights)
				string = class102.playerMessageRights;
			class403.objectStack[((class403.objectArgs += 969361751) * -203050393 - 1)] = string;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("se.ach(").append(')').toString());
		}
	}

	public static void method5860(Interface22 interface22) {
		try {
			if (IcmpService_Sub1.anIcmpService_Sub1_8551 == null)
				throw new IllegalStateException("");
			IcmpService_Sub1.anIcmpService_Sub1_8551.aList8552.add(interface22);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("se.i(").append(')').toString());
		}
	}

	public static Class428[] method5861(int i) {
		try {
			return (new Class428[] { Class428.aClass428_6618, Class428.aClass428_6619, Class428.aClass428_6620, Class428.aClass428_6617, Class428.aClass428_6616, Class428.aClass428_6621 });
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("se.a(").append(')').toString());
		}
	}

}
