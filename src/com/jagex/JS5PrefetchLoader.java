package com.jagex;/* Class221 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class JS5PrefetchLoader implements FileLoader {
	String lib;
	boolean loaded;

	public int getProgress() {
			if (this.loaded)
				return 100;
			int progress = JS5NativeManager.nativeManager.getProgress(this.lib);
			if (progress >= 0 && progress <= 100)
				return progress;
			this.loaded = true;
			return 100;
	}

	public FileType getFileType() {
		return FileType.NATIVE;
	}
	JS5PrefetchLoader(String lib) {
		this.lib = lib;
	}

	boolean isLoaded() {
			return this.loaded;
	}

}
