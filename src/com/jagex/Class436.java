package com.jagex;/* Class436 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.maths.Matrix43f;
import com.jagex.maths.Matrix4f;
import com.jagex.utils.StringUtils;

public class Class436 {
	static SoftCache aClass348_5464;
	static int anInt5465 = 410;
	static MenuOption aMenuOption_5466;
	static int anInt5467 = -372312112;
	static int anInt5468 = 0;
	static int anInt5469 = 31;
	static LinkedList aClass437_5470;
	static boolean aBoolean5471;
	static MenuOptionNode aMenuOptionNode_5472;
	static int anInt5473 = 0;
	static int anInt5474 = 1;
	static float[] aFloatArray5475;
	static int anInt5476;
	static MenuOption aMenuOption_5477;
    public static int anInt5479;
	static Class453 aClass453_5480;
	static int anInt5481 = 521;
	static CircularDoubleLinkedList aClass461_5482;
	static int anInt5483 = 3;
	public static int anInt5484;
	static int anInt5485 = 31;
	static IComponentDefinition componentDefinition;
	static int anInt5487;
	static int anInt5488 = 2;
	static int anInt5489;
	static int anInt5490;
	static int anInt5491;
	static int anInt5492;
	static Matrix4f aMatrix4f_5493;
	static Matrix4f aMatrix4f_5494;
	static Matrix43f aClass222_5495;
	public static boolean aBoolean5496;
	static int anInt5497 = 2;
	static int anInt5498;
	public static int anInt5499;
	static SoftCache aClass348_5500;
	static SpriteToolkit[] aClass57Array5501;
	static int anInt5502;
	static int anInt5503 = 8;
	static int anInt5504 = 1;
	static Class453 aClass453_5505;
	public static int menuOptionCount;
	static int anInt5507 = 4;
	static int anInt5508 = 5;
	static int anInt5509 = 6;
	static int anInt5510 = 7;
	static Class453 aClass453_5511;

	static {
		aBoolean5471 = false;
		aMenuOptionNode_5472 = null;
		anInt5476 = 0;
		menuOptionCount = 0;
		anInt5479 = 0;
		aClass453_5480 = new Class453();
		aClass437_5470 = new LinkedList(16);
		aClass461_5482 = new CircularDoubleLinkedList();
		aClass453_5511 = new Class453();
		aClass453_5505 = new Class453();
		aClass348_5464 = new SoftCache(30);
		componentDefinition = null;
		anInt5487 = 1021462033;
		anInt5502 = 1325119769;
		anInt5489 = 305664667;
		anInt5490 = -67681267;
		anInt5491 = 0;
		anInt5492 = 0;
		aMatrix4f_5493 = null;
		aMatrix4f_5494 = new Matrix4f();
		aClass222_5495 = new Matrix43f();
		aBoolean5496 = false;
		anInt5498 = 0;
		anInt5499 = -985311877;
		aClass348_5500 = new SoftCache(8);
		aFloatArray5475 = new float[4];
	}

	Class436() throws Throwable {
		throw new Error();
	}

	static final void method5805(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
		try {
			String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, runtime) != null) {
				string = string.substring(0, string.length() - 1);
			}
			componentDefinition.onTargetEnterHook = Class128_Sub2.method1441(string, runtime);
			componentDefinition.hasScript = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("s.mk(").append(')').toString());
		}
	}

	static final void method5806(ScriptRuntime class403, byte i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = (class403.clanChannelChat.method3097((String) (class403.objectStack[((class403.objectArgs -= 969361751) * -203050393)])));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("s.yv(").append(')').toString());
		}
	}

	static final void method5807(ScriptRuntime script, int i) {
		try {
			int i_0_ = script.integerStack[((script.integerStackOffset -= -391880689) * 681479919)];
			if (i_0_ > 255 || i_0_ < 0) {
				i_0_ = 0;
			}
			if (i_0_ != SettingsManager.settingsManager.aClass422_Sub20_7578.getValue()) {
				SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.aClass422_Sub20_7578, i_0_);
				ToMoveSettings.encodeBuffer();
				GameClient.sentPreferences = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("s.ajv(").append(')').toString());
		}
	}

	static String method5808(Buffer class298_sub53, int i, int i_1_) {
		try {
			String string;
			try {
				int i_2_ = class298_sub53.readUnsignedSmart();
				if (i_2_ > i) {
					i_2_ = i;
				}
				byte[] is = new byte[i_2_];
				class298_sub53.offset += (Class106.aClass113_1308.method1245(class298_sub53.buffer, class298_sub53.offset * 385051775, is, 0, i_2_, 200493148)) * 116413311;
				String string_3_ = StringUtils.method556(is, 0, i_2_, -295341968);
				string = string_3_;
			} catch (Exception exception) {
				return "Cabbage";
			}
			return string;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("s.p(").append(')').toString());
		}
	}

	static final void method5809(ScriptRuntime runtime) {
		try {
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.aBoolean8807 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("s.uw(").append(')').toString());
		}
	}

	public static int method5810() {
			return 1465562869 * Class386.anInt4145;
	}
}
