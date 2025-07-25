package com.jagex;/* Model - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class BaseModel {
	public EffectiveVertex[] aEffectiveVertexArray613;
	public int anInt614;
	public short[] aShortArray615;
	public int[] anIntArray616;
	public short[] aShortArray617;
	public int[] anIntArray618;
	public int[] anIntArray619;
	public short[] aShortArray620;
	public int anInt621;
	public byte[] aByteArray622;
	public short[] aShortArray623;
	public short[] aShortArray624;
	public byte[] aByteArray625;
	public int anInt626;
	public byte[] aByteArray627;
	public byte[] aByteArray628;
	public short[] aShortArray629;
	public int format = 12;
	public int[] anIntArray631;
	public byte aByte632;
	public byte[] aByteArray633;
	public int anInt634;
	public byte[] aByteArray635;
	public short[] aShortArray636;
	public int[] anIntArray637;
	public short[] aShortArray638;
	public int[] anIntArray639;
	public int[] anIntArray640;
	public int[] anIntArray641;
	public int[] anIntArray642;
	public int[] anIntArray643;
	public short[] aShortArray644;
	public byte[] aByteArray645;
	public short[] aShortArray646;
	public EmissiveTriangle[] aEmissiveTriangleArray647;
	public int[] anIntArray648;
	public BillboardConfig[] billboardConfigs;

	BaseModel(byte[] data) {
		anInt614 = 0;
		anInt626 = 0;
		anInt621 = 0;
		aByte632 = (byte) 0;
		anInt634 = 0;
		if (data[data.length - 1] == -1 && data[data.length - 2] == -1)
			formatModelOld(data);
		else
			formatModelNew(data);
	}

	public BaseModel(int i, int i_0_, int i_1_) {
		anInt614 = 0;
		anInt626 = 0;
		anInt621 = 0;
		aByte632 = (byte) 0;
		anInt634 = 0;
		anIntArray616 = new int[i];
		anIntArray642 = new int[i];
		anIntArray618 = new int[i];
		anIntArray619 = new int[i];
		aShortArray644 = new short[i_0_];
		aShortArray646 = new short[i_0_];
		aShortArray624 = new short[i_0_];
		aByteArray625 = new byte[i_0_];
		aByteArray633 = new byte[i_0_];
		aByteArray627 = new byte[i_0_];
		aByteArray635 = new byte[i_0_];
		aShortArray629 = new short[i_0_];
		aShortArray617 = new short[i_0_];
		anIntArray631 = new int[i_0_];
		if (i_1_ > 0) {
			aByteArray622 = new byte[i_1_];
			aShortArray623 = new short[i_1_];
			aShortArray636 = new short[i_1_];
			aShortArray638 = new short[i_1_];
			anIntArray639 = new int[i_1_];
			anIntArray640 = new int[i_1_];
			anIntArray641 = new int[i_1_];
			aByteArray645 = new byte[i_1_];
			aByteArray628 = new byte[i_1_];
			anIntArray637 = new int[i_1_];
			anIntArray643 = new int[i_1_];
			anIntArray648 = new int[i_1_];
		}
	}

	public BaseModel(BaseModel[] models, int length) {
		anInt614 = 0;
		anInt626 = 0;
		anInt621 = 0;
		aByte632 = (byte) 0;
		anInt634 = 0;
		anInt614 = 0;
		anInt621 = 0;
		anInt634 = 0;
		int i_2_ = 0;
		int i_3_ = 0;
		int i_4_ = 0;
		boolean bool = false;
		boolean bool_5_ = false;
		boolean bool_6_ = false;
		boolean bool_7_ = false;
		boolean bool_8_ = false;
		boolean bool_9_ = false;
		aByte632 = (byte) -1;
		for (int index = 0; index < length; index++) {
			BaseModel model = models[index];
			if (model != null) {
				anInt614 += model.anInt614;
				anInt621 += model.anInt621;
				anInt634 += model.anInt634;
				if (model.aEmissiveTriangleArray647 != null)
					i_2_ += model.aEmissiveTriangleArray647.length;
				if (model.aEffectiveVertexArray613 != null)
					i_3_ += model.aEffectiveVertexArray613.length;
				if (model.billboardConfigs != null)
					i_4_ += model.billboardConfigs.length;
				bool = bool | model.aByteArray625 != null;
				if (model.aByteArray633 != null)
					bool_5_ = true;
				else {
					if (aByte632 == -1)
						aByte632 = model.aByte632;
					if (aByte632 != model.aByte632)
						bool_5_ = true;
				}
				bool_6_ = bool_6_ | model.aByteArray627 != null;
				bool_7_ = bool_7_ | model.aByteArray635 != null;
				bool_8_ = bool_8_ | model.aShortArray617 != null;
				bool_9_ = bool_9_ | model.anIntArray631 != null;
			}
		}
		anIntArray616 = new int[anInt614];
		anIntArray642 = new int[anInt614];
		anIntArray618 = new int[anInt614];
		anIntArray619 = new int[anInt614];
		aShortArray620 = new short[anInt614];
		aShortArray644 = new short[anInt621];
		aShortArray646 = new short[anInt621];
		aShortArray624 = new short[anInt621];
		if (bool)
			aByteArray625 = new byte[anInt621];
		if (bool_5_)
			aByteArray633 = new byte[anInt621];
		if (bool_6_)
			aByteArray627 = new byte[anInt621];
		if (bool_7_)
			aByteArray635 = new byte[anInt621];
		aShortArray629 = new short[anInt621];
		if (bool_8_)
			aShortArray617 = new short[anInt621];
		if (bool_9_)
			anIntArray631 = new int[anInt621];
		aShortArray615 = new short[anInt621];
		if (anInt634 > 0) {
			aByteArray622 = new byte[anInt634];
			aShortArray623 = new short[anInt634];
			aShortArray636 = new short[anInt634];
			aShortArray638 = new short[anInt634];
			anIntArray639 = new int[anInt634];
			anIntArray640 = new int[anInt634];
			anIntArray641 = new int[anInt634];
			aByteArray645 = new byte[anInt634];
			aByteArray628 = new byte[anInt634];
			anIntArray637 = new int[anInt634];
			anIntArray643 = new int[anInt634];
			anIntArray648 = new int[anInt634];
		}
		if (i_4_ > 0)
			billboardConfigs = new BillboardConfig[i_4_];
		if (i_2_ > 0)
			aEmissiveTriangleArray647 = new EmissiveTriangle[i_2_];
		if (i_3_ > 0)
			aEffectiveVertexArray613 = new EffectiveVertex[i_3_];
		anInt614 = 0;
		anInt621 = 0;
		anInt634 = 0;
		i_2_ = 0;
		i_3_ = 0;
		i_4_ = 0;
		for (int i_12_ = 0; i_12_ < length; i_12_++) {
			short i_13_ = (short) (1 << i_12_);
			BaseModel class64_14_ = models[i_12_];
			if (class64_14_ != null) {
				if (class64_14_.billboardConfigs != null) {
					for (int i_15_ = 0; i_15_ < class64_14_.billboardConfigs.length; i_15_++) {
						BillboardConfig billboardConfig = class64_14_.billboardConfigs[i_15_];
						billboardConfigs[i_4_++] = billboardConfig.translateFace((billboardConfig.face * 1512514121 + anInt621));
					}
				}
				for (int i_16_ = 0; i_16_ < class64_14_.anInt621; i_16_++) {
					if (bool && class64_14_.aByteArray625 != null)
						aByteArray625[anInt621] = class64_14_.aByteArray625[i_16_];
					if (bool_5_) {
						if (class64_14_.aByteArray633 != null)
							aByteArray633[anInt621] = class64_14_.aByteArray633[i_16_];
						else
							aByteArray633[anInt621] = class64_14_.aByte632;
					}
					if (bool_6_ && class64_14_.aByteArray627 != null)
						aByteArray627[anInt621] = class64_14_.aByteArray627[i_16_];
					if (bool_8_) {
						if (class64_14_.aShortArray617 != null)
							aShortArray617[anInt621] = class64_14_.aShortArray617[i_16_];
						else
							aShortArray617[anInt621] = (short) -1;
					}
					if (bool_9_) {
						if (class64_14_.anIntArray631 != null)
							anIntArray631[anInt621] = class64_14_.anIntArray631[i_16_];
						else
							anIntArray631[anInt621] = -1;
					}
					aShortArray644[anInt621] = (short) method743(class64_14_, class64_14_.aShortArray644[i_16_], i_13_);
					aShortArray646[anInt621] = (short) method743(class64_14_, class64_14_.aShortArray646[i_16_], i_13_);
					aShortArray624[anInt621] = (short) method743(class64_14_, class64_14_.aShortArray624[i_16_], i_13_);
					aShortArray615[anInt621] = i_13_;
					aShortArray629[anInt621] = class64_14_.aShortArray629[i_16_];
					anInt621++;
				}
				if (class64_14_.aEmissiveTriangleArray647 != null) {
					for (int i_17_ = 0; i_17_ < class64_14_.aEmissiveTriangleArray647.length; i_17_++) {
						int i_18_ = method743(class64_14_, (class64_14_.aEmissiveTriangleArray647[i_17_].anInt773) * -710317103, i_13_);
						int i_19_ = method743(class64_14_, (class64_14_.aEmissiveTriangleArray647[i_17_].anInt774) * 1705862021, i_13_);
						int i_20_ = method743(class64_14_, (class64_14_.aEmissiveTriangleArray647[i_17_].anInt775) * 1636170731, i_13_);
						aEmissiveTriangleArray647[i_2_] = class64_14_.aEmissiveTriangleArray647[i_17_].create(i_18_, i_19_, i_20_);
						i_2_++;
					}
				}
				if (class64_14_.aEffectiveVertexArray613 != null) {
					for (int i_21_ = 0; i_21_ < class64_14_.aEffectiveVertexArray613.length; i_21_++) {
						int i_22_ = method743(class64_14_, (class64_14_.aEffectiveVertexArray613[i_21_].anInt674) * -180596249, i_13_);
						aEffectiveVertexArray613[i_3_] = class64_14_.aEffectiveVertexArray613[i_21_].method776(i_22_);
						i_3_++;
					}
				}
			}
		}
		int i_23_ = 0;
		anInt626 = anInt614;
		for (int i_24_ = 0; i_24_ < length; i_24_++) {
			short i_25_ = (short) (1 << i_24_);
			BaseModel class64_26_ = models[i_24_];
			if (class64_26_ != null) {
				for (int i_27_ = 0; i_27_ < class64_26_.anInt621; i_27_++) {
					if (bool_7_)
						aByteArray635[i_23_++] = (byte) ((class64_26_.aByteArray635 != null && (class64_26_.aByteArray635[i_27_] != -1)) ? (class64_26_.aByteArray635[i_27_] + anInt634) : -1);
				}
				for (int i_28_ = 0; i_28_ < class64_26_.anInt634; i_28_++) {
					byte i_29_ = (aByteArray622[anInt634] = class64_26_.aByteArray622[i_28_]);
					if (i_29_ == 0) {
						aShortArray623[anInt634] = (short) method743(class64_26_, (class64_26_.aShortArray623[i_28_]), i_25_);
						aShortArray636[anInt634] = (short) method743(class64_26_, (class64_26_.aShortArray636[i_28_]), i_25_);
						aShortArray638[anInt634] = (short) method743(class64_26_, (class64_26_.aShortArray638[i_28_]), i_25_);
					}
					if (i_29_ >= 1 && i_29_ <= 3) {
						aShortArray623[anInt634] = class64_26_.aShortArray623[i_28_];
						aShortArray636[anInt634] = class64_26_.aShortArray636[i_28_];
						aShortArray638[anInt634] = class64_26_.aShortArray638[i_28_];
						anIntArray639[anInt634] = class64_26_.anIntArray639[i_28_];
						anIntArray640[anInt634] = class64_26_.anIntArray640[i_28_];
						anIntArray641[anInt634] = class64_26_.anIntArray641[i_28_];
						aByteArray645[anInt634] = class64_26_.aByteArray645[i_28_];
						aByteArray628[anInt634] = class64_26_.aByteArray628[i_28_];
						anIntArray637[anInt634] = class64_26_.anIntArray637[i_28_];
					}
					if (i_29_ == 2) {
						anIntArray643[anInt634] = class64_26_.anIntArray643[i_28_];
						anIntArray648[anInt634] = class64_26_.anIntArray648[i_28_];
					}
					anInt634++;
				}
			}
		}
	}

	final int method743(BaseModel class64_30_, int i, short i_31_) {
		int i_32_ = class64_30_.anIntArray616[i];
		int i_33_ = class64_30_.anIntArray642[i];
		int i_34_ = class64_30_.anIntArray618[i];
		for (int i_35_ = 0; i_35_ < anInt614; i_35_++) {
			if (i_32_ == anIntArray616[i_35_] && i_33_ == anIntArray642[i_35_] && i_34_ == anIntArray618[i_35_]) {
				aShortArray620[i_35_] |= i_31_;
				return i_35_;
			}
		}
		anIntArray616[anInt614] = i_32_;
		anIntArray642[anInt614] = i_33_;
		anIntArray618[anInt614] = i_34_;
		aShortArray620[anInt614] = i_31_;
		anIntArray619[anInt614] = (class64_30_.anIntArray619 != null ? class64_30_.anIntArray619[i] : -1);
		return anInt614++;
	}

	void method744(Buffer buffer, Buffer class298_sub53_36_) {
		short i = 0;
		short i_37_ = 0;
		short i_38_ = 0;
		int i_39_ = 0;
		for (int i_40_ = 0; i_40_ < anInt621; i_40_++) {
			int i_41_ = class298_sub53_36_.readUByte();
			if (i_41_ == 1) {
				i = (short) (buffer.readSmartShort() + i_39_);
				i_39_ = i;
				i_37_ = (short) (buffer.readSmartShort() + i_39_);
				i_39_ = i_37_;
				i_38_ = (short) (buffer.readSmartShort() + i_39_);
				i_39_ = i_38_;
				aShortArray644[i_40_] = i;
				aShortArray646[i_40_] = i_37_;
				aShortArray624[i_40_] = i_38_;
				if (i > anInt626)
					anInt626 = i;
				if (i_37_ > anInt626)
					anInt626 = i_37_;
				if (i_38_ > anInt626)
					anInt626 = i_38_;
			}
			if (i_41_ == 2) {
				i_37_ = i_38_;
				i_38_ = (short) (buffer.readSmartShort() + i_39_);
				i_39_ = i_38_;
				aShortArray644[i_40_] = i;
				aShortArray646[i_40_] = i_37_;
				aShortArray624[i_40_] = i_38_;
				if (i_38_ > anInt626)
					anInt626 = i_38_;
			}
			if (i_41_ == 3) {
				i = i_38_;
				i_38_ = (short) (buffer.readSmartShort() + i_39_);
				i_39_ = i_38_;
				aShortArray644[i_40_] = i;
				aShortArray646[i_40_] = i_37_;
				aShortArray624[i_40_] = i_38_;
				if (i_38_ > anInt626)
					anInt626 = i_38_;
			}
			if (i_41_ == 4) {
				short i_42_ = i;
				i = i_37_;
				i_37_ = i_42_;
				i_38_ = (short) (buffer.readSmartShort() + i_39_);
				i_39_ = i_38_;
				aShortArray644[i_40_] = i;
				aShortArray646[i_40_] = i_37_;
				aShortArray624[i_40_] = i_38_;
				if (i_38_ > anInt626)
					anInt626 = i_38_;
			}
		}
		anInt626++;
	}

	void method745(Buffer class298_sub53, Buffer class298_sub53_43_, Buffer class298_sub53_44_, Buffer class298_sub53_45_, Buffer class298_sub53_46_, Buffer class298_sub53_47_) {
		for (int i = 0; i < anInt634; i++) {
			int i_48_ = aByteArray622[i] & 0xff;
			if (i_48_ == 0) {
				aShortArray623[i] = (short) class298_sub53.readUShort();
				aShortArray636[i] = (short) class298_sub53.readUShort();
				aShortArray638[i] = (short) class298_sub53.readUShort();
			}
			if (i_48_ == 1) {
				aShortArray623[i] = (short) class298_sub53_43_.readUShort();
				aShortArray636[i] = (short) class298_sub53_43_.readUShort();
				aShortArray638[i] = (short) class298_sub53_43_.readUShort();
				if (format < 15) {
					anIntArray639[i] = class298_sub53_44_.readUShort();
					if (format < 14)
						anIntArray640[i] = class298_sub53_44_.readUShort();
					else
						anIntArray640[i] = class298_sub53_44_.readUTriByte();
					anIntArray641[i] = class298_sub53_44_.readUShort();
				} else {
					anIntArray639[i] = class298_sub53_44_.readUTriByte();
					anIntArray640[i] = class298_sub53_44_.readUTriByte();
					anIntArray641[i] = class298_sub53_44_.readUTriByte();
				}
				aByteArray645[i] = class298_sub53_45_.readByte();
				aByteArray628[i] = class298_sub53_46_.readByte();
				anIntArray637[i] = class298_sub53_47_.readByte();
			}
			if (i_48_ == 2) {
				aShortArray623[i] = (short) class298_sub53_43_.readUShort();
				aShortArray636[i] = (short) class298_sub53_43_.readUShort();
				aShortArray638[i] = (short) class298_sub53_43_.readUShort();
				if (format < 15) {
					anIntArray639[i] = class298_sub53_44_.readUShort();
					if (format < 14)
						anIntArray640[i] = class298_sub53_44_.readUShort();
					else
						anIntArray640[i] = class298_sub53_44_.readUTriByte();
					anIntArray641[i] = class298_sub53_44_.readUShort();
				} else {
					anIntArray639[i] = class298_sub53_44_.readUTriByte();
					anIntArray640[i] = class298_sub53_44_.readUTriByte();
					anIntArray641[i] = class298_sub53_44_.readUTriByte();
				}
				aByteArray645[i] = class298_sub53_45_.readByte();
				aByteArray628[i] = class298_sub53_46_.readByte();
				anIntArray637[i] = class298_sub53_47_.readByte();
				anIntArray643[i] = class298_sub53_47_.readByte();
				anIntArray648[i] = class298_sub53_47_.readByte();
			}
			if (i_48_ == 3) {
				aShortArray623[i] = (short) class298_sub53_43_.readUShort();
				aShortArray636[i] = (short) class298_sub53_43_.readUShort();
				aShortArray638[i] = (short) class298_sub53_43_.readUShort();
				if (format < 15) {
					anIntArray639[i] = class298_sub53_44_.readUShort();
					if (format < 14)
						anIntArray640[i] = class298_sub53_44_.readUShort();
					else
						anIntArray640[i] = class298_sub53_44_.readUTriByte();
					anIntArray641[i] = class298_sub53_44_.readUShort();
				} else {
					anIntArray639[i] = class298_sub53_44_.readUTriByte();
					anIntArray640[i] = class298_sub53_44_.readUTriByte();
					anIntArray641[i] = class298_sub53_44_.readUTriByte();
				}
				aByteArray645[i] = class298_sub53_45_.readByte();
				aByteArray628[i] = class298_sub53_46_.readByte();
				anIntArray637[i] = class298_sub53_47_.readByte();
			}
		}
	}

	void formatModelNew(byte[] data) {
		boolean bool = false;
		boolean bool_49_ = false;
		Buffer buffer = new Buffer(data);
		Buffer class298_sub53_50_ = new Buffer(data);
		Buffer class298_sub53_51_ = new Buffer(data);
		Buffer class298_sub53_52_ = new Buffer(data);
		Buffer class298_sub53_53_ = new Buffer(data);
		buffer.offset = (data.length - 18) * 116413311;
		anInt614 = buffer.readUShort();
		anInt621 = buffer.readUShort();
		anInt634 = buffer.readUByte();
		int i = buffer.readUByte();
		int i_54_ = buffer.readUByte();
		int i_55_ = buffer.readUByte();
		int i_56_ = buffer.readUByte();
		int i_57_ = buffer.readUByte();
		int i_58_ = buffer.readUShort();
		int i_59_ = buffer.readUShort();
		int i_60_ = buffer.readUShort();
		int i_61_ = buffer.readUShort();
		int i_62_ = 0;
		int i_63_ = i_62_;
		i_62_ += anInt614;
		int i_64_ = i_62_;
		i_62_ += anInt621;
		int i_65_ = i_62_;
		if (i_54_ == 255)
			i_62_ += anInt621;
		int i_66_ = i_62_;
		if (i_56_ == 1)
			i_62_ += anInt621;
		int i_67_ = i_62_;
		if (i == 1)
			i_62_ += anInt621;
		int i_68_ = i_62_;
		if (i_57_ == 1)
			i_62_ += anInt614;
		int i_69_ = i_62_;
		if (i_55_ == 1)
			i_62_ += anInt621;
		int i_70_ = i_62_;
		i_62_ += i_61_;
		int i_71_ = i_62_;
		i_62_ += anInt621 * 2;
		int i_72_ = i_62_;
		i_62_ += anInt634 * 6;
		int i_73_ = i_62_;
		i_62_ += i_58_;
		int i_74_ = i_62_;
		i_62_ += i_59_;
		int i_75_ = i_62_;
		i_62_ += i_60_;
		anIntArray616 = new int[anInt614];
		anIntArray642 = new int[anInt614];
		anIntArray618 = new int[anInt614];
		aShortArray644 = new short[anInt621];
		aShortArray646 = new short[anInt621];
		aShortArray624 = new short[anInt621];
		if (anInt634 > 0) {
			aByteArray622 = new byte[anInt634];
			aShortArray623 = new short[anInt634];
			aShortArray636 = new short[anInt634];
			aShortArray638 = new short[anInt634];
		}
		if (i_57_ == 1)
			anIntArray619 = new int[anInt614];
		if (i == 1) {
			aByteArray625 = new byte[anInt621];
			aByteArray635 = new byte[anInt621];
			aShortArray617 = new short[anInt621];
		}
		if (i_54_ == 255)
			aByteArray633 = new byte[anInt621];
		else
			aByte632 = (byte) i_54_;
		if (i_55_ == 1)
			aByteArray627 = new byte[anInt621];
		if (i_56_ == 1)
			anIntArray631 = new int[anInt621];
		aShortArray629 = new short[anInt621];
		buffer.offset = i_63_ * 116413311;
		class298_sub53_50_.offset = i_73_ * 116413311;
		class298_sub53_51_.offset = i_74_ * 116413311;
		class298_sub53_52_.offset = i_75_ * 116413311;
		class298_sub53_53_.offset = i_68_ * 116413311;
		int i_76_ = 0;
		int i_77_ = 0;
		int i_78_ = 0;
		for (int i_79_ = 0; i_79_ < anInt614; i_79_++) {
			int i_80_ = buffer.readUByte();
			int i_81_ = 0;
			if ((i_80_ & 0x1) != 0)
				i_81_ = class298_sub53_50_.readSmartShort();
			int i_82_ = 0;
			if ((i_80_ & 0x2) != 0)
				i_82_ = class298_sub53_51_.readSmartShort();
			int i_83_ = 0;
			if ((i_80_ & 0x4) != 0)
				i_83_ = class298_sub53_52_.readSmartShort();
			anIntArray616[i_79_] = i_76_ + i_81_;
			anIntArray642[i_79_] = i_77_ + i_82_;
			anIntArray618[i_79_] = i_78_ + i_83_;
			i_76_ = anIntArray616[i_79_];
			i_77_ = anIntArray642[i_79_];
			i_78_ = anIntArray618[i_79_];
			if (i_57_ == 1)
				anIntArray619[i_79_] = class298_sub53_53_.readUByte();
		}
		buffer.offset = i_71_ * 116413311;
		class298_sub53_50_.offset = i_67_ * 116413311;
		class298_sub53_51_.offset = i_65_ * 116413311;
		class298_sub53_52_.offset = i_69_ * 116413311;
		class298_sub53_53_.offset = i_66_ * 116413311;
		for (int i_84_ = 0; i_84_ < anInt621; i_84_++) {
			aShortArray629[i_84_] = (short) buffer.readUShort();
			if (i == 1) {
				int i_85_ = class298_sub53_50_.readUByte();
				if ((i_85_ & 0x1) == 1) {
					aByteArray625[i_84_] = (byte) 1;
					bool = true;
				} else
					aByteArray625[i_84_] = (byte) 0;
				if ((i_85_ & 0x2) == 2) {
					aByteArray635[i_84_] = (byte) (i_85_ >> 2);
					aShortArray617[i_84_] = aShortArray629[i_84_];
					aShortArray629[i_84_] = (short) 127;
					if (aShortArray617[i_84_] != -1)
						bool_49_ = true;
				} else {
					aByteArray635[i_84_] = (byte) -1;
					aShortArray617[i_84_] = (short) -1;
				}
			}
			if (i_54_ == 255)
				aByteArray633[i_84_] = class298_sub53_51_.readByte();
			if (i_55_ == 1)
				aByteArray627[i_84_] = class298_sub53_52_.readByte();
			if (i_56_ == 1)
				anIntArray631[i_84_] = class298_sub53_53_.readUByte();
		}
		anInt626 = -1;
		buffer.offset = i_70_ * 116413311;
		class298_sub53_50_.offset = i_64_ * 116413311;
		short i_86_ = 0;
		short i_87_ = 0;
		short i_88_ = 0;
		int i_89_ = 0;
		for (int i_90_ = 0; i_90_ < anInt621; i_90_++) {
			int i_91_ = class298_sub53_50_.readUByte();
			if (i_91_ == 1) {
				i_86_ = (short) (buffer.readSmartShort() + i_89_);
				i_89_ = i_86_;
				i_87_ = (short) (buffer.readSmartShort() + i_89_);
				i_89_ = i_87_;
				i_88_ = (short) (buffer.readSmartShort() + i_89_);
				i_89_ = i_88_;
				aShortArray644[i_90_] = i_86_;
				aShortArray646[i_90_] = i_87_;
				aShortArray624[i_90_] = i_88_;
				if (i_86_ > anInt626)
					anInt626 = i_86_;
				if (i_87_ > anInt626)
					anInt626 = i_87_;
				if (i_88_ > anInt626)
					anInt626 = i_88_;
			}
			if (i_91_ == 2) {
				i_87_ = i_88_;
				i_88_ = (short) (buffer.readSmartShort() + i_89_);
				i_89_ = i_88_;
				aShortArray644[i_90_] = i_86_;
				aShortArray646[i_90_] = i_87_;
				aShortArray624[i_90_] = i_88_;
				if (i_88_ > anInt626)
					anInt626 = i_88_;
			}
			if (i_91_ == 3) {
				i_86_ = i_88_;
				i_88_ = (short) (buffer.readSmartShort() + i_89_);
				i_89_ = i_88_;
				aShortArray644[i_90_] = i_86_;
				aShortArray646[i_90_] = i_87_;
				aShortArray624[i_90_] = i_88_;
				if (i_88_ > anInt626)
					anInt626 = i_88_;
			}
			if (i_91_ == 4) {
				short i_92_ = i_86_;
				i_86_ = i_87_;
				i_87_ = i_92_;
				i_88_ = (short) (buffer.readSmartShort() + i_89_);
				i_89_ = i_88_;
				aShortArray644[i_90_] = i_86_;
				aShortArray646[i_90_] = i_87_;
				aShortArray624[i_90_] = i_88_;
				if (i_88_ > anInt626)
					anInt626 = i_88_;
			}
		}
		anInt626++;
		buffer.offset = i_72_ * 116413311;
		for (int i_93_ = 0; i_93_ < anInt634; i_93_++) {
			aByteArray622[i_93_] = (byte) 0;
			aShortArray623[i_93_] = (short) buffer.readUShort();
			aShortArray636[i_93_] = (short) buffer.readUShort();
			aShortArray638[i_93_] = (short) buffer.readUShort();
		}
		if (aByteArray635 != null) {
			boolean bool_94_ = false;
			for (int i_95_ = 0; i_95_ < anInt621; i_95_++) {
				int i_96_ = aByteArray635[i_95_] & 0xff;
				if (i_96_ != 255) {
					if (((aShortArray623[i_96_] & 0xffff) == aShortArray644[i_95_]) && ((aShortArray636[i_96_] & 0xffff) == aShortArray646[i_95_]) && ((aShortArray638[i_96_] & 0xffff) == aShortArray624[i_95_]))
						aByteArray635[i_95_] = (byte) -1;
					else
						bool_94_ = true;
				}
			}
			if (!bool_94_)
				aByteArray635 = null;
		}
		if (!bool_49_)
			aShortArray617 = null;
		if (!bool)
			aByteArray625 = null;
	}

	public int method747(int i, int i_97_, int i_98_) {
		for (int i_99_ = 0; i_99_ < anInt614; i_99_++) {
			if (anIntArray616[i_99_] == i && anIntArray642[i_99_] == i_97_ && anIntArray618[i_99_] == i_98_)
				return i_99_;
		}
		anIntArray616[anInt614] = i;
		anIntArray642[anInt614] = i_97_;
		anIntArray618[anInt614] = i_98_;
		anInt626 = anInt614 + 1;
		return anInt614++;
	}

	public int method748(int i, int i_100_, int i_101_, byte i_102_, byte i_103_, short i_104_, byte i_105_, short i_106_) {
		aShortArray644[anInt621] = (short) i;
		aShortArray646[anInt621] = (short) i_100_;
		aShortArray624[anInt621] = (short) i_101_;
		aByteArray625[anInt621] = i_102_;
		aByteArray635[anInt621] = i_103_;
		aShortArray629[anInt621] = i_104_;
		aByteArray627[anInt621] = i_105_;
		aShortArray617[anInt621] = i_106_;
		return anInt621++;
	}

	public int[][] method749(boolean bool) {
		int[] is = new int[256];
		int i = 0;
		int i_107_ = bool ? anInt614 : anInt626;
		for (int i_108_ = 0; i_108_ < i_107_; i_108_++) {
			int i_109_ = anIntArray619[i_108_];
			if (i_109_ >= 0) {
				is[i_109_]++;
				if (i_109_ > i)
					i = i_109_;
			}
		}
		int[][] is_110_ = new int[i + 1][];
		for (int i_111_ = 0; i_111_ <= i; i_111_++) {
			is_110_[i_111_] = new int[is[i_111_]];
			is[i_111_] = 0;
		}
		for (int i_112_ = 0; i_112_ < i_107_; i_112_++) {
			int i_113_ = anIntArray619[i_112_];
			if (i_113_ >= 0)
				is_110_[i_113_][is[i_113_]++] = i_112_;
		}
		return is_110_;
	}

	public int[][] method750() {
		int[] is = new int[256];
		int i = 0;
		for (int i_114_ = 0; i_114_ < anInt621; i_114_++) {
			int i_115_ = anIntArray631[i_114_];
			if (i_115_ >= 0) {
				is[i_115_]++;
				if (i_115_ > i)
					i = i_115_;
			}
		}
		int[][] is_116_ = new int[i + 1][];
		for (int i_117_ = 0; i_117_ <= i; i_117_++) {
			is_116_[i_117_] = new int[is[i_117_]];
			is[i_117_] = 0;
		}
		for (int i_118_ = 0; i_118_ < anInt621; i_118_++) {
			int i_119_ = anIntArray631[i_118_];
			if (i_119_ >= 0)
				is_116_[i_119_][is[i_119_]++] = i_118_;
		}
		return is_116_;
	}

	public static BaseModel load(Js5FileSystem fileSystem, int containerID, int fileID) {
		byte[] data = fileSystem.getFileFromArchive(containerID, fileID);
		if (data == null)
			return null;
		return new BaseModel(data);
	}

	public void retexture(short i, short i_121_) {
		if (aShortArray617 != null) {
			for (int i_122_ = 0; i_122_ < anInt621; i_122_++) {
				if (aShortArray617[i_122_] == i)
					aShortArray617[i_122_] = i_121_;
			}
		}
	}

	public void translate(int i, int i_123_, int i_124_) {
		for (int i_125_ = 0; i_125_ < anInt614; i_125_++) {
			anIntArray616[i_125_] += i;
			anIntArray642[i_125_] += i_123_;
			anIntArray618[i_125_] += i_124_;
		}
	}

	public void method754(int i, int i_126_, int i_127_) {
		if (i_127_ != 0) {
			int i_128_ = CircleAngleTable.SINE[i_127_];
			int i_129_ = CircleAngleTable.COSINE[i_127_];
			for (int i_130_ = 0; i_130_ < anInt614; i_130_++) {
				int i_131_ = ((anIntArray642[i_130_] * i_128_ + anIntArray616[i_130_] * i_129_) >> 14);
				anIntArray642[i_130_] = (anIntArray642[i_130_] * i_129_ - anIntArray616[i_130_] * i_128_) >> 14;
				anIntArray616[i_130_] = i_131_;
			}
		}
		if (i != 0) {
			int i_132_ = CircleAngleTable.SINE[i];
			int i_133_ = CircleAngleTable.COSINE[i];
			for (int i_134_ = 0; i_134_ < anInt614; i_134_++) {
				int i_135_ = ((anIntArray642[i_134_] * i_133_ - anIntArray618[i_134_] * i_132_) >> 14);
				anIntArray618[i_134_] = (anIntArray642[i_134_] * i_132_ + anIntArray618[i_134_] * i_133_) >> 14;
				anIntArray642[i_134_] = i_135_;
			}
		}
		if (i_126_ != 0) {
			int i_136_ = CircleAngleTable.SINE[i_126_];
			int i_137_ = CircleAngleTable.COSINE[i_126_];
			for (int i_138_ = 0; i_138_ < anInt614; i_138_++) {
				int i_139_ = ((anIntArray618[i_138_] * i_136_ + anIntArray616[i_138_] * i_137_) >> 14);
				anIntArray618[i_138_] = (anIntArray618[i_138_] * i_137_ - anIntArray616[i_138_] * i_136_) >> 14;
				anIntArray616[i_138_] = i_139_;
			}
		}
	}

	public void scaleUp(int i) {
		for (int i_140_ = 0; i_140_ < anInt614; i_140_++) {
			anIntArray616[i_140_] <<= i;
			anIntArray642[i_140_] <<= i;
			anIntArray618[i_140_] <<= i;
		}
		if (anInt634 > 0 && anIntArray639 != null) {
			for (int i_141_ = 0; i_141_ < anIntArray639.length; i_141_++) {
				anIntArray639[i_141_] <<= i;
				anIntArray640[i_141_] <<= i;
				if (aByteArray622[i_141_] != 1)
					anIntArray641[i_141_] <<= i;
			}
		}
	}

	public void recolor(short i, short i_142_) {
		for (int i_143_ = 0; i_143_ < anInt621; i_143_++) {
			if (aShortArray629[i_143_] == i)
				aShortArray629[i_143_] = i_142_;
		}
	}

	public byte method757(short i, short i_144_, short i_145_, short i_146_, short i_147_, short i_148_, byte i_149_, byte i_150_, byte i_151_) {
		if (anInt634 >= 255)
			throw new IllegalStateException();
		aByteArray622[anInt634] = (byte) 3;
		aShortArray623[anInt634] = i;
		aShortArray636[anInt634] = i_144_;
		aShortArray638[anInt634] = i_145_;
		anIntArray639[anInt634] = i_146_;
		anIntArray640[anInt634] = i_147_;
		anIntArray641[anInt634] = i_148_;
		aByteArray645[anInt634] = i_149_;
		aByteArray628[anInt634] = i_150_;
		anIntArray637[anInt634] = i_151_;
		return (byte) anInt634++;
	}

	void formatModelOld(byte[] data) {
		Buffer buffer = new Buffer(data);
		Buffer class298_sub53_152_ = new Buffer(data);
		Buffer class298_sub53_153_ = new Buffer(data);
		Buffer class298_sub53_154_ = new Buffer(data);
		Buffer class298_sub53_155_ = new Buffer(data);
		Buffer class298_sub53_156_ = new Buffer(data);
		Buffer class298_sub53_157_ = new Buffer(data);
		buffer.offset = (data.length - 23) * 116413311;
		anInt614 = buffer.readUShort();
		anInt621 = buffer.readUShort();
		anInt634 = buffer.readUByte();
		int i = buffer.readUByte();
		boolean bool = (i & 0x1) == 1;
		boolean bool_158_ = (i & 0x2) == 2;
		boolean bool_159_ = (i & 0x4) == 4;
		boolean bool_160_ = (i & 0x8) == 8;
		if (bool_160_) {
			buffer.offset -= 814893177;
			format = buffer.readUByte();
			buffer.offset += 698479866;
		}
		int i_161_ = buffer.readUByte();
		int i_162_ = buffer.readUByte();
		int i_163_ = buffer.readUByte();
		int i_164_ = buffer.readUByte();
		int i_165_ = buffer.readUByte();
		int i_166_ = buffer.readUShort();
		int i_167_ = buffer.readUShort();
		int i_168_ = buffer.readUShort();
		int i_169_ = buffer.readUShort();
		int i_170_ = buffer.readUShort();
		int i_171_ = 0;
		int i_172_ = 0;
		int i_173_ = 0;
		if (anInt634 > 0) {
			aByteArray622 = new byte[anInt634];
			buffer.offset = 0;
			for (int i_174_ = 0; i_174_ < anInt634; i_174_++) {
				byte i_175_ = (aByteArray622[i_174_] = buffer.readByte());
				if (i_175_ == 0)
					i_171_++;
				if (i_175_ >= 1 && i_175_ <= 3)
					i_172_++;
				if (i_175_ == 2)
					i_173_++;
			}
		}
		int i_176_ = anInt634;
		int i_177_ = i_176_;
		i_176_ += anInt614;
		int i_178_ = i_176_;
		if (bool)
			i_176_ += anInt621;
		int i_179_ = i_176_;
		i_176_ += anInt621;
		int i_180_ = i_176_;
		if (i_161_ == 255)
			i_176_ += anInt621;
		int i_181_ = i_176_;
		if (i_163_ == 1)
			i_176_ += anInt621;
		int i_182_ = i_176_;
		if (i_165_ == 1)
			i_176_ += anInt614;
		int i_183_ = i_176_;
		if (i_162_ == 1)
			i_176_ += anInt621;
		int i_184_ = i_176_;
		i_176_ += i_169_;
		int i_185_ = i_176_;
		if (i_164_ == 1)
			i_176_ += anInt621 * 2;
		int i_186_ = i_176_;
		i_176_ += i_170_;
		int i_187_ = i_176_;
		i_176_ += anInt621 * 2;
		int i_188_ = i_176_;
		i_176_ += i_166_;
		int i_189_ = i_176_;
		i_176_ += i_167_;
		int i_190_ = i_176_;
		i_176_ += i_168_;
		int i_191_ = i_176_;
		i_176_ += i_171_ * 6;
		int i_192_ = i_176_;
		i_176_ += i_172_ * 6;
		int i_193_ = 6;
		if (format == 14)
			i_193_ = 7;
		else if (format >= 15)
			i_193_ = 9;
		int i_194_ = i_176_;
		i_176_ += i_172_ * i_193_;
		int i_195_ = i_176_;
		i_176_ += i_172_;
		int i_196_ = i_176_;
		i_176_ += i_172_;
		int i_197_ = i_176_;
		i_176_ += i_172_ + i_173_ * 2;
		int i_198_ = i_176_;
		anIntArray616 = new int[anInt614];
		anIntArray642 = new int[anInt614];
		anIntArray618 = new int[anInt614];
		aShortArray644 = new short[anInt621];
		aShortArray646 = new short[anInt621];
		aShortArray624 = new short[anInt621];
		if (i_165_ == 1)
			anIntArray619 = new int[anInt614];
		if (bool)
			aByteArray625 = new byte[anInt621];
		if (i_161_ == 255)
			aByteArray633 = new byte[anInt621];
		else
			aByte632 = (byte) i_161_;
		if (i_162_ == 1)
			aByteArray627 = new byte[anInt621];
		if (i_163_ == 1)
			anIntArray631 = new int[anInt621];
		if (i_164_ == 1)
			aShortArray617 = new short[anInt621];
		if (i_164_ == 1 && anInt634 > 0)
			aByteArray635 = new byte[anInt621];
		aShortArray629 = new short[anInt621];
		if (anInt634 > 0) {
			aShortArray623 = new short[anInt634];
			aShortArray636 = new short[anInt634];
			aShortArray638 = new short[anInt634];
			if (i_172_ > 0) {
				anIntArray639 = new int[i_172_];
				anIntArray640 = new int[i_172_];
				anIntArray641 = new int[i_172_];
				aByteArray645 = new byte[i_172_];
				aByteArray628 = new byte[i_172_];
				anIntArray637 = new int[i_172_];
			}
			if (i_173_ > 0) {
				anIntArray643 = new int[i_173_];
				anIntArray648 = new int[i_173_];
			}
		}
		buffer.offset = i_177_ * 116413311;
		class298_sub53_152_.offset = i_188_ * 116413311;
		class298_sub53_153_.offset = i_189_ * 116413311;
		class298_sub53_154_.offset = i_190_ * 116413311;
		class298_sub53_155_.offset = i_182_ * 116413311;
		int i_199_ = 0;
		int i_200_ = 0;
		int i_201_ = 0;
		for (int i_202_ = 0; i_202_ < anInt614; i_202_++) {
			int i_203_ = buffer.readUByte();
			int i_204_ = 0;
			if ((i_203_ & 0x1) != 0)
				i_204_ = class298_sub53_152_.readSmartShort();
			int i_205_ = 0;
			if ((i_203_ & 0x2) != 0)
				i_205_ = class298_sub53_153_.readSmartShort();
			int i_206_ = 0;
			if ((i_203_ & 0x4) != 0)
				i_206_ = class298_sub53_154_.readSmartShort();
			anIntArray616[i_202_] = i_199_ + i_204_;
			anIntArray642[i_202_] = i_200_ + i_205_;
			anIntArray618[i_202_] = i_201_ + i_206_;
			i_199_ = anIntArray616[i_202_];
			i_200_ = anIntArray642[i_202_];
			i_201_ = anIntArray618[i_202_];
			if (i_165_ == 1)
				anIntArray619[i_202_] = class298_sub53_155_.readUByte();
		}
		buffer.offset = i_187_ * 116413311;
		class298_sub53_152_.offset = i_178_ * 116413311;
		class298_sub53_153_.offset = i_180_ * 116413311;
		class298_sub53_154_.offset = i_183_ * 116413311;
		class298_sub53_155_.offset = i_181_ * 116413311;
		class298_sub53_156_.offset = i_185_ * 116413311;
		class298_sub53_157_.offset = i_186_ * 116413311;
		for (int i_207_ = 0; i_207_ < anInt621; i_207_++) {
			aShortArray629[i_207_] = (short) buffer.readUShort();
			if (bool)
				aByteArray625[i_207_] = class298_sub53_152_.readByte();
			if (i_161_ == 255)
				aByteArray633[i_207_] = class298_sub53_153_.readByte();
			if (i_162_ == 1)
				aByteArray627[i_207_] = class298_sub53_154_.readByte();
			if (i_163_ == 1)
				anIntArray631[i_207_] = class298_sub53_155_.readUByte();
			if (i_164_ == 1)
				aShortArray617[i_207_] = (short) (class298_sub53_156_.readUShort() - 1);
			if (aByteArray635 != null) {
				if (aShortArray617[i_207_] != -1)
					aByteArray635[i_207_] = (byte) (class298_sub53_157_.readUByte() - 1);
				else
					aByteArray635[i_207_] = (byte) -1;
			}
		}
		anInt626 = -1;
		buffer.offset = i_184_ * 116413311;
		class298_sub53_152_.offset = i_179_ * 116413311;
		method744(buffer, class298_sub53_152_);
		buffer.offset = i_191_ * 116413311;
		class298_sub53_152_.offset = i_192_ * 116413311;
		class298_sub53_153_.offset = i_194_ * 116413311;
		class298_sub53_154_.offset = i_195_ * 116413311;
		class298_sub53_155_.offset = i_196_ * 116413311;
		class298_sub53_156_.offset = i_197_ * 116413311;
		method745(buffer, class298_sub53_152_, class298_sub53_153_, class298_sub53_154_, class298_sub53_155_, class298_sub53_156_);
		buffer.offset = i_198_ * 116413311;
		if (bool_158_) {
			int i_208_ = buffer.readUByte();
			if (i_208_ > 0) {
				aEmissiveTriangleArray647 = new EmissiveTriangle[i_208_];
				for (int i_209_ = 0; i_209_ < i_208_; i_209_++) {
					int i_210_ = buffer.readUShort();
					int i_211_ = buffer.readUShort();
					byte i_212_;
					if (i_161_ == 255)
						i_212_ = aByteArray633[i_211_];
					else
						i_212_ = (byte) i_161_;
					aEmissiveTriangleArray647[i_209_] = new EmissiveTriangle(i_210_, aShortArray644[i_211_], aShortArray646[i_211_], aShortArray624[i_211_], i_212_);
				}
			}
			int i_213_ = buffer.readUByte();
			if (i_213_ > 0) {
				aEffectiveVertexArray613 = new EffectiveVertex[i_213_];
				for (int i_214_ = 0; i_214_ < i_213_; i_214_++) {
					int i_215_ = buffer.readUShort();
					int i_216_ = buffer.readUShort();
					aEffectiveVertexArray613[i_214_] = new EffectiveVertex(i_215_, i_216_);
				}
			}
		}
		if (bool_159_) {
			int billboardCount = buffer.readUByte();
			if (billboardCount > 0) {
				billboardConfigs = new BillboardConfig[billboardCount];
				for (int vertex = 0; vertex < billboardCount; vertex++) {
					int type = buffer.readUShort();
					int face = buffer.readUShort();
					int priority = buffer.readUByte();
					byte magnitude = buffer.readByte();
					billboardConfigs[vertex] = new BillboardConfig(type, face, priority, magnitude);
				}
			}
		}
	}

	public int[][] method759() {
		int[] is = new int[256];
		int i = 0;
		for (int i_223_ = 0; i_223_ < billboardConfigs.length; i_223_++) {
			int i_224_ = billboardConfigs[i_223_].priority * -1606786303;
			if (i_224_ >= 0) {
				is[i_224_]++;
				if (i_224_ > i)
					i = i_224_;
			}
		}
		int[][] is_225_ = new int[i + 1][];
		for (int i_226_ = 0; i_226_ <= i; i_226_++) {
			is_225_[i_226_] = new int[is[i_226_]];
			is[i_226_] = 0;
		}
		for (int i_227_ = 0; i_227_ < billboardConfigs.length; i_227_++) {
			int i_228_ = billboardConfigs[i_227_].priority * -1606786303;
			if (i_228_ >= 0)
				is_225_[i_228_][is[i_228_]++] = i_227_;
		}
		return is_225_;
	}
}
