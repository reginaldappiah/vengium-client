package com.jagex;/* Class321 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;
import com.jagex.utils.TimeUtils;

public class Class321 {
	int anInt3327;
	int anInt3334;
	public Light light;
	public int anInt3345;
	boolean aBoolean3347;
	boolean aBoolean3348;
	short[] aShortArray3350;
	public int anInt3351;
	int anInt3352;
	int anInt3353;
	int anInt3354;

	void method3915() {
		try {
			switch (anInt3351 * 589172669) {
			case 13:
				this.anInt3334 = -2012607286;
				this.anInt3327 = 0;
				this.anInt3352 = 399235072;
				this.anInt3353 = -1108516864;
				break;
			case 4:
				this.anInt3334 = 269752724;
				this.anInt3327 = 0;
				this.anInt3352 = 399235072;
				this.anInt3353 = 1870354432;
				break;
			case 15:
				this.anInt3334 = 1141180005;
				this.anInt3327 = -1783300608;
				this.anInt3352 = 1173550592;
				this.anInt3353 = -554258432;
				break;
			case 16:
				this.anInt3334 = 1141180005;
				this.anInt3327 = -2080517376;
				this.anInt3352 = 586775296;
				this.anInt3353 = -1108516864;
				break;
			case 12:
				this.anInt3334 = -2012607286;
				this.anInt3327 = 0;
				this.anInt3352 = 399235072;
				this.anInt3353 = 1870354432;
				break;
			case 2:
				this.anInt3334 = 1141180005;
				this.anInt3327 = 0;
				this.anInt3352 = 399235072;
				this.anInt3353 = 1870354432;
				break;
			case 14:
				this.anInt3334 = 1141180005;
				this.anInt3327 = -1486083840;
				this.anInt3352 = 1760325888;
				this.anInt3353 = 1870354432;
				break;
			case 11:
				this.anInt3334 = -871427281;
				this.anInt3327 = -1783300608;
				this.anInt3352 = 1173550592;
				this.anInt3353 = -554258432;
				break;
			case 7:
				this.anInt3334 = -871427281;
				this.anInt3327 = -1486083840;
				this.anInt3352 = 1760325888;
				this.anInt3353 = -554258432;
				break;
			case 5:
				this.anInt3334 = 269752724;
				this.anInt3327 = 0;
				this.anInt3352 = 399235072;
				this.anInt3353 = -1108516864;
				break;
			default:
				this.anInt3327 = 0;
				this.anInt3334 = 0;
				this.anInt3352 = 399235072;
				this.anInt3353 = 1870354432;
				break;
			case 6:
				this.anInt3334 = -871427281;
				this.anInt3327 = -1486083840;
				this.anInt3352 = 1760325888;
				this.anInt3353 = 1870354432;
				break;
			case 3:
				this.anInt3334 = 1141180005;
				this.anInt3327 = 0;
				this.anInt3352 = 399235072;
				this.anInt3353 = -554258432;
				break;
			case 8:
				this.anInt3334 = -871427281;
				this.anInt3327 = -1188867072;
				this.anInt3352 = -1947866112;
				this.anInt3353 = 1870354432;
				break;
			case 9:
				this.anInt3334 = -871427281;
				this.anInt3327 = -1188867072;
				this.anInt3352 = -1947866112;
				this.anInt3353 = -554258432;
				break;
			case 10:
				this.anInt3334 = -871427281;
				this.anInt3327 = -1783300608;
				this.anInt3352 = 1173550592;
				this.anInt3353 = 1870354432;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nj.b(").append(')').toString());
		}
	}

	void method3916(GraphicsToolkit graphicsToolkit, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		try {
			light = graphicsToolkit.createLight(i, i_0_, i_1_, i_2_, i_3_, 1.0F);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nj.a(").append(')').toString());
		}
	}

	public void method3917(int i, int i_5_, int i_6_, int i_7_) {
		try {
			this.anInt3334 = 1141180005 * i;
			this.anInt3327 = i_7_ * -2098313003;
			this.anInt3352 = -282920581 * i_6_;
			this.anInt3353 = i_5_ * -212996245;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nj.f(").append(')').toString());
		}
	}

	void method3918(int clientTick, boolean flickeringEffects) {
		try {
			int i_10_;
			if (!flickeringEffects) {
				int i_11_ = ((this.anInt3354 * 240739725 + clientTick * (-195574461 * this.anInt3353) / 50) & 0x7ff);
				switch (this.anInt3334 * -936952979) {
				case 5:
					i_10_ = (i_11_ < 1024 ? i_11_ : 2048 - i_11_) << 1;
					break;
				case 1:
					i_10_ = 1024 + (CircleAngleTable.SINE[i_11_ << 3] >> 4);
					break;
				case 2:
					i_10_ = i_11_;
					break;
				default:
					i_10_ = 2048;
					break;
				case 4:
					i_10_ = i_11_ >> 10 << 11;
					break;
				case 3:
					i_10_ = Class121.anIntArray6321[i_11_] >> 1;
				}
			} else
				i_10_ = 2048;
			light.method2896(((float) ((-1796735565 * this.anInt3352 * i_10_ >> 11) + this.anInt3327 * -884690819) / 2048.0F), (byte) 3);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nj.p(").append(')').toString());
		}
	}

	public Class321(GraphicsToolkit toolkit, int i, Buffer buffer, int shift) {
		if (null == Class121.anIntArray6321)
			StaticMethods.method534();
		anInt3345 = buffer.readUByte() * 657475255;
		this.aBoolean3347 = (-1565952249 * anInt3345 & 0x8) != 0;
		this.aBoolean3348 = 0 != (anInt3345 * -1565952249 & 0x10);
		anInt3345 = 657475255 * (anInt3345 * -1565952249 & 0x7);
		int i_13_ = buffer.readUShort() << shift;
		int i_14_ = buffer.readUShort() << shift;
		int i_15_ = buffer.readUShort() << shift;
		int i_16_ = buffer.readUByte();
		int i_17_ = 1 + i_16_ * 2;
		this.aShortArray3350 = new short[i_17_];
		for (int i_18_ = 0; i_18_ < this.aShortArray3350.length; i_18_++) {
			int i_19_ = (short) buffer.readUShort();
			int i_20_ = i_19_ >>> 8;
			int i_21_ = i_19_ & 0xff;
			if (i_20_ >= i_17_)
				i_20_ = i_17_ - 1;
			if (i_21_ > i_17_ - i_20_)
				i_21_ = i_17_ - i_20_;
			this.aShortArray3350[i_18_] = (short) (i_20_ << 8 | i_21_);
		}
		i_16_ = (1 << i >> 1) + (i_16_ << i);
		int i_22_ = (Class294.anIntArray3165 != null ? (Class294.anIntArray3165[buffer.readUShort()]) : (Class379.anIntArray4096[Class173.method1823(buffer.readUShort()) & 0xffff]));
		int i_23_ = buffer.readUByte();
		anInt3351 = (i_23_ & 0x1f) * 1902257045;
		this.anInt3354 = 1492346181 * ((i_23_ & 0xe0) << 3);
		if (31 != 589172669 * anInt3351)
			method3915();
		method3916(toolkit, i_13_, i_15_, i_14_, i_16_, i_22_);
	}

	static final void method3919(ScriptRuntime runtime, int i) {
		try {
			int i_24_ = runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919];
			if (null != GameClient.aString8804 && i_24_ < -1801543887 * Class489.anInt6071)
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = (-1071570519 * StaticMethods.aClass7Array6846[i_24_].anInt95);
			else
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nj.wd(").append(')').toString());
		}
	}

	static final void method3920(ScriptRuntime runtime) {
		try {
			String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
			StaticMethods.method4922(string);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nj.wm(").append(')').toString());
		}
	}

	static final void method3921(ScriptRuntime runtime) {
		try {
			runtime.objectArgs -= 1938723502;
			String string = (String) (runtime.objectStack[-203050393 * runtime.objectArgs]);
			String string_25_ = ((String) (runtime.objectStack[-203050393 * runtime.objectArgs + 1]));
			runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = new StringBuilder().append(string).append(string_25_).toString();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nj.zt(").append(')').toString());
		}
	}

	static final void method3922(ScriptRuntime runtime) {
		try {
			runtime.integerStackOffset -= -783761378;
			int i_26_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
			int i_27_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]);
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = Class77.method841(i_26_, i_27_, (byte) -125) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nj.afa(").append(')').toString());
		}
	}

	static String method3923(int i, int i_28_, boolean bool) {
		try {
			if (i_28_ < 2 || i_28_ > 36)
				throw new IllegalArgumentException(new StringBuilder().append("").append(i_28_).toString());
			if (!bool || i < 0)
				return Integer.toString(i, i_28_);
			int i_30_ = 2;
			int i_31_ = i / i_28_;
			while (0 != i_31_) {
				i_31_ /= i_28_;
				i_30_++;
			}
			char[] cs = new char[i_30_];
			cs[0] = '+';
			for (int i_32_ = i_30_ - 1; i_32_ > 0; i_32_--) {
				int i_33_ = i;
				i /= i_28_;
				int i_34_ = i_33_ - i * i_28_;
				if (i_34_ >= 10)
					cs[i_32_] = (char) (i_34_ + 87);
				else
					cs[i_32_] = (char) (i_34_ + 48);
			}
			return new String(cs);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nj.posX(").append(')').toString());
		}
	}

	static final void method3924(ScriptRuntime runtime) {
		try {
			if (AwtKeyboard.keyboard.held(82))
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 1;
			else
				runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nj.ady(").append(')').toString());
		}
	}

	static final void method3925(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
		try {
			runtime.integerStackOffset -= -783761378;
			componentDefinition.anInt1241 = (runtime.integerStack[681479919 * runtime.integerStackOffset]) * 381202251;
			componentDefinition.anInt1252 = (-283274507 * (runtime.integerStack[1 + runtime.integerStackOffset * 681479919]));
			StaticMethods.updateComponentTick(componentDefinition);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nj.iy(").append(')').toString());
		}
	}

	static final void method3926(int i, int i_35_, int i_36_, int i_37_, int i_38_) {
		try {
			if (i_36_ >= Class372_Sub2.anInt4049 * 1155384281 && i_36_ <= Class372_Sub2.anInt4050 * -1062447355) {
				i = StaticMethods.method6012(i, -1424479739 * Class372_Sub2.anInt4051, 1135094847 * Class372_Sub2.anInt4048);
				i_35_ = StaticMethods.method6012(i_35_, (Class372_Sub2.anInt4051 * -1424479739), Class372_Sub2.anInt4048 * 1135094847);
				Class474.method6072(i, i_35_, i_36_, i_37_, 181729650);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nj.q(").append(')').toString());
		}
	}

	public static void method3927() {
		try {
			StaticMethods.method1910();
			StaticMethods.method2365();
			Class141.method1561(-507349147);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nj.k(").append(')').toString());
		}
	}

	static void memoryManage(int commandOpcode) {
		try {
			if (20 == commandOpcode)
				throw new Error();
			if (26 == commandOpcode)
				throw new OutOfMemoryError();
			try {
				if (commandOpcode == 1)
					Heap.method3673();
				else if (commandOpcode == 5)
					StaticMethods.sendConsoleMessage(new StringBuilder().append("").append(914379507 * GameShell.fps).toString());
				else if (commandOpcode == 24) {
					Class333 class333 = (GameClient.myRegion.getRegion().aClass333_3512);
					class333.aBoolean3583 = !class333.aBoolean3583;
				} else if (commandOpcode == 8)
					GameClient.viewingFPS = true;
				else if (27 == commandOpcode)
					GameClient.viewingFPS = false;
				else if (commandOpcode == 22)
					GameClient.aClass442_8650.method5869(355993737);
				else if (16 == commandOpcode) {
					StaticMethods.sweepDefinitions();
					for (int i_40_ = 0; i_40_ < 10; i_40_++)
						System.gc();
					Runtime runtime = Runtime.getRuntime();
					int i_41_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
					StaticMethods.sendConsoleMessage(new StringBuilder().append("").append(i_41_).toString());
				} else if (10 == commandOpcode) {
					StaticMethods.sweepDefinitions();
					for (int i_42_ = 0; i_42_ < 10; i_42_++)
						System.gc();
					Runtime runtime = Runtime.getRuntime();
					int i_43_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
					StaticMethods.sendConsoleMessage(new StringBuilder().append("").append(i_43_).toString());
					Class234.method2183();
					StaticMethods.sweepDefinitions();
					for (int i_44_ = 0; i_44_ < 10; i_44_++)
						System.gc();
					i_43_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
					StaticMethods.sendConsoleMessage(new StringBuilder().append("").append(i_43_).toString());
				} else if (15 == commandOpcode)
					StaticMethods.sendConsoleMessage((JS5NativeManager.nativeManager.destroy() ? "Success" : "Failure"));
				else if (2 == commandOpcode)
					Class474.activeConnectionInfo.method6058();
				else if (commandOpcode == 14)
					PaddedResourceWorker.protocol.close();
				else if (13 == commandOpcode)
					PaddedResourceWorker.protocol.method2345((byte) 0);
				else if (4 == commandOpcode)
					DirectXContext.canvas.setLocation(50, 50);
				else if (commandOpcode == 25)
					DirectXContext.canvas.setLocation(1898544019 * GameShell.leftMargin, 540368727 * GameShell.topMargin);
				else if (commandOpcode == 23)
					StaticMethods.method4403();
				else if (21 == commandOpcode) {
					GameClient.myRegion.aLong3045 = TimeUtils.getTime() * 3385627052850178407L;
					GameClient.myRegion.aBoolean3008 = true;
					StaticMethods.method4403();
				} else if (29 == commandOpcode) {
					Vector3f class217 = (Player.myPlayer.getWorldTransform().trans);
					StaticMethods.sendConsoleMessage(new StringBuilder().append((int) class217.x >> 9).append(" ").append((int) class217.z >> 9).toString());
				} else if (commandOpcode == 7) {
					Vector3f class217 = (Player.myPlayer.getWorldTransform().trans);
					StaticMethods.sendConsoleMessage(new StringBuilder().append("").append(GameClient.myRegion.getRegion().aClass_xaArray3517[(Player.myPlayer.plane)].method6341((int) class217.x >> 9, (int) class217.z >> 9)).toString());
				} else if (commandOpcode == 3) {
					StaticMethods.sendConsoleMessage(new StringBuilder().append(IComponentDefinition.spriteCache.getCapacity()).append(" ").append(IComponentDefinition.spriteCache.getDefaultCapacity()).toString());
					StaticMethods.sendConsoleMessage(new StringBuilder().append(IComponentDefinition.modelsCache.getCapacity()).append(" ").append(IComponentDefinition.modelsCache.getDefaultCapacity()).toString());
					StaticMethods.sendConsoleMessage(new StringBuilder().append(Js5Configs.itemList.aClass340_5995.method4135()).append(" ").append(Js5Configs.itemList.aClass340_5995.method4133()).toString());
				} else if (commandOpcode == 6)
					JS5FileSystemLoader.method2082(false);
				else if (commandOpcode == 17) {
					GameClient.aBoolean8668 = !GameClient.aBoolean8668;
					GameClient.activeGraphicsToolkit.method5061(GameClient.aBoolean8668);
				} else if (11 == commandOpcode) {
					GameClient.anInt8814 = 0;
					GameClient.myRegion.method2667();
				} else if (9 == commandOpcode) {
					GameClient.anInt8814 = 1482609571;
					GameClient.myRegion.method2667();
				} else if (28 == commandOpcode) {
					GameClient.anInt8814 = -1329748154;
					GameClient.myRegion.method2667();
				}
			} catch (Exception exception) {
				StaticMethods.sendConsoleMessage(Tradution.ERROR_EXECUTING_COMMAND.translate(GameLanguage.CURRENT_LANGUAGE));
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nj.h(").append(')').toString());
		}
	}
}
