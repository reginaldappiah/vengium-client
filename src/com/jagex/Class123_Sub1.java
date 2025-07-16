package com.jagex;/* Class123_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class123_Sub1 extends Class123 {
	DirectXGraphicsToolkit aDirectXJavaGraphicsToolkit_6948;
	DirectXShaderToolkit aClass110_Sub1_6949;
	boolean aBoolean6950;

	public boolean method1374() {
		return ((this.aDirectXJavaGraphicsToolkit_6948.aClass110_Sub1_9860) == this.aClass110_Sub1_6949);
	}

	ShaderProgramToolkit method1326(NativeToolkit class_ra_sub3, Class108 class108) {
		return new DirectXShaderToolkit((DirectXGraphicsToolkit) class_ra_sub3, this, class108);
	}

	public boolean method1331(ShaderProgramToolkit shaderProgramToolkit) {
		if (this.aClass110_Sub1_6949 == shaderProgramToolkit)
			return true;
		if (!shaderProgramToolkit.method1221())
			return false;
		this.aClass110_Sub1_6949 = (DirectXShaderToolkit) shaderProgramToolkit;
		anInt1475 = method1329(shaderProgramToolkit, -180449856) * -1776466383;
		if (anInt1475 * -33664303 == -1)
			throw new IllegalArgumentException();
		if (this.aBoolean6950) {
			this.aDirectXJavaGraphicsToolkit_6948.method5543(this.aClass110_Sub1_6949.aLong8597);
			this.aDirectXJavaGraphicsToolkit_6948.method5566(this.aClass110_Sub1_6949.aLong8592);
			this.aDirectXJavaGraphicsToolkit_6948.aClass110_Sub1_9860 = this.aClass110_Sub1_6949;
		}
		return true;
	}

	ShaderProgramToolkit method1361(NativeToolkit class_ra_sub3, Class108 class108) {
		return new DirectXShaderToolkit((DirectXGraphicsToolkit) class_ra_sub3, this, class108);
	}

	public void method1340() {
		if (this.aClass110_Sub1_6949 == null)
			throw new RuntimeException_Sub1();
		this.aDirectXJavaGraphicsToolkit_6948.method5543(this.aClass110_Sub1_6949.aLong8597);
		this.aDirectXJavaGraphicsToolkit_6948.method5566(this.aClass110_Sub1_6949.aLong8592);
		this.aDirectXJavaGraphicsToolkit_6948.aClass110_Sub1_9860 = this.aClass110_Sub1_6949;
		this.aBoolean6950 = true;
	}

	public void method1372() {
		this.aDirectXJavaGraphicsToolkit_6948.method5543(0L);
		this.aDirectXJavaGraphicsToolkit_6948.method5566(0L);
		this.aBoolean6950 = false;
		this.aDirectXJavaGraphicsToolkit_6948.aClass110_Sub1_9860 = null;
		this.aDirectXJavaGraphicsToolkit_6948.method5357(1);
		this.aDirectXJavaGraphicsToolkit_6948.method5358(null);
		this.aDirectXJavaGraphicsToolkit_6948.method5357(0);
		this.aDirectXJavaGraphicsToolkit_6948.method5358(null);
	}

	public boolean method1376(ShaderProgramToolkit shaderProgramToolkit) {
		if (this.aClass110_Sub1_6949 == shaderProgramToolkit)
			return true;
		if (!shaderProgramToolkit.method1221())
			return false;
		this.aClass110_Sub1_6949 = (DirectXShaderToolkit) shaderProgramToolkit;
		anInt1475 = method1329(shaderProgramToolkit, -180449856) * -1776466383;
		if (anInt1475 * -33664303 == -1)
			throw new IllegalArgumentException();
		if (this.aBoolean6950) {
			this.aDirectXJavaGraphicsToolkit_6948.method5543(this.aClass110_Sub1_6949.aLong8597);
			this.aDirectXJavaGraphicsToolkit_6948.method5566(this.aClass110_Sub1_6949.aLong8592);
			this.aDirectXJavaGraphicsToolkit_6948.aClass110_Sub1_9860 = this.aClass110_Sub1_6949;
		}
		return true;
	}

	public void method1354() {
		if (this.aClass110_Sub1_6949 == null)
			throw new RuntimeException_Sub1();
		this.aDirectXJavaGraphicsToolkit_6948.method5543(this.aClass110_Sub1_6949.aLong8597);
		this.aDirectXJavaGraphicsToolkit_6948.method5566(this.aClass110_Sub1_6949.aLong8592);
		this.aDirectXJavaGraphicsToolkit_6948.aClass110_Sub1_9860 = this.aClass110_Sub1_6949;
		this.aBoolean6950 = true;
	}

	public void method1355() {
		if (this.aClass110_Sub1_6949 == null)
			throw new RuntimeException_Sub1();
		this.aDirectXJavaGraphicsToolkit_6948.method5543(this.aClass110_Sub1_6949.aLong8597);
		this.aDirectXJavaGraphicsToolkit_6948.method5566(this.aClass110_Sub1_6949.aLong8592);
		this.aDirectXJavaGraphicsToolkit_6948.aClass110_Sub1_9860 = this.aClass110_Sub1_6949;
		this.aBoolean6950 = true;
	}

	public boolean method1371() {
		return ((this.aDirectXJavaGraphicsToolkit_6948.aClass110_Sub1_9860) == this.aClass110_Sub1_6949);
	}

	public void method1356() {
		this.aDirectXJavaGraphicsToolkit_6948.method5543(0L);
		this.aDirectXJavaGraphicsToolkit_6948.method5566(0L);
		this.aBoolean6950 = false;
		this.aDirectXJavaGraphicsToolkit_6948.aClass110_Sub1_9860 = null;
		this.aDirectXJavaGraphicsToolkit_6948.method5357(1);
		this.aDirectXJavaGraphicsToolkit_6948.method5358(null);
		this.aDirectXJavaGraphicsToolkit_6948.method5357(0);
		this.aDirectXJavaGraphicsToolkit_6948.method5358(null);
	}

	public void method1357() {
		this.aDirectXJavaGraphicsToolkit_6948.method5543(0L);
		this.aDirectXJavaGraphicsToolkit_6948.method5566(0L);
		this.aBoolean6950 = false;
		this.aDirectXJavaGraphicsToolkit_6948.aClass110_Sub1_9860 = null;
		this.aDirectXJavaGraphicsToolkit_6948.method5357(1);
		this.aDirectXJavaGraphicsToolkit_6948.method5358(null);
		this.aDirectXJavaGraphicsToolkit_6948.method5357(0);
		this.aDirectXJavaGraphicsToolkit_6948.method5358(null);
	}

	public void method1358() {
		this.aDirectXJavaGraphicsToolkit_6948.method5543(0L);
		this.aDirectXJavaGraphicsToolkit_6948.method5566(0L);
		this.aBoolean6950 = false;
		this.aDirectXJavaGraphicsToolkit_6948.aClass110_Sub1_9860 = null;
		this.aDirectXJavaGraphicsToolkit_6948.method5357(1);
		this.aDirectXJavaGraphicsToolkit_6948.method5358(null);
		this.aDirectXJavaGraphicsToolkit_6948.method5357(0);
		this.aDirectXJavaGraphicsToolkit_6948.method5358(null);
	}

	public boolean method1359() {
		return ((this.aDirectXJavaGraphicsToolkit_6948.aClass110_Sub1_9860) == this.aClass110_Sub1_6949);
	}

	ShaderProgram method1364(Class114 class114) {
		return new Class298_Sub31_Sub1_Sub2(this, class114);
	}

	Class123_Sub1(DirectXGraphicsToolkit directXJavaGraphicsToolkit, Class109 class109) {
		super(directXJavaGraphicsToolkit, class109);
		this.aDirectXJavaGraphicsToolkit_6948 = directXJavaGraphicsToolkit;
		this.aBoolean6950 = false;
	}

	ShaderProgramToolkit method1362(NativeToolkit class_ra_sub3, Class108 class108) {
		return new DirectXShaderToolkit((DirectXGraphicsToolkit) class_ra_sub3, this, class108);
	}

	public void method1373() {
		if (this.aClass110_Sub1_6949 == null)
			throw new RuntimeException_Sub1();
		this.aDirectXJavaGraphicsToolkit_6948.method5543(this.aClass110_Sub1_6949.aLong8597);
		this.aDirectXJavaGraphicsToolkit_6948.method5566(this.aClass110_Sub1_6949.aLong8592);
		this.aDirectXJavaGraphicsToolkit_6948.aClass110_Sub1_9860 = this.aClass110_Sub1_6949;
		this.aBoolean6950 = true;
	}

	public boolean method1349(ShaderProgramToolkit shaderProgramToolkit) {
		if (this.aClass110_Sub1_6949 == shaderProgramToolkit)
			return true;
		if (!shaderProgramToolkit.method1221())
			return false;
		this.aClass110_Sub1_6949 = (DirectXShaderToolkit) shaderProgramToolkit;
		anInt1475 = method1329(shaderProgramToolkit, -180449856) * -1776466383;
		if (anInt1475 * -33664303 == -1)
			throw new IllegalArgumentException();
		if (this.aBoolean6950) {
			this.aDirectXJavaGraphicsToolkit_6948.method5543(this.aClass110_Sub1_6949.aLong8597);
			this.aDirectXJavaGraphicsToolkit_6948.method5566(this.aClass110_Sub1_6949.aLong8592);
			this.aDirectXJavaGraphicsToolkit_6948.aClass110_Sub1_9860 = this.aClass110_Sub1_6949;
		}
		return true;
	}

	public boolean method1375(ShaderProgramToolkit shaderProgramToolkit) {
		if (this.aClass110_Sub1_6949 == shaderProgramToolkit)
			return true;
		if (!shaderProgramToolkit.method1221())
			return false;
		this.aClass110_Sub1_6949 = (DirectXShaderToolkit) shaderProgramToolkit;
		anInt1475 = method1329(shaderProgramToolkit, -180449856) * -1776466383;
		if (anInt1475 * -33664303 == -1)
			throw new IllegalArgumentException();
		if (this.aBoolean6950) {
			this.aDirectXJavaGraphicsToolkit_6948.method5543(this.aClass110_Sub1_6949.aLong8597);
			this.aDirectXJavaGraphicsToolkit_6948.method5566(this.aClass110_Sub1_6949.aLong8592);
			this.aDirectXJavaGraphicsToolkit_6948.aClass110_Sub1_9860 = this.aClass110_Sub1_6949;
		}
		return true;
	}

	ShaderProgram method1367(Class114 class114) {
		return new Class298_Sub31_Sub1_Sub2(this, class114);
	}
}
