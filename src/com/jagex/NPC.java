package com.jagex;/* Class365_Sub1_Sub1_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;
import com.jagex.game.cache.config.prefetch.Js5List;
import com.jagex.game.settings.TextureSetting;
import com.jagex.maths.Matrix43f;

public class NPC extends Entity {
	int[] anIntArray10178;
	public int anInt10179 = -1312461425;
	public int anInt10180 = -2139727009;
	public Class498 aClass498_10181;
	public int anInt10182 = -230300471;
	public int anInt10183 = 55499771;
	public int renderAnimation = 312753929;
	int[] anIntArray10185;
	public String name;
	public Class73 aClass73_10187;
	int anInt10188;
	public int anInt10189;
	public NPCDefinition aClass503_10190;
	int anInt10191;
	int anInt10192;
	int anInt10193;

	void method4453() {
			this.anInt10188 = (32 + (int) (Math.random() * 4.0)) * -1382184985;
			this.anInt10191 = (3 + (int) (Math.random() * 2.0)) * -1827850421;
			this.anInt10192 = (16 + (int) (Math.random() * 3.0)) * -1891288283;
			if (SettingsManager.settingsManager.textures.getValue() == TextureSetting.ON)
				this.anInt10193 = (int) (Math.random() * 6.0) * 818502475;
			else
				this.anInt10193 = (int) (Math.random() * 12.0) * 818502475;
	}

	public Class334 method4358(GraphicsToolkit graphicsToolkit) {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ake.bc(").append(')').toString());
		}
	}

	Class335 method4394(GraphicsToolkit graphicsToolkit) {
		try {
			if (aClass503_10190 == null || !method4454(graphicsToolkit, 526336))
				return null;
			Matrix43f class222 = method4347();
			Class235 class235 = getWorldTransform();
			Matrix43f class222_2_ = graphicsToolkit.getTransformationMatrix();
			int i_3_ = aClass386_10084.method4719((byte) 0);
			Class326 class326 = (aClass331_7722.gameSceneBase[plane][(int) class235.trans.x >> 9][(int) class235.trans.z >> 9]);
			if (null != class326 && null != class326.aClass365_Sub1_Sub2_3461) {
				int i_4_ = ((this.anInt10122 * -661498661) - class326.aClass365_Sub1_Sub2_3461.aShort9801);
				this.anInt10122 = (int) ((float) (-661498661 * (this.anInt10122)) - (float) i_4_ / 10.0F) * 1394444115;
			} else
				this.anInt10122 = (int) ((float) (-661498661 * (this.anInt10122)) - (float) ((this.anInt10122) * -661498661) / 10.0F) * 1394444115;
			class222_2_.copy(class222);
			class222_2_.translate(0.0F, (float) (-20 - this.anInt10122 * -661498661), 0.0F);
			Class350 class350 = method4426();
			NPCDefinition class503 = (aClass503_10190.morphisms != null ? aClass503_10190.morph(Class128.playerVarsProvider) : aClass503_10190);
			this.aBoolean10129 = false;
			Class335 class335 = null;
			if (SettingsManager.settingsManager.modShadows.getValue() == 1 && class503.aBoolean6165 && class350.aBoolean3756) {
				Animator animator = ((this.animator.hasAnimationDefinition() && this.animator.method5826()) ? this.animator : null);
				Animator animator_5_ = ((aAnimator_10077.hasAnimationDefinition() && (!aBoolean10094 || animator == null)) ? aAnimator_10077 : null);
				ModelToolkit class387 = (Class462.method2678(graphicsToolkit, i_3_, (this.anInt10097 * -155466425), (-197572281 * this.anInt10073), (-104151209 * this.anInt10074), -2095128707 * aClass503_10190.tileSpacesOccupied, modelToolkits[0], aClass503_10190.aShort6191 & 0xffff, aClass503_10190.aShort6153 & 0xffff, aClass503_10190.aByte6168 & 0xff, aClass503_10190.aByte6152 & 0xff, null != animator_5_ ? animator_5_ : animator));
				if (null != class387) {
					if (null == aClass302_Sub1Array7726 || (aClass302_Sub1Array7726.length < modelToolkits.length + 1))
						method4362(modelToolkits.length + 1);
					class335 = StaticMethods.method818(method4459(1869849139));
					this.aBoolean10129 = true;
					graphicsToolkit.RA(false);
					class387.render(class222_2_, (aClass302_Sub1Array7726[modelToolkits.length]), 0);
					graphicsToolkit.RA(true);
				}
			}
			if (null == aClass302_Sub1Array7726 || aClass302_Sub1Array7726.length < modelToolkits.length)
				method4362(modelToolkits.length);
			if (null == class335)
				class335 = StaticMethods.method818(method4459(1869849139));
			method4445(graphicsToolkit, modelToolkits, class222_2_, false);
			for (int i_6_ = 0; i_6_ < modelToolkits.length; i_6_++) {
				if (modelToolkits[i_6_] != null) {
					if (aClass503_10190.aBoolean6193)
						modelToolkits[i_6_].PA((this.anInt10188 * 1611045847), 1427249763 * this.anInt10191, (this.anInt10192 * 376465581), (this.anInt10193 * 332650083));
					modelToolkits[i_6_].render(class222_2_, aClass302_Sub1Array7726[i_6_], 0);
				}
			}
			if (this.aParticleSystem_10067 != null) {
				Class69 class69 = this.aParticleSystem_10067.method4229();
				graphicsToolkit.renderParticles(class69);
			}
			for (int i_7_ = 0; i_7_ < modelToolkits.length; i_7_++) {
				if (null != modelToolkits[i_7_])
					this.aBoolean10129 |= modelToolkits[i_7_].i();
				modelToolkits[i_7_] = null;
			}
			anInt10066 = GameClient.flashTick * -815465993;
			return class335;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ake.bo(").append(')').toString());
		}
	}

	boolean method4454(GraphicsToolkit toolkit, int i) {
		try {
			int i_9_ = i;
			Class350 class350 = method4426();
			Animator animator = ((this.animator.hasAnimationDefinition() && !this.animator.method5826()) ? this.animator : null);
			Animator animator_10_ = ((aAnimator_10077.hasAnimationDefinition() && (!aBoolean10094 || null == animator)) ? aAnimator_10077 : null);
			int i_11_ = 250567115 * class350.anInt3735;
			int i_12_ = 1110265995 * class350.anInt3736;
			if (0 != i_11_ || i_12_ != 0 || class350.anInt3748 * 1185872679 != 0 || -330229359 * class350.anInt3751 != 0)
				i |= 0x7;
			boolean bool = (0 != aByte10130 && 443738891 * GameClient.clientTick >= anInt10105 * 1920148979 && GameClient.clientTick * 443738891 < anInt10106 * 1953154657);
			if (bool)
				i |= 0x80000;
			int i_13_ = aClass386_10084.method4719((byte) 0);
			ModelToolkit class387 = (modelToolkits[0] = aClass503_10190.method6236(toolkit, i, Class94.aClass349_913, Class128.playerVarsProvider, animator, animator_10_, aClass438_Sub2_Sub1Array10112, anIntArray10085, i_13_, aClass498_10181, method4432(), false));
			if (null == class387)
				return false;
			this.anInt10089 = class387.YA() * -49760597;
			class387.n();
			method4423(class387, 839093609);
			if (0 != i_11_ || i_12_ != 0) {
				method4425(i_13_, i_11_, i_12_, -947990311 * class350.anInt3734, 1869548445 * class350.anInt3740, 1232740545);
				if (0 != (this.anInt10097 * -155466425))
					modelToolkits[0].t(this.anInt10097 * -155466425);
				if ((this.anInt10073 * -197572281) != 0)
					modelToolkits[0].EA(-197572281 * this.anInt10073);
				if ((this.anInt10074 * -104151209) != 0)
					modelToolkits[0].ia(0, this.anInt10074 * -104151209, 0);
			} else
				method4425(i_13_, getSize() << 9, getSize() << 9, 0, 0, 1757570363);
			if (bool)
				class387.PA(aByte10117, aByte10108, aByte10109, aByte10130 & 0xff);
			method4424(toolkit, class350, i_9_, i_11_, i_12_, i_13_);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ake.gx(").append(')').toString());
		}
	}

	void method4357(GraphicsToolkit class_ra, int i) {
		try {
			if (aClass503_10190 != null && (this.aBoolean10128 || method4454(class_ra, 0))) {
				Matrix43f class222 = class_ra.getTransformationMatrix();
				class222.copy(method4347());
				class222.translate(0.0F, -5.0F, 0.0F);
				method4445(class_ra, modelToolkits, class222, this.aBoolean10128);
				for (int i_14_ = 0; i_14_ < modelToolkits.length; i_14_++)
					modelToolkits[i_14_] = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ake.bb(").append(')').toString());
		}
	}

	public final void method4455(Class274 class274, int i, short i_15_) {
		try {
			int i_16_ = scenePositionXQueue[0];
			int i_17_ = scenePositionYQueue[0];
			switch (class274.anInt6533 * 495490839) {
			case 7:
				i_17_++;
				break;
			case 5:
				i_16_--;
				i_17_--;
				break;
			case 3:
				i_16_++;
				i_17_++;
				break;
			case 4:
				i_16_--;
				i_17_++;
				break;
			case 2:
				i_17_--;
				break;
			case 0:
				i_16_++;
				i_17_--;
				break;
			case 6:
				i_16_++;
				break;
			case 1:
				i_16_--;
				break;
			}
			if (animator.hasAnimationDefinition() && (animator.getAnimationDefinition().walkPriority * -882531177) == 1) {
				anIntArray10093 = null;
				animator.load(-1);
			}
			for (int i_18_ = 0; i_18_ < currentGraphics.length; i_18_++) {
				if (currentGraphics[i_18_].graphicID * -967533709 != -1) {
					SpotType class398 = (SpotTypeLoader.loader.get(-967533709 * currentGraphics[i_18_].graphicID));
					if (class398.aBoolean5215 && class398.animationID * 1505778629 != -1 && (Js5Configs.animsList.get(class398.animationID * 1505778629).walkPriority) * -882531177 == 1) {
						currentGraphics[i_18_].animator.load(-1);
						currentGraphics[i_18_].graphicID = -1313669563;
					}
				}
			}
			if (anInt10120 * 2050671733 < scenePositionXQueue.length - 1)
				anInt10120 += -1013322787;
			for (int i_19_ = 2050671733 * anInt10120; i_19_ > 0; i_19_--) {
				scenePositionXQueue[i_19_] = scenePositionXQueue[i_19_ - 1];
				scenePositionYQueue[i_19_] = scenePositionYQueue[i_19_ - 1];
				aByteArray10110[i_19_] = aByteArray10110[i_19_ - 1];
			}
			scenePositionXQueue[0] = i_16_;
			scenePositionYQueue[0] = i_17_;
			aByteArray10110[0] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ake.gk(").append(')').toString());
		}
	}

	public void method4456(int i, int i_20_, int i_21_, boolean bool, int i_22_) {
		try {
			plane = aByte7724 = (byte) i;
			if (GameClient.myRegion.method2654().method2320(i_20_, i_21_))
				aByte7724++;
			if (animator.hasAnimationDefinition() && (animator.getAnimationDefinition().walkPriority * -882531177) == 1) {
				anIntArray10093 = null;
				animator.load(-1);
			}
			for (int i_24_ = 0; i_24_ < currentGraphics.length; i_24_++) {
				if (-1 != currentGraphics[i_24_].graphicID * -967533709) {
					SpotType class398 = (SpotTypeLoader.loader.get(-967533709 * currentGraphics[i_24_].graphicID));
					if (class398.aBoolean5215 && -1 != 1505778629 * class398.animationID && (Js5Configs.animsList.get(class398.animationID * 1505778629).walkPriority) * -882531177 == 1) {
						currentGraphics[i_24_].animator.load(-1);
						currentGraphics[i_24_].graphicID = -1313669563;
					}
				}
			}
			if (!bool) {
				int i_25_ = i_20_ - scenePositionXQueue[0];
				int i_26_ = i_21_ - scenePositionYQueue[0];
				if (i_25_ >= -8 && i_25_ <= 8 && i_26_ >= -8 && i_26_ <= 8) {
					if (2050671733 * anInt10120 < scenePositionXQueue.length - 1)
						anInt10120 += -1013322787;
					for (int i_27_ = anInt10120 * 2050671733; i_27_ > 0; i_27_--) {
						scenePositionXQueue[i_27_] = scenePositionXQueue[i_27_ - 1];
						scenePositionYQueue[i_27_] = scenePositionYQueue[i_27_ - 1];
						aByteArray10110[i_27_] = aByteArray10110[i_27_ - 1];
					}
					scenePositionXQueue[0] = i_20_;
					scenePositionYQueue[0] = i_21_;
					aByteArray10110[0] = Class282.aClass282_6540.aByte6542;
					return;
				}
			}
			anInt10120 = 0;
			anInt10125 = 0;
			anInt10124 = 0;
			scenePositionXQueue[0] = i_20_;
			scenePositionYQueue[0] = i_21_;
			Vector3f class217 = Vector3f.method2005(getWorldTransform().trans);
			class217.x = (float) ((i_22_ << 8) + (scenePositionXQueue[0] << 9));
			class217.z = (float) ((scenePositionYQueue[0] << 9) + (i_22_ << 8));
			method4340(class217);
			class217.cache();
			if (this.aParticleSystem_10067 != null)
				this.aParticleSystem_10067.method4220();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ake.gr(").append(')').toString());
		}
	}

	public final boolean method4457(int i) {
		try {
            return null != aClass503_10190;
        } catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ake.gy(").append(')').toString());
		}
	}

	int method4432() {
		try {
			if (-1 != -1317338937 * renderAnimation)
				return renderAnimation * -1317338937;
			if (null != aClass503_10190.morphisms) {
				NPCDefinition class503 = aClass503_10190.morph(Class128.playerVarsProvider);
				if (class503 != null && 525312939 * class503.renderEmote != -1)
					return 525312939 * class503.renderEmote;
			}
			return aClass503_10190.renderEmote * 525312939;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ake.t(").append(')').toString());
		}
	}

	public int method4427(byte i) {
		try {
			if (null != aClass503_10190.morphisms) {
				NPCDefinition class503 = aClass503_10190.morph(Class128.playerVarsProvider);
				if (class503 != null && -1 != 363729791 * class503.anInt6178)
					return 363729791 * class503.anInt6178;
			}
			return 363729791 * aClass503_10190.anInt6178;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ake.h(").append(')').toString());
		}
	}

	boolean method4459(int i) {
		try {
			return aClass503_10190.isClickable;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ake.gu(").append(')').toString());
		}
	}

	int method4356() {
		try {
			if (aClass503_10190 == null)
				return 0;
			return aClass503_10190.anInt6192 * -226722581;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ake.dh(").append(')').toString());
		}
	}

	boolean method4350(GraphicsToolkit class_ra, int i, int i_28_, byte i_29_) {
		try {
			if (aClass503_10190 == null || !method4454(class_ra, 131072))
				return false;
			Matrix43f class222 = method4347();
			boolean bool = false;
			for (int i_30_ = 0; i_30_ < modelToolkits.length; i_30_++) {
				if (null != modelToolkits[i_30_]) {
					boolean bool_31_;
					while_55_: do {
						do {
							if (-226722581 * aClass503_10190.anInt6192 <= 0) {
								if (286060383 * aClass503_10190.anInt6189 == -1) {
									if (1 != (aClass503_10190.tileSpacesOccupied * -2095128707))
										break;
									if (i_29_ != 1)
										throw new IllegalStateException();
								} else if (1 != (aClass503_10190.anInt6189 * 286060383))
									break;
							}
							bool_31_ = true;
							break while_55_;
						} while (false);
						bool_31_ = false;
					} while (false);
					boolean bool_32_ = bool_31_;
					boolean bool_33_ = (modelToolkits[i_30_].method4787(i, i_28_, class222, bool_32_, aClass503_10190.anInt6192 * -226722581));
					if (bool_33_) {
						bool = true;
						break;
					}
				}
			}
			for (int i_34_ = 0; i_34_ < modelToolkits.length; i_34_++)
				modelToolkits[i_34_] = null;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ake.bu(").append(')').toString());
		}
	}

	final void method4398() {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ake.bq(").append(')').toString());
		}
	}

	public void method4460(int i, int i_35_, int i_36_, int i_37_) {
		try {
			this.anIntArray10178[i] = i_35_;
			this.anIntArray10185[i] = i_36_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ake.gz(").append(')').toString());
		}
	}

	public boolean method4429(byte i) {
		try {
			return Js5List.JS5_DEFAULTS.someNPCBoolean;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ake.by(").append(')').toString());
		}
	}

	public Class62 method4437(int i) {
		try {
			if (this.aClass62_10118 != null && this.aClass62_10118.nextForceTalk == null)
				return null;
			return this.aClass62_10118;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ake.bl(").append(')').toString());
		}
	}

	public void setNextForceTalk(String message, int i, int i_38_) {
		try {
			int overHeadDuration = (StaticMethods.method883() * (Js5List.JS5_DEFAULTS.npcChatOverheadDuration * -478874963));
			setNextForceTalk(message, i, i_38_, overHeadDuration);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ake.gd(").append(')').toString());
		}
	}

	public int method4462(int i) {
			return this.anIntArray10178[i];
	}

	final boolean method4366() {
			return false;
	}

	public NPC(Region class331, int i) {
		super(class331, i);
		aClass73_10187 = new Class73(32);
		this.anIntArray10178 = new int[6];
		this.anIntArray10185 = new int[6];
		method4453();
	}

	public int method4363() {
		try {
			if (aClass503_10190.morphisms != null) {
				NPCDefinition class503 = aClass503_10190.morph(Class128.playerVarsProvider);
				if (null != class503 && class503.anInt6143 * -1575020259 != -1)
					return class503.anInt6143 * -1575020259;
			}
			return (-1575020259 * aClass503_10190.anInt6143 != -1 ? -1575020259 * aClass503_10190.anInt6143 : super.method4363());
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ake.bx(").append(')').toString());
		}
	}

	public void method4464(NPCDefinition class503, int i) {
		try {
			if (class503 != aClass503_10190 && GameClient.menuOpen && StaticMethods.method6313(entityIndex * 1888274983))
				Class194.closeMenus();
			aClass503_10190 = class503;
			if (aClass503_10190 != null) {
				name = aClass503_10190.name;
				anInt10189 = aClass503_10190.combatLevel * 1520279523;
			}
			if (this.aParticleSystem_10067 != null)
				this.aParticleSystem_10067.method4220();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ake.gb(").append(')').toString());
		}
	}

	final void method4355(GraphicsToolkit graphicsToolkit, Class365_Sub1 class365_sub1, int i, int i_59_, int i_60_, boolean bool) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ake.bk(").append(')').toString());
		}
	}

	public NPC(Region class331) {
		super(class331);
		aClass73_10187 = new Class73(32);
		this.anIntArray10178 = new int[6];
		this.anIntArray10185 = new int[6];
		method4453();
	}

	public int method4466(int i) {
			return this.anIntArray10185[i];
	}

}
