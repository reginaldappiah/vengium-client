package com.jagex;/* Class298_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;

public class Class298_Sub9 extends Node {
	public static SoftCache cache;
	static LinkedList aClass437_7224 = new LinkedList(32);
	static int anInt7225;
	int[] anIntArray7226 = { -1 };
	int[] anIntArray7227 = { 0 };
	static int anInt7228;

	static {
		cache = new SoftCache(10);
	}

	Class298_Sub9() {
		/* empty */
	}

	final ModelToolkit method2891(GraphicsToolkit graphicsToolkit, int i, Animator animator, int i_0_, boolean male, PlayerAppearance playerAppearance) {
		try {
			ModelToolkit modelToolkit = null;
			int i_2_ = i;
			Class350 class350 = null;
			if (-1 != i_0_)
				class350 = Class94.aClass349_913.method4202(i_0_, (byte) 89);
			int[] itemIDs = this.anIntArray7226;
			if (null != class350 && null != class350.anIntArray3732) {
				itemIDs = new int[class350.anIntArray3732.length];
				for (int i_3_ = 0; i_3_ < class350.anIntArray3732.length; i_3_++) {
					int i_4_ = class350.anIntArray3732[i_3_];
					if (i_4_ >= 0 && i_4_ < this.anIntArray7226.length)
						itemIDs[i_3_] = this.anIntArray7226[i_4_];
					else
						itemIDs[i_3_] = -1;
				}
			}
			if (animator != null)
				i_2_ |= animator.getAnimationFlag();
			long l = method2892(itemIDs, i_0_, null != playerAppearance ? playerAppearance.bodyColors : null, male);
			if (cache != null)
				modelToolkit = (ModelToolkit) cache.get(l);
			if (null == modelToolkit || graphicsToolkit.method5017(modelToolkit.m(), i_2_) != 0) {
				if (modelToolkit != null)
					i_2_ = graphicsToolkit.method5004(i_2_, modelToolkit.m());
				int i_5_ = i_2_;
				boolean bool_6_ = false;
				for (int index = 0; index < itemIDs.length; index++) {
					if (itemIDs[index] == -1) {

					} else if (!Js5Configs.itemList.getItemDefinitions(itemIDs[index]).method6034(male, null))
						bool_6_ = true;
				}
				if (bool_6_)
					return null;
				BaseModel[] itemModels = new BaseModel[itemIDs.length];
				for (int index = 0; index < itemIDs.length; index++) {
					if (itemIDs[index] == -1) {

					} else
						itemModels[index] = Js5Configs.itemList.getItemDefinitions(itemIDs[index]).method6028(male, null);
				}
				if (class350 != null && null != class350.anIntArrayArray3710) {
					for (int index = 0; index < class350.anIntArrayArray3710.length; index++) {
						if (class350.anIntArrayArray3710[index] != null) {
							if (null == itemModels[index]) {

							} else {
								int i_10_ = class350.anIntArrayArray3710[index][0];
								int i_11_ = class350.anIntArrayArray3710[index][1];
								int i_12_ = class350.anIntArrayArray3710[index][2];
								int i_13_ = class350.anIntArrayArray3710[index][3];
								int i_14_ = class350.anIntArrayArray3710[index][4];
								int i_15_ = class350.anIntArrayArray3710[index][5];
								if (i_13_ != 0 || i_14_ != 0 || i_15_ != 0)
									itemModels[index].method754(i_13_, i_14_, i_15_);
								if (i_10_ != 0 || 0 != i_11_ || 0 != i_12_)
									itemModels[index].translate(i_10_, i_11_, i_12_);
							}
						}
					}
				}
				BaseModel class64 = new BaseModel(itemModels, itemModels.length);
				if (null != playerAppearance)
					i_5_ |= 0x4000;
				modelToolkit = graphicsToolkit.creatModelToolkit(class64, i_5_, anInt7225 * 1310831989, 66, 850);
				if (playerAppearance != null) {
					for (int index = 0; index < 10; index++) {
						for (int i_17_ = 0; (i_17_ < PlayerAppearance.originalBodyColours[index].length); i_17_++) {
							if (playerAppearance.bodyColors[index] < (PlayerAppearance.replacementBodyColors[index][i_17_]).length)
								modelToolkit.X((PlayerAppearance.originalBodyColours[index][i_17_]), (PlayerAppearance.replacementBodyColors[index][i_17_][playerAppearance.bodyColors[index]]));
						}
					}
				}
				if (null != cache) {
					modelToolkit.KA(i_2_);
					cache.put(modelToolkit, l);
				}
			}
			if (animator == null)
				return modelToolkit;
			ModelToolkit class387_18_ = modelToolkit.method4755((byte) 1, i_2_, true);
			animator.animate(class387_18_, 0);
			return class387_18_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aam.n(").append(')').toString());
		}
	}

	long method2892(int[] is, int i, int[] is_19_, boolean bool) {
		try {
			long[] ls = Buffer.CRC_64;
			long l = -1L;
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (i >> 8)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) i) & 0xffL)];
			for (int i_21_ = 0; i_21_ < is.length; i_21_++) {
				l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_21_] >> 24)) & 0xffL)];
				l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_21_] >> 16)) & 0xffL)];
				l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_21_] >> 8)) & 0xffL)];
				l = l >>> 8 ^ ls[(int) ((l ^ (long) is[i_21_]) & 0xffL)];
			}
			if (null != is_19_) {
				for (int i_22_ = 0; i_22_ < 5; i_22_++)
					l = l >>> 8 ^ ls[(int) ((l ^ (long) is_19_[i_22_]) & 0xffL)];
			}
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (bool ? 1 : 0)) & 0xffL)];
			return l;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aam.q(").append(')').toString());
		}
	}

	static void decode(Buffer buffer) {
		try {
			for (int index = 0; index < 1017276543 * Class24.anInt9950; index++) {
				int i_24_ = buffer.readUnsignedSmart();
				int i_25_ = buffer.readUShort();
				if (i_25_ == 65535)
					i_25_ = -1;
				if (null != Class131.aClass343_Sub1Array1498[i_24_])
					Class131.aClass343_Sub1Array1498[i_24_].anInt3666 = i_25_ * 2083476291;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aam.p(").append(')').toString());
		}
	}
}
