package com.jagex;/* Class298_Sub24_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.prefetch.Js5List;
import com.jagex.utils.TimeUtils;
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.*;

public class Class298_Sub24_Sub3 extends Class298_Sub24 {
	boolean aBoolean9283;
	TheoraInfo aTheoraInfo9284;
	SetupInfo aSetupInfo9285 = new SetupInfo();
	static int anInt9286 = 2048;
	static int anInt9287 = 1024;
	DecoderContext aDecoderContext9288;
	double aDouble9289;
	Frame aFrame9290;
	int anInt9291;
	long aLong9292;
	boolean aBoolean9293;
	GranulePos aGranulePos9294;
	int anInt9295;
	TheoraComment aTheoraComment9296;
	boolean aBoolean9297;
	Object anObject9298;
	boolean aBoolean9299;

	Class298_Sub24_Sub3(OggStreamState oggstreamstate) {
		super(oggstreamstate);
		this.aTheoraInfo9284 = new TheoraInfo();
		this.aTheoraComment9296 = new TheoraComment();
	}

	float method3084(int i) {
		try {
			if (!this.aBoolean9293 || this.aTheoraInfo9284.a())
				return 0.0F;
			return ((float) (this.aTheoraInfo9284.fpsNumerator) / (float) (this.aTheoraInfo9284.fpsDenominator));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajq.n(").append(')').toString());
		}
	}

	double method3085(int i) {
		try {
			return this.aDouble9289;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajq.s(").append(')').toString());
		}
	}

	long method3086(byte i) {
		try {
			return (this.aLong9292 * 7179368485346321301L);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajq.z(").append(')').toString());
		}
	}

	boolean method3087(int i) {
		try {
			return this.aBoolean9293;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajq.posY(").append(')').toString());
		}
	}

	void method3075(int i) {
		try {
			if (this.aFrame9290 != null)
				this.aFrame9290.f();
			if (null != this.aDecoderContext9288) {
				this.aDecoderContext9288.f();
				this.aDecoderContext9288 = null;
			}
			if (null != this.aGranulePos9294) {
				this.aGranulePos9294.f();
				this.aGranulePos9294 = null;
			}
			this.aTheoraInfo9284.f();
			this.aTheoraComment9296.f();
			this.aSetupInfo9285.f();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajq.b(").append(')').toString());
		}
	}

	public Object method3088(Interface15 interface15) {
		try {
			if (null == this.aFrame9290)
				return null;
			if (!this.aBoolean9299 && null != this.anObject9298)
				return this.anObject9298;
			this.anObject9298 = (interface15.method214(this.aFrame9290.pixels, 0, 1264450863 * this.aFrame9290.a, this.aFrame9290.a * 1264450863, -1459424961 * this.aFrame9290.f, false, 1108085908));
			this.aBoolean9299 = false;
			return this.anObject9298;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajq.c(").append(')').toString());
		}
	}

	void method3077(OggPacket oggpacket) {
		if (!this.aBoolean9293) {
			int i = (this.aSetupInfo9285.decodeHeader(this.aTheoraInfo9284, this.aTheoraComment9296, oggpacket));
			if (0 == i) {
				this.aBoolean9293 = true;
				if ((this.aTheoraInfo9284.frameWidth > 2048) || (this.aTheoraInfo9284.frameHeight) > 1024)
					throw new IllegalStateException();
				this.aDecoderContext9288 = new DecoderContext((this.aTheoraInfo9284), (this.aSetupInfo9285));
				this.aGranulePos9294 = new GranulePos();
				this.aFrame9290 = new Frame((this.aTheoraInfo9284.frameWidth), (this.aTheoraInfo9284.frameHeight));
				this.anInt9295 = this.aDecoderContext9288.getMaxPostProcessingLevel() * 295322609;
				method3089((-2058603981 * this.anInt9291), (byte) 77);
			} else if (i < 0)
				throw new IllegalStateException(new StringBuilder().append("").append(i).toString());
		} else {
			this.aLong9292 = TimeUtils.getTime() * 4704549656485466045L;
			int i = (this.aDecoderContext9288.decodePacketIn(oggpacket, this.aGranulePos9294));
			if (i < 0)
				throw new IllegalStateException(new StringBuilder().append("").append(i).toString());
			this.aDecoderContext9288.granuleFrame(this.aGranulePos9294);
			this.aDouble9289 = (this.aDecoderContext9288.granuleTime(this.aGranulePos9294));
			if (this.aBoolean9297) {
				boolean bool = oggpacket.isKeyFrame() == 1;
				if (bool)
					this.aBoolean9297 = false;
				else
					return;
			}
			if (!this.aBoolean9283 || oggpacket.isKeyFrame() == 1) {
				if (this.aDecoderContext9288.decodeFrame(this.aFrame9290) != 0)
					throw new IllegalStateException(new StringBuilder().append("").append(i).toString());
				this.aBoolean9299 = true;
			}
		}
	}

	void method3078(OggPacket oggpacket) {
		if (!this.aBoolean9293) {
			int i = (this.aSetupInfo9285.decodeHeader(this.aTheoraInfo9284, this.aTheoraComment9296, oggpacket));
			if (0 == i) {
				this.aBoolean9293 = true;
				if ((this.aTheoraInfo9284.frameWidth > 2048) || (this.aTheoraInfo9284.frameHeight) > 1024)
					throw new IllegalStateException();
				this.aDecoderContext9288 = new DecoderContext((this.aTheoraInfo9284), (this.aSetupInfo9285));
				this.aGranulePos9294 = new GranulePos();
				this.aFrame9290 = new Frame((this.aTheoraInfo9284.frameWidth), (this.aTheoraInfo9284.frameHeight));
				this.anInt9295 = this.aDecoderContext9288.getMaxPostProcessingLevel() * 295322609;
				method3089((-2058603981 * this.anInt9291), (byte) 12);
			} else if (i < 0)
				throw new IllegalStateException(new StringBuilder().append("").append(i).toString());
		} else {
			this.aLong9292 = TimeUtils.getTime() * 4704549656485466045L;
			int i = (this.aDecoderContext9288.decodePacketIn(oggpacket, this.aGranulePos9294));
			if (i < 0)
				throw new IllegalStateException(new StringBuilder().append("").append(i).toString());
			this.aDecoderContext9288.granuleFrame(this.aGranulePos9294);
			this.aDouble9289 = (this.aDecoderContext9288.granuleTime(this.aGranulePos9294));
			if (this.aBoolean9297) {
				boolean bool = oggpacket.isKeyFrame() == 1;
				if (bool)
					this.aBoolean9297 = false;
				else
					return;
			}
			if (!this.aBoolean9283 || oggpacket.isKeyFrame() == 1) {
				if (this.aDecoderContext9288.decodeFrame(this.aFrame9290) != 0)
					throw new IllegalStateException(new StringBuilder().append("").append(i).toString());
				this.aBoolean9299 = true;
			}
		}
	}

	void method3072() {
		if (this.aFrame9290 != null)
			this.aFrame9290.f();
		if (null != this.aDecoderContext9288) {
			this.aDecoderContext9288.f();
			this.aDecoderContext9288 = null;
		}
		if (null != this.aGranulePos9294) {
			this.aGranulePos9294.f();
			this.aGranulePos9294 = null;
		}
		this.aTheoraInfo9284.f();
		this.aTheoraComment9296.f();
		this.aSetupInfo9285.f();
	}

	void method3074(OggPacket oggpacket, int i) {
		try {
			if (!this.aBoolean9293) {
				int i_0_ = (this.aSetupInfo9285.decodeHeader(this.aTheoraInfo9284, this.aTheoraComment9296, oggpacket));
				if (0 == i_0_) {
					this.aBoolean9293 = true;
					if ((this.aTheoraInfo9284.frameWidth) > 2048 || (this.aTheoraInfo9284.frameHeight) > 1024)
						throw new IllegalStateException();
					this.aDecoderContext9288 = new DecoderContext((this.aTheoraInfo9284), (this.aSetupInfo9285));
					this.aGranulePos9294 = new GranulePos();
					this.aFrame9290 = new Frame((this.aTheoraInfo9284.frameWidth), (this.aTheoraInfo9284.frameHeight));
					this.anInt9295 = this.aDecoderContext9288.getMaxPostProcessingLevel() * 295322609;
					method3089((-2058603981 * this.anInt9291), (byte) 41);
				} else if (i_0_ < 0)
					throw new IllegalStateException(new StringBuilder().append("").append(i_0_).toString());
			} else {
				this.aLong9292 = TimeUtils.getTime() * 4704549656485466045L;
				int i_1_ = (this.aDecoderContext9288.decodePacketIn(oggpacket, this.aGranulePos9294));
				if (i_1_ < 0)
					throw new IllegalStateException(new StringBuilder().append("").append(i_1_).toString());
				this.aDecoderContext9288.granuleFrame(this.aGranulePos9294);
				this.aDouble9289 = (this.aDecoderContext9288.granuleTime(this.aGranulePos9294));
				if (this.aBoolean9297) {
					boolean bool = oggpacket.isKeyFrame() == 1;
					if (bool)
						this.aBoolean9297 = false;
					else
						return;
				}
				if (!this.aBoolean9283 || oggpacket.isKeyFrame() == 1) {
					if ((this.aDecoderContext9288.decodeFrame(this.aFrame9290)) != 0)
						throw new IllegalStateException(new StringBuilder().append("").append(i_1_).toString());
					this.aBoolean9299 = true;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajq.f(").append(')').toString());
		}
	}

	void method3089(int i, byte i_2_) {
		try {
			this.anInt9291 = -703457029 * i;
			if (this.aBoolean9293) {
				if (-2058603981 * this.anInt9291 > -42840815 * this.anInt9295)
					this.anInt9291 = this.anInt9295 * -679663701;
				if (-2058603981 * this.anInt9291 < 0)
					this.anInt9291 = 0;
				this.aDecoderContext9288.setPostProcessingLevel(-2058603981 * this.anInt9291);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ajq.q(").append(')').toString());
		}
	}

	void method3079() {
		if (this.aFrame9290 != null)
			this.aFrame9290.f();
		if (null != this.aDecoderContext9288) {
			this.aDecoderContext9288.f();
			this.aDecoderContext9288 = null;
		}
		if (null != this.aGranulePos9294) {
			this.aGranulePos9294.f();
			this.aGranulePos9294 = null;
		}
		this.aTheoraInfo9284.f();
		this.aTheoraComment9296.f();
		this.aSetupInfo9285.f();
	}

	void method3076(OggPacket oggpacket) {
		if (!this.aBoolean9293) {
			int i = (this.aSetupInfo9285.decodeHeader(this.aTheoraInfo9284, this.aTheoraComment9296, oggpacket));
			if (0 == i) {
				this.aBoolean9293 = true;
				if ((this.aTheoraInfo9284.frameWidth > 2048) || (this.aTheoraInfo9284.frameHeight) > 1024)
					throw new IllegalStateException();
				this.aDecoderContext9288 = new DecoderContext((this.aTheoraInfo9284), (this.aSetupInfo9285));
				this.aGranulePos9294 = new GranulePos();
				this.aFrame9290 = new Frame((this.aTheoraInfo9284.frameWidth), (this.aTheoraInfo9284.frameHeight));
				this.anInt9295 = this.aDecoderContext9288.getMaxPostProcessingLevel() * 295322609;
				method3089((-2058603981 * this.anInt9291), (byte) 95);
			} else if (i < 0)
				throw new IllegalStateException(new StringBuilder().append("").append(i).toString());
		} else {
			this.aLong9292 = TimeUtils.getTime() * 4704549656485466045L;
			int i = (this.aDecoderContext9288.decodePacketIn(oggpacket, this.aGranulePos9294));
			if (i < 0)
				throw new IllegalStateException(new StringBuilder().append("").append(i).toString());
			this.aDecoderContext9288.granuleFrame(this.aGranulePos9294);
			this.aDouble9289 = (this.aDecoderContext9288.granuleTime(this.aGranulePos9294));
			if (this.aBoolean9297) {
				boolean bool = oggpacket.isKeyFrame() == 1;
				if (bool)
					this.aBoolean9297 = false;
				else
					return;
			}
			if (!this.aBoolean9283 || oggpacket.isKeyFrame() == 1) {
				if (this.aDecoderContext9288.decodeFrame(this.aFrame9290) != 0)
					throw new IllegalStateException(new StringBuilder().append("").append(i).toString());
				this.aBoolean9299 = true;
			}
		}
	}

	public static boolean method3090(int cutsceneID) {
			if (Class87.cutsceneID * 296787703 != cutsceneID || null == Class118.aClass88_1402) {
				Class87.reset();
				Class118.aClass88_1402 = Class88.aClass88_808;
				Class87.cutsceneID = -1692564793 * cutsceneID;
			}
			if (Class118.aClass88_1402 == Class88.aClass88_808) {
				byte[] data = Js5List.JS5_CUTSCENES.get(cutsceneID);
				if (data == null)
					return false;
				Buffer buffer = new Buffer(data);
				Class87.method4125(buffer);
				int i_4_ = buffer.readUByte();
				for (int index = 0; index < i_4_; index++)
					Class87.aClass453_799.pushBack(new Class298_Sub7(buffer));
				int i_6_ = buffer.readUnsignedSmart();
				Class87.aClass75Array805 = new Class75[i_6_];
				for (int index = 0; index < i_6_; index++)
					Class87.aClass75Array805[index] = new Class75(buffer);
				int i_8_ = buffer.readUnsignedSmart();
				Class87.aClass94Array794 = new Class94[i_8_];
				for (int index = 0; index < i_8_; index++)
					Class87.aClass94Array794[index] = new Class94(buffer, index);
				int i_10_ = buffer.readUnsignedSmart();
				Class87.aClass86Array798 = new HslUtils[i_10_];
				for (int index = 0; index < i_10_; index++)
					Class87.aClass86Array798[index] = new HslUtils(buffer);
				int i_12_ = buffer.readUnsignedSmart();
				Class87.aClass80Array795 = new Class80[i_12_];
				for (int index = 0; index < i_12_; index++)
					Class87.aClass80Array795[index] = new Class80(buffer);
				int i_14_ = buffer.readUnsignedSmart();
				Class87.aClass82Array797 = new Class82[i_14_];
				for (int index = 0; index < i_14_; index++)
					Class87.aClass82Array797[index] = Class161_Sub1_Sub1.method1740(buffer);
				Class118.aClass88_1402 = Class88.aClass88_809;
			}
			if (Class118.aClass88_1402 == Class88.aClass88_809) {
				boolean bool = true;
				Class94[] class94s = Class87.aClass94Array794;
				for (int index = 0; index < class94s.length; index++) {
					Class94 class94 = class94s[index];
					if (!class94.method1019())
						bool = false;
				}
				Class82[] class82s = Class87.aClass82Array797;
				for (int index = 0; index < class82s.length; index++) {
					Class82 class82 = class82s[index];
					if (!class82.method870())
						bool = false;
				}
				HslUtils[] class86s = Class87.aClass86Array798;
				for (int index = 0; index < class86s.length; index++) {
					HslUtils class86 = class86s[index];
					if (!class86.method960())
						bool = false;
				}
				if (!bool)
					return false;
				Class118.aClass88_1402 = Class88.aClass88_807;
			}
			return true;
	}
}
