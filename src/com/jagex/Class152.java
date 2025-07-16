package com.jagex;/* Class152 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.utils.TimeUtils;

import java.util.Iterator;

public class Class152 {
	Class453 aClass453_1587;
	long aLong1588 = -8735484037837793267L;
	long aLong1592;
	static Class4 aClass4_1594;

	void method1650(Buffer buffer) {
		try {
			this.aLong1592 = (buffer.readLong() * 1517159550238851441L);
			this.aLong1588 = (buffer.readLong() * 8735484037837793267L);
			for (int i_0_ = buffer.readUByte(); i_0_ != 0; i_0_ = buffer.readUByte()) {
				Class298_Sub17 class298_sub17;
				if (1 == i_0_)
					class298_sub17 = new Class298_Sub17_Sub1();
				else if (i_0_ == 4)
					class298_sub17 = new Class298_Sub17_Sub4(this);
				else if (3 == i_0_)
					class298_sub17 = new Class298_Sub17_Sub3(this);
				else if (i_0_ == 2)
					class298_sub17 = new Class298_Sub17_Sub2(this);
				else
					throw new RuntimeException("");
				class298_sub17.method2917(buffer);
				this.aClass453_1587.pushBack(class298_sub17);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ge.a(").append(')').toString());
		}
	}

	public void method1651(ClanChannelChat codeBlock) {
		try {
			if ((-6615773310558494831L * this.aLong1592 != codeBlock.key * 7051297995265073167L) || (-3106107963843196613L * this.aLong1588 != (codeBlock.nextUpdateNumber * -3244420319926665157L)))
				throw new RuntimeException("");
			for (Class298_Sub17 class298_sub17 = (Class298_Sub17) this.aClass453_1587.method5939(); class298_sub17 != null; class298_sub17 = ((Class298_Sub17) this.aClass453_1587.method5944()))
				class298_sub17.method2918(codeBlock);
			codeBlock.nextUpdateNumber += 8816161044679006451L;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ge.f(").append(')').toString());
		}
	}

	public Class152(Buffer buffer) {
		this.aClass453_1587 = new Class453();
		method1650(buffer);
	}

	public static void method1652(GraphicsToolkit class_ra, long l) {
		try {
			Class344.anInt3677 = 1740005197 * Class344.anInt3682;
			Class344.anInt3682 = 0;
			TimeUtils.getTime();
			Iterator iterator = Class344.aList3683.iterator();
			while (iterator.hasNext()) {
				ParticleSystem particleSystem = (ParticleSystem) iterator.next();
				boolean bool = particleSystem.method4222(class_ra, l);
				if (!bool) {
					iterator.remove();
					Class344.aParticleSystemArray3679[(Class344.anInt3681 * -1264407527)] = particleSystem;
					Class344.anInt3681 = 2027155497 * (Class344.anInt3681 * -1264407527 + 1 & (Class65.anIntArray658[Class344.anInt3675 * 1197525581]));
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ge.f(").append(')').toString());
		}
	}

	static final void method1653(ScriptRuntime runtime) {
		try {
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = -2067054685 * RenderContext.anInt6815;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ge.amo(").append(')').toString());
		}
	}

	public static byte[] whirlpool(byte[] is, int i, int i_1_) {
		try {
			byte[] is_3_;
			if (i > 0) {
				is_3_ = new byte[i_1_];
				for (int i_4_ = 0; i_4_ < i_1_; i_4_++)
					is_3_[i_4_] = is[i + i_4_];
			} else
				is_3_ = is;
			Class455 class455 = new Class455();
			class455.method5953();
			class455.method5954(is_3_, (long) (8 * i_1_));
			byte[] is_5_ = new byte[64];
			class455.method5955(is_5_, 0);
			return is_5_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ge.i(").append(')').toString());
		}
	}

	static void method1655(Class302_Sub5 class302_sub5, int i) {
		try {
			class302_sub5.aClass365_Sub1_Sub1_Sub2_7660 = null;
			if (1585762285 * Class302_Sub5.anInt7662 < 20) {
				Class302_Sub5.aClass442_7661.method5870(class302_sub5, -104859728);
				Class302_Sub5.anInt7662 += 1704977893;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ge.p(").append(')').toString());
		}
	}

}
