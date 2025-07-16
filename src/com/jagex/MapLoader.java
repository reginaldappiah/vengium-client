package com.jagex;/* Class248 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.utils.CameraUtils;

import java.util.LinkedList;

public class MapLoader implements Runnable {
	volatile boolean aBoolean2749 = false;
	LinkedList aLinkedList2750 = new LinkedList();
	GameMap map = new GameMap(true);

	public void setObjectDefinitionLoader(ObjectDefinitionLoader objectDefinitionLoader) {
			this.map.setObjectDefinitionLoader(objectDefinitionLoader);
	}

	public boolean method2380() {
		try {
			return this.aBoolean2749;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kj.b(").append(')').toString());
		}
	}

	void method2381(GameMap map) {
		try {
			this.map = map;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kj.i(").append(')').toString());
		}
	}

	public void run() {
		try {
			for (;;)
				method2382();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kj.run(").append(')').toString());
		}
	}

	void method2382() {
		try {
			MapLoadBuffer mapLoadBuffer;
			synchronized (this.aLinkedList2750) {
				try {
					this.aLinkedList2750.wait();
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
				mapLoadBuffer = (MapLoadBuffer) this.aLinkedList2750.pollFirst();
			}
			do {
				try {
					try {
						if (mapLoadBuffer != null) {
							this.aBoolean2749 = true;
							method2383(mapLoadBuffer, 1924370616);
						}
					} catch (Exception exception) {
						this.aBoolean2749 = false;
						break;
					}
					this.aBoolean2749 = false;
				} catch (RuntimeException object_0_) {
					this.aBoolean2749 = false;
					throw object_0_;
				}
			} while (false);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kj.k(").append(')').toString());
		}
	}

	void method2383(MapLoadBuffer mapLoadBuffer, int i) {
		try {
			if (MapLoad.aClass266_2852 == mapLoadBuffer.mapLoad)
				this.map.method2667();
			else
				this.map.sendMapScene(mapLoadBuffer);
			for (boolean bool = this.map.loadMapSettings(-1688450979); !bool; bool = this.map.loadMapSettings(-770547477)) {
				/* empty */
			}
			this.map.method2673((byte) 119);
			GameClient.myRegion.method2673((byte) 25);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kj.d(").append(')').toString());
		}
	}

	public GameMap getGameMap() {
			return this.map;
	}

	public void method2385(MapLoadBuffer mapLoadBuffer, int i) {
		try {
			synchronized (this.aLinkedList2750) {
				this.aLinkedList2750.add(mapLoadBuffer);
				this.aLinkedList2750.notify();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kj.f(").append(')').toString());
		}
	}

	static final void method2387(ScriptRuntime class403, byte i) {
		try {
			Class239.method2208((class403.integerStack[(class403.integerStackOffset -= -391880689) * 681479919]), -292908966);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kj.adc(").append(')').toString());
		}
	}

	static void method2389(GraphicsToolkit graphicsToolkit, ToolkitLoader toolkitLoader, IComponentDefinition componentDefinition, int i, int i_6_, int i_7_, int i_8_, int i_9_) {
			Class352 class352 = Class363.aClass339_3931.method4116(i_9_);
			if (class352 != null && class352.aBoolean3780 && class352.method4237(Class128.playerVarsProvider)) {
				if (class352.anIntArray3803 != null) {
					int[] is = new int[class352.anIntArray3803.length];
					for (int i_11_ = 0; i_11_ < is.length / 2; i_11_++) {
						int i_12_;
						if (-863531439 * CameraUtils.cameraType == CameraUtils.FREE_FORM)
							i_12_ = (int) GameClient.cameraXAngle & 0x3fff;
						else
							i_12_ = (GameClient.anInt8801 * 1227356013 + (int) GameClient.cameraXAngle) & 0x3fff;
						int i_13_ = CircleAngleTable.SINE[i_12_];
						int i_14_ = CircleAngleTable.COSINE[i_12_];
						if (CameraUtils.cameraType * -863531439 != CameraUtils.FREE_FORM) {
							i_13_ = 256 * i_13_ / (GameClient.anInt8749 * 356727603 + 256);
							i_14_ = (i_14_ * 256 / (256 + 356727603 * GameClient.anInt8749));
						}
						is[i_11_ * 2] = ((((i_8_ + 4 * (class352.anIntArray3803[i_11_ * 2 + 1])) * i_13_ + ((i_7_ + 4 * class352.anIntArray3803[i_11_ * 2]) * i_14_)) >> 14) + (componentDefinition.aspectWidth * -2093041337 / 2 + i));
						is[i_11_ * 2 + 1] = (i_6_ + componentDefinition.aspectHeight * 457937409 / 2 - ((i_14_ * ((class352.anIntArray3803[1 + 2 * i_11_]) * 4 + i_8_) - (4 * class352.anIntArray3803[2 * i_11_] + i_7_) * i_13_) >> 14));
					}
					Class117 class117 = componentDefinition.method1116(graphicsToolkit);
					if (null != class117)
						Class81.method858(graphicsToolkit, is, class352.anInt3808 * -248291889, class117.anIntArray1396, class117.anIntArray1395);
					if (class352.anInt3806 * -972644285 > 0) {
						for (int i_15_ = 0; i_15_ < is.length / 2 - 1; i_15_++) {
							int i_16_ = is[i_15_ * 2];
							int i_17_ = is[1 + 2 * i_15_];
							int i_18_ = is[(i_15_ + 1) * 2];
							int i_19_ = is[2 * (i_15_ + 1) + 1];
							if (i_18_ < i_16_) {
								int i_20_ = i_16_;
								int i_21_ = i_17_;
								i_16_ = i_18_;
								i_17_ = i_19_;
								i_18_ = i_20_;
								i_19_ = i_21_;
							} else if (i_18_ == i_16_ && i_19_ < i_17_) {
								int i_22_ = i_17_;
								i_17_ = i_19_;
								i_19_ = i_22_;
							}
							graphicsToolkit.method5007(i_16_, i_17_, i_18_, i_19_, (class352.anIntArray3814[class352.aByteArray3777[i_15_] & 0xff]), 1, toolkitLoader, i, i_6_, class352.anInt3806 * -972644285, class352.anInt3799 * 2123190239, -176015499 * class352.anInt3788);
						}
						int i_23_ = is[is.length - 2];
						int i_24_ = is[is.length - 1];
						int i_25_ = is[0];
						int i_26_ = is[1];
						if (i_25_ < i_23_) {
							int i_27_ = i_23_;
							int i_28_ = i_24_;
							i_23_ = i_25_;
							i_24_ = i_26_;
							i_25_ = i_27_;
							i_26_ = i_28_;
						} else if (i_25_ == i_23_ && i_26_ < i_24_) {
							int i_29_ = i_24_;
							i_24_ = i_26_;
							i_26_ = i_29_;
						}
						graphicsToolkit.method5007(i_23_, i_24_, i_25_, i_26_, (class352.anIntArray3814[(class352.aByteArray3777[(class352.aByteArray3777.length - 1)]) & 0xff]), 1, toolkitLoader, i, i_6_, -972644285 * class352.anInt3806, 2123190239 * class352.anInt3799, class352.anInt3788 * -176015499);
					} else {
						for (int i_30_ = 0; i_30_ < is.length / 2 - 1; i_30_++)
							graphicsToolkit.method5022(is[2 * i_30_], is[1 + 2 * i_30_], is[(i_30_ + 1) * 2], is[1 + 2 * (1 + i_30_)], (class352.anIntArray3814[(class352.aByteArray3777[i_30_]) & 0xff]), 1, toolkitLoader, i, i_6_);
						graphicsToolkit.method5022(is[is.length - 2], is[is.length - 1], is[0], is[1], (class352.anIntArray3814[(class352.aByteArray3777[(class352.aByteArray3777.length - 1)]) & 0xff]), 1, toolkitLoader, i, i_6_);
					}
				}
				SpriteToolkit class57 = null;
				if (-1 != class352.anInt3785 * 715019623) {
					class57 = class352.method4238(graphicsToolkit, false);
					if (null != class57)
						StaticMethods.method5883(componentDefinition, toolkitLoader, i, i_6_, i_7_, i_8_, class57);
				}
				if (class352.aString3792 != null) {
					int i_31_ = 0;
					if (null != class57)
						i_31_ = class57.getHeight();
					FontToolkit fontToolkit = FontToolkit.fontToolkit;
					RSFontMetrics rsFontMetrics = Class74.aClass505_695;
					if (class352.anInt3783 * 1023000389 == 1) {
						fontToolkit = StaticMethods.aClass264_3673;
						rsFontMetrics = StaticMethods.aClass505_8369;
					}
					if (class352.anInt3783 * 1023000389 == 2) {
						fontToolkit = StaticMethods.b12_full_monochrome;
						rsFontMetrics = Class82_Sub19_Sub1.aClass505_9111;
					}
					StaticMethods.method4290(componentDefinition, toolkitLoader, i, i_6_, i_7_, i_8_, i_31_, class352.aString3792, fontToolkit, rsFontMetrics, -1836991893 * class352.anInt3781);
				}
			}
	}
}
