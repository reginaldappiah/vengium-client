package com.jagex;/* Class138_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class138_Sub1 extends Class138 {
	ShaderProgramToolkit[] aShaderProgramToolkitArray6992 = new ShaderProgramToolkit[3];
	static int anInt6993 = 0;
	static int anInt6994 = 0;
	static int anInt6995 = 2;
	static int anInt6996 = 3;
	static int anInt6997 = 4;
	static int anInt6998 = 5;
	static int anInt6999 = 6;
	static int anInt7000 = 7;
	Class123 aClass123_7001;
	static int anInt7002 = 1;
	Class232 aClass232_7003;
	static int anInt7004 = 3;
	static int anInt7005 = 2;
	int[][] anIntArrayArray7006 = new int[3][7];
	int[] anIntArray7007;
	Class232 aClass232_7008 = new Class232(1.0F, 1.0F, 1.0F, 1.0F);
	static int anInt7009 = 1;
	public static Class131 configs;

	public void method1537() {
		this.aClass123_7001.method1331(this.aShaderProgramToolkitArray6992[1]);
		this.anIntArray7007 = (this.anIntArrayArray7006[this.aClass123_7001.method1333(1490567798)]);
		this.aClass123_7001.method1348(this.anIntArray7007[2], 1, anInterface9_Impl2_1536, 1647913438);
		this.aClass123_7001.method1346((this.anIntArray7007[4]), aMatrix4f_1542, -1599730439);
		method1540(-512231280);
	}

	boolean method1539(int i) throws Exception_Sub2 {
		try {
			this.aClass123_7001 = aClass_ra_Sub3_1539.method5297("Sprite");
			ShaderProgram class298_sub31_sub1 = this.aClass123_7001.method1360("WVPMatrix");
			ShaderProgram class298_sub31_sub1_0_ = this.aClass123_7001.method1360("SpriteSampler");
			ShaderProgram class298_sub31_sub1_1_ = this.aClass123_7001.method1360("MaskSampler");
			ShaderProgram class298_sub31_sub1_2_ = this.aClass123_7001.method1360("MulColour");
			ShaderProgram class298_sub31_sub1_3_ = this.aClass123_7001.method1360("AddColour");
			ShaderProgram class298_sub31_sub1_4_ = this.aClass123_7001.method1360("SpriteTexCoordMatrix");
			ShaderProgram class298_sub31_sub1_5_ = this.aClass123_7001.method1360("MaskTexCoordMatrix");
			this.aShaderProgramToolkitArray6992[0] = this.aClass123_7001.method1327("Normal");
			this.aShaderProgramToolkitArray6992[1] = this.aClass123_7001.method1327("Masked");
			this.aShaderProgramToolkitArray6992[2] = this.aClass123_7001.method1327("AlphaTex");
			for (int i_6_ = 0; i_6_ < 3; i_6_++) {
				int i_7_ = (this.aClass123_7001.method1329(this.aShaderProgramToolkitArray6992[i_6_], -180449856));
				this.anIntArrayArray7006[i_6_][0] = class298_sub31_sub1.method3119(i_7_);
				this.anIntArrayArray7006[i_6_][1] = class298_sub31_sub1_0_.method3119(i_7_);
				this.anIntArrayArray7006[i_6_][2] = class298_sub31_sub1_1_.method3119(i_7_);
				this.anIntArrayArray7006[i_6_][5] = class298_sub31_sub1_2_.method3119(i_7_);
				this.anIntArrayArray7006[i_6_][6] = class298_sub31_sub1_3_.method3119(i_7_);
				this.anIntArrayArray7006[i_6_][3] = class298_sub31_sub1_4_.method3119(i_7_);
				this.anIntArrayArray7006[i_6_][4] = class298_sub31_sub1_5_.method3119(i_7_);
			}
			this.aClass123_7001.method1331(this.aShaderProgramToolkitArray6992[0]);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yi.posY(").append(')').toString());
		}
	}

	public void method1531() {
		this.aClass123_7001.method1331(this.aShaderProgramToolkitArray6992[0]);
		this.anIntArray7007 = (this.anIntArrayArray7006[this.aClass123_7001.method1333(1620928863)]);
		method1540(-512231280);
	}

	public void method1534() {
		this.aClass123_7001.method1331(this.aShaderProgramToolkitArray6992[1]);
		this.anIntArray7007 = (this.anIntArrayArray7006[this.aClass123_7001.method1333(1799614751)]);
		this.aClass123_7001.method1348(this.anIntArray7007[2], 1, anInterface9_Impl2_1536, -291659161);
		this.aClass123_7001.method1346((this.anIntArray7007[4]), aMatrix4f_1542, -1599730439);
		method1540(-512231280);
	}

	void method1540(int i) {
		try {
			this.aClass123_7001.method1340();
			this.aClass123_7001.method1348(this.anIntArray7007[1], 0, anInterface9_Impl2_1537, -1250819692);
			aClass_ra_Sub3_1539.method5335(aMatrix4f_1540);
			this.aClass123_7001.method1336(this.anIntArray7007[0], aMatrix4f_1540, (byte) -62);
			this.aClass123_7001.method1346(this.anIntArray7007[3], aMatrix4f_1541, -1599730439);
			this.aClass123_7001.method1342(this.anIntArray7007[5], this.aClass232_7008.aFloat2593, this.aClass232_7008.aFloat2592, this.aClass232_7008.aFloat2590, this.aClass232_7008.aFloat2591, (byte) 6);
			this.aClass123_7001.method1342(this.anIntArray7007[6], this.aClass232_7003.aFloat2593, this.aClass232_7003.aFloat2592, this.aClass232_7003.aFloat2590, this.aClass232_7003.aFloat2591, (byte) 29);
			aClass_ra_Sub3_1539.method5383(0, anInterface7_Impl1_1538);
			aClass_ra_Sub3_1539.method5455(aClass153_1544);
			aClass_ra_Sub3_1539.method5398(Class187.aClass187_1906, anInt1543, 2);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yi.t(").append(')').toString());
		}
	}

	public void method1528() {
		try {
			this.aClass123_7001.method1331(this.aShaderProgramToolkitArray6992[1]);
			this.anIntArray7007 = (this.anIntArrayArray7006[this.aClass123_7001.method1333(983668425)]);
			this.aClass123_7001.method1348(this.anIntArray7007[2], 1, anInterface9_Impl2_1536, 1449956625);
			this.aClass123_7001.method1346(this.anIntArray7007[4], aMatrix4f_1542, -1599730439);
			method1540(-512231280);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yi.b(").append(')').toString());
		}
	}

	public void method1529(int i, int i_8_) {
		switch (i) {
		case 0:
			this.aClass232_7008.method2136(i_8_);
			this.aClass232_7003.method2136(0);
			break;
		case 2:
			this.aClass232_7008.method2136(i_8_);
			this.aClass232_7003.method2136(0);
			break;
		case 1:
			this.aClass232_7008.method2136(-1);
			this.aClass232_7003.method2136(0);
			break;
		case 4:
			this.aClass232_7008.method2136(-1);
			this.aClass232_7003.method2136(i_8_);
			this.aClass232_7003.method2137();
			break;
		case 3:
			this.aClass232_7008.method2136(0xffffff | i_8_ & ~0xffffff);
			this.aClass232_7003.method2136(i_8_ & 0xffffff);
			break;
		}
	}

	public void method1530(int i, int i_9_) {
		switch (i) {
		case 0:
			this.aClass232_7008.method2136(i_9_);
			this.aClass232_7003.method2136(0);
			break;
		case 2:
			this.aClass232_7008.method2136(i_9_);
			this.aClass232_7003.method2136(0);
			break;
		case 1:
			this.aClass232_7008.method2136(-1);
			this.aClass232_7003.method2136(0);
			break;
		case 4:
			this.aClass232_7008.method2136(-1);
			this.aClass232_7003.method2136(i_9_);
			this.aClass232_7003.method2137();
			break;
		case 3:
			this.aClass232_7008.method2136(0xffffff | i_9_ & ~0xffffff);
			this.aClass232_7003.method2136(i_9_ & 0xffffff);
			break;
		}
	}

	public void method1536() {
		this.aClass123_7001.method1331(this.aShaderProgramToolkitArray6992[1]);
		this.anIntArray7007 = (this.anIntArrayArray7006[this.aClass123_7001.method1333(1377516236)]);
		this.aClass123_7001.method1348(this.anIntArray7007[2], 1, anInterface9_Impl2_1536, -709585424);
		this.aClass123_7001.method1346((this.anIntArray7007[4]), aMatrix4f_1542, -1599730439);
		method1540(-512231280);
	}

	public void method1532() {
		this.aClass123_7001.method1331(this.aShaderProgramToolkitArray6992[0]);
		this.anIntArray7007 = (this.anIntArrayArray7006[this.aClass123_7001.method1333(1548061224)]);
		method1540(-512231280);
	}

	public void method1535() {
		this.aClass123_7001.method1331(this.aShaderProgramToolkitArray6992[0]);
		this.anIntArray7007 = (this.anIntArrayArray7006[this.aClass123_7001.method1333(1025602377)]);
		method1540(-512231280);
	}

	public void method1525() {
		this.aClass123_7001.method1331(this.aShaderProgramToolkitArray6992[0]);
		this.anIntArray7007 = (this.anIntArrayArray7006[this.aClass123_7001.method1333(1272253028)]);
		method1540(-512231280);
	}

	public Class138_Sub1(NativeToolkit class_ra_sub3) throws Exception_Sub2 {
		super(class_ra_sub3);
		this.aClass232_7003 = new Class232(0.0F, 0.0F, 0.0F, 0.0F);
		method1539(-964242582);
	}

	public void method1533() {
		this.aClass123_7001.method1331(this.aShaderProgramToolkitArray6992[1]);
		this.anIntArray7007 = (this.anIntArrayArray7006[this.aClass123_7001.method1333(2074431922)]);
		this.aClass123_7001.method1348(this.anIntArray7007[2], 1, anInterface9_Impl2_1536, -2013036939);
		this.aClass123_7001.method1346((this.anIntArray7007[4]), aMatrix4f_1542, -1599730439);
		method1540(-512231280);
	}

	public void method1527() {
		try {
			this.aClass123_7001.method1331(this.aShaderProgramToolkitArray6992[0]);
			this.anIntArray7007 = (this.anIntArrayArray7006[this.aClass123_7001.method1333(1291749440)]);
			method1540(-512231280);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yi.f(").append(')').toString());
		}
	}

	public void method1538() {
		this.aClass123_7001.method1331(this.aShaderProgramToolkitArray6992[1]);
		this.anIntArray7007 = (this.anIntArrayArray7006[this.aClass123_7001.method1333(1159640978)]);
		this.aClass123_7001.method1348(this.anIntArray7007[2], 1, anInterface9_Impl2_1536, -2044717945);
		this.aClass123_7001.method1346((this.anIntArray7007[4]), aMatrix4f_1542, -1599730439);
		method1540(-512231280);
	}

	public void method1526(int i, int i_10_) {
		try {
			switch (i) {
			case 0:
				this.aClass232_7008.method2136(i_10_);
				this.aClass232_7003.method2136(0);
				break;
			case 2:
				this.aClass232_7008.method2136(i_10_);
				this.aClass232_7003.method2136(0);
				break;
			case 1:
				this.aClass232_7008.method2136(-1);
				this.aClass232_7003.method2136(0);
				break;
			case 4:
				this.aClass232_7008.method2136(-1);
				this.aClass232_7003.method2136(i_10_);
				this.aClass232_7003.method2137();
				break;
			case 3:
				this.aClass232_7008.method2136(0xffffff | i_10_ & ~0xffffff);
				this.aClass232_7003.method2136(i_10_ & 0xffffff);
				break;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yi.a(").append(')').toString());
		}
	}

	static final void method1541(ScriptRuntime class403, int i) {
		try {
			int i_11_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.groundBlending.getSupport(i_11_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yi.aoz(").append(')').toString());
		}
	}

	static final void method1542(ScriptRuntime class403, int i) {
		try {
			int i_12_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_12_);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[i_12_ >> 16];
			ConfigDefinitions.method3978(class105, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yi.lb(").append(')').toString());
		}
	}

	static final void method1543(ScriptRuntime class403, int i) {
		try {
			class403.integerStackOffset -= -1959403445;
			Class239.method2210((class403.integerStack[class403.integerStackOffset * 681479919]), (class403.integerStack[681479919 * class403.integerStackOffset + 1]), (class403.integerStack[681479919 * class403.integerStackOffset + 2]), (class403.integerStack[681479919 * class403.integerStackOffset + 3]), (class403.integerStack[4 + 681479919 * class403.integerStackOffset]));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yi.tn(").append(')').toString());
		}
	}
}
