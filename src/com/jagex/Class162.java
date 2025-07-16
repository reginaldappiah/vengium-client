package com.jagex;/* Class162 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class162 {
	public int anInt1649;
	boolean aBoolean1650;
	boolean aBoolean1651;
	int[] anIntArray1652;
	int anInt1653 = 0;
	public String aString1654 = null;
	int anInt1655 = 0;
	public boolean aBoolean1656;
	public byte[] aByteArray1657;
	public byte aByte1658;
	public byte aByte1659;
	public byte aByte1660;
	public int anInt1661;
	long[] aLongArray1662;
	long aLong1663;
	LinkedList aClass437_1664;
	int[] anIntArray1665;
	public int[] anIntArray1666;
	long[] aLongArray1667;
	public String[] aStringArray1668;
	public int anInt1669;
	public int anInt1670;
	public String[] aStringArray1671;
	public byte aByte1672;
	static int baseTileX;
	public static int anInt1680;

	void method1749(int i, byte i_0_) {
		try {
			if (this.aBoolean1650) {
				if (this.aLongArray1662 != null)
					Class425.method5738(this.aLongArray1662, 0, (this.aLongArray1662 = new long[i]), 0, anInt1661 * 2125429757);
				else
					this.aLongArray1662 = new long[i];
			}
			if (this.aBoolean1651) {
				if (aStringArray1671 != null)
					Class425.method5737(aStringArray1671, 0, aStringArray1671 = new String[i], 0, anInt1661 * 2125429757);
				else
					aStringArray1671 = new String[i];
			}
			if (aByteArray1657 != null)
				Class425.method5736(aByteArray1657, 0, aByteArray1657 = new byte[i], 0, 2125429757 * anInt1661);
			else
				aByteArray1657 = new byte[i];
			if (this.anIntArray1665 != null)
				Class425.method5741(this.anIntArray1665, 0, (this.anIntArray1665 = new int[i]), 0, 2125429757 * anInt1661);
			else
				this.anIntArray1665 = new int[i];
			if (anIntArray1666 != null)
				Class425.method5741(anIntArray1666, 0, anIntArray1666 = new int[i], 0, 2125429757 * anInt1661);
			else
				anIntArray1666 = new int[i];
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gp.a(").append(')').toString());
		}
	}

	void method1750(int i, int i_1_) {
		try {
			if (this.aBoolean1650) {
				if (this.aLongArray1667 != null)
					Class425.method5738(this.aLongArray1667, 0, (this.aLongArray1667 = new long[i]), 0, -1102843797 * anInt1669);
				else
					this.aLongArray1667 = new long[i];
			}
			if (this.aBoolean1651) {
				if (null != aStringArray1668)
					Class425.method5737(aStringArray1668, 0, aStringArray1668 = new String[i], 0, -1102843797 * anInt1669);
				else
					aStringArray1668 = new String[i];
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gp.f(").append(')').toString());
		}
	}

	public int method1751(String string, int i) {
		try {
			if (string == null || string.length() == 0)
				return -1;
			for (int i_2_ = 0; i_2_ < anInt1661 * 2125429757; i_2_++) {
				if (aStringArray1671[i_2_].equals(string))
					return i_2_;
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gp.b(").append(')').toString());
		}
	}

	public int method1752(int i, int i_3_, int i_4_) {
		try {
			int i_6_ = 31 == i_4_ ? -1 : (1 << i_4_ + 1) - 1;
			return (this.anIntArray1665[i] & i_6_) >>> i_3_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gp.p(").append(')').toString());
		}
	}

	public Integer method1753(int i, byte i_7_) {
		try {
			if (null == this.aClass437_1664)
				return null;
			Node class298 = this.aClass437_1664.get((long) i);
			if (null == class298 || !(class298 instanceof IntNode))
				return null;
			return new Integer(((IntNode) class298).capacity * -774922497);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gp.i(").append(')').toString());
		}
	}

	public Integer method1754(int i, int i_8_, int i_9_, int i_10_) {
		try {
			if (this.aClass437_1664 == null)
				return null;
			Node class298 = this.aClass437_1664.get((long) i);
			if (null == class298 || !(class298 instanceof IntNode))
				return null;
			int i_11_ = i_9_ == 31 ? -1 : (1 << 1 + i_9_) - 1;
			return new Integer(((((IntNode) class298).capacity * -774922497) & i_11_) >>> i_8_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gp.k(").append(')').toString());
		}
	}

	public String method1755(int i, int i_12_) {
		try {
			if (null == this.aClass437_1664)
				return null;
			Node class298 = this.aClass437_1664.get((long) i);
			if (class298 == null || !(class298 instanceof ObjectNode))
				return null;
			return (String) ((ObjectNode) class298).nodeObject;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gp.u(").append(')').toString());
		}
	}

	public int[] method1756(byte i) {
		try {
			if (null == this.anIntArray1652) {
				String[] strings = new String[2125429757 * anInt1661];
				this.anIntArray1652 = new int[anInt1661 * 2125429757];
				for (int i_13_ = 0; i_13_ < 2125429757 * anInt1661; i_13_++) {
					strings[i_13_] = aStringArray1671[i_13_];
					this.anIntArray1652[i_13_] = i_13_;
				}
				Class298_Sub32_Sub32.method3345(strings, (this.anIntArray1652));
			}
			return this.anIntArray1652;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gp.posX(").append(')').toString());
		}
	}

	void method1757(long l, String string, int i, int i_14_) {
		try {
			if (string != null && string.length() == 0)
				string = null;
			if (this.aBoolean1650 != l > 0L)
				throw new RuntimeException("");
			if ((string != null) != this.aBoolean1651)
				throw new RuntimeException("");
			if (l > 0L && (this.aLongArray1662 == null || (anInt1661 * 2125429757 >= this.aLongArray1662.length)) || (string != null && (aStringArray1671 == null || 2125429757 * anInt1661 >= aStringArray1671.length)))
				method1749(5 + 2125429757 * anInt1661, (byte) 1);
			if (null != this.aLongArray1662)
				this.aLongArray1662[2125429757 * anInt1661] = l;
			if (null != aStringArray1671)
				aStringArray1671[2125429757 * anInt1661] = string;
			if (-1 == anInt1649 * -2079715533) {
				anInt1649 = anInt1661 * -1008400369;
				aByteArray1657[anInt1661 * 2125429757] = (byte) 126;
			} else
				aByteArray1657[2125429757 * anInt1661] = (byte) 0;
			this.anIntArray1665[anInt1661 * 2125429757] = 0;
			anIntArray1666[2125429757 * anInt1661] = i;
			anInt1661 += -397756075;
			this.anIntArray1652 = null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gp.r(").append(')').toString());
		}
	}

	void method1758(int i) {
		try {
			if (0 == anInt1661 * 2125429757) {
				anInt1649 = -2050262011;
				anInt1670 = 1697252921;
			} else {
				anInt1649 = -2050262011;
				anInt1670 = 1697252921;
				int i_15_ = 0;
				byte i_16_ = aByteArray1657[0];
				for (int i_17_ = 1; i_17_ < 2125429757 * anInt1661; i_17_++) {
					if (aByteArray1657[i_17_] > i_16_) {
						if (i_16_ == 125)
							anInt1670 = i_15_ * -1697252921;
						i_15_ = i_17_;
						i_16_ = aByteArray1657[i_17_];
					} else if (-1 == 873199607 * anInt1670 && aByteArray1657[i_17_] == 125)
						anInt1670 = -1697252921 * i_17_;
				}
				anInt1649 = i_15_ * 2050262011;
				if (-1 != -2079715533 * anInt1649)
					aByteArray1657[-2079715533 * anInt1649] = (byte) 126;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gp.n(").append(')').toString());
		}
	}

	void method1759(long l, String string, int i) {
		try {
			if (null != string && string.length() == 0)
				string = null;
			if (this.aBoolean1650 != l > 0L)
				throw new RuntimeException("");
			if ((string != null) != this.aBoolean1651)
				throw new RuntimeException("");
			if (l > 0L && (this.aLongArray1667 == null || (-1102843797 * anInt1669 >= this.aLongArray1667.length)) || string != null && (aStringArray1668 == null || (-1102843797 * anInt1669 >= aStringArray1668.length)))
				method1750(5 + anInt1669 * -1102843797, -112321245);
			if (null != this.aLongArray1667)
				this.aLongArray1667[anInt1669 * -1102843797] = l;
			if (null != aStringArray1668)
				aStringArray1668[-1102843797 * anInt1669] = string;
			anInt1669 += 324877379;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gp.s(").append(')').toString());
		}
	}

	boolean method1760(int i, String string, byte i_18_) {
		try {
			if (null == string)
				string = "";
			else if (string.length() > 80)
				string = string.substring(0, 80);
			if (this.aClass437_1664 != null) {
				Node class298 = this.aClass437_1664.get((long) i);
				if (class298 != null) {
					if (class298 instanceof ObjectNode) {
						ObjectNode class298_sub29 = (ObjectNode) class298;
						if (class298_sub29.nodeObject instanceof String) {
							if (string.equals(class298_sub29.nodeObject))
								return false;
							class298_sub29.unlink();
							class298_sub29.unlink();
							this.aClass437_1664.connect(new ObjectNode(string), (7051297995265073167L * class298_sub29.key));
							return true;
						}
					}
					class298.unlink();
				}
			} else
				this.aClass437_1664 = new LinkedList(4);
			this.aClass437_1664.connect(new ObjectNode(string), (long) i);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gp.e(").append(')').toString());
		}
	}

	boolean method1761(int i, int i_19_, byte i_20_) {
		try {
			if (this.aClass437_1664 != null) {
				Node class298 = this.aClass437_1664.get((long) i);
				if (class298 != null) {
					if (class298 instanceof IntNode) {
						IntNode class298_sub35 = (IntNode) class298;
						if (i_19_ == class298_sub35.capacity * -774922497)
							return false;
						class298_sub35.capacity = i_19_ * -898670337;
						return true;
					}
					class298.unlink();
				}
			} else
				this.aClass437_1664 = new LinkedList(4);
			this.aClass437_1664.connect(new IntNode(i_19_), (long) i);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gp.h(").append(')').toString());
		}
	}

	boolean method1762(int i, int i_21_, int i_22_, int i_23_, int i_24_) {
		try {
			int i_25_ = (1 << i_22_) - 1;
			int i_26_ = i_23_ == 31 ? -1 : (1 << i_23_ + 1) - 1;
			int i_27_ = i_26_ ^ i_25_;
			i_21_ <<= i_22_;
			i_21_ &= i_27_;
			if (this.aClass437_1664 != null) {
				Node class298 = this.aClass437_1664.get((long) i);
				if (class298 != null) {
					if (class298 instanceof IntNode) {
						IntNode class298_sub35 = (IntNode) class298;
						if (i_21_ == (class298_sub35.capacity * -774922497 & i_27_))
							return false;
						IntNode class298_sub35_28_ = null;
						class298_sub35.capacity = (-774922497 * class298_sub35_28_.capacity & (i_27_ ^ 0xffffffff)) * -898670337;
						IntNode class298_sub35_29_ = null;
						class298_sub35.capacity = (-898670337 * (-774922497 * class298_sub35_29_.capacity | i_21_));
						return true;
					}
					class298.unlink();
				}
			} else
				this.aClass437_1664 = new LinkedList(4);
			this.aClass437_1664.connect(new IntNode(i_21_), (long) i);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gp.v(").append(')').toString());
		}
	}

	boolean method1763(int i, long l) {
		try {
			if (this.aClass437_1664 != null) {
				Node class298 = this.aClass437_1664.get((long) i);
				if (class298 != null) {
					if (class298 instanceof Class298_Sub33) {
						Class298_Sub33 class298_sub33 = (Class298_Sub33) class298;
						if (-959724544626478745L * class298_sub33.aLong7385 == l)
							return false;
						class298_sub33.aLong7385 = 2132790236050020951L * l;
						return true;
					}
					class298.unlink();
				}
			} else
				this.aClass437_1664 = new LinkedList(4);
			this.aClass437_1664.connect(new Class298_Sub33(l), (long) i);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gp.g(").append(')').toString());
		}
	}

	void method1764(Buffer class298_sub53, byte i) {
		try {
			int i_30_ = class298_sub53.readUByte();
			if (i_30_ < 1 || i_30_ > 5)
				throw new RuntimeException(new StringBuilder().append("").append(i_30_).toString());
			int i_31_ = class298_sub53.readUByte();
			if (0 != (i_31_ & 0x1))
				this.aBoolean1650 = true;
			if (0 != (i_31_ & 0x2))
				this.aBoolean1651 = true;
			if (!this.aBoolean1650) {
				this.aLongArray1662 = null;
				this.aLongArray1667 = null;
			}
			if (!this.aBoolean1651) {
				aStringArray1671 = null;
				aStringArray1668 = null;
			}
			this.anInt1653 = class298_sub53.readInt() * 1441392111;
			this.anInt1655 = class298_sub53.readInt() * 34754587;
			if (i_30_ <= 3 && this.anInt1655 * -1699149293 != 0)
				this.anInt1655 += 1039784928;
			anInt1661 = class298_sub53.readUShort() * -397756075;
			anInt1669 = class298_sub53.readUByte() * 324877379;
			aString1654 = class298_sub53.readString();
			if (i_30_ >= 4)
				class298_sub53.readInt();
			aBoolean1656 = class298_sub53.readUByte() == 1;
			aByte1672 = class298_sub53.readByte();
			aByte1658 = class298_sub53.readByte();
			aByte1659 = class298_sub53.readByte();
			aByte1660 = class298_sub53.readByte();
			if (2125429757 * anInt1661 > 0) {
				if (this.aBoolean1650 && (null == this.aLongArray1662 || (this.aLongArray1662.length < 2125429757 * anInt1661)))
					this.aLongArray1662 = new long[anInt1661 * 2125429757];
				if (this.aBoolean1651 && (null == aStringArray1671 || aStringArray1671.length < anInt1661 * 2125429757))
					aStringArray1671 = new String[anInt1661 * 2125429757];
				if (aByteArray1657 == null || aByteArray1657.length < anInt1661 * 2125429757)
					aByteArray1657 = new byte[2125429757 * anInt1661];
				if (null == this.anIntArray1665 || (this.anIntArray1665.length < anInt1661 * 2125429757))
					this.anIntArray1665 = new int[anInt1661 * 2125429757];
				if (null == anIntArray1666 || anIntArray1666.length < 2125429757 * anInt1661)
					anIntArray1666 = new int[anInt1661 * 2125429757];
				for (int i_32_ = 0; i_32_ < 2125429757 * anInt1661; i_32_++) {
					if (this.aBoolean1650)
						this.aLongArray1662[i_32_] = class298_sub53.readLong();
					if (this.aBoolean1651)
						aStringArray1671[i_32_] = class298_sub53.readNullString();
					aByteArray1657[i_32_] = class298_sub53.readByte();
					if (i_30_ >= 2)
						this.anIntArray1665[i_32_] = class298_sub53.readInt();
					if (i_30_ >= 5)
						anIntArray1666[i_32_] = class298_sub53.readUShort();
					else
						anIntArray1666[i_32_] = 0;
				}
				method1758(-1189925710);
			}
			if (anInt1669 * -1102843797 > 0) {
				if (this.aBoolean1650 && (null == this.aLongArray1667 || (this.aLongArray1667.length < anInt1669 * -1102843797)))
					this.aLongArray1667 = new long[-1102843797 * anInt1669];
				if (this.aBoolean1651 && (aStringArray1668 == null || aStringArray1668.length < -1102843797 * anInt1669))
					aStringArray1668 = new String[anInt1669 * -1102843797];
				for (int i_33_ = 0; i_33_ < -1102843797 * anInt1669; i_33_++) {
					if (this.aBoolean1650)
						this.aLongArray1667[i_33_] = class298_sub53.readLong();
					if (this.aBoolean1651)
						aStringArray1668[i_33_] = class298_sub53.readNullString();
				}
			}
			if (i_30_ >= 3) {
				int i_34_ = class298_sub53.readUShort();
				if (i_34_ > 0) {
					this.aClass437_1664 = new LinkedList(i_34_ < 16 ? LinkedList.getNextBitValue(i_34_) : 16);
					while (i_34_-- > 0) {
						int i_35_ = class298_sub53.readInt();
						int i_36_ = i_35_ & 0x3fffffff;
						int i_37_ = i_35_ >>> 30;
						if (0 == i_37_) {
							int i_38_ = class298_sub53.readInt();
							this.aClass437_1664.connect(new IntNode(i_38_), (long) i_36_);
						} else if (i_37_ == 1) {
							long l = class298_sub53.readLong();
							this.aClass437_1664.connect(new Class298_Sub33(l), (long) i_36_);
						} else if (i_37_ == 2) {
							String string = class298_sub53.readString();
							this.aClass437_1664.connect(new ObjectNode(string), (long) i_36_);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gp.c(").append(')').toString());
		}
	}

	public Class162(Buffer class298_sub53) {
		anInt1649 = -2050262011;
		anInt1670 = 1697252921;
		method1764(class298_sub53, (byte) -58);
	}

	void method1765(int i, int i_39_) {
		try {
			anInt1669 -= 324877379;
			if (0 == -1102843797 * anInt1669) {
				this.aLongArray1667 = null;
				aStringArray1668 = null;
			} else {
				if (null != this.aLongArray1667)
					Class425.method5738(this.aLongArray1667, i + 1, this.aLongArray1667, i, -1102843797 * anInt1669 - i);
				if (null != aStringArray1668)
					Class425.method5737(aStringArray1668, i + 1, aStringArray1668, i, -1102843797 * anInt1669 - i);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gp.z(").append(')').toString());
		}
	}

	public Long method1766(int i, int i_40_) {
		try {
			if (this.aClass437_1664 == null)
				return null;
			Node class298 = this.aClass437_1664.get((long) i);
			if (null == class298 || !(class298 instanceof Class298_Sub33))
				return null;
			return new Long(((Class298_Sub33) class298).aLong7385 * -959724544626478745L);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gp.d(").append(')').toString());
		}
	}

	int method1767(int i, int i_41_, int i_42_, int i_43_, int i_44_) {
		try {
			int i_45_ = (1 << i_42_) - 1;
			int i_46_ = 31 == i_43_ ? -1 : (1 << i_43_ + 1) - 1;
			int i_47_ = i_46_ ^ i_45_;
			i_41_ <<= i_42_;
			i_41_ &= i_47_;
			int i_48_ = this.anIntArray1665[i];
			if (i_41_ == (i_48_ & i_47_))
				return -1;
			i_48_ &= i_47_ ^ 0xffffffff;
			this.anIntArray1665[i] = i_48_ | i_41_;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gp.t(").append(')').toString());
		}
	}

	void method1768(int i, byte i_49_) {
		try {
			if (i < 0 || i >= 2125429757 * anInt1661)
				throw new RuntimeException("");
			anInt1661 -= -397756075;
			this.anIntArray1652 = null;
			if (anInt1661 * 2125429757 == 0) {
				this.aLongArray1662 = null;
				aStringArray1671 = null;
				aByteArray1657 = null;
				this.anIntArray1665 = null;
				anIntArray1666 = null;
				anInt1649 = -2050262011;
				anInt1670 = 1697252921;
			} else {
				Class425.method5736(aByteArray1657, i + 1, aByteArray1657, i, anInt1661 * 2125429757 - i);
				Class425.method5741(this.anIntArray1665, i + 1, this.anIntArray1665, i, anInt1661 * 2125429757 - i);
				Class425.method5741(anIntArray1666, 1 + i, anIntArray1666, i, 2125429757 * anInt1661 - i);
				if (null != this.aLongArray1662)
					Class425.method5738(this.aLongArray1662, 1 + i, this.aLongArray1662, i, 2125429757 * anInt1661 - i);
				if (null != aStringArray1671)
					Class425.method5737(aStringArray1671, 1 + i, aStringArray1671, i, 2125429757 * anInt1661 - i);
				if (i == -2079715533 * anInt1649 || anInt1670 * 873199607 == i)
					method1758(-1189925710);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gp.q(").append(')').toString());
		}
	}

	int method1769(int i, byte i_50_, byte i_51_) {
		try {
			if (126 == i_50_ || i_50_ == 127)
				return -1;
			if (i == -2079715533 * anInt1649 && (-1 == 873199607 * anInt1670 || aByteArray1657[anInt1670 * 873199607] < 125))
				return -1;
			if (i_50_ == aByteArray1657[i])
				return -1;
			aByteArray1657[i] = i_50_;
			method1758(-1189925710);
			return i;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gp.posY(").append(')').toString());
		}
	}

	static final void method1770(ScriptRuntime class403, int i) {
		try {
			GameClient.aBoolean8680 = true;
			FrameBufferContext.method566((byte) 12);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gp.ahu(").append(')').toString());
		}
	}

	static final void method1771() {
		try {
			int totalEntities = Class10.entitiesInRegion * 1168366243;
			int[] is = Class10.players;
			for (int i_53_ = 0; i_53_ < totalEntities; i_53_++) {
				Player player = GameClient.entities[is[i_53_]];
				if (null != player)
					Class135.method1494(player, false);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gp.hv(").append(')').toString());
		}
	}

	static final void method1772(ScriptRuntime runtime) {
		try {
			int i_54_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			Class_na.kickClanChatPacket((ClanChannelChat.clanManager == (runtime.clanChannelChat)), i_54_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gp.yn(").append(')').toString());
		}
	}
}
