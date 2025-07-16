package com.jagex;/* Class373 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.ColorUtils;

public class OverlayDefinition {
	int anInt4053;
	public int waterIntensity;
	public int anInt4055;
	public int color = 0;
	public int texture = -473139963;
	static int anInt4058 = 1190717;
	public int blendColor;
	public int scale;
	public boolean blockShadow;
	public boolean aBoolean4062 = true;
	public boolean aBoolean4063;
	public int waterColor;
	OverlayDefinitionLoader aClass375_4065;
	public int waterScale;
	public int anInt4067;
	public int anInt4068;
	public int anInt4069;
	public static SpriteToolkit aClass57_4070;
	public static ArchiveResourceProvider[] aJs5IndexSystemArray4072;

	OverlayDefinition() {
		blendColor = 1749423345;
		scale = 99235328;
		blockShadow = true;
		anInt4055 = 1206519288;
		aBoolean4063 = false;
		waterColor = -1425774653;
		waterScale = -120073920;
		waterIntensity = -345860175;
		anInt4067 = 1567851881;
		anInt4068 = 0;
		anInt4069 = 526820032;
	}

	void method4603(byte i) {
		try {
			anInt4055 = (2109091647 * anInt4055 << 8 | -692668059 * this.anInt4053) * 150814911;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pn.b(").append(')').toString());
		}
	}

	void decode(Buffer buffer, int opcode) {
		try {
			if (opcode == 1)
				color = ColorUtils.rgbToHsl(buffer.readUTriByte()) * -1294090885;
			else if (opcode == 2)
				texture = buffer.readUByte() * 473139963;
			else if (3 == opcode) {
				texture = buffer.readUShort() * 473139963;
				if (324071475 * texture == 65535)
					texture = -473139963;
			} else if (5 == opcode)
				aBoolean4062 = false;
			else if (opcode == 7) {
				blendColor = ColorUtils.rgbToHsl(buffer.readUTriByte()) * -1749423345;
			//System.out.println("Blend color: " + blendColor);
			} else if (opcode == 8)
				this.aClass375_4065.anInt4080 = 1023752851 * this.anInt4053;
			else if (opcode == 9)
				scale = (buffer.readUShort() << 2) * 1803744539;
			else if (10 == opcode)
				blockShadow = false;
			else if (11 == opcode)
				anInt4055 = buffer.readUByte() * 150814911;
			else if (opcode == 12)
				aBoolean4063 = true;
			else if (13 == opcode)
				waterColor = buffer.readUTriByte() * -442102017;
			else if (opcode == 14)
				waterScale = ((buffer.readUByte() << 2) * -1612488891);
			else if (16 == opcode)
				waterIntensity = buffer.readUByte() * 1767159631;
			else if (opcode == 20)
				anInt4067 = buffer.readUShort() * 1320194135;
			else if (21 == opcode)
				anInt4068 = buffer.readUByte() * 346396917;
			else if (22 == opcode)
				anInt4069 = buffer.readUShort() * 75340427;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pn.f(").append(')').toString());
		}
	}

	void method4605(Buffer buffer, int i) {
		try {
			for (;;) {
				int i_1_ = buffer.readUByte();
				if (i_1_ == 0) {
					if (i <= -64748789) {
					}
					break;
				}
				decode(buffer, i_1_);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pn.a(").append(')').toString());
		}
	}

}
