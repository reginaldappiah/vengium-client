package com.jagex;/* Class365_Sub1_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.maths.Matrix43f;

public class Projectile extends Class365_Sub1_Sub1 {
	int equipmentSlot;
	int initialHeight;
	int senderIndex;
	public int startTick;
	public int anInt10045;
	int graphic;
	Animator aAnimator_10047;
	int verticalPitch;
	public int endTick;
	double aDouble10050;
	boolean aBoolean10051;
	boolean aBoolean10052 = false;
	double aDouble10053;
	int initialDisplacement;
	double aDouble10055;
	double aDouble10056;
	double aDouble10057;
	public int targetIndex;
	int anInt10059 = 0;
	boolean aBoolean10060 = false;
	ParticleSystem aParticleSystem_10061;

	public int method4361() {
		try {
			return this.anInt10059 * 1137666943;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aka.bm(").append(')').toString());
		}
	}

	public final void method4405(int i, int i_0_, int i_1_, int i_2_) {
			Vector3f vector3f = Vector3f.method2005(getWorldTransform().trans);
			if (!this.aBoolean10052) {
				float vectorX = (float) i - vector3f.x;
				float vectorZ = (float) i_0_ - vector3f.z;
				float f_5_ = (float) Math.sqrt((double) (vectorZ * vectorZ + vectorX * vectorX));
				if (0.0F != f_5_) {
					vector3f.x += (float) (732601943 * (this.initialDisplacement)) * vectorX / f_5_;
					vector3f.z += (float) (732601943 * (this.initialDisplacement)) * vectorZ / f_5_;
				}
				if (this.aBoolean10051)
					vector3f.y = (float) (Class356.getAverageHeight((int) (vector3f.x), (int) (vector3f.z), plane, -1463922586) - (this.initialHeight) * 1403412253);
				method4340(vector3f);
			}
			double d = (double) (endTick * -1349988959 + 1 - i_2_);
			this.aDouble10053 = (double) ((float) i - vector3f.x) / d;
			this.aDouble10050 = (double) ((float) i_0_ - vector3f.z) / d;
			this.aDouble10055 = Math.sqrt((this.aDouble10050 * this.aDouble10050) + (this.aDouble10053 * (this.aDouble10053)));
			if (-1 != this.verticalPitch * 1575706083) {
				if (!this.aBoolean10052)
					this.aDouble10056 = (-this.aDouble10055 * Math.tan(0.02454369 * (double) (1575706083 * this.verticalPitch)));
				this.aDouble10057 = (2.0 * ((double) ((float) i_1_ - vector3f.y) - d * this.aDouble10056) / (d * d));
			} else
				this.aDouble10056 = (double) ((float) i_1_ - vector3f.y) / d;
			vector3f.cache();
	}

	public void method4406(int i) {
		try {
			if (!this.aBoolean10052) {
				if (0 != (this.senderIndex * 132125965)) {
					Entity class365_sub1_sub1_sub2 = null;
					if (GameClient.anInt8724 * 1596783995 == 0)
						class365_sub1_sub1_sub2 = Class87.aClass94Array794[(this.senderIndex * 132125965) - 1].method1015();
					else if ((this.senderIndex * 132125965) < 0) {
						int i_6_ = (-(this.senderIndex * 132125965) - 1);
						if (-442628795 * GameClient.playerIndex == i_6_)
							class365_sub1_sub1_sub2 = Player.myPlayer;
						else
							class365_sub1_sub1_sub2 = (GameClient.entities[i_6_]);
					} else {
						int i_7_ = ((132125965 * this.senderIndex) - 1);
						ObjectNode class298_sub29 = ((ObjectNode) GameClient.entityList.get((long) i_7_));
						if (null != class298_sub29)
							class365_sub1_sub1_sub2 = ((Entity) class298_sub29.nodeObject);
					}
					if (class365_sub1_sub1_sub2 != null) {
						Vector3f class217 = (class365_sub1_sub1_sub2.getWorldTransform().trans);
						method4341(class217.x, (float) ((Class356.getAverageHeight((int) class217.x, (int) class217.z, plane, -1098231500)) - (1403412253 * this.initialHeight)), class217.z);
						if ((this.equipmentSlot * -1955698847) >= 0) {
							Class350 class350 = class365_sub1_sub1_sub2.method4426();
							int i_8_ = 0;
							int i_9_ = 0;
							if (null != class350.anIntArrayArray3710 && null != (class350.anIntArrayArray3710[(this.equipmentSlot) * -1955698847])) {
								i_8_ += (class350.anIntArrayArray3710[(-1955698847 * (this.equipmentSlot))][0]);
								i_9_ += (class350.anIntArrayArray3710[(this.equipmentSlot) * -1955698847][2]);
							}
							if (class350.anIntArrayArray3753 != null && ((class350.anIntArrayArray3753[-1955698847 * this.equipmentSlot]) != null)) {
								i_8_ += (class350.anIntArrayArray3753[(-1955698847 * (this.equipmentSlot))][0]);
								i_9_ += (class350.anIntArrayArray3753[(this.equipmentSlot) * -1955698847][2]);
							}
							if (i_8_ != 0 || 0 != i_9_) {
								int i_10_ = class365_sub1_sub1_sub2.aClass386_10084.method4719((byte) 0);
								int i_11_ = i_10_;
								if ((class365_sub1_sub1_sub2.anIntArray10085 != null) && (class365_sub1_sub1_sub2.anIntArray10085[(this.equipmentSlot) * -1955698847]) != -1)
									i_11_ = (class365_sub1_sub1_sub2.anIntArray10085[(-1955698847 * this.equipmentSlot)]);
								int i_12_ = i_11_ - i_10_ & 0x3fff;
								int i_13_ = CircleAngleTable.SINE[i_12_];
								int i_14_ = CircleAngleTable.COSINE[i_12_];
								int i_15_ = i_9_ * i_13_ + i_8_ * i_14_ >> 14;
								i_9_ = i_9_ * i_14_ - i_13_ * i_8_ >> 14;
								i_8_ = i_15_;
								Vector3f class217_16_ = Vector3f.method2005(getWorldTransform().trans);
								class217_16_.x += (float) i_8_;
								class217_16_.z += (float) i_9_;
								method4340(class217_16_);
								class217_16_.cache();
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aka.f(").append(')').toString());
		}
	}

	public final void method4407(int tick, byte i_19_) {
		try {
			this.aBoolean10052 = true;
			Class235 class235 = new Class235(getWorldTransform());
			class235.trans.x += this.aDouble10053 * (double) tick;
			class235.trans.z += this.aDouble10050 * (double) tick;
			if (this.aBoolean10051)
				class235.trans.y = (float) (Class356.getAverageHeight((int) (class235.trans.x), (int) (class235.trans.z), plane, -1903626222) - 1403412253 * (this.initialHeight));
			else if (this.verticalPitch * 1575706083 != -1) {
				class235.trans.y += ((double) tick * ((double) tick * (0.5 * (this.aDouble10057))) + ((double) tick * this.aDouble10056));
				this.aDouble10056 += ((double) tick * this.aDouble10057);
			} else
				class235.trans.y += (this.aDouble10056 * (double) tick);
			class235.aQuaternion_2600.method2023(1.0F, 0.0F, 0.0F, (float) Math.atan2((this.aDouble10056), (this.aDouble10055)));
			Quaternion quaternion = Quaternion.method2019();
			quaternion.method2023(0.0F, 1.0F, 0.0F, ((float) Math.atan2(this.aDouble10053, this.aDouble10050) - 3.1415927F));
			class235.aQuaternion_2600.method2026(quaternion);
			quaternion.method2029();
			method4339(class235);
			if (this.aAnimator_10047.method5981(1) && this.aAnimator_10047.method5978())
				this.aAnimator_10047.method5979();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aka.b(").append(')').toString());
		}
	}

	void method4404() {
		try {
			Vector3f class217 = getWorldTransform().trans;
			aShort9798 = aShort9796 = (short) (int) (class217.x / 512.0F);
			aShort9795 = aShort9797 = (short) (int) (class217.z / 512.0F);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aka.ew(").append(')').toString());
		}
	}

	public Class334 method4358(GraphicsToolkit graphicsToolkit) {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aka.bc(").append(')').toString());
		}
	}

	boolean method4399() {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aka.bf(").append(')').toString());
		}
	}

	boolean method4350(GraphicsToolkit class_ra, int i, int i_20_, byte i_21_) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aka.bu(").append(')').toString());
		}
	}

	final boolean method4366() {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aka.bw(").append(')').toString());
		}
	}

	final void method4355(GraphicsToolkit graphicsToolkit, Class365_Sub1 class365_sub1, int i, int i_22_, int i_23_, boolean bool) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aka.bk(").append(')').toString());
		}
	}

	final void method4398() {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aka.bq(").append(')').toString());
		}
	}

	Class335 method4394(GraphicsToolkit graphicsToolkit) {
		try {
			ModelToolkit class387 = method4410(graphicsToolkit, 2048, -1431142826);
			if (class387 == null)
				return null;
			Matrix43f class222 = method4347();
			method4408(graphicsToolkit, class387, class222, 752544216);
			Class335 class335 = StaticMethods.method818(false);
			class387.render(class222, aClass302_Sub1Array7726[0], 0);
			if (null != this.aParticleSystem_10061) {
				Class69 class69 = this.aParticleSystem_10061.method4229();
				graphicsToolkit.renderParticles(class69);
			}
			this.aBoolean10060 = class387.i();
			class387.n();
			this.anInt10059 = class387.YA() * -1389603713;
			return class335;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aka.bo(").append(')').toString());
		}
	}

	void method4408(GraphicsToolkit class_ra, ModelToolkit class387, Matrix43f class222, int i) {
		try {
			class387.method4463(class222);
			EmissiveTriangle[] emissiveTriangles = class387.method4464();
			EffectiveVertex[] effectiveVertices = class387.method4445();
			if ((null == this.aParticleSystem_10061 || (this.aParticleSystem_10061.aBoolean3992)) && (null != emissiveTriangles || effectiveVertices != null))
				this.aParticleSystem_10061 = ParticleSystem.getSystem(GameClient.clientTick * 443738891, true);
			if (this.aParticleSystem_10061 != null) {
				this.aParticleSystem_10061.createObject(class_ra, (long) (443738891 * GameClient.clientTick), emissiveTriangles, effectiveVertices, false);
				this.aParticleSystem_10061.setPlane(plane);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aka.i(").append(')').toString());
		}
	}

	boolean method4376() {
		try {
			return this.aBoolean10060;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aka.be(").append(')').toString());
		}
	}

	void method4409() {
		Vector3f class217 = getWorldTransform().trans;
		aShort9798 = aShort9796 = (short) (int) (class217.x / 512.0F);
		aShort9795 = aShort9797 = (short) (int) (class217.z / 512.0F);
	}

	ModelToolkit method4410(GraphicsToolkit class_ra, int i, int i_30_) {
		try {
			SpotType class398 = (SpotTypeLoader.loader.get(1528803725 * this.graphic));
			return class398.method4917(class_ra, i, (this.aAnimator_10047), (byte) 2);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aka.p(").append(')').toString());
		}
	}

	void method4357(GraphicsToolkit class_ra, int i) {
		try {
			ModelToolkit class387 = method4410(class_ra, 0, -1431142826);
			if (null != class387) {
				Matrix43f class222 = method4347();
				this.anInt10059 = class387.YA() * -1389603713;
				class387.n();
				method4408(class_ra, class387, class222, 1295394803);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aka.bb(").append(')').toString());
		}
	}

	public void method4411(int i) {
		try {
			if (null != this.aParticleSystem_10061)
				this.aParticleSystem_10061.method4221();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aka.k(").append(')').toString());
		}
	}

	public Projectile(Region class331, int graphic, int plane, int collisionPlane, int worldX, int worldY, int initialHeight, int startTick, int endTick, int verticalPitch, int initialDisplacement, int senderIndex, int targetIndex, int i_42_, boolean bool, int equipmentSlot) {
		super(class331, plane, collisionPlane, worldX, Class356.getAverageHeight(worldX, worldY, plane, -1556375135) - initialHeight, worldY, worldX >> 9, worldX >> 9, worldY >> 9, worldY >> 9, false, (byte) 0);
		this.graphic = graphic * -342886075;
		this.startTick = 52330647 * startTick;
		this.endTick = -195668383 * endTick;
		this.verticalPitch = -1889087541 * verticalPitch;
		this.initialDisplacement = initialDisplacement * -1501352601;
		this.senderIndex = -113917499 * senderIndex;
		this.targetIndex = targetIndex * 1040105721;
		this.initialHeight = initialHeight * -1635034315;
		this.anInt10045 = -954169831 * i_42_;
		this.aBoolean10051 = bool;
		this.aBoolean10052 = false;
		this.equipmentSlot = 1279163553 * equipmentSlot;
		int animation = (SpotTypeLoader.loader.get(this.graphic * 1528803725).animationID) * 1505778629;
		this.aAnimator_10047 = new Animator_Sub2(this, false);
		this.aAnimator_10047.load(animation);
		method4362(1);
	}

	void method4412() {
		Vector3f class217 = getWorldTransform().trans;
		aShort9798 = aShort9796 = (short) (int) (class217.x / 512.0F);
		aShort9795 = aShort9797 = (short) (int) (class217.z / 512.0F);
	}

}
