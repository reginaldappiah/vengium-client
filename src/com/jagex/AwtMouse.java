package com.jagex;/* Class319_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.TimeUtils;

import java.awt.*;
import java.awt.event.*;

public class AwtMouse extends MouseRecorder implements MouseListener, MouseMotionListener, MouseWheelListener {
	public static MouseRecorder mouse;
	Class453 records;
	static int anInt7692 = 2;
	int anInt7693;
	int anInt7694;
	static int anInt7695 = 4;
	int anInt7696;
	Class453 aClass453_7697 = new Class453();
	int mouseX;
	int mouseY;
	int anInt7700;
	static int anInt7701 = 1;
	Component component;
	boolean recording;

	public static MouseRecorder create(Component component, boolean bool) {
            return new AwtMouse(component, bool);
    }

	public boolean method3878() {
			return 0 != (-31480187 * this.anInt7696 & 0x1);
	}

	void setComponent(Component component) {
			reset(1230262531);
			this.component = component;
			this.component.addMouseListener(this);
			this.component.addMouseMotionListener(this);
			this.component.addMouseWheelListener(this);
	}

	void reset(int i) {
			if (null != this.component) {
				this.component.removeMouseWheelListener(this);
				this.component.removeMouseMotionListener(this);
				this.component.removeMouseListener(this);
				this.component = null;
				this.anInt7696 = 0;
				this.anInt7700 = 0;
				this.anInt7694 = 0;
				this.anInt7693 = 0;
				this.mouseY = 0;
				this.mouseX = 0;
				this.aClass453_7697 = null;
				this.records = null;
			}
	}

	void updateMousePosition(int x, int y) {
			this.mouseX = x * -213131387;
			this.mouseY = y * -968658837;
			if (this.recording)
				record(-1, x, y, 0);
	}

	public boolean method3887() {
			return (-31480187 * this.anInt7696 & 0x2) != 0;
	}

	AwtMouse(Component component, boolean bool) {
		this.records = new Class453();
		setComponent(component);
		this.recording = bool;
	}

	void record(int type, int mouseX, int mouseY, int mouseRotation) {
			ComponentMouseRecord class298_sub50_sub1 = ComponentMouseRecord.create(type, mouseX, mouseY, TimeUtils.getTime(), mouseRotation);
			this.records.pushBack(class298_sub50_sub1);
	}

	public boolean method3880() {
			return (this.anInt7696 * -31480187 & 0x4) != 0;
	}

	public int getLastY() {
			return this.anInt7700 * 28748355;
	}

	public void stop() {
			reset(868673993);
	}

	public synchronized void mouseClicked(MouseEvent mouseevent) {
			if (mouseevent.isPopupTrigger())
				mouseevent.consume();
	}

	public synchronized void mouseEntered(MouseEvent mouseevent) {
			updateMousePosition(mouseevent.getX(), mouseevent.getY());
	}

	public synchronized void mouseExited(MouseEvent mouseevent) {
			updateMousePosition(mouseevent.getX(), mouseevent.getY());
	}

	int method3909(MouseEvent mouseevent, int i) {
			if (mouseevent.getButton() == 1) {
				if (mouseevent.isMetaDown())
					return 4;
				return 1;
			}
			if (mouseevent.getButton() == 2)
				return 2;
			if (mouseevent.getButton() == 3)
				return 4;
			return 0;
	}

	public synchronized void mousePressed(MouseEvent mouseevent) {
			int i = method3909(mouseevent, 1930435178);
			if (1 == i)
				record(0, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount());
			else if (i == 4)
				record(2, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount());
			else if (2 == i)
				record(1, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount());
			this.anInt7693 = ((2114498315 * this.anInt7693 | i) * 1282483363);
			if (mouseevent.isPopupTrigger())
				mouseevent.consume();
	}

	public synchronized void mouseReleased(MouseEvent mouseevent) {
			int i = method3909(mouseevent, 1755922620);
			if ((2114498315 * this.anInt7693 & i) == 0)
				i = this.anInt7693 * 2114498315;
			if ((i & 0x1) != 0)
				record(3, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount());
			if ((i & 0x4) != 0)
				record(5, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount());
			if ((i & 0x2) != 0)
				record(4, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount());
			this.anInt7693 = (this.anInt7693 * 2114498315 & (i ^ 0xffffffff)) * 1282483363;
			if (mouseevent.isPopupTrigger())
				mouseevent.consume();
	}

	public synchronized void mouseDragged(MouseEvent mouseevent) {
			updateMousePosition(mouseevent.getX(), mouseevent.getY());
	}

	public synchronized void mouseMoved(MouseEvent mouseevent) {
			updateMousePosition(mouseevent.getX(), mouseevent.getY());
	}

	public synchronized void mouseWheelMoved(MouseWheelEvent mousewheelevent) {
			int mouseX = mousewheelevent.getX();
			int mouseY = mousewheelevent.getY();
			int mouseRot = mousewheelevent.getWheelRotation();
			record(6, mouseX, mouseY, mouseRot);
			mousewheelevent.consume();
	}

	public synchronized void sync() {
			this.anInt7694 = this.mouseX * -867321853;
			this.anInt7700 = this.mouseY * -1698396671;
			this.anInt7696 = this.anInt7693 * 866311247;
			Class453 class453 = this.aClass453_7697;
			this.aClass453_7697 = this.records;
			this.records = class453;
			this.records.clean();
	}

	public int getLastX() {
			return this.anInt7694 * 1215441007;
	}

	public MouseRecord nextSubmission() {
		return (MouseRecord) this.aClass453_7697.popHead();
	}

}
