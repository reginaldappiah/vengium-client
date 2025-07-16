package com.jagex;/* Class431 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;
import com.jagex.game.cache.definition.animation.AnimationDefinition;
import com.jagex.utils.CameraUtils;

public class Class431 implements Interface15 {
	public static int anInt6502;
	GraphicsToolkit aClass_ra6503;
	static int anInt6504;

	Class431() {
		/* empty */
	}

	public Object method215(int[] is, int i, int i_0_, int i_1_, int i_2_, boolean bool) {
		return this.aClass_ra6503.bu(is, i, i_0_, i_1_, i_2_, false);
	}

	public Object method212(int[] is, int i, int i_3_, int i_4_, int i_5_, boolean bool) {
		return this.aClass_ra6503.bu(is, i, i_3_, i_4_, i_5_, false);
	}

	public Object method214(int[] is, int i, int i_6_, int i_7_, int i_8_, boolean bool, int i_9_) {
		try {
			return this.aClass_ra6503.bu(is, i, i_6_, i_7_, i_8_, false);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rv.a(").append(')').toString());
		}
	}

	public Object method213(int[] is, int i, int i_10_, int i_11_, int i_12_, boolean bool) {
		return this.aClass_ra6503.bu(is, i, i_10_, i_11_, i_12_, false);
	}

	public static boolean method5763(byte[] data) {
		try {
			Buffer buffer = new Buffer(data);
			int i_13_ = buffer.readUByte();
			if (i_13_ != 2)
				return false;
			boolean bool = buffer.readUByte() == 1;
			if (bool)
				StaticMethods.method372(buffer);
			Class298_Sub9.decode(buffer);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rv.f(").append(')').toString());
		}
	}

	public static boolean method5764(char c) {
		try {
			return c >= '0' && c <= '9';
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rv.z(").append(')').toString());
		}
	}

	static final void method5765(ScriptRuntime class403, int i) {
		try {
			int i_14_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			boolean bool = true;
			if (i_14_ < 0)
				bool = 0 == (i_14_ + 1) % 4;
			else if (i_14_ < 1582)
				bool = 0 == i_14_ % 4;
			else if (i_14_ % 4 != 0)
				bool = false;
			else if (0 != i_14_ % 100)
				bool = true;
			else if (i_14_ % 400 != 0)
				bool = false;
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = bool ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rv.aky(").append(')').toString());
		}
	}

	static void method5766() {
		try {
			Class360.activeConnection.dropFrames();
			Class360.activeConnection.bitsBuffer.offset = 0;
			Class360.activeConnection.INCOMMING_PACKET = null;
			Class360.activeConnection.aClass202_344 = null;
			Class360.activeConnection.aClass202_345 = null;
			Class360.activeConnection.aClass202_348 = null;
			Class360.activeConnection.population = 0;
			Class360.activeConnection.anInt338 = 0;
			GameClient.shutdownDelay = 0;
			StaticMethods.method5905();
			Class271.method2547(385051775);
			for (int i_15_ = 0; i_15_ < 2048; i_15_++)
				GameClient.entities[i_15_] = null;
			Player.myPlayer = null;
			for (int i_16_ = 0; i_16_ < 1962237353 * GameClient.anInt8772; i_16_++) {
				Entity class365_sub1_sub1_sub2 = ((Entity) GameClient.aClass298_Sub29Array8816[i_16_].nodeObject);
				if (class365_sub1_sub1_sub2 != null)
					class365_sub1_sub1_sub2.setNextFaceEntity = -283914955;
			}
			Class418.method5601((byte) -61);
			CameraUtils.cameraType = 1355934404;
			Class418.anInt5339 = -1001372047;
			Class100.anInt1081 = 178575833;
			Class439.loadGameState(0);
			for (int i_17_ = 0; i_17_ < 113; i_17_++)
				GameClient.aBooleanArray8900[i_17_] = true;
			StaticMethods.method3974();
			StaticMethods.aClass396_6291 = null;
			Class365_Sub1_Sub2_Sub1.aLong9911 = 0L;
			StaticMethods.resetCutscene();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rv.ae(").append(')').toString());
		}
	}

	public static void method5767(int i, Js5FileSystem fileSystem, int i_18_, int i_19_, int i_20_, boolean bool, int i_21_) {
		try {
			Class79.anInt734 = -1262101671;
			Class79.JS5_MUSIC = fileSystem;
			Class79.anInt745 = -407545223 * i_18_;
			Class79.anInt746 = -956029523 * i_19_;
			Class79.aClass298_Sub19_Sub1_748 = null;
			Class79.anInt739 = i_20_ * -2102749749;
			Class8.aBoolean114 = bool;
			Class298_Sub24_Sub1.anInt9276 = 771950311 * i;
			Class313.aClass97_3300 = null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rv.r(").append(')').toString());
		}
	}

	public static void method5768(Entity entity, int[] is, int i, boolean bool) {
		try {
			if (null != entity.anIntArray10093) {
				boolean bool_23_ = true;
				for (int i_24_ = 0; i_24_ < entity.anIntArray10093.length; i_24_++) {
					if (is[i_24_] != entity.anIntArray10093[i_24_]) {
						bool_23_ = false;
						break;
					}
				}
				Animator animator = entity.animator;
				if (bool_23_ && animator.hasAnimationDefinition()) {
					AnimationDefinition class391 = entity.animator.getAnimationDefinition();
					int i_25_ = class391.resetType * -1117238071;
					if (1 == i_25_)
						animator.method5835(i);
					if (i_25_ == 2)
						animator.method5842();
				}
			}
			boolean bool_26_ = true;
			for (int i_27_ = 0; i_27_ < is.length; i_27_++) {
				if (is[i_27_] != -1)
					bool_26_ = false;
				if (null == entity.anIntArray10093 || -1 == entity.anIntArray10093[i_27_] || ((Js5Configs.animsList.get(is[i_27_]).priority) * -1445588039 >= (Js5Configs.animsList.get(entity.anIntArray10093[i_27_]).priority) * -1445588039)) {
					entity.anIntArray10093 = is;
					entity.animator.method5828(i);
					if (bool)
						entity.anInt10125 = entity.anInt10120 * -526956429;
				}
			}
			if (bool_26_) {
				entity.anIntArray10093 = is;
				entity.animator.method5828(i);
				if (bool)
					entity.anInt10125 = -526956429 * entity.anInt10120;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rv.ke(").append(')').toString());
		}
	}
}
