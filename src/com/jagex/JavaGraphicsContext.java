package com.jagex;

public abstract class JavaGraphicsContext extends RenderContext {
	NativeToolkit toolkit;

	JavaGraphicsContext(NativeToolkit toolkit) {
		this.toolkit = toolkit;
	}

	boolean attach() {
		this.toolkit.method5332();
		return true;
	}

	void updateDimension(int width, int height) {
		if (this == this.toolkit.getFrameContext())
			this.toolkit.method5317();
	}

}
