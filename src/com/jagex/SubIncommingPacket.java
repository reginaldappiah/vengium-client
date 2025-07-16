package com.jagex;/* Class206 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;

public class SubIncommingPacket {
	public static SubIncommingPacket aClass206_2342;
	public static SubIncommingPacket aClass206_2343;
	public static SubIncommingPacket REMOVE_GROUND_ITEM_PACKET;
	public static SubIncommingPacket DESTROY_OBJECT_PACKET;
	public static SubIncommingPacket aClass206_2346;
	public static SubIncommingPacket aClass206_2347 = new SubIncommingPacket(6);
	public static SubIncommingPacket aClass206_2348;
	static SpriteToolkit[] aClass57Array2349;
	public static SubIncommingPacket SPAWN_OBJECT_PACKET;
	public static SubIncommingPacket SEND_GROUND_ITEM_PACKET;
	public static SubIncommingPacket TILE_MESSAGE_PACKET;
	public static SubIncommingPacket aClass206_2353;
	public static SubIncommingPacket aClass206_2354;
	public static SubIncommingPacket PROJECTILE_PACKET;
	public static SubIncommingPacket aClass206_2356;
	public static SubIncommingPacket aClass206_2357;

	SubIncommingPacket(int i) {
		/* empty */
	}

	static {
		aClass206_2343 = new SubIncommingPacket(7);
		REMOVE_GROUND_ITEM_PACKET = new SubIncommingPacket(3);
		DESTROY_OBJECT_PACKET = new SubIncommingPacket(2);
		aClass206_2346 = new SubIncommingPacket(19);
		TILE_MESSAGE_PACKET = new SubIncommingPacket(-1);
		PROJECTILE_PACKET = new SubIncommingPacket(16);
		aClass206_2356 = new SubIncommingPacket(8);
		SPAWN_OBJECT_PACKET = new SubIncommingPacket(6);
		SEND_GROUND_ITEM_PACKET = new SubIncommingPacket(5);
		aClass206_2357 = new SubIncommingPacket(7);
		aClass206_2353 = new SubIncommingPacket(8);
		aClass206_2354 = new SubIncommingPacket(-1);
		aClass206_2342 = new SubIncommingPacket(9);
		aClass206_2348 = new SubIncommingPacket(5);
	}

	static void method1919() {
		try {
			DiskFile diskFile = null;
			try {
				diskFile = DiskFile.method962("2", GameClient.game.BUILD_NAME, false);
				byte[] data = new byte[(int) diskFile.getFileLength()];
				int i_0_;
				for (int i_1_ = 0; i_1_ < data.length; i_1_ += i_0_) {
					i_0_ = diskFile.method6081(data, i_1_, data.length - i_1_, (short) 1638);
					if (i_0_ == -1)
						throw new IOException();
				}
				Class482.method6116(new Buffer(data));
			} catch (Exception exception) {
				/* empty */
			}
			try {
				if (null != diskFile)
					diskFile.method6079();
			} catch (Exception exception) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ir.r(").append(')').toString());
		}
	}

	static Class337[] method1920(int i) {
		try {
			return (new Class337[] { Class337.aClass337_3624, Class337.aClass337_3625, Class337.aClass337_3627 });
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ir.a(").append(')').toString());
		}
	}

	static final void updateMinimap() {
			Class365_Sub1_Sub1_Sub6.updateMinimap(GameClient.activeGraphicsToolkit);
			if (1855729883 * GameClient.plane != 191260743 * GameClient.anInt8792)
				ToMoveSettings.updateRoofFlags();
	}

	static final void method1923() {
		try {
			if (GameClient.isLobbyConnected(-1233866115 * GameClient.gameState) || Class413.method5584(-1233866115 * GameClient.gameState))
				StaticMethods.method2001(false);
			else {
				StaticMethods.aStream_8414 = ConnectionType.gameConnection.getStream();
				ConnectionType.gameConnection.closeConnection();
				Class439.loadGameState(5);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ir.gk(").append(')').toString());
		}
	}

	static void method1925(CS2Context context, int containerID, int fileID, ScriptRuntime runtime) {
			CS2ScriptDefinition def = CS2ScriptDefinition.lookup(context, containerID, fileID);
			if (null == def)
				StaticMethods.method531();
			else {
				runtime.integerLocals = new int[def.maxIntLocals * -1516159487];
				runtime.objectLocals = new Object[def.maxObjectLocals *1787035509];
				if ((def.aClass502_9678 == CS2Context.FOCUS) || (CS2Context.FOCUSING == def.aClass502_9678) || (CS2Context.UNFOCUS == def.aClass502_9678)) {
					int i_8_ = 0;
					int i_9_ = 0;
					if (StaticMethods.aClass105_1373 != null) {
						i_8_ = 1354508417 * StaticMethods.aClass105_1373.x;
						i_9_ = -749038817 * StaticMethods.aClass105_1373.y;
					}
					runtime.integerLocals[0] = (AwtMouse.mouse.getLastX() - i_8_);
					runtime.integerLocals[1] = (AwtMouse.mouse.getLastY() - i_9_);
				} else if (def.aClass502_9678 == CS2Context.aClass502_6716)
					runtime.integerLocals[0] = 1782404151 * runtime.playerIndex;
				ClientScriptsExecutor.executeScript(def, 200000, runtime);
			}
	}

}
