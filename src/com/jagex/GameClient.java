package com.jagex;/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.settings.IdleAnimationsSetting;
import com.jagex.maths.Matrix43f;
import com.jagex.maths.Matrix4f;
import com.jagex.network.OutgoingPacket;
import com.jagex.utils.CameraUtils;
import com.jagex.utils.TimeUtils;
import jaclib.ping.Ping;

import java.applet.Applet;
import java.awt.*;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

public final class GameClient extends GameShell {
    public static boolean aBoolean8638;
    public static boolean fullscreen = true;
    public static Frame fullScreenFrame;
    public static boolean aBoolean8640;
    public static int playerIndex;
    public static boolean aBoolean8643;
    public static long aLong8645;
    public static boolean aBoolean8646;
    public static boolean safeMode;
    public static String aString8649;
    public static Class442 aClass442_8650;
    public static boolean aBoolean8651;
    public static IComponentDefinition loadingScreen;
    public static String aString8656;
    public static Object anObject8661;
    public static boolean aBoolean8662;
    public static int anInt8664;
    public static int offiliateId;
    public static boolean sentPreferences;
    public static int shutdownDelay;
    public static Class299[] aClass299Array8671;
    public static boolean aBoolean8672;
    public static boolean aBoolean8676;
    public static int anInt8677;
    public static ConnectionType[] aConnectionTypeArray8679;
    public static boolean aBoolean8680;
    public static int anInt8681;
    public static LinkedList aClass437_8685;
    public static int maximumHeldKeys;
    public static KeyRecord[] lastHeldKeys;
    public static Color[] aColorArray8689;
    public static int cursor;
    public static Color[] aColorArray8691;
    public static LinkedList entityList;
    public static int[] entityKeys;
    public static FontRenderProvider defaultFontRenderProvider;
    public static Color[] aColorArray8701;
    public static int entitySize;
    public static String[] playerAccountNames;
    public static int[] anIntArray8705;
    public static KeyRecord[] lastKeyRecords;
    public static Class404 aClass404_8715;
    public static GameMap myRegion;
    public static volatile boolean aBoolean8717;
    public static Object anObject8718;
    public static int anInt8720;
    public static int anInt8721;
    public static boolean[] aBooleanArray8722;
    public static int anInt8724;
    public static boolean cameraGloballyUpdated;
    public static int anInt8728;
    public static int anInt8731;
    public static int anInt8732;
    public static boolean aBoolean8736;
    public static int anInt8737;
    public static int[] anIntArray8739;
    public static short aShort8743;
    public static int[] anIntArray8751;
    public static int gameState;
    public static int anInt8753;
    public static String aString8754;
    public static int anInt8755;
    public static float cameraYAngle;
    public static boolean aBoolean8763;
    public static int[][][] anIntArrayArrayArray8767;
    public static int anInt8768;
    public static int anInt8769;
    public static int anInt8770;
    public static int anInt8771;
    public static int anInt8772;
    public static int anInt8774;
    public static int flashTick;
    public static boolean isMemberWorld;
    public static int anInt8794;
    public static boolean aBoolean8802;
    public static int anInt8803;
    public static String aString8804;
    public static Player[] entities;
    public static boolean aBoolean8806;
    public static boolean aBoolean8807;
    public static int localPrivilege;
    public static boolean aBoolean8811;
    public static boolean aBoolean8812;
    public static int anInt8814;
    public static ObjectNode[] aClass298_Sub29Array8816;
    public static IComponentDefinition currentSceneComponent;
    public static Class453 aClass453_8824;
    public static LinkedList aClass437_8825;
    public static Class453 mouseRecords;
    public static int[] anIntArray8828;
    public static int[] anIntArray8829;
    public static int anInt8831;
    public static int anInt8834;
    public static boolean interfaceSelected;
    public static int anInt8837;
    public static String selectedInterfaceOption;
    public static short aShort8839;
    public static volatile int WINDOW_PANE_ID;
    public static LinkedList linkedList;
    public static byte[] aByteArray8843;
    public static int anInt8844;
    public static int anInt8845;
    public static int anInt8852;
    public static int anInt8857;
    public static String[] aStringArray8859;
    public static boolean useJs;
    public static int cutsceneID;
    public static int anInt8882;
    public static int clientTick;
    public static int anInt8890;
    public static float[] translated3DCoord;
    public static Class453 aClass453_8893;
    public static int keyRecordsSize;
    public static boolean[] aBooleanArray8900;
    public static int anInt8913;
    public static String aString8919;
    public static StockMarketListing[] stockMarketListing;
    public static short aShort8923;
    public static int[] anIntArray8924;
    public static short aShort8928;
    public static short aShort8929;
    public static short aShort8931;
    public static int anInt8932;
    public static int anInt8933;
    public static short aShort8934;
    public static short aShort8935;
    public static int anInt8939;
    public static int anInt8941;
    public static int anInt8942;
    public static GameContext game = null;
    public static String[] aStringArray8945;
    public static int[] anIntArray8946;
    public static String[] aStringArray8947;
    public static float cameraXAngle;
    public static boolean[] aBooleanArray8950;
    public static int anInt8952;
    public static String[] aStringArray8954;
    public static String[] aStringArray8955;
    public static boolean[] aBooleanArray8957;
    public static byte aByte8959;
    public static Interface17 anInterface17_8960;
    public static int anInt8971;
    public static int camPosX;
    public static int camPosZ;
    public static int plane;
    public static int anInt666;
    public static GameClient gameClient;
    public static Applet applet;
    public static Frame windowFrame;
    public static boolean menuOpen = false;
    public static GraphicsToolkit activeGraphicsToolkit;
    public static int frameHeight;
    public static int camRotY;
    protected static Display display;
    public static int frameWidth;
    static boolean aBoolean8639;
    static int[] anIntArray8641;
    static int anInt8644;
    static String additionalInfo;
    static boolean aBoolean8653;
    static int anInt8654;
    static String aString8655;
    static Class62[] aClass62Array8657;
    static Matrix4f viewMatrix;
    static int anInt8659;
    static Class453 aClass453_8660;
    static boolean isLoading;
    static boolean viewingFPS;
    static boolean aBoolean8668;
    static int[] anIntArray8670;
    static boolean aBoolean8673;
    static boolean aBoolean8674;
    static long clientKey;
    static int anInt8682;
    static boolean[] enabledCameraShakeSlots;
    static int anInt8686;
    static int anInt8692;
    static int anInt8694;
    static SoftCache aClass348_8697;
    static String aString8698;
    static Random lineHeight;
    static int[] anIntArray8706;
    static int anInt8707;
    static int anInt8708;
    static int[] anIntArray8709;
    static IComponentDefinition aClass105_8712;
    static int totalPacketCount;
    static boolean packetSent;
    static int stateTicks;
    static int anInt8726;
    static int anInt8727;
    static int anInt8734;
    static int[] anIntArray8735;
    static int[] calculatedScenePositionYs;
    static int anInt8741;
    static int anInt8742;
    static int cameraXOffset;
    static int anInt8745;
    static int anInt8746;
    static int anInt8747;
    static int mouseClickTargetType;
    static int anInt8749;
    static int[] calculatedScenePositionXs;
    static int camRotX;
    static Calendar aCalendar8758;
    static float aFloat8759;
    static float aFloat8760;
    static boolean aBoolean8761;
    static boolean aBoolean8762;
    static int cameraYOffset;
    static String[] aStringArray8773;
    static boolean aBoolean8775;
    static boolean aBoolean8776;
    static int[] anIntArray8779;
    static SoftCache aClass348_8780;
    static Class442 aClass442_8781;
    static long aLong8782;
    static int anInt8783;
    static int anInt8784;
    static int anInt8785;
    static int mouseClickTicker;
    static int[] interfaceGCStringCounts;
    static int anInt8788;
    static int[] anIntArray8790;
    static int anInt8792;
    static int[] anIntArray8793;
    static int[] anIntArray8795;
    static int anInt8796;
    static int[] anIntArray8797;
    static long lastResized;
    static boolean resizable;
    static int anInt8800;
    static int anInt8801;
    static int anInt8808;
    static int anInt8810;
    static boolean aBoolean8813;
    static boolean aBoolean8815;
    static int anInt8817;
    static short[] aShortArray8818;
    static String[] aStringArray8820;
    static boolean[] aBooleanArray8821;
    static int anInt8822;
    static int[] anIntArray8823;
    static int anInt8826;
    static int anInt8830;
    static int windowTick;
    static int[] anIntArray8833;
    static int containerComponent;
    static int anInt8842;
    static boolean aBoolean8846;
    static int[] anIntArray8847;
    static boolean aBoolean8849;
    static IComponentDefinition fromIComponentDefinition;
    static int[] anIntArray8851;
    static int anInt8853;
    static IComponentDefinition toIComponentDefinition;
    static boolean aBoolean8855;
    static int anInt8856;
    static int anInt8858;
    static int[] anIntArray8860;
    static int anInt8861;
    static int anInt8862;
    static boolean aBoolean8863;
    static int anInt8864;
    static boolean aBoolean8865;
    static boolean aBoolean8866;
    static Matrix43f cameraMatrix;
    static int anInt8873;
    static int[] anIntArray8874;
    static int anInt8875;
    static int[] intertfaceGCValueCounts;
    static int GCValueCount;
    static int anInt8878;
    static int GCStringCount;
    static int[] anIntArray8880;
    static int anInt8881;
    static int anInt8883;
    static int anInt8885;
    static int anInt8886;
    static int anInt8887;
    static int anInt8888;
    static long aLong8892;
    static Class453 aClass453_8895;
    static LinkedList aClass437_8896;
    static SoftCache aClass348_8898;
    static int[] anIntArray8899;
    static boolean[] rectangleGreen;
    static Rectangle[] rectangles;
    static int fightPriority;
    static int[] anIntArray8904;
    static int anInt8905;
    static int itemID;
    static int[] anIntArray8907;
    static int[] anIntArray8908;
    static int[] anIntArray8909;
    static int anInt8910;
    static int[] anIntArray8911;
    static int anInt8912;
    static long[] aLongArray8915;
    static int anInt8916;
    static boolean aBoolean8917;
    static int[] anIntArray8918;
    static int anInt8921;
    static boolean rightClickedNPC;
    static int[] cameraShakeDistance;
    static int[] anIntArray8926;
    static String settings;
    static int anInt8930;
    static int anInt8936;
    static int targetLeaveCursor;
    static boolean aBoolean8938;
    static int anInt8940;
    static Class442 aClass442_8951;
    static int anInt8956;
    static boolean aBoolean8958;
    static int animatorTick;
    static int anInt8966;
    static Matrix43f modelMatrix;
    static int anInt8972;
    static int[] anIntArray8977;
    static int camPosY;
    static Thread thread;
    static int camRotZ;

    static {
        aBoolean8638 = false;
        aBoolean8639 = false;
        settings = null;
        offiliateId = 0;
        anInt8971 = 0;
        aBoolean8643 = false;
        aByteArray8843 = null;
        aLong8645 = 0L;
        aBoolean8646 = false;
        safeMode = false;
        additionalInfo = null;
        aString8649 = null;
        useJs = false;
        aBoolean8651 = false;
        aBoolean8958 = false;
        aBoolean8653 = false;
        anInt8654 = 431443955;
        aString8655 = null;
        aString8656 = null;
        gameState = 121508348;
        viewMatrix = new Matrix4f();
        cameraMatrix = new Matrix43f();
        modelMatrix = new Matrix43f();
        aLong8782 = 0L;
        aBoolean8662 = false;
        isLoading = true;
        anInt8677 = 0;
        clientTick = 0;
        sentPreferences = true;
        viewingFPS = false;
        aBoolean8668 = false;
        shutdownDelay = 0;
        HintIcon.loadedIcons = new HintIcon[8];
        aClass299Array8671 = new Class299[9];
        aBoolean8672 = false;
        aBoolean8673 = false;
        aBoolean8674 = true;
        clientKey = (long) (Math.random() * 9.999999999E9) * -2884790245004171741L;
        aBoolean8676 = false;
        anInt8814 = 0;
        aBoolean8806 = false;
        stateTicks = 0;
        aBoolean8680 = false;
        mouseRecords = new Class453();
        anInt8682 = 0;
        keyRecordsSize = 0;
        lastKeyRecords = new KeyRecord[128];
        maximumHeldKeys = 0;
        lastHeldKeys = new KeyRecord[79];
        aColorArray8689 = new Color[]{new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650)};
        aColorArray8701 = new Color[]{new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277)};
        aColorArray8691 = new Color[]{new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381)};
        anInt8692 = 0;
        anInt8887 = 0;
        anInt8694 = 0;
        aClass348_8780 = new SoftCache(4);
        aClass348_8898 = new SoftCache(4);
        aClass348_8697 = new SoftCache(8);
        aString8698 = null;
        defaultFontRenderProvider = new Class238();
        entityList = new LinkedList(64);
        aClass298_Sub29Array8816 = new ObjectNode[1024];
        anInt8772 = 0;
        entitySize = 0;
        entityKeys = new int[1024];
        anInt8808 = 0;
        anIntArray8706 = new int[258];
        anInt8707 = 0;
        anInt8708 = 0;
        anIntArray8709 = new int[1012];
        ConnectionType.lobbyConnection = new ConnectionType();
        ConnectionType.gameConnection = new ConnectionType();
        aConnectionTypeArray8679 = new ConnectionType[]{ConnectionType.gameConnection, ConnectionType.lobbyConnection};
        totalPacketCount = 0;
        packetSent = false;
        aClass404_8715 = new Class404();
        myRegion = new GameMap(false);
        aBoolean8717 = false;
        anObject8718 = new Object();
        anObject8661 = new Object();
        anIntArray8751 = new int[64];
        anInt8721 = 0;
        anIntArray8739 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
        cutsceneID = -221729505;
        anInt8724 = -1334571751;
        cameraGloballyUpdated = false;
        anInt8726 = 733205975;
        anInt8930 = 0;
        anInt8728 = 652594363;
        anInt8737 = -60133325;
        anInt8681 = 1875737127;
        anInt8731 = 0;
        anInt8732 = 0;
        anInt8720 = 0;
        anIntArray8735 = new int[4096];
        anIntArray8847 = new int[4096];
        calculatedScenePositionXs = new int[50];
        calculatedScenePositionYs = new int[50];
        anIntArray8918 = new int[]{-1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048};
        anInt8817 = 0;
        anInt8741 = -57270710;
        anInt8742 = 0;
        anInt8826 = -792852734;
        cameraXOffset = 0;
        anInt8745 = 901405925;
        anInt8746 = 0;
        anInt8801 = 0;
        anInt8878 = -640741266;
        anInt8749 = 0;
        anInt8972 = 999313729;
        anInt8810 = 0;
        lineHeight = new Random();
        animatorTick = 0;
        anInt8753 = 0;
        anInt8755 = 0;
        cameraYAngle = 1027.0F;
        cameraXAngle = 0.0F;
        aFloat8759 = 0.0F;
        aFloat8760 = 0.0F;
        aBoolean8761 = false;
        aBoolean8762 = false;
        aBoolean8763 = true;
        cameraYOffset = 0;
        anIntArrayArrayArray8767 = new int[2][][];
        anInt8768 = -1723181617;
        anInt8769 = 2694169;
        anInt8770 = 0;
        anInt8771 = 0;
        anInt8857 = 0;
        anInt8852 = 0;
        anInt8774 = 0;
        aBoolean8775 = false;
        aBoolean8776 = false;
        flashTick = 0;
        anIntArray8851 = new int[511];
        anIntArray8779 = new int[513];
        anInt8659 = 0;
        aClass442_8781 = new Class442();
        fightPriority = 0;
        translated3DCoord = new float[3];
        anInt8784 = 0;
        anInt8785 = 0;
        mouseClickTicker = 0;
        mouseClickTargetType = 0;
        anInt8788 = 0;
        anInt8792 = 1225211529;
        anIntArray8793 = new int[2];
        anIntArray8670 = new int[2];
        anIntArray8795 = new int[2];
        anIntArray8641 = new int[2];
        anIntArray8797 = new int[2];
        lastResized = 0L;
        resizable = true;
        anInt8727 = 421892320;
        anInt8910 = -1413813424;
        anInt8794 = 1384393775;
        anInt8803 = -1146614829;
        entities = new Player[2048];
        playerIndex = -1448461709;
        aBoolean8807 = false;
        isMemberWorld = false;
        localPrivilege = 0;
        anInt8932 = 0;
        aBoolean8811 = false;
        aBoolean8812 = false;
        aBoolean8813 = false;
        aBoolean8640 = false;
        aBoolean8815 = true;
        aBoolean8802 = false;
        aShortArray8818 = new short[]{44, 45, 46, 47, 48, 49, 50, 51};
        anIntArray8904 = new int[8];
        aStringArray8820 = new String[8];
        aBooleanArray8821 = new boolean[8];
        anInt8822 = -812630591;
        aClass437_8685 = new LinkedList(64);
        aClass453_8824 = new Class453();
        aClass437_8825 = new LinkedList(16);
        aClass442_8650 = new Class442();
        anIntArray8924 = new int[25];
        anIntArray8828 = new int[25];
        anIntArray8829 = new int[25];
        anInt8830 = 0;
        anInt8831 = -443563833;
        targetLeaveCursor = 280458557;
        cursor = 802224543;
        anInt8834 = 766301529;
        interfaceSelected = false;
        containerComponent = -1598367905;
        itemID = -398138063;
        selectedInterfaceOption = null;
        aString8754 = null;
        WINDOW_PANE_ID = -1785861201;
        linkedList = new LinkedList(8);
        anInt8842 = 0;
        loadingScreen = null;
        anInt8844 = 0;
        anInt8845 = 0;
        aBoolean8846 = false;
        rightClickedNPC = false;
        currentSceneComponent = null;
        aBoolean8849 = false;
        fromIComponentDefinition = null;
        aClass105_8712 = null;
        anInt8734 = 0;
        anInt8853 = 0;
        toIComponentDefinition = null;
        aBoolean8855 = false;
        anInt8856 = -1246614319;
        anInt8800 = 429639553;
        anInt8858 = -1523738763;
        anInt8966 = 706199093;
        aBoolean8938 = false;
        anInt8861 = 1501079155;
        anInt8862 = 1873720993;
        aBoolean8863 = false;
        anInt8864 = 0;
        aBoolean8865 = false;
        aBoolean8866 = false;
        anInt8933 = -908761385;
        anIntArray8874 = new int[32];
        anInt8783 = 0;
        anIntArray8823 = new int[32];
        anInt8873 = 0;
        anIntArray8833 = new int[32];
        anInt8875 = 0;
        intertfaceGCValueCounts = new int[32];
        GCValueCount = 0;
        interfaceGCStringCounts = new int[32];
        GCStringCount = 0;
        anIntArray8880 = new int[32];
        anInt8881 = 0;
        anInt8882 = 0;
        anInt8883 = 0;
        anInt8912 = 0;
        anInt8885 = 0;
        anInt8886 = 0;
        anInt8796 = 0;
        anInt8888 = 0;
        anInt8890 = 0;
        aBoolean8736 = false;
        aLong8892 = -5732957771927789473L;
        aClass453_8893 = new Class453();
        aClass453_8660 = new Class453();
        aClass453_8895 = new Class453();
        aClass437_8896 = new LinkedList(512);
        anInt8686 = 0;
        windowTick = 870349622;
        aBooleanArray8900 = new boolean[113];
        rectangleGreen = new boolean[113];
        rectangles = new Rectangle[113];
        for (int i = 0; i < 113; i++)
            rectangles[i] = new Rectangle();
        anInt8956 = 0;
        anIntArray8899 = new int[4];
        anInt8905 = 0;
        anInt8644 = -2022928202;
        anIntArray8907 = new int[anInt8644 * 547709851];
        anIntArray8908 = new int[547709851 * anInt8644];
        anIntArray8909 = new int[547709851 * anInt8644];
        aClass62Array8657 = new Class62[anInt8644 * 547709851];
        anIntArray8911 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
        anInt8837 = 0;
        anInt8913 = 0;
        aLongArray8915 = new long[100];
        anInt8916 = 0;
        aBoolean8917 = false;
        aString8804 = null;
        aString8919 = null;
        stockMarketListing = new StockMarketListing[6];
        anInt8921 = 0;
        enabledCameraShakeSlots = new boolean[5];
        anIntArray8860 = new int[5];
        cameraShakeDistance = new int[5];
        anIntArray8926 = new int[5];
        anIntArray8790 = new int[5];
        aShort8928 = (short) 256;
        aShort8929 = (short) 205;
        aShort8923 = (short) 256;
        aShort8931 = (short) 320;
        aShort8839 = (short) 1;
        aShort8743 = (short) 32767;
        aShort8934 = (short) 1;
        aShort8935 = (short) 32767;
        anInt8936 = 0;
        anInt8747 = 0;
        anInt8664 = 0;
        anInt8939 = 0;
        anInt8940 = 0;
        anInt8941 = 0;
        anInt8942 = 0;
        playerAccountNames = new String[200];
        aStringArray8945 = new String[200];
        anIntArray8946 = new int[200];
        aStringArray8947 = new String[200];
        anIntArray8705 = new int[200];
        aBooleanArray8722 = new boolean[200];
        aBooleanArray8950 = new boolean[200];
        aClass442_8951 = new Class442();
        anInt8952 = 0;
        aStringArray8859 = new String[100];
        aStringArray8954 = new String[100];
        aStringArray8955 = new String[100];
        aStringArray8773 = new String[100];
        aBooleanArray8957 = new boolean[100];
        aCalendar8758 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        aByte8959 = (byte) -6;
        anInterface17_8960 = new Class523();
        anIntArray8977 = new int[4];
    }

    static final void method2795() {
        int entities = 1168366243 * Class10.entitiesInRegion;
        int[] players = Class10.players;
        int value = SettingsManager.settingsManager.idleAnimations.getValue();
        boolean idleAnimationNeeded = value == IdleAnimationsSetting.MANY && entities > 200 || value == IdleAnimationsSetting.FEW && entities > 50;
        for (int index = 0; index < entities; index++) {
            Player player = GameClient.entities[players[index]];
            if (!player.method4477()) {
                player.anInt10071 = 689024993;
            } else if (player.hidden) {
                player.anInt10071 = 689024993;
            } else {
                player.method4404();
                if (player.aShort9798 < 0 || player.aShort9795 < 0 || (player.aShort9796 >= myRegion.getMapWidth()) || (player.aShort9797 >= myRegion.getMapLength())) {
                    player.anInt10071 = 689024993;
                } else {
                    player.aBoolean10207 = (player.aBoolean10094 && idleAnimationNeeded);
                    if (Player.myPlayer == player) {
                        player.anInt10071 = -1458458655;
                    } else {
                        int i_12_ = 0;
                        if (!player.aBoolean10123) {
                            i_12_++;
                        }
                        if ((player.anInt10116 * -1472450313) > clientTick * 443738891) {
                            i_12_ += 2;
                        }
                        i_12_ += 5 - player.getSize() << 2;
                        if (player.aBoolean10203 || player.aBoolean10222) {
                            i_12_ += 512;
                        } else {
                            if (198119493 * fightPriority == 0) {
                                i_12_ += 32;
                            } else {
                                i_12_ += 128;
                            }
                            i_12_ += 256;
                        }
                        player.anInt10071 = (1 + i_12_) * -689024993;
                    }
                }
            }
        }
        for (int index = 0; index < -1230451913 * entitySize; index++) {
            NPC npc = ((NPC) (((ObjectNode) entityList.get((long) entityKeys[index])).nodeObject));
            if (!npc.method4457(819293556) || !npc.aClass503_10190.method6241(Class128.playerVarsProvider, 922180251)) {
                npc.anInt10071 = 689024993;
            } else {
                npc.method4404();
                if (npc.aShort9798 < 0 || npc.aShort9795 < 0 || (npc.aShort9796 >= myRegion.getMapWidth()) || (npc.aShort9797 >= myRegion.getMapLength())) {
                    npc.anInt10071 = 689024993;
                } else {
                    int i_14_ = 0;
                    if (!npc.aBoolean10123) {
                        i_14_++;
                    }
                    if (-1472450313 * npc.anInt10116 > 443738891 * clientTick) {
                        i_14_ += 2;
                    }
                    i_14_ += 5 - npc.getSize() << 2;
                    if (0 == fightPriority * 198119493) {
                        if (npc.aClass503_10190.aBoolean6173) {
                            i_14_ += 64;
                        } else {
                            i_14_ += 128;
                        }
                    } else if (198119493 * fightPriority == 1) {
                        if (npc.aClass503_10190.aBoolean6173) {
                            i_14_ += 32;
                        } else {
                            i_14_ += 64;
                        }
                    }
                    if (npc.aClass503_10190.hasRenderPriority) {
                        i_14_ += 1024;
                    } else if (!npc.aClass503_10190.aBoolean6155) {
                        i_14_ += 256;
                    }
                    npc.anInt10071 = (1 + i_14_) * -689024993;
                }
            }
        }
        for (int index = 0; index < HintIcon.loadedIcons.length; index++) {
            HintIcon hintIcon = HintIcon.loadedIcons[index];
            if (null != hintIcon) {
                if (958933333 * hintIcon.targetType == 1) {
                    ObjectNode objectNode = ((ObjectNode) entityList.get((long) (hintIcon.targetIndex * -841622081)));
                    if (objectNode != null) {
                        NPC npc = ((NPC) objectNode.nodeObject);
                        if (648883167 * npc.anInt10071 >= 0) {
                            npc.anInt10071 += 1921054720;
                        }
                    }
                } else if (958933333 * hintIcon.targetType == 10) {
                    Player player = (GameClient.entities[-841622081 * hintIcon.targetIndex]);
                    if (player != null && (Player.myPlayer != player) && (648883167 * player.anInt10071 >= 0)) {
                        player.anInt10071 += 1921054720;
                    }
                }
            }
        }
    }

    static final void method2796(int i) {
        int i_16_ = 1168366243 * Class10.entitiesInRegion;
        int[] is = Class10.players;
        int[][] is_17_ = myRegion.method2656();
        int[][] is_18_ = myRegion.method2638();
        int i_19_;
        if (0 == anInt8724 * 1596783995) {
            i_19_ = Class87.aClass94Array794.length;
        } else {
            i_19_ = entitySize * -1230451913 + i_16_;
        }
        for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
            Entity entity;
            if (0 == 1596783995 * anInt8724) {
                Class94 class94 = Class87.aClass94Array794[i_20_];
                if (!class94.aBoolean912) {
                    continue;
                }
                entity = class94.method1015();
            } else {
                if (i_20_ < i_16_) {
                    entity = entities[is[i_20_]];
                } else {
                    entity = ((Entity) (((ObjectNode) entityList.get((long) entityKeys[i_20_ - i_16_])).nodeObject));
                }
                if (i != entity.plane || entity.anInt10071 * 648883167 < 0) {
                    continue;
                }
            }
            int i_21_ = entity.getSize();
            Vector3f class217 = entity.getWorldTransform().trans;
            if ((i_21_ & 0x1) == 0) {
                if (((int) class217.x & 0x1ff) != 0 || 0 != ((int) class217.z & 0x1ff)) {
                    continue;
                }
            } else if (((int) class217.x & 0x1ff) != 256 || 256 != ((int) class217.z & 0x1ff)) {
                continue;
            }
            if (i_21_ == 1) {
                int i_22_ = (int) class217.x >> 9;
                int i_23_ = (int) class217.z >> 9;
                if (648883167 * entity.anInt10071 > is_17_[i_22_][i_23_]) {
                    is_17_[i_22_][i_23_] = 648883167 * entity.anInt10071;
                    is_18_[i_22_][i_23_] = 1;
                } else if (entity.anInt10071 * 648883167 == is_17_[i_22_][i_23_]) {
                    is_18_[i_22_][i_23_]++;
                }
            } else {
                int i_24_ = 60 + (i_21_ - 1) * 256;
                int i_25_ = (int) class217.x - i_24_ >> 9;
                int i_26_ = (int) class217.z - i_24_ >> 9;
                int i_27_ = (int) class217.x + i_24_ >> 9;
                int i_28_ = i_24_ + (int) class217.z >> 9;
                for (int i_29_ = i_25_; i_29_ <= i_27_; i_29_++) {
                    for (int i_30_ = i_26_; i_30_ <= i_28_; i_30_++) {
                        if (entity.anInt10071 * 648883167 > is_17_[i_29_][i_30_]) {
                            is_17_[i_29_][i_30_] = (648883167 * entity.anInt10071);
                            is_18_[i_29_][i_30_] = 1;
                        } else if (is_17_[i_29_][i_30_] == (entity.anInt10071 * 648883167)) {
                            is_18_[i_29_][i_30_]++;
                        }
                    }
                }
            }
        }
    }

    static final void method2797(int plane) {
        int regionPopulation = Class10.entitiesInRegion * 1168366243;
        int[] players = Class10.players;
        int[][] is_32_ = myRegion.method2656();
        int[][] is_33_ = myRegion.method2638();
        int size;
        if (anInt8724 * 1596783995 == 0) {
            size = Class87.aClass94Array794.length;
        } else {
            size = aBoolean8673 ? regionPopulation : -1230451913 * entitySize + regionPopulation;
        }
        for (int index = 0; index < size; index++) {
            Entity entity;
            if (anInt8724 * 1596783995 == 0) {
                Class94 class94 = Class87.aClass94Array794[index];
                if (!class94.aBoolean912) {
                    continue;
                }
                entity = class94.method1015();
            } else {
                if (index < regionPopulation) {
                    entity = entities[players[index]];
                } else {
                    entity = ((Entity) (((ObjectNode) entityList.get((long) entityKeys[index - regionPopulation])).nodeObject));
                }
                if (plane != entity.plane) {
                    continue;
                }
                if (648883167 * entity.anInt10071 < 0) {
                    entity.aBoolean10123 = false;
                    continue;
                }
            }
            entity.anInt10069 = 0;
            int i_36_ = entity.getSize();
            Vector3f class217 = entity.getWorldTransform().trans;
            if ((i_36_ & 0x1) == 0) {
                if (0 != ((int) class217.x & 0x1ff) || ((int) class217.z & 0x1ff) != 0) {
                    entity.aBoolean10123 = false;
                    continue;
                }
            } else if (((int) class217.x & 0x1ff) != 256 || 256 != ((int) class217.z & 0x1ff)) {
                entity.aBoolean10123 = false;
                continue;
            }
            if (0 != anInt8724 * 1596783995) {
                if (i_36_ == 1) {
                    int i_37_ = (int) class217.x >> 9;
                    int i_38_ = (int) class217.z >> 9;
                    if (648883167 * entity.anInt10071 != is_32_[i_37_][i_38_]) {
                        entity.aBoolean10123 = true;
                        continue;
                    }
                    if (is_33_[i_37_][i_38_] > 1) {
                        is_33_[i_37_][i_38_]--;
                        entity.aBoolean10123 = true;
                        continue;
                    }
                } else {
                    int i_39_ = (i_36_ - 1) * 256 + 252;
                    int i_40_ = (int) class217.x - i_39_ >> 9;
                    int i_41_ = (int) class217.z - i_39_ >> 9;
                    int i_42_ = (int) class217.x + i_39_ >> 9;
                    int i_43_ = i_39_ + (int) class217.z >> 9;
                    if (!Class146.method1599(is_32_, is_33_, (entity.anInt10071) * 648883167, i_40_, i_41_, i_42_, i_43_, -1335348035)) {
                        for (int i_44_ = i_40_; i_44_ <= i_42_; i_44_++) {
                            for (int i_45_ = i_41_; i_45_ <= i_43_; i_45_++) {
                                if (is_32_[i_44_][i_45_] == (entity.anInt10071 * 648883167)) {
                                    is_33_[i_44_][i_45_]--;
                                }
                            }
                        }
                        entity.aBoolean10123 = true;
                        continue;
                    }
                }
            }
            entity.aBoolean10123 = false;
            entity.method4341(class217.x, (float) Class356.getAverageHeight((int) class217.x, (int) class217.z, entity.plane, -1247004114), class217.z);
            myRegion.getRegion().method4022(entity, true, (byte) 0);
        }
    }

    static final void method2798() {
        anInt8659 = 0;
        for (int i = 0; i < -1230451913 * entitySize; i++) {
            NPC class365_sub1_sub1_sub2_sub1 = ((NPC) (((ObjectNode) entityList.get((long) entityKeys[i])).nodeObject));
            if (class365_sub1_sub1_sub2_sub1.aBoolean10123 && class365_sub1_sub1_sub2_sub1.method4427((byte) 1) != -1) {
                int i_46_ = ((class365_sub1_sub1_sub2_sub1.getSize() - 1) * 256 + 252);
                Vector3f class217 = class365_sub1_sub1_sub2_sub1.getWorldTransform().trans;
                int i_47_ = (int) class217.x - i_46_ >> 9;
                int i_48_ = (int) class217.z - i_46_ >> 9;
                Entity class365_sub1_sub1_sub2 = StaticMethods.method4886((class365_sub1_sub1_sub2_sub1.plane), i_47_, i_48_);
                if (null != class365_sub1_sub1_sub2) {
                    int i_49_ = class365_sub1_sub1_sub2.entityIndex * 1888274983;
                    if (class365_sub1_sub1_sub2 instanceof NPC) {
                        i_49_ += 2048;
                    }
                    if (0 == -152681609 * class365_sub1_sub1_sub2.anInt10069 && (class365_sub1_sub1_sub2.method4427((byte) 1) != -1)) {
                        anIntArray8851[1306491689 * anInt8659] = i_49_;
                        anIntArray8779[anInt8659 * 1306491689] = i_49_;
                        anInt8659 += -517123815;
                        class365_sub1_sub1_sub2.anInt10069 += 512067143;
                    }
                    anIntArray8851[1306491689 * anInt8659] = i_49_;
                    anIntArray8779[1306491689 * anInt8659] = (1888274983 * class365_sub1_sub1_sub2_sub1.entityIndex + 2048);
                    anInt8659 += -517123815;
                    class365_sub1_sub1_sub2.anInt10069 += 512067143;
                }
            }
        }
        Class82_Sub17.method920(anIntArray8779, anIntArray8851, 0, 1306491689 * anInt8659 - 1, 1469095364);
    }

    static final void method2799() {
        int i = Class10.entitiesInRegion * 1168366243;
        int[] is = Class10.players;
        int i_50_;
        if (0 == anInt8724 * 1596783995) {
            i_50_ = Class87.aClass94Array794.length;
        } else {
            i_50_ = aBoolean8673 ? i : i + -1230451913 * entitySize;
        }
        for (int i_51_ = 0; i_51_ < i_50_; i_51_++) {
            Entity class365_sub1_sub1_sub2;
            if (0 == 1596783995 * anInt8724) {
                Class94 class94 = Class87.aClass94Array794[i_51_];
                if (!class94.aBoolean912) {
                    continue;
                }
                class365_sub1_sub1_sub2 = class94.method1015();
            } else {
                if (i_51_ < i) {
                    class365_sub1_sub1_sub2 = entities[is[i_51_]];
                } else {
                    class365_sub1_sub1_sub2 = ((Entity) (((ObjectNode) entityList.get((long) entityKeys[i_51_ - i])).nodeObject));
                }
                if (648883167 * class365_sub1_sub1_sub2.anInt10071 < 0) {
                    continue;
                }
            }
            int i_52_ = class365_sub1_sub1_sub2.getSize();
            Vector3f class217 = class365_sub1_sub1_sub2.getWorldTransform().trans;
            if (0 == (i_52_ & 0x1)) {
                if (((int) class217.x & 0x1ff) == 0 && 0 == ((int) class217.z & 0x1ff)) {
                    continue;
                }
            } else if (((int) class217.x & 0x1ff) == 256 && 256 == ((int) class217.z & 0x1ff)) {
                continue;
            }
            class365_sub1_sub1_sub2.method4341(class217.x, (float) Class356.getAverageHeight((int) class217.x, (int) class217.z, class365_sub1_sub1_sub2.plane, -1692137069), class217.z);
            myRegion.getRegion().method4022(class365_sub1_sub1_sub2, true, (byte) 0);
        }
    }

    public static IComponentSettings getComponentSettings(IComponentDefinition class105) {
        IComponentSettings IComponentSettings = ((IComponentSettings) aClass437_8896.get((long) (-1309843523 * class105.slot) + ((long) (class105.interfaceHash) << 32)));
        return (null != IComponentSettings ? IComponentSettings : class105.activeProperties);
    }

    static final void method2807() {
        int[][] is = myRegion.method2656();
        int i = myRegion.getMapWidth();
        int i_144_ = myRegion.getMapLength();
        for (int i_145_ = 0; i_145_ < i; i_145_++) {
            int[] is_146_ = is[i_145_];
            for (int i_147_ = 0; i_147_ < i_144_; i_147_++)
                is_146_[i_147_] = 0;
        }
    }

    static IComponentDefinition method2808(IComponentDefinition componentDefinition) {
        IComponentSettings IComponentSettings = getComponentSettings(componentDefinition);
        if (IComponentSettings.method3496()) {
            return IComponentDefinition.componentDefinition;
        }
        int i = IComponentSettings.method3493();
        if (i == 0) {
            return null;
        }
        for (int i_149_ = 0; i_149_ < i; i_149_++) {
            componentDefinition = IComponentDefinition.method6331(Exception_Sub3.method275(((componentDefinition.interfaceHash)), (byte) 3), componentDefinition);
            if (componentDefinition == null) {
                return IComponentDefinition.componentDefinition;
            }
        }
        return componentDefinition;
    }

    static final void method4333() {
        StaticMethods.method2001(false);
    }

    public static boolean isLobbyConnected(int gameState) {
        return 14 == gameState || 15 == gameState || gameState == 18 || gameState == 16;
    }

    static boolean method3902(int i) {
        try {
            return i == 19 || 14 == i || 18 == i || 0 == i;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("nh.fn(").append(')').toString());
        }
    }

    static Buffer method6003() {
        Buffer buffer = Class322.withXtea();
        buffer.writeLong(0L);
        buffer.writeString(Class360.password);
        buffer.writeLong(Class360.serverKey * 6528380240290452803L);
        buffer.writeLong(clientKey * -8380697455384249973L);
        buffer.applyRSA(Class50.LOGIN_RSA_EXPONENT, Class50.LOGIN_RSA_MODULUS);
        return buffer;
    }

    static boolean incrementPacketCount() {
        totalPacketCount += -75983735;
        packetSent = true;
        return true;
    }

    public final void init() {
        if (isValidHost()) {
            AppletParameter[] parameters = AppletParameter.getAppletParameters();
            for (int index = 0; index < parameters.length; index++) {
                AppletParameter parameter = parameters[index];
                String appletParameter = applet.getParameter(parameter.id);
                if (appletParameter != null) {
                    switch (Integer.parseInt(parameter.id)) {
                        case 9:
                            StaticMethods.anInt689 = Integer.parseInt(appletParameter) * -2071496301;
                            break;
                        case 23:
                            aBoolean8643 = appletParameter.equals(Class26.trueBoolean);
                            break;
                        case 33:
                            StaticMethods.aString1369 = appletParameter;
                            break;
                        default:
                            IPAddress.reportError("", new RuntimeException());
                            break;
                        case 7:
                            Js5CacheWrite.aString6063 = appletParameter;
                            break;
                        case 21:
                            Class474.aClass471_5976 = new IPAddress();
                            Class474.aClass471_5976.worldID = Integer.parseInt(appletParameter) * 348739329;
                            break;
                        case 3:
                            aString8655 = appletParameter;
                            break;
                        case 12:
                            aBoolean8651 = appletParameter.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 18:
                            if (appletParameter.equalsIgnoreCase(Class26.trueBoolean)) {
                                aBoolean8807 = true;
                            }
                            break;
                        case 17:
                            aBoolean8958 = appletParameter.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 11:
                            aBoolean8638 = appletParameter.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 24:
                            aString8649 = appletParameter;
                            break;
                        case 27:
                            GameLanguage.CURRENT_LANGUAGE = GameLanguage.getLanguage(Integer.parseInt(appletParameter));
                            break;
                        case 30:
                            aBoolean8653 = appletParameter.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 22:
                            aBoolean8639 = appletParameter.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 13:
                            StaticMethods.aClass401_2708 = ((Class401) (StaticMethods.method5701(Class401.method4936(-1240424446), Integer.parseInt(appletParameter))));
                            if (Class401.aClass401_6552 == StaticMethods.aClass401_2708) {
                                StaticMethods.aClass401_2708 = Class401.aClass401_6560;
                            } else if (!Class401.method4932((StaticMethods.aClass401_2708), 2072733929) && (StaticMethods.aClass401_2708 != Class401.aClass401_6557)) {
                                StaticMethods.aClass401_2708 = Class401.aClass401_6557;
                            }
                            break;
                        case 5:
                            Class350.anInt3758 = Integer.parseInt(appletParameter) * -339928991;
                            break;
                        case 32:
                            aLong8645 = (Long.parseLong(appletParameter) * -4477728998236397853L);
                            break;
                        case 1:
                            offiliateId = Integer.parseInt(appletParameter) * 708949575;
                            break;
                        case 6:
                            Class510.aClass444_6221 = Class444.method5888(Integer.parseInt(appletParameter), (byte) -115);
                            if ((Class510.aClass444_6221 != Class444.aClass444_5605) && (Class510.aClass444_6221 != Class444.aClass444_5602) && (Class444.aClass444_5603 != Class510.aClass444_6221) && (Class510.aClass444_6221 != Class444.aClass444_5604)) {
                                Class510.aClass444_6221 = Class444.aClass444_5604;
                            }
                            break;
                        case 20:
                            if (Class241.lobbyConnectionInfo == null) {
                                Class241.lobbyConnectionInfo = new IPAddress();
                            }
                            Class241.lobbyConnectionInfo.host = appletParameter;
                            break;
                        case 8:
                            break;
                        case 2:
                            additionalInfo = appletParameter;
                            if (additionalInfo.length() > 100) {
                                additionalInfo = null;
                            }
                            break;
                        case 25:
                            anInt8654 = Integer.parseInt(appletParameter) * -431443955;
                            break;
                        case 4:
                            if (Class241.lobbyConnectionInfo == null) {
                                Class241.lobbyConnectionInfo = new IPAddress();
                            }
                            Class241.lobbyConnectionInfo.worldID = Integer.parseInt(appletParameter) * 348739329;
                            break;
                        case 31:
                            useJs = appletParameter.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 10:
                            aString8656 = appletParameter;
                            break;
                        case 14:
                            break;
                        case 29:
                            if (null != appletParameter) {
                                aByteArray8843 = (Class140.method1557(Class328.method3989(appletParameter, -1122576135), (byte) 59));
                                if (aByteArray8843.length < 16) {
                                    aByteArray8843 = null;
                                }
                            }
                            break;
                        case 26:
                            game = Class352.method4244(Integer.parseInt(appletParameter));
                            break;
                        case 28:
                            anInt8971 = Integer.parseInt(appletParameter) * 131907935;
                            if (745003679 * anInt8971 < 0 || (745003679 * anInt8971 >= aColorArray8689.length)) {
                                anInt8971 = 0;
                            }
                            break;
                        case 16:
                            aBoolean8680 = appletParameter.equals(Class26.trueBoolean);
                            break;
                        case 15:
                            settings = appletParameter;
                    }
                }
            }
            if (settings == null) {
                settings = "";
            }
            Class311 class311 = new Class311(775068819 * anInt8794, -791746413 * anInt8803, 351263031 * anInt8727, anInt8910 * -510898275, game.name);
            GameClient.gameClient = this;
            idkyet(class311, game.BUILD_NAME, Class510.aClass444_6221.aString5607, 32 + 1286017487 * Class510.aClass444_6221.anInt5608, Class356.method4268(), 718, 1, aBoolean8653);
        }
    }

    public final void mainInit() {
        Frame frame = new Frame(" ");
        frame.pack();
        frame.dispose();
        IComponentDefinition.componentDefinition = new IComponentDefinition();
        Class229.resize();
        Class365_Sub1_Sub3.aCacheResourceWorker_9804 = new CacheResourceWorker();
        PaddedResourceWorker.protocol = new PaddedResourceWorker_Sub1();
        int[] is = {20, 260};
        int[] is_0_ = {1000, 100};
        if (is == null || null == is_0_) {
            Class136.anIntArray6388 = null;
            Class136.anIntArray6388 = null;
            Class416.anIntArray5331 = null;
            Class298_Sub37_Sub9_Sub2.packetPool = null;
        } else {
            Class136.anIntArray6388 = is;
            Class416.anIntArray5331 = new int[is.length];
            Class298_Sub37_Sub9_Sub2.packetPool = new byte[is.length][][];
            for (int i_1_ = 0; i_1_ < Class136.anIntArray6388.length; i_1_++)
                Class298_Sub37_Sub9_Sub2.packetPool[i_1_] = new byte[is_0_[i_1_]][];
        }
        Vector3f.initPool(100);
        Quaternion.initializePool(10);
        IComponentSettings.method3500(100);
        Class315.method3838(100, 1489616392);
        if (Class401.aClass401_6557 != StaticMethods.aClass401_2708) {
            Class98.aByteArrayArray949 = new byte[50][];
        }
        SettingsManager.settingsManager = SettingsManager.getSettingsManager();
        if (SettingsManager.settingsManager.aClass422_Sub21_7580.getValue() == 1) {
            Region.aBoolean3540 = false;
        }
        if (Class401.aClass401_6557 == StaticMethods.aClass401_2708) {
            Class474.aClass471_5976.host = applet.getCodeBase().getHost();
        } else if (Class401.method4932(StaticMethods.aClass401_2708, 2144783357)) {
            Class474.aClass471_5976.host = applet.getCodeBase().getHost();
            Class474.aClass471_5976.anInt5954 = (815680320 + Class474.aClass471_5976.worldID * -1670427267);
            Class241.lobbyConnectionInfo.anInt5954 = (815680320 + Class241.lobbyConnectionInfo.worldID * -1670427267);
            Class474.aClass471_5976.anInt5955 = (-52655920 + Class474.aClass471_5976.worldID * 925746937);
            Class241.lobbyConnectionInfo.anInt5955 = (Class241.lobbyConnectionInfo.worldID * 925746937 + -52655920);
        } else if (StaticMethods.aClass401_2708 == Class401.aClass401_6552) {
            Class474.aClass471_5976.host = Class26.ipAddress;
            Class241.lobbyConnectionInfo.host = Class26.ipAddress;
            Class474.aClass471_5976.anInt5954 = (815680320 + Class474.aClass471_5976.worldID * -1670427267);
            Class241.lobbyConnectionInfo.anInt5954 = (-1670427267 * Class241.lobbyConnectionInfo.worldID + 815680320);
            Class474.aClass471_5976.anInt5955 = (-52655920 + Class474.aClass471_5976.worldID * 925746937);
            Class241.lobbyConnectionInfo.anInt5955 = (-52655920 + Class241.lobbyConnectionInfo.worldID * 925746937);
        }
        Class474.activeConnectionInfo = Class474.aClass471_5976;
        if (game == GameContext.VENGIUM) {
            aBoolean8674 = false;
        }
        Class107.aShortArray1315 = ObjectDefinition.aShortArray5423 = NPCDefinition.aShortArray6182 = ItemDefinition.aShortArray5757 = new short[256];
        try {
            Class365_Sub1_Sub5_Sub2.aClipboard9941 = StaticMethods.getParent().getToolkit().getSystemClipboard();
        } catch (Exception exception) {
                /* empty */
        }
        AwtKeyboard.keyboard = AwtKeyboard.create(DirectXContext.canvas);
        AwtMouse.mouse = AwtMouse.create(DirectXContext.canvas, true);
        if (Class401.aClass401_6557 != StaticMethods.aClass401_2708) {
            viewingFPS = true;
        }
        aString6485 = Tradution.LOADING_PLEASE_WAIT.translate(GameLanguage.CURRENT_LANGUAGE);
        Class62.aClass248_612 = new MapLoader();
        new Thread(Class62.aClass248_612).start();
    }

    public final void mainLoop() {
        if (SettingsManager.settingsManager.toolkitSetting.getValue() == ToolkitOption.SSE) {
            try {
                pulse();
            } catch (ThreadDeath threaddeath) {
                throw threaddeath;
            } catch (Throwable throwable) {
                IPAddress.reportError(new StringBuilder().append(throwable.getMessage()).append(" ").append(method2761()).toString(), throwable);
                aBoolean8662 = true;
                Class370.loadingPleaseWait(ToolkitOption.PUREJAVA, false);
            }
        } else {
            pulse();
        }
    }

    public final void mainRedraw() {
        if (SettingsManager.settingsManager.toolkitSetting.getValue() == ToolkitOption.SSE) {
            try {
                redraw();
            } catch (ThreadDeath threaddeath) {
                throw threaddeath;
            } catch (Throwable throwable) {
                IPAddress.reportError(new StringBuilder().append(throwable.getMessage()).append(" ").append(method2761()).toString(), throwable);
                aBoolean8662 = true;
                Class370.loadingPleaseWait(ToolkitOption.PUREJAVA, false);
            }
        } else {
            redraw();
        }
    }

    void redraw() {
        if (-1233866115 * gameState != 10) {
            long key = (Class82_Sub3.method881((byte) 12) / 1000000L - 2783675710070397783L * aLong8782);
            aLong8782 = (Class82_Sub3.method881((byte) -35) / 1000000L * -1871756826282688409L);
            boolean bool = Class69.method795(1477772934);
            if (bool && Class300.aBoolean3208 && Class300.aClass284_3212 != null) {
                Class300.aClass284_3212.method2689();
            }
            if (method3902(-1233866115 * gameState)) {
                if (0L != lastResized * -7612703297707729209L && (TimeUtils.getTime() > -7612703297707729209L * lastResized)) {
                    Class357.method4276(Class190.windowMode(), -1, -1, false);
                } else if (!activeGraphicsToolkit.method5074() && aBoolean6478) {
                    Class335.method4086();
                }
            }
            if (null == fullScreenFrame) {
                Container container = StaticMethods.getParent();
                int width = container.getSize().width;
                int height = container.getSize().height;
                if (container == windowFrame) {
                    Insets insets = windowFrame.getInsets();
                    width -= insets.right + insets.left;
                    height -= insets.bottom + insets.top;
                }
                if (GameClient.frameWidth * -639974669 != width || height != 1282634425 * frameHeight || aBoolean8676) {
                    if (null == activeGraphicsToolkit || activeGraphicsToolkit.isResizable()) {
                        Class229.resize();
                    } else {
                        GameClient.frameWidth = width * 1325868603;
                        frameHeight = height * -2115832951;
                    }
                    lastResized = ((TimeUtils.getTime() + 500L) * -1373096961092238601L);
                    aBoolean8676 = false;
                }
            }
            if (fullscreen && null != fullScreenFrame && !StaticMethods.aBoolean8385 && method3902(-1233866115 * gameState)) {
                Class357.method4276(SettingsManager.settingsManager.screenSize.getValue(), -1, -1, false);
            }
            boolean bool_4_ = false;
            if (aBoolean6471) {
                aBoolean6471 = false;
                bool_4_ = true;
            }
            if (bool_4_) {
                Class148.clearAWT();
            }
            if ((activeGraphicsToolkit != null && activeGraphicsToolkit.method5074()) || Class190.windowMode() != 1) {
                StaticMethods.method4301();
            }
            if (Class88.isLoadingScreen(-1233866115 * gameState)) {
                Class60.method710(bool_4_, 430993133);
            } else if (Class158_Sub1.method1703(-1233866115 * gameState)) {
                StaticMethods.method4958();
            } else if (Class363.method4315(gameState * -1233866115, 279703369)) {
                StaticMethods.method4958();
            } else if (StaticMethods.method4287(gameState * -1233866115)) {
                if (myRegion.method2627() == Class273.aClass273_2906) {
                    int progress = myRegion.calculateLoadingProgress() / 2;
                    StaticMethods.drawCornerLoadingBox(new StringBuilder().append(Tradution.LOADING_PLEASE_WAIT.translate(GameLanguage.CURRENT_LANGUAGE)).append(Class26.breakMessage).append("(").append(progress).append("%)").toString(), true, activeGraphicsToolkit, StaticMethods.aClass264_3673, StaticMethods.aClass505_8369);
                } else if (myRegion.method2627() == Class273.aClass273_2904) {
                    int progress = 50 + myRegion.method2670((byte) -20) / 2;
                    StaticMethods.drawCornerLoadingBox(new StringBuilder().append(Tradution.LOADING_PLEASE_WAIT.translate(GameLanguage.CURRENT_LANGUAGE)).append(Class26.breakMessage).append("(").append(progress).append("%)").toString(), true, activeGraphicsToolkit, StaticMethods.aClass264_3673, StaticMethods.aClass505_8369);
                } else {
                    StaticMethods.drawCornerLoadingBox((Tradution.LOADING_PLEASE_WAIT.translate(GameLanguage.CURRENT_LANGUAGE)), true, activeGraphicsToolkit, StaticMethods.aClass264_3673, StaticMethods.aClass505_8369);
                }
            } else if (-1233866115 * gameState == 0) {
                Class322.method3932(key);
            } else if (5 == -1233866115 * gameState) {
                StaticMethods.drawCornerLoadingBox(new StringBuilder().append(Tradution.connectionLost.translate(GameLanguage.CURRENT_LANGUAGE)).append(Class26.breakMessage).append(Tradution.loadingPleaseWaitReestablishing.translate(GameLanguage.CURRENT_LANGUAGE)).toString(), false, activeGraphicsToolkit, StaticMethods.aClass264_3673, StaticMethods.aClass505_8369);
            } else if (-1233866115 * gameState == 13) {
                StaticMethods.drawCornerLoadingBox(Tradution.PLEASE_WAIT.translate(GameLanguage.CURRENT_LANGUAGE), false, activeGraphicsToolkit, StaticMethods.aClass264_3673, StaticMethods.aClass505_8369);
            }
            if (anInt8956 * 2067224717 == 3) {
                for (int index = 0; index < -112139815 * anInt8686; index++) {
                    Rectangle rectangle = rectangles[index];
                    if (rectangleGreen[index]) {
                        activeGraphicsToolkit.drawRectangle(rectangle.x, rectangle.y, rectangle.width, rectangle.height, -65281);//Green
                    } else {
                        activeGraphicsToolkit.drawRectangle(rectangle.x, rectangle.y, rectangle.width, rectangle.height, -16711936);//Red
                    }
                }
            }
            if (Class423.method5734()) {
                StaticMethods.method5895(activeGraphicsToolkit);
            }
            if (!Class88.isLoadingScreen(gameState * -1233866115) && !StaticMethods.method4287(-1233866115 * gameState) && -1 != WINDOW_PANE_ID * -257444687) {
                try {
                    activeGraphicsToolkit.renderFrame();
                } catch (GraphicsFrameException exception_sub1) {
                    IPAddress.reportError(new StringBuilder().append(exception_sub1.getMessage()).append(" ").append(method2761()).toString(), exception_sub1);
                    Class370.loadingPleaseWait(ToolkitOption.PUREJAVA, false);
                }
            }
            StaticMethods.method2817();
            int cpuValue = SettingsManager.settingsManager.cpu.getValue();
            if (0 == cpuValue) {
                IPAddress.method6060(15L);
            } else if (cpuValue == 1) {
                IPAddress.method6060(10L);
            } else if (2 == cpuValue) {
                IPAddress.method6060(5L);
            } else if (3 == cpuValue) {
                IPAddress.method6060(2L);
            }
            if (aBoolean8672) {
                Class442.method5879();
            }
            if (SettingsManager.settingsManager.safeMode.getValue() == 1 && 19 == -1233866115 * gameState && -257444687 * WINDOW_PANE_ID != -1) {
                SettingsManager.settingsManager.setValue((SettingsManager.settingsManager.safeMode), 0);
                ToMoveSettings.encodeBuffer();
            }
        }
    }

    public final void mainQuit() {
            if (aBoolean8736) {
                StaticMethods.method589();
            }
            Class16.method352();
            if (null != activeGraphicsToolkit) {
                activeGraphicsToolkit.destroy();
            }
            if (fullscreen && fullScreenFrame != null) {
                ComponentMouseRecorder.method1010(display, fullScreenFrame, -784023783);
                fullScreenFrame = null;
            }
            ConnectionType.gameConnection.stopConnection();
            ConnectionType.gameConnection.aClass124_340.method1382();
            ConnectionType.lobbyConnection.stopConnection();
            ConnectionType.lobbyConnection.aClass124_340.method1382();
            Class523.method6332();
            PaddedResourceWorker.protocol.close();
            Class365_Sub1_Sub3.aCacheResourceWorker_9804.stop();
            if (null != aClass404_8715) {
                aClass404_8715.method4948();
                aClass404_8715 = null;
            }
            try {
                Ping.quit();
            } catch (Throwable throwable) {
                /* empty */
            }
            StaticMethods.method2326();
            try {
                Class444.method5890((byte) -128);
            } catch (Exception exception) {
                /* empty */
            }
            if (aBoolean6480) {
                StaticMethods.method1279();
            }
    }

    void method2793() {
        try {
            boolean bool = PaddedResourceWorker.protocol.method2351(-358267640);
            if (!bool) {
                method2810();
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("client.ft(").append(')').toString());
        }
    }

    void method2794(int i) {
        try {
            Class423.aSocket5355 = null;
            Class365_Sub1_Sub5_Sub2.aStream_9940 = null;
            anInt8692 = 0;
            PaddedResourceWorker.protocol.anInt2735 += 686188557;
            PaddedResourceWorker.protocol.anInt2745 = i * -1293857183;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("client.fl(").append(')').toString());
        }
    }

    public final void method205() {
        if (isValidHost()) {
            AppletParameter[] appletParameters = AppletParameter.getAppletParameters();
            for (int i = 0; i < appletParameters.length; i++) {
                AppletParameter appletParameter = appletParameters[i];
                String string = applet.getParameter(appletParameter.id);
                if (string != null) {
                    switch (Integer.parseInt(appletParameter.id)) {
                        case 9:
                            StaticMethods.anInt689 = Integer.parseInt(string) * -2071496301;
                            break;
                        case 23:
                            aBoolean8643 = string.equals(Class26.trueBoolean);
                            break;
                        case 33:
                            StaticMethods.aString1369 = string;
                            break;
                        default:
                            IPAddress.reportError("", new RuntimeException());
                            break;
                        case 7:
                            Js5CacheWrite.aString6063 = string;
                            break;
                        case 21:
                            Class474.aClass471_5976 = new IPAddress();
                            Class474.aClass471_5976.worldID = Integer.parseInt(string) * 348739329;
                            break;
                        case 3:
                            aString8655 = string;
                            break;
                        case 12:
                            aBoolean8651 = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 18:
                            if (string.equalsIgnoreCase(Class26.trueBoolean)) {
                                aBoolean8807 = true;
                            }
                            break;
                        case 17:
                            aBoolean8958 = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 11:
                            aBoolean8638 = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 24:
                            aString8649 = string;
                            break;
                        case 27:
                            GameLanguage.CURRENT_LANGUAGE = GameLanguage.getLanguage(Integer.parseInt(string));
                            break;
                        case 30:
                            aBoolean8653 = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 22:
                            aBoolean8639 = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 13:
                            StaticMethods.aClass401_2708 = (Class401) (StaticMethods.method5701(Class401.method4936(978559132), Integer.parseInt(string)));
                            if (Class401.aClass401_6552 == StaticMethods.aClass401_2708) {
                                StaticMethods.aClass401_2708 = Class401.aClass401_6560;
                            } else if (!Class401.method4932(StaticMethods.aClass401_2708, 2135116996) && (StaticMethods.aClass401_2708 != Class401.aClass401_6557)) {
                                StaticMethods.aClass401_2708 = Class401.aClass401_6557;
                            }
                            break;
                        case 5:
                            Class350.anInt3758 = Integer.parseInt(string) * -339928991;
                            break;
                        case 32:
                            aLong8645 = Long.parseLong(string) * -4477728998236397853L;
                            break;
                        case 1:
                            offiliateId = Integer.parseInt(string) * 708949575;
                            break;
                        case 6:
                            Class510.aClass444_6221 = Class444.method5888(Integer.parseInt(string), (byte) -63);
                            if (Class510.aClass444_6221 != Class444.aClass444_5605 && (Class510.aClass444_6221 != Class444.aClass444_5602) && (Class444.aClass444_5603 != Class510.aClass444_6221) && (Class510.aClass444_6221 != Class444.aClass444_5604)) {
                                Class510.aClass444_6221 = Class444.aClass444_5604;
                            }
                            break;
                        case 20:
                            if (Class241.lobbyConnectionInfo == null) {
                                Class241.lobbyConnectionInfo = new IPAddress();
                            }
                            Class241.lobbyConnectionInfo.host = string;
                            break;
                        case 8:
                            break;
                        case 2:
                            additionalInfo = string;
                            if (additionalInfo.length() > 100) {
                                additionalInfo = null;
                            }
                            break;
                        case 25:
                            anInt8654 = Integer.parseInt(string) * -431443955;
                            break;
                        case 4:
                            if (Class241.lobbyConnectionInfo == null) {
                                Class241.lobbyConnectionInfo = new IPAddress();
                            }
                            Class241.lobbyConnectionInfo.worldID = Integer.parseInt(string) * 348739329;
                            break;
                        case 31:
                            useJs = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 10:
                            aString8656 = string;
                            break;
                        case 14:
                            break;
                        case 29:
                            if (null != string) {
                                aByteArray8843 = (Class140.method1557(Class328.method3989(string, -2124619496), (byte) 77));
                                if (aByteArray8843.length < 16) {
                                    aByteArray8843 = null;
                                }
                            }
                            break;
                        case 26:
                            game = Class352.method4244(Integer.parseInt(string));
                            break;
                        case 28:
                            anInt8971 = Integer.parseInt(string) * 131907935;
                            if (745003679 * anInt8971 < 0 || 745003679 * anInt8971 >= aColorArray8689.length) {
                                anInt8971 = 0;
                            }
                            break;
                        case 16:
                            aBoolean8680 = string.equals(Class26.trueBoolean);
                            break;
                        case 15:
                            settings = string;
                    }
                }
            }
            if (settings == null) {
                settings = "";
            }
            Class311 class311 = new Class311(775068819 * anInt8794, -791746413 * anInt8803, 351263031 * anInt8727, anInt8910 * -510898275, game.name);
            GameClient.gameClient = this;
            idkyet(class311, game.BUILD_NAME, Class510.aClass444_6221.aString5607, 32 + 1286017487 * Class510.aClass444_6221.anInt5608, Class356.method4268(), 718, 1, aBoolean8653);
        }
    }

    public final void method210() {
        if (isValidHost()) {
            AppletParameter[] appletParameters = AppletParameter.getAppletParameters();
            for (int i = 0; i < appletParameters.length; i++) {
                AppletParameter appletParameter = appletParameters[i];
                String string = applet.getParameter(appletParameter.id);
                if (string != null) {
                    switch (Integer.parseInt(appletParameter.id)) {
                        case 9:
                            StaticMethods.anInt689 = Integer.parseInt(string) * -2071496301;
                            break;
                        case 23:
                            aBoolean8643 = string.equals(Class26.trueBoolean);
                            break;
                        case 33:
                            StaticMethods.aString1369 = string;
                            break;
                        default:
                            IPAddress.reportError("", new RuntimeException());
                            break;
                        case 7:
                            Js5CacheWrite.aString6063 = string;
                            break;
                        case 21:
                            Class474.aClass471_5976 = new IPAddress();
                            Class474.aClass471_5976.worldID = Integer.parseInt(string) * 348739329;
                            break;
                        case 3:
                            aString8655 = string;
                            break;
                        case 12:
                            aBoolean8651 = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 18:
                            if (string.equalsIgnoreCase(Class26.trueBoolean)) {
                                aBoolean8807 = true;
                            }
                            break;
                        case 17:
                            aBoolean8958 = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 11:
                            aBoolean8638 = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 24:
                            aString8649 = string;
                            break;
                        case 27:
                            GameLanguage.CURRENT_LANGUAGE = GameLanguage.getLanguage(Integer.parseInt(string));
                            break;
                        case 30:
                            aBoolean8653 = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 22:
                            aBoolean8639 = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 13:
                            StaticMethods.aClass401_2708 = (Class401) (StaticMethods.method5701(Class401.method4936(-1772297471), Integer.parseInt(string)));
                            if (Class401.aClass401_6552 == StaticMethods.aClass401_2708) {
                                StaticMethods.aClass401_2708 = Class401.aClass401_6560;
                            } else if (!Class401.method4932(StaticMethods.aClass401_2708, 2053185315) && (StaticMethods.aClass401_2708 != Class401.aClass401_6557)) {
                                StaticMethods.aClass401_2708 = Class401.aClass401_6557;
                            }
                            break;
                        case 5:
                            Class350.anInt3758 = Integer.parseInt(string) * -339928991;
                            break;
                        case 32:
                            aLong8645 = Long.parseLong(string) * -4477728998236397853L;
                            break;
                        case 1:
                            offiliateId = Integer.parseInt(string) * 708949575;
                            break;
                        case 6:
                            Class510.aClass444_6221 = Class444.method5888(Integer.parseInt(string), (byte) -17);
                            if (Class510.aClass444_6221 != Class444.aClass444_5605 && (Class510.aClass444_6221 != Class444.aClass444_5602) && (Class444.aClass444_5603 != Class510.aClass444_6221) && (Class510.aClass444_6221 != Class444.aClass444_5604)) {
                                Class510.aClass444_6221 = Class444.aClass444_5604;
                            }
                            break;
                        case 20:
                            if (Class241.lobbyConnectionInfo == null) {
                                Class241.lobbyConnectionInfo = new IPAddress();
                            }
                            Class241.lobbyConnectionInfo.host = string;
                            break;
                        case 8:
                            break;
                        case 2:
                            additionalInfo = string;
                            if (additionalInfo.length() > 100) {
                                additionalInfo = null;
                            }
                            break;
                        case 25:
                            anInt8654 = Integer.parseInt(string) * -431443955;
                            break;
                        case 4:
                            if (Class241.lobbyConnectionInfo == null) {
                                Class241.lobbyConnectionInfo = new IPAddress();
                            }
                            Class241.lobbyConnectionInfo.worldID = Integer.parseInt(string) * 348739329;
                            break;
                        case 31:
                            useJs = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 10:
                            aString8656 = string;
                            break;
                        case 14:
                            break;
                        case 29:
                            if (null != string) {
                                aByteArray8843 = (Class140.method1557(Class328.method3989(string, -1069347336), (byte) 105));
                                if (aByteArray8843.length < 16) {
                                    aByteArray8843 = null;
                                }
                            }
                            break;
                        case 26:
                            game = Class352.method4244(Integer.parseInt(string));
                            break;
                        case 28:
                            anInt8971 = Integer.parseInt(string) * 131907935;
                            if (745003679 * anInt8971 < 0 || 745003679 * anInt8971 >= aColorArray8689.length) {
                                anInt8971 = 0;
                            }
                            break;
                        case 16:
                            aBoolean8680 = string.equals(Class26.trueBoolean);
                            break;
                        case 15:
                            settings = string;
                    }
                }
            }
            if (settings == null) {
                settings = "";
            }
            Class311 class311 = new Class311(775068819 * anInt8794, -791746413 * anInt8803, 351263031 * anInt8727, anInt8910 * -510898275, game.name);
            GameClient.gameClient = this;
            idkyet(class311, game.BUILD_NAME, Class510.aClass444_6221.aString5607, 32 + 1286017487 * Class510.aClass444_6221.anInt5608, Class356.method4268(), 718, 1, aBoolean8653);
        }
    }

    public void pulse() {
        if (-1233866115 * gameState != 10) {
            if (aBoolean8717) {
                synchronized (anObject8661) {
                    anObject8661.notify();
                }
                synchronized (anObject8718) {
                    try {
                        anObject8718.wait();
                    } catch (InterruptedException interruptedexception) {
                            /* empty */
                    }
                }
                aBoolean8717 = false;
            }
            clientTick += -2114713437;
            if (clientTick * 443738891 % 1000 == 1) {
                GregorianCalendar gregoriancalendar = new GregorianCalendar();
                Class368.random = (gregoriancalendar.get(11) * 600 + gregoriancalendar.get(12) * 10 + gregoriancalendar.get(13) / 6) * -850559371;
                lineHeight.setSeed((long) (1401020893 * Class368.random));
            }
            ConnectionType.gameConnection.recordStats();
            ConnectionType.lobbyConnection.recordStats();
            method2793();
            if (null != StaticMethods.aClass225_2337) {
                StaticMethods.aClass225_2337.method2097(-741953209);
            }

            Class321.method3927();
            StaticMethods.method6289();
            AwtKeyboard.keyboard.sync();
            AwtMouse.mouse.sync();
            if (activeGraphicsToolkit != null) {
                activeGraphicsToolkit.clean((int) TimeUtils.getTime());
            }
            keyRecordsSize = 0;
            maximumHeldKeys = 0;
            for (KeyRecord record = AwtKeyboard.keyboard.getNext(); record != null; record = AwtKeyboard.keyboard.getNext()) {
                int type = record.getType();
                if (type == 2 || type == 3) {
                    char c = record.getCharacter();
                    if (StaticMethods.method4897() && (c == '`' || c == '\u00a7' || c == '\u00b2')) {
                        if (Class423.method5734()) {
                            Heap.method3673();
                        } else {
                            StaticMethods.method4653();
                        }
                    } else if (1351936279 * keyRecordsSize < 128) {
                        lastKeyRecords[keyRecordsSize * 1351936279] = record;
                        keyRecordsSize += 1498865319;
                    }
                } else if (0 == type && -1625219821 * maximumHeldKeys < 79) {
                    lastHeldKeys[maximumHeldKeys * -1625219821] = record;
                    maximumHeldKeys += -1573964517;
                }
            }
            anInt8682 = 0;
            for (MouseRecord mouse = AwtMouse.mouse.nextSubmission(); null != mouse; mouse = AwtMouse.mouse.nextSubmission()) {
                int type = mouse.getMouseType();
                if (type == -1) {
                    ComponentMouseRecorder.record(mouse);
                } else if (type == 6) {
                    anInt8682 += (mouse.getMousRotation() * 815898935);
                    mouse.resizeCache();
                } else if (StaticMethods.method1437(type)) {
                    mouseRecords.pushBack(mouse);
                    if (mouseRecords.size2() > 10) {
                        MouseRecord head = ((MouseRecord) mouseRecords.popHead());
                        if (head != null) {
                            head.resizeCache();
                        }
                    }
                }
            }
            if (Class423.method5734()) {
                StaticMethods.renderConsole();
            }

            if (Class88.isLoadingScreen(gameState * -1233866115)) {
                ClientLoadingScreenBar.startLoadingBar();
                StaticMethods.method1247();
            } else if (StaticMethods.method4287(-1233866115 * gameState)) {
                myRegion.loadMapSettings(-319147356);
            }

            if (Class413.method5584(gameState * -1233866115) && !StaticMethods.method4287(-1233866115 * gameState)) {
                method2809(-2054858271);
                Class288_Sub1.method2730(-1664553677);
                Class460.pulseLogin();
            } else if (isLobbyConnected(gameState * -1233866115) && !StaticMethods.method4287(-1233866115 * gameState)) {
                method2809(-1772986224);
                Class460.pulseLogin();
            } else if (6 == gameState * -1233866115) {
                Class460.pulseLogin();
            } else if (StaticMethods.method5804(gameState * -1233866115) && !StaticMethods.method4287(gameState * -1233866115)) {
                Class126.method1407();
            } else if (-1233866115 * gameState == 5 || 13 == -1233866115 * gameState) {
                Class460.pulseLogin();
                if (-3 != Class360.anInt3871 * -1372893999 && 2 != -1372893999 * Class360.anInt3871 && Class360.anInt3871 * -1372893999 != 15) {
                    if (13 == gameState * -1233866115) {
                        Class360.anInt3888 = 1522102865 * Class360.anInt3910;
                        Class360.anInt3906 = Class360.anInt3909 * -2096622051;
                        Class360.anInt3894 = Class360.anInt3871 * 1695357761;
                        if (Class474.aBoolean5973) {
                            Class372.method4589((Class474.aClass471_5972.worldID) * 1606920449, (Class474.aClass471_5972.host));
                            ConnectionType.gameConnection.closeConnection();
                            Class439.loadGameState(5);
                        } else {
                            StaticMethods.method2001(Class360.aBoolean3912);
                        }
                    } else {
                        StaticMethods.method2001(false);
                    }
                }
            }
            StaticMethods.method6308(activeGraphicsToolkit);
            mouseRecords.popHead();
        }
    }

    public String method2761() {
        String string = " ";
        try {
            GameScene gameScene = myRegion.getGameScene();
            string = new StringBuilder().append(string).append(gameScene.gameSceneBaseX * -1760580017).append(Class26.comma).append(283514611 * gameScene.gameSceneBaseY).append(Class26.comma).append(myRegion.getMapWidth()).append(Class26.comma).append(myRegion.getMapLength()).append(" ").toString();
            if (Player.myPlayer != null) {
                string = new StringBuilder().append(string).append(1855729883 * GameClient.plane).append(Class26.comma).append(-1760580017 * gameScene.gameSceneBaseX + (Player.myPlayer.scenePositionXQueue[0])).append(Class26.comma).append((Player.myPlayer.scenePositionYQueue[0]) + gameScene.gameSceneBaseY * 283514611).append(" ").toString();
            } else {
                string = new StringBuilder().append(string).append(GameClient.plane * 1855729883).append(Class26.comma).append(GameClient.plane * 1855729883).append(Class26.comma).append(1855729883 * GameClient.plane).append(Class26.comma).append(" ").toString();
            }
            string = new StringBuilder().append(string).append(SettingsManager.settingsManager.toolkitSetting.getValue()).append(" ").append(SettingsManager.settingsManager.antiAliasing.getValue()).append(" ").append(Class190.windowMode()).append(" ").append(GameShell.canvasWidth * -2110394505).append(Class26.comma).append(GameShell.canvasHeight * -1111710645).append(" ").toString();
            string = new StringBuilder().append(string).append(SettingsManager.settingsManager.lighting.getValue()).append(" ").toString();
            string = new StringBuilder().append(string).append(SettingsManager.settingsManager.sceneryShadows.getValue()).append(" ").toString();
            string = new StringBuilder().append(string).append(SettingsManager.settingsManager.water.getValue()).append(" ").toString();
            string = new StringBuilder().append(string).append(SettingsManager.settingsManager.textures.getValue()).append(" ").toString();
            string = new StringBuilder().append(string).append(SettingsManager.settingsManager.bloom.getValue()).append(" ").toString();
            string = new StringBuilder().append(string).append("0 ").toString();
            string = new StringBuilder().append(string).append(maximumMemory * 1126040225).append(" ").toString();
            string = new StringBuilder().append(string).append(-1233866115 * gameState).append(" ").toString();
            if (null != Class12.systemInfo) {
                string = new StringBuilder().append(string).append(Class12.systemInfo.cpuClockSpeed * 399637415).toString();
            } else {
                string = new StringBuilder().append(string).append(-1).toString();
            }
            string = new StringBuilder().append(string).append(" ").toString();
            if (aString8655 != null) {
                string = new StringBuilder().append(string).append(aString8655).toString();
            } else {
                string = new StringBuilder().append(string).append(Class26.comma).toString();
            }
            try {
                if (SettingsManager.settingsManager.toolkitSetting.getValue() == ToolkitOption.SSE) {
                    Class var_class = java.lang.ClassLoader.class;
                    Field field = var_class.getDeclaredField("nativeLibraries");
                    Class var_class_139_ = java.lang.reflect.AccessibleObject.class;
                    Method method = var_class_139_.getDeclaredMethod("setAccessible", (new Class[]{Boolean.TYPE}));
                    method.invoke(field, Boolean.TRUE);
                    Vector vector = (Vector) field.get(GameClient.class.getClassLoader());
                    for (int i_140_ = 0; i_140_ < vector.size(); i_140_++) {
                        try {
                            Object object = vector.elementAt(i_140_);
                            Field field_141_ = object.getClass().getDeclaredField("name");
                            method.invoke(field_141_, Boolean.TRUE);
                            try {
                                String string_142_ = (String) field_141_.get(object);
                                if (null != string_142_ && (string_142_.indexOf("sw3d.dll") != -1)) {
                                    Field field_143_ = object.getClass().getDeclaredField("handle");
                                    method.invoke(field_143_, (new Object[]{Boolean.TRUE}));
                                    string = new StringBuilder().append(string).append(" ").append(Long.toHexString(field_143_.getLong(object))).toString();
                                    method.invoke(field_143_, (new Object[]{Boolean.FALSE}));
                                }
                            } catch (Throwable throwable) {
									/* empty */
                            }
                            method.invoke(field_141_, Boolean.FALSE);
                        } catch (Throwable throwable) {
								/* empty */
                        }
                    }
                }
            } catch (Throwable throwable) {
					/* empty */
            }
        } catch (Throwable throwable) {
				/* empty */
        }
        return string;
    }

    final void method2809(int i) {
        try {
            if ((14 == -1233866115 * gameState && !Class315.method3837()) || (18 == -1233866115 * gameState && 42 == Class360.anInt3871 * -1372893999) || 8 == -1233866115 * gameState) {
                if (shutdownDelay * 1592380953 > 1) {
                    shutdownDelay -= -2090750423;
                    anInt8888 = 1991119277 * anInt8933;
                }
                if (!menuOpen) {
                    StaticMethods.closeMenus();
                }
                for (int index = 0; index < 100; index++) {
                    if (!PacketsDecoder.packetSentSuccessfully(ConnectionType.lobbyConnection)) {
                        break;
                    }
                }
            }
            IComponentUpdateNode.checkComponentUpdateNodes();
            Class336_Sub4.method4104(-320472795);
            animatorTick += 512435497;
            StaticMethods.method3138(-1, -1);
            Class82_Sub17.method918(null, -1, -1, -936647614);
            Class62.method732();
            anInt8933 += -908761385;
            for (int index = 0; index < anInt8772 * 1962237353; index++) {
                NPC npc = ((NPC) aClass298_Sub29Array8816[index].nodeObject);
                if (null == npc) {
                    if (i >= -1655691580) {
						/* empty */
                    }
                } else {
                    byte walkMask = (npc.aClass503_10190.walkMask);
                    if (0 == (walkMask & 0x1)) {
                        if (i >= -1655691580) {
                            return;
                        }
                    } else {
                        int size = npc.getSize();
                        if (0 != (walkMask & 0x2) && 0 == (2050671733 * npc.anInt10120) && Math.random() * 1000.0 < 10.0) {
                            int xDiff = (int) Math.round(Math.random() * 10.0 - 5.0);
                            int yDiff = (int) Math.round(Math.random() * 10.0 - 5.0);
                            if (0 != xDiff || yDiff != 0) {
                                int toX = xDiff + (npc.scenePositionXQueue[0]);
                                int toY = ((npc.scenePositionYQueue[0]) + yDiff);
                                if (toX < 0) {
                                    toX = 0;
                                } else if (toX > (myRegion.getMapWidth() - size - 1)) {
                                    toX = (myRegion.getMapWidth() - size - 1);
                                }
                                if (toY < 0) {
                                    toY = 0;
                                } else if (toY > (myRegion.getMapLength() - size - 1)) {
                                    toY = (myRegion.getMapLength() - size - 1);
                                }
                                int steps = (StaticMethods.calculateRoute((npc.scenePositionXQueue[0]), (npc.scenePositionYQueue[0]), size, StaticMethods.setExtraRoutefinderData(toX, toY, size, size, 0), (myRegion.getSceneClipDataPlane((npc.plane))), true, calculatedScenePositionXs, calculatedScenePositionYs));
                                if (steps > 0) {
                                    if (steps > 9) {
                                        steps = 9;
                                    }
                                    for (int i_159_ = 0; i_159_ < steps; i_159_++) {
                                        npc.scenePositionXQueue[i_159_] = (calculatedScenePositionXs[steps - i_159_ - 1]);
                                        npc.scenePositionYQueue[i_159_] = (calculatedScenePositionYs[steps - i_159_ - 1]);
                                        npc.aByteArray10110[i_159_] = (Class282.aClass282_6540.aByte6542);
                                    }
                                    npc.anInt10120 = steps * -1013322787;
                                }
                            }
                        }
                        StaticMethods.method4141(npc, true);
                        int i_160_ = StaticMethods.method2525(npc, -219055962);
                        Class116.method1270(npc, -1234202907);
                        Class298_Sub32_Sub36.method3373(npc, -2143152965 * Region.anInt3565, 236175727 * Class431.anInt6504, i_160_, -1481572185);
                        GameContext.method5575(npc, -2143152965 * Region.anInt3565, 1554285314);
                        Class473.method6068(npc, (byte) 13);
                        Quaternion quaternion = Quaternion.method2019();
                        quaternion.method2032(CircleAngleTable.toDegrees(npc.aClass386_10084.method4719((byte) 0)), CircleAngleTable.toDegrees(npc.aClass386_10111.method4719((byte) 0)), CircleAngleTable.toDegrees(npc.aClass386_10113.method4719((byte) 0)));
                        npc.method4346(quaternion);
                        quaternion.method2029();
                    }
                }
            }
            if ((19 == gameState * -1233866115 || 18 == gameState * -1233866115 || gameState * -1233866115 == 14 || gameState * -1233866115 == 8) && (!Class315.method3837() || (gameState * -1233866115 == 18 && -1372893999 * Class360.anInt3871 == 42)) && !Class489.method6167()) {
                if (CameraUtils.cameraType * -863531439 == 3) {
                    Class298_Sub39.method3506();
                } else {
                    Class397.method4913();
                }
                if (-1740717447 * GameClient.camPosX >> 9 < 14 || (-1740717447 * GameClient.camPosX >> 9 >= myRegion.getMapWidth() - 14) || GameClient.camPosZ * -299812095 >> 9 < 14 || (-299812095 * GameClient.camPosZ >> 9 >= myRegion.getMapLength() - 14)) {
                    myRegion.sendMapScene(new MapLoadBuffer((MapLoad.aClass266_2848), null));
                }
            }
            for (; ; ) {
                ScriptNode scriptNode = (ScriptNode) aClass453_8660.popHead();
                if (scriptNode == null) {
                    if (i >= -1655691580) {
						/* empty */
                    }
                    break;
                }
                IComponentDefinition class105 = scriptNode.aClass105_7525;
                if (-1309843523 * class105.slot >= 0) {
                    IComponentDefinition class105_161_ = IComponentDefinition.getInterfaceComponent(class105.parentID);
                    if (class105_161_ == null || class105_161_.sada == null || (class105.slot * -1309843523 >= class105_161_.sada.length)) {
                        continue;
                    }
                    if (class105 != (class105_161_.sada[-1309843523 * class105.slot])) {
                        if (i >= -1655691580) {
							/* empty */
                        }
                        continue;
                    }
                }
                Class444.method5889(scriptNode);
            }
            for (; ; ) {
                ScriptNode scriptNode = (ScriptNode) aClass453_8895.popHead();
                if (scriptNode == null) {
                    if (i < -1655691580) {
                        break;
                    }
                    return;
                }
                IComponentDefinition componentDefinition = scriptNode.aClass105_7525;
                if (componentDefinition.slot * -1309843523 >= 0) {
                    IComponentDefinition class105_162_ = IComponentDefinition.getInterfaceComponent(componentDefinition.parentID);
                    if (class105_162_ == null || null == class105_162_.sada || (componentDefinition.slot * -1309843523 >= class105_162_.sada.length)) {
                        continue;
                    }
                    if (componentDefinition != (class105_162_.sada[componentDefinition.slot * -1309843523])) {
                        if (i >= -1655691580) {
							/* empty */
                        }
                        continue;
                    }
                }
                Class444.method5889(scriptNode);
            }
            for (; ; ) {
                ScriptNode scriptNode = (ScriptNode) aClass453_8893.popHead();
                if (scriptNode == null) {
                    if (i >= -1655691580) {
						/* empty */
                    }
                    break;
                }
                IComponentDefinition class105 = scriptNode.aClass105_7525;
                if (-1309843523 * class105.slot >= 0) {
                    IComponentDefinition class105_163_ = IComponentDefinition.getInterfaceComponent(class105.parentID);
                    if (class105_163_ == null || class105_163_.sada == null || (-1309843523 * class105.slot >= class105_163_.sada.length)) {
                        continue;
                    }
                    if ((class105_163_.sada[-1309843523 * class105.slot]) != class105) {
                        if (i >= -1655691580) {
							/* empty */
                        }
                        continue;
                    }
                }
                Class444.method5889(scriptNode);
            }
            if (null != fromIComponentDefinition) {
                Class53.method602();
            }
            if (443738891 * clientTick % 1500 == 0) {
                Class141.method1567();
            }
            if ((-1233866115 * gameState == 14 && !Class315.method3837()) || (gameState * -1233866115 == 18 && 42 == Class360.anInt3871 * -1372893999)) {
                Graphics.method610(99949596);
            }
            Class308.method3784((byte) -37);
            if (aBoolean8736 && (-4876927317316500383L * aLong8892 < TimeUtils.getTime() - 60000L)) {
                StaticMethods.method589();
            }
            for (Class302_Sub2 class302_sub2 = (Class302_Sub2) aClass442_8951.method5868(); class302_sub2 != null; class302_sub2 = ((Class302_Sub2) aClass442_8951.method5872())) {
                if ((long) (-1505693583 * class302_sub2.anInt7647) < TimeUtils.getTime() / 1000L - 5L) {
                    if (class302_sub2.aShort7646 > 0) {
                        PublicMessage.sendPublicMessage(5, 0, "", "", "", new StringBuilder().append(class302_sub2.aString7648).append(Tradution.LOGGED_IN.translate(GameLanguage.CURRENT_LANGUAGE)).toString());
                    }
                    if (class302_sub2.aShort7646 == 0) {
                        PublicMessage.sendPublicMessage(5, 0, "", "", "", new StringBuilder().append(class302_sub2.aString7648).append(Tradution.LOGGED_OUT.translate(GameLanguage.CURRENT_LANGUAGE)).toString());
                    }
                    class302_sub2.unlink();
                }
            }
            if ((14 == gameState * -1233866115 && !Class315.method3837()) || (-1233866115 * gameState == 18 && -1372893999 * Class360.anInt3871 == 42) || 8 == gameState * -1233866115) {
                if (gameState * -1233866115 != 18 && ConnectionType.lobbyConnection.getStream() == null) {
                    StaticMethods.method2001(false);
                } else if (null != ConnectionType.lobbyConnection) {
                    ConnectionType.lobbyConnection.anInt339 += 1797987493;
                    if (ConnectionType.lobbyConnection.anInt339 * 2033675053 > 50) {
                        OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.PING_PACKET, ConnectionType.lobbyConnection.encryptor);
                        ConnectionType.lobbyConnection.sendFrame(outgoingPacketBuffer);
                    }
                    try {
                        ConnectionType.lobbyConnection.flush();
                    } catch (IOException ioexception) {
                        if (18 == -1233866115 * gameState) {
                            ConnectionType.lobbyConnection.stopConnection();
                        } else {
                            StaticMethods.method2001(false);
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("client.gy(").append(')').toString());
        }
    }

    void method2810() {
        try {
            if (-1874843963 * PaddedResourceWorker.protocol.anInt2735 > 276316621 * anInt8694) {
                Class474.activeConnectionInfo.method6058();
                anInt8887 = (PaddedResourceWorker.protocol.anInt2735 * 597723658 - -1674112382);
                if (1634815037 * anInt8887 > 3000) {
                    anInt8887 = 1385487896;
                }
                if (-1874843963 * PaddedResourceWorker.protocol.anInt2735 >= 2 && 2071451041 * PaddedResourceWorker.protocol.anInt2745 == 6) {
                    method2778("js5connect_outofdate");
                    gameState = 1532912722;
                    return;
                }
                if (-1874843963 * PaddedResourceWorker.protocol.anInt2735 >= 1 && 48 == PaddedResourceWorker.protocol.anInt2745 * 2071451041) {
                    method2778("sessionexpired");
                    gameState = 1532912722;
                    return;
                }
                if (-1874843963 * PaddedResourceWorker.protocol.anInt2735 >= 4 && PaddedResourceWorker.protocol.anInt2745 * 2071451041 == -1) {
                    method2778("js5crc");
                    gameState = 1532912722;
                    return;
                }
                if (-1874843963 * PaddedResourceWorker.protocol.anInt2735 >= 4 && Class88.isLoadingScreen(-1233866115 * gameState)) {
                    if (7 == PaddedResourceWorker.protocol.anInt2745 * 2071451041 || PaddedResourceWorker.protocol.anInt2745 * 2071451041 == 9) {
                        method2778("js5connect_full");
                    } else if (2071451041 * PaddedResourceWorker.protocol.anInt2745 > 0) {
                        if (null == aString8698) {
                            method2778("js5connect");
                        } else {
                            method2778(new StringBuilder().append("js5proxy_").append(aString8698.trim()).toString());
                        }
                    } else {
                        method2778("js5io");
                    }
                    gameState = 1532912722;
                    return;
                }
            }
            anInt8694 = 1790042329 * PaddedResourceWorker.protocol.anInt2735;
            if (1634815037 * anInt8887 > 0) {
                anInt8887 -= 2003348245;
            } else {
                try {
                    if (anInt8692 * -333700189 == 0) {
                        Class423.aSocket5355 = Class474.activeConnectionInfo.createSocket();
                        anInt8692 += -244111349;
                    }
                    if (anInt8692 * -333700189 == 1) {
                        Class365_Sub1_Sub5_Sub2.aStream_9940 = Class264_Sub4.method2515(Class423.aSocket5355, 125000);
                        int capacity = 9 + aString8655.length();
                        Buffer buffer = new Buffer(capacity + 2);
                        buffer.writeByte((LoginConnection.UPDATE.type) * -1813470547);
                        buffer.writeByte(capacity);
                        buffer.writeInt(Loader.REVISION);
                        if (Loader.SUB_REVISION != 0) {
                            buffer.writeInt(Loader.SUB_REVISION);
                        }
                        buffer.writeString(aString8655);
                        Class365_Sub1_Sub5_Sub2.aStream_9940.method3868(buffer.buffer, 0, capacity + 2);
                        anInt8692 += -244111349;
                        Class205.aLong2341 = (TimeUtils.getTime() * 3230976033870405335L);
                    }
                    if (2 == -333700189 * anInt8692) {
                        if (Class365_Sub1_Sub5_Sub2.aStream_9940.isAvailable(1)) {
                            byte[] is = new byte[1];
                            int i_165_ = Class365_Sub1_Sub5_Sub2.aStream_9940.readBytes(is, 0, 1);
                            if (is[0] != 0) {
                                method2794(i_165_);
                                return;
                            }
                            anInt8692 += -244111349;
                        } else if ((TimeUtils.getTime() - (Class205.aLong2341 * 4898534346964759783L)) > 30000L) {
                            method2794(1001);
                            return;
                        }
                    }
                    if (anInt8692 * -333700189 == 3) {
                        Class479[] class479s = Class479.getFile();
                        int i_166_ = 4 * class479s.length;
                        if (Class365_Sub1_Sub5_Sub2.aStream_9940.isAvailable(i_166_)) {
                            Buffer class298_sub53 = new Buffer(i_166_);
                            Class365_Sub1_Sub5_Sub2.aStream_9940.readBytes(class298_sub53.buffer, 0, class298_sub53.buffer.length);
                            for (int i_167_ = 0; i_167_ < class479s.length; i_167_++)
                                class479s[i_167_].method6103(class298_sub53.readInt());
                            boolean bool = (Class88.isLoadingScreen(-1233866115 * gameState) || Class413.method5584((-1233866115 * gameState)) || isLobbyConnected((gameState * -1233866115)));
                            PaddedResourceWorker.protocol.init(Class365_Sub1_Sub5_Sub2.aStream_9940, !bool);
                            Class423.aSocket5355 = null;
                            Class365_Sub1_Sub5_Sub2.aStream_9940 = null;
                            anInt8692 = 0;
                        }
                    }
                } catch (IOException ioexception) {
                    method2794(1002);
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("client.fu(").append(')').toString());
        }
    }

    public final void method206() {
        if (isValidHost()) {
            AppletParameter[] appletParameters = AppletParameter.getAppletParameters();
            for (int i = 0; i < appletParameters.length; i++) {
                AppletParameter appletParameter = appletParameters[i];
                String string = applet.getParameter(appletParameter.id);
                if (string != null) {
                    switch (Integer.parseInt(appletParameter.id)) {
                        case 9:
                            StaticMethods.anInt689 = Integer.parseInt(string) * -2071496301;
                            break;
                        case 23:
                            aBoolean8643 = string.equals(Class26.trueBoolean);
                            break;
                        case 33:
                            StaticMethods.aString1369 = string;
                            break;
                        default:
                            IPAddress.reportError("", new RuntimeException());
                            break;
                        case 7:
                            Js5CacheWrite.aString6063 = string;
                            break;
                        case 21:
                            Class474.aClass471_5976 = new IPAddress();
                            Class474.aClass471_5976.worldID = Integer.parseInt(string) * 348739329;
                            break;
                        case 3:
                            aString8655 = string;
                            break;
                        case 12:
                            aBoolean8651 = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 18:
                            if (string.equalsIgnoreCase(Class26.trueBoolean)) {
                                aBoolean8807 = true;
                            }
                            break;
                        case 17:
                            aBoolean8958 = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 11:
                            aBoolean8638 = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 24:
                            aString8649 = string;
                            break;
                        case 27:
                            GameLanguage.CURRENT_LANGUAGE = GameLanguage.getLanguage(Integer.parseInt(string));
                            break;
                        case 30:
                            aBoolean8653 = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 22:
                            aBoolean8639 = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 13:
                            StaticMethods.aClass401_2708 = (Class401) (StaticMethods.method5701(Class401.method4936(-2002441744), Integer.parseInt(string)));
                            if (Class401.aClass401_6552 == StaticMethods.aClass401_2708) {
                                StaticMethods.aClass401_2708 = Class401.aClass401_6560;
                            } else if (!Class401.method4932(StaticMethods.aClass401_2708, 2131067135) && (StaticMethods.aClass401_2708 != Class401.aClass401_6557)) {
                                StaticMethods.aClass401_2708 = Class401.aClass401_6557;
                            }
                            break;
                        case 5:
                            Class350.anInt3758 = Integer.parseInt(string) * -339928991;
                            break;
                        case 32:
                            aLong8645 = Long.parseLong(string) * -4477728998236397853L;
                            break;
                        case 1:
                            offiliateId = Integer.parseInt(string) * 708949575;
                            break;
                        case 6:
                            Class510.aClass444_6221 = Class444.method5888(Integer.parseInt(string), (byte) -72);
                            if (Class510.aClass444_6221 != Class444.aClass444_5605 && (Class510.aClass444_6221 != Class444.aClass444_5602) && (Class444.aClass444_5603 != Class510.aClass444_6221) && (Class510.aClass444_6221 != Class444.aClass444_5604)) {
                                Class510.aClass444_6221 = Class444.aClass444_5604;
                            }
                            break;
                        case 20:
                            if (Class241.lobbyConnectionInfo == null) {
                                Class241.lobbyConnectionInfo = new IPAddress();
                            }
                            Class241.lobbyConnectionInfo.host = string;
                            break;
                        case 8:
                            break;
                        case 2:
                            additionalInfo = string;
                            if (additionalInfo.length() > 100) {
                                additionalInfo = null;
                            }
                            break;
                        case 25:
                            anInt8654 = Integer.parseInt(string) * -431443955;
                            break;
                        case 4:
                            if (Class241.lobbyConnectionInfo == null) {
                                Class241.lobbyConnectionInfo = new IPAddress();
                            }
                            Class241.lobbyConnectionInfo.worldID = Integer.parseInt(string) * 348739329;
                            break;
                        case 31:
                            useJs = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 10:
                            aString8656 = string;
                            break;
                        case 14:
                            break;
                        case 29:
                            if (null != string) {
                                aByteArray8843 = (Class140.method1557(Class328.method3989(string, -1670653072), (byte) 83));
                                if (aByteArray8843.length < 16) {
                                    aByteArray8843 = null;
                                }
                            }
                            break;
                        case 26:
                            game = Class352.method4244(Integer.parseInt(string));
                            break;
                        case 28:
                            anInt8971 = Integer.parseInt(string) * 131907935;
                            if (745003679 * anInt8971 < 0 || 745003679 * anInt8971 >= aColorArray8689.length) {
                                anInt8971 = 0;
                            }
                            break;
                        case 16:
                            aBoolean8680 = string.equals(Class26.trueBoolean);
                            break;
                        case 15:
                            settings = string;
                    }
                }
            }
            if (settings == null) {
                settings = "";
            }
            Class311 class311 = new Class311(775068819 * anInt8794, -791746413 * anInt8803, 351263031 * anInt8727, anInt8910 * -510898275, game.name);
            GameClient.gameClient = this;
            idkyet(class311, game.BUILD_NAME, Class510.aClass444_6221.aString5607, 32 + 1286017487 * Class510.aClass444_6221.anInt5608, Class356.method4268(), 718, 1, aBoolean8653);
        }
    }

    public final void method207() {
        if (isValidHost()) {
            AppletParameter[] appletParameters = AppletParameter.getAppletParameters();
            for (int i = 0; i < appletParameters.length; i++) {
                AppletParameter appletParameter = appletParameters[i];
                String string = applet.getParameter(appletParameter.id);
                if (string != null) {
                    switch (Integer.parseInt(appletParameter.id)) {
                        case 9:
                            StaticMethods.anInt689 = Integer.parseInt(string) * -2071496301;
                            break;
                        case 23:
                            aBoolean8643 = string.equals(Class26.trueBoolean);
                            break;
                        case 33:
                            StaticMethods.aString1369 = string;
                            break;
                        default:
                            IPAddress.reportError("", new RuntimeException());
                            break;
                        case 7:
                            Js5CacheWrite.aString6063 = string;
                            break;
                        case 21:
                            Class474.aClass471_5976 = new IPAddress();
                            Class474.aClass471_5976.worldID = Integer.parseInt(string) * 348739329;
                            break;
                        case 3:
                            aString8655 = string;
                            break;
                        case 12:
                            aBoolean8651 = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 18:
                            if (string.equalsIgnoreCase(Class26.trueBoolean)) {
                                aBoolean8807 = true;
                            }
                            break;
                        case 17:
                            aBoolean8958 = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 11:
                            aBoolean8638 = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 24:
                            aString8649 = string;
                            break;
                        case 27:
                            GameLanguage.CURRENT_LANGUAGE = GameLanguage.getLanguage(Integer.parseInt(string));
                            break;
                        case 30:
                            aBoolean8653 = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 22:
                            aBoolean8639 = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 13:
                            StaticMethods.aClass401_2708 = (Class401) (StaticMethods.method5701(Class401.method4936(-890747284), Integer.parseInt(string)));
                            if (Class401.aClass401_6552 == StaticMethods.aClass401_2708) {
                                StaticMethods.aClass401_2708 = Class401.aClass401_6560;
                            } else if (!Class401.method4932(StaticMethods.aClass401_2708, 2094353987) && (StaticMethods.aClass401_2708 != Class401.aClass401_6557)) {
                                StaticMethods.aClass401_2708 = Class401.aClass401_6557;
                            }
                            break;
                        case 5:
                            Class350.anInt3758 = Integer.parseInt(string) * -339928991;
                            break;
                        case 32:
                            aLong8645 = Long.parseLong(string) * -4477728998236397853L;
                            break;
                        case 1:
                            offiliateId = Integer.parseInt(string) * 708949575;
                            break;
                        case 6:
                            Class510.aClass444_6221 = Class444.method5888(Integer.parseInt(string), (byte) -52);
                            if (Class510.aClass444_6221 != Class444.aClass444_5605 && (Class510.aClass444_6221 != Class444.aClass444_5602) && (Class444.aClass444_5603 != Class510.aClass444_6221) && (Class510.aClass444_6221 != Class444.aClass444_5604)) {
                                Class510.aClass444_6221 = Class444.aClass444_5604;
                            }
                            break;
                        case 20:
                            if (Class241.lobbyConnectionInfo == null) {
                                Class241.lobbyConnectionInfo = new IPAddress();
                            }
                            Class241.lobbyConnectionInfo.host = string;
                            break;
                        case 8:
                            break;
                        case 2:
                            additionalInfo = string;
                            if (additionalInfo.length() > 100) {
                                additionalInfo = null;
                            }
                            break;
                        case 25:
                            anInt8654 = Integer.parseInt(string) * -431443955;
                            break;
                        case 4:
                            if (Class241.lobbyConnectionInfo == null) {
                                Class241.lobbyConnectionInfo = new IPAddress();
                            }
                            Class241.lobbyConnectionInfo.worldID = Integer.parseInt(string) * 348739329;
                            break;
                        case 31:
                            useJs = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 10:
                            aString8656 = string;
                            break;
                        case 14:
                            break;
                        case 29:
                            if (null != string) {
                                aByteArray8843 = (Class140.method1557(Class328.method3989(string, 509279540), (byte) 84));
                                if (aByteArray8843.length < 16) {
                                    aByteArray8843 = null;
                                }
                            }
                            break;
                        case 26:
                            game = Class352.method4244(Integer.parseInt(string));
                            break;
                        case 28:
                            anInt8971 = Integer.parseInt(string) * 131907935;
                            if (745003679 * anInt8971 < 0 || 745003679 * anInt8971 >= aColorArray8689.length) {
                                anInt8971 = 0;
                            }
                            break;
                        case 16:
                            aBoolean8680 = string.equals(Class26.trueBoolean);
                            break;
                        case 15:
                            settings = string;
                    }
                }
            }
            if (settings == null) {
                settings = "";
            }
            Class311 class311 = new Class311(775068819 * anInt8794, -791746413 * anInt8803, 351263031 * anInt8727, anInt8910 * -510898275, game.name);
            GameClient.gameClient = this;
            idkyet(class311, game.BUILD_NAME, Class510.aClass444_6221.aString5607, 32 + 1286017487 * Class510.aClass444_6221.anInt5608, Class356.method4268(), 718, 1, aBoolean8653);
        }
    }

    public final void method208() {
        if (isValidHost()) {
            AppletParameter[] appletParameters = AppletParameter.getAppletParameters();
            for (int i = 0; i < appletParameters.length; i++) {
                AppletParameter appletParameter = appletParameters[i];
                String string = applet.getParameter(appletParameter.id);
                if (string != null) {
                    switch (Integer.parseInt(appletParameter.id)) {
                        case 9:
                            StaticMethods.anInt689 = Integer.parseInt(string) * -2071496301;
                            break;
                        case 23:
                            aBoolean8643 = string.equals(Class26.trueBoolean);
                            break;
                        case 33:
                            StaticMethods.aString1369 = string;
                            break;
                        default:
                            IPAddress.reportError("", new RuntimeException());
                            break;
                        case 7:
                            Js5CacheWrite.aString6063 = string;
                            break;
                        case 21:
                            Class474.aClass471_5976 = new IPAddress();
                            Class474.aClass471_5976.worldID = Integer.parseInt(string) * 348739329;
                            break;
                        case 3:
                            aString8655 = string;
                            break;
                        case 12:
                            aBoolean8651 = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 18:
                            if (string.equalsIgnoreCase(Class26.trueBoolean)) {
                                aBoolean8807 = true;
                            }
                            break;
                        case 17:
                            aBoolean8958 = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 11:
                            aBoolean8638 = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 24:
                            aString8649 = string;
                            break;
                        case 27:
                            GameLanguage.CURRENT_LANGUAGE = GameLanguage.getLanguage(Integer.parseInt(string));
                            break;
                        case 30:
                            aBoolean8653 = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 22:
                            aBoolean8639 = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 13:
                            StaticMethods.aClass401_2708 = (Class401) (StaticMethods.method5701(Class401.method4936(-292786858), Integer.parseInt(string)));
                            if (Class401.aClass401_6552 == StaticMethods.aClass401_2708) {
                                StaticMethods.aClass401_2708 = Class401.aClass401_6560;
                            } else if (!Class401.method4932(StaticMethods.aClass401_2708, 2141395178) && (StaticMethods.aClass401_2708 != Class401.aClass401_6557)) {
                                StaticMethods.aClass401_2708 = Class401.aClass401_6557;
                            }
                            break;
                        case 5:
                            Class350.anInt3758 = Integer.parseInt(string) * -339928991;
                            break;
                        case 32:
                            aLong8645 = Long.parseLong(string) * -4477728998236397853L;
                            break;
                        case 1:
                            offiliateId = Integer.parseInt(string) * 708949575;
                            break;
                        case 6:
                            Class510.aClass444_6221 = Class444.method5888(Integer.parseInt(string), (byte) -74);
                            if (Class510.aClass444_6221 != Class444.aClass444_5605 && (Class510.aClass444_6221 != Class444.aClass444_5602) && (Class444.aClass444_5603 != Class510.aClass444_6221) && (Class510.aClass444_6221 != Class444.aClass444_5604)) {
                                Class510.aClass444_6221 = Class444.aClass444_5604;
                            }
                            break;
                        case 20:
                            if (Class241.lobbyConnectionInfo == null) {
                                Class241.lobbyConnectionInfo = new IPAddress();
                            }
                            Class241.lobbyConnectionInfo.host = string;
                            break;
                        case 8:
                            break;
                        case 2:
                            additionalInfo = string;
                            if (additionalInfo.length() > 100) {
                                additionalInfo = null;
                            }
                            break;
                        case 25:
                            anInt8654 = Integer.parseInt(string) * -431443955;
                            break;
                        case 4:
                            if (Class241.lobbyConnectionInfo == null) {
                                Class241.lobbyConnectionInfo = new IPAddress();
                            }
                            Class241.lobbyConnectionInfo.worldID = Integer.parseInt(string) * 348739329;
                            break;
                        case 31:
                            useJs = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 10:
                            aString8656 = string;
                            break;
                        case 14:
                            break;
                        case 29:
                            if (null != string) {
                                aByteArray8843 = (Class140.method1557(Class328.method3989(string, -315411760), (byte) 64));
                                if (aByteArray8843.length < 16) {
                                    aByteArray8843 = null;
                                }
                            }
                            break;
                        case 26:
                            game = Class352.method4244(Integer.parseInt(string));
                            break;
                        case 28:
                            anInt8971 = Integer.parseInt(string) * 131907935;
                            if (745003679 * anInt8971 < 0 || 745003679 * anInt8971 >= aColorArray8689.length) {
                                anInt8971 = 0;
                            }
                            break;
                        case 16:
                            aBoolean8680 = string.equals(Class26.trueBoolean);
                            break;
                        case 15:
                            settings = string;
                    }
                }
            }
            if (settings == null) {
                settings = "";
            }
            Class311 class311 = new Class311(775068819 * anInt8794, -791746413 * anInt8803, 351263031 * anInt8727, anInt8910 * -510898275, game.name);
            GameClient.gameClient = this;
            idkyet(class311, game.BUILD_NAME, Class510.aClass444_6221.aString5607, 32 + 1286017487 * Class510.aClass444_6221.anInt5608, Class356.method4268(), 718, 1, aBoolean8653);
        }
    }

    public final void method204() {
        if (isValidHost()) {
            AppletParameter[] appletParameters = AppletParameter.getAppletParameters();
            for (int i = 0; i < appletParameters.length; i++) {
                AppletParameter appletParameter = appletParameters[i];
                String string = applet.getParameter(appletParameter.id);
                if (string != null) {
                    switch (Integer.parseInt(appletParameter.id)) {
                        case 9:
                            StaticMethods.anInt689 = Integer.parseInt(string) * -2071496301;
                            break;
                        case 23:
                            aBoolean8643 = string.equals(Class26.trueBoolean);
                            break;
                        case 33:
                            StaticMethods.aString1369 = string;
                            break;
                        default:
                            IPAddress.reportError("", new RuntimeException());
                            break;
                        case 7:
                            Js5CacheWrite.aString6063 = string;
                            break;
                        case 21:
                            Class474.aClass471_5976 = new IPAddress();
                            Class474.aClass471_5976.worldID = Integer.parseInt(string) * 348739329;
                            break;
                        case 3:
                            aString8655 = string;
                            break;
                        case 12:
                            aBoolean8651 = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 18:
                            if (string.equalsIgnoreCase(Class26.trueBoolean)) {
                                aBoolean8807 = true;
                            }
                            break;
                        case 17:
                            aBoolean8958 = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 11:
                            aBoolean8638 = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 24:
                            aString8649 = string;
                            break;
                        case 27:
                            GameLanguage.CURRENT_LANGUAGE = GameLanguage.getLanguage(Integer.parseInt(string));
                            break;
                        case 30:
                            aBoolean8653 = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 22:
                            aBoolean8639 = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 13:
                            StaticMethods.aClass401_2708 = (Class401) (StaticMethods.method5701(Class401.method4936(1007543512), Integer.parseInt(string)));
                            if (Class401.aClass401_6552 == StaticMethods.aClass401_2708) {
                                StaticMethods.aClass401_2708 = Class401.aClass401_6560;
                            } else if (!Class401.method4932(StaticMethods.aClass401_2708, 2074117544) && (StaticMethods.aClass401_2708 != Class401.aClass401_6557)) {
                                StaticMethods.aClass401_2708 = Class401.aClass401_6557;
                            }
                            break;
                        case 5:
                            Class350.anInt3758 = Integer.parseInt(string) * -339928991;
                            break;
                        case 32:
                            aLong8645 = Long.parseLong(string) * -4477728998236397853L;
                            break;
                        case 1:
                            offiliateId = Integer.parseInt(string) * 708949575;
                            break;
                        case 6:
                            Class510.aClass444_6221 = Class444.method5888(Integer.parseInt(string), (byte) -119);
                            if (Class510.aClass444_6221 != Class444.aClass444_5605 && (Class510.aClass444_6221 != Class444.aClass444_5602) && (Class444.aClass444_5603 != Class510.aClass444_6221) && (Class510.aClass444_6221 != Class444.aClass444_5604)) {
                                Class510.aClass444_6221 = Class444.aClass444_5604;
                            }
                            break;
                        case 20:
                            if (Class241.lobbyConnectionInfo == null) {
                                Class241.lobbyConnectionInfo = new IPAddress();
                            }
                            Class241.lobbyConnectionInfo.host = string;
                            break;
                        case 8:
                            break;
                        case 2:
                            additionalInfo = string;
                            if (additionalInfo.length() > 100) {
                                additionalInfo = null;
                            }
                            break;
                        case 25:
                            anInt8654 = Integer.parseInt(string) * -431443955;
                            break;
                        case 4:
                            if (Class241.lobbyConnectionInfo == null) {
                                Class241.lobbyConnectionInfo = new IPAddress();
                            }
                            Class241.lobbyConnectionInfo.worldID = Integer.parseInt(string) * 348739329;
                            break;
                        case 31:
                            useJs = string.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 10:
                            aString8656 = string;
                            break;
                        case 14:
                            break;
                        case 29:
                            if (null != string) {
                                aByteArray8843 = (Class140.method1557(Class328.method3989(string, -394383445), (byte) 114));
                                if (aByteArray8843.length < 16) {
                                    aByteArray8843 = null;
                                }
                            }
                            break;
                        case 26:
                            game = Class352.method4244(Integer.parseInt(string));
                            break;
                        case 28:
                            anInt8971 = Integer.parseInt(string) * 131907935;
                            if (745003679 * anInt8971 < 0 || 745003679 * anInt8971 >= aColorArray8689.length) {
                                anInt8971 = 0;
                            }
                            break;
                        case 16:
                            aBoolean8680 = string.equals(Class26.trueBoolean);
                            break;
                        case 15:
                            settings = string;
                    }
                }
            }
            if (settings == null) {
                settings = "";
            }
            Class311 class311 = new Class311(775068819 * anInt8794, -791746413 * anInt8803, 351263031 * anInt8727, anInt8910 * -510898275, game.name);
            GameClient.gameClient = this;
            idkyet(class311, game.BUILD_NAME, Class510.aClass444_6221.aString5607, 32 + 1286017487 * Class510.aClass444_6221.anInt5608, Class356.method4268(), 718, 1, aBoolean8653);
        }
    }

    public final void method211() {
        if (isValidHost()) {
            AppletParameter[] appletParameters = AppletParameter.getAppletParameters();
            for (int i = 0; i < appletParameters.length; i++) {
                AppletParameter appletParameter = appletParameters[i];
                String parameter = applet.getParameter(appletParameter.id);
                if (parameter != null) {
                    switch (Integer.parseInt(appletParameter.id)) {
                        case 9:
                            StaticMethods.anInt689 = Integer.parseInt(parameter) * -2071496301;
                            break;
                        case 23:
                            aBoolean8643 = parameter.equals(Class26.trueBoolean);
                            break;
                        case 33:
                            StaticMethods.aString1369 = parameter;
                            break;
                        default:
                            IPAddress.reportError("", new RuntimeException());
                            break;
                        case 7:
                            Js5CacheWrite.aString6063 = parameter;
                            break;
                        case 21:
                            Class474.aClass471_5976 = new IPAddress();
                            Class474.aClass471_5976.worldID = Integer.parseInt(parameter) * 348739329;
                            break;
                        case 3:
                            aString8655 = parameter;
                            break;
                        case 12:
                            aBoolean8651 = parameter.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 18:
                            if (parameter.equalsIgnoreCase(Class26.trueBoolean)) {
                                aBoolean8807 = true;
                            }
                            break;
                        case 17:
                            aBoolean8958 = parameter.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 11:
                            aBoolean8638 = parameter.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 24:
                            aString8649 = parameter;
                            break;
                        case 27:
                            GameLanguage.CURRENT_LANGUAGE = GameLanguage.getLanguage(Integer.parseInt(parameter));
                            break;
                        case 30:
                            aBoolean8653 = parameter.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 22:
                            aBoolean8639 = parameter.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 13:
                            StaticMethods.aClass401_2708 = (Class401) (StaticMethods.method5701(Class401.method4936(-1055186700), Integer.parseInt(parameter)));
                            if (Class401.aClass401_6552 == StaticMethods.aClass401_2708) {
                                StaticMethods.aClass401_2708 = Class401.aClass401_6560;
                            } else if (!Class401.method4932(StaticMethods.aClass401_2708, 2064566243) && (StaticMethods.aClass401_2708 != Class401.aClass401_6557)) {
                                StaticMethods.aClass401_2708 = Class401.aClass401_6557;
                            }
                            break;
                        case 5:
                            Class350.anInt3758 = Integer.parseInt(parameter) * -339928991;
                            break;
                        case 32:
                            aLong8645 = Long.parseLong(parameter) * -4477728998236397853L;
                            break;
                        case 1:
                            offiliateId = Integer.parseInt(parameter) * 708949575;
                            break;
                        case 6:
                            Class510.aClass444_6221 = Class444.method5888(Integer.parseInt(parameter), (byte) -68);
                            if (Class510.aClass444_6221 != Class444.aClass444_5605 && (Class510.aClass444_6221 != Class444.aClass444_5602) && (Class444.aClass444_5603 != Class510.aClass444_6221) && (Class510.aClass444_6221 != Class444.aClass444_5604)) {
                                Class510.aClass444_6221 = Class444.aClass444_5604;
                            }
                            break;
                        case 20:
                            if (Class241.lobbyConnectionInfo == null) {
                                Class241.lobbyConnectionInfo = new IPAddress();
                            }
                            Class241.lobbyConnectionInfo.host = parameter;
                            break;
                        case 8:
                            break;
                        case 2:
                            additionalInfo = parameter;
                            if (additionalInfo.length() > 100) {
                                additionalInfo = null;
                            }
                            break;
                        case 25:
                            anInt8654 = Integer.parseInt(parameter) * -431443955;
                            break;
                        case 4:
                            if (Class241.lobbyConnectionInfo == null) {
                                Class241.lobbyConnectionInfo = new IPAddress();
                            }
                            Class241.lobbyConnectionInfo.worldID = Integer.parseInt(parameter) * 348739329;
                            break;
                        case 31:
                            useJs = parameter.equalsIgnoreCase(Class26.trueBoolean);
                            break;
                        case 10:
                            aString8656 = parameter;
                            break;
                        case 14:
                            break;
                        case 29:
                            if (null != parameter) {
                                aByteArray8843 = (Class140.method1557(Class328.method3989(parameter, -1400546512), (byte) 95));
                                if (aByteArray8843.length < 16) {
                                    aByteArray8843 = null;
                                }
                            }
                            break;
                        case 26:
                            game = Class352.method4244(Integer.parseInt(parameter));
                            break;
                        case 28:
                            anInt8971 = Integer.parseInt(parameter) * 131907935;
                            if (745003679 * anInt8971 < 0 || 745003679 * anInt8971 >= aColorArray8689.length) {
                                anInt8971 = 0;
                            }
                            break;
                        case 16:
                            aBoolean8680 = parameter.equals(Class26.trueBoolean);
                            break;
                        case 15:
                            settings = parameter;
                    }
                }
            }
            if (settings == null) {
                settings = "";
            }
            Class311 class311 = new Class311(775068819 * anInt8794, -791746413 * anInt8803, 351263031 * anInt8727, anInt8910 * -510898275, game.name);
            GameClient.gameClient = this;
            idkyet(class311, game.BUILD_NAME, Class510.aClass444_6221.aString5607, 32 + 1286017487 * Class510.aClass444_6221.anInt5608, Class356.method4268(), 718, 1, aBoolean8653);
        }
    }


}
