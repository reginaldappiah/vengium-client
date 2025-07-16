package com.jagex;/* Class223 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.ConfigType;
import com.jagex.game.cache.config.Js5Configs;

public class JS5FileSystemLoader implements FileLoader {
    Js5FileSystem loadingFileSystem;

    JS5FileSystemLoader(Js5FileSystem js5FileSystem) {
        this.loadingFileSystem = js5FileSystem;
    }

    public static final void method2082(boolean bool) {
        if (!bool) {
            StaticMethods.aClass375_6196.clear();
            Class151.aClass451_6358.clear();
            Js5Configs.idkList.clear();
            GameClient.myRegion.getObjectDefinitionLoader().clear();
            NPCDefinitionLoader.npcList.clear();
            Js5Configs.itemList.clear();
            Js5Configs.animsList.clear();
            SpotTypeLoader.loader.clear();
            Class472.configLoader.clear();
            Class440.aClass205_5582.clear();
            StaticMethods.aClass445_8384.clear();
            Class82_Sub16.aClass427_6886.clear();
            Class99.aClass517_951.clear();
            Class299.aClass370_3199.clear();
            Class94.aClass349_913.clear();
            ConfigType.aClass487_1463.clear();
            Class363.aClass339_3931.clear();
            Class92.aClass504_905.clear();
            Js5Configs.configList.clear();
            Class138_Sub1.configs.clear();
            StaticMethods.aClass499_6668.clear();
            Class_na.cursorDefLoader.clear();
            HitsplatDefinitionLoader.aClass347_6117.clear();
            PlayerAppearance.clear();
            Class8.clear();
            StaticMethods5.fonts.clear();
            StaticMethods.method1309();
            if (StaticMethods.aClass401_2708 != Class401.aClass401_6557) {
                for (int i_5_ = 0; i_5_ < Class98.aByteArrayArray949.length; i_5_++)
                    Class98.aByteArrayArray949[i_5_] = null;
                GameClient.anInt8677 = 0;
            }
            GameClient.myRegion.getLightningDetails().clear();
            Class401.clear();
            Class462.clear();
            Class330.clear();
            Class143.clear();
            Class388.cache.clear();
            GameClient.aClass348_8780.clear();
            GameClient.aClass348_8898.clear();
            GameClient.aClass348_8697.clear();
            Class436.aClass348_5500.clear();
        }
        StaticMethods.method4262();
        Class513.method6293();
    }

    public int getProgress() {
        if (this.loadingFileSystem.archiveFilled())
            return 100;
        return this.loadingFileSystem.getProgress();
    }

    public FileType getFileType() {
        return FileType.ARCHIVE;
    }

}
