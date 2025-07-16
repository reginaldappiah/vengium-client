package com.jagex;/* CanvasWrapper - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.awt.Graphics;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class CanvasWrapper extends Canvas {
	Component component;

	public final void update(Graphics graphics) {
			this.component.update(graphics);
	}

	public final void paint(Graphics graphics) {
			this.component.paint(graphics);
	}

	CanvasWrapper(Component component) {
		this.component = component;
	}
}
