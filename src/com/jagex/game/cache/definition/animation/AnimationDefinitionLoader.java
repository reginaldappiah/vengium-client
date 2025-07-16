package com.jagex.game.cache.definition.animation;/* Class395 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.*;
import com.jagex.game.cache.config.ConfigType;

public class AnimationDefinitionLoader {
    public static AnimationDefinitionLoader animationDefinitionLoader;
    Js5FileSystem fileSystem;
	SoftCache frame_cache;
	SoftCache animation_cache = new SoftCache(64);

	public static void setAnimationDefinitionLoader(Js5FileSystem animationBaseJS5, Js5FileSystem animationSkinJS5) {
			FrameCollection.JS5_ANIMBASES = animationBaseJS5;
			FrameCollection.JS5_ANIMSKINS = animationSkinJS5;
	}

	public static void setAnimationDefinitionLoader(AnimationDefinitionLoader animationDefinitionLoader) {
			AnimationDefinitionLoader.animationDefinitionLoader = animationDefinitionLoader;
	}

	public FrameCollection getCollection(int id) {
			FrameCollection collection;
			synchronized (this.frame_cache) {
				collection = ((FrameCollection) this.frame_cache.get((long) id));
				if (collection == null) {
					collection = new FrameCollection(id);
					this.frame_cache.put(collection, (long) id);
				} if (!collection.framesExists()) {
					FrameCollection nulledCollection = null;
					return nulledCollection;
				}
			}
			return collection;
	}

	public void clear() {
			synchronized (this.animation_cache) {
				this.animation_cache.clear();
			}
			synchronized (this.frame_cache) {
				this.frame_cache.clear();
			}
	}

	public void sweep() {
			synchronized (this.animation_cache) {
				this.animation_cache.sweep();
			}
			synchronized (this.frame_cache) {
				this.frame_cache.sweep();
			}
	}

	public AnimationDefinitionLoader(Js5FileSystem animationJS5, Js5FileSystem animationBaseJS5, Js5FileSystem animationSkinJS5) {
		this.frame_cache = new SoftCache(100);
		this.fileSystem = animationJS5;
		if (this.fileSystem != null) {
			int containerLength = this.fileSystem.getContainerLength() - 1;
			ConfigType.ANIMATION.filesPerContainer();
			this.fileSystem.getFileSystem(containerLength);
		}
		setAnimationDefinitionLoader(animationBaseJS5, animationSkinJS5);
	}

	public AnimationDefinition get(int animationID) {
			AnimationDefinition animationDefinition;
			synchronized (this.animation_cache) {
				animationDefinition = (AnimationDefinition) this.animation_cache.get((long) animationID);
			}
			if (null != animationDefinition)
				return animationDefinition;
			byte[] data;
			synchronized (this.fileSystem) {
				data = (this.fileSystem.getFileFromArchive(ConfigType.ANIMATION.getType(animationID), ConfigType.ANIMATION.getFile(animationID)));
			}
			animationDefinition = new AnimationDefinition();
			animationDefinition.animationID = animationID * -523719415;
			animationDefinition.loader = this;
			if (data != null)
				animationDefinition.readValueLoop(new Buffer(data));
			animationDefinition.postUnpack();
			synchronized (this.animation_cache) {
				this.animation_cache.put(animationDefinition, (long) animationID);
			}
			return animationDefinition;
	}

	public void method4904(int i) {
			synchronized (this.animation_cache) {
				this.animation_cache.method4186(i);
			}
			synchronized (this.frame_cache) {
				this.frame_cache.method4186(i);
			}
	}

}
