package com.jagex;/* Class87 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class87 {
	static short aShort792;
	public static LinkedList linkedList;
	public static Class94[] aClass94Array794;
	static Class80[] aClass80Array795;
	public static Interface23 componentMouseRecorder;
	public static Class82[] aClass82Array797;
	static HslUtils[] aClass86Array798;
	public static Class453 aClass453_799 = new Class453();
	static int anInt800;
	static int anInt801;
	static boolean aBoolean802;
	static int anInt803;
	static int cutsceneID;
	static Class75[] aClass75Array805;

	static {
		linkedList = new LinkedList(32);
		anInt803 = 2029434363;
		anInt800 = 0;
		anInt801 = 0;
		aBoolean802 = false;
		cutsceneID = 1692564793;
		componentMouseRecorder = new ComponentMouseRecorder();
	}

	public static void reset() {
			linkedList.clear();
			aClass453_799.clean();
			aClass75Array805 = null;
			aClass94Array794 = null;
			aClass86Array798 = null;
			aClass80Array795 = null;
			aClass82Array797 = null;
			anInt803 = 2029434363;
			anInt800 = 0;
			anInt801 = 0;
			Class118.aClass88_1402 = null;
			cutsceneID = 1692564793;
			if (aBoolean802) {
				GameClient.aShort8934 = aShort792;
				GameClient.aShort8935 = Class315.aShort3306;
				GameClient.aShort8839 = Class51.aShort504;
				GameClient.aShort8743 = StaticMethods.aShort5193;
				aBoolean802 = false;
			}
	}

    static void method4125(Buffer buffer) {
        for (; ; ) {
            int opcode = buffer.readUByte();
            switch (opcode) {
                case 255:
                    return;
                case 0:
                    anInt800 = buffer.readUShort() * 1746642957;
                    anInt801 = buffer.readUShort() * -196096943;
            }
        }
    }
}
