package com.jagex;/* za - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.TimeUtils;

import java.awt.*;

public class za extends RenderContext implements Interface25 {
	SSEGraphicsToolkit aSSEGraphicsToolkit8981;
	Canvas aCanvas8982;
	static long aLong8983;
	int anInt8984;
	int anInt8985;
	long nativeid;
	static boolean aBoolean8986 = false;

	void updateDimension(int width, int height) {
		this.anInt8985 = width;
		this.anInt8984 = height;
		wa(this.aCanvas8982, width, height);
		if (this.aSSEGraphicsToolkit8981.getFrameContext() == this)
			attach();
	}

	public native void ma(boolean bool);

	za(SSEGraphicsToolkit var_SSEGraphicsToolkit, Canvas canvas, int i, int i_1_) {
		this.aSSEGraphicsToolkit8981 = var_SSEGraphicsToolkit;
		this.aCanvas8982 = canvas;
		this.anInt8985 = i;
		this.anInt8984 = i_1_;
		n(var_SSEGraphicsToolkit, this.aCanvas8982, i, i_1_);
	}

	native void ao(int i, int i_2_, int i_3_, int i_4_);

	native void wa(Canvas canvas, int i, int i_5_);

	public int method580() {
		return method581(0, 0);
	}

	public int method581(int i, int i_6_) {
		try {
			synchronized (this.aCanvas8982.getTreeLock()) {
				Dimension dimension = this.aCanvas8982.getSize();
				H(i, i_6_, dimension.width, dimension.height);
				aBoolean8986 = false;
			}
		} catch (Exception exception) {
			method598(exception);
			return -1;
		}
		return 0;
	}

	void method598(Exception exception) {
		if (!aBoolean8986) {
			aLong8983 = TimeUtils.getTime();
			aBoolean8986 = true;
		} else if (TimeUtils.getTime() - aLong8983 < 30000L)
			this.aCanvas8982.repaint();
		else
			throw new RuntimeException(exception.getMessage());
	}

	public int getWidth() {
		return this.anInt8985;
	}

	public int getHeight() {
		return this.anInt8984;
	}

	public void destroy() {
		if (this.aSSEGraphicsToolkit8981.getFrameContext() == this)
			detach();
		ma(true);
		this.nativeid = 0L;
		this.aCanvas8982 = null;
	}

	native void ad(int i, int i_7_, int i_8_, int i_9_);

	boolean detach() {
		return true;
	}

	native void H(int i, int i_10_, int i_11_, int i_12_);

	native void n(SSEGraphicsToolkit var_SSEGraphicsToolkit, Canvas canvas, int i, int i_15_);

	native void ak(SSEGraphicsToolkit var_SSEGraphicsToolkit, Canvas canvas, int i, int i_19_);

	native void aa(SSEGraphicsToolkit var_SSEGraphicsToolkit, Canvas canvas, int i, int i_20_);

	native void ae(int i, int i_21_, int i_22_, int i_23_);

	public native void z(boolean bool);

	boolean attach() {
		this.aSSEGraphicsToolkit8981.PA(this);
		return true;
	}

	native void av(Canvas canvas, int i, int i_24_);
}
