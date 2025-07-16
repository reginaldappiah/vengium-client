package com.jagex;/* Class148 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.TimeUtils;

import java.awt.*;
import java.awt.Graphics;

public class Class148 implements Interface23 {
	LinkedList aClass437_6647 = new LinkedList(128);
	static int[] anIntArray6650 = new int[32];
	int[] anIntArray6652 = new int[-1085917127 * Class440.aClass205_5582.anInt2339];
	public int[] configs = new int[-1085917127 * Class440.aClass205_5582.anInt2339];

	public int method252(int i) {
		try {
			return configs[i];
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("g.d(").append(')').toString());
		}
	}

	void setConfigByFileValue(int configID, int i_1_) {
			ConfigDefinitions configDefinitions = Class472.configLoader.getConfigDefinitions(configID);
			int realConfigID = configDefinitions.realConfigID * -50358139;
			int startingBit = configDefinitions.startingBit * -1528472107;
			int endingBit = configDefinitions.endingBit * 1394539663;
			int i_6_ = anIntArray6650[endingBit - startingBit];
			if (i_1_ < 0 || i_1_ > i_6_)
				i_1_ = 0;
			i_6_ <<= startingBit;
			method1605(realConfigID, (this.anIntArray6652[realConfigID] & (i_6_ ^ 0xffffffff) | i_1_ << startingBit & i_6_));
	}

	void method1603(int i) {
		try {
			for (int i_7_ = 0; i_7_ < Class440.aClass205_5582.anInt2339 * -1085917127; i_7_++) {
				this.anIntArray6652[i_7_] = 0;
				configs[i_7_] = 0;
			}
			this.aClass437_6647 = new LinkedList(128);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("g.f(").append(')').toString());
		}
	}

	public void method1604(int i, int i_8_) {
		try {
			configs[i] = i_8_;
			Class298_Sub33 class298_sub33 = ((Class298_Sub33) this.aClass437_6647.get((long) i));
			if (null != class298_sub33)
				class298_sub33.aLong7385 = (TimeUtils.getTime() + 500L) * 2132790236050020951L;
			else {
				class298_sub33 = new Class298_Sub33(TimeUtils.getTime() + 500L);
				this.aClass437_6647.connect(class298_sub33, (long) i);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("g.b(").append(')').toString());
		}
	}

	void method1605(int i, int i_10_) {
		try {
			this.anIntArray6652[i] = i_10_;
			Class298_Sub33 class298_sub33 = ((Class298_Sub33) this.aClass437_6647.get((long) i));
			if (null != class298_sub33) {
				if (4611686018427387905L != class298_sub33.aLong7385 * -959724544626478745L)
					class298_sub33.aLong7385 = (TimeUtils.getTime() + 500L | 0x4000000000000000L) * 2132790236050020951L;
			} else {
				class298_sub33 = new Class298_Sub33(4611686018427387905L);
				this.aClass437_6647.connect(class298_sub33, (long) i);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("g.p(").append(')').toString());
		}
	}

	public void setBitconfigValue(int i, int i_12_, int i_13_) {
		try {
			ConfigDefinitions config = Class472.configLoader.getConfigDefinitions(i);
			int realConfig = config.realConfigID * -50358139;
			int startingBit = config.startingBit * -1528472107;
			int endingBit = 1394539663 * config.endingBit;
			int i_17_ = anIntArray6650[endingBit - startingBit];
			if (i_12_ < 0 || i_12_ > i_17_)
				i_12_ = 0;
			i_17_ <<= startingBit;
			method1604(realConfig, (configs[realConfig] & (i_17_ ^ 0xffffffff) | i_12_ << startingBit & i_17_));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("g.i(").append(')').toString());
		}
	}

	public int method250(int i) {
		try {
			ConfigDefinitions class327 = Class472.configLoader.getConfigDefinitions(i);
			int i_19_ = class327.realConfigID * -50358139;
			int i_20_ = -1528472107 * class327.startingBit;
			int i_21_ = class327.endingBit * 1394539663;
			int i_22_ = anIntArray6650[i_21_ - i_20_];
			return configs[i_19_] >> i_20_ & i_22_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("g.u(").append(')').toString());
		}
	}

	static {
		int i = 2;
		for (int i_23_ = 0; i_23_ < 32; i_23_++) {
			anIntArray6650[i_23_] = i - 1;
			i += i;
		}
	}

	int nextChangedVar(boolean bool, int i) {
		try {
			long l = TimeUtils.getTime();
			for (Class298_Sub33 class298_sub33 = (Class298_Sub33) (bool ? this.aClass437_6647.method5816() : this.aClass437_6647.method5815()); class298_sub33 != null; class298_sub33 = (Class298_Sub33) this.aClass437_6647.method5815()) {
				if ((class298_sub33.aLong7385 * -959724544626478745L & 0x3fffffffffffffffL) < l) {
					if ((-959724544626478745L * class298_sub33.aLong7385 & 0x4000000000000000L) != 0L) {
						int i_24_ = (int) (7051297995265073167L * class298_sub33.key);
						configs[i_24_] = this.anIntArray6652[i_24_];
						class298_sub33.unlink();
						return i_24_;
					}
					class298_sub33.unlink();
				}
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("g.a(").append(')').toString());
		}
	}

	static final void method1608(ScriptRuntime class403, byte i) {
		try {
			int i_29_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_29_);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[i_29_ >> 16];
			Class372_Sub3.method4602(class105, IComponentDefinitionCollection, class403, 2065875065);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("g.hc(").append(')').toString());
		}
	}

	static final void method1609(ScriptRuntime class403, byte i) {
		try {
			int i_30_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_30_);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[i_30_ >> 16];
			Class308_Sub1.method3786(class105, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("g.ko(").append(')').toString());
		}
	}

	static final void method1610(ScriptRuntime class403, byte i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.offiliateId * -1154804873;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("g.uy(").append(')').toString());
		}
	}

	static final void method1611(ScriptRuntime runtime) {
		try {
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.aBoolean8680 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("g.ahy(").append(')').toString());
		}
	}

	public static void method1612(int i) {
		try {
			if (i < 0 || i > 2)
				i = 0;
			Class344.anInt3675 = i * 741965445;
			Class344.aParticleSystemArray3679 = new ParticleSystem[1 + (Class65.anIntArray658[Class344.anInt3675 * 1197525581])];
			Class344.anInt3680 = 0;
			Class344.anInt3681 = 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("g.i(").append(')').toString());
		}
	}

	static final void method1613(ScriptRuntime runtime) {
		try {
			runtime.integerStackOffset -= -783761378;
			int i_32_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
			int i_33_ = (runtime.integerStack[681479919 * runtime.integerStackOffset + 1]);
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = ItemDefinition.method2845(i_32_, i_33_, false, false);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("g.ul(").append(')').toString());
		}
	}

	public static void clearAWT() {
			if (null == GameClient.fullScreenFrame) {
				int width = 1898544019 * GameClient.leftMargin;
				int height = 540368727 * GameClient.topMargin;
				int i_36_ = (GameClient.frameWidth * -639974669 - GameShell.canvasWidth * -2110394505 - width);
				int i_37_ = (1282634425 * GameClient.frameHeight - -1111710645 * GameShell.canvasHeight - height);
				if (width > 0 || i_36_ > 0 || height > 0 || i_37_ > 0) {
					try {
						Container container = StaticMethods.getParent();
						int leftInset = 0;
						int topInset = 0;
						if (container == GameClient.windowFrame) {
							Insets insets = GameClient.windowFrame.getInsets();
							leftInset = insets.left;
							topInset = insets.top;
						}
						Graphics graphics = container.getGraphics();
						graphics.setColor(Color.black);
						if (width > 0)
							graphics.fillRect(leftInset, topInset, width, GameClient.frameHeight * 1282634425);
						if (height > 0)
							graphics.fillRect(leftInset, topInset, -639974669 * GameClient.frameWidth, height);
						if (i_36_ > 0)
							graphics.fillRect((leftInset + GameClient.frameWidth * -639974669 - i_36_), topInset, i_36_, GameClient.frameHeight * 1282634425);
						if (i_37_ > 0)
							graphics.fillRect(leftInset, (GameClient.frameHeight * 1282634425 + topInset - i_37_), -639974669 * GameClient.frameWidth, i_37_);
					} catch (Exception exception) {
						/* empty */
					}
				}
			}
	}

	static final void method1615(ScriptRuntime runtime) {
			int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
			ToMoveIComponentScripts.setIComponentHiddenInstruction(componentDefinition, IComponentDefinitionCollection, runtime);
	}

}
