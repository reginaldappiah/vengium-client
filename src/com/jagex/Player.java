package com.jagex;/* Class365_Sub1_Sub1_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;
import com.jagex.game.cache.config.prefetch.Js5List;
import com.jagex.maths.Matrix43f;

public class Player extends Entity {
	public static String localDisplayName;
	public int anInt10194;
	public String accountName;
	public boolean isNPCTransformed;
	String titleAfter;
	public boolean hidden;
	String titleBefore;
	public String displayName;
	public int prayerIconID;
	public int skullIconID;
	public boolean aBoolean10203;
	public int combatRange;
	public int skillRating;
	public int combat;
	public boolean aBoolean10207;
	public int team;
	public PlayerAppearance appearance;
	public int anInt10210;
	public int anInt10211;
	public int anInt10212;
	public int boosted;
	public int transformedNPCID;
	public int anInt10215;
	int renderAnimationID;
	public boolean aBoolean10217;
	public int anInt10218;
	public int anInt10219;
	public byte isMale = 0;
	public int anInt10221;
	public boolean aBoolean10222;
	public Class70 aClass70_10223;
	public static Player myPlayer;

	public Player(Region class331, int i) {
		super(class331, i);
		skullIconID = -1944760989;
		prayerIconID = -218110545;
		combat = 0;
		boosted = 0;
		combatRange = 1031683529;
		skillRating = 0;
		anInt10221 = 1530078181;
		aBoolean10207 = false;
		team = 0;
		anInt10194 = -361000179;
		anInt10210 = -1839540625;
		anInt10211 = -1358158739;
		anInt10212 = 1578398049;
		isNPCTransformed = false;
		transformedNPCID = 0;
		anInt10215 = -664381027;
		aBoolean10217 = false;
		aBoolean10203 = false;
		hidden = false;
		aBoolean10222 = false;
		aClass70_10223 = new Class70(16);
	}

	public final void sendAppearence(Buffer stream, byte gender) {
		try {
			stream.offset = 0;
			int flag = stream.readUByte();
			isMale = (byte) (flag & 0x1);
			boolean isNPCTransformed = this.isNPCTransformed;
			this.isNPCTransformed =  (flag & 0x2) != 0;
			boolean hasTitle = (flag & 0x4) != 0;
			int size = super.getSize();
			method4421((flag >> 3 & 0x7) + 1, -2030022890);
			boolean titleBefore = 0 != (flag & 0x40);
			boolean titleAfter = 0 != (flag & 0x80);
			Vector3f class217 = Vector3f.method2005(getWorldTransform().trans);
			class217.x += (float) (getSize() - size << 8);
			class217.z += (float) (getSize() - size << 8);

			System.out.println("X: " + class217.x + ", Y: "  + class217.y + ", Z: " + class217.z);
			method4340(class217);
			class217.cache();
			if (titleBefore)
				this.titleBefore = stream.readJagString();
			else
				this.titleBefore = null;
			if (titleAfter)
				this.titleAfter = stream.readJagString();
			else
				this.titleAfter = null;
			skullIconID = stream.readByte() * 1944760989;
			prayerIconID = stream.readByte() * 218110545;
			hidden = stream.readByte() == 1;
			if (StaticMethods.aClass401_2708 == Class401.aClass401_6557 && 1806357379 * GameClient.localPrivilege <= 2)
				hidden = false;
			int npc = -1;
			team = 0;
			int[] equipment = new int[EquipmentDefaults.defaults.hidden.length];
			CustomizedItem[] customs = (new CustomizedItem[EquipmentDefaults.defaults.hidden.length]);
			ItemDefinition[] items = (new ItemDefinition[EquipmentDefaults.defaults.hidden.length]);

			for (int slotID = 0; slotID < EquipmentDefaults.defaults.hidden.length; slotID++) {
				if (EquipmentDefaults.defaults.hidden[slotID] != 1) {
					int msb = stream.readUByte();
					if (0 == msb)
						equipment[slotID] = 0;
					else {
						int lsb = stream.readUByte();
						int itemID = (msb << 8) + lsb;
						if (slotID == 0 && 65535 == itemID) {
							npc = stream.readBigSmart();
							team = (stream.readUByte() * 1076333291);
							break;
						}
						if (itemID >= 32768) {
							itemID = FileInflater.anIntArray6274[itemID - 32768];
							equipment[slotID] = itemID | 0x40000000;
							items[slotID] = Js5Configs.itemList.getItemDefinitions(itemID);
							int team = items[slotID].teamID * 1832088845;
							if (0 != team)
								this.team = 1076333291 * team;
						} else
							equipment[slotID] = itemID - 256 | ~0x7fffffff;
					}
				}
			}
			if (npc == -1) {
				int count = stream.readUShort();
				int current = 0;
				for (int index = 0; (index < EquipmentDefaults.defaults.hidden.length); index++) {
					if (0 != (EquipmentDefaults.defaults.hidden[index])) {
						if (gender != 3)
							return;
					} else {
						if ((count & 1 << current) != 0)
							customs[index] = CustomizedItem.create(items[index], stream);
						current++;
					}
				}
			}
			int[] colors = new int[10];
			for (int index = 0; index < 10; index++) {
				int color = stream.readUByte();
				if (PlayerAppearance.replacementBodyColors.length < 1 || color < 0 || (color >= PlayerAppearance.replacementBodyColors[index][0].length))
					color = 0;
				colors[index] = color;
			}
			this.renderAnimationID = stream.readUShort() * 148972467;
			displayName = stream.readString();
			accountName = displayName;
			if (this == Player.myPlayer)
				localDisplayName = displayName;
			combat = stream.readUByte() * 1202458455;
			if (hasTitle) {
				skillRating = stream.readUShort() * -1214139113;
				if (65535 == 242930343 * skillRating)
					skillRating = 1214139113;
				boosted = combat * -1911826885;
				combatRange = 1031683529;
			} else {
				skillRating = 0;
				boosted = stream.readUByte() * 1144472333;
				combatRange = stream.readUByte() * -1031683529;
				if (255 == combatRange * 1792775047)
					combatRange = 1031683529;
			}
			int transformedNPCID = this.transformedNPCID * 780357347;
			this.transformedNPCID = stream.readUByte() * -1973000501;
			if (this.transformedNPCID * 780357347 != 0) {
				int i_18_ = anInt10194 * 1728220219;
				int i_19_ = anInt10210 * -1304250511;
				int i_20_ = anInt10211 * 1899133595;
				int i_21_ = -978842273 * anInt10212;
				int i_22_ = 933675083 * anInt10215;
				anInt10194 = stream.readUShort() * 361000179;
				anInt10210 = stream.readUShort() * 1839540625;
				anInt10211 = stream.readUShort() * 1358158739;
				anInt10212 = stream.readUShort() * -1578398049;
				anInt10215 = stream.readUByte() * -895284893;
				if (this.isNPCTransformed != isNPCTransformed || this.transformedNPCID * 780357347 != transformedNPCID || 1728220219 * anInt10194 != i_18_ || -1304250511 * anInt10210 != i_19_ || i_20_ != anInt10211 * 1899133595 || i_21_ != -978842273 * anInt10212 || anInt10215 * 933675083 != i_22_)
					StaticMethods.method5934(this);
			} else
				Heap.method3670(this);
			if (null == appearance)
				appearance = new PlayerAppearance();
			int i_23_ = 164936249 * appearance.typeID;
			int[] bodyColours = appearance.bodyColors;
			appearance.update(method4432(), equipment, customs, colors, 1 == isMale, npc);
			if (i_23_ != npc) {
				class217 = Vector3f.method2005(getWorldTransform().trans);
				class217.x = (float) ((scenePositionXQueue[0] << 9) + (getSize() << 8));
				class217.z = (float) ((scenePositionYQueue[0] << 9) + (getSize() << 8));
				method4340(class217);
				class217.cache();
			}
			if (GameClient.playerIndex * -442628795 == entityIndex * 1888274983 && null != bodyColours) {
				for (int index = 0; index < colors.length; index++) {
					if (bodyColours[index] != colors[index]) {
						Js5Configs.itemList.clearSpriteCache();
						break;
					}
				}
			}
			if (this.aParticleSystem_10067 != null)
				this.aParticleSystem_10067.method4220();
			if (aAnimator_10077.hasAnimationDefinition() && aBoolean10094) {
				Class350 class350 = method4426();
				if (!class350.method4209(aAnimator_10077.getAnimationID())) {
					aAnimator_10077.load(-1);
					aBoolean10094 = false;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, "Error generating appearance data for: " + accountName);
		}
	}

	public Class334 method4358(GraphicsToolkit toolkit) {
			return null;
	}

	Class335 method4394(GraphicsToolkit graphicsToolkit) {
		try {
			if (null == appearance || !method4469(graphicsToolkit, 2048))
				return null;
			Matrix43f camera = graphicsToolkit.getTransformationMatrix();
			Matrix43f class222_26_ = method4347();
			Class235 class235 = getWorldTransform();
			int i_27_ = aClass386_10084.method4719((byte) 0);
			Class326 class326 = (aClass331_7722.gameSceneBase[plane][(int) class235.trans.x >> 9][(int) class235.trans.z >> 9]);
			if (null != class326 && null != class326.aClass365_Sub1_Sub2_3461) {
				int i_28_ = ((this.anInt10122 * -661498661) - class326.aClass365_Sub1_Sub2_3461.aShort9801);
				this.anInt10122 = (int) ((float) (-661498661 * (this.anInt10122)) - (float) i_28_ / 10.0F) * 1394444115;
			} else
				this.anInt10122 = (int) ((float) ((this.anInt10122) * -661498661) - (float) ((this.anInt10122) * -661498661) / 10.0F) * 1394444115;
			camera.copy(class222_26_);
			camera.translate(0.0F, (float) (-20 - (-661498661 * this.anInt10122)), 0.0F);
			Class335 class335 = null;
			this.aBoolean10129 = false;
			if (SettingsManager.settingsManager.modShadows.getValue() == 1) {
				Class350 class350 = method4426();
				if (class350.aBoolean3756 && (164936249 * appearance.typeID == -1 || (NPCDefinitionLoader.npcList.load(appearance.typeID * 164936249).aBoolean6165))) {
					Animator animator = ((this.animator.hasAnimationDefinition() && this.animator.method5826()) ? this.animator : null);
					Animator animator_29_ = ((aAnimator_10077.hasAnimationDefinition() && (!aBoolean10094 || animator == null)) ? aAnimator_10077 : null);
					ModelToolkit modelToolkit = (Class462.method2678(graphicsToolkit, i_27_, -155466425 * (this.anInt10097), -197572281 * (this.anInt10073), -104151209 * (this.anInt10074), 1, modelToolkits[0], 0, 0, 160, 240, animator_29_ != null ? animator_29_ : animator));
					if (null != modelToolkit) {
						if (null == aClass302_Sub1Array7726 || (aClass302_Sub1Array7726.length < 1 + modelToolkits.length))
							method4362(modelToolkits.length + 1);
						class335 = StaticMethods.method818(true);
						this.aBoolean10129 = true;
						graphicsToolkit.RA(false);
						modelToolkit.render(camera, (aClass302_Sub1Array7726[modelToolkits.length]), 0);
						graphicsToolkit.RA(true);
					}
				}
			}
			if (this == Player.myPlayer) {
				for (int i_30_ = HintIcon.loadedIcons.length - 1; i_30_ >= 0; i_30_--) {
					HintIcon hintIcon = HintIcon.loadedIcons[i_30_];
					if (null != hintIcon && hintIcon.modelID * 408071539 != -1) {
						if (958933333 * hintIcon.targetType == 1) {
							ObjectNode class298_sub29 = ((ObjectNode) (GameClient.entityList.get((long) (-841622081 * hintIcon.targetIndex))));
							if (null != class298_sub29) {
								NPC npc = ((NPC) class298_sub29.nodeObject);
								Vector3f class217 = (Vector3f.method2011(npc.getWorldTransform().trans, Player.myPlayer.getWorldTransform().trans));
								int i_31_ = (int) class217.x;
								int i_32_ = (int) class217.z;
								method4468(graphicsToolkit, camera, (long) i_31_, (long) i_32_, hintIcon.modelID * 408071539, 92160000L);
							}
						}
						if (2 == hintIcon.targetType * 958933333) {
							Vector3f class217 = (Player.myPlayer.getWorldTransform().trans);
							long l = (long) (-1338192389 * hintIcon.coordX - (int) class217.x);
							long l_33_ = (long) (hintIcon.coordY * 1018128075 - (int) class217.z);
							long l_34_ = (long) (2140036693 * hintIcon.minimapAppearance << 9);
							l_34_ *= l_34_;
							method4468(graphicsToolkit, camera, l, l_33_, 408071539 * hintIcon.modelID, l_34_);
						}
						if (10 == hintIcon.targetType * 958933333 && -841622081 * hintIcon.targetIndex >= 0 && (-841622081 * hintIcon.targetIndex < (GameClient.entities).length)) {
							Player class365_sub1_sub1_sub2_sub2_35_ = (GameClient.entities[hintIcon.targetIndex * -841622081]);
							if (class365_sub1_sub1_sub2_sub2_35_ != null) {
								Vector3f class217 = (Vector3f.method2011(class365_sub1_sub1_sub2_sub2_35_.getWorldTransform().trans, Player.myPlayer.getWorldTransform().trans));
								int i_36_ = (int) class217.x;
								int i_37_ = (int) class217.z;
								method4468(graphicsToolkit, camera, (long) i_36_, (long) i_37_, 408071539 * hintIcon.modelID, 92160000L);
							}
						}
					}
				}
			}
			camera.copy(class222_26_);
			camera.translate(0.0F, (float) (-5 - (-661498661 * this.anInt10122)), 0.0F);
			if (null == aClass302_Sub1Array7726 || aClass302_Sub1Array7726.length < modelToolkits.length)
				method4362(modelToolkits.length);
			if (class335 == null)
				class335 = StaticMethods.method818(true);
			method4445(graphicsToolkit, modelToolkits, camera, false);
			for (int i_38_ = 0; i_38_ < modelToolkits.length; i_38_++) {
				if (modelToolkits[i_38_] != null)
					modelToolkits[i_38_].render(camera, aClass302_Sub1Array7726[i_38_], (this == Player.myPlayer ? 1 : 0));
			}
			if (null != this.aParticleSystem_10067) {
				Class69 class69 = this.aParticleSystem_10067.method4229();
				graphicsToolkit.renderParticles(class69);
			}
			for (int i_39_ = 0; i_39_ < modelToolkits.length; i_39_++) {
				if (null != modelToolkits[i_39_])
					this.aBoolean10129 |= modelToolkits[i_39_].i();
				modelToolkits[i_39_] = null;
			}
			anInt10066 = GameClient.flashTick * -815465993;
			return class335;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akm.bo(").append(')').toString());
		}
	}

    void method4468(GraphicsToolkit graphicsToolkit, Matrix43f cameraMatrix, long l, long l_40_, int containerID, long l_41_) {
		try {
			long l_42_ = l * l + l_40_ * l_40_;
			if (l_42_ >= 262144L && l_42_ <= l_41_) {
				int i_43_ = ((int) ((Math.atan2((double) l, (double) l_40_) * 2607.5945876176133) - (double) aClass386_10084.method4719((byte) 0)) & 0x3fff);
				ModelToolkit modelToolkit = StaticMethods.method2044(graphicsToolkit, i_43_, (this.anInt10097 * -155466425), (-197572281 * this.anInt10073), (this.anInt10074 * -104151209), containerID);
				if (modelToolkit != null) {
					graphicsToolkit.RA(false);
					modelToolkit.render(cameraMatrix, null, 0);
					graphicsToolkit.RA(true);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akm.gb(").append(')').toString());
		}
	}

	boolean method4469(GraphicsToolkit graphicsToolkit, int i) {
		try {
			int i_46_ = i;
			Class350 class350 = method4426();
			Animator animator = ((this.animator.hasAnimationDefinition() && !this.animator.method5826()) ? this.animator : null);
			Animator animator_47_ = ((aAnimator_10077.hasAnimationDefinition() && !aBoolean10207 && (!aBoolean10094 || animator == null)) ? aAnimator_10077 : null);
			int i_48_ = class350.anInt3735 * 250567115;
			int i_49_ = 1110265995 * class350.anInt3736;
			if (i_48_ != 0 || 0 != i_49_ || class350.anInt3748 * 1185872679 != 0 || 0 != -330229359 * class350.anInt3751)
				i |= 0x7;
			int i_50_ = aClass386_10084.method4719((byte) 0);
			boolean bool = (0 != aByte10130 && 443738891 * GameClient.clientTick >= anInt10105 * 1920148979 && 443738891 * GameClient.clientTick < 1953154657 * anInt10106);
			if (bool)
				i |= 0x80000;
			ModelToolkit modelToolkit = (modelToolkits[0] = (appearance.method4545(graphicsToolkit, i, Class94.aClass349_913, Js5Configs.idkList, NPCDefinitionLoader.npcList, Js5Configs.itemList, Class128.playerVarsProvider, animator, animator_47_, aClass438_Sub2_Sub1Array10112, anIntArray10085, i_50_, true, EquipmentDefaults.defaults)));
			int i_51_ = Class297.method2836();
			if (GameShell.maximumMemory * 1126040225 < 96 && i_51_ > 50)
				Class234.method2183();
			if (StaticMethods.aClass401_2708 != Class401.aClass401_6557 && i_51_ < 50) {
				int i_52_;
				for (i_52_ = 50 - i_51_; i_52_ > -837572863 * GameClient.anInt8677; GameClient.anInt8677 += 836589825)
					Class98.aByteArrayArray949[GameClient.anInt8677 * -837572863] = new byte[102400];
				while (i_52_ < -837572863 * GameClient.anInt8677) {
					GameClient.anInt8677 -= 836589825;
					Class98.aByteArrayArray949[-837572863 * GameClient.anInt8677] = null;
				}
			} else if (Class401.aClass401_6557 != StaticMethods.aClass401_2708) {
				Class98.aByteArrayArray949 = new byte[50][];
				GameClient.anInt8677 = 0;
			}
			if (modelToolkit == null)
				return false;
			this.anInt10089 = modelToolkit.YA() * -49760597;
			modelToolkit.n();
			method4423(modelToolkit, 839093609);
			if (i_48_ != 0 || 0 != i_49_) {
				method4425(i_50_, i_48_, i_49_, class350.anInt3734 * -947990311, 1869548445 * class350.anInt3740, 1427427127);
				if ((this.anInt10097 * -155466425) != 0)
					modelToolkit.t(-155466425 * this.anInt10097);
				if ((this.anInt10073 * -197572281) != 0)
					modelToolkit.EA((this.anInt10073) * -197572281);
				if (0 != (-104151209 * this.anInt10074))
					modelToolkit.ia(0, -104151209 * this.anInt10074, 0);
			} else
				method4425(i_50_, getSize() << 9, getSize() << 9, 0, 0, 1352604124);
			if (bool)
				modelToolkit.PA(aByte10117, aByte10108, aByte10109, aByte10130 & 0xff);
			if (!aBoolean10207)
				method4424(graphicsToolkit, class350, i_46_, i_48_, i_49_, i_50_);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akm.gx(").append(')').toString());
		}
	}

	public String getPlayerName(boolean isDisplay) {
			String name = "";
			if (this.titleBefore != null)
				name = this.titleBefore;
			if (isDisplay)
				name = new StringBuilder().append(name).append(displayName).toString();
			else
				name = new StringBuilder().append(name).append(accountName).toString();
			if (this.titleAfter != null)
				name = new StringBuilder().append(name).append(this.titleAfter).toString();
			return name;
	}

	public final void method4471(int i, int i_53_, byte i_54_) {
		try {
			if (animator.hasAnimationDefinition() && (animator.getAnimationDefinition().walkPriority * -882531177) == 1) {
				anIntArray10093 = null;
				animator.load(-1);
			}
			for (int i_56_ = 0; i_56_ < currentGraphics.length; i_56_++) {
				if (-1 != currentGraphics[i_56_].graphicID * -967533709) {
					SpotType class398 = (SpotTypeLoader.loader.get(-967533709 * currentGraphics[i_56_].graphicID));
					if (class398.aBoolean5215 && 1505778629 * class398.animationID != -1 && (Js5Configs.animsList.get(class398.animationID * 1505778629).walkPriority) * -882531177 == 1) {
						currentGraphics[i_56_].animator.load(-1);
						currentGraphics[i_56_].graphicID = -1313669563;
					}
				}
			}
			anInt10221 = 1530078181;
			if (i < 0 || i >= GameClient.myRegion.getMapWidth() || i_53_ < 0 || i_53_ >= GameClient.myRegion.getMapLength())
				method4472(i, i_53_);
			else if (scenePositionXQueue[0] < 0 || (scenePositionXQueue[0] >= GameClient.myRegion.getMapWidth()) || scenePositionYQueue[0] < 0 || (scenePositionYQueue[0] >= GameClient.myRegion.getMapLength()))
				method4472(i, i_53_);
			else {
				if (Class282.aClass282_6541.aByte6542 == i_54_)
					Class303.method3737(this, i, i_53_, Class282.aClass282_6541.aByte6542, (byte) 98);
				method4473(i, i_53_, i_54_, (byte) 94);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akm.gy(").append(')').toString());
		}
	}

	public void method4472(int i, int i_57_) {
		try {
			anInt10120 = 0;
			anInt10125 = 0;
			anInt10124 = 0;
			scenePositionXQueue[0] = i;
			scenePositionYQueue[0] = i_57_;
			int i_59_ = getSize();
			Vector3f class217 = Vector3f.method2005(getWorldTransform().trans);
			class217.x = (float) (256 * i_59_ + scenePositionXQueue[0] * 512);
			class217.z = (float) (i_59_ * 256 + scenePositionYQueue[0] * 512);
			method4340(class217);
			class217.cache();
			if (this == Player.myPlayer)
				GameClient.myRegion.getLightningDetails().method4324();
			if (null != this.aParticleSystem_10067)
				this.aParticleSystem_10067.method4220();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akm.gu(").append(')').toString());
		}
	}

	public final void method4473(int i, int i_60_, byte i_61_, byte i_62_) {
		try {
			if (2050671733 * anInt10120 < scenePositionXQueue.length - 1)
				anInt10120 += -1013322787;
			for (int i_63_ = 2050671733 * anInt10120; i_63_ > 0; i_63_--) {
				scenePositionXQueue[i_63_] = scenePositionXQueue[i_63_ - 1];
				scenePositionYQueue[i_63_] = scenePositionYQueue[i_63_ - 1];
				aByteArray10110[i_63_] = aByteArray10110[i_63_ - 1];
			}
			scenePositionXQueue[0] = i;
			scenePositionYQueue[0] = i_60_;
			aByteArray10110[0] = i_61_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akm.gh(").append(')').toString());
		}
	}

	public int getSize() {
		try {
			if (null != appearance && -1 != appearance.typeID * 164936249)
				return ((NPCDefinitionLoader.npcList.load(164936249 * appearance.typeID).tileSpacesOccupied) * -2095128707);
			return super.getSize();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akm.q(").append(')').toString());
		}
	}

	public int method4427(byte i) {
		try {
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akm.h(").append(')').toString());
		}
	}

	public void sendGameMessage(String rawMessage, int i, int i_66_, int overheadDuration) {
			setNextForceTalk(rawMessage, i, i_66_, (StaticMethods.method883() * (453178367 * Js5List.JS5_DEFAULTS.playerChatOverheadDuration)));
	}

	final boolean method4366() {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akm.bw(").append(')').toString());
		}
	}

	final void method4355(GraphicsToolkit graphicsToolkit, Class365_Sub1 class365_sub1, int i, int i_68_, int i_69_, boolean bool) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akm.bk(").append(')').toString());
		}
	}

	final void method4398() {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akm.bq(").append(')').toString());
		}
	}

	public boolean method4429(byte i) {
		try {
			return Js5List.JS5_DEFAULTS.somePlayerBoolean;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akm.by(").append(')').toString());
		}
	}

	public String getPlayerMessageRights(boolean hasRights) {
			if (hasRights)
				return displayName;
			return accountName;
	}

	public Class62 method4437(int i) {
		try {
			if (null != this.aClass62_10118) {
				if (null == this.aClass62_10118.nextForceTalk)
					return null;
				if (0 == GameClient.anInt8837 * -1168328513 || -1168328513 * GameClient.anInt8837 == 3 || (GameClient.anInt8837 * -1168328513 == 1 && StaticMethods.method6192(accountName)))
					return (this.aClass62_10118);
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akm.bl(").append(')').toString());
		}
	}

	public Player(Region class331) {
		super(class331);
		skullIconID = -1944760989;
		prayerIconID = -218110545;
		combat = 0;
		boosted = 0;
		combatRange = 1031683529;
		skillRating = 0;
		anInt10221 = 1530078181;
		aBoolean10207 = false;
		team = 0;
		anInt10194 = -361000179;
		anInt10210 = -1839540625;
		anInt10211 = -1358158739;
		anInt10212 = 1578398049;
		isNPCTransformed = false;
		transformedNPCID = 0;
		anInt10215 = -664381027;
		aBoolean10217 = false;
		aBoolean10203 = false;
		hidden = false;
		aBoolean10222 = false;
		aClass70_10223 = new Class70(16);
	}

	public int method4476() {
		if (null != appearance && -1 != appearance.typeID * 164936249)
			return ((NPCDefinitionLoader.npcList.load(164936249 * appearance.typeID).tileSpacesOccupied) * -2095128707);
		return super.getSize();
	}

	boolean method4350(GraphicsToolkit class_ra, int i, int i_92_, byte i_93_) {
		try {
			if (null == appearance || !method4469(class_ra, 131072))
				return false;
			Matrix43f class222 = method4347();
			boolean bool = false;
			for (int i_94_ = 0; i_94_ < modelToolkits.length; i_94_++) {
				if (modelToolkits[i_94_] != null && modelToolkits[i_94_].method4787(i, i_92_, class222, true, 0)) {
					bool = true;
					break;
				}
			}
			for (int i_95_ = 0; i_95_ < modelToolkits.length; i_95_++)
				modelToolkits[i_95_] = null;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akm.bu(").append(')').toString());
		}
	}

	public final boolean method4477() {
		try {
            return appearance != null;
        } catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akm.ga(").append(')').toString());
		}
	}

	void method4357(GraphicsToolkit graphicsToolkit, int i) {
		try {
			if (null != appearance && (this.aBoolean10128 || method4469(graphicsToolkit, 0))) {
				Matrix43f cameraMatrix = graphicsToolkit.getTransformationMatrix();
				cameraMatrix.method2054(getWorldTransform());
				cameraMatrix.translate(0.0F, -5.0F, 0.0F);
				method4445(graphicsToolkit, modelToolkits, cameraMatrix, this.aBoolean10128);
				for (int index = 0; index < modelToolkits.length; index++)
					modelToolkits[index] = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akm.bb(").append(')').toString());
		}
	}

	int method4432() {
		try {
			return (this.renderAnimationID * 613696379);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akm.t(").append(')').toString());
		}
	}

	public int method4478() {
		if (null != appearance && -1 != appearance.typeID * 164936249)
			return ((NPCDefinitionLoader.npcList.load(164936249 * appearance.typeID).tileSpacesOccupied) * -2095128707);
		return super.getSize();
	}

}
