package com.jagex;/* Class116 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class116 {
	Class298_Sub31[] aClass298_Sub31Array1390;
	Interface4 anInterface4_1391;
	LinkedList aClass437_1392;

	public Class298_Sub31 method1263(String string, int i) {
		try {
			long l = this.anInterface4_1391.method47(string, (byte) 93);
			for (Class298_Sub31 class298_sub31 = ((Class298_Sub31) this.aClass437_1392.get(l)); null != class298_sub31; class298_sub31 = (Class298_Sub31) this.aClass437_1392.poll()) {
				if (class298_sub31.aString7370.equals(string))
					return class298_sub31;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("es.f(").append(')').toString());
		}
	}

	void method1264(int i, int i_0_) {
		try {
			Class298_Sub31 class298_sub31 = method1266(i, (byte) -123);
			if (class298_sub31 != null) {
				class298_sub31.unlink();
				this.aClass298_Sub31Array1390[-1836037967 * class298_sub31.anInt7369] = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("es.b(").append(')').toString());
		}
	}

	public void method1265(int i, String string, Class298_Sub31 class298_sub31, int i_1_) {
		try {
			Class298_Sub31 class298_sub31_2_ = method1263(string, -1827449503);
			if (null != class298_sub31_2_ && i != (class298_sub31_2_.anInt7369 * -1836037967))
				throw new IllegalArgumentException(string);
			method1264(i, -1882252920);
			if (i >= this.aClass298_Sub31Array1390.length) {
				int i_3_;
				for (i_3_ = this.aClass298_Sub31Array1390.length; i >= i_3_; i_3_ += i_3_) {
					/* empty */
				}
				this.aClass437_1392 = new LinkedList(i_3_);
				for (int i_4_ = 0; i_4_ < this.aClass298_Sub31Array1390.length; i_4_++) {
					Class298_Sub31 class298_sub31_5_ = this.aClass298_Sub31Array1390[i_4_];
					if (class298_sub31_5_ != null)
						this.aClass437_1392.connect(class298_sub31_5_, (class298_sub31_5_.key * 7051297995265073167L));
				}
				Class298_Sub31[] class298_sub31s = new Class298_Sub31[i_3_];
				for (int i_6_ = 0; i_6_ < this.aClass298_Sub31Array1390.length; i_6_++)
					class298_sub31s[i_6_] = this.aClass298_Sub31Array1390[i_6_];
				this.aClass298_Sub31Array1390 = class298_sub31s;
			}
			class298_sub31.anInt7369 = -1138163631 * i;
			class298_sub31.aString7370 = string;
			this.aClass437_1392.connect(class298_sub31, this.anInterface4_1391.method47(string, (byte) -48));
			this.aClass298_Sub31Array1390[i] = class298_sub31;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("es.p(").append(')').toString());
		}
	}

	public Class116(int i, Interface4 interface4) {
		int i_7_;
		for (i_7_ = 1; i_7_ < i; i_7_ += i_7_) {
			/* empty */
		}
		this.aClass437_1392 = new LinkedList(i_7_);
		this.aClass298_Sub31Array1390 = new Class298_Sub31[i_7_];
		this.anInterface4_1391 = interface4;
	}

	public Class298_Sub31 method1266(int i, byte i_8_) {
		try {
			if (i >= this.aClass298_Sub31Array1390.length)
				return null;
			return this.aClass298_Sub31Array1390[i];
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("es.a(").append(')').toString());
		}
	}

	public static void method1267() {
		try {
			Class276.method2574();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("es.f(").append(')').toString());
		}
	}

	public static void method1268(Class95 class95, int i, byte i_9_) {
		try {
			i = i * SettingsManager.settingsManager.musicVolume.getValue() >> 8;
			if (null == class95)
				Class134.method1489((byte) -122);
			else {
				Class298_Sub32_Sub10.method3200(class95, i, -391880689);
				Class368.method4555((short) -1817);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("es.e(").append(')').toString());
		}
	}

	static final void method1269(ScriptRuntime runtime) {
		try {
			IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = class105.text;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("es.pf(").append(')').toString());
		}
	}

	static final void method1270(Entity class365_sub1_sub1_sub2, int i) {
		try {
			if (null != class365_sub1_sub1_sub2.anIntArray10092 || class365_sub1_sub1_sub2.anIntArray10085 != null) {
				boolean bool = true;
				GameScene gameScene = GameClient.myRegion.getGameScene();
				for (int i_10_ = 0; i_10_ < class365_sub1_sub1_sub2.anIntArray10092.length; i_10_++) {
					int i_11_ = -1;
					if (null != class365_sub1_sub1_sub2.anIntArray10092)
						i_11_ = class365_sub1_sub1_sub2.anIntArray10092[i_10_];
					if (-1 == i_11_) {
						if (!class365_sub1_sub1_sub2.method4417(i_10_, -1, (byte) 65))
							bool = false;
					} else {
						bool = false;
						boolean bool_12_ = false;
						boolean bool_13_ = false;
						Vector3f class217 = (class365_sub1_sub1_sub2.getWorldTransform().trans);
						int i_14_;
						int i_15_;
						if (-1073741824 == (i_11_ & ~0x3fffffff)) {
							int i_16_ = i_11_ & 0xfffffff;
							int i_17_ = i_16_ >> 14;
							int i_18_ = i_16_ & 0x3fff;
							i_14_ = ((int) class217.x - (256 + 512 * (i_17_ - (gameScene.gameSceneBaseX * -1760580017))));
							i_15_ = ((int) class217.z - (256 + ((i_18_ - 283514611 * gameScene.gameSceneBaseY) * 512)));
						} else if ((i_11_ & 0x8000) != 0) {
							int i_19_ = i_11_ & 0x7fff;
							Player class365_sub1_sub1_sub2_sub2 = (GameClient.entities[i_19_]);
							if (null != class365_sub1_sub1_sub2_sub2) {
								Vector3f class217_20_ = (class365_sub1_sub1_sub2_sub2.getWorldTransform().trans);
								i_14_ = ((int) class217.x - (int) class217_20_.x);
								i_15_ = ((int) class217.z - (int) class217_20_.z);
							} else {
								class365_sub1_sub1_sub2.method4417(i_10_, -1, (byte) 16);
								continue;
							}
						} else {
							ObjectNode class298_sub29 = ((ObjectNode) GameClient.entityList.get((long) i_11_));
							if (null != class298_sub29) {
								NPC class365_sub1_sub1_sub2_sub1 = ((NPC) class298_sub29.nodeObject);
								Vector3f class217_21_ = (class365_sub1_sub1_sub2_sub1.getWorldTransform().trans);
								i_14_ = ((int) class217.x - (int) class217_21_.x);
								i_15_ = ((int) class217.z - (int) class217_21_.z);
							} else {
								class365_sub1_sub1_sub2.method4417(i_10_, -1, (byte) 65);
								continue;
							}
						}
						if (i_14_ != 0 || 0 != i_15_)
							class365_sub1_sub1_sub2.method4417(i_10_, (int) (Math.atan2((double) i_14_, (double) i_15_) * 2607.5945876176133) & 0x3fff, (byte) 21);
					}
				}
				if (bool) {
					class365_sub1_sub1_sub2.anIntArray10092 = null;
					class365_sub1_sub1_sub2.anIntArray10085 = null;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("es.hw(").append(')').toString());
		}
	}

	static final void method1271(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
		try {
			runtime.integerStackOffset -= -1567522756;
			componentDefinition.startX = (runtime.integerStack[runtime.integerStackOffset * 681479919]) * 2145953887;
			componentDefinition.startY = (1215865909 * (runtime.integerStack[1 + 681479919 * runtime.integerStackOffset]));
			int i_22_ = (runtime.integerStack[681479919 * runtime.integerStackOffset + 2]);
			if (i_22_ < 0)
				i_22_ = 0;
			else if (i_22_ > 5)
				i_22_ = 5;
			int i_23_ = (runtime.integerStack[681479919 * runtime.integerStackOffset + 3]);
			if (i_23_ < 0)
				i_23_ = 0;
			else if (i_23_ > 5)
				i_23_ = 5;
			componentDefinition.hPositionMode = (byte) i_22_;
			componentDefinition.vPositionMode = (byte) i_23_;
			StaticMethods.updateComponentTick(componentDefinition);
			IComponentDefinition.updateShapeModes(IComponentDefinitionCollection, componentDefinition);
			if (0 == componentDefinition.type * -1215239439)
				Class65.method761(IComponentDefinitionCollection, componentDefinition, false);
			if (componentDefinition.slot * -1309843523 == -1 && !IComponentDefinitionCollection.accessed)
				IComponentUpdateNode.appendPositionUpdate(componentDefinition.interfaceHash);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("es.cy(").append(')').toString());
		}
	}

	static final void method1273(ScriptRuntime runtime) {
		try {
			IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			Class356.method4270(class105, IComponentDefinitionCollection, runtime);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("es.lq(").append(')').toString());
		}
	}
}
