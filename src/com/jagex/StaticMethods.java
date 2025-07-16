package com.jagex;

import com.jagex.game.cache.config.ConfigType;
import com.jagex.game.cache.config.Js5Configs;
import com.jagex.game.cache.config.prefetch.Js5List;
import com.jagex.game.cache.config.quest.QuestType;
import com.jagex.game.cache.definition.animation.AnimationDefinition;
import com.jagex.game.settings.RemoveRoofsSetting;
import com.jagex.game.settings.StereoSoundSetting;
import com.jagex.game.settings.TextureSetting;
import com.jagex.maths.Matrix4f;
import com.jagex.network.OutgoingPacket;
import com.jagex.utils.CameraUtils;
import com.jagex.utils.ColorUtils;
import com.jagex.utils.StringUtils;
import com.jagex.utils.TimeUtils;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.image.PixelGrabber;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Krimsonowl on 7/8/2017.
 */
public class StaticMethods {
    public static Class381 aClass381_1563;
    public static int anInt5190;
    public static ClanChannelChat aClanChannelChat_4084;
    public static Class377 aClass377_5519;
    public static int anInt3190;
    public static int[][] cutsceneXTEAS;
    public static Class469 aClass469_5618;
    public static int anInt8400;
    public static int anInt689;
    public static int anInt6059;
    public static Class445 aClass445_8384;
    public static boolean aBoolean8385;
    public static String[] interfaceGCString;
    public static RSFontMetrics aClass505_8369;
    public static FontToolkit aClass264_3673;
    public static int anInt3674;
    public static int anInt6292;
    public static int anInt2099;
    public static int anInt3630;
    public static OverlayDefinitionLoader aClass375_6196;
    public static int anInt4128;
    public static Class7[] aClass7Array6846;
    public static Class494 aClass494_6550;
    public static Class225 aClass225_2337;
    public static Class401 aClass401_2708;
    public static IComponentDefinition aClass105_1373;
    public static Class499 aClass499_6668;
    public static int anInt3918;
    public static int anInt275;
    public static FontToolkit b12_full_monochrome;
    public static int anInt1321;
    public static String aString1369;
    public static int anInt6667;
    protected static BufferedFile[] aBufferedFileArray6106;
    static SpriteToolkit activeSpriteToolkit;
    static RSFontMetrics aClass505_2420;
    static Class354 aClass354_5218 = new Class354(128);
    static SpriteToolkit[] aClass57Array5334;
    static int addressHash;
    static int anInt3192;
    static int anInt5681;
    static Sprite aClass89_8437;
    static Class298_Sub13 aClass298_Sub13_5337;
    static Class4 aClass4_6525;
    static Queue mouseRecordsQueue = new LinkedList();
    static int anInt4120 = 0;
    static Class374_Sub2 aClass374_Sub2_4121 = new Class374_Sub2();
    static boolean aBoolean4122 = true;
    static long sentDifferenciator = 7881601697932874601L;
    static Class374_Sub1 aClass374_Sub1_4125 = new Class374_Sub1();
    static Stream aStream_8414;
    static int[] anIntArray8372;
    static short aShort5193;
    static boolean aBoolean5196;
    static Class396 aClass396_6291;
    static int[] anIntArray9891 = {16, 32, 64, 128};
    static int[] anIntArray9890 = {1, 2, 4, 8};
    static Sprite aClass89_6932;
    static int anInt6938;
    static boolean aBoolean3631 = false;
    static SpriteToolkit spriteToolkit;
    static SpriteToolkit[] aClass57Array5351;
    static Sprite aClass89_4142;
    static String mouseHoverString;
    static int anInt6842;
    static Class320 aClass320_6548 = new Class320(0);
    static int anInt6663;
    static int anInt2706;
    static int anInt950;
    static Class479[] aClass479Array6311;
    static MenuOption aMenuOption_3322;
    static int anInt3323;
    static int anInt7398;
    static Class4 aClass4_2795;
    static SpriteToolkit[] aClass57Array6861;

    static final void method5622() {
        try {
            Class82_Sub18.method922();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rm.ags(").append(')').toString());
        }
    }

    public static void method1481() {
        try {
            aClass374_Sub1_4125.method4614();
            aClass374_Sub2_4121.method4614();
            sentDifferenciator = 7881601697932874601L;
            aBoolean4122 = true;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fi.b(").append(')').toString());
        }
    }

    static SpriteToolkit getSprite(byte[] data) {
        try {
            if (null == data)
                throw new RuntimeException("");
            SpriteToolkit sprite;
            for (; ; ) {
                try {
                    Image image = Toolkit.getDefaultToolkit().createImage(data);
                    MediaTracker mediatracker = new MediaTracker(GameClient.applet);
                    mediatracker.addImage(image, 0);
                    mediatracker.waitForAll();
                    int i_2_ = image.getWidth(GameClient.applet);
                    int i_3_ = image.getHeight(GameClient.applet);
                    if (mediatracker.isErrorAny() || i_2_ < 0 || i_3_ < 0)
                        throw new RuntimeException("");
                    int[] is_4_ = new int[i_3_ * i_2_];
                    PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, i_2_, i_3_, is_4_, 0, i_2_);
                    pixelgrabber.grabPixels();
                    sprite = GameClient.activeGraphicsToolkit.createRenderSprite(is_4_, 0, i_2_, i_2_, i_3_);
                    break;
                } catch (InterruptedException interruptedexception) {
                    /* empty */
                }
            }
            return sprite;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jl.i(").append(')').toString());
        }
    }

    public static void method2085(String[] strings, short[] is) {
        try {
            StringUtils.method946(strings, is, 0, strings.length - 1);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jl.a(").append(')').toString());
        }
    }

    public static void method4884(int i, int i_27_, int i_28_, int i_29_, ObjectDefinition objectDefinition, NPC npc, Player player) {
        NotDefinition definition = new NotDefinition();
        definition.anInt7424 = 2135210127 * i;
        definition.anInt7425 = -7217919 * (i_27_ << 9);
        definition.anInt7423 = (i_28_ << 9) * 584186023;
        if (objectDefinition != null) {
            definition.objectDefinition = objectDefinition;
            int sizeX = objectDefinition.sizeX * -1125834887;
            int sizeY = objectDefinition.sizeY * -565161399;
            if (i_29_ == 1 || i_29_ == 3) {
                sizeX = objectDefinition.sizeY * -565161399;
                sizeY = objectDefinition.sizeX * -1125834887;
                // System.out.println("SizeX: " + sizeX + " SizeY:" +
                // sizeY);
            }
            // System.out.println("Var 1: " + i_27_+ ", Var 2: " +i_28_ + ", Var
            // 3: " +i_29_);
            definition.anInt7427 = 305826635 * (i_27_ + sizeX << 9);
            definition.anInt7428 = -1647445571 * (i_28_ + sizeY << 9);
            definition.anInt7443 = 128561991 * objectDefinition.anInt5422;
            definition.aBoolean7444 = objectDefinition.aBoolean5426;
            definition.anInt7430 = 1644605369 * (-161350689 * objectDefinition.anInt5408 << 9);
            definition.anInt7449 = objectDefinition.anInt5425 * -1807698503;
            definition.anInt7450 = objectDefinition.anInt5427 * 763489431;
            definition.anInt7422 = objectDefinition.anInt5428 * 1972784599;
            definition.anIntArray7432 = objectDefinition.anIntArray5429;
            definition.aBoolean7451 = objectDefinition.aBoolean5395;
            definition.anInt7452 = -1937096719 * objectDefinition.anInt5439;
            definition.anInt7441 = 1100795 * objectDefinition.anInt5438;
            definition.anInt7429 = 406226903 * (-282587873 * objectDefinition.anInt5437 << 9);
            if (null != objectDefinition.objectIDs) {
                definition.aBoolean7437 = true;
                definition.method3519();
            }
            if (null != definition.anIntArray7432)
                definition.anInt7454 = (((-15898815 * definition.anInt7450) + (int) (Math.random() * (double) ((-1398300237 * definition.anInt7422) - (-15898815 * (definition.anInt7450))))) * 950219665);
            NotDefinition.aClass453_7421.pushBack(definition);
        } else if (npc != null) {
            definition.npc = npc;
            NPCDefinition class503 = npc.aClass503_10190;
            if (null != class503.morphisms) {
                definition.aBoolean7437 = true;
                class503 = class503.morph(Class128.playerVarsProvider);
            }
            if (class503 != null) {
                definition.anInt7427 = 305826635 * (class503.tileSpacesOccupied * -2095128707 + i_27_ << 9);
                definition.anInt7428 = (-1647445571 * (i_28_ + -2095128707 * class503.tileSpacesOccupied << 9));
                definition.anInt7443 = method1398(npc) * 502744039;
                definition.aBoolean7444 = class503.aBoolean6180;
                definition.anInt7430 = (class503.anInt6140 * 1525111487 << 9) * 1644605369;
                definition.anInt7449 = -1283486135 * class503.anInt6179;
                definition.anInt7452 = 1142643823 * class503.anInt6161;
                definition.anInt7441 = 1682293055 * class503.anInt6190;
                definition.anInt7429 = (-1422618341 * class503.anInt6175 << 9) * 406226903;
            }
            NotDefinition.aClass453_7455.pushBack(definition);
        } else if (null != player) {
            definition.player = player;
            definition.anInt7427 = ((i_27_ + player.getSize()) << 9) * 305826635;
            definition.anInt7428 = ((i_28_ + player.getSize()) << 9) * -1647445571;
            definition.anInt7443 = method4652(player) * 502744039;
            definition.aBoolean7444 = player.isNPCTransformed;
            definition.anInt7430 = (780357347 * player.transformedNPCID << 9) * 1644605369;
            definition.anInt7449 = -1138033583 * player.anInt10215;
            definition.anInt7452 = -1197363456;
            definition.anInt7441 = -900102912;
            definition.anInt7429 = 0;
            NotDefinition.aClass437_7440.connect(definition, (long) (player.entityIndex * 1888274983));
        }
    }

    static int method4888(int i, int i_45_) {
        double d = Math.log((double) i_45_) / Math.log(2.0);
        double d_47_ = Math.log((double) i) / Math.log(2.0);
        double d_48_ = Math.random() * (d - d_47_) + d_47_;
        return (int) (Math.pow(2.0, d_48_) + 0.5);
    }

    static Entity method4886(int i, int i_34_, int i_35_) {
        Class326 class326 = (GameClient.myRegion.getRegion().gameSceneBase[i][i_34_][i_35_]);
        if (class326 == null)
            return null;
        Entity class365_sub1_sub1_sub2 = null;
        int i_37_ = -1;
        for (Class322 class322 = class326.aClass322_3456; class322 != null; class322 = class322.aClass322_3360) {
            Class365_Sub1_Sub1 class365_sub1_sub1 = class322.aClass365_Sub1_Sub1_3359;
            if (class365_sub1_sub1 instanceof Entity) {
                Entity class365_sub1_sub1_sub2_38_ = (Entity) class365_sub1_sub1;
                int i_39_ = ((class365_sub1_sub1_sub2_38_.getSize() - 1) * 256 + 252);
                Vector3f class217 = (class365_sub1_sub1_sub2_38_.getWorldTransform().trans);
                int i_40_ = (int) class217.x - i_39_ >> 9;
                int i_41_ = (int) class217.z - i_39_ >> 9;
                int i_42_ = i_39_ + (int) class217.x >> 9;
                int i_43_ = i_39_ + (int) class217.z >> 9;
                if (i_40_ <= i_34_ && i_41_ <= i_35_ && i_42_ >= i_34_ && i_43_ >= i_35_) {
                    int i_44_ = (1 + i_42_ - i_34_) * (i_43_ + 1 - i_35_);
                    if (i_44_ > i_37_) {
                        class365_sub1_sub1_sub2 = class365_sub1_sub1_sub2_38_;
                        i_37_ = i_44_;
                    }
                }
            }
        }
        return class365_sub1_sub1_sub2;
    }

    static void method4403() {
        try {
            if (SettingsManager.settingsManager.aClass422_Sub21_7580.getValue() == 1)
                Class62.aClass248_612.method2385(new MapLoadBuffer(MapLoad.aClass266_2852, null), -1108671657);
            else {
                GameClient.myRegion.method2667();
                InputStream_Sub1.method273();
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("adp.v(").append(')').toString());
        }
    }

    static void method6170() {
        try {
            if (1090452523 * GameShell.availableCPU > 1)
                SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.cpu, 4);
            else
                SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.cpu, 2);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ue.q(").append(')').toString());
        }
    }

    static boolean method6169(int i) {
        try {
            return (i == 59 || i == 2 || i == 8 || i == 17 || 15 == i || 16 == i || 58 == i);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ue.bh(").append(')').toString());
        }
    }

    static void method3686(long milli) {
        try {
            Class490.calendar.setTime(new Date(milli));
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mm.k(").append(')').toString());
        }
    }

    public static void method3687(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, String string) {
        try {
            TileMessage message = new TileMessage();
            message.plane = i * 1025727709;
            message.x = 862924059 * i_8_;
            message.y = i_9_ * -1389157181;
            message.anInt7655 = (i_11_ + GameClient.clientTick * 443738891) * -1019659005;
            message.height = i_10_ * 274200991;
            message.message = string;
            message.color = i_12_ * 334332979;
            GameClient.aClass442_8650.method5870(message, 1639821588);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mm.nv(").append(')').toString());
        }
    }

    static void method6314(int i) {
        try {
            if (SettingsManager.settingsManager.customCursors.getValue() == 0)
                i = -1;
            if (GameClient.anInt8834 * 1396956439 != i) {
                if (-1 != i) {
                    Class492 class492 = Class_na.cursorDefLoader.method6172(i, 16711935);
                    Sprite class89 = class492.method6181(1479362312);
                    if (class89 != null) {
                        Class82_Sub23.aClass295_6921.method2828(DirectXContext.canvas, class89.argb(), class89.getScaleWidth(), class89.getScaleHeight(), new Point(class492.anInt6084 * -1954213555, -326899251 * class492.anInt6081));
                        GameClient.anInt8834 = -766301529 * i;
                    } else
                        i = -1;
                }
                if (i == -1 && GameClient.anInt8834 * 1396956439 != -1) {
                    Class82_Sub23.aClass295_6921.method2828((DirectXContext.canvas), null, -1, -1, new Point());
                    GameClient.anInt8834 = 766301529;
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("vu.gv(").append(')').toString());
        }
    }

    public static boolean method6313(int i) {
        try {
            for (MenuOption menuOption = ((MenuOption) Class436.aClass453_5480.method5939()); null != menuOption; menuOption = ((MenuOption) Class436.aClass453_5480.method5944())) {
                if (Class302.method3716((menuOption.componentID * 946432351)) && ((long) i == (menuOption.primary) * 2236412381003659263L))
                    return true;
            }
            return false;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("vu.j(").append(')').toString());
        }
    }

    static void method50123() {
        try {
            Class var_class = ClassLoader.class;
            Field field = var_class.getDeclaredField("nativeLibraries");
            Class var_class_124_ = java.lang.reflect.AccessibleObject.class;
            Method method = var_class_124_.getDeclaredMethod("setAccessible", (new Class[]{Boolean.TYPE}));
            method.invoke(field, Boolean.TRUE);
        } catch (Throwable throwable) {
            /* empty */
        }
    }

    static boolean method4907(int i) {
        try {
            if (i == 3 || 4 == i || 5 == i || 6 == i || i == 1001 || 1002 == i)
                return true;
            return 2 == i;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qj.bu(").append(')').toString());
        }
    }

    static final void method4906(ScriptRuntime runtime) {
        try {
            runtime.integerStackOffset -= -1175642067;
            int i_8_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
            int i_9_ = (runtime.integerStack[1 + runtime.integerStackOffset * 681479919]);
            int i_10_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 2]);
            Class301_Sub1.method3713(10, i_8_ << 16 | i_9_, i_10_, "");
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qj.alu(").append(')').toString());
        }
    }

    static void method372(Buffer buffer) {
        try {
            int length = buffer.readUnsignedSmart();
            Class52_Sub2_Sub1_Sub1.aClass353Array9987 = new Class353[length];
            for (int i_1_ = 0; i_1_ < length; i_1_++) {
                Class52_Sub2_Sub1_Sub1.aClass353Array9987[i_1_] = new Class353();
                Class52_Sub2_Sub1_Sub1.aClass353Array9987[i_1_].anInt3820 = buffer.readUnsignedSmart() * -801041135;
                Class52_Sub2_Sub1_Sub1.aClass353Array9987[i_1_].aString3819 = buffer.readJagString();
            }
            anInt5190 = buffer.readUnsignedSmart() * 457295123;
            anInt3630 = buffer.readUnsignedSmart() * -924756647;
            Class24.anInt9950 = buffer.readUnsignedSmart() * 412440447;
            Class131.aClass343_Sub1Array1498 = new Class343_Sub1[(anInt3630 * -499146007 - -1648308965 * anInt5190 + 1)];
            for (int i_2_ = 0; i_2_ < 1017276543 * Class24.anInt9950; i_2_++) {
                int i_3_ = buffer.readUnsignedSmart();
                Class343_Sub1 class343_sub1 = (Class131.aClass343_Sub1Array1498[i_3_] = new Class343_Sub1());
                class343_sub1.anInt3672 = buffer.readUByte() * 672848077;
                class343_sub1.anInt3670 = buffer.readInt() * -743493231;
                class343_sub1.anInt7717 = -72535113 * (anInt5190 * -1648308965 + i_3_);
                class343_sub1.aString7719 = buffer.readJagString();
                class343_sub1.aString7718 = buffer.readJagString();
            }
            Class117.anInt1399 = buffer.readInt() * -1232164675;
            aBoolean3631 = true;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aw.b(").append(')').toString());
        }
    }

    static void method5676(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
        try {
            int i_9_ = 0;
            int i_10_ = i_4_;
            int i_11_ = 0;
            int i_12_ = i_3_ - i_7_;
            int i_13_ = i_4_ - i_7_;
            int i_14_ = i_3_ * i_3_;
            int i_15_ = i_4_ * i_4_;
            int i_16_ = i_12_ * i_12_;
            int i_17_ = i_13_ * i_13_;
            int i_18_ = i_15_ << 1;
            int i_19_ = i_14_ << 1;
            int i_20_ = i_17_ << 1;
            int i_21_ = i_16_ << 1;
            int i_22_ = i_4_ << 1;
            int i_23_ = i_13_ << 1;
            int i_24_ = (1 - i_22_) * i_14_ + i_18_;
            int i_25_ = i_15_ - i_19_ * (i_22_ - 1);
            int i_26_ = i_20_ + i_16_ * (1 - i_23_);
            int i_27_ = i_17_ - (i_23_ - 1) * i_21_;
            int i_28_ = i_14_ << 2;
            int i_29_ = i_15_ << 2;
            int i_30_ = i_16_ << 2;
            int i_31_ = i_17_ << 2;
            int i_32_ = 3 * i_18_;
            int i_33_ = i_19_ * (i_22_ - 3);
            int i_34_ = i_20_ * 3;
            int i_35_ = (i_23_ - 3) * i_21_;
            int i_36_ = i_29_;
            int i_37_ = i_28_ * (i_4_ - 1);
            int i_38_ = i_31_;
            int i_39_ = (i_13_ - 1) * i_30_;
            if (i_2_ >= 1155384281 * Class372_Sub1_Sub1.anInt4049 && i_2_ <= Class372_Sub1_Sub1.anInt4050 * -1062447355) {
                int[] is = Class372_Sub1_Sub1.anIntArrayArray4047[i_2_];
                int i_40_ = method6012(i - i_3_, (Class372_Sub1_Sub1.anInt4051 * -1424479739), (Class372_Sub1_Sub1.anInt4048 * 1135094847));
                int i_41_ = method6012(i + i_3_, (-1424479739 * Class372_Sub1_Sub1.anInt4051), (Class372_Sub1_Sub1.anInt4048 * 1135094847));
                int i_42_ = method6012(i - i_12_, (Class372_Sub1_Sub1.anInt4051 * -1424479739), (1135094847 * Class372_Sub1_Sub1.anInt4048));
                int i_43_ = method6012(i_12_ + i, (Class372_Sub1_Sub1.anInt4051 * -1424479739), (Class372_Sub1_Sub1.anInt4048 * 1135094847));
                Class82_Sub22.method940(is, i_40_, i_42_, i_6_);
                Class82_Sub22.method940(is, i_42_, i_43_, i_5_);
                Class82_Sub22.method940(is, i_43_, i_41_, i_6_);
            }
            while (i_10_ > 0) {
                boolean bool = i_10_ <= i_13_;
                if (bool) {
                    if (i_26_ < 0) {
                        while (i_26_ < 0) {
                            i_26_ += i_34_;
                            i_27_ += i_38_;
                            i_34_ += i_31_;
                            i_38_ += i_31_;
                            i_11_++;
                        }
                    }
                    if (i_27_ < 0) {
                        i_26_ += i_34_;
                        i_27_ += i_38_;
                        i_34_ += i_31_;
                        i_38_ += i_31_;
                        i_11_++;
                    }
                    i_26_ += -i_39_;
                    i_27_ += -i_35_;
                    i_35_ -= i_30_;
                    i_39_ -= i_30_;
                }
                if (i_24_ < 0) {
                    while (i_24_ < 0) {
                        i_24_ += i_32_;
                        i_25_ += i_36_;
                        i_32_ += i_29_;
                        i_36_ += i_29_;
                        i_9_++;
                    }
                }
                if (i_25_ < 0) {
                    i_24_ += i_32_;
                    i_25_ += i_36_;
                    i_32_ += i_29_;
                    i_36_ += i_29_;
                    i_9_++;
                }
                i_24_ += -i_37_;
                i_25_ += -i_33_;
                i_33_ -= i_28_;
                i_37_ -= i_28_;
                i_10_--;
                int i_44_ = i_2_ - i_10_;
                int i_45_ = i_10_ + i_2_;
                if (i_45_ >= Class372_Sub1_Sub1.anInt4049 * 1155384281 && i_44_ <= -1062447355 * Class372_Sub1_Sub1.anInt4050) {
                    int i_46_ = method6012(i + i_9_, (Class372_Sub1_Sub1.anInt4051 * -1424479739), (1135094847 * Class372_Sub1_Sub1.anInt4048));
                    int i_47_ = method6012(i - i_9_, (-1424479739 * Class372_Sub1_Sub1.anInt4051), (Class372_Sub1_Sub1.anInt4048 * 1135094847));
                    if (bool) {
                        int i_48_ = (method6012(i + i_11_, -1424479739 * Class372_Sub1_Sub1.anInt4051, Class372_Sub1_Sub1.anInt4048 * 1135094847));
                        int i_49_ = (method6012(i - i_11_, Class372_Sub1_Sub1.anInt4051 * -1424479739, 1135094847 * Class372_Sub1_Sub1.anInt4048));
                        if (i_44_ >= 1155384281 * Class372_Sub1_Sub1.anInt4049) {
                            int[] is = (Class372_Sub1_Sub1.anIntArrayArray4047[i_44_]);
                            Class82_Sub22.method940(is, i_47_, i_49_, i_6_);
                            Class82_Sub22.method940(is, i_49_, i_48_, i_5_);
                            Class82_Sub22.method940(is, i_48_, i_46_, i_6_);
                        }
                        if (i_45_ <= Class372_Sub1_Sub1.anInt4050 * -1062447355) {
                            int[] is = (Class372_Sub1_Sub1.anIntArrayArray4047[i_45_]);
                            Class82_Sub22.method940(is, i_47_, i_49_, i_6_);
                            Class82_Sub22.method940(is, i_49_, i_48_, i_5_);
                            Class82_Sub22.method940(is, i_48_, i_46_, i_6_);
                        }
                    } else {
                        if (i_44_ >= 1155384281 * Class372_Sub1_Sub1.anInt4049)
                            Class82_Sub22.method940((Class372_Sub1_Sub1.anIntArrayArray4047[i_44_]), i_47_, i_46_, i_6_);
                        if (i_45_ <= Class372_Sub1_Sub1.anInt4050 * -1062447355)
                            Class82_Sub22.method940((Class372_Sub1_Sub1.anIntArrayArray4047[i_45_]), i_47_, i_46_, i_6_);
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ado.av(").append(')').toString());
        }
    }

    public static void method5846(String string, boolean bool, int i, int i_29_) {
        Class384.method4699(string, bool, i, i_29_, null, false);
    }

    public static int method1902() {
        return 1197525581 * Class344.anInt3675;
    }

    static final int method2525(Entity entity, int i) {
        try {
            if (0 == 907865649 * entity.anInt10115)
                return 0;
            if (entity.setNextFaceEntity * 1433412323 != -1) {
                Entity class365_sub1_sub1_sub2_7_ = null;
                if (entity.setNextFaceEntity * 1433412323 < 32768) {
                    ObjectNode class298_sub29 = ((ObjectNode) (GameClient.entityList.get((long) (1433412323 * entity.setNextFaceEntity))));
                    if (class298_sub29 != null)
                        class365_sub1_sub1_sub2_7_ = ((Entity) class298_sub29.nodeObject);
                } else if (entity.setNextFaceEntity * 1433412323 >= 32768)
                    class365_sub1_sub1_sub2_7_ = (GameClient.entities[(1433412323 * entity.setNextFaceEntity - 32768)]);
                if (class365_sub1_sub1_sub2_7_ != null) {
                    Vector3f class217 = Vector3f.method2011(entity.getWorldTransform().trans, (class365_sub1_sub1_sub2_7_.getWorldTransform().trans));
                    int i_8_ = (int) class217.x;
                    int i_9_ = (int) class217.z;
                    if (i_8_ != 0 || 0 != i_9_)
                        entity.method4414((int) (Math.atan2((double) i_8_, (double) i_9_) * 2607.5945876176133) & 0x3fff, (byte) 1);
                }
            }
            if (entity instanceof Player) {
                Player class365_sub1_sub1_sub2_sub2 = (Player) entity;
                if (-1 != class365_sub1_sub1_sub2_sub2.anInt10221 * 1208589843 && (0 == (class365_sub1_sub1_sub2_sub2.anInt10120 * 2050671733) || (-1531994851 * class365_sub1_sub1_sub2_sub2.anInt10124) > 0)) {
                    class365_sub1_sub1_sub2_sub2.method4414(1208589843 * class365_sub1_sub1_sub2_sub2.anInt10221, (byte) 1);
                    class365_sub1_sub1_sub2_sub2.anInt10221 = 1530078181;
                }
            } else if (entity instanceof NPC) {
                NPC class365_sub1_sub1_sub2_sub1 = (NPC) entity;
                if (-1 != class365_sub1_sub1_sub2_sub1.anInt10179 * 579792529 && ((class365_sub1_sub1_sub2_sub1.anInt10120 * 2050671733 == 0) || (-1531994851 * class365_sub1_sub1_sub2_sub1.anInt10124) > 0)) {
                    Vector3f class217 = (class365_sub1_sub1_sub2_sub1.getWorldTransform().trans);
                    GameScene gameScene = GameClient.myRegion.getGameScene();
                    int i_10_ = ((int) class217.x - ((class365_sub1_sub1_sub2_sub1.anInt10179 * -1896967936) - 263081728 * gameScene.gameSceneBaseX - 263081728 * gameScene.gameSceneBaseX));
                    int i_11_ = ((int) class217.z - ((893346048 * class365_sub1_sub1_sub2_sub1.anInt10180) - gameScene.gameSceneBaseY * -434703616 - gameScene.gameSceneBaseY * -434703616));
                    if (0 != i_10_ || i_11_ != 0)
                        class365_sub1_sub1_sub2_sub1.method4414((int) (Math.atan2((double) i_10_, (double) i_11_) * 2607.5945876176133) & 0x3fff, (byte) 1);
                    class365_sub1_sub1_sub2_sub1.anInt10179 = -1312461425;
                }
            }
            return entity.method4450((short) 6752);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lb.ha(").append(')').toString());
        }
    }

    static void method2526(GraphicsToolkit class_ra, Class453 class453, int i, int i_12_, int i_13_) {
        try {
            DiskFile.aClass453_5986.clean();
            if (!Class301_Sub1.aBoolean7635) {
                for (Class298_Sub52 class298_sub52 = (Class298_Sub52) class453.method5939(); class298_sub52 != null; class298_sub52 = (Class298_Sub52) class453.method5944()) {
                    Class352 class352 = (Class301_Sub1.aClass339_3251.method4116(-530122905 * class298_sub52.anInt7608));
                    if (!method5728(class352)) {
                        if (i_13_ <= -4851154) {
                            /* empty */
                        }
                    } else {
                        boolean bool = Class386.method4726(class_ra, class298_sub52, class352, i, i_12_, -1417215477);
                        if (bool)
                            Class368.method4556(class_ra, class298_sub52, class352, 1387394029);
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lb.bh(").append(')').toString());
        }
    }

    public static Class128 method2524(Buffer buffer) {
        try {
            Class128 class128 = com.jagex.Graphics.method608(buffer);
            int i_1_ = buffer.readBigSmart();
            int i_2_ = buffer.readBigSmart();
            int i_3_ = buffer.readBigSmart();
            int i_4_ = buffer.readBigSmart();
            int i_5_ = buffer.readBigSmart();
            int i_6_ = buffer.readBigSmart();
            return new Class128_Sub3(class128.aClass139_6322, class128.aClass133_6323, -39975161 * class128.anInt6327, class128.anInt6325 * 1886882435, class128.anInt6326 * -944287579, class128.anInt6330 * -1387457793, -684094775 * class128.anInt6328, class128.anInt6329 * 955568089, class128.anInt6324 * 782326281, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lb.i(").append(')').toString());
        }
    }

    static final void method4651() {
        try {
            if (GameClient.fullscreen && GameClient.fullScreenFrame != null)
                Class357.method4276(SettingsManager.settingsManager.screenSize.getValue(), -1, -1, false);
            if (method4865() == Class292.aClass292_3162) {
                method589();
                System.exit(0);
            } else
                method1279();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pp.afq(").append(')').toString());
        }
    }

    static int method4652(Player player) {
        try {
            int i_6_ = 1899133595 * player.anInt10211;
            Class350 class350 = player.method4426();
            int i_7_ = player.aAnimator_10077.getAnimationID();
            if (-1 == i_7_ || player.aBoolean10094)
                i_6_ = 1728220219 * player.anInt10194;
            else if (class350.anInt3721 * 230243963 == i_7_ || i_7_ == class350.anInt3749 * 491753731 || class350.anInt3724 * -783166629 == i_7_ || i_7_ == class350.anInt3746 * -2054940183)
                i_6_ = player.anInt10212 * -978842273;
            else if (i_7_ == class350.anInt3755 * 328817727 || -1238642279 * class350.anInt3722 == i_7_ || 124010991 * class350.anInt3728 == i_7_ || -907666203 * class350.anInt3727 == i_7_)
                i_6_ = player.anInt10210 * -1304250511;
            return i_6_;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pp.r(").append(')').toString());
        }
    }

    static void method4653() {
        try {
            if (method4897()) {
                if (null == Class8.consoleMessages)
                    Class372_Sub3.method4599();
                Class8.aBoolean108 = true;
                Class8.anInt98 = 0;
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pp.f(").append(')').toString());
        }
    }

    static final void method4654(int i, int i_8_) {
        try {
            if (GameClient.game != GameContext.stellardawn) {
                if (!Class82_Sub21.method938(i, i_8_, false, Class282.method2619(i, i_8_, 1, 1)))
                    Class82_Sub21.method938(i, i_8_, false, Class336.method3963(i, i_8_, 1, 1, 0));
            } else if (!Class82_Sub21.method938(i, i_8_, false, Class336.method3963(i, i_8_, 1, 1, 0)))
                Class82_Sub21.method938(i, i_8_, false, Class282.method2619(i, i_8_, 1, 1));
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pp.jv(").append(')').toString());
        }
    }

    static void method3900(GraphicsToolkit class_ra, int i, int i_0_, int i_1_, int i_2_, int i_3_, FontToolkit class264, RSFontMetrics class505, String string, int i_4_) {
        try {
            int i_5_ = (255 - -1274801891 * Class82_Sub4.anInt6833 - Class436.anInt5498 * 1868123923);
            if (i_5_ < 0)
                i_5_ = 0;
            if (Class313.aClass57_3299 == null || Class423.aClass57_5356 == null) {
                if (Js5List.JS5_SPRITES.exists(anInt3918 * 142643703) && Js5List.JS5_SPRITES.exists(((anInt8400) * 1757615047))) {
                    Class313.aClass57_3299 = (class_ra.createSpriteToolkit(Sprite.loadFirst(Js5List.JS5_SPRITES, anInt3918 * 142643703, 0), true));
                    Sprite class89 = Sprite.loadFirst(Js5List.JS5_SPRITES, (anInt8400 * 1757615047), 0);
                    Class423.aClass57_5356 = class_ra.createSpriteToolkit(class89, true);
                    class89.flipHorizontally();
                    Class74.aClass57_700 = class_ra.createSpriteToolkit(class89, true);
                } else
                    class_ra.drawFilledRectangle(i, i_0_, i_1_, i_3_, i_5_ << 24 | 1018380409 * IPAddress.anInt5958, 1);
            }
            if (Class313.aClass57_3299 != null && Class423.aClass57_5356 != null) {
                int i_6_ = ((i_1_ - Class423.aClass57_5356.getWidth() * 2) / Class313.aClass57_3299.getWidth());
                for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
                    Class313.aClass57_3299.draw((i + Class423.aClass57_5356.getWidth() + i_7_ * Class313.aClass57_3299.getWidth()), i_0_);
                Class423.aClass57_5356.draw(i, i_0_);
                Class74.aClass57_700.draw(i_1_ + i - Class74.aClass57_700.getWidth(), i_0_);
            }
            class264.method2488(string, 3 + i, ((20 - 1110385787 * class505.anInt6202) / 2 + (i_0_ + 1110385787 * class505.anInt6202)), -1067973831 * anInt3674 | ~0xffffff, -1);
            class_ra.drawFilledRectangle(i, i_3_ + i_0_, i_1_, i_2_ - i_3_, i_5_ << 24 | IPAddress.anInt5958 * 1018380409, 1);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nh.ac(").append(')').toString());
        }
    }

    public static void updateComponentTick(IComponentDefinition component) {
        if (GameClient.windowTick * -1950343315 == -2105805879 * component.tick)
            GameClient.aBooleanArray8900[component.anInt1303 * 91937559] = true;
    }

    static final int getTargetMask(int optionsMask) {
        return optionsMask >> 11 & 0x7f;
    }

    static final void method957() {
        try {
            Class360.accountName = 2742373017286080113L;
            Class360.serverKey = 0L;
            Class360.socialNetworkId = -2035975497;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dl.p(").append(')').toString());
        }
    }

    static void method1041(int i) {
        try {
            if (Class372_Sub1.anIntArray7727 == null || Class372_Sub1.anIntArray7727.length < i)
                Class372_Sub1.anIntArray7727 = new int[i];
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dy.z(").append(')').toString());
        }
    }

    public static void method1042(String string) {
        try {
            if (8 == -1233866115 * GameClient.gameState) {
                OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.aClass198_2037, ConnectionType.lobbyConnection.encryptor);
                outgoingPacketBuffer.payload.writeShort(0);
                int i_4_ = (385051775 * outgoingPacketBuffer.payload.offset);
                outgoingPacketBuffer.payload.writeString(string);
                outgoingPacketBuffer.payload.offset += 814893177;
                outgoingPacketBuffer.payload.encodeXtea(Class361.anIntArray3913, i_4_, (385051775 * outgoingPacketBuffer.payload.offset));
                outgoingPacketBuffer.payload.writeSizeShort(385051775 * (outgoingPacketBuffer.payload.offset) - i_4_);
                ConnectionType.lobbyConnection.sendFrame(outgoingPacketBuffer);
                Class378.aClass428_4094 = Class428.aClass428_6620;
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dy.p(").append(')').toString());
        }
    }

    static final void method1949() {
        try {
            if (!Class315.method3837())
                IComponentSettings.method3503();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ix.agg(").append(')').toString());
        }
    }

    public static void method1947() {
        try {
            if (-1233866115 * GameClient.gameState == 14 && (!Class315.method3837() && !Class489.method6167()))
                Class439.loadGameState(18);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ix.n(").append(')').toString());
        }
    }

    public static Class165 method4896(Buffer buffer) {
        try {
            int i_7_ = buffer.readBigSmart();
            return new Class165(i_7_);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qg.a(").append(')').toString());
        }
    }

    static void method5192(int i, int i_484_, int i_485_, int i_487_, int i_489_, MenuOption menuOption, FontToolkit fontToolkit, RSFontMetrics rsFontMetrics, int i_490_, int i_491_) {
        try {
            if (i > i_485_ && i < i_485_ + i_487_ && i_484_ > i_489_ - rsFontMetrics.anInt6202 * 1110385787 - 1 && i_484_ < i_489_ + -1883958527 * rsFontMetrics.anInt6197 && menuOption.aBoolean9664)
                i_490_ = i_491_;
            int[] is = Class313.method3821(menuOption);
            String string = Class8.method315(menuOption);
            if (is != null)
                string = new StringBuilder().append(string).append(method1999(is)).toString();
            fontToolkit.method2480(string, 3 + i_485_, i_489_, i_490_, 0, GameClient.lineHeight, Class368.random * 1401020893, Class436.aClass57Array5501, anIntArray8372);
            if (menuOption.aBoolean9665)
                com.jagex.Graphics.aClass57_573.draw(i_485_ + 5 + rsFontMetrics.method6264(string), i_489_ - 1110385787 * rsFontMetrics.anInt6202);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ra.an(").append(')').toString());
        }
    }

    public static void method1852() {
        int width = GameShell.canvasWidth * -2110394505;
        int height = GameShell.canvasHeight * -1111710645;
        if (-639974669 * GameClient.frameWidth < width)
            width = -639974669 * GameClient.frameWidth;
        if (1282634425 * GameClient.frameHeight < height)
            height = GameClient.frameHeight * 1282634425;
        try {
            Class212.aClass212_2425.method1955((new Object[]{Integer.valueOf(width), Integer.valueOf(height), Integer.valueOf(Class190.windowMode()), Integer.valueOf(SettingsManager.settingsManager.maxScreenSize.getValue())}));
        } catch (Throwable throwable) {
                /* empty */
        }

    }

    static void method5818(int graphicID, int senderIndex, int targetIndex, int slot, int initialHeight, int i_13_, int worldX, int WorldY, int i_16_, int i_17_, int startTickOffset, int endTickOffset, int verticalPitch, int initialDisplacement, boolean bool) {
        if (senderIndex != 0 && -1 != slot) {
            Entity entity = null;
            if (senderIndex < 0) {
                int i_23_ = -senderIndex - 1;
                if (i_23_ == -442628795 * GameClient.playerIndex) {
                    entity = Player.myPlayer;
                } else {
                    entity = (GameClient.entities[i_23_]);
                }
            } else {
                int i_24_ = senderIndex - 1;
                ObjectNode objectNode = ((ObjectNode) GameClient.entityList.get(i_24_));
                if (objectNode != null) {
                    entity = ((Entity) objectNode.nodeObject);
                }
            }
            if (entity != null) {
                Class350 class350 = entity.method4426();
                if (null != class350.anIntArrayArray3710 && null != class350.anIntArrayArray3710[slot]) {
                    initialHeight -= class350.anIntArrayArray3710[slot][1];
                }
                if (class350.anIntArrayArray3753 != null && null != class350.anIntArrayArray3753[slot]) {
                    initialHeight -= class350.anIntArrayArray3753[slot][1];
                }
            }
        }
        Projectile projectile = (new Projectile(GameClient.myRegion.getRegion(), graphicID, GameMap.basePlane * -191892109, GameMap.basePlane * -191892109, worldX, WorldY, initialHeight, GameClient.clientTick * 443738891 + startTickOffset, GameClient.clientTick * 443738891 + endTickOffset, verticalPitch, initialDisplacement, senderIndex, targetIndex, i_13_, bool, slot));
        projectile.method4405(i_16_, i_17_, Class356.getAverageHeight(i_16_, i_17_, GameMap.basePlane * -191892109, -968708982) - i_13_, 443738891 * GameClient.clientTick + startTickOffset);
        GameClient.aClass453_8824.pushBack(new Class298_Sub37_Sub2(projectile));
    }

    static void method2528() {
        AwtKeyboard.keyboard.stop();
        AwtMouse.mouse.stop();
        GameClient.gameClient.buildScreenContext();
        DirectXContext.canvas.setBackground(Color.black);
        GameClient.anInt8834 = 766301529;
        AwtKeyboard.keyboard = AwtKeyboard.create(DirectXContext.canvas);
        AwtMouse.mouse = AwtMouse.create(DirectXContext.canvas, true);
    }

    public static void method2326() {
        try {
            IcmpService_Sub1.method4714();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kf.f(").append(')').toString());
        }
    }

    public static void method2330(NPC npc) {
        try {
            for (NotDefinition class298_sub41 = ((NotDefinition) NotDefinition.aClass453_7455.method5939()); null != class298_sub41; class298_sub41 = ((NotDefinition) NotDefinition.aClass453_7455.method5944())) {
                if (npc == (class298_sub41.npc)) {
                    if ((class298_sub41.aClass298_Sub19_Sub2_7447) != null) {
                        Class285.aClass298_Sub19_Sub4_3083.method3048(class298_sub41.aClass298_Sub19_Sub2_7447);
                        class298_sub41.aClass298_Sub19_Sub2_7447 = null;
                    }
                    class298_sub41.unlink();
                    break;
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kf.k(").append(')').toString());
        }
    }

    public static void setBillboardConfig(Js5FileSystem billboardConfig) {
        BillboardConfig.JS5_BILLBOARD_CONFIG = billboardConfig;
    }

    public static void method1278() {
        for (Class298_Sub49 class298_sub49 = ((Class298_Sub49) Class423.aClass437_5354.method5816()); null != class298_sub49; class298_sub49 = (Class298_Sub49) Class423.aClass437_5354.method5815())
            Class285.method2710(1566028323 * class298_sub49.anInt7589);
    }

    public static final void method1279() {
        String string = (null != Js5CacheWrite.aString6063 ? Js5CacheWrite.aString6063 : ClientScriptMap.method6131());
        ErrorReporter.method4172(string, false, SettingsManager.settingsManager.toolkitSetting.getValue() == ToolkitOption.OPENGLSPECIAL, GameClient.useJs, GameClient.aBoolean8651, (byte) 37);
    }

    static boolean method1275() {
        try {
            return Class492.method6184(aClass381_1563.aClass355_4116);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("et.f(").append(')').toString());
        }
    }

    static final void method1285(ObjectDeque objectDeque) {
        try {
            Region class331 = GameClient.myRegion.getRegion();
            if (class331 != null) {
                SceneObject sceneObject = null;
                if (0 == objectDeque.anInt7157 * -431456739)
                    sceneObject = ((SceneObject) class331.method4031(2108312995 * (objectDeque.plane), (objectDeque.localX * 634196087), (-2146829167 * objectDeque.localY)));
                if (objectDeque.anInt7157 * -431456739 == 1)
                    sceneObject = ((SceneObject) class331.method4033(2108312995 * (objectDeque.plane), (634196087 * objectDeque.localX), (objectDeque.localY * -2146829167)));
                if (2 == -431456739 * objectDeque.anInt7157)
                    sceneObject = ((SceneObject) (class331.method4035((2108312995 * objectDeque.plane), objectDeque.localX * 634196087, -2146829167 * objectDeque.localY, GameClient.anInterface17_8960)));
                if (-431456739 * objectDeque.anInt7157 == 3)
                    sceneObject = ((SceneObject) class331.method4058(2108312995 * (objectDeque.plane), (634196087 * objectDeque.localX), (-2146829167 * objectDeque.localY)));
                if (sceneObject != null) {
                    objectDeque.objectID = sceneObject.getID() * 1182121109;
                    objectDeque.anInt7154 = sceneObject.method29() * -723189599;
                    objectDeque.anInt7161 = sceneObject.method30() * 1338356755;
                } else {
                    objectDeque.objectID = -1182121109;
                    objectDeque.anInt7154 = 0;
                    objectDeque.anInt7161 = 0;
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("et.p(").append(')').toString());
        }
    }

    static void method5989(NotDefinition class298_sub41, int i, int i_2_, int i_3_, int i_4_, int i_5_) {
        try {
            if (-1 != class298_sub41.anInt7443 * 391847895 || class298_sub41.anIntArray7432 != null) {
                int i_6_ = 0;
                int i_7_ = ((class298_sub41.anInt7449 * 43235291 * SettingsManager.settingsManager.areaSoundsVolume.getValue()) >> 8);
                if (i_2_ > (-1012062621 * class298_sub41.anInt7427))
                    i_6_ += i_2_ - -1012062621 * class298_sub41.anInt7427;
                else if (i_2_ < (-1808325887 * class298_sub41.anInt7425))
                    i_6_ += -1808325887 * (class298_sub41.anInt7425) - i_2_;
                if (i_3_ > -720500331 * class298_sub41.anInt7428)
                    i_6_ += i_3_ - -720500331 * class298_sub41.anInt7428;
                else if (i_3_ < (class298_sub41.anInt7423 * 757346071))
                    i_6_ += 757346071 * (class298_sub41.anInt7423) - i_3_;
                if ((826975881 * class298_sub41.anInt7430 == 0) || i_6_ - 256 > 826975881 * class298_sub41.anInt7430 || SettingsManager.settingsManager.areaSoundsVolume.getValue() == 0 || (-1926928785 * class298_sub41.anInt7424) != i) {
                    if ((class298_sub41.aClass298_Sub19_Sub2_7447) != null) {
                        Class285.aClass298_Sub19_Sub4_3083.method3048(class298_sub41.aClass298_Sub19_Sub2_7447);
                        class298_sub41.aClass298_Sub19_Sub2_7447 = null;
                        class298_sub41.aClass298_Sub26_Sub1_7446 = null;
                        class298_sub41.aClass298_Sub23_7445 = null;
                    }
                    if (null != (class298_sub41.aClass298_Sub19_Sub2_7426)) {
                        Class285.aClass298_Sub19_Sub4_3083.method3048(class298_sub41.aClass298_Sub19_Sub2_7426);
                        class298_sub41.aClass298_Sub19_Sub2_7426 = null;
                        class298_sub41.aClass298_Sub23_7420 = null;
                        class298_sub41.aClass298_Sub26_Sub1_7453 = null;
                    }
                } else {
                    i_6_ -= 256;
                    if (i_6_ < 0)
                        i_6_ = 0;
                    int i_8_ = ((826975881 * class298_sub41.anInt7430) - (-2024907801 * class298_sub41.anInt7429));
                    if (i_8_ < 0)
                        i_8_ = (class298_sub41.anInt7430 * 826975881);
                    int i_9_ = i_7_;
                    int i_10_ = (i_6_ - (-2024907801 * class298_sub41.anInt7429));
                    if (i_10_ > 0 && i_8_ > 0)
                        i_9_ = (i_8_ - i_10_) * i_7_ / i_8_;
                    Player.myPlayer.getSize();
                    int i_11_ = 8192;
                    int i_12_ = ((class298_sub41.anInt7425 * -1808325887) + (class298_sub41.anInt7427 * -1012062621)) / 2 - i_2_;
                    int i_13_ = (((-720500331 * class298_sub41.anInt7428) + 757346071 * (class298_sub41.anInt7423)) / 2 - i_3_);
                    if (i_12_ != 0 || 0 != i_13_) {
                        int i_14_ = ((-(-1847894591 * GameClient.camRotY) - (int) (Math.atan2((double) i_12_, (double) i_13_) * 2607.5945876176133) - 4096) & 0x3fff);
                        if (i_14_ > 8192)
                            i_14_ = 16384 - i_14_;
                        int i_15_;
                        if (i_6_ <= 0)
                            i_15_ = 8192;
                        else if (i_6_ >= 4096)
                            i_15_ = 16384;
                        else
                            i_15_ = i_6_ * 8192 / 4096 + 8192;
                        i_11_ = i_14_ * i_15_ / 8192 + (16384 - i_15_ >> 1);
                    }
                    if ((class298_sub41.aClass298_Sub19_Sub2_7447) == null) {
                        if ((391847895 * class298_sub41.anInt7443) >= 0) {
                            i_12_ = (((-455518897 * class298_sub41.anInt7452 == 256) && (class298_sub41.anInt7441) * 1495381837 == 256) ? 256 : method4888((1495381837 * (class298_sub41.anInt7441)), ((class298_sub41.anInt7452) * -455518897)));
                            if (class298_sub41.aBoolean7444) {
                                if (null == (class298_sub41.aClass298_Sub23_7445))
                                    class298_sub41.aClass298_Sub23_7445 = (Class298_Sub23.method3066(Js5List.JS5_SOUND_EFFECTS2, (class298_sub41.anInt7443) * 391847895));
                                if ((class298_sub41.aClass298_Sub23_7445) != null) {
                                    if ((class298_sub41.aClass298_Sub26_Sub1_7446) == null)
                                        class298_sub41.aClass298_Sub26_Sub1_7446 = (class298_sub41.aClass298_Sub23_7445.method3067(new int[]{22050}));
                                    if ((class298_sub41.aClass298_Sub26_Sub1_7446) != null) {
                                        Class298_Sub19_Sub2 class298_sub19_sub2 = (Class298_Sub19_Sub2.method3027((class298_sub41.aClass298_Sub26_Sub1_7446), i_12_, i_9_ << 6, i_11_));
                                        class298_sub19_sub2.method2991(-1);
                                        Class285.aClass298_Sub19_Sub4_3083.method3043(class298_sub19_sub2);
                                        class298_sub41.aClass298_Sub19_Sub2_7447 = class298_sub19_sub2;
                                    }
                                }
                            } else {
                                Class278 class278 = Class278.method2604((Js5List.JS5_SOUND_EFFECTS), ((class298_sub41.anInt7443) * 391847895), 0);
                                if (null != class278) {
                                    Class298_Sub26_Sub1 class298_sub26_sub1 = (class278.method2601().method3104(Class282.aClass270_6546));
                                    Class298_Sub19_Sub2 class298_sub19_sub2 = (Class298_Sub19_Sub2.method3027(class298_sub26_sub1, i_12_, i_9_ << 6, i_11_));
                                    class298_sub19_sub2.method2991(-1);
                                    Class285.aClass298_Sub19_Sub4_3083.method3043(class298_sub19_sub2);
                                    class298_sub41.aClass298_Sub19_Sub2_7447 = class298_sub19_sub2;
                                }
                            }
                        }
                    } else {
                        class298_sub41.aClass298_Sub19_Sub2_7447.method2992(i_9_);
                        class298_sub41.aClass298_Sub19_Sub2_7447.method2989(i_11_);
                    }
                    if ((class298_sub41.aClass298_Sub19_Sub2_7426) == null) {
                        if ((class298_sub41.anIntArray7432 != null) && (class298_sub41.anInt7454 -= 950219665 * i_4_) * -1221989007 <= 0) {
                            i_12_ = (((class298_sub41.anInt7452) * -455518897 == 256 && (256 == (class298_sub41.anInt7441) * 1495381837)) ? 256 : ((int) (Math.random() * (double) ((-455518897 * (class298_sub41.anInt7452)) - ((class298_sub41.anInt7441) * 1495381837))) + (class298_sub41.anInt7441) * 1495381837));
                            if (class298_sub41.aBoolean7451) {
                                if (null == (class298_sub41.aClass298_Sub23_7420)) {
                                    i_13_ = (int) (Math.random() * (double) (class298_sub41.anIntArray7432).length);
                                    class298_sub41.aClass298_Sub23_7420 = (Class298_Sub23.method3066(Js5List.JS5_SOUND_EFFECTS2, (class298_sub41.anIntArray7432[i_13_])));
                                }
                                if ((class298_sub41.aClass298_Sub23_7420) != null) {
                                    if ((class298_sub41.aClass298_Sub26_Sub1_7453) == null)
                                        class298_sub41.aClass298_Sub26_Sub1_7453 = (class298_sub41.aClass298_Sub23_7420.method3067(new int[]{22050}));
                                    if (null != (class298_sub41.aClass298_Sub26_Sub1_7453)) {
                                        Class298_Sub19_Sub2 class298_sub19_sub2 = (Class298_Sub19_Sub2.method3027((class298_sub41.aClass298_Sub26_Sub1_7453), i_12_, i_9_ << 6, i_11_));
                                        class298_sub19_sub2.method2991(0);
                                        Class285.aClass298_Sub19_Sub4_3083.method3043(class298_sub19_sub2);
                                        class298_sub41.aClass298_Sub19_Sub2_7426 = class298_sub19_sub2;
                                        class298_sub41.anInt7454 = (((class298_sub41.anInt7450 * -15898815) + (int) (Math.random() * (double) ((-1398300237 * (class298_sub41.anInt7422)) - (-15898815 * (class298_sub41.anInt7450))))) * 950219665);
                                    }
                                }
                            } else {
                                i_13_ = (int) (Math.random() * (double) (class298_sub41.anIntArray7432).length);
                                Class278 class278 = Class278.method2604((Js5List.JS5_SOUND_EFFECTS), (class298_sub41.anIntArray7432[i_13_]), 0);
                                if (null != class278) {
                                    Class298_Sub26_Sub1 class298_sub26_sub1 = (class278.method2601().method3104(Class282.aClass270_6546));
                                    Class298_Sub19_Sub2 class298_sub19_sub2 = (Class298_Sub19_Sub2.method3027(class298_sub26_sub1, i_12_, i_9_ << 6, i_11_));
                                    class298_sub19_sub2.method2991(0);
                                    Class285.aClass298_Sub19_Sub4_3083.method3043(class298_sub19_sub2);
                                    class298_sub41.aClass298_Sub19_Sub2_7426 = class298_sub19_sub2;
                                    class298_sub41.anInt7454 = ((-15898815 * (class298_sub41.anInt7450) + (int) (Math.random() * (double) (((class298_sub41.anInt7422) * -1398300237) - (-15898815 * (class298_sub41.anInt7450))))) * 950219665);
                                }
                            }
                        }
                    } else {
                        class298_sub41.aClass298_Sub19_Sub2_7426.method2992(i_9_);
                        class298_sub41.aClass298_Sub19_Sub2_7426.method2989(i_11_);
                        if (!class298_sub41.aClass298_Sub19_Sub2_7426.isNextAvailable()) {
                            class298_sub41.aClass298_Sub19_Sub2_7426 = null;
                            class298_sub41.aClass298_Sub23_7420 = null;
                            class298_sub41.aClass298_Sub26_Sub1_7453 = null;
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sz.n(").append(')').toString());
        }
    }

    static final void sweepDefinitions() {
        try {
            aClass375_6196.sweep();
            Class151.aClass451_6358.sweep();
            Js5Configs.idkList.sweep();
            GameClient.myRegion.getObjectDefinitionLoader().sweep();
            NPCDefinitionLoader.npcList.sweep();
            Js5Configs.itemList.sweep();
            Js5Configs.animsList.sweep();
            SpotTypeLoader.loader.sweep();
            Class472.configLoader.sweep();
            Class440.aClass205_5582.sweep();
            aClass445_8384.sweep();
            Class82_Sub16.aClass427_6886.sweep();
            Class99.aClass517_951.sweep();
            Class299.aClass370_3199.sweep();
            Class94.aClass349_913.sweep();
            ConfigType.aClass487_1463.sweep();
            Class363.aClass339_3931.sweep();
            Class92.aClass504_905.sweep();
            Js5Configs.configList.sweep();
            Class138_Sub1.configs.sweep();
            aClass499_6668.sweep();
            Class_na.cursorDefLoader.sweep();
            HitsplatDefinitionLoader.aClass347_6117.sweep();
            Class114.sweep();
            Class282.sweep();
            StaticMethods5.fonts.sweep();
            HintIcon.sweep();
            Class462.sweep();
            GameClient.aClass348_8780.sweep();
            GameClient.aClass348_8898.sweep();
            GameClient.aClass348_8697.sweep();
            Class436.aClass348_5500.sweep();
            Class388.cache.sweep();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pn.gb(").append(')').toString());
        }
    }

    public static int calculateRoute(int startX, int startY, int size, Class336 class336, Class289 planeClipData, boolean alternativeRoute, int[] calculatedPositionXsArray, int[] calculatedPositionYsArray) {
        try {
            for (int playerX = 0; playerX < 128; playerX++) {
                for (int playerY = 0; playerY < 128; playerY++) {
                    Class285.anIntArrayArray3076[playerX][playerY] = 0;
                    Class285.anIntArrayArray3080[playerX][playerY] = 99999999;
                }
            }
            boolean bool_6_;
            if (size == 1)
                bool_6_ = Class330.method4006(startX, startY, class336, planeClipData);
            else if (2 == size)
                bool_6_ = method2120(startX, startY, class336, planeClipData, -1327541421);
            else
                bool_6_ = Class372.method4593(startX, startY, size, class336, planeClipData, (byte) 58);
            int i_7_ = startX - 64;
            int i_8_ = startY - 64;
            int i_9_ = -1035599555 * Class285.anInt3078;
            int i_10_ = 1111664165 * ClanMember.anInt1684;
            if (!bool_6_) {
                if (alternativeRoute) {
                    int i_11_ = 2147483647;
                    int i_12_ = 2147483647;
                    int i_13_ = 10;
                    int i_14_ = class336.toX * -1331662251;
                    int i_15_ = 1517720743 * class336.toY;
                    int i_16_ = class336.sizeX * -1900284579;
                    int i_17_ = 772610897 * class336.sizeY;
                    for (int i_18_ = i_14_ - i_13_; i_18_ <= i_13_ + i_14_; i_18_++) {
                        for (int i_19_ = i_15_ - i_13_; i_19_ <= i_15_ + i_13_; i_19_++) {
                            int i_20_ = i_18_ - i_7_;
                            int i_21_ = i_19_ - i_8_;
                            if (i_20_ >= 0 && i_21_ >= 0 && i_20_ < 128 && i_21_ < 128 && (Class285.anIntArrayArray3080[i_20_][i_21_] < 100)) {
                                int i_22_ = 0;
                                if (i_18_ < i_14_)
                                    i_22_ = i_14_ - i_18_;
                                else if (i_18_ > i_16_ + i_14_ - 1)
                                    i_22_ = i_18_ - (i_16_ + i_14_ - 1);
                                int i_23_ = 0;
                                if (i_19_ < i_15_)
                                    i_23_ = i_15_ - i_19_;
                                else if (i_19_ > i_15_ + i_17_ - 1)
                                    i_23_ = i_19_ - (i_17_ + i_15_ - 1);
                                int i_24_ = i_22_ * i_22_ + i_23_ * i_23_;
                                if (i_24_ < i_11_ || (i_24_ == i_11_ && (Class285.anIntArrayArray3080[i_20_][i_21_]) < i_12_)) {
                                    i_11_ = i_24_;
                                    i_12_ = (Class285.anIntArrayArray3080[i_20_][i_21_]);
                                    i_9_ = i_18_;
                                    i_10_ = i_19_;
                                }
                            }
                        }
                    }
                    if (i_11_ == 2147483647)
                        return -1;
                } else
                    return -1;
            }
            if (startX == i_9_ && i_10_ == startY)
                return 0;
            int i_25_ = 0;
            Class285.routeFinderXArray[i_25_] = i_9_;
            Class285.routeFinderYArray[i_25_++] = i_10_;
            int i_27_;
            int i_26_ = (i_27_ = Class285.anIntArrayArray3076[i_9_ - i_7_][i_10_ - i_8_]);
            while (startX != i_9_ || startY != i_10_) {
                if (i_27_ != i_26_) {
                    i_27_ = i_26_;
                    Class285.routeFinderXArray[i_25_] = i_9_;
                    Class285.routeFinderYArray[i_25_++] = i_10_;
                }
                if (0 != (i_26_ & 0x2))
                    i_9_++;
                else if (0 != (i_26_ & 0x8))
                    i_9_--;
                if ((i_26_ & 0x1) != 0)
                    i_10_++;
                else if ((i_26_ & 0x4) != 0)
                    i_10_--;
                i_26_ = Class285.anIntArrayArray3076[i_9_ - i_7_][i_10_ - i_8_];
            }
            int steps = 0;
            while_8_:
            do {
                do {
                    if (i_25_-- <= 0)
                        break while_8_;
                    calculatedPositionXsArray[steps] = Class285.routeFinderXArray[i_25_];
                    calculatedPositionYsArray[steps++] = Class285.routeFinderYArray[i_25_];
                } while (steps < calculatedPositionXsArray.length);
            } while (false);
            return steps;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("abv.a(").append(')').toString());
        }
    }

    public static void method1600(IComponentDefinition componentDefinition, int i, int i_1_) {
        if (componentDefinition != null) {
            if (componentDefinition.onTargetEnterHook != null) {
                ScriptNode scriptNode = new ScriptNode();
                scriptNode.aClass105_7525 = componentDefinition;
                scriptNode.parameters = componentDefinition.onTargetEnterHook;
                Class444.method5889(scriptNode);
            }
            GameClient.interfaceSelected = true;
            Class379.interfaceHash = componentDefinition.interfaceHash * 1167811111;
            GameClient.containerComponent = componentDefinition.slot * -298861091;
            anInt3192 = 1282349805 * i;
            IdentityKitDefinition.anInt1508 = i_1_ * 1881265567;
            GameClient.itemID = 746397723 * componentDefinition.itemID;
            Class240.targetOverCursors = 1745504609 * componentDefinition.targetOverCursors;
            GameClient.targetLeaveCursor = -472067203 * componentDefinition.targetLeaveCursor;
            updateComponentTick(componentDefinition);
        }
    }

    static void method1601() {
        try {
            if (GameClient.aByteArray8843 != null)
                method1311();
            else if (2084404473 * Class360.socialNetworkId != -1)
                Class124.method1386((byte) -89);
            else
                method6208(Class360.username, Class360.password);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fy.f(").append(')').toString());
        }
    }

    static final void method2093(int i, int i_118_, int i_119_, int i_120_, int i_121_) {
        try {
            int i_123_ = i_120_ - i_118_;
            int i_124_ = i_119_ - i;
            if (i_124_ == 0) {
                if (i_123_ != 0)
                    Class492.method6183(i, i_118_, i_120_, i_121_, -1450466434);
            } else if (i_123_ == 0)
                Class474.method6072(i, i_119_, i_118_, i_121_, 458370276);
            else {
                if (i_123_ < 0)
                    i_123_ = -i_123_;
                if (i_124_ < 0)
                    i_124_ = -i_124_;
                boolean bool = i_123_ > i_124_;
                if (bool) {
                    int i_125_ = i;
                    int i_126_ = i_119_;
                    i = i_118_;
                    i_118_ = i_125_;
                    i_119_ = i_120_;
                    i_120_ = i_126_;
                }
                if (i > i_119_) {
                    int i_127_ = i;
                    int i_128_ = i_118_;
                    i = i_119_;
                    i_119_ = i_127_;
                    i_118_ = i_120_;
                    i_120_ = i_128_;
                }
                int i_129_ = i_118_;
                int i_130_ = i_119_ - i;
                int i_131_ = i_120_ - i_118_;
                int i_132_ = -(i_130_ >> 1);
                int i_133_ = i_118_ < i_120_ ? 1 : -1;
                if (i_131_ < 0)
                    i_131_ = -i_131_;
                if (bool) {
                    for (int i_134_ = i; i_134_ <= i_119_; i_134_++) {
                        Class372_Sub2.anIntArrayArray4047[i_134_][i_129_] = i_121_;
                        i_132_ += i_131_;
                        if (i_132_ > 0) {
                            i_129_ += i_133_;
                            i_132_ -= i_130_;
                        }
                    }
                } else {
                    for (int i_135_ = i; i_135_ <= i_119_; i_135_++) {
                        Class372_Sub2.anIntArrayArray4047[i_129_][i_135_] = i_121_;
                        i_132_ += i_131_;
                        if (i_132_ > 0) {
                            i_129_ += i_133_;
                            i_132_ -= i_130_;
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jm.s(").append(')').toString());
        }
    }

    public static void method5905() {
        try {
            for (MenuOptionNode menuOptionNode = ((MenuOptionNode) Class436.aClass461_5482.first()); null != menuOptionNode; menuOptionNode = ((MenuOptionNode) Class436.aClass461_5482.next())) {
                if ((-628325139 * menuOptionNode.getTotalMenus) > 1) {
                    menuOptionNode.getTotalMenus = 0;
                    Class436.aClass348_5464.put(menuOptionNode, (((MenuOption) menuOptionNode.circularDoubleLinkedList.DELIMETER.next_cache).unlocker * 6619564980435866523L));
                    menuOptionNode.circularDoubleLinkedList.clear();
                }
            }
            Class436.anInt5479 = 0;
            Class436.menuOptionCount = 0;
            Class436.aClass453_5480.clean();
            Class436.aClass437_5470.clear();
            Class436.aClass461_5482.clear();
            GameClient.menuOpen = false;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sl.aa(").append(')').toString());
        }
    }

    static int method952(int i, int i_15_) {
        try {
            if (-1976050083 * Class424.aClass424_6592.type == i || i == -1976050083 * Class424.aClass424_6594.type)
                return anIntArray9891[i_15_ & 0x3];
            return anIntArray9890[i_15_ & 0x3];
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dk.by(").append(')').toString());
        }
    }

    public static void method589() {
        try {
            DiskFile diskFile = null;
            try {
                diskFile = DiskFile.method962("2", GameClient.game.BUILD_NAME, true);
                Buffer buffer = new Buffer(GameClient.anInt8890 * 260699542 + 3);
                buffer.writeByte(1);
                buffer.writeShort(GameClient.anInt8890 * -672377959);
                for (int i_8_ = 0; i_8_ < Class374.interfaceGCValue.length; i_8_++) {
                    if (Class254.interfaceGC[i_8_]) {
                        buffer.writeShort(i_8_);
                        buffer.writeInt((Class374.interfaceGCValue[i_8_]));
                    }
                }
                diskFile.method6078(buffer.buffer, 0, 385051775 * buffer.offset);
            } catch (Exception exception) {
                /* empty */
            }
            try {
                if (null != diskFile)
                    diskFile.method6079();
            } catch (Exception exception) {
                /* empty */
            }
            GameClient.aLong8892 = TimeUtils.getTime() * 5732957771927789473L;
            GameClient.aBoolean8736 = false;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wk.gr(").append(')').toString());
        }
    }

    public static void resetSounds() {
        for (int index = 0; index < -991384187 * Class300.anInt3213; index++) {
            Class297 class297 = Class300.aClass297Array3214[index];
            if (class297.aByte3176 == 3)
                method4957(class297);
        }
    }

    static final void method5618() {
        SettingsManager.loadHighSettings();
        GameClient.myRegion.method2667();
        ToMoveSettings.encodeBuffer();
        GameClient.sentPreferences = false;
    }

    static final void method5732(int i) {
        try {
            Iterator iterator = GameClient.aClass437_8825.iterator();
            while (iterator.hasNext()) {
                Class298_Sub37_Sub3 class298_sub37_sub3 = (Class298_Sub37_Sub3) iterator.next();
                Class365_Sub1_Sub1_Sub3 class365_sub1_sub1_sub3 = (class298_sub37_sub3.aClass365_Sub1_Sub1_Sub3_9578);
                class365_sub1_sub1_sub3.method4483(1, -748759469);
                if (class365_sub1_sub1_sub3.method4484(1662190190)) {
                    class298_sub37_sub3.unlink();
                    class365_sub1_sub1_sub3.method4480((byte) 54);
                } else if ((GameClient.myRegion.getRegion() != null) && class365_sub1_sub1_sub3.method4481((byte) -116))
                    GameClient.myRegion.getRegion().method4022(class365_sub1_sub1_sub3, true, (byte) 0);
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aez.ik(").append(')').toString());
        }
    }

    static final void method5657() {
        ToMoveScripts.method3853();
    }

    public static void method6310(boolean bool, int i) {
        try {
            method2365();
            if (method5804(GameClient.gameState * -1233866115)) {
                ConnectionType[] connectionTypes = GameClient.aConnectionTypeArray8679;
                for (int i_4_ = 0; i_4_ < connectionTypes.length; i_4_++) {
                    ConnectionType connection = connectionTypes[i_4_];
                    connection.anInt339 += 1797987493;
                    if (connection.anInt339 * 2033675053 < 50 && !bool)
                        return;
                    connection.anInt339 = 0;
                    if (!connection.aBoolean347 && connection.getStream() != null) {
                        OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.PING_PACKET, connection.encryptor);
                        connection.sendFrame(outgoingPacketBuffer);
                        try {
                            connection.flush();
                        } catch (IOException ioexception) {
                            connection.aBoolean347 = true;
                        }
                    }
                }
                method2365();
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("vt.a(").append(')').toString());
        }
    }

    static void method6308(GraphicsToolkit toolkit) {
        if (Class522.aClass453_6283.size2() != 0) {
            if (SettingsManager.settingsManager.toolkitSetting.getValue() == ToolkitOption.PUREJAVA) {
                for (Class298_Sub14 class298_sub14 = (Class298_Sub14) Class522.aClass453_6283.method5939(); null != class298_sub14; class298_sub14 = ((Class298_Sub14) Class522.aClass453_6283.method5944())) {
                    Js5Configs.itemList.method6086(toolkit, toolkit, (-1979936541 * class298_sub14.anInt7264), (class298_sub14.anInt7261 * -751580615), (1613862267 * class298_sub14.anInt7263), (class298_sub14.anInt7260 * -944151257), false, false, (-1216336855 * class298_sub14.anInt7262), FontToolkit.fontToolkit, (class298_sub14.aBoolean7265 ? (Player.myPlayer.appearance) : null));
                    class298_sub14.unlink();
                }
                method4301();
            } else {
                if (null == Class522.aClass_ra6285) {
                    Canvas canvas = new Canvas();
                    canvas.setSize(36, 32);
                    Class522.aClass_ra6285 = GraphicsToolkit.getCreatedToolkit(ToolkitOption.PUREJAVA, canvas, Js5Configs.texturesList, Js5List.JS5_SHADERS, 0);
                    Class522.aClass264_6284 = (Class522.aClass_ra6285.createFontToolkit(Class322.getFontMetricFileData(Js5List.JS5_FONTMETRICS, (399302739 * Class74.containerID), 0), Sprite.load(Js5List.JS5_SPRITES, Class74.containerID * 399302739, 0), true));
                }
                for (Class298_Sub14 class298_sub14 = (Class298_Sub14) Class522.aClass453_6283.method5939(); null != class298_sub14; class298_sub14 = ((Class298_Sub14) Class522.aClass453_6283.method5944())) {
                    Js5Configs.itemList.method6086(Class522.aClass_ra6285, toolkit, (class298_sub14.anInt7264 * -1979936541), (class298_sub14.anInt7261 * -751580615), (class298_sub14.anInt7263 * 1613862267), (class298_sub14.anInt7260 * -944151257), false, false, (-1216336855 * class298_sub14.anInt7262), Class522.aClass264_6284, (class298_sub14.aBoolean7265 ? (Player.myPlayer.appearance) : null));
                    class298_sub14.unlink();
                }
            }
        }
    }

    public static String getTargetMenuOption(MenuOption menuOption) {
        if (GameClient.menuOpen || menuOption == null)
            return "";
        return menuOption.target;
    }

    public static Class335 method818(boolean bool) {
        try {
            synchronized (Class335.stack) {
                Class335 class335;
                if (Class335.stack.isEmpty())
                    class335 = new Class335();
                else
                    class335 = (Class335) Class335.stack.pop();
                class335.aBoolean3617 = bool;
                Class335 class335_6_ = class335;
                return class335_6_;
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("cz.a(").append(')').toString());
        }
    }

    static void method5895(GraphicsToolkit toolkit) {
        toolkit.setClip(0, 0, -2110394505 * GameShell.canvasWidth, 350);
        toolkit.drawFilledRectangle(0, 0, -2110394505 * GameShell.canvasWidth, 350, Class8.anInt98 * 256666041 << 24 | 0x332277, 1);
        int i_2_ = 350 / (376067837 * Class8.anInt110);
        if (Class8.anInt102 * -2035787443 > 0) {
            int i_3_ = 346 - 376067837 * Class8.anInt110 - 4;
            int i_4_ = i_3_ * i_2_ / (i_2_ + -2035787443 * Class8.anInt102 - 1);
            int i_5_ = 4;
            if (-2035787443 * Class8.anInt102 > 1)
                i_5_ += ((-2035787443 * Class8.anInt102 - 1 - Class8.anInt103 * -1731316011) * (i_3_ - i_4_) / (Class8.anInt102 * -2035787443 - 1));
            toolkit.drawFilledRectangle(GameShell.canvasWidth * -2110394505 - 16, i_5_, 12, i_4_, Class8.anInt98 * 256666041 << 24 | 0x332277, 2);
            for (int i_6_ = -1731316011 * Class8.anInt103; (i_6_ < -1731316011 * Class8.anInt103 + i_2_ && i_6_ < -2035787443 * Class8.anInt102); i_6_++) {
                String[] strings = Class365_Sub1_Sub3_Sub1.method4508((Class8.consoleMessages[i_6_]), '\010');
                int i_7_ = ((-2110394505 * GameShell.canvasWidth - 8 - 16) / strings.length);
                for (int i_8_ = 0; i_8_ < strings.length; i_8_++) {
                    int i_9_ = 8 + i_7_ * i_8_;
                    toolkit.setClip(i_9_, 0, i_9_ + i_7_ - 8, 350);
                    aClass264_3673.method2488(StringUtils.method1276(strings[i_8_]), i_9_, (350 - Class8.anInt106 * 1194411673 - 2 - (-1883958527 * aClass505_8369.anInt6197) - (376067837 * Class8.anInt110 * (i_6_ - Class8.anInt103 * -1731316011))), -1, -16777216);
                }
            }
        }
        FontToolkit.fontToolkit.method2474("718 1", -2110394505 * GameShell.canvasWidth - 25, 330, -1, -16777216);
        toolkit.setClip(0, 0, GameShell.canvasWidth * -2110394505, 350);
        toolkit.method4990(0, 350 - Class8.anInt106 * 1194411673, GameShell.canvasWidth * -2110394505, -1);
        b12_full_monochrome.method2488(new StringBuilder().append("--> ").append(StringUtils.method1276(Class8.consoleText)).toString(), 10, (350 - Class82_Sub19_Sub1.aClass505_9111.anInt6197 * -1883958527 - 1), -1, -16777216);
        if (aBoolean8385) {
            int i_10_ = -1;
            if (443738891 * GameClient.clientTick % 30 > 15)
                i_10_ = 16777215;
            toolkit.method5035((10 + (Class82_Sub19_Sub1.aClass505_9111.method6264(new StringBuilder().append("--> ").append(StringUtils.method1276(Class8.consoleText).substring(0, Class8.consoleTextIndex * -1182747927)).toString()))), 350 - -1883958527 * (Class82_Sub19_Sub1.aClass505_9111.anInt6197) - 11, 12, i_10_);
        }
        toolkit.L();
        Class98_Sub2.method1061();
    }

    public static boolean method5897(Js5FileSystem class243, Js5FileSystem class243_11_, Js5FileSystem class243_12_, Class298_Sub19_Sub1 class298_sub19_sub1, Class284 class284) {
        try {
            Class79.aClass243_747 = class243;
            Class79.aClass243_735 = class243_11_;
            Class79.aClass243_736 = class243_12_;
            Class79.aClass298_Sub19_Sub1_737 = class298_sub19_sub1;
            Class79.aClass284_738 = class284;
            Light.anIntArray7229 = new int[16];
            for (int i_13_ = 0; i_13_ < 16; i_13_++)
                Light.anIntArray7229[i_13_] = 255;
            return true;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sj.a(").append(')').toString());
        }
    }

    public static void method6188(Js5FileSystem fileSystem) {
        Class344.anInt3678 = 0;
        Class344.anInt3686 = 0;
        Class344.aList3683 = new java.util.LinkedList();
        Class344.aClass302_Sub3_Sub1_Sub1Array3676 = new Class302_Sub3_Sub1_Sub1[1024];
        Class344.aParticleSystemArray3679 = new ParticleSystem[1 + (Class65.anIntArray658[1197525581 * Class344.anInt3675])];
        Class344.anInt3680 = 0;
        Class344.anInt3681 = 0;
        method1243(fileSystem);
        method1146(fileSystem);
    }

    static boolean method6189(int i) {
        return (44 == i || i == 45 || 46 == i || 47 == i || 48 == i || 49 == i || 50 == i || i == 51 || 52 == i || 53 == i || i == 15);
    }

    static int method4263(int i, int i_8_) {
        try {
            if (Class424.aClass424_6592.type * -1976050083 == i || -1976050083 * Class424.aClass424_6594.type == i)
                return Class365_Sub1_Sub5_Sub2.anIntArray9938[i_8_ & 0x3];
            return Class365_Sub1_Sub5_Sub2.anIntArray9937[i_8_ & 0x3];
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ov.by(").append(')').toString());
        }
    }

    public static void method4295(int i) {
        try {
            Class301_Sub1.anInt7633 = 2138103821 * i;
            Class301_Sub1.anInt7630 = -1998014133;
            Class137_Sub1.anInt6991 = -189172599;
            Class88.anInt810 = -338630500;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("oz.cz(").append(')').toString());
        }
    }

    public static void method4294() {
        try {
            int i_12_ = 0;
            if (SettingsManager.settingsManager.lighting.getValue() == 1) {
                i_12_ |= 0x1;
                i_12_ |= 0x10;
                i_12_ |= 0x20;
                i_12_ |= 0x2;
                i_12_ |= 0x4;
            }
            if (SettingsManager.settingsManager.textures.getValue() == TextureSetting.OFF)
                i_12_ |= 0x40;
            method4572(i_12_);
            GameClient.myRegion.getObjectDefinitionLoader().method5791(i_12_);
            Class62.aClass248_612.getGameMap().getObjectDefinitionLoader().method5791(i_12_);
            Js5Configs.itemList.method6087(i_12_);
            NPCDefinitionLoader.npcList.method6271(i_12_);
            SpotTypeLoader.loader.method4860(i_12_);
            Class372.method4594(i_12_);
            method872(i_12_);
            Class462.method4515(i_12_);
            PlayerAppearance.method6312(i_12_);
            method2002(i_12_);
            GameClient.myRegion.method2667();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("oz.gw(").append(')').toString());
        }
    }

    public static Class336 method4214(int i, int i_28_) {
        try {
            Class315.aClass336_Sub6_3307.toX = i * -760677635;
            Class315.aClass336_Sub6_3307.toY = i_28_ * 167105303;
            Class315.aClass336_Sub6_3307.sizeX = -1544157451;
            Class315.aClass336_Sub6_3307.sizeY = -1468199503;
            return Class315.aClass336_Sub6_3307;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("op.a(").append(')').toString());
        }
    }

    public static int method4215(int i, int i_30_, float f) {
        return Class298_Sub32_Sub38.method3387(i, i_30_, (int) f);
    }

    static void renderConsole() {
        if (Class8.anInt98 * 256666041 < 102)
            Class8.anInt98 += 879545142;
        if (-917301319 * Class8.consoleScriptIndex != -1 && (3224865510845692061L * Class146.consolePauseTime < TimeUtils.getTime())) {
            for (int i_33_ = Class8.consoleScriptIndex * -917301319; i_33_ < Class8.consoleScript.length; i_33_++) {
                if (Class8.consoleScript[i_33_].startsWith("pause")) {
                    int i_34_ = 5;
                    try {
                        i_34_ = Integer.parseInt(Class8.consoleScript[i_33_].substring(6));
                    } catch (Exception exception) {

                    }
                    sendConsoleMessage(new StringBuilder().append("Pausing for ").append(i_34_).append(" seconds...").toString());
                    Class8.consoleScriptIndex = (i_33_ + 1) * -1428832631;
                    Class146.consolePauseTime = (TimeUtils.getTime() + (long) (1000 * i_34_)) * 6717445677357895093L;
                    return;
                }
                Class8.consoleText = Class8.consoleScript[i_33_];
                Class142.submitConsoleMessage(false);
            }
            Class8.consoleScriptIndex = 1428832631;
        }
        if (0 != 1170859143 * GameClient.anInt8682) {
            Class8.anInt103 -= GameClient.anInt8682 * 1787831191;
            if (Class8.anInt103 * -1731316011 >= Class8.anInt102 * -2035787443)
                Class8.anInt103 = Class8.anInt102 * -1477098343 - 205738621;
            if (-1731316011 * Class8.anInt103 < 0)
                Class8.anInt103 = 0;
            GameClient.anInt8682 = 0;
        }
        for (int index = 0; index < 1351936279 * GameClient.keyRecordsSize; index++) {
            KeyRecord keyRecord = GameClient.lastKeyRecords[index];
            int keycode = keyRecord.getKeyCode();
            char character = keyRecord.getCharacter();
            int flags = keyRecord.getFlags();
            System.out.println(keycode);
            if (84 == keycode)

                Class142.submitConsoleMessage(false);
            if (keycode == 80)
                Class142.submitConsoleMessage(true);
            else if (keycode == 66 && 0 != (flags & 0x4)) {
                if (Class365_Sub1_Sub5_Sub2.aClipboard9941 != null) {
                    String string = "";
                    for (int index2 = Class8.consoleMessages.length - 1; index2 >= 0; index2--) {
                        if (Class8.consoleMessages[index2] != null && Class8.consoleMessages[index2].length() > 0)
                            string = new StringBuilder().append(string).append(Class8.consoleMessages[index2]).append('\n').toString();
                    }
                    Class365_Sub1_Sub5_Sub2.aClipboard9941.setContents(new StringSelection(string), null);
                }
            } else if (67 == keycode && 0 != (flags & 0x4)) {
                if (Class365_Sub1_Sub5_Sub2.aClipboard9941 != null) {
                    try {
                        Transferable transferable = Class365_Sub1_Sub5_Sub2.aClipboard9941.getContents(null);
                        if (transferable != null) {
                            String string = (String) (transferable.getTransferData(DataFlavor.stringFlavor));
                            if (null != string) {
                                String[] strings = (Class365_Sub1_Sub3_Sub1.method4508(string, '\n'));
                                Class55.method606(strings, 399274522);
                            }
                        }
                    } catch (Exception exception) {
                            /* empty */
                    }
                }
            } else if (keycode == 85 && -1182747927 * Class8.consoleTextIndex > 0) {
                Class8.consoleText = new StringBuilder().append(Class8.consoleText.substring(0, ((-1182747927 * Class8.consoleTextIndex) - 1))).append(Class8.consoleText.substring(Class8.consoleTextIndex * -1182747927)).toString();
                Class8.consoleTextIndex -= 1914783065;
            } else if (101 == keycode && (-1182747927 * Class8.consoleTextIndex < Class8.consoleText.length()))
                Class8.consoleText = new StringBuilder().append(Class8.consoleText.substring(0, -1182747927 * Class8.consoleTextIndex)).append(Class8.consoleText.substring(1 + (Class8.consoleTextIndex * -1182747927))).toString();
            else if (keycode == 96 && Class8.consoleTextIndex * -1182747927 > 0)
                Class8.consoleTextIndex -= 1914783065;
            else if (keycode == 97 && (-1182747927 * Class8.consoleTextIndex < Class8.consoleText.length()))
                Class8.consoleTextIndex += 1914783065;
            else if (102 == keycode)
                Class8.consoleTextIndex = 0;
            else if (103 == keycode)
                Class8.consoleTextIndex = Class8.consoleText.length() * 1914783065;
            else if (104 == keycode && (-1217082313 * Class8.anInt105 < Class8.consoleMessages.length)) {
                Class8.anInt105 += -1305958009;
                Class55.method607(-214283222);
                Class8.consoleTextIndex = Class8.consoleText.length() * 1914783065;
            } else if (105 == keycode && -1217082313 * Class8.anInt105 > 0) {
                Class8.anInt105 -= -1305958009;
                Class55.method607(1763987987);
                Class8.consoleTextIndex = Class8.consoleText.length() * 1914783065;
            } else if (StringUtils.isAlphabetic(character) || "\\/.:, _-+[]~@".indexOf(character) != -1) {
                Class8.consoleText = new StringBuilder().append(Class8.consoleText.substring(0, -1182747927 * Class8.consoleTextIndex)).append(GameClient.lastKeyRecords[index].getCharacter()).append(Class8.consoleText.substring(Class8.consoleTextIndex * -1182747927)).toString();
                Class8.consoleTextIndex += 1914783065;
            }
        }
        GameClient.keyRecordsSize = 0;
        GameClient.maximumHeldKeys = 0;
        method4301();
    }

    static final void method4958() {
        try {
            Class152.method1652(GameClient.activeGraphicsToolkit, (long) (443738891 * GameClient.clientTick));
            if (-257444687 * GameClient.WINDOW_PANE_ID != -1)
                method5884(-257444687 * GameClient.WINDOW_PANE_ID);
            for (int index = 0; index < -112139815 * GameClient.anInt8686; index++) {
                GameClient.rectangleGreen[index] = GameClient.aBooleanArray8900[index];
                GameClient.aBooleanArray8900[index] = false;
            }
            GameClient.windowTick = -1390800553 * GameClient.clientTick;
            if (-1 != GameClient.WINDOW_PANE_ID * -257444687) {
                GameClient.anInt8686 = 0;
                Class104.updateWindowPane();
            }
            GameClient.activeGraphicsToolkit.L();
            StaticMedia.loadFonts(GameClient.activeGraphicsToolkit);
            int i_6_ = Class298_Sub17_Sub4.method2926(-185727929);
            if (-1 == i_6_)
                i_6_ = GameClient.targetLeaveCursor * -1808468501;
            if (-1 == i_6_)
                i_6_ = GameClient.anInt8831 * 1203044105;
            method6314(i_6_);
            GameClient.animatorTick = 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qv.ig(").append(')').toString());
        }
    }

    public static void method4957(Class297 class297) {
        if (null != class297.aClass298_Sub19_Sub2_3184)
            Class285.aClass298_Sub19_Sub4_3083.method3048(class297.aClass298_Sub19_Sub2_3184);
        else
            class297.anInt3177 = -2147483648;
    }

    static final void method6233() {
        method6015();
    }

    public static final void method6015() {
        try {
            if (!GameClient.aBoolean8762) {
                GameClient.aFloat8759 += (-24.0F - GameClient.aFloat8759) / 2.0F;
                GameClient.aBoolean8763 = true;
                GameClient.aBoolean8762 = true;
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("td.hr(").append(')').toString());
        }
    }

    static void method3948(GraphicsToolkit toolkit, int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, byte i_10_) {
        try {
            toolkit.fillRectangle(i, i_5_, i_6_, i_7_, i_8_);
            toolkit.fillRectangle(1 + i, 1 + i_5_, i_6_ - 2, 16, i_9_);
            toolkit.drawRectangle(1 + i, 18 + i_5_, i_6_ - 2, i_7_ - 19, i_9_);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nl.aq(").append(')').toString());
        }
    }

    public static void method5951(int i, int i_7_, int i_8_, ObjectDefinition class432) {
        try {
            for (NotDefinition class298_sub41 = ((NotDefinition) NotDefinition.aClass453_7421.method5939()); null != class298_sub41; class298_sub41 = ((NotDefinition) NotDefinition.aClass453_7421.method5944())) {
                if (i == (-1926928785 * class298_sub41.anInt7424) && (class298_sub41.anInt7425 * -1808325887) == i_7_ << 9 && (class298_sub41.anInt7423 * 757346071 == i_8_ << 9) && (class432.objectID * 1181652947 == (class298_sub41.objectDefinition.objectID) * 1181652947)) {
                    if (null != (class298_sub41.aClass298_Sub19_Sub2_7447)) {
                        Class285.aClass298_Sub19_Sub4_3083.method3048(class298_sub41.aClass298_Sub19_Sub2_7447);
                        class298_sub41.aClass298_Sub19_Sub2_7447 = null;
                    }
                    if ((class298_sub41.aClass298_Sub19_Sub2_7426) != null) {
                        Class285.aClass298_Sub19_Sub4_3083.method3048(class298_sub41.aClass298_Sub19_Sub2_7426);
                        class298_sub41.aClass298_Sub19_Sub2_7426 = null;
                    }
                    class298_sub41.unlink();
                    break;
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("sr.i(").append(')').toString());
        }
    }

    public static void method3955(int i, int i_14_) {
        if (0 != 617004265 * Class79.anInt734) {
            if (i < 0) {
                for (int i_16_ = 0; i_16_ < 16; i_16_++)
                    Light.anIntArray7229[i_16_] = i_14_;
            } else
                Light.anIntArray7229[i] = i_14_;
        }
        Class79.aClass298_Sub19_Sub1_737.method2954(i, i_14_);
    }

    static boolean method4261(int i) {
        return (i >= -1976050083 * Class424.aClass424_6596.type && i <= -1976050083 * Class424.aClass424_6600.type);
    }

    public static void method4262() {
        aClass354_5218.method4254();
    }

    static final void method4944(long l) {
        try {
            int i = -2080858977 * GameClient.anInt8753;
            int i_2_ = GameClient.anInt8755 * 1818837461;
            if (Class75.anInt708 * 1103750049 != i) {
                int i_3_ = i - 1103750049 * Class75.anInt708;
                int i_4_ = (int) ((long) i_3_ * l / 320L);
                if (i_3_ > 0) {
                    if (0 == i_4_)
                        i_4_ = 1;
                    else if (i_4_ > i_3_)
                        i_4_ = i_3_;
                } else if (i_4_ == 0)
                    i_4_ = -1;
                else if (i_4_ < i_3_)
                    i_4_ = i_3_;
                Class75.anInt708 += -1832337311 * i_4_;
            }
            if (Class106.anInt1309 * 1346160791 != i_2_) {
                int i_5_ = i_2_ - 1346160791 * Class106.anInt1309;
                int i_6_ = (int) (l * (long) i_5_ / 320L);
                if (i_5_ > 0) {
                    if (i_6_ == 0)
                        i_6_ = 1;
                    else if (i_6_ > i_5_)
                        i_6_ = i_5_;
                } else if (0 == i_6_)
                    i_6_ = -1;
                else if (i_6_ < i_5_)
                    i_6_ = i_5_;
                Class106.anInt1309 += i_6_ * 1831024423;
            }
            GameClient.cameraXAngle += GameClient.aFloat8759 * (float) l / 40.0F * 8.0F;
            GameClient.cameraYAngle += 8.0F * ((float) l * GameClient.aFloat8760 / 40.0F);
            Class91.adjustCamera();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qt.hd(").append(')').toString());
        }
    }

    public static Class158 method4899(Buffer buffer) {
        Class158 class158 = Class80.method853(buffer);
        int i_0_ = buffer.read24BitInteger();
        return new Class158_Sub1(-610589451 * class158.anInt6361, class158.aClass139_6360, class158.aClass133_6363, -245579987 * class158.anInt6362, -1426302101 * class158.anInt6359, i_0_);
    }

    static boolean method4897() {
        return !Class88.isLoadingScreen(-1233866115 * GameClient.gameState);
    }

    static void method4693() {
        try {
            if (Class151.method1646(GameClient.gameState * -1233866115)) {
                if (ConnectionType.lobbyConnection.getStream() == null)
                    Class439.loadGameState(4);
                else
                    Class439.loadGameState(14);
            } else if (-1233866115 * GameClient.gameState == 4 || GameClient.gameState * -1233866115 == 3)
                Class439.loadGameState(19);
            else if (GameClient.gameState * -1233866115 == 6)
                Class439.loadGameState(19);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("px.o(").append(')').toString());
        }
    }

    static final void method535(int i) {
        int i_13_ = (GameClient.clientTick * 443738891 - GameClient.anInt8921 * -1656615113);
        if (i_13_ >= 100) {
            CameraUtils.cameraType = 1355934404;//4
            Class418.anInt5339 = -1001372047;
            Class100.anInt1081 = 178575833;
        } else {
            int i_14_ = (int) GameClient.cameraYAngle;
            if (GameClient.cameraYOffset * -523207831 >> 8 > i_14_)
                i_14_ = -523207831 * GameClient.cameraYOffset >> 8;
            if (GameClient.enabledCameraShakeSlots[4] && 128 + GameClient.cameraShakeDistance[4] > i_14_)
                i_14_ = 128 + GameClient.cameraShakeDistance[4];
            int i_15_ = ((int) GameClient.cameraXAngle + -1419578297 * GameClient.cameraXOffset & 0x3fff);
            Vector3f class217 = (Player.myPlayer.getWorldTransform().trans);
            Class482.method6121(1103750049 * Class75.anInt708, Class356.getAverageHeight((int) class217.x, (int) class217.z, 1855729883 * GameClient.plane, -1800819540) - 200, 1346160791 * Class106.anInt1309, i_14_, i_15_, 600 + (i_14_ >> 3) * 3 << 2, i);
            float f = 1.0F - ((float) ((100 - i_13_) * ((100 - i_13_) * (100 - i_13_))) / 1000000.0F);

            GameClient.camPosX = ((int) ((float) (Class301_Sub1.anInt7639 * -1806467999) + f * (float) (GameClient.camPosX * -1740717447 - (-1806467999 * Class301_Sub1.anInt7639))) * 547882953);
            GameClient.camPosY = (1078403147 * (int) ((float) (1449634147 * GameClient.camPosY - 2032233737 * Class409.anInt5284) * f + (float) (Class409.anInt5284 * 2032233737)));
            GameClient.camPosZ = ((int) (f * (float) (GameClient.camPosZ * -299812095 - (1368015401 * Class82_Sub2.anInt6822)) + (float) (1368015401 * Class82_Sub2.anInt6822)) * 309839105);
            GameClient.camRotX = ((int) ((float) (-104436553 * GameClient.camRotX - Class21.anInt277 * 827399463) * f + (float) (Class21.anInt277 * 827399463)) * -648269561);

            int i_16_ = (GameClient.camRotY * -1847894591 - -883946017 * Class298_Sub9.anInt7228);
            if (i_16_ > 8192)
                i_16_ -= 16384;
            else if (i_16_ < -8192)
                i_16_ += 16384;
            GameClient.camRotY = ((int) ((float) i_16_ * f + (float) (Class298_Sub9.anInt7228 * -883946017)) * -1587695039);
            GameClient.camRotY = -1587695039 * (-1847894591 * GameClient.camRotY & 0x3FFFF);
        }
    }

    static void method534() {
            Class121.anIntArray6321 = Class365_Sub1_Sub3_Sub2.method4513(2048, 35, 8, 8, 4, 0.4F, true, 33985);
    }

    static void method533(long[] ls, int[] is, int i, int i_3_) {
        try {
            if (i < i_3_) {
                int i_5_ = (i + i_3_) / 2;
                int i_6_ = i;
                long l = ls[i_5_];
                ls[i_5_] = ls[i_3_];
                ls[i_3_] = l;
                int i_7_ = is[i_5_];
                is[i_5_] = is[i_3_];
                is[i_3_] = i_7_;
                int i_8_ = 9223372036854775807L == l ? 0 : 1;
                for (int i_9_ = i; i_9_ < i_3_; i_9_++) {
                    if (ls[i_9_] < (long) (i_9_ & i_8_) + l) {
                        long l_10_ = ls[i_9_];
                        ls[i_9_] = ls[i_6_];
                        ls[i_6_] = l_10_;
                        int i_11_ = is[i_9_];
                        is[i_9_] = is[i_6_];
                        is[i_6_++] = i_11_;
                    }
                }
                ls[i_3_] = ls[i_6_];
                ls[i_6_] = l;
                is[i_3_] = is[i_6_];
                is[i_6_] = i_7_;
                method533(ls, is, i, i_6_ - 1);
                method533(ls, is, 1 + i_6_, i_3_);
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("c.d(").append(')').toString());
        }
    }

    static final String[] getRightClickStrings(String[] options) {
        try {
            String[] strings_4_ = new String[5];
            for (int i_5_ = 0; i_5_ < 5; i_5_++) {
                strings_4_[i_5_] = new StringBuilder().append(i_5_).append(" ").toString();
                if (null != options && options[i_5_] != null)
                    strings_4_[i_5_] = new StringBuilder().append(strings_4_[i_5_]).append(options[i_5_]).toString();
            }
            return strings_4_;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("vv.ly(").append(')').toString());
        }
    }

    public static byte[] method4978(byte[] is, int i) {
        try {
            if (is == null)
                return null;
            byte[] is_10_ = new byte[is.length];
            System.arraycopy(is, 0, is_10_, 0, is.length);
            return is_10_;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qz.a(").append(')').toString());
        }
    }

    public static void sendObjectAnimation(int plane, int localX, int localY, int i_12_, int type, int rotation, int animationID) {
        try {
            if (localX >= 0 && localY >= 0 && localX < GameClient.myRegion.getMapWidth() - 1 && localY < GameClient.myRegion.getMapLength() - 1) {
                if (GameClient.myRegion.getRegion() != null) {
                    if (i_12_ == 0) {
                        SceneObject sceneObject = ((SceneObject) GameClient.myRegion.getRegion().method4031(plane, localX, localY));
                        SceneObject sceneObject_17_ = ((SceneObject) GameClient.myRegion.getRegion().method4032(plane, localX, localY));
                        if (sceneObject != null && type != 2) {
                            if (sceneObject instanceof Class365_Sub1_Sub5_Sub2)
                                ((Class365_Sub1_Sub5_Sub2) sceneObject).aClass60_9935.method697(animationID);
                            else
                                method4923(plane, i_12_, localX, localY, sceneObject.getID(), rotation, type, animationID);
                        }
                        if (sceneObject_17_ != null) {
                            if (sceneObject_17_ instanceof Class365_Sub1_Sub5_Sub2)
                                ((Class365_Sub1_Sub5_Sub2) sceneObject_17_).aClass60_9935.method697(animationID);
                            else
                                method4923(plane, i_12_, localX, localY, sceneObject_17_.getID(), rotation, type, animationID);
                        }
                    } else if (i_12_ == 1) {
                        SceneObject sceneObject = ((SceneObject) GameClient.myRegion.getRegion().method4033(plane, localX, localY));
                        if (null != sceneObject) {
                            if (sceneObject instanceof Class365_Sub1_Sub3_Sub1)
                                ((Class365_Sub1_Sub3_Sub1) sceneObject).aClass60_9906.method697(animationID);
                            else {
                                int i_18_ = sceneObject.getID();
                                if (type == 4 || type == 5)
                                    method4923(plane, i_12_, localX, localY, i_18_, rotation, 4, animationID);
                                else if (type == 6)
                                    method4923(plane, i_12_, localX, localY, i_18_, 4 + rotation, 4, animationID);
                                else if (type == 7)
                                    method4923(plane, i_12_, localX, localY, i_18_, (2 + rotation & 0x3) + 4, 4, animationID);
                                else if (type == 8) {
                                    method4923(plane, i_12_, localX, localY, i_18_, 4 + rotation, 4, animationID);
                                    method4923(plane, i_12_, localX, localY, i_18_, 4 + (2 + rotation & 0x3), 4, animationID);
                                }
                            }
                        }
                    } else if (2 == i_12_) {
                        SceneObject sceneObject = ((SceneObject) (GameClient.myRegion.getRegion().method4035(plane, localX, localY, GameClient.anInterface17_8960)));
                        if (null != sceneObject) {
                            if (type == 11)
                                type = 10;
                            if (sceneObject instanceof Class365_Sub1_Sub1_Sub5)
                                ((Class365_Sub1_Sub1_Sub5) sceneObject).aClass60_9878.method697(animationID);
                            else
                                method4923(plane, i_12_, localX, localY, sceneObject.getID(), rotation, type, animationID);
                        }
                    } else if (i_12_ == 3) {
                        SceneObject sceneObject = ((SceneObject) GameClient.myRegion.getRegion().method4058(plane, localX, localY));
                        if (sceneObject != null) {
                            if (sceneObject instanceof Class365_Sub1_Sub2_Sub1)
                                ((Class365_Sub1_Sub2_Sub1) sceneObject).aClass60_9910.method697(animationID);
                            else
                                method4923(plane, i_12_, localX, localY, sceneObject.getID(), rotation, type, animationID);
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, "Error sending object animation");
        }
    }

    static void method6053() {
        try {
            if (GameClient.activeGraphicsToolkit != null) {
                GameClient.myRegion.method2646();
                InputStream_Sub1.method273();
                Class92.method1007();
                Class335.method764();
                GameClient.myRegion.createLightingDetails();
                Class116.method1267();
                JS5FileSystemLoader.method2082(false);
                Class372.method4595();
                Class423.method5733(true);
                Class82_Sub19.method926();
                Class234.method2175();
                for (int i_5_ = 0; i_5_ < GameClient.aClass299Array8671.length; i_5_++) {
                    if (GameClient.aClass299Array8671[i_5_] == null) {

                    }
                }
                for (int playerIndex = 0; playerIndex < 2048; playerIndex++) {
                    Player player = GameClient.entities[playerIndex];
                    if (player != null) {
                        for (int kitID = 0; kitID < (player.modelToolkits).length; kitID++)
                            player.modelToolkits[kitID] = null;
                    }
                }
                for (int npcIndex = 0; npcIndex < 1962237353 * GameClient.anInt8772; npcIndex++) {
                    NPC npc = ((NPC) GameClient.aClass298_Sub29Array8816[npcIndex].nodeObject);
                    if (npc != null) {
                        for (int kitID = 0; kitID < (npc.modelToolkits).length; kitID++)
                            npc.modelToolkits[kitID] = null;
                    }
                }
                GameClient.aClass437_8825.clear();
                GameClient.activeGraphicsToolkit.destroy();
                GameClient.activeGraphicsToolkit = null;
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tj.fp(").append(')').toString());
        }
    }

    public static Frame switchFullScreen(Display display, int clientWidth, int clientHeight, int i_6_, int i_7_) {
        try {
            if (0 == i_6_) {
                Class456[] class456s = Js5ArchiveEnum.method1238(display);
                if (class456s == null)
                    return null;
                boolean bool = false;
                for (int i_9_ = 0; i_9_ < class456s.length; i_9_++) {
                    if (clientWidth == class456s[i_9_].anInt5663 * 28445523 && 262154323 * class456s[i_9_].anInt5665 == clientHeight && (i_7_ == 0 || 1126617439 * (class456s[i_9_].anInt5662) == i_7_) && (!bool || (-1087459453 * class456s[i_9_].anInt5664 > i_6_))) {
                        i_6_ = -1087459453 * class456s[i_9_].anInt5664;
                        bool = true;
                    }
                }
                if (!bool)
                    return null;
            }
            Frame frame = new Frame("Jagex Full Screen");
            frame.setResizable(false);
            display.method5962(frame, clientWidth, clientHeight, i_6_, i_7_);
            return frame;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, "Error loading fullscreen");
        }
    }

    static void resize(int screenSizeMode, int clientWidth, int clientHeight, boolean bool) {
        if (GameClient.fullscreen && GameClient.fullScreenFrame != null && (3 != screenSizeMode || -1012194159 * Class431.anInt6502 != clientWidth || 1953279233 * ScriptInstructions.anInt6465 != clientHeight)) {
            ComponentMouseRecorder.method1010(GameClient.display, GameClient.fullScreenFrame, 1593156326);
            GameClient.fullScreenFrame = null;
        }
        if (GameClient.fullscreen && 3 == screenSizeMode && null == GameClient.fullScreenFrame) {
            GameClient.fullScreenFrame = switchFullScreen(GameClient.display, clientWidth, clientHeight, 0, 0);
            if (null != GameClient.fullScreenFrame) {
                Class431.anInt6502 = clientWidth * -660267919;
                ScriptInstructions.anInt6465 = -2089004287 * clientHeight;
                ToMoveSettings.encodeBuffer();
            }
        }
        if (screenSizeMode == 3 && (!GameClient.fullscreen || GameClient.fullScreenFrame == null))
            resize(SettingsManager.settingsManager.screenSize.getValue(), -1, -1, true);
        else {
            Container container = getParent();
            if (GameClient.fullScreenFrame != null) {
                GameClient.frameWidth = clientWidth * 1325868603;
                GameClient.frameHeight = -2115832951 * clientHeight;
            } else if (null != GameClient.windowFrame) {
                Insets insets = GameClient.windowFrame.getInsets();
                GameClient.frameWidth = (GameClient.windowFrame.getSize().width - (insets.left + insets.right)) * 1325868603;
                GameClient.frameHeight = (GameClient.windowFrame.getSize().height - (insets.top + insets.bottom)) * -2115832951;
            } else {
                GameClient.frameWidth = container.getSize().width * 1325868603;
                GameClient.frameHeight = container.getSize().height * -2115832951;
            }
            if (GameClient.frameWidth * -639974669 <= 0)
                GameClient.frameWidth = 1325868603;
            if (1282634425 * GameClient.frameHeight <= 0)
                GameClient.frameHeight = -2115832951;
            if (screenSizeMode != 1)
                ToMoveSettings.method2283();
            else {
                GameShell.canvasWidth = GameClient.anInt8794 * -1494558011;
                GameClient.leftMargin = (GameClient.frameWidth * -639974669 - 775068819 * GameClient.anInt8794) / 2 * -753018213;
                GameShell.canvasHeight = -909258791 * GameClient.anInt8803;
                GameClient.topMargin = 0;
            }
            if (aClass401_2708 != Class401.aClass401_6557 && -2110394505 * GameShell.canvasWidth < 1024 && GameShell.canvasHeight * -1111710645 >= 768) {
                    /* empty */
            }
            if (!bool) {
                DirectXContext.canvas.setSize(GameShell.canvasWidth * -2110394505, -1111710645 * GameShell.canvasHeight);
                GameClient.activeGraphicsToolkit.resize(DirectXContext.canvas, -2110394505 * GameShell.canvasWidth, GameShell.canvasHeight * -1111710645);

                if (GameClient.windowFrame == container) {
                    Insets insets = GameClient.windowFrame.getInsets();
                    DirectXContext.canvas.setLocation(1898544019 * GameClient.leftMargin + insets.left, insets.top + GameClient.topMargin * 540368727);
                } else
                    DirectXContext.canvas.setLocation(1898544019 * GameClient.leftMargin, GameClient.topMargin * 540368727);
            } else
                Class335.method4086();
            GameClient.resizable = screenSizeMode >= 2;
            method1852();
            if (-1 != -257444687 * GameClient.WINDOW_PANE_ID)
                Class257.method2453(true, (byte) 8);
            if (ConnectionType.gameConnection.getStream() != null && method5804(GameClient.gameState * -1233866115))
                method3974();
            for (int i_10_ = 0; i_10_ < 113; i_10_++)
                GameClient.aBooleanArray8900[i_10_] = true;
            GameClient.aBoolean6471 = true;
        }
    }

    static final int method1447(int i, int i_11_) {
        try {
            int i_13_ = i + i_11_ * 57;
            i_13_ = i_13_ << 13 ^ i_13_;
            int i_14_ = (1376312589 + i_13_ * (789221 + 15731 * (i_13_ * i_13_)) & 0x7fffffff);
            return i_14_ >> 19 & 0xff;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ff.l(").append(')').toString());
        }
    }

    public static Class355 method5651(Buffer buffer) {
        int length = buffer.readUByte();
        int[] data = new int[length];
        for (int index = 0; index < length; index++)
            data[index] = buffer.readUByte();
        return new Class355(data);
    }

    public static SpriteToolkit method5663(Js5FileSystem fileSystem, int i) {
        try {
            SpriteToolkit spriteToolkit = (SpriteToolkit) Class229.cache.get((long) i);
            if (null == spriteToolkit) {
                if (Class230.aBoolean2567)
                    spriteToolkit = (GameClient.activeGraphicsToolkit.createSpriteToolkit(Sprite.loadFirst(fileSystem, i), true));
                else
                    spriteToolkit = getSprite(fileSystem.get(i));
                Class229.cache.put(spriteToolkit, (long) i);
            }
            return spriteToolkit;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("adl.f(").append(')').toString());
        }
    }

    static void method5662(GraphicsToolkit toolkit, int i, int i_2_, IComponentDefinition componentDefinition, ToolkitLoader toolkitLoader, int i_3_, int i_4_) {
        try {
            for (int entityIndex = 0; entityIndex < GameClient.entitySize * -1230451913; entityIndex++) {
                ObjectNode node = ((ObjectNode) GameClient.entityList.get((long) GameClient.entityKeys[entityIndex]));
                if (node != null) {
                    NPC npc = ((NPC) node.nodeObject);
                    if (npc.method4457(1140952765) && ((Player.myPlayer.plane) == npc.plane)) {
                        NPCDefinition npcDefinition = npc.aClass503_10190;
                        if (null != npcDefinition && npcDefinition.morphisms != null)
                            npcDefinition = npcDefinition.morph(Class128.playerVarsProvider);
                        if (null != npcDefinition && npcDefinition.visibleOnMap && npcDefinition.isClickable) {
                            Vector3f class217 = (npc.getWorldTransform().trans);
                            int i_7_ = (int) class217.x / 128 - i / 128;
                            int i_8_ = (int) class217.z / 128 - i_2_ / 128;
                            if (-1 != -1362115471 * npcDefinition.anInt6186)
                                MapLoader.method2389(toolkit, toolkitLoader, componentDefinition, i_3_, i_4_, i_7_, i_8_, (-1362115471 * npcDefinition.anInt6186));
                            else
                                method5883(componentDefinition, toolkitLoader, i_3_, i_4_, i_7_, i_8_, (SubIncommingPacket.aClass57Array2349[1]));
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("adl.q(").append(')').toString());
        }
    }

    public static Interface21 method5701(Interface21[] interface21s, int i) {
        try {
            Interface21[] interface21s_3_ = interface21s;
            for (int i_4_ = 0; i_4_ < interface21s_3_.length; i_4_++) {
                Interface21 interface21 = interface21s_3_[i_4_];
                if (i == interface21.getID())
                    return interface21;
            }
            return null;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aeb.a(").append(')').toString());
        }
    }

    static final void method5635(int i) {
        int[] is = Class10.players;
        for (int i_2_ = 0; i_2_ < Class10.entitiesInRegion * 1168366243; i_2_++) {
            Player class365_sub1_sub1_sub2_sub2 = GameClient.entities[is[i_2_]];
            if (class365_sub1_sub1_sub2_sub2 != null)
                class365_sub1_sub1_sub2_sub2.method4428();
        }
        for (int i_3_ = 0; i_3_ < -1230451913 * GameClient.entitySize; i_3_++) {
            long l = (long) GameClient.entityKeys[i_3_];
            ObjectNode class298_sub29 = (ObjectNode) GameClient.entityList.get(l);
            if (null == class298_sub29) {
                if (i == -1062447355)
                    throw new IllegalStateException();
            } else
                ((Entity) class298_sub29.nodeObject).method4428();
        }
        if (0 == 1596783995 * GameClient.anInt8724) {
            for (int i_4_ = 0; i_4_ < Class87.aClass94Array794.length; i_4_++) {
                Class94 class94 = Class87.aClass94Array794[i_4_];
                if (!class94.aBoolean912) {
                    if (i == -1062447355) {
                            /* empty */
                    }
                } else
                    class94.method1015().method4428();
            }
        }
    }

    static final void configRoofAngle() {
        try {
            if (SettingsManager.settingsManager.currentRoofs.getValue() == RemoveRoofsSetting.SELECTIVELY) {
                byte[][][] roofFlags = GameClient.myRegion.getRoofFlags();
                byte flag = (byte) (-1953789277 * GameClient.flashTick - 4 & 0xff);
                int x = (-1953789277 * GameClient.flashTick % GameClient.myRegion.getMapWidth());
                for (int plane = 0; plane < 4; plane++) {
                    for (int y = 0; y < GameClient.myRegion.getMapLength(); y++)
                        roofFlags[plane][x][y] = flag;
                }
                if (GameClient.plane * 1855729883 != 3) {
                    for (int index = 0; index < 2; index++) {
                        GameClient.anIntArray8793[index] = -1000000;
                        GameClient.anIntArray8670[index] = 1000000;
                        GameClient.anIntArray8795[index] = 0;
                        GameClient.anIntArray8797[index] = 1000000;
                        GameClient.anIntArray8641[index] = 0;
                    }
                    Vector3f class217 = (Player.myPlayer.getWorldTransform().trans);
                    int playerPosX = (int) class217.x;
                    int playerPosY = (int) class217.z;
                    //System.out.println("X: " + playerPosX + ", Y: " + playerPosY);

                    Class244 class244 = GameClient.myRegion.method2654();
                    Region class331 = GameClient.myRegion.getRegion();
                    while_15_:
                    do {
                        if (CameraUtils.cameraType * -863531439 == CameraUtils.TYPE4 || Class100.anInt1081 * 1329981847 != -1) {
                            if (-863531439 * CameraUtils.cameraType != CameraUtils.TYPE4) {
                                playerPosX = Class100.anInt1081 * 1329981847;
                                playerPosY = Class418.anInt5339 * -1106950801;
                            }
                            if (((class244.flags[1855729883 * GameClient.plane][playerPosX >> 9][playerPosY >> 9]) & 0x4) != 0)
                                Class143.method1577(class331.gameSceneBase, 0, playerPosX >> 9, playerPosY >> 9, false, -777988087);
                            else if (GameClient.camRotX * -104436553 < 2560) {
                                int i_9_ = -1740717447 * GameClient.camPosX >> 9;
                                int i_10_ = GameClient.camPosZ * -299812095 >> 9;
                                int i_11_ = playerPosX >> 9;
                                int i_12_ = playerPosY >> 9;
                                int i_13_;
                                if (i_11_ > i_9_)
                                    i_13_ = i_11_ - i_9_;
                                else
                                    i_13_ = i_9_ - i_11_;
                                int i_14_;
                                if (i_12_ > i_10_)
                                    i_14_ = i_12_ - i_10_;
                                else
                                    i_14_ = i_10_ - i_12_;
                                if (0 == i_13_ && 0 == i_14_ || i_13_ <= -GameClient.myRegion.getMapWidth() || i_13_ >= GameClient.myRegion.getMapWidth() || i_14_ <= -GameClient.myRegion.getMapLength() || i_14_ >= GameClient.myRegion.getMapLength()) {
                                    GameScene gameScene = GameClient.myRegion.getGameScene();
                                    IPAddress.reportError(new StringBuilder().append(i_9_).append(Class26.comma).append(i_10_).append(" ").append(i_11_).append(Class26.comma).append(i_12_).append(" ").append(gameScene.gameSceneBaseX * -1760580017).append(Class26.comma).append(gameScene.gameSceneBaseY * 283514611).toString(), new RuntimeException());
                                    break;
                                }
                                if (i_13_ > i_14_) {
                                    int i_15_ = i_14_ * 65536 / i_13_;
                                    int i_16_ = 32768;
                                    for (; ; ) {
                                        if (i_11_ == i_9_)
                                            break while_15_;
                                        if (i_9_ < i_11_)
                                            i_9_++;
                                        else if (i_9_ > i_11_)
                                            i_9_--;
                                        if (((class244.flags[1855729883 * GameClient.plane][i_9_][i_10_]) & 0x4) != 0) {
                                            Class143.method1577((class331.gameSceneBase), 1, i_9_, i_10_, false, -777988087);
                                            break while_15_;
                                        }
                                        i_16_ += i_15_;
                                        if (i_16_ >= 65536) {
                                            i_16_ -= 65536;
                                            if (i_10_ < i_12_)
                                                i_10_++;
                                            else if (i_10_ > i_12_)
                                                i_10_--;
                                            if (0 != ((class244.flags[(1855729883 * GameClient.plane)][i_9_][i_10_]) & 0x4))
                                                break;
                                        }
                                    }
                                    Class143.method1577(class331.gameSceneBase, 1, i_9_, i_10_, false, -777988087);
                                } else {
                                    int i_17_ = 65536 * i_13_ / i_14_;
                                    int i_18_ = 32768;
                                    for (; ; ) {
                                        if (i_10_ == i_12_)
                                            break while_15_;
                                        if (i_10_ < i_12_)
                                            i_10_++;
                                        else if (i_10_ > i_12_)
                                            i_10_--;
                                        if (0 != ((class244.flags[(GameClient.plane * 1855729883)][i_9_][i_10_]) & 0x4)) {
                                            Class143.method1577((class331.gameSceneBase), 1, i_9_, i_10_, false, -777988087);
                                            break while_15_;
                                        }
                                        i_18_ += i_17_;
                                        if (i_18_ >= 65536) {
                                            i_18_ -= 65536;
                                            if (i_9_ < i_11_)
                                                i_9_++;
                                            else if (i_9_ > i_11_)
                                                i_9_--;
                                            if (((class244.flags[(1855729883 * GameClient.plane)][i_9_][i_10_]) & 0x4) != 0)
                                                break;
                                        }
                                    }
                                    Class143.method1577(class331.gameSceneBase, 1, i_9_, i_10_, false, -777988087);
                                }
                            }
                        } else {
                            int averageHeight = Class356.getAverageHeight(GameClient.camPosX * -1740717447, GameClient.camPosZ * -299812095, GameClient.plane * 1855729883, -1780642340);
                            if (averageHeight - GameClient.camPosY * 1449634147 < 3200 && ((class244.flags[GameClient.plane * 1855729883][GameClient.camPosX * -1740717447 >> 9][-299812095 * GameClient.camPosZ >> 9]) & 0x4) != 0)
                                Class143.method1577(class331.gameSceneBase, 1, GameClient.camPosX * -1740717447 >> 9, -299812095 * GameClient.camPosZ >> 9, false, -777988087);
                        }
                    } while (false);
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aeg.io(").append(')').toString());
        }
    }

    public static void method5711(String string) {
        try {
            PublicMessage.sendPublicMessage(0, 0, "", "", "", string);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aeg.f(").append(')').toString());
        }
    }

    static String method5631(long l, int i, boolean bool) {
        try {
            Calendar calendar;
            if (bool) {
                method3686(l);
                calendar = Class490.calendar;
            } else {
                TimeUtils.method5658(l);
                calendar = Class490.aCalendar6073;
            }
            int i_4_ = calendar.get(5);
            int i_5_ = calendar.get(2) + 1;
            int i_6_ = calendar.get(1);
            int i_7_ = calendar.get(11);
            int i_8_ = calendar.get(12);
            return new StringBuilder().append(Integer.toString(i_4_ / 10)).append(i_4_ % 10).append("/").append(i_5_ / 10).append(i_5_ % 10).append("/").append(i_6_ % 100 / 10).append(i_6_ % 10).append(" ").append(i_7_ / 10).append(i_7_ % 10).append(":").append(i_8_ / 10).append(i_8_ % 10).toString();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("adc.b(").append(')').toString());
        }
    }

    static final void method5630(ScriptRuntime runtime) {
        int i_2_ = method6265();
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (Class11.anInt156 = SettingsManager.settingsManager.toolkitSetting.getValue() * 1970440745) * -1111444967;
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = i_2_;
        GameClient.myRegion.method2667();
        ToMoveSettings.encodeBuffer();
        GameClient.sentPreferences = false;
    }

    public static void method5694(String consoleText) {
        try {
            Class8.consoleText = consoleText;
            Class8.consoleTextIndex = Class8.consoleText.length() * 1914783065;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ady.r(").append(')').toString());
        }
    }

    static boolean method5728(Class352 class352) {
        try {
            if (class352 == null)
                return false;
            if (!class352.aBoolean3810)
                return false;
            if (!class352.method4237(Class301_Sub1.anInterface23_3223))
                return false;
            if (Class301_Sub1.aClass437_7636.get((long) (-1262065485 * class352.anInt3784)) != null)
                return false;
            return Class301_Sub1.aClass437_7637.get((long) (class352.anInt3817 * -804513353)) == null;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aer.bn(").append(')').toString());
        }
    }

    public static int method5639(int i) {
        try {
            int i_3_ = i >>> 1;
            i_3_ |= i_3_ >>> 1;
            i_3_ |= i_3_ >>> 2;
            i_3_ |= i_3_ >>> 4;
            i_3_ |= i_3_ >>> 8;
            i_3_ |= i_3_ >>> 16;
            return i & (i_3_ ^ 0xffffffff);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ade.i(").append(')').toString());
        }
    }

    static void method5643(IComponentDefinition componentDefinition) {
        if (GameClient.interfaceSelected) {
            if (componentDefinition.onUseOnObjHook != null) {
                IComponentDefinition class105_2_ = IComponentDefinition.getContainerComponent(Class379.interfaceHash * 1262526353, 392084321 * GameClient.containerComponent);
                if (class105_2_ != null) {
                    ScriptNode scriptNode = new ScriptNode();
                    scriptNode.aClass105_7525 = componentDefinition;
                    scriptNode.aClass105_7529 = class105_2_;
                    scriptNode.parameters = componentDefinition.onUseOnObjHook;
                    Class444.method5889(scriptNode);
                }
            }
            OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.ITEM_ON_ITEM, ConnectionType.gameConnection.encryptor);
            outgoingPacketBuffer.payload.writeShort(-1232467723 * componentDefinition.itemID);
            outgoingPacketBuffer.payload.writeShortLE128(componentDefinition.slot * -1309843523);
            outgoingPacketBuffer.payload.writeInt(Class379.interfaceHash * 1262526353);
            outgoingPacketBuffer.payload.writeInt(componentDefinition.interfaceHash);
            outgoingPacketBuffer.payload.writeShort(392084321 * GameClient.containerComponent);
            outgoingPacketBuffer.payload.writeShortLE128(GameClient.itemID * 1408085039);
            ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
        }
    }

    static void method3968(int i) {
        try {
            if (null == Class379.anIntArray4096)
                Class379.anIntArray4096 = new int[65536];
            else
                return;
            double d = 0.7 + (Math.random() * 0.03 - 0.015);
            int i_0_ = 0;
            for (int i_1_ = 0; i_1_ < 512; i_1_++) {
                float f = 360.0F * ((float) (i_1_ >> 3) / 64.0F + 0.0078125F);
                float f_2_ = 0.0625F + (float) (i_1_ & 0x7) / 8.0F;
                for (int i_3_ = 0; i_3_ < 128; i_3_++) {
                    float f_4_ = (float) i_3_ / 128.0F;
                    float f_5_ = 0.0F;
                    float f_6_ = 0.0F;
                    float f_7_ = 0.0F;
                    float f_8_ = f / 60.0F;
                    int i_9_ = (int) f_8_;
                    int i_10_ = i_9_ % 6;
                    float f_11_ = f_8_ - (float) i_9_;
                    float f_12_ = (1.0F - f_2_) * f_4_;
                    float f_13_ = (1.0F - f_11_ * f_2_) * f_4_;
                    float f_14_ = (1.0F - (1.0F - f_11_) * f_2_) * f_4_;
                    if (0 == i_10_) {
                        f_5_ = f_4_;
                        f_6_ = f_14_;
                        f_7_ = f_12_;
                    } else if (i_10_ == 1) {
                        f_5_ = f_13_;
                        f_6_ = f_4_;
                        f_7_ = f_12_;
                    } else if (2 == i_10_) {
                        f_5_ = f_12_;
                        f_6_ = f_4_;
                        f_7_ = f_14_;
                    } else if (3 == i_10_) {
                        f_5_ = f_12_;
                        f_6_ = f_13_;
                        f_7_ = f_4_;
                    } else if (4 == i_10_) {
                        f_5_ = f_14_;
                        f_6_ = f_12_;
                        f_7_ = f_4_;
                    } else if (5 == i_10_) {
                        f_5_ = f_4_;
                        f_6_ = f_12_;
                        f_7_ = f_13_;
                    }
                    f_5_ = (float) Math.pow((double) f_5_, d);
                    f_6_ = (float) Math.pow((double) f_6_, d);
                    f_7_ = (float) Math.pow((double) f_7_, d);
                    int i_15_ = (int) (256.0F * f_5_);
                    int i_16_ = (int) (f_6_ * 256.0F);
                    int i_17_ = (int) (256.0F * f_7_);
                    int i_18_ = i_17_ + ((i_15_ << 16) + -16777216 + (i_16_ << 8));
                    Class379.anIntArray4096[i_0_++] = i_18_;
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("np.b(").append(')').toString());
        }
    }

    public static void method3753() {
        try {
            for (NotDefinition class298_sub41 = ((NotDefinition) NotDefinition.aClass453_7421.method5939()); class298_sub41 != null; class298_sub41 = ((NotDefinition) NotDefinition.aClass453_7421.method5944())) {
                if (class298_sub41.aBoolean7437)
                    class298_sub41.method3519();
            }
            for (NotDefinition class298_sub41 = ((NotDefinition) NotDefinition.aClass453_7455.method5939()); null != class298_sub41; class298_sub41 = ((NotDefinition) NotDefinition.aClass453_7455.method5944())) {
                if (class298_sub41.aBoolean7437)
                    class298_sub41.method3519();
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mr.f(").append(')').toString());
        }
    }

    static void method3751() {
        try {
            Class360.activeConnection.dropFrames();
            Class360.activeConnection.bitsBuffer.offset = 0;
            Class360.activeConnection.aClass202_344 = null;
            Class360.activeConnection.aClass202_345 = null;
            Class360.activeConnection.aClass202_348 = null;
            Class360.activeConnection.anInt338 = 0;
            GameClient.shutdownDelay = 0;
            PublicMessage.clearMessage();
            GameClient.anInt8942 = 0;
            GameClient.anInt8941 = 0;
            GameClient.aString8804 = null;
            Class489.anInt6071 = 0;
            aClass7Array6846 = null;
            Class508.aClass162_6216 = null;
            Class225.aClass162_2512 = null;
            method1481();
            for (int i_39_ = 0; i_39_ < 25; i_39_++) {
                GameClient.anIntArray8924[i_39_] = 0;
                GameClient.anIntArray8828[i_39_] = 0;
                GameClient.anIntArray8829[i_39_] = 0;
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mr.ax(").append(')').toString());
        }
    }

    public static int getMessageCapacity() {
        return PublicMessage.messageCapacity * 1103086749;
    }

    public static final void method6194(String string) {
        if (null != string) {
            String string_0_ = Class173.method1824(string);
            if (string_0_ != null) {
                for (int i_1_ = 0; i_1_ < GameClient.anInt8941 * -1054937867; i_1_++) {
                    String string_2_ = GameClient.playerAccountNames[i_1_];
                    String string_3_ = Class173.method1824(string_2_);
                    if (StringUtils.method4910(string, string_0_, string_2_, string_3_)) {
                        GameClient.anInt8941 -= 560029533;
                        for (int i_4_ = i_1_; i_4_ < -1054937867 * GameClient.anInt8941; i_4_++) {
                            GameClient.playerAccountNames[i_4_] = GameClient.playerAccountNames[i_4_ + 1];
                            GameClient.aStringArray8945[i_4_] = GameClient.aStringArray8945[1 + i_4_];
                            GameClient.anIntArray8946[i_4_] = GameClient.anIntArray8946[i_4_ + 1];
                            GameClient.aStringArray8947[i_4_] = GameClient.aStringArray8947[i_4_ + 1];
                            GameClient.anIntArray8705[i_4_] = GameClient.anIntArray8705[1 + i_4_];
                            GameClient.aBooleanArray8722[i_4_] = GameClient.aBooleanArray8722[1 + i_4_];
                            GameClient.aBooleanArray8950[i_4_] = GameClient.aBooleanArray8950[1 + i_4_];
                        }
                        GameClient.anInt8883 = GameClient.anInt8933 * 754377557;
                        ConnectionType connectionType = ConnectionType.getConnectionType();
                        OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.REMOVE_FRIEND_PACKET, connectionType.encryptor);
                        outgoingPacketBuffer.payload.writeByte(method693(string));
                        outgoingPacketBuffer.payload.writeString(string);
                        connectionType.sendFrame(outgoingPacketBuffer);
                        break;
                    }
                }
            }
        }
    }

    public static boolean method5804(int i) {
        try {
            return 0 == i || i == 17 || 6 == i;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rz.ff(").append(')').toString());
        }
    }

    static void method4908(String string) {
        GameClient.settings = string;
        if (method4865() != Class292.aClass292_3162) {
            try {
                String string_0_ = GameClient.applet.getParameter(AppletParameter.aAppletParameter_2378.id);
                String string_1_ = GameClient.applet.getParameter(AppletParameter.aAppletParameter_2382.id);
                String string_2_ = new StringBuilder().append(string_0_).append("settings=").append(string).append("; version=1; path=/; domain=").append(string_1_).toString();
                if (string.length() == 0)
                    string_2_ = new StringBuilder().append(string_2_).append("; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0").toString();
                else
                    string_2_ = new StringBuilder().append(string_2_).append("; Expires=").append(Class304.method3742(TimeUtils.getTime() + 94608000000L)).append("; Max-Age=").append(94608000L).toString();
                Class466.method6020(GameClient.applet, new StringBuilder().append("document.cookie=\"").append(string_2_).append("\"").toString(), -1926451476);
            } catch (Throwable throwable) {
                    /* empty */
            }
        }
    }

    public static final int method4161(int i, int i_1_) {
        if (i == -2)
            return 12345678;
        if (i == -1) {
            if (i_1_ < 2)
                i_1_ = 2;
            else if (i_1_ > 126)
                i_1_ = 126;
            return i_1_;
        }
        i_1_ = (i & 0x7f) * i_1_ >> 7;
        if (i_1_ < 2)
            i_1_ = 2;
        else if (i_1_ > 126)
            i_1_ = 126;
        return (i & 0xff80) + i_1_;
    }

    public static void method2491(String username, String password) {
        try {
            if (username.length() <= 320 && method4931()) {
                ConnectionType.lobbyConnection.stopConnection();
                method957();
                Class360.username = username;
                Class360.password = password;
                Class439.loadGameState(4);
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("l.r(").append(')').toString());
        }
    }

    static void method2497(int i, int i_145_, int i_146_, int i_147_, int i_148_, int i_149_, int i_150_) {
        try {
            int i_152_ = i_146_ + i_150_;
            int i_153_ = i_147_ - i_150_;
            for (int i_154_ = i_146_; i_154_ < i_152_; i_154_++)
                Class82_Sub22.method940((Class372_Sub3.anIntArrayArray4047[i_154_]), i, i_145_, i_149_);
            for (int i_155_ = i_147_; i_155_ > i_153_; i_155_--)
                Class82_Sub22.method940((Class372_Sub3.anIntArrayArray4047[i_155_]), i, i_145_, i_149_);
            int i_156_ = i_150_ + i;
            int i_157_ = i_145_ - i_150_;
            for (int i_158_ = i_152_; i_158_ <= i_153_; i_158_++) {
                int[] is = Class372_Sub3.anIntArrayArray4047[i_158_];
                Class82_Sub22.method940(is, i, i_156_, i_149_);
                Class82_Sub22.method940(is, i_156_, i_157_, i_148_);
                Class82_Sub22.method940(is, i_157_, i_145_, i_149_);
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("l.n(").append(')').toString());
        }
    }

    public static int method6265() {
        boolean bool = true;
        boolean bool_78_ = false;
        boolean bool_79_ = false;
        if (Class12.systemInfo.cpuClockSpeed * 399637415 < 512 && 399637415 * Class12.systemInfo.cpuClockSpeed != 0)
            bool = false;
        if (Class82_Sub8.operatingSystem.startsWith("win")) {
            bool_79_ = true;
            bool_78_ = true;
        } else
            bool_78_ = true;
        if (Class11.aBoolean153)
            bool = false;
        if (Class11.aBoolean154)
            bool_78_ = false;
        if (Class11.aBoolean155)
            bool_79_ = false;
        if (!bool && !bool_78_ && !bool_79_)
            return Class407.optimizeGraphicsMode();
        int i_80_ = -1;
        int i_81_ = -1;
        int i_82_ = -1;
        if (bool) {
            try {
                i_80_ = ItemDefinition.method6043(2, 1000, 280501708);
            } catch (Exception exception) {
                    /* empty */
            }
        }
        if (bool_79_) {
            try {
                i_82_ = ItemDefinition.method6043(3, 1000, -2071277019);
                if (SettingsManager.settingsManager.toolkitSetting.getValue() == ToolkitOption.DIRECTXSPECIAL) {
                    ToolkitDesciption toolkitDesciption = GameClient.activeGraphicsToolkit.getDescription();
                    long l = (toolkitDesciption.driverVersion * 703334160035735425L & 0xffffffffffffL);
                    switch (toolkitDesciption.vendor * 267107087) {
                        case ToolkitDesciption.NVIDIA:
                            bool_78_ = bool_78_ & l >= 64425238954L;
                            break;
                        case ToolkitDesciption.ATI:
                            bool_78_ = bool_78_ & l >= 60129613779L;
                            break;
                    }
                }
            } catch (Exception exception) {
                    /* empty */
            }
        }
        if (bool_78_) {
            try {
                i_81_ = ItemDefinition.method6043(1, 1000, -1485617713);
            } catch (Exception exception) {
                    /* empty */
            }
        }
        if (i_80_ == -1 && -1 == i_81_ && -1 == i_82_)
            return Class407.optimizeGraphicsMode();
        i_82_ *= 1.1F;
        i_81_ *= 1.1F;
        if (i_80_ > i_82_ && i_80_ > i_81_)
            return Class353.method4252(i_80_);
        if (i_82_ > i_81_)
            return Class128_Sub1.method1439(3, i_82_);
        return Class128_Sub1.method1439(1, i_81_);
    }

    static void method4528(File file) {
        Class304.aFile3265 = file;
        if (!Class304.aFile3265.exists())
            throw new RuntimeException("");
        Class304.aBoolean3266 = true;
    }

    static void method4529(int i, int i_29_, int i_30_, int i_31_, int i_32_) {
        Class82_Sub22.method940(Class372_Sub3.anIntArrayArray4047[i_30_++], i, i_29_, i_32_);
        Class82_Sub22.method940(Class372_Sub3.anIntArrayArray4047[i_31_--], i, i_29_, i_32_);
        for (int i_34_ = i_30_; i_34_ <= i_31_; i_34_++) {
            int[] is = Class372_Sub3.anIntArrayArray4047[i_34_];
            is[i] = is[i_29_] = i_32_;
        }
    }

    static int method1057(int i, int i_76_) {
        try {
            int i_78_ = i >> 31 & i_76_ - 1;
            return i_78_ + (i + (i >>> 31)) % i_76_;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dz.r(").append(')').toString());
        }
    }

    static void updateSceneRenderOptions(GraphicsToolkit graphicsToolkit, int i, int i_14_, int i_15_) {
        if (i >= 0 && i_14_ >= 0 && null != Class436.aMatrix4f_5493) {
            GameScene gameScene = GameClient.myRegion.getGameScene();
            Matrix4f matrix4f = graphicsToolkit.cz();
            graphicsToolkit.ci(Class436.aMatrix4f_5493);
            graphicsToolkit.cw(Class436.aClass222_5495);
            graphicsToolkit.setClip(Class436.anInt5489 * -156795795, -2074651333 * Class436.anInt5490, (-156795795 * Class436.anInt5489 + 2125992951 * Class436.anInt5491), (Class436.anInt5490 * -2074651333 + Class436.anInt5492 * 971707205));
            graphicsToolkit.method5187(Class436.anInt5489 * -156795795, -2074651333 * Class436.anInt5490, 2125992951 * Class436.anInt5491, 971707205 * Class436.anInt5492);
            matrix4f.method2145(Class436.aClass222_5495);
            matrix4f.method2144(Class436.aMatrix4f_5493);
            matrix4f.method2146();
            int i_16_ = i - Class436.anInt5489 * -156795795;
            int i_17_ = i_14_ - Class436.anInt5490 * -2074651333;
            if (GameClient.myRegion.getRegion() != null && (!GameClient.interfaceSelected || (-112110875 * anInt3192 & 0x40) != 0)) {
                int i_18_ = -1;
                int i_19_ = -1;
                float f = ((float) i_16_ * 2.0F / (float) (Class436.anInt5491 * 2125992951) - 1.0F);
                float f_20_ = ((2.0F * (float) i_17_ / (float) (971707205 * Class436.anInt5492)) - 1.0F);
                matrix4f.method2149(f, f_20_, -1.0F, Class436.aFloatArray5475);
                float f_21_ = (Class436.aFloatArray5475[0] / Class436.aFloatArray5475[3]);
                float f_22_ = (Class436.aFloatArray5475[1] / Class436.aFloatArray5475[3]);
                float f_23_ = (Class436.aFloatArray5475[2] / Class436.aFloatArray5475[3]);
                matrix4f.method2149(f, f_20_, 1.0F, Class436.aFloatArray5475);
                float f_24_ = (Class436.aFloatArray5475[0] / Class436.aFloatArray5475[3]);
                float f_25_ = (Class436.aFloatArray5475[1] / Class436.aFloatArray5475[3]);
                float f_26_ = (Class436.aFloatArray5475[2] / Class436.aFloatArray5475[3]);
                float f_27_ = method1312(f_21_, f_22_, f_23_, f_24_, f_25_, f_26_, 4);
                if (f_27_ > 0.0F) {
                    float f_28_ = f_24_ - f_21_;
                    float f_29_ = f_26_ - f_23_;
                    int i_30_ = (int) (f_21_ + f_27_ * f_28_);
                    int i_31_ = (int) (f_29_ * f_27_ + f_23_);
                    i_18_ = i_30_ + (Player.myPlayer.getSize() - 1 << 8) >> 9;
                    i_19_ = i_31_ + (Player.myPlayer.getSize() - 1 << 8) >> 9;
                    int i_32_ = (Player.myPlayer.plane);
                    if (i_32_ < 3 && ((GameClient.myRegion.method2654().flags[1][i_30_ >> 9][i_31_ >> 9]) & 0x2) != 0)
                        i_32_++;
                }
                if (-1 != i_18_ && -1 != i_19_) {
                    if (GameClient.interfaceSelected && (-112110875 * anInt3192 & 0x40) != 0) {
                        IComponentDefinition class105 = IComponentDefinition.getContainerComponent((Class379.interfaceHash * 1262526353), (392084321 * GameClient.containerComponent));
                        if (class105 != null)
                            MenuOption.add(GameClient.selectedInterfaceOption, new StringBuilder().append(" ").append(Class26.lambdaExpression).append(" ").toString(), Class240.targetOverCursors * 697885143, 59, -1, 0L, i_18_, i_19_, true, false, (long) (i_18_ << 32 | i_19_), true);
                        else
                            IComponentDefinition.method1587();
                    } else {
                        if (aBoolean5196)
                            MenuOption.add((Tradution.FACE_HERE.translate(GameLanguage.CURRENT_LANGUAGE)), "", -1, 60, -1, 0L, i_18_, i_19_, true, false, (long) (i_18_ << 32 | i_19_), true);
                        MenuOption.add(mouseHoverString, "", GameClient.anInt8822 * -1471730241, 23, -1, 0L, i_18_, i_19_, true, false, (long) (i_18_ << 32 | i_19_), true);
                    }
                }
            }
            Class324 class324 = (GameClient.myRegion.getRegion().aClass324_3528);
            int i_33_ = i;
            int i_34_ = i_14_;
            List list = class324.aList3448;
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                Class335 class335 = (Class335) iterator.next();
                if (!GameClient.aBoolean8674 && ((Player.myPlayer.plane) != class335.aClass365_Sub1_3616.plane)) {
                    if (i_15_ == 202437353) {
                            /* empty */
                    }
                } else if (!class335.method4084(graphicsToolkit, i_33_, i_34_, 1628119840)) {
                    if (i_15_ == 202437353)
                        break;
                } else {
                    int i_36_;
                    int i_37_;
                    if (class335.aClass365_Sub1_3616 instanceof Class365_Sub1_Sub1) {
                        i_36_ = ((Class365_Sub1_Sub1) class335.aClass365_Sub1_3616).aShort9798;
                        i_37_ = ((Class365_Sub1_Sub1) class335.aClass365_Sub1_3616).aShort9795;
                    } else {
                        Vector3f class217 = (class335.aClass365_Sub1_3616.getWorldTransform().trans);
                        i_36_ = (int) class217.x >> 9;
                        i_37_ = (int) class217.z >> 9;
                    }
                    if (class335.aClass365_Sub1_3616 instanceof Player) {
                        Player player = ((Player) class335.aClass365_Sub1_3616);
                        int i_38_ = player.getSize();
                        Vector3f class217 = (player.getWorldTransform().trans);
                        if ((0 == (i_38_ & 0x1) && 0 == ((int) class217.x & 0x1ff) && ((int) class217.z & 0x1ff) == 0) || ((i_38_ & 0x1) == 1 && (((int) class217.x & 0x1ff) == 256) && 256 == ((int) class217.z & 0x1ff))) {
                            int i_39_ = ((int) class217.x - (player.getSize() - 1 << 8));
                            int i_40_ = ((int) class217.z - (player.getSize() - 1 << 8));
                            for (int i_41_ = 0; i_41_ < -1230451913 * GameClient.entitySize; i_41_++) {
                                ObjectNode class298_sub29 = ((ObjectNode) (GameClient.entityList.get((long) GameClient.entityKeys[i_41_])));
                                if (null == class298_sub29) {
                                    if (i_15_ == 202437353) {
                                            /* empty */
                                    }
                                } else {
                                    NPC class365_sub1_sub1_sub2_sub1 = ((NPC) class298_sub29.nodeObject);
                                    if (443738891 * GameClient.clientTick != (class365_sub1_sub1_sub2_sub1.anInt10070) * 335731285) {
                                        if (!class365_sub1_sub1_sub2_sub1.aBoolean10123) {
                                            if (i_15_ == 202437353) {
                                                    /* empty */
                                            }
                                        } else {
                                            Vector3f class217_42_ = (class365_sub1_sub1_sub2_sub1.getWorldTransform().trans);
                                            int i_43_ = ((int) (class217_42_.x) - (((class365_sub1_sub1_sub2_sub1.aClass503_10190.tileSpacesOccupied) * -2095128707) - 1 << 8));
                                            int i_44_ = ((int) (class217_42_.z) - ((-2095128707 * (class365_sub1_sub1_sub2_sub1.aClass503_10190.tileSpacesOccupied)) - 1 << 8));
                                            if (i_43_ >= i_39_ && (((class365_sub1_sub1_sub2_sub1.aClass503_10190.tileSpacesOccupied) * -2095128707) <= ((player.getSize()) - (i_43_ - i_39_ >> 9))) && i_44_ >= i_40_ && (((class365_sub1_sub1_sub2_sub1.aClass503_10190.tileSpacesOccupied) * -2095128707) <= ((player.getSize()) - (i_44_ - i_40_ >> 9)))) {
                                                Class140.method1555(class365_sub1_sub1_sub2_sub1, ((Player.myPlayer.plane) != (class335.aClass365_Sub1_3616.plane)));
                                                class365_sub1_sub1_sub2_sub1.anInt10070 = (-339947553 * GameClient.clientTick);
                                            }
                                        }
                                    }
                                }
                            }
                            int i_45_ = 1168366243 * Class10.entitiesInRegion;
                            int[] is = Class10.players;
                            for (int i_46_ = 0; i_46_ < i_45_; i_46_++) {
                                Player class365_sub1_sub1_sub2_sub2_47_ = (GameClient.entities[is[i_46_]]);
                                if ((null != class365_sub1_sub1_sub2_sub2_47_) && (443738891 * GameClient.clientTick != (335731285 * (class365_sub1_sub1_sub2_sub2_47_.anInt10070))) && (player != class365_sub1_sub1_sub2_sub2_47_)) {
                                    if (!class365_sub1_sub1_sub2_sub2_47_.aBoolean10123) {
                                        if (i_15_ == 202437353)
                                            return;
                                    } else {
                                        Vector3f class217_48_ = (class365_sub1_sub1_sub2_sub2_47_.getWorldTransform().trans);
                                        int i_49_ = ((int) (class217_48_.x) - ((class365_sub1_sub1_sub2_sub2_47_.getSize()) - 1 << 8));
                                        int i_50_ = ((int) (class217_48_.z) - ((class365_sub1_sub1_sub2_sub2_47_.getSize()) - 1 << 8));
                                        if (i_49_ >= i_39_ && (class365_sub1_sub1_sub2_sub2_47_.getSize() <= ((player.getSize()) - (i_49_ - i_39_ >> 9))) && i_50_ >= i_40_ && (class365_sub1_sub1_sub2_sub2_47_.getSize() <= ((player.getSize()) - (i_50_ - i_40_ >> 9)))) {
                                            Class298_Sub47.method3535(class365_sub1_sub1_sub2_sub2_47_, ((Player.myPlayer.plane) != (class335.aClass365_Sub1_3616.plane)));
                                            class365_sub1_sub1_sub2_sub2_47_.anInt10070 = (GameClient.clientTick * -339947553);
                                        }
                                    }
                                }
                            }
                        }
                        if (443738891 * GameClient.clientTick == 335731285 * (player.anInt10070)) {
                            if (i_15_ == 202437353) {
                                    /* empty */
                            }
                            continue;
                        }
                        Class298_Sub47.method3535(player, ((Player.myPlayer.plane) != class335.aClass365_Sub1_3616.plane));
                        player.anInt10070 = -339947553 * GameClient.clientTick;
                    }
                    if (class335.aClass365_Sub1_3616 instanceof NPC) {
                        NPC npc = ((NPC) class335.aClass365_Sub1_3616);
                        if (null != (npc.aClass503_10190)) {
                            Vector3f class217 = (npc.getWorldTransform().trans);
                            if ((0 == ((-2095128707 * (npc.aClass503_10190.tileSpacesOccupied)) & 0x1) && 0 == ((int) class217.x & 0x1ff) && (((int) class217.z & 0x1ff) == 0)) || (((-2095128707 * (npc.aClass503_10190.tileSpacesOccupied)) & 0x1) == 1 && (((int) class217.x & 0x1ff) == 256) && (((int) class217.z & 0x1ff) == 256))) {
                                int i_51_ = ((int) class217.x - (((-2095128707 * (npc.aClass503_10190.tileSpacesOccupied)) - 1) << 8));
                                int i_52_ = ((int) class217.z - (((npc.aClass503_10190.tileSpacesOccupied) * -2095128707) - 1 << 8));
                                for (int i_53_ = 0; (i_53_ < GameClient.entitySize * -1230451913); i_53_++) {
                                    ObjectNode class298_sub29 = ((ObjectNode) (GameClient.entityList.get((long) GameClient.entityKeys[i_53_])));
                                    if (class298_sub29 == null) {
                                        if (i_15_ == 202437353) {
                                                /* empty */
                                        }
                                    } else {
                                        NPC class365_sub1_sub1_sub2_sub1_54_ = ((NPC) (class298_sub29.nodeObject));
                                        if (((335731285 * (class365_sub1_sub1_sub2_sub1_54_.anInt10070)) != (GameClient.clientTick * 443738891)) && (class365_sub1_sub1_sub2_sub1_54_ != npc)) {
                                            if (!class365_sub1_sub1_sub2_sub1_54_.aBoolean10123) {
                                                if (i_15_ == 202437353)
                                                    throw new IllegalStateException();
                                            } else {
                                                Vector3f class217_55_ = (class365_sub1_sub1_sub2_sub1_54_.getWorldTransform().trans);
                                                int i_56_ = ((int) (class217_55_.x) - (((class365_sub1_sub1_sub2_sub1_54_.aClass503_10190.tileSpacesOccupied) * -2095128707) - 1 << 8));
                                                int i_57_ = ((int) (class217_55_.z) - (((-2095128707 * (class365_sub1_sub1_sub2_sub1_54_.aClass503_10190.tileSpacesOccupied)) - 1) << 8));
                                                if (i_56_ >= i_51_ && ((-2095128707 * (class365_sub1_sub1_sub2_sub1_54_.aClass503_10190.tileSpacesOccupied)) <= (((npc.aClass503_10190.tileSpacesOccupied) * -2095128707) - ((i_56_ - i_51_) >> 9))) && i_57_ >= i_52_ && ((-2095128707 * (class365_sub1_sub1_sub2_sub1_54_.aClass503_10190.tileSpacesOccupied)) <= ((-2095128707 * (npc.aClass503_10190.tileSpacesOccupied)) - ((i_57_ - i_52_) >> 9)))) {
                                                    Class140.method1555(class365_sub1_sub1_sub2_sub1_54_, ((class335.aClass365_Sub1_3616.plane) != (Player.myPlayer.plane)));
                                                    class365_sub1_sub1_sub2_sub1_54_.anInt10070 = (-339947553 * (GameClient.clientTick));
                                                }
                                            }
                                        }
                                    }
                                }
                                int i_58_ = 1168366243 * Class10.entitiesInRegion;
                                int[] is = Class10.players;
                                for (int i_59_ = 0; i_59_ < i_58_; i_59_++) {
                                    Player player = (GameClient.entities[is[i_59_]]);
                                    if ((null != player) && ((335731285 * (player.anInt10070)) != (GameClient.clientTick * 443738891))) {
                                        if (!player.aBoolean10123) {
                                            if (i_15_ == 202437353)
                                                return;
                                        } else {
                                            Vector3f class217_60_ = (player.getWorldTransform().trans);
                                            int i_61_ = ((int) (class217_60_.x) - ((player.getSize()) - 1 << 8));
                                            int i_62_ = ((int) (class217_60_.z) - ((player.getSize()) - 1 << 8));
                                            if (i_61_ >= i_51_ && ((player.getSize()) <= (((npc.aClass503_10190.tileSpacesOccupied) * -2095128707) - (i_61_ - i_51_ >> 9))) && i_62_ >= i_52_ && ((player.getSize()) <= ((-2095128707 * (npc.aClass503_10190.tileSpacesOccupied)) - (i_62_ - i_52_ >> 9)))) {
                                                Class298_Sub47.method3535(player, ((class335.aClass365_Sub1_3616.plane) != (Player.myPlayer.plane)));
                                                player.anInt10070 = (-339947553 * GameClient.clientTick);
                                            }
                                        }
                                    }
                                }
                            }
                            if ((npc.anInt10070 * 335731285) == 443738891 * GameClient.clientTick) {
                                if (i_15_ == 202437353)
                                    throw new IllegalStateException();
                                continue;
                            }
                            Class140.method1555(npc, ((Player.myPlayer.plane) != (class335.aClass365_Sub1_3616.plane)));
                            npc.anInt10070 = GameClient.clientTick * -339947553;
                        }
                    }
                    if (class335.aClass365_Sub1_3616 instanceof Class365_Sub1_Sub4_Sub1) {
                        int i_63_ = -1760580017 * gameScene.gameSceneBaseX + i_36_;
                        int i_64_ = 283514611 * gameScene.gameSceneBaseY + i_37_;
                        Class298_Sub2 class298_sub2 = ((Class298_Sub2) (GameClient.aClass437_8685.get((long) ((class335.aClass365_Sub1_3616.plane) << 28 | i_64_ << 14 | i_63_))));
                        if (null != class298_sub2) {
                            int i_65_ = 0;
                            Class298_Sub12 class298_sub12 = ((Class298_Sub12) class298_sub2.aClass453_7166.method5942());
                            while (class298_sub12 != null) {
                                ItemDefinition item = (Js5Configs.itemList.getItemDefinitions((1768239597 * class298_sub12.anInt7257)));
                                int htmlColorCode;
                                if (item.hasCustomColor)
                                    htmlColorCode = item.htmlColorCode * 292187293;
                                else if (item.membersOnly)
                                    htmlColorCode = (aClass381_1563.htmlColorCode) * 1295181471;
                                else
                                    htmlColorCode = 363537303 * (aClass381_1563.anInt4117);
                                if (GameClient.interfaceSelected && ((class335.aClass365_Sub1_3616.plane) == (Player.myPlayer.plane))) {
                                    Class497 class497 = ((IdentityKitDefinition.anInt1508 * 831522399 != -1) ? (Class92.aClass504_905.get((IdentityKitDefinition.anInt1508 * 831522399))) : null);
                                    if (0 != ((anInt3192 * -112110875) & 0x1) && (null == class497 || ((item.method6037((831522399 * IdentityKitDefinition.anInt1508), (-388931549 * class497.size))) != (-388931549 * (class497.size)))))
                                        MenuOption.add(GameClient.selectedInterfaceOption, new StringBuilder().append(GameClient.aString8754).append(" ").append(Class26.lambdaExpression).append(" ").append(ColorUtils.htmlToHex(htmlColorCode)).append(item.name).toString(), (Class240.targetOverCursors * 697885143), 17, -1, (long) ((class298_sub12.anInt7257) * 1768239597), i_36_, i_37_, true, false, (long) i_65_, false);
                                }
                                if (class335.aClass365_Sub1_3616.plane == (Player.myPlayer.plane)) {
                                    String[] itemOptions = item.groundOptions;
                                    for (int optionIDX = itemOptions.length - 1; optionIDX >= 0; optionIDX--) {
                                        if (null != itemOptions[optionIDX]) {
                                            int i_68_ = 0;
                                            int i_69_ = (GameClient.cursor * 1395924385);
                                            if (0 == optionIDX)
                                                i_68_ = 18;
                                            if (optionIDX == 1)
                                                i_68_ = 19;
                                            if (optionIDX == 2)
                                                i_68_ = 20;
                                            if (3 == optionIDX)
                                                i_68_ = 21;
                                            if (optionIDX == 4)
                                                i_68_ = 22;
                                            if (optionIDX == 5)
                                                i_68_ = 1004;
                                            if (optionIDX == (1109145023 * item.unknownInt18))
                                                i_69_ = (1605315453 * (item.unknownInt19));
                                            if ((item.unknownInt20 * 693471665) == optionIDX)
                                                i_69_ = (item.unknownInt21 * -1818170233);
                                            MenuOption.add(itemOptions[optionIDX], new StringBuilder().append(ColorUtils.htmlToHex(htmlColorCode)).append(item.name).toString(), i_69_, i_68_, -1, (long) ((class298_sub12.anInt7257) * 1768239597), i_36_, i_37_, true, false, (long) i_65_, false);
                                        }
                                    }
                                }
                                class298_sub12 = ((Class298_Sub12) class298_sub2.aClass453_7166.method5947());
                                i_65_++;
                            }
                        }
                    }
                    if (class335.aClass365_Sub1_3616 instanceof SceneObject) {
                        SceneObject sceneObject = (SceneObject) class335.aClass365_Sub1_3616;
                        ObjectDefinition objectDefinition = (GameClient.myRegion.getObjectDefinitionLoader().get(sceneObject.getID()));
                        if (objectDefinition.objectIDs != null)
                            objectDefinition = objectDefinition.method5777((Class128.playerVarsProvider));
                        if (objectDefinition == null) {
                            if (i_15_ == 202437353)
                                break;
                        } else {
                            if (GameClient.interfaceSelected && (class335.aClass365_Sub1_3616.plane == (Player.myPlayer.plane))) {
                                Class497 class497 = (831522399 * IdentityKitDefinition.anInt1508 != -1 ? (Class92.aClass504_905.get(IdentityKitDefinition.anInt1508 * 831522399)) : null);
                                if (0 != (anInt3192 * -112110875 & 0x4) && (class497 == null || ((objectDefinition.method5776((831522399 * IdentityKitDefinition.anInt1508), (class497.size * -388931549))) != (-388931549 * class497.size))))
                                    MenuOption.add(GameClient.selectedInterfaceOption, new StringBuilder().append(GameClient.aString8754).append(" ").append(Class26.lambdaExpression).append(" ").append(ColorUtils.htmlToHex(65535)).append(objectDefinition.name).toString(), Class240.targetOverCursors * 697885143, 2, -1, method1301(sceneObject, i_36_, i_37_), i_36_, i_37_, true, false, (long) sceneObject.hashCode(), false);
                            }
                            if (class335.aClass365_Sub1_3616.plane == (Player.myPlayer.plane)) {
                                String[] options = objectDefinition.options;
                                if (options != null) {
                                    for (int index = options.length - 1; index >= 0; index--) {
                                        if (options[index] != null) {
                                            int i_71_ = 0;
                                            int cursorID = (GameClient.cursor * 1395924385);
                                            if (0 == index)
                                                i_71_ = 3;
                                            if (1 == index)
                                                i_71_ = 4;
                                            if (index == 2)
                                                i_71_ = 5;
                                            if (index == 3)
                                                i_71_ = 6;
                                            if (index == 4)
                                                i_71_ = 1001;
                                            if (index == 5)
                                                i_71_ = 1002;
                                            if (index == (objectDefinition.anInt5397 * -1412413471))
                                                cursorID = (1501072109 * (objectDefinition.anInt5436));
                                            if (index == (objectDefinition.anInt5398 * 1498416223))
                                                cursorID = (objectDefinition.anInt5364 * -143998181);
                                            MenuOption.add(options[index], new StringBuilder().append(ColorUtils.htmlToHex(65535)).append(objectDefinition.name).toString(), cursorID, i_71_, -1, (method1301(sceneObject, i_36_, i_37_)), i_36_, i_37_, true, false, (long) sceneObject.hashCode(), false);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static final int method1069(int i, int i_38_, int i_39_) {
        try {
            if (i_38_ == i)
                return i;
            int i_41_ = 128 - i_39_;
            int i_42_ = i_39_ * (i_38_ & 0x7f) + i_41_ * (i & 0x7f) >> 7;
            int i_43_ = i_41_ * (i & 0x380) + (i_38_ & 0x380) * i_39_ >> 7;
            int i_44_ = (i & 0xfc00) * i_41_ + i_39_ * (i_38_ & 0xfc00) >> 7;
            return i_44_ & 0xfc00 | i_43_ & 0x380 | i_42_ & 0x7f;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yy.c(").append(')').toString());
        }
    }

    static void closeMenus() {
        for (MenuOptionNode node = ((MenuOptionNode) Class436.aClass461_5482.first()); null != node; node = ((MenuOptionNode) Class436.aClass461_5482.next())) {
            if ((-628325139 * node.getTotalMenus) > 1) {
                node.getTotalMenus = 0;
                Class436.aClass348_5464.put(node, (6619564980435866523L * ((MenuOption) node.circularDoubleLinkedList.DELIMETER.next_cache).unlocker));
                node.circularDoubleLinkedList.clear();
            }
        }
        Class436.anInt5479 = 0;
        Class436.menuOptionCount = 0;
        Class436.aClass453_5480.clean();
        Class436.aClass437_5470.clear();
        Class436.aClass461_5482.clear();
        Class282.method2618(Class436.aMenuOption_5466, 1921095656);
    }

    static Class298_Sub34 method1060(Js5FileSystem fileSystem, int i) {
        byte[] data = fileSystem.get(i);
        if (data == null)
            return null;
        return new Class298_Sub34(data);
    }

    static void method3138(int i, int i_11_) {
        Class436.anInt5489 = i * -305664667;
        Class436.anInt5490 = i_11_ * 67681267;
    }

    static void method314() {
        if ((Class436.menuOptionCount * -278777595 >= 2 || GameClient.interfaceSelected) && null == GameClient.fromIComponentDefinition) {
            String string;
            if (GameClient.interfaceSelected && -278777595 * Class436.menuOptionCount < 2)
                string = new StringBuilder().append(GameClient.selectedInterfaceOption).append(Tradution.aClass470_5916.translate(GameLanguage.CURRENT_LANGUAGE)).append(GameClient.aString8754).append(" ").append(Class26.lambdaExpression).toString();
            else if (method1275() && -278777595 * Class436.menuOptionCount > 2)
                string = Class8.method315((Class298_Sub45.aMenuOption_7522));
            else {
                MenuOption menuOption = Class298_Sub45.aMenuOption_7522;
                if (menuOption == null)
                    return;
                string = Class8.method315(menuOption);
                int[] is = Class313.method3821(menuOption);
                if (is != null)
                    string = new StringBuilder().append(string).append(method1999(is)).toString();
            }
            if (-278777595 * Class436.menuOptionCount > 2)
                string = new StringBuilder().append(string).append(ColorUtils.htmlToHex(16777215)).append(" / ").append(Class436.menuOptionCount * -278777595 - 2).append(Tradution.MORE_OPTIONS.translate(GameLanguage.CURRENT_LANGUAGE)).toString();
            if (Class436.componentDefinition != null) {
                FontToolkit class264 = (Class436.componentDefinition.getFontToolkit(StaticMethods5.fonts, GameClient.defaultFontRenderProvider, 2046154242));
                if (null == class264)
                    class264 = b12_full_monochrome;
                class264.drawClientText(string, -828992241 * Class436.anInt5487, 1604938967 * Class436.anInt5502, -2093041337 * Class436.componentDefinition.aspectWidth, Class436.componentDefinition.aspectHeight * 457937409, 1045422783 * Class436.componentDefinition.color, -2065110161 * Class436.componentDefinition.shadow, 872550387 * Class436.componentDefinition.lineHAlign, -1594110459 * Class436.componentDefinition.lineVAlign, GameClient.lineHeight, 1401020893 * Class368.random, GameClient.anIntArray8899, Class436.aClass57Array5501, anIntArray8372);
                method2112(GameClient.anIntArray8899[0], GameClient.anIntArray8899[1], GameClient.anIntArray8899[2], GameClient.anIntArray8899[3]);
            }
        }
    }

    public static void method3575() {
        try {
            Class87.aShort792 = GameClient.aShort8934;
            Class315.aShort3306 = GameClient.aShort8935;
            Class51.aShort504 = GameClient.aShort8839;
            aShort5193 = GameClient.aShort8743;
            Class87.aBoolean802 = true;
            if (Class87.anInt801 * 57998513 != 0 && 0 != 1705830085 * Class87.anInt800) {
                GameClient.aShort8839 = (short) 334;
                GameClient.aShort8743 = (short) 334;
                GameClient.aShort8935 = GameClient.aShort8934 = (short) (Class87.anInt801 * -369532416 / (1705830085 * Class87.anInt800));
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("acs.p(").append(')').toString());
        }
    }

    static final int method5581(int i, int i_0_) {
        try {
            int i_2_ = (method6377(45365 + i, 91923 + i_0_, 4, -715391467) - 128 + (method6377(10294 + i, 37821 + i_0_, 2, -715391467) - 128 >> 1) + (method6377(i, i_0_, 1, -715391467) - 128 >> 2));
            i_2_ = (int) (0.3 * (double) i_2_) + 35;
            if (i_2_ < 10)
                i_2_ = 10;
            else if (i_2_ > 60)
                i_2_ = 60;
            return i_2_;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rc.m(").append(')').toString());
        }
    }

    public static final void method4929(ModelToolkit modelToolkit, Animator animator, Animator animator_2_) {
        if (animator.animatePlayer() && animator_2_.animatePlayer()) {
            AnimationDefinition class391 = animator.animationDefinition;
            AnimationDefinition class391_3_ = animator_2_.animationDefinition;
            modelToolkit.method4736((animator.aClass441_5534.aClass298_Sub37_Sub4_5583), (animator.aClass441_5534.collectionID) * 806878007, (animator.aClass441_5534.aClass298_Sub37_Sub4_5587), -643912397 * animator.aClass441_5534.frameID, animator.anInt5525 * 458730501, (class391.frameDurations[-8792169 * animator.frameDelayIDX]), (animator_2_.aClass441_5534.aClass298_Sub37_Sub4_5583), 806878007 * animator_2_.aClass441_5534.collectionID, (animator_2_.aClass441_5534.aClass298_Sub37_Sub4_5587), -643912397 * animator_2_.aClass441_5534.frameID, 458730501 * animator_2_.anInt5525, (class391_3_.frameDurations[animator_2_.frameDelayIDX * -8792169]), class391.aBooleanArray4177, class391.aBoolean4185 | class391_3_.aBoolean4185);
        }
    }

    static boolean method4931() {
        if (19 != -1233866115 * GameClient.gameState)
            return false;
        return !(Class315.method3837() || Class489.method6167());
    }

    static void method3974() {
        OutgoingPacketBuffer buffer = Class18.method359(OutgoingPacket.SCREEN_PACKET, ConnectionType.gameConnection.encryptor);
        buffer.payload.writeByte(Class190.windowMode());
        buffer.payload.writeShort(GameShell.canvasWidth * -2110394505);
        buffer.payload.writeShort(GameShell.canvasHeight * -1111710645);
        buffer.payload.writeByte(SettingsManager.settingsManager.multisample.getValue());
        ConnectionType.gameConnection.sendFrame(buffer);
    }

    static final void resetCutscene() {
        GameClient.cutsceneID = -221729505;
        GameClient.anInt8724 = -1334571751;
        cutsceneXTEAS = null;
        Class128_Sub1.playerAppearence = null;
        Class87.reset();
    }

    static long method1301(SceneObject sceneObject, int i, int i_3_) {
        try {
            long l = 4194304L;
            long l_5_ = -9223372036854775808L;
            ObjectDefinition class432 = GameClient.myRegion.getObjectDefinitionLoader().get(sceneObject.getID());
            long l_6_ = (long) (i | i_3_ << 7 | sceneObject.method29() << 14 | sceneObject.method30() << 20 | 0x40000000);
            if (0 == 1532834983 * class432.anInt5382)
                l_6_ |= l_5_;
            if (class432.anInt5409 * 512737201 == 1)
                l_6_ |= l;
            l_6_ |= (long) sceneObject.getID() << 32;
            return l_6_;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ev.c(").append(')').toString());
        }
    }

    public static void method1300(int key) {
        try {
            Class298_Sub49 class298_sub49 = ((Class298_Sub49) Class423.aClass437_5354.get((long) key));
            if (null != class298_sub49) {
                class298_sub49.aBoolean7592 = !class298_sub49.aBoolean7592;
                class298_sub49.aClass308_Sub1_7591.method3776(class298_sub49.aBoolean7592);
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ev.f(").append(')').toString());
        }
    }

    public static final void method4876(int i, boolean stereo, int i_13_) {
        if (i < 8000 || i > 48000)
            throw new IllegalArgumentException();
        Class284.anInt3059 = i * 1438282109;
        Class284.isSteroSound = stereo;
        Class284.anInt3048 = i_13_ * 2095551653;
    }

    static void method4873(int i, int i_7_, int i_8_, int i_9_, int i_10_) {
        try {
            for (int i_12_ = i_8_; i_12_ <= i_9_; i_12_++)
                Class82_Sub22.method940((Class372_Sub3.anIntArrayArray4047[i_12_]), i, i_7_, i_10_);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qd.z(").append(')').toString());
        }
    }

    public static int getSceneLoadingTime() {
        Canvas canvas = new Canvas();
        canvas.setSize(1010, 100);
        GraphicsToolkit graphicsToolkit = GraphicsToolkit.getCreatedToolkit(ToolkitOption.PUREJAVA, canvas, null, null, 0);
        long startTime = TimeUtils.getTime();
        for (int i_4_ = 0; i_4_ < 10000; i_4_++)
            graphicsToolkit.method5020(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
        int elpasedTime = (int) (TimeUtils.getTime() - startTime);
        graphicsToolkit.fillRectangle(0, 0, 100, 100, -16777216);
        graphicsToolkit.destroy();
        return elpasedTime;
    }

    static final void method1298(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection) {
        componentDefinition.modelType = 939239877;
        componentDefinition.modelID = -127794683 * GameClient.playerIndex;
        componentDefinition.hashcode = 0;
        if (componentDefinition.slot * -1309843523 == -1 && !IComponentDefinitionCollection.accessed)
            IComponentUpdateNode.appendModelTypeUpdate(componentDefinition.interfaceHash);
    }

    public static void method1136(int i) {
        try {
            Class79.aClass298_Sub19_Sub1_737.method2975(i >> 8);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("eg.d(").append(')').toString());
        }
    }

    public static void method1129(int[] keys, Object[] objects) {
        try {
            Class419.method5602(keys, objects, 0, keys.length - 1);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("eg.u(").append(')').toString());
        }
    }

    static final void method4113(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        Widget widget = ((Widget) GameClient.linkedList.get((long) interfaceHash));
        if (null != widget)
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 1;
        else
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
    }

    public static void method872(int i) {
        try {
            Class299.anInt3197 = i * 1684929947;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("di.i(").append(')').toString());
        }
    }

    public static void handleAnimationSound(AnimationDefinition animationDefinition, int i, Class365_Sub1 player) {
        if (-991384187 * Class300.anInt3213 < 50 && (animationDefinition != null && null != animationDefinition.handledSounds && i < animationDefinition.handledSounds.length && animationDefinition.handledSounds[i] != null)) {
            int i_2_ = animationDefinition.handledSounds[i][0];
            int i_3_ = i_2_ >> 8;
            int i_4_ = i_2_ >> 5 & 0x7;
            int i_5_ = i_2_ & 0x1f;
            if (animationDefinition.handledSounds[i].length > 1) {
                int i_6_ = (int) (Math.random() * (double) (animationDefinition.handledSounds[i]).length);
                if (i_6_ > 0)
                    i_3_ = animationDefinition.handledSounds[i][i_6_];
            }
            int i_7_ = 256;
            if (null != animationDefinition.soundMaxDelay && null != animationDefinition.soundMinDelay)
                i_7_ = ((int) (Math.random() * (double) (animationDefinition.soundMinDelay[i] - animationDefinition.soundMaxDelay[i])) + animationDefinition.soundMaxDelay[i]);
            int i_8_ = (animationDefinition.anIntArray4188 == null ? 255 : animationDefinition.anIntArray4188[i]);
            if (i_5_ == 0) {
                if (Player.myPlayer == player) {
                    if (animationDefinition.affectToSound)
                        ToMoveSettings.method3913(i_3_, i_4_, 0, i_8_, false, i_7_);
                    else
                        Class239.method2210(i_3_, i_4_, 0, i_8_, i_7_);
                }
            } else if (SettingsManager.settingsManager.areaSoundsVolume.getValue() != 0) {
                Vector3f class217 = player.getWorldTransform().trans;
                int i_9_ = (int) class217.x - 256 >> 9;
                int i_10_ = (int) class217.z - 256 >> 9;
                int i_11_ = ((Player.myPlayer == player) ? 0 : (i_10_ << 8) + ((i_9_ << 16) + (player.plane << 24)) + i_5_);
                Class300.aClass297Array3214[(Class300.anInt3213 += -598588595) * -991384187 - 1] = new Class297((animationDefinition.affectToSound ? (byte) 2 : (byte) 1), i_3_, i_4_, 0, i_8_, i_11_, i_7_, player);
            }
        }
    }

    static void method6208(String string, String string_2_) {
        Class360.loginType = Loader.LOBBY_ENABLED ? -1058684408 : 471358088;
        Class360.activeConnection = Loader.LOBBY_ENABLED ? ConnectionType.lobbyConnection : ConnectionType.gameConnection;
        Class460.method5981(false, false, string, string_2_, -1L);
    }

    static final void method5884(int interfaceID) {
        if (Class378.componentExists(interfaceID, null))
            IComponentDefinition.method5578((IComponentDefinition.getIComponentDefinitionCollections[interfaceID].componentDefinitions), -1);
    }

    static void method5883(IComponentDefinition componentDefinition, ToolkitLoader toolkitLoader, int i, int i_10_, int i_11_, int i_12_, SpriteToolkit spriteToolkit) {
        if (null != spriteToolkit) {
            int xAngle;
            if (-863531439 * CameraUtils.cameraType == CameraUtils.FREE_FORM)
                xAngle = (int) GameClient.cameraXAngle & 0x3fff;
            else
                xAngle = ((int) GameClient.cameraXAngle + GameClient.anInt8801 * 1227356013) & 0x3fff;
            int i_15_ = (Math.max(componentDefinition.aspectWidth * -2093041337 / 2, 457937409 * componentDefinition.aspectHeight / 2) + 10);
            int i_16_ = i_12_ * i_12_ + i_11_ * i_11_;
            if (i_16_ <= i_15_ * i_15_) {
                int i_17_ = CircleAngleTable.SINE[xAngle];
                int i_18_ = CircleAngleTable.COSINE[xAngle];
                if (2 != CameraUtils.cameraType * -863531439) {
                    i_17_ = 256 * i_17_ / (256 + GameClient.anInt8749 * 356727603);
                    i_18_ = 256 * i_18_ / (356727603 * GameClient.anInt8749 + 256);
                }
                int i_19_ = i_12_ * i_17_ + i_11_ * i_18_ >> 14;
                int i_20_ = i_18_ * i_12_ - i_11_ * i_17_ >> 14;
                spriteToolkit.method654((i_19_ + (componentDefinition.aspectWidth * -2093041337 / 2 + i) - spriteToolkit.getPaddedWidth() / 2), (457937409 * componentDefinition.aspectHeight / 2 + i_10_ - i_20_ - spriteToolkit.getPaddedHeight() / 2), toolkitLoader, i, i_10_);
            }
        }
    }

    public static void method5934(Player player) {
        NotDefinition class298_sub41 = ((NotDefinition) (NotDefinition.aClass437_7440.get((long) (1888274983 * player.entityIndex))));
        if (null == class298_sub41)
            method4884(player.plane, (player.scenePositionXQueue[0]), (player.scenePositionYQueue[0]), 0, null, null, player);
        else
            class298_sub41.method3519();
    }

    public static String getComponentText(int key) {
        Class298_Sub49 class298_sub49 = ((Class298_Sub49) Class423.aClass437_5354.get((long) key));
        if (class298_sub49 != null) {
            Class298_Sub24_Sub4 class298_sub24_sub4 = class298_sub49.aClass308_Sub1_7591.method3772();
            if (null != class298_sub24_sub4) {
                double d = class298_sub49.aClass308_Sub1_7591.method3779();
                if ((double) class298_sub24_sub4.method3092((byte) 8) <= d && ((double) class298_sub24_sub4.method3093(-327557193) >= d))
                    return class298_sub24_sub4.method3094();
            }
        }
        return null;
    }

    static void method1311() {
        Class360.loginType = -1058684408;
        Class360.activeConnection = ConnectionType.lobbyConnection;
        if (GameClient.aByteArray8843 != null) {
            Buffer buffer = new Buffer(GameClient.aByteArray8843);
            Class360.accountName = (buffer.readLong() * -2742373017286080113L);
            Class360.serverKey = (buffer.readLong() * 3207425516430892907L);
        }
        if (122690138525332847L * Class360.accountName < 0L)
            Class78.method845(35);
        else
            Class460.method5981(false, true, "", "", Class360.accountName * 122690138525332847L);
    }

    static float method1312(float f, float f_4_, float f_5_, float f_6_, float f_7_, float f_8_, int i) {
        float f_10_ = 0.0F;
        float f_11_ = f_6_ - f;
        float f_12_ = f_7_ - f_4_;
        float f_13_ = f_8_ - f_5_;
        float f_14_ = 0.0F;
        float f_15_ = 0.0F;
        float f_16_ = 0.0F;
        Region class331 = GameClient.myRegion.getRegion();
        for (/**/; f_10_ < 1.1F; f_10_ += 0.1F) {
            float f_17_ = f_11_ * f_10_ + f;
            float f_18_ = f_4_ + f_10_ * f_12_;
            float f_19_ = f_10_ * f_13_ + f_5_;
            int i_20_ = (int) f_17_ >> 9;
            int i_21_ = (int) f_19_ >> 9;
            if (i_20_ > 0 && i_21_ > 0 && i_20_ < GameClient.myRegion.getMapWidth() && i_21_ < GameClient.myRegion.getMapLength()) {
                int i_22_ = (Player.myPlayer.plane);
                if (i_22_ < 3 && ((GameClient.myRegion.method2654().flags[1][i_20_][i_21_]) & 0x2) != 0)
                    i_22_++;
                int i_23_ = (class331.aClass_xaArray3519[i_22_].method6340((int) f_17_, (int) f_19_));
                if ((float) i_23_ < f_18_) {
                    if (i >= 2)
                        return (f_10_ - 0.1F + method1312(f_14_, f_15_, f_16_, f_17_, f_18_, f_19_, i - 1) * 0.1F);
                    return f_10_;
                }
            }
            f_14_ = f_17_;
            f_15_ = f_18_;
            f_16_ = f_19_;
        }
        return -1.0F;
    }

    public static void method1309() {
        Class298_Sub9.cache.clear();
    }

    static void method4290(IComponentDefinition componentDefinition, ToolkitLoader toolkitLoader, int i, int i_9_, int i_10_, int i_11_, int i_12_, String string, FontToolkit fontToolkit, RSFontMetrics rsFontMetrics, int i_13_) {
        int i_15_;
        if (CameraUtils.FREE_FORM == -863531439 * CameraUtils.cameraType)
            i_15_ = (int) GameClient.cameraXAngle & 0x3fff;
        else
            i_15_ = (GameClient.anInt8801 * 1227356013 + (int) GameClient.cameraXAngle & 0x3fff);
        int i_16_ = (Math.max(componentDefinition.aspectWidth * -2093041337 / 2, 457937409 * componentDefinition.aspectHeight / 2) + 10);
        int i_17_ = i_10_ * i_10_ + i_11_ * i_11_;
        if (i_17_ <= i_16_ * i_16_) {
            int i_18_ = CircleAngleTable.SINE[i_15_];
            int i_19_ = CircleAngleTable.COSINE[i_15_];
            if (CameraUtils.cameraType * -863531439 != CameraUtils.FREE_FORM) {
                i_18_ = 256 * i_18_ / (356727603 * GameClient.anInt8749 + 256);
                i_19_ = 256 * i_19_ / (256 + 356727603 * GameClient.anInt8749);
            }
            int i_20_ = i_19_ * i_10_ + i_18_ * i_11_ >> 14;
            int i_21_ = i_19_ * i_11_ - i_18_ * i_10_ >> 14;
            int i_22_ = rsFontMetrics.method6259(string, 100, null);
            int i_23_ = rsFontMetrics.method6260(string, 100, 0, null);
            i_20_ -= i_22_ / 2;
            if (i_20_ >= -(componentDefinition.aspectWidth * -2093041337) && i_20_ <= -2093041337 * componentDefinition.aspectWidth && i_21_ >= -(457937409 * componentDefinition.aspectHeight) && i_21_ <= 457937409 * componentDefinition.aspectHeight)
                fontToolkit.method2475(string, (-2093041337 * componentDefinition.aspectWidth / 2 + (i_20_ + i)), (457937409 * componentDefinition.aspectHeight / 2 + i_9_ - i_21_ - i_12_ - i_23_), i_22_, 50, i_13_, 0, 1, 0, 0, null, null, toolkitLoader, i, i_9_);
        }
    }

    static boolean method4287(int i) {
        return i == 1 || i == 15 || i == 17 || i == 16 || 9 == i;
    }

    public static void method4288(String string, boolean bool, int i, String string_5_) {
        Class384.method4699(string, bool, i, -1, string_5_, true);
    }

    public static OutgoingPacketBuffer empty() {
        OutgoingPacketBuffer outgoingPacketBuffer = OutgoingPacketBuffer.getOutgoingPacketBuffer();
        outgoingPacketBuffer.outgoingPacket = null;
        outgoingPacketBuffer.anInt7397 = 0;
        outgoingPacketBuffer.payload = new RsBitsBuffer(5000);
        return outgoingPacketBuffer;
    }

    public static int method886(int i, int i_0_, boolean bool) {
        Class298_Sub9 class298_sub9 = method2437(i, bool);
        if (null == class298_sub9)
            return -1;
        if (i_0_ < 0 || i_0_ >= (class298_sub9.anIntArray7226).length)
            return -1;
        return class298_sub9.anIntArray7226[i_0_];
    }

    static void method871(GraphicsToolkit graphicsToolkit, ObjectDefinition objectDefinition, int i, int i_0_, int i_1_) {
        Class496 class496 = ConfigType.aClass487_1463.method6159((objectDefinition.anInt5400 * -1204256389));
        if (1690480405 * class496.anInt6097 != -1) {
            if (objectDefinition.aBoolean5401) {
                i += -1382013163 * objectDefinition.anInt5402;
                i &= 0x3;
            } else
                i = 0;
            SpriteToolkit spriteToolkit = class496.method6198(graphicsToolkit, i, objectDefinition.aBoolean5440);
            if (spriteToolkit != null) {
                int i_3_ = -1125834887 * objectDefinition.sizeX;
                int i_4_ = -565161399 * objectDefinition.sizeY;
                if ((i & 0x1) == 1) {
                    i_3_ = -565161399 * objectDefinition.sizeY;
                    i_4_ = objectDefinition.sizeX * -1125834887;
                }
                int i_5_ = spriteToolkit.getPaddedWidth();
                int i_6_ = spriteToolkit.getPaddedHeight();
                if (class496.aBoolean6098) {
                    i_5_ = i_3_ * 4;
                    i_6_ = 4 * i_4_;
                }
                if (0 != class496.anInt6096 * -2012904123)
                    spriteToolkit.method691(i_0_, i_1_ - (i_4_ - 1) * 4, i_5_, i_6_, 0, (~0xffffff | class496.anInt6096 * -2012904123), 1);
                else
                    spriteToolkit.drawScaled(i_0_, i_1_ - 4 * (i_4_ - 1), i_5_, i_6_);
            }
        }
    }

    public static final void method6299(String string) {
        if (!string.equals("")) {
            ConnectionType connectionType = ConnectionType.getConnectionType();
            OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.JOIN_FRIEND_CHAT_PACKET, connectionType.encryptor);
            outgoingPacketBuffer.payload.writeByte(method693(string));
            outgoingPacketBuffer.payload.writeString(string);
            connectionType.sendFrame(outgoingPacketBuffer);
        }
    }

    static final void method6300(int i, int i_1_, int i_2_, int i_3_, Class435 class435) {
        if (i_2_ >= 1 && i_3_ >= 1 && i_2_ <= GameClient.myRegion.getMapWidth() - 2 && i_3_ <= GameClient.myRegion.getMapLength() - 2) {
            if (GameClient.myRegion.getRegion() != null) {
                SceneObject sceneObject = GameClient.myRegion.method2644().method2241(i, i_1_, i_2_, i_3_);
                if (sceneObject != null) {
                    if (sceneObject instanceof Class365_Sub1_Sub1_Sub5)
                        ((Class365_Sub1_Sub1_Sub5) sceneObject).method4486(class435);
                    else if (sceneObject instanceof Class365_Sub1_Sub2_Sub1)
                        ((Class365_Sub1_Sub2_Sub1) sceneObject).method4495(class435);
                    else if (sceneObject instanceof Class365_Sub1_Sub5_Sub2)
                        ((Class365_Sub1_Sub5_Sub2) sceneObject).method4530(class435);
                    else if (sceneObject instanceof Class365_Sub1_Sub3_Sub1)
                        ((Class365_Sub1_Sub3_Sub1) sceneObject).method4504(class435);
                }
            }
        }
    }

    static final void method6302() {
        SettingsManager.loadMinimumSettings();
        GameClient.myRegion.method2667();
        ToMoveSettings.encodeBuffer();
        GameClient.sentPreferences = false;
    }

    static final void method2112(int i, int i_10_, int i_11_, int i_12_) {
        for (int i_14_ = 0; i_14_ < GameClient.anInt8686 * -112139815; i_14_++) {
            Rectangle rectangle = GameClient.rectangles[i_14_];
            if (rectangle.x + rectangle.width > i && rectangle.x < i + i_11_ && rectangle.height + rectangle.y > i_10_ && rectangle.y < i_12_ + i_10_)
                GameClient.aBooleanArray8900[i_14_] = true;
        }
    }

    public static void method1910() {
        try {
            if (1 == 617004265 * Class79.anInt734) {
                int i_8_ = Class79.aClass298_Sub19_Sub1_737.method2953();
                if (i_8_ > 0 && Class79.aClass298_Sub19_Sub1_737.method2985()) {
                    i_8_ -= Class298_Sub24_Sub1.anInt9276 * -1503744809;
                    if (i_8_ < 0)
                        i_8_ = 0;
                    Class79.aClass298_Sub19_Sub1_737.method2961(i_8_);
                    return;
                }
                Class79.aClass298_Sub19_Sub1_737.method2959();
                Class79.aClass298_Sub19_Sub1_737.method2957();
                if (Class79.JS5_MUSIC != null)
                    Class79.anInt734 = 1770763954;
                else
                    Class79.anInt734 = 0;
                aClass298_Sub13_5337 = null;
                Class298_Sub32_Sub22.aClass272_9466 = null;
            }
            if (3 == Class79.anInt734 * 617004265) {
                int i_9_ = Class79.aClass298_Sub19_Sub1_737.method2953();
                if (i_9_ < Class79.anInt739 * 643426275 && Class79.aClass298_Sub19_Sub1_737.method2985()) {
                    i_9_ += 604206485 * Class401.anInt6559;
                    if (i_9_ > 643426275 * Class79.anInt739)
                        i_9_ = 643426275 * Class79.anInt739;
                    Class79.aClass298_Sub19_Sub1_737.method2961(i_9_);
                } else {
                    Class401.anInt6559 = 0;
                    Class79.anInt734 = 0;
                }
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            Class79.aClass298_Sub19_Sub1_737.method2959();
            Class11.method329();
        }
    }

    static int method1398(NPC npc) {
        NPCDefinition npcDefinition = npc.aClass503_10190;
        if (npcDefinition.morphisms != null) {
            npcDefinition = npcDefinition.morph(Class128.playerVarsProvider);
            if (npcDefinition == null)
                return -1;
        }
        int i_10_ = 1105496999 * npcDefinition.anInt6169;
        Class350 class350 = npc.method4426();
        int animationID = npc.aAnimator_10077.getAnimationID();
        if (animationID == -1 || npc.aBoolean10094)
            i_10_ = npcDefinition.anInt6151 * 1945943361;
        else if (class350.anInt3721 * 230243963 == animationID || animationID == class350.anInt3749 * 491753731 || class350.anInt3724 * -783166629 == animationID || animationID == class350.anInt3746 * -2054940183)
            i_10_ = npcDefinition.anInt6176 * -1390399277;
        else if (class350.anInt3755 * 328817727 == animationID || animationID == class350.anInt3722 * -1238642279 || animationID == 124010991 * class350.anInt3728 || -907666203 * class350.anInt3727 == animationID)
            i_10_ = -904091095 * npcDefinition.anInt6174;
        return i_10_;
    }

    static void method1396(OutgoingPacketBuffer outgoingPacketBuffer, int i, int i_7_, int i_8_) {
        outgoingPacketBuffer.payload.writeIntV2(i);
        outgoingPacketBuffer.payload.writeShort128(i_8_);
        outgoingPacketBuffer.payload.writeShortLE128(i_7_);
    }

    static final int method1402(int i) {
        try {
            int i_32_ = i & 0x3f;
            int i_33_ = i >> 6 & 0x3;
            if (i_32_ == 18) {
                if (i_33_ == 0)
                    return 1;
                if (1 == i_33_)
                    return 2;
                if (2 == i_33_)
                    return 4;
                if (3 == i_33_)
                    return 8;
            } else if (i_32_ == 19 || 21 == i_32_) {
                if (0 == i_33_)
                    return 16;
                if (1 == i_33_)
                    return 32;
                if (i_33_ == 2)
                    return 64;
                if (3 == i_33_)
                    return 128;
            }
            return 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fb.ib(").append(')').toString());
        }
    }

    static final void method1400(int i, int i_12_, int i_13_, int i_14_, int i_15_, boolean bool) {
        if (!bool && (i_12_ < 512 || i_13_ < 512 || i_12_ > (GameClient.myRegion.getMapWidth() - 2) * 512 || i_13_ > (GameClient.myRegion.getMapLength() - 2) * 512)) {
            float[] fs = GameClient.translated3DCoord;
            GameClient.translated3DCoord[1] = -1.0F;
            fs[0] = -1.0F;
        } else {
            int i_17_ = (Class356.getAverageHeight(i_12_, i_13_, i, -1332954611) - i_15_);
            GameClient.cameraMatrix.copy(GameClient.activeGraphicsToolkit.method5044());
            GameClient.cameraMatrix.translate((float) i_14_, 0.0F, 0.0F);
            GameClient.activeGraphicsToolkit.cw(GameClient.cameraMatrix);
            if (bool)
                GameClient.activeGraphicsToolkit.method_do((float) i_12_, (float) i_17_, (float) i_13_, GameClient.translated3DCoord);
            else
                GameClient.activeGraphicsToolkit.dr((float) i_12_, (float) i_17_, (float) i_13_, GameClient.translated3DCoord);
            GameClient.cameraMatrix.translate((float) -i_14_, 0.0F, 0.0F);
            GameClient.activeGraphicsToolkit.cw(GameClient.cameraMatrix);
            GameClient.translated3DCoord[0] -= (float) (GameClient.anInt8936 * -1868355265);
            GameClient.translated3DCoord[1] -= (float) (-689948187 * GameClient.anInt8747);
        }
    }

    static void method1395(int i, boolean bool) {
        try {
            if (bool) {
                OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.aClass198_2036, ConnectionType.gameConnection.encryptor);
                outgoingPacketBuffer.payload.writeShort(i);
                ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
            } else
                ToMoveScripts.method1405(CS2Context.aClass502_6722, i, -1);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fb.p(").append(')').toString());
        }
    }

    static final long method4686() {
        try {
            return ((long) ((Class388.anInt4151 += -1596186261) * 1924989763 - 1) << 32 | 0xffffffffL);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pw.qb(").append(')').toString());
        }
    }

    public static void method4685(int[][] is) {
        try {
            Class372.anIntArrayArray4047 = is;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pw.a(").append(')').toString());
        }
    }

    static void drawMinimapArea(GraphicsToolkit graphicsToolkit, IComponentDefinition component, int i, int i_496_, byte i_497_) {
        Class117 class117 = component.method1116(graphicsToolkit);
        if (null != class117) {
            ToolkitLoader toolkitLoader = class117.toolkitLoader;
            graphicsToolkit.setClip(i, i_496_, -2093041337 * component.aspectWidth + i, 457937409 * component.aspectHeight + i_496_);
            if ((-2093041337 * component.aspectWidth != class117.anInt1393 * 1633695381) || (-60174999 * class117.anInt1394 != 457937409 * component.aspectHeight))
                throw new IllegalStateException("");
            if (2 != -64305285 * Minimap.anInt56 && 5 != Minimap.anInt56 * -64305285 && null != spriteToolkit) {
                GameScene gameScene = GameClient.myRegion.getGameScene();
                int i_498_;
                int i_499_;
                int i_500_;
                int i_501_;
                if (2 == CameraUtils.cameraType * -863531439) {
                    i_498_ = GameClient.anInt8753 * -2080858977;
                    i_499_ = 1818837461 * GameClient.anInt8755;
                    i_500_ = (int) -GameClient.cameraXAngle & 0x3fff;
                    i_501_ = 4096;
                } else {
                    Vector3f class217 = (Player.myPlayer.getWorldTransform().trans);
                    i_498_ = (int) class217.x;
                    i_499_ = (int) class217.z;
                    i_500_ = (GameClient.anInt8801 * 1227356013 + (int) -GameClient.cameraXAngle) & 0x3fff;
                    i_501_ = 4096 - 1412674352 * GameClient.anInt8749;
                }
                int i_502_ = i_498_ / 128 + 48;
                int i_503_ = (48 + GameClient.myRegion.getMapLength() * 4 - i_499_ / 128);
                spriteToolkit.method659(((float) i + (float) (component.aspectWidth * -2093041337) / 2.0F), ((float) i_496_ + (float) (457937409 * component.aspectHeight) / 2.0F), (float) i_502_, (float) i_503_, i_501_, i_500_ << 2, toolkitLoader, i, i_496_);
                Class296 class296 = GameClient.myRegion.method2631();
                for (IntNode class298_sub35 = ((IntNode) Minimap.aClass453_61.method5939()); class298_sub35 != null; class298_sub35 = ((IntNode) Minimap.aClass453_61.method5944())) {
                    int i_504_ = class298_sub35.capacity * -774922497;
                    int i_505_ = ((class296.anIntArray3168[i_504_] >> 14 & 0x3fff) - -1760580017 * gameScene.gameSceneBaseX);
                    int i_506_ = ((class296.anIntArray3168[i_504_] & 0x3fff) - 283514611 * gameScene.gameSceneBaseY);
                    int i_507_ = 2 + 4 * i_505_ - i_498_ / 128;
                    int i_508_ = 2 + 4 * i_506_ - i_499_ / 128;
                    MapLoader.method2389(graphicsToolkit, toolkitLoader, component, i, i_496_, i_507_, i_508_, class296.anIntArray3170[i_504_]);
                }
                for (int i_509_ = 0; i_509_ < 1659101557 * Minimap.anInt67; i_509_++) {
                    int i_510_ = (2 + Minimap.anIntArray58[i_509_] * 4 - i_498_ / 128);
                    int i_511_ = (2 + 4 * Minimap.anIntArray59[i_509_] - i_499_ / 128);
                    ObjectDefinition objectDefinition = (GameClient.myRegion.getObjectDefinitionLoader().get(Minimap.anIntArray60[i_509_]));
                    if (null != objectDefinition.objectIDs) {
                        objectDefinition = objectDefinition.method5777(Class128.playerVarsProvider);
                        if (null == objectDefinition)
                            continue;
                        if (-1 == objectDefinition.anInt5399 * -1422593103) {
                            if (i_497_ < 10)
                                continue;
                            return;
                        }
                    }
                    MapLoader.method2389(graphicsToolkit, toolkitLoader, component, i, i_496_, i_510_, i_511_, objectDefinition.anInt5399 * -1422593103);
                }
                for (Class298_Sub2 class298_sub2 = ((Class298_Sub2) GameClient.aClass437_8685.method5816()); class298_sub2 != null; class298_sub2 = ((Class298_Sub2) GameClient.aClass437_8685.method5815())) {
                    int i_512_ = (int) ((class298_sub2.key * 7051297995265073167L) >> 28 & 0x3L);
                    if (i_512_ == Minimap.anInt57 * -1694437021) {
                        int i_513_ = ((int) ((class298_sub2.key * 7051297995265073167L) & 0x3fffL) - -1760580017 * gameScene.gameSceneBaseX);
                        int i_514_ = ((int) ((class298_sub2.key * 7051297995265073167L) >> 14 & 0x3fffL) - gameScene.gameSceneBaseY * 283514611);
                        int i_515_ = 2 + i_513_ * 4 - i_498_ / 128;
                        int i_516_ = 2 + i_514_ * 4 - i_499_ / 128;
                        method5883(component, toolkitLoader, i, i_496_, i_515_, i_516_, SubIncommingPacket.aClass57Array2349[0]);
                    }
                }
                method5662(graphicsToolkit, i_498_, i_499_, component, toolkitLoader, i, i_496_);
                ErrorReporter.method4171(i_498_, i_499_, component, toolkitLoader, i, i_496_, 1913514572);
                Class74.method832(i_498_, i_499_, component, class117, i, i_496_);
                if (2 != CameraUtils.cameraType * -863531439) {
                    if (Minimap.flagX * 2076926079 != 0) {
                        int i_517_ = (-282230276 * Minimap.flagX + 2 - i_498_ / 128 + (Player.myPlayer.getSize() - 1) * 2);
                        int i_518_ = (2 + Minimap.flagY * -1505214580 - i_499_ / 128 + (Player.myPlayer.getSize() - 1) * 2);
                        method5883(component, toolkitLoader, i, i_496_, i_517_, i_518_, (Class234.aClass57Array2598[Minimap.aBoolean63 ? 1 : 0]));
                    }
                    if (!Player.myPlayer.hidden)
                        graphicsToolkit.fillRectangle(i + (-2093041337 * component.aspectWidth / 2) - 1, (457937409 * component.aspectHeight / 2) + i_496_ - 1, 3, 3, -1);
                }
            } else
                graphicsToolkit.DA(-16777216, toolkitLoader, i, i_496_);
        }
    }

    public static Class428 method5977() {
        if (Class378.aClass428_4094 == null)
            return Class428.aClass428_6618;
        return Class378.aClass428_4094;
    }

    public static ModelToolkit method2044(GraphicsToolkit graphicsToolkit, int i, int i_5_, int i_6_, int i_7_, int containerID) {
        try {
            long key = (long) containerID;
            ModelToolkit modelToolkit = (ModelToolkit) HintIcon.cache.get(key);
            int mask = 2055;
            if (null == modelToolkit) {
                BaseModel model = BaseModel.load(Js5List.JS5_MDOELS, containerID, 0);
                if (model == null)
                    return null;
                if (model.format < 13)
                    model.scaleUp(2);
                modelToolkit = graphicsToolkit.creatModelToolkit(model, mask, -203714349 * Class481.anInt6035, 64, 768);
                HintIcon.cache.put(modelToolkit, key);
            }
            modelToolkit = modelToolkit.method4755((byte) 6, mask, true);
            if (i != 0)
                modelToolkit.f(i);
            if (i_5_ != 0)
                modelToolkit.t(i_5_);
            if (i_6_ != 0)
                modelToolkit.EA(i_6_);
            if (i_7_ != 0)
                modelToolkit.ia(0, i_7_, 0);
            return modelToolkit;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jf.a(").append(')').toString());
        }
    }

    public static int method2045(int i, int i_11_, int i_12_) {
        i_12_ &= 0x3;
        if (0 == i_12_)
            return i;
        if (1 == i_12_)
            return i_11_;
        if (2 == i_12_)
            return 4095 - i;
        return 4095 - i_11_;
    }

    public static final void method2047() {
        try {
            Class298_Sub32_Sub22.anImage9468 = null;
            Class285.aFont3082 = null;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jf.at(").append(')').toString());
        }
    }

    public static Class459 method2571(int i, int i_0_) {
        try {
            Class459[] class459s = Class298_Sub44.method3531((byte) 89);
            for (int i_1_ = 0; i_1_ < class459s.length; i_1_++) {
                Class459 class459 = class459s[i_1_];
                if (i == class459.anInt5673 * 1790024195)
                    return class459;
            }
            return null;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lk.f(").append(')').toString());
        }
    }

    public static void method2053() {
        if (ComponentMouseRecorder.method1014())
            Class440.method5860(new Class382());
    }

    static void method6011(GraphicsToolkit graphicsToolkit) {
        if (!Class436.aBoolean5496)
            Class310.method3810(graphicsToolkit);
        else
            method907(graphicsToolkit);
    }

    static void method6014(int i, int i_8_, int i_9_) {
        if (1008 == i)
            ToMoveScripts.method1405(CS2Context.aClass502_6715, i_8_, i_9_);
        else if (i == 1009)
            ToMoveScripts.method1405(CS2Context.aClass502_6717, i_8_, i_9_);
        else if (i == 1010)
            ToMoveScripts.method1405(CS2Context.aClass502_6714, i_8_, i_9_);
        else if (1011 == i)
            ToMoveScripts.method1405(CS2Context.aClass502_6726, i_8_, i_9_);
        else if (i == 1012)
            ToMoveScripts.method1405(CS2Context.aClass502_6729, i_8_, i_9_);
    }

    static final int method6012(int i, int i_5_, int i_6_) {
        return i < i_5_ ? i_5_ : i > i_6_ ? i_6_ : i;
    }

    public static final void method3455(int memberIndex) {
        if (ClanChannelChat.clanManager != null && (memberIndex >= 0 && memberIndex < 649879491 * (ClanChannelChat.clanManager.channelSize))) {
            ClanMember clanMember = ClanChannelChat.clanManager.clanMembers[memberIndex];
            if (-1 == clanMember.playerRank) {
                ConnectionType connectionType = ConnectionType.getConnectionType();
                OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.aClass198_2045, connectionType.encryptor);
                outgoingPacketBuffer.payload.writeByte(2 + method693(clanMember.playerDisplayName));
                outgoingPacketBuffer.payload.writeShort(memberIndex);
                outgoingPacketBuffer.payload.writeString(clanMember.playerDisplayName);
                connectionType.sendFrame(outgoingPacketBuffer);
            }
        }
    }

    static void method4300() {
        synchronized (mouseRecordsQueue) {
            Point point;
            if (DirectXContext.canvas.isShowing())
                point = DirectXContext.canvas.getLocationOnScreen();
            else
                point = null;
            for (; ; ) {
                MouseTracker mouseTracker = (MouseTracker) mouseRecordsQueue.poll();
                if (mouseTracker == null) {
                    break;
                }
                if (point == null || !DirectXContext.canvas.isShowing() || !aBoolean8385)
                    mouseTracker.resizeCache();
                else {
                    mouseTracker.setMousePoint(point);
                    if (mouseTracker.method3570()) {
                    } else if ((mouseTracker.getMouseX() < -2110394505 * GameShell.canvasWidth) && (mouseTracker.getMouseY() < (-1111710645 * GameShell.canvasHeight)) && mouseTracker.getMouseX() >= 0) {
                        if (mouseTracker.getMouseY() < 0) {
                        } else {
                            int i_3_ = mouseTracker.getMouseType();
                            if (mouseTracker.getMouseType() == -1)
                                aClass374_Sub2_4121.method4620(mouseTracker);
                            else if (method1437(i_3_))
                                aClass374_Sub2_4121.method4642(mouseTracker, (byte) 13);
                        }
                    }
                }
            }
        }
    }

    public static void method4301() {
        for (int i_4_ = 0; i_4_ < 113; i_4_++)
            GameClient.aBooleanArray8900[i_4_] = true;
    }

    static byte method1253(int i, int i_42_) {
        if (i != Class424.aClass424_6595.type * -1976050083)
            return (byte) 0;
        if ((i_42_ & 0x1) == 0)
            return (byte) 1;
        return (byte) 2;
    }

    public static final void method1247() {
        GameShell.frameBase.method3788();
        for (int i_36_ = 0; i_36_ < 32; i_36_++)
            GameShell.aLongArray6486[i_36_] = 0L;
        for (int i_37_ = 0; i_37_ < 32; i_37_++)
            GameShell.aLongArray6479[i_37_] = 0L;
        GameShell.missedLogicTicks = 0;
    }

    public static void method6009(int i, int i_0_, int i_1_, int i_2_) {
        Class372.anInt4051 = i * 1418334925;
        Class372.anInt4048 = 728613823 * i_1_;
        Class372.anInt4049 = i_0_ * 1131449449;
        Class372.anInt4050 = i_2_ * -879501875;
    }

    public static void method2196() {
        Class523.method6332();
        method4876(22050, SettingsManager.settingsManager.stereoSound.getValue() == StereoSoundSetting.STEREO, 2);
        Class300.aClass284_3212 = Class75.method834(DirectXContext.canvas, 0, 22050);
        EffectiveVertex.method777(true, Class8.method318(null, -1296770048));
        Minimap.aClass284_68 = Class75.method834(DirectXContext.canvas, 1, 2048);
        Minimap.aClass284_68.method2679(Class285.aClass298_Sub19_Sub4_3083);
    }

    public static void method2197(int i) {
        IComponentDefinition.spriteCache.method4186(i);
        IComponentDefinition.modelsCache.method4186(i);
        IComponentDefinition.aClass348_1136.method4186(i);
        IComponentDefinition.aClass348_1296.method4186(i);
    }

    static Class359 method2195(Buffer buffer) {
        int i_7_ = buffer.readUByte();
        int i_8_ = buffer.readUByte();
        return new Class359(i_7_, i_8_);
    }

    public static Class296 method2192(Js5FileSystem fileSystem, String string, boolean bool) {
        int type = fileSystem.getArchiveIdByName(string);
        if (-1 == type) {
            return new Class296(0);
        }
        int[] fileIDs = fileSystem.getFileIDs(type);
        Class296 class296 = new Class296(fileIDs.length);
        int i_1_ = 0;
        int offset = 0;
        while (i_1_ < class296.anInt3169 * -1407078377) {
            Buffer buffer = new Buffer(fileSystem.getFileFromArchive(type, fileIDs[offset++]));
            int i_3_ = buffer.readInt();
            int i_4_ = buffer.readUShort();
            int i_5_ = buffer.readUByte();
            if (bool || i_5_ != 1) {
                class296.anIntArray3168[i_1_] = i_3_;
                class296.anIntArray3170[i_1_] = i_4_;
                i_1_++;
            } else {
                class296.anInt3169 -= 526813095;
            }
        }
        return class296;
    }

    public static void method1243(Js5FileSystem fileSystem) {
        Class182.aClass243_1821 = fileSystem;
    }

    public static Class343_Sub1 method2105(int i) {
        try {
            if (!aBoolean3631 || i < anInt5190 * -1648308965 || i > anInt3630 * -499146007)
                return null;
            return (Class131.aClass343_Sub1Array1498[i - anInt5190 * -1648308965]);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jo.a(").append(')').toString());
        }
    }

    static String method1999(int[] is) {
        StringBuilder stringbuilder = new StringBuilder();
        int i_2_ = -232961423 * Skybox.anInt2964;
        for (int i_3_ = 0; i_3_ < is.length; i_3_++) {
            QuestType questType = Class316.aClass362_3318.getQuestType(is[i_3_]);
            if (questType.contextMenuSprite * 347977109 == -1) {

            } else {
                SpriteToolkit class57 = ((SpriteToolkit) (Class436.aClass348_5500.get((long) (347977109 * questType.contextMenuSprite))));
                if (class57 == null) {
                    Sprite imageDefinitionLoader = Sprite.loadFirst(Js5List.JS5_SPRITES, questType.contextMenuSprite * 347977109, 0);
                    if (imageDefinitionLoader != null) {
                        class57 = GameClient.activeGraphicsToolkit.createSpriteToolkit(imageDefinitionLoader, true);
                        Class436.aClass348_5500.put(class57, (long) (questType.contextMenuSprite * 347977109));
                    }
                }
                if (null != class57) {
                    Class436.aClass57Array5501[i_2_] = class57;
                    stringbuilder.append(" <img=").append(i_2_).append(">");
                    i_2_++;
                }
            }
        }
        return stringbuilder.toString();
    }

    public static void method2000(boolean bool, boolean bool_4_) {
        try {
            if (bool) {
                Class379.anInt4097 -= 1929855733;
                if (Class379.anInt4097 * -1320167075 == 0)
                    Class379.anIntArray4096 = null;
            }
            if (bool_4_) {
                Class379.anInt4095 -= -1931699395;
                if (726176789 * Class379.anInt4095 == 0)
                    Class294.anIntArray3165 = null;
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jc.f(").append(')').toString());
        }
    }

    public static final void method2001(boolean bool) {
        try {
            ConnectionType[] connectionTypes = GameClient.aConnectionTypeArray8679;
            for (int i_5_ = 0; i_5_ < connectionTypes.length; i_5_++) {
                ConnectionType connectionType = connectionTypes[i_5_];
                try {
                    connectionType.flush();
                } catch (IOException ioexception) {
                    /* empty */
                }
                connectionType.stopConnection();
            }
            IComponentSettings.method3503();
            JS5FileSystemLoader.method2082(false);
            GameClient.myRegion.method2646();
            GameClient.myRegion.method2666();
            Class423.method5733(false);
            Class104.method1108(2);
            Class300.anInt3207 = 184109511;
            Class300.aBoolean3208 = false;
            method344();
            Class264_Sub4.method2513(true);
            Class173.method1826();
            Class127_Sub1.method1427();
            Class264_Sub2.method2506();
            if (bool)
                Class439.loadGameState(6);
            else {
                Class439.loadGameState(19);
                try {
                    Class466.method6021(GameClient.applet, "loggedout");
                } catch (Throwable throwable) {
                    /* empty */
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jc.gi(").append(')').toString());
        }
    }

    static void method2002(int i) {
        try {
            Class298_Sub9.anInt7225 = -747654435 * i;
            Class298_Sub9.cache.clear();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jc.s(").append(')').toString());
        }
    }

    public static Class292 method4865() {
        return GameShell.aClass292_6466;
    }

    static boolean method4920(int i, short i_19_) {
        try {
            if (i == 18 || 19 == i || 20 == i || i == 21 || 22 == i || 1004 == i) {
                return true;
            }
            return 17 == i;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qm.bo(").append(')').toString());
        }
    }

    public static final void method4922(String string) {
        try {
            if (aClass7Array6846 != null) {
                ConnectionType connectionType = ConnectionType.getConnectionType();
                OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.KICK_FRIEND_CHAT_PACKET, connectionType.encryptor);
                outgoingPacketBuffer.payload.writeByte(method693(string));
                outgoingPacketBuffer.payload.writeString(string);
                connectionType.sendFrame(outgoingPacketBuffer);
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qm.mr(").append(')').toString());
        }
    }

    static final void method4923(int plane, int i_22_, int localX, int localY, int objectID, int i_26_, int i_27_, int i_28_) {
        if (localX >= 1 && localY >= 1 && localX <= GameClient.myRegion.getMapWidth() - 2 && (localY <= GameClient.myRegion.getMapLength() - 2)) {
            int i_30_ = plane;
            if (i_30_ < 3 && GameClient.myRegion.method2654().method2320(localX, localY)) {
                i_30_++;
            }
            if (GameClient.myRegion.getRegion() != null) {
                GameClient.myRegion.method2644().method2234(GameClient.activeGraphicsToolkit, plane, i_22_, localX, localY, GameClient.myRegion.getSceneClipDataPlane(plane));
                if (objectID >= 0) {
                    int value = SettingsManager.settingsManager.groundDecoration.getValue();
                    SettingsManager.settingsManager.setValue((SettingsManager.settingsManager.groundDecoration), 1);
                    GameClient.myRegion.method2644().method2243(GameClient.activeGraphicsToolkit, i_30_, plane, localX, localY, objectID, i_26_, i_27_, GameClient.myRegion.getSceneClipDataPlane(plane), i_28_);
                    SettingsManager.settingsManager.setValue((SettingsManager.settingsManager.groundDecoration), value);
                }
            }
        }
    }

    public static int method4924(CharSequence charsequence, int i) {
        return StringUtils.method5619(charsequence, i, true, -566000595);
    }

    public static Class336 setExtraRoutefinderData(int toX, int toY, int sizeX, int sizeY, int routeType) {
        Class315.aClass336_Sub5_3304.toX = toX * -760677635;
        Class315.aClass336_Sub5_3304.toY = toY * 167105303;
        Class315.aClass336_Sub5_3304.sizeX = sizeX * -1544157451;
        Class315.aClass336_Sub5_3304.sizeY = -1468199503 * sizeY;
        Class315.aClass336_Sub5_3304.routeType = -1073204575 * routeType;
        return Class315.aClass336_Sub5_3304;
    }

    static void method1939() {
        Class360.password = "";
        Class360.username = "";
    }

    static void method3873() {
        try {
            GameClient.myRegion.method2646();
            InputStream_Sub1.method273();
            JS5FileSystemLoader.method2082(true);
            method1278();
            System.gc();
            GameClient.activeGraphicsToolkit.clear(2, 0);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ng.lk(").append(')').toString());
        }
    }

    public static Container getParent() {
        if (null != GameClient.fullScreenFrame)
            return GameClient.fullScreenFrame;
        if (null != GameClient.windowFrame)
            return GameClient.windowFrame;
        return GameClient.applet;
    }

    public static final void method3401(int x, int y, int i_1_, int height, boolean bool) {
        if (i_1_ < 1)
            i_1_ = 1;
        if (height < 1)
            height = 1;
        int i_4_ = height - 334;
        if (i_4_ < 0)
            i_4_ = 0;
        else if (i_4_ > 100)
            i_4_ = 100;
        int i_5_ = (GameClient.aShort8928 + (GameClient.aShort8929 - GameClient.aShort8928) * i_4_ / 100);
        int i_6_ = height * i_5_ * 512 / (i_1_ * 334);
        if (i_6_ < GameClient.aShort8934) {
            i_6_ = GameClient.aShort8934;
            i_5_ = i_1_ * i_6_ * 334 / (512 * height);
            if (i_5_ > GameClient.aShort8743) {
                i_5_ = GameClient.aShort8743;
                int i_7_ = height * i_5_ * 512 / (i_6_ * 334);
                int width = (i_1_ - i_7_) / 2;
                if (bool) {
                    GameClient.activeGraphicsToolkit.L();
                    GameClient.activeGraphicsToolkit.fillRectangle(x, y, width, height, -16777216);
                    GameClient.activeGraphicsToolkit.fillRectangle(i_1_ + x - width, y, width, height, -16777216);
                }
                x += width;
                i_1_ -= width * 2;
            }
        } else if (i_6_ > GameClient.aShort8935) {
            i_6_ = GameClient.aShort8935;
            i_5_ = i_1_ * i_6_ * 334 / (height * 512);
            if (i_5_ < GameClient.aShort8839) {
                i_5_ = GameClient.aShort8839;
                int i_9_ = i_1_ * i_6_ * 334 / (i_5_ * 512);
                int i_10_ = (height - i_9_) / 2;
                if (bool) {
                    GameClient.activeGraphicsToolkit.L();
                    GameClient.activeGraphicsToolkit.fillRectangle(x, y, i_1_, i_10_, -16777216);
                    GameClient.activeGraphicsToolkit.fillRectangle(x, y + height - i_10_, i_1_, i_10_, -16777216);
                }
                y += i_10_;
                height -= i_10_ * 2;
            }
        }
        GameClient.anInt8940 = i_5_ * height / 334 * 1463025151;
        GameClient.anInt8936 = x * 1925400255;
        GameClient.anInt8747 = y * -249668627;
        GameClient.anInt8664 = -2079606657 * (short) i_1_;
        GameClient.anInt8939 = (short) height * -34894995;
    }

    public static void method3428(Entity entity, int[] animationIDs, int[] is_9_, int[] is_10_, int i) {
        for (int index = 0; index < animationIDs.length; index++) {
            int animationID = animationIDs[index];
            int i_13_ = is_10_[index];
            int i_14_ = is_9_[index];
            for (int i_15_ = 0; (0 != i_13_ && i_15_ < (entity.aClass438_Sub2_Sub1Array10112).length); i_13_ >>>= 1) {
                if ((i_13_ & 0x1) == 0) {
                    if (i != 1644064563) {
                            /* empty */
                    }
                } else if (-1 == animationID)
                    entity.aClass438_Sub2_Sub1Array10112[i_15_] = null;
                else {
                    AnimationDefinition animationDefinition = Js5Configs.animsList.get(animationID);
                    int resetType = animationDefinition.resetType * -1117238071;
                    Animator_Sub2_Sub1 class438_sub2_sub1 = (entity.aClass438_Sub2_Sub1Array10112[i_15_]);
                    if (null != class438_sub2_sub1 && class438_sub2_sub1.hasAnimationDefinition()) {
                        if (animationID == class438_sub2_sub1.getAnimationID()) {
                            if (0 == resetType) {
                                entity.aClass438_Sub2_Sub1Array10112[i_15_] = null;
                                class438_sub2_sub1 = null;
                            } else if (resetType == 1) {
                                class438_sub2_sub1.method5979();
                                class438_sub2_sub1.anInt9874 = -731066289 * i_14_;
                            } else if (2 == resetType)
                                class438_sub2_sub1.method5842();
                        } else if (-1445588039 * animationDefinition.priority >= ((class438_sub2_sub1.getAnimationDefinition().priority) * -1445588039)) {
                            entity.aClass438_Sub2_Sub1Array10112[i_15_] = null;
                            class438_sub2_sub1 = null;
                        }
                    }
                    if (class438_sub2_sub1 == null || !class438_sub2_sub1.hasAnimationDefinition()) {
                        class438_sub2_sub1 = entity.aClass438_Sub2_Sub1Array10112[i_15_] = (new Animator_Sub2_Sub1(entity));
                        class438_sub2_sub1.load(animationID);
                        class438_sub2_sub1.anInt9874 = -731066289 * i_14_;
                    }
                }
                i_15_++;
            }
        }
    }

    static void method6221(RsBitsBuffer bitsBuffer, int playerIndex) {
        GameScene gameScene = GameClient.myRegion.getGameScene();
        boolean bool = bitsBuffer.readBits(1) == 1;
        if (bool) {
            Class10.anIntArray140[(Class10.anInt139 += 867608709) * -1281683379 - 1] = playerIndex;
        }
        int i_2_ = bitsBuffer.readBits(2);
        Player player = GameClient.entities[playerIndex];
        if (0 == i_2_) {
            if (bool) {
                player.aBoolean10217 = false;
            } else {
                if (-442628795 * GameClient.playerIndex == playerIndex) {
                    throw new RuntimeException();
                }
                Class410 class410 = Class10.aClass410Array138[playerIndex] = new Class410();
                class410.anInt5288 = (1896571807 * (((player.scenePositionYQueue[0] + gameScene.gameSceneBaseY * 283514611) >> 6) + ((player.plane << 28) + ((-1760580017 * gameScene.gameSceneBaseX + (player.scenePositionXQueue[0])) >> 6 << 14))));
                if (-1 != (player.anInt10221 * 1208589843)) {
                    class410.anInt5286 = (player.anInt10221 * 1714576017);
                } else {
                    class410.anInt5286 = player.aClass386_10084.method4719((byte) 0) * 481306955;
                }
                class410.anInt5285 = player.setNextFaceEntity * 1969382475;
                class410.aBoolean5287 = player.aBoolean10203;
                class410.aBoolean5289 = player.aBoolean10222;
                if (player.transformedNPCID * 780357347 > 0) {
                    Heap.method3670(player);
                }
                GameClient.entities[playerIndex] = null;
                if (bitsBuffer.readBits(1) != 0) {
                    ClassNotAnim.method6229(bitsBuffer, playerIndex);
                }
            }
        } else if (i_2_ == 1) {
            int i_3_ = bitsBuffer.readBits(3);
            int i_4_ = player.scenePositionXQueue[0];
            int i_5_ = player.scenePositionYQueue[0];
            if (i_3_ == 0) {
                i_4_--;
                i_5_--;
            } else if (i_3_ == 1) {
                i_5_--;
            } else if (2 == i_3_) {
                i_4_++;
                i_5_--;
            } else if (i_3_ == 3) {
                i_4_--;
            } else if (4 == i_3_) {
                i_4_++;
            } else if (5 == i_3_) {
                i_4_--;
                i_5_++;
            } else if (6 == i_3_) {
                i_5_++;
            } else if (7 == i_3_) {
                i_4_++;
                i_5_++;
            }
            if (bool) {
                player.anInt10218 = i_4_ * -586951847;
                player.anInt10219 = i_5_ * -682750645;
                player.aBoolean10217 = true;
            } else {
                player.method4471(i_4_, i_5_, (Class10.playersMovementTypes[playerIndex]));
            }
        } else if (2 == i_2_) {
            int i_6_ = bitsBuffer.readBits(4);
            int i_7_ = player.scenePositionXQueue[0];
            int i_8_ = player.scenePositionYQueue[0];
            if (0 == i_6_) {
                i_7_ -= 2;
                i_8_ -= 2;
            } else if (1 == i_6_) {
                i_7_--;
                i_8_ -= 2;
            } else if (2 == i_6_) {
                i_8_ -= 2;
            } else if (3 == i_6_) {
                i_7_++;
                i_8_ -= 2;
            } else if (i_6_ == 4) {
                i_7_ += 2;
                i_8_ -= 2;
            } else if (5 == i_6_) {
                i_7_ -= 2;
                i_8_--;
            } else if (6 == i_6_) {
                i_7_ += 2;
                i_8_--;
            } else if (i_6_ == 7) {
                i_7_ -= 2;
            } else if (8 == i_6_) {
                i_7_ += 2;
            } else if (i_6_ == 9) {
                i_7_ -= 2;
                i_8_++;
            } else if (i_6_ == 10) {
                i_7_ += 2;
                i_8_++;
            } else if (11 == i_6_) {
                i_7_ -= 2;
                i_8_ += 2;
            } else if (12 == i_6_) {
                i_7_--;
                i_8_ += 2;
            } else if (i_6_ == 13) {
                i_8_ += 2;
            } else if (14 == i_6_) {
                i_7_++;
                i_8_ += 2;
            } else if (i_6_ == 15) {
                i_7_ += 2;
                i_8_ += 2;
            }
            if (bool) {
                player.anInt10218 = i_7_ * -586951847;
                player.anInt10219 = i_8_ * -682750645;
                player.aBoolean10217 = true;
            } else {
                player.method4471(i_7_, i_8_, (Class10.playersMovementTypes[playerIndex]));
            }
        } else {
            int i_9_ = bitsBuffer.readBits(1);
            if (0 == i_9_) {
                int i_10_ = bitsBuffer.readBits(12);
                int i_11_ = i_10_ >> 10;
                int i_12_ = i_10_ >> 5 & 0x1f;
                if (i_12_ > 15) {
                    i_12_ -= 32;
                }
                int i_13_ = i_10_ & 0x1f;
                if (i_13_ > 15) {
                    i_13_ -= 32;
                }
                int i_14_ = (player.scenePositionXQueue[0] + i_12_);
                int i_15_ = (player.scenePositionYQueue[0] + i_13_);
                if (bool) {
                    player.anInt10218 = -586951847 * i_14_;
                    player.anInt10219 = i_15_ * -682750645;
                    player.aBoolean10217 = true;
                } else {
                    player.method4471(i_14_, i_15_, (Class10.playersMovementTypes[playerIndex]));
                }
                player.plane = player.aByte7724 = (byte) ((player.plane + i_11_) & 0x3);
                if (GameClient.myRegion.method2654().method2320(i_14_, i_15_)) {
                    player.aByte7724++;
                }
                if (-442628795 * GameClient.playerIndex == playerIndex && (GameClient.plane * 1855729883 != player.plane)) {
                    GameClient.plane = (-85701805 * player.plane);
                }
            } else {
                int i_16_ = bitsBuffer.readBits(30);
                int i_17_ = i_16_ >> 28;
                int i_18_ = i_16_ >> 14 & 0x3fff;
                int i_19_ = i_16_ & 0x3fff;
                int i_20_ = ((i_18_ + (-1760580017 * gameScene.gameSceneBaseX + (player.scenePositionXQueue[0])) & 0x3fff) - gameScene.gameSceneBaseX * -1760580017);
                int i_21_ = ((i_19_ + (gameScene.gameSceneBaseY * 283514611 + (player.scenePositionYQueue[0])) & 0x3fff) - gameScene.gameSceneBaseY * 283514611);
                if (bool) {
                    player.anInt10218 = -586951847 * i_20_;
                    player.anInt10219 = -682750645 * i_21_;
                    player.aBoolean10217 = true;
                } else {
                    player.method4471(i_20_, i_21_, (Class10.playersMovementTypes[playerIndex]));
                }
                player.plane = player.aByte7724 = (byte) ((i_17_ + player.plane) & 0x3);
                if (GameClient.myRegion.method2654().method2320(i_20_, i_21_)) {
                    player.aByte7724++;
                }
                if (playerIndex == GameClient.playerIndex * -442628795) {
                    GameClient.plane = (-85701805 * player.plane);
                }
            }
        }
    }

    public static void method6289() {
        for (Class298_Sub49 class298_sub49 = ((Class298_Sub49) Class423.aClass437_5354.method5816()); class298_sub49 != null; class298_sub49 = ((Class298_Sub49) Class423.aClass437_5354.method5815())) {
            if (class298_sub49.aClass308_Sub1_7591.method3773(-263786809))
                Class285.method2710((1566028323 * (class298_sub49.anInt7589)));
            else {
                class298_sub49.aClass308_Sub1_7591.method3785();
                try {
                    class298_sub49.aClass308_Sub1_7591.method3780();
                } catch (Exception exception) {
                    IPAddress.reportError(new StringBuilder().append("").append(1566028323 * class298_sub49.anInt7589).toString(), exception);
                    Class285.method2710(1566028323 * (class298_sub49.anInt7589));
                }
                if (!class298_sub49.aBoolean7593 && !class298_sub49.aBoolean7592) {
                    Class298_Sub24_Sub1 class298_sub24_sub1 = class298_sub49.aClass308_Sub1_7591.method3763();
                    if (class298_sub24_sub1 != null) {
                        TranslatedCanvas translatedCanvas = class298_sub24_sub1.method3082();
                        if (null != translatedCanvas) {
                            translatedCanvas.method3030(1064671451 * class298_sub49.anInt7590);
                            Class285.aClass298_Sub19_Sub4_3083.method3043(translatedCanvas);
                            class298_sub49.aBoolean7593 = true;
                        }
                    }
                }
            }
        }
    }

    public static int[] getFontIds() {
        return new int[]{399302739 * Class74.containerID, Class74.anInt690 * 1178461027, Class74.anInt698 * -1372765471};
    }

    public static int method397(CharSequence charsequence, CharSequence charsequence_0_, GameLanguage language, int i) {
        int i_1_ = charsequence.length();
        int i_2_ = charsequence_0_.length();
        int i_3_ = 0;
        int i_4_ = 0;
        char c = '\0';
        char c_5_ = '\0';
        while_59_:
        do {
            char c_6_;
            char c_7_;
            for (; ; ) {
                if (i_3_ - c >= i_1_ && i_4_ - c_5_ >= i_2_) {
                    if (i >= 79380938) {
                            /* empty */
                    }
                    break while_59_;
                }
                if (i_3_ - c >= i_1_)
                    return -1;
                if (i_4_ - c_5_ >= i_2_)
                    return 1;
                if (0 != c) {
                    c_6_ = c;
                } else
                    c_6_ = charsequence.charAt(i_3_++);
                if (c_5_ != 0) {
                    c_7_ = c_5_;
                } else
                    c_7_ = charsequence_0_.charAt(i_4_++);
                c = StringUtils.method2403(c_6_);
                c_5_ = StringUtils.method2403(c_7_);
                c_6_ = GameLanguage.method767(c_6_, language);
                c_7_ = GameLanguage.method767(c_7_, language);
                if (c_7_ != c_6_ && (Character.toUpperCase(c_6_) != Character.toUpperCase(c_7_))) {
                    c_6_ = Character.toLowerCase(c_6_);
                    c_7_ = Character.toLowerCase(c_7_);
                    if (c_7_ != c_6_)
                        break;
                }
            }
            return (StringUtils.method4550(c_6_) - StringUtils.method4550(c_7_));
        } while (false);
        int i_8_ = Math.min(i_1_, i_2_);
        for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
            if (GameLanguage.french == language) {
                i_3_ = i_1_ - 1 - i_9_;
                i_4_ = i_2_ - 1 - i_9_;
            } else
                i_3_ = i_4_ = i_9_;
            char c_10_ = charsequence.charAt(i_3_);
            char c_11_ = charsequence_0_.charAt(i_4_);
            if (c_10_ != c_11_ && (Character.toUpperCase(c_10_) != Character.toUpperCase(c_11_))) {
                c_10_ = Character.toLowerCase(c_10_);
                c_11_ = Character.toLowerCase(c_11_);
                if (c_11_ != c_10_)
                    return (StringUtils.method4550(c_10_) - StringUtils.method4550(c_11_));
            }
        }
        int i_12_ = i_1_ - i_2_;
        if (0 != i_12_)
            return i_12_;
        for (int i_13_ = 0; i_13_ < i_8_; i_13_++) {
            char c_14_ = charsequence.charAt(i_13_);
            char c_15_ = charsequence_0_.charAt(i_13_);
            if (c_15_ != c_14_)
                return (StringUtils.method4550(c_14_) - StringUtils.method4550(c_15_));
        }
        return 0;
    }

    public static void method4572(int i) {
        anInt275 = 925615037 * i;
        IComponentDefinition.modelsCache.clear();
    }

    public static byte[] method4311(File file) {
        try {
            return Class135.method1493(file, (int) file.length());
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pb.b(").append(')').toString());
        }
    }

    public static void setMiddleMouseCameraRotation(int pitch, int yaw, int roll) {
        pitch <<= 3;
        yaw <<= 3;
        roll <<= 3;
        GameClient.cameraYAngle = (float) pitch;
        GameClient.cameraXAngle = (float) yaw;
        if (CameraUtils.cameraType * -863531439 == 3) {
            GameClient.camRotX = -648269561 * pitch;
            GameClient.camRotY = -1587695039 * yaw;
            GameClient.camRotZ = -851711283 * roll;
        }
        Class91.adjustCamera();
        GameClient.aBoolean8763 = true;
    }

    public static int method882(int i, boolean bool) {
        if (bool)
            return 0;
        Class298_Sub9 class298_sub9 = method2437(i, bool);
        if (null == class298_sub9)
            return ((Class300.itemContainerDefinitionLoader.getDefinition(i).size) * 1317156085);
        int i_1_ = 0;
        for (int i_2_ = 0; i_2_ < class298_sub9.anIntArray7226.length; i_2_++) {
            if (-1 == class298_sub9.anIntArray7226[i_2_])
                i_1_++;
        }
        i_1_ += ((Class300.itemContainerDefinitionLoader.getDefinition(i).size * 1317156085) - class298_sub9.anIntArray7226.length);
        return i_1_;
    }

    public static final int method883() {
        return (int) (1000000000L / (GameShell.updateInterval * -4639622049358970979L));
    }

    public static void method967(int i, int i_28_, int i_29_) {
        if (ItemContainerDefinition.aClass95_9602 != null && ItemContainerDefinition.aClass95_9602.method1029() && (ItemContainerDefinition.aClass95_9602.anInt921 * 1941368041 == i)) {
            Class116.method1268(ItemContainerDefinition.aClass95_9602, i_28_, (byte) 20);
            Class300.anInt3207 = -184109511 * i;
            ItemContainerDefinition.aClass95_9602 = null;
            Class298_Sub2.aClass298_Sub19_Sub1_7167 = null;
            OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.aClass198_2004, ConnectionType.gameConnection.encryptor);
            outgoingPacketBuffer.payload.writeInt(-1);
            ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
        } else {
            i_28_ = i_28_ * SettingsManager.settingsManager.musicVolume.getValue() >> 8;
            if (i == -1 && !Class300.aBoolean3208)
                Class134.method1489((byte) -85);
            else if (-1 != i && (-1256171511 * Class300.anInt3207 != i || !EffectiveVertex.method781()) && i_28_ != 0 && !Class300.aBoolean3208) {
                Class170.method1811(i_29_, Js5List.JS5_MUSIC, i, 0, i_28_, false, new Class97_Sub1(), (byte) -36);
                method344();
            }
            if (Class300.anInt3207 * -1256171511 != i)
                Class298_Sub2.aClass298_Sub19_Sub1_7167 = null;
            Class300.anInt3207 = -184109511 * i;
            Class300.aClass303_3215 = null;
        }
    }

    static void method966(String string, String string_27_) {
        Class360.loginType = 471358088;
        Class360.activeConnection = ConnectionType.gameConnection;
        Class460.method5981(false, false, string, string_27_, -1L);
    }

    static final void method5797(int i, int i_5_, int i_6_, int i_7_) {
        int i_9_ = 0;
        int i_10_ = i_6_;
        int i_11_ = -i_6_;
        int i_12_ = -1;
        Class82_Sub22.method940(Class372_Sub1.anIntArrayArray4047[i_5_], i - i_6_, i + i_6_, i_7_);
        while (i_10_ > i_9_) {
            i_12_ += 2;
            i_11_ += i_12_;
            i_9_++;
            if (i_11_ >= 0) {
                i_10_--;
                i_11_ -= i_10_ << 1;
                int[] is = Class372_Sub1.anIntArrayArray4047[i_10_ + i_5_];
                int[] is_13_ = Class372_Sub1.anIntArrayArray4047[i_5_ - i_10_];
                int i_14_ = i_9_ + i;
                int i_15_ = i - i_9_;
                Class82_Sub22.method940(is, i_15_, i_14_, i_7_);
                Class82_Sub22.method940(is_13_, i_15_, i_14_, i_7_);
            }
            int i_16_ = i_10_ + i;
            int i_17_ = i - i_10_;
            int[] is = Class372_Sub1.anIntArrayArray4047[i_5_ + i_9_];
            int[] is_18_ = Class372_Sub1.anIntArrayArray4047[i_5_ - i_9_];
            Class82_Sub22.method940(is, i_17_, i_16_, i_7_);
            Class82_Sub22.method940(is_18_, i_17_, i_16_, i_7_);
        }
    }

    static void method971(IComponentDefinition class105, int i, int i_6_, int i_7_) {
        try {
            if (GameClient.interfaceSelected) {
                Class497 class497 = (IdentityKitDefinition.anInt1508 * 831522399 != -1 ? Class92.aClass504_905.get((831522399 * (IdentityKitDefinition.anInt1508))) : null);
                if (GameClient.getComponentSettings(class105).method3495() && 0 != (anInt3192 * -112110875 & 0x20) && (null == class497 || (class105.method1117(IdentityKitDefinition.anInt1508 * 831522399, (class497.size * -388931549)) != -388931549 * class497.size)))
                    MenuOption.add(GameClient.selectedInterfaceOption, new StringBuilder().append(GameClient.aString8754).append(" ").append(Class26.lambdaExpression).append(" ").append(class105.opBase).toString(), Class240.targetOverCursors * 697885143, 58, class105.itemID * -1232467723, 0L, class105.slot * -1309843523, class105.interfaceHash, true, false, (long) (class105.slot * -1309843523 << 32 | class105.interfaceHash), false);
            }
            for (int i_8_ = 9; i_8_ >= 5; i_8_--) {
                String string = Class380.method4682(class105, i_8_);
                if (string != null)
                    MenuOption.add(string, class105.opBase, Class69.method794(class105, i_8_, -1663637577), 1007, class105.itemID * -1232467723, (long) (1 + i_8_), -1309843523 * class105.slot, class105.interfaceHash, true, false, (long) (-1309843523 * class105.slot << 32 | class105.interfaceHash), false);
            }
            String string = Class88.method977(class105, -1338609331);
            if (null != string)
                MenuOption.add(string, class105.opBase, class105.anInt1232 * 2120029245, 25, -1232467723 * class105.itemID, 0L, -1309843523 * class105.slot, class105.interfaceHash, true, false, (long) ((class105.slot * -1309843523 << 32) | class105.interfaceHash), false);
            for (int i_9_ = 4; i_9_ >= 0; i_9_--) {
                String string_10_ = Class380.method4682(class105, i_9_);
                if (null != string_10_)
                    MenuOption.add(string_10_, class105.opBase, Class69.method794(class105, i_9_, -1654084952), 57, class105.itemID * -1232467723, (long) (1 + i_9_), -1309843523 * class105.slot, class105.interfaceHash, true, false, (long) (class105.slot * -1309843523 << 32 | class105.interfaceHash), false);
            }
            if (GameClient.getComponentSettings(class105).method3492()) {
                if (class105.toolTip != null)
                    MenuOption.add(class105.toolTip, "", -1, 30, -1232467723 * class105.itemID, 0L, class105.slot * -1309843523, class105.interfaceHash, true, false, (long) (-1309843523 * class105.slot << 32 | class105.interfaceHash), false);
                else
                    MenuOption.add(Tradution.CONTINUE.translate(GameLanguage.CURRENT_LANGUAGE), "", -1, 30, class105.itemID * -1232467723, 0L, -1309843523 * class105.slot, class105.interfaceHash, true, false, (long) (-1309843523 * class105.slot << 32 | class105.interfaceHash), false);
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dn.v(").append(')').toString());
        }
    }

    public static int method970(int i, int i_4_) {
        try {
            int i_5_ = 0;
            if (i < 0 || i >= 65536) {
                i >>>= 16;
                i_5_ += 16;
            }
            if (i >= 256) {
                i >>>= 8;
                i_5_ += 8;
            }
            if (i >= 16) {
                i >>>= 4;
                i_5_ += 4;
            }
            if (i >= 4) {
                i >>>= 2;
                i_5_ += 2;
            }
            if (i >= 1) {
                i >>>= 1;
                i_5_++;
            }
            return i + i_5_;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dn.d(").append(')').toString());
        }
    }

    static final boolean method2120(int i, int i_8_, Class336 class336, Class289 class289, int i_9_) {
        int i_10_ = i;
        int i_11_ = i_8_;
        int i_12_ = 64;
        int i_13_ = 64;
        int i_14_ = i - i_12_;
        int i_15_ = i_8_ - i_13_;
        Class285.anIntArrayArray3076[i_12_][i_13_] = 99;
        Class285.anIntArrayArray3080[i_12_][i_13_] = 0;
        int i_16_ = 0;
        int i_17_ = 0;
        Class285.routeFinderXArray[i_16_] = i_10_;
        Class285.routeFinderYArray[i_16_++] = i_11_;
        int[][] is = class289.anIntArrayArray3155;
        while (i_17_ != i_16_) {
            i_10_ = Class285.routeFinderXArray[i_17_];
            i_11_ = Class285.routeFinderYArray[i_17_];
            i_17_ = i_17_ + 1 & 0xfff;
            i_12_ = i_10_ - i_14_;
            i_13_ = i_11_ - i_15_;
            int i_18_ = i_10_ - class289.anInt3151 * 1487776559;
            int i_19_ = i_11_ - 1415525851 * class289.anInt3152;
            if (class336.method4090(2, i_10_, i_11_, class289, -16711936)) {
                Class285.anInt3078 = 1021042197 * i_10_;
                ClanMember.anInt1684 = -575994451 * i_11_;
                return true;
            }
            int i_20_ = Class285.anIntArrayArray3080[i_12_][i_13_] + 1;
            if (i_12_ > 0) {
                if (0 != Class285.anIntArrayArray3076[i_12_ - 1][i_13_]) {
                    if (i_9_ != -1327541421) {
                            /* empty */
                    }
                } else if (0 != (is[i_18_ - 1][i_19_] & 0x43a40000)) {
                    if (i_9_ != -1327541421)
                        throw new IllegalStateException();
                } else if ((is[i_18_ - 1][1 + i_19_] & 0x4e240000) != 0) {
                    if (i_9_ != -1327541421) {
                            /* empty */
                    }
                } else {
                    Class285.routeFinderXArray[i_16_] = i_10_ - 1;
                    Class285.routeFinderYArray[i_16_] = i_11_;
                    i_16_ = i_16_ + 1 & 0xfff;
                    Class285.anIntArrayArray3076[i_12_ - 1][i_13_] = 2;
                    Class285.anIntArrayArray3080[i_12_ - 1][i_13_] = i_20_;
                }
            }
            if (i_12_ < 126) {
                if (0 != Class285.anIntArrayArray3076[1 + i_12_][i_13_]) {
                    if (i_9_ != -1327541421)
                        throw new IllegalStateException();
                } else if ((is[i_18_ + 2][i_19_] & 0x60e40000) != 0) {
                    if (i_9_ != -1327541421) {
                            /* empty */
                    }
                } else if (0 != (is[2 + i_18_][1 + i_19_] & 0x78240000)) {
                    if (i_9_ != -1327541421) {
                            /* empty */
                    }
                } else {
                    Class285.routeFinderXArray[i_16_] = i_10_ + 1;
                    Class285.routeFinderYArray[i_16_] = i_11_;
                    i_16_ = i_16_ + 1 & 0xfff;
                    Class285.anIntArrayArray3076[1 + i_12_][i_13_] = 8;
                    Class285.anIntArrayArray3080[i_12_ + 1][i_13_] = i_20_;
                }
            }
            if (i_13_ > 0) {
                if (0 != Class285.anIntArrayArray3076[i_12_][i_13_ - 1]) {
                    if (i_9_ != -1327541421)
                        throw new IllegalStateException();
                } else if (0 != (is[i_18_][i_19_ - 1] & 0x43a40000)) {
                    if (i_9_ != -1327541421)
                        throw new IllegalStateException();
                } else if ((is[i_18_ + 1][i_19_ - 1] & 0x60e40000) != 0) {
                    if (i_9_ != -1327541421) {
                            /* empty */
                    }
                } else {
                    Class285.routeFinderXArray[i_16_] = i_10_;
                    Class285.routeFinderYArray[i_16_] = i_11_ - 1;
                    i_16_ = i_16_ + 1 & 0xfff;
                    Class285.anIntArrayArray3076[i_12_][i_13_ - 1] = 1;
                    Class285.anIntArrayArray3080[i_12_][i_13_ - 1] = i_20_;
                }
            }
            if (i_13_ < 126) {
                if (Class285.anIntArrayArray3076[i_12_][1 + i_13_] != 0) {
                    if (i_9_ != -1327541421)
                        throw new IllegalStateException();
                } else if (0 != (is[i_18_][2 + i_19_] & 0x4e240000)) {
                    if (i_9_ != -1327541421)
                        throw new IllegalStateException();
                } else if (0 != (is[i_18_ + 1][i_19_ + 2] & 0x78240000)) {
                    if (i_9_ != -1327541421)
                        throw new IllegalStateException();
                } else {
                    Class285.routeFinderXArray[i_16_] = i_10_;
                    Class285.routeFinderYArray[i_16_] = 1 + i_11_;
                    i_16_ = i_16_ + 1 & 0xfff;
                    Class285.anIntArrayArray3076[i_12_][i_13_ + 1] = 4;
                    Class285.anIntArrayArray3080[i_12_][1 + i_13_] = i_20_;
                }
            }
            if (i_12_ > 0 && i_13_ > 0) {
                if (Class285.anIntArrayArray3076[i_12_ - 1][i_13_ - 1] != 0) {
                    if (i_9_ != -1327541421)
                        throw new IllegalStateException();
                } else if ((is[i_18_ - 1][i_19_] & 0x4fa40000) != 0) {
                    if (i_9_ != -1327541421)
                        throw new IllegalStateException();
                } else if ((is[i_18_ - 1][i_19_ - 1] & 0x43a40000) != 0) {
                    if (i_9_ != -1327541421) {
                            /* empty */
                    }
                } else if (0 != (is[i_18_][i_19_ - 1] & 0x63e40000)) {
                    if (i_9_ != -1327541421) {
                            /* empty */
                    }
                } else {
                    Class285.routeFinderXArray[i_16_] = i_10_ - 1;
                    Class285.routeFinderYArray[i_16_] = i_11_ - 1;
                    i_16_ = i_16_ + 1 & 0xfff;
                    Class285.anIntArrayArray3076[i_12_ - 1][i_13_ - 1] = 3;
                    Class285.anIntArrayArray3080[i_12_ - 1][i_13_ - 1] = i_20_;
                }
            }
            if (i_12_ < 126 && i_13_ > 0) {
                if (0 != (Class285.anIntArrayArray3076[1 + i_12_][i_13_ - 1])) {
                    if (i_9_ != -1327541421)
                        throw new IllegalStateException();
                } else if ((is[i_18_ + 1][i_19_ - 1] & 0x63e40000) != 0) {
                    if (i_9_ != -1327541421)
                        throw new IllegalStateException();
                } else if ((is[i_18_ + 2][i_19_ - 1] & 0x60e40000) != 0) {
                    if (i_9_ != -1327541421)
                        throw new IllegalStateException();
                } else if ((is[2 + i_18_][i_19_] & 0x78e40000) != 0) {
                    if (i_9_ != -1327541421)
                        throw new IllegalStateException();
                } else {
                    Class285.routeFinderXArray[i_16_] = i_10_ + 1;
                    Class285.routeFinderYArray[i_16_] = i_11_ - 1;
                    i_16_ = i_16_ + 1 & 0xfff;
                    Class285.anIntArrayArray3076[i_12_ + 1][i_13_ - 1] = 9;
                    Class285.anIntArrayArray3080[1 + i_12_][i_13_ - 1] = i_20_;
                }
            }
            if (i_12_ > 0 && i_13_ < 126) {
                if (0 != (Class285.anIntArrayArray3076[i_12_ - 1][1 + i_13_])) {
                    if (i_9_ != -1327541421)
                        throw new IllegalStateException();
                } else if ((is[i_18_ - 1][1 + i_19_] & 0x4fa40000) != 0) {
                    if (i_9_ != -1327541421) {
                            /* empty */
                    }
                } else if (0 != (is[i_18_ - 1][2 + i_19_] & 0x4e240000)) {
                    if (i_9_ != -1327541421)
                        throw new IllegalStateException();
                } else if ((is[i_18_][2 + i_19_] & 0x7e240000) != 0) {
                    if (i_9_ != -1327541421) {
                            /* empty */
                    }
                } else {
                    Class285.routeFinderXArray[i_16_] = i_10_ - 1;
                    Class285.routeFinderYArray[i_16_] = i_11_ + 1;
                    i_16_ = i_16_ + 1 & 0xfff;
                    Class285.anIntArrayArray3076[i_12_ - 1][i_13_ + 1] = 6;
                    Class285.anIntArrayArray3080[i_12_ - 1][1 + i_13_] = i_20_;
                }
            }
            if (i_12_ < 126 && i_13_ < 126) {
                if (0 != (Class285.anIntArrayArray3076[i_12_ + 1][1 + i_13_])) {
                    if (i_9_ != -1327541421) {
                            /* empty */
                    }
                } else if ((is[1 + i_18_][2 + i_19_] & 0x7e240000) != 0) {
                    if (i_9_ != -1327541421) {
                            /* empty */
                    }
                } else if ((is[2 + i_18_][2 + i_19_] & 0x78240000) != 0) {
                    if (i_9_ != -1327541421) {
                            /* empty */
                    }
                } else if ((is[i_18_ + 2][1 + i_19_] & 0x78e40000) != 0) {
                    if (i_9_ != -1327541421) {
                            /* empty */
                    }
                } else {
                    Class285.routeFinderXArray[i_16_] = i_10_ + 1;
                    Class285.routeFinderYArray[i_16_] = 1 + i_11_;
                    i_16_ = i_16_ + 1 & 0xfff;
                    Class285.anIntArrayArray3076[i_12_ + 1][1 + i_13_] = 12;
                    Class285.anIntArrayArray3080[1 + i_12_][1 + i_13_] = i_20_;
                }
            }
        }
        Class285.anInt3078 = 1021042197 * i_10_;
        ClanMember.anInt1684 = -575994451 * i_11_;
        return false;
    }

    static int method2121(String string, byte[] is, int i) {
        int i_22_ = i;
        int i_23_ = string.length();
        for (int i_24_ = 0; i_24_ < i_23_; i_24_ += 4) {
            int i_25_ = StringUtils.method1773(string.charAt(i_24_));
            int i_26_ = (i_24_ + 1 < i_23_ ? StringUtils.method1773(string.charAt(1 + i_24_)) : -1);
            int i_27_ = (2 + i_24_ < i_23_ ? StringUtils.method1773(string.charAt(2 + i_24_)) : -1);
            int i_28_ = (i_24_ + 3 < i_23_ ? StringUtils.method1773(string.charAt(i_24_ + 3)) : -1);
            is[i++] = (byte) (i_25_ << 2 | i_26_ >>> 4);
            if (i_27_ == -1)
                break;
            is[i++] = (byte) ((i_26_ & 0xf) << 4 | i_27_ >>> 2);
            if (-1 == i_28_)
                break;
            is[i++] = (byte) ((i_27_ & 0x3) << 6 | i_28_);
        }
        return i - i_22_;
    }

    public static void method2119(AnimationDefinition animationDefinitions, int index) {
        if (Class300.anInt3213 * -991384187 < 50 && (null != animationDefinitions && animationDefinitions.handledSounds != null && index < animationDefinitions.handledSounds.length && null != animationDefinitions.handledSounds[index])) {
            int i_3_ = animationDefinitions.handledSounds[index][0];
            int i_4_ = i_3_ >> 8;
            int i_5_ = i_3_ >> 5 & 0x7;
            if (animationDefinitions.handledSounds[index].length > 1) {
                int i_6_ = (int) (Math.random() * (double) (animationDefinitions.handledSounds[index]).length);
                if (i_6_ > 0)
                    i_4_ = animationDefinitions.handledSounds[index][i_6_];
            }
            int i_7_ = 256;
            if (null != animationDefinitions.soundMaxDelay && animationDefinitions.soundMinDelay != null)
                i_7_ = method4888(animationDefinitions.soundMaxDelay[index], animationDefinitions.soundMinDelay[index]);
            if (animationDefinitions.affectToSound)
                ToMoveSettings.method3913(i_4_, i_5_, 0, 255, false, i_7_);
            else
                Class239.method2210(i_4_, i_5_, 0, 255, i_7_);
        }
    }

    static void method907(GraphicsToolkit graphicsToolkit) {
        try {
            int i_1_ = Class88.anInt806 * -1347746885;
            int i_2_ = TileMessage.anInt7658 * 1089948687;
            int i_3_ = 608683427 * Class134.anInt6343;
            int i_5_ = 20;
            if (null == Class65.aClass264_664 || null == aClass505_2420) {
                Class65.aClass264_664 = (FontToolkit) (StaticMethods5.fonts.loadOther(GameClient.defaultFontRenderProvider, ResourceProvider.anInt2710 * -2085188617, true, true));
                aClass505_2420 = (StaticMethods5.fonts.method1879(GameClient.defaultFontRenderProvider, -2085188617 * ResourceProvider.anInt2710));
                if (Class65.aClass264_664 != null && aClass505_2420 != null) {
                    Class194.closeMenus();
                    int i_6_ = i_1_ + i_3_ / 2;
                    if (i_3_ + i_6_ > GameShell.canvasWidth * -2110394505)
                        i_6_ = GameShell.canvasWidth * -2110394505 - i_3_;
                    if (i_6_ < 0)
                        i_6_ = 0;
                    method1226(i_6_, TileMessage.anInt7658 * 1089948687);
                    return;
                }
            }
            FontToolkit fontToolkit;
            if (Class65.aClass264_664 == null || aClass505_2420 == null)
                fontToolkit = b12_full_monochrome;
            else
                fontToolkit = Class65.aClass264_664;
            RSFontMetrics fontMetrics = RSFontMetrics.getDefaultFont();
            method3900(graphicsToolkit, Class88.anInt806 * -1347746885, 1089948687 * TileMessage.anInt7658, 608683427 * Class134.anInt6343, Class448.anInt5619 * 1396607435, i_5_, fontToolkit, fontMetrics, Tradution.CHOOSE_OPTION.translate(GameLanguage.CURRENT_LANGUAGE), 1493499179);
            int i_7_ = (255 - Class436.anInt5484 * 597392981 - 1868123923 * Class436.anInt5498);
            if (i_7_ < 0)
                i_7_ = 0;
            int i_8_ = AwtMouse.mouse.getLastX();
            int i_9_ = AwtMouse.mouse.getLastY();
            if (!Class436.aBoolean5471) {
                int i_10_ = 0;
                for (MenuOption menuOption = ((MenuOption) Class436.aClass453_5480.method5939()); menuOption != null; menuOption = ((MenuOption) Class436.aClass453_5480.method5944())) {
                    int i_11_ = (1 + (fontMetrics.anInt6202 * 1110385787 + (i_5_ + i_2_)) + ((-278777595 * Class436.menuOptionCount - 1 - i_10_) * (-411680299 * Class436.anInt5467)));
                    if (i_8_ > -1347746885 * Class88.anInt806 && i_8_ < (608683427 * Class134.anInt6343 + -1347746885 * Class88.anInt806) && i_9_ > i_11_ - fontMetrics.anInt6202 * 1110385787 - 1 && i_9_ < i_11_ + fontMetrics.anInt6197 * -1883958527 && (menuOption.aBoolean9664))
                        graphicsToolkit.drawFilledRectangle(-1347746885 * Class88.anInt806, i_11_ - fontMetrics.anInt6202 * 1110385787, 608683427 * Class134.anInt6343, Class436.anInt5467 * -411680299, i_7_ << 24 | 427035573 * Class313.anInt3297, 1);
                    i_10_++;
                }
            } else {
                int i_12_ = 0;
                for (MenuOptionNode menuOptionNode = ((MenuOptionNode) Class436.aClass461_5482.first()); null != menuOptionNode; menuOptionNode = ((MenuOptionNode) Class436.aClass461_5482.next())) {
                    int i_13_ = (i_12_ * (Class436.anInt5467 * -411680299) + (fontMetrics.anInt6202 * 1110385787 + (i_5_ + i_2_) + 1));
                    if (i_8_ > Class88.anInt806 * -1347746885 && i_8_ < (Class134.anInt6343 * 608683427 + -1347746885 * Class88.anInt806) && i_9_ > i_13_ - fontMetrics.anInt6202 * 1110385787 - 1 && i_9_ < i_13_ + fontMetrics.anInt6197 * -1883958527 && (-628325139 * menuOptionNode.getTotalMenus > 1 || ((MenuOption) menuOptionNode.circularDoubleLinkedList.DELIMETER.next_cache).aBoolean9664))
                        graphicsToolkit.drawFilledRectangle(Class88.anInt806 * -1347746885, i_13_ - fontMetrics.anInt6202 * 1110385787, Class134.anInt6343 * 608683427, Class436.anInt5467 * -411680299, i_7_ << 24 | Class313.anInt3297 * 427035573, 1);
                    i_12_++;
                }
                if (Class436.aMenuOptionNode_5472 != null) {
                    method3900(graphicsToolkit, 805710735 * anInt5681, -1370784315 * ClassNotAnim.anInt6119, 2054409059 * MenuOption.anInt5345, -1855216229 * SpotTypeLoader.anInt4166, i_5_, fontToolkit, fontMetrics, (Class436.aMenuOptionNode_5472.aString9585), -1919103988);
                    i_12_ = 0;
                    for (MenuOption menuOption = ((MenuOption) Class436.aMenuOptionNode_5472.circularDoubleLinkedList.first()); menuOption != null; menuOption = ((MenuOption) Class436.aMenuOptionNode_5472.circularDoubleLinkedList.next())) {
                        int i_14_ = (1 + (ClassNotAnim.anInt6119 * -1370784315 + i_5_ + 1110385787 * fontMetrics.anInt6202) + -411680299 * Class436.anInt5467 * i_12_);
                        if (i_8_ > 805710735 * anInt5681 && i_8_ < (anInt5681 * 805710735 + MenuOption.anInt5345 * 2054409059) && (i_9_ > i_14_ - 1110385787 * fontMetrics.anInt6202 - 1) && i_9_ < i_14_ + fontMetrics.anInt6197 * -1883958527 && (menuOption.aBoolean9664))
                            graphicsToolkit.drawFilledRectangle(805710735 * anInt5681, i_14_ - 1110385787 * fontMetrics.anInt6202, MenuOption.anInt5345 * 2054409059, Class436.anInt5467 * -411680299, (i_7_ << 24 | Class313.anInt3297 * 427035573), 1);
                        i_12_++;
                    }
                    method2372(graphicsToolkit, 805710735 * anInt5681, -1370784315 * ClassNotAnim.anInt6119, 2054409059 * MenuOption.anInt5345, -1855216229 * SpotTypeLoader.anInt4166, i_5_);
                }
            }
            method2372(graphicsToolkit, -1347746885 * Class88.anInt806, TileMessage.anInt7658 * 1089948687, 608683427 * Class134.anInt6343, 1396607435 * Class448.anInt5619, i_5_);
            if (!Class436.aBoolean5471) {
                int i_15_ = 0;
                for (MenuOption menuOption = ((MenuOption) Class436.aClass453_5480.method5939()); menuOption != null; menuOption = ((MenuOption) Class436.aClass453_5480.method5944())) {
                    int i_16_ = (1110385787 * fontMetrics.anInt6202 + (i_5_ + i_2_) + 1 + ((Class436.menuOptionCount * -278777595 - 1 - i_15_) * (Class436.anInt5467 * -411680299)));
                    method5192(i_8_, i_9_, i_1_, i_3_, i_16_, menuOption, fontToolkit, fontMetrics, (-1067973831 * anInt3674 | ~0xffffff), 1697857463 * (Class298_Sub40_Sub2.anInt9693) | ~0xffffff);
                    i_15_++;
                }
            } else {
                int i_17_ = 0;
                for (MenuOptionNode menuOptionNode = ((MenuOptionNode) Class436.aClass461_5482.first()); null != menuOptionNode; menuOptionNode = ((MenuOptionNode) Class436.aClass461_5482.next())) {
                    int i_18_ = (-411680299 * Class436.anInt5467 * i_17_ + (1 + (i_5_ + 1089948687 * TileMessage.anInt7658 + 1110385787 * fontMetrics.anInt6202)));
                    if ((menuOptionNode.getTotalMenus * -628325139) == 1)
                        method5192(i_8_, i_9_, Class88.anInt806 * -1347746885, Class134.anInt6343 * 608683427, i_18_, ((MenuOption) (menuOptionNode.circularDoubleLinkedList.DELIMETER.next_cache)), fontToolkit, fontMetrics, anInt3674 * -1067973831 | ~0xffffff, (Class298_Sub40_Sub2.anInt9693 * 1697857463 | ~0xffffff));
                    else
                        RSFontMetrics.method763(i_8_, i_9_, Class88.anInt806 * -1347746885, 1089948687 * TileMessage.anInt7658, 608683427 * Class134.anInt6343, 1396607435 * Class448.anInt5619, i_18_, menuOptionNode, fontToolkit, fontMetrics, -1067973831 * anInt3674 | ~0xffffff, (1697857463 * Class298_Sub40_Sub2.anInt9693 | ~0xffffff));
                    i_17_++;
                }
                if (Class436.aMenuOptionNode_5472 != null) {
                    i_17_ = 0;
                    for (MenuOption menuOption = ((MenuOption) Class436.aMenuOptionNode_5472.circularDoubleLinkedList.first()); null != menuOption; menuOption = ((MenuOption) Class436.aMenuOptionNode_5472.circularDoubleLinkedList.next())) {
                        int i_19_ = (i_17_ * (Class436.anInt5467 * -411680299) + (1 + (fontMetrics.anInt6202 * 1110385787 + (ClassNotAnim.anInt6119 * -1370784315 + i_5_))));
                        method5192(i_8_, i_9_, 805710735 * anInt5681, 2054409059 * MenuOption.anInt5345, i_19_, menuOption, fontToolkit, fontMetrics, (anInt3674 * -1067973831 | ~0xffffff), (Class298_Sub40_Sub2.anInt9693 * 1697857463) | ~0xffffff);
                        i_17_++;
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("xx.bd(").append(')').toString());
        }
    }

    public static void sendConsoleMessage(String string) {
        if (Class8.consoleMessages == null)
            Class372_Sub3.method4599();
        GameClient.aCalendar8758.setTime(new Date(TimeUtils.getTime()));
        int i_5_ = GameClient.aCalendar8758.get(11);
        int i_6_ = GameClient.aCalendar8758.get(12);
        int i_7_ = GameClient.aCalendar8758.get(13);
        String string_8_ = new StringBuilder().append(Integer.toString(i_5_ / 10)).append(i_5_ % 10).append(":").append(i_6_ / 10).append(i_6_ % 10).append(":").append(i_7_ / 10).append(i_7_ % 10).toString();
        String[] strings = Class365_Sub1_Sub3_Sub1.method4508(string, '\n');
        for (int i_9_ = 0; i_9_ < strings.length; i_9_++) {
            for (int i_10_ = -2035787443 * Class8.anInt102; i_10_ > 0; i_10_--)
                Class8.consoleMessages[i_10_] = Class8.consoleMessages[i_10_ - 1];
            Class8.consoleMessages[0] = new StringBuilder().append(string_8_).append(": ").append(strings[i_9_]).toString();
            if (null != Class78.aFileOutputStream731) {
                try {
                    Class78.aFileOutputStream731.write(Class77.method840(new StringBuilder().append(Class8.consoleMessages[0]).append("\n").toString(), 6758905));
                } catch (IOException ioexception) {
                        /* empty */
                }
            }
            if (Class8.anInt102 * -2035787443 < Class8.consoleMessages.length - 1) {
                Class8.anInt102 += 674924421;
                if (Class8.anInt103 * -1731316011 > 0)
                    Class8.anInt103 += 205738621;
            }
        }
    }

    static Class298_Sub9 method2437(int i, boolean bool) {
        long l = (long) (i | (bool ? -2147483648 : 0));
        return (Class298_Sub9) Class298_Sub9.aClass437_7224.get(l);
    }

    static final void method2440(Class365_Sub1 class365_sub1, int i) {
        Class82_Sub21.method936(class365_sub1, i, false);
    }

    static final String method5866(int i) {
        String string = Integer.toString(i);
        for (int i_3_ = string.length() - 3; i_3_ > 0; i_3_ -= 3)
            string = new StringBuilder().append(string.substring(0, i_3_)).append(Class26.comma).append(string.substring(i_3_)).toString();
        if (string.length() > 9)
            return new StringBuilder().append(" ").append(ColorUtils.htmlToHex(65408)).append(string.substring(0, string.length() - 8)).append(Tradution.aClass470_5917.translate(GameLanguage.CURRENT_LANGUAGE)).append(" (").append(string).append(")").append(Class26.colorMessage).toString();
        if (string.length() > 6)
            return new StringBuilder().append(" ").append(ColorUtils.htmlToHex(16777215)).append(string.substring(0, string.length() - 4)).append(Tradution.aClass470_5913.translate(GameLanguage.CURRENT_LANGUAGE)).append(" (").append(string).append(")").append(Class26.colorMessage).toString();
        return new StringBuilder().append(" ").append(ColorUtils.htmlToHex(16776960)).append(string).append(Class26.colorMessage).toString();
    }

    static void method6099(Js5FileSystem class243, int i, int i_2_, int i_3_, boolean bool, long l) {
        method4143(class243, i, i_2_, i_3_, bool, l, 0, -1584646162);
    }

    public static final int method6098(String string) {
        if (null == string)
            return -1;
        for (int i_1_ = 0; i_1_ < -1054937867 * GameClient.anInt8941; i_1_++) {
            if (string.equalsIgnoreCase(GameClient.playerAccountNames[i_1_]))
                return i_1_;
        }
        return -1;
    }

    public static void method911(String string, boolean bool) {
        method5846(string, bool, -1, -1);
    }

    static final void sendProjectileFixedScene() {
        for (Class298_Sub37_Sub2 class298_sub37_sub2 = ((Class298_Sub37_Sub2) GameClient.aClass453_8824.method5939()); null != class298_sub37_sub2; class298_sub37_sub2 = ((Class298_Sub37_Sub2) GameClient.aClass453_8824.method5944())) {
            Projectile projectile = (class298_sub37_sub2.aClass365_Sub1_Sub1_Sub1_9577);
            if (443738891 * GameClient.clientTick > projectile.endTick * -1349988959) {
                class298_sub37_sub2.unlink();
                projectile.method4411(686828159);
            } else if (GameClient.clientTick * 443738891 >= (projectile.startTick * 1113390887)) {
                projectile.method4406(-36689971);
                if (1894383945 * projectile.targetIndex > 0) {
                    if (1596783995 * GameClient.anInt8724 == 0) {
                        Entity entity = Class87.aClass94Array794[(projectile.targetIndex * 1894383945) - 1].method1015();
                        if (null != entity) {
                            Vector3f vector3f = (entity.getWorldTransform().trans);
                            if ((int) vector3f.x >= 0 && ((int) vector3f.x < GameClient.myRegion.getMapWidth() * 512) && (int) vector3f.z >= 0 && ((int) vector3f.z < GameClient.myRegion.getMapLength() * 512))
                                projectile.method4405((int) vector3f.x, (int) vector3f.z, ((Class356.getAverageHeight((int) vector3f.x, (int) vector3f.z, entity.plane, -1503815167)) - (2134079017 * (projectile.anInt10045))), 443738891 * GameClient.clientTick);
                        }
                    } else {
                        ObjectNode class298_sub29 = ((ObjectNode) (GameClient.entityList.get((long) ((1894383945 * (projectile.targetIndex)) - 1))));
                        if (class298_sub29 != null) {
                            NPC npc = ((NPC) class298_sub29.nodeObject);
                            Vector3f vector3f = (npc.getWorldTransform().trans);
                            if ((int) vector3f.x >= 0 && ((int) vector3f.x < GameClient.myRegion.getMapWidth() * 512) && (int) vector3f.z >= 0 && ((int) vector3f.z < GameClient.myRegion.getMapLength() * 512))
                                projectile.method4405((int) vector3f.x, (int) vector3f.z, ((Class356.getAverageHeight((int) vector3f.x, (int) vector3f.z, projectile.plane, -1366613250)) - (projectile.anInt10045 * 2134079017)), GameClient.clientTick * 443738891);
                        }
                    }
                }
                if (1894383945 * projectile.targetIndex < 0) {
                    int targetIndex = (-(projectile.targetIndex * 1894383945) - 1);
                    Player player;
                    if (targetIndex == -442628795 * GameClient.playerIndex)
                        player = Player.myPlayer;
                    else
                        player = (GameClient.entities[targetIndex]);
                    if (null != player) {
                        Vector3f vector3f = (player.getWorldTransform().trans);
                        if ((int) vector3f.x >= 0 && ((int) vector3f.x < GameClient.myRegion.getMapWidth() * 512) && (int) vector3f.z >= 0 && ((int) vector3f.z < GameClient.myRegion.getMapLength() * 512))
                            projectile.method4405((int) vector3f.x, (int) vector3f.z, ((Class356.getAverageHeight((int) vector3f.x, (int) vector3f.z, projectile.plane, -1135065402)) - (projectile.anInt10045 * 2134079017)), 443738891 * GameClient.clientTick);
                    }
                }
                projectile.method4407(GameClient.animatorTick * 614680345, (byte) 63);
                GameClient.myRegion.getRegion().method4022(projectile, true, (byte) 0);
            }
        }
    }

    static final void setDisplayMode(ScriptRuntime runtime) {
        int mode = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        if (mode < 0 || mode > 5)
            mode = 2;
        Class370.loadingPleaseWait(mode, false);
    }

    public static void method344() {
        method3955(-1, 255);
    }

    static final void method342(ScriptRuntime runtime) {
        SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.customCursors, (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]) != 0 ? 1 : 0);
        ToMoveSettings.encodeBuffer();
    }

    static final void translateTo3DPosition(int i, int i_17_, int i_18_, int i_19_) {
        method1400(i, i_17_, i_18_, 0, i_19_, false);
    }

    static final void method1551() {
        Class298_Sub28.method3109((byte) 32);
    }

    static final void method1033(int interfaceDefinition, int i_0_, int i_1_, boolean bool) {
        if (Class378.componentExists(interfaceDefinition, null))
            Class372.method4591((IComponentDefinition.getIComponentDefinitionCollections[interfaceDefinition].componentDefinitions), -1, i_0_, i_1_, bool);
    }

    public static final void method3903() {
        try {
            ConnectionType connectionType = ConnectionType.getConnectionType();
            OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.JOIN_FRIEND_CHAT_PACKET, connectionType.encryptor);
            outgoingPacketBuffer.payload.writeByte(0);
            connectionType.sendFrame(outgoingPacketBuffer);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nh.ml(").append(')').toString());
        }
    }

    public static boolean method1437(int i) {
        return 0 == i || 1 == i || i == 2;
    }

    public static boolean method6192(String accountName) {
        if (accountName == null)
            return false;
        for (int index = 0; index < GameClient.anInt8941 * -1054937867; index++) {
            if (accountName.equalsIgnoreCase(GameClient.playerAccountNames[index]))
                return true;
        }
        return accountName.equalsIgnoreCase(Player.myPlayer.accountName);
    }

    static final void method321(int interfaceID, int[] keys) {
        if (Class378.componentExists(interfaceID, keys)) {
            IComponentDefinition[] originalComponent = IComponentDefinition.getIComponentDefinitionCollections[interfaceID].componentDefinitions;
            for (int index = 0; index < originalComponent.length; index++) {
                IComponentDefinition newComponent = originalComponent[index];
                if (newComponent != null && newComponent.animator != null)
                    newComponent.animator.method5979();
            }
        }
    }

    static final void method336() {
        SettingsManager.loadMediumSettings();
        GameClient.myRegion.method2667();
        ToMoveSettings.encodeBuffer();
        GameClient.sentPreferences = false;
    }

    static final void method4141(Entity entity, boolean bool) {
        Class350 class350 = entity.method4426();
        if (2050671733 * entity.anInt10120 == 0) {
            entity.anInt10124 = 0;
            Region.anInt3565 = Class282.aClass282_6543.aByte6542 * -2059464589;
            Class431.anInt6504 = 0;
        } else {
            if (entity.animator.hasAnimationDefinition() && !entity.animator.method5826()) {
                AnimationDefinition class391 = entity.animator.getAnimationDefinition();
                if (entity.anInt10125 * 1888275831 > 0 && 62820525 * class391.animatingPrecedence == 0) {
                    entity.anInt10124 += -248378059;
                    Region.anInt3565 = Class282.aClass282_6543.aByte6542 * -2059464589;
                    Class431.anInt6504 = 0;
                    return;
                }
                if (1888275831 * entity.anInt10125 <= 0 && 0 == class391.walkPriority * -882531177) {
                    entity.anInt10124 += -248378059;
                    Region.anInt3565 = -2059464589 * Class282.aClass282_6543.aByte6542;
                    Class431.anInt6504 = 0;
                    return;
                }
            }
            for (int index = 0; index < entity.currentGraphics.length; index++) {
                if ((entity.currentGraphics[index].graphicID) * -967533709 != -1 && entity.currentGraphics[index].animator.method5826()) {
                    SpotType class398 = (SpotTypeLoader.loader.get((entity.currentGraphics[index].graphicID) * -967533709));
                    if (class398.aBoolean5215 && class398.animationID * 1505778629 != -1) {
                        AnimationDefinition animationDefinition = (Js5Configs.animsList.get(1505778629 * class398.animationID));
                        if ((entity.anInt10125 * 1888275831) > 0 && animationDefinition.animatingPrecedence * 62820525 == 0) {
                            entity.anInt10124 += -248378059;
                            Region.anInt3565 = (-2059464589 * Class282.aClass282_6543.aByte6542);
                            Class431.anInt6504 = 0;
                            return;
                        }
                        if ((entity.anInt10125 * 1888275831) <= 0 && 0 == animationDefinition.walkPriority * -882531177) {
                            entity.anInt10124 += -248378059;
                            Region.anInt3565 = (Class282.aClass282_6543.aByte6542 * -2059464589);
                            Class431.anInt6504 = 0;
                            return;
                        }
                    }
                }
            }
            Vector3f class217 = Vector3f.method2005(entity.getWorldTransform().trans);
            int i_7_ = (int) class217.x;
            int i_8_ = (int) class217.z;
            int i_9_ = (((entity.scenePositionXQueue[entity.anInt10120 * 2050671733 - 1]) * 512) + entity.getSize() * 256);
            int i_10_ = (((entity.scenePositionYQueue[entity.anInt10120 * 2050671733 - 1]) * 512) + entity.getSize() * 256);
            if (i_7_ < i_9_) {
                if (i_8_ < i_10_)
                    entity.method4414(10240, (byte) 1);
                else if (i_8_ > i_10_)
                    entity.method4414(14336, (byte) 1);
                else
                    entity.method4414(12288, (byte) 1);
            } else if (i_7_ > i_9_) {
                if (i_8_ < i_10_)
                    entity.method4414(6144, (byte) 1);
                else if (i_8_ > i_10_)
                    entity.method4414(2048, (byte) 1);
                else
                    entity.method4414(4096, (byte) 1);
            } else if (i_8_ < i_10_)
                entity.method4414(8192, (byte) 1);
            else if (i_8_ > i_10_)
                entity.method4414(0, (byte) 1);
            int i_11_ = (entity.aByteArray10110[2050671733 * entity.anInt10120 - 1]);
            if (!bool && (i_9_ - i_7_ > 1024 || i_9_ - i_7_ < -1024 || i_10_ - i_8_ > 1024 || i_10_ - i_8_ < -1024)) {
                entity.method4341((float) i_9_, class217.y, (float) i_10_);
                entity.method4415(entity.anInt10068 * 2145248039, false, 688514105);
                entity.anInt10120 -= -1013322787;
                if (1888275831 * entity.anInt10125 > 0)
                    entity.anInt10125 -= -1479140281;
                Region.anInt3565 = -2059464589 * Class282.aClass282_6543.aByte6542;
                Class431.anInt6504 = 0;
                class217.cache();
            } else {
                int i_12_ = 16;
                boolean bool_13_ = true;
                if (entity instanceof NPC)
                    bool_13_ = (((NPC) entity).aClass503_10190.aBoolean6164);
                if (bool_13_) {
                    int i_14_ = (2145248039 * entity.anInt10068 - (entity.aClass386_10084.anInt4144) * 259411823);
                    if (0 != i_14_ && (entity.setNextFaceEntity * 1433412323 == -1) && 0 != (entity.anInt10115 * 907865649))
                        i_12_ = 8;
                    if (!bool && (2050671733 * entity.anInt10120 > 2))
                        i_12_ = 24;
                    if (!bool && (entity.anInt10120 * 2050671733 > 3))
                        i_12_ = 32;
                } else {
                    if (!bool && (entity.anInt10120 * 2050671733 > 1))
                        i_12_ = 24;
                    if (!bool && (2050671733 * entity.anInt10120 > 2))
                        i_12_ = 32;
                }
                if (-1531994851 * entity.anInt10124 > 0 && (2050671733 * entity.anInt10120 > 1)) {
                    i_12_ = 32;
                    entity.anInt10124 -= -248378059;
                }
                if (i_11_ == Class282.aClass282_6541.aByte6542)
                    i_12_ <<= 1;
                else if (i_11_ == Class282.aClass282_6545.aByte6542)
                    i_12_ >>= 1;
                if (-1 != 1830307505 * class350.anInt3752) {
                    i_12_ <<= 9;
                    if (entity.anInt10120 * 2050671733 == 1) {
                        int i_15_ = (entity.anInt10126 * -1520103925 * (-1520103925 * entity.anInt10126));
                        int i_16_ = (((int) class217.x > i_9_ ? (int) class217.x - i_9_ : i_9_ - (int) class217.x) << 9);
                        int i_17_ = (((int) class217.z > i_10_ ? (int) class217.z - i_10_ : i_10_ - (int) class217.z) << 9);
                        int i_18_ = i_16_ > i_17_ ? i_16_ : i_17_;
                        int i_19_ = -634352286 * class350.anInt3752 * i_18_;
                        if (i_15_ > i_19_) {
                            Entity class365_sub1_sub1_sub2_20_ = entity;
                            class365_sub1_sub1_sub2_20_.anInt10126 = (-1520103925 * class365_sub1_sub1_sub2_20_.anInt10126 / 2 * 121933219);
                        } else if (i_15_ / 2 > i_18_) {
                            entity.anInt10126 -= class350.anInt3752 * 1936228275;
                            if ((-1520103925 * entity.anInt10126) < 0)
                                entity.anInt10126 = 0;
                        } else if ((entity.anInt10126 * -1520103925) < i_12_) {
                            entity.anInt10126 += 1936228275 * class350.anInt3752;
                            if ((entity.anInt10126 * -1520103925) > i_12_)
                                entity.anInt10126 = 121933219 * i_12_;
                        }
                    } else if ((-1520103925 * entity.anInt10126) < i_12_) {
                        entity.anInt10126 += class350.anInt3752 * 1936228275;
                        if ((entity.anInt10126 * -1520103925) > i_12_)
                            entity.anInt10126 = i_12_ * 121933219;
                    } else if ((entity.anInt10126 * -1520103925) > 0) {
                        entity.anInt10126 -= 1936228275 * class350.anInt3752;
                        if ((entity.anInt10126 * -1520103925) < 0)
                            entity.anInt10126 = 0;
                    }
                    i_12_ = (-1520103925 * entity.anInt10126 >> 9);
                    if (i_12_ < 1)
                        i_12_ = 1;
                }
                Class431.anInt6504 = 0;
                if (i_9_ != i_7_ || i_10_ != i_8_) {
                    if (i_7_ < i_9_) {
                        class217.x += (float) i_12_;
                        Class431.anInt6504 = 1633205647 * (Class431.anInt6504 * 236175727 | 0x4);
                        if (class217.x > (float) i_9_)
                            class217.x = (float) i_9_;
                    } else if (i_7_ > i_9_) {
                        class217.x -= (float) i_12_;
                        Class431.anInt6504 = ((Class431.anInt6504 * 236175727 | 0x8) * 1633205647);
                        if (class217.x < (float) i_9_)
                            class217.x = (float) i_9_;
                    }
                    if (i_8_ < i_10_) {
                        class217.z += (float) i_12_;
                        Class431.anInt6504 = 1633205647 * (236175727 * Class431.anInt6504 | 0x1);
                        if (class217.z > (float) i_10_)
                            class217.z = (float) i_10_;
                    } else if (i_8_ > i_10_) {
                        class217.z -= (float) i_12_;
                        Class431.anInt6504 = 1633205647 * (Class431.anInt6504 * 236175727 | 0x2);
                        if (class217.z < (float) i_10_)
                            class217.z = (float) i_10_;
                    }
                    entity.method4340(class217);
                    if (i_12_ >= 32)
                        Region.anInt3565 = (Class282.aClass282_6541.aByte6542 * -2059464589);
                    else
                        Region.anInt3565 = -2059464589 * i_11_;
                } else
                    Region.anInt3565 = Class282.aClass282_6543.aByte6542 * -2059464589;
                if ((int) class217.x == i_9_ && (int) class217.z == i_10_) {
                    entity.anInt10120 -= -1013322787;
                    if (1888275831 * entity.anInt10125 > 0)
                        entity.anInt10125 -= -1479140281;
                }
                class217.cache();
            }
        }
    }

    static void updateFPSCounter(int i, int i_21_, IComponentDefinition componentDefinition, int i_22_) {
        try {
            int i_23_ = componentDefinition.aspectWidth * -2093041337 + i;
            int i_24_ = 15 + i_21_;
            if (GameClient.viewingFPS) {
                int color = -256;
                if (914379507 * GameClient.fps < 20)
                    color = -65536;
                aClass264_3673.method2474(new StringBuilder().append("Fps:").append(914379507 * GameClient.fps).toString(), i_23_, i_24_, color, -1);
                i_24_ += 15;
                Runtime runtime = Runtime.getRuntime();
                long runtimeMemmory = runtime.totalMemory() / 1024L;
                long l_26_ = runtimeMemmory - runtime.freeMemory() / 1024L;
                int i_27_ = -256;
                if (l_26_ > 262144L)
                    i_27_ = -65536;
                aClass264_3673.method2474(new StringBuilder().append("Mem:").append(l_26_).append("/").append(runtimeMemmory).append("k").toString(), i_23_, i_24_, i_27_, -1);
                i_24_ += 15;
                long l_28_ = ConnectionType.gameConnection.aClass124_340.method1384(1026179047);
                String string = "N/A";
                if (-1L != l_28_) {
                    string = new StringBuilder().append(l_28_).append("ms").toString();
                    if (l_28_ > 500L)
                        string = new StringBuilder().append(ColorUtils.htmlToHex(16711680)).append(string).append(ColorUtils.htmlToHex(16776960)).toString();
                }
                aClass264_3673.method2474(new StringBuilder().append("Game: In:").append(-1705791507 * ConnectionType.gameConnection.anInt343).append("B/s ").append("Out:").append(ConnectionType.gameConnection.anInt327 * 1114720205).append("B/s ").append("Ping:").append(string).toString(), i_23_, i_24_, -256, -1);
                i_24_ += 15;
                long l_29_ = ConnectionType.lobbyConnection.aClass124_340.method1384(529918549);
                String string_30_ = "N/A";
                if (l_29_ != -1L) {
                    string_30_ = new StringBuilder().append(l_29_).append("ms").toString();
                    if (l_29_ > 500L)
                        string_30_ = new StringBuilder().append(ColorUtils.htmlToHex(16711680)).append(string_30_).append(ColorUtils.htmlToHex(16776960)).toString();
                }
                aClass264_3673.method2474(new StringBuilder().append("Lobby: In:").append(ConnectionType.lobbyConnection.anInt343 * -1705791507).append("B/s ").append("Out:").append(1114720205 * ConnectionType.lobbyConnection.anInt327).append("B/s ").append("Ping:").append(string_30_).toString(), i_23_, i_24_, -256, -1);
                i_24_ += 15;
                int i_31_ = GameClient.activeGraphicsToolkit.za() / 1024;
                aClass264_3673.method2474(new StringBuilder().append("Offheap:").append(i_31_).append("k").toString(), i_23_, i_24_, (i_31_ > 65536 ? -65536 : -256), -1);
                i_24_ += 15;
                int i_32_ = 0;
                int i_33_ = 0;
                int i_34_ = 0;
                for (int i_35_ = 0; i_35_ < OverlayDefinition.aJs5IndexSystemArray4072.length; i_35_++) {
                    if (OverlayDefinition.aJs5IndexSystemArray4072[i_35_] == null) {
                        if (i_22_ == -1583970959)
                            return;
                    } else {
                        i_32_ += OverlayDefinition.aJs5IndexSystemArray4072[i_35_].method2279();
                        i_33_ += OverlayDefinition.aJs5IndexSystemArray4072[i_35_].method2274();
                        i_34_ += OverlayDefinition.aJs5IndexSystemArray4072[i_35_].method2275();
                    }
                }
                int i_36_ = i_34_ * 100 / i_32_;
                int i_37_ = 10000 * i_33_ / i_32_;
                String string_38_ = new StringBuilder().append("Cache:").append(StringUtils.method3685((long) i_37_, 2, true, GameLanguage.english)).append("% (").append(i_36_).append("%)").toString();
                FontToolkit.fontToolkit.method2474(string_38_, i_23_, i_24_, -256, -1);
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, "Error updating FPS counter");
        }
    }

    static void method4143(Js5FileSystem class243, int i, int i_39_, int i_40_, boolean bool, long l, int i_41_, int i_42_) {
        Class79.anInt734 = -1262101671;
        Class79.JS5_MUSIC = class243;
        Class79.anInt745 = i * -407545223;
        Class79.anInt746 = i_39_ * -956029523;
        Class79.aClass298_Sub19_Sub1_748 = null;
        Class79.anInt739 = -2102749749 * i_40_;
        Class8.aBoolean114 = bool;
        Class298_Sub24_Sub1.anInt9276 = 1446879088;
        Class515.aLong6233 = l * 7092526387081397629L;
        Class401.anInt6559 = -420794947 * i_41_;
    }

    static void method6047(GraphicsToolkit graphicsToolkit, MaterialRawLoader materialRawLoader, int startX, int startY, int endX, int endY) {
        if (Class301_Sub1.anInt7624 * -1289394455 < 100) {
            GameLanguage.method5761(graphicsToolkit, materialRawLoader, (byte) -95);
        }
        graphicsToolkit.setClip(startX, startY, startX + endX, endY + startY);
        if (Class301_Sub1.anInt7624 * -1289394455 < 100) {
            int i_9_ = 20;
            int i_10_ = startX + endX / 2;
            int i_11_ = endY / 2 + startY - 18 - i_9_;
            graphicsToolkit.drawFilledRectangle(startX, startY, endX, endY, -16777216, 0);
            graphicsToolkit.drawRectangle(i_10_ - 152, i_11_, 304, 34, GameClient.aColorArray8701[745003679 * GameClient.anInt8971].getRGB(), 0);
            graphicsToolkit.drawFilledRectangle(i_10_ - 150, i_11_ + 2, Class301_Sub1.anInt7624 * 426783931, 30, GameClient.aColorArray8689[745003679 * GameClient.anInt8971].getRGB(), 0);
            b12_full_monochrome.drawTextCentered(Tradution.loading.translate(GameLanguage.CURRENT_LANGUAGE), i_10_, i_11_ + i_9_, GameClient.aColorArray8691[GameClient.anInt8971 * 745003679].getRGB(), -1);
        } else {
            int i_12_ = (1196508279 * Class82_Sub14.anInt6875 - (int) (endX / WorldMapHandler.aFloat3233));
            int i_13_ = (1882038855 * Class376.anInt4090 + (int) (endY / WorldMapHandler.aFloat3233));
            int i_14_ = ((int) (endX / WorldMapHandler.aFloat3233) + Class82_Sub14.anInt6875 * 1196508279);
            int i_15_ = (Class376.anInt4090 * 1882038855 - (int) (endY / WorldMapHandler.aFloat3233));
            CS2CallStackEntry.anInt5232 = ((1196508279 * Class82_Sub14.anInt6875 - (int) (endX / WorldMapHandler.aFloat3233)) * 1478623195);
            Class261.anInt2825 = ((Class376.anInt4090 * 1882038855 - (int) (endY / WorldMapHandler.aFloat3233)) * -1415233655);
            Class301_Sub1.anInt7625 = ((int) (2 * endX / WorldMapHandler.aFloat3233) * -830037779);
            Class413.anInt6590 = ((int) (endY * 2 / WorldMapHandler.aFloat3233) * 827686411);
            WorldMapHandler.method3709(i_12_ + WorldMapHandler.mapX, i_13_ + WorldMapHandler.mapY, WorldMapHandler.mapX + i_14_, i_15_ + WorldMapHandler.mapY, startX, startY, endX + startX, 1 + (startY + endY));
            WorldMapHandler.method3698(graphicsToolkit);
            Class453 class453 = WorldMapHandler.method3702(graphicsToolkit);
            method2526(graphicsToolkit, class453, 0, 0, 1029726200);
            if (Class137_Sub1.anInt6991 * -1983068885 > 0) {
                Class88.anInt810 -= -1077128129;
                if (Class88.anInt810 * -1581933633 == 0) {
                    Class137_Sub1.anInt6991 -= -63057533;
                    Class88.anInt810 = -67726100;
                }
            }
            if (GameClient.viewingFPS) {
                int i_16_ = startX + endX - 5;
                int i_17_ = endY + startY - 8;
                aClass264_3673.method2474(new StringBuilder().append("Fps:").append(914379507 * GameShell.fps).toString(), i_16_, i_17_, 16776960, -1);
                i_17_ -= 15;
                Runtime runtime = Runtime.getRuntime();
                int usedMemory = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
                int color = 16776960;
                if (usedMemory > 65536) {
                    color = 16711680;
                }
                aClass264_3673.method2474(new StringBuilder().append("Mem:").append(usedMemory).append("k").toString(), i_16_, i_17_, color, -1);
            }
        }
    }

    public static void method2817() {
        for (Class298_Sub49 class298_sub49 = ((Class298_Sub49) Class423.aClass437_5354.method5816()); null != class298_sub49; class298_sub49 = ((Class298_Sub49) Class423.aClass437_5354.method5815())) {
            if (!class298_sub49.aBoolean7594)
                Class285.method2710((class298_sub49.anInt7589) * 1566028323);
            else
                class298_sub49.aBoolean7594 = false;
        }
    }

    public static void method5743(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
        method967(i_5_, i_6_, 100);
        Class300.aClass303_3215 = new Class303(i, i_1_ << 9, i_2_ << 9, i_3_ << 8, 8 * i_4_);
    }

    public static boolean method6152(int i) {
        return (i & -i) == i;
    }

    static final int method302(Class513 class513) {
        if (class513 == null)
            return 12;
        switch (-1062992263 * class513.anInt6638) {
            case 3:
                return 20;
            default:
                return 12;
        }
    }

    public static void loadFontIDs(Js5FileSystem spritesFileSystem) {
        Class74.anInt692 = spritesFileSystem.getArchiveIdByName("hitbar_default") * 2112064137;
        Class74.anInt694 = spritesFileSystem.getArchiveIdByName("timerbar_default") * 1617597269;
        Class143.anInt1558 = spritesFileSystem.getArchiveIdByName("headicons_pk") * 1432033185;
        Class400.anInt5223 = spritesFileSystem.getArchiveIdByName("headicons_prayer") * -1214334111;
        Class74.anInt693 = spritesFileSystem.getArchiveIdByName("hint_headicons") * 250641705;
        Class74.anInt696 = spritesFileSystem.getArchiveIdByName("hint_mapmarkers") * 1711228595;
        anInt7398 = spritesFileSystem.getArchiveIdByName("mapflag") * 1542214111;
        anInt6842 = spritesFileSystem.getArchiveIdByName("cross") * -626988461;
        Class494.anInt6092 = spritesFileSystem.getArchiveIdByName("mapdots") * -1409898789;
        Class74.anInt697 = spritesFileSystem.getArchiveIdByName("name_icons") * 1606490933;
        Class257.anInt2802 = (spritesFileSystem.getArchiveIdByName("floorshadows") * -1276802557);
        anInt6667 = spritesFileSystem.getArchiveIdByName("compass") * 1540144067;
        Class128_Sub1.anInt8557 = spritesFileSystem.getArchiveIdByName("otherlevel") * -233695275;
        Class298_Sub24_Sub1.anInt9281 = spritesFileSystem.getArchiveIdByName("hint_mapedge") * 902133497;
    }

    static boolean method694(int i) {
        if (Class436.aMenuOption_5477 == null)
            return false;
        if ((Class436.aMenuOption_5477.componentID) * 946432351 >= 2000)
            Class436.aMenuOption_5477.componentID -= -853837264;
        return 1007 == 946432351 * Class436.aMenuOption_5477.componentID;
    }

    public static Class134 method695(Buffer buffer, int i) {
        int i_6_ = buffer.readUByte();
        Class139 class139 = (Class139.method6176()[buffer.readUByte()]);
        Class133 class133 = (Class133.method1255()[buffer.readUByte()]);
        int i_7_ = buffer.readShort();
        int i_8_ = buffer.readShort();
        int i_9_ = buffer.readUShort();
        int i_10_ = buffer.readUShort();
        int i_11_ = buffer.readInt();
        int i_12_ = buffer.readInt();
        int i_13_ = buffer.readInt();
        boolean bool = buffer.readUByte() == 1;
        return new Class134(i_6_, class139, class133, i_7_, i_8_, i_9_, i_10_, i_11_, i_12_, i_13_, bool);
    }

    public static int method692(int i, int i_2_) {
        int i_4_ = i_2_ >>> 24;
        int i_5_ = 255 - i_4_;
        i_2_ = ((i_2_ & 0xff00ff) * i_4_ & ~0xff00ff | i_4_ * (i_2_ & 0xff00) & 0xff0000) >>> 8;
        return i_2_ + ((i_5_ * (i & 0xff00ff) & ~0xff00ff | (i & 0xff00) * i_5_ & 0xff0000) >>> 8);
    }

    public static int method693(String string) {
        return string.length() + 1;
    }

    public static void method1146(Js5FileSystem fileSystem) {
        Class287.aClass243_3100 = fileSystem;
    }

    static String method1149(int i, GameLanguage language) {
        if (i < 100000)
            return new StringBuilder().append("<col=ffff00>").append(i).append("</col>").toString();
        if (i < 10000000)
            return new StringBuilder().append("<col=ffffff>").append(i / 1000).append(Tradution.K_FOR_KILOBYTES.translate(language)).append("</col>").toString();
        return new StringBuilder().append("<col=00ff80>").append(i / 1000000).append(Tradution.M_FOR_MEGABYTES.translate(language)).append("</col>").toString();
    }

    public static final void method1150(boolean bool, byte i) {
        try {
            OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.CLOSE_INTERFACE_PACKET, ConnectionType.gameConnection.encryptor);
            ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
            for (Widget class298_sub51 = ((Widget) GameClient.linkedList.method5816()); null != class298_sub51; class298_sub51 = ((Widget) GameClient.linkedList.method5815())) {
                if (!class298_sub51.isNextAvailable()) {
                    class298_sub51 = ((Widget) GameClient.linkedList.method5816());
                    if (class298_sub51 == null) {
                        if (i <= 0) {
                            /* empty */
                        }
                        break;
                    }
                }
                if (0 == class298_sub51.clipped * 27137839)
                    Widget.closeInterface(class298_sub51, true, bool);
            }
            if (GameClient.loadingScreen != null) {
                updateComponentTick(GameClient.loadingScreen);
                GameClient.loadingScreen = null;
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ek.lr(").append(')').toString());
        }
    }

    static void method1153(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
        try {
            int i_13_ = 0;
            int i_14_ = i_10_;
            int i_15_ = i_9_ * i_9_;
            int i_16_ = i_10_ * i_10_;
            int i_17_ = i_16_ << 1;
            int i_18_ = i_15_ << 1;
            int i_19_ = i_10_ << 1;
            int i_20_ = i_17_ + (1 - i_19_) * i_15_;
            int i_21_ = i_16_ - (i_19_ - 1) * i_18_;
            int i_22_ = i_15_ << 2;
            int i_23_ = i_16_ << 2;
            int i_24_ = i_17_ * (3 + (i_13_ << 1));
            int i_25_ = ((i_14_ << 1) - 3) * i_18_;
            int i_26_ = (1 + i_13_) * i_23_;
            int i_27_ = i_22_ * (i_14_ - 1);
            Class82_Sub22.method940((Class372_Sub1_Sub1.anIntArrayArray4047[i_8_]), i - i_9_, i_9_ + i, i_11_);
            while (i_14_ > 0) {
                if (i_20_ < 0) {
                    while (i_20_ < 0) {
                        i_20_ += i_24_;
                        i_21_ += i_26_;
                        i_24_ += i_23_;
                        i_26_ += i_23_;
                        i_13_++;
                    }
                }
                if (i_21_ < 0) {
                    i_20_ += i_24_;
                    i_21_ += i_26_;
                    i_24_ += i_23_;
                    i_26_ += i_23_;
                    i_13_++;
                }
                i_20_ += -i_27_;
                i_21_ += -i_25_;
                i_25_ -= i_22_;
                i_27_ -= i_22_;
                i_14_--;
                int i_28_ = i_8_ - i_14_;
                int i_29_ = i_8_ + i_14_;
                int i_30_ = i_13_ + i;
                int i_31_ = i - i_13_;
                Class82_Sub22.method940((Class372_Sub1_Sub1.anIntArrayArray4047[i_28_]), i_31_, i_30_, i_11_);
                Class82_Sub22.method940((Class372_Sub1_Sub1.anIntArrayArray4047[i_29_]), i_31_, i_30_, i_11_);
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ek.at(").append(')').toString());
        }
    }

    static final void method1320(Entity class365_sub1_sub1_sub2, Entity class365_sub1_sub1_sub2_10_, int i, int i_11_, int i_12_) {
        int i_18_ = class365_sub1_sub1_sub2_10_.method4427((byte) 1);
        if (i_18_ != -1) {
            Object object = null;
            SpriteToolkit class57 = (SpriteToolkit) GameClient.aClass348_8697.get((long) i_18_);
            if (null == class57) {
                Sprite[] class89s = Sprite.load(Js5List.JS5_SPRITES, i_18_, 0);
                if (null == class89s)
                    return;
                class57 = GameClient.activeGraphicsToolkit.createSpriteToolkit(class89s[0], true);
                GameClient.aClass348_8697.put(class57, (long) i_18_);
            }
            Vector3f class217 = class365_sub1_sub1_sub2.getWorldTransform().trans;
            method1400(class365_sub1_sub1_sub2.plane, (int) class217.x, (int) class217.z, class365_sub1_sub1_sub2.getSize() * 256, 0, false);
            int i_19_ = (int) ((float) i_11_ + GameClient.translated3DCoord[0] - 18.0F);
            int i_20_ = (int) ((float) i_12_ + GameClient.translated3DCoord[1] - 16.0F - 54.0F);
            i_19_ += i / 4 * 18;
            i_20_ += 18 * (i % 4);
            class57.draw(i_19_, i_20_);
            if (class365_sub1_sub1_sub2 == class365_sub1_sub1_sub2_10_)
                GameClient.activeGraphicsToolkit.drawRectangle(i_19_ - 1, i_20_ - 1, 18, 18, -256);
            Class302_Sub5 class302_sub5 = Class229.method2122((byte) 60);
            class302_sub5.aClass365_Sub1_Sub1_Sub2_7660 = class365_sub1_sub1_sub2_10_;
            class302_sub5.anInt7659 = i_19_ * 514092373;
            class302_sub5.anInt7663 = i_20_ * -783084201;
            class302_sub5.anInt7664 = 1997526347 * (i_19_ + 16);
            class302_sub5.anInt7665 = 1675098759 * (i_20_ + 16);
            GameClient.aClass442_8781.method5870(class302_sub5, -69122600);
        }
    }

    static final void method6083(int i, int i_5_, int i_6_) {
        String string = new StringBuilder().append("tele ").append(i).append(Class26.comma).append(i_5_ >> 6).append(Class26.comma).append(i_6_ >> 6).append(Class26.comma).append(i_5_ & 0x3F).append(Class26.comma).append(i_6_ & 0x3f).toString();
        Class419.executeCommand(string, true, false);
    }

    public static void method2371() {
        method4300();
        aClass374_Sub1_4125.method4626(2074664377);
        aClass374_Sub2_4121.method4626(2003457775);
        if (-1625219821 * GameClient.maximumHeldKeys > 0) {
            OutgoingPacketBuffer packet = Class18.method359(OutgoingPacket.KEY_TYPED, ConnectionType.gameConnection.encryptor);
            packet.payload.writeShort(2089055308 * GameClient.maximumHeldKeys);
            for (int index = 0; index < GameClient.maximumHeldKeys * -1625219821; index++) {
                KeyRecord record = GameClient.lastHeldKeys[index];
                long time = (record.getTime() - -4339417020449565913L * sentDifferenciator);
                if (time > 16777215L)
                    time = 16777215L;
                sentDifferenciator = (record.getTime() * -7881601697932874601L);
                packet.payload.writeByte(record.getKeyCode());
                packet.payload.putTriByte((int) time);
            }
            ConnectionType.gameConnection.sendFrame(packet);
        }
        if (anInt4120 * -2116412357 > 0)
            anInt4120 -= -1604952845;
        if (GameClient.aBoolean8763 && anInt4120 * -2116412357 <= 0) {
            anInt4120 = -2034285828;
            GameClient.aBoolean8763 = false;
            OutgoingPacketBuffer packet = Class18.method359(OutgoingPacket.MOVE_CAMERA_PACKET, ConnectionType.gameConnection.encryptor);
            packet.payload.writeShort128((int) GameClient.cameraYAngle >> 3);
            packet.payload.writeShortLE((int) GameClient.cameraXAngle >> 3);
            ConnectionType.gameConnection.sendFrame(packet);
        }
        if (aBoolean4122 != aBoolean8385) {
            aBoolean4122 = aBoolean8385;
            OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.aClass198_2063, ConnectionType.gameConnection.encryptor);
            outgoingPacketBuffer.payload.writeByte(aBoolean8385 ? 1 : 0);
            ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
        }
        if (!GameClient.sentPreferences) {
            OutgoingPacketBuffer packet = Class18.method359(OutgoingPacket.SEND_SETTINGS, ConnectionType.gameConnection.encryptor);
            packet.payload.writeByte(0);
            int i_10_ = (385051775 * packet.payload.offset);
            Buffer class298_sub53 = SettingsManager.settingsManager.encode();
            packet.payload.writeBytes(class298_sub53.buffer, 0, 385051775 * class298_sub53.offset);
            packet.payload.method3649((packet.payload.offset * 385051775) - i_10_);
            ConnectionType.gameConnection.sendFrame(packet);
            GameClient.sentPreferences = true;
        }
    }

    static void method2372(GraphicsToolkit toolkit, int i, int i_11_, int i_12_, int i_13_, int i_14_) {
        if ((null == Js5CacheWrite.aClass57_6062 || null == ClassNotAnim.aClass57_6123 || Class367.aClass57_4001 == null) && Js5List.JS5_SPRITES.exists(Class162.anInt1680 * 1049272911) && Js5List.JS5_SPRITES.exists(Class361.anInt3914 * -745532315) && Js5List.JS5_SPRITES.exists((-684155443 * Class260.anInt2820))) {
            Sprite class89 = Sprite.loadFirst(Js5List.JS5_SPRITES, -745532315 * Class361.anInt3914, 0);
            ClassNotAnim.aClass57_6123 = toolkit.createSpriteToolkit(class89, true);
            class89.flipHorizontally();
            Class82_Sub8.aClass57_6855 = toolkit.createSpriteToolkit(class89, true);
            Js5CacheWrite.aClass57_6062 = (toolkit.createSpriteToolkit(Sprite.loadFirst(Js5List.JS5_SPRITES, 1049272911 * Class162.anInt1680, 0), true));
            Sprite sprite = Sprite.loadFirst(Js5List.JS5_SPRITES, Class260.anInt2820 * -684155443, 0);
            Class367.aClass57_4001 = toolkit.createSpriteToolkit(sprite, true);
            sprite.flipHorizontally();
            OverlayDefinition.aClass57_4070 = toolkit.createSpriteToolkit(sprite, true);
        }
        if (null != Js5CacheWrite.aClass57_6062 && ClassNotAnim.aClass57_6123 != null && Class367.aClass57_4001 != null) {
            int i_17_ = ((i_12_ - Class367.aClass57_4001.getWidth() * 2) / Js5CacheWrite.aClass57_6062.getWidth());
            for (int i_18_ = 0; i_18_ < i_17_; i_18_++)
                Js5CacheWrite.aClass57_6062.draw((i + Class367.aClass57_4001.getWidth() + i_18_ * Js5CacheWrite.aClass57_6062.getWidth()), i_11_ + i_13_ - Js5CacheWrite.aClass57_6062.getHeight());
            int i_19_ = ((i_13_ - i_14_ - Class367.aClass57_4001.getHeight()) / ClassNotAnim.aClass57_6123.getHeight());
            for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
                ClassNotAnim.aClass57_6123.draw(i, (i_14_ + i_11_ + i_20_ * ClassNotAnim.aClass57_6123.getHeight()));
                Class82_Sub8.aClass57_6855.draw(i_12_ + i - Class82_Sub8.aClass57_6855.getWidth(), (i_14_ + i_11_ + i_20_ * ClassNotAnim.aClass57_6123.getHeight()));
            }
            Class367.aClass57_4001.draw(i, (i_13_ + i_11_ - Class367.aClass57_4001.getHeight()));
            OverlayDefinition.aClass57_4070.draw(i_12_ + i - Class367.aClass57_4001.getWidth(), i_11_ + i_13_ - Class367.aClass57_4001.getHeight());
        }
    }

    static void method2376(int i) {
        for (MenuOption menuOption = ((MenuOption) Class436.aClass453_5480.method5939()); menuOption != null; menuOption = ((MenuOption) Class436.aClass453_5480.method5944())) {
            if (Class214.method1993(946432351 * (menuOption.componentID), 1804726647))
                Class285.method2714(menuOption, (byte) 5);
        }
    }

    public static boolean method2375(char c) {
        if (c >= ' ' && c <= '~')
            return true;
        if (c >= '\u00a0' && c <= '\u00ff')
            return true;
        return c == '\u20ac' || '\u0152' == c || c == '\u2014' || c == '\u0153' || c == '\u0178';
    }

    public static String method2368(int i) {
        return new StringBuilder().append("<img=").append(i).append(">").toString();
    }

    public static int method2366(MenuOption menuOption) {
        if (GameClient.menuOpen)
            return 6;
        if (null == menuOption)
            return 0;
        int i_5_ = (946432351 * menuOption.componentID);
        if (Class214.method1993(i_5_, 1867074090))
            return 1;
        if (method4920(i_5_, (short) 300))
            return 2;
        if (method4907(i_5_))
            return 3;
        if (Class302.method3716(i_5_))
            return 4;
        if (method6189(i_5_))
            return 7;
        if (16 == i_5_)
            return 8;
        return 5;
    }

    public static void method2365() {
        if (Class300.aClass284_3212 != null)
            Class300.aClass284_3212.method2680();
        if (Minimap.aClass284_68 != null)
            Minimap.aClass284_68.method2680();
    }

    static final void decodePlayerUpdate(RsBitsBuffer stream, int i) {
        Class10.anInt139 = 0;
        Class365_Sub1_Sub5_Sub2.method4536(stream);
        decodePlayersMasks(stream);
        if (stream.offset * 385051775 != i)
            throw new RuntimeException(new StringBuilder().append(385051775 * (stream.offset)).append(" ").append(i).toString());
    }

    public static void method530(int i) {
        OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.aClass198_2004, ConnectionType.gameConnection.encryptor);
        outgoingPacketBuffer.payload.writeInt(-1);
        ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
        ItemContainerDefinition.aClass95_9602 = new Class95(Js5List.JS5_MUSIC, i);
    }

    static final void method531() {
        Class388.scriptsRan -= -1866863069;
    }

    static final int method6377(int i, int i_0_, int i_1_, int i_2_) {
        int i_3_ = i / i_1_;
        int i_4_ = i & i_1_ - 1;
        int i_5_ = i_0_ / i_1_;
        int i_6_ = i_0_ & i_1_ - 1;
        int i_7_ = Class264_Sub2.method2508(i_3_, i_5_, (short) -9483);
        int i_8_ = Class264_Sub2.method2508(1 + i_3_, i_5_, (short) -29113);
        int i_9_ = Class264_Sub2.method2508(i_3_, i_5_ + 1, (short) -24319);
        int i_10_ = Class264_Sub2.method2508(i_3_ + 1, 1 + i_5_, (short) -3168);
        int i_11_ = Class298_Sub40_Sub12.method3516(i_7_, i_8_, i_4_, i_1_, (byte) 105);
        int i_12_ = Class298_Sub40_Sub12.method3516(i_9_, i_10_, i_4_, i_1_, (byte) 123);
        return Class298_Sub40_Sub12.method3516(i_11_, i_12_, i_6_, i_1_, (byte) 78);
    }

    public static void drawCornerLoadingBox(String string, boolean bool, GraphicsToolkit graphicsToolkit, FontToolkit fontToolkit, RSFontMetrics rsFontMetrics) {
        try {
            boolean bool_5_ = (!Class372_Sub3.aBoolean7730 || Class14.isFullyLoaded());
            if (bool_5_) {
                if (Class372_Sub3.aBoolean7730 && bool_5_) {
                    rsFontMetrics = Class14.aClass505_176;
                    fontToolkit = graphicsToolkit.createFontToolkit(rsFontMetrics, Class14.aClass89Array169, true);
                    int i_6_ = rsFontMetrics.method6259(string, 250, null);
                    int i_7_ = rsFontMetrics.method6260(string, 250, -2028004825 * rsFontMetrics.anInt6200, null);
                    int i_8_ = aClass89_8437.width;
                    int i_9_ = 4 + i_8_;
                    i_6_ += 2 * i_9_;
                    i_7_ += i_9_ * 2;
                    if (i_6_ < 646794549 * Class14.anInt172)
                        i_6_ = 646794549 * Class14.anInt172;
                    if (i_7_ < Class14.anInt175 * 1004672961)
                        i_7_ = 1004672961 * Class14.anInt175;
                    int i_10_ = (Class14.aClass139_171.method1545(i_6_, (GameClient.anInt8794 * 775068819), -1808907629) + -994816289 * Class14.anInt170);
                    int i_11_ = (Class14.aClass133_177.method1482(i_7_, (GameClient.anInt8803 * -791746413), -750031668) + -277668631 * Class14.anInt173);
                    graphicsToolkit.createSpriteToolkit(aClass89_4142, false).method694(i_10_ + aClass89_6932.width, aClass89_6932.height + i_11_, i_6_ - aClass89_6932.width * 2, i_7_ - 2 * aClass89_6932.height, 1, 0, 0);
                    graphicsToolkit.createSpriteToolkit(aClass89_6932, true).draw(i_10_, i_11_);
                    aClass89_6932.flipHorizontally();
                    graphicsToolkit.createSpriteToolkit(aClass89_6932, true).draw(i_6_ + i_10_ - i_8_, i_11_);
                    aClass89_6932.flipVertically();
                    graphicsToolkit.createSpriteToolkit(aClass89_6932, true).draw(i_6_ + i_10_ - i_8_, i_11_ + i_7_ - i_8_);
                    aClass89_6932.flipHorizontally();
                    graphicsToolkit.createSpriteToolkit(aClass89_6932, true).draw(i_10_, i_7_ + i_11_ - i_8_);
                    aClass89_6932.flipVertically();
                    graphicsToolkit.createSpriteToolkit(aClass89_8437, true).drawRepeat(i_10_, i_11_ + aClass89_6932.height, i_8_, i_7_ - 2 * aClass89_6932.height);
                    aClass89_8437.rotateClockwise();
                    graphicsToolkit.createSpriteToolkit(aClass89_8437, true).drawRepeat(aClass89_6932.width + i_10_, i_11_, i_6_ - 2 * aClass89_6932.width, i_8_);
                    aClass89_8437.rotateClockwise();
                    graphicsToolkit.createSpriteToolkit(aClass89_8437, true).drawRepeat(i_10_ + i_6_ - i_8_, i_11_ + aClass89_6932.height, i_8_, i_7_ - 2 * aClass89_6932.height);
                    aClass89_8437.rotateClockwise();
                    graphicsToolkit.createSpriteToolkit(aClass89_8437, true).drawRepeat(i_10_ + aClass89_6932.width, i_11_ + i_7_ - i_8_, i_6_ - 2 * aClass89_6932.width, i_8_);
                    aClass89_8437.rotateClockwise();
                    fontToolkit.method2475(string, i_9_ + i_10_, i_11_ + i_9_, i_6_ - i_9_ * 2, i_7_ - 2 * i_9_, (-617134757 * Class428.anInt6623 | ~0xffffff), -1, 1, 1, 0, null, null, null, 0, 0);
                    method2112(i_10_, i_11_, i_6_, i_7_);
                } else {
                    int i_12_ = rsFontMetrics.method6259(string, 250, null);
                    int i_13_ = (rsFontMetrics.method6262(string, 250, null) * 13);
                    int i_14_ = 4;
                    int i_15_ = 6 + i_14_;
                    int i_16_ = 6 + i_14_;
                    graphicsToolkit.drawFilledRectangle(i_15_ - i_14_, i_16_ - i_14_, i_14_ + (i_12_ + i_14_), i_13_ + i_14_ + i_14_, -16777216, 0);
                    graphicsToolkit.drawRectangle(i_15_ - i_14_, i_16_ - i_14_, i_14_ + (i_12_ + i_14_), i_13_ + i_14_ + i_14_, -1, 0);
                    fontToolkit.method2475(string, i_15_, i_16_, i_12_, i_13_, -1, -1, 1, 1, 0, null, null, null, 0, 0);
                    method2112(i_15_ - i_14_, i_16_ - i_14_, i_14_ + i_12_ + i_14_, i_13_ + i_14_ + i_14_);
                }
                if (bool) {
                    try {
                        graphicsToolkit.renderFrame();
                    } catch (GraphicsFrameException exception_sub1) {
                        /* empty */
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("fq.b(").append(')').toString());
        }
    }

    static final void decodePlayersMasks(RsBitsBuffer stream) {
            for (int i_7_ = 0; i_7_ < -1281683379 * Class10.anInt139; i_7_++) {
                int playerIndex = Class10.anIntArray140[i_7_];
                Player player = GameClient.entities[playerIndex];
                int mask = stream.readUByte();
                if ((mask & 0x2) != 0)
                    mask += stream.readUByte() << 8;
                if ((mask & 0x400) != 0)
                    mask += stream.readUByte() << 16;
                Class297.decodePlayerMasks(stream, playerIndex, player, mask);
            }
    }

    static void method889(Matrix4f viewMatrix, boolean bool, float f, float f_0_, float f_1_, float f_2_, int width, int height) {
        int zFar = GameClient.myRegion.getZFar();
        int zNear = GameClient.myRegion.getZNear();
        viewMatrix.setProjection(f, f_0_, f_1_, f_2_, (float) zNear, (float) zFar, (float) width, (float) height);
    }

    static void method1226(int i, int i_61_) {
            if (Js5List.JS5_DEFAULTS.aBoolean4038 || (Class436.menuOptionCount * -278777595 != 1 && (!aBoolean5196 || 2 != -278777595 * Class436.menuOptionCount || !(Class436.aMenuOption_5477.target.equals(Tradution.FACE_HERE.translate(GameLanguage.CURRENT_LANGUAGE)))))) {
                RSFontMetrics fontMetrics = RSFontMetrics.getDefaultFont();
                int i_63_ = (fontMetrics.method6264(Tradution.CHOOSE_OPTION.translate(GameLanguage.CURRENT_LANGUAGE)));
                int i_64_;
                if (!Class436.aBoolean5471) {
                    for (MenuOption menuOption = ((MenuOption) Class436.aClass453_5480.method5939()); null != menuOption; menuOption = ((MenuOption) Class436.aClass453_5480.method5944())) {
                        int i_65_ = Class127_Sub1.method1425(menuOption, fontMetrics, 692106883);
                        if (i_65_ > i_63_)
                            i_63_ = i_65_;
                    }
                    i_63_ += 8;
                    i_64_ = (-411680299 * Class436.anInt5467 * (Class436.menuOptionCount * -278777595)) + 21;
                    Class448.anInt5619 = ((Class436.anInt5467 * -411680299 * (Class436.menuOptionCount * -278777595)) + (Class436.aBoolean5496 ? 26 : 22)) * -893561885;
                } else {
                    for (MenuOptionNode menuOptionNode = ((MenuOptionNode) Class436.aClass461_5482.first()); null != menuOptionNode; menuOptionNode = ((MenuOptionNode) Class436.aClass461_5482.next())) {
                        int i_66_;
                        if (1 == (menuOptionNode.getTotalMenus) * -628325139)
                            i_66_ = (Class127_Sub1.method1425(((MenuOption) (menuOptionNode.circularDoubleLinkedList.DELIMETER.next_cache)), fontMetrics, 692106883));
                        else
                            i_66_ = Class62.method728(menuOptionNode, fontMetrics);
                        if (i_66_ > i_63_)
                            i_63_ = i_66_;
                    }
                    i_63_ += 8;
                    i_64_ = (Class436.anInt5479 * 1592446965 * (Class436.anInt5467 * -411680299)) + 21;
                    Class448.anInt5619 = -893561885 * ((Class436.aBoolean5496 ? 26 : 22) + (Class436.anInt5467 * -411680299 * (Class436.anInt5479 * 1592446965)));
                }
                i_63_ += 10;
                int i_67_ = i - i_63_ / 2;
                if (i_63_ + i_67_ > GameShell.canvasWidth * -2110394505)
                    i_67_ = -2110394505 * GameShell.canvasWidth - i_63_;
                if (i_67_ < 0)
                    i_67_ = 0;
                int i_68_ = i_61_;
                if (i_68_ + i_64_ > -1111710645 * GameShell.canvasHeight)
                    i_68_ = GameShell.canvasHeight * -1111710645 - i_64_;
                if (i_68_ < 0)
                    i_68_ = 0;
                Class88.anInt806 = 671566195 * i_67_;
                TileMessage.anInt7658 = 1083843311 * i_68_;
                Class134.anInt6343 = i_63_ * 1077909003;
                Class436.anInt5498 = (int) (Math.random() * 24.0) * 704172827;
                GameClient.menuOpen = true;
            }
        }
}
