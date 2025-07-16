package com.jagex;/* ParticleSystem - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ParticleSystem {
	int anInt3760;
	boolean aBoolean3761;
	Class302_Sub3_Sub1_Sub1[] aClass302_Sub3_Sub1_Sub1Array3762;
	int anInt3763;
	long aLong3764;
	Class69 aClass69_3765;
	List aList3766;
	int plane;
	List aList3768;
	int anInt3769;
	boolean aBoolean3770;
	boolean aBoolean3771;
	public boolean aBoolean3992 = false;
	long aLong3773;
	static boolean[] aBooleanArray3774 = new boolean[32];
	static boolean[] aBooleanArray3775 = new boolean[8];

	ParticleSystem(int i, boolean bool) {
		this.aBoolean3761 = false;
		this.anInt3763 = 0;
		this.aList3766 = new LinkedList();
		this.anInt3760 = 0;
		this.aList3768 = new LinkedList();
		this.anInt3769 = 0;
		this.aBoolean3770 = false;
		this.aBoolean3771 = false;
		this.aClass69_3765 = new Class69();
		this.aClass302_Sub3_Sub1_Sub1Array3762 = new Class302_Sub3_Sub1_Sub1[8192];
		method4219(i, bool);
	}

	void method4219(int i, boolean bool) {
		Class344.aList3683.add(this);
		this.aLong3773 = (long) i;
		this.aLong3764 = (long) i;
		this.aBoolean3770 = true;
		this.aBoolean3771 = bool;
	}

	public void method4220() {
		this.aBoolean3770 = true;
	}

	public void method4221() {
		this.aBoolean3761 = true;
	}

	boolean method4222(GraphicsToolkit class_ra, long l) {
		if (this.aLong3773 != this.aLong3764)
			method4221();
		else
			method4230();
		if (l - this.aLong3773 > 750L) {
			method4223();
			return false;
		}
		int i = (int) (l - this.aLong3764);
		if (this.aBoolean3770) {
			Iterator iterator = this.aList3766.iterator();
			while (iterator.hasNext()) {
				Class342 class342 = (Class342) iterator.next();
				for (int i_0_ = 0; i_0_ < (class342.aClass182_3656.anInt1852 * 1095253617); i_0_++)
					class342.method4147(class_ra, l, 1, !this.aBoolean3761, (byte) 63);
			}
			this.aBoolean3770 = false;
		}
		Iterator iterator = this.aList3766.iterator();
		while (iterator.hasNext()) {
			Class342 class342 = (Class342) iterator.next();
			class342.method4147(class_ra, l, i, !this.aBoolean3761, (byte) 45);
		}
		this.aLong3764 = l;
		return true;
	}

	void method4223() {
		aBoolean3992 = true;
		Iterator iterator = this.aList3768.iterator();
		while (iterator.hasNext()) {
			Class298_Sub45 class298_sub45 = (Class298_Sub45) iterator.next();
			if ((class298_sub45.aClass190_7514.anInt1940 * -1955592777) == 1)
				class298_sub45.unlink();
		}
		for (int i = 0; i < this.aClass302_Sub3_Sub1_Sub1Array3762.length; i++) {
			if (this.aClass302_Sub3_Sub1_Sub1Array3762[i] != null) {
				this.aClass302_Sub3_Sub1_Sub1Array3762[i].method3726();
				this.aClass302_Sub3_Sub1_Sub1Array3762[i] = null;
			}
		}
		this.anInt3763 = 0;
		this.aList3766 = new LinkedList();
		this.anInt3760 = 0;
		this.aList3768 = new LinkedList();
		this.anInt3769 = 0;
	}

	void method4224(GraphicsToolkit graphicsToolkit, EmissiveTriangle[] emissiveTriangles, boolean bool) {
		for (int i = 0; i < 32; i++)
			aBooleanArray3774[i] = false;
		Iterator iterator = this.aList3766.iterator();
		while_84_: while (iterator.hasNext()) {
			Class342 class342 = (Class342) iterator.next();
			if (emissiveTriangles != null) {
				for (int index = 0; index < emissiveTriangles.length; index++) {
					if (class342.aEmissiveTriangle_3662 == emissiveTriangles[index] || (class342.aEmissiveTriangle_3662 == emissiveTriangles[index].aEmissiveTriangle_776)) {
						aBooleanArray3774[index] = true;
						class342.method4146((byte) -40);
						class342.aBoolean3664 = false;
						continue while_84_;
					}
				}
			}
			if (!bool) {
				if (class342.anInt3652 * -917784967 == 0) {
					iterator.remove();
					this.anInt3760--;
				} else
					class342.aBoolean3664 = true;
			}
		}
		if (emissiveTriangles != null) {
			for (int i = 0; (i < emissiveTriangles.length && i != 32 && this.anInt3760 != 32); i++) {
				if (!aBooleanArray3774[i]) {
					Class342 class342 = new Class342(graphicsToolkit, emissiveTriangles[i], this, this.aLong3773);
					this.aList3766.add(class342);
					this.anInt3760++;
					aBooleanArray3774[i] = true;
				}
			}
		}
	}

	void method4225(EffectiveVertex[] effectiveVertices, boolean bool) {
		for (int i = 0; i < 8; i++)
			aBooleanArray3775[i] = false;
		Iterator iterator = this.aList3768.iterator();
		while_85_: while (iterator.hasNext()) {
			Class298_Sub45 class298_sub45 = (Class298_Sub45) iterator.next();
			if (effectiveVertices != null) {
				for (int i = 0; i < effectiveVertices.length; i++) {
					if ((class298_sub45.aEffectiveVertex_7518 == effectiveVertices[i]) || (class298_sub45.aEffectiveVertex_7518 == effectiveVertices[i].aEffectiveVertex_672)) {
						aBooleanArray3775[i] = true;
						class298_sub45.method3532(-219401060);
						continue while_85_;
					}
				}
			}
			if (!bool) {
				class298_sub45.unlink();
				this.anInt3769--;
				if (class298_sub45.isNextAvailable()) {
					class298_sub45.unlink();
					Class344.anInt3685 -= 817588661;
				}
			}
		}
		if (effectiveVertices != null) {
			for (int i = 0; (i < effectiveVertices.length && i != 8 && this.anInt3769 != 8); i++) {
				if (!aBooleanArray3775[i]) {
					Class298_Sub45 class298_sub45 = null;
					if ((effectiveVertices[i].method775().anInt1940 * -1955592777) == 1 && Class344.anInt3685 * -1237648227 < 32) {
						class298_sub45 = new Class298_Sub45(effectiveVertices[i], this);
						Class344.aClass437_3684.connect(class298_sub45, (long) (effectiveVertices[i].anInt673 * 617796067));
						Class344.anInt3685 += 817588661;
					}
					if (class298_sub45 == null)
						class298_sub45 = new Class298_Sub45(effectiveVertices[i], this);
					this.aList3768.add(class298_sub45);
					this.anInt3769++;
					aBooleanArray3775[i] = true;
				}
			}
		}
	}

	public Class69 validateParticles() {
		this.aClass69_3765.aClass448_680.method5907(198538836);
		for (int i = 0; i < this.aClass302_Sub3_Sub1_Sub1Array3762.length; i++) {
			if (this.aClass302_Sub3_Sub1_Sub1Array3762[i] != null && (this.aClass302_Sub3_Sub1_Sub1Array3762[i].aClass342_10037) != null)
				this.aClass69_3765.aClass448_680.method5908(this.aClass302_Sub3_Sub1_Sub1Array3762[i], (byte) -89);
		}
		return this.aClass69_3765;
	}

	public void setPlane(int plane) {
		this.plane = plane;
	}

	void method4228(Region class331, GraphicsToolkit class_ra) {
		this.aClass69_3765.aClass448_680.method5907(-1313547025);
		Iterator iterator = this.aList3766.iterator();
		while (iterator.hasNext()) {
			Class342 class342 = (Class342) iterator.next();
			class342.method4148(class331, class_ra, this.aLong3764);
		}
	}

	public Class69 method4229() {
		return this.aClass69_3765;
	}

	void method4230() {
		this.aBoolean3761 = false;
	}

	public void createObject(GraphicsToolkit class_ra, long l, EmissiveTriangle[] emissiveTriangles, EffectiveVertex[] effectiveVertices, boolean bool) {
		if (!aBoolean3992) {
			method4224(class_ra, emissiveTriangles, bool);
			method4225(effectiveVertices, bool);
			this.aLong3773 = l;
		}
	}

	public static ParticleSystem getSystem(int tick, boolean bool) {
		if (Class344.anInt3681 * -1264407527 != Class344.anInt3680 * 274948937) {
			ParticleSystem particleSystem = Class344.aParticleSystemArray3679[Class344.anInt3680 * 274948937];
			Class344.anInt3680 = ((Class344.anInt3680 * 274948937 + 1 & Class65.anIntArray658[Class344.anInt3675 * 1197525581]) * 172162809);
			particleSystem.method4219(tick, bool);
			return particleSystem;
		}
		return new ParticleSystem(tick, bool);
	}

	public void method4233(long l) {
		this.aLong3773 = l;
	}
}
