package com.jagex;/* Class216 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class216 implements FileLoader {
	String aString6655;
	Js5FileSystem aClass243_6656;
	static String[] folder_localdrive_location;
	static int baseTileY;
	public static int anInt6659;
	static int anInt6660;

	public int getProgress() {
			if (this.aClass243_6656.method2312(this.aString6655))
				return 100;
			return this.aClass243_6656.getGroupProgress(this.aString6655);
	}

	public FileType getFileType() {
			return FileType.FILE;
	}

	Class216(Js5FileSystem js5FileSystem, String string) {
		this.aClass243_6656 = js5FileSystem;
		this.aString6655 = string;
	}

}
