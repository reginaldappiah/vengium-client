package com.jagex;/* Class389 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.ConfigType;

public class SpotTypeLoader {
	public static SpotTypeLoader loader;
	Js5FileSystem JS5_GRAPHICS;
	Js5FileSystem JS5_MODEL;
	SoftCache graphics_cache = new SoftCache(64);
	SoftCache model_cache = new SoftCache(60);
	int anInt4163;
	static int anInt4166;

	public void sweep() {
		try {
			synchronized (this.graphics_cache) {
				this.graphics_cache.sweep();
			}
			synchronized (this.model_cache) {
				this.model_cache.sweep();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qc.i(").append(')').toString());
		}
	}

	public SpotType get(int graphicID) {
		try {
			SpotType spotType;
			synchronized (this.graphics_cache) {
				spotType = (SpotType) this.graphics_cache.get((long) graphicID);
			}
			if (spotType != null)
				return spotType;
			byte[] is;
			synchronized (this.JS5_GRAPHICS) {
				is = (this.JS5_GRAPHICS.getFileFromArchive(ConfigType.GRAPHICS.getType(graphicID), ConfigType.GRAPHICS.getFile(graphicID)));
			}
			spotType = new SpotType();
			spotType.loader = this;
			spotType.anInt5202 = graphicID * 1757755963;
			if (is != null)
				spotType.readValueLoop(new Buffer(is));
			synchronized (this.graphics_cache) {
				this.graphics_cache.put(spotType, (long) graphicID);
			}
			return spotType;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qc.a(").append(')').toString());
		}
	}

	public void clear() {
			synchronized (this.graphics_cache) {
				this.graphics_cache.clear();
			}
			synchronized (this.model_cache) {
				this.model_cache.clear();
			}
	}

	public void method4859(int i) {
			synchronized (this.graphics_cache) {
				this.graphics_cache.method4186(i);
			}
			synchronized (this.model_cache) {
				this.model_cache.method4186(i);
			}
	}

	public void method4860(int i) {
			this.anInt4163 = i * -1451688935;
			synchronized (this.model_cache) {
				this.model_cache.clear();
			}
	}

	public SpotTypeLoader(Js5FileSystem class243, Js5FileSystem class243_3_) {
		this.JS5_GRAPHICS = class243;
		this.JS5_MODEL = class243_3_;
		int i = this.JS5_GRAPHICS.getContainerLength() - 1;
		ConfigType.GRAPHICS.filesPerContainer();
		this.JS5_GRAPHICS.getFileSystem(i);
	}

}
