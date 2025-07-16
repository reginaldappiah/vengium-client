package com.jagex;

import java.util.Arrays;

/* Class432 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ObjectDefinition {
	byte aByte5363;
	public int anInt5364;
	public int objectID;
	public int[] objectIDs;
	public short[] aShortArray5367;
	public String name = "null";
	short[] aShortArray5369;
	public int[] anIntArray5370;
	byte[] aByteArray5371;
	short[] aShortArray5372;
	public short[] aShortArray5373;
	public int[][] modelIDs;
	byte aByte5375;
	public int anInt5376;
	byte aByte5377 = 0;
	int[] objectAnimationIDs;
	int anInt5379;
	public int clipType;
	public boolean aBoolean5381;
	public int anInt5382;
	public int sizeY;
	int anInt5384;
	public boolean aBoolean5385;
	public int sizeX = -2144855351;
	public int anInt5387;
	public int anInt5388;
	public boolean aBoolean5389;
	int[] anIntArray5390;
	public int anInt5391;
	int anInt5392;
	int anInt5393;
	public String[] options;
	public boolean aBoolean5395;
	int anInt5396;
	public int anInt5397;
	public int anInt5398;
	public int anInt5399;
	public int anInt5400;
	public boolean aBoolean5401;
	public int anInt5402;
	ObjectDefinitionLoader loader;
	public boolean aBoolean5404;
	public boolean aBoolean5405;
	int anInt5406;
	int anInt5407;
	public int anInt5408;
	public int anInt5409;
	public boolean aBoolean5410;
	int anInt5411;
	int anInt5412;
	int anInt5413;
	int anInt5414;
	byte aByte5415;
	public boolean objectBlocksWalkAlternative;
	byte aByte5417;
	public int anInt5418;
	int anInt5419;
	int anInt5420;
	int anInt5421;
	public int anInt5422;
	public static short[] aShortArray5423 = new short[256];
	public boolean objectBlocksFly;
	public int anInt5425;
	public boolean aBoolean5426;
	public int anInt5427;
	public int anInt5428;
	public int[] anIntArray5429;
	public byte[] types;
	public boolean aBoolean5431;
	public boolean aBoolean5432;
	public boolean aBoolean5433;
	public boolean aBoolean5434;
	LinkedList aClass437_5435;
	public int anInt5436;
	public int anInt5437;
	public int anInt5438;
	public int anInt5439;
	public boolean aBoolean5440;
	public boolean aBoolean5441;
	private byte[] unknownArray3;
	private byte[] unknownArray4;
	private int[] aj;
	static int anInt5442 = 127007;

	void decode(Buffer buffer, int i) {
			if (1 == i) {
				int models = buffer.readUByte();
				types = new byte[models];
				modelIDs = new int[models][];
				for (int index = 0; index < models; index++) {
					types[index] = buffer.readByte();
					int i_3_ = buffer.readUByte();
					modelIDs[index] = new int[i_3_];
					for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
						modelIDs[index][i_4_] = buffer.readBigSmart();
				}
			} else if (i == 2)
				name = buffer.readString();
			else if (14 == i)
				sizeX = buffer.readUByte() * -2144855351;
			else if (i == 15)
				sizeY = buffer.readUByte() * 44056569;
			else if (i == 17) {
				clipType = 0;
				objectBlocksFly = false;
			} else if (i == 18)
				objectBlocksFly = false;
			else if (19 == i)
				anInt5382 = buffer.readUByte() * 455422743;
			else if (21 == i)
				this.aByte5363 = (byte) 1;
			else if (i == 22)
				aBoolean5385 = true;
			else if (i == 23)
				anInt5376 = -580315545;
			else if (24 == i) {
				int i_5_ = buffer.readBigSmart();
				if (i_5_ != -1)
					this.objectAnimationIDs = new int[] { i_5_ };
			} else if (i == 27)
				clipType = 268680417;
			else if (28 == i)
				anInt5391 = ((buffer.readUByte() << 2) * 803995289);
			else if (i == 29)
				this.anInt5392 = buffer.readByte() * -62240291;
			else if (39 == i)
				this.anInt5393 = buffer.readByte() * -1530589831;
			else if (i >= 30 && i < 35)
				options[i - 30] = buffer.readString();
			else if (i == 40) {
				int i_6_ = buffer.readUByte();
				this.aShortArray5369 = new short[i_6_];
				aShortArray5367 = new short[i_6_];
				for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
					this.aShortArray5369[i_7_] = (short) buffer.readUShort();
					aShortArray5367[i_7_] = (short) buffer.readUShort();
				}
			} else if (i == 41) {
				int i_8_ = buffer.readUByte();
				this.aShortArray5372 = new short[i_8_];
				aShortArray5373 = new short[i_8_];
				for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
					this.aShortArray5372[i_9_] = (short) buffer.readUShort();
					aShortArray5373[i_9_] = (short) buffer.readUShort();
				}
			} else if (i == 42) {
				int i_10_ = buffer.readUByte();
				this.aByteArray5371 = new byte[i_10_];
				for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
					this.aByteArray5371[i_11_] = buffer.readByte();
			} else if (44 == i) {
				int i_86_ = (short) buffer.readUShort();
				int i_87_ = 0;
				for (int i_88_ = i_86_; i_88_ > 0; i_88_ >>= 1)
					i_87_++;
				unknownArray3 = new byte[i_87_];
				byte i_89_ = 0;
				for (int i_90_ = 0; i_90_ < i_87_; i_90_++) {
					if ((i_86_ & 1 << i_90_) > 0) {
						unknownArray3[i_90_] = i_89_;
						i_89_++;
					} else
						unknownArray3[i_90_] = (byte) -1;
				}
			} else if (i == 45) {
				int i_91_ = (short) buffer.readUShort();
				int i_92_ = 0;
				for (int i_93_ = i_91_; i_93_ > 0; i_93_ >>= 1)
					i_92_++;
				unknownArray4 = new byte[i_92_];
				byte i_94_ = 0;
				for (int i_95_ = 0; i_95_ < i_92_; i_95_++) {
					if ((i_91_ & 1 << i_95_) > 0) {
						unknownArray4[i_95_] = i_94_;
						i_94_++;
					} else
						unknownArray4[i_95_] = (byte) -1;
				}
			} else if (i == 62)
				aBoolean5404 = true;
			else if (64 == i)
				aBoolean5405 = false;
			else if (65 == i)
				this.anInt5406 = buffer.readUShort() * 929519655;
			else if (66 == i)
				this.anInt5407 = buffer.readUShort() * -1076239419;
			else if (i == 67)
				this.anInt5414 = buffer.readUShort() * 1192395179;
			else if (i == 69)
				buffer.readUByte();
			else if (i == 70)
				this.anInt5379 = (buffer.readShort() << 2) * 804752437;
			else if (i == 71)
				this.anInt5396 = ((buffer.readShort() << 2) * -830213317);
			else if (i == 72)
				this.anInt5411 = ((buffer.readShort() << 2) * 1957563615);
			else if (i == 73)
				aBoolean5410 = true;
			else if (i == 74)
				objectBlocksWalkAlternative = true;
			else if (i == 75)
				anInt5409 = buffer.readUByte() * 1763780945;
			else if (77 == i || 92 == i) {
				this.anInt5420 = buffer.readUShort() * -1228374415;
				if (65535 == 1064010385 * this.anInt5420)
					this.anInt5420 = 1228374415;
				this.anInt5421 = buffer.readUShort() * -2115564225;
				if (65535 == -1128963393 * this.anInt5421)
					this.anInt5421 = 2115564225;
				int i_12_ = -1;
				if (92 == i)
					i_12_ = buffer.readBigSmart();
				int i_13_ = buffer.readUByte();
				objectIDs = new int[2 + i_13_];
				for (int i_14_ = 0; i_14_ <= i_13_; i_14_++)
					objectIDs[i_14_] = buffer.readBigSmart();
				objectIDs[i_13_ + 1] = i_12_;
			} else if (i == 78) {
				anInt5422 = buffer.readUShort() * -349046175;
				anInt5408 = buffer.readUByte() * -634552289;
			} else if (i == 79) {
				anInt5427 = buffer.readUShort() * 1882310759;
				anInt5428 = buffer.readUShort() * 1376401661;
				anInt5408 = buffer.readUByte() * -634552289;
				int i_15_ = buffer.readUByte();
				anIntArray5429 = new int[i_15_];
				for (int i_16_ = 0; i_16_ < i_15_; i_16_++)
					anIntArray5429[i_16_] = buffer.readUShort();
			} else if (81 == i) {
				this.aByte5363 = (byte) 2;
				this.anInt5384 = buffer.readUByte() * -1868938496;
			} else if (i == 82)
				aBoolean5432 = true;
			else if (88 == i)
				aBoolean5433 = false;
			else if (i == 89)
				aBoolean5431 = false;
			else if (91 == i)
				aBoolean5434 = true;
			else if (i == 93) {
				this.aByte5363 = (byte) 3;
				this.anInt5384 = buffer.readUShort() * -242181565;
			} else if (i == 94)
				this.aByte5363 = (byte) 4;
			else if (95 == i) {
				this.aByte5363 = (byte) 5;
				this.anInt5384 = buffer.readShort() * -242181565;
			} else if (97 == i)
				aBoolean5401 = true;
			else if (98 == i)
				aBoolean5381 = true;
			else if (99 == i) {
				anInt5397 = buffer.readUByte() * 2064530465;
				anInt5436 = buffer.readUShort() * -1320066331;
			} else if (100 == i) {
				anInt5398 = buffer.readUByte() * 1406097311;
				anInt5364 = buffer.readUShort() * 474865427;
			} else if (101 == i)
				anInt5402 = buffer.readUByte() * 1747447869;
			else if (i == 102)
				anInt5400 = buffer.readUShort() * 475870643;
			else if (103 == i)
				anInt5376 = 0;
			else if (104 == i)
				anInt5425 = buffer.readUByte() * 1861040235;
			else if (i == 105)
				aBoolean5440 = true;
			else if (106 == i) {
				int i_17_ = buffer.readUByte();
				int i_18_ = 0;
				this.objectAnimationIDs = new int[i_17_];
				this.anIntArray5390 = new int[i_17_];
				for (int i_19_ = 0; i_19_ < i_17_; i_19_++) {
					this.objectAnimationIDs[i_19_] = buffer.readBigSmart();
					i_18_ += this.anIntArray5390[i_19_] = buffer.readUByte();
				}
				for (int i_20_ = 0; i_20_ < i_17_; i_20_++)
					this.anIntArray5390[i_20_] = (65535 * this.anIntArray5390[i_20_] / i_18_);
			} else if (i == 107)
				anInt5399 = buffer.readUShort() * -779127471;
			else if (i >= 150 && i < 155) {
				options[i - 150] = buffer.readString();
				if (!this.loader.member)
					options[i - 150] = null;
			} else if (160 == i) {
				int i_21_ = buffer.readUByte();
				anIntArray5370 = new int[i_21_];
				for (int i_22_ = 0; i_22_ < i_21_; i_22_++)
					anIntArray5370[i_22_] = buffer.readUShort();
			} else if (i == 162) {
				this.aByte5363 = (byte) 3;
				this.anInt5384 = buffer.readInt() * -242181565;
			} else if (i == 163) {
				this.aByte5417 = buffer.readByte();
				this.aByte5375 = buffer.readByte();
				this.aByte5415 = buffer.readByte();
				this.aByte5377 = buffer.readByte();
			} else if (i == 164)
				this.anInt5412 = buffer.readShort() * -1121469985;
			else if (165 == i)
				this.anInt5413 = buffer.readShort() * 1097094883;
			else if (166 == i)
				this.anInt5419 = buffer.readShort() * -870210675;
			else if (i == 167)
				anInt5418 = buffer.readUShort() * 597954411;
			else if (168 == i)
				aBoolean5426 = true;
			else if (169 == i)
				aBoolean5395 = true;
			else if (170 == i)
				anInt5387 = buffer.readUnsignedSmart() * -1277797453;
			else if (171 == i)
				anInt5388 = buffer.readUnsignedSmart() * 883280249;
			else if (i == 173) {
				anInt5438 = buffer.readUShort() * 1097791615;
				anInt5439 = buffer.readUShort() * -127624289;
			} else if (i == 177)
				aBoolean5389 = true;
			else if (178 == i)
				anInt5437 = buffer.readUByte() * -1122029857;
			else if (i == 189)
				aBoolean5441 = true;
			else if (i >= 190 && i < 196) {
				if (aj == null) {
					aj = new int[6];
					Arrays.fill(aj, -1);
				}
				aj[i - 190] = buffer.readUShort();
			} else if (i == 249) {
				int maxKey = buffer.readUByte();
				if (this.aClass437_5435 == null) {
					int key = LinkedList.getNextBitValue(maxKey);
					this.aClass437_5435 = new LinkedList(key);
				}
				for (int i_25_ = 0; i_25_ < maxKey; i_25_++) {
					boolean isObject = buffer.readUByte() == 1;
					int key = buffer.readUTriByte();
					Node node;
					if (isObject)
						node = new ObjectNode(buffer.readString());
					else
						node = new IntNode(buffer.readInt());
					this.aClass437_5435.connect(node, (long) key);
				}
			}
	}

	public String method5770(int key, String string) {
			if (this.aClass437_5435 == null)
				return string;
			ObjectNode objectNode = ((ObjectNode) this.aClass437_5435.get((long) key));
			if (objectNode == null)
				return string;
			return (String) objectNode.nodeObject;
	}

	public final boolean method5771(int type) {
			if (modelIDs == null)
				return true;
			boolean modelsExist = true;
			synchronized (this.loader.modelsCache) {
				for (int typeIndex = 0; typeIndex < types.length; typeIndex++) {
					if (types[typeIndex] == type) {
						for (int modelIndex = 0; modelIndex < modelIDs[typeIndex].length; modelIndex++) {
							if (!this.loader.modelsCache.fileExists(modelIDs[typeIndex][modelIndex], 0))
								modelsExist = false;
						}
					}
				}
			}
			return modelsExist;
	}

	public final boolean method5772() {
			if (modelIDs == null)
				return true;
			boolean bool = true;
			synchronized (this.loader.modelsCache) {
				for (int i_31_ = 0; i_31_ < modelIDs.length; i_31_++) {
					for (int i_32_ = 0; i_32_ < modelIDs[i_31_].length; i_32_++)
						bool &= (this.loader.modelsCache.fileExists(modelIDs[i_31_][i_32_], 0));
				}
			}
			return bool;
	}

	public boolean containsAnimationID(int objectAnimationID) {
			if (this.objectAnimationIDs != null && objectAnimationID != -1) {
				for (int index = 0; index < this.objectAnimationIDs.length; index++) {
					if (this.objectAnimationIDs[index] == objectAnimationID)
						return true;
				}
			}
			return false;
	}

	public final synchronized ModelToolkit method5774(GraphicsToolkit class_ra, int i, int i_35_, int i_36_, FloorToolkit class_xa, FloorToolkit class_xa_37_, int i_38_, int i_39_, int i_40_, Animator animator, Class435 class435, byte i_41_) {
		try {
			if (StaticMethods.method4261(i_35_))
				i_35_ = Class424.aClass424_6596.type * -1976050083;
			long l = (long) (i_36_ + ((i_35_ << 3) + (1181652947 * objectID << 10)));
			int i_42_ = i;
			l |= (long) (class_ra.id * 580915349 << 29);
			if (null != class435)
				l |= (class435.key * 2595045048596347611L << 32);
			if (animator != null)
				i |= animator.getAnimationFlag();
			if (this.aByte5363 == 3)
				i |= 0x7;
			else {
				if (this.aByte5363 != 0 || 0 != 52797131 * this.anInt5413)
					i |= 0x2;
				if (945504799 * this.anInt5412 != 0)
					i |= 0x1;
				if (0 != this.anInt5419 * 1782732613)
					i |= 0x4;
			}
			if (Class424.aClass424_6611.type * -1976050083 == i_35_ && i_36_ > 3)
				i |= 0x5;
			ModelToolkit class387;
			synchronized (this.loader.aClass348_5451) {
				class387 = (ModelToolkit) this.loader.aClass348_5451.get(l);
			}
			if (class387 == null || class_ra.method5017(class387.m(), i) != 0) {
				if (class387 != null)
					i = class_ra.method5004(i, class387.m());
				class387 = method5775(class_ra, i, i_35_, i_36_, class435);
				if (null == class387)
					return null;
				synchronized (this.loader.aClass348_5451) {
					this.loader.aClass348_5451.put(class387, l);
				}
			}
			boolean bool = false;
			if (animator != null) {
				class387 = class387.method4755((byte) 1, i, true);
				bool = true;
				animator.animate(class387, i_36_ & 0x3);
			}
			if (i_35_ == -1976050083 * Class424.aClass424_6611.type && i_36_ > 3) {
				if (!bool) {
					class387 = class387.method4755((byte) 3, i, true);
					bool = true;
				}
				class387.f(2048);
			}
			if (this.aByte5363 != 0) {
				if (!bool) {
					class387 = class387.method4755((byte) 3, i, true);
					bool = true;
				}
				class387.pa(this.aByte5363, 1762198123 * this.anInt5384, class_xa, class_xa_37_, i_38_, i_39_, i_40_);
			}
			if (945504799 * this.anInt5412 != 0 || 0 != this.anInt5413 * 52797131 || 0 != 1782732613 * this.anInt5419) {
				if (!bool) {
					class387 = class387.method4755((byte) 3, i, true);
					bool = true;
				}
				class387.ia(945504799 * this.anInt5412, this.anInt5413 * 52797131, 1782732613 * this.anInt5419);
			}
			if (bool)
				class387.KA(i_42_);
			return class387;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rw.d(").append(')').toString());
		}
	}

	ModelToolkit method5775(GraphicsToolkit graphicsToolkit, int i, int i_43_, int i_44_, Class435 class435) {
			int i_46_ = this.anInt5392 * -1536403851 + 64;
			int i_47_ = -2019557395 * this.anInt5393 + 850;
			int i_48_ = i;
			boolean bool = (aBoolean5404 || (i_43_ == Class424.aClass424_6593.type * -1976050083 && i_44_ > 3));
			if (bool)
				i |= 0x10;
			if (i_44_ == 0) {
				if (-166422633 * this.anInt5406 != 128 || this.anInt5379 * -1514641891 != 0)
					i |= 0x1;
				if (128 != this.anInt5414 * -895192829 || 0 != 2145431327 * this.anInt5411)
					i |= 0x4;
			} else
				i |= 0xd;
			if (128 != 668312333 * this.anInt5407 || this.anInt5396 * 1536191987 != 0)
				i |= 0x2;
			if (null != this.aShortArray5369)
				i |= 0x4000;
			if (this.aShortArray5372 != null)
				i |= 0x8000;
			if (this.aByte5377 != 0)
				i |= 0x80000;
			ModelToolkit modelToolkit = null;
			if (null != types) {
				int i_49_ = -1;
				for (int i_50_ = 0; i_50_ < types.length; i_50_++) {
					if (i_43_ == types[i_50_]) {
						i_49_ = i_50_;
						break;
					}
				}
				if (i_49_ == -1)
					return null;
				int[] is = ((class435 != null && class435.anIntArray5463 != null) ? class435.anIntArray5463 : modelIDs[i_49_]);
				int i_51_ = is.length;
				if (i_51_ > 0) {
					long l = (long) (580915349 * graphicsToolkit.id);
					for (int i_52_ = 0; i_52_ < i_51_; i_52_++)
						l = (long) is[i_52_] + 67783L * l;
					synchronized (this.loader.aClass348_5450) {
						modelToolkit = ((ModelToolkit) this.loader.aClass348_5450.get(l));
					}
					if (null != modelToolkit) {
						if (i_46_ != modelToolkit.c())
							i |= 0x1000;
						if (i_47_ != modelToolkit.Z())
							i |= 0x2000;
					}
					if (null == modelToolkit || graphicsToolkit.method5017(modelToolkit.m(), i) != 0) {
						int i_53_ = i | 0x1f01f;
						if (modelToolkit != null)
							i_53_ = graphicsToolkit.method5004(i_53_, modelToolkit.m());
						BaseModel model = null;
						synchronized (this.loader.aClass64Array5443) {
							for (int i_54_ = 0; i_54_ < i_51_; i_54_++) {
								synchronized (this.loader.modelsCache) {
									model = (BaseModel.load((this.loader.modelsCache), is[i_54_], 0));
								}
								if (null == model) {
									ModelToolkit class387_55_ = null;
									return class387_55_;
								}
								if (model.format < 13)
									model.scaleUp(2);
								if (i_51_ > 1)
									this.loader.aClass64Array5443[i_54_] = model;
							}
							if (i_51_ > 1)
								model = new BaseModel((this.loader.aClass64Array5443), i_51_);
						}
						modelToolkit = graphicsToolkit.creatModelToolkit(model, i_53_, (this.loader.anInt5453) * -914670477, i_46_, i_47_);
						synchronized (this.loader.aClass348_5450) {
							this.loader.aClass348_5450.put(modelToolkit, l);
						}
					}
				}
			}
			if (null == modelToolkit)
				return null;
			ModelToolkit class387_56_ = modelToolkit.method4755((byte) 0, i, true);
			if (i_46_ != modelToolkit.c())
				class387_56_.p(i_46_);
			if (i_47_ != modelToolkit.Z())
				class387_56_.Q(i_47_);
			if (bool)
				class387_56_.wa();
			if (i_43_ == Class424.aClass424_6596.type * -1976050083 && i_44_ > 3) {
				class387_56_.S(2048);
				class387_56_.ia(180, 0, -180);
			}
			i_44_ &= 0x3;
			if (1 == i_44_)
				class387_56_.S(4096);
			else if (2 == i_44_)
				class387_56_.S(8192);
			else if (i_44_ == 3)
				class387_56_.S(12288);
			if (null != this.aShortArray5369) {
				short[] is;
				if (class435 != null && class435.aShortArray5462 != null)
					is = class435.aShortArray5462;
				else
					is = aShortArray5367;
				for (int i_57_ = 0; i_57_ < this.aShortArray5369.length; i_57_++) {
					if (this.aByteArray5371 != null && i_57_ < this.aByteArray5371.length)
						class387_56_.X((this.aShortArray5369[i_57_]), aShortArray5423[(this.aByteArray5371[i_57_]) & 0xff]);
					else
						class387_56_.X((this.aShortArray5369[i_57_]), is[i_57_]);
				}
			}
			if (null != this.aShortArray5372) {
				short[] is;
				if (null != class435 && null != class435.aShortArray5461)
					is = class435.aShortArray5461;
				else
					is = aShortArray5373;
				for (int i_58_ = 0; i_58_ < this.aShortArray5372.length; i_58_++)
					class387_56_.W(this.aShortArray5372[i_58_], is[i_58_]);
			}
			if (0 != this.aByte5377)
				class387_56_.PA(this.aByte5417, this.aByte5375, this.aByte5415, this.aByte5377 & 0xff);
			if (-166422633 * this.anInt5406 != 128 || 668312333 * this.anInt5407 != 128 || 128 != -895192829 * this.anInt5414)
				class387_56_.oa(this.anInt5406 * -166422633, this.anInt5407 * 668312333, this.anInt5414 * -895192829);
			if (0 != this.anInt5379 * -1514641891 || 0 != 1536191987 * this.anInt5396 || 0 != this.anInt5411 * 2145431327)
				class387_56_.ia(-1514641891 * this.anInt5379, this.anInt5396 * 1536191987, this.anInt5411 * 2145431327);
			class387_56_.KA(i_48_);
			return class387_56_;
	}

	public int method5776(int key, int i_59_) {
			if (null == this.aClass437_5435)
				return i_59_;
			IntNode intNode = ((IntNode) this.aClass437_5435.get((long) key));
			if (null == intNode)
				return i_59_;
			return -774922497 * intNode.capacity;
	}

	public final ObjectDefinition method5777(Interface23 interface23) {
			int objectIndex = -1;
			if (this.anInt5420 * 1064010385 != -1)
				objectIndex = interface23.method250((this.anInt5420 * 1064010385));
			else if (-1128963393 * this.anInt5421 != -1)
				objectIndex = interface23.method252((this.anInt5421 * -1128963393));
			if (objectIndex < 0 || objectIndex >= objectIDs.length - 1 || -1 == objectIDs[objectIndex]) {
				int objectID = objectIDs[objectIDs.length - 1];
				if (-1 != objectID)
					return this.loader.get(objectID);
				return null;
			}
			return this.loader.get(objectIDs[objectIndex]);
	}

	void method5778() {
			if (1532834983 * anInt5382 == -1) {
				anInt5382 = 0;
				if (null != types && 1 == types.length && (types[0] == Class424.aClass424_6611.type * -1976050083))
					anInt5382 = 455422743;
				for (int i_63_ = 0; i_63_ < 5; i_63_++) {
					if (null != options[i_63_]) {
						anInt5382 = 455422743;
						break;
					}
				}
			}
			if (512737201 * anInt5409 == -1)
				anInt5409 = 1763780945 * (clipType * -2144543407 != 0 ? 1 : 0);
			if (objectAnimationExists() || aBoolean5381 || null != objectIDs)
				aBoolean5389 = true;
	}

	public boolean objectAnimationExists() {
			return this.objectAnimationIDs != null;
	}

	public boolean objectAnimationsExist() {
			return (this.objectAnimationIDs != null && this.objectAnimationIDs.length > 1);
	}

	public int method5781() {
			if (null != this.objectAnimationIDs) {
				if (this.objectAnimationIDs.length > 1) {
					int i_64_ = (int) (Math.random() * 65535.0);
					for (int i_65_ = 0; i_65_ < this.objectAnimationIDs.length; i_65_++) {
						if (i_64_ <= this.anIntArray5390[i_65_])
							return this.objectAnimationIDs[i_65_];
						i_64_ -= this.anIntArray5390[i_65_];
					}
				} else
					return this.objectAnimationIDs[0];
			}
			return -1;
	}

	public int[] getObjectAnimations() {
			return this.objectAnimationIDs;
	}

	void method5783(Buffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_66_ = class298_sub53.readUByte();
				if (i_66_ == 0) {
					if (i != -1780393822) {
						/* empty */
					}
					break;
				}
				decode(class298_sub53, i_66_);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rw.a(").append(')').toString());
		}
	}

	ObjectDefinition() {
		sizeY = 44056569;
		clipType = -2019485854;
		objectBlocksFly = true;
		anInt5382 = -455422743;
		this.aByte5363 = (byte) 0;
		this.anInt5384 = 242181565;
		aBoolean5385 = false;
		anInt5376 = 325083707;
		anInt5387 = 1675091776;
		anInt5388 = 0;
		this.objectAnimationIDs = null;
		this.anIntArray5390 = null;
		anInt5391 = -83909056;
		this.anInt5392 = 0;
		this.anInt5393 = 0;
		anInt5436 = 1320066331;
		anInt5364 = -474865427;
		anInt5397 = -2064530465;
		anInt5398 = -1406097311;
		anInt5399 = 779127471;
		anInt5400 = -475870643;
		aBoolean5401 = false;
		anInt5402 = 0;
		aBoolean5440 = false;
		aBoolean5404 = false;
		aBoolean5405 = true;
		this.anInt5406 = -1280568448;
		this.anInt5407 = -319692160;
		this.anInt5414 = -1992239744;
		this.anInt5379 = 0;
		this.anInt5396 = 0;
		this.anInt5411 = 0;
		this.anInt5412 = 0;
		this.anInt5413 = 0;
		this.anInt5419 = 0;
		aBoolean5410 = false;
		objectBlocksWalkAlternative = false;
		anInt5409 = -1763780945;
		anInt5418 = 0;
		this.anInt5420 = 1228374415;
		this.anInt5421 = 2115564225;
		anInt5422 = 349046175;
		anInt5408 = 0;
		anInt5437 = 0;
		anInt5425 = 2118857365;
		aBoolean5426 = false;
		anInt5427 = 0;
		anInt5428 = 0;
		aBoolean5395 = false;
		aBoolean5431 = true;
		aBoolean5432 = false;
		aBoolean5433 = true;
		aBoolean5434 = false;
		aBoolean5381 = false;
		anInt5438 = 1861779200;
		anInt5439 = 1687920384;
		aBoolean5389 = false;
		aBoolean5441 = false;
	}

	public boolean method5784() {
		try {
			if (null == objectIDs)
				return anInt5422 * 393750945 != -1 || anIntArray5429 != null;
			for (int i_67_ = 0; i_67_ < objectIDs.length; i_67_++) {
				if (objectIDs[i_67_] != -1) {
					ObjectDefinition class432_68_ = this.loader.get(objectIDs[i_67_]);
					if (-1 != 393750945 * class432_68_.anInt5422 || null != class432_68_.anIntArray5429)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rw.n(").append(')').toString());
		}
	}

	public final synchronized FontMetricsDefinitionLoader method5785(GraphicsToolkit class_ra, int i, int i_69_, int i_70_, FloorToolkit class_xa, FloorToolkit class_xa_71_, int i_72_, int i_73_, int i_74_, boolean bool, Class435 class435, int i_75_) {
		try {
			if (StaticMethods.method4261(i_69_))
				i_69_ = Class424.aClass424_6596.type * -1976050083;
			long l = (long) ((1181652947 * objectID << 10) + (i_69_ << 3) + i_70_);
			l |= (long) (class_ra.id * 580915349 << 29);
			if (class435 != null)
				l |= (2595045048596347611L * class435.key << 32);
			int i_76_ = i;
			if (3 == this.aByte5363)
				i_76_ |= 0x7;
			else {
				if (0 != this.aByte5363 || 52797131 * this.anInt5413 != 0)
					i_76_ |= 0x2;
				if (945504799 * this.anInt5412 != 0)
					i_76_ |= 0x1;
				if (1782732613 * this.anInt5419 != 0)
					i_76_ |= 0x4;
			}
			if (bool)
				i_76_ |= 0x40000;
			FontMetricsDefinitionLoader loader;
			synchronized (this.loader.aClass348_5452) {
				loader = (FontMetricsDefinitionLoader) this.loader.aClass348_5452.get(l);
			}
			ModelToolkit modelToolkit = (ModelToolkit) (loader != null ? loader.toolkit : null);
			Class_na class_na = null;
			do {
				if (modelToolkit == null || class_ra.method5017(modelToolkit.m(), i_76_) != 0) {
					if (null != modelToolkit)
						i_76_ = class_ra.method5004(i_76_, modelToolkit.m());
					int i_77_ = i_76_;
					if ((i_69_ == Class424.aClass424_6611.type * -1976050083) && i_70_ > 3)
						i_77_ |= 0x5;
					modelToolkit = method5775(class_ra, i_77_, i_69_, i_70_, class435);
					if (modelToolkit == null)
						return null;
					if ((i_69_ == Class424.aClass424_6611.type * -1976050083) && i_70_ > 3)
						modelToolkit.f(2048);
					if (bool)
						class_na = modelToolkit.ga(null);
					modelToolkit.KA(i_76_);
					loader = new FontMetricsDefinitionLoader(modelToolkit, class_na);
					synchronized (this.loader.aClass348_5452) {
						this.loader.aClass348_5452.put(loader, l);
						break;
					}
				}
				class_na = (Class_na) loader.anObject5646;
				if (bool && class_na == null)
					class_na = (Class_na) (loader.anObject5646 = modelToolkit.ga(null));
			} while (false);
			boolean bool_78_ = (this.aByte5363 != 0 && (null != class_xa || class_xa_71_ != null));
			boolean bool_79_ = (this.anInt5412 * 945504799 != 0 || this.anInt5413 * 52797131 != 0 || 0 != this.anInt5419 * 1782732613);
			if (bool_78_ || bool_79_) {
				modelToolkit = modelToolkit.method4755((byte) 0, i_76_, true);
				if (bool_78_)
					modelToolkit.pa(this.aByte5363, 1762198123 * this.anInt5384, class_xa, class_xa_71_, i_72_, i_73_, i_74_);
				if (bool_79_)
					modelToolkit.ia(this.anInt5412 * 945504799, 52797131 * this.anInt5413, this.anInt5419 * 1782732613);
				modelToolkit.KA(i);
			} else
				modelToolkit = modelToolkit.method4755((byte) 0, i, true);
			this.loader.aFontMetricsDefinitionLoader_5456.toolkit = modelToolkit;
			this.loader.aFontMetricsDefinitionLoader_5456.anObject5646 = class_na;
			return (this.loader.aFontMetricsDefinitionLoader_5456);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rw.k(").append(')').toString());
		}
	}

	public static Recorder method5786(Buffer class298_sub53, byte i) {
		try {
			Class337 class337 = Class337.method2789(class298_sub53.readUByte());
			if (Class337.aClass337_3627 == class337)
				return Class345.method2201(class298_sub53);
			if (class337 == Class337.aClass337_3625)
				return StaticMethods.method2195(class298_sub53);
			if (class337 == Class337.aClass337_3624)
				return StaticMethods.method5651(class298_sub53);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rw.a(").append(')').toString());
		}
	}

	static final void method5787(ScriptRuntime class403, int i) {
		try {
			if (null != GameClient.aByteArray8843)
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = 1;
			else
				class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rw.ahp(").append(')').toString());
		}
	}

	static void method5789() {
		try {
			StaticMethods.method3751();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("rw.aa(").append(')').toString());
		}
	}
}
