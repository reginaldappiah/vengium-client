package com.jagex;/* Class354 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.game.cache.config.prefetch.Js5List;
import jaclib.ping.Ping;

public final class Class354 {
	Cacheable cacheable = new Cacheable();
	int anInt3822;
	int anInt3823;
	LinkedList linkedList;
	CircularDoubleLinkedList circularDoubleLinkedList = new CircularDoubleLinkedList();

	public Cacheable retrieve(long key) {
			Cacheable cacheable = ((Cacheable) this.linkedList.get(key));
			if (cacheable != null)
				this.circularDoubleLinkedList.offer(cacheable);
			return cacheable;
	}

	public Class354(int i) {
		this.anInt3822 = i * -1251678705;
		this.anInt3823 = i * -1442966963;
		int capacity;
		for (capacity = 1; capacity + capacity < i; capacity += capacity) {

		}
		this.linkedList = new LinkedList(capacity);
	}

	public void method4254() {
		try {
			this.circularDoubleLinkedList.clear();
			this.linkedList.clear();
			this.cacheable = new Cacheable();
			this.anInt3823 = -964444701 * this.anInt3822;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ot.b(").append(')').toString());
		}
	}

	public void add(Cacheable node, long key) {
			if (0 == this.anInt3823 * -78285179) {
				Cacheable cacheable = this.circularDoubleLinkedList.poll();
				cacheable.unlink();
				cacheable.unlinkCache();
				if (cacheable == this.cacheable) {
					cacheable = this.circularDoubleLinkedList.poll();
					cacheable.unlink();
					cacheable.unlinkCache();
				}
			} else
				this.anInt3823 -= -1442966963;
			this.linkedList.connect(node, key);
			this.circularDoubleLinkedList.offer(node);
	}

	static final void method4256(ScriptRuntime class403, int i) {
		try {
			int i_2_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_2_);
			class403.integerStack[((class403.integerStackOffset += -391880689) * 681479919 - 1)] = GameClient.getComponentSettings(class105).method3497();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ot.sr(").append(')').toString());
		}
	}

	static final void method4257(ScriptRuntime runtime) {
		try {
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.graphics.getValue();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ot.anm(").append(')').toString());
		}
	}

	static final void method4258(ScriptRuntime class403, int i) {
		try {
			int i_3_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_3_);
			IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[i_3_ >> 16];
			Class52_Sub1_Sub1.method568(class105, IComponentDefinitionCollection, class403, (byte) 88);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ot.dt(").append(')').toString());
		}
	}

	public static int method4259() {
		try {
			if (0 == Class234.anInt2596 * 363912581) {
				Class479.DLL_JACLIB.setLoadingFile(new JS5PrefetchLoader("jaclib"));
				if (Class479.DLL_JACLIB.getFileLoader().getProgress() != 100)
					return 1;
				if (!((JS5PrefetchLoader) Class479.DLL_JACLIB.getFileLoader()).isLoaded()) {
					GameClient.gameClient.method2766();
					StaticMethods.method2053();
					try {
						Ping.init();
					} catch (Throwable throwable) {
					}
				}
				Class234.anInt2596 = -28142771;
			}
			if (363912581 * Class234.anInt2596 == 1) {
				StaticMethods.aClass479Array6311 = Class479.getFile();
				Class479.JS5_DEFAULTS.setLoadingFile(new JS5FileSystemLoader(Js5List.JS5_DEFAULTS_FILE));
				Class479.DLL_JAGGL.setLoadingFile(new JS5PrefetchLoader("jaggl"));
				Class479.DLL_JAGDX.setLoadingFile(new JS5PrefetchLoader("jagdx"));
				Class479.DLL_SW3D.setLoadingFile(new JS5PrefetchLoader("sw3d"));
				Class479.DLL_HW3D.setLoadingFile(new JS5PrefetchLoader("hw3d"));
				Class479.DLL_THEORA.setLoadingFile(new JS5PrefetchLoader("jagtheora"));
				Class479.JS5_SHADERS.setLoadingFile(new JS5FileSystemLoader(Js5List.JS5_SHADERS));
				Class479.JS5_SHADERS2.setLoadingFile(new JS5FileSystemLoader(Js5List.JS5_SHADERS));
				Class479.JS5_CONFIGS.setLoadingFile(new JS5FileSystemLoader(Js5List.JS5_CONFIG));
				Class479.JS5_CONFIG_OBJECTS.setLoadingFile(new JS5FileSystemLoader(Js5List.JS5_CONFIG_OBJECTS));
				Class479.JS5_CONFIG_ENUM.setLoadingFile(new JS5FileSystemLoader(Js5List.JS5_CONFIG_ENUM));
				Class479.JS5_CONFIG_NPC.setLoadingFile(new JS5FileSystemLoader(Js5List.JS5_CONFIG_NPC));
				Class479.JS5_CONFIG_ITEMS.setLoadingFile(new JS5FileSystemLoader(Js5List.JS5_CONFIG_ITEMS));
				Class479.JS5_CONFIG_SEQ.setLoadingFile(new JS5FileSystemLoader(Js5List.JS5_CONFIG_SEQ));
				Class479.JS5_CONFIG_SPOT.setLoadingFile(new JS5FileSystemLoader(Js5List.JS5_CONFIG_SPOT));
				Class479.JS5_CONFIG_SCRIPT.setLoadingFile(new JS5FileSystemLoader(Js5List.JS5_CONFIG_SCRIPT));
				Class479.JS5_QUICKCHAT.setLoadingFile(new JS5FileSystemLoader(Js5List.JS5_QUICKCHAT));
				Class479.JS5_QUICKCHAT_GLOBAL.setLoadingFile(new JS5FileSystemLoader(Js5List.JS5_QUICKCHAT_GLOBAL));
				Class479.JS5_TEXTURES.setLoadingFile(new JS5FileSystemLoader(Js5List.JS5_TEXTURES));
				Class479.JS5_CONFIG_PARTICLE.setLoadingFile(new JS5FileSystemLoader(Js5List.JS5_CONFIG_PARTICLE));
				Class479.JS5_CONFIG_PARTICLE2.setLoadingFile(new JS5FileSystemLoader(Js5List.JS5_CONFIG_PARTICLE));
				Class479.JS5_BINARY.setLoadingFile(new JS5BinaryLoader(Js5List.JS5_BINARY, "huffman"));
				Class479.JS5_INTERFACES.setLoadingFile(new JS5FileSystemLoader(Js5List.JS5_INTERFACES));
				Class479.JS5_CLIENTSCRIPTS.setLoadingFile(new JS5FileSystemLoader(Js5List.JS5_CLIENTSCRIPTS));
				Class479.JS5_FONTMETRICS.setLoadingFile(new JS5FileSystemLoader(Js5List.JS5_FONTMETRICS));
				Class479.JS5_WORLDMAPDATA.setLoadingFile(new Class216(Js5List.JS5_WORLDMAPDATA, "details"));
				for (int index = 0; index < StaticMethods.aClass479Array6311.length; index++) {
					if (StaticMethods.aClass479Array6311[index].getFileLoader() == null)
						throw new RuntimeException();
				}
				int i_5_ = 0;
				Class479[] class479s = StaticMethods.aClass479Array6311;
				for (int i_6_ = 0; i_6_ < class479s.length; i_6_++) {
					Class479 class479 = class479s[i_6_];
					int i_7_ = class479.method6100();
					int progress = class479.getFileLoader().getProgress();
					i_5_ += i_7_ * progress / 100;
				}
				Class234.anInt2597 = 1385369023 * i_5_;
				Class234.anInt2596 = -56285542;
			}
			if (StaticMethods.aClass479Array6311 == null)
				return 100;
			int i_9_ = 0;
			int i_10_ = 0;
			boolean bool = true;
			Class479[] class479s = StaticMethods.aClass479Array6311;
			for (int i_11_ = 0; i_11_ < class479s.length; i_11_++) {
				Class479 class479 = class479s[i_11_];
				int i_12_ = class479.method6100();
				int i_13_ = class479.getFileLoader().getProgress();
				if (i_13_ < 100)
					bool = false;
				i_9_ += i_12_;
				i_10_ += i_12_ * i_13_ / 100;
			}
			if (bool) {
				if (!((JS5PrefetchLoader) Class479.DLL_THEORA.getFileLoader()).isLoaded())
					GameClient.aBoolean8806 = GameClient.gameClient.method2767(-2027084439);
				StaticMethods.aClass479Array6311 = null;
			}
			i_10_ -= -913055169 * Class234.anInt2597;
			i_9_ -= -913055169 * Class234.anInt2597;
			int i_14_ = i_9_ > 0 ? 100 * i_10_ / i_9_ : 100;
			if (!bool && i_14_ > 99)
				i_14_ = 99;
			return i_14_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ot.a(").append(')').toString());
		}
	}

	static final void method4260(ScriptRuntime class403, int i) {
		try {
			int i_15_ = (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]);
			IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_15_);
			ToMoveIComponentScripts.method5722(class105, class403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ot.qs(").append(')').toString());
		}
	}
}
