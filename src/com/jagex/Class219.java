package com.jagex;/* Class219 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.TimeUtils;

public class Class219 implements Runnable {
    volatile boolean aBoolean2464;
    ClientLoadingScreenBar loadingScreenBar;
    Interface12 anInterface12_2466 = new GraphicDrawing();
    Interface12 anInterface12_2467 = null;
    long aLong2468;
    int anInt2469;
    long time;
    String loadingScreenText;
    int currentPercentage;
    boolean aBoolean2473;

    Class219() {

    }

    int method2033(int i) {
        return -514341095 * this.anInt2469;
    }

    public ClientLoadingScreenBar getLoadingScreenBar() {
        return this.loadingScreenBar;
    }

    synchronized boolean method2035(int i) {
        return (this.anInterface12_2466.method153(this.aLong2468 * 6015775630087136145L));
    }

    synchronized void method2036(Interface12 interface12) {
        this.anInterface12_2467 = this.anInterface12_2466;
        this.anInterface12_2466 = interface12;
        this.aLong2468 = TimeUtils.getTime() * -5051392830202741391L;
    }

    synchronized void method2037() {
        this.aBoolean2473 = true;
    }

    public int getCurrentPercentage() {
        return -1457416349 * this.currentPercentage;
    }

    public String getLoadingScreenText() {
        return this.loadingScreenText;
    }

    public long getTime() {
        return 3605481893406255809L * this.time;
    }

    public int method2041() {
        if (null == this.loadingScreenBar)
            return 0;
        int i_0_ = -861845079 * this.loadingScreenBar.anInt2548;
        if (this.loadingScreenBar.aBoolean2550 && (-1457416349 * this.currentPercentage < -1620354451 * this.loadingScreenBar.finishPercentage))
            return 1 + this.currentPercentage * -1457416349;
        if (i_0_ < 0 || i_0_ >= Class230.aClass227Array2561.length - 1)
            return 100;
        if (this.currentPercentage * -1457416349 == (360399239 * this.loadingScreenBar.startPercentage))
            return (-1620354451 * (this.loadingScreenBar.finishPercentage));
        return (360399239 * this.loadingScreenBar.startPercentage);
    }

    void method2042() {
        this.aBoolean2464 = true;
    }

    public void run() {
        try {
            while (!this.aBoolean2464) {
                long timeMs = TimeUtils.getTime();
                synchronized (this) {
                    try {
                        this.anInt2469 += -1941002967;
                        if (this.anInterface12_2466 instanceof GraphicDrawing)
                            this.anInterface12_2466.method160(this.aBoolean2473);
                        else {
                            long l_1_ = TimeUtils.getTime();
                            if (GameClient.activeGraphicsToolkit != null && null != this.anInterface12_2467 && this.anInterface12_2467.method151(73548607) != 0 && ((6015775630087136145L * this.aLong2468) >= l_1_ - (long) (this.anInterface12_2467.method151(-462627527)))) {
                                int i = (int) ((l_1_ - (6015775630087136145L * (this.aLong2468))) * 255L / (long) (this.anInterface12_2467.method151(-362403732)));
                                int i_2_ = 255 - i;
                                i = i << 24 | 0xffffff;
                                i_2_ = i_2_ << 24 | 0xffffff;
                                Class148.clearAWT();
                                GameClient.activeGraphicsToolkit.clear(1, 0);
                                SpriteToolkit class57 = (GameClient.activeGraphicsToolkit.method5046(-2110394505 * GameShell.canvasWidth, (-1111710645 * GameShell.canvasHeight), true, -34894995));
                                FrameBufferContext class52_sub1 = GameClient.activeGraphicsToolkit.method5094();
                                class52_sub1.method563(0, class57.method627());
                                GameClient.activeGraphicsToolkit.switchContext(class52_sub1);
                                this.anInterface12_2467.method160(true);
                                GameClient.activeGraphicsToolkit.method5005(class52_sub1);
                                class57.draw(0, 0, 0, i_2_, 1);
                                GameClient.activeGraphicsToolkit.switchContext(class52_sub1);
                                GameClient.activeGraphicsToolkit.clear(1, 0);
                                this.anInterface12_2466.method160(true);
                                GameClient.activeGraphicsToolkit.method5005(class52_sub1);
                                class57.draw(0, 0, 0, i, 1);
                            } else {
                                if (this.anInterface12_2467 != null) {
                                    this.aBoolean2473 = true;
                                    this.anInterface12_2467.method149((short) 371);
                                    this.anInterface12_2467 = null;
                                }
                                if (this.aBoolean2473) {
                                    Class148.clearAWT();
                                    if (GameClient.activeGraphicsToolkit != null)
                                        GameClient.activeGraphicsToolkit.clear(1, 0);
                                }
                                this.anInterface12_2466.method160((this.aBoolean2473 || (GameClient.activeGraphicsToolkit != null && GameClient.activeGraphicsToolkit.method5074())));
                            }
                            try {
                                if (null != GameClient.activeGraphicsToolkit && !(this.anInterface12_2466 instanceof GraphicDrawing))
                                    GameClient.activeGraphicsToolkit.renderFrame();
                            } catch (GraphicsFrameException exception_sub1) {
                                IPAddress.reportError(new StringBuilder().append(exception_sub1.getMessage()).append(GameClient.gameClient.method2761()).toString(), exception_sub1);
                                Class370.loadingPleaseWait(ToolkitOption.PUREJAVA, true);
                            }
                        }
                        this.aBoolean2473 = false;
                        if (null != GameClient.activeGraphicsToolkit && !(this.anInterface12_2466 instanceof GraphicDrawing) && ((this.loadingScreenBar.anInt2548 * -861845079) < (-861845079 * ClientLoadingScreenBar.aClass227_2545.anInt2548)))
                            Class229.resize();
                    } catch (Exception exception) {
                        continue;
                    }
                }
                long l_3_ = TimeUtils.getTime();
                int i = (int) (20L - (l_3_ - timeMs));
                if (i > 0)
                    IPAddress.method6060((long) i);
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jf.run(").append(')').toString());
        }
    }

    synchronized void updateLoadingBarPercentage(long time, String string, int currentPercentage, ClientLoadingScreenBar loadingScreenBar) {
        this.time = 1707169404099388737L * time;
        this.loadingScreenText = string;
        this.currentPercentage = currentPercentage * -1376476597;
        this.loadingScreenBar = loadingScreenBar;
    }
}
