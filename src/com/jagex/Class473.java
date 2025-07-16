package com.jagex;/* Class473 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.definition.animation.AnimationDefinition;

public class Class473 {
	public char symbol;
	public int anInt5969 = -194719339;

	Class473() {
		/* empty */
	}

	void decoode(Buffer buffer, int opcode) {
			if (opcode == 1)
				symbol = Class485.keyCodeToSymbol(buffer.readByte());
			else if (opcode == 2)
				anInt5969 = 0;
	}

	void readValueLoop(Buffer buffer) {
			for (;;) {
				int opcode = buffer.readUByte();
				if (opcode == 0) {
					break;
				}
				decoode(buffer, opcode);
			}
	}

	static final void method6068(Entity entity, byte i) {
		try {
			Animator animator = entity.aAnimator_10077;
			if (animator.hasAnimationDefinition() && animator.method5981(1) && animator.method5978()) {
				if (entity.aBoolean10094) {
					animator.method5841(entity.method4426().getKey(), false, true, (byte) 71);
					entity.aBoolean10094 = animator.hasAnimationDefinition();
				}
				animator.method5979();
			}
			for (int i_2_ = 0; i_2_ < entity.currentGraphics.length; i_2_++) {
				if (-1 != -967533709 * (entity.currentGraphics[i_2_].graphicID)) {
					Animator animator_3_ = (entity.currentGraphics[i_2_].animator);
					if (animator_3_.method5826()) {
						SpotType class398 = (SpotTypeLoader.loader.get((entity.currentGraphics[i_2_].graphicID) * -967533709));
						AnimationDefinition class391 = animator_3_.getAnimationDefinition();
						if (class398.aBoolean5215) {
							if (3 == class391.animatingPrecedence * 62820525) {
								if ((1888275831 * entity.anInt10125) > 0 && ((entity.anInt10095 * -412225079) <= GameClient.clientTick * 443738891) && ((1450943713 * entity.anInt10103) < 443738891 * GameClient.clientTick)) {
									animator_3_.load(-1);
									entity.currentGraphics[i_2_].graphicID = -1313669563;
									continue;
								}
							} else if (1 == class391.animatingPrecedence * 62820525 && (entity.anInt10125 * 1888275831) > 0 && ((-412225079 * (entity.anInt10095)) <= 443738891 * GameClient.clientTick) && ((1450943713 * (entity.anInt10103)) < 443738891 * GameClient.clientTick)) {
								if (i <= 0)
									throw new IllegalStateException();
								continue;
							}
						}
					}
					if (animator_3_.method5981(1) && animator_3_.method5978()) {
						animator_3_.load(-1);
						entity.currentGraphics[i_2_].graphicID = -1313669563;
					}
				}
			}
			Animator animator_4_ = entity.animator;
			do {
				if (animator_4_.hasAnimationDefinition()) {
					AnimationDefinition class391 = animator_4_.getAnimationDefinition();
					if (class391.animatingPrecedence * 62820525 == 3) {
						if (1888275831 * entity.anInt10125 > 0 && (entity.anInt10095 * -412225079 <= GameClient.clientTick * 443738891) && (entity.anInt10103 * 1450943713 < 443738891 * GameClient.clientTick)) {
							entity.anIntArray10093 = null;
							animator_4_.load(-1);
							break;
						}
					} else if (class391.animatingPrecedence * 62820525 == 1) {
						if (1888275831 * entity.anInt10125 > 0 && (entity.anInt10095 * -412225079 <= 443738891 * GameClient.clientTick) && (entity.anInt10103 * 1450943713 < 443738891 * GameClient.clientTick)) {
							animator_4_.method5828(1);
							break;
						}
						animator_4_.method5828(0);
					}
					if (animator_4_.method5981(1) && animator_4_.method5978()) {
						entity.anIntArray10093 = null;
						animator_4_.load(-1);
					}
				}
			} while (false);
			for (int i_5_ = 0; i_5_ < (entity.aClass438_Sub2_Sub1Array10112).length; i_5_++) {
				Animator_Sub2_Sub1 class438_sub2_sub1 = (entity.aClass438_Sub2_Sub1Array10112[i_5_]);
				if (null == class438_sub2_sub1) {
					if (i <= 0)
						break;
				} else if (class438_sub2_sub1.anInt9874 * -623360337 > 0)
					class438_sub2_sub1.anInt9874 -= -731066289;
				else if (class438_sub2_sub1.method5981(1) && class438_sub2_sub1.method5978())
					entity.aClass438_Sub2_Sub1Array10112[i_5_] = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tm.if(").append(')').toString());
		}
	}

	static boolean method6069(int i, int i_6_) {
		try {
			if (i_6_ >= 1000 && i < 1000)
				return true;
			if (i_6_ < 1000 && i < 1000) {
				if (StaticMethods.method6169(i))
					return true;
                return !StaticMethods.method6169(i_6_);
            }
            return i_6_ >= 1000 && i >= 1000;
        } catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tm.bv(").append(')').toString());
		}
	}

	static void method6070(int i) {
		try {
			if (GameClient.aByteArray8843 != null)
				Class418.method5598((byte) -48);
			else if (2084404473 * Class360.socialNetworkId != -1)
				Class282.method2625(1290556720);
			else
				StaticMethods.method966(Class360.username, Class360.password);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tm.a(").append(')').toString());
		}
	}
}
