package com.jagex;/* Class365_Sub1_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;
import com.jagex.game.settings.TextureSetting;
import com.jagex.maths.Matrix43f;

public class Class365_Sub1_Sub4_Sub1 extends Class365_Sub1_Sub4 {
	public int anInt10142;
	public int anInt10143;
	boolean aBoolean10144;
	public int anInt10145;
	public int anInt10146;
	public int anInt10147;
	int anInt10148;
	int anInt10149;
	public int anInt10150 = -474510257;
	int anInt10151;
	public int anInt10152;
	int anInt10153;
	int anInt10154;

	Class335 method4394(GraphicsToolkit graphicsToolkit) {
		try {
			Vector3f class217 = Vector3f.method2005(getWorldTransform().trans);
			Class322 class322 = aClass331_7722.method4036(plane, (int) class217.x >> 9, (int) class217.z >> 9, -583169676);
			Class365_Sub1_Sub2 class365_sub1_sub2 = aClass331_7722.method4058(plane, (int) class217.x >> 9, (int) class217.z >> 9);
			int i_0_ = 0;
			if (null != class322 && class322.aClass365_Sub1_Sub1_3359.aBoolean9799)
				i_0_ = class322.aClass365_Sub1_Sub1_3359.method4361();
			if (class365_sub1_sub2 != null && class365_sub1_sub2.aShort9801 > -i_0_)
				i_0_ = -class365_sub1_sub2.aShort9801;
			if (-1184748693 * anInt10142 != i_0_) {
				class217.y += (float) (i_0_ - anInt10142 * -1184748693);
				method4340(class217);
				anInt10142 = 472885571 * i_0_;
			}
			Matrix43f class222 = graphicsToolkit.getTransformationMatrix();
			class222.method2460();
			if (anInt10142 * -1184748693 == 0) {
				FloorToolkit class_xa = aClass331_7722.aClass_xaArray3517[aByte7724];
				int i_3_ = (455610861 * this.anInt10149 << 1);
				int i_4_ = i_3_;
				int i_5_ = -i_3_ / 2;
				int i_6_ = -i_4_ / 2;
				int i_7_ = class_xa.method6340(i_5_ + (int) class217.x, (int) class217.z + i_6_);
				int i_8_ = i_3_ / 2;
				int i_9_ = -i_4_ / 2;
				int i_10_ = class_xa.method6340((int) class217.x + i_8_, i_9_ + (int) class217.z);
				int i_11_ = -i_3_ / 2;
				int i_12_ = i_4_ / 2;
				int i_13_ = class_xa.method6340((int) class217.x + i_11_, (int) class217.z + i_12_);
				int i_14_ = i_3_ / 2;
				int i_15_ = i_4_ / 2;
				int i_16_ = class_xa.method6340(i_14_ + (int) class217.x, i_15_ + (int) class217.z);
				int i_17_ = i_7_ < i_10_ ? i_7_ : i_10_;
				int i_18_ = i_13_ < i_16_ ? i_13_ : i_16_;
				int i_19_ = i_10_ < i_16_ ? i_10_ : i_16_;
				int i_20_ = i_7_ < i_13_ ? i_7_ : i_13_;
				if (i_4_ != 0) {
					int i_21_ = ((int) (Math.atan2((double) (i_17_ - i_18_), (double) i_4_) * 2607.5945876176133) & 0x3fff);
					if (i_21_ != 0)
						class222.rotate(1.0F, 0.0F, 0.0F, CircleAngleTable.toDegrees(i_21_));
				}
				if (i_3_ != 0) {
					int i_22_ = ((int) (Math.atan2((double) (i_20_ - i_19_), (double) i_3_) * 2607.5945876176133) & 0x3fff);
					if (i_22_ != 0)
						class222.rotate(0.0F, 0.0F, 1.0F, CircleAngleTable.toDegrees(-i_22_));
				}
				int i_23_ = i_7_ + i_16_;
				if (i_10_ + i_13_ < i_23_)
					i_23_ = i_13_ + i_10_;
				i_23_ = (i_23_ >> 1) - (int) class217.y;
				if (i_23_ != 0)
					class222.translate(0.0F, (float) i_23_, 0.0F);
			}
			class217.cache();
			Vector3f class217_24_ = getWorldTransform().trans;
			class222.translate(class217_24_.x, class217_24_.y - 10.0F, class217_24_.z);
			Class335 class335 = StaticMethods.method818(true);
			this.aBoolean10144 = false;
			this.anInt10149 = 0;
			if (anInt10146 * -1651799761 != -1) {
				ModelToolkit class387 = (Js5Configs.itemList.getItemDefinitions(anInt10146 * -1651799761).drawPlayerEquipmentItems(graphicsToolkit, 526336, 1271433065 * anInt10147, null, null, (1191848641 * this.anInt10151), (this.anInt10148 * 943545391), (-1436336999 * this.anInt10153), (-1595812509 * this.anInt10154)));
				if (null != class387) {
					class387.render(class222, aClass302_Sub1Array7726[2], 0);
					this.aBoolean10144 |= class387.i();
					this.anInt10149 = class387.n() * 674558949;
				}
			}
			if (-1 != -909380271 * anInt10150) {
				ModelToolkit class387 = (Js5Configs.itemList.getItemDefinitions(anInt10150 * -909380271).drawPlayerEquipmentItems(graphicsToolkit, 526336, 442323255 * anInt10145, null, null, (1191848641 * this.anInt10151), (this.anInt10148 * 943545391), (-1436336999 * this.anInt10153), (-1595812509 * this.anInt10154)));
				if (null != class387) {
					class387.render(class222, aClass302_Sub1Array7726[1], 0);
					this.aBoolean10144 |= class387.i();
					if (class387.n() > (455610861 * this.anInt10149))
						this.anInt10149 = class387.n() * 674558949;
				}
			}
			ModelToolkit class387 = (Js5Configs.itemList.getItemDefinitions(-441234013 * anInt10152).drawPlayerEquipmentItems(graphicsToolkit, 526336, 825822935 * anInt10143, null, null, this.anInt10151 * 1191848641, this.anInt10148 * 943545391, -1436336999 * this.anInt10153, -1595812509 * this.anInt10154));
			if (null != class387) {
				class387.render(class222, aClass302_Sub1Array7726[0], 0);
				this.aBoolean10144 |= class387.i();
				if (class387.n() > 455610861 * this.anInt10149)
					this.anInt10149 = class387.n() * 674558949;
			}
			return class335;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akc.bo(").append(')').toString());
		}
	}

	void method4516() {
		try {
			this.anInt10151 = (32 + (int) (Math.random() * 4.0)) * 2009949505;
			this.anInt10148 = (3 + (int) (Math.random() * 2.0)) * 880372431;
			this.anInt10153 = (16 + (int) (Math.random() * 3.0)) * -1003661399;
			if (SettingsManager.settingsManager.textures.getValue() == TextureSetting.ON)
				this.anInt10154 = (int) (Math.random() * 10.0) * 1183208523;
			else
				this.anInt10154 = (int) (Math.random() * 20.0) * 1183208523;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akc.a(").append(')').toString());
		}
	}

	boolean method4376() {
		try {
			return this.aBoolean10144;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akc.be(").append(')').toString());
		}
	}

	public Class334 method4358(GraphicsToolkit graphicsToolkit) {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akc.bc(").append(')').toString());
		}
	}

	void method4357(GraphicsToolkit class_ra, int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akc.bb(").append(')').toString());
		}
	}

	boolean method4350(GraphicsToolkit class_ra, int i, int i_49_, byte i_50_) {
		try {
			Matrix43f class222 = class_ra.getTransformationMatrix();
			class222.method2054(getWorldTransform());
			class222.translate(0.0F, -10.0F, 0.0F);
			ModelToolkit class387 = (Js5Configs.itemList.getItemDefinitions(-441234013 * anInt10152).drawPlayerEquipmentItems(class_ra, 131072, anInt10143 * 825822935, null, null, 0, 0, 0, 0));
			if (class387 != null && class387.method4787(i, i_49_, class222, true, 0))
				return true;
			if (-1 != -909380271 * anInt10150) {
				class387 = (Js5Configs.itemList.getItemDefinitions(anInt10150 * -909380271).drawPlayerEquipmentItems(class_ra, 131072, anInt10145 * 442323255, null, null, 0, 0, 0, 0));
				if (null != class387 && class387.method4787(i, i_49_, class222, true, 0))
					return true;
			}
			if (-1651799761 * anInt10146 != -1) {
				class387 = (Js5Configs.itemList.getItemDefinitions(anInt10146 * -1651799761).drawPlayerEquipmentItems(class_ra, 131072, anInt10147 * 1271433065, null, null, 0, 0, 0, 0));
				if (null != class387 && class387.method4787(i, i_49_, class222, true, 0))
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akc.bu(").append(')').toString());
		}
	}

	public int method4363() {
		try {
			return anInt10142 * -1184748693 - method4361();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akc.bx(").append(')').toString());
		}
	}

	public int method4361() {
		try {
			return -10;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akc.bm(").append(')').toString());
		}
	}

	boolean method4399() {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akc.bf(").append(')').toString());
		}
	}

	int method4356() {
			ItemDefinition itemDefinitions = Js5Configs.itemList.getItemDefinitions(-441234013 * anInt10152);
			int i_55_ = itemDefinitions.unknownValue * -427528997;
			if (anInt10150 * -909380271 != -1) {
				ItemDefinition class468_56_ = Js5Configs.itemList.getItemDefinitions(anInt10150 * -909380271);
				if (-427528997 * class468_56_.unknownValue > i_55_)
					i_55_ = -427528997 * class468_56_.unknownValue;
			}
			if (-1 != -1651799761 * anInt10146) {
				ItemDefinition class468_57_ = Js5Configs.itemList.getItemDefinitions(anInt10146 * -1651799761);
				if (-427528997 * class468_57_.unknownValue > i_55_)
					i_55_ = class468_57_.unknownValue * -427528997;
			}
			return i_55_;
	}

	public Class365_Sub1_Sub4_Sub1(Region class331, int i, int i_59_, int i_60_, int i_61_, int i_62_) {
		super(class331, i, i_59_, i_60_, i_61_, i_62_);
		anInt10146 = 2004197937;
		anInt10142 = 0;
		this.anInt10149 = 0;
		this.aBoolean10144 = false;
		method4362(3);
		method4516();
	}

}
