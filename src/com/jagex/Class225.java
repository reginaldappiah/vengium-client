package com.jagex;/* Class225 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class Class225 {
	CacheResourceWorker aCacheResourceWorker_2505;
	BigInteger aBigInteger2506;
	PaddedResourceRequest aPaddedResourceRequest_2507;
	BigInteger aBigInteger2508;
	PaddedResourceWorker aPaddedResourceWorker_2509;
	Buffer aClass298_Sub53_2510;
	ArchiveResourceProvider[] aJs5IndexSystemArray2511;
	public static Class162 aClass162_2512;

	public boolean method2094() {
		try {
			if (this.aClass298_Sub53_2510 != null)
				return true;
			if (null == this.aPaddedResourceRequest_2507) {
				if (this.aPaddedResourceWorker_2509.method2340())
					return false;
				this.aPaddedResourceRequest_2507 = this.aPaddedResourceWorker_2509.method2338(255, 255, (byte) 0, true);
			}
			if (this.aPaddedResourceRequest_2507.waiting)
				return false;
			Buffer class298_sub53 = new Buffer(this.aPaddedResourceRequest_2507.method3465());
			class298_sub53.offset = 582066555;
			int i_0_ = class298_sub53.readUByte();
			class298_sub53.offset += -208176200 * i_0_;
			byte[] is = new byte[(class298_sub53.buffer.length - 385051775 * class298_sub53.offset)];
			class298_sub53.readBytes(is, 0, is.length);
			byte[] hash;
			if (null == this.aBigInteger2506 || this.aBigInteger2508 == null || Loader.DISABLE_RSA)
				hash = is;
			else {
				BigInteger biginteger = new BigInteger(is);
				BigInteger biginteger_2_ = biginteger.modPow(this.aBigInteger2506, this.aBigInteger2508);
				hash = biginteger_2_.toByteArray();
			}
			if (hash.length != 64 && hash.length != 65)
				throw new RuntimeException();
			byte[] is_3_ = Class152.whirlpool(class298_sub53.buffer, 5, (385051775 * class298_sub53.offset - is.length - 5));
			for (int i_4_ = 0; i_4_ < 64; i_4_++) {
				if (is_3_[i_4_] != hash[i_4_] && is_3_[i_4_] != hash[i_4_ + 1]) {
					throw new RuntimeException();
				}
			}
			this.aJs5IndexSystemArray2511 = new ArchiveResourceProvider[i_0_];
			this.aClass298_Sub53_2510 = class298_sub53;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jn.a(").append(')').toString());
		}
	}

	public ArchiveResourceProvider method2095(int i, ResourceCache resourceCache, ResourceCache resourceCache_5_, int i_6_) {
		try {
			return method2096(i, resourceCache, resourceCache_5_, true, 2087192447);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jn.f(").append(')').toString());
		}
	}

	ArchiveResourceProvider method2096(int i, ResourceCache resourceCache, ResourceCache resourceCache_7_, boolean bool, int i_8_) {
		try {
			if (null == this.aClass298_Sub53_2510)
				throw new RuntimeException();
			if (i < 0 || i >= this.aJs5IndexSystemArray2511.length)
				throw new RuntimeException();
			if (this.aJs5IndexSystemArray2511[i] != null)
				return this.aJs5IndexSystemArray2511[i];
			this.aClass298_Sub53_2510.offset = 698479866 + i * -208176200;
			int i_9_ = this.aClass298_Sub53_2510.readInt();
			int i_10_ = this.aClass298_Sub53_2510.readInt();
			byte[] is = new byte[64];
			this.aClass298_Sub53_2510.readBytes(is, 0, 64);
			ArchiveResourceProvider js5IndexSystem = new ArchiveResourceProvider(i, resourceCache, resourceCache_7_, this.aPaddedResourceWorker_2509, this.aCacheResourceWorker_2505, i_9_, is, i_10_, bool);
			this.aJs5IndexSystemArray2511[i] = js5IndexSystem;
			return js5IndexSystem;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jn.b(").append(')').toString());
		}
	}

	public void method2097(int i) {
		try {
			if (this.aJs5IndexSystemArray2511 != null) {
				for (int i_11_ = 0; i_11_ < this.aJs5IndexSystemArray2511.length; i_11_++) {
					if (this.aJs5IndexSystemArray2511[i_11_] != null)
						this.aJs5IndexSystemArray2511[i_11_].method2272();
				}
				for (int i_12_ = 0; i_12_ < this.aJs5IndexSystemArray2511.length; i_12_++) {
					if (this.aJs5IndexSystemArray2511[i_12_] != null)
						this.aJs5IndexSystemArray2511[i_12_].method2273(437628699);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jn.p(").append(')').toString());
		}
	}

	public Class225(PaddedResourceWorker paddedResourceWorker, CacheResourceWorker cacheResourceWorker, BigInteger biginteger, BigInteger biginteger_13_) {
		this.aPaddedResourceWorker_2509 = paddedResourceWorker;
		this.aCacheResourceWorker_2505 = cacheResourceWorker;
		this.aBigInteger2506 = biginteger;
		this.aBigInteger2508 = biginteger_13_;
		if (!this.aPaddedResourceWorker_2509.method2340())
			this.aPaddedResourceRequest_2507 = this.aPaddedResourceWorker_2509.method2338(255, 255, (byte) 0, true);
	}

	static final void method2098(ScriptRuntime class403, int i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = StaticMethods.anInt6059 * 551398421;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jn.ams(").append(')').toString());
		}
	}

	static final void method2099(ObjectDeque objectDeque, boolean bool) {
		try {
			if (objectDeque.aBoolean7160) {
				if (-1188221251 * objectDeque.objectID < 0 || Class140.method1559(GameClient.myRegion.getObjectDefinitionLoader(), (-1188221251 * (objectDeque.objectID)), (-366156959 * (objectDeque.anInt7154)), (byte) -3)) {
					if (!bool)
						StaticMethods.method4923((objectDeque.plane * 2108312995), (objectDeque.anInt7157 * -431456739), objectDeque.localX * 634196087, objectDeque.localY * -2146829167, (objectDeque.objectID * -1188221251), (objectDeque.anInt7161 * -1234291173), (-366156959 * objectDeque.anInt7154), -1);
					else
						StaticMethods.method6300((objectDeque.plane * 2108312995), (objectDeque.anInt7157 * -431456739), objectDeque.localX * 634196087, objectDeque.localY * -2146829167, null);
					objectDeque.unlink();
				}
			} else if (objectDeque.aBoolean7159 && 634196087 * objectDeque.localX >= 1 && objectDeque.localY * -2146829167 >= 1 && (634196087 * objectDeque.localX <= (GameClient.myRegion.getMapWidth() - 2)) && (objectDeque.localY * -2146829167 <= GameClient.myRegion.getMapLength() - 2) && ((objectDeque.anInt7156 * 856355825) < 0 || (Class140.method1559(GameClient.myRegion.getObjectDefinitionLoader(), (objectDeque.anInt7156 * 856355825), (205923815 * objectDeque.type), (byte) -66)))) {
				if (!bool)
					StaticMethods.method4923((objectDeque.plane * 2108312995), (-431456739 * objectDeque.anInt7157), objectDeque.localX * 634196087, objectDeque.localY * -2146829167, 856355825 * objectDeque.anInt7156, (objectDeque.rotation * -674934345), objectDeque.type * 205923815, -1);
				else
					StaticMethods.method6300((objectDeque.plane) * 2108312995, (objectDeque.anInt7157) * -431456739, objectDeque.localX * 634196087, objectDeque.localY * -2146829167, (objectDeque.aClass435_7158));
				objectDeque.aBoolean7159 = false;
				if (!bool && (856355825 * objectDeque.anInt7156 == (-1188221251 * objectDeque.objectID)) && (-1188221251 * objectDeque.objectID == -1))
					objectDeque.unlink();
				else if (!bool && ((objectDeque.objectID * -1188221251) == (856355825 * objectDeque.anInt7156)) && ((objectDeque.anInt7161 * -1234291173) == (objectDeque.rotation * -674934345)) && ((205923815 * objectDeque.type) == (-366156959 * objectDeque.anInt7154)))
					objectDeque.unlink();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jn.k(").append(')').toString());
		}
	}

	static final void method2100(ScriptRuntime class403, int i) {
		try {
			int i_14_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_14_);
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = class105.zoom * -261021353;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jn.ri(").append(')').toString());
		}
	}

	static final void method2101(IComponentDefinition class105, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime class403, int i) {
		try {
			class105.shadowed = (class403.integerStack[(class403.integerStackOffset -= -391880689) * 681479919]) == 1;
			StaticMethods.updateComponentTick(class105);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jn.ed(").append(')').toString());
		}
	}

	static final void method2102(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
		try {
			componentDefinition.targetVerb = (String) (runtime.objectStack[((runtime.objectArgs -= 969361751) * -203050393)]);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jn.jg(").append(')').toString());
		}
	}

	static void method2103(int i) {
		try {

			if (1196508279 * Class82_Sub14.anInt6875 < 0) {
				Class82_Sub14.anInt6875 = 0;
				Class301_Sub1.anInt7632 = 433609607;
				Class301_Sub1.anInt7627 = 789877945;
			}
			if (1196508279 * Class82_Sub14.anInt6875 > Class301_Sub1.anInt3239) {
				Class82_Sub14.anInt6875 = Class301_Sub1.anInt3239 * -2076584633;
				Class301_Sub1.anInt7632 = 433609607;
				Class301_Sub1.anInt7627 = 789877945;
			}
			if (Class376.anInt4090 * 1882038855 < 0) {
				Class376.anInt4090 = 0;
				Class301_Sub1.anInt7632 = 433609607;
				Class301_Sub1.anInt7627 = 789877945;
			}
			if (1882038855 * Class376.anInt4090 > Class301_Sub1.anInt3240) {
				Class376.anInt4090 = Class301_Sub1.anInt3240 * -435591305;
				Class301_Sub1.anInt7632 = 433609607;
				Class301_Sub1.anInt7627 = 789877945;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("jn.bg(").append(')').toString());
		}
	}
}
