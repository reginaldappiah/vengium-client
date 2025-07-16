package com.jagex;/* Class505 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.StringUtils;

import java.awt.*;

public class RSFontMetrics {
	public int anInt6197;
	byte[][] aByteArrayArray6198;
	byte[] aByteArray6199;
	public int anInt6200;
	static String[] aStringArray6201 = new String[100];
	public int anInt6202;

	public static RSFontMetrics decodeFontData(Js5FileSystem JS5_FONTMETRICS, int containerID) {
			byte[] data = JS5_FONTMETRICS.get(containerID);
			if (null == data)
				return null;
			return new RSFontMetrics(data);
	}

    static RSFontMetrics getDefaultFont() {
        RSFontMetrics fontMetrics;
        if (Class436.aBoolean5496) {
            if (null != Class65.aClass264_664 && StaticMethods.aClass505_2420 != null)
                fontMetrics = StaticMethods.aClass505_2420;
            else
                fontMetrics = Class82_Sub19_Sub1.aClass505_9111;
        } else
            fontMetrics = Class82_Sub19_Sub1.aClass505_9111;
        Class436.anInt5467 = (1791243901 * fontMetrics.anInt6197 + 2030544143 * fontMetrics.anInt6202);
        return fontMetrics;
    }

    public int method6253(int i, char c) {
			if (this.aByteArrayArray6198 != null)
				return this.aByteArrayArray6198[i][c];
			return 0;
	}

	public int method6254(String string, ISpriteMetrics[] spriteMetrics) {
			if (null == string)
				return 0;
			int startOffset = -1;
			int i_2_ = -1;
			int i_3_ = 0;
			int length = string.length();
			for (int index = 0; index < length; index++) {
				char currentCharacter = string.charAt(index);
				if (currentCharacter == 60)
					startOffset = index;
				else {
					if (currentCharacter == 62 && startOffset != -1) {
						String substring = string.substring(startOffset + 1, index);
						startOffset = -1;
						if (substring.equals("lt"))
							currentCharacter = '<';
						else if (substring.equals("gt"))
							currentCharacter = '>';
						else if (substring.equals("nbsp"))
							currentCharacter = '\u00a0';
						else if (substring.equals("shy"))
							currentCharacter = '\u00ad';
						else if (substring.equals("times"))
							currentCharacter = '\u00d7';
						else if (substring.equals("euro"))
							currentCharacter = '\u20ac';
						else if (substring.equals("copy"))
							currentCharacter = '\u00a9';
						else if (substring.equals("reg"))
							currentCharacter = '\u00ae';
						else {
							if (substring.startsWith("img=") && null != spriteMetrics) {
								try {
									int imageID = (StringUtils.method1998(substring.substring(4)));
									i_3_ += spriteMetrics[imageID].getPaddedWidth();
									i_2_ = -1;
								} catch (Exception exception) {
									/* empty */
								}
							}
							continue;
						}
					}
					if (startOffset == -1) {
						i_3_ += (this.aByteArray6199[Class124.method1387(currentCharacter) & 0xff]) & 0xff;
						if (this.aByteArrayArray6198 != null && i_2_ != -1)
							i_3_ += (this.aByteArrayArray6198[i_2_][currentCharacter]);
						i_2_ = currentCharacter;
					}
				}
			}
			return i_3_;
	}

	public int method6255(int i) {
			return this.aByteArray6199[i] & 0xFF;
	}

	public String method6256(String string, int i, ISpriteMetrics[] spriteMetrics) {
			if (method6254(string, spriteMetrics) <= i)
				return string;
			i -= method6254("...", null);
			int i_10_ = -1;
			int i_11_ = -1;
			int i_12_ = 0;
			int i_13_ = string.length();
			String string_14_ = "";
			for (int i_15_ = 0; i_15_ < i_13_; i_15_++) {
				char c = string.charAt(i_15_);
				if (c == 60)
					i_10_ = i_15_;
				else {
					if (62 == c && i_10_ != -1) {
						String string_16_ = string.substring(1 + i_10_, i_15_);
						i_10_ = -1;
						if (string_16_.equals("lt"))
							c = '<';
						else if (string_16_.equals("gt"))
							c = '>';
						else if (string_16_.equals("nbsp"))
							c = '\u00a0';
						else if (string_16_.equals("shy"))
							c = '\u00ad';
						else if (string_16_.equals("times"))
							c = '\u00d7';
						else if (string_16_.equals("euro"))
							c = '\u20ac';
						else if (string_16_.equals("copy"))
							c = '\u00a9';
						else if (string_16_.equals("reg"))
							c = '\u00ae';
						else {
							if (string_16_.startsWith("img=") && spriteMetrics != null) {
								try {
									int i_17_ = (StringUtils.method1998(string_16_.substring(4)));
									i_12_ += spriteMetrics[i_17_].getPaddedWidth();
									i_11_ = -1;
									if (i_12_ > i)
										return new StringBuilder().append(string_14_).append("...").toString();
									string_14_ = string.substring(0, i_15_ + 1);
								} catch (Exception exception) {
									/* empty */
								}
							}
							continue;
						}
					}
					if (i_10_ == -1) {
						i_12_ += ((this.aByteArray6199[Class124.method1387(c) & 0xff]) & 0xff);
						if (this.aByteArrayArray6198 != null && i_11_ != -1)
							i_12_ += (this.aByteArrayArray6198[i_11_][c]);
						i_11_ = c;
						int i_18_ = i_12_;
						if (this.aByteArrayArray6198 != null)
							i_18_ += (this.aByteArrayArray6198[c][46]);
						if (i_18_ > i)
							return new StringBuilder().append(string_14_).append("...").toString();
						string_14_ = string.substring(0, 1 + i_15_);
					}
				}
			}
			return string;
	}

	public int method6257(String string, int[] is, String[] strings, ISpriteMetrics[] spriteMetrics) {
			return method6258(string, is, strings, spriteMetrics, true, 116413311);
	}

	int method6258(String string, int[] is, String[] strings, ISpriteMetrics[] spriteMetrics, boolean bool, int i) {
			if (string == null)
				return 0;
			int i_19_ = 0;
			int i_20_ = 0;
			int i_21_ = -1;
			int i_22_ = 0;
			int i_23_ = 0;
			int i_24_ = -1;
			int i_25_ = -1;
			int i_26_ = 0;
			int i_27_ = string.length();
			for (int i_28_ = 0; i_28_ < i_27_; i_28_++) {
				int i_29_ = (Class124.method1387(string.charAt(i_28_)) & 0xff);
				int i_30_ = 0;
				if (60 == i_29_)
					i_24_ = i_28_;
				else {
					int i_31_;
					if (-1 != i_24_) {
						if (i_29_ != 62) {
							if (i != 116413311) {
								/* empty */
							}
							continue;
						}
						i_31_ = i_24_;
						String string_32_ = string.substring(i_24_ + 1, i_28_);
						i_24_ = -1;
						if (string_32_.equals("br")) {
							strings[i_26_] = string.substring(i_20_, 1 + i_28_);
							if (++i_26_ >= strings.length)
								return 0;
							i_20_ = 1 + i_28_;
							i_19_ = 0;
							i_21_ = -1;
							i_25_ = -1;
							continue;
						}
						if (string_32_.equals("lt")) {
							i_30_ += method6255(60);
							if (null != this.aByteArrayArray6198 && i_25_ != -1)
								i_30_ += (this.aByteArrayArray6198[i_25_][60]);
							i_25_ = 60;
						} else if (string_32_.equals("gt")) {
							i_30_ += method6255(62);
							if (null != this.aByteArrayArray6198 && i_25_ != -1)
								i_30_ += (this.aByteArrayArray6198[i_25_][62]);
							i_25_ = 62;
						} else if (string_32_.equals("nbsp")) {
							i_30_ += method6255(160);
							if (null != this.aByteArrayArray6198 && -1 != i_25_)
								i_30_ += (this.aByteArrayArray6198[i_25_][160]);
							i_25_ = 160;
						} else if (string_32_.equals("shy")) {
							i_30_ += method6255(173);
							if (this.aByteArrayArray6198 != null && i_25_ != -1)
								i_30_ += (this.aByteArrayArray6198[i_25_][173]);
							i_25_ = 173;
						} else if (string_32_.equals("times")) {
							i_30_ += method6255(215);
							if (null != this.aByteArrayArray6198 && -1 != i_25_)
								i_30_ += (this.aByteArrayArray6198[i_25_][215]);
							i_25_ = 215;
						} else if (string_32_.equals("euro")) {
							i_30_ += method6255(8364);
							if (this.aByteArrayArray6198 != null && -1 != i_25_)
								i_30_ += (this.aByteArrayArray6198[i_25_][8364]);
							i_25_ = 8364;
						} else if (string_32_.equals("copy")) {
							i_30_ += method6255(169);
							if (null != this.aByteArrayArray6198 && i_25_ != -1)
								i_30_ += (this.aByteArrayArray6198[i_25_][169]);
							i_25_ = 169;
						} else if (string_32_.equals("reg")) {
							i_30_ += method6255(174);
							if (null != this.aByteArrayArray6198 && -1 != i_25_)
								i_30_ += (this.aByteArrayArray6198[i_25_][174]);
							i_25_ = 174;
						} else if (string_32_.startsWith("img=") && null != spriteMetrics) {
							try {
								int i_33_ = StringUtils.method1998(string_32_.substring(4));
								i_30_ += spriteMetrics[i_33_].getPaddedWidth();
								i_25_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						}
						i_29_ = -1;
					} else {
						i_31_ = i_28_;
						i_30_ += method6255(i_29_);
						if (this.aByteArrayArray6198 != null && i_25_ != -1)
							i_30_ += (this.aByteArrayArray6198[i_25_][i_29_]);
						i_25_ = i_29_;
					}
					if (i_30_ > 0) {
						i_19_ += i_30_;
						if (is != null) {
							if (i_29_ == 32) {
								i_21_ = i_28_;
								i_22_ = i_19_;
								i_23_ = bool ? 1 : 0;
							}
							if (i_19_ > is[(i_26_ < is.length ? i_26_ : is.length - 1)]) {
								if (i_21_ >= 0) {
									strings[i_26_] = string.substring(i_20_, i_21_ + 1 - i_23_);
									if (++i_26_ >= strings.length)
										return 0;
									i_20_ = i_21_ + 1;
									i_21_ = -1;
									i_19_ -= i_22_;
									i_25_ = -1;
								} else {
									strings[i_26_] = string.substring(i_20_, i_31_);
									if (++i_26_ >= strings.length)
										return 0;
									i_20_ = i_31_;
									i_21_ = -1;
									i_19_ = i_30_;
									i_25_ = -1;
								}
							}
							if (45 == i_29_) {
								i_21_ = i_28_;
								i_22_ = i_19_;
								i_23_ = 0;
							}
						}
					}
				}
			}
			if (string.length() > i_20_) {
				strings[i_26_] = string.substring(i_20_, string.length());
				i_26_++;
			}
			return i_26_;
	}

	public int method6259(String string, int i, ISpriteMetrics[] spriteMetrics) {
			int i_35_ = method6257(string, new int[] { i }, aStringArray6201, spriteMetrics);
			int i_36_ = 0;
			for (int i_37_ = 0; i_37_ < i_35_; i_37_++) {
				int i_38_ = method6254(aStringArray6201[i_37_], spriteMetrics);
				if (i_38_ > i_36_)
					i_36_ = i_38_;
			}
			return i_36_;
	}

	public int method6260(String string, int i, int i_39_, ISpriteMetrics[] spriteMetrics) {
			if (0 == i_39_)
				i_39_ = -2028004825 * anInt6200;
			int i_41_ = method6257(string, new int[] { i }, aStringArray6201, spriteMetrics);
			int i_42_ = (i_41_ - 1) * i_39_;
			return i_42_ + anInt6202 * 1110385787 + -1883958527 * anInt6197;
	}

	RSFontMetrics(byte[] data) {
		Buffer buffer = new Buffer(data);
		int i = buffer.readUByte();
		if (0 != i)
			throw new RuntimeException("");
		boolean bool = buffer.readUByte() == 1;
		this.aByteArray6199 = new byte[256];
		buffer.readBytes(this.aByteArray6199, 0, 256);
		if (bool) {
			int[] is_43_ = new int[256];
			int[] is_44_ = new int[256];
			for (int i_45_ = 0; i_45_ < 256; i_45_++)
				is_43_[i_45_] = buffer.readUByte();
			for (int i_46_ = 0; i_46_ < 256; i_46_++)
				is_44_[i_46_] = buffer.readUByte();
			byte[][] is_47_ = new byte[256][];
			for (int i_48_ = 0; i_48_ < 256; i_48_++) {
				is_47_[i_48_] = new byte[is_43_[i_48_]];
				byte i_49_ = 0;
				for (int i_50_ = 0; i_50_ < is_47_[i_48_].length; i_50_++) {
					i_49_ += buffer.readByte();
					is_47_[i_48_][i_50_] = i_49_;
				}
			}
			byte[][] is_51_ = new byte[256][];
			for (int i_52_ = 0; i_52_ < 256; i_52_++) {
				is_51_[i_52_] = new byte[is_43_[i_52_]];
				byte i_53_ = 0;
				for (int i_54_ = 0; i_54_ < is_51_[i_52_].length; i_54_++) {
					i_53_ += buffer.readByte();
					is_51_[i_52_][i_54_] = i_53_;
				}
			}
			this.aByteArrayArray6198 = new byte[256][256];
			for (int i_55_ = 0; i_55_ < 256; i_55_++) {
				if (i_55_ != 32) {
					for (int i_56_ = 0; i_56_ < 256; i_56_++) {
						if (i_56_ != 32)
							this.aByteArrayArray6198[i_55_][i_56_] = (byte) ConnectionType.method392(is_47_, is_51_, is_44_, (this.aByteArray6199), is_43_, i_55_, i_56_);
					}
				}
			}
			anInt6200 = 1673966999 * (is_44_[32] + is_43_[32]);
		} else
			anInt6200 = buffer.readUByte() * 1673966999;
		buffer.readUByte();
		buffer.readUByte();
		anInt6202 = buffer.readUByte() * -93381965;
		anInt6197 = buffer.readUByte() * -2068583167;
	}

	public int method6261(String string, int i, int i_57_, int i_58_, int i_59_, ISpriteMetrics[] spriteMetrics) {
			if (0 == i_57_)
				i_57_ = -2028004825 * anInt6200;
			int i_61_ = method6257(string, new int[] { i }, aStringArray6201, spriteMetrics);
			if (0 == i_61_)
				return 0;
			if (i_59_ < 0)
				i_59_ = 0;
			i_59_ /= i_57_;
			if (i_59_ >= i_61_)
				i_59_ = i_61_ - 1;
			String string_62_ = aStringArray6201[i_59_];
			int i_63_ = 0;
			int i_64_ = 0;
			int i_65_;
			for (i_65_ = 0; i_65_ < i_58_ && i_63_ < string_62_.length(); i_65_ = method6254(string_62_.substring(0, ++i_63_), spriteMetrics))
				i_64_ = i_65_;
			if (i_63_ == string_62_.length() && string_62_.endsWith("<br>"))
				i_63_ -= 4;
			if (i_58_ - i_64_ < i_65_ - i_58_)
				i_63_--;
			for (int i_66_ = 0; i_66_ < i_59_; i_66_++)
				i_63_ += aStringArray6201[i_66_].length();
			return i_63_;
	}

	public int method6262(String string, int i, ISpriteMetrics[] spriteMetrics) {
			return method6257(string, new int[] { i }, aStringArray6201, spriteMetrics);
	}

	public Point method6263(String string, int i, int i_68_, int i_69_, ISpriteMetrics[] spriteMetrics) {
			if (i_69_ <= 0)
				return new Point(0, i_68_ + 1110385787 * anInt6202);
			if (i_69_ > string.length())
				i_69_ = string.length();
			if (0 == i_68_)
				i_68_ = -2028004825 * anInt6200;
			int i_71_ = method6258(string, new int[] { i }, aStringArray6201, spriteMetrics, false, 116413311);
			int i_72_ = 0;
			for (int i_73_ = 0; i_73_ < i_71_; i_73_++) {
				int i_74_ = aStringArray6201[i_73_].length();
				if (i_74_ + i_72_ > i_69_ || i_71_ - 1 == i_73_ && i_69_ == string.length()) {
					String string_75_ = string.substring(i_72_, i_69_);
					if (string_75_.endsWith("<br>")) {
						string_75_ = "";
						i_72_ += i_74_;
						i_73_++;
					}
					int i_76_ = method6254(string_75_, spriteMetrics);
					int i_77_ = i_73_ * i_68_ + 1110385787 * anInt6202;
					return new Point(i_76_, i_77_);
				}
				i_72_ += i_74_;
			}
			return null;
	}

	public int method6264(String string) {
			return method6254(string, null);
	}

	static void method763(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, MenuOptionNode menuOptionNode, FontToolkit fontkit, RSFontMetrics fontmetrics, int i_6_, int i_7_) {
			if (i > i_1_ && i < i_3_ + i_1_ && i_0_ > i_5_ - 1110385787 * fontmetrics.anInt6202 - 1 && i_0_ < -1883958527 * fontmetrics.anInt6197 + i_5_)
				i_6_ = i_7_;
			String string = ErrorReporter.method4174(menuOptionNode, (byte) -2);
			fontkit.method2480(string, 3 + i_1_, i_5_, i_6_, 0, GameClient.lineHeight, 1401020893 * Class368.random, Class436.aClass57Array5501, StaticMethods.anIntArray8372);
	}

	public static void insertHead(Node linkable, Node head) {
			if (linkable.next != null)
				linkable.unlink();
			linkable.next = head.next;
			linkable.previous = head;
			linkable.next.previous = linkable;
			linkable.previous.next = linkable;
	}

}
