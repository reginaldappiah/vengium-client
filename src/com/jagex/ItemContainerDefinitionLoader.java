package com.jagex;/* Class518 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.ConfigType;

public class ItemContainerDefinitionLoader {
	Js5FileSystem fileSystem;
	SoftCache cache = new SoftCache(64);

	public ItemContainerDefinitionLoader(Js5FileSystem fileSystem) {
		this.fileSystem = fileSystem;
		this.fileSystem.getFileSystem((-1006924897 * (ConfigType.INVENTORIES.type)));
	}

	public ItemContainerDefinition getDefinition(int fileID) {
		try {
			ItemContainerDefinition def;
			synchronized (this.cache) {
				def = ((ItemContainerDefinition) this.cache.get((long) fileID));
			}
			if (null != def)
				return def;
			byte[] data;
			synchronized (this.fileSystem) {
				data = (this.fileSystem.getFileFromArchive(-1006924897 * ConfigType.INVENTORIES.type, fileID));
			}
			def = new ItemContainerDefinition();
			if (null != data)
				def.unpack(new Buffer(data));
			synchronized (this.cache) {
				this.cache.put(def, (long) fileID);
			}
			return def;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("vu.a(").append(')').toString());
		}
	}
}
