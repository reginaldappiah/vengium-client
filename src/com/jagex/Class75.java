package com.jagex;/* Class75 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

public class Class75 {
	int[] anIntArray701;
	int[] anIntArray702;
	int[] anIntArray703;
	int[] anIntArray704;
	int[] anIntArray705;
	int[] anIntArray706;
	int[] anIntArray707;
	public static int anInt708;

	void method833(int i, int i_0_) {
		try {
			int[][] is = new int[this.anIntArray705.length << 1][4];
			for (int i_1_ = 0; i_1_ < this.anIntArray705.length; i_1_++) {
				is[i_1_ * 2][0] = this.anIntArray705[i_1_];
				is[2 * i_1_][1] = this.anIntArray702[i_1_];
				is[2 * i_1_][2] = this.anIntArray703[i_1_];
				is[2 * i_1_][3] = this.anIntArray707[i_1_];
				is[1 + 2 * i_1_][0] = this.anIntArray704[i_1_];
				is[1 + i_1_ * 2][1] = this.anIntArray701[i_1_];
				is[1 + 2 * i_1_][2] = this.anIntArray706[i_1_];
				is[2 * i_1_ + 1][3] = this.anIntArray707[i_1_];
			}
			GameClient.anIntArrayArrayArray8767[i] = is;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("da.a(").append(')').toString());
		}
	}

	Class75(Buffer class298_sub53) {
		int i = class298_sub53.readUnsignedSmart();
		this.anIntArray705 = new int[i];
		this.anIntArray702 = new int[i];
		this.anIntArray703 = new int[i];
		this.anIntArray707 = new int[i];
		this.anIntArray704 = new int[i];
		this.anIntArray701 = new int[i];
		this.anIntArray706 = new int[i];
		for (int i_2_ = 0; i_2_ < i; i_2_++) {
			this.anIntArray705[i_2_] = class298_sub53.readUShort() - 5120;
			this.anIntArray703[i_2_] = class298_sub53.readUShort() - 5120;
			this.anIntArray702[i_2_] = class298_sub53.readShort();
			this.anIntArray704[i_2_] = class298_sub53.readUShort() - 5120;
			this.anIntArray706[i_2_] = class298_sub53.readUShort() - 5120;
			this.anIntArray701[i_2_] = class298_sub53.readShort();
			this.anIntArray707[i_2_] = class298_sub53.readShort();
		}
	}

	public static final Class284 method834(Component component, int i, int i_3_) {
			if (0 == Class284.anInt3059 * 1164070869)
				throw new IllegalStateException();
			if (i < 0 || i >= 2)
				throw new IllegalArgumentException();
			if (i_3_ < 256)
				i_3_ = 256;
			Class284_Sub1 class284_sub1;
			try {
				Class284_Sub1 class284_sub1_5_ = new Class284_Sub1();
				class284_sub1_5_.anIntArray3052 = new int[(Class284.isSteroSound ? 2 : 1) * 256];
				class284_sub1_5_.anInt3071 = i_3_ * -949520941;
				class284_sub1_5_.method2683(component, (byte) 127);
				class284_sub1_5_.anInt3046 = 2121848755 * ((i_3_ & ~0x3ff) + 1024);
				if (-1894797445 * class284_sub1_5_.anInt3046 > 16384)
					class284_sub1_5_.anInt3046 = 904708096;
				class284_sub1_5_.method2684((class284_sub1_5_.anInt3046) * -1894797445, 557897773);
				if (-1869204691 * Class284.anInt3048 > 0 && null == Class284.aClass288_3057) {
					Class284.aClass288_3057 = new Class288_Sub1();
					Thread thread = new Thread(Class284.aClass288_3057);
					thread.setDaemon(true);
					thread.start();
					thread.setPriority(Class284.anInt3048 * -1869204691);
				}
				if (Class284.aClass288_3057 != null) {
					if (null != (Class284.aClass288_3057.aClass284Array3104[i]))
						throw new IllegalArgumentException();
					Class284.aClass288_3057.aClass284Array3104[i] = class284_sub1_5_;
				}
				class284_sub1 = class284_sub1_5_;
			} catch (Throwable throwable) {
				return new Class284();
			}
			return class284_sub1;
	}

	static final void method835(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
		try {
			componentDefinition.opBase = (String) (runtime.objectStack[((runtime.objectArgs -= 969361751) * -203050393)]);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("da.js(").append(')').toString());
		}
	}

	static final void method836(ScriptRuntime class403, byte i) {
		try {
			int i_6_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			if (Class301_Sub1.aClass437_7637 != null) {
				Node class298 = Class301_Sub1.aClass437_7637.get((long) i_6_);
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = class298 != null ? 1 : 0;
			} else
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("da.aey(").append(')').toString());
		}
	}

	static void method837(MenuOptionNode menuOptionNode) {
		try {
			boolean bool = false;
			menuOptionNode.unlinkCache();
			for (MenuOptionNode menuOptionNode_7_ = ((MenuOptionNode) Class436.aClass461_5482.first()); menuOptionNode_7_ != null; menuOptionNode_7_ = ((MenuOptionNode) Class436.aClass461_5482.next())) {
				if (Class473.method6069(menuOptionNode.method3417(), menuOptionNode_7_.method3417())) {
					NodeCollection.method5973(menuOptionNode, menuOptionNode_7_, -1541675772);
					bool = true;
					break;
				}
			}
			if (!bool)
				Class436.aClass461_5482.offer(menuOptionNode);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("da.h(").append(')').toString());
		}
	}

	static final void method838(ScriptRuntime runtime) {
		try {
			IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			Class82_Sub19.method925(class105, IComponentDefinitionCollection, runtime, -535116520);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("da.fv(").append(')').toString());
		}
	}
}
