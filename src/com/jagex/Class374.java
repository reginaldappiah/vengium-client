package com.jagex;/* Class374 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public abstract class Class374 {
	int anInt4073;
	Class453 aClass453_4074 = new Class453();
	long aLong4075;
	long aLong4076 = -3541606857845020581L;
	int anInt4077;
	public static int[] interfaceGCValue;

	void method4614() {
		try {
			this.aClass453_4074.clean();
			this.aLong4076 = -3541606857845020581L;
			this.aLong4075 = -142159167877835417L;
			this.anInt4073 = 570832405;
			this.anInt4077 = -1631848437;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("po.f(").append(')').toString());
		}
	}

	int method4615(MouseRecord class298_sub50, int i, byte i_0_) {
		try {
			long l;
			if (-1L == this.aLong4076 * 2660634464725530669L)
				l = (long) i;
			else {
				l = (class298_sub50.getTimeMs() - 2660634464725530669L * this.aLong4076);
				if (l > (long) i)
					l = (long) i;
			}
			this.aLong4076 = class298_sub50.getTimeMs() * 3541606857845020581L;
			return (int) l;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("po.p(").append(')').toString());
		}
	}

	abstract int method4616(int i);

	abstract void method4617(Buffer class298_sub53, MouseRecord class298_sub50, byte i);

	abstract void method4618(byte i);

	abstract boolean method4619(int i);

	void method4620(MouseRecord record) {
			this.aClass453_4074.pushBack(record);
	}

	void method4626(int i) {
		try {
			if (method4619(-304373014)) {
				OutgoingPacketBuffer outgoingPacketBuffer = null;
				int i_1_ = 0;
				int i_2_ = 0;
				int i_3_ = 0;
				Iterator iterator = this.aClass453_4074.iterator();
				while (iterator.hasNext()) {
					MouseRecord class298_sub50 = (MouseRecord) iterator.next();
					if (outgoingPacketBuffer != null && (385051775 * (outgoingPacketBuffer.payload.offset) - i_1_) >= 252 - (6 + method4616(-1861387813))) {
						if (i <= 775068819)
							throw new IllegalStateException();
						break;
					}
					class298_sub50.unlink();
					int i_4_ = class298_sub50.getMouseY();
					if (i_4_ < -1)
						i_4_ = -1;
					else if (i_4_ > 65534)
						i_4_ = 65534;
					int i_5_ = class298_sub50.getMouseX();
					if (i_5_ < -1)
						i_5_ = -1;
					else if (i_5_ > 65534)
						i_5_ = 65534;
					if (i_5_ == 954406595 * this.anInt4073 && -782291875 * this.anInt4077 == i_4_)
						class298_sub50.resizeCache();
					else {
						if (outgoingPacketBuffer == null) {
							outgoingPacketBuffer = method4633((byte) -59);
							outgoingPacketBuffer.payload.writeByte(0);
							i_1_ = 385051775 * (outgoingPacketBuffer.payload.offset);
							outgoingPacketBuffer.payload.offset += 232826622;
							i_2_ = 0;
							i_3_ = 0;
						}
						int i_6_;
						int i_7_;
						int i_8_;
						if (-1L != (this.aLong4075 * 8383148474145196457L)) {
							i_6_ = (i_5_ - this.anInt4073 * 954406595);
							i_7_ = i_4_ - (-782291875 * this.anInt4077);
							i_8_ = (int) ((class298_sub50.getTimeMs() - (8383148474145196457L * this.aLong4075)) / 20L);
							i_2_ += (class298_sub50.getTimeMs() - (this.aLong4075 * 8383148474145196457L)) % 20L;
						} else {
							i_6_ = i_5_;
							i_7_ = i_4_;
							i_8_ = 2147483647;
						}
						this.anInt4073 = -570832405 * i_5_;
						this.anInt4077 = i_4_ * 1631848437;
						if (i_8_ < 8 && i_6_ >= -32 && i_6_ <= 31 && i_7_ >= -32 && i_7_ <= 31) {
							i_6_ += 32;
							i_7_ += 32;
							outgoingPacketBuffer.payload.writeShort(i_7_ + ((i_6_ << 6) + (i_8_ << 12)));
						} else if (i_8_ < 32 && i_6_ >= -128 && i_6_ <= 127 && i_7_ >= -128 && i_7_ <= 127) {
							i_6_ += 128;
							i_7_ += 128;
							outgoingPacketBuffer.payload.writeByte(128 + i_8_);
							outgoingPacketBuffer.payload.writeShort((i_6_ << 8) + i_7_);
						} else if (i_8_ < 32) {
							outgoingPacketBuffer.payload.writeByte(i_8_ + 192);
							if (-1 == i_5_ || -1 == i_4_)
								outgoingPacketBuffer.payload.writeInt(-2147483648);
							else
								outgoingPacketBuffer.payload.writeInt(i_5_ | i_4_ << 16);
						} else {
							outgoingPacketBuffer.payload.writeShort((i_8_ & 0x1fff) + 57344);
							if (i_5_ == -1 || i_4_ == -1)
								outgoingPacketBuffer.payload.writeInt(-2147483648);
							else
								outgoingPacketBuffer.payload.writeInt(i_5_ | i_4_ << 16);
						}
						i_3_++;
						method4617(outgoingPacketBuffer.payload, class298_sub50, (byte) 0);
						this.aLong4075 = (class298_sub50.getTimeMs() * 142159167877835417L);
						class298_sub50.resizeCache();
					}
				}
				if (outgoingPacketBuffer != null) {
					outgoingPacketBuffer.payload.method3649(385051775 * (outgoingPacketBuffer.payload.offset) - i_1_);
					int i_9_ = 385051775 * (outgoingPacketBuffer.payload.offset);
					outgoingPacketBuffer.payload.offset = i_1_ * 116413311;
					outgoingPacketBuffer.payload.writeByte(i_2_ / i_3_);
					outgoingPacketBuffer.payload.writeByte(i_2_ % i_3_);
					outgoingPacketBuffer.payload.offset = 116413311 * i_9_;
					ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
				}
			}
			method4618((byte) 1);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("po.a(").append(')').toString());
		}
	}

	Class374() {
		this.aLong4075 = -142159167877835417L;
		this.anInt4073 = 570832405;
		this.anInt4077 = -1631848437;
	}

	abstract OutgoingPacketBuffer method4633(byte i);

	static final void method4636(ScriptRuntime runtime) {
		try {
			int i_10_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (int) (Math.random() * (double) i_10_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("po.yq(").append(')').toString());
		}
	}

	static final void method4637(ScriptRuntime class403, int i) {
		try {
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = class403.clanChannelChat.minimumRankToKick;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("po.xq(").append(')').toString());
		}
	}

	static final void method4638(ScriptRuntime class403, short i) {
		try {
			IComponentScripter IComponentScripter = (class403.currentInstrBool ? class403.aIComponentScripter_5247 : class403.aIComponentScripter_5246);
			IComponentDefinition class105 = IComponentScripter.componentDefinition;
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
			Class241.method2247(class105, IComponentDefinitionCollection, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("po.eg(").append(')').toString());
		}
	}
}
