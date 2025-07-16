package com.jagex;/* Class151 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.underlay.UnderlayTypeLoader;

public class Class151 implements Interface5 {
	public int anInt6345;
	public int anInt6346;
	public int anInt6347;
	public int anInt6348;
	public int anInt6349;
	public int anInt6350;
	public Class133 aClass133_6351;
	public Class139 aClass139_6352;
	public String string;
	public int anInt6354;
	public int fontID;
	public int anInt6356;
	public int anInt6357;
	public static UnderlayTypeLoader aClass451_6358;

    public static Class151 method1318(Buffer buffer) {
            String string = buffer.readString();
            Class139 class139 = (Class139.method6176()[buffer.readUByte()]);
            Class133 class133 = (Class133.method1255()[buffer.readUByte()]);
            int i_0_ = buffer.readShort();
            int i_1_ = buffer.readShort();
            int i_2_ = buffer.readUByte();
            int i_3_ = buffer.readUByte();
            int i_4_ = buffer.readUByte();
            int i_5_ = buffer.readUShort();
            int i_6_ = buffer.readUShort();
            int i_7_ = buffer.readBigSmart();
            int i_8_ = buffer.readInt();
            int i_9_ = buffer.readInt();
            return new Class151(string, class139, class133, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_);
    }

    public Class146 method49(int i) {
			return Class146.aClass146_1564;
	}

	public Class146 method50() {
		return Class146.aClass146_1564;
	}

	public Class146 method51() {
		return Class146.aClass146_1564;
	}

	Class151(String string, Class139 class139, Class133 class133, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int fontID, int i_7_, int i_8_) {
		this.string = string;
		aClass139_6352 = class139;
		aClass133_6351 = class133;
		anInt6348 = 983212181 * i;
		anInt6349 = 703753783 * i_0_;
		anInt6350 = -719694677 * i_1_;
		anInt6345 = i_2_ * 1732454243;
		anInt6354 = i_3_ * -1607745933;
		anInt6346 = -2102344545 * i_4_;
		anInt6347 = -299852093 * i_5_;
		this.fontID = fontID * 299588697;
		anInt6356 = -732046791 * i_7_;
		anInt6357 = -1239794753 * i_8_;
	}

	public static Class182 method1643(int fileID) {
		try {
			Class182 class182 = (Class182) Class182.aClass348_1815.get((long) fileID);
			if (class182 != null)
				return class182;
			byte[] data = Class182.aClass243_1821.getFileFromArchive(0, fileID);
			class182 = new Class182();
			if (null != data)
				class182.method1843(new Buffer(data), (byte) 20);
			class182.method1845(-721593745);
			Class182.aClass348_1815.put(class182, (long) fileID);
			return class182;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, "Error loading cache");
		}
	}

	static boolean method1644(int i) {
		try {
			return Class492.method6184(StaticMethods.aClass381_1563.aClass355_4114);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gc.a(").append(')').toString());
		}
	}

	static final void method1645(ScriptRuntime class403, byte i) {
		try {
			class403.longStacks[((class403.longArgs += -682569305) * 1685767703 - 1)] = (class403.script.longOperands[1883543357 * class403.integerPos]);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gc.bf(").append(')').toString());
		}
	}

	static boolean method1646(int i) {
		try {
			return i == 18 || i == 16;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gc.fg(").append(')').toString());
		}
	}

	static final void method1647(ScriptRuntime class403, int i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			ToMoveIComponentScripts.method2323(class105, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gc.gt(").append(')').toString());
		}
	}

	public static final void method1648(int i) {
		try {
			if (!GameClient.aBoolean8761) {
				GameClient.aFloat8760 += (-12.0F - GameClient.aFloat8760) / 2.0F;
				GameClient.aBoolean8763 = true;
				GameClient.aBoolean8761 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gc.hq(").append(')').toString());
		}
	}

	static final void method1649(ScriptRuntime class403, int i) {
		try {
			Class365_Sub1_Sub2_Sub1.method4499((byte) -5);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("gc.aet(").append(')').toString());
		}
	}
}
