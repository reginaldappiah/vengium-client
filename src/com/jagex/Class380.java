package com.jagex;/* Class380 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.network.OutgoingPacket;

public class Class380 {
	static Class380 aClass380_4100;
	static Class380 aClass380_4101;
	public static Class380 aClass380_4102;
	public static Class380 aClass380_4103 = new Class380(1);
	static Class380 aClass380_4104;
	static Class380 aClass380_4105;
	static Class380 aClass380_4106;
	static Class380 aClass380_4107;
	public int anInt4108;

	static {
		aClass380_4101 = new Class380(2);
		aClass380_4104 = new Class380(3);
		aClass380_4102 = new Class380(4);
		aClass380_4107 = new Class380(5);
		aClass380_4105 = new Class380(6);
		aClass380_4106 = new Class380(7);
		aClass380_4100 = new Class380(8);
	}

	Class380(int i) {
		anInt4108 = 471184109 * i;
	}

	public static void method4678() {
			if (Class386.autoWorld.worldID * 1606920449 != -1)
				Class372.method4589((Class386.autoWorld.worldID * 1606920449), Class386.autoWorld.host);
	}

	static void switchInterfaceItem(IComponentDefinition fromIComponentDefinition, IComponentDefinition toIComponentDefinition) {
			OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.SWITCH_INTERFACE_ITEM_PACKET, ConnectionType.gameConnection.encryptor);
			outgoingPacketBuffer.payload.writeShortLE128(toIComponentDefinition.itemID * -1232467723);
			outgoingPacketBuffer.payload.writeIntV1(fromIComponentDefinition.interfaceHash);
			outgoingPacketBuffer.payload.writeInt(toIComponentDefinition.interfaceHash);
			outgoingPacketBuffer.payload.writeShort(-1309843523 * fromIComponentDefinition.slot);
			outgoingPacketBuffer.payload.writeShortLE128(toIComponentDefinition.slot * -1309843523);
			outgoingPacketBuffer.payload.writeShortLE(fromIComponentDefinition.itemID * -1232467723);
			ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
	}

	static String method4682(IComponentDefinition componentDefinition, int optionIndex) {
			if (!GameClient.getComponentSettings(componentDefinition).method3498(optionIndex) && componentDefinition.onOptHook == null)
				return null;
			if (null == componentDefinition.rightClickOptions || componentDefinition.rightClickOptions.length <= optionIndex || null == componentDefinition.rightClickOptions[optionIndex] || componentDefinition.rightClickOptions[optionIndex].trim().length() == 0) {
				if (GameClient.aBoolean8846)
					return new StringBuilder().append("Hidden-").append(optionIndex).toString();
				return null;
			}
			return componentDefinition.rightClickOptions[optionIndex];
	}
}
