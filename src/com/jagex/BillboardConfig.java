package com.jagex;/* BillboardConfig - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class BillboardConfig {
    public int priority;
	public int face;
	public int type;
	public int magnitude;
	static Js5FileSystem JS5_BILLBOARD_CONFIG;

	BillboardConfig(int type, int face, int priority, int magnitude) {
		this.type = 1558926477 * type;
		this.face = face * 2005037049;
		this.priority = priority * 655269121;
		this.magnitude = -1163183093 * magnitude;
	}

	public static Class173 method2844(int fileID) {
            Class173 class173 = (Class173) Class173.aClass348_1749.get((long) fileID);
            if (class173 != null)
                return class173;
            byte[] data = JS5_BILLBOARD_CONFIG.getFileFromArchive(0, fileID);
            class173 = new Class173();
            if (null != data)
                class173.method1817(new Buffer(data));
            Class173.aClass348_1749.put(class173, (long) fileID);
            return class173;
    }

	BillboardConfig translateFace(int face) {
			return new BillboardConfig(1834782277 * type, face, -1606786303 * priority, magnitude * 2010148771);
	}



}
