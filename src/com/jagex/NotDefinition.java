package com.jagex;/* Class298_Sub41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class NotDefinition extends Node {
	Class298_Sub23 aClass298_Sub23_7420;
	static Class453 aClass453_7421 = new Class453();
	int anInt7422;
	int anInt7423;
	int anInt7424;
	int anInt7425;
	Class298_Sub19_Sub2 aClass298_Sub19_Sub2_7426;
	int anInt7427;
	int anInt7428;
	int anInt7429;
	int anInt7430;
	int[] anIntArray7432;
	NPC npc;
	Player player;
	ObjectDefinition objectDefinition;
	boolean aBoolean7437;
	int anInt7439 = 0;
	static LinkedList aClass437_7440 = new LinkedList(16);;
	int anInt7441;
	int anInt7443;
	boolean aBoolean7444;
	Class298_Sub23 aClass298_Sub23_7445;
	Class298_Sub26_Sub1 aClass298_Sub26_Sub1_7446;
	Class298_Sub19_Sub2 aClass298_Sub19_Sub2_7447;
	int anInt7449;
	int anInt7450;
	boolean aBoolean7451;
	int anInt7452;
	Class298_Sub26_Sub1 aClass298_Sub26_Sub1_7453;
	int anInt7454;
	static Class453 aClass453_7455 = new Class453();
	public static int anInt7456;

	void method3519() {
		try {
			int i_0_ = 391847895 * this.anInt7443;
			boolean bool = this.aBoolean7444;
			if (null != this.objectDefinition) {
				ObjectDefinition objectDefinition = (this.objectDefinition.method5777((GameClient.anInt8724 * 1596783995 == 0 ? Class87.componentMouseRecorder : Class128.playerVarsProvider)));
				if (null != objectDefinition) {
					this.anInt7443 = objectDefinition.anInt5422 * 128561991;
					this.aBoolean7444 = objectDefinition.aBoolean5426;
					this.anInt7430 = 1644605369 * (-161350689 * objectDefinition.anInt5408 << 9);
					this.anInt7449 = -1807698503 * objectDefinition.anInt5425;
					this.anInt7450 = 763489431 * objectDefinition.anInt5427;
					this.anInt7422 = objectDefinition.anInt5428 * 1972784599;
					this.anIntArray7432 = objectDefinition.anIntArray5429;
					this.aBoolean7451 = objectDefinition.aBoolean5395;
					this.anInt7452 = objectDefinition.anInt5439 * -1937096719;
					this.anInt7441 = objectDefinition.anInt5438 * 1100795;
				} else {
					this.anInt7443 = -502744039;
					this.aBoolean7444 = false;
					this.anInt7430 = 0;
					this.anInt7449 = 0;
					this.anInt7450 = 0;
					this.anInt7422 = 0;
					this.anIntArray7432 = null;
					this.aBoolean7451 = false;
					this.anInt7452 = -1197363456;
					this.anInt7441 = -900102912;
					this.anInt7429 = 0;
				}
			} else if ((this.npc) != null) {
				int i_1_ = (StaticMethods.method1398((this.npc)));
				if (i_1_ != i_0_) {
					this.anInt7443 = i_1_ * 502744039;
					NPCDefinition npcDefinition = (this.npc.aClass503_10190);
					if (npcDefinition.morphisms != null)
						npcDefinition = npcDefinition.morph(Class128.playerVarsProvider);
					if (npcDefinition != null) {
						this.anInt7430 = ((1525111487 * npcDefinition.anInt6140 << 9) * 1644605369);
						this.anInt7429 = 406226903 * (-1422618341 * npcDefinition.anInt6175 << 9);
						this.anInt7449 = -1283486135 * npcDefinition.anInt6179;
						this.aBoolean7444 = npcDefinition.aBoolean6180;
						this.anInt7452 = npcDefinition.anInt6161 * 1142643823;
						this.anInt7441 = npcDefinition.anInt6190 * 1682293055;
					} else {
						this.anInt7429 = 0;
						this.anInt7430 = 0;
						this.anInt7449 = 0;
						this.aBoolean7444 = (this.npc.aClass503_10190.aBoolean6180);
						this.anInt7452 = -1197363456;
						this.anInt7441 = -900102912;
					}
				}
			} else if ((this.player) != null) {
				this.anInt7443 = (StaticMethods.method4652((this.player))) * 502744039;
				this.aBoolean7444 = (this.player.isNPCTransformed);
				this.anInt7430 = (((this.player.transformedNPCID) * 780357347) << 9) * 1644605369;
				this.anInt7429 = 0;
				this.anInt7449 = -1138033583 * (this.player.anInt10215);
				this.anInt7452 = -1197363456;
				this.anInt7441 = -900102912;
			}
			if ((this.anInt7443 * 391847895 != i_0_ || bool != this.aBoolean7444) && this.aClass298_Sub19_Sub2_7447 != null) {
				Class285.aClass298_Sub19_Sub4_3083.method3048(this.aClass298_Sub19_Sub2_7447);
				this.aClass298_Sub19_Sub2_7447 = null;
				this.aClass298_Sub26_Sub1_7446 = null;
				this.aClass298_Sub23_7445 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("abz.b(").append(')').toString());
		}
	}



	NotDefinition() {
		/* empty */
	}
}
