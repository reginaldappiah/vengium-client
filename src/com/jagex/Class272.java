package com.jagex;/* Class272 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.network.OutgoingPacket;

public class Class272 {
	Class440 aClass440_2899 = new Class440(256);
	Js5FileSystem aClass243_2900;
	Js5FileSystem aClass243_2901;
	Class440 aClass440_2902 = new Class440(256);
	static int anInt2903;

	Class298_Sub26_Sub1 method2549(int i, int i_0_, int[] is, int i_1_) {
		try {
			int i_2_ = i_0_ ^ (i << 4 & 0xffff | i >>> 12);
			i_2_ |= i << 16;
			long l = (long) i_2_;
			Class298_Sub26_Sub1 class298_sub26_sub1 = ((Class298_Sub26_Sub1) this.aClass440_2902.method5852(l));
			if (null != class298_sub26_sub1)
				return class298_sub26_sub1;
			if (is != null && is[0] <= 0)
				return null;
			Class278 class278 = Class278.method2604(this.aClass243_2901, i, i_0_);
			if (class278 == null)
				return null;
			class298_sub26_sub1 = class278.method2601();
			this.aClass440_2902.method5858(class298_sub26_sub1, l);
			if (null != is)
				is[0] -= class298_sub26_sub1.aByteArray9309.length;
			return class298_sub26_sub1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lh.a(").append(')').toString());
		}
	}

	Class298_Sub26_Sub1 method2550(int i, int i_3_, int[] is, int i_4_) {
		try {
			int i_5_ = i_3_ ^ (i << 4 & 0xffff | i >>> 12);
			i_5_ |= i << 16;
			long l = (long) i_5_ ^ 0x100000000L;
			Class298_Sub26_Sub1 class298_sub26_sub1 = ((Class298_Sub26_Sub1) this.aClass440_2902.method5852(l));
			if (null != class298_sub26_sub1)
				return class298_sub26_sub1;
			if (is != null && is[0] <= 0)
				return null;
			Class298_Sub23 class298_sub23 = ((Class298_Sub23) this.aClass440_2899.method5852(l));
			if (class298_sub23 == null) {
				class298_sub23 = Class298_Sub23.method3065((this.aClass243_2900), i, i_3_);
				if (null == class298_sub23)
					return null;
				this.aClass440_2899.method5858(class298_sub23, l);
			}
			class298_sub26_sub1 = class298_sub23.method3067(is);
			if (null == class298_sub26_sub1)
				return null;
			class298_sub23.unlink();
			this.aClass440_2902.method5858(class298_sub26_sub1, l);
			return class298_sub26_sub1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lh.f(").append(')').toString());
		}
	}

	public Class298_Sub26_Sub1 method2551(int i, int[] is, int i_6_) {
		try {
			if (this.aClass243_2901.getContainerLength() == 1)
				return method2549(0, i, is, 1909168122);
			if (this.aClass243_2901.getFileSystem(i) == 1)
				return method2549(i, 0, is, -1018556227);
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lh.b(").append(')').toString());
		}
	}

	public Class298_Sub26_Sub1 method2552(int i, int[] is, byte i_7_) {
		try {
			if (this.aClass243_2900.getContainerLength() == 1)
				return method2550(0, i, is, -745389241);
			if (this.aClass243_2900.getFileSystem(i) == 1)
				return method2550(i, 0, is, -745389241);
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lh.p(").append(')').toString());
		}
	}

	public Class272(Js5FileSystem class243, Js5FileSystem class243_8_) {
		this.aClass243_2901 = class243;
		this.aClass243_2900 = class243_8_;
	}

	static final void method2553(ScriptRuntime class403, int i) {
		try {
			int i_9_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_9_);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[i_9_ >> 16];
			ToMoveIComponentScripts.setIComponentFontID(class105, IComponentDefinitionCollection, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lh.el(").append(')').toString());
		}
	}

	static final void method2554(ScriptRuntime class403, int i) {
		try {
			String string = (String) (class403.objectStack[(class403.objectArgs -= 969361751) * -203050393]);
			OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.ENTER_NAME_PACKET, ConnectionType.gameConnection.encryptor);
			outgoingPacketBuffer.payload.writeByte(string.length() + 1);
			outgoingPacketBuffer.payload.writeString(string);
			ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lh.sb(").append(')').toString());
		}
	}

	static final void method2555(ScriptRuntime runtime) {
			int mapHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			if (mapHash == 797) {
				int width = mapHash >> 14 & 0x3fff;
				int length = mapHash & 0x3fff;
				GameScene gameScene = GameClient.myRegion.getGameScene();
				width -= gameScene.gameSceneBaseX * -1760580017;
				if (width < 0)
					width = 0;
				else if (width >= GameClient.myRegion.getMapWidth())
					width = GameClient.myRegion.getMapWidth();
				length -= 283514611 * gameScene.gameSceneBaseY;
				if (length < 0)
					length = 0;
				else if (length >= GameClient.myRegion.getMapLength())
					length = GameClient.myRegion.getMapLength();
				Class100.anInt1081 = ((width << 9) + 256) * -178575833;
				Class418.anInt5339 = ((length << 9) + 256) * 1001372047;
			} else {
				Class100.anInt1081 = 887;
				Class418.anInt5339 = 88;
			}
	}

	static final void method2556(ScriptRuntime runtime) {
		try {
			SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.groundDecoration, (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]) == 1 ? 1 : 0);
			GameClient.myRegion.method2667();
			ToMoveSettings.encodeBuffer();
			GameClient.sentPreferences = false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lh.ahq(").append(')').toString());
		}
	}

	public static MenuOption method2557() {
		try {
			return Class298_Sub45.aMenuOption_7522;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lh.ai(").append(')').toString());
		}
	}

}
