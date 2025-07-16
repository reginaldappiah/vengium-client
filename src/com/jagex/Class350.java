package com.jagex;/* Class350 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.maths.Matrix43f;

import java.util.Iterator;

public class Class350 {
	public int[][] anIntArrayArray3710;
	public int key = 512849763;
	public int[] keys = null;
	public int[] anIntArray3713 = null;
	int anInt3714 = 0;
	public int anInt3715 = -241536037;
	public int anInt3716;
	public int anInt3717;
	Matrix43f[] aClass222Array3718;
	public int anInt3719;
	public int anInt3720;
	public int anInt3721;
	public int anInt3722;
	public int anInt3723;
	public int anInt3724;
	Class349 aClass349_3725;
	public int anInt3726;
	public int anInt3727;
	public int anInt3728;
	public int anInt3729;
	public int anInt3730;
	public int anInt3731;
	public int[] anIntArray3732;
	public int anInt3733 = 1442268255;
	public int anInt3734;
	public int anInt3735;
	public int anInt3736;
	public int anInt3737;
	public int anInt3738;
	public int anInt3739;
	public int anInt3740;
	public int anInt3741;
	public int[] anIntArray3742;
	public int anInt3743;
	public int anInt3744;
	public int anInt3745;
	public int anInt3746;
	public int anInt3747;
	public int anInt3748;
	public int anInt3749;
	public int anInt3750;
	public int anInt3751;
	public int anInt3752;
	public int[][] anIntArrayArray3753;
	public int anInt3754;
	public int anInt3755;
	public boolean aBoolean3756;
	static int anInt3758;
	public static String aString3759;

	void method4206(Buffer buffer, int opcode) {
			if (1 == opcode) {
				key = buffer.readBigSmart() * -512849763;
				anInt3717 = buffer.readBigSmart() * -1216995793;
			} else if (2 == opcode)
				anInt3755 = buffer.readBigSmart() * -1201368129;
			else if (opcode == 3)
				anInt3722 = buffer.readBigSmart() * 1316025001;
			else if (4 == opcode)
				anInt3727 = buffer.readBigSmart() * -1511636755;
			else if (5 == opcode)
				anInt3728 = buffer.readBigSmart() * 1034489103;
			else if (opcode == 6)
				anInt3721 = buffer.readBigSmart() * -1261244237;
			else if (opcode == 7)
				anInt3749 = buffer.readBigSmart() * -1711775317;
			else if (opcode == 8)
				anInt3746 = buffer.readBigSmart() * -1593946535;
			else if (9 == opcode)
				anInt3724 = buffer.readBigSmart() * 1566713043;
			else if (26 == opcode) {
				anInt3735 = (short) (buffer.readUByte() * 4) * 1013056483;
				anInt3736 = (short) (buffer.readUByte() * 4) * -1453025501;
			} else if (opcode == 27) {
				if (anIntArrayArray3710 == null)
					anIntArrayArray3710 = (new int[(this.aClass349_3725.aEquipmentDefaults_3707.hidden).length][]);
				int i_1_ = buffer.readUByte();
				anIntArrayArray3710[i_1_] = new int[6];
				for (int i_2_ = 0; i_2_ < 6; i_2_++)
					anIntArrayArray3710[i_1_][i_2_] = buffer.readShort();
			} else if (opcode == 28) {
				int i_3_ = buffer.readUByte();
				anIntArray3732 = new int[i_3_];
				for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
					anIntArray3732[i_4_] = buffer.readUByte();
					if (anIntArray3732[i_4_] == 255)
						anIntArray3732[i_4_] = -1;
				}
			} else if (opcode == 29)
				anInt3744 = buffer.readUByte() * 115903875;
			else if (opcode == 30)
				anInt3745 = buffer.readUShort() * 719028937;
			else if (31 == opcode)
				anInt3726 = buffer.readUByte() * -369164975;
			else if (32 == opcode)
				anInt3747 = buffer.readUShort() * 1012239243;
			else if (33 == opcode)
				anInt3748 = buffer.readShort() * 92325015;
			else if (34 == opcode)
				anInt3720 = buffer.readUByte() * 477826083;
			else if (opcode == 35)
				anInt3750 = buffer.readUShort() * -1803824059;
			else if (36 == opcode)
				anInt3751 = buffer.readShort() * 1175766897;
			else if (37 == opcode)
				anInt3752 = buffer.readUByte() * 1083720273;
			else if (38 == opcode)
				anInt3715 = buffer.readBigSmart() * 241536037;
			else if (39 == opcode)
				anInt3733 = buffer.readBigSmart() * -1442268255;
			else if (opcode == 40)
				anInt3741 = buffer.readBigSmart() * 564296781;
			else if (opcode == 41)
				anInt3719 = buffer.readBigSmart() * -1440097851;
			else if (42 == opcode)
				anInt3723 = buffer.readBigSmart() * 1270333873;
			else if (opcode == 43)
				anInt3738 = buffer.readBigSmart() * 697230329;
			else if (44 == opcode)
				anInt3754 = buffer.readBigSmart() * -853635893;
			else if (opcode == 45)
				anInt3716 = buffer.readUShort() * -928434405;
			else if (46 == opcode)
				anInt3729 = buffer.readBigSmart() * 537960313;
			else if (opcode == 47)
				anInt3743 = buffer.readBigSmart() * 1019547381;
			else if (48 == opcode)
				anInt3731 = buffer.readBigSmart() * -1402060193;
			else if (opcode == 49)
				anInt3739 = buffer.readBigSmart() * -549936551;
			else if (50 == opcode)
				anInt3737 = buffer.readBigSmart() * -71356649;
			else if (opcode == 51)
				anInt3730 = buffer.readBigSmart() * -1236000399;
			else if (52 == opcode) {
				int i_5_ = buffer.readUByte();
				keys = new int[i_5_];
				anIntArray3713 = new int[i_5_];
				for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
					keys[i_6_] = buffer.readBigSmart();
					int i_7_ = buffer.readUByte();
					anIntArray3713[i_6_] = i_7_;
					this.anInt3714 += i_7_ * 81529747;
				}
			} else if (opcode == 53)
				aBoolean3756 = false;
			else if (opcode == 54) {
				anInt3734 = ((buffer.readUByte() << 6) * 989376361);
				anInt3740 = ((buffer.readUByte() << 6) * -1343302987);
			} else if (55 == opcode) {
				if (anIntArray3742 == null)
					anIntArray3742 = (new int[(this.aClass349_3725.aEquipmentDefaults_3707.hidden).length]);
				int i_8_ = buffer.readUByte();
				anIntArray3742[i_8_] = buffer.readUShort();
			} else if (opcode == 56) {
				if (null == anIntArrayArray3753)
					anIntArrayArray3753 = (new int[(this.aClass349_3725.aEquipmentDefaults_3707.hidden).length][]);
				int i_9_ = buffer.readUByte();
				anIntArrayArray3753[i_9_] = new int[3];
				for (int i_10_ = 0; i_10_ < 3; i_10_++)
					anIntArrayArray3753[i_9_][i_10_] = buffer.readShort();
			}
	}

	public Matrix43f[] method4207(byte i) {
		try {
			if (this.aClass222Array3718 != null)
				return this.aClass222Array3718;
			if (null == anIntArrayArray3710)
				return null;
			this.aClass222Array3718 = new Matrix43f[anIntArrayArray3710.length];
			for (int i_11_ = 0; i_11_ < anIntArrayArray3710.length; i_11_++) {
				int i_12_ = 0;
				int i_13_ = 0;
				int i_14_ = 0;
				int i_15_ = 0;
				int i_16_ = 0;
				int i_17_ = 0;
				if (anIntArrayArray3710[i_11_] != null) {
					i_12_ = anIntArrayArray3710[i_11_][0];
					i_13_ = anIntArrayArray3710[i_11_][1];
					i_14_ = anIntArrayArray3710[i_11_][2];
					i_15_ = anIntArrayArray3710[i_11_][3] << 3;
					i_16_ = anIntArrayArray3710[i_11_][4] << 3;
					i_17_ = anIntArrayArray3710[i_11_][5] << 3;
				}
				if (i_12_ == 0 && 0 == i_13_ && 0 == i_14_ && 0 == i_15_ && 0 == i_16_ && i_17_ == 0) {
					if (i <= 12)
						throw new IllegalStateException();
				} else {
					Matrix43f class222 = (this.aClass222Array3718[i_11_] = new Matrix43f());
					if (0 != i_17_)
						class222.rotate(0.0F, 0.0F, 1.0F, CircleAngleTable.toDegrees(i_17_));
					if (0 != i_15_)
						class222.rotate(1.0F, 0.0F, 0.0F, CircleAngleTable.toDegrees(i_15_));
					if (0 != i_16_)
						class222.rotate(0.0F, 1.0F, 0.0F, CircleAngleTable.toDegrees(i_16_));
					class222.translate((float) i_12_, (float) i_13_, (float) i_14_);
				}
			}
			return this.aClass222Array3718;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("op.i(").append(')').toString());
		}
	}

	Class350() {
		anInt3717 = 1216995793;
		anInt3741 = -564296781;
		anInt3719 = 1440097851;
		anInt3723 = -1270333873;
		anInt3721 = 1261244237;
		anInt3749 = 1711775317;
		anInt3746 = 1593946535;
		anInt3724 = -1566713043;
		anInt3755 = 1201368129;
		anInt3722 = -1316025001;
		anInt3727 = 1511636755;
		anInt3728 = -1034489103;
		anInt3729 = -537960313;
		anInt3743 = -1019547381;
		anInt3731 = 1402060193;
		anInt3739 = 549936551;
		anInt3737 = 71356649;
		anInt3730 = 1236000399;
		anInt3735 = 0;
		anInt3736 = 0;
		anInt3734 = 0;
		anInt3740 = 0;
		anInt3744 = 0;
		anInt3745 = 0;
		anInt3726 = 0;
		anInt3747 = 0;
		anInt3748 = 0;
		anInt3720 = 0;
		anInt3750 = 0;
		anInt3751 = 0;
		anInt3752 = -1083720273;
		anInt3738 = -697230329;
		anInt3754 = 853635893;
		anInt3716 = 928434405;
		aBoolean3756 = true;
	}

	public int getKey() {
			if (key * -809747019 != -1)
				return key * -809747019;
			if (keys != null) {
				int i_18_ = (int) (Math.random() * (double) (-5125477 * this.anInt3714));
				int i_19_;
				for (i_19_ = 0; i_18_ >= anIntArray3713[i_19_]; i_19_++)
					i_18_ -= anIntArray3713[i_19_];
				return keys[i_19_];
			}
			return -1;
	}

	public boolean method4209(int key) {
			if (-1 == key)
				return false;
			if (key == -809747019 * this.key)
				return true;
			if (null != keys) {
				for (int i_21_ = 0; i_21_ < keys.length; i_21_++) {
					if (key == keys[i_21_])
						return true;
				}
			}
			return false;
	}

	public int[] method4210() {
			LinkedList list = new LinkedList(16);
			Class316.connect(-809747019 * key, list);
			if (keys != null) {
				int[] xteas = this.keys;
				for (int index = 0; index < xteas.length; index++) {
					int key = xteas[index];
					Class316.connect(key, list);
				}
			}
			Class316.connect(844607405 * anInt3715, list);
			Class316.connect(1061677153 * anInt3733, list);
			Class316.connect(-129111857 * anInt3717, list);
			Class316.connect(anInt3741 * -277799803, list);
			Class316.connect(315374861 * anInt3719, list);
			Class316.connect(anInt3723 * -1532631215, list);
			Class316.connect(230243963 * anInt3721, list);
			Class316.connect(491753731 * anInt3749, list);
			Class316.connect(-2054940183 * anInt3746, list);
			Class316.connect(-783166629 * anInt3724, list);
			Class316.connect(anInt3755 * 328817727, list);
			Class316.connect(anInt3722 * -1238642279, list);
			Class316.connect(anInt3727 * -907666203, list);
			Class316.connect(124010991 * anInt3728, list);
			Class316.connect(anInt3729 * 371497673, list);
			Class316.connect(anInt3743 * -279532195, list);
			Class316.connect(anInt3731 * 1885772191, list);
			Class316.connect(anInt3739 * 914130409, list);
			Class316.connect(anInt3737 * 250017959, list);
			Class316.connect(anInt3730 * -119373935, list);
			int[] keys = new int[list.getSize()];
			int offset = 0;
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Node node = (Node) iterator.next();
				keys[offset++] = (int) (node.key * 7051297995265073167L);
			}
			return keys;
	}

	void readValueLoop(Buffer buffer, int i) {
			for (;;) {
				int i_25_ = buffer.readUByte();
				if (i_25_ == 0) {
					if (i != 162499609)
						throw new IllegalStateException();
					break;
				}
				method4206(buffer, i_25_);
			}
	}

}
