package com.jagex;/* Class160 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;

public class Class160 {
	static int anInt1630 = 3;
	int anInt1631 = -247396807;
	Class453 aClass453_1632 = new Class453();
	static int anInt1633 = 1;
	static int anInt1634 = 2;
	static int anInt1635 = 7;
	static int anInt1636 = 4;
	static int anInt1637 = 11;
	static int anInt1638 = 6;
	static int anInt1639 = 12;
	static int anInt1640 = 8;
	static int anInt1641 = 5;
	static int anInt1642 = 10;
	long aLong1643;
	static int anInt1644 = 9;
	static int anInt1645 = 13;
	static SpriteToolkit[] aClass57Array1646;

    public void method1707(Class162 class162, byte i) {
		try {
			if ((2334843941678543823L * class162.aLong1663 != -6211723929392173281L * this.aLong1643) || (this.anInt1631 * 2001926135 != -934549233 * class162.anInt1653))
				throw new RuntimeException("");
			for (Class298_Sub40 class298_sub40 = (Class298_Sub40) this.aClass453_1632.method5939(); null != class298_sub40; class298_sub40 = ((Class298_Sub40) this.aClass453_1632.method5944()))
				class298_sub40.method3510(class162, (byte) 1);
			class162.anInt1653 += 1441392111;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gn.f(").append(')').toString());
		}
	}

	public Class160(Buffer class298_sub53) {
		method1708(class298_sub53, (short) 594);
	}

	void method1708(Buffer stream, short i) {
		try {
			this.aLong1643 = (stream.readLong() * 8254773464748362975L); // has
																									// to
																									// be
																									// 0
																									// else
																									// crash
			this.anInt1631 = stream.readInt() * 247396807;
			for (int i_0_ = stream.readUByte(); 0 != i_0_; i_0_ = stream.readUByte()) {
				Class298_Sub40 class298_sub40;
				if (i_0_ == 3)
					class298_sub40 = new Class298_Sub40_Sub2(this);
				else if (1 == i_0_)
					class298_sub40 = new Class298_Sub40_Sub1(this);
				else if (13 == i_0_)
					class298_sub40 = new Class298_Sub40_Sub5(this);
				else if (i_0_ == 4)
					class298_sub40 = new Class298_Sub40_Sub6(this);
				else if (6 == i_0_)
					class298_sub40 = new Class298_Sub40_Sub11(this);
				else if (5 == i_0_)
					class298_sub40 = new Class298_Sub40_Sub7(this);
				else if (2 == i_0_)
					class298_sub40 = new Class298_Sub40_Sub9(this);
				else if (7 == i_0_)
					class298_sub40 = new Class298_Sub40_Sub10(this);
				else if (8 == i_0_)
					class298_sub40 = new Class298_Sub40_Sub13(this);
				else if (i_0_ == 9)
					class298_sub40 = new Class298_Sub40_Sub8(this);
				else if (i_0_ == 10)
					class298_sub40 = new Class298_Sub40_Sub3(this);
				else if (i_0_ == 11)
					class298_sub40 = new Class298_Sub40_Sub12(this);
				else if (12 == i_0_)
					class298_sub40 = new Class298_Sub40_Sub4(this);
				else
					throw new RuntimeException("");
				class298_sub40.method3508(stream, 804752437);
				this.aClass453_1632.pushBack(class298_sub40);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gn.a(").append(')').toString());
		}
	}

	static final void method1709(ScriptRuntime class403, int i) {
		try {
			class403.integerStackOffset -= -783761378;
			int i_1_ = (class403.integerStack[681479919 * class403.integerStackOffset]);
			int i_2_ = (class403.integerStack[1 + class403.integerStackOffset * 681479919]);
			ItemDefinition class468 = Js5Configs.itemList.getItemDefinitions(i_1_);
			if (i_2_ >= 1 && i_2_ <= 5 && null != class468.inventoryOptions[i_2_ - 1])
				class403.objectStack[((class403.objectArgs += 969361751) * -203050393) - 1] = class468.inventoryOptions[i_2_ - 1];
			else
				class403.objectStack[((class403.objectArgs += 969361751) * -203050393) - 1] = "";
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gn.aar(").append(')').toString());
		}
	}

	static final void method1710(ScriptRuntime class403, int i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			ToMoveIComponentScripts.SET_TARGET_OVER_AND_LEAVE(class105, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gn.jz(").append(')').toString());
		}
	}

	static final void method1711(ScriptRuntime class403, byte i) {
		try {
			class403.integerStackOffset -= -1175642067;
			int i_3_ = (class403.integerStack[681479919 * class403.integerStackOffset]);
			int i_4_ = (class403.integerStack[class403.integerStackOffset * 681479919 + 1]);
			int i_5_ = (class403.integerStack[681479919 * class403.integerStackOffset + 2]);
			IComponentDefinition class105 = IComponentDefinition.getContainerComponent(i_3_ << 16 | i_4_, i_5_);
			IComponentDefinition.method1587();
			IComponentSettings IComponentSettings = GameClient.getComponentSettings(class105);
			StaticMethods.method1600(class105, IComponentSettings.method3497(), -1133219011 * IComponentSettings.anInt7410);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gn.amf(").append(')').toString());
		}
	}
}
