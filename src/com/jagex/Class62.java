package com.jagex;/* Class62 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class62 {
	int anInt607;
	String nextForceTalk;
	int anInt609;
	int chatOverheadDuration;
	int overheadDuration;
	public static MapLoader aClass248_612;

	public int method719() {
			return this.anInt609 * -356113587;
	}

	public int method720() {
			return -1009994485 * this.anInt607;
	}

	public String method721() {
			return this.nextForceTalk;
	}

	public int method722() {
			return -1542462711 * this.overheadDuration;
	}

	Class62() {

	}

	public int getChatOverHeadDuration() {
			return -1009911665 * this.chatOverheadDuration;
	}

	public static void method727(Js5FileSystem class243, MaterialRawLoader interface_ma) {
			Class465.aClass243_6520 = class243;
			Skybox.anInterface_ma2955 = interface_ma;
	}

	static int method728(MenuOptionNode menuOptionNode, RSFontMetrics aClass505_176) {
			String string = ErrorReporter.method4174(menuOptionNode, (byte) 66);
			return aClass505_176.method6254(string, Class436.aClass57Array5501);
	}

	public static void method729(CS2Context context, int i, int i_0_, Entity entity, int playerIndex) {
			ScriptRuntime runtime = ToMoveScripts.method1950();
			runtime.entity = entity;
			runtime.playerIndex = playerIndex * -1596022393;
			SubIncommingPacket.method1925(context, i, i_0_, runtime);
			runtime.entity = null;
			runtime.playerIndex = 1596022393;
	}

	static final void method731(Class298_Sub19 class298_sub19) {
			class298_sub19.aBoolean7310 = false;
			if (null != class298_sub19.aClass298_Sub26_7312)
				class298_sub19.aClass298_Sub26_7312.anInt7362 = 0;
			for (Class298_Sub19 class298_sub19_4_ = class298_sub19.method2930(); null != class298_sub19_4_; class298_sub19_4_ = class298_sub19.method2931())
				method731(class298_sub19_4_);
	}

	static final void method732() {
			if (-1 != GameClient.WINDOW_PANE_ID * -257444687) {
				int mouseX = AwtMouse.mouse.getLastX();
				int mouseY = AwtMouse.mouse.getLastY();
				MouseRecord mouseRecord = ((MouseRecord) GameClient.mouseRecords.method5939());
				if (null != mouseRecord) {
					mouseX = mouseRecord.getMouseX();
					mouseY = mouseRecord.getMouseY();
				}
				if (null != GameClient.fromIComponentDefinition && GameClient.aClass105_8712 == IComponentDefinition.componentDefinition) {
					GameClient.aBoolean8855 = true;
					GameClient.anInt8856 = 0;
					GameClient.anInt8800 = 0;
					GameClient.anInt8858 = GameShell.canvasWidth * -500212323;
					GameClient.anInt8966 = GameShell.canvasHeight * -1522183559;
				}
				Class298_Sub32_Sub26.method3307(null, -257444687 * GameClient.WINDOW_PANE_ID, 0, 0, GameShell.canvasWidth * -2110394505, GameShell.canvasHeight * -1111710645, 0, 0, mouseX, mouseY);
				if (StaticMethods.aClass105_1373 != null)
					ItemDefinition.handleWorldMapLogic(mouseX, mouseY);
			}
	}
}
