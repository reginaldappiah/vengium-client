package com.jagex;/* Class501 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.prefetch.Js5List;
import com.jagex.utils.CameraUtils;

import java.io.*;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;

public final class ClassNotAnim {
	int anInt6118;
	static int anInt6119;
	ReferenceQueue referenceQueue = new ReferenceQueue();
	WeakReference_Sub1[] aWeakReference_Sub1Array6121 = new WeakReference_Sub1[16];
	public static SpriteToolkit aClass57_6123;

	public void method6222(Object object, Object object_0_, int i) {
		try {
			if (null == object)
				throw new NullPointerException();
			method6223(1702492864);
			int hashcode = System.identityHashCode(object);
			int i_2_ = hashcode & (this.aWeakReference_Sub1Array6121.length - 1);
			WeakReference_Sub1 weakreference_sub1 = this.aWeakReference_Sub1Array6121[i_2_];
			if (weakreference_sub1 == null) {
				this.aWeakReference_Sub1Array6121[i_2_] = new WeakReference_Sub1(object, (this.referenceQueue), hashcode, object_0_);
				this.anInt6118 += -1233820543;
				if (2061425537 * this.anInt6118 >= this.aWeakReference_Sub1Array6121.length)
					method6226(-354056618);
			} else {
				for (;;) {
					if (weakreference_sub1.get() == object) {
						if (i != -391880689) {
							/* empty */
						}
						break;
					}
					if ((weakreference_sub1.aWeakReference_Sub1_6302) == null) {
						weakreference_sub1.aWeakReference_Sub1_6302 = new WeakReference_Sub1(object, (this.referenceQueue), hashcode, object_0_);
						this.anInt6118 += -1233820543;
						if (this.anInt6118 * 2061425537 >= (this.aWeakReference_Sub1Array6121).length)
							method6226(-2117837549);
						break;
					}
					weakreference_sub1 = (weakreference_sub1.aWeakReference_Sub1_6302);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("us.a(").append(')').toString());
		}
	}

	void method6223(int i) {
		try {
			for (;;) {
				WeakReference_Sub1 weakreference_sub1 = ((WeakReference_Sub1) this.referenceQueue.poll());
				if (weakreference_sub1 == null)
					break;
				int i_3_ = ((1530822039 * weakreference_sub1.anInt6301) & (this.aWeakReference_Sub1Array6121.length - 1));
				WeakReference_Sub1 weakreference_sub1_4_ = this.aWeakReference_Sub1Array6121[i_3_];
				if (weakreference_sub1 == weakreference_sub1_4_) {
					this.aWeakReference_Sub1Array6121[i_3_] = (weakreference_sub1.aWeakReference_Sub1_6302);
					this.anInt6118 -= -1233820543;
				} else {
					for (/**/; (null != weakreference_sub1_4_ && (weakreference_sub1 != (weakreference_sub1_4_.aWeakReference_Sub1_6302))); weakreference_sub1_4_ = (weakreference_sub1_4_.aWeakReference_Sub1_6302)) {
						/* empty */
					}
					if (weakreference_sub1_4_ != null) {
						weakreference_sub1_4_.aWeakReference_Sub1_6302 = (weakreference_sub1.aWeakReference_Sub1_6302);
						this.anInt6118 -= -1233820543;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("us.i(").append(')').toString());
		}
	}

	public ArrayList method6224(int i) {
		try {
			method6223(-93976926);
			ArrayList arraylist = new ArrayList(this.anInt6118 * 2061425537);
			WeakReference_Sub1[] weakreference_sub1s = this.aWeakReference_Sub1Array6121;
			for (int i_5_ = 0; i_5_ < weakreference_sub1s.length; i_5_++) {
				for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s[i_5_]; null != weakreference_sub1; weakreference_sub1 = (weakreference_sub1.aWeakReference_Sub1_6302)) {
					Object object = weakreference_sub1.get();
					if (object != null)
						arraylist.add(object);
				}
			}
			return arraylist;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("us.b(").append(')').toString());
		}
	}

	public void method6225(Object object, int i) {
		try {
			if (object == null)
				throw new NullPointerException();
			method6223(-439163515);
			int i_6_ = System.identityHashCode(object);
			int i_7_ = i_6_ & (this.aWeakReference_Sub1Array6121.length - 1);
			WeakReference_Sub1 weakreference_sub1 = this.aWeakReference_Sub1Array6121[i_7_];
			if (null != weakreference_sub1) {
				if (weakreference_sub1.get() == object) {
					this.aWeakReference_Sub1Array6121[i_7_] = (weakreference_sub1.aWeakReference_Sub1_6302);
					this.anInt6118 -= -1233820543;
				} else {
					for (;;) {
						WeakReference_Sub1 weakreference_sub1_8_ = (weakreference_sub1.aWeakReference_Sub1_6302);
						if (weakreference_sub1_8_ == null) {
							if (i < 125611783)
								break;
							break;
						}
						if (weakreference_sub1_8_.get() == object) {
							weakreference_sub1.aWeakReference_Sub1_6302 = (weakreference_sub1_8_.aWeakReference_Sub1_6302);
							this.anInt6118 -= -1233820543;
							break;
						}
						weakreference_sub1 = weakreference_sub1_8_;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("us.f(").append(')').toString());
		}
	}

	void method6226(int i) {
		try {
			WeakReference_Sub1[] weakreference_sub1s = this.aWeakReference_Sub1Array6121;
			this.aWeakReference_Sub1Array6121 = new WeakReference_Sub1[2 * weakreference_sub1s.length];
			WeakReference_Sub1[] weakreference_sub1s_9_ = weakreference_sub1s;
			for (int i_10_ = 0; i_10_ < weakreference_sub1s_9_.length; i_10_++) {
				WeakReference_Sub1 weakreference_sub1_11_;
				for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s_9_[i_10_]; weakreference_sub1 != null; weakreference_sub1 = weakreference_sub1_11_) {
					weakreference_sub1_11_ = (weakreference_sub1.aWeakReference_Sub1_6302);
					int i_12_ = ((weakreference_sub1.anInt6301 * 1530822039) & (this.aWeakReference_Sub1Array6121).length - 1);
					weakreference_sub1.aWeakReference_Sub1_6302 = (this.aWeakReference_Sub1Array6121[i_12_]);
					this.aWeakReference_Sub1Array6121[i_12_] = weakreference_sub1;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("us.p(").append(')').toString());
		}
	}

	public static void method6227(boolean bool) {
			if (bool) {
				if (-1 != GameClient.WINDOW_PANE_ID * -257444687)
					Class82_Sub8.deactivateComponents(-257444687 * GameClient.WINDOW_PANE_ID);
				for (Widget class298_sub51 = ((Widget) GameClient.linkedList.method5816()); null != class298_sub51; class298_sub51 = ((Widget) GameClient.linkedList.method5815())) {
					if (!class298_sub51.isNextAvailable()) {
						class298_sub51 = ((Widget) GameClient.linkedList.method5816());
						if (class298_sub51 == null) {
							return;
						}
					}
					Widget.closeInterface(class298_sub51, true, false);
				}
				GameClient.WINDOW_PANE_ID = -1785861201;
				GameClient.linkedList = new LinkedList(8);
				IComponentDefinitionCollection.setInterfaceDefinitionSize();
				GameClient.WINDOW_PANE_ID = 62030331 * Js5List.JS5_DEFAULTS.backgroundInterface;
				Class257.method2453(false, (byte) 8);
				StaticMethods.method4301();
				Class14.method341(-257444687 * GameClient.WINDOW_PANE_ID, null);
			}
			StaticMethods.method1939();
			Class360.aBoolean3912 = false;
			ConfigDefinitions.method3983();
			GameClient.targetLeaveCursor = 280458557;
			StaticMethods.method6314(GameClient.anInt8831 * 1203044105);
			Player.myPlayer = new Player(null);
			Player.myPlayer.method4341((float) (GameClient.myRegion.getMapWidth() * 512 / 2), 0.0F, (float) (GameClient.myRegion.getMapLength() * 512 / 2));
			Player.myPlayer.scenePositionXQueue[0] = GameClient.myRegion.getMapWidth() / 2;
			Player.myPlayer.scenePositionYQueue[0] = GameClient.myRegion.getMapLength() / 2;
			GameClient.camPosZ = 0;
			GameClient.camPosX = 0;
			if (3 == CameraUtils.cameraType * -863531439) {
				GameClient.camPosX = (1374340743 * Class376.anInt4089 << 9) * 547882953;
				GameClient.camPosZ = (Class82_Sub4.anInt6832 * -1548077269 << 9) * 309839105;
			} else
				Class397.method4913();
			GameClient.myRegion.getLightningDetails().method4324();
	}

	static final void method6228(ScriptRuntime runtime) {
		try {
			int i_13_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_13_);
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = 1354508417 * class105.x;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("us.qx(").append(')').toString());
		}
	}

	static boolean method6229(RsBitsBuffer bitsBuffer, int i) {
		try {
			int i_15_ = bitsBuffer.readBits(2);
			if (0 == i_15_) {
				if (bitsBuffer.readBits(1) != 0)
					method6229(bitsBuffer, i);
				int i_16_ = bitsBuffer.readBits(6);
				int i_17_ = bitsBuffer.readBits(6);
				boolean bool = bitsBuffer.readBits(1) == 1;
				if (bool)
					Class10.anIntArray140[(Class10.anInt139 += 867608709) * -1281683379 - 1] = i;
				if (null != GameClient.entities[i])
					throw new RuntimeException();
				Class410 class410 = Class10.aClass410Array138[i];
				Player class365_sub1_sub1_sub2_sub2 = (GameClient.entities[i] = (new Player(GameClient.myRegion.getRegion())));
				class365_sub1_sub1_sub2_sub2.entityIndex = i * 1714292119;
				if (null != Class10.aClass298_Sub53Array133[i])
					class365_sub1_sub1_sub2_sub2.sendAppearence(Class10.aClass298_Sub53Array133[i], (byte) 3);
				class365_sub1_sub1_sub2_sub2.method4415(-1000138653 * class410.anInt5286, true, 1449559817);
				class365_sub1_sub1_sub2_sub2.setNextFaceEntity = -790543005 * class410.anInt5285;
				int i_18_ = class410.anInt5288 * 1966930015;
				int i_19_ = i_18_ >> 28;
				int i_20_ = i_18_ >> 14 & 0xff;
				int i_21_ = i_18_ & 0xff;
				GameScene gameScene = GameClient.myRegion.getGameScene();
				int i_22_ = (i_20_ << 6) + i_16_ - gameScene.gameSceneBaseX * -1760580017;
				int i_23_ = (i_21_ << 6) + i_17_ - 283514611 * gameScene.gameSceneBaseY;
				class365_sub1_sub1_sub2_sub2.aBoolean10203 = class410.aBoolean5287;
				class365_sub1_sub1_sub2_sub2.aBoolean10222 = class410.aBoolean5289;
				class365_sub1_sub1_sub2_sub2.aByteArray10110[0] = Class10.playersMovementTypes[i];
				class365_sub1_sub1_sub2_sub2.plane = class365_sub1_sub1_sub2_sub2.aByte7724 = (byte) i_19_;
				if (GameClient.myRegion.method2654().method2320(i_22_, i_23_))
					class365_sub1_sub1_sub2_sub2.aByte7724++;
				class365_sub1_sub1_sub2_sub2.method4472(i_22_, i_23_);
				class365_sub1_sub1_sub2_sub2.aBoolean10217 = false;
				Class10.aClass410Array138[i] = null;
				return true;
			}
			if (1 == i_15_) {
				int i_24_ = bitsBuffer.readBits(2);
				int i_25_ = (Class10.aClass410Array138[i].anInt5288 * 1966930015);
				Class10.aClass410Array138[i].anInt5288 = (((i_24_ + (i_25_ >> 28) & 0x3) << 28) + (i_25_ & 0xfffffff)) * 1896571807;
				return false;
			}
			if (i_15_ == 2) {
				int i_26_ = bitsBuffer.readBits(5);
				int i_27_ = i_26_ >> 3;
				int i_28_ = i_26_ & 0x7;
				int i_29_ = (1966930015 * Class10.aClass410Array138[i].anInt5288);
				int i_30_ = (i_29_ >> 28) + i_27_ & 0x3;
				int i_31_ = i_29_ >> 14 & 0xff;
				int i_32_ = i_29_ & 0xff;
				if (i_28_ == 0) {
					i_31_--;
					i_32_--;
				}
				if (i_28_ == 1)
					i_32_--;
				if (i_28_ == 2) {
					i_31_++;
					i_32_--;
				}
				if (3 == i_28_)
					i_31_--;
				if (4 == i_28_)
					i_31_++;
				if (i_28_ == 5) {
					i_31_--;
					i_32_++;
				}
				if (6 == i_28_)
					i_32_++;
				if (i_28_ == 7) {
					i_31_++;
					i_32_++;
				}
				Class10.aClass410Array138[i].anInt5288 = 1896571807 * (i_32_ + ((i_30_ << 28) + (i_31_ << 14)));
				return false;
			}
			int i_33_ = bitsBuffer.readBits(18);
			int i_34_ = i_33_ >> 16;
			int i_35_ = i_33_ >> 8 & 0xff;
			int i_36_ = i_33_ & 0xff;
			int i_37_ = (1966930015 * Class10.aClass410Array138[i].anInt5288);
			int i_38_ = i_34_ + (i_37_ >> 28) & 0x3;
			int i_39_ = i_35_ + (i_37_ >> 14) & 0xff;
			int i_40_ = i_37_ + i_36_ & 0xff;
			Class10.aClass410Array138[i].anInt5288 = (i_40_ + ((i_39_ << 14) + (i_38_ << 28))) * 1896571807;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("us.k(").append(')').toString());
		}
	}

	static void method6231(File file, byte[] is, int i, int i_42_) throws IOException {
		try {
			DataInputStream datainputstream = (new DataInputStream(new BufferedInputStream(new FileInputStream(file))));
			try {
				datainputstream.readFully(is, 0, i);
			} catch (EOFException eofexception) {
				/* empty */
			}
			datainputstream.close();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("us.a(").append(')').toString());
		}
	}
}
