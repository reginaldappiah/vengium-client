package com.jagex;/* Class507 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.ConfigType;

public class NPCDefinitionLoader {
	public static NPCDefinitionLoader npcList;
	SoftCache softCache;
	GameContext context;
	SoftCache cache = new SoftCache(64);
	Js5FileSystem JS5_NPC;
	Js5FileSystem JS5_MODELS;
	boolean isMember;
	int anInt6210;
	SoftCache aClass348_6211;
	GameLanguage language;
	String[] defaultOptions;

	public NPCDefinition load(int typeID) {
		try {
			NPCDefinition npcDefinition;
			synchronized (this.cache) {
				npcDefinition = (NPCDefinition) this.cache.get((long) typeID);
			}
			if (null != npcDefinition)
				return npcDefinition;
			byte[] is;
			synchronized (this.JS5_NPC) {
				is = (this.JS5_NPC.getFileFromArchive(ConfigType.NPC.getType(typeID), ConfigType.NPC.getFile(typeID)));
			}
			npcDefinition = new NPCDefinition();
			npcDefinition.typeID = -1840892671 * typeID;
			npcDefinition.loader = this;
			npcDefinition.rightClickOptions = this.defaultOptions.clone();
			if (is != null)
				npcDefinition.readValueLoop(new Buffer(is));
			npcDefinition.method6243();
			synchronized (this.cache) {
				this.cache.put(npcDefinition, (long) typeID);
			}
			return npcDefinition;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("uy.a(").append(')').toString());
		}
	}

	public void isMember(boolean isMember) {
			if (this.isMember != isMember) {
				this.isMember = isMember;
				clear();
			}
	}

	public void method6271(int i) {
			this.anInt6210 = i * -1576689997;
			synchronized (this.softCache) {
				this.softCache.clear();
			}
			synchronized (this.aClass348_6211) {
				this.aClass348_6211.clear();
			}
	}

	public void clear() {
			synchronized (this.cache) {
				this.cache.clear();
			}
			synchronized (this.softCache) {
				this.softCache.clear();
			}
			synchronized (this.aClass348_6211) {
				this.aClass348_6211.clear();
			}
	}

	public void method6273() {
			synchronized (this.softCache) {
				this.softCache.clear();
			}
			synchronized (this.aClass348_6211) {
				this.aClass348_6211.clear();
			}
	}

	public void sweep() {
			synchronized (this.cache) {
				this.cache.sweep();
			}
			synchronized (this.softCache) {
				this.softCache.sweep();
			}
			synchronized (this.aClass348_6211) {
				this.aClass348_6211.sweep();
			}
	}

	public void method6275(int i) {
			synchronized (this.cache) {
				this.cache.method4186(i);
			}
			synchronized (this.softCache) {
				this.softCache.method4186(i);
			}
			synchronized (this.aClass348_6211) {
				this.aClass348_6211.method4186(i);
			}
	}

	public NPCDefinitionLoader(GameContext context, GameLanguage language, boolean isMember, Js5FileSystem JS5_NPC, Js5FileSystem JS5_MODELS) {
		this.softCache = new SoftCache(50);
		this.aClass348_6211 = new SoftCache(5);
		this.context = context;
		this.language = language;
		this.isMember = isMember;
		this.JS5_NPC = JS5_NPC;
		this.JS5_MODELS = JS5_MODELS;
		if (this.JS5_NPC != null) {
			int i = this.JS5_NPC.getContainerLength() - 1;
			ConfigType.NPC.filesPerContainer();
			this.JS5_NPC.getFileSystem(i);
		}
		if (GameContext.VENGIUM == this.context)
			this.defaultOptions = (new String[] { null, null, null, null, null, Tradution.EXAMINE.translate((this.language)) });
		else
			this.defaultOptions = new String[] { null, null, null, null, null, null };
	}

	static void method6276() {
			Class229.cache.clear();
	}

}
