package com.jagex;/* OpenGLToolkitLoader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class OpenGLToolkitLoader extends ToolkitLoader {
	Class30_Sub2_Sub1 aClass30_Sub2_Sub1_8441;

	static OpenGLToolkitLoader method5999(OpenGLGraphicsToolkit glGraphicsToolkit, int pixelsLength, int pixelsWidth, int[] is, int[] is_1_) {
		byte[] pixels = new byte[pixelsLength * pixelsWidth];
		for (int widthIndex = 0; widthIndex < pixelsWidth; widthIndex++) {
			int i_4_ = widthIndex * pixelsLength + is[widthIndex];
			for (int lengthIndex = 0; lengthIndex < is_1_[widthIndex]; lengthIndex++)
				pixels[i_4_++] = (byte) -1;
		}
		return new OpenGLToolkitLoader(glGraphicsToolkit, pixelsLength, pixelsWidth, pixels);
	}

	OpenGLToolkitLoader(OpenGLGraphicsToolkit glGraphicsToolkit, int i, int i_6_, byte[] is) {
		this.aClass30_Sub2_Sub1_8441 = Class30_Sub2_Sub1.method428(glGraphicsToolkit, Class55.aClass55_567, Class77.aClass77_717, i, i_6_, false, is, Class55.aClass55_567);
		this.aClass30_Sub2_Sub1_8441.method420(false, false);
	}
}
