package com.jagex;/* Class298_Sub37_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.definition.animation.AnimationFrame;
import com.jagex.game.cache.definition.animation.AnimationFrameBase;

public class FrameCollection extends Cacheable {
	AnimationFrame[] frames;
	int baseType;
	byte[][] frameBaseData;
	public static Js5FileSystem JS5_ANIMSKINS;
	public static Js5FileSystem JS5_ANIMBASES;

	public boolean framesExists() {
			if (this.frames != null) {
				return true;
			}
			if (this.frameBaseData == null) {
				synchronized (JS5_ANIMBASES) {
					if (!JS5_ANIMBASES.loadContainer(1899473659 * this.baseType)) {
						boolean baseExists = false;
						return baseExists;
					}
					int[] frameBaseTransformations = JS5_ANIMBASES.getFileIDs((this.baseType * 1899473659));
					this.frameBaseData = new byte[frameBaseTransformations.length][];
					for (int index = 0; index < frameBaseTransformations.length; index++) {
						this.frameBaseData[index] = JS5_ANIMBASES.getFileFromArchive((1899473659 * this.baseType), frameBaseTransformations[index]);
					}
				}
			}
			boolean loaded = true;
			for (int index = 0; (index < this.frameBaseData.length); index++) {
				byte[] data = this.frameBaseData[index];
				Buffer buffer = new Buffer(data);
				buffer.offset = 116413311;
				int skinID = buffer.readUShort();
				synchronized (JS5_ANIMSKINS) {
					loaded &= JS5_ANIMSKINS.exists(skinID);
				}
			}
			if (!loaded) {
				return false;
			}
			NodeCollection decoded = new NodeCollection();
			int[] base;
			synchronized (JS5_ANIMBASES) {
				int frameCount = JS5_ANIMBASES.getFileSystem(this.baseType * 1899473659);
				this.frames = new AnimationFrame[frameCount];
				base = JS5_ANIMBASES.getFileIDs((this.baseType * 1899473659));
			}
			for (int index = 0; index < base.length; index++) {
				byte[] data = this.frameBaseData[index];
				Buffer buffer = new Buffer(data);
				buffer.offset = 116413311;
				int skinID = buffer.readUShort();
				AnimationFrameBase foundBase = null;
				for (AnimationFrameBase frameBase = (AnimationFrameBase) decoded.head(); frameBase != null; frameBase = (AnimationFrameBase) decoded.next()) {
					if (skinID == (frameBase.skinID * 1029066723)) {
						foundBase = frameBase;
						break;
					}
				}
				if (null == foundBase) {
					synchronized (JS5_ANIMSKINS) {
						foundBase = new AnimationFrameBase(skinID, JS5_ANIMSKINS.get(skinID));
					}
					decoded.pushBack(foundBase);
				}
				this.frames[base[index]] = new AnimationFrame(data, foundBase);
			}
			this.frameBaseData = null;
			return true;
	}

	public boolean modifiesColor(int index) {
			return frames[index].modifiesColor;
	}

	public boolean method3414(int index) {
			return frames[index].modifiesBrightness;
	}

	public FrameCollection(int baseType) {
		this.baseType = -2073571277 * baseType;
	}

	public boolean modifiesAlpha(int index) {
			return frames[index].modifiesAlpha;
	}
}
