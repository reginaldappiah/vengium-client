package com.jagex;/* Class494 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.ConfigType;

public class Class494 {
	SoftCache cache = new SoftCache(64);
	public int anInt6090;
	Js5FileSystem fileSystem;
	static int anInt6092;

	public Class494(Js5FileSystem class243) {
		this.fileSystem = class243;
		anInt6090 = (this.fileSystem.getFileSystem((-1006924897 * (ConfigType.aClass120_1424.type))) * 1832969825);
	}

	public Class473 load(int i) {
			Class473 class473;
			synchronized (this.cache) {
				class473 = (Class473) this.cache.get((long) i);
			}
			if (class473 != null)
				return class473;
			byte[] data;
			synchronized (this.fileSystem) {
				data = (this.fileSystem.getFileFromArchive(ConfigType.aClass120_1424.type * -1006924897, i));
			}
			class473 = new Class473();
			if (data != null)
				class473.readValueLoop(new Buffer(data));
			synchronized (this.cache) {
				this.cache.put(class473, (long) i);
			}
			return class473;
	}

}
