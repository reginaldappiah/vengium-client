package com.jagex;/* Class298_Sub44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.ConfigType;
import com.jagex.utils.StringUtils;
import jaclib.hardware_info.HardwareInfo;

import java.util.HashMap;

public class Class298_Sub44 extends Node {
	int cpuCoreCount;
	static int anInt7467 = 3;
	static int anInt7468 = 4;
	int maximumMemory;
	public static int anInt7470 = 0;
	int osType;
	static int anInt7472 = 5;
	static int anInt7473 = 1;
	static int anInt7474 = 2;
	static int anInt7475 = 3;
	static int anInt7476 = 3;
	static int anInt7477 = 2;
	static int anInt7478 = 4;
	static int anInt7479 = 7;
	static int anInt7480 = 8;
	static int anInt7481 = 6;
	String aString7482;
	static int anInt7483 = 21;
	static int anInt7484 = 22;
	static int anInt7485 = 23;
	int osVersion;
	static int anInt7487 = 1;
	static int anInt7488 = 9;
	int cpuInfo;
	static int anInt7490 = 4;
	int javaVendor;
	public int javaVersion;
	int javaSubVersion;
	public int javaSubSubVersion;
	boolean aBoolean7495;
	String cpuType;
	static int anInt7497 = 0;
	int cpuAvailbleThreads;
	static int anInt7499 = 20;
	static int anInt7500 = 2;
	int cpuClockSpeed1;
	String aString7502;
	String aString7503;
	static int anInt7504 = 1;
	String aString7505;
	int directXDriverData2;
	int directXDriverDate;
	static int anInt7508 = 6;
	boolean osBitAddress;
	public int cpuClockSpeed;
	String cpuData;
	int[] anIntArray7512 = new int[3];
	int anInt7513;

	void method3528(int i) {
		try {
			if (this.aString7502.length() > 40)
				this.aString7502 = this.aString7502.substring(0, 40);
			if (this.aString7503.length() > 40)
				this.aString7503 = this.aString7503.substring(0, 40);
			if (this.aString7482.length() > 10)
				this.aString7482 = this.aString7482.substring(0, 10);
			if (this.aString7505.length() > 10)
				this.aString7505 = this.aString7505.substring(0, 10);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("acc.a(").append(')').toString());
		}
	}

	public void writeMachineInformation(Buffer buffer) {
		try {
			buffer.writeByte(6);
			buffer.writeByte((this.osType * -1570985485));
			buffer.writeByte((this.osBitAddress ? 1 : 0));
			buffer.writeByte((-1414570243 * this.osVersion));
			buffer.writeByte((this.javaVendor * 43286197));
			buffer.writeByte(javaVersion * 154600941);
			buffer.writeByte((-1529246497 * this.javaSubVersion));
			buffer.writeByte(javaSubSubVersion * 1324779323);
			buffer.writeByte((this.aBoolean7495 ? 1 : 0));
			buffer.writeShort((this.maximumMemory * -2088235843));
			buffer.writeByte((-1837764033 * this.cpuAvailbleThreads));
			buffer.putTriByte(399637415 * cpuClockSpeed);
			buffer.writeShort((-1360789919 * this.cpuClockSpeed1));
			buffer.putJagString(this.aString7502); // Empty
			buffer.putJagString(this.aString7503); // Empty
			buffer.putJagString(this.aString7482); // Empty
			buffer.putJagString(this.aString7505); // Empty
			buffer.writeByte((this.directXDriverDate * 1183412533));
			buffer.writeShort((-669549295 * this.directXDriverData2));
			buffer.putJagString(this.cpuType);
			buffer.putJagString(this.cpuData);
			buffer.writeByte((78038867 * this.cpuCoreCount));
			buffer.writeByte((this.cpuInfo * 664924581));
			for (int i_0_ = 0; i_0_ < this.anIntArray7512.length; i_0_++) {
				buffer.writeInt((this.anIntArray7512[i_0_]));
			}
			buffer.writeInt((-277721711 * this.anInt7513));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("acc.f(").append(')').toString());
		}
	}

	public int getEncodedSize() {
		try {
			int i_1_ = 38;
			i_1_ += StringUtils.addLengthByTwo(this.aString7502);
			i_1_ += StringUtils.addLengthByTwo(this.aString7503);
			i_1_ += StringUtils.addLengthByTwo(this.aString7482);
			i_1_ += StringUtils.addLengthByTwo(this.aString7505);
			i_1_ += StringUtils.addLengthByTwo(this.cpuType);
			i_1_ += StringUtils.addLengthByTwo(this.cpuData);
			return i_1_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("acc.b(").append(')').toString());
		}
	}

	public Class298_Sub44(boolean bool) {
		if (bool) {
			if (Class82_Sub8.operatingSystem.startsWith("win"))
				this.osType = -1323296965;
			else if (Class82_Sub8.operatingSystem.startsWith("mac"))
				this.osType = 1648373366;
			else if (Class82_Sub8.operatingSystem.startsWith("linux"))
				this.osType = 325076401;
			else
				this.osType = -998220564;
            this.osBitAddress = Class344.aString3687.startsWith("amd64") || Class344.aString3687.startsWith("x86_64");
			if (1 == -1570985485 * this.osType) {
				if (Class250.aString2765.indexOf("4.0") != -1)
					this.osVersion = 1791241813;
				else if (Class250.aString2765.indexOf("4.1") != -1)
					this.osVersion = -712483670;
				else if (Class250.aString2765.indexOf("4.9") != -1)
					this.osVersion = 1078758143;
				else if (Class250.aString2765.indexOf("5.0") != -1)
					this.osVersion = -1424967340;
				else if (Class250.aString2765.indexOf("5.1") != -1)
					this.osVersion = 366274473;
				else if (Class250.aString2765.indexOf("5.2") != -1)
					this.osVersion = 1445032616;
				else if (Class250.aString2765.indexOf("6.0") != -1)
					this.osVersion = -2137451010;
				else if (Class250.aString2765.indexOf("6.1") != -1)
					this.osVersion = -346209197;
				else if (Class250.aString2765.indexOf("6.2") != -1)
					this.osVersion = -1058692867;
			} else if (2 == this.osType * -1570985485) {
				if (Class250.aString2765.indexOf("10.4") != -1)
					this.osVersion = 1465097892;
				else if (Class250.aString2765.indexOf("10.5") != -1)
					this.osVersion = -1038627591;
				else if (Class250.aString2765.indexOf("10.6") != -1)
					this.osVersion = 752614222;
				else if (Class250.aString2765.indexOf("10.7") != -1)
					this.osVersion = -1751111261;
			}
			if (Class350.aString3759.toLowerCase().indexOf("sun") != -1)
				this.javaVendor = 953745309;
			else if (Class350.aString3759.toLowerCase().indexOf("microsoft") != -1)
				this.javaVendor = 1907490618;
			else if (Class350.aString3759.toLowerCase().indexOf("apple") != -1)
				this.javaVendor = -1433731369;
			else
				this.javaVendor = -479986060;
			int i = 2;
			int i_2_ = 0;
			try {
				for (/**/; i < ConfigType.aString1462.length(); i++) {
					int i_3_ = ConfigType.aString1462.charAt(i);
					if (i_3_ < 48 || i_3_ > 57)
						break;
					i_2_ = i_3_ - 48 + i_2_ * 10;
				}
			} catch (Exception exception) {
				/* empty */
			}
			javaVersion = i_2_ * 1984962533;
			i = ConfigType.aString1462.indexOf('.', 2) + 1;
			i_2_ = 0;
			try {
				for (/**/; i < ConfigType.aString1462.length(); i++) {
					int i_4_ = ConfigType.aString1462.charAt(i);
					if (i_4_ < 48 || i_4_ > 57)
						break;
					i_2_ = i_4_ - 48 + 10 * i_2_;
				}
			} catch (Exception exception) {
				/* empty */
			}
			this.javaSubVersion = i_2_ * 1167404831;
			i = ConfigType.aString1462.indexOf('_', 4) + 1;
			i_2_ = 0;
			try {
				for (/**/; i < ConfigType.aString1462.length(); i++) {
					int i_5_ = ConfigType.aString1462.charAt(i);
					if (i_5_ < 48 || i_5_ > 57)
						break;
					i_2_ = i_2_ * 10 + (i_5_ - 48);
				}
			} catch (Exception exception) {
				/* empty */
			}
			javaSubSubVersion = -796083725 * i_2_;
			this.aBoolean7495 = false;
			this.maximumMemory = GameShell.maximumMemory * -633367115;
			if (154600941 * javaVersion > 3)
				this.cpuAvailbleThreads = GameShell.availableCPU * -1360223467;
			else
				this.cpuAvailbleThreads = 0;
			try {
				int[] is = HardwareInfo.getCPUInfo();
				if (is != null && 3 == is.length) {
					this.cpuCoreCount = is[0] * 672863451;
					this.cpuClockSpeed1 = is[1] * -1283906143;
					cpuClockSpeed = is[2] * -108594153;
				}
				int[] is_6_ = HardwareInfo.getRawCPUInfo();
				if (is_6_ != null && is_6_.length % 5 == 0) {
					HashMap hashmap = new HashMap();
					for (int i_7_ = 0; i_7_ < is_6_.length / 5; i_7_++) {
						int i_8_ = is_6_[i_7_ * 5];
						int i_9_ = is_6_[5 * i_7_ + 1];
						int i_10_ = is_6_[2 + i_7_ * 5];
						int i_11_ = is_6_[i_7_ * 5 + 3];
						int i_12_ = is_6_[4 + i_7_ * 5];
						Class472 class472 = new Class472(i_8_, i_9_, i_10_, i_11_, i_12_);
						hashmap.put(Integer.valueOf(i_8_), class472);
					}
					Class472 class472 = (Class472) hashmap.get(Integer.valueOf(0));
					if (null != class472) {
						Buffer class298_sub53 = new Buffer(13);
						class298_sub53.writeLEInt((-2056580217 * (class472.anInt5960)));
						class298_sub53.writeLEInt((272393713 * (class472.anInt5964)));
						class298_sub53.writeLEInt((634425393 * (class472.anInt5963)));
						class298_sub53.offset = 0;
						this.cpuType = class298_sub53.readString();
					}
					Class472 class472_13_ = (Class472) hashmap.get(Integer.valueOf(1));
					if (null != class472_13_) {
						this.anInt7513 = (-1193649755 * class472_13_.anInt5961);
						int i_14_ = (class472_13_.anInt5960 * -2056580217);
						this.cpuInfo = -1403810259 * (i_14_ >> 16 & 0xff);
						this.anIntArray7512[0] = class472_13_.anInt5963 * 634425393;
						this.anIntArray7512[1] = 272393713 * class472_13_.anInt5964;
					}
					Class472 class472_15_ = (Class472) hashmap.get(Integer.valueOf(-2147483647));
					if (class472_15_ != null)
						this.anIntArray7512[2] = 272393713 * class472_15_.anInt5964;
					Buffer class298_sub53 = new Buffer(49);
					for (int i_16_ = -2147483646; i_16_ <= -2147483644; i_16_++) {
						Class472 class472_17_ = (Class472) hashmap.get(Integer.valueOf(i_16_));
						if (null != class472_17_) {
							class298_sub53.writeLEInt((class472_17_.anInt5961 * 1461544821));
							class298_sub53.writeLEInt((-2056580217 * (class472_17_.anInt5960)));
							class298_sub53.writeLEInt((class472_17_.anInt5963 * 634425393));
							class298_sub53.writeLEInt((272393713 * (class472_17_.anInt5964)));
						}
					}
					class298_sub53.offset = 0;
					this.cpuData = class298_sub53.readString();
				}
				String[][] strings = HardwareInfo.getDXDiagDisplayDevicesProps();
				if (null != strings && strings.length > 0 && null != strings[0]) {
					for (int i_18_ = 0; i_18_ < strings[0].length; i_18_ += 2) {
						if (strings[0][i_18_].equalsIgnoreCase("szDescription"))
							this.aString7502 = strings[0][i_18_ + 1];
						else if (strings[0][i_18_].equalsIgnoreCase("szDriverDateEnglish")) {
							String string = strings[0][i_18_ + 1];
							try {
								int i_19_ = string.indexOf("/");
								int i_20_ = string.indexOf("/", 1 + i_19_);
								this.directXDriverDate = ((Integer.parseInt(string.substring(0, i_19_))) * 1759516957);
								this.directXDriverData2 = ((Integer.parseInt(string.substring(1 + i_20_, string.indexOf(" ", i_20_)))) * -1242885135);
							} catch (Exception exception) {
								/* empty */
							}
						}
					}
				}
				String[] strings_21_ = HardwareInfo.getDXDiagSystemProps();
				if (strings_21_ != null) {
					String string = "";
					String string_22_ = "";
					String string_23_ = "";
					for (int i_24_ = 0; i_24_ < strings_21_.length; i_24_ += 2) {
						if (strings_21_[i_24_].equalsIgnoreCase("dwDirectXVersionMajor"))
							string = strings_21_[1 + i_24_];
						else if (strings_21_[i_24_].equalsIgnoreCase("dwDirectXVersionMinor"))
							string_22_ = strings_21_[1 + i_24_];
						else if (strings_21_[i_24_].equalsIgnoreCase("dwDirectXVersionLetter"))
							string_23_ = strings_21_[1 + i_24_];
					}
					this.aString7482 = new StringBuilder().append(string).append(".").append(string_22_).append(string_23_).toString();
				}
			} catch (Throwable throwable) {
				cpuClockSpeed = 0;
			}
		}
		if (this.aString7502 == null)
			this.aString7502 = "";
		if (null == this.aString7503)
			this.aString7503 = "";
		if (null == this.aString7482)
			this.aString7482 = "";
		if (null == this.aString7505)
			this.aString7505 = "";
		if (this.cpuType == null)
			this.cpuType = "";
		if (this.cpuData == null)
			this.cpuData = "";
		method3528(1932457780);
	}

	static Class459[] method3531(byte i) {
		try {
			return (new Class459[] { Class459.aClass459_5672, Class459.aClass459_5671, Class459.aClass459_5670 });
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("acc.a(").append(')').toString());
		}
	}
}
