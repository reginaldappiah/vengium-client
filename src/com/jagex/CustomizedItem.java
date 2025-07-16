package com.jagex;/* Class464 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CustomizedItem {
	public int[] femaleHeadModels;
	public int[] femaleModels = new int[3];
	public int[] maleModels = new int[3];
	public int[] maleHeadModels;
	public short[] replacementColors;
	public short[] replacementTextures;

	CustomizedItem(ItemDefinition definition) {
		femaleHeadModels = new int[2];
		maleHeadModels = new int[2];
		femaleModels[0] = definition.maleEquip1 *1343198193 ;
		femaleModels[1] = definition.maleEquip2 * 34210967;
		femaleModels[2] =  definition.maleEquip3 * 1313278521;
		maleModels[0] = definition.femaleEquip1 * 1585491093;
		maleModels[1] = definition.femaleEquip2 * -1284247975;
		maleModels[2] = definition.femaleEquip3 * -1767718263;
		femaleHeadModels[0] = definition.unknownInt1 * -1282951055;
		femaleHeadModels[1] = definition.unknownInt3 * 86274879;
		maleHeadModels[0] = definition.unknownInt2 * -1531415419;
		maleHeadModels[1] = definition.unknownInt4 * 1578724433;
		if (definition.modifiedModelColors != null) {
			replacementColors = new short[definition.modifiedModelColors.length];
			System.arraycopy(definition.modifiedModelColors, 0, replacementColors, 0, replacementColors.length);
		}
		if (null != definition.modifiedTextureColors) {
			replacementTextures = new short[definition.modifiedTextureColors.length];
			System.arraycopy(definition.modifiedTextureColors, 0, replacementTextures, 0, replacementTextures.length);
		}
	}

	public static CustomizedItem create(ItemDefinition itemDefinition, Buffer buffer) {
			CustomizedItem customized = new CustomizedItem(itemDefinition);
			int attributes = buffer.readUByte();
			boolean models = (attributes & 0x1) != 0;
			boolean headModels = (attributes & 0x2) != 0;
			boolean replacementColors = (attributes & 0x4) != 0;
			boolean replacementTextures = 0 != (attributes & 0x8);
			if (models) {
				customized.femaleModels[0] = buffer.readBigSmart();
				customized.maleModels[0] = buffer.readBigSmart();
				if (-1 != 34210967 * itemDefinition.maleEquip2 || -1 != -1284247975 * itemDefinition.femaleEquip2) {
					customized.femaleModels[1] = buffer.readBigSmart();
					customized.maleModels[1] = buffer.readBigSmart();
				}
				if (itemDefinition.maleEquip3 * 1313278521 != -1 || -1767718263 * itemDefinition.femaleEquip3 != -1) {
					customized.femaleModels[2] = buffer.readBigSmart();
					customized.maleModels[2] = buffer.readBigSmart();
				}
			}
			if (headModels) {
				customized.femaleHeadModels[0] = buffer.readBigSmart();
				customized.maleHeadModels[0] = buffer.readBigSmart();
				if (86274879 * itemDefinition.unknownInt3 != -1 || itemDefinition.unknownInt4 * 1578724433 != -1) {
					customized.femaleHeadModels[1] = buffer.readBigSmart();
					customized.maleHeadModels[1] = buffer.readBigSmart();
				}
			}
			if (replacementColors) {
				int packed = buffer.readUShort();
				int[] parts = new int[4];
				parts[0] = packed & 0xf;
				parts[1] = packed >> 4 & 0xf;
							parts[2] = packed >> 8 & 0xf;
							parts[3] = packed >> 12 & 0xf;
							for (int index = 0; index < 4; index++) {
								if (parts[index] != 15)
									customized.replacementColors[parts[index]] = (short) buffer.readUShort();
							}
			}
			if (replacementTextures) {
				int packed = buffer.readUByte();
				int[] parts = new int[2];
				parts[0] = packed & 0xf;
				parts[1] = packed >> 4 & 0xf;
							for (int index = 0; index < 2; index++) {
								if (15 != parts[index])
									customized.replacementTextures[parts[index]] = (short) buffer.readUShort();
							}
			}
			return customized;
	}
}
