package com.jagex;/* Class477 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.ConfigType;
import com.jagex.game.cache.config.Js5Configs;

public class ItemDefinitionLoader {
    public static Class500 aClass500_6001;
    public static boolean OLD_ITEMS;
    public int itemDefinitionsLength;
    public Class340 aClass340_5995 = new Class340(250);
    String[] groundOptions;
    Class504 aClass504_5989;
    Js5FileSystem JS5_CONFIG_ITEMS;
    int anInt5991;
    Js5FileSystem JS5_MDOELS;
    SoftCache aClass348_5993 = new SoftCache(64);
    SoftCache aClass348_5994 = new SoftCache(50);
    Class465 aClass465_5996 = new Class465();
    GameLanguage language;
    GameContext gameContext;
    boolean aBoolean5999;
    String[] inventoryOptions;

    public ItemDefinitionLoader(GameContext gameContext, GameLanguage language, boolean bool, Class504 class504, Js5FileSystem JS5_CONFIG_ITEMS, Js5FileSystem JS5_MDOELS) {
        this.gameContext = gameContext;
        this.language = language;
        this.aBoolean5999 = bool;
        this.aClass504_5989 = class504;
        this.JS5_CONFIG_ITEMS = JS5_CONFIG_ITEMS;
        this.JS5_MDOELS = JS5_MDOELS;
        if (null != this.JS5_CONFIG_ITEMS) {
            int containerID = this.JS5_CONFIG_ITEMS.getContainerLength() - 1;
            if (true)
                itemDefinitionsLength = 30000 * -1797723349;
            else
                itemDefinitionsLength = (containerID * ConfigType.ITEMS.filesPerContainer() + this.JS5_CONFIG_ITEMS.getFileSystem(containerID)) * -1797723349;
        } else
            itemDefinitionsLength = 0;
        if (this.gameContext == GameContext.VENGIUM)
            this.groundOptions = (new String[]{null, null, Tradution.TAKE.translate((this.language)), null, null, Tradution.EXAMINE.translate((this.language))});
        else
            this.groundOptions = (new String[]{null, null, Tradution.TAKE.translate((this.language)), null, null, null});
        this.inventoryOptions = (new String[]{null, null, null, null, Tradution.DROP.translate((this.language))});
    }

    public static void switchItems(boolean old) {
        if (old == OLD_ITEMS)
            return;
        OLD_ITEMS = old;
        JS5FileSystemLoader.method2082(false);
    }

    static final void method6094(int i) {
        StaticMethods.method3753();
        int i_19_ = (Class440.aClass205_5582.get(i).anInt2359 * -65795773);
        if (0 != i_19_) {
            int i_20_ = Class128.playerVarsProvider.configs[i];
            if (5 == i_19_)
                GameClient.anInt8830 = -941750943 * i_20_;
            if (6 == i_19_)
                GameClient.anInt8842 = i_20_ * 1034265279;
        }
    }

    public static void method6096(Js5FileSystem fileSystem, int i, int i_21_, int i_22_, boolean bool) {
        StaticMethods.method6099(fileSystem, i, i_21_, i_22_, bool, 0L);
    }

    public ItemDefinition getItemDefinitions(int itemID) {
        return getItemDefinitions(itemID, false);
    }

    public ItemDefinition getItemDefinitions(int itemID, boolean forceNew) {
        ItemDefinition itemdefinition;
        if (!forceNew) {
            synchronized (this.aClass348_5993) {
                itemdefinition = (ItemDefinition) this.aClass348_5993.get((long) itemID);
            }
            if (itemdefinition != null)
                return itemdefinition;
        }
        boolean oldItem = false;
        byte[] data = null;
        if (!forceNew && OLD_ITEMS && itemID != 4712) { // disable ahrim body
            data = (this.JS5_CONFIG_ITEMS.getFileFromArchive(ConfigType.ITEMS.getType(itemID + (Js5Configs.itemList.itemDefinitionsLength * -888767613)), ConfigType.ITEMS.getFile(itemID + (Js5Configs.itemList.itemDefinitionsLength * -888767613))));
            oldItem = true;
        }
        if (data == null) {
            synchronized (this.JS5_CONFIG_ITEMS) {
                data = (this.JS5_CONFIG_ITEMS.getFileFromArchive(ConfigType.ITEMS.getType(itemID), ConfigType.ITEMS.getFile(itemID)));
                oldItem = false;
            }
        }
        itemdefinition = new ItemDefinition();
        itemdefinition.itemDefinitionLoader1 = this;
        itemdefinition.itemID = 1824752127 * itemID;
        itemdefinition.groundOptions = this.groundOptions.clone();
        itemdefinition.inventoryOptions = this.inventoryOptions.clone();
        if (null != data)
            itemdefinition.decode(new Buffer(data), oldItem);
        itemdefinition.method6025(16711935);
        if (-1 != itemdefinition.certTemplateID * -1673957995)
            itemdefinition.toCertifcateTemplateModel(getItemDefinitions((itemdefinition.certTemplateID * -1673957995), forceNew), getItemDefinitions(809765849 * itemdefinition.certID, forceNew), 219692629);
        if (itemdefinition.lendTemplateID * 465190555 != -1)
            itemdefinition.toLendTemplateModel(getItemDefinitions(itemdefinition.lendTemplateID * 465190555, forceNew), getItemDefinitions((-783380935 * (itemdefinition.lendID)), forceNew));
        if (-1 != 2083650097 * itemdefinition.unknownValue1)
            itemdefinition.method6036(getItemDefinitions(itemdefinition.unknownValue1 * 2083650097, forceNew), getItemDefinitions((1981372535 * (itemdefinition.unknownValue2)), forceNew), -1733915014);
        if (!this.aBoolean5999 && itemdefinition.membersOnly) {
            itemdefinition.teamID = 0;
            itemdefinition.groundOptions = this.groundOptions;
            itemdefinition.inventoryOptions = this.inventoryOptions;
            itemdefinition.unnoted = false;
            itemdefinition.unknownArray2 = null;
            if (null != itemdefinition.clientScriptData) {
                boolean bool = false;
                for (Node class298 = itemdefinition.clientScriptData.method5816(); class298 != null; class298 = itemdefinition.clientScriptData.method5815()) {
                    Class497 class497 = (this.aClass504_5989.get((int) (class298.key * 7051297995265073167L)));
                    if (class497.aBoolean6102)
                        class298.unlink();
                    else
                        bool = true;
                }
                if (!bool)
                    itemdefinition.clientScriptData = null;
            }
        }
        synchronized (this.aClass348_5993) {
            this.aClass348_5993.put(itemdefinition, (long) itemID);
        }
        return itemdefinition;
    }

    public SpriteToolkit method6085(GraphicsToolkit graphicsToolkit, int i, int i_1_, int i_2_, int i_3_, int i_4_, PlayerAppearance playerAppearance) {
        this.aClass465_5996.anInt6519 = -973477563 * graphicsToolkit.id;
        this.aClass465_5996.anInt6514 = i * 1541800549;
        this.aClass465_5996.anInt6515 = -1199949713 * i_1_;
        this.aClass465_5996.anInt6516 = i_2_ * 29186943;
        this.aClass465_5996.anInt6518 = i_3_ * 1868109305;
        this.aClass465_5996.anInt6517 = i_4_ * 958157807;
        this.aClass465_5996.hasAppearance = null != playerAppearance;
        return (SpriteToolkit) aClass340_5995.method4134(this.aClass465_5996);
    }

    public SpriteToolkit method6086(GraphicsToolkit graphicsToolkit, GraphicsToolkit secondaryGraphicsToolkit, int i, int length, int i_8_, int i_9_, boolean bool, boolean bool_10_, int i_11_, FontToolkit class264, PlayerAppearance playerAppearance) {
        if (!bool_10_) {
            SpriteToolkit spriteToolkit = method6085(secondaryGraphicsToolkit, i, length, i_8_, i_9_, i_11_, playerAppearance);
            if (null != spriteToolkit)
                return spriteToolkit;
        }
        ItemDefinition itemDefinition = getItemDefinitions(i);
        if (length > 1 && itemDefinition.itemIDs != null) {
            int itemID = -1;
            for (int index = 0; index < 10; index++) {
                if (length >= itemDefinition.stackAmounts[index] && 0 != itemDefinition.stackAmounts[index])
                    itemID = itemDefinition.itemIDs[index];
            }
            if (itemID != -1)
                itemDefinition = getItemDefinitions(itemID);
        }
        int[] pixelDataRGB = itemDefinition.rasterize(graphicsToolkit, secondaryGraphicsToolkit, length, i_8_, i_9_, bool, i_11_, class264, playerAppearance);
        if (null == pixelDataRGB)
            return null;
        SpriteToolkit spriteToolkit;
        if (bool_10_)
            spriteToolkit = graphicsToolkit.createRenderSprite(pixelDataRGB, 0, 36, 36, 32);
        else
            spriteToolkit = secondaryGraphicsToolkit.createRenderSprite(pixelDataRGB, 0, 36, 36, 32);
        if (!bool_10_) {
            Class465 class465 = new Class465();
            class465.anInt6519 = -973477563 * secondaryGraphicsToolkit.id;
            class465.anInt6514 = i * 1541800549;
            class465.anInt6515 = length * -1199949713;
            class465.anInt6516 = 29186943 * i_8_;
            class465.anInt6518 = i_9_ * 1868109305;
            class465.anInt6517 = 958157807 * i_11_;
            class465.hasAppearance = null != playerAppearance;
            aClass340_5995.method4127(spriteToolkit, class465);
        }
        return spriteToolkit;
    }

    public void method6087(int i) {
        this.anInt5991 = i * -747694971;
        synchronized (this.aClass348_5994) {
            this.aClass348_5994.clear();
        }
    }

    public void clear() {
        synchronized (this.aClass348_5993) {
            this.aClass348_5993.clear();
        }
        synchronized (this.aClass348_5994) {
            this.aClass348_5994.clear();
        }
        synchronized (aClass340_5995) {
            aClass340_5995.method4132();
        }
    }

    public void clearSpriteCache() {
        synchronized (aClass340_5995) {
            aClass340_5995.method4132();
        }
    }

    public void method6090(int i) {
        synchronized (this.aClass348_5993) {
            this.aClass348_5993.method4186(i);
        }
        synchronized (this.aClass348_5994) {
            this.aClass348_5994.method4186(i);
        }
        synchronized (aClass340_5995) {
            aClass340_5995.method4131(i);
        }
    }

    public void method6091() {
        synchronized (this.aClass348_5994) {
            this.aClass348_5994.clear();
        }
    }

    public void method6092(boolean bool, int i) {
        if (this.aBoolean5999 != bool) {
            this.aBoolean5999 = bool;
            clear();
        }
    }

    public void sweep() {
        synchronized (this.aClass348_5993) {
            this.aClass348_5993.sweep();
        }
        synchronized (this.aClass348_5994) {
            this.aClass348_5994.sweep();
        }
        synchronized (aClass340_5995) {
            aClass340_5995.method4136();
        }
    }
}
