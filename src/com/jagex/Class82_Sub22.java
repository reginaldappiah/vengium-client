package com.jagex;/* Class82_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;
import com.jagex.game.cache.definition.animation.AnimationDefinition;

public class Class82_Sub22 extends Class82 {
	int anInt6902;
	static int anInt6903 = 1;
	int anInt6904;
	int anInt6905;
	static int anInt6906 = 0;
	int anInt6907;
	int anInt6908;
	int anInt6909;
	int anInt6910;
	int anInt6911;
	int anInt6912;
	int anInt6913;
	int anInt6914;
	int anInt6915;
	int anInt6916;
	static int anInt6917;

	boolean method939() {
		SpotType class398 = (SpotTypeLoader.loader.get(1632084697 * this.anInt6908));
		boolean bool = class398.method4919();
		AnimationDefinition class391 = Js5Configs.animsList.get(class398.animationID * 1505778629);
		bool &= class391.ready();
		return bool;
	}

	Class82_Sub22(Buffer class298_sub53, int i, int i_0_) {
		super(class298_sub53);
		if (i == 0) {
			int i_1_ = class298_sub53.readInt();
			this.anInt6902 = (i_1_ >>> 16) * -46611099;
			this.anInt6907 = 415557701 * (i_1_ & 0xffff);
			this.anInt6905 = 425099019;
		} else {
			this.anInt6902 = 46611099;
			this.anInt6907 = -415557701;
			this.anInt6905 = class298_sub53.readUShort() * -425099019;
		}
		if (0 == i_0_) {
			int i_2_ = class298_sub53.readInt();
			this.anInt6913 = 1611083453 * (i_2_ >>> 16);
			this.anInt6911 = (i_2_ & 0xffff) * -1666710765;
			this.anInt6909 = -514357691;
		} else {
			this.anInt6913 = -1611083453;
			this.anInt6911 = 1666710765;
			this.anInt6909 = class298_sub53.readUShort() * 514357691;
		}
		if (i == 0 && i_0_ == 0)
			this.anInt6910 = class298_sub53.readUByte() * -776341541;
		else
			this.anInt6910 = 776341541;
		this.anInt6908 = class298_sub53.readUShort() * 587513193;
		this.anInt6916 = class298_sub53.readUByte() * -479097679;
		this.anInt6912 = class298_sub53.readUByte() * -666257507;
		this.anInt6904 = class298_sub53.readUTriByte() * 856962157;
		this.anInt6915 = class298_sub53.readUShort() * 1304794705;
		this.anInt6914 = class298_sub53.readUByte() * -757238655;
	}

	boolean method870() {
		try {
			SpotType class398 = SpotTypeLoader.loader.get((1632084697 * this.anInt6908));
			boolean bool = class398.method4919();
			AnimationDefinition class391 = Js5Configs.animsList.get(class398.animationID * 1505778629);
			bool &= class391.ready();
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yu.p(").append(')').toString());
		}
	}

	public void method868() {
		int i;
		int i_3_;
		int i_4_;
		if (227468397 * this.anInt6902 >= 0) {
			i = 256 + this.anInt6902 * 499702272;
			i_3_ = 256 + this.anInt6907 * 869603840;
			i_4_ = this.anInt6910 * -356438957;
		} else {
			Entity class365_sub1_sub1_sub2 = Class87.aClass94Array794[this.anInt6905 * -153670819].method1015();
			Vector3f class217 = class365_sub1_sub1_sub2.getWorldTransform().trans;
			i = (int) class217.x;
			i_3_ = (int) class217.z;
			i_4_ = class365_sub1_sub1_sub2.plane;
		}
		int i_5_;
		int i_6_;
		if (916056717 * this.anInt6907 >= 0) {
			i_5_ = this.anInt6913 * -679925248 + 256;
			i_6_ = 1149122048 * this.anInt6911 + 256;
		} else {
			Entity class365_sub1_sub1_sub2 = Class87.aClass94Array794[this.anInt6909 * -1629854861].method1015();
			Vector3f class217 = class365_sub1_sub1_sub2.getWorldTransform().trans;
			i_5_ = (int) class217.x;
			i_6_ = (int) class217.z;
			if (i_4_ < 0)
				i_4_ = class365_sub1_sub1_sub2.plane;
		}
		int i_7_ = this.anInt6914 * 1745275777 << 2;
		Projectile class365_sub1_sub1_sub1 = (new Projectile(GameClient.myRegion.getRegion(), this.anInt6908 * 1632084697, i_4_, i_4_, i, i_3_, this.anInt6916 * 266943569 << 2, GameClient.clientTick * 443738891, (929559909 * this.anInt6904 + GameClient.clientTick * 443738891), -1300008271 * this.anInt6915, i_7_, this.anInt6905 * -153670819 + 1, 1 + -1629854861 * this.anInt6909, this.anInt6912 * 172590773 << 2, false, 0));
		class365_sub1_sub1_sub1.method4405(i_5_, i_6_, 172590773 * this.anInt6912 << 2, (GameClient.clientTick * 443738891 + 929559909 * this.anInt6904));
		GameClient.aClass453_8824.pushBack(new Class298_Sub37_Sub2(class365_sub1_sub1_sub1));
	}

	public void method869() {
		int i;
		int i_8_;
		int i_9_;
		if (227468397 * this.anInt6902 >= 0) {
			i = 256 + this.anInt6902 * 499702272;
			i_8_ = 256 + this.anInt6907 * 869603840;
			i_9_ = this.anInt6910 * -356438957;
		} else {
			Entity class365_sub1_sub1_sub2 = Class87.aClass94Array794[this.anInt6905 * -153670819].method1015();
			Vector3f class217 = class365_sub1_sub1_sub2.getWorldTransform().trans;
			i = (int) class217.x;
			i_8_ = (int) class217.z;
			i_9_ = class365_sub1_sub1_sub2.plane;
		}
		int i_10_;
		int i_11_;
		if (916056717 * this.anInt6907 >= 0) {
			i_10_ = this.anInt6913 * -679925248 + 256;
			i_11_ = 1149122048 * this.anInt6911 + 256;
		} else {
			Entity class365_sub1_sub1_sub2 = Class87.aClass94Array794[this.anInt6909 * -1629854861].method1015();
			Vector3f class217 = class365_sub1_sub1_sub2.getWorldTransform().trans;
			i_10_ = (int) class217.x;
			i_11_ = (int) class217.z;
			if (i_9_ < 0)
				i_9_ = class365_sub1_sub1_sub2.plane;
		}
		int i_12_ = this.anInt6914 * 1745275777 << 2;
		Projectile class365_sub1_sub1_sub1 = (new Projectile(GameClient.myRegion.getRegion(), this.anInt6908 * 1632084697, i_9_, i_9_, i, i_8_, this.anInt6916 * 266943569 << 2, GameClient.clientTick * 443738891, (929559909 * this.anInt6904 + GameClient.clientTick * 443738891), -1300008271 * this.anInt6915, i_12_, this.anInt6905 * -153670819 + 1, 1 + -1629854861 * this.anInt6909, this.anInt6912 * 172590773 << 2, false, 0));
		class365_sub1_sub1_sub1.method4405(i_10_, i_11_, 172590773 * this.anInt6912 << 2, (GameClient.clientTick * 443738891 + 929559909 * this.anInt6904));
		GameClient.aClass453_8824.pushBack(new Class298_Sub37_Sub2(class365_sub1_sub1_sub1));
	}

	public void method866() {
		try {
			int i_13_;
			int i_14_;
			int i_15_;
			if (227468397 * this.anInt6902 >= 0) {
				i_13_ = 256 + this.anInt6902 * 499702272;
				i_14_ = 256 + this.anInt6907 * 869603840;
				i_15_ = this.anInt6910 * -356438957;
			} else {
				Entity class365_sub1_sub1_sub2 = Class87.aClass94Array794[this.anInt6905 * -153670819].method1015();
				Vector3f class217 = class365_sub1_sub1_sub2.getWorldTransform().trans;
				i_13_ = (int) class217.x;
				i_14_ = (int) class217.z;
				i_15_ = class365_sub1_sub1_sub2.plane;
			}
			int i_16_;
			int i_17_;
			if (916056717 * this.anInt6907 >= 0) {
				i_16_ = this.anInt6913 * -679925248 + 256;
				i_17_ = 1149122048 * this.anInt6911 + 256;
			} else {
				Entity class365_sub1_sub1_sub2 = Class87.aClass94Array794[this.anInt6909 * -1629854861].method1015();
				Vector3f class217 = class365_sub1_sub1_sub2.getWorldTransform().trans;
				i_16_ = (int) class217.x;
				i_17_ = (int) class217.z;
				if (i_15_ < 0)
					i_15_ = class365_sub1_sub1_sub2.plane;
			}
			int i_18_ = this.anInt6914 * 1745275777 << 2;
			Projectile class365_sub1_sub1_sub1 = (new Projectile(GameClient.myRegion.getRegion(), this.anInt6908 * 1632084697, i_15_, i_15_, i_13_, i_14_, this.anInt6916 * 266943569 << 2, GameClient.clientTick * 443738891, (929559909 * this.anInt6904 + GameClient.clientTick * 443738891), -1300008271 * this.anInt6915, i_18_, this.anInt6905 * -153670819 + 1, 1 + -1629854861 * this.anInt6909, this.anInt6912 * 172590773 << 2, false, 0));
			class365_sub1_sub1_sub1.method4405(i_16_, i_17_, 172590773 * this.anInt6912 << 2, (GameClient.clientTick * 443738891 + 929559909 * this.anInt6904));
			GameClient.aClass453_8824.pushBack(new Class298_Sub37_Sub2(class365_sub1_sub1_sub1));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yu.f(").append(')').toString());
		}
	}

	static final void method940(int[] is, int i, int i_19_, int i_20_) {
		try {
			i--;
			int i_22_ = --i_19_ - 7;
			while (i < i_22_) {
				is[++i] = i_20_;
				is[++i] = i_20_;
				is[++i] = i_20_;
				is[++i] = i_20_;
				is[++i] = i_20_;
				is[++i] = i_20_;
				is[++i] = i_20_;
				is[++i] = i_20_;
			}
			while (i <= i_19_)
				is[++i] = i_20_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("yu.b(").append(')').toString());
		}
	}
}
