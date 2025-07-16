package com.jagex;/* GraphicDrawing - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.StringUtils;

import java.awt.*;
import java.awt.Graphics;
import java.io.IOException;
import java.io.InputStream;

public class GraphicDrawing implements Interface12 {
    Image anImage6425;
    boolean aBoolean6426;
    FontMetrics aFontMetrics6427;
    Color aColor6428;
    Image anImage6429;
    Image anImage6430;
    Image anImage6431;
    int anInt6432;
    int anInt6433;
    Image anImage6434;
    Font aFont6435;
    Image anImage6436;
    int anInt6437;
    Image anImage6438;
    boolean aBoolean6439;
    boolean aBoolean6440;
    int anInt6441;
    int anInt6442;
    int anInt6443;
    int anInt6444;
    int anInt6445;
    Image anImage6446;
    Image anImage6447;
    int anInt6448;
    Image anImage6449;

    GraphicDrawing() {
		/* empty */
    }

    final int method2086(int i) {
        if (this.aBoolean6439)
            return (GameShell.canvasWidth * -2110394505 - i) / 2;
        return 0;
    }

    public void method160(boolean bool) {
        try {
            if (!this.aBoolean6426 && null == this.aFont6435) {
                try {
                    String[] strings = Class365_Sub1_Sub3_Sub1.method4508(GameClient.aString8649, ',');
                    if (strings.length != 23)
                        this.aBoolean6426 = true;
                    this.aBoolean6439 = Boolean.parseBoolean(strings[0]);
                    this.aBoolean6440 = Boolean.parseBoolean(strings[1]);
                    this.anInt6441 = (StringUtils.method1998(strings[2]) * 1964281455);
                    this.anInt6442 = (StringUtils.method1998(strings[3]) * -1706979163);
                    this.anInt6443 = (StringUtils.method1998(strings[4]) * -739282769);
                    this.anInt6444 = (StringUtils.method1998(strings[5]) * 653393239);
                    this.anInt6445 = (StringUtils.method1998(strings[6]) * 1534341113);
                    this.anInt6432 = (StringUtils.method1998(strings[7]) * -698963109);
                    this.anInt6433 = (StringUtils.method1998(strings[8]) * 1938947963);
                    this.anInt6448 = (StringUtils.method1998(strings[9]) * 1454829183);
                    String string = strings[10];
                    int i_1_ = StringUtils.method1998(strings[11]);
                    int i_2_ = StaticMethods.method4924(strings[12].substring(2), 16);
                    this.aFont6435 = new Font(string, 0, i_1_);
                    this.aFontMetrics6427 = DirectXContext.canvas.getFontMetrics(this.aFont6435);
                    this.aColor6428 = new Color(i_2_);
                    MediaTracker mediatracker = new MediaTracker(DirectXContext.canvas);
                    this.anImage6431 = method2089(strings[13]);
                    mediatracker.addImage(this.anImage6431, 0);
                    this.anImage6430 = method2089(strings[14]);
                    mediatracker.addImage(this.anImage6430, 1);
                    this.anImage6425 = method2089(strings[15]);
                    mediatracker.addImage(this.anImage6425, 2);
                    this.anImage6449 = method2089(strings[16]);
                    mediatracker.addImage(this.anImage6449, 3);
                    this.anImage6429 = method2089(strings[17]);
                    mediatracker.addImage(this.anImage6429, 4);
                    this.anImage6434 = method2089(strings[18]);
                    mediatracker.addImage(this.anImage6434, 5);
                    this.anImage6447 = method2089(strings[19]);
                    mediatracker.addImage(this.anImage6447, 6);
                    this.anImage6436 = method2089(strings[20]);
                    mediatracker.addImage(this.anImage6436, 7);
                    this.anImage6446 = method2089(strings[21]);
                    mediatracker.addImage(this.anImage6446, 8);
                    mediatracker.waitForAll();
                    this.anInt6437 = (StringUtils.method1998(strings[22]) * 1655153121);
                } catch (Exception exception) {
                    this.aBoolean6426 = true;
                }
            }
            if (this.aBoolean6426)
                method2087();
            else {
                Graphics graphics = DirectXContext.canvas.getGraphics();
                if (null != graphics) {
                    try {
                        int i_3_ = Class288_Sub1.target.getCurrentPercentage();
                        String string = Class288_Sub1.target.getLoadingScreenText();
                        if (Class298_Sub32_Sub22.anImage9468 == null)
                            Class298_Sub32_Sub22.anImage9468 = (DirectXContext.canvas.createImage(GameShell.canvasWidth * -2110394505, (GameShell.canvasHeight * -1111710645)));
                        Graphics graphics_4_ = Class298_Sub32_Sub22.anImage9468.getGraphics();
                        graphics_4_.setColor(Color.BLACK);
                        graphics_4_.fillRect(0, 0, GameShell.canvasWidth * -2110394505, (GameShell.canvasHeight * -1111710645));
                        int i_5_ = this.anImage6447.getWidth(null);
                        int i_6_ = this.anImage6436.getWidth(null);
                        int i_7_ = this.anImage6446.getWidth(null);
                        int i_8_ = this.anImage6447.getHeight(null);
                        int i_9_ = this.anImage6436.getHeight(null);
                        int i_10_ = this.anImage6446.getHeight(null);
                        graphics_4_.drawImage(this.anImage6447, (method2086(i_5_) + this.anInt6445 * -1077321143 - this.anInt6433 * 510265267 / 2), (method2088(i_8_) + 1216449747 * this.anInt6432), null);
                        int i_11_ = (-1077321143 * this.anInt6445 - 510265267 * this.anInt6433 / 2 + i_5_);
                        int i_12_ = (510265267 * this.anInt6433 / 2 + -1077321143 * this.anInt6445);
                        for (int i_13_ = i_11_; i_13_ <= i_12_; i_13_ += i_7_)
                            graphics_4_.drawImage(this.anImage6446, (method2086(i_5_) + this.anInt6445 * -1077321143 + i_13_), (method2088(i_10_) + 1216449747 * this.anInt6432), null);
                        graphics_4_.drawImage(this.anImage6436, (method2086(i_6_) + this.anInt6445 * -1077321143 + this.anInt6433 * 510265267 / 2), (method2088(i_9_) + this.anInt6432 * 1216449747), null);
                        int i_14_ = this.anImage6425.getWidth(null);
                        int i_15_ = this.anImage6425.getHeight(null);
                        int i_16_ = this.anImage6449.getWidth(null);
                        int i_17_ = this.anImage6449.getHeight(null);
                        int i_18_ = this.anImage6434.getHeight(null);
                        int i_19_ = this.anImage6429.getWidth(null);
                        int i_20_ = this.anImage6429.getHeight(null);
                        int i_21_ = this.anImage6434.getWidth(null);
                        int i_22_ = this.anImage6431.getWidth(null);
                        int i_23_ = this.anImage6430.getWidth(null);
                        int i_24_ = (method2086((-170793393 * this.anInt6443)) + this.anInt6441 * -1610968945);
                        int i_25_ = (method2088((this.anInt6444 * -67617177)) + this.anInt6442 * 315873069);
                        graphics_4_.drawImage(this.anImage6425, i_24_, ((-67617177 * this.anInt6444) - i_15_) / 2 + i_25_, null);
                        graphics_4_.drawImage(this.anImage6449, (i_24_ + -170793393 * this.anInt6443 - i_16_), i_25_ + (this.anInt6444 * -67617177 - i_17_) / 2, null);
                        if (null == this.anImage6438)
                            this.anImage6438 = (DirectXContext.canvas.createImage((this.anInt6443 * -170793393 - i_14_ - i_16_), this.anInt6444 * -67617177));
                        Graphics graphics_26_ = this.anImage6438.getGraphics();
                        for (int i_27_ = 0; i_27_ < (-170793393 * this.anInt6443 - i_14_ - i_16_); i_27_ += i_19_)
                            graphics_26_.drawImage((this.anImage6429), i_27_, 0, null);
                        for (int i_28_ = 0; i_28_ < (this.anInt6443 * -170793393 - i_14_ - i_16_); i_28_ += i_21_)
                            graphics_26_.drawImage(this.anImage6434, i_28_, (-67617177 * this.anInt6444 - i_18_), null);
                        int i_29_ = i_3_ * (this.anInt6443 * -170793393 - i_14_ - i_16_) / 100;
                        if (i_29_ > 0) {
                            Image image = (DirectXContext.canvas.createImage(i_29_, (-67617177 * this.anInt6444 - i_20_ - i_18_)));
                            int i_30_ = image.getWidth(null);
                            Graphics graphics_31_ = image.getGraphics();
                            int i_32_ = (32268833 * this.anInt6437 * Class74.method823(1139144319) / 10 % i_22_);
                            for (int i_33_ = i_32_ - i_22_; i_33_ < i_30_; i_33_ += i_22_)
                                graphics_31_.drawImage((this.anImage6431), i_33_, 0, null);
                            graphics_26_.drawImage(image, 0, i_20_, null);
                        }
                        int i_34_ = i_29_;
                        i_29_ = (this.anInt6443 * -170793393 - i_14_ - i_16_ - i_29_);
                        if (i_29_ > 0) {
                            Image image = (DirectXContext.canvas.createImage(i_29_, (this.anInt6444 * -67617177 - i_20_ - i_18_)));
                            int i_35_ = image.getWidth(null);
                            Graphics graphics_36_ = image.getGraphics();
                            for (int i_37_ = 0; i_37_ < i_35_; i_37_ += i_23_)
                                graphics_36_.drawImage((this.anImage6430), i_37_, 0, null);
                            graphics_26_.drawImage(image, i_34_, i_20_, null);
                        }
                        graphics_4_.drawImage(this.anImage6438, i_24_ + i_14_, i_25_, null);
                        graphics_4_.setFont(this.aFont6435);
                        graphics_4_.setColor(this.aColor6428);
                        graphics_4_.drawString(string, i_24_ + (-170793393 * this.anInt6443 - this.aFontMetrics6427.stringWidth(string)) / 2, (4 + (i_25_ + this.anInt6444 * -67617177 / 2) + this.anInt6448 * 1282855295));
                        graphics.drawImage(Class298_Sub32_Sub22.anImage9468, 0, 0, null);
                    } catch (Exception exception) {
                        this.aBoolean6426 = true;
                    }
                } else
                    DirectXContext.canvas.repaint();
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jm.b(").append(')').toString());
        }
    }

    void method2087() {
        try {
            Class406.method4963(Class288_Sub1.target.getCurrentPercentage(), Class288_Sub1.target.getLoadingScreenText(), GameClient.aColorArray8689[745003679 * GameClient.anInt8971], GameClient.aColorArray8701[GameClient.anInt8971 * 745003679], GameClient.aColorArray8691[745003679 * GameClient.anInt8971]);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jm.i(").append(')').toString());
        }
    }

    public void method149(short i) {
        try {
            StaticMethods.method2047();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jm.k(").append(')').toString());
        }
    }

    public void method150(int i) {
        try {
            /* empty */
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jm.d(").append(')').toString());
        }
    }

    public int method159(byte i) {
        try {
            return 100;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jm.u(").append(')').toString());
        }
    }

    public boolean method153(long l) {
        try {
            return true;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jm.posX(").append(')').toString());
        }
    }

    public int method151(int i) {
        try {
            return 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jm.r(").append(')').toString());
        }
    }

    final int method2088(int i) {
        try {
            if (this.aBoolean6440)
                return (-1111710645 * GameShell.canvasHeight - i) / 2;
            return 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jm.f(").append(')').toString());
        }
    }

    Image method2089(String string) throws IOException {
        try {
            Image image;
            try {
                InputStream inputstream = GameClient.applet.getClass().getClassLoader().getResourceAsStream(string);
                byte[] is = new byte[4000];
                int i_109_ = 0;
                int i_110_;
                while ((i_110_ = inputstream.read()) != -1)
                    is[i_109_++] = (byte) i_110_;
                Image image_111_ = Toolkit.getDefaultToolkit().createImage(is);
                image = image_111_;
            } catch (Exception exception) {
                throw new IOException();
            }
            return image;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jm.p(").append(')').toString());
        }
    }

}
