/* OpenGL - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaggl;

import java.awt.*;
import java.util.Hashtable;

public class OpenGL {

    long  peer;
    private static Hashtable b = new Hashtable();
    private Hashtable a;
    private Thread thread;

    public static native void glEnable(int cap);

    public static native void glDisable(int cap);

    public static native void glCullFace(int mode);

    public static native void glPushAttrib(int mask);

    public static native void glPopAttrib();

    public static native void glShadeModel(int mode);

    public static native void glHint(int target, int mode);

    public static native void glFinish();

    public static native void glFlush();

    public static native void glClear(int mask);

    public static native void glClearColor(float red, float blue, float green, float alpha);

    public static native void glClearDepth(float depth);

    public static native void glDepthFunc(int func);

    public static native void glDepthMask(boolean flag);

    public static native void glDepthRange(float nearVal, float farVal);

    public static native void glAlphaFunc(int func, float ref);

    public static native void glColorMask(boolean red, boolean green, boolean blue, boolean alpha);

    public static native void glReadBuffer(int mode);

    public static native void glDrawBuffer(int mode);

    public static native void glMatrixMode(int mode);

    public static native void glPushMatrix();

    public static native void glPopMatrix();

    public static native void glLoadIdentity();

    public static native void glOrtho(double left, double right, double bottom, double top, double nearVal, double farVal);

    public static native void glTranslatef(float x, float y, float z);

    public static native void glRotatef(float angle, float x, float y, float z);

    public static native void glScalef(float x, float y, float z);

    public static native void glLoadMatrixf(float[] matrix, int offset);

    public static native void glMultMatrixf(float[] matrix, int offset);

    public static native void glViewport(int x, int y, int width, int height);

    public static native void glScissor(int x, int y, int width, int height);

    public static native int glGenLists(int range);

    public static native void glDeleteLists(int list, int range);

    public static native void glNewList(int list, int mode);

    public static native void glEndList();

    public static native void glCallList(int list);

    public static native void glBegin(int mode);

    public static native void glVertex2i(int x, int y);

    public static native void glVertex2f(float x, float y);

    public static native void glVertex3f(float x, float y, float z);

    public static native void glNormal3f(float nx, float ny, float nz);

    public static native void glColor3f(float red, float green, float blue);

    public static native void glColor4ub(byte red, byte green, byte blue, byte alpha);

    public static native void glTexCoord3i(int s, int t, int r);

    public static native void glTexCoord2f(float s, float t);

    public static native void glTexCoord3f(float s, float t, float r);

    public static native void glMultiTexCoord3i(int target, int s, int t, int r);

    public static native void glMultiTexCoord2f(int target, float s, float t);

    public static native void glRasterPos2i(int x, int y);

    public static native void glEnd();

    public static native void glEnableClientState(int cap);

    public static native void glDisableClientState(int cap);

    public static native void glClientActiveTexture(int texture);

    public static native void glVertexPointer(int size, int type, int stride, long pointer);

    public static native void glNormalPointer(int type, int stride, long pointer);

    public static native void glColorPointer(int size, int type, int stride, long pointer);

    public static native void glTexCoordPointer(int size, int type, int stride, long pointer);

    public static native void glGenBuffersARB(int i, int[] is, int i_85_);

    public static native void glBindBufferARB(int i, int i_86_);

    public static native void glBufferDataARBa(int i, int i_87_, long l, int i_88_);

    public static native void glBufferDataARBub(int i, int i_89_, byte[] is, int i_90_, int i_91_);

    public static native void glBufferSubDataARBa(int i, int i_92_, int i_93_, long l);

    public static native void glBufferSubDataARBub(int i, int i_94_, int i_95_, byte[] is, int i_96_);

    public static native long glMapBufferARB(int i, int i_97_);

    public static native boolean glUnmapBufferARB(int i);

    public static native void glDeleteBuffersARB(int i, int[] is, int i_98_);

    public static native void glLineWidth(float f);

    public static native void glPointSize(float f);

    public static native void glPolygonMode(int i, int i_99_);

    public static native void glDrawArrays(int i, int i_100_, int i_101_);

    public static native void glDrawElements(int mode, int count, int type, long indicies);

    public static native void glGenTextures(int i, int[] is, int i_104_);

    public static native void glDeleteTextures(int i, int[] is, int i_105_);

    public static native void glActiveTexture(int i);

    public static native void glBindTexture(int i, int i_106_);

    public static native void glTexEnvi(int i, int i_107_, int i_108_);

    public static native void glTexEnvf(int i, int i_109_, float f);

    public static native void glTexEnvfv(int i, int i_110_, float[] fs, int i_111_);

    public static native void glTexGeni(int i, int i_112_, int i_113_);

    public static native void glTexGenfv(int i, int i_114_, float[] fs, int i_115_);

    public static native void glTexParameteri(int i, int i_117_, int i_118_);

    public static native void glGetTexImagei(int i, int i_119_, int i_120_, int i_121_, int[] is, int i_122_);

    public static native void glTexImage1Dub(int i, int i_134_, int i_135_, int i_136_, int i_137_, int i_138_, int i_139_, byte[] is, int i_140_);

    public static native void glCopyTexImage2D(int i, int i_141_, int i_142_, int i_143_, int i_144_, int i_145_, int i_146_, int i_147_);

    public static native void glCopyTexSubImage2D(int i, int i_148_, int i_149_, int i_150_, int i_151_, int i_152_, int i_153_, int i_154_);

    public static native void glTexImage2Di(int i, int i_155_, int i_156_, int i_157_, int i_158_, int i_159_, int i_160_, int i_161_, int[] is, int i_162_);

    public static native void glTexImage2Df(int i, int i_163_, int i_164_, int i_165_, int i_166_, int i_167_, int i_168_, int i_169_, float[] fs, int i_170_);

    public static native void glTexImage2Dub(int i, int i_171_, int i_172_, int i_173_, int i_174_, int i_175_, int i_176_, int i_177_, byte[] is, int i_178_);

    public static native void glTexSubImage2Di(int i, int i_179_, int i_180_, int i_181_, int i_182_, int i_183_, int i_184_, int i_185_, int[] is, int i_186_);

    public static native void glTexSubImage2Df(int i, int i_187_, int i_188_, int i_189_, int i_190_, int i_191_, int i_192_, int i_193_, float[] fs, int i_194_);

    public static native void glTexSubImage2Dub(int i, int i_195_, int i_196_, int i_197_, int i_198_, int i_199_, int i_200_, int i_201_, byte[] is, int i_202_);

    public static native void glCopyTexSubImage3D(int i, int i_203_, int i_204_, int i_205_, int i_206_, int i_207_, int i_208_, int i_209_, int i_210_);

    public static native void glTexImage3Dub(int i, int i_211_, int i_212_, int i_213_, int i_214_, int i_215_, int i_216_, int i_217_, int i_218_, byte[] is, int i_219_);

    public static native void glCompressedTexImage2Dub(int i, int i_220_, int i_221_, int i_222_, int i_223_, int i_224_, int i_225_, byte[] is, int i_226_);

    public static native void glCopyPixels(int i, int i_227_, int i_228_, int i_229_, int i_230_);

    public static native void glReadPixels(int i, int i_231_, int i_232_, int i_233_, int i_234_, int i_235_, int[] is, int i_236_);

    public static native void glPixelStorei(int i, int i_252_);

    public static native void glPixelTransferf(int i, float f);

    public static native void glColorMaterial(int i, int i_253_);

    public static native void glLightf(int i, int i_254_, float f);

    public static native void glLightfv(int i, int i_255_, float[] fs, int i_256_);

    public static native void glLightModelfv(int i, float[] fs, int i_257_);

    public static native void glFogi(int i, int i_260_);

    public static native void glFogf(int i, float f);

    public static native void glFogfv(int i, float[] fs, int i_261_);

    public static native void glBlendFunc(int i, int i_262_);

    public static native void glBlendFuncSeparate(int i, int i_263_, int i_264_, int i_265_);

    public static native void glGenFramebuffersEXT(int i, int[] is, int i_269_);

    public static native void glDeleteFramebuffersEXT(int i, int[] is, int i_270_);

    public static native void glBindFramebufferEXT(int i, int i_271_);

    public static native void glFramebufferTexture2DEXT(int i, int i_272_, int i_273_, int i_274_, int i_275_);

    public static native void glFramebufferRenderbufferEXT(int i, int i_281_, int i_282_, int i_283_);

    public static native int glCheckFramebufferStatusEXT(int i);

    public static native void glBlitFramebufferEXT(int i, int i_284_, int i_285_, int i_286_, int i_287_, int i_288_, int i_289_, int i_290_, int i_291_, int i_292_);

    public static native void glGenerateMipmapEXT(int i);

    public static native void glGenRenderbuffersEXT(int i, int[] is, int i_293_);

    public static native void glDeleteRenderbuffersEXT(int i, int[] is, int i_294_);

    public static native void glBindRenderbufferEXT(int i, int i_295_);

    public static native void glRenderbufferStorageEXT(int i, int i_296_, int i_297_, int i_298_);

    public static native void glRenderbufferStorageMultisampleEXT(int i, int i_299_, int i_300_, int i_301_, int i_302_);

    public static native int glGenProgramARB();

    public static native void glDeleteProgramARB(int target);

    public static native void glBindProgramARB(int target, int program);

    public static native void glProgramStringARB(int target, int format, String string);

    public static native void glProgramLocalParameter4fARB(int target, int index, float x, float y, float z, float w);

    public static native void glProgramLocalParameter4fvARB(int target, int index, float[] params, int i_311_);

    public static native int glCreateProgram();

    public static native int glCreateShader(int shaderType);

    public static native void glDeleteProgram(int i);

    public static native void glDeleteShader(int i);

    public static native void glShaderSource(int i, String string);

    public static native void glCompileShader(int i);

    public static native void glAttachShader(int i, int i_314_);

    public static native void glDetachShader(int i, int i_315_);

    public static native void glLinkProgram(int i);

    public static native void glUseProgram(int i);

    public static native int glGetUniformLocation(int i, String string);

    public static native void glUniform1i(int i, int i_316_);

    public static native void glUniform1f(int i, float f);

    public static native void glUniform2f(int i, float f, float f_317_);

    public static native void glUniform3f(int i, float f, float f_318_, float f_319_);

    public static native void glUniform4f(int i, float f, float f_320_, float f_321_, float f_322_);

    public static native void glUniform2fv(int i, int i_325_, float[] fs, int i_326_);

    public static native void glUniform3fv(int i, int i_327_, float[] fs, int i_328_);

    public static native void glUniform4fv(int i, int i_329_, float[] fs, int i_330_);

    public static native void glGetProgramiv(int i, int i_337_, int[] is, int i_338_);

    public static native void glGetShaderiv(int i, int i_339_, int[] is, int i_340_);

    public static native void glGetProgramInfoLog(int i, int i_341_, int[] is, int i_342_, byte[] is_343_, int i_344_);

    public static native void glGetShaderInfoLog(int shader, int maxLength, int[] is, int i_346_, byte[] is_347_, int i_348_);

    public static native String glGetString(int name);

    public static native void glGetFloatv(int pname, float[] params, int unused);

    public static native void glGetIntegerv(int pname, int[] params, int unused);

    public native long init(Canvas canvas, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_);

    public boolean a(String string) {
        if (null == a) {
            a = new Hashtable();
            String string_5_ = glGetString(7939);
            int i = 0;
            for (; ; ) {
                int i_6_ = string_5_.indexOf(' ', i);
                if (-1 == i_6_)
                    break;
                String string_7_ = string_5_.substring(i, i_6_).trim();
                if (string_7_.length() != 0)
                    a.put(string_7_, string_7_);
                i = i_6_ + 1;
            }
            String string_8_ = string_5_.substring(i).trim();
            if (string_8_.length() != 0)
                a.put(string_8_, string_8_);
        }
        return a.containsKey(string);
    }

    public synchronized boolean f() {
        Thread thread = Thread.currentThread();
        if (attachPeer()) {
            OpenGL openGL = (OpenGL) b.put(thread, this);
            if (openGL != null)
                openGL.thread = null;
            this.thread = thread;
            return true;
        }
        return false;
    }

    public synchronized boolean b() {
        if (thread != Thread.currentThread())
            return false;
        detachPeer();
        b.remove(thread);
        thread = null;
        return true;
    }

    private native boolean attachPeer();

    private native void detachPeer();

    public native long prepareSurface(Canvas canvas);

    public native void surfaceResized(long l);

    public native void releaseSurface(Canvas canvas, long l);

    public native boolean setSurface(long l);

    public native void swapBuffers(long l);

    public native void setSwapInterval(int i);

    public native void release();
}
