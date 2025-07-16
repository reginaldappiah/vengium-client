package com.jagex;/* Class475 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.ConfigType;

public class MapsDefinitionsLoader {
	Js5FileSystem fileSystem;
	SoftCache cache = new SoftCache(128);

	public MapsDefinitionsLoader(Js5FileSystem class243) {
		this.fileSystem = class243;
		if (null != this.fileSystem) {
			int capacity = this.fileSystem.getContainerLength() - 1;
			ConfigType.ENUMERATIONS.filesPerContainer();
			this.fileSystem.getFileSystem(capacity);
		}
	}

	public ClientScriptMap getClientScriptMap(int scriptID) {

		try {
			ClientScriptMap map;
			synchronized (this.cache) {
				map = (ClientScriptMap) this.cache.get((long) scriptID);
			}
			if (null != map)
				return map;
			byte[] data = (this.fileSystem.getFileFromArchive(ConfigType.ENUMERATIONS.getType(scriptID), ConfigType.ENUMERATIONS.getFile(scriptID)));
			map = new ClientScriptMap();
			if (null != data)
				map.readValueLoop(new Buffer(data));
			synchronized (this.cache) {
				this.cache.put(map, (long) scriptID);
			}
			return map;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("to.a(").append(')').toString());
		}
	}

}
