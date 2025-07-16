package com.jagex;/* Class358 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class HitsplatDefinition {
	String amount;
	public int offsetY;
	public int textColor;
	public int duration;
	int icon;
	HitsplatDefinitionLoader hitsplatDefinitionLoader;
	int left;
	int right;
	public int offsetX;
	int middle;
	public int fade;
	public int anInt3862;
	public int comparisonType;
	public int font = 1438416545;
	static int anInt3865;

	void readValueLoop(Buffer buffer) {
			for (;;) {
				int opcode = buffer.readUByte();
				if (0 == opcode) {
					break;
				}
				decode(buffer, opcode);
			}
	}

	void decode(Buffer buffer, int opcode) {
			if (1 == opcode)
				font = buffer.readBigSmart() * -1438416545;
			else if (opcode == 2)
				textColor = buffer.readUTriByte() * 728095375;
			else if (opcode == 3)
				this.icon = buffer.readBigSmart() * 315680607;
			else if (opcode == 4)
				this.left = buffer.readBigSmart() * -1871987079;
			else if (opcode == 5)
				this.middle = buffer.readBigSmart() * -1006502127;
			else if (opcode == 6)
				this.right = buffer.readBigSmart() * -818871601;
			else if (opcode == 7)
				offsetX = buffer.readShort() * -1393539651;
			else if (8 == opcode)
				this.amount = buffer.readJagString();
			else if (9 == opcode)
				duration = buffer.readUShort() * 1198050465;
			else if (10 == opcode)
				offsetY = buffer.readShort() * 428297403;
			else if (opcode == 11)
				fade = 0;
			else if (12 == opcode)
				comparisonType = buffer.readUByte() * 1936262373;
			else if (opcode == 13)
				anInt3862 = buffer.readShort() * 508440647;
			else if (14 == opcode)
				fade = buffer.readUShort() * 310090321;
	}

	public String formatAmount(int amount) {
			String string = this.amount;
			for (;;) {
				int index = string.indexOf("%1");
				if (index < 0) {
					break;
				}
				string = new StringBuilder().append(string.substring(0, index)).append(Class128_Sub1.method1440(amount, false, (byte) 8)).append(string.substring(2 + index)).toString();
			}
			return string;
	}

	public SpriteToolkit getIconSprite(GraphicsToolkit graphicsToolkit) {
			if (459224223 * this.icon < 0)
				return null;
			SpriteToolkit spriteToolkit = ((SpriteToolkit) (this.hitsplatDefinitionLoader.cache.get((long) (459224223 * this.icon))));
			if (spriteToolkit == null) {
				cacheSprites(graphicsToolkit);
				spriteToolkit = (SpriteToolkit) (this.hitsplatDefinitionLoader.cache.get((long) (459224223 * this.icon)));
			}
			return spriteToolkit;
	}

	public SpriteToolkit getLeftSprite(GraphicsToolkit graphicsToolkit) {
			if (this.left * 1894403017 < 0)
				return null;
			SpriteToolkit spriteToolkit = ((SpriteToolkit) (this.hitsplatDefinitionLoader.cache.get((long) (this.left * 1894403017))));
			if (spriteToolkit == null) {
				cacheSprites(graphicsToolkit);
				spriteToolkit = (SpriteToolkit) (this.hitsplatDefinitionLoader.cache.get((long) (1894403017 * this.left)));
			}
			return spriteToolkit;
	}

	public SpriteToolkit getRightSprite(GraphicsToolkit graphicsToolkit) {
			if (1896268847 * this.right < 0)
				return null;
			SpriteToolkit spriteToolkit = ((SpriteToolkit) (this.hitsplatDefinitionLoader.cache.get((long) (this.right * 1896268847))));
			if (spriteToolkit == null) {
				cacheSprites(graphicsToolkit);
				spriteToolkit = (SpriteToolkit) (this.hitsplatDefinitionLoader.cache.get((long) (1896268847 * this.right)));
			}
			return spriteToolkit;
	}

	void cacheSprites(GraphicsToolkit graphicsToolkit) {
			Js5FileSystem JS5_SPRITES = this.hitsplatDefinitionLoader.JS5_SPRITES;
			if (459224223 * this.icon >= 0 && (this.hitsplatDefinitionLoader.cache.get((long) (459224223 * this.icon))) == null && JS5_SPRITES.exists(this.icon * 459224223)) {
				Sprite imageDefinitionLoader = Sprite.loadFirst(JS5_SPRITES, (this.icon * 459224223));
				this.hitsplatDefinitionLoader.cache.put(graphicsToolkit.createSpriteToolkit(imageDefinitionLoader, true), (long) (this.icon * 459224223));
			}
			if (this.middle * -1362963983 >= 0 && ((this.hitsplatDefinitionLoader.cache.get((long) (this.middle * -1362963983))) == null) && JS5_SPRITES.exists((-1362963983 * this.middle))) {
				Sprite imageDefinitionLoader = Sprite.loadFirst(JS5_SPRITES, (-1362963983 * this.middle));
				this.hitsplatDefinitionLoader.cache.put(graphicsToolkit.createSpriteToolkit(imageDefinitionLoader, true), (long) (this.middle * -1362963983));
			}
			if (this.left * 1894403017 >= 0 && ((this.hitsplatDefinitionLoader.cache.get((long) (this.left * 1894403017))) == null) && JS5_SPRITES.exists((this.left * 1894403017))) {
				Sprite imageDefinitionLoader = Sprite.loadFirst(JS5_SPRITES, (this.left * 1894403017));
				this.hitsplatDefinitionLoader.cache.put(graphicsToolkit.createSpriteToolkit(imageDefinitionLoader, true), (long) (this.left * 1894403017));
			}
			if (this.right * 1896268847 >= 0 && ((this.hitsplatDefinitionLoader.cache.get((long) (this.right * 1896268847))) == null) && JS5_SPRITES.exists((this.right * 1896268847))) {
				Sprite imageDefinitionLoader = Sprite.loadFirst(JS5_SPRITES, (1896268847 * this.right));
				this.hitsplatDefinitionLoader.cache.put(graphicsToolkit.createSpriteToolkit(imageDefinitionLoader, true), (long) (1896268847 * this.right));
			}
	}

	HitsplatDefinition() {
		textColor = 1671046513;
		duration = -2035813370;
		this.icon = -315680607;
		this.middle = 1006502127;
		this.left = 1871987079;
		this.right = 818871601;
		offsetX = 0;
		offsetY = 0;
		fade = -310090321;
		this.amount = "";
		comparisonType = -1936262373;
		anInt3862 = 0;
	}

	public SpriteToolkit method4284(GraphicsToolkit graphicsToolkit) {
			if (this.middle * -1362963983 < 0)
				return null;
			SpriteToolkit spriteToolkit = ((SpriteToolkit) (this.hitsplatDefinitionLoader.cache.get((long) (-1362963983 * this.middle))));
			if (spriteToolkit == null) {
				cacheSprites(graphicsToolkit);
				spriteToolkit = (SpriteToolkit) (this.hitsplatDefinitionLoader.cache.get((long) (-1362963983 * this.middle)));
			}
			return spriteToolkit;
	}

}
