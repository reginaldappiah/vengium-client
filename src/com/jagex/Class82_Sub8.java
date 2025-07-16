package com.jagex;/* Class82_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.network.OutgoingPacket;
import com.jagex.utils.TimeUtils;

public class Class82_Sub8 extends Class82 {
	long key;
	int capacity;
	public static SpriteToolkit aClass57_6855;
	public static String operatingSystem;

	public void method866() {
		try {
			IntNode class298_sub35 = ((IntNode) Class87.linkedList.get(8017746467363524815L * (this.key)));
			if (class298_sub35 != null)
				class298_sub35.capacity = -1178949921 * this.capacity;
			else
				Class87.linkedList.connect(new IntNode(825940513 * this.capacity), this.key * 8017746467363524815L);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("xq.f(").append(')').toString());
		}
	}

	public void method868() {
		IntNode class298_sub35 = ((IntNode) Class87.linkedList.get(8017746467363524815L * (this.key)));
		if (class298_sub35 != null)
			class298_sub35.capacity = -1178949921 * this.capacity;
		else
			Class87.linkedList.connect(new IntNode(825940513 * this.capacity), this.key * 8017746467363524815L);
	}

	Class82_Sub8(Buffer buffer, boolean bool) {
		super(buffer);
		int i = buffer.readUShort();
		if (bool)
			this.key = (0x100000000L | (long) i) * -3845001125918771665L;
		else
			this.key = (long) i * -3845001125918771665L;
		this.capacity = buffer.readInt() * -914937375;
	}

	public void method869() {
		IntNode class298_sub35 = ((IntNode) Class87.linkedList.get(8017746467363524815L * (this.key)));
		if (class298_sub35 != null)
			class298_sub35.capacity = -1178949921 * this.capacity;
		else
			Class87.linkedList.connect(new IntNode(825940513 * this.capacity), this.key * 8017746467363524815L);
	}

	static final void method892(ScriptRuntime class403, byte i) {
		try {
			int i_0_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_0_);
			Class239.method2209(class105, class403, (byte) 24);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("xq.qw(").append(')').toString());
		}
	}

	public static void deactivateComponents(int interfaceID) {
			IComponentDefinition.interfaceComponentsExists[interfaceID] = false;
			IComponentDefinition.deactiveInterface(interfaceID);
	}

	static final void method894(ScriptRuntime class403, int i) {
		try {
			int i_2_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.desiredToolkit.getSupport(i_2_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("xq.aoh(").append(')').toString());
		}
	}

	static void method896(int i, int i_5_, int i_6_, int i_7_, boolean bool, int i_8_) {
		try {
			long l = (long) (i | (bool ? -2147483648 : 0));
			Class298_Sub9 class298_sub9 = (Class298_Sub9) Class298_Sub9.aClass437_7224.get(l);
			if (class298_sub9 == null) {
				class298_sub9 = new Class298_Sub9();
				Class298_Sub9.aClass437_7224.connect(class298_sub9, l);
			}
			if (class298_sub9.anIntArray7226.length <= i_5_) {
				int[] is = new int[i_5_ + 1];
				int[] is_9_ = new int[i_5_ + 1];
				for (int i_10_ = 0; (i_10_ < class298_sub9.anIntArray7226.length); i_10_++) {
					is[i_10_] = (class298_sub9.anIntArray7226[i_10_]);
					is_9_[i_10_] = (class298_sub9.anIntArray7227[i_10_]);
				}
				for (int i_11_ = (class298_sub9.anIntArray7226).length; i_11_ < i_5_; i_11_++) {
					is[i_11_] = -1;
					is_9_[i_11_] = 0;
				}
				class298_sub9.anIntArray7226 = is;
				class298_sub9.anIntArray7227 = is_9_;
			}
			class298_sub9.anIntArray7226[i_5_] = i_6_;
			class298_sub9.anIntArray7227[i_5_] = i_7_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("xq.d(").append(')').toString());
		}
	}

	static final void method897(ScriptRuntime class403, byte i) {
		try {
			if (-1233866115 * GameClient.gameState != 14 || Class315.method3837())
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = 1;
			else if (Class474.aBoolean5974)
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = 0;
			else if (ConfigDefinitions.time * -247648477838985581L > TimeUtils.getTime() - 1000L)
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = 1;
			else {
				Class474.aBoolean5974 = true;
				OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.aClass198_2071, ConnectionType.lobbyConnection.encryptor);
				outgoingPacketBuffer.payload.writeInt(-1351839083 * Class117.anInt1399);
				ConnectionType.lobbyConnection.sendFrame(outgoingPacketBuffer);
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("xq.alo(").append(')').toString());
		}
	}
}
