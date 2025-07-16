package com.jagex;/* Class366 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.definition.animation.AnimationDefinition;
import com.jagex.maths.Matrix43f;

public class PlayerAppearance {
    public static short[][][] replacementBodyColors;
    public static short[][] originalBodyColours;
    static int[] IDENTIKIT_EQUIPMENT_SLOTS = {8, 11, 4, 6, 9, 7, 10, 0};
    static SoftCache cache = new SoftCache(260);
    static SoftCache toolkitCache = new SoftCache(5);
    static int anInt3981;
    public int[] bodyColors;
    public int typeID = 993979383;
    public boolean male;
    long key;
    int[] equipment;
    CustomizedItem[] customs;
    long hash;
    int anInt3976;

    public static void method6312(int i) {
        anInt3981 = -1599730439 * i;
        synchronized (toolkitCache) {
            toolkitCache.clear();
        }
        synchronized (cache) {
            cache.clear();
        }
    }

    static void method4547(int i) {
        ConnectionType.lobbyConnection.stopConnection();
        if (-1868526275 * Class525.anInt6297 < 2) {
            Class241.lobbyConnectionInfo.method6058();
            Class525.anInt6295 = 0;
            Class525.anInt6297 += -853495275;
        } else {
            Class525.aClass486_6298 = null;
            Class525.aClass412_6299 = Class412.aClass412_6563;
            Class439.loadGameState(19);
        }

    }

    public static void clear() {
        synchronized (cache) {
            cache.clear();
        }
        synchronized (toolkitCache) {
            toolkitCache.clear();
        }
    }

    public void setKit(int slotID, int fileID, IdentityKitDefinitionLoader loader) {
        int index = IDENTIKIT_EQUIPMENT_SLOTS[slotID];
        if (loader.get(fileID) != null) {
            this.equipment[index] = fileID | ~0x7fffffff;
            computeHash();
        }
    }

    public void setColor(int index, int bodyColor) {
        this.bodyColors[index] = bodyColor;
        computeHash();
    }

    public void setMale(boolean male) {
        try {
            this.male = male;
            computeHash();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pf.p(").append(')').toString());
        }
    }

    public void equip(int slotID, int itemID, ItemDefinitionLoader itemDefinitionLoader) {
        try {
            if (-1 == itemID)
                this.equipment[slotID] = 0;
            else if (itemDefinitionLoader.getItemDefinitions(itemID) != null) {
                this.equipment[slotID] = itemID | 0x40000000;
                computeHash();
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pf.i(").append(')').toString());
        }
    }

    void computeHash() {
        long[] table = Buffer.CRC_64;
        this.hash = -1662367026201571203L;
        this.hash = (1662367026201571203L * (this.hash * 5093099708756449067L >>> 8 ^ table[(int) (((this.hash * 5093099708756449067L) ^ (long) ((this.anInt3976 * 767962207) >> 8)) & 0xffL)]));
        this.hash = (1662367026201571203L * (5093099708756449067L * this.hash >>> 8 ^ table[(int) (((this.hash * 5093099708756449067L) ^ (long) (this.anInt3976 * 767962207)) & 0xffL)]));
        for (int id = 0; id < this.equipment.length; id++) {
            this.hash = (this.hash * 5093099708756449067L >>> 8 ^ table[(int) (((5093099708756449067L * this.hash) ^ (long) ((this.equipment[id]) >> 24)) & 0xffL)]) * 1662367026201571203L;
            this.hash = (1662367026201571203L * ((5093099708756449067L * this.hash >>> 8) ^ table[(int) (((this.hash * 5093099708756449067L) ^ (long) ((this.equipment[id]) >> 16)) & 0xffL)]));
            this.hash = (5093099708756449067L * this.hash >>> 8 ^ table[(int) (((5093099708756449067L * this.hash) ^ (long) ((this.equipment[id]) >> 8)) & 0xffL)]) * 1662367026201571203L;
            this.hash = (this.hash * 5093099708756449067L >>> 8 ^ table[(int) (((this.hash * 5093099708756449067L) ^ (long) (this.equipment[id])) & 0xffL)]) * 1662367026201571203L;
        }
        if (this.customs != null) {
            for (int index = 0; index < this.customs.length; index++) {
                if (this.customs[index] != null) {
                    int[] models;
                    int[] headModels;
                    if (male) {
                        models = (this.customs[index].maleModels);
                        headModels = (this.customs[index].maleHeadModels);
                    } else {
                        models = (this.customs[index].femaleModels);
                        headModels = (this.customs[index].femaleHeadModels);
                    }
                    if (models != null) {
                        for (int i_10_ = 0; i_10_ < models.length; i_10_++) {
                            this.hash = (((this.hash * 5093099708756449067L) >>> 8 ^ table[(int) ((((this.hash) * 5093099708756449067L) ^ (long) (models[i_10_] >> 8)) & 0xffL)]) * 1662367026201571203L);
                            this.hash = (((this.hash * 5093099708756449067L) >>> 8 ^ table[(int) ((((this.hash) * 5093099708756449067L) ^ (long) models[i_10_]) & 0xffL)]) * 1662367026201571203L);
                        }
                    }
                    if (headModels != null) {
                        for (int i_11_ = 0; i_11_ < headModels.length; i_11_++) {
                            this.hash = (1662367026201571203L * ((5093099708756449067L * this.hash) >>> 8 ^ table[(int) (((5093099708756449067L * (this.hash)) ^ (long) (headModels[i_11_] >> 8)) & 0xffL)]));
                            this.hash = (((5093099708756449067L * this.hash) >>> 8 ^ table[(int) ((((this.hash) * 5093099708756449067L) ^ (long) headModels[i_11_]) & 0xffL)]) * 1662367026201571203L);
                        }
                    }
                    if ((this.customs[index].replacementColors) != null) {
                        for (int i_12_ = 0; i_12_ < (this.customs[index].replacementColors).length; i_12_++) {
                            this.hash = (1662367026201571203L * ((this.hash * 5093099708756449067L) >>> 8 ^ (table[(int) (((5093099708756449067L * (this.hash)) ^ (long) ((this.customs[index].replacementColors[i_12_]) >> 8)) & 0xffL)])));
                            this.hash = (1662367026201571203L * ((5093099708756449067L * this.hash) >>> 8 ^ (table[(int) (((5093099708756449067L * (this.hash)) ^ (long) (this.customs[index].replacementColors[i_12_])) & 0xffL)])));
                        }
                    }
                    if (null != (this.customs[index].replacementTextures)) {
                        for (int i_13_ = 0; i_13_ < (this.customs[index].replacementTextures).length; i_13_++) {
                            this.hash = (1662367026201571203L * ((5093099708756449067L * this.hash) >>> 8 ^ (table[(int) (((5093099708756449067L * (this.hash)) ^ (long) ((this.customs[index].replacementTextures[i_13_]) >> 8)) & 0xffL)])));
                            this.hash = (1662367026201571203L * ((5093099708756449067L * this.hash) >>> 8 ^ (table[(int) (((5093099708756449067L * (this.hash)) ^ (long) (this.customs[index].replacementTextures[i_13_])) & 0xffL)])));
                        }
                    }
                }
            }
        }
        for (int part = 0; part < 10; part++)
            this.hash = (1662367026201571203L * ((this.hash * 5093099708756449067L >>> 8) ^ table[(int) (((this.hash * 5093099708756449067L) ^ (long) bodyColors[part]) & 0xffL)]));
        this.hash = (this.hash * 5093099708756449067L >>> 8 ^ table[(int) (((this.hash * 5093099708756449067L) ^ (long) (male ? 1 : 0)) & 0xffL)]) * 1662367026201571203L;
    }

    public ModelToolkit method4543(GraphicsToolkit graphicsToolkit, int animationFlag, IdentityKitDefinitionLoader identityKitDefinitionLoader, NPCDefinitionLoader NPCDefinitionLoader, ItemDefinitionLoader itemDefinitionLoader, Interface23 interface23, Animator animator) {
        if (-1 != typeID * 164936249)
            return (NPCDefinitionLoader.load(typeID * 164936249).method6237(graphicsToolkit, animationFlag, interface23, animator, null));
        int i_16_ = animator != null ? animationFlag | animator.getAnimationFlag() : animationFlag;
        ModelToolkit class387;
        synchronized (toolkitCache) {
            class387 = (ModelToolkit) toolkitCache.get(5093099708756449067L * (this.hash));
        }
        if (class387 == null || graphicsToolkit.method5017(class387.m(), i_16_) != 0) {
            if (null != class387)
                i_16_ = graphicsToolkit.method5004(i_16_, class387.m());
            int i_17_ = i_16_;
            boolean bool = false;
            for (int i_18_ = 0; i_18_ < this.equipment.length; i_18_++) {
                int i_19_ = this.equipment[i_18_];
                CustomizedItem class464 = null;
                if ((i_19_ & 0x40000000) != 0) {
                    if (null != this.customs && (this.customs[i_18_] != null))
                        class464 = this.customs[i_18_];
                    if (!itemDefinitionLoader.getItemDefinitions(i_19_ & 0x3fffffff).method6035(male, class464, (byte) 0))
                        bool = true;
                } else if ((i_19_ & ~0x7fffffff) != 0 && !identityKitDefinitionLoader.get(i_19_ & 0x3fffffff).headModelsExist())
                    bool = true;
            }
            if (bool)
                return null;
            BaseModel[] class64s = new BaseModel[this.equipment.length];
            int i_20_ = 0;
            for (int index = 0; index < this.equipment.length; index++) {
                int modelID = this.equipment[index];
                CustomizedItem customizedItem = null;
                if (0 != (modelID & 0x40000000)) {
                    if (this.customs != null && (this.customs[index] != null))
                        customizedItem = this.customs[index];
                    BaseModel class64 = (itemDefinitionLoader.getItemDefinitions(modelID & 0x3fffffff).method6040(male, customizedItem));
                    if (class64 != null)
                        class64s[i_20_++] = class64;
                } else if ((modelID & ~0x7fffffff) != 0) {
                    BaseModel class64 = identityKitDefinitionLoader.get(modelID & 0x3fffffff).getModel();
                    if (null != class64)
                        class64s[i_20_++] = class64;
                }
            }
            BaseModel class64 = new BaseModel(class64s, i_20_);
            i_17_ |= 0x4000;
            class387 = graphicsToolkit.creatModelToolkit(class64, i_17_, anInt3981 * 1931277641, 64, 768);
            for (int i_23_ = 0; i_23_ < 10; i_23_++) {
                for (int i_24_ = 0; i_24_ < originalBodyColours[i_23_].length; i_24_++) {
                    if (bodyColors[i_23_] < (replacementBodyColors[i_23_][i_24_]).length)
                        class387.X(originalBodyColours[i_23_][i_24_], (replacementBodyColors[i_23_][i_24_][bodyColors[i_23_]]));
                }
            }
            class387.KA(i_16_);
            synchronized (toolkitCache) {
                toolkitCache.put(class387, (this.hash * 5093099708756449067L));
            }
        }
        if (null == animator)
            return class387;
        ModelToolkit modelToolkit = class387.method4755((byte) 4, i_16_, true);
        animator.animate(modelToolkit, 0);
        return modelToolkit;
    }

    public ModelToolkit method4544(GraphicsToolkit graphicsToolkit, int i, IdentityKitDefinitionLoader identityKitLoader, Animator animator, int headModelID1, int headModelID2, int headModelID3) {
        try {
            int i_30_ = animator != null ? i | animator.getAnimationFlag() : i;
            long key = (long) headModelID3 << 32 | (long) (headModelID2 << 16) | (long) headModelID1;
            ModelToolkit modelToolkit;
            synchronized (toolkitCache) {
                modelToolkit = (ModelToolkit) toolkitCache.get(key);
            }
            do {
                if (modelToolkit == null || graphicsToolkit.method5017(modelToolkit.m(), i_30_) != 0) {
                    if (null != modelToolkit)
                        i_30_ = graphicsToolkit.method5004(i_30_, modelToolkit.m());
                    int i_31_ = i_30_;
                    BaseModel[] headModels = new BaseModel[3];
                    int offset = 0;
                    if (identityKitLoader.get(headModelID1).headModelsExist() && identityKitLoader.get(headModelID2).headModelsExist() && identityKitLoader.get(headModelID3).headModelsExist()) {
                        BaseModel model = identityKitLoader.get(headModelID1).getModel();
                        if (model != null)
                            headModels[offset++] = model;
                        model = identityKitLoader.get(headModelID2).getModel();
                        if (model != null)
                            headModels[offset++] = model;
                        model = identityKitLoader.get(headModelID3).getModel();
                        if (null != model)
                            headModels[offset++] = model;
                        model = new BaseModel(headModels, offset);
                        i_31_ |= 0x4000;
                        modelToolkit = graphicsToolkit.creatModelToolkit(model, i_31_, 1931277641 * anInt3981, 64, 768);
                        for (int index = 0; index < 10; index++) {
                            for (int index2 = 0; index2 < originalBodyColours[index].length; index2++) {
                                if (bodyColors[index] < (replacementBodyColors[index][index2]).length)
                                    modelToolkit.X((originalBodyColours[index][index2]), (replacementBodyColors[index][index2][bodyColors[index]]));
                            }
                        }
                        modelToolkit.KA(i_30_);
                        synchronized (toolkitCache) {
                            toolkitCache.put(modelToolkit, key);
                            break;
                        }
                    }
                    return null;
                }
            } while (false);
            if (animator == null)
                return modelToolkit;
            modelToolkit = modelToolkit.method4755((byte) 4, i_30_, true);
            animator.animate(modelToolkit, 0);
            return modelToolkit;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pf.posX(").append(')').toString());
        }
    }

    public ModelToolkit method4545(GraphicsToolkit graphicsToolkit, int initialMask, Class349 class349, IdentityKitDefinitionLoader idKitDefinitionLoader, NPCDefinitionLoader npcloader, ItemDefinitionLoader itemDefinitionLoader, Interface23 interface23, Animator animator, Animator animator_35_, Animator[] animators, int[] is, int i_36_, boolean bool, EquipmentDefaults equipmentDefaults) {
        try {
            if (typeID * 164936249 != -1)
                return (npcloader.load(typeID * 164936249).method6246(graphicsToolkit, initialMask, class349, interface23, animator, animator_35_, animators, is, i_36_, null));
            int functionMask = initialMask;
            long key = this.hash * 5093099708756449067L;
            int[] usedEquipment = this.equipment;
            boolean bool_40_ = false;
            boolean bool_41_ = false;
            if (null != animator) {
                AnimationDefinition animation = animator.getAnimationDefinition();
                if (null != animation && (609841829 * animation.offhand >= 0 || 1548903495 * animation.mainhand >= 0)) {
                    usedEquipment = new int[this.equipment.length];
                    for (int part = 0; part < usedEquipment.length; part++)
                        usedEquipment[part] = this.equipment[part];
                    if (animation.offhand * 609841829 >= 0 && -1 != -817429509 * equipmentDefaults.offhandSlot) {
                        bool_40_ = true;
                        if (65535 == animation.offhand * 609841829) {
                            usedEquipment[-817429509 * equipmentDefaults.offhandSlot] = 0;
                            for (int slotID = 0; slotID < equipmentDefaults.defaultSlots.length; slotID++)
                                usedEquipment[equipmentDefaults.defaultSlots[slotID]] = 0;
                            key ^= ~0xffffffffL;
                        } else {
                            usedEquipment[-817429509 * equipmentDefaults.offhandSlot] = 609841829 * animation.offhand | 0x40000000;
                            for (int slotID = 0; slotID < equipmentDefaults.defaultSlots.length; slotID++)
                                usedEquipment[equipmentDefaults.defaultSlots[slotID]] = 0;
                            key ^= (long) usedEquipment[(equipmentDefaults.offhandSlot * -817429509)] << 32;
                        }
                    }
                    if (1548903495 * animation.mainhand >= 0 && -1 != equipmentDefaults.weaponSlot * -2126257265) {
                        bool_41_ = true;
                        if (animation.mainhand * 1548903495 == 65535) {
                            usedEquipment[-2126257265 * equipmentDefaults.weaponSlot] = 0;
                            for (int i_45_ = 0; i_45_ < equipmentDefaults.hiddenAnimationOffhandSlots.length; i_45_++)
                                usedEquipment[equipmentDefaults.hiddenAnimationOffhandSlots[i_45_]] = 0;
                            key ^= 0xffffffffL;
                        } else {
                            usedEquipment[-2126257265 * equipmentDefaults.weaponSlot] = 1548903495 * animation.mainhand | 0x40000000;
                            for (int i_46_ = 0; i_46_ < equipmentDefaults.hiddenAnimationOffhandSlots.length; i_46_++)
                                usedEquipment[equipmentDefaults.hiddenAnimationOffhandSlots[i_46_]] = 0;
                            key ^= (long) (usedEquipment[-2126257265 * equipmentDefaults.weaponSlot]);
                        }
                    }
                }
            }
            boolean bool_47_ = false;
            int i_48_ = null != animators ? animators.length : 0;
            for (int i_49_ = 0; i_49_ < i_48_; i_49_++) {
                if (animators[i_49_] != null) {
                    functionMask |= animators[i_49_].getAnimationFlag();
                    bool_47_ = true;
                }
            }
            if (null != animator) {
                functionMask |= animator.getAnimationFlag();
                bool_47_ = true;
            }
            if (null != animator_35_) {
                functionMask |= animator_35_.getAnimationFlag();
                bool_47_ = true;
            }
            boolean bool_50_ = false;
            if (is != null) {
                for (int i_51_ = 0; i_51_ < is.length; i_51_++) {
                    if (is[i_51_] != -1) {
                        functionMask |= 0x20;
                        bool_50_ = true;
                    }
                }
            }
            ModelToolkit modelToolkit;
            synchronized (cache) {
                modelToolkit = (ModelToolkit) cache.get(key);
            }
            Class350 class350 = null;
            if (this.anInt3976 * 767962207 != -1)
                class350 = class349.method4202((this.anInt3976 * 767962207), (byte) 29);
            if (null == modelToolkit || graphicsToolkit.method5017(modelToolkit.m(), functionMask) != 0) {
                if (null != modelToolkit)
                    functionMask = graphicsToolkit.method5004(functionMask, modelToolkit.m());
                int i_52_ = functionMask;
                boolean bool_53_ = false;
                for (int i_54_ = 0; i_54_ < usedEquipment.length; i_54_++) {
                    int i_55_ = usedEquipment[i_54_];
                    CustomizedItem class464 = null;
                    boolean bool_56_ = false;
                    if (bool_40_) {
                        if (-817429509 * equipmentDefaults.offhandSlot == i_54_)
                            bool_56_ = true;
                        else {
                            for (int i_57_ = 0; i_57_ < equipmentDefaults.defaultSlots.length; i_57_++) {
                                if (equipmentDefaults.defaultSlots[i_57_] == i_54_) {
                                    bool_56_ = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (bool_41_) {
                        if (i_54_ == -2126257265 * equipmentDefaults.weaponSlot)
                            bool_56_ = true;
                        else {
                            for (int i_58_ = 0; i_58_ < equipmentDefaults.hiddenAnimationOffhandSlots.length; i_58_++) {
                                if (equipmentDefaults.hiddenAnimationOffhandSlots[i_58_] == i_54_) {
                                    bool_56_ = true;
                                    break;
                                }
                            }
                        }
                    }
                    if ((i_55_ & 0x40000000) != 0) {
                        if (!bool_56_ && null != this.customs && (this.customs[i_54_] != null))
                            class464 = this.customs[i_54_];
                        if (!itemDefinitionLoader.getItemDefinitions(i_55_ & 0x3fffffff).method6034(male, class464))
                            bool_53_ = true;
                    } else if ((i_55_ & ~0x7fffffff) != 0 && !idKitDefinitionLoader.get(i_55_ & 0x3fffffff).modelsExist())
                        bool_53_ = true;
                }
                if (bool_53_) {
                    if (-1L != (4366628042331861927L * this.key)) {
                        synchronized (cache) {
                            modelToolkit = (ModelToolkit) (cache.get(4366628042331861927L * this.key));
                        }
                    }
                    if (null == modelToolkit || graphicsToolkit.method5017(modelToolkit.m(), functionMask) != 0)
                        return null;
                } else {
                    BaseModel[] models = new BaseModel[usedEquipment.length];
                    for (int i_59_ = 0; i_59_ < usedEquipment.length; i_59_++) {
                        int i_60_ = usedEquipment[i_59_];
                        CustomizedItem customizedItem = null;
                        boolean bool_61_ = 5 == i_59_ && bool_40_ || i_59_ == 3 && bool_41_;
                        if (0 != (i_60_ & 0x40000000)) {
                            if (!bool_61_ && null != this.customs && (this.customs[i_59_] != null))
                                customizedItem = (this.customs[i_59_]);
                            BaseModel itemModels = (itemDefinitionLoader.getItemDefinitions(i_60_ & 0x3fffffff).method6028(male, customizedItem));
                            if (null != itemModels)
                                models[i_59_] = itemModels;
                        } else if (0 != (i_60_ & ~0x7fffffff)) {
                            BaseModel figure = idKitDefinitionLoader.get(i_60_ & 0x3fffffff).getConnectedModel();
                            if (null != figure)
                                models[i_59_] = figure;
                        }
                    }
                    if (class350 != null && null != class350.anIntArrayArray3710) {
                        for (int i_62_ = 0; i_62_ < class350.anIntArrayArray3710.length; i_62_++) {
                            if (models[i_62_] != null) {
                                int i_63_ = 0;
                                int i_64_ = 0;
                                int i_65_ = 0;
                                int i_66_ = 0;
                                int i_67_ = 0;
                                int i_68_ = 0;
                                if (null != class350.anIntArrayArray3710[i_62_]) {
                                    i_63_ = (class350.anIntArrayArray3710[i_62_][0]);
                                    i_64_ = (class350.anIntArrayArray3710[i_62_][1]);
                                    i_65_ = (class350.anIntArrayArray3710[i_62_][2]);
                                    i_66_ = (class350.anIntArrayArray3710[i_62_][3]) << 3;
                                    i_67_ = (class350.anIntArrayArray3710[i_62_][4]) << 3;
                                    i_68_ = (class350.anIntArrayArray3710[i_62_][5]) << 3;
                                }
                                if (0 != i_66_ || i_67_ != 0 || i_68_ != 0)
                                    models[i_62_].method754(i_66_, i_67_, i_68_);
                                if (0 != i_63_ || 0 != i_64_ || i_65_ != 0)
                                    models[i_62_].translate(i_63_, i_64_, i_65_);
                            }
                        }
                    }
                    BaseModel baseModel = new BaseModel(models, models.length);
                    i_52_ |= 0x4000;
                    modelToolkit = graphicsToolkit.creatModelToolkit(baseModel, i_52_, 1931277641 * anInt3981, 64, 850);
                    for (int i_69_ = 0; i_69_ < 10; i_69_++) {
                        for (int i_70_ = 0; i_70_ < originalBodyColours[i_69_].length; i_70_++) {
                            if (bodyColors[i_69_] < (replacementBodyColors[i_69_][i_70_]).length)
                                modelToolkit.X(originalBodyColours[i_69_][i_70_], (replacementBodyColors[i_69_][i_70_][bodyColors[i_69_]]));
                        }
                    }
                    if (bool) {
                        modelToolkit.KA(functionMask);
                        synchronized (cache) {
                            cache.put(modelToolkit, key);
                        }
                        this.key = key * -2813682692256545769L;
                    }
                }
            }
            ModelToolkit class387_71_ = modelToolkit.method4755((byte) 4, functionMask, true);
            if (!bool_47_ && !bool_50_)
                return class387_71_;
            Matrix43f[] transformationMatrices = null;
            if (class350 != null)
                transformationMatrices = class350.method4207((byte) 92);
            if (bool_50_ && transformationMatrices != null) {
                for (int i_72_ = 0; i_72_ < is.length; i_72_++) {
                    if (null != transformationMatrices[i_72_])
                        class387_71_.method4741(transformationMatrices[i_72_], 1 << i_72_, true);
                }
            }
            int i_73_ = 0;
            int i_74_ = 1;
            while (i_73_ < i_48_) {
                if (null != animators[i_73_])
                    animators[i_73_].method5830(class387_71_, 0, i_74_);
                i_73_++;
                i_74_ <<= 1;
            }
            if (bool_50_) {
                for (i_73_ = 0; i_73_ < is.length; i_73_++) {
                    if (-1 != is[i_73_]) {
                        i_74_ = is[i_73_] - i_36_;
                        i_74_ &= 0x3fff;
                        Matrix43f matrix43f = new Matrix43f();
                        matrix43f.method2473(0.0F, 1.0F, 0.0F, CircleAngleTable.toDegrees(i_74_));
                        class387_71_.method4741(matrix43f, 1 << i_73_, false);
                    }
                }
            }
            if (bool_50_ && transformationMatrices != null) {
                for (i_73_ = 0; i_73_ < is.length; i_73_++) {
                    if (transformationMatrices[i_73_] != null)
                        class387_71_.method4741(transformationMatrices[i_73_], 1 << i_73_, false);
                }
            }
            if (animator != null && null != animator_35_)
                StaticMethods.method4929(class387_71_, animator, animator_35_);
            else if (null != animator)
                animator.animate(class387_71_, 0);
            else if (null != animator_35_)
                animator_35_.animate(class387_71_, 0);
            return class387_71_;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pf.d(").append(')').toString());
        }
    }

    public void update(int i, int[] equpmentItems, CustomizedItem[] customizedItems, int[] bodyColours, boolean male, int npc) {
        if (i != this.anInt3976 * 767962207)
            this.anInt3976 = -698667105 * i;
        this.equipment = equpmentItems;
        this.customs = customizedItems;
        this.bodyColors = bodyColours;
        this.male = male;
        this.typeID = -993979383 * npc;
        computeHash();
    }
}
