package com.jagex;/* ShaderProgramToolkit - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.prefetch.Js5List;
import com.jagex.game.settings.StereoSoundSetting;
import com.jagex.maths.Matrix4f;

public abstract class ShaderProgramToolkit implements InterfaceWithTheB {
	protected String aString6400;
	protected String aString6401;
	protected String programName = null;
	public static Class459 aClass459_6404;

	abstract void method1158(int i, int i_0_, Interface9 interface9);

	abstract void method1159(int i, Matrix4f matrix4f);

	String getProgramName() {
			return programName;
	}

	abstract void method1161(ShaderProgram class298_sub31_sub1, float f, float f_1_);

	abstract void glColor3f(ShaderProgram class298_sub31_sub1, float red, float blue, float green);

	abstract void glColor4f(ShaderProgram program, float red, float blue, float green, float alpha);

	abstract void method1164(ShaderProgram class298_sub31_sub1, float[] fs, int i);

	abstract void method1165(ShaderProgram class298_sub31_sub1, float f, float f_7_, float f_8_, float f_9_);

	abstract void method1166(ShaderProgram class298_sub31_sub1, Matrix4f matrix4f);

	abstract void method1167(ShaderProgram class298_sub31_sub1, int i, Interface9 interface9);

	abstract void method1168(int i, float f, float f_10_, float f_11_);

	abstract void method1169(int i, float f, float f_12_, float f_13_, float f_14_);

	abstract void method1170(int i, float[] fs, int i_15_);

	abstract void method1171(int i, Matrix4f matrix4f);

	abstract void method1172(int i, Matrix4f matrix4f);

	abstract void method1173(int i, Matrix4f matrix4f);

	abstract void method1174(int i, int i_16_, Interface9 interface9);

	abstract void method1175(int i, Matrix4f matrix4f);

	abstract void method1176(ShaderProgram class298_sub31_sub1, float f);

	abstract void method1177(ShaderProgram class298_sub31_sub1, float[] fs, int i);

	abstract void method1178(ShaderProgram class298_sub31_sub1, float f, float f_17_, float f_18_, float f_19_);

	abstract void method1179(ShaderProgram class298_sub31_sub1, float f, float f_20_, float f_21_);

	public abstract boolean method1180();

	abstract void method1181(ShaderProgram class298_sub31_sub1, float f);

	abstract void method1182(int i, float[] fs, int i_22_);

	abstract void method1183(ShaderProgram class298_sub31_sub1, float f);

	abstract void method1184(ShaderProgram class298_sub31_sub1, int i, Interface9 interface9);

	abstract void method1185(ShaderProgram class298_sub31_sub1, float f, float f_23_);

	abstract void method1186(ShaderProgram class298_sub31_sub1, float f, float f_24_, float f_25_);

	abstract void method1187(ShaderProgram class298_sub31_sub1, Matrix4f matrix4f);

	abstract void method1188(ShaderProgram class298_sub31_sub1, float f, float f_26_, float f_27_);

	abstract void method1189(ShaderProgram class298_sub31_sub1, float f, float f_28_, float f_29_, float f_30_);

	abstract void method1190(ShaderProgram class298_sub31_sub1, float f);

	abstract void method1191(ShaderProgram class298_sub31_sub1, float f, float f_31_);

	abstract void method1192(ShaderProgram class298_sub31_sub1, Matrix4f matrix4f);

	abstract void method1193(ShaderProgram class298_sub31_sub1, float f, float f_32_, float f_33_, float f_34_);

	abstract void method1194(ShaderProgram class298_sub31_sub1, float f, float f_35_, float f_36_, float f_37_);

	abstract void method1195(int i, float f, float f_38_, float f_39_);

	abstract void method1196(ShaderProgram class298_sub31_sub1, float[] fs, int i);

	abstract void method1197(ShaderProgram class298_sub31_sub1, Matrix4f matrix4f);

	abstract void method1198(ShaderProgram class298_sub31_sub1, Matrix4f matrix4f);

	abstract void method1199(int i, int i_40_, Interface9 interface9);

	abstract void method1200(ShaderProgram class298_sub31_sub1, Matrix4f matrix4f);

	ShaderProgramToolkit() {
		/* empty */
	}

	abstract void method1201(ShaderProgram class298_sub31_sub1, Matrix4f matrix4f);

	abstract void method1202(ShaderProgram class298_sub31_sub1, Matrix4f matrix4f);

	abstract void method1203(ShaderProgram class298_sub31_sub1, Matrix4f matrix4f);

	abstract void method1204(ShaderProgram class298_sub31_sub1, Matrix4f matrix4f);

	abstract void method1205(ShaderProgram class298_sub31_sub1, float f, float f_41_, float f_42_, float f_43_);

	abstract void method1206(int i, float f, float f_44_, float f_45_);

	abstract void method1207(ShaderProgram class298_sub31_sub1, float f);

	abstract void method1208(ShaderProgram class298_sub31_sub1, int i, Interface9 interface9);

	public abstract boolean method1209();

	abstract void method1210(int i, float f, float f_46_, float f_47_);

	abstract void method1211(int i, float f, float f_48_, float f_49_);

	abstract void method1212(ShaderProgram class298_sub31_sub1, int i, Interface9 interface9);

	abstract void method1213(int i, float f, float f_50_, float f_51_);

	abstract void method1214(int i, float[] fs, int i_52_);

	abstract void method1215(ShaderProgram class298_sub31_sub1, Matrix4f matrix4f);

	abstract void method1216(ShaderProgram class298_sub31_sub1, Matrix4f matrix4f);

	abstract void method1217(int i, Matrix4f matrix4f);

	abstract void method1218(int i, int i_53_, Interface9 interface9);

	abstract void method1219(int i, float f, float f_54_, float f_55_);

	abstract void method1220(int i, int i_56_, Interface9 interface9);

	public abstract boolean method1221();

	abstract void method1222(int i, float f, float f_57_, float f_58_, float f_59_);

}
