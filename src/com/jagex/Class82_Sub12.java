package com.jagex;/* Class82_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.network.OutgoingPacket;

public class Class82_Sub12 extends Class82 {
	int anInt6862;
	int anInt6863;
	int anInt6865;
	int anInt6866;
	int anInt6867;

	public void method866() {
		try {
			Class87.aClass94Array794[this.anInt6862 * -2006974637].method1018(this.anInt6863 * -101561809, 381156897 * this.anInt6867, this.anInt6865 * -371026667, this.anInt6866 * -1672595375, -1330038095);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("xy.f(").append(')').toString());
		}
	}

	public void method869() {
		Class87.aClass94Array794[this.anInt6862 * -2006974637].method1018(this.anInt6863 * -101561809, 381156897 * this.anInt6867, this.anInt6865 * -371026667, this.anInt6866 * -1672595375, -755082394);
	}

	Class82_Sub12(Buffer class298_sub53) {
		super(class298_sub53);
		this.anInt6862 = class298_sub53.readUShort() * 1766759643;
		int i = class298_sub53.readInt();
		this.anInt6863 = 1505574095 * (i >>> 16);
		this.anInt6867 = 1475544545 * (i & 0xffff);
		this.anInt6865 = class298_sub53.readUByte() * 472584765;
		this.anInt6866 = class298_sub53.readSmartShort() * -1870262095;
	}

	public void method868() {
		Class87.aClass94Array794[this.anInt6862 * -2006974637].method1018(this.anInt6863 * -101561809, 381156897 * this.anInt6867, this.anInt6865 * -371026667, this.anInt6866 * -1672595375, -2023756610);
	}

	public static void method909(String string, int i) {
		try {
			if (GameClient.interfaceSelected && (-112110875 * StaticMethods.anInt3192 & 0x18) != 0) {
				boolean bool = false;
				int i_0_ = 1168366243 * Class10.entitiesInRegion;
				int[] is = Class10.players;
				for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
					Player class365_sub1_sub1_sub2_sub2 = (GameClient.entities[is[i_1_]]);
					if (class365_sub1_sub1_sub2_sub2.accountName != null && class365_sub1_sub1_sub2_sub2.accountName.equalsIgnoreCase(string) && (((class365_sub1_sub1_sub2_sub2 == Player.myPlayer) && 0 != (StaticMethods.anInt3192 * -112110875 & 0x10)) || 0 != (-112110875 * StaticMethods.anInt3192 & 0x8))) {
						OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.INTERFACE_ON_PLAYER, (ConnectionType.gameConnection.encryptor));
						outgoingPacketBuffer.payload.writeShort(GameClient.itemID * 1408085039);
						outgoingPacketBuffer.payload.writeShort(is[i_1_]);
						outgoingPacketBuffer.payload.writeIntV2(1262526353 * Class379.interfaceHash);
						outgoingPacketBuffer.payload.writeShortLE128(GameClient.containerComponent * 392084321);
						outgoingPacketBuffer.payload.write128Byte(0);
						ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
						int i_2_ = class365_sub1_sub1_sub2_sub2.getSize();
						Class82_Sub21.method938(class365_sub1_sub1_sub2_sub2.scenePositionXQueue[0], class365_sub1_sub1_sub2_sub2.scenePositionYQueue[0], true, Class336.method3963((class365_sub1_sub1_sub2_sub2.scenePositionXQueue[0]), (class365_sub1_sub1_sub2_sub2.scenePositionYQueue[0]), i_2_, i_2_, 0));
						bool = true;
						break;
					}
				}
				if (!bool)
					FontToolkit.sendMessage(4, new StringBuilder().append(Tradution.UNABLE_TO_FIND.translate(GameLanguage.CURRENT_LANGUAGE)).append(string).toString());
				if (GameClient.interfaceSelected)
					IComponentDefinition.method1587();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("xy.kf(").append(')').toString());
		}
	}
}
