package com.jagex;/* Class132 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;

public class IdentityKitDefinition {
    public static int[] FEMALE_PARTS = {7, 8, 9, 10, 11, 12, 13, 15};
    public static int[] MALE_PARTS = {0, 1, 2, 3, 4, 5, 6, 14};
    static int anInt1508;
    IdentityKitDefinitionLoader loader;
    short[] originalColours;
    short[] replacementColours;
    short[] originalTextures;
    short[] replacementTextures;
    int[] headModelIDs = {-1, -1, -1, -1, -1};
    int[] identityKitModelIDs;


    IdentityKitDefinition() {
        /* empty */
    }

    static final void setPlayerIdentityKit(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        int slotID = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
        int fileID = (runtime.integerStack[681479919 * runtime.integerStackOffset + 1]);
        if (Player.myPlayer.appearance != null) {
            for (int maleSlotID = 0; maleSlotID < MALE_PARTS.length; maleSlotID++) {
                if (MALE_PARTS[maleSlotID] == slotID) {
                    Player.myPlayer.appearance.setKit(maleSlotID, fileID, Js5Configs.idkList);
                    return;
                }
            }
            for (int femaleSlotID = 0; femaleSlotID < FEMALE_PARTS.length; femaleSlotID++) {
                if (FEMALE_PARTS[femaleSlotID] == slotID) {
                    Player.myPlayer.appearance.setKit(femaleSlotID, fileID, Js5Configs.idkList);
                    break;
                }
            }
        }
    }

    void readValueLoop(Buffer buffer, int i) {
        for (; ; ) {
            int opcode = buffer.readUByte();
            if (0 == opcode) {
                if (i == 1393802809) {
                }
                break;
            }
            decode(buffer, opcode);
        }
    }

    void decode(Buffer buffer, int opcode) {
        if (opcode == 1) {
            buffer.readUByte();
        } else if (opcode == 2) {
            int moodelIDsLength = buffer.readUByte();
            this.identityKitModelIDs = new int[moodelIDsLength];
            for (int modelIDX = 0; modelIDX < moodelIDsLength; modelIDX++)
                this.identityKitModelIDs[modelIDX] = buffer.readBigSmart();
        } else if (40 == opcode) {
            int colorsLength = buffer.readUByte();
            this.originalColours = new short[colorsLength];
            this.replacementColours = new short[colorsLength];
            for (int index = 0; index < colorsLength; index++) {
                this.originalColours[index] = (short) buffer.readUShort();
                this.replacementColours[index] = (short) buffer.readUShort();
            }
        } else if (opcode == 41) {
            int texturesLength = buffer.readUByte();
            this.originalTextures = new short[texturesLength];
            this.replacementTextures = new short[texturesLength];
            for (int textureIDX = 0; textureIDX < texturesLength; textureIDX++) {
                this.originalTextures[textureIDX] = (short) buffer.readUShort();
                this.replacementTextures[textureIDX] = (short) buffer.readUShort();
            }
        } else if (opcode >= 60 && opcode < 70) {
            this.headModelIDs[opcode - 60] = buffer.readBigSmart();
        }
    }

    public BaseModel getConnectedModel() {
            if (this.identityKitModelIDs == null) {
                return null;
            }
            BaseModel[] models = new BaseModel[this.identityKitModelIDs.length];
            synchronized (this.loader.JS5_MODELS) {
                for (int index = 0; index < this.identityKitModelIDs.length; index++)
                    models[index] = BaseModel.load((this.loader.JS5_MODELS), (this.identityKitModelIDs[index]), 0);
            }
            for (int index = 0; index < this.identityKitModelIDs.length; index++) {
                if (models[index].format < 13) {
                    models[index].scaleUp(2);
                }
            }
            BaseModel figure;
            if (models.length == 1) {
                figure = models[0];
            } else {
                figure = new BaseModel(models, models.length);
            }
            if (null == figure) {
                return null;
            }
            if (this.originalColours != null) {
                for (int index = 0; index < this.originalColours.length; index++)
                    figure.recolor(this.originalColours[index], (this.replacementColours[index]));
            }
            if (this.originalTextures != null) {
                for (int index = 0; index < this.originalTextures.length; index++)
                    figure.retexture(this.originalTextures[index], (this.replacementTextures[index]));
            }
            return figure;
    }

    public boolean headModelsExist() {
            boolean headModelsExist = true;
            synchronized (this.loader.JS5_MODELS) {
                for (int index = 0; index < 5; index++) {
                    if (this.headModelIDs[index] != -1 && !(this.loader.JS5_MODELS.fileExists(this.headModelIDs[index], 0))) {
                        headModelsExist = false;
                    }
                }
            }
            return headModelsExist;
    }

    public BaseModel getModel() {
            BaseModel[] models = new BaseModel[5];
            int count = 0;
            synchronized (this.loader.JS5_MODELS) {
                for (int index = 0; index < 5; index++) {
                    if (this.headModelIDs[index] != -1) {
                        models[count++] = BaseModel.load((this.loader.JS5_MODELS), (this.headModelIDs[index]), 0);
                    }
                }
            }
            for (int index = 0; index < 5; index++) {
                if (null != models[index] && models[index].format < 13) {
                    models[index].scaleUp(2);
                }
            }
            BaseModel model = new BaseModel(models, count);
            if (null != this.originalColours) {
                for (int index = 0; index < this.originalColours.length; index++)
                    model.recolor(this.originalColours[index], (this.replacementColours[index]));
            }
            if (null != this.originalTextures) {
                for (int index = 0; index < this.originalTextures.length; index++)
                    model.retexture(this.originalTextures[index], (this.replacementTextures[index]));
            }
            return model;
    }

    public boolean modelsExist() {
            if (null == this.identityKitModelIDs) {
                return true;
            }
            boolean modelsExist = true;
            synchronized (this.loader.JS5_MODELS) {
                for (int index = 0; index < this.identityKitModelIDs.length; index++) {
                    if (!this.loader.JS5_MODELS.fileExists(this.identityKitModelIDs[index], 0)) {
                        modelsExist = false;
                    }
                }
            }
            return modelsExist;
    }
}
