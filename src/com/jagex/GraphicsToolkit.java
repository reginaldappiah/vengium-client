package com.jagex;/* Class_ra - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.maths.Matrix43f;
import com.jagex.maths.Matrix4f;

import java.awt.*;
import java.util.Enumeration;
import java.util.Hashtable;

public abstract class GraphicsToolkit {
    public static Class256 aClass256_5315;
    static boolean[] isUsed = new boolean[8];
    public int id;
    public MaterialRawLoader textures;
    protected GraphicsContext frameContext;
    protected RenderContext renderContext;
    protected Hashtable contextsMap = new Hashtable();
    FrameBufferContext[] frameContextBuffer;
    int contextID = -1780694629;


    GraphicsToolkit(MaterialRawLoader textures) {
        this.frameContextBuffer = new FrameBufferContext[4];
        this.textures = textures;
        int bestId = -1;
        for (int index = 0; index < 8; index++) {
            if (!isUsed[index]) {
                isUsed[index] = true;
                bestId = index;
                break;
            }
        }
        if (bestId == -1)
            throw new IllegalStateException("");
        id = bestId * -1656079683;
    }

    static synchronized GraphicsToolkit createToolkit(int mode, Canvas canvas, MaterialRawLoader textures, Js5FileSystem shaders, int samples, int width, int height) {
        if (mode == ToolkitOption.PUREJAVA)
            return JavaGraphicsToolkit.create(canvas, textures, width, height);
        if (mode == ToolkitOption.SSE)
            return SSEGraphicsToolkit.create(canvas, textures, width, height);
        if (mode == ToolkitOption.OPENGL)
            return OpenGLGraphicsToolkit.create(canvas, textures, samples);
        if (mode == ToolkitOption.OPENGLSPECIAL)
            return OpenGLXGraphicsToolkit.create(canvas, textures, shaders, samples);
        if (mode == ToolkitOption.DIRECTXSPECIAL)
            return DirectXGraphicsToolkit.create(canvas, textures, shaders, samples);
        throw new IllegalArgumentException("");
    }

    public static GraphicsToolkit getCreatedToolkit(int toolkitMode, Canvas canvas, MaterialRawLoader textures, Js5FileSystem shaders, int samples) {
        int canvasWidth = 0;
        int canvasHeight = 0;
        if (canvas != null) {
            Dimension dimension = canvas.getSize();
            canvasWidth = dimension.width;
            canvasHeight = dimension.height;
        }
        return createToolkit(toolkitMode, canvas, textures, shaders, samples, canvasWidth, canvasHeight);
    }

    /*
     * Boolean Datatype
     */
    public abstract boolean isResizable();

    public abstract boolean method4996();

    public abstract boolean at();

    public abstract boolean method5001();

    public abstract boolean isMultisampled();

    public abstract boolean hasBloomToolkits();

    public abstract boolean method5051();

    public abstract boolean method5052();

    public abstract boolean method5054();

    public abstract boolean method5074();

    public abstract boolean method5082();

    public abstract int za();

    public abstract int method5004(int i, int i_27_);

    public abstract int method5017(int i, int i_64_);

    public abstract int method5048();

    public abstract int[] aq(int i, int i_450_, int i_451_, int i_452_);

    abstract RenderContext createRenderFrameContext(Canvas canvas, int i, int i_28_);

    public abstract ToolkitDesciption getDescription();

    public abstract Heap createNativeHeap(int size);

    public abstract Matrix4f cz();

    public abstract Matrix43f method5044();

    public abstract Matrix43f getTransformationMatrix();

    public abstract Matrix4f method5045();

    public abstract FrameBufferContext method5094();

    public abstract SpriteToolkit createSpriteToolkit(Sprite sprite, boolean loaded);

    public abstract FontToolkit createFontToolkit(RSFontMetrics RSFontMetrics, Sprite[] sprites, boolean loaded);

    public abstract ToolkitLoader createClippingMask(int i, int i_130_, int[] is, int[] is_131_);

    public abstract SpriteToolkit method5029(int i, int i_118_, boolean bool, boolean bool_119_);

    public abstract EnvironmentMap method5179(EnvironmentMap class66, EnvironmentMap class66_447_, float f, EnvironmentMap class66_448_);

    public abstract ModelToolkit creatModelToolkit(BaseModel model, int mask, int i_136_, int width, int height);

    public abstract SpriteToolkit method5033(int i, int i_127_, int i_128_, int i_129_, boolean bool);

    public abstract EnvironmentMap createEnvironmentMap(int faceTop, int faceBottom, int faceFront, int faceBack, int faceLeft, int faceRight);

    public abstract SpriteToolkit bu(int[] is, int i, int i_120_, int i_121_, int i_122_, boolean bool);

    public abstract FloorToolkit createLandScapeRenderer(int i, int i_155_, int[][] is, int[][] is_156_, int i_157_, int i_158_, int i_159_);

    abstract void method5023();

    abstract void renderFrame(int i, int i_2_) throws GraphicsFrameException;

    abstract void CA(int i, int i_90_, int i_91_, int i_92_, int i_93_);

    abstract void method5188(float f, float f_469_, float f_470_, float f_471_, float f_472_, float f_473_);

    public abstract void L();

    public abstract void O();

    public abstract void resetClip();

    public abstract void bloomSmn();

    public abstract void method5075();

    public abstract void method5112();

    public abstract void method5176();

    public abstract void J(int i);

    public abstract void method5169(int i);

    public abstract void setModelAmbient(float ambiance);

    public abstract void qa(int[] buffer);

    public abstract void RA(boolean bool);

    public abstract void clean(int i);

    public abstract void method4787(boolean bool);

    public abstract void method5061(boolean bool);

    public abstract void setBufferHeap(Heap heap);

    public abstract void renderParticles(Class69 class69);

    public abstract void cw(Matrix43f matrix43f);

    public abstract void a(EnvironmentMap environmentMap);

    public abstract void clear(int mode, int color);

    public abstract void GA(float f, float f_45_);

    public abstract void method5057(int i, Class78 class78);

    public abstract void method5058(int i, Class78 class78);

    public abstract void setLights(int count, Light[] lightNodes);

    public abstract void drawFog(int color, int intensity, int i_168_);

    public abstract void constrainClip(int x, int y, int width, int height);

    public abstract void setClip(int x, int y, int width, int height);

    public abstract void DA(int i, ToolkitLoader toolkitLoader, int i_173_, int i_174_);

    public abstract void method5187(int i, int i_466_, int i_467_, int i_468_);

    public abstract void method5056(int i, int i_177_, int i_178_, int i_179_);

    public abstract void dr(float f, float f_180_, float f_181_, float[] fs);

    public abstract void method_do(float f, float f_182_, float f_183_, float[] fs);

    public abstract void XA(int x, int y, int i_76_, int color, int dummy);

    public abstract void G(int i, int i_96_, int i_97_, int i_98_, int i_99_);

    public abstract void drawFilledRectangle(int startX, int startY, int endX, int endY, int rgba, int mode);

    public abstract void drawRectangle(int startX, int startY, int endX, int endY, int rgba, int mode);

    public abstract void updateSun(int color, float xPos, float yPos, float xAngle, float yAngle, float zAngle);

    public abstract int method5025(int i, int i_108_, int i_109_, int i_110_, int i_111_, int i_112_);

    public abstract void drawDiagonalLine(int startX, int startY, int endX, int endY, int rgba, int mode);

    public abstract void drawThickDiagonalLine(int startX, int startY, int endX, int endY, int rgba, int lineWidth, int mode);

    public abstract void N(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, byte[] is, int i_15_, int i_16_);

    public abstract void drawDashedLine(int x1, int y1, int x2, int y2, int color, int blendFunc, int dashLength, int spaceLength, int offset);

    public abstract void method5022(int i, int i_100_, int i_101_, int i_102_, int i_103_, int i_104_, ToolkitLoader toolkitLoader, int i_105_, int i_106_);

    public abstract void method5007(int i, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, ToolkitLoader toolkitLoader, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_);

    public abstract void method5020(int i, int i_79_, float f, int i_80_, int i_81_, float f_82_, int i_83_, int i_84_, float f_85_, int i_86_, int i_87_, int i_88_, int i_89_);

    public abstract Interface8_Impl1_Impl2 method5186(int i, int i_465_);

    public final void renderFrame() throws GraphicsFrameException {
        renderFrame(0, 0);
    }

    public final void method4990(int i, int i_3_, int i_4_, int i_5_) {
        XA(i, i_3_, i_4_, i_5_, 1);
    }

    public final GraphicsContext getFrameContext() {
        return frameContext;
    }

    public void getDimension(int[] frameContext) {
        if (renderContext != null) {
            frameContext[0] = renderContext.getWidth();
            frameContext[1] = renderContext.getHeight();
        } else {
            int[] is_23_ = frameContext;
            frameContext[1] = 0;
            is_23_[0] = 0;
        }
    }

    public final void detachRenderContext(Canvas canvas) {
        if (contextsMap.containsKey(canvas)) {
            RenderContext context = (RenderContext) contextsMap.get(canvas);
            context.destroy();
            contextsMap.remove(canvas);
        }
    }

    public final void method5003(Canvas canvas) {
        RenderContext context = (RenderContext) contextsMap.get(canvas);
        if (null == context)
            throw new RuntimeException();
        if (929186669 * this.contextID > 0 || frameContext != renderContext)
            throw new RuntimeException();
        if (frameContext != null)
            frameContext.detach();
        if (this.contextID * 929186669 < 0)
            frameContext = context;
        renderContext = context;
        context.attach();
    }

    public final void method5005(FrameBufferContext class52_sub1) {
        try {
            if (929186669 * this.contextID < 0 || (this.frameContextBuffer[this.contextID * 929186669]) != class52_sub1)
                throw new RuntimeException();
            this.frameContextBuffer[(this.contextID -= 1780694629) * 929186669 + 1] = null;
            class52_sub1.detach();
            if (this.contextID * 929186669 >= 0) {
                frameContext = (this.frameContextBuffer[this.contextID * 929186669]);
                this.frameContextBuffer[this.contextID * 929186669].attach();
            } else {
                frameContext = renderContext;
                renderContext.attach();
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ra.aw(").append(')').toString());
        }
    }

    public final void drawRectangle(int x1, int x2, int y1, int y2, int rgba) {
        drawRectangle(x1, x2, y1, y2, rgba, 1);
    }

    public final void fillRectangle(int x, int y, int width, int height, int rgba) {
        drawFilledRectangle(x, y, width, height, rgba, 1);
    }

    public final void method5016(int i, int i_60_, int i_61_, int i_62_) {
        try {
            CA(i, i_60_, i_61_, i_62_, 1);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ra.am(").append(')').toString());
        }
    }

    public final void drawDiagnolLine(int x1, int y1, int x2, int y2, int color) {
        try {
            drawDiagonalLine(x1, y1, x2, y2, color, 1);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ra.be(").append(')').toString());
        }
    }

    public SpriteToolkit createRenderSprite(int[] pixels, int mode, int i_123_, int width, int height) {
        return bu(pixels, mode, i_123_, width, height, true);
    }

    public final void method5035(int i, int i_132_, int i_133_, int i_134_) {
        try {
            G(i, i_132_, i_133_, i_134_, 1);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ra.bf(").append(')').toString());
        }
    }

    public boolean method5041() {
        try {
            return true;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ra.cx(").append(')').toString());
        }
    }

    public SpriteToolkit method5046(int i, int i_165_, boolean bool, int i_166_) {
        try {
            return method5029(i, i_165_, bool, false);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ra.bq(").append(')').toString());
        }
    }

    public Light createLight(int x, int y, int z, int range, int color, float intensity) {
        try {
            return new Light(x, y, z, range, color, intensity);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ra.cg(").append(')').toString());
        }
    }

    public void destroy() {
            isUsed[580915349 * id] = false;
            Enumeration enumeration = contextsMap.keys();
            while (enumeration.hasMoreElements()) {
                Canvas canvas = (Canvas) enumeration.nextElement();
                RenderContext context = (RenderContext) contextsMap.get(canvas);
                context.destroy();
            }
            method5023();
    }

    public final void switchContext(FrameBufferContext context) {
        try {
            if (929186669 * this.contextID >= 3)
                throw new RuntimeException();
            if (this.contextID * 929186669 >= 0)
                this.frameContextBuffer[929186669 * this.contextID].detach();
            else
                renderContext.detach();
            frameContext = this.frameContextBuffer[(this.contextID += 1780694629) * 929186669] = context;
            context.attach();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ra.af(").append(')').toString());
        }
    }

    final RenderContext getRenderContext() {
        try {
            return renderContext;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ra.ah(").append(')').toString());
        }
    }

    final void attachRenderContext(Canvas canvas, RenderContext context) {
        try {
            if (context == null)
                throw new RuntimeException();
            contextsMap.put(canvas, context);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ra.al(").append(')').toString());
        }
    }

    public void method5152(float f, float f_396_, float f_397_) {
        try {
            method5188(f, f_396_, f_397_, 0.0F, 1.0F, 1.0F);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ra.ce(").append(')').toString());
        }
    }

    public abstract boolean method5159();

    public final void attach(Canvas canvas, int width, int height) {
        if (!contextsMap.containsKey(canvas)) {
            TranslatedCanvas.setIgnoreRepaint(canvas);
            attachRenderContext(canvas, createRenderFrameContext(canvas, width, height));
        }
    }

    public final void resize(Canvas canvas, int width, int height) {
        RenderContext context = (RenderContext) contextsMap.get(canvas);
        if (null == context)
            throw new RuntimeException();
        context.updateDimension(width, height);
    }

    public abstract void ci(Matrix4f matrix4f);

    protected void finalize() {
        destroy();
    }
}
