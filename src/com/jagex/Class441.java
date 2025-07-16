package com.jagex;/* Class441 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.definition.animation.AnimationDefinition;
import com.jagex.game.cache.definition.animation.AnimationDefinitionLoader;
import com.jagex.utils.ColorUtils;

public class Class441 {
	FrameCollection aClass298_Sub37_Sub4_5583;
	int collectionID;
	boolean aBoolean5585;
	int frameID;
	FrameCollection aClass298_Sub37_Sub4_5587;
	int anInt5588;
	static int anInt5589;
	
	final boolean method5863(AnimationDefinitionLoader animationDefinitionLoader, AnimationDefinition animationDefinition, int frameOffset, int frameIndex, int[] frames) {
			if (!this.aBoolean5585) {
				if (frameOffset >= frames.length)
					return false;
				this.collectionID = -1850168697 * frames[frameOffset];
				this.aClass298_Sub37_Sub4_5583 = animationDefinitionLoader.getCollection((this.collectionID * 806878007) >> 16);
				this.collectionID = ((this.collectionID * 806878007 & 0xffff) * -1850168697);
				if (this.aClass298_Sub37_Sub4_5583 != null) {
					if (animationDefinition.tweening && frameIndex != -1 && frameIndex < frames.length) {
						this.frameID = frames[frameIndex] * -1477634565;
						this.aClass298_Sub37_Sub4_5587 = animationDefinitionLoader.getCollection((this.frameID * -643912397) >> 16);
						this.frameID = (this.frameID * -643912397 & 0xffff) * -1477634565;
					}
					if (animationDefinition.aBoolean4185)
						this.anInt5588 = (this.anInt5588 * -1050600049 | 0x200) * 1673486703;
					if (this.aClass298_Sub37_Sub4_5583.modifiesColor(this.collectionID * 806878007))
						this.anInt5588 = (1673486703 * (-1050600049 * this.anInt5588 | 0x80));
					if (this.aClass298_Sub37_Sub4_5583.modifiesAlpha(806878007 * this.collectionID))
						this.anInt5588 = (1673486703 * (-1050600049 * this.anInt5588 | 0x100));
					if (this.aClass298_Sub37_Sub4_5583.method3414(this.collectionID * 806878007))
						this.anInt5588 = (1673486703 * (this.anInt5588 * -1050600049 | 0x400));
					if (this.aClass298_Sub37_Sub4_5587 != null) {
						if (this.aClass298_Sub37_Sub4_5587.modifiesColor(-643912397 * this.frameID))
							this.anInt5588 = (1673486703 * (-1050600049 * this.anInt5588 | 0x80));
						if (this.aClass298_Sub37_Sub4_5587.modifiesAlpha(this.frameID * -643912397))
							this.anInt5588 = (1673486703 * (this.anInt5588 * -1050600049 | 0x100));
						if (this.aClass298_Sub37_Sub4_5587.method3414(-643912397 * this.frameID))
							this.anInt5588 = (1673486703 * (-1050600049 * this.anInt5588 | 0x400));
					}
					this.anInt5588 = ((this.anInt5588 * -1050600049 | 0x20) * 1673486703);
					this.aBoolean5585 = true;
					return true;
				}
				return false;
			}
			return true;
	}

	final void method5864() {
			this.aBoolean5585 = false;
			this.anInt5588 = 0;
			this.aClass298_Sub37_Sub4_5587 = null;
			this.aClass298_Sub37_Sub4_5583 = null;
	}

	Class441() {
		/* empty */
	}

}
