package com.jagex;/* Class230 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;
import com.jagex.network.OutgoingPacket;

public class Class230 {
	static long time;
	static ClientLoadingScreenBar[] aClass227Array2561;
	static Interface12[] anInterface12Array2562;
	static int anInt2563;
    static int anInt2565;
	static boolean aBoolean2567;
	static int[] anIntArray2568 = { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

	static {
		anInt2563 = -64708895;
		anInt2565 = -1430761433;
	}

	Class230() throws Throwable {
		throw new Error();
	}

	static void drawItemComponent(GraphicsToolkit toolkit, IComponentDefinition componentDefinition) {
			boolean bool = ((Js5Configs.itemList.method6085(toolkit, componentDefinition.itemID * -1232467723, -66163287 * componentDefinition.itemQuantity, 547522005 * componentDefinition.outline, ~0xffffff | componentDefinition.shadow * -2065110161, 2097772641 * componentDefinition.anInt1201, (componentDefinition.hasAppearance ? (Player.myPlayer.appearance) : null))) == null);
			if (bool) {
				Class522.aClass453_6283.pushBack(new Class298_Sub14(-1232467723 * componentDefinition.itemID, componentDefinition.itemQuantity * -66163287, componentDefinition.outline * 547522005, (~0xffffff | componentDefinition.shadow * -2065110161), 2097772641 * componentDefinition.anInt1201, componentDefinition.hasAppearance));
				StaticMethods.updateComponentTick(componentDefinition);
			}
	}

	static final void method2126(ScriptRuntime class403, int i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = class105.layerWidth * 1867913305;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("js.pm(").append(')').toString());
		}
	}

	static final void method2127(ScriptRuntime class403, int i) {
		try {
			String string = (String) (class403.objectStack[(class403.objectArgs -= 969361751) * -203050393]);
			OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.aClass198_2034, ConnectionType.lobbyConnection.encryptor);
			outgoingPacketBuffer.payload.writeByte(StaticMethods.method693(string));
			outgoingPacketBuffer.payload.writeString(string);
			ConnectionType.lobbyConnection.sendFrame(outgoingPacketBuffer);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("js.vn(").append(')').toString());
		}
	}
}
