package com.jagex;/* Class468 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;
import com.jagex.game.cache.config.prefetch.Js5List;
import com.jagex.maths.Matrix43f;
import com.jagex.maths.Matrix4f;
import com.jagex.utils.TimeUtils;

import java.awt.*;
import java.util.Arrays;

public class ItemDefinition {
	public int teamID;
	public static int anInt5701 = 1;
	int unknownInt8;
	public int unknownInt21;
	public int stackable;
	public static int anInt5705 = 2;
	short[] modifiedModelColors;
	public String name = "null";
	byte[] unknownArray1;
	public int certID;
	int unknownInt17;
	short[] originalTextureColors;
	short[] modifiedTextureColors;
	public int secondaryModelZoom = 730923888;
	public int primaryModelRotation = 0;
	public int secondaryModelRotation = 0;
	public int primaryModelZoom = 0;
	public int primaryModelOffset = 0;
	public int secondaryModelOffset = 0;
	public int lendTemplateID;
	public int unknown;
	public int value;
	public int unknownInt24;
	public String[] groundOptions;
	public int maleEquip1;
	public int unknownInt19;
	public static int anInt5726 = 0;
	public int unknownInt23;
	public int unknownInt25;
	public int unknownInt18;
	public int unknownInt20;
	public boolean membersOnly;
	public String[] inventoryOptions;
	public int equipSlot;
	public boolean unnoted;
	public int unknown2;
	public int unknownInt22;
	int maleEquip2;
	int modelID;
	int unknownInt9;
	int itemID;
	int femaleEquip3;
	int unknownInt12;
	int unknownInt15;
	int unknownInt13;
	int unknownInt16;
	int femaleEquip2;
	public int femaleEquip1;
	int unknownInt14;
	int unknownInt3;
	int unknownInt2;
	ItemDefinitionLoader itemDefinitionLoader1;
	int[] itemIDs;
	int[] stackAmounts;
	short[] originalModelColors;
	public int certTemplateID;
	int lendID;
	public static short[] aShortArray5757 = new short[256];
	int unknownInt7;
	int maleEquip3;
	int unknownInt1;
	int width;
	int height;
	public int htmlColorCode;
	int unknownInt4;
	public int unknownInt6;
	LinkedList clientScriptData;
	public int[] unknownArray2;
	public int unknownValue;
	int unknownValue2;
	public int unknownValue1;
	public boolean hasCustomColor;
	public int equipType;
	private byte[] unknownArray6;
	private byte[] unkownArray3;
	private int[] unknownArray4;
	private int[] unknownArray5;

    void method6025(int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("th.a(").append(')').toString());
		}
	}

	void decode(Buffer class298_sub53, boolean oldItems) {
		try {
			for (;;) {
				int i_0_ = class298_sub53.readUByte();
				if (i_0_ == 0) {
					break;
				}
				decode(class298_sub53, i_0_, oldItems);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("th.f(").append(')').toString());
		}
	}

	void toCertifcateTemplateModel(ItemDefinition class468_1_, ItemDefinition class468_2_, int i) {
		try {
			this.modelID = class468_1_.modelID * 1;
			secondaryModelZoom = class468_1_.secondaryModelZoom * 1;
			primaryModelRotation = class468_1_.primaryModelRotation * 1;
			secondaryModelRotation = class468_1_.secondaryModelRotation * 1;
			primaryModelZoom = 1 * class468_1_.primaryModelZoom;
			primaryModelOffset = class468_1_.primaryModelOffset * 1;
			secondaryModelOffset = class468_1_.secondaryModelOffset * 1;
			this.originalModelColors = class468_1_.originalModelColors;
			this.modifiedModelColors = class468_1_.modifiedModelColors;
			this.unknownArray1 = class468_1_.unknownArray1;
			this.originalTextureColors = class468_1_.originalTextureColors;
			this.modifiedTextureColors = class468_1_.modifiedTextureColors;
			name = class468_2_.name;
			membersOnly = class468_2_.membersOnly;
			value = class468_2_.value * 1;
			stackable = 126481113;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("th.p(").append(')').toString());
		}
	}

	public final BaseModel method6028(boolean male, CustomizedItem customizedItem) {
		try {
			int i_3_;
			int i_4_;
			int i_5_;
			if (male) {
				if (customizedItem != null && customizedItem.maleModels != null) {
					i_3_ = customizedItem.maleModels[0];
					i_4_ = customizedItem.maleModels[1];
					i_5_ = customizedItem.maleModels[2];
				} else {
					i_3_ = this.femaleEquip1 * 1585491093;
					i_4_ = this.femaleEquip2 * -1284247975;
					i_5_ = this.femaleEquip3 * -1767718263;
				}
			} else if (customizedItem != null && customizedItem.femaleModels != null) {
				i_3_ = customizedItem.femaleModels[0];
				i_4_ = customizedItem.femaleModels[1];
				i_5_ = customizedItem.femaleModels[2];
			} else {
				i_3_ = this.maleEquip1 * 1343198193;
				i_4_ = this.maleEquip2 * 34210967;
				i_5_ = this.maleEquip3 * 1313278521;
			}
			if (i_3_ == -1)
				return null;
			BaseModel class64 = BaseModel.load((this.itemDefinitionLoader1.JS5_MDOELS), i_3_, 0);
			if (class64 == null)
				return null;
			if (class64.format < 13)
				class64.scaleUp(2);
			if (i_4_ != -1) {
				BaseModel class64_6_ = BaseModel.load((this.itemDefinitionLoader1.JS5_MDOELS), i_4_, 0);
				if (class64_6_.format < 13)
					class64_6_.scaleUp(2);
				if (i_5_ != -1) {
					BaseModel class64_7_ = BaseModel.load((this.itemDefinitionLoader1.JS5_MDOELS), i_5_, 0);
					if (class64_7_.format < 13)
						class64_7_.scaleUp(2);
					BaseModel[] class64s = { class64, class64_6_, class64_7_ };
					class64 = new BaseModel(class64s, 3);
				} else {
					BaseModel[] class64s = { class64, class64_6_ };
					class64 = new BaseModel(class64s, 2);
				}
			}
			if (!male && (0 != this.unknownInt12 * -1268579363 || 345393423 * this.unknownInt13 != 0 || 0 != this.unknownInt14 * 669576861))
				class64.translate(this.unknownInt12 * -1268579363, 345393423 * this.unknownInt13, 669576861 * this.unknownInt14);
			if (male && (0 != -1436808331 * this.unknownInt15 || -92251131 * this.unknownInt16 != 0 || this.unknownInt17 * 1813909637 != 0))
				class64.translate(this.unknownInt15 * -1436808331, this.unknownInt16 * -92251131, 1813909637 * this.unknownInt17);
			if (null != this.originalModelColors) {
				short[] is;
				if (customizedItem != null && customizedItem.replacementColors != null)
					is = customizedItem.replacementColors;
				else
					is = this.modifiedModelColors;
				for (int i_8_ = 0; i_8_ < this.originalModelColors.length; i_8_++)
					class64.recolor(this.originalModelColors[i_8_], is[i_8_]);
			}
			if (null != this.originalTextureColors) {
				short[] is;
				if (customizedItem != null && null != customizedItem.replacementTextures)
					is = customizedItem.replacementTextures;
				else
					is = this.modifiedTextureColors;
				for (int i_9_ = 0; i_9_ < this.originalTextureColors.length; i_9_++)
					class64.retexture(this.originalTextureColors[i_9_], is[i_9_]);
			}
			return class64;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("th.z(").append(')').toString());
		}
	}

	public final ModelToolkit drawPlayerEquipmentItems(GraphicsToolkit graphicsToolkit, int animationFlag, int itemQuantity, PlayerAppearance appearance, Animator animator, int i_11_, int i_12_, int i_13_, int i_14_) {
		try {
			if (null != this.itemIDs && itemQuantity > 1) {
				int itemID = -1;
				for (int index = 0; index < 10; index++) {
					if (itemQuantity >= this.stackAmounts[index] && 0 != this.stackAmounts[index])
						itemID = this.itemIDs[index];
				}
				if (itemID != -1)
					return (this.itemDefinitionLoader1.getItemDefinitions(itemID).drawPlayerEquipmentItems(graphicsToolkit, animationFlag, 1, appearance, animator, i_11_, i_12_, i_13_, i_14_));
			}
			int flag = animationFlag;
			if (null != animator)
				flag |= animator.getAnimationFlag();
			ModelToolkit modelToolkit;
			synchronized (this.itemDefinitionLoader1.aClass348_5994) {
				modelToolkit = ((ModelToolkit) (this.itemDefinitionLoader1.aClass348_5994.get((long) (1027112447 * this.itemID | graphicsToolkit.id * 580915349 << 29))));
			}
			if (null == modelToolkit || graphicsToolkit.method5017(modelToolkit.m(), flag) != 0) {
				if (null != modelToolkit)
					flag = graphicsToolkit.method5004(flag, modelToolkit.m());
				int mask = flag;
				if (this.originalTextureColors != null)
					mask |= 0x8000;
				if (null != this.originalModelColors || appearance != null)
					mask |= 0x4000;
				if (128 != this.unknownInt7 * -1773084507)
					mask |= 0x1;
				if (128 != this.unknownInt7 * -1773084507)
					mask |= 0x2;
				if (this.unknownInt7 * -1773084507 != 128)
					mask |= 0x4;
				BaseModel model = BaseModel.load((this.itemDefinitionLoader1.JS5_MDOELS), (this.modelID * 381556007), 0);
				if (null == model)
					return null;
				if (model.format < 13)
					model.scaleUp(2);
				modelToolkit = (graphicsToolkit.creatModelToolkit(model, mask, (this.itemDefinitionLoader1.anInt5991) * -424819635, 64 + 856370373 * this.width, this.height * 1055603853 + 850));
				if (-1773084507 * this.unknownInt7 != 128 || 128 != this.unknownInt8 * 902366341 || 128 != -230848851 * this.unknownInt9)
					modelToolkit.oa(-1773084507 * this.unknownInt7, 902366341 * this.unknownInt8, this.unknownInt9 * -230848851);
				if (this.originalModelColors != null) {
					for (int index = 0; index < this.originalModelColors.length; index++) {
						if (this.unknownArray1 != null && index < this.unknownArray1.length)
							modelToolkit.X((this.originalModelColors[index]), aShortArray5757[(this.unknownArray1[index]) & 0xFF]);
						else
							modelToolkit.X((this.originalModelColors[index]), (this.modifiedModelColors[index]));
					}
				}
				if (null != this.originalTextureColors) {
					for (int index = 0; index < this.originalTextureColors.length; index++)
						modelToolkit.W(this.originalTextureColors[index], this.modifiedTextureColors[index]);
				}
				if (null != appearance) {
					for (int index = 0; index < 10; index++) {
						for (int index1 = 0; (index1 < PlayerAppearance.originalBodyColours[index].length); index1++) {
							if (appearance.bodyColors[index] < (PlayerAppearance.replacementBodyColors[index][index1]).length)
								modelToolkit.X((PlayerAppearance.originalBodyColours[index][index1]), (PlayerAppearance.replacementBodyColors[index][index1][appearance.bodyColors[index]]));
						}
					}
				}
				modelToolkit.KA(flag);
				synchronized (this.itemDefinitionLoader1.aClass348_5994) {
					this.itemDefinitionLoader1.aClass348_5994.put(modelToolkit, (long) (this.itemID * 1027112447 | graphicsToolkit.id * 580915349 << 29));
				}
			}
			if (null != animator || 0 != i_14_) {
				modelToolkit = modelToolkit.method4755((byte) 1, flag, true);
				if (null != animator)
					animator.animate(modelToolkit, 0);
				if (0 != i_14_)
					modelToolkit.PA(i_11_, i_12_, i_13_, i_14_);
			}
			modelToolkit.KA(animationFlag);
			return modelToolkit;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, "Failed to draw player equipment models");
		}
	}

	public ItemDefinition getItem(int quantity) {
			if (this.itemIDs != null && quantity > 1) {
				int itemID = -1;
				for (int index = 0; index < 10; index++) {
					if (quantity >= this.stackAmounts[index] && 0 != this.stackAmounts[index])
						itemID = this.itemIDs[index];
				}
				if (-1 != itemID)
					return this.itemDefinitionLoader1.getItemDefinitions(itemID);
			}
			return this;
	}

	int[] rasterize(GraphicsToolkit graphicsToolkit, GraphicsToolkit class_ra_27_, int i, int i_28_, int i_29_, boolean bool, int i_30_, FontToolkit class264, PlayerAppearance class366) {
			BaseModel class64 = BaseModel.load((this.itemDefinitionLoader1.JS5_MDOELS), 381556007 * this.modelID, 0);
			if (null == class64)
				return null;
			if (class64.format < 13)
				class64.scaleUp(2);
			if (null != this.originalModelColors) {
				for (int i_32_ = 0; i_32_ < this.originalModelColors.length; i_32_++) {
					if (this.unknownArray1 != null && i_32_ < this.unknownArray1.length)
						class64.recolor((this.originalModelColors[i_32_]), aShortArray5757[(this.unknownArray1[i_32_]) & 0xff]);
					else
						class64.recolor((this.originalModelColors[i_32_]), (this.modifiedModelColors[i_32_]));
				}
			}
			if (null != this.originalTextureColors) {
				for (int i_33_ = 0; i_33_ < this.originalTextureColors.length; i_33_++)
					class64.retexture(this.originalTextureColors[i_33_], (this.modifiedTextureColors[i_33_]));
			}
			if (null != class366) {
				for (int i_34_ = 0; i_34_ < 10; i_34_++) {
					for (int i_35_ = 0; i_35_ < PlayerAppearance.originalBodyColours[i_34_].length; i_35_++) {
						if (class366.bodyColors[i_34_] < (PlayerAppearance.replacementBodyColors[i_34_][i_35_]).length)
							class64.recolor((PlayerAppearance.originalBodyColours[i_34_][i_35_]), (PlayerAppearance.replacementBodyColors[i_34_][i_35_][(class366.bodyColors[i_34_])]));
					}
				}
			}
			int i_36_ = 2048;
			boolean bool_37_ = false;
			if (-1773084507 * this.unknownInt7 != 128 || 128 != 902366341 * this.unknownInt8 || this.unknownInt9 * -230848851 != 128) {
				bool_37_ = true;
				i_36_ |= 0x7;
			}
			ModelToolkit class387 = graphicsToolkit.creatModelToolkit(class64, i_36_, 64, (this.width * 856370373 + 64), 768 + (this.height * 1055603853));
			if (!class387.method4743())
				return null;
			if (bool_37_)
				class387.oa(-1773084507 * this.unknownInt7, 902366341 * this.unknownInt8, this.unknownInt9 * -230848851);
			SpriteToolkit class57 = null;
			if (-1 != -1673957995 * certTemplateID) {
				class57 = (this.itemDefinitionLoader1.method6086(graphicsToolkit, class_ra_27_, 809765849 * certID, 10, 1, 0, true, true, 0, class264, class366));
				if (null == class57)
					return null;
			} else if (465190555 * lendTemplateID != -1) {
				class57 = (this.itemDefinitionLoader1.method6086(graphicsToolkit, class_ra_27_, this.lendID * -783380935, i, i_28_, i_29_, false, true, 0, class264, class366));
				if (null == class57)
					return null;
			} else if (-1 != unknownValue1 * 2083650097) {
				class57 = (this.itemDefinitionLoader1.method6086(graphicsToolkit, class_ra_27_, 1981372535 * this.unknownValue2, i, i_28_, i_29_, false, true, 0, class264, class366));
				if (null == class57)
					return null;
			}
			int i_38_;
			if (bool)
				i_38_ = (int) ((double) (1396167403 * secondaryModelZoom) * 1.5) << 2;
			else if (2 == i_28_)
				i_38_ = (int) ((double) (1396167403 * secondaryModelZoom) * 1.04) << 2;
			else
				i_38_ = secondaryModelZoom * 1396167403 << 2;
			Matrix4f matrix4f = graphicsToolkit.method5045();
			Matrix4f matrix4f_39_ = graphicsToolkit.cz();
			matrix4f_39_.setProjection(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.14748365E9F, (float) graphicsToolkit.getFrameContext().getWidth(), (float) graphicsToolkit.getFrameContext().getHeight());
			graphicsToolkit.ci(matrix4f_39_);
			graphicsToolkit.method5187(0, 0, graphicsToolkit.getFrameContext().getWidth(), graphicsToolkit.getFrameContext().getHeight());
			Matrix43f viewingMatrix = new Matrix43f();
			graphicsToolkit.cw(viewingMatrix);
			graphicsToolkit.setModelAmbient(0.95F + (float) (Math.random() / 10.0));
			graphicsToolkit.updateSun(16777215, 0.95F + (float) (Math.random() / 10.0), 0.95F + (float) (Math.random() / 10.0), -50.0F, -10.0F, -50.0F);
			Matrix43f matrix = graphicsToolkit.getTransformationMatrix(); // draws it seems
			matrix.method2473(0.0F, 0.0F, 1.0F, CircleAngleTable.toDegrees(-(primaryModelZoom * -1368639199) << 3));
			matrix.rotate(0.0F, 1.0F, 0.0F, CircleAngleTable.toDegrees(secondaryModelRotation * -3355859 << 3));
			matrix.translate((float) (252709809 * primaryModelOffset << 2), (float) ((((CircleAngleTable.SINE[330519029 * primaryModelRotation << 3]) * i_38_) >> 14) - class387.YA() / 2 + (-1811316489 * secondaryModelOffset << 2)), (float) ((((CircleAngleTable.COSINE[330519029 * primaryModelRotation << 3]) * i_38_) >> 14) + (secondaryModelOffset * -1811316489 << 2)));
			matrix.rotate(1.0F, 0.0F, 0.0F, CircleAngleTable.toDegrees((primaryModelRotation * 330519029) << 3));
			graphicsToolkit.clear(2, 0);
			graphicsToolkit.L();
			graphicsToolkit.drawFilledRectangle(0, 0, 36, 32, 0, 0);
			class387.render(matrix, null, 1);
			graphicsToolkit.ci(matrix4f);
			int[] pixelDataRGB = graphicsToolkit.aq(0, 0, 36, 32);
			if (i_28_ >= 1) {
				pixelDataRGB = method6032(pixelDataRGB, -16777214, 224723616);
				if (i_28_ >= 2)
					pixelDataRGB = method6032(pixelDataRGB, -1, 1899522127);
			}
			if (0 != i_29_)
				method6033(pixelDataRGB, i_29_, 1738452390);
			if (-1 != 465190555 * lendTemplateID)
				class57.draw(0, 0);
			else if (-1 != unknownValue1 * 2083650097)
				class57.draw(0, 0);
			graphicsToolkit.createRenderSprite(pixelDataRGB, 0, 36, 36, 32).draw(0, 0);
			if (-1 != certTemplateID * -1673957995)
				class57.draw(0, 0);
			if (1 == i_30_ || 2 == i_30_ && (stackable * 789409129 == 1 || 1 != i) && i != -1)
				class264.method2488(StaticMethods.method1149(i, (this.itemDefinitionLoader1.language)), 0, 9, -256, -16777215);
			pixelDataRGB = graphicsToolkit.aq(0, 0, 36, 32);
			for (int index = 0; index < pixelDataRGB.length; index++) {
				if ((pixelDataRGB[index] & 0xffffff) == 0)//Dead pixel
					pixelDataRGB[index] = 0;
				else
					pixelDataRGB[index] |= ~0xffffff;
			}
			return pixelDataRGB;
	}

	int[] method6032(int[] is, int i, int i_42_) {
		try {
			int[] is_43_ = new int[1152];
			int i_44_ = 0;
			for (int i_45_ = 0; i_45_ < 32; i_45_++) {
				for (int i_46_ = 0; i_46_ < 36; i_46_++) {
					int i_47_ = is[i_44_];
					if (i_47_ == 0) {
						if (i_46_ > 0 && 0 != is[i_44_ - 1])
							i_47_ = i;
						else if (i_45_ > 0 && is[i_44_ - 36] != 0)
							i_47_ = i;
						else if (i_46_ < 35 && 0 != is[1 + i_44_])
							i_47_ = i;
						else if (i_45_ < 31 && 0 != is[i_44_ + 36])
							i_47_ = i;
					}
					is_43_[i_44_++] = i_47_;
				}
			}
			return is_43_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("th.r(").append(')').toString());
		}
	}

	void method6033(int[] is, int i, int i_48_) {
		try {
			for (int i_49_ = 31; i_49_ > 0; i_49_--) {
				int i_50_ = i_49_ * 36;
				for (int i_51_ = 35; i_51_ > 0; i_51_--) {
					if (is[i_51_ + i_50_] == 0 && 0 != is[i_50_ + i_51_ - 1 - 36])
						is[i_50_ + i_51_] = i;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("th.q(").append(')').toString());
		}
	}

	public final boolean method6034(boolean hasApperance, CustomizedItem customizedItem) {
			int i_52_;
			int i_53_;
			int i_54_;
			if (hasApperance) {
				if (customizedItem != null && customizedItem.maleModels != null) {
					i_52_ = customizedItem.maleModels[0];
					i_53_ = customizedItem.maleModels[1];
					i_54_ = customizedItem.maleModels[2];
				} else {
					i_52_ = this.femaleEquip1 * 1585491093;
					i_53_ = this.femaleEquip2 * -1284247975;
					i_54_ = this.femaleEquip3 * -1767718263;
				}
			} else if (customizedItem != null && customizedItem.femaleModels != null) {
				i_52_ = customizedItem.femaleModels[0];
				i_53_ = customizedItem.femaleModels[1];
				i_54_ = customizedItem.femaleModels[2];
			} else {
				i_52_ = this.maleEquip1 * 1343198193;
				i_53_ = this.maleEquip2 * 34210967;
				i_54_ = this.maleEquip3 * 1313278521;
			}
			if (i_52_ == -1)
				return true;
			boolean bool_55_ = true;
			if (!this.itemDefinitionLoader1.JS5_MDOELS.fileExists(i_52_, 0))
				bool_55_ = false;
			if (i_53_ != -1 && !this.itemDefinitionLoader1.JS5_MDOELS.fileExists(i_53_, 0))
				bool_55_ = false;
			if (i_54_ != -1 && !this.itemDefinitionLoader1.JS5_MDOELS.fileExists(i_54_, 0))
				bool_55_ = false;
			return bool_55_;
	}

	public final boolean method6035(boolean bool, CustomizedItem class464, byte i) {
		try {
			int i_56_;
			int i_57_;
			if (bool) {
				if (null != class464 && class464.maleHeadModels != null) {
					i_56_ = class464.maleHeadModels[0];
					i_57_ = class464.maleHeadModels[1];
				} else {
					i_56_ = -1531415419 * this.unknownInt2;
					i_57_ = this.unknownInt4 * 1578724433;
				}
			} else if (null != class464 && null != class464.femaleHeadModels) {
				i_56_ = class464.femaleHeadModels[0];
				i_57_ = class464.femaleHeadModels[1];
			} else {
				i_56_ = this.unknownInt1 * -1282951055;
				i_57_ = this.unknownInt3 * 86274879;
			}
			if (i_56_ == -1)
				return true;
			boolean bool_58_ = true;
			if (!this.itemDefinitionLoader1.JS5_MDOELS.fileExists(i_56_, 0))
				bool_58_ = false;
			if (-1 != i_57_ && !this.itemDefinitionLoader1.JS5_MDOELS.fileExists(i_57_, 0))
				bool_58_ = false;
			return bool_58_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("th.posY(").append(')').toString());
		}
	}

	void method6036(ItemDefinition class468_59_, ItemDefinition class468_60_, int i) {
		try {
			value = 0;
			this.modelID = 1 * class468_59_.modelID;
			secondaryModelZoom = class468_59_.secondaryModelZoom * 1;
			primaryModelRotation = class468_59_.primaryModelRotation * 1;
			secondaryModelRotation = 1 * class468_59_.secondaryModelRotation;
			primaryModelZoom = 1 * class468_59_.primaryModelZoom;
			primaryModelOffset = class468_59_.primaryModelOffset * 1;
			secondaryModelOffset = class468_59_.secondaryModelOffset * 1;
			this.originalModelColors = class468_60_.originalModelColors;
			this.modifiedModelColors = class468_60_.modifiedModelColors;
			this.unknownArray1 = class468_60_.unknownArray1;
			this.originalTextureColors = class468_60_.originalTextureColors;
			this.modifiedTextureColors = class468_60_.modifiedTextureColors;
			name = class468_60_.name;
			membersOnly = class468_60_.membersOnly;
			equipSlot = class468_60_.equipSlot * 1;
			equipType = class468_60_.equipType * 1;
			unknown2 = class468_60_.unknown2 * 1;
			maleEquip1 = 1 * class468_60_.maleEquip1;
			this.maleEquip2 = 1 * class468_60_.maleEquip2;
			this.maleEquip3 = class468_60_.maleEquip3 * 1;
			femaleEquip1 = 1 * class468_60_.femaleEquip1;
			this.femaleEquip2 = class468_60_.femaleEquip2 * 1;
			this.femaleEquip3 = 1 * class468_60_.femaleEquip3;
			this.unknownInt12 = 1 * class468_60_.unknownInt12;
			this.unknownInt15 = 1 * class468_60_.unknownInt15;
			this.unknownInt13 = 1 * class468_60_.unknownInt13;
			this.unknownInt16 = class468_60_.unknownInt16 * 1;
			this.unknownInt14 = class468_60_.unknownInt14 * 1;
			this.unknownInt17 = 1 * class468_60_.unknownInt17;
			this.unknownInt1 = class468_60_.unknownInt1 * 1;
			this.unknownInt3 = class468_60_.unknownInt3 * 1;
			this.unknownInt2 = class468_60_.unknownInt2 * 1;
			this.unknownInt4 = class468_60_.unknownInt4 * 1;
			teamID = 1 * class468_60_.teamID;
			groundOptions = class468_60_.groundOptions;
			this.clientScriptData = class468_60_.clientScriptData;
			stackable = 1 * class468_60_.stackable;
			inventoryOptions = new String[5];
			if (null != class468_60_.inventoryOptions) {
				for (int i_61_ = 0; i_61_ < 4; i_61_++)
					inventoryOptions[i_61_] = class468_60_.inventoryOptions[i_61_];
			}
			inventoryOptions[4] = Tradution.DISCARD2.translate((this.itemDefinitionLoader1.language));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("th.k(").append(')').toString());
		}
	}

	public int method6037(int key, int i_62_) {
		try {
			if (null == this.clientScriptData)
				return i_62_;
			IntNode node = ((IntNode) this.clientScriptData.get((long) key));
			if (null == node)
				return i_62_;
			return node.capacity * -774922497;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("th.h(").append(')').toString());
		}
	}

	void decode(Buffer stream, int opcode, boolean oldItems) {
		try {
			if (1 == opcode)
				this.modelID = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart()) * -1019082089;// model
																																					// animationID
			else if (2 == opcode)
				name = stream.readString();// action
			else if (opcode == 4)
				secondaryModelZoom = stream.readUShort() * -1885125181;
			else if (5 == opcode)
				primaryModelRotation = stream.readUShort() * -2068311459;
			else if (6 == opcode)
				secondaryModelRotation = stream.readUShort() * -629359451;
			else if (7 == opcode) {
				primaryModelOffset = stream.readUShort() * -1497539247;
				if (primaryModelOffset * 252709809 > 32767)
					primaryModelOffset -= 1565589504;
			} else if (opcode == 8) {
				secondaryModelOffset = stream.readUShort() * -572964665;
				if (-1811316489 * secondaryModelOffset > 32767)
					secondaryModelOffset -= 1086783488;
			} else if (opcode == 11)
				stackable = 126481113;
			else if (12 == opcode)
				value = stream.readInt() * -1375390745;
			else if (opcode == 13)
				equipSlot = stream.readUByte() * -2026784241;
			else if (14 == opcode)
				equipType = stream.readUByte() * -583083477;
			else if (16 == opcode)
				membersOnly = true;
			else if (18 == opcode)
				unknown = stream.readUShort() * -1741576309;
			else if (opcode == 23)
				maleEquip1 = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart()) * -1612514031;
			else if (opcode == 24)
				this.maleEquip2 = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart()) * 582597415;
			else if (25 == opcode)
				femaleEquip1 = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart()) * -1430077763;
			else if (26 == opcode)
				this.femaleEquip2 = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart()) * -336299543;
			else if (opcode == 27)
				unknown2 = stream.readUByte() * -1438605935;
			else if (opcode >= 30 && opcode < 35)
				groundOptions[opcode - 30] = stream.readString();
			else if (opcode >= 35 && opcode < 40)
				inventoryOptions[opcode - 35] = stream.readString();
			else if (40 == opcode) {
				int length = stream.readUByte();
				this.originalModelColors = new short[length];
				this.modifiedModelColors = new short[length];
				for (int index = 0; index < length; index++) {
					this.originalModelColors[index] = (short) stream.readUShort();
					this.modifiedModelColors[index] = (short) stream.readUShort();
				}
			} else if (41 == opcode) {
				int length = stream.readUByte();
				this.originalTextureColors = new short[length];
				this.modifiedTextureColors = new short[length];
				for (int index = 0; index < length; index++) {
					this.originalTextureColors[index] = (short) stream.readUShort();
					this.modifiedTextureColors[index] = (short) stream.readUShort();
				}
			} else if (opcode == 42) {
				int length = stream.readUByte();
				this.unknownArray1 = new byte[length];
				for (int index = 0; index < length; index++)
					this.unknownArray1[index] = stream.readByte();
			} else if (43 == opcode) {
				htmlColorCode = stream.readInt() * 682064309;
				hasCustomColor = true;
			} else if (44 == opcode) {
				int length = (short) stream.readUShort();
				int arraySize = 0;
				for (int modifier = length; modifier > 0; modifier >>= 1)
					arraySize++;
				unkownArray3 = new byte[arraySize];
				byte offset = 0;
				for (int index = 0; index < arraySize; index++) {
					if ((length & 1 << index) > 0) {
						unkownArray3[index] = offset;
						offset++;
					} else
						unkownArray3[index] = (byte) -1;
				}
			} else if (45 == opcode) {
				int i_97_ = (short) stream.readUShort();
				int intOffset = 0;
				for (int i_99_ = i_97_; i_99_ > 0; i_99_ >>= 1)
					intOffset++;
				unknownArray6 = new byte[intOffset];
				byte byteOffset = 0;
				for (int index = 0; index < intOffset; index++) {
					if ((i_97_ & 1 << index) > 0) {
						unknownArray6[index] = byteOffset;
						byteOffset++;
					} else
						unknownArray6[index] = (byte) -1;
				}
			} else if (65 == opcode)
				unnoted = true;
			else if (78 == opcode)
				this.maleEquip3 = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart()) * 756401161;
			else if (opcode == 79)
				this.femaleEquip3 = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart()) * 2098680761;
			else if (opcode == 90)
				this.unknownInt1 = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart()) * 1319962769;
			else if (opcode == 91)
				this.unknownInt2 = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart()) * 1598907469;
			else if (opcode == 92)
				this.unknownInt3 = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart()) * -1935344449;
			else if (93 == opcode)
				this.unknownInt4 = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart()) * -1194369871;
			else if (95 == opcode)
				primaryModelZoom = stream.readUShort() * -883520799;
			else if (96 == opcode)
				unknownInt6 = stream.readUByte() * 135187667;
			else if (opcode == 97)
				certID = stream.readUShort() * -384973719;
			else if (98 == opcode)
				certTemplateID = stream.readUShort() * 1831957949;
			else if (opcode >= 100 && opcode < 110) {
				if (this.itemIDs == null) {
					this.itemIDs = new int[10];
					this.stackAmounts = new int[10];
				}
				this.itemIDs[opcode - 100] = stream.readUShort();
				this.stackAmounts[opcode - 100] = stream.readUShort();
			} else if (opcode == 110)
				this.unknownInt7 = stream.readUShort() * -237762771;
			else if (111 == opcode)
				this.unknownInt8 = stream.readUShort() * 355882061;
			else if (opcode == 112)
				this.unknownInt9 = stream.readUShort() * 1219480869;
			else if (opcode == 113)
				this.width = stream.readByte() * 712208909;
			else if (opcode == 114)
				this.height = stream.readByte() * -1050247335;
			else if (115 == opcode)
				teamID = stream.readUByte() * 1325490629;
			else if (121 == opcode)
				this.lendID = stream.readUShort() * -970653687;
			else if (122 == opcode)
				lendTemplateID = stream.readUShort() * 2015131539;
			else if (opcode == 125) {
				this.unknownInt12 = ((stream.readByte() << 2) * -1833538443);
				this.unknownInt13 = (stream.readByte() << 2) * -25983505;
				this.unknownInt14 = (stream.readByte() << 2) * 1243416501;
			} else if (opcode == 126) {
				this.unknownInt15 = ((stream.readByte() << 2) * -1039520547);
				this.unknownInt16 = (stream.readByte() << 2) * 1803423949;
				this.unknownInt17 = (stream.readByte() << 2) * 519268429;
			} else if (opcode == 127) {
				unknownInt18 = stream.readUByte() * 947829311;
				unknownInt19 = stream.readUShort() * 300082645;
			} else if (128 == opcode) {
				unknownInt20 = stream.readUByte() * -1036837039;
				unknownInt21 = stream.readUShort() * 1829509431;
			} else if (129 == opcode) {
				unknownInt22 = stream.readUByte() * -2098727417;
				unknownInt23 = stream.readUShort() * -48114927;
			} else if (opcode == 130) {
				unknownInt24 = stream.readUByte() * -969618575;
				unknownInt25 = stream.readUShort() * -1531140281;
			} else if (132 == opcode) {
				int length = stream.readUByte();
				unknownArray2 = new int[length];
				for (int index = 0; index < length; index++)
					unknownArray2[index] = stream.readUShort();
			} else if (134 == opcode)
				unknownValue = stream.readUByte() * 1394978643;
			else if (139 == opcode)
				this.unknownValue2 = stream.readUShort() * 257950023;
			else if (opcode == 140)
				unknownValue1 = stream.readUShort() * 78716625;
			else if (opcode >= 142 && opcode < 147) {
				if (unknownArray4 == null) {
					unknownArray4 = new int[6];
					Arrays.fill(unknownArray4, -1);
				}
				unknownArray4[opcode - 142] = (short) stream.readUShort();
			} else if (opcode >= 150 && opcode < 155) {
				if (null == unknownArray5) {
					unknownArray5 = new int[5];
					Arrays.fill(unknownArray5, -1);
				}
				unknownArray5[opcode - 150] = (short) stream.readUShort();
			} else if (249 == opcode) {
				int length = stream.readUByte();
				if (null == this.clientScriptData) {
					int i_74_ = LinkedList.getNextBitValue(length);
					this.clientScriptData = new LinkedList(i_74_);
				}
				for (int index = 0; index < length; index++) {// client script
																// map
					boolean isString = stream.readUByte() == 1;
					int key = stream.readUTriByte();
					Node value;
					if (isString)
						value = new ObjectNode(stream.readString());
					else
						value = new IntNode(stream.readInt());
					this.clientScriptData.connect(value, (long) key);
				}
			} else {
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("th.b(").append(')').toString());
		}
	}

	void toLendTemplateModel(ItemDefinition itemTemplateDefinition, ItemDefinition itemDefinition) {
			value = 0;
			this.modelID = 1 * itemTemplateDefinition.modelID;
			secondaryModelZoom = itemTemplateDefinition.secondaryModelZoom * 1;
			primaryModelRotation = 1 * itemTemplateDefinition.primaryModelRotation;
			secondaryModelRotation = itemTemplateDefinition.secondaryModelRotation * 1;
			primaryModelZoom = itemTemplateDefinition.primaryModelZoom * 1;
			primaryModelOffset = 1 * itemTemplateDefinition.primaryModelOffset;
			secondaryModelOffset = 1 * itemTemplateDefinition.secondaryModelOffset;
			this.originalModelColors = itemDefinition.originalModelColors;
			this.modifiedModelColors = itemDefinition.modifiedModelColors;
			this.unknownArray1 = itemDefinition.unknownArray1;
			this.originalTextureColors = itemDefinition.originalTextureColors;
			this.modifiedTextureColors = itemDefinition.modifiedTextureColors;
			name = itemDefinition.name;
			membersOnly = itemDefinition.membersOnly;
			equipSlot = 1 * itemDefinition.equipSlot;
			equipType = itemDefinition.equipType * 1;
			unknown2 = itemDefinition.unknown2 * 1;
			maleEquip1 = itemDefinition.maleEquip1 * 1;
			this.maleEquip2 = itemDefinition.maleEquip2 * 1;
			this.maleEquip3 = 1 * itemDefinition.maleEquip3;
			femaleEquip1 = 1 * itemDefinition.femaleEquip1;
			this.femaleEquip2 = itemDefinition.femaleEquip2 * 1;
			this.femaleEquip3 = itemDefinition.femaleEquip3 * 1;
			this.unknownInt12 = itemDefinition.unknownInt12 * 1;
			this.unknownInt15 = 1 * itemDefinition.unknownInt15;
			this.unknownInt13 = itemDefinition.unknownInt13 * 1;
			this.unknownInt16 = 1 * itemDefinition.unknownInt16;
			this.unknownInt14 = 1 * itemDefinition.unknownInt14;
			this.unknownInt17 = 1 * itemDefinition.unknownInt17;
			this.unknownInt1 = 1 * itemDefinition.unknownInt1;
			this.unknownInt3 = 1 * itemDefinition.unknownInt3;
			this.unknownInt2 = 1 * itemDefinition.unknownInt2;
			this.unknownInt4 = 1 * itemDefinition.unknownInt4;
			teamID = 1 * itemDefinition.teamID;
			groundOptions = itemDefinition.groundOptions;
			this.clientScriptData = itemDefinition.clientScriptData;
			inventoryOptions = new String[5];
			if (itemDefinition.inventoryOptions != null) {
				for (int i_79_ = 0; i_79_ < 4; i_79_++)
					inventoryOptions[i_79_] = itemDefinition.inventoryOptions[i_79_];
			}
			inventoryOptions[4] = Tradution.DISCARD_LENT.translate((this.itemDefinitionLoader1.language));
	}

	public final BaseModel method6040(boolean male, CustomizedItem customizedItem) {
			int i_80_;
			int i_81_;
			if (male) {
				if (customizedItem != null && null != customizedItem.maleHeadModels) {
					i_80_ = customizedItem.maleHeadModels[0];
					i_81_ = customizedItem.maleHeadModels[1];
				} else {
					i_80_ = this.unknownInt2 * -1531415419;
					i_81_ = 1578724433 * this.unknownInt4;
				}
			} else if (null != customizedItem && null != customizedItem.femaleHeadModels) {
				i_80_ = customizedItem.femaleHeadModels[0];
				i_81_ = customizedItem.femaleHeadModels[1];
			} else {
				i_80_ = -1282951055 * this.unknownInt1;
				i_81_ = this.unknownInt3 * 86274879;
			}
			if (-1 == i_80_)
				return null;
			BaseModel model = BaseModel.load((this.itemDefinitionLoader1.JS5_MDOELS), i_80_, 0);
			if (model.format < 13)
				model.scaleUp(2);
			if (-1 != i_81_) {
				BaseModel class64_82_ = BaseModel.load((this.itemDefinitionLoader1.JS5_MDOELS), i_81_, 0);
				if (class64_82_.format < 13)
					class64_82_.scaleUp(2);
				BaseModel[] class64s = { model, class64_82_ };
				model = new BaseModel(class64s, 2);
			}
			if (null != this.originalModelColors) {
				short[] is;
				if (customizedItem != null && null != customizedItem.replacementColors)
					is = customizedItem.replacementColors;
				else
					is = this.modifiedModelColors;
				for (int i_83_ = 0; i_83_ < this.originalModelColors.length; i_83_++)
					model.recolor(this.originalModelColors[i_83_], is[i_83_]);
			}
			if (null != this.originalTextureColors) {
				short[] is;
				if (null != customizedItem && customizedItem.replacementTextures != null)
					is = customizedItem.replacementTextures;
				else
					is = this.modifiedTextureColors;
				for (int i_84_ = 0; i_84_ < this.originalTextureColors.length; i_84_++)
					model.retexture(this.originalTextureColors[i_84_], is[i_84_]);
			}
			return model;
	}

	public String method6041(int key, String string) {
		try {
			if (this.clientScriptData == null)
				return string;
			ObjectNode class298_sub29 = ((ObjectNode) this.clientScriptData.get((long) key));
			if (class298_sub29 == null)
				return string;
			return (String) class298_sub29.nodeObject;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("th.v(").append(')').toString());
		}
	}

	public static int method2845(int i, int i_0_, boolean bool, boolean bool_1_) {
		try {
			Class298_Sub9 class298_sub9 = StaticMethods.method2437(i, bool_1_);
			if (class298_sub9 == null)
				return 0;
			int i_3_ = 0;
			for (int i_4_ = 0; i_4_ < class298_sub9.anIntArray7226.length; i_4_++) {
				if (class298_sub9.anIntArray7226[i_4_] >= 0 && (class298_sub9.anIntArray7226[i_4_] < (-888767613 * Js5Configs.itemList.itemDefinitionsLength))) {
					ItemDefinition class468 = (Js5Configs.itemList.getItemDefinitions((class298_sub9.anIntArray7226[i_4_])));
					int i_5_ = class468.method6037(i_0_, (Class92.aClass504_905.get(i_0_).size) * -388931549);
					if (bool)
						i_3_ += (class298_sub9.anIntArray7227[i_4_]) * i_5_;
					else
						i_3_ += i_5_;
				}
			}
			return i_3_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aab.p(").append(')').toString());
		}
	}

	static void method5576(int i, int i_4_, int i_5_, Class298_Sub12 class298_sub12, int i_6_) {
		try {
			long l = (long) (i << 28 | i_5_ << 14 | i_4_);
			Class298_Sub2 class298_sub2 = (Class298_Sub2) GameClient.aClass437_8685.get(l);
			if (class298_sub2 == null) {
				class298_sub2 = new Class298_Sub2();
				GameClient.aClass437_8685.connect(class298_sub2, l);
				class298_sub2.aClass453_7166.pushBack(class298_sub12);
			} else {
				ItemDefinition itemDefinitions = (Js5Configs.itemList.getItemDefinitions(1768239597 * class298_sub12.anInt7257));
				int i_7_ = 785788887 * itemDefinitions.value;
				if (789409129 * itemDefinitions.stackable == 1)
					i_7_ *= 1 + 567630807 * (class298_sub12.anInt7256);
				for (Class298_Sub12 class298_sub12_8_ = (Class298_Sub12) class298_sub2.aClass453_7166.method5939(); null != class298_sub12_8_; class298_sub12_8_ = ((Class298_Sub12) class298_sub2.aClass453_7166.method5944())) {
					itemDefinitions = (Js5Configs.itemList.getItemDefinitions(class298_sub12_8_.anInt7257 * 1768239597));
					int i_9_ = 785788887 * itemDefinitions.value;
					if (1 == 789409129 * itemDefinitions.stackable)
						i_9_ *= 1 + (class298_sub12_8_.anInt7256) * 567630807;
					if (i_7_ > i_9_) {
						Class97_Sub1.method1044(class298_sub12, class298_sub12_8_, 1979456016);
						return;
					}
				}
				class298_sub2.aClass453_7166.pushBack(class298_sub12);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rb.jt(").append(')').toString());
		}
	}

	ItemDefinition() {
		stackable = 0;
		unknown = 1741576309;
		value = -1375390745;
		membersOnly = false;
		unknownInt19 = -300082645;
		unknownInt21 = -1829509431;
		unknownInt23 = 48114927;
		unknownInt25 = 1531140281;
		unknownInt18 = -947829311;
		unknownInt20 = 1036837039;
		unknownInt22 = 2098727417;
		unknownInt24 = 969618575;
		equipSlot = 2026784241;
		equipType = 583083477;
		unknown2 = 1438605935;
		maleEquip1 = 1612514031;
		this.maleEquip2 = -582597415;
		femaleEquip1 = 1430077763;
		this.femaleEquip2 = 336299543;
		this.maleEquip3 = -756401161;
		this.femaleEquip3 = -2098680761;
		this.unknownInt12 = 0;
		this.unknownInt15 = 0;
		this.unknownInt13 = 0;
		this.unknownInt16 = 0;
		this.unknownInt14 = 0;
		this.unknownInt17 = 0;
		this.unknownInt1 = -1319962769;
		this.unknownInt3 = 1935344449;
		this.unknownInt2 = -1598907469;
		this.unknownInt4 = 1194369871;
		certID = 384973719;
		certTemplateID = -1831957949;
		this.lendID = 970653687;
		lendTemplateID = -2015131539;
		this.unknownInt7 = -368863616;
		this.unknownInt8 = -1691736448;
		this.unknownInt9 = 1474728576;
		this.width = 0;
		this.height = 0;
		teamID = 0;
		unnoted = false;
		unknownInt6 = 0;
		unknownValue = 0;
		this.unknownValue2 = -257950023;
		unknownValue1 = -78716625;
		hasCustomColor = false;
	}

	static final void handleWorldMapLogic(int i, int i_86_) {
		try {
			if (Class301_Sub1.aFloat3233 < Class301_Sub1.aFloat3234) {
				Class301_Sub1.aFloat3233 += (double) Class301_Sub1.aFloat3233 / 30.0;
				if (Class301_Sub1.aFloat3233 > Class301_Sub1.aFloat3234)
					Class301_Sub1.aFloat3233 = Class301_Sub1.aFloat3234;
				Class225.method2103(65536);
				Class301_Sub1.anInt3254 = (int) Class301_Sub1.aFloat3233 >> 1;
				Class301_Sub1.aByteArrayArrayArray3229 = IcmpService_Sub1.method6381(Class301_Sub1.anInt3254);
			} else if (Class301_Sub1.aFloat3233 > Class301_Sub1.aFloat3234) {
				Class301_Sub1.aFloat3233 -= (double) Class301_Sub1.aFloat3233 / 30.0;
				if (Class301_Sub1.aFloat3233 < Class301_Sub1.aFloat3234)
					Class301_Sub1.aFloat3233 = Class301_Sub1.aFloat3234;
				Class225.method2103(65536);
				Class301_Sub1.anInt3254 = (int) Class301_Sub1.aFloat3233 >> 1;
				Class301_Sub1.aByteArrayArrayArray3229 = IcmpService_Sub1.method6381(Class301_Sub1.anInt3254);
			}
			if (Class301_Sub1.anInt7632 * -1198160439 != -1 && -1 != -19739017 * Class301_Sub1.anInt7627) {
				int i_88_ = (-1198160439 * Class301_Sub1.anInt7632 - Class82_Sub14.anInt6875 * 1196508279);
				if (i_88_ < 2 || i_88_ > 2)
					i_88_ /= 8;
				int i_89_ = (Class301_Sub1.anInt7627 * -19739017 - Class376.anInt4090 * 1882038855);
				if (i_89_ < 2 || i_89_ > 2)
					i_89_ /= 8;
				Class82_Sub14.anInt6875 = ((i_88_ + Class82_Sub14.anInt6875 * 1196508279) * -2076584633);
				Class376.anInt4090 = (i_89_ + 1882038855 * Class376.anInt4090) * -435591305;
				if (i_88_ == 0 && i_89_ == 0) {
					Class301_Sub1.anInt7632 = 433609607;
					Class301_Sub1.anInt7627 = 789877945;
				}
				Class225.method2103(65536);
			}
			if (Class137_Sub1.anInt6991 * -1983068885 > 0) {
				Class88.anInt810 -= -1077128129;
				if (0 == Class88.anInt810 * -1581933633) {
					Class137_Sub1.anInt6991 -= -63057533;
					Class88.anInt810 = -338630500;
				}
			} else {
				Class301_Sub1.anInt7633 = -2138103821;
				Class301_Sub1.anInt7630 = -1998014133;
			}
			if (Class301_Sub1.aBoolean7628 && DiskFile.aClass453_5986 != null) {
				for (Class298_Sub6 class298_sub6 = ((Class298_Sub6) DiskFile.aClass453_5986.method5939()); null != class298_sub6; class298_sub6 = (Class298_Sub6) DiskFile.aClass453_5986.method5944()) {
					Class352 class352 = (Class301_Sub1.aClass339_3251.method4116(-530122905 * (class298_sub6.mapFunctionNode.anInt7608)));
					if (class298_sub6.method2862(i, i_86_)) {
						if (class352.rightClickOptions != null) {
							if (null != class352.rightClickOptions[4])
								MenuOption.add(class352.rightClickOptions[4], class352.aString3789, -1, 1012, -1, (long) ((class298_sub6.mapFunctionNode.anInt7608) * -530122905), class352.anInt3817 * -804513353, 0, true, false, (long) ((class298_sub6.mapFunctionNode.anInt7608) * -530122905), false);
							if (class352.rightClickOptions[3] != null)
								MenuOption.add(class352.rightClickOptions[3], class352.aString3789, -1, 1011, -1, (long) (-530122905 * (class298_sub6.mapFunctionNode.anInt7608)), class352.anInt3817 * -804513353, 0, true, false, (long) ((class298_sub6.mapFunctionNode.anInt7608) * -530122905), false);
							if (class352.rightClickOptions[2] != null)
								MenuOption.add(class352.rightClickOptions[2], class352.aString3789, -1, 1010, -1, (long) ((class298_sub6.mapFunctionNode.anInt7608) * -530122905), class352.anInt3817 * -804513353, 0, true, false, (long) (-530122905 * (class298_sub6.mapFunctionNode.anInt7608)), false);
							if (class352.rightClickOptions[1] != null)
								MenuOption.add(class352.rightClickOptions[1], class352.aString3789, -1, 1009, -1, (long) (-530122905 * (class298_sub6.mapFunctionNode.anInt7608)), class352.anInt3817 * -804513353, 0, true, false, (long) ((class298_sub6.mapFunctionNode.anInt7608) * -530122905), false);
							if (null != class352.rightClickOptions[0])
								MenuOption.add(class352.rightClickOptions[0], class352.aString3789, -1, 1008, -1, (long) ((class298_sub6.mapFunctionNode.anInt7608) * -530122905), class352.anInt3817 * -804513353, 0, true, false, (long) ((class298_sub6.mapFunctionNode.anInt7608) * -530122905), false);
						}
						if (!class298_sub6.mapFunctionNode.focused) {
							class298_sub6.mapFunctionNode.focused = true;
							ToMoveScripts.method1405(CS2Context.FOCUS, -530122905 * (class298_sub6.mapFunctionNode.anInt7608), class352.anInt3817 * -804513353);
						}
						if (class298_sub6.mapFunctionNode.focused)
							ToMoveScripts.method1405(CS2Context.FOCUSING, -530122905 * (class298_sub6.mapFunctionNode.anInt7608), class352.anInt3817 * -804513353);
					} else if (class298_sub6.mapFunctionNode.focused) {
						class298_sub6.mapFunctionNode.focused = false;
						ToMoveScripts.method1405(CS2Context.UNFOCUS, (-530122905 * (class298_sub6.mapFunctionNode.anInt7608)), -804513353 * class352.anInt3817);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("th.bz(").append(')').toString());
		}
	}

	public static int method6043(int i, int i_90_, int i_91_) {
			if (Js5List.JS5_DEFAULTS.anInt4035 * -1919698893 == -1)
				return 1;
			if (i != SettingsManager.settingsManager.toolkitSetting.getValue()) {
				GameDefaults.profileGraphics(i, (Tradution.PROFILING.translate(GameLanguage.CURRENT_LANGUAGE)), true);
				if (SettingsManager.settingsManager.toolkitSetting.getValue() != i)
					return -1;
			}
			int i_92_;
			try {
				Dimension dimension = DirectXContext.canvas.getSize();
				StaticMethods.drawCornerLoadingBox(Tradution.PROFILING.translate(GameLanguage.CURRENT_LANGUAGE), true, GameClient.activeGraphicsToolkit, StaticMethods.aClass264_3673, StaticMethods.aClass505_8369);
				BaseModel model = BaseModel.load(Js5List.JS5_MDOELS, (-1919698893 * Js5List.JS5_DEFAULTS.anInt4035), 0);
				long l = TimeUtils.getTime();
				GameClient.activeGraphicsToolkit.L();
				GameClient.cameraMatrix.setMatrix(0.0F, 256.0F, 0.0F);
				GameClient.activeGraphicsToolkit.cw(GameClient.cameraMatrix);
				Matrix4f matrix4f = GameClient.activeGraphicsToolkit.cz();
				matrix4f.setProjection((float) (dimension.width / 2), (float) (dimension.height / 2), 512.0F, 512.0F, (float) GameClient.myRegion.getZNear(), (float) GameClient.myRegion.getZFar(), (float) dimension.width, (float) dimension.height);
				GameClient.activeGraphicsToolkit.ci(matrix4f);
				GameClient.activeGraphicsToolkit.setModelAmbient(1.0F);
				GameClient.activeGraphicsToolkit.updateSun(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
				ModelToolkit modelToolkit = GameClient.activeGraphicsToolkit.creatModelToolkit(model, 2048, 64, 64, 768);
				int i_93_ = 0;
				while_107_: for (int i_94_ = 0; i_94_ < 500; i_94_++) {
					GameClient.activeGraphicsToolkit.clear(3, 0);
					for (int i_95_ = 15; i_95_ >= 0; i_95_--) {
						for (int i_96_ = 0; i_96_ <= i_95_; i_96_++) {
							GameClient.modelMatrix.setMatrix((float) (int) (512.0F * ((float) i_96_ - (float) i_95_ / 2.0F)), 0.0F, (float) ((1 + i_95_) * 512));
							modelToolkit.render(GameClient.modelMatrix, null, 0);
							i_93_++;
							if (TimeUtils.getTime() - l >= (long) i_90_) {
								if (i_91_ >= 1017103058)
									throw new IllegalStateException();
								break while_107_;
							}
						}
					}
				}
				GameClient.activeGraphicsToolkit.method5075();
				long l_97_ = ((long) (i_93_ * 1000) / (TimeUtils.getTime() - l));
				GameClient.activeGraphicsToolkit.clear(3, 0);
				i_92_ = (int) l_97_;
			} catch (Throwable throwable) {
				throwable.printStackTrace();
				return -1;
			}
			return i_92_;
	}
}
