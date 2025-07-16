package com.jagex;/* Class301_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.network.OutgoingPacket;

public class Class301_Sub1 extends WorldMapHandler {
	static int anInt7623;
	public static int anInt7624;
	public static int anInt7625;
	static int toolkitoption = -485258093;
	static int anInt7627;
	static boolean aBoolean7628;
	static int anInt7629;
	static int anInt7630;
	static boolean aBoolean7631;
	static int anInt7632;
	static int anInt7633;
	static Class446 aClass446_7634;
	public static boolean aBoolean7635;
	public static LinkedList aClass437_7636;
	public static LinkedList aClass437_7637;
	static String[] aStringArray7638;
	static int anInt7639;

	Class301_Sub1() throws Throwable {
		throw new Error();
	}

	static {
		anInt7624 = 0;
		anInt7632 = 433609607;
		anInt7627 = 789877945;
		aBoolean7628 = false;
		anInt7629 = 1801430445;
		anInt7623 = 1505298155;
		aBoolean7631 = false;
		aStringArray7638 = new String[5];
		anInt7633 = -2138103821;
		anInt7630 = -1998014133;
		aBoolean7635 = false;
		aClass437_7636 = new LinkedList(8);
		aClass437_7637 = new LinkedList(8);
		aClass446_7634 = new Class446(new Class453());
	}

	static final void method3712(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
		try {
			componentDefinition.modelType = -1530138943;
			componentDefinition.modelID = (runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]) * -1825442367;
			StaticMethods.updateComponentTick(componentDefinition);
			if (componentDefinition.slot * -1309843523 == -1 && !IComponentDefinitionCollection.accessed)
				IComponentUpdateNode.appendModelTypeUpdate(componentDefinition.interfaceHash);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("acu.dr(").append(')').toString());
		}
	}

	public static void method3713(int i, int i_0_, int i_1_, String string) {
		try {
			IComponentDefinition class105 = IComponentDefinition.getContainerComponent(i_0_, i_1_);
			if (class105 != null) {
				if (class105.onOptHook != null) {
					ScriptNode scriptNode = new ScriptNode();
					scriptNode.aClass105_7525 = class105;
					scriptNode.anInt7528 = 1654612087 * i;
					scriptNode.aString7523 = string;
					scriptNode.parameters = class105.onOptHook;
					Class444.method5889(scriptNode);
				}
				if (GameClient.getComponentSettings(class105).method3498(i - 1)) {
					ConnectionType connectionType = ConnectionType.getConnectionType();
					if (-1233866115 * GameClient.gameState == 14 || 0 == GameClient.gameState * -1233866115) {
						if (i == 1) {
							OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.ACTION_BUTTON1_PACKET, connectionType.encryptor);
							StaticMethods.method1396(outgoingPacketBuffer, i_0_, i_1_, (-1232467723 * class105.itemID));
							connectionType.sendFrame(outgoingPacketBuffer);
						}
						if (i == 2) {
							OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.ACTION_BUTTON2_PACKET, connectionType.encryptor);
							StaticMethods.method1396(outgoingPacketBuffer, i_0_, i_1_, (class105.itemID * -1232467723));
							connectionType.sendFrame(outgoingPacketBuffer);
						}
						if (i == 3) {
							OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.ACTION_BUTTON3_PACKET, connectionType.encryptor);
							StaticMethods.method1396(outgoingPacketBuffer, i_0_, i_1_, (class105.itemID * -1232467723));
							connectionType.sendFrame(outgoingPacketBuffer);
						}
						if (4 == i) {
							OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.ACTION_BUTTON4_PACKET, connectionType.encryptor);
							StaticMethods.method1396(outgoingPacketBuffer, i_0_, i_1_, (-1232467723 * class105.itemID));
							connectionType.sendFrame(outgoingPacketBuffer);
						}
						if (5 == i) {
							OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.ACTION_BUTTON5_PACKET, connectionType.encryptor);
							StaticMethods.method1396(outgoingPacketBuffer, i_0_, i_1_, (class105.itemID * -1232467723));
							connectionType.sendFrame(outgoingPacketBuffer);
						}
						if (i == 6) {
							OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.ACTION_BUTTON9_PACKET, connectionType.encryptor);
							StaticMethods.method1396(outgoingPacketBuffer, i_0_, i_1_, (-1232467723 * class105.itemID));
							connectionType.sendFrame(outgoingPacketBuffer);
						}
						if (i == 7) {
							OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.ACTION_BUTTON6_PACKET, connectionType.encryptor);
							StaticMethods.method1396(outgoingPacketBuffer, i_0_, i_1_, (class105.itemID * -1232467723));
							connectionType.sendFrame(outgoingPacketBuffer);
						}
						if (i == 8) {
							OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.ACTION_BUTTON7_PACKET, connectionType.encryptor);
							StaticMethods.method1396(outgoingPacketBuffer, i_0_, i_1_, (class105.itemID * -1232467723));
							connectionType.sendFrame(outgoingPacketBuffer);
						}
						if (9 == i) {
							OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.ACTION_BUTTON10_PACKET, connectionType.encryptor);
							StaticMethods.method1396(outgoingPacketBuffer, i_0_, i_1_, (-1232467723 * class105.itemID));
							connectionType.sendFrame(outgoingPacketBuffer);
						}
						if (i == 10) {
							OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.ACTION_BUTTON8_PACKET, connectionType.encryptor);
							StaticMethods.method1396(outgoingPacketBuffer, i_0_, i_1_, (-1232467723 * class105.itemID));
							connectionType.sendFrame(outgoingPacketBuffer);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("acu.kp(").append(')').toString());
		}
	}
}
