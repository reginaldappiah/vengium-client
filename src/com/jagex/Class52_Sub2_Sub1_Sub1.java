package com.jagex;/* Class52_Sub2_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.awt.Graphics;
import java.awt.image.*;
import java.util.Hashtable;

public final class Class52_Sub2_Sub1_Sub1 extends DirectXContext {
	Image anImage9986;
	static Class353[] aClass353Array9987;

	Class52_Sub2_Sub1_Sub1(JavaGraphicsToolkit javaGraphicsToolkit, Canvas canvas, int i, int i_1_) {
		super(javaGraphicsToolkit, canvas, i, i_1_);
		new Rectangle();
		method591();
	}

	public int method580() {
			return method581(0, 0);
	}

	public void destroy() {
			/* empty */
	}

	void method591() {
		try {
			super.method591();
			DataBufferInt databufferint = new DataBufferInt((this.anIntArray9076), (this.anIntArray9076).length);
			DirectColorModel directcolormodel = new DirectColorModel(32, 16711680, 65280, 255);
			WritableRaster writableraster = (Raster.createWritableRaster((directcolormodel.createCompatibleSampleModel(this.width * 1038713159, 2061776189 * this.height)), databufferint, null));
			this.anImage9986 = new BufferedImage(directcolormodel, writableraster, false, new Hashtable());
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akh.z(").append(')').toString());
		}
	}

	public final int method581(int i, int i_4_) {
			Graphics graphics = this.directXCanvas.getGraphics();
			graphics.drawImage(this.anImage9986, i, i_4_, this.directXCanvas);
			return 0;
	}

}
