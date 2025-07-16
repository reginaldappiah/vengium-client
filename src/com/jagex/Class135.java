package com.jagex;/* Class135 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.IOException;

public class Class135 implements Interface6 {
	Js5FileSystem aClass243_6381;
	Class165 aClass165_6382;
	SpriteToolkit aClass57_6383;

    Class135(Js5FileSystem class243, Class165 class165) {
		this.aClass243_6381 = class243;
		this.aClass165_6382 = class165;
	}

	public void method58(boolean bool, byte i) {
		try {
			if (bool) {
				int i_0_ = ((GameShell.canvasWidth * -2110394505 > GameClient.anInt8794 * 775068819) ? GameShell.canvasWidth * -2110394505 : 775068819 * GameClient.anInt8794);
				int i_1_ = ((GameShell.canvasHeight * -1111710645 > -791746413 * GameClient.anInt8803) ? GameShell.canvasHeight * -1111710645 : GameClient.anInt8803 * -791746413);
				int i_2_ = this.aClass57_6383.getPaddedWidth();
				int i_3_ = this.aClass57_6383.getPaddedHeight();
				int i_4_ = 0;
				int i_5_ = i_0_;
				int i_6_ = i_0_ * i_3_ / i_2_;
				int i_7_ = (i_1_ - i_6_) / 2;
				if (i_6_ > i_1_) {
					i_7_ = 0;
					i_6_ = i_1_;
					i_5_ = i_2_ * i_1_ / i_3_;
					i_4_ = (i_0_ - i_5_) / 2;
				}
				this.aClass57_6383.drawScaled(i_4_, i_7_, i_5_, i_6_);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fl.f(").append(')').toString());
		}
	}

	public boolean method52(int i) {
		try {
			return (this.aClass243_6381.exists(791455531 * this.aClass165_6382.anInt6365));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fl.b(").append(')').toString());
		}
	}

	public void method53() {
		try {
			this.aClass57_6383 = StaticMethods.method5663(this.aClass243_6381, (this.aClass165_6382.anInt6365) * 791455531);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fl.a(").append(')').toString());
		}
	}

	static final void method1490(IComponentDefinition class105, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime class403, int i) {
		try {
			class105.maxLines = (class403.integerStack[(class403.integerStackOffset -= -391880689) * 681479919]) * -1455284437;
			StaticMethods.updateComponentTick(class105);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fl.gc(").append(')').toString());
		}
	}

	static final void method1491(IComponentDefinition class105, ScriptRuntime class403, int i) {
		try {
			int i_15_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			int i_16_ = ((class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]) - 1);
			if (1548853569 * class105.modelType != 6)
				throw new RuntimeException("");
			NPCDefinition class503 = NPCDefinitionLoader.npcList.load(572201537 * class105.modelID);
			if (null == class105.aClass498_1307)
				class105.aClass498_1307 = new Class498(class503, true);
			class105.aClass498_1307.aLong6110 = StaticMethods.method4686() * 3177550440302969639L;
			if (i_16_ < 0 || i_16_ >= class503.modelIDs.length)
				throw new RuntimeException(new StringBuilder().append("").append(i_16_).toString());
			class105.aClass498_1307.anIntArray6108[i_16_] = i_15_;
			StaticMethods.updateComponentTick(class105);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fl.qt(").append(')').toString());
		}
	}

	static final void method1492(ScriptRuntime runtime) {
		try {
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (null != (Player.myPlayer.appearance) && (Player.myPlayer.appearance.male)) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fl.ud(").append(')').toString());
		}
	}

	static byte[] method1493(File file, int i) {
		try {
			byte[] is;
			try {
				byte[] is_18_ = new byte[i];
				ClassNotAnim.method6231(file, is_18_, i, 1833251010);
				is = is_18_;
			} catch (IOException ioexception) {
				return null;
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fl.f(").append(')').toString());
		}
	}

	static final void method1494(Entity entity, boolean bool) {
			int i_19_ = Class282.aClass282_6543.aByte6542;
			int i_20_ = 0;
			if (-412225079 * entity.anInt10095 > GameClient.clientTick * 443738891)
				Class124.method1389(entity);
			else if (entity.anInt10103 * 1450943713 >= GameClient.clientTick * 443738891)
				Class104.method1103(entity);
			else {
				StaticMethods.method4141(entity, bool);
				i_19_ = Region.anInt3565 * -2143152965;
				i_20_ = Class431.anInt6504 * 236175727;
			}
			Vector3f class217 = entity.getWorldTransform().trans;
			if ((int) class217.x < 512 || (int) class217.z < 512 || ((int) class217.x >= ((GameClient.myRegion.getMapWidth() - 1) * 512)) || ((int) class217.z >= ((GameClient.myRegion.getMapLength() - 1) * 512))) {
				entity.animator.load(-1);
				for (int i_21_ = 0; i_21_ < entity.currentGraphics.length; i_21_++) {
					entity.currentGraphics[i_21_].graphicID = -1313669563;
					entity.currentGraphics[i_21_].animator.load(-1);
				}
				entity.anIntArray10093 = null;
				entity.anInt10095 = 0;
				entity.anInt10103 = 0;
				i_19_ = Class282.aClass282_6543.aByte6542;
				i_20_ = 0;
				entity.method4341((float) (entity.scenePositionXQueue[0] * 512 + (entity.getSize() * 256)), class217.y, (float) (512 * entity.scenePositionYQueue[0] + (entity.getSize() * 256)));
				entity.method4419(229400295);
			}
			if ((Player.myPlayer == entity) && ((int) class217.x < 6144 || (int) class217.z < 6144 || ((int) class217.x >= (GameClient.myRegion.getMapWidth() - 12) * 512) || ((int) class217.z >= ((GameClient.myRegion.getMapLength() - 12) * 512)))) {
				entity.animator.load(-1);
				for (int i_22_ = 0; i_22_ < entity.currentGraphics.length; i_22_++) {
					entity.currentGraphics[i_22_].graphicID = -1313669563;
					entity.currentGraphics[i_22_].animator.load(-1);
				}
				entity.anIntArray10093 = null;
				entity.anInt10095 = 0;
				entity.anInt10103 = 0;
				i_19_ = Class282.aClass282_6543.aByte6542;
				i_20_ = 0;
				entity.method4341((float) (entity.scenePositionXQueue[0] * 512 + (entity.getSize() * 256)), class217.y, (float) (512 * entity.scenePositionYQueue[0] + (entity.getSize() * 256)));
				entity.method4419(1590910009);
			}
			int i_23_ = StaticMethods.method2525(entity, 1199726988);
			Class116.method1270(entity, -1145965611);
			Class298_Sub32_Sub36.method3373(entity, i_19_, i_20_, i_23_, -830154452);
			GameContext.method5575(entity, i_19_, 1842586894);
			Class473.method6068(entity, (byte) 27);
			Quaternion quaternion = Quaternion.method2019();
			quaternion.method2032(CircleAngleTable.toDegrees(entity.aClass386_10084.method4719((byte) 0)), CircleAngleTable.toDegrees(entity.aClass386_10111.method4719((byte) 0)), CircleAngleTable.toDegrees(entity.aClass386_10113.method4719((byte) 0)));
			entity.method4346(quaternion);
			quaternion.method2029();
	}
}
