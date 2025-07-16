package com.jagex;/* Class298_Sub24_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

public class Class298_Sub24_Sub4 extends Class298_Sub24 {
	String aString9300;
	static int anInt9301 = 0;
	int anInt9302;
	static int anInt9303 = 128;
	String aString9304;
	String aString9305;
	float aFloat9306;
	float aFloat9307;
	int anInt9308;

	void method3074(OggPacket oggpacket, int i) {
		try {
			if (this.anInt7352 * -1312498565 <= 0 || "SUB".equals(this.aString9305)) {
				Buffer class298_sub53 = new Buffer(oggpacket.getData());
				int i_0_ = class298_sub53.readUByte();
				if (-1312498565 * this.anInt7352 <= 8) {
					if (0 == (i_0_ | 0x80))
						throw new IllegalStateException();
					if (-1312498565 * this.anInt7352 == 0) {
						class298_sub53.offset += -1617461143;
						this.anInt9302 = class298_sub53.method3600() * 33758645;
						this.anInt9308 = (class298_sub53.method3600() * 1857578037);
						if ((this.anInt9302 * -180836195) == 0 || (this.anInt9308 * 2110967325) == 0)
							throw new IllegalStateException();
						Buffer class298_sub53_1_ = new Buffer(16);
						class298_sub53.readBytes((class298_sub53_1_.buffer), 0, 16);
						this.aString9304 = class298_sub53_1_.readString();
						class298_sub53_1_.offset = 0;
						class298_sub53.readBytes((class298_sub53_1_.buffer), 0, 16);
						this.aString9305 = class298_sub53_1_.readString();
					}
				} else {
					if (0 == i_0_) {
						long l = class298_sub53.method3640();
						long l_2_ = class298_sub53.method3640();
						long l_3_ = class298_sub53.method3640();
						if (l < 0L || l_2_ < 0L || l_3_ < 0L || l_3_ > l)
							throw new IllegalStateException();
						this.aFloat9306 = ((float) (l * (long) (2110967325 * this.anInt9308)) / (float) (-180836195 * (this.anInt9302)));
						this.aFloat9307 = ((float) ((l + l_2_) * (long) ((this.anInt9308) * 2110967325)) / (float) (-180836195 * (this.anInt9302)));
						int i_4_ = class298_sub53.method3600();
						if (i_4_ < 0 || i_4_ > (class298_sub53.buffer.length - 385051775 * class298_sub53.offset))
							throw new IllegalStateException();
						this.aString9300 = Class214.method1995((class298_sub53.buffer), (class298_sub53.offset * 385051775), i_4_, -730069426);
					}
					if ((i_0_ | 0x80) != 0)
						return;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajv.f(").append(')').toString());
		}
	}

	String method3091(byte i) {
		try {
			return this.aString9304;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajv.q(").append(')').toString());
		}
	}

	public float method3092(byte i) {
		try {
			return this.aFloat9306;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajv.n(").append(')').toString());
		}
	}

	public float method3093(int i) {
		try {
			return this.aFloat9307;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajv.s(").append(')').toString());
		}
	}

	public String method3094() {
		try {
			return this.aString9300;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajv.z(").append(')').toString());
		}
	}

	void method3079() {
		/* empty */
	}

	void method3077(OggPacket oggpacket) {
		if (this.anInt7352 * -1312498565 <= 0 || "SUB".equals(this.aString9305)) {
			Buffer class298_sub53 = new Buffer(oggpacket.getData());
			int i = class298_sub53.readUByte();
			if (-1312498565 * this.anInt7352 <= 8) {
				if (0 == (i | 0x80))
					throw new IllegalStateException();
				if (-1312498565 * this.anInt7352 == 0) {
					class298_sub53.offset += -1617461143;
					this.anInt9302 = class298_sub53.method3600() * 33758645;
					this.anInt9308 = class298_sub53.method3600() * 1857578037;
					if ((this.anInt9302 * -180836195 == 0) || (this.anInt9308 * 2110967325 == 0))
						throw new IllegalStateException();
					Buffer class298_sub53_5_ = new Buffer(16);
					class298_sub53.readBytes(class298_sub53_5_.buffer, 0, 16);
					this.aString9304 = class298_sub53_5_.readString();
					class298_sub53_5_.offset = 0;
					class298_sub53.readBytes(class298_sub53_5_.buffer, 0, 16);
					this.aString9305 = class298_sub53_5_.readString();
				}
			} else {
				if (0 == i) {
					long l = class298_sub53.method3640();
					long l_6_ = class298_sub53.method3640();
					long l_7_ = class298_sub53.method3640();
					if (l < 0L || l_6_ < 0L || l_7_ < 0L || l_7_ > l)
						throw new IllegalStateException();
					this.aFloat9306 = ((float) (l * (long) (2110967325 * (this.anInt9308))) / (float) (-180836195 * (this.anInt9302)));
					this.aFloat9307 = ((float) ((l + l_6_) * (long) ((this.anInt9308) * 2110967325)) / (float) (-180836195 * (this.anInt9302)));
					int i_8_ = class298_sub53.method3600();
					if (i_8_ < 0 || i_8_ > (class298_sub53.buffer.length - 385051775 * class298_sub53.offset))
						throw new IllegalStateException();
					this.aString9300 = Class214.method1995(class298_sub53.buffer, (class298_sub53.offset * 385051775), i_8_, -932621904);
				}
				if ((i | 0x80) != 0)
					return;
			}
		}
	}

	void method3078(OggPacket oggpacket) {
		if (this.anInt7352 * -1312498565 <= 0 || "SUB".equals(this.aString9305)) {
			Buffer class298_sub53 = new Buffer(oggpacket.getData());
			int i = class298_sub53.readUByte();
			if (-1312498565 * this.anInt7352 <= 8) {
				if (0 == (i | 0x80))
					throw new IllegalStateException();
				if (-1312498565 * this.anInt7352 == 0) {
					class298_sub53.offset += -1617461143;
					this.anInt9302 = class298_sub53.method3600() * 33758645;
					this.anInt9308 = class298_sub53.method3600() * 1857578037;
					if ((this.anInt9302 * -180836195 == 0) || (this.anInt9308 * 2110967325 == 0))
						throw new IllegalStateException();
					Buffer class298_sub53_9_ = new Buffer(16);
					class298_sub53.readBytes(class298_sub53_9_.buffer, 0, 16);
					this.aString9304 = class298_sub53_9_.readString();
					class298_sub53_9_.offset = 0;
					class298_sub53.readBytes(class298_sub53_9_.buffer, 0, 16);
					this.aString9305 = class298_sub53_9_.readString();
				}
			} else {
				if (0 == i) {
					long l = class298_sub53.method3640();
					long l_10_ = class298_sub53.method3640();
					long l_11_ = class298_sub53.method3640();
					if (l < 0L || l_10_ < 0L || l_11_ < 0L || l_11_ > l)
						throw new IllegalStateException();
					this.aFloat9306 = ((float) (l * (long) (2110967325 * (this.anInt9308))) / (float) (-180836195 * (this.anInt9302)));
					this.aFloat9307 = ((float) ((l + l_10_) * (long) ((this.anInt9308) * 2110967325)) / (float) (-180836195 * (this.anInt9302)));
					int i_12_ = class298_sub53.method3600();
					if (i_12_ < 0 || i_12_ > (class298_sub53.buffer.length - 385051775 * class298_sub53.offset))
						throw new IllegalStateException();
					this.aString9300 = Class214.method1995(class298_sub53.buffer, (class298_sub53.offset * 385051775), i_12_, -854138275);
				}
				if ((i | 0x80) != 0)
					return;
			}
		}
	}

	void method3072() {
		/* empty */
	}

	void method3076(OggPacket oggpacket) {
		if (this.anInt7352 * -1312498565 <= 0 || "SUB".equals(this.aString9305)) {
			Buffer class298_sub53 = new Buffer(oggpacket.getData());
			int i = class298_sub53.readUByte();
			if (-1312498565 * this.anInt7352 <= 8) {
				if (0 == (i | 0x80))
					throw new IllegalStateException();
				if (-1312498565 * this.anInt7352 == 0) {
					class298_sub53.offset += -1617461143;
					this.anInt9302 = class298_sub53.method3600() * 33758645;
					this.anInt9308 = class298_sub53.method3600() * 1857578037;
					if ((this.anInt9302 * -180836195 == 0) || (this.anInt9308 * 2110967325 == 0))
						throw new IllegalStateException();
					Buffer class298_sub53_13_ = new Buffer(16);
					class298_sub53.readBytes((class298_sub53_13_.buffer), 0, 16);
					this.aString9304 = class298_sub53_13_.readString();
					class298_sub53_13_.offset = 0;
					class298_sub53.readBytes((class298_sub53_13_.buffer), 0, 16);
					this.aString9305 = class298_sub53_13_.readString();
				}
			} else {
				if (0 == i) {
					long l = class298_sub53.method3640();
					long l_14_ = class298_sub53.method3640();
					long l_15_ = class298_sub53.method3640();
					if (l < 0L || l_14_ < 0L || l_15_ < 0L || l_15_ > l)
						throw new IllegalStateException();
					this.aFloat9306 = ((float) (l * (long) (2110967325 * (this.anInt9308))) / (float) (-180836195 * (this.anInt9302)));
					this.aFloat9307 = ((float) ((l + l_14_) * (long) ((this.anInt9308) * 2110967325)) / (float) (-180836195 * (this.anInt9302)));
					int i_16_ = class298_sub53.method3600();
					if (i_16_ < 0 || i_16_ > (class298_sub53.buffer.length - 385051775 * class298_sub53.offset))
						throw new IllegalStateException();
					this.aString9300 = Class214.method1995(class298_sub53.buffer, (class298_sub53.offset * 385051775), i_16_, 1348372434);
				}
				if ((i | 0x80) != 0)
					return;
			}
		}
	}

	void method3075(int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajv.b(").append(')').toString());
		}
	}

	Class298_Sub24_Sub4(OggStreamState oggstreamstate) {
		super(oggstreamstate);
	}
}
