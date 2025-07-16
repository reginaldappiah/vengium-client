package com.jagex;/* DirectXContext - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

public abstract class DirectXContext extends RenderContext {
    public static Canvas canvas;
    Canvas directXCanvas;
    JavaGraphicsToolkit javaGraphicsToolkit;
    int width;
    int height;
    int[] anIntArray9076;
    float[] aFloatArray9077;
    boolean aBoolean9078;

    DirectXContext(JavaGraphicsToolkit javaGraphicsToolkit, Canvas canvas, int width, int height) {
        this.directXCanvas = canvas;
        this.javaGraphicsToolkit = javaGraphicsToolkit;
        this.width = -1172842377 * width;
        this.height = -374060523 * height;
    }

    final boolean detach() {
        this.aBoolean9078 = false;
        return true;
    }

    void method591() {
        this.anIntArray9076 = new int[(2061776189 * this.height * (1038713159 * this.width))];
        this.aFloatArray9077 = new float[(2061776189 * this.height * (1038713159 * this.width))];
        if (this.aBoolean9078)
            this.javaGraphicsToolkit.method5207(1038713159 * this.width, 2061776189 * this.height, this.anIntArray9076, this.aFloatArray9077);
    }

    final boolean attach() {
        this.javaGraphicsToolkit.method5207(1038713159 * this.width, 2061776189 * this.height, this.anIntArray9076, this.aFloatArray9077);
        this.aBoolean9078 = true;
        return true;
    }

    public int getHeight() {
        return 2061776189 * this.height;
    }

    final void updateDimension(int width, int height) {
        if (width != 1038713159 * this.width || 2061776189 * this.height != height) {
            this.width = -1172842377 * width;
            this.height = -374060523 * height;
            method591();
        }
    }

    public int getWidth() {
        return this.width * 1038713159;
    }

}
