package com.jagex;/* Class438 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.definition.animation.AnimationDefinition;
import com.jagex.game.cache.definition.animation.AnimationDefinitionLoader;

public class Animator {
	int frameDelayIDX;
	AnimationDefinition animationDefinition;
	int anInt5525;
	int anInt5526;
	int anInt5527;
	int anInt5529;
	boolean aBoolean5530 = false;
	boolean aBoolean5531 = false;
	int anInt5532 = 0;
	boolean aBoolean5533 = false;
	Class441 aClass441_5534;
	Class441 aClass441_5535;

	public final boolean hasAnimationDefinition() {
		return this.animationDefinition != null;
	}

	public final AnimationDefinition getAnimationDefinition() {
		return this.animationDefinition;
	}

	public final void load(int i) {
		method5824(i, 0, 0, false);
	}

	public final boolean method5981(int frameCount) {
		if (this.animationDefinition == null|| frameCount == 0)
			return false;
		if (this.anInt5526 * -1577984117 > 0) {
			if (-1577984117 * this.anInt5526 >= frameCount) {
				this.anInt5526 -= -2070327261 * frameCount;
				return false;
			}
			frameCount -= this.anInt5526 * -1577984117;
			this.anInt5526 = 0;
			method5837(this.animationDefinition, -8792169 * this.frameDelayIDX);
		}
		frameCount += this.anInt5525 * 458730501;
		boolean bool = (this.animationDefinition.tweening | AnimationDefinition.aBoolean4186);
		if (frameCount > 100 && (this.animationDefinition.loopOffset * -658922537 > 0)) {
			int i_2_;
			for (i_2_ = ((this.animationDefinition.frames).length - (this.animationDefinition.loopOffset * -658922537)); (this.frameDelayIDX * -8792169 < i_2_ && frameCount > (this.animationDefinition.frameDurations[this.frameDelayIDX * -8792169])); this.frameDelayIDX += 282466343)
				frameCount -= (this.animationDefinition.frameDurations[this.frameDelayIDX * -8792169]);
			if (this.frameDelayIDX * -8792169 >= i_2_) {
				int durationOffset = 0;
				for (int index = i_2_; index < (this.animationDefinition.frames).length; index++)
					durationOffset += (this.animationDefinition.frameDurations[index]);
				if (0 == this.anInt5532 * -1542612693)
					this.anInt5527 += 1129171511 * (frameCount / durationOffset);
				frameCount %= durationOffset;
			}
			this.anInt5529 = -64061137 * this.frameDelayIDX + -1266936279;
			if (-112073191 * this.anInt5529 >= (this.animationDefinition.frames).length) {
				if ((this.animationDefinition.loopOffset * -658922537) == -1 && this.aBoolean5533)
					this.anInt5529 = 0;
				else
					this.anInt5529 -= (this.animationDefinition.loopOffset * 838055791);
				if (this.anInt5529 * -112073191 < 0 || (this.anInt5529 * -112073191 >= (this.animationDefinition.frames).length))
					this.anInt5529 = 1266936279;
			}
			bool = true;
		}
		while (frameCount > (this.animationDefinition.frameDurations[-8792169 * this.frameDelayIDX])) {
			bool = true;
			frameCount -= (this.animationDefinition.frameDurations[((this.frameDelayIDX += 282466343) * -8792169 - 1)]);
			if (-8792169 * this.frameDelayIDX >= (this.animationDefinition.frames).length) {
				if ((this.animationDefinition.loopOffset * -658922537) != -1 && -1542612693 * this.anInt5532 != 2) {
					this.frameDelayIDX -= (this.animationDefinition.loopOffset * -782361151);
					if (-1542612693 * this.anInt5532 == 0)
						this.anInt5527 += 1129171511;
				}
				if ((2063993735 * this.anInt5527 >= (this.animationDefinition.maxLoops * -23055529)) || -8792169 * this.frameDelayIDX < 0 || (-8792169 * this.frameDelayIDX >= (this.animationDefinition.frames).length)) {
					this.aBoolean5530 = true;
					break;
				}
			}
			method5837(this.animationDefinition, -8792169 * this.frameDelayIDX);
			this.anInt5529 = this.frameDelayIDX * -64061137 + -1266936279;
			if (-112073191 * this.anInt5529 >= (this.animationDefinition.frames).length) {
				if (-1 == (this.animationDefinition.loopOffset * -658922537) && this.aBoolean5533)
					this.anInt5529 = 0;
				else
					this.anInt5529 -= (838055791 * this.animationDefinition.loopOffset);
				if (-112073191 * this.anInt5529 < 0 || (this.anInt5529 * -112073191 >= (this.animationDefinition.frames).length))
					this.anInt5529 = 1266936279;
			}
		}
		this.anInt5525 = -993902387 * frameCount;
		if (bool)
			method5844();
		return bool;
	}

	public final int getAnimationID() {
		return (this.animationDefinition != null ? -1945308871 * this.animationDefinition.animationID : -1);
	}

	public final void method5824(int i, int i_5_, int i_6_, boolean bool) {
		method5825(i, i_5_, i_6_, bool, false);
	}

	final void method5825(int i, int i_8_, int i_9_, boolean bool, boolean bool_10_) {
		if (i != getAnimationID()) {
			if (-1 != i) {
				if (null != this.animationDefinition && i == (this.animationDefinition.animationID * -1945308871)) {
					if (0 == -1117238071 * (this.animationDefinition.resetType))
						return;
				} else
					this.animationDefinition = AnimationDefinitionLoader.animationDefinitionLoader.get(i);
				this.anInt5527 = 0;
				this.anInt5526 = i_8_ * -2070327261;
				this.anInt5532 = -1775084157 * i_9_;
				this.aBoolean5533 = bool_10_;
				if (bool) {
					this.frameDelayIDX = ((int) (Math.random() * (double) (this.animationDefinition.frames).length) * 282466343);
					this.anInt5525 = ((int) (Math.random() * (double) (this.animationDefinition.frameDurations[(-8792169 * (this.frameDelayIDX))])) * -993902387);
				} else {
					this.frameDelayIDX = 0;
					this.anInt5525 = 0;
				}
				this.anInt5529 = (-1266936279 + -64061137 * this.frameDelayIDX);
				if (this.anInt5529 * -112073191 < 0 || (this.anInt5529 * -112073191 >= (this.animationDefinition.frames).length))
					this.anInt5529 = 1266936279;
				if (0 == -1577984117 * this.anInt5526)
					method5837(this.animationDefinition, -8792169 * this.frameDelayIDX);
				this.aBoolean5530 = false;
			} else
				this.animationDefinition = null;
			method5844();
		}
	}

	public final boolean method5826() {
		return 0 != -1577984117 * this.anInt5526;
	}

	public final int method5827() {
		return -1577984117 * this.anInt5526;
	}

	public final void method5828(int i) {
		this.anInt5526 = i * -2070327261;
	}

	public final int getAnimationFlag() {
		if (animatePlayer()) {
			int flag = 0;
			if (animatePlayer()) {
				flag |= (-1050600049 * (this.aClass441_5534.anInt5588));
				if (this.aBoolean5531 && null != (this.animationDefinition.anIntArray4174))
					flag |= -1050600049 * (this.aClass441_5535.anInt5588);
			}
			return flag;
		}
		return 0;
	}

	public final void method5830(ModelToolkit modelToolkit, int i, int i_14_) {
		if (null != this.animationDefinition.frames && animatePlayer()) {
			modelToolkit.method4765((this.aClass441_5534.aClass298_Sub37_Sub4_5583), (this.aClass441_5534.collectionID * 806878007), (this.aClass441_5534.aClass298_Sub37_Sub4_5587), -643912397 * this.aClass441_5534.frameID, 458730501 * this.anInt5525, (this.animationDefinition.frameDurations[-8792169 * this.frameDelayIDX]), i, i_14_, this.animationDefinition.aBoolean4185, null);
			if (this.aBoolean5531 && this.animationDefinition.anIntArray4174 != null && (this.aClass441_5535.aBoolean5585))
				modelToolkit.method4765((this.aClass441_5535.aClass298_Sub37_Sub4_5583), (this.aClass441_5535.collectionID) * 806878007, (this.aClass441_5535.aClass298_Sub37_Sub4_5587), -643912397 * this.aClass441_5535.frameID, 458730501 * this.anInt5525, (this.animationDefinition.frameDurations[-8792169 * this.frameDelayIDX]), i, i_14_, this.animationDefinition.aBoolean4185, null);
		}
	}

	public final void method5831(ModelToolkit modelToolkit) {
		if (this.animationDefinition.frames != null && animatePlayer()) {
			modelToolkit.method4737((this.aClass441_5534.aClass298_Sub37_Sub4_5583), (this.aClass441_5534.collectionID * 806878007));
			if (this.aBoolean5531 && null != this.animationDefinition.anIntArray4174 && (this.aClass441_5535.aBoolean5585))
				modelToolkit.method4737((this.aClass441_5535.aClass298_Sub37_Sub4_5583), (this.aClass441_5535.collectionID) * 806878007);
		}
	}

	public final boolean method5978() {
		return this.aBoolean5530;
	}

	public final void method5833(int i, int i_16_) {
		method5824(i, i_16_, 0, false);
	}

	public final void method5979() {
		method5835(0);
	}

	public final void method5835(int i) {
		this.frameDelayIDX = 0;
		this.anInt5529 = -1266936279 * ((this.animationDefinition.frames).length > 1 ? 1 : -1);
		this.anInt5525 = 0;
		this.aBoolean5530 = false;
		this.anInt5526 = i * -2070327261;
		this.anInt5527 = 0;
		if (null != this.animationDefinition & this.animationDefinition.frames != null) {
			method5837(this.animationDefinition, -8792169 * this.frameDelayIDX);
			method5844();
		}
	}

	public final boolean method5836(int i, int i_19_) {
		if (this.animationDefinition == null | (i -= this.anInt5526 * -1577984117) <= 0)
			return false;
		return (this.animationDefinition.tweening | (458730501 * this.anInt5525 + i > (this.animationDefinition.frameDurations[-8792169 * this.frameDelayIDX])));
	}

	void method5837(AnimationDefinition class391, int i) {
		/* empty */
	}

	final boolean animatePlayer() {
		if (this.animationDefinition != null) {
			boolean bool = this.aClass441_5534.method5863(AnimationDefinitionLoader.animationDefinitionLoader, this.animationDefinition, this.frameDelayIDX * -8792169, -112073191 * this.anInt5529, this.animationDefinition.frames);
			if (bool && this.aBoolean5531 && this.animationDefinition.anIntArray4174 != null)
				this.aClass441_5535.method5863(AnimationDefinitionLoader.animationDefinitionLoader, this.animationDefinition, this.frameDelayIDX * -8792169, this.anInt5529 * -112073191, this.animationDefinition.anIntArray4174);
			return bool;
		}
		return false;
	}

	public final void animate(ModelToolkit modelToolkit, int i) {
		if (this.animationDefinition != null) {
			if (null != this.animationDefinition.frames && animatePlayer()) {
				modelToolkit.method4735((this.aClass441_5534.aClass298_Sub37_Sub4_5583), (this.aClass441_5534.collectionID) * 806878007, (this.aClass441_5534.aClass298_Sub37_Sub4_5587), (this.aClass441_5534.frameID) * -643912397, this.anInt5525 * 458730501, (this.animationDefinition.frameDurations[-8792169 * this.frameDelayIDX]), i, this.animationDefinition.aBoolean4185);
				if (this.aBoolean5531 && (null != this.animationDefinition.anIntArray4174) && (this.aClass441_5535.aBoolean5585))
					modelToolkit.method4735((this.aClass441_5535.aClass298_Sub37_Sub4_5583), (this.aClass441_5535.collectionID) * 806878007, (this.aClass441_5535.aClass298_Sub37_Sub4_5587), (-643912397 * (this.aClass441_5535.frameID)), this.anInt5525 * 458730501, (this.animationDefinition.frameDurations[-8792169 * this.frameDelayIDX]), i, this.animationDefinition.aBoolean4185);
			}
		}
	}

	public final void method5840(Animator animator_22_) {
		this.animationDefinition = animator_22_.animationDefinition;
		this.aBoolean5530 = animator_22_.aBoolean5530;
		this.aBoolean5531 = animator_22_.aBoolean5531;
		this.anInt5526 = 1 * animator_22_.anInt5526;
		this.anInt5527 = animator_22_.anInt5527 * 1;
		this.frameDelayIDX = animator_22_.frameDelayIDX * 1;
		this.anInt5529 = animator_22_.anInt5529 * 1;
		this.anInt5525 = 1 * animator_22_.anInt5525;
		method5844();
	}

	public final void method5841(int i, boolean bool, boolean bool_23_, byte i_24_) {
		method5825(i, 0, 0, bool, bool_23_);
	}

	public final void method5842() {
		this.anInt5527 = 0;
	}

	public final void method5843(int i, boolean bool) {
		method5824(i, 0, 0, bool);
	}

	final void method5844() {
		this.aClass441_5534.method5864();
		if (this.aBoolean5531)
			this.aClass441_5535.method5864();
	}

	Animator(boolean bool) {
		this.aBoolean5531 = bool;
		this.aClass441_5534 = new Class441();
		if (this.aBoolean5531)
			this.aClass441_5535 = new Class441();
		else
			this.aClass441_5535 = null;
	}

}
