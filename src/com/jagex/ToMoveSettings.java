package com.jagex;

import com.jagex.game.settings.StereoSoundSetting;

/**
 * Created by Krimsonowl on 7/18/2017.
 */
public class ToMoveSettings {
    public static final void updateRoofFlags() {
            int removeRoofValue = SettingsManager.settingsManager.currentRoofs.getValue();
            if (removeRoofValue == 0) {//Always
                System.out.println("Roof Setting: 0");
                GameClient.myRegion.setRoofFlags(null);
                Class136_Sub1.method1502(0);
            } else if (removeRoofValue == 1) {//Selectively
                System.out.println("Roof Setting: 1");
                Class231.setRoofFlags((byte) 0);
                Class136_Sub1.method1502(512);
                if (GameClient.myRegion.getRegion() != null)
                    Class379.method4674();
            } else {//All
                System.out.println("Roof Setting: 2");
                Class231.setRoofFlags((byte) (GameClient.flashTick * -1953789277 - 4 & 0xFF));
                Class136_Sub1.method1502(2);
            }
            GameClient.anInt8792 = GameClient.plane * 832032973;
    }

    static final void method4216() {
        try {
            SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.graphics, 0);
            encodeBuffer();
            GameClient.sentPreferences = false;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("op.anv(").append(')').toString());
        }
    }

    public static Class297 method3913(int i, int i_2_, int i_3_, int i_4_, boolean bool, int i_5_) {
        if ((bool ? SettingsManager.settingsManager.voiceOverVolume.getValue() : SettingsManager.settingsManager.soundEffectsVolume.getValue()) != 0 && i_2_ != 0 && -991384187 * Class300.anInt3213 < 50 && i != -1) {
            Class297 class297 = new Class297(bool ? (byte) 3 : (byte) 2, i, i_2_, i_3_, i_4_, 0, i_5_, null);
            Class300.aClass297Array3214[(Class300.anInt3213 += -598588595) * -991384187 - 1] = class297;
            return class297;
        }
        return null;
    }

    static void method2283() {

            int maxScreenSizeValue = 0;
            if (SettingsManager.settingsManager != null)
                maxScreenSizeValue = SettingsManager.settingsManager.maxScreenSize.getValue();
            if (maxScreenSizeValue == 2) {
                int smallWidth = (-639974669 * GameClient.frameWidth > 800 ? 800 : GameClient.frameWidth * -639974669);
                int smallHeight = (GameClient.frameHeight * 1282634425 > 600 ? 600 : 1282634425 * GameClient.frameHeight);
                GameShell.canvasWidth = -2010408377 * smallWidth;
                GameClient.leftMargin = -753018213 * ((GameClient.frameWidth * -639974669 - smallWidth) / 2);
                GameShell.canvasHeight = 1445266787 * smallHeight;
                GameClient.topMargin = 0;
            } else if (maxScreenSizeValue == 1) {
                int bigWidth = (-639974669 * GameClient.frameWidth > 1024 ? 1024 : GameClient.frameWidth * -639974669);
                int bigHeight = (GameClient.frameHeight * 1282634425 > 768 ? 768 : GameClient.frameHeight * 1282634425);
                GameShell.canvasWidth = bigWidth * -2010408377;
                GameClient.leftMargin = -753018213 * ((-639974669 * GameClient.frameWidth - bigWidth) / 2);
                GameShell.canvasHeight = 1445266787 * bigHeight;
                GameClient.topMargin = 0;
            } else {
                GameShell.canvasWidth = GameClient.frameWidth * -607961243;
                GameClient.leftMargin = 0;
                GameShell.canvasHeight = GameClient.frameHeight * -1935672693;
                GameClient.topMargin = 0;
            }
    }

    public static void encodeBuffer() {
        DiskFile diskFile = null;
        try {
            diskFile = DiskFile.method962("", GameClient.game.BUILD_NAME, true);
            Buffer buffer = SettingsManager.settingsManager.encode();
            diskFile.method6078(buffer.buffer, 0, buffer.offset * 385051775);
        } catch (Exception exception) {

        }
        try {
            if (null != diskFile)
                diskFile.method6079();
        } catch (Exception exception) {

        }
    }

    public static void setDefaultAudio() {
            StaticMethods.method4876(22050, SettingsManager.settingsManager.stereoSound.getValue() == StereoSoundSetting.STEREO, 2);
            Class300.aClass284_3212 = Class75.method834(DirectXContext.canvas, 0, 22050);
            EffectiveVertex.method777(true, Class8.method318(null, -1887308031));
            Minimap.aClass284_68 = Class75.method834(DirectXContext.canvas, 1, 2048);
            Class285.aClass298_Sub19_Sub4_3083 = new Class298_Sub19_Sub4();
            Minimap.aClass284_68.method2679(Class285.aClass298_Sub19_Sub4_3083);
            Class282.aClass270_6546 = new Class270(22050, 1164070869 * Class284.anInt3059);
            StaticMethods.method344();
    }
}
