package com.jagex;/* Class299 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.game.cache.config.prefetch.Js5List;

import java.util.Iterator;
import java.util.LinkedList;

public class Class299 {
	int anInt3193;
	int[] anIntArray3194;
	int anInt3195;
	int[] anIntArray3196;
	static int anInt3197 = 0;
	LinkedList aLinkedList3198;
	public static Class370 aClass370_3199;

	public Class299(GraphicsToolkit class_ra, Buffer class298_sub53, int i) {
		this.anInt3195 = -1657032745 * i;
		this.anInt3193 = class298_sub53.readSmartShort() * -1823687737;
		this.anIntArray3194 = new int[-755722761 * this.anInt3193];
		this.anIntArray3196 = new int[this.anInt3193 * -755722761];
		int i_0_ = class298_sub53.readUShort();
		int i_1_ = class298_sub53.readUShort();
		for (int i_2_ = 0; i_2_ < this.anInt3193 * -755722761; i_2_++) {
			this.anIntArray3194[i_2_] = i_0_ + class298_sub53.readByte();
			this.anIntArray3196[i_2_] = i_1_ + class298_sub53.readByte();
		}
		method3679(class_ra, 1723870683);
	}

	public void method3676(Region class331, int i) {
		try {
			if (null != class331 && this.anInt3193 * -755722761 > 0) {
				method3678(class331, 1331512364);
				Iterator iterator = this.aLinkedList3198.iterator();
				while (iterator.hasNext()) {
					Class365_Sub1_Sub1_Sub4 class365_sub1_sub1_sub4 = (Class365_Sub1_Sub1_Sub4) iterator.next();
					class331.method4022(class365_sub1_sub1_sub4, false, (byte) 0);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ml.f(").append(')').toString());
		}
	}

	public void method3677(Region class331, int i) {
		try {
			if (null != class331 && null != this.aLinkedList3198) {
				Iterator iterator = this.aLinkedList3198.iterator();
				while (iterator.hasNext()) {
					Class365_Sub1_Sub1_Sub4 class365_sub1_sub1_sub4 = (Class365_Sub1_Sub1_Sub4) iterator.next();
					class331.method4028(class365_sub1_sub1_sub4.plane, class365_sub1_sub1_sub4.aShort9798, class365_sub1_sub1_sub4.aShort9795, new Class310(class365_sub1_sub1_sub4));
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ml.b(").append(')').toString());
		}
	}

	void method3678(Region class331, int i) {
		try {
			this.aLinkedList3198 = new LinkedList();
			Class244 class244 = GameClient.myRegion.method2654();
			GameScene gameScene = GameClient.myRegion.getGameScene();
			GameScene gameScene_3_ = new GameScene(1855729883 * GameClient.plane, this.anIntArray3194[0], this.anIntArray3196[0]);
			for (int i_4_ = 1; i_4_ < this.anInt3193 * -755722761; i_4_++) {
				GameScene gameScene_5_ = new GameScene(1855729883 * GameClient.plane, this.anIntArray3194[i_4_], this.anIntArray3196[i_4_]);
				while ((gameScene_3_.gameSceneBaseX * -1760580017 != gameScene_5_.gameSceneBaseX * -1760580017) || (gameScene_5_.gameSceneBaseY * 283514611 != 283514611 * gameScene_3_.gameSceneBaseY)) {
					if (-1760580017 * gameScene_3_.gameSceneBaseX < gameScene_5_.gameSceneBaseX * -1760580017)
						gameScene_3_.gameSceneBaseX += 2061281455;
					else if (-1760580017 * gameScene_3_.gameSceneBaseX > gameScene_5_.gameSceneBaseX * -1760580017)
						gameScene_3_.gameSceneBaseX -= 2061281455;
					if (gameScene_3_.gameSceneBaseY * 283514611 < gameScene_5_.gameSceneBaseY * 283514611)
						gameScene_3_.gameSceneBaseY += 1901982267;
					else if (283514611 * gameScene_3_.gameSceneBaseY > gameScene_5_.gameSceneBaseY * 283514611)
						gameScene_3_.gameSceneBaseY -= 1901982267;
					int i_6_ = 1855729883 * GameClient.plane;
					int i_7_ = (gameScene_3_.gameSceneBaseX * -1760580017 - -1760580017 * gameScene.gameSceneBaseX);
					int i_8_ = (gameScene_3_.gameSceneBaseY * 283514611 - gameScene.gameSceneBaseY * 283514611);
					if (i_7_ >= 0 && i_7_ < class331.cameraXLimit * 1988988347 && i_8_ >= 0 && i_8_ < class331.cameraYLimit * 1340714547) {
						int i_9_ = 256 + (i_7_ << 9);
						int i_10_ = (i_8_ << 9) + 256;
						if (class244.method2320(i_7_, i_8_))
							i_6_++;
						this.aLinkedList3198.add(new Class365_Sub1_Sub1_Sub4(class331, this, GameClient.plane * 1855729883, i_6_, i_9_, Class356.getAverageHeight(i_9_, i_10_, (1855729883 * GameClient.plane), -969266952), i_10_));
					}
				}
				gameScene_3_ = gameScene_5_;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ml.p(").append(')').toString());
		}
	}

	ModelToolkit method3679(GraphicsToolkit class_ra, int i) {
		try {
			BaseModel class64 = BaseModel.load(Js5List.JS5_MDOELS, -1002982425 * this.anInt3195, 0);
			if (class64 == null)
				return null;
			if (class64.format < 13)
				class64.scaleUp(2);
			return class_ra.creatModelToolkit(class64, 2048, anInt3197 * 598483091, 64, 768);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ml.a(").append(')').toString());
		}
	}

	public static Class274[] method3680(int i) {
		try {
			return (new Class274[] { Class274.aClass274_6534, Class274.aClass274_6531, Class274.aClass274_6537, Class274.aClass274_6530, Class274.aClass274_6529, Class274.aClass274_6536, Class274.aClass274_6535, Class274.aClass274_6532 });
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ml.a(").append(')').toString());
		}
	}

	static final void method3681(ScriptRuntime runtime) {
		try {
			int i_11_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_11_);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[i_11_ >> 16];
			ToMoveIComponentScripts.method2230(class105, runtime);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ml.jt(").append(')').toString());
		}
	}

}
