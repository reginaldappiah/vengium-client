package com.jagex;/* Class249 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.settings.ScreenSizeSetting;

import static com.jagex.game.cache.definition.script.InstructionConstants.RESET_CAMERA;

public class ScriptInstructions implements MaterialRawLoader {
	Js5FileSystem aClass243_6460;
	Js5FileSystem aClass243_6461;
	Class53[] aClass53Array6462;
	int anInt6463;
	Class354 aClass354_6464 = new Class354(256);
	public static int anInt6465;

    public int method177(int i) {
		try {
			return this.anInt6463 * -1882566529;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kk.a(").append(')').toString());
		}
	}

	public void method176(int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kk.d(").append(')').toString());
		}
	}

	public Class53 method174(int i) {
		try {
			return this.aClass53Array6462[i];
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kk.k(").append(')').toString());
		}
	}

	public ScriptInstructions(Js5FileSystem class243, Js5FileSystem class243_3_, Js5FileSystem class243_4_) {
		this.aClass243_6461 = class243_3_;
		this.aClass243_6460 = class243_4_;
		Buffer buffer = new Buffer(class243.getFileFromArchive(0, 0));
		this.anInt6463 = buffer.readUShort() * 12939135;
		this.aClass53Array6462 = new Class53[this.anInt6463 * -1882566529];
		for (int i = 0; i < -1882566529 * this.anInt6463; i++) {
			if (buffer.readUByte() == 1)
				this.aClass53Array6462[i] = new Class53();
		}
		for (int i = 0; i < this.anInt6463 * -1882566529; i++) {
			if (this.aClass53Array6462[i] != null)
				this.aClass53Array6462[i].aBoolean524 = buffer.readUByte() == 0;
		}
		for (int i = 0; i < -1882566529 * this.anInt6463; i++) {
			if (this.aClass53Array6462[i] != null)
				this.aClass53Array6462[i].aBoolean518 = buffer.readUByte() == 1;
		}
		for (int i = 0; i < this.anInt6463 * -1882566529; i++) {
			if (null != this.aClass53Array6462[i])
				this.aClass53Array6462[i].aBoolean538 = buffer.readUByte() == 1;
		}
		for (int i = 0; i < this.anInt6463 * -1882566529; i++) {
			if (null != this.aClass53Array6462[i])
				this.aClass53Array6462[i].aByte534 = buffer.readByte();
		}
		for (int i = 0; i < this.anInt6463 * -1882566529; i++) {
			if (this.aClass53Array6462[i] != null)
				this.aClass53Array6462[i].aByte533 = buffer.readByte();
		}
		for (int i = 0; i < this.anInt6463 * -1882566529; i++) {
			if (null != this.aClass53Array6462[i])
				this.aClass53Array6462[i].aByte529 = buffer.readByte();
		}
		for (int i = 0; i < -1882566529 * this.anInt6463; i++) {
			if (null != this.aClass53Array6462[i])
				this.aClass53Array6462[i].aByte536 = buffer.readByte();
		}
		for (int i = 0; i < this.anInt6463 * -1882566529; i++) {
			if (null != this.aClass53Array6462[i])
				this.aClass53Array6462[i].aShort532 = (short) buffer.readUShort();
		}
		for (int i = 0; i < this.anInt6463 * -1882566529; i++) {
			if (this.aClass53Array6462[i] != null)
				this.aClass53Array6462[i].aByte535 = buffer.readByte();
		}
		for (int i = 0; i < this.anInt6463 * -1882566529; i++) {
			if (null != this.aClass53Array6462[i])
				this.aClass53Array6462[i].aByte509 = buffer.readByte();
		}
		for (int i = 0; i < -1882566529 * this.anInt6463; i++) {
			if (this.aClass53Array6462[i] != null)
				this.aClass53Array6462[i].aBoolean527 = buffer.readUByte() == 1;
		}
		for (int i = 0; i < -1882566529 * this.anInt6463; i++) {
			if (this.aClass53Array6462[i] != null)
				this.aClass53Array6462[i].aBoolean544 = buffer.readUByte() == 1;
		}
		for (int i = 0; i < -1882566529 * this.anInt6463; i++) {
			if (null != this.aClass53Array6462[i])
				this.aClass53Array6462[i].aByte537 = buffer.readByte();
		}
		for (int i = 0; i < this.anInt6463 * -1882566529; i++) {
			if (null != this.aClass53Array6462[i])
				this.aClass53Array6462[i].aBoolean540 = buffer.readUByte() == 1;
		}
		for (int i = 0; i < this.anInt6463 * -1882566529; i++) {
			if (null != this.aClass53Array6462[i])
				this.aClass53Array6462[i].aBoolean541 = buffer.readUByte() == 1;
		}
		for (int i = 0; i < -1882566529 * this.anInt6463; i++) {
			if (this.aClass53Array6462[i] != null)
				this.aClass53Array6462[i].aBoolean543 = buffer.readUByte() == 1;
		}
		for (int i = 0; i < this.anInt6463 * -1882566529; i++) {
			if (null != this.aClass53Array6462[i])
				this.aClass53Array6462[i].anInt519 = buffer.readUByte() * -39200327;
		}
		for (int i = 0; i < this.anInt6463 * -1882566529; i++) {
			if (this.aClass53Array6462[i] != null)
				this.aClass53Array6462[i].anInt531 = buffer.readInt() * -946109519;
		}
		for (int i = 0; i < -1882566529 * this.anInt6463; i++) {
			if (this.aClass53Array6462[i] != null)
				this.aClass53Array6462[i].anInt528 = buffer.readUByte() * 980235301;
		}
	}

	public int[] method171(int i, float f, int i_5_, int i_6_, boolean bool, int i_7_) {
		try {
			int[] is = (method2390(i).method3423(this.aClass243_6460, this, (double) f, i_5_, i_6_, bool, this.aClass53Array6462[i].aBoolean544, -1817838295));
			return is;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kk.b(").append(')').toString());
		}
	}

	public int[] method172(int i, float f, int i_8_, int i_9_, boolean bool, byte i_10_) {
		try {
			int[] is = (method2390(i).method3421(this.aClass243_6460, this, (double) f, i_8_, i_9_, this.aClass53Array6462[i].aBoolean544, -524170328));
			return is;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kk.p(").append(')').toString());
		}
	}

	Class298_Sub37_Sub6 method2390(int i) {
		try {
			Cacheable class298_sub37 = this.aClass354_6464.retrieve((long) i);
			if (class298_sub37 != null)
				return (Class298_Sub37_Sub6) class298_sub37;
			byte[] is = this.aClass243_6461.get(i);
			if (null == is)
				return null;
			Class298_Sub37_Sub6 class298_sub37_sub6 = new Class298_Sub37_Sub6(new Buffer(is));
			this.aClass354_6464.add(class298_sub37_sub6, (long) i);
			return class298_sub37_sub6;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kk.w(").append(')').toString());
		}
	}

    public boolean method170(int i, short i_14_) {
		try {
			Class298_Sub37_Sub6 class298_sub37_sub6 = method2390(i);
			return (class298_sub37_sub6 != null && class298_sub37_sub6.method3420((this.aClass243_6460), this, (byte) -26));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kk.f(").append(')').toString());
		}
	}

    public float[] method181(int i, float f, int i_19_, int i_20_, boolean bool, byte i_21_) {
		try {
			float[] fs = (method2390(i).method3422(this.aClass243_6460, this, i_19_, i_20_, this.aClass53Array6462[i].aBoolean544, -1481337578));
			return fs;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kk.i(").append(')').toString());
		}
	}

    static final void negate(ScriptRuntime runtime) {
			runtime.objectArgs -= 969361751;
	}

	static void method2391(Buffer class298_sub53, int i) {
		try {
			if (null != GameShell.aBufferedFile_6499) {
				try {
					GameShell.aBufferedFile_6499.seek(0L);
					GameShell.aBufferedFile_6499.method6134((class298_sub53.buffer), i, 24);
				} catch (Exception exception) {
					/* empty */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kk.s(").append(')').toString());
		}
	}

	static final void scriptInsturctions(CS2Instruction instruction, ScriptRuntime runtime) {
		switch (-2008816077 * instruction.opcode) {
		case 76:
			ToMoveScripts.setCameraRotation(runtime);
			break;
		case 934:
			Class330.method4002(runtime);
			break;
		case 480:
			Class195.method1872(runtime);
			break;
		case 711:
			Class256.method2443(runtime);
			break;
		case 916:
			Class274.method2568(runtime);
			break;
		case 941:
			Class298_Sub2.method2849(runtime);
			break;
		case 485:
			NodeCollection.method5974(runtime);
			break;
		case 868:
			ToMoveScripts.method2130(runtime);
			break;
		case 730:
			ToMoveIComponentScripts.method4099(runtime);
			break;
		case 85:
			ToMoveScripts.method4855(runtime);
			break;
		case 817:
			Class404.method4951(runtime);
			break;
		case 630:
			ToMoveScripts.method6316(runtime);
			break;
		case 20:
			ToMoveIComponentScripts.method1435(false, runtime);
			break;
		case 456:
			ToMoveIComponentScripts.method2596(runtime);
			break;
		case 869:
			StaticMethods.method5630(runtime);
			break;
		case 800:
			ToMoveScripts.setRoofSetting(runtime);
			break;
		case 663:
			Class335.method4085(runtime);
			break;
		case 771:
			Class170.method1813(runtime);
			break;
		case 961:
			ToMoveIComponentScripts.method6008(runtime);
			break;
		case 240:
			ToMoveScripts.method5867(runtime);
			break;
		case 305:
			ToMoveScripts.method1586(runtime);
			break;
		case 956:
			ToMoveIComponentScripts.method2726(runtime);
			break;
		case 694:
			ToMoveScripts.method1940(runtime);
			break;
		case 903:
			ToMoveIComponentScripts.method4137(runtime);
			break;
		case 592:
			ToMoveScripts.method1903(runtime);
			break;
		case 216:
			ToMoveIComponentScripts.method6266(runtime);
			break;
		case 571:
			Class427.method5749(runtime);
			break;
		case 599:
			Class231.method2134(runtime);
			break;
		case 16:
			ScreenSizeSetting.setFullscreen();
			break;
		case 43:
			Class298_Sub27.method3106(runtime);
			break;
		case 199:
			Class324.method3959(runtime);
			break;
		case 667:
			ToMoveIComponentScripts.RESET_HOOKS(runtime);
			break;
		case 49:
			Class173.method1825(runtime);
			break;
		case 338:
			Class75.method838(runtime);
			break;
		case 852:
			ToMoveScripts.method6362(runtime);
			break;
		case 696:
			ToMoveIComponentScripts.method2693(runtime);
			break;
		case 286:
			ToMoveScripts.method4870(runtime);
			break;
		case 736:
			Class194.method1869(runtime);
			break;
		case 109:
			ToMoveIComponentScripts.method540(runtime);
			break;
		case 614:
			ToMoveIComponentScripts.method366(runtime);
			break;
		case 992:
			ToMoveScripts.method2266(runtime);
			break;
		case 712:
			Class250.method2398(runtime);
			break;
		case 385:
			ToMoveScripts.method5671(runtime);
			break;
		case 881:
			Class23.method375(runtime);
			break;
		case 52:
			ToMoveScripts.getItemStatus(runtime);
			break;
		case 536:
			ToMoveIComponentScripts.method4488(runtime);
			break;
		case 105:
			ToMoveScripts.method4549(runtime);
			break;
		case 431:
			Class162.method1772(runtime);
			break;
		case 419:
			Class11.method327(runtime);
			break;
		case 53:
			ToMoveIComponentScripts.method5991(runtime);
			break;
		case 190:
			Class254.method2428(runtime);
			break;
		case 482:
			ToMoveScripts.method3901(runtime);
			break;
		case 150:
			Class410.method4983(runtime);
			break;
		case 168:
			Class82_Sub15.method914(runtime);
			break;
		case 669:
			ToMoveIComponentScripts.method3654(runtime);
			break;
		case 387:
			Class342.method4150(runtime);
			break;
		case 50:
			ToMoveIComponentScripts.method3801(runtime);
			break;
		case 39:
			Graphics.method614(runtime);
			break;
		case 432:
			Graphics.method618(runtime);
			break;
		case 612:
			Class12.method333(runtime);
			break;
		case 889:
			ToMoveScripts.method1943(runtime);
			break;
		case 884:
			Class148.method1613(runtime);
			break;
		case 527:
			ToMoveScripts.method4160(runtime);
			break;
		case 666:
			Class180.method1836(runtime);
			break;
		case 628:
			Class180.method1838(runtime);
			break;
		case 219:
			ToMoveScripts.method4198(runtime);
			break;
		case 317:
			Class296.method2833(runtime);
			break;
		case 689:
			ToMoveScripts.method4526(runtime);
			break;
		case 526:
			ToMoveScripts.method303(runtime);
			break;
		case 858:
			Class88.method978(runtime);
			break;
		case 253:
			ToMoveIComponentScripts.method2786(runtime);
			break;
		case 89:
			Class353.method4249(runtime);
			break;
		case 583:
			ToMoveScripts.method1593(runtime);
			break;
		case 780:
			Class261.method2464(runtime);
			break;
		case 814:
			Class152.method1653(runtime);
			break;
		case 84:
			ToMoveScripts.method2421(runtime);
			break;
		case 594:
			Class368.method4553(runtime);
			break;
		case 121:
			ToMoveScripts.isWaterDetailOn(runtime);
			break;
		case 344:
			ToMoveScripts.method712(runtime);
			break;
		case 110:
			ToMoveScripts.method4243(runtime);
			break;
		case 520:
			Class12.method335(runtime);
			break;
		case 638:
			Class365_Sub1_Sub5_Sub2.method4534(runtime);
			break;
		case 504:
			ToMoveScripts.method539(runtime);
			break;
		case 807:
			Class254.method2424(runtime);
			break;
		case 655:
			ToMoveIComponentScripts.method1956(runtime);
			break;
		case 48:
			ToMoveIComponentScripts.method3150(runtime);
			break;
		case 262:
			Class82_Sub9.method898(runtime);
			break;
		case 7:
			Class91.method998(runtime);
			break;
		case 636:
			Class133.method1483(runtime);
			break;
		case 668:
			Class178.method1834(runtime);
			break;
		case 81:
			Class257.method2454(runtime);
			break;
		case 330:
			ToMoveScripts.method4979(runtime);
			break;
		case 82:
			Class148.method1611(runtime);
			break;
		case 246:
			ToMoveScripts.method1590(runtime);
			break;
		case 567:
			ToMoveScripts.method4588(runtime);
			break;
		case 971:
			Class8.method316(runtime, (byte) -83);
			break;
		case 828:
			ToMoveScripts.method1277(runtime);
			break;
		case 417:
			Class90.method995(runtime, 610314);
			break;
		case 445:
			ToMoveIComponentScripts.method1068(runtime);
			break;
		case 26:
			ToMoveIComponentScripts.method4138(runtime);
			break;
		case 845:
			Class356.method4267(runtime, 423870940);
			break;
		case 981:
			ToMoveScripts.method2373(runtime);
			break;
		case 328:
			Class114.method1258(runtime);
			break;
		case 533:
			Class303.method3735(runtime, (byte) -1);
			break;
		case 74:
			Class188.method1850(runtime, -376889697);
			break;
		case 609:
			ToMoveScripts.method1946(runtime);
			break;
		case 587:
			Class109.method1156(runtime, (byte) 7);
			break;
		case 864:
			ToMoveScripts.getSceneCameraYaw(runtime);
			break;
		case 581:
			ToMoveScripts.method4124(runtime);
			break;
		case 278:
			ToMoveSettings.method4216();
			break;
		case 178:
			ToMoveIComponentScripts.method5803(runtime);
			break;
		case 784:
			ToMoveIComponentScripts.method1073(runtime);
			break;
		case 6:
			Class298_Sub32_Sub32.method3344(runtime, (byte) -4);
			break;
		case 147:
			Class522.method6327(runtime, -1778181559);
			break;
		case 596:
			ToMoveScripts.method1242(runtime);
			break;
		case 803:
			ToMoveScripts.method311(runtime);
			break;
		case 697:
			ToMoveScripts.method1892(runtime);
			break;
		case 401:
			Class11.method330(runtime, (byte) 8);
			break;
		case 887:
			ToMoveIComponentScripts.method1583(runtime);
			break;
		case 867:
			Class82_Sub19.method929(runtime, -2025451044);
			break;
		case 859:
			Class82_Sub18.method923(runtime);
			break;
		case 708:
			ToMoveIComponentScripts.method2493(runtime);
			break;
		case 326:
			ToMoveScripts.method2811(runtime);
			break;
		case 19:
			Class118.method1292(runtime, (byte) -21);
			break;
		case 186:
			Class83.method942(runtime, (byte) 68);
			break;
		case 293:
			Class230.method2126(runtime, 97341898);
			break;
		case 921:
			ToMoveIComponentScripts.method4297(runtime);
			break;
		case 463:
			ToMoveIComponentScripts.method3399(runtime);
			break;
		case 908:
			Class123.method1379(runtime, (byte) 0);
			break;
		case 707:
			ToMoveScripts.method4883(runtime);
			break;
		case 331:
			Class298_Sub14.method2908(runtime, (byte) -32);
			break;
		case 899:
			ToMoveScripts.method875(runtime);
			break;
		case 461:
			ToMoveIComponentScripts.method4675(runtime);
			break;
		case 647:
			ToMoveScripts.method713(runtime);
			break;
		case 603:
			ToMoveScripts.method6061(runtime);
			break;
		case 449:
			Class74.method828(runtime);
			break;
		case 776:
			ToMoveScripts.method2116(runtime);
			break;
		case 634:
			Class419.method5604(runtime, 1824559253);
			break;
		case 90:
			Heap.method3671(runtime, 629926500);
			break;
		case 444:
			ToMoveScripts.method4609(runtime);
			break;
		case 553:
			ToMoveIComponentScripts.method4298(runtime);
			break;
		case 31:
			Class136.method1501(runtime, (byte) 124);
			break;
		case 959:
			Class256.method2445(runtime, -1352744007);
			break;
		case 761:
			ToMoveScripts.method554(runtime);
			break;
		case 593:
			ToMoveIComponentScripts.method1316(runtime);
			break;
		case 774:
			Class309_Sub1.method3806(runtime, 223416426);
			break;
		case 695:
			ToMoveScripts.method1032(runtime);
			break;
		case 810:
			Class148.method1609(runtime, (byte) 9);
			break;
		case 640:
			Class336_Sub2.method4096(runtime, 857283388);
			break;
		case 54:
			ErrorReporter.method4170(runtime, (short) 8164);
			break;
		case 101:
			Class88.method975(runtime, 33554432);
			break;
		case 202:
			ToMoveScripts.method4140(runtime);
			break;
		case 184:
			Class18.method361(runtime);
			break;
		case 843:
			Class298_Sub40.method3513(runtime, (byte) 7);
			break;
		case 72:
			Class289.getClientScriptMap(runtime);
			break;
		case 706:
			ToMoveIComponentScripts.method6146(runtime);
			break;
		case 441:
			Class418.method5596(runtime, (byte) -98);
			break;
		case 854:
			Class69.method791(runtime);
			break;
		case 36:
			Class234.method2178(runtime, -1869876979);
			break;
		case 29:
			ToMoveScripts.method2003(runtime);
			break;
		case 497:
			ToMoveScripts.method4889(runtime);
			break;
		case 25:
			ToMoveScripts.method5704(runtime);
			break;
		case 532:
			ToMoveScripts.method5580(runtime);
			break;
		case 931:
			ToMoveScripts.method1299(runtime);
			break;
		case 620:
			Class10.method325(runtime, (byte) 1);
			break;
		case 465:
			Class467.method6024(runtime);
			break;
		case 312:
			ToMoveScripts.method3583(runtime);
			break;
		case 577:
			StaticMethods.setDisplayMode(runtime);
			break;
		case 155:
			ToMoveScripts.getBloomValue(runtime);
			break;
		case 307:
			GameLanguage.method5757(runtime, (byte) 1);
			break;
		case 794:
			ToMoveScripts.method4100(runtime);
			break;
		case 2:
			Class148.method1610(runtime, (byte) 3);
			break;
		case 157:
			Class74.method827(runtime, 2107357347);
			break;
		case 718:
			ToMoveIComponentScripts.method4062(runtime);
			break;
		case 474:
			ToMoveScripts.method1134(runtime);
			break;
		case 366:
			ToMoveScripts.method4217(runtime);
			break;
		case 397:
			StaticMethods.method5657();
			break;
		case 679:
			ToMoveIComponentScripts.method1250(runtime);
			break;
		case 276:
			ToMoveIComponentScripts.method5798(runtime);
			break;
		case 347:
			ToMoveIComponentScripts.method6360(runtime);
			break;
		case 174:
			Class311.method3816(runtime, -1463033456);
			break;
		case 713:
			Class336_Sub3.method4101();
			break;
		case 514:
			IsaacCipher.method5918(runtime, -989156519);
			break;
		case 187:
			ToMoveScripts.method4309(runtime);
			break;
		case 4:
			ToMoveIComponentScripts.method2046(runtime);
			break;
		case 948:
			Class82_Sub3.method880(runtime, 253995269);
			break;
		case 872:
			ToMoveScripts.method956(runtime);
			break;
		case 676:
			ToMoveIComponentScripts.method4299(runtime);
			break;
		case 228:
			Class474.method6073(runtime, (short) 21540);
			break;
		case 234:
			IComponentSettings.method3501(runtime);
			break;
		case 251:
			Class349.method4204(runtime, (byte) 51);
			break;
		case 700:
			Class162.method1770(runtime, 685678199);
			break;
		case 382:
			ToMoveIComponentScripts.method3911(runtime);
			break;
		case 539:
			ToMoveScripts.method4139(runtime);
			break;
		case 137:
			Class82_Sub17.method921(runtime, (byte) 77);
			break;
		case 145:
			Class214.method1994(runtime, -1543760692);
			break;
		case 631:
			Class342.method4149(runtime, (byte) -103);
			break;
		case 271:
			Class326.method3969(runtime);
			break;
		case 600:
			Class374_Sub1.method4641(runtime, (byte) 0);
			break;
		case 729:
			Class190.method1860(runtime, -202201566);
			break;
		case 672:
			Class138_Sub1.method1543(runtime, 116413311);
			break;
		case 384:
			ToMoveIComponentScripts.method2498(runtime);
			break;
		case 550:
			ToMoveScripts.method876(runtime);
			break;
		case 524:
			ToMoveScripts.setIdleAnimation(runtime);
			break;
		case 649:
			ToMoveScripts.method4293(runtime);
			break;
		case 177:
			Class214.method1988(runtime, (byte) -93);
			break;
		case 501:
			Class354.method4260(runtime, -2137349879);
			break;
		case 575:
			Class128_Sub3.method1442(runtime, 1273815113);
			break;
		case 193:
			Class448.method5913(runtime, -1405576915);
			break;
		case 753:
			ToMoveScripts.method2268(runtime);
			break;
		case 954:
			ToMoveScripts.method4289(runtime);
			break;
		case 873:
			Class377.method4667(runtime, 953966748);
			break;
		case 566:
			ToMoveScripts.method6052(runtime);
			break;
		case 602:
			ToMoveScripts.method2407(runtime, (byte) 49);
			break;
		case 391:
			ToMoveScripts.method536(runtime);
			break;
		case 99:
			Class330.method4004(runtime, -638149953);
			break;
		case 207:
			ToMoveIComponentScripts.method768(runtime);
			break;
		case 675:
			Class194.method1865(runtime, -1852366243);
			break;
		case 857:
			IdentityKitDefinition.setPlayerIdentityKit(runtime);
			break;
		case 195:
			Class298_Sub2.method2850(runtime, 714261686);
			break;
		case 224:
			ToMoveScripts.method2420(runtime);
			break;
		case 651:
			Class287.method2721(runtime, (byte) -67);
			break;
		case 97:
			Class337.method4109(runtime, -1249709514);
			break;
		case 516:
			Class82_Sub19.method930(runtime, 1640153392);
			break;
		case 578:
			ToMoveScripts.method1303(runtime);
			break;
		case 160:
			ToMoveIComponentScripts.method1249(runtime);
			break;
		case 489:
			ToMoveScripts.method3749(runtime);
			break;
		case 785:
			ToMoveScripts.method2826(runtime);
			break;
		case 552:
			Class372_Sub3.method4601(runtime, (short) 4096);
			break;
		case 742:
			Class414.method5585(runtime, 1132221892);
			break;
		case 201:
			ToMoveScripts.method2091(runtime);
			break;
		case 349:
			Class82_Sub9.method902(runtime, (byte) 48);
			break;
		case 985:
			ToMoveIComponentScripts.method4695(runtime);
			break;
		case 518:
			ToMoveIComponentScripts.method2110(runtime);
			break;
		case 151:
			Class428.method5752();
			break;
		case 95:
			Class250.method2399(runtime, (byte) -1);
			break;
		case 249:
			Class424.method5735(runtime, -1107806402);
			break;
		case 535:
			ToMoveIComponentScripts.method5896(runtime);
			break;
		case 673:
			ToMoveScripts.method1074(runtime);
			break;
		case 860:
			StaticMethods.method342(runtime);
			break;
		case 531:
			ToMoveScripts.method4195(runtime);
			break;
		case 113:
			Class138_Sub1.method1542(runtime, 1617556739);
			break;
		case 648:
			ToMoveIComponentScripts.method6277(runtime);
			break;
		case 993:
			ToMoveScripts.method4159(runtime);
			break;
		case 920:
			ToMoveScripts.method3995(runtime);
			break;
		case 227:
			Class321.method3921(runtime);
			break;
		case 558:
			ToMoveScripts.method6158(runtime);
			break;
		case 283:
			Class293.method2818(runtime, (byte) 3);
			break;
		case 876:
			ToMoveScripts.method1546(runtime);
			break;
		case 709:
			Class118.method1289(runtime, -771074006);
			break;
		case 595:
			Region.method4061(runtime);
			break;
		case 236:
			Class335.method4087(runtime, -2002879237);
			break;
		case 820:
			ComponentMouseRecorder.method1009(runtime, 881308872);
			break;
		case 158:
			Class374.method4638(runtime, (short) 23545);
			break;
		case 801:
			Class321.method3922(runtime);
			break;
		case 644:
			ToMoveScripts.GET_CPU_USAGE_VALUE(runtime);
			break;
		case 149:
			ToMoveScripts.method4607(runtime);
			break;
		case 576:
			ToMoveScripts.method600(runtime);
			break;
		case 957:
			Class321.method3924(runtime);
			break;
		case 907:
			Class525.method6378(runtime, -1508997346);
			break;
		case 487:
			Class148.method1608(runtime, (byte) 33);
			break;
		case 93:
			ToMoveScripts.method4677(runtime);
			break;
		case 327:
			Class298_Sub7.method2865(runtime, 1191012288);
			break;
		case 58:
			Class290.method2748(runtime, (byte) 5);
			break;
		case 60:
			ToMoveScripts.method4898(runtime);
			break;
		case 459:
			ToMoveScripts.method5886(runtime);
			break;
		case 769:
			Class480.method6109(runtime, (byte) 56);
			break;
		case 710:
			ToMoveIComponentScripts.method1909(runtime);
			break;
		case 428:
			Class298_Sub2.method2848(runtime, -80531025);
			break;
		case 220:
			ToMoveIComponentScripts.method2595(runtime);
			break;
		case 760:
			Class151.method1645(runtime, (byte) 0);
			break;
		case 379:
			ToMoveIComponentScripts.method6106(runtime);
			break;
		case 481:
			MapLoader.method2387(runtime, (byte) 5);
			break;
		case 507:
			GameDefaults.method4585(runtime);
			break;
		case 704:
			ToMoveIComponentScripts.method3996(runtime);
			break;
		case 476:
			ToMoveScripts.method6364(runtime);
			break;
		case 988:
			ToMoveScripts.method2494(runtime);
			break;
		case 169:
			Class368.method4557(runtime, -1780855139);
			break;
		case 607:
			ToMoveScripts.method4587(runtime);
			break;
		case 551:
			ToMoveScripts.method4864(runtime);
			break;
		case 665:
			Class376.method4660(runtime, -1018588903);
			break;
		case 875:
			Class118.method1287(runtime, 330356398);
			break;
		case 804:
			ToMoveScripts.method2527(runtime);
			break;
		case 218:
			ToMoveIComponentScripts.method2115(runtime);
			break;
		case 217:
			ToMoveIComponentScripts.method6002(runtime);
			break;
		case 677:
			ToMoveScripts.method708(runtime);
			break;
		case 917:
			ToMoveIComponentScripts.method4872(runtime);
			break;
		case 953:
			ToMoveScripts.method4853(runtime);
			break;
		case 755:
			ToMoveIComponentScripts.method3967(runtime);
			break;
		case 306:
			Class94.method1023(runtime, 2139400204);
			break;
		case 486:
			ToMoveScripts.method4713(runtime);
			break;
		case 979:
			ToMoveScripts.method4247(runtime);
			break;
		case 23:
			ToMoveIComponentScripts.method590(runtime);
			break;
		case 13:
			ToMoveScripts.method908(runtime);
			break;
		case 354:
			Class170.method1809(runtime, 160198488);
			break;
		case 410:
			ToMoveScripts.method4909(runtime);
			break;
		case 910:
			Class498.method6210(runtime, (byte) -63);
			break;
		case 544:
			Class282.method2620(runtime, (byte) 2);
			break;
		case 83:
			ToMoveScripts.method1321(runtime);
			break;
		case 399:
			ToMoveScripts.method2092(runtime);
			break;
		case 579:
			ToMoveScripts.enterIntegerScript(runtime);
			break;
		case 309:
			ToMoveScripts.method6363(runtime);
			break;
		case 773:
			ToMoveScripts.method1066(runtime);
			break;
		case 561:
			ConnectionType.method395(runtime);
			break;
		case 229:
			Class353.getName(runtime);
			break;
		case 787:
			ToMoveScripts.method4977(runtime);
			break;
		case 389:
			ToMoveIComponentScripts.method1889(runtime);
			break;
		case 27:
			Class313.method3822(runtime);
			break;
		case 336:
			Class321.method3920(runtime);
			break;
		case 838:
			ToMoveScripts.method5607(runtime);
			break;
		case 674:
			ToMoveScripts.method2814(runtime);
			break;
		case 141:
			ToMoveIComponentScripts.method4885(runtime);
			break;
		case 632:
			ToMoveIComponentScripts.method760(runtime);
			break;
		case 290:
			Class421.method5609(runtime, (byte) -120);
			break;
		case 662:
			ToMoveScripts.method532(runtime);
			break;
		case 68:
			ToMoveScripts.getMaxScreenSizeSupport(runtime);
			break;
		case 424:
			Class118.method1291(runtime, (byte) 118);
			break;
		case 865:
			ToMoveScripts.getGameTick(runtime);
			break;
		case 799:
			ToMoveScripts.method537(runtime);
			break;
		case 929:
			ToMoveIComponentScripts.method1131(runtime);
			break;
		case 180:
			Class377.method4668(runtime, (byte) 0);
			break;
		case 221:
			ToMoveScripts.method2281(runtime);
			break;
		case 811:
			ToMoveScripts.method891(runtime);
			break;
		case 982:
			Class160.method1711(runtime, (byte) 124);
			break;
		case 460:
			ToMoveScripts.isAPI(runtime);
			break;
		case 686:
			Class214.method1992(runtime, -944287579);
			break;
		case 146:
			Class123.method1377(runtime, (byte) 6);
			break;
		case 33:
			ToMoveScripts.method1147(runtime);
			break;
		case 870:
			Class104.method1102(runtime);
			break;
		case 342:
			ToMoveIComponentScripts.method6010(runtime);
			break;
		case 972:
			Class293.method2820(runtime, -1584588285);
			break;
		case 156:
			Class133.method1486(runtime, (byte) 0);
			break;
		case 268:
			ToMoveScripts.method312(runtime);
			break;
		case 21:
			Class256.method2444(runtime, -781222749);
			break;
		case 284:
			ToMoveIComponentScripts.method5193(runtime);
			break;
		case 466:
			ScriptInstructions.negate(runtime);
			break;
		case 726:
			EffectiveVertex.method780();
			break;
		case 440:
			Class406.method4960(runtime, -1145564068);
			break;
		case 926:
			Class82_Sub19_Sub1.method931(runtime, (byte) 1);
			break;
		case 932:
			Class427.method5751(runtime, -766567275);
			break;
		case 235:
			ToMoveScripts.method4676(runtime);
			break;
		case 951:
			Class82_Sub8.method897(runtime, (byte) -79);
			break;
		case 681:
			ToMoveIComponentScripts.method1302(runtime);
			break;
		case 569:
			Class328.method3985(runtime, (byte) -2);
			break;
		case 66:
			Graphics.method619(runtime, -1073260406);
			break;
		case 225:
			Class74.method826(runtime, 961292935);
			break;
		case 641:
			Class356.method4266(runtime);
			break;
		case 430:
			Class376.method4658(runtime, -1547428014);
			break;
		case 543:
			StaticMethods.method4906(runtime);
			break;
		case 17:
			ToMoveScripts.method6291(runtime);
			break;
		case 135:
			ToMoveScripts.method4930(runtime);
			break;
		case 839:
			ToMoveScripts.method4974(runtime);
			break;
		case 86:
			ToMoveScripts.method874(runtime);
			break;
		case 664:
			Class230.method2127(runtime, 2108750118);
			break;
		case 893:
			ToMoveScripts.method1948(runtime);
			break;
		case 659:
			ToMoveScripts.method1392(runtime);
			break;
		case 245:
			ToMoveScripts.method3930(runtime);
			break;
		case 568:
			Class160.method1709(runtime, 1239918673);
			break;
		case 796:
			ToMoveScripts.method4691(runtime);
			break;
		case 894:
			ToMoveScripts.method2374(runtime);
			break;
		case 965:
			ResourceProvider.method4213();
			break;
		case 37:
			Class296.method2829(runtime, (byte) -58);
			break;
		case 73:
			Class21.method368(414231437);
			break;
		case 896:
			Class234.method2177(runtime, -506105871);
			break;
		case 563:
			ToMoveIComponentScripts.method5591(runtime);
			break;
		case 745:
			ToMoveScripts.method3688(runtime);
			break;
		case 560:
			Class496.method6201(runtime, 372399345);
			break;
		case 720:
			ToMoveIComponentScripts.method4164(runtime);
			break;
		case 415:
			ToMoveScripts.method1438(runtime);
			break;
		case 302:
			Class177.method1831(runtime, (byte) 31);
			break;
		case 131:
			ToMoveIComponentScripts.method950(runtime);
			break;
		case 367:
			ToMoveScripts.method4126(runtime);
			break;
		case 138:
			Class496.method6200(runtime, -1316439840);
			break;
		case 824:
			ToMoveIComponentScripts.method391(runtime);
			break;
		case 325:
			Class328.method3986(runtime, (byte) 1);
			break;
		case 324:
			Class136.method1496(runtime, 426828596);
			break;
		case 210:
			ToMoveScripts.method1281(runtime, (short) 407);
			break;
		case 32:
			ObjectDefinition.method5787(runtime, 2030703145);
			break;
		case 337:
			Class354.method4256(runtime, -2038015765);
			break;
		case 392:
			ToMoveScripts.method553(runtime);
			break;
		case 124:
			ToMoveScripts.method4098(runtime);
			break;
		case 574:
			ToMoveScripts.getVoiceOverVolume(runtime);
			break;
		case 619:
			ToMoveIComponentScripts.method3526(runtime);
			break;
		case 333:
			ToMoveIComponentScripts.method4181(runtime);
			break;
		case 206:
			ToMoveScripts.method3653(runtime);
			break;
		case 605:
			ToMoveScripts.method1059(runtime);
			break;
		case 451:
			ToMoveScripts.method4571(runtime);
			break;
		case 580:
			Class361.method4303(runtime, -1628700959);
			break;
		case 705:
			GameLanguage.method4332(runtime);
			break;
		case 244:
			ToMoveScripts.method1904(runtime);
			break;
		case 855:
			ToMoveScripts.method3970(runtime);
			break;
		case 362:
			ToMoveScripts.method1261(runtime, -1182944505);
			break;
		case 545:
			Class324.method3960(runtime, (byte) 1);
			break;
		case 802:
			ToMoveScripts.method3748(runtime);
			break;
		case 34:
			ToMoveScripts.method2090(runtime);
			break;
		case 264:
			Class302.method3715(runtime, (byte) 119);
			break;
		case 420:
			ToMoveScripts.method3997(runtime);
			break;
		case 980:
			ToMoveScripts.method3830(runtime);
			break;
		case 446:
			ToMoveScripts.method3525(runtime);
			break;
		case 198:
			ToMoveScripts.method1084(runtime);
			break;
		case 900:
			ToMoveScripts.updateMultisampling(runtime);
			break;
		case 44:
			ToMoveScripts.listingStatusScript(runtime);
			break;
		case 547:
			Class256.method2442(runtime, 1279201719);
			break;
		case 181:
			ToMoveScripts.method1944(runtime);
			break;
		case 517:
			Class104.method1106(runtime);
			break;
		case 657:
			Class69.method796(runtime, 1161176530);
			break;
		case 770:
			Class136.method1497(runtime, -1800796092);
			break;
		case 905:
			ToMoveScripts.method2367(runtime);
			break;
		case 134:
			ToMoveScripts.method6268(runtime);
			break;
		case 341:
			ToMoveScripts.method1394(runtime);
			break;
		case 554:
			ToMoveIComponentScripts.method4402(runtime);
			break;
		case 12:
			Class109.method1155(runtime, -21181767);
			break;
		case 205:
			ToMoveIComponentScripts.method819(runtime);
			break;
		case 478:
			ToMoveScripts.method4312(runtime, (byte) -7);
			break;
		case 772:
			ToMoveIComponentScripts.method969(runtime);
			break;
		case 248:
			ToMoveScripts.method1225(runtime);
			break;
		case 925:
			ToMoveIComponentScripts.method2106(runtime);
			break;
		case 308:
			Class342.method4154(runtime, 1568365221);
			break;
		case 421:
			Js5ArchiveEnum.isOfferFinished(runtime);
			break;
		case 189:
			ToMoveIComponentScripts.method2812(runtime);
			break;
		case 585:
			ToMoveScripts.method2570(runtime);
			break;
		case 295:
			Class465.method6019(runtime, (short) 256);
			break;
		case 409:
			ToMoveScripts.method2813(runtime);
			break;
		case 942:
			ToMoveIComponentScripts.method4552(runtime);
			break;
		case 303:
			Class365_Sub1_Sub2_Sub2.method4503(runtime, -1739436796);
			break;
		case 658:
			Class349.method4203(runtime, (byte) 74);
			break;
		case 888:
			Class82_Sub8.method894(runtime, -2131036874);
			break;
		case 425:
			ToMoveIComponentScripts.method1262(runtime);
			break;
		case 321:
			ToMoveIComponentScripts.method6361(runtime);
			break;
		case 725:
			Class264_Sub4.method2516(runtime, -1489169021);
			break;
		case 840:
			Class304.method3738(runtime, -1414751661);
			break;
		case 148:
			ToMoveScripts.method1040(runtime);
			break;
		case 183:
			Class63.method734(runtime, (byte) -10);
			break;
		case 559:
			ToMoveScripts.method6105(runtime);
			break;
		case 10:
			ToMoveScripts.method4702(runtime);
			break;
		case 945:
			ToMoveIComponentScripts.method4680(runtime);
			break;
		case 498:
			Class303.method3733(runtime, (byte) 1);
			break;
		case 96:
			ToMoveScripts.method2418(runtime);
			break;
		case 233:
			ToMoveIComponentScripts.method5952(runtime);
			break;
		case 548:
			ToMoveScripts.method4696(runtime);
			break;
		case 519:
			Class177.method1832(runtime, -1522097129);
			break;
		case 661:
			ToMoveScripts.method5933(runtime);
			break;
		case 422:
			Class273.method2564(runtime, (short) 3390);
			break;
		case 714:
			Class298_Sub40_Sub1.method3514(runtime, 1744151230);
			break;
		case 208:
			ToMoveIComponentScripts.method4122(runtime);
			break;
		case 272:
			Class94.method1022(runtime, -780233072);
			break;
		case 152:
			Class356.method4269(runtime, -65274044);
			break;
		case 232:
			ToMoveIComponentScripts.method711(runtime);
			break;
		case 783:
			ToMoveIComponentScripts.method4169(runtime);
			break;
		case 913:
			ToMoveScripts.method2325(runtime);
			break;
		case 442:
			ToMoveIComponentScripts.method2404(runtime);
			break;
		case 28:
			Class160.method1710(runtime, 1109542946);
			break;
		case 809:
			GameDefaults.method4586(runtime);
			break;
		case 976:
			Class214.method1991(runtime, -1233866115);
			break;
		case 115:
			ToMoveIComponentScripts.method4861(runtime);
			break;
		case 515:
			Class8.method317(runtime, 1578867315);
			break;
		case 537:
			ToMoveIComponentScripts.method1564(runtime);
			break;
		case 329:
			Class508.method6278(runtime, 1590012191);
			break;
		case 139:
			Class513.method6292(runtime, -565005069);
			break;
		case 423:
			Class240_Sub1.method2246(runtime);
			break;
		case 299:
			ToMoveScripts.method3946(runtime);
			break;
		case 192:
			ToMoveScripts.method4925(runtime);
			break;
		case 108:
			ToMoveScripts.method3574(runtime);
			break;
		case 728:
			Class151.method1647(runtime, -1850912835);
			break;
		case 472:
			ToMoveIComponentScripts.method2458(runtime);
			break;
		case 556:
			ToMoveScripts.method3851(runtime);
			break;
		case 256:
			ToMoveIComponentScripts.method947(runtime);
			break;
		case 176:
			Class75.method836(runtime, (byte) -11);
			break;
		case 318:
			ToMoveScripts.getItemValue(runtime);
			break;
		case 752:
			Class55.method603(runtime, -1972349882);
			break;
		case 863:
			ToMoveIComponentScripts.method1241(runtime);
			break;
		case 964:
			Class293.method2822(runtime, -2036843330);
			break;
		case 393:
			Class442.method5876(runtime, -553176479);
			break;
		case 433:
			Class377.method4662(runtime, 207023539);
			break;
		case 194:
			IComponentSettings.method3499(runtime);
			break;
		case 540:
			StaticMethods.method1949();
			break;
		case 78:
			Class515.method6298(runtime, 1657034884);
			break;
		case 740:
			ToMoveScripts.method4608(runtime, -1666187924);
			break;
		case 715:
			Class496.method6203(runtime);
			break;
		case 928:
			Class377.method4666(runtime, (byte) -123);
			break;
		case 966:
			Class386.method4727(runtime, 1842008339);
			break;
		case 447:
			ToMoveScripts.method1056(runtime);
			break;
		case 546:
			ToMoveScripts.getAntiAliasingMode(runtime);
			break;
		case 562:
			Class337.method4112(runtime, -163805694);
			break;
		case 866:
			ToMoveScripts.method4248(runtime);
			break;
		case 390:
			ToMoveIComponentScripts.method1227(runtime);
			break;
		case 937:
			GameDefaults.method4583(runtime);
			break;
		case 172:
			Class296.method2831(runtime, 1539423531);
			break;
		case 935:
			Class498.method6211(runtime, 202864030);
			break;
		case 265:
			Class140.method1556(runtime, -1024414196);
			break;
		case 989:
			ToMoveScripts.method6252(runtime);
			break;
		case 381:
			ToMoveIComponentScripts.method6156(runtime);
			break;
		case 511:
			Class446.method5902(runtime, -1725650797);
			break;
		case 522:
			ToMoveScripts.method2324(runtime);
			break;
		case 267:
			ToMoveScripts.method6000(runtime);
			break;
		case 892:
			Class406.method4961(runtime, 2118681676);
			break;
		case 437:
			Class298_Sub17_Sub3.method2924(runtime, (short) 30614);
			break;
		case 991:
			ToMoveScripts.method3828(runtime);
			break;
		case 938:
			Class148.method1615(runtime);
			break;
		case 167:
			Class330.method4003(runtime, -244580695);
			break;
		case 127:
			Class298_Sub32_Sub21.method3273(runtime, -2073331694);
			break;
		case 846:
			ToMoveIComponentScripts.method2438(runtime);
			break;
		case 464:
			ToMoveIComponentScripts.method873(runtime);
			break;
		case 64:
			ToMoveScripts.method2194(runtime);
			break;
		case 277:
			Class377.method4663(runtime, 267792839);
			break;
		case 836:
			Class303.method3732(runtime, (byte) -82);
			break;
		case 364:
			Class234.method2176(runtime, 328121411);
			break;
		case 734:
			ToMoveScripts.method4959(runtime);
			break;
		case 611:
			ConnectionType.method394(runtime);
			break;
		case 650:
			ToMoveIComponentScripts.method6117(runtime);
			break;
		case 355:
			ToMoveIComponentScripts.method2129(runtime);
			break;
		case 943:
			ToMoveIComponentScripts.method765(runtime);
			break;
		case 117:
			Class190.method1856(runtime, -1932663501);
			break;
		case 332:
			ToMoveScripts.method4894(runtime);
			break;
		case 968:
			ToMoveScripts.method1591(runtime);
			break;
		case 314:
			ToMoveScripts.particlesHaveExcessMemory(runtime);
			break;
		case 400:
			Class442.method5877(runtime, 1876479737);
			break;
		case 502:
			ToMoveScripts.method1777(runtime);
			break;
		case 591:
			ToMoveScripts.method3657(runtime);
			break;
		case 92:
			Class127_Sub3.method1433(runtime, (byte) -1);
			break;
		case 1:
			ToMoveScripts.method3912(runtime);
			break;
		case 601:
			Class11.method326(runtime);
			break;
		case 837:
			ToMoveScripts.method4242(runtime);
			break;
		case 434:
			ToMoveIComponentScripts.method820(runtime);
			break;
		case 340:
			GameDefaults.method4581(runtime);
			break;
		case 633:
			ToMoveScripts.method2538(runtime);
			break;
		case 311:
			Class83.method943(runtime, -101938309);
			break;
		case 919:
			ToMoveScripts.getMultiSampleValue(runtime);
			break;
		case 322:
			ToMoveIComponentScripts.method1224(runtime);
			break;
		case 819:
			ToMoveScripts.method4123(runtime);
			break;
		case 645:
			ToMoveIComponentScripts.method1031(runtime);
			break;
		case 143:
			Class15.method349(runtime, -408282382);
			break;
		case 231:
			Class188.method1851(runtime, -2093041337);
			break;
		case 493:
			ToMoveScripts.method1388(runtime);
			break;
		case 200:
			ToMoveIComponentScripts.method2118(runtime);
			break;
		case 179:
			ToMoveScripts.method5672(runtime);
			break;
		case 346:
			Class356.method4273(runtime, 1833702224);
			break;
		case 470:
			ToMoveIComponentScripts.method2459(runtime);
			break;
		case 363:
			Class8.method320(runtime, -667200070);
			break;
		case 38:
			Class418.method5599(runtime, 1627929937);
			break;
		case 509:
			ToMoveIComponentScripts.method2378(runtime);
			break;
		case 270:
			ToMoveScripts.method3973(runtime);
			break;
		case 370:
			ToMoveScripts.method737(runtime);
			break;
		case 339:
			ToMoveIComponentScripts.method1776(true, runtime);
			break;
		case 722:
			Class303.method3736(runtime);
			break;
		case 853:
			Graphics.method612(runtime, (byte) -73);
			break;
		case 289:
			Class354.method4258(runtime, 468134532);
			break;
		case 832:
			ToMoveScripts.method1313(runtime);
			break;
		case 123:
			ToMoveIComponentScripts.method3803(runtime);
			break;
		case 782:
			ToMoveScripts.method2727(runtime);
			break;
		case 30:
			Class386.method4723(runtime, 1619027642);
			break;
		case 394:
			Class308.method3781(runtime, (byte) -105);
			break;
		case 572:
			Class254.method2425(runtime, 1242108112);
			break;
		case 100:
			Class525.method6380(runtime, -89442935);
			break;
		case 691:
			ToMoveScripts.method3429(runtime);
			break;
		case 623:
			Class321.method3919(runtime, -46636878);
			break;
		case 14:
			Class194.method1866(runtime, 235162027);
			break;
		case 744:
			Class99.method1072(runtime, (byte) -126);
			break;
		case 861:
			Class188.method1852(runtime, -1529756171);
			break;
		case 529:
			NodeCollection.method5976(runtime, (byte) -114);
			break;
		case 61:
			ToMoveScripts.method2537(runtime);
			break;
		case 914:
			Class336_Sub2.method4097(runtime, (short) -2807);
			break;
		case 911:
			TranslatedCanvas.method3042(runtime, -58370938);
			break;
		case 448:
			ToMoveScripts.method6050(runtime);
			break;
		case 682:
			AbstractQueue_Sub1.method6386(runtime, (byte) -77);
			break;
		case 238:
			ToMoveScripts.method5950(runtime);
			break;
		case 851:
			Class365_Sub1_Sub5_Sub2.method4535(runtime);
			break;
		case 294:
			ToMoveScripts.method1584(runtime);
			break;
		case 473:
			ToMoveScripts.method1592(runtime);
			break;
		case 508:
			Class_na.method3477(runtime);
			break;
		case 825:
			Class404.method4949(runtime);
			break;
		case 55:
			StaticMethods.method4651();
			break;
		case 883:
			ToMoveScripts.isAlphabetical(runtime);
			break;
		case 140:
			ToMoveIComponentScripts.method778(runtime);
			break;
		case 977:
			ToMoveScripts.method4698(runtime);
			break;
		case 762:
			ToMoveScripts.method1934(runtime);
			break;
		case 75:
			Class342.method4151(runtime, 1227356013);
			break;
		case 835:
			ToMoveScripts.method3872(runtime);
			break;
		case 213:
			Class328.DIRECT_LOGIN(runtime);
			break;
		case 260:
			Class118.method1294(runtime, -650016061);
			break;
		case 197:
			ToMoveIComponentScripts.method538(runtime);
			break;
		case 766:
			ToMoveIComponentScripts.method2083(runtime);
			break;
		case 259:
			ToMoveIComponentScripts.method1283(runtime);
			break;
		case 427:
			ToMoveIComponentScripts.method4167(runtime);
			break;
		case 467:
			ToMoveIComponentScripts.method3964(runtime);
			break;
		case 118:
			ToMoveIComponentScripts.method1563(runtime);
			break;
		case 741:
			Class127.method1421(runtime);
			break;
		case 963:
			ToMoveScripts.method1997(runtime);
			break;
		case 435:
			Class231.method2133(runtime, -1083138642);
			break;
		case 692:
			Class63.method736(runtime, -499258986);
			break;
		case 816:
			ToMoveScripts.method4285(runtime);
			break;
		case 763:
			ToMoveScripts.method4522(runtime);
			break;
		case 353:
			ToMoveIComponentScripts.method1148(runtime);
			break;
		case 779:
			ToMoveScripts.method1891(runtime);
			break;
		case 987:
			Class436.method5806(runtime, (byte) -1);
			break;
		case 615:
			ToMoveIComponentScripts.method2903(runtime);
			break;
		case 765:
			ToMoveScripts.method6016(runtime);
			break;
		case 880:
			ToMoveScripts.method6004(runtime);
			break;
		case 258:
			ToMoveScripts.method3871(runtime);
			break;
		case 343:
			Class94.method1026(runtime, 938982895);
			break;
		case 87:
			Class335.method4088(runtime, 1472787952);
			break;
		case 758:
			Class272.method2553(runtime, -1528160101);
			break;
		case 933:
			ToMoveScripts.method6207(runtime);
			break;
		case 372:
			ToMoveIComponentScripts.method1314(runtime);
			break;
		case 188:
			ToMoveScripts.method4688(runtime);
			break;
		case 790:
			ToMoveScripts.method1063(runtime);
			break;
		case 365:
			ToMoveScripts.method4687(runtime);
			break;
		case 223:
			ConfigDefinitions.method3982(runtime);
			break;
		case 377:
			ToMoveScripts.method2108(runtime);
			break;
		case 608:
			Class308.method3783(runtime);
			break;
		case 310:
			ToMoveIComponentScripts.method2790(runtime);
			break;
		case 154:
			ToMoveScripts.method6288(runtime);
			break;
		case 59:
			Class431.method5765(runtime, 2013834634);
			break;
		case 701:
			ToMoveScripts.method1445(runtime);
			break;
		case 209:
			ToMoveIComponentScripts.method3683(runtime);
			break;
		case 955:
			Class408.method4969(runtime, -2005000447);
			break;
		case 51:
			ToMoveScripts.method5620(runtime);
			break;
		case 958:
			Class274.method2569(runtime, -847832283);
			break;
		case 781:
			Class63.method733(runtime, 1296723312);
			break;
		case 984:
			ToMoveScripts.method6076(runtime);
			break;
		case 247:
			ToMoveScripts.method301(runtime);
			break;
		case 505:
			Class82_Sub8.method892(runtime, (byte) 64);
			break;
		case 287:
			ToMoveScripts.method3102(runtime);
			break;
		case 671:
			Class372_Sub3.method4600(runtime, -2024594230);
			break;
		case 129:
			ToMoveScripts.getClanManager(runtime);
			break;
		case 323:
			Class365_Sub1_Sub2_Sub1.method4498(runtime, (byte) -49);
			break;
		case 429:
			Class427.method5750(runtime, (short) 8819);
			break;
		case 443:
			Class298_Sub7.method2866(runtime, (byte) 75);
			break;
		case 735:
			ToMoveIComponentScripts.getComponentLineWidth(runtime);
			break;
		case 71:
			Class489.method6168(runtime, -1770680499);
			break;
		case 915:
			Class298_Sub40_Sub10.method3515(runtime, (byte) 9);
			break;
		case 521:
			Class82_Sub17.method919(runtime, 1611489031);
			break;
		case 806:
			Class361.method4305(runtime, (byte) 20);
			break;
		case 453:
			Class442.method5878(runtime, -2123966800);
			break;
		case 693:
			Class356.method4272(runtime, 1215799860);
			break;
		case 407:
			Class143.method1575(runtime, (byte) 0);
			break;
		case 901:
			ToMoveScripts.method1566(runtime);
			break;
		case 298:
			Class442.method5873(runtime, (byte) 105);
			break;
		case 491:
			ToMoveScripts.method6005(runtime);
			break;
		case 67:
			ToMoveScripts.playerEquip(runtime);
			break;
		case 11:
			ToMoveScripts.method1393(runtime);
			break;
		case 654:
			ToMoveIComponentScripts.method6301(runtime);
			break;
		case 724:
			ToMoveScripts.brightnessValue(runtime);
			break;
		case 404:
			Class190.method1858(runtime, -1921461819);
			break;
		case 738:
			ToMoveIComponentScripts.method766(runtime);
			break;
		case 250:
			Class90.method997(runtime, -1632544821);
			break;
		case 698:
			ToMoveScripts.method1945(runtime);
			break;
		case 878:
			Class212.method1957();
			break;
		case 285:
			Class143.method1574(runtime, -925250372);
			break;
		case 91:
			Class138_Sub1.method1541(runtime, -804751535);
			break;
		case 906:
			ToMoveIComponentScripts.method1887(runtime);
			break;
		case 621:
			ToMoveIComponentScripts.method2202(runtime);
			break;
		case 243:
			Class374.method4637(runtime, 1522863227);
			break;
		case 557:
			ToMoveIComponentScripts.method5698(runtime);
			break;
		case 196:
			Class225.method2098(runtime, -1321769737);
			break;
		case 815:
			Class11.method331(runtime, -2035886315);
			break;
		case 211:
			ToMoveIComponentScripts.method1929(runtime);
			break;
		case 222:
			ToMoveScripts.method5705(runtime);
			break;
		case 266:
			ToMoveScripts.method4905(runtime);
			break;
		case 627:
			ToMoveScripts.method374(runtime);
			break;
		case 684:
			Class195.method1871(runtime, 2011434697);
			break;
		case 280:
			ToMoveIComponentScripts.method2495(runtime);
			break;
		case 380:
			ToMoveIComponentScripts.method2364(runtime);
			break;
		case 436:
			ToMoveScripts.method4489(runtime);
			break;
		case 159:
			ToMoveIComponentScripts.method2048(runtime);
			break;
		case 555:
			Class88.method974(runtime, -1371982645);
			break;
		case 637:
			ToMoveScripts.method363(runtime);
			break;
		case 375:
			ObjectNode.method3111(runtime, (byte) 0);
			break;
		case 904:
			ToMoveScripts.textEffector(runtime);
			break;
		case 9:
			ToMoveScripts.method2909(runtime);
			break;
		case 111:
			Class214.method1990(runtime, 1244635689);
			break;
		case 402:
			Class10.method323(runtime);
			break;
		case 345:
			Class440.method5859(runtime, (byte) 14);
			break;
		case 834:
			ToMoveIComponentScripts.method1565(runtime);
			break;
		case 359:
			Class239.method2206(runtime, 400834602);
			break;
		case 315:
			ToMoveIComponentScripts.method2078(runtime);
			break;
		case 751:
			ToMoveIComponentScripts.method1404(runtime);
			break;
		case 40:
			ToMoveIComponentScripts.method4335(runtime);
			break;
		case 737:
			Class311.method3819(runtime, 1643819642);
			break;
		case 986:
			ToMoveScripts.method4274(runtime);
			break;
		case 411:
			ToMoveScripts.method5595(runtime);
			break;
		case 454:
			ToMoveScripts.isGroundBlendingOn(runtime);
			break;
		case 77:
			ToMoveScripts.method2600(runtime);
			break;
		case 166:
			Class272.method2554(runtime, -766298444);
			break;
		case 990:
			ToMoveScripts.getItemMembersOnly(runtime);
			break;
		case 885:
			ToMoveScripts.method6280(runtime);
			break;
		case 112:
			Class410.method4982(runtime);
			break;
		case 24:
			Graphics.setItemOptionColor(runtime);
			break;
		case 616:
			ToMoveScripts.method1078(runtime);
			break;
		case 300:
			Class134.method1488(runtime, 153105452);
			break;
		case 398:
			ToMoveScripts.method2460(runtime);
			break;
		case 733:
			ToMoveScripts.method5993(runtime);
			break;
		case 856:
			ToMoveIComponentScripts.method6147(runtime);
			break;
		case 414:
			ToMoveScripts.method1942(runtime, 1753243897);
			break;
		case 65:
			ToMoveScripts.method3854(runtime);
			break;
		case 946:
			ConfigDefinitions.method3984(runtime);
			break;
		case 204:
			ToMoveIComponentScripts.method951(runtime);
			break;
		case 969:
			Class118.method1286(runtime, -175137631);
			break;
		case 335:
			ToMoveScripts.method367(runtime);
			break;
		case 405:
			ToMoveScripts.method1132(runtime);
			break;
		case 477:
			ToMoveScripts.method1075(runtime);
			break;
		case 716:
			ToMoveScripts.method1143(runtime);
			break;
		case 396:
			Class337.method4111(runtime, (byte) -102);
			break;
		case 902:
			ToMoveScripts.cs2SetBitconfigValue(runtime);
			break;
		case 215:
			Class521.method6322(runtime, (byte) 42);
			break;
		case 754:
			Class436.method5807(runtime, -866602563);
			break;
		case 484:
			ToMoveScripts.method1077(runtime);
			break;
		case 960:
			Class365_Sub1_Sub2_Sub1.method4500(runtime, (short) 19235);
			break;
		case 376:
			ToMoveScripts.method4863(runtime);
			break;
		case 170:
			Class91.method999(runtime, (byte) -57);
			break;
		case 739:
			Class151.method1649(runtime, 1436328977);
			break;
		case 418:
			ToMoveScripts.setItemGroundOption(runtime);
			break;
		case 795:
			ToMoveIComponentScripts.method1248(runtime);
			break;
		case 42:
			ToMoveScripts.method2405(runtime);
			break;
		case 586:
			ToMoveIComponentScripts.method6095(runtime);
			break;
		case 746:
			Class78.method846(runtime, (short) 18840);
			break;
		case 909:
			ToMoveScripts.method6150(runtime);
			break;
		case 5:
			ToMoveScripts.method5992(runtime);
			break;
		case 126:
			ToMoveIComponentScripts.method1260(runtime);
			break;
		case 506:
			ToMoveIComponentScripts.method1550(runtime);
			break;
		case 125:
			Class298_Sub31.method3114(runtime, 34037);
			break;
		case 57:
			ToMoveIComponentScripts.method3972(runtime);
			break;
		case 685:
			Class336.method4092(runtime, -110893029);
			break;
		case 352:
			Class488.method6166(runtime, -1327440948);
			break;
		case 348:
			Class353.method4250(runtime, (byte) -50);
			break;
		case 69:
			Class298_Sub37_Sub8.method3435(runtime, (byte) 99);
			break;
		case 369:
			ToMoveIComponentScripts.method1932(runtime);
			break;
		case 528:
			StaticMethods.method6302();
			break;
		case 680:
			ToMoveScripts.method4911(runtime);
			break;
		case 282:
			Class194.method1864(runtime, 385051775);
			break;
		case 8:
			ToMoveIComponentScripts.method1907(runtime);
			break;
		case 319:
			ToMoveIComponentScripts.method1596(runtime);
			break;
		case 573:
			Class293.method2819(runtime, 432669795);
			break;
		case 471:
			Class487.method6164(runtime, -254589789);
			break;
		case 191:
			Class442.method5875(runtime, (byte) -26);
			break;
		case 775:
			NodeCollection.method5975(runtime, (byte) 29);
			break;
		case 791:
			Class94.method1024(runtime, 1621691163);
			break;
		case 699:
			Class12.method339(runtime, 681479919);
			break;
		case 821:
			Class285.method2711(runtime, (byte) 71);
			break;
		case 94:
			ToMoveScripts.method601(runtime);
			break;
		case 80:
			Class190.method1857(runtime, 1907054965);
			break;
		case 182:
			ToMoveIComponentScripts.method2724(runtime);
			break;
		case 103:
			ToMoveIComponentScripts.method854(runtime);
			break;
		case 874:
			Class303.method3734(runtime, -1605491196);
			break;
		case 841:
			ToMoveIComponentScripts.method6145(runtime);
			break;
		case 257:
			ToMoveScripts.method6309(runtime);
			break;
		case 468:
			Class143.method1576(runtime, -1832984147);
			break;
		case 296:
			Class178.method1835(runtime, 1817420178);
			break;
		case 786:
			ToMoveIComponentScripts.method1141(runtime);
			break;
		case 617:
			ToMoveIComponentScripts.method3829(runtime);
			break;
		case 723:
			Class109.method1157(runtime, -1756524776);
			break;
		case 757:
			ToMoveIComponentScripts.method4943(runtime);
			break;
		case 185:
			Class194.method1863(runtime, (byte) 53);
			break;
		case 639:
			ToMoveScripts.method1905(runtime);
			break;
		case 670:
			ToMoveScripts.method2111(runtime);
			break;
		case 261:
			Class404.method4954(runtime);
			break;
		case 499:
			Class225.method2100(runtime, 884899016);
			break;
		case 624:
			ToMoveScripts.getIdleAnimationValue(runtime);
			break;
		case 479:
			Class74.method829(runtime, 128914215);
			break;
		case 936:
			Class372_Sub2.method4598(runtime, 469166159);
			break;
		case 492:
			ToMoveScripts.method3404(runtime);
			break;
		case 818:
			Class328.method3990(runtime, -491927235);
			break;
		case 721:
			ToMoveScripts.SET_CAMERA_PITCH(runtime);
			break;
		case 618:
			ToMoveScripts.method2419(runtime);
			break;
		case 530:
			ToMoveScripts.method4650(runtime);
			break;
		case 291:
			Class_na.method3480(runtime, -269779966);
			break;
		case 383:
			ToMoveScripts.method2838(runtime);
			break;
		case 850:
			Class302_Sub3.method3723(runtime, -563614549);
			break;
		case 743:
			StaticMethods.method5618();
			break;
		case 797:
			Class131.method1471(runtime);
			break;
		case 413:
			ToMoveIComponentScripts.method2394(runtime);
			break;
		case 130:
			ToMoveScripts.method2329(runtime);
			break;
		case 930:
			ToMoveScripts.method4145(runtime);
			break;
		case 165:
			Class401.method4935(runtime);
			break;
		case 523:
			Class287.method2723(runtime);
			break;
		case 320:
			Class474.method6071(runtime);
			break;
		case 358:
			Class126.method1408(runtime);
			break;
		case 35:
			Class82_Sub21.method937(runtime);
			break;
		case 416:
			Class180.method1837(runtime);
			break;
		case 104:
			Class410.method4980();
			break;
		case 789:
			Class118.method1290(runtime);
			break;
		case 351:
			Class88.method972(runtime);
			break;
		case 570:
			ToMoveScripts.method1062(runtime);
			break;
		case 798:
			Class116.method1269(runtime);
			break;
		case 116:
			Class408.method4968(runtime);
			break;
		case 98:
			Class127_Sub1.method1428(runtime);
			break;
		case 63:
			ToMoveScripts.method1251(runtime);
			break;
		case 549:
			Class271.method2544(runtime);
			break;
		case 374:
			ToMoveScripts.emptyScript();
			break;
		case 457:
			ToMoveScripts.method1701(runtime);
			break;
		case 629:
			Class298_Sub20.method3053(runtime);
			break;
		case 70:
			GameMap.method2676(runtime);
			break;
		case 879:
			ToMoveScripts.method5906(runtime);
			break;
		case 652:
			Class116.method1273(runtime);
			break;
		case 678:
			Class284_Sub1.method2708(runtime);
			break;
		case 301:
			Class413.method5582(runtime);
			break;
		case 15:
			ToMoveScripts.method6155(runtime);
			break;
		case 88:
			Class15.method351(runtime);
			break;
		case 438:
			ToMoveIComponentScripts.method1478(runtime);
			break;
		case 827:
			Class99.method1070(runtime);
			break;
		default:
			throw new RuntimeException();
		case 212:
			ToMoveIComponentScripts.method4700(runtime);
			break;
		case 974:
			Class257.method2450(runtime);
			break;
		case 642:
			Class82_Sub19.method928(runtime);
			break;
		case 120:
			Class349.method4205(runtime);
			break;
		case 56:
			ToMoveScripts.method5719(runtime);
			break;
		case 142:
			Class92.method1008(runtime);
			break;
		case 47:
			ToMoveScripts.method3729(runtime);
			break;
		case 589:
			Class374.method4636(runtime);
			break;
		case 360:
			ToMoveScripts.method3965(runtime);
			break;
		case 388:
			ToMoveIComponentScripts.getModelZoom(runtime);
			break;
		case 525:
			Class94.method1025(runtime);
			break;
		case 542:
			ToMoveScripts.method6051(runtime);
			break;
		case 604:
			ToMoveScripts.method2080(runtime);
			break;
		case 226:
			ToMoveScripts.method3101(runtime);
			break;
		case 944:
			ToMoveScripts.method4286(runtime);
			break;
		case 0:
			ToMoveScripts.method5690(runtime);
			break;
		case 973:
			Class304.method3739(runtime);
			break;
		case 844:
			ToMoveIComponentScripts.method2788(runtime);
			break;
		case 717:
			Class15.method350(runtime);
			break;
		case 606:
			Class282.method2621(runtime);
			break;
		case 598:
			Class272.method2555(runtime);
			break;
		case 469:
			ToMoveScripts.method6149(runtime);
			break;
		case 983:
			Stream_Sub1.method3876(runtime);
			break;
		case RESET_CAMERA:
			EffectiveVertex.resetCamera();
			break;
		case 62:
			ToMoveScripts.method3870(runtime);
			break;
		case 136:
			ToMoveScripts.method2434(runtime);
			break;
		case 950:
			GameClient.method4333();
			break;
		case 279:
			ToMoveIComponentScripts.method6303(runtime);
			break;
		case 378:
			Class342.method4153(runtime);
			break;
		case 252:
			Class236.method2191(runtime);
			break;
		case 656:
			Class240_Sub1.method2245(runtime);
			break;
		case 164:
			Class133.method1485(runtime);
			break;
		case 356:
			ToMoveScripts.method887(runtime);
			break;
		case 79:
			Class133.method1484(runtime);
			break;
		case 386:
			ToMoveScripts.method4697(runtime);
			break;
		case 541:
			StaticMethods.method6233();
			break;
		case 494:
			Class12.method340(runtime);
			break;
		case 107:
			ToMoveIComponentScripts.method343(runtime);
			break;
		case 403:
			ToMoveScripts.method1139(runtime);
			break;
		case 949:
			ToMoveIComponentScripts.method4166(runtime);
			break;
		case 940:
			Class499.method6217(runtime);
			break;
		case 702:
			Class134.method1487(runtime);
			break;
		case 426:
			Class293.method2821(runtime);
			break;
		case 503:
			Class337.method4110(runtime);
			break;
		case 871:
			Class299.method3681(runtime);
			break;
		case 764:
			ToMoveScripts.method4890(runtime);
			break;
		case 334:
			ToMoveIComponentScripts.method1035(runtime);
			break;
		case 778:
			ToMoveScripts.method4956(runtime);
			break;
		case 923:
			ToMoveScripts.method5885(runtime);
			break;
		case 975:
			ToMoveScripts.method4102(runtime);
			break;
		case 254:
			Class374_Sub2.method4644(runtime);
			break;
		case 660:
			ToMoveIComponentScripts.method2725(runtime);
			break;
		case 646:
			Class236.method2189(runtime);
			break;
		case 439:
			ToMoveScripts.method4168(runtime);
			break;
		case 273:
			ToMoveIComponentScripts.method1435(true, runtime);
			break;
		case 830:
			ToMoveIComponentScripts.method6107(runtime);
			break;
		case 750:
			Class101.method1081();
			break;
		case 455:
			ToMoveIComponentScripts.method3852(runtime);
			break;
		case 635:
			ToMoveScripts.method4649(runtime);
			break;
		case 625:
			ToMoveScripts.removeScript(runtime);
			break;
		case 831:
			Class354.method4257(runtime);
			break;
		case 255:
			ToMoveScripts.method3971(runtime);
			break;
		case 45:
			ToMoveIComponentScripts.method1594(runtime);
			break;
		case 842:
			ToMoveIComponentScripts.method1479(runtime);
			break;
		case 849:
			Class55.method604(runtime);
			break;
		case 119:
			Class170.method1815(runtime);
			break;
		case 538:
			ToMoveIComponentScripts.method1700(runtime);
			break;
		case 281:
			ToMoveScripts.method3949(runtime);
			break;
		case 877:
			Class77.method839(runtime);
			break;
		case 952:
			Class69.method792(runtime);
			break;
		case 862:
			ToMoveScripts.method1322(runtime);
			break;
		case 747:
			Class418.method5597(runtime);
			break;
		case 643:
			ToMoveScripts.method6082(runtime);
			break;
		case 3:
			Class289.method2745(runtime);
			break;
		case 768:
			ToMoveScripts.method948(runtime);
			break;
		case 288:
			ToMoveScripts.method4689(runtime);
			break;
		case 122:
			Class298_Sub37_Sub2.method3411(runtime);
			break;
		case 41:
			Class386.method4722(runtime);
			break;
		case 970:
			ToMoveIComponentScripts.RESET_HOOKS_2(runtime);
			break;
		case 350:
			ToMoveScripts.method965(runtime);
			break;
		case 500:
			Class254.method2426(runtime);
			break;
		case 357:
			Class234.method2180(runtime);
			break;
		case 829:
			ToMoveIComponentScripts.method588(runtime);
			break;
		case 690:
			ToMoveScripts.method2318(runtime);
			break;
		case 812:
			Class298_Sub17_Sub4.method2925(runtime);
			break;
		case 46:
			Class136.method1500(runtime);
			break;
		case 162:
			ClassNotAnim.method6228(runtime);
			break;
		case 767:
			ScriptRuntime.method4945(runtime);
			break;
		case 756:
			Class273.method2560(runtime);
			break;
		case 891:
			ToMoveIComponentScripts.method786(runtime);
			break;
		case 490:
			Class91.method1000(runtime);
			break;
		case 924:
			ToMoveIComponentScripts.method1569(runtime);
			break;
		case 133:
			ToMoveScripts.method905(runtime);
			break;
		case 144:
			Class55.method605(runtime);
			break;
		case 132:
			ToMoveScripts.method2386(runtime);
			break;
		case 922:
			Class12.method334(runtime);
			break;
		case 361:
			ToMoveScripts.method2107(runtime);
			break;
		case 373:
			Class404.method4953(runtime);
			break;
		case 412:
			Class336_Sub6.method4106(runtime);
			break;
		case 653:
			Js5ArchiveEnum.method1237(runtime);
			break;
		case 458:
			Class104.method1105(runtime);
			break;
		case 304:
			Class82_Sub19_Sub2.method932(runtime);
			break;
		case 316:
			ToMoveIComponentScripts.method4121(runtime);
			break;
		case 488:
			ToMoveIComponentScripts.method4180(runtime);
			break;
		case 687:
			GameLanguage.method5759(runtime);
			break;
		case 496:
			ToMoveScripts.method4296(runtime);
			break;
		case 495:
			ToMoveScripts.method3730(runtime);
			break;
		case 406:
			ToMoveScripts.method4212(runtime);
			break;
		case 395:
			Class90.method996(runtime);
			break;
		case 274:
			ToMoveScripts.method4701(runtime);
			break;
		case 731:
			ToMoveScripts.method4264(runtime);
			break;
		case 565:
			StaticMethods.method1551();
			break;
		case 564:
			ToMoveIComponentScripts.method2079(runtime);
			break;
		case 153:
			Class376.method4657(runtime);
			break;
		case 748:
			ToMoveIComponentScripts.method1444(runtime);
			break;
		case 886:
			Class282.method2626(runtime);
			break;
		case 947:
			ToMoveScripts.method1130(runtime);
			break;
		case 584:
			Class170.method1810(runtime);
			break;
		case 978:
			Class94.method1021(runtime);
			break;
		case 275:
			ToMoveScripts.getSceneryShadowsMode(runtime);
			break;
		case 688:
			ToMoveScripts.method1422(runtime);
			break;
		case 826:
			ToMoveScripts.method4672(runtime);
			break;
		case 805:
			ToMoveScripts.method1589(runtime);
			break;
		case 175:
			Class272.method2556(runtime);
			break;
		case 912:
			ToMoveScripts.method1585(runtime);
			break;
		case 895:
			Class378.method4669(runtime);
			break;
		case 897:
			StaticMethods.method336();
			break;
		case 927:
			ToMoveIComponentScripts.method3545(runtime);
			break;
		case 241:
			Class82_Sub15.method916(runtime);
			break;
		case 749:
			ToMoveIComponentScripts.method3684(runtime);
			break;
		case 242:
			ToMoveIComponentScripts.method1284(runtime);
			break;
		case 683:
			Class311.method3818(runtime);
			break;
		case 898:
			Class254.method2423(runtime);
			break;
		case 939:
			Class386.method4724(runtime);
			break;
		case 847:
			ToMoveScripts.method856(runtime);
			break;
		case 128:
			ToMoveIComponentScripts.method6148(runtime);
			break;
		case 918:
			StaticMethods.method4113(runtime);
			break;
		case 173:
			ToMoveIComponentScripts.method1886(runtime);
			break;
		case 777:
			Class290.method2747(runtime);
			break;
		case 534:
			Class23.method378(runtime);
			break;
		case 230:
			ToMoveScripts.method1547(runtime);
			break;
		case 719:
			ToMoveIComponentScripts.method1776(false, runtime);
			break;
		case 590:
			Class436.method5809(runtime);
			break;
		case 962:
			Class442.method5874(runtime);
			break;
		case 510:
			Class135.method1492(runtime);
			break;
		case 214:
			Class24.method380(runtime);
			break;
		case 833:
			ToMoveScripts.method1151(runtime);
			break;
		case 822:
			Graphics.method615(runtime);
			break;
		case 203:
			Class99.method1071(runtime);
			break;
		case 792:
			ToMoveScripts.method968(runtime);
			break;
		case 297:
			ToMoveScripts.method1901(runtime);
			break;
		case 588:
			Class446.method5901(runtime);
			break;
		case 848:
			Class257.method2452(runtime);
			break;
		case 597:
			Class231.method2128(runtime);
			break;
		case 483:
			ToMoveIComponentScripts.method4893(runtime);
			break;
		case 114:
			ToMoveScripts.method6151(runtime);
			break;
		case 161:
			Class401.method4940(runtime);
			break;
		case 452:
			ToMoveScripts.method5995(runtime);
			break;
		case 313:
			ToMoveIComponentScripts.method360(runtime);
			break;
		case 613:
			ToMoveScripts.method357(runtime);
			break;
		case 106:
			Class10.method324(runtime);
			break;
		case 626:
			ToMoveIComponentScripts.method3419(runtime);
			break;
		case 823:
			StaticMethods.method5622();
			break;
		case 808:
			Class328.method3988(runtime);
			break;
		case 622:
			ToMoveScripts.method1935(runtime);
			break;
		case 788:
			Class336.method4094(runtime);
			break;
		case 408:
			ToMoveScripts.method4527(runtime);
			break;
		case 759:
			ToMoveIComponentScripts.method4895(runtime);
			break;
		case 22:
			Class404.method4950(runtime);
			break;
		case 102:
			ToMoveScripts.method2113(runtime);
			break;
		case 890:
			ToMoveScripts.method949(runtime);
			break;
		case 269:
			ToMoveScripts.method1252(runtime);
			break;
		case 263:
			Class298_Sub32_Sub11.method3208(runtime);
			break;
		case 163:
			Class296.method2832(runtime);
			break;
		case 793:
			Class234.method2179(runtime);
			break;
		case 462:
			ToMoveScripts.method4694(runtime);
			break;
		case 732:
			ToMoveScripts.method3750(runtime);
			break;
		case 512:
			Class298_Sub28.method3108(runtime);
			break;
		case 171:
			Class104.method1101(runtime);
			break;
		case 967:
			Class208.method1937(runtime);
			break;
		case 703:
			Class63.method735(runtime);
			break;
		case 18:
			Class271.method2542(runtime);
			break;
		case 292:
			Class177.method1833(runtime);
			break;
		case 727:
			Class82_Sub19.method927(runtime);
			break;
		case 371:
			ToMoveScripts.method2193(runtime);
			break;
		case 237:
			ToMoveScripts.method2369(runtime);
			break;
		case 368:
			Heap.method3669(runtime);
			break;
		case 882:
			ToMoveScripts.method3103(runtime);
			break;
		case 475:
			Class88.method973(runtime);
			break;
		case 582:
			Class273.method2561(runtime);
			break;
		case 813:
			Class165.method1784(runtime);
			break;
		case 610:
			Class127_Sub3.method1432(runtime);
			break;
		case 239:
			ToMoveScripts.method396(runtime);
			break;
		case 450:
			ToMoveScripts.method2572(runtime);
		}
	}

	static final void method2393(IComponentDefinition class105, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime class403) {
		class105.modelType = 939239877;
		class105.modelID = (class403.integerStack[(class403.integerStackOffset -= -391880689) * 681479919]) * -1825442367;
		if (-1 == class105.slot * -1309843523 && !IComponentDefinitionCollection.accessed)
			IComponentUpdateNode.appendModelTypeUpdate(class105.interfaceHash);
	}

}
