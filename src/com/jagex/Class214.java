package com.jagex;/* Class214 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Class214 implements Runnable {
	File aFile2445 = null;
	String aString2446;
	boolean aBoolean2447;
	boolean aBoolean2448 = false;

	public boolean method1985() {
		try {
			return this.aBoolean2448;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("j.f(").append(')').toString());
		}
	}

	public void run() {
		try {
			Container container = StaticMethods.getParent();
			Frame frame = null;
			if (null != GameClient.windowFrame)
				frame = GameClient.windowFrame;
			else {
				for (/**/; null != container; container = container.getParent()) {
					if (container instanceof Frame) {
						frame = (Frame) container;
						break;
					}
				}
			}
			if (frame == null)
				throw new RuntimeException("");
			JFileChooser jfilechooser = new JFileChooser("");
			jfilechooser.setDialogTitle(this.aString2446);
			jfilechooser.setFileFilter(new FileFilter_Sub1(this, this));
			jfilechooser.setFileSelectionMode(1);
			jfilechooser.setAcceptAllFileFilterUsed(false);
			int i = jfilechooser.showOpenDialog(frame);
			if (i == 0)
				this.aFile2445 = jfilechooser.getSelectedFile();
			this.aBoolean2448 = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("j.run(").append(')').toString());
		}
	}

	public File getFile() {
		try {
			return this.aFile2445;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("j.a(").append(')').toString());
		}
	}

	public Class214(String string, boolean bool) {
		this.aString2446 = string;
		this.aBoolean2447 = bool;
		new Thread(this).start();
	}

	boolean method1987(int i) {
		try {
			return this.aBoolean2447;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("j.b(").append(')').toString());
		}
	}

	static final void method1988(ScriptRuntime class403, byte i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			ToMoveIComponentScripts.method3802(class105, IComponentDefinitionCollection, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("j.fl(").append(')').toString());
		}
	}

	static final void method1989(IComponentDefinition class105, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime class403, byte i) {
		try {
			class105.mouseOverCursor = (class403.integerStack[(class403.integerStackOffset -= -391880689) * 681479919]) * -1122372539;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("j.kb(").append(')').toString());
		}
	}

	static final void method1990(ScriptRuntime class403, int i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			Class135.method1491(class105, class403, 171697285);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("j.qa(").append(')').toString());
		}
	}

	static final void method1991(ScriptRuntime class403, int i) {
		try {
			String string = (String) (class403.objectStack[(class403.objectArgs -= 969361751) * -203050393]);
			StaticMethods.method6299(string);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("j.wq(").append(')').toString());
		}
	}

	static final void method1992(ScriptRuntime class403, int i) {
		try {
			int i_0_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			class403.objectStack[((class403.objectArgs += 969361751) * -203050393 - 1)] = (class403.clanChannelChat.clanMembers[i_0_].playerDisplayName);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("j.xm(").append(')').toString());
		}
	}

	static boolean method1993(int i, int i_1_) {
		try {
			return 57 == i || 58 == i || i == 1007 || i == 25 || 30 == i;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("j.bx(").append(')').toString());
		}
	}

	static final void method1994(ScriptRuntime class403, int i) {
		try {
			String string = null;
			if (StockMarketListing.aClass524_2773 != null)
				string = StockMarketListing.aClass524_2773.getAddressHostName();
			if (null == string)
				string = "";
			class403.objectStack[((class403.objectArgs += 969361751) * -203050393 - 1)] = string;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("j.afh(").append(')').toString());
		}
	}

	public static String method1995(byte[] is, int i, int i_2_, int i_3_) {
		try {
			char[] cs = new char[i_2_];
			int i_4_ = 0;
			int i_5_ = i;
			int i_6_ = i + i_2_;
			while (i_5_ < i_6_) {
				int i_7_ = is[i_5_++] & 0xff;
				int i_8_;
				if (i_7_ < 128) {
					if (0 == i_7_)
						i_8_ = 65533;
					else
						i_8_ = i_7_;
				} else if (i_7_ < 192)
					i_8_ = 65533;
				else if (i_7_ < 224) {
					if (i_5_ < i_6_ && (is[i_5_] & 0xc0) == 128) {
						i_8_ = (i_7_ & 0x1f) << 6 | is[i_5_++] & 0x3f;
						if (i_8_ < 128)
							i_8_ = 65533;
					} else
						i_8_ = 65533;
				} else if (i_7_ < 240) {
					if (1 + i_5_ < i_6_ && (is[i_5_] & 0xc0) == 128 && 128 == (is[1 + i_5_] & 0xc0)) {
						i_8_ = ((i_7_ & 0xf) << 12 | (is[i_5_++] & 0x3f) << 6 | is[i_5_++] & 0x3f);
						if (i_8_ < 2048)
							i_8_ = 65533;
					} else
						i_8_ = 65533;
				} else if (i_7_ < 248) {
					if (2 + i_5_ < i_6_ && 128 == (is[i_5_] & 0xc0) && 128 == (is[i_5_ + 1] & 0xc0) && (is[i_5_ + 2] & 0xc0) == 128) {
						i_8_ = ((i_7_ & 0x7) << 18 | (is[i_5_++] & 0x3f) << 12 | (is[i_5_++] & 0x3f) << 6 | is[i_5_++] & 0x3f);
						if (i_8_ < 65536 || i_8_ > 1114111)
							i_8_ = 65533;
						else
							i_8_ = 65533;
					} else
						i_8_ = 65533;
				} else
					i_8_ = 65533;
				cs[i_4_++] = (char) i_8_;
			}
			return new String(cs, 0, i_4_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("j.a(").append(')').toString());
		}
	}
}
