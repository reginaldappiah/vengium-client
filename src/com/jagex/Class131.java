package com.jagex;/* Class131 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.ConfigType;

public class Class131 {
	SoftCache cache = new SoftCache(16);
	Js5FileSystem aClass243_1497;
	static Class343_Sub1[] aClass343_Sub1Array1498;

	public void clear() {
		try {
			synchronized (this.cache) {
				this.cache.clear();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fh.f(").append(')').toString());
		}
	}

	public Class125 method1467(int i, int i_0_) {
		try {
			Class125 class125;
			synchronized (this.cache) {
				class125 = (Class125) this.cache.get((long) i);
			}
			if (class125 != null)
				return class125;
			byte[] data;
			synchronized (this.aClass243_1497) {
				data = (this.aClass243_1497.getFileFromArchive(ConfigType.SUNS.type * -1006924897, i));
			}
			class125 = new Class125();
			if (data != null)
				class125.readValueLoop(new Buffer(data));
			synchronized (this.cache) {
				this.cache.put(class125, (long) i);
			}
			return class125;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fh.a(").append(')').toString());
		}
	}

	public void sweep() {
		try {
			synchronized (this.cache) {
				this.cache.sweep();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fh.p(").append(')').toString());
		}
	}

	public Class131(Js5FileSystem fileSystem) {
		this.aClass243_1497 = fileSystem;
		this.aClass243_1497.getFileSystem((ConfigType.SUNS.type) * -1006924897);
	}

	public void method1469(int i, short i_1_) {
		try {
			synchronized (this.cache) {
				this.cache.method4186(i);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fh.b(").append(')').toString());
		}
	}

	static void method1470(IComponentDefinitionCollection IComponentDefinitionCollection, IComponentDefinition originalIComponentDefinition, int i) {
		try {
			if (originalIComponentDefinition != null) {
				if (originalIComponentDefinition.slot * -1309843523 != -1) {
					IComponentDefinition componentDefinition = IComponentDefinitionCollection.componentWithinInterface(originalIComponentDefinition.parentID);
					if (componentDefinition != null) {
						if (componentDefinition.containedComponents == componentDefinition.sada) {
							componentDefinition.containedComponents = (new IComponentDefinition[componentDefinition.sada.length]);
							componentDefinition.containedComponents[componentDefinition.containedComponents.length - 1] = originalIComponentDefinition;
							Class425.method5737(componentDefinition.sada, 0, componentDefinition.containedComponents, 0, (-1309843523 * originalIComponentDefinition.slot));
							Class425.method5737(componentDefinition.sada, 1 + originalIComponentDefinition.slot * -1309843523, componentDefinition.containedComponents, -1309843523 * originalIComponentDefinition.slot, (componentDefinition.sada.length - originalIComponentDefinition.slot * -1309843523 - 1));
						} else {
							int index = 0;
							IComponentDefinition[] containedComponents;
							for (containedComponents = componentDefinition.containedComponents; index < containedComponents.length; index++) {
								if (containedComponents[index] == originalIComponentDefinition) {
									if (i == -1270501871)
										break;
									return;
								}
							}
							if (index < containedComponents.length) {
								Class425.method5737(containedComponents, 1 + index, containedComponents, index, (containedComponents.length - index - 1));
								containedComponents[componentDefinition.containedComponents.length - 1] = originalIComponentDefinition;
							}
						}
					}
				} else {
					IComponentDefinition[] class105s = IComponentDefinitionCollection.resetComponents();
					int i_4_;
					for (i_4_ = 0; i_4_ < class105s.length; i_4_++) {
						if (originalIComponentDefinition == class105s[i_4_]) {
							if (i != -1270501871) {
								/* empty */
							}
							break;
						}
					}
					if (i_4_ < class105s.length) {
						Class425.method5737(class105s, i_4_ + 1, class105s, i_4_, class105s.length - i_4_ - 1);
						class105s[class105s.length - 1] = originalIComponentDefinition;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fh.posY(").append(')').toString());
		}
	}

	static final void method1471(ScriptRuntime runtime) {
		try {
			runtime.integerStackOffset -= -1567522756;
			int i_5_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
			int i_6_ = (runtime.integerStack[681479919 * runtime.integerStackOffset + 1]);
			int i_7_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 2]);
			int i_8_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 3]);
			GameScene gameScene = GameClient.myRegion.getGameScene();
			Class173.method1822(((i_5_ >> 14 & 0x3fff) - gameScene.gameSceneBaseX * -1760580017), ((i_5_ & 0x3fff) - 283514611 * gameScene.gameSceneBaseY), i_6_ << 2, i_7_, i_8_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fh.agc(").append(')').toString());
		}
	}
}
