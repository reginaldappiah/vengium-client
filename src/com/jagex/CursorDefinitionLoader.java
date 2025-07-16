package com.jagex;/* Class491 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.ConfigType;

public class CursorDefinitionLoader {
	Js5FileSystem aClass243_6076;
	Js5FileSystem aClass243_6077;
	SoftCache aClass348_6078;
	SoftCache aClass348_6079 = new SoftCache(64);

    public void clear() {
		try {
			synchronized (this.aClass348_6079) {
				this.aClass348_6079.clear();
			}
			synchronized (this.aClass348_6078) {
				this.aClass348_6078.clear();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("uf.f(").append(')').toString());
		}
	}

	public Class492 method6172(int i, int i_0_) {
		try {
			Class492 class492;
			synchronized (this.aClass348_6079) {
				class492 = (Class492) this.aClass348_6079.get((long) i);
			}
			if (null != class492)
				return class492;
			byte[] is;
			synchronized (this.aClass243_6076) {
				is = (this.aClass243_6076.getFileFromArchive(-1006924897 * ConfigType.CURSORS.type, i));
			}
			class492 = new Class492();
			class492.aClass491_6082 = this;
			if (is != null)
				class492.method6180(new Buffer(is), 1638036980);
			synchronized (this.aClass348_6079) {
				this.aClass348_6079.put(class492, (long) i);
			}
			return class492;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("uf.a(").append(')').toString());
		}
	}

	public void sweep() {
		try {
			synchronized (this.aClass348_6079) {
				this.aClass348_6079.sweep();
			}
			synchronized (this.aClass348_6078) {
				this.aClass348_6078.sweep();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("uf.p(").append(')').toString());
		}
	}

	public void method6174(int i, byte i_1_) {
		try {
			synchronized (this.aClass348_6079) {
				this.aClass348_6079.method4186(i);
			}
			synchronized (this.aClass348_6078) {
				this.aClass348_6078.method4186(i);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("uf.b(").append(')').toString());
		}
	}

	public CursorDefinitionLoader(Js5FileSystem class243, Js5FileSystem class243_2_) {
		this.aClass348_6078 = new SoftCache(2);
		this.aClass243_6076 = class243;
		this.aClass243_6077 = class243_2_;
		this.aClass243_6076.getFileSystem((ConfigType.CURSORS.type) * -1006924897);
	}

	static final void stoppingCameraShake(long time) {
			Vector3f vector3f = (Player.myPlayer.getWorldTransform().trans);
			int i = 1734240325 * GameClient.anInt8817 + (int) vector3f.x;
			int i_3_ = GameClient.anInt8742 * 1874511679 + (int) vector3f.z;
			if (Class75.anInt708 * 1103750049 - i < -2000 || Class75.anInt708 * 1103750049 - i > 2000 || Class106.anInt1309 * 1346160791 - i_3_ < -2000 || Class106.anInt1309 * 1346160791 - i_3_ > 2000) {
				Class75.anInt708 = i * -1832337311;
				Class106.anInt1309 = 1831024423 * i_3_;
			}
			if (Class75.anInt708 * 1103750049 != i) {
				int i_4_ = i - Class75.anInt708 * 1103750049;
				int i_5_ = (int) ((long) i_4_ * time / 320L);
				if (i_4_ > 0) {
					if (0 == i_5_)
						i_5_ = 1;
					else if (i_5_ > i_4_)
						i_5_ = i_4_;
				} else if (i_5_ == 0)
					i_5_ = -1;
				else if (i_5_ < i_4_)
					i_5_ = i_4_;
				Class75.anInt708 += i_5_ * -1832337311;
			}
			if (1346160791 * Class106.anInt1309 != i_3_) {
				int i_6_ = i_3_ - Class106.anInt1309 * 1346160791;
				int i_7_ = (int) (time * (long) i_6_ / 320L);
				if (i_6_ > 0) {
					if (0 == i_7_)
						i_7_ = 1;
					else if (i_7_ > i_6_)
						i_7_ = i_6_;
				} else if (i_7_ == 0)
					i_7_ = -1;
				else if (i_7_ < i_6_)
					i_7_ = i_6_;
				Class106.anInt1309 += 1831024423 * i_7_;
			}
			GameClient.cameraXAngle += (float) time * GameClient.aFloat8759 / 6.0F;
			GameClient.cameraYAngle += GameClient.aFloat8760 * (float) time / 6.0F;
			Class91.adjustCamera();
	}

}
