package com.jagex;/* Class365_Sub1_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.maths.Matrix43f;
import com.jagex.network.OutgoingPacket;
import com.jagex.utils.TimeUtils;

public class Class365_Sub1_Sub2_Sub1 extends Class365_Sub1_Sub2 implements SceneObject {
	boolean aBoolean9907 = true;
	boolean aBoolean9908;
	Class334 aClass334_9909;
	public Class60 aClass60_9910;
	static long aLong9911;

	boolean method4350(GraphicsToolkit class_ra, int i, int i_0_, byte i_1_) {
		try {
			ModelToolkit class387 = aClass60_9910.method700(class_ra, 131072, false, false);
			if (class387 == null)
				return false;
			return class387.method4787(i, i_0_, method4347(), false, 0);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wm.bu(").append(')').toString());
		}
	}

	boolean method4376() {
		try {
			return this.aBoolean9907;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wm.be(").append(')').toString());
		}
	}

	public Class334 method4358(GraphicsToolkit graphicsToolkit) {
		try {
			return this.aClass334_9909;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wm.bc(").append(')').toString());
		}
	}

	public int method4363() {
		try {
			return aClass60_9910.method699();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wm.bx(").append(')').toString());
		}
	}

	Class335 method4394(GraphicsToolkit graphicsToolkit) {
		try {
			ModelToolkit class387 = aClass60_9910.method700(graphicsToolkit, 2048, false, true);
			if (null == class387)
				return null;
			Matrix43f class222 = method4347();
			Class235 class235 = getWorldTransform();
			Class335 class335 = StaticMethods.method818((this.aBoolean9908));
			int i_3_ = (int) class235.trans.x >> 9;
			int i_4_ = (int) class235.trans.z >> 9;
			aClass60_9910.method701(graphicsToolkit, class387, class222, true);
			class387.render(class222, aClass302_Sub1Array7726[0], 0);
			if (null != aClass60_9910.aParticleSystem_602) {
				Class69 class69 = aClass60_9910.aParticleSystem_602.method4229();
				graphicsToolkit.renderParticles(class69);
			}
			this.aBoolean9907 = (class387.i() || null != aClass60_9910.aParticleSystem_602);
			if (null == this.aClass334_9909)
				this.aClass334_9909 = Class472.method6063((int) (class235.trans.x), (int) (class235.trans.y), (int) (class235.trans.z), class387);
			else
				Class264_Sub2.method2507(this.aClass334_9909, (int) class235.trans.x, (int) class235.trans.y, (int) class235.trans.z, class387);
			return class335;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wm.bo(").append(')').toString());
		}
	}

	public Class365_Sub1_Sub2_Sub1(Region class331, GraphicsToolkit class_ra, ObjectDefinitionLoader class433, ObjectDefinition class432, int i, int i_5_, int i_6_, int i_7_, int i_8_, boolean bool, int i_9_, int i_10_) {
		super(class331, i_6_, i_7_, i_8_, i, i_5_, -228547261 * class432.anInt5418);
		aClass60_9910 = new Class60(class_ra, class433, class432, Class424.aClass424_6610.type * -1976050083, i_9_, i, i_5_, this, bool, i_10_);
		this.aBoolean9908 = class432.anInt5382 * 1532834983 != 0 && !bool;
		method4362(1);
	}

    final boolean method4366() {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wm.bw(").append(')').toString());
		}
	}

	final void method4355(GraphicsToolkit graphicsToolkit, Class365_Sub1 class365_sub1, int i, int i_11_, int i_12_, boolean bool) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wm.bk(").append(')').toString());
		}
	}

	final void method4398() {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wm.bq(").append(')').toString());
		}
	}

	public int getID() {
		try {
			return 1686561661 * aClass60_9910.fileID;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wm.a(").append(')').toString());
		}
	}

	public int method29() {
		try {
			return -1598457753 * aClass60_9910.anInt589;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wm.f(").append(')').toString());
		}
	}

	public int method30() {
		try {
			return 748228569 * aClass60_9910.anInt590;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wm.b(").append(')').toString());
		}
	}

	boolean method4399() {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wm.bf(").append(')').toString());
		}
	}

	public void method4495(Class435 class435) {
		try {
			aClass60_9910.method698(class435);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wm.by(").append(')').toString());
		}
	}

	public void method37(GraphicsToolkit toolkit) {
		try {
			aClass60_9910.method707();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wm.d(").append(')').toString());
		}
	}

    public int method4361() {
		try {
			return aClass60_9910.method705();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wm.bm(").append(')').toString());
		}
	}

    public int method4496() {
		return aClass60_9910.method699();
	}

	public void method33(GraphicsToolkit toolkit) {
		try {
			aClass60_9910.method702(toolkit);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wm.k(").append(')').toString());
		}
	}

    public boolean method39() {
		try {
			return aClass60_9910.method706();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wm.i(").append(')').toString());
		}
	}

	void method4357(GraphicsToolkit class_ra, int i) {
		try {
			ModelToolkit class387 = aClass60_9910.method700(class_ra, 262144, true, true);
			if (null != class387) {
				Vector3f class217 = getWorldTransform().trans;
				int i_22_ = (int) class217.x >> 9;
				int i_23_ = (int) class217.z >> 9;
				aClass60_9910.method701(class_ra, class387, method4347(), false);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wm.bb(").append(')').toString());
		}
	}

	public void method31() {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wm.p(").append(')').toString());
		}
	}

	public int method4497() {
		return aClass60_9910.method699();
	}

	static final void method4498(ScriptRuntime class403, byte i) {
		try {
			ConnectionType connectionType = ConnectionType.getConnectionType();
			OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.PUBLIC_QUICK_CHAT_PACKET, connectionType.encryptor);
			outgoingPacketBuffer.payload.writeByte(0);
			int i_25_ = (outgoingPacketBuffer.payload.offset * 385051775);
			outgoingPacketBuffer.payload.writeByte(2);
			outgoingPacketBuffer.payload.writeShort(class403.aClass177_5243.anInt1787 * -2034569943);
			class403.aClass177_5243.aClass298_Sub37_Sub14_1788.method3464(outgoingPacketBuffer.payload, class403.aClass177_5243.anIntArray1789, 1820223429);
			outgoingPacketBuffer.payload.method3649(385051775 * (outgoingPacketBuffer.payload.offset) - i_25_);
			connectionType.sendFrame(outgoingPacketBuffer);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wm.adk(").append(')').toString());
		}
	}

	public static void method4499(byte i) {
		try {
			Class439.loadGameState(17);
			Class173.method1826();
			System.gc();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wm.lx(").append(')').toString());
		}
	}

	static final void method4500(ScriptRuntime class403, short i) {
		try {
			int i_26_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			int[] is = TimeUtils.getDate(i_26_);
			Class425.method5741(is, 0, class403.integerStack, 681479919 * class403.integerStackOffset, 3);
			class403.integerStackOffset += -1175642067;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("wm.akm(").append(')').toString());
		}
	}
}
