package com.jagex;/* Class60 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.settings.SceneryShadowsSettings;
import com.jagex.maths.Matrix43f;

public class Class60 {
	ModelToolkit modelToolkit;
	ObjectDefinitionLoader objectDefinitionLoader;
	int anInt586;
	Class365_Sub1 aClass365_Sub1_587;
	byte aByte588;
	int anInt589;
	int anInt590;
	boolean aBoolean591 = false;
	boolean aBoolean592;
	Animator aAnimator_593;
	int anInt594;
	int anInt595 = -1646192771;
	boolean[] aBooleanArray596;
	Class435 aClass435_597;
	boolean aBoolean598;
	Class_na aClass_na599;
	boolean aBoolean600;
	int fileID;
	ParticleSystem aParticleSystem_602;
	byte plane;

	public void method697(int i) {
			this.aBoolean592 = true;
			method704(false, i, 1);
	}

	void method698(Class435 class435) {
			this.aClass435_597 = class435;
			this.modelToolkit = null;
	}

	int method699() {
			return -method705();
	}

	final ModelToolkit method700(GraphicsToolkit graphicsToolkit, int i, boolean bool, boolean bool_1_) {
			ObjectDefinition objectDefinition = (this.objectDefinitionLoader.get(1686561661 * this.fileID));
			if (objectDefinition.objectIDs != null)
				objectDefinition = objectDefinition.method5777((0 == 1596783995 * GameClient.anInt8724 ? Class87.componentMouseRecorder : Class128.playerVarsProvider));
			if (objectDefinition == null) {
				method707();
				this.anInt595 = -1646192771;
				return null;
			}
			if (!this.aBoolean592 && (-72440277 * this.anInt595 != objectDefinition.objectID * 1181652947)) {
				method704(true, -1, 0);
				this.aBoolean600 = false;
				this.modelToolkit = null;
			}
			method703();
			if (bool_1_)
				bool_1_ = bool_1_ & (this.aBoolean598 & !this.aBoolean600 & SettingsManager.settingsManager.sceneryShadows.getValue() != SceneryShadowsSettings.NONE);
			if (bool && !bool_1_) {
				this.anInt595 = -722933511 * objectDefinition.objectID;
				return null;
			}
			Vector3f class217 = (this.aClass365_Sub1_587.getWorldTransform().trans);
			Region class331 = GameClient.myRegion.getRegion();
			if (bool_1_) {
				class331.method4047(this.aClass_na599, this.aByte588, (int) class217.x, (int) class217.z, this.aBooleanArray596, 528677416);
				this.aBoolean600 = false;
			}
			FloorToolkit class_xa = class331.aClass_xaArray3517[this.aByte588];
			FloorToolkit class_xa_3_;
			if (this.aBoolean591)
				class_xa_3_ = class331.aClass_xaArray3519[0];
			else
				class_xa_3_ = (this.aByte588 < 3 ? (class331.aClass_xaArray3517[1 + this.aByte588]) : null);
			ModelToolkit class387 = null;
			if (this.aAnimator_593.hasAnimationDefinition()) {
				if (bool_1_)
					i |= 0x40000;
				class387 = (objectDefinition.method5774(graphicsToolkit, i, (11 != this.anInt589 * -1598457753 ? -1598457753 * this.anInt589 : 10), (11 == -1598457753 * this.anInt589 ? 4 + this.anInt590 * 748228569 : 748228569 * this.anInt590), class_xa, class_xa_3_, (int) class217.x, class_xa.method6340((int) class217.x, (int) class217.z), (int) class217.z, this.aAnimator_593, this.aClass435_597, (byte) 18));
				if (null != class387) {
					if (bool_1_) {
						if (null == this.aBooleanArray596)
							this.aBooleanArray596 = new boolean[4];
						this.aClass_na599 = class387.ga(this.aClass_na599);
						class331.method4055(this.aClass_na599, this.aByte588, (int) class217.x, (int) class217.z, this.aBooleanArray596, -1719073428);
						this.aBoolean600 = true;
					}
					this.anInt586 = class387.YA() * -1931353415;
					class387.n();
				} else {
					this.aBooleanArray596 = null;
					this.aClass_na599 = null;
					this.anInt586 = 0;
				}
				this.modelToolkit = null;
			} else if (this.modelToolkit == null || (this.modelToolkit.m() & i) != i || (-72440277 * this.anInt595 != 1181652947 * objectDefinition.objectID)) {
				if (this.modelToolkit != null)
					i |= this.modelToolkit.m();
				FontMetricsDefinitionLoader fontMetricsDefinitionLoader = (objectDefinition.method5785(graphicsToolkit, i, (this.anInt589 * -1598457753 != 11 ? -1598457753 * this.anInt589 : 10), (11 == this.anInt589 * -1598457753 ? 748228569 * this.anInt590 + 4 : 748228569 * this.anInt590), class_xa, class_xa_3_, (int) class217.x, class_xa.method6340((int) class217.x, (int) class217.z), (int) class217.z, bool_1_, this.aClass435_597, -105046202));
				if (fontMetricsDefinitionLoader != null) {
					this.modelToolkit = class387 = (ModelToolkit) fontMetricsDefinitionLoader.toolkit;
					if (bool_1_) {
						this.aClass_na599 = (Class_na) fontMetricsDefinitionLoader.anObject5646;
						this.aBooleanArray596 = null;
						class331.method4055(this.aClass_na599, this.aByte588, (int) class217.x, (int) class217.z, null, -1920595487);
						this.aBoolean600 = true;
					}
					this.anInt586 = class387.YA() * -1931353415;
					class387.n();
				} else {
					this.aBooleanArray596 = null;
					this.aClass_na599 = null;
					this.modelToolkit = null;
					this.anInt586 = 0;
				}
			} else
				class387 = this.modelToolkit;
			this.anInt595 = objectDefinition.objectID * -722933511;
			return class387;
	}

	void method701(GraphicsToolkit graphicsToolkit, ModelToolkit modelToolkit, Matrix43f matrix43f, boolean bool) {
			EmissiveTriangle[] emissiveTriangles = modelToolkit.method4464();
			EffectiveVertex[] effectiveVertices = modelToolkit.method4445();
			if ((this.aParticleSystem_602 == null || this.aParticleSystem_602.aBoolean3992) && (null != emissiveTriangles || effectiveVertices != null)) {
				ObjectDefinition objectDefinition = (this.objectDefinitionLoader.get(1686561661 * this.fileID));
				if (objectDefinition.objectIDs != null)
					objectDefinition = (objectDefinition.method5777((GameClient.anInt8724 * 1596783995 == 0 ? Class87.componentMouseRecorder : Class128.playerVarsProvider)));
				if (null != objectDefinition)
					this.aParticleSystem_602 = ParticleSystem.getSystem(GameClient.clientTick * 443738891, true);
			}
			if (null != this.aParticleSystem_602) {
				modelToolkit.method4463(matrix43f);
				if (bool)
					this.aParticleSystem_602.createObject(graphicsToolkit, (long) (GameClient.clientTick * 443738891), emissiveTriangles, effectiveVertices, false);
				else
					this.aParticleSystem_602.method4233((long) (443738891 * GameClient.clientTick));
				this.aParticleSystem_602.setPlane((this.plane));
			}
	}

	void method702(GraphicsToolkit graphicsToolkit) {
			method700(graphicsToolkit, 262144, true, true);
	}

	Class60(GraphicsToolkit class_ra, ObjectDefinitionLoader class433, ObjectDefinition class432, int i, int i_8_, int i_9_, int i_10_, Class365_Sub1 class365_sub1, boolean bool, int i_11_) {
		this.anInt586 = 0;
		this.aBoolean592 = false;
		this.aBoolean600 = false;
		this.objectDefinitionLoader = class433;
		this.fileID = -2096584305 * class432.objectID;
		this.anInt589 = -1523702953 * i;
		this.anInt590 = i_8_ * -1809022871;
		this.aClass365_Sub1_587 = class365_sub1;
		this.aBoolean592 = -1 != i_11_;
		this.plane = (byte) i_9_;
		this.aByte588 = (byte) i_10_;
		this.aBoolean591 = bool;
		this.aBoolean598 = (class_ra.method5082() && class432.aBoolean5433 && !this.aBoolean591);
		this.aAnimator_593 = new Animator_Sub2(class365_sub1, false);
		method704(false, i_11_, 1);
	}

	void method703() {
			if (this.aAnimator_593.hasAnimationDefinition()) {
				if (this.aAnimator_593.method5981((GameClient.clientTick * 443738891 - -735091231 * this.anInt594))) {
					if (SettingsManager.settingsManager.sceneryShadows.getValue() == SceneryShadowsSettings.DYNAMIC)
						this.aBoolean600 = false;
					if (this.aAnimator_593.method5978()) {
						this.aAnimator_593.load(-1);
						this.aBoolean592 = false;
						method704(false, -1, 0);
					}
				}
			} else
				method704(false, -1, 0);
			this.anInt594 = -803072405 * GameClient.clientTick;
	}

	void method704(boolean bool, int i, int i_12_) {
			int i_14_ = i;
			boolean bool_15_ = false;
			if (i_14_ == -1) {
				ObjectDefinition class432 = (this.objectDefinitionLoader.get(this.fileID * 1686561661));
				ObjectDefinition class432_16_ = class432;
				if (class432.objectIDs != null)
					class432 = (class432.method5777((1596783995 * GameClient.anInt8724 == 0 ? Class87.componentMouseRecorder : Class128.playerVarsProvider)));
				if (class432 == null)
					return;
				if (class432 == class432_16_)
					class432_16_ = null;
				if (class432.objectAnimationExists()) {
					if (bool && this.aAnimator_593.hasAnimationDefinition() && class432.containsAnimationID(this.aAnimator_593.getAnimationID()))
						return;
					if (1181652947 * class432.objectID != -72440277 * this.anInt595)
						bool_15_ = class432.aBoolean5431;
					i_14_ = class432.method5781();
					if (class432.objectAnimationsExist())
						i_12_ = 0;
					else
						i_12_ = 1;
				} else if (null != class432_16_ && class432_16_.objectAnimationExists()) {
					if (bool && this.aAnimator_593.hasAnimationDefinition() && class432_16_.containsAnimationID(this.aAnimator_593.getAnimationID()))
						return;
					if (this.anInt595 * -72440277 != 1181652947 * class432.objectID)
						bool_15_ = class432_16_.aBoolean5431;
					i_14_ = class432_16_.method5781();
					if (class432_16_.objectAnimationsExist())
						i_12_ = 0;
					else
						i_12_ = 1;
				}
			}
			if (i_14_ == -1)
				this.aAnimator_593.method5843(-1, false);
			else {
				this.aAnimator_593.method5824(i_14_, 0, i_12_, bool_15_);
				this.anInt594 = GameClient.clientTick * -803072405;
				this.aBoolean600 = false;
				this.modelToolkit = null;
			}
	}

	int method705() {
			return -60718199 * this.anInt586;
		}

	boolean method706() {
			return this.aBoolean598;
	}

	void method707() {
			if (null != this.aClass_na599) {
				Vector3f class217 = (this.aClass365_Sub1_587.getWorldTransform().trans);
				GameClient.myRegion.getRegion().method4047(this.aClass_na599, this.aByte588, (int) class217.x, (int) class217.z, this.aBooleanArray596, 677085165);
				this.aBooleanArray596 = null;
				this.aClass_na599 = null;
			}
	}

	public static void method710(boolean bool, int i) {
			if (null == Class288_Sub1.target)
				Class288_Sub1.method5191();
			if (bool)
				Class288_Sub1.target.method2037();
	}

}
