package com.jagex;/* Class229 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.TimeUtils;

import java.awt.*;

public class Class229 implements Interface12 {
    static SoftCache cache;
    static byte[] aByteArray6457 = {31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0};
    static int anInt6459;

    static {
        cache = new SoftCache(128, 4);
    }

    boolean aBoolean6450;
    Class509 aClass509_6451;
    Interface6[] anInterface6Array6453;
    int anInt6454;
    int anInt6455;
    GraphicsToolkit graphicsToolkit;

    Class229(Class509 class509, int i, int i_7_, Class143 class143) {
        this.aClass509_6451 = class509;
        this.anInt6454 = i * 1693369495;
        this.anInt6455 = 1319771587 * i_7_;
        this.anInterface6Array6453 = new Interface6[(this.aClass509_6451.anInterface5Array6217).length];
        for (int i_8_ = 0; i_8_ < this.anInterface6Array6453.length; i_8_++)
            this.anInterface6Array6453[i_8_] = class143.method1572((this.aClass509_6451.anInterface5Array6217[i_8_]), (byte) 86);
    }

    static Class302_Sub5 method2122(byte i) {
        try {
            Class302_Sub5 class302_sub5 = ((Class302_Sub5) Class302_Sub5.aClass442_7661.method5871((byte) 3));
            if (class302_sub5 != null) {
                Class302_Sub5.anInt7662 -= 1704977893;
                return class302_sub5;
            }
            return new Class302_Sub5();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jr.b(").append(')').toString());
        }
    }

    public static int method2123() {
        try {
            if (3.0 == (double) Class301_Sub1.aFloat3234)
                return 37;
            if (4.0 == (double) Class301_Sub1.aFloat3234)
                return 50;
            if (6.0 == (double) Class301_Sub1.aFloat3234)
                return 75;
            if (8.0 == (double) Class301_Sub1.aFloat3234)
                return 100;
            return 200;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jr.cy(").append(')').toString());
        }
    }

    public static void resize() {
        synchronized (GameClient.gameClient) {
            if (null != GameClient.fullScreenFrame) {
					/* empty */
            } else {
                Container container = StaticMethods.getParent();
                if (container == null) {
						/* empty */
                } else {
                    GameClient.frameWidth = container.getSize().width * 1325868603;
                    GameClient.frameHeight = container.getSize().height * -2115832951;
                    if (GameClient.windowFrame == container) {
                        Insets insets = GameClient.windowFrame.getInsets();
                        GameClient.frameWidth -= 1325868603 * (insets.left + insets.right);
                        GameClient.frameHeight -= (insets.bottom + insets.top) * -2115832951;
                    }
                    if (-639974669 * GameClient.frameWidth <= 0)
                        GameClient.frameWidth = 1325868603;
                    if (1282634425 * GameClient.frameHeight <= 0)
                        GameClient.frameHeight = -2115832951;
                    if (Class190.windowMode() != 1)
                        ToMoveSettings.method2283();
                    else {
                        GameShell.canvasWidth = GameClient.anInt8794 * -1494558011;
                        GameClient.leftMargin = ((-639974669 * GameClient.frameWidth - 775068819 * GameClient.anInt8794) / 2 * -753018213);
                        GameShell.canvasHeight = -909258791 * GameClient.anInt8803;
                        GameClient.topMargin = 0;
                    }
                    if (StaticMethods.aClass401_2708 != Class401.aClass401_6557 && -2110394505 * GameShell.canvasWidth < 1024 && (GameShell.canvasHeight * -1111710645 >= 768)) {
							/* empty */
                    }
                    DirectXContext.canvas.setSize(-2110394505 * GameShell.canvasWidth, -1111710645 * GameShell.canvasHeight);
                    if (null != GameClient.activeGraphicsToolkit)
                        GameClient.activeGraphicsToolkit.resize(DirectXContext.canvas, GameShell.canvasWidth * -2110394505, -1111710645 * GameShell.canvasHeight);
                    if (container == GameClient.windowFrame) {
                        Insets insets = GameClient.windowFrame.getInsets();
                        DirectXContext.canvas.setLocation(insets.left + GameClient.leftMargin * 1898544019, GameClient.topMargin * 540368727 + insets.top);
                    } else
                        DirectXContext.canvas.setLocation(GameClient.leftMargin * 1898544019, GameClient.topMargin * 540368727);
                    StaticMethods.method1852();
                    if (GameClient.WINDOW_PANE_ID * -257444687 != -1)
                        Class257.method2453(true, (byte) 8);
                    Class148.clearAWT();
                }
            }
        }
    }

    public void method150(int i) {
            if (this.graphicsToolkit != GameClient.activeGraphicsToolkit) {
                this.graphicsToolkit = GameClient.activeGraphicsToolkit;
                this.aBoolean6450 = true;
            }
            this.graphicsToolkit.clear(3, 0);
            Interface6[] interface6s = this.anInterface6Array6453;
            for (int i_1_ = 0; i_1_ < interface6s.length; i_1_++) {
                Interface6 interface6 = interface6s[i_1_];
                if (null != interface6)
                    interface6.method53();
            }
    }

    public void method160(boolean bool) {
        try {
            bool = true;
            Interface6[] interface6s = this.anInterface6Array6453;
            for (int i_2_ = 0; i_2_ < interface6s.length; i_2_++) {
                Interface6 interface6 = interface6s[i_2_];
                if (interface6 != null)
                    interface6.method58(bool || this.aBoolean6450, (byte) -77);
            }
            this.aBoolean6450 = false;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jr.b(").append(')').toString());
        }
    }

    public int method159(byte i) {
        try {
            int i_3_ = 0;
            Interface6[] interface6s = this.anInterface6Array6453;
            for (int i_4_ = 0; i_4_ < interface6s.length; i_4_++) {
                Interface6 interface6 = interface6s[i_4_];
                if (null == interface6 || interface6.method52(1744525008))
                    i_3_++;
            }
            return i_3_ * 100 / this.anInterface6Array6453.length;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jr.u(").append(')').toString());
        }
    }

    public void method149(short i) {
        try {
            /* empty */
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jr.k(").append(')').toString());
        }
    }

    public boolean method153(long l) {
        try {
            return (TimeUtils.getTime() >= l + (long) (this.anInt6454 * -568263897));
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jr.posX(").append(')').toString());
        }
    }

    public int method151(int i) {
        try {
            return this.anInt6455 * 947763947;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jr.r(").append(')').toString());
        }
    }
}
