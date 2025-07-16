package com.jagex;/* Class508 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.ConfigType;

public class Class508 {
	public int configArchiveSize;
	Js5FileSystem aClass243_6215;
	public static Class162 aClass162_6216;

	public Class508(Js5FileSystem class243) {
		new SoftCache(64);
		this.aClass243_6215 = class243;
		configArchiveSize = (this.aClass243_6215.getFileSystem((-1006924897 * (ConfigType.aClass120_1420.type))) * 809853823);
	}

	static final void method6278(ScriptRuntime class403, int i) {
		try {
			class403.integerStackOffset -= -1175642067;
			int i_0_ = (class403.integerStack[681479919 * class403.integerStackOffset]);
			int i_1_ = (class403.integerStack[1 + class403.integerStackOffset * 681479919]);
			int i_2_ = (class403.integerStack[2 + class403.integerStackOffset * 681479919]);
			ToMoveIComponentScripts.method4291((class403.entity.IComponentDefinitionCollection), i_0_ & 0xffff, i_1_, i_2_, class403.currentInstrBool, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("uz.aoo(").append(')').toString());
		}
	}

	static final void method6279(boolean bool) {
		try {
			RsBitsBuffer stream = ConnectionType.gameConnection.bitsBuffer;
			for (;;) {
				if (stream.method3660((-866602563 * (ConnectionType.gameConnection.population))) < 15) {
						break;
				}
				int entityIndex = stream.readBits(15);
				if (32767 == entityIndex) {
					break;
				}
				boolean bool_4_ = false;
				ObjectNode node = ((ObjectNode) GameClient.entityList.get((long) entityIndex));
				if (node == null) {
					NPC npc = (new NPC(GameClient.myRegion.getRegion()));
					npc.entityIndex = 1714292119 * entityIndex;
					node = new ObjectNode(npc);
					GameClient.entityList.connect(node, (long) entityIndex);
					GameClient.aClass298_Sub29Array8816[(GameClient.anInt8772 += -118843751) * 1962237353 - 1] = node;
					bool_4_ = true;
				}
				NPC npc = ((NPC) node.nodeObject);
				GameClient.entityKeys[(GameClient.entitySize += -409937273) * -1230451913 - 1] = entityIndex;
				npc.anInt10075 = -3704423 * GameClient.anInt8707;
				if (null != npc.aClass503_10190 && npc.aClass503_10190.method6242())
					StaticMethods.method2330(npc);
				int i_5_ = (stream.readBits(3) + 4 << 11 & 0x3fff);
				int i_6_;
				if (bool) {
					i_6_ = stream.readBits(8);
					if (i_6_ > 127)
						i_6_ -= 256;
				} else {
					i_6_ = stream.readBits(5);
					if (i_6_ > 15)
						i_6_ -= 32;
				}
				npc.method4464((NPCDefinitionLoader.npcList.load(stream.readBits(15))), 1407104224);
				int i_7_;
				if (bool) {
					i_7_ = stream.readBits(8);
					if (i_7_ > 127)
						i_7_ -= 256;
				} else {
					i_7_ = stream.readBits(5);
					if (i_7_ > 15)
						i_7_ -= 32;
				}
				int i_8_ = stream.readBits(2);
				int i_9_ = stream.readBits(1);
				if (i_9_ == 1)
					GameClient.anIntArray8706[(GameClient.anInt8808 += -386992021) * -976358333 - 1] = entityIndex;
				int i_10_ = stream.readBits(1);
				npc.method4421(-2095128707 * (npc.aClass503_10190.tileSpacesOccupied), -1253182390);
				npc.anInt10115 = (-1186616623 * (-1927065533 * (npc.aClass503_10190.anInt6181) << 3));
				if (bool_4_)
					npc.method4415(i_5_, true, -2079607043);
				npc.method4456(i_8_, i_7_ + (Player.myPlayer.scenePositionXQueue[0]), i_6_ + (Player.myPlayer.scenePositionYQueue[0]), 1 == i_10_, npc.getSize());
				if (npc.aClass503_10190.method6242())
					StaticMethods.method4884(npc.plane, (npc.scenePositionXQueue[0]), (npc.scenePositionYQueue[0]), 0, null, npc, null);
			}
			stream.finishBitAccess();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("uz.jo(").append(')').toString());
		}
	}

}
