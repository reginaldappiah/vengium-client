package com.jagex;/* Class277 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.maths.Matrix43f;
import com.jagex.maths.Matrix4f;
import com.jagex.network.OutgoingPacket;

public class Skybox {
	int anInt2939;
	int d;
	ModelToolkit aClass387_2941;
	Class276 aClass276_2942;
	static int anInt2943 = 512;
	Class320 aClass320_2944;
	int anInt2945;
	int anInt2946;
	int anInt2947;
	int b;
	Class276[] aClass276Array2949;
	SpriteToolkit aClass57_2950;
	int anInt2951;
	int anInt2952;
	Class276[] aClass276Array2953;
	boolean aBoolean2954;
	static MaterialRawLoader anInterface_ma2955;
	int anInt2956;
	int a;
	byte[] aByteArray2958;
	boolean aBoolean2959;
	Skybox aClass277_2960;
	int anInt2961;
	int c;
	int anInt2963 = -697848799;
	static Skybox skybox;
	static int anInt2964;

	public void method2583(int i, int i_0_) {
		try {
			if (this.aBoolean2959) {

			}
			this.anInt2961 = -1739514523 * (i * (i_0_ - -1519560585 * (this.anInt2947)) / 255 + -1519560585 * this.anInt2947);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lm.b(").append(')').toString());
		}
	}

	public void method2584(Skybox skybox) {
			if (this.aBoolean2959)
				this.anInt2947 = 967778107 * this.anInt2961;
			else if (skybox != null && skybox.aBoolean2959)
				this.anInt2947 = (-910867015 - 967778107 * skybox.anInt2961);
			else
				this.anInt2947 = 0;
			this.aBoolean2959 = true;
			this.aClass277_2960 = skybox;
			this.anInt2961 = 0;
	}

	public void method2585() {
		try {
			this.aBoolean2959 = false;
			this.aClass277_2960 = null;
			this.anInt2961 = 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lm.i(").append(')').toString());
		}
	}

	public boolean method2586() {
		try {
			return this.aBoolean2959;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lm.k(").append(')').toString());
		}
	}

	public Skybox method2587() {
		try {
			return this.aClass277_2960;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lm.d(").append(')').toString());
		}
	}

	public boolean method2588(GraphicsToolkit graphicsToolkit, int i, int i_3_) {
		try {
			if (-51566561 * this.anInt2963 != i) {
				this.anInt2963 = 697848799 * i;
				int i_5_ = StaticMethods.method5639(i);
				if (i_5_ > 512)
					i_5_ = 512;
				if (i_5_ <= 0)
					i_5_ = 1;
				if (i_5_ != this.anInt2946 * -1994130525) {
					this.anInt2946 = i_5_ * 285085707;
					this.aClass57_2950 = null;
				}
				if (null != this.aClass276Array2949) {
					this.anInt2945 = 0;
					int[] is = new int[this.aClass276Array2949.length];
					for (int i_6_ = 0; i_6_ < this.aClass276Array2949.length; i_6_++) {
						Class276 class276 = this.aClass276Array2949[i_6_];
						if (class276.method2579(this.a * 1173193129, 796478559 * this.b, -226559159 * this.c, this.anInt2963 * -51566561)) {
							is[this.anInt2945 * 1858024591] = class276.anInt2919;
							this.aClass276Array2953[((this.anInt2945 += 400255599) * 1858024591) - 1] = class276;
						}
					}
					Class419.method5602(is, this.aClass276Array2953, 0, (1858024591 * this.anInt2945) - 1);
				}
				this.aBoolean2954 = true;
			}
			boolean bool = false;
			if (this.aBoolean2954) {
				this.aBoolean2954 = false;
				for (int i_7_ = this.anInt2945 * 1858024591 - 1; i_7_ >= 0; i_7_--) {
					boolean bool_8_ = (this.aClass276Array2953[i_7_].method2575(graphicsToolkit, this.aClass276_2942));
					Skybox class277_9_ = this;
					class277_9_.aBoolean2954 = class277_9_.aBoolean2954 | !bool_8_;
					bool |= bool_8_;
				}
			}
			if (0 == i_3_ || !graphicsToolkit.method4996())
				this.aClass387_2941 = null;
			else if (this.aClass387_2941 == null && this.anInt2956 * -680590445 >= 0)
				method2589(graphicsToolkit);
			if (this.aClass277_2960 != null && this.aClass277_2960 != this) {
				this.aClass277_2960.method2585();
				bool |= this.aClass277_2960.method2588(graphicsToolkit, i, i_3_);
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lm.u(").append(')').toString());
		}
	}

	void method2589(GraphicsToolkit graphicsToolkit) {
		try {
			try {
				boolean bool = Class465.aClass243_6520.loadContainer((-680590445 * (this.anInt2956)));
				if (bool) {
					graphicsToolkit.updateSun(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
					BaseModel baseModel = BaseModel.load(Class465.aClass243_6520, (this.anInt2956 * -680590445), 0);
					this.aClass387_2941 = graphicsToolkit.creatModelToolkit(baseModel, 1099776, 0, 255, 1);
					byte[] data = this.aClass387_2941.ah();
					if (null == data)
						this.aByteArray2958 = null;
					else {
						this.aByteArray2958 = new byte[data.length];
						System.arraycopy(data, 0, this.aByteArray2958, 0, data.length);
					}
				}
			} catch (Exception exception) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lm.posX(").append(')').toString());
		}
	}

	public void method2590(GraphicsToolkit toolkit, int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_) {
			render(toolkit, i, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_, 0, i_17_, true, false);
	}

	public void render(GraphicsToolkit toolkit, int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, boolean bool, boolean bool_27_) {
			int i_29_ = 0;
			if (this.aBoolean2959)
				i_29_ = this.anInt2961 * 1447218285;
			if (null != this.aClass277_2960) {
				Skybox skybox = this;
				Skybox class277_31_ = this.aClass277_2960;
				if (skybox.hashCode() > class277_31_.hashCode()) {
					skybox = this.aClass277_2960;
					class277_31_ = this;
					i_29_ = 255 - i_29_;
				}
				skybox.method2593(toolkit, i, i_19_, i_20_, i_21_, i_22_, i_23_, i_24_, i_25_, i_26_, bool, bool_27_, i_29_, 2089062848);
				class277_31_.method2593(toolkit, i, i_19_, i_20_, i_21_, i_22_, i_23_, i_24_, i_25_, i_26_, false, bool_27_, 255 - i_29_, 357729081);
			} else
				method2593(toolkit, i, i_19_, i_20_, i_21_, i_22_, i_23_, i_24_, i_25_, i_26_, bool, bool_27_, i_29_, 1191709910);
	}

	void method2592(GraphicsToolkit toolkit, int i, int i_32_, int i_33_, int i_34_, int i_35_) {
			Matrix43f class222 = toolkit.method5044();
			Matrix43f class222_36_ = new Matrix43f();
			class222_36_.setMatrix(0.0F, 0.0F, 0.0F);
			class222_36_.rotate(0.0F, -1.0F, 0.0F, CircleAngleTable.toDegrees(-i_32_ & 0x3fff));
			class222_36_.rotate(-1.0F, 0.0F, 0.0F, CircleAngleTable.toDegrees(-i & 0x3fff));
			class222_36_.rotate(0.0F, 0.0F, -1.0F, CircleAngleTable.toDegrees(-i_33_ & 0x3fff));
			toolkit.cw(class222_36_);
			Matrix43f class222_37_ = new Matrix43f();
			if (738421895 * this.anInt2951 != i_34_) {
				this.aClass387_2941.method4742((byte) i_34_, (this.aByteArray2958));
				this.anInt2951 = i_34_ * -299787977;
			}
			this.aClass387_2941.render(class222_37_, null, 0);
			toolkit.cw(class222);
	}

	void method2593(GraphicsToolkit graphicsToolkit, int i, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, boolean bool, boolean bool_46_, int i_47_, int i_48_) {
		try {
			int i_49_ = 255 - i_47_;
			if (this.aClass387_2941 == null) {
				graphicsToolkit.clear(2, 0);
				i_43_ = i_43_ + i & 0x3fff;
				if (this.d * 1461948177 != -1 && this.anInt2946 * -1994130525 != 0) {
					Class53 class53 = anInterface_ma2955.method174(((this.d) * 1461948177));
					if (null == this.aClass57_2950 && anInterface_ma2955.method170(((this.d) * 1461948177), (short) 28045)) {
						int[] is = (2 == -2138060883 * class53.anInt528 ? (anInterface_ma2955.method172(this.d * 1461948177, 0.7F, -1994130525 * this.anInt2946, this.anInt2946 * -1994130525, false, (byte) 2)) : (anInterface_ma2955.method171(this.d * 1461948177, 0.7F, -1994130525 * this.anInt2946, -1994130525 * this.anInt2946, false, 833981844)));
						this.anInt2939 = is[0] * 1667694183;
						this.anInt2952 = 918308719 * is[is.length - 1];
						this.aClass57_2950 = graphicsToolkit.createRenderSprite(is, 0, (this.anInt2946 * -1994130525), (this.anInt2946 * -1994130525), (this.anInt2946 * -1994130525));
					}
					int i_50_ = (i_49_ == 255 ? class53.anInt528 * -2138060883 == 2 ? 1 : 0 : 1);
					if (1 == i_50_ && bool)
						graphicsToolkit.drawFilledRectangle(i_38_, i_39_, i_40_, i_41_, i_45_, 0);
					if (this.aClass57_2950 != null) {
						int i_51_ = i_42_ * i_41_ / -4096;
						int i_52_;
						for (i_52_ = (i_40_ - i_41_) / 2 + i_43_ * i_41_ / 4096; i_52_ > i_41_; i_52_ -= i_41_) {
							/* empty */
						}
						for (/**/; i_52_ < 0; i_52_ += i_41_) {
							/* empty */
						}
						if (this.aClass320_2944 == Class320.aClass320_6547) {
							for (int i_53_ = i_52_ - i_41_; i_53_ < i_40_; i_53_ += i_41_)
								this.aClass57_2950.method691(i_38_ + i_53_, i_51_ + i_39_, i_41_, i_41_, 0, i_49_ << 24 | 0xffffff, i_50_);
							if ((150420823 * this.anInt2939 & ~0xffffff) != 0)
								graphicsToolkit.fillRectangle(0, 0, i_40_, 1 + (i_39_ + i_51_), (150420823 * (this.anInt2939)));
							if (0 != (this.anInt2952 * 1184429967 & ~0xffffff))
								graphicsToolkit.fillRectangle(0, i_51_ + i_39_ + i_41_, i_40_, i_41_ - (i_41_ + (i_51_ + i_39_)), this.anInt2952 * 1184429967);
						} else {
							for (/**/; i_51_ > i_41_; i_51_ -= i_41_) {
								/* empty */
							}
							for (/**/; i_51_ < 0; i_51_ += i_41_) {
								/* empty */
							}
							for (int i_54_ = i_52_ - i_41_; i_54_ < i_40_; i_54_ += i_41_) {
								for (int i_55_ = i_51_ - i_41_; i_55_ < i_41_; i_55_ += i_41_)
									this.aClass57_2950.method691(i_38_ + i_54_, i_39_ + i_55_, i_41_, i_41_, 0, i_49_ << 24 | 0xffffff, i_50_);
							}
						}
					}
				} else
					graphicsToolkit.drawFilledRectangle(i_38_, i_39_, i_40_, i_41_, i_49_ << 24 | i_45_, 1);
			} else if (bool_46_) {
				Matrix4f matrix4f = graphicsToolkit.method5045();
				Matrix4f matrix4f_56_ = graphicsToolkit.method5045();
				matrix4f.aFloatArray2594[2] = matrix4f.aFloatArray2594[3];
				matrix4f.aFloatArray2594[6] = matrix4f.aFloatArray2594[7];
				matrix4f.aFloatArray2594[10] = matrix4f.aFloatArray2594[11];
				matrix4f.aFloatArray2594[14] = matrix4f.aFloatArray2594[15];
				graphicsToolkit.ci(matrix4f);
				method2592(graphicsToolkit, i_42_, i_43_, i_44_, i_47_, -1456826082);
				graphicsToolkit.ci(matrix4f_56_);
			} else {
				if (bool)
					graphicsToolkit.clear(3, i_45_);
				method2592(graphicsToolkit, i_42_, i_43_, i_44_, i_47_, -1935584987);
			}
			for (int i_57_ = this.anInt2945 * 1858024591 - 1; i_57_ >= 0; i_57_--)
				this.aClass276Array2953[i_57_].method2577(graphicsToolkit, i_38_, i_39_, i_40_, i_41_, i_42_, i_43_, 1173193129 * this.a, this.b * 796478559, this.c * -226559159, i_49_);
			graphicsToolkit.clear(2, 0);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("lm.n(").append(')').toString());
		}
	}

	public Skybox(int i, Class276[] class276s, int i_58_, int a, int b, int c, Class320 class320, int i_62_) {
		this.aBoolean2954 = true;
		this.a = a * 91665049;
		this.b = b * -2049962081;
		this.c = c * 2095769337;
		this.d = 318980593 * i;
		this.aClass276Array2949 = class276s;
		this.aClass320_2944 = class320;
		if (class276s != null) {
			this.aClass276Array2953 = new Class276[class276s.length];
			this.aClass276_2942 = i_58_ >= 0 ? class276s[i_58_] : null;
		} else {
			this.aClass276Array2953 = null;
			this.aClass276_2942 = null;
		}
		this.anInt2956 = i_62_ * -2035969381;
	}

	public static void method2598(long[] ls, int[] is) {
			StaticMethods.method533(ls, is, 0, ls.length - 1);
	}

	public static void sendWalkPacket(Class336 class336) {
		sendWalkPacket(0, class336);
	}

	public static void sendWalkPacket(int type, Class336 class336) {
		int stepsCount = (StaticMethods.calculateRoute((Player.myPlayer.scenePositionXQueue[0]), (Player.myPlayer.scenePositionYQueue[0]), Player.myPlayer.getSize(), class336, (GameClient.myRegion.getSceneClipDataPlane((Player.myPlayer.plane))), true, GameClient.calculatedScenePositionXs, GameClient.calculatedScenePositionYs));

		OutgoingPacketBuffer packet = null;
		if (type == 0)
			packet = Class18.method359(OutgoingPacket.WALKING_PACKET, ConnectionType.gameConnection.encryptor);
		if (type == 1)
			packet = Class18.method359(OutgoingPacket.MINI_WALKING_PACKET, ConnectionType.gameConnection.encryptor);
		packet.payload.writeByte(5 + stepsCount * 2);
		GameScene gameScene = GameClient.myRegion.getGameScene();
		packet.payload.writeShort128(gameScene.gameSceneBaseX * -1760580017);
		packet.payload.write128Byte(Class151.method1644(-545107710) ? 1 : 0);
		packet.payload.writeShort128(gameScene.gameSceneBaseY * 283514611);
		for (int c = stepsCount - 1; c >= 0; c--) {
			packet.payload.writeByte(Class285.routeFinderXArray[c]);
			packet.payload.writeByte(Class285.routeFinderYArray[c]);
		}
		Minimap.aBoolean63 = false;
		if (stepsCount > 0) {
			Minimap.flagY = Class285.routeFinderYArray[stepsCount - 1] * -1835291189;
			Minimap.flagX = Class285.routeFinderXArray[stepsCount - 1] * -1129029761;
		}
		ConnectionType.gameConnection.sendFrame(packet);
	}

}
