package com.jagex;/* Class82_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;
import com.jagex.game.cache.definition.animation.AnimationDefinition;

public class Class82_Sub3 extends Class82 {
	int animationID;
	int anInt6824;
	Class82_Sub3(Buffer class298_sub53) {
		super(class298_sub53);
		this.anInt6824 = class298_sub53.readUShort() * -40183047;
		this.animationID = class298_sub53.readBigSmart() * -1186011313;
	}

	public void method866() {
		try {
			HslUtils class86 = (Class87.aClass86Array798[this.anInt6824 * -878655671]);
			StaticMethods.sendObjectAnimation(-637425735 * class86.plane, class86.localX * -123379955, class86.localY * 1400706617, (class86.aClass424_787.anInt6615 * -6749525), (class86.aClass424_787.type * -1976050083), 1067426701 * class86.rotation, this.animationID * 1204408239);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("xd.f(").append(')').toString());
		}
	}

	boolean method879() {
		AnimationDefinition animDef = Js5Configs.animsList.get((this.animationID) * 1204408239);
		return animDef.ready();
	}

	boolean method870() {
		try {
			AnimationDefinition class391 = Js5Configs.animsList.get((this.animationID) * 1204408239);
			return class391.ready();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("xd.p(").append(')').toString());
		}
	}

	public void method869() {
		HslUtils class86 = (Class87.aClass86Array798[this.anInt6824 * -878655671]);
		StaticMethods.sendObjectAnimation(-637425735 * class86.plane, class86.localX * -123379955, class86.localY * 1400706617, (class86.aClass424_787.anInt6615 * -6749525), (class86.aClass424_787.type * -1976050083), 1067426701 * class86.rotation, this.animationID * 1204408239);
	}

	public void method868() {
		HslUtils class86 = (Class87.aClass86Array798[this.anInt6824 * -878655671]);
		StaticMethods.sendObjectAnimation(-637425735 * class86.plane, class86.localX * -123379955, class86.localY * 1400706617, (class86.aClass424_787.anInt6615 * -6749525), (class86.aClass424_787.type * -1976050083), 1067426701 * class86.rotation, this.animationID * 1204408239);
	}

	static final void method880(ScriptRuntime class403, int i) {
		try {
			SettingsManager.settingsManager.setValue(SettingsManager.settingsManager.areaSoundsVolume, (class403.integerStack[((class403.integerStackOffset -= -391880689) * 681479919)]));
			ToMoveSettings.encodeBuffer();
			GameClient.sentPreferences = false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("xd.aid(").append(')').toString());
		}
	}

	static long method881(byte i) {
		try {
			return GameShell.frameBase.method3794(-489985044);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("xd.aa(").append(')').toString());
		}
	}
}
