package com.jagex;/* Class123 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;
import com.jagex.maths.Matrix4f;

public abstract class Class123 {
	Class116 aClass116_1468;
	ShaderProgramToolkit[] aShaderProgramToolkitArray1469;
	String aString1470;
	Class116 aClass116_1471;
	int anInt1472;
	int anInt1473;
	static Interface4 anInterface4_1474 = new Class121();
	protected int anInt1475 = 1776466383;

	public int method1323(int i) {
		try {
			return -140989799 * this.anInt1472;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ez.az(").append(')').toString());
		}
	}

	public final void method1324(ShaderProgram class298_sub31_sub1, float f, float f_0_, int i) {
		try {
			this.aShaderProgramToolkitArray1469[-33664303 * anInt1475].method1161(class298_sub31_sub1, f, f_0_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ez.t(").append(')').toString());
		}
	}

	public String method1325(int i) {
			return this.aString1470;
	}

	Class123(NativeToolkit class_ra_sub3, Class109 class109) {
		this.aString1470 = class109.aString1325;
		this.anInt1472 = 2063075753 * class109.aClass114Array1323.length;
		this.aClass116_1468 = new Class116(-140989799 * this.anInt1472, anInterface4_1474);
		for (int i = 0; i < this.anInt1472 * -140989799; i++)
			this.aClass116_1468.method1265(i, (class109.aClass114Array1323[i].aString1377), method1367(class109.aClass114Array1323[i]), -1301495890);
		this.anInt1473 = -1642721829 * class109.aClass114Array1326.length;
		this.aClass116_1471 = new Class116(this.anInt1473 * 1271998035, anInterface4_1474);
		for (int i = 0; i < this.anInt1473 * 1271998035; i++)
			this.aClass116_1471.method1265(i, (class109.aClass114Array1326[i].aString1377), method1367(class109.aClass114Array1326[i]), -498373902);
		this.aShaderProgramToolkitArray1469 = new ShaderProgramToolkit[class109.aClass108Array1327.length];
		for (int i = 0; i < class109.aClass108Array1327.length; i++)
			this.aShaderProgramToolkitArray1469[i] = method1326(class_ra_sub3, class109.aClass108Array1327[i]);
	}

	abstract ShaderProgramToolkit method1326(NativeToolkit class_ra_sub3, Class108 class108);

	public ShaderProgramToolkit method1327(String string) throws Exception_Sub2_Sub2 {
			ShaderProgramToolkit[] shaderProgramToolkits = this.aShaderProgramToolkitArray1469;
			for (int index = 0; index < shaderProgramToolkits.length; index++) {
				ShaderProgramToolkit shaderProgram = shaderProgramToolkits[index];
				String programName = shaderProgram.getProgramName();
				if (programName != null && programName.equals(string)) {
					if (!shaderProgram.method1221())
						throw new Exception_Sub2_Sub2(string);
					return shaderProgram;
				}
			}
			throw new Exception_Sub2_Sub2(string);
	}

	public final int method1328() {
			return this.aShaderProgramToolkitArray1469.length;
	}

	public int method1329(ShaderProgramToolkit shaderProgramToolkit, int i) {
		try {
			for (int i_3_ = 0; i_3_ < this.aShaderProgramToolkitArray1469.length; i_3_++) {
				if (this.aShaderProgramToolkitArray1469[i_3_] == shaderProgramToolkit)
					return i_3_;
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ez.posX(").append(')').toString());
		}
	}

	public ShaderProgramToolkit method1330(int i) {
		try {
			ShaderProgramToolkit[] shaderProgramToolkits = this.aShaderProgramToolkitArray1469;
			for (int i_4_ = 0; i_4_ < shaderProgramToolkits.length; i_4_++) {
				ShaderProgramToolkit shaderProgramToolkit = shaderProgramToolkits[i_4_];
				if (shaderProgramToolkit.method1221())
					return shaderProgramToolkit;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ez.r(").append(')').toString());
		}
	}

	public abstract boolean method1331(ShaderProgramToolkit shaderProgramToolkit);

	public final ShaderProgramToolkit method1332() {
			return (-33664303 * anInt1475 >= 0 ? (this.aShaderProgramToolkitArray1469[anInt1475 * -33664303]) : null);
	}

	public final int method1333(int i) {
		try {
			return -33664303 * anInt1475;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ez.s(").append(')').toString());
		}
	}

	public final void method1334(ShaderProgram class298_sub31_sub1, float red, float blue, float green) {
			this.aShaderProgramToolkitArray1469[anInt1475 * -33664303].glColor3f(class298_sub31_sub1, red, blue, green);
	}

	public final void method1335(ShaderProgram class298_sub31_sub1, float f, int i) {
		try {
			this.aShaderProgramToolkitArray1469[-33664303 * anInt1475].method1176(class298_sub31_sub1, f);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ez.posY(").append(')').toString());
		}
	}

	public final void method1336(int i, Matrix4f matrix4f, byte i_7_) {
		try {
			this.aShaderProgramToolkitArray1469[-33664303 * anInt1475].method1173(i, matrix4f);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ez.ad(").append(')').toString());
		}
	}

	public final void method1337(ShaderProgram class298_sub31_sub1, Matrix4f matrix4f, byte i) {
		try {
			this.aShaderProgramToolkitArray1469[-33664303 * anInt1475].method1192(class298_sub31_sub1, matrix4f);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ez.w(").append(')').toString());
		}
	}

	public final void method1338(ShaderProgram class298_sub31_sub1, Vector3f class217, int i) {
		try {
			this.aShaderProgramToolkitArray1469[-33664303 * anInt1475].glColor3f(class298_sub31_sub1, class217.x, class217.y, class217.z);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ez.g(").append(')').toString());
		}
	}

	public final void method1339(ShaderProgram class298_sub31_sub1, Class232 class232, int i) {
		try {
			this.aShaderProgramToolkitArray1469[anInt1475 * -33664303].glColor4f(class298_sub31_sub1, class232.aFloat2593, class232.aFloat2592, class232.aFloat2590, class232.aFloat2591);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ez.e(").append(')').toString());
		}
	}

	public abstract void method1340();

	public final void method1341(ShaderProgram shaderProgram, int i, Interface9 interface9) {
		try {
			this.aShaderProgramToolkitArray1469[-33664303 * anInt1475].method1167(shaderProgram, i, interface9);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ez.o(").append(')').toString());
		}
	}

	public final void method1342(int i, float f, float f_9_, float f_10_, float f_11_, byte i_12_) {
		try {
			this.aShaderProgramToolkitArray1469[-33664303 * anInt1475].method1169(i, f, f_9_, f_10_, f_11_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ez.ax(").append(')').toString());
		}
	}

	public final void method1343(int i, Vector3f class217, int i_13_) {
		try {
			this.aShaderProgramToolkitArray1469[anInt1475 * -33664303].method1168(i, class217.x, class217.y, class217.z);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ez.aa(").append(')').toString());
		}
	}

	public final void method1344(int i, float[] fs, int i_14_, int i_15_) {
		try {
			this.aShaderProgramToolkitArray1469[-33664303 * anInt1475].method1170(i, fs, i_14_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ez.ak(").append(')').toString());
		}
	}

	public final void method1345(int i, Matrix4f matrix4f, byte i_16_) {
		try {
			this.aShaderProgramToolkitArray1469[anInt1475 * -33664303].method1171(i, matrix4f);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ez.ae(").append(')').toString());
		}
	}

	public final void method1346(int i, Matrix4f matrix4f, int i_17_) {
		try {
			this.aShaderProgramToolkitArray1469[anInt1475 * -33664303].method1159(i, matrix4f);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ez.ao(").append(')').toString());
		}
	}

	public final void method1347(ShaderProgram shaderProgram, float[] verticies) {
			this.aShaderProgramToolkitArray1469[anInt1475 * -33664303].method1164(shaderProgram, verticies, verticies.length);
	}

	public final void method1348(int i, int i_18_, Interface9 interface9, int i_19_) {
		try {
			this.aShaderProgramToolkitArray1469[-33664303 * anInt1475].method1174(i, i_18_, interface9);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ez.av(").append(')').toString());
		}
	}

	public abstract boolean method1349(ShaderProgramToolkit shaderProgramToolkit);

	public int method1350(byte i) {
		try {
			return this.anInt1473 * 1271998035;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ez.ah(").append(')').toString());
		}
	}

	public ShaderProgram method1351(String string) {
		try {
			return ((ShaderProgram) this.aClass116_1471.method1263(string, -1795999546));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ez.al(").append(')').toString());
		}
	}

	public ShaderProgram method1352(int i, int i_20_) {
		try {
			return ((ShaderProgram) this.aClass116_1468.method1266(i, (byte) -22));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ez.as(").append(')').toString());
		}
	}

	void method1353() {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ez.ap(").append(')').toString());
		}
	}

	public abstract void method1354();

	public abstract void method1355();

	public abstract void method1356();

	public abstract void method1357();

	public abstract void method1358();

	public abstract boolean method1359();

	public ShaderProgram method1360(String string) throws Exception_Sub2_Sub1 {
			ShaderProgram class298_sub31_sub1 = ((ShaderProgram) this.aClass116_1468.method1263(string, 542987786));
			if (null == class298_sub31_sub1)
				throw new Exception_Sub2_Sub1(string);
			return class298_sub31_sub1;
	}

	abstract ShaderProgramToolkit method1361(NativeToolkit class_ra_sub3, Class108 class108);

	abstract ShaderProgramToolkit method1362(NativeToolkit class_ra_sub3, Class108 class108);

	public final void setProgramColors(ShaderProgram program, int colorValue) {
			float red = (float) (colorValue >> 16 & 0xff) / 255.0F;
			float blue = (float) (colorValue >> 8 & 0xff) / 255.0F;
			float green = (float) (colorValue & 0xff) / 255.0F;
			float alpha = (float) (colorValue >> 24 & 0xff) / 255.0F;
			glColor4f(program, red, blue, green, alpha);
	}

	abstract ShaderProgram method1364(Class114 class114);

	public final void method1365(int i, float f, float f_25_, float f_26_, int i_27_) {
			this.aShaderProgramToolkitArray1469[-33664303 * anInt1475].method1168(i, f, f_25_, f_26_);
	}

	public final void glColor4f(ShaderProgram program, float red, float blue, float green, float alpha) {
			this.aShaderProgramToolkitArray1469[anInt1475 * -33664303].glColor4f(program, red, blue, green, alpha);
	}

	abstract ShaderProgram method1367(Class114 class114);

	public final void method1368(ShaderProgram class298_sub31_sub1, Matrix4f matrix4f, int i) {
			this.aShaderProgramToolkitArray1469[-33664303 * anInt1475].method1166(class298_sub31_sub1, matrix4f);
	}

	public final ShaderProgramToolkit method1369(int i, int i_31_) {
			return this.aShaderProgramToolkitArray1469[i];
	}

	public ShaderProgram method1370(int i, int i_32_) {
		try {
			return ((ShaderProgram) this.aClass116_1471.method1266(i, (byte) -95));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ez.ai(").append(')').toString());
		}
	}

	public abstract boolean method1371();

	public abstract void method1372();

	public abstract void method1373();

	public abstract boolean method1374();

	public abstract boolean method1375(ShaderProgramToolkit shaderProgramToolkit);

	public abstract boolean method1376(ShaderProgramToolkit shaderProgramToolkit);

	static final void method1377(ScriptRuntime class403, byte i) {
			int i_33_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_33_);
			IComponentDefinitionCollection interfaceId = IComponentDefinition.getIComponentDefinitionCollections[i_33_ >> 16];
			ToMoveIComponentScripts.method3802(class105, interfaceId, class403);
	}

	public static String method1378(String string, char c, String string_34_, short i) {
		try {
			int length = string.length();
			int i_36_ = string_34_.length();
			int i_37_ = length;
			int i_38_ = i_36_ - 1;
			if (i_38_ != 0) {
				int i_39_ = 0;
				for (;;) {
					i_39_ = string.indexOf(c, i_39_);
					if (i_39_ < 0) {
						if (i != 316) {
							/* empty */
						}
						break;
					}
					i_39_++;
					i_37_ += i_38_;
				}
			}
			StringBuilder stringbuilder = new StringBuilder(i_37_);
			int i_40_ = 0;
			for (;;) {
				int i_41_ = string.indexOf(c, i_40_);
				if (i_41_ < 0) {
					if (i != 316)
						throw new IllegalStateException();
					break;
				}
				stringbuilder.append(string.substring(i_40_, i_41_));
				stringbuilder.append(string_34_);
				i_40_ = i_41_ + 1;
			}
			stringbuilder.append(string.substring(i_40_));
			return stringbuilder.toString();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ez.t(").append(')').toString());
		}
	}

	static final void method1379(ScriptRuntime runtime, byte i) {
			int i_42_ = runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)];
			runtime.integerStack[(runtime.integerStackOffset += -391880689) * 681479919 - 1] = (Js5Configs.itemList.getItemDefinitions(i_42_).stackable) * 789409129 == 1 ? 1 : 0;
	}
}
