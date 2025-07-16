package com.jagex;/* Class298_Sub48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.settings.*;

import java.io.IOException;

public class SettingsManager extends Node {
	public ScreenSizeSetting screenSize;
	static int anInt7544 = 23;
	public static int anInt7545 = 245;
	public static int anInt7546 = 500;
	public GroundDecorationSetting groundDecoration;
	public Class422_Sub10 aClass422_Sub10_7548;
	public AntiAliasingSetting antiAliasing;
	public AntiAliasingSetting multisample;
	public BloomSettings bloom;
	public BrightnessSetting brightness;
	public VolumeSetting soundEffectsVolume;
	public Class422_Sub24 aClass422_Sub24_7554;
	public FlickeringEffectsSetting flickeringEffects;
	public FogSetting fog;
	public TextureSetting textures;
	public BuildAreaSettings buildArea;
	static int anInt7559 = 40;
	public LightDetailSetting lighting;
	public ModShadowsSettings modShadows;
	EnvironmentContext environment;
	public ParticleSetting particles;
	public RemoveRoofsSetting removeRoofs;
	public RemoveRoofsSetting currentRoofs;
	public MaxScreenSizeSetting maxScreenSize;
	public SkyBoxSetting skybox;
	GameContext game;
	public IdleAnimationsSetting idleAnimations;
	public ToolkitSetting desiredToolkit;
	public ToolkitSetting toolkitSetting;
	public WaterSetting water;
	public GroundBlendingSetting groundBlending;
	public ScreenSizeSetting currentScreen;
	public CustomCursorSetting customCursors;
	public GraphicsLevelSetting graphics;
	public CPUUsageSetting cpu;
	public Class422_Sub20 aClass422_Sub20_7578;
	public SafeModeSetting safeMode;
	public Class422_Sub21 aClass422_Sub21_7580;
	public SceneryShadowsSettings sceneryShadows;
	public VolumeSetting areaSoundsVolume;
	public VolumeSetting voiceOverVolume;
	public VolumeSetting musicVolume;
	static int anInt7585 = 27;
	public StereoSoundSetting stereoSound;
	public VolumeSetting themeMusicVolume;
	public static SettingsManager settingsManager;

    public static SettingsManager getSettingsManager() {
            DiskFile diskFile = null;
            SettingsManager settingsManager = new SettingsManager(GameClient.game, 0);
            try {
                diskFile = DiskFile.method962("", GameClient.game.BUILD_NAME, false);
                byte[] is = new byte[(int) diskFile.getFileLength()];
                int i_1_;
                for (int i_2_ = 0; i_2_ < is.length; i_2_ += i_1_) {
                    i_1_ = diskFile.method6081(is, i_2_, is.length - i_2_, (short) 4730);
                    if (-1 == i_1_)
                        throw new IOException();
                }
                settingsManager = new SettingsManager(new Buffer(is), GameClient.game, 0);
            } catch (Exception exception) {
                /* empty */
            }
            try {
                if (null != diskFile)
                    diskFile.method6079();
            } catch (Exception exception) {
                /* empty */
            }
            return settingsManager;
    }

    void validate() {
			antiAliasing.validate();
			multisample.validate();
			bloom.validate();
			brightness.validate();
			buildArea.validate();
			aClass422_Sub24_7554.validate();
			flickeringEffects.validate();
			fog.validate();
			groundBlending.validate();
			groundDecoration.validate();
			idleAnimations.validate();
			lighting.validate();
			sceneryShadows.validate();
			aClass422_Sub10_7548.validate();
			particles.validate();
			removeRoofs.validate();
			currentRoofs.validate();
			maxScreenSize.validate();
			skybox.validate();
			modShadows.validate();
			textures.validate();
			desiredToolkit.validate();
			toolkitSetting.validate();
			water.validate();
			screenSize.validate();
			currentScreen.validate();
			customCursors.validate();
			graphics.validate();
			cpu.validate();
			aClass422_Sub20_7578.validate();
			safeMode.validate();
			aClass422_Sub21_7580.validate();
			soundEffectsVolume.validate();
			areaSoundsVolume.validate();
			voiceOverVolume.validate();
			musicVolume.validate();
			themeMusicVolume.validate();
			stereoSound.validate();
	}

	void setDefaults(boolean all) {
			if (all || antiAliasing == null)
				antiAliasing = new AntiAliasingSetting(this);
			if (all || multisample == null)
				multisample = new AntiAliasingSetting(antiAliasing.getValue(), this);
			if (all || null == bloom)
				bloom = new BloomSettings(this);
			if (all || null == brightness)
				brightness = new BrightnessSetting(this);
			if (all || null == buildArea)
				buildArea = new BuildAreaSettings(this);
			if (all || aClass422_Sub24_7554 == null)
				aClass422_Sub24_7554 = new Class422_Sub24(this);
			if (all || null == flickeringEffects)
				flickeringEffects = new FlickeringEffectsSetting(this);
			if (all || null == fog)
				fog = new FogSetting(this);
			if (all || groundBlending == null)
				groundBlending = new GroundBlendingSetting(this);
			if (all || groundDecoration == null)
				groundDecoration = new GroundDecorationSetting(this);
			if (all || idleAnimations == null)
				idleAnimations = new IdleAnimationsSetting(this);
			if (all || lighting == null)
				lighting = new LightDetailSetting(this);
			if (all || sceneryShadows == null)
				sceneryShadows = new SceneryShadowsSettings(this);
			if (all || null == aClass422_Sub10_7548)
				aClass422_Sub10_7548 = new Class422_Sub10(this);
			if (all || null == particles)
				particles = new ParticleSetting(this);
			if (all || removeRoofs == null)
				removeRoofs = new RemoveRoofsSetting(this);
			if (all || currentRoofs == null)
				currentRoofs = new RemoveRoofsSetting(removeRoofs.getValue(), this);
			if (all || null == maxScreenSize)
				maxScreenSize = new MaxScreenSizeSetting(this);
			if (all || skybox == null)
				skybox = new SkyBoxSetting(this);
			if (all || null == modShadows)
				modShadows = new ModShadowsSettings(this);
			if (all || null == textures)
				textures = new TextureSetting(this);
			if (all || null == desiredToolkit)
				desiredToolkit = new ToolkitSetting(this);
			if (all || toolkitSetting == null)
				toolkitSetting = new ToolkitSetting(desiredToolkit.getValue(), this);
			if (all || water == null)
				water = new WaterSetting(this);
			if (all || screenSize == null)
				screenSize = new ScreenSizeSetting(this);
			if (all || currentScreen == null)
				currentScreen = new ScreenSizeSetting(screenSize.getValue(), this);
			if (all || null == customCursors)
				customCursors = new CustomCursorSetting(this);
			if (all || null == graphics)
				graphics = new GraphicsLevelSetting(this);
			if (all || cpu == null)
				cpu = new CPUUsageSetting(this);
			if (all || null == aClass422_Sub20_7578)
				aClass422_Sub20_7578 = new Class422_Sub20(this);
			if (all || null == safeMode)
				safeMode = new SafeModeSetting(this);
			if (all || aClass422_Sub21_7580 == null)
				aClass422_Sub21_7580 = new Class422_Sub21(this);
			if (all || soundEffectsVolume == null)
				soundEffectsVolume = new VolumeSetting(this);
			if (all || null == areaSoundsVolume)
				areaSoundsVolume = new VolumeSetting(this);
			if (all || null == voiceOverVolume)
				voiceOverVolume = new VolumeSetting(this);
			if (all || null == musicVolume)
				musicVolume = new VolumeSetting(this);
			if (all || null == themeMusicVolume)
				themeMusicVolume = new VolumeSetting(this);
			if (all || stereoSound == null)
				stereoSound = new StereoSoundSetting(this);
	}

	void decodeLegacy(Buffer buffer, int version) {
			brightness = new BrightnessSetting(buffer.readUByte(), this);
			buffer.offset += 116413311;
			removeRoofs = new RemoveRoofsSetting(buffer.readUByte() + 1, this);
			groundDecoration = new GroundDecorationSetting(buffer.readUByte(), this);
			buffer.offset += 116413311;
			idleAnimations = new IdleAnimationsSetting(buffer.readUByte(), this);
			flickeringEffects = new FlickeringEffectsSetting(buffer.readUByte(), this);
			buffer.readUByte();
			modShadows = new ModShadowsSettings(buffer.readUByte(), this);
			int i_1_ = buffer.readUByte();
			int i_2_ = 0;
			if (version >= 17)
				i_2_ = buffer.readUByte();
			sceneryShadows = new SceneryShadowsSettings(i_1_ > i_2_ ? i_1_ : i_2_, this);
			boolean bool = true;
			boolean bool_3_ = true;
			if (version >= 2) {
				bool = buffer.readUByte() == 1;
				if (version >= 17)
					bool_3_ = buffer.readUByte() == 1;
			} else {
				bool = buffer.readUByte() == 1;
				buffer.readUByte();
			}
			lighting = new LightDetailSetting(bool | bool_3_ ? 1 : 0, this);
			water = new WaterSetting(buffer.readUByte(), this);
			fog = new FogSetting(buffer.readUByte(), this);
			antiAliasing = new AntiAliasingSetting(buffer.readUByte(), this);
			stereoSound = new StereoSoundSetting(buffer.readUByte(), this);
			soundEffectsVolume = new VolumeSetting(buffer.readUByte(), this);
			if (version >= 20)
				voiceOverVolume = new VolumeSetting(buffer.readUByte(), this);
			else
				voiceOverVolume = new VolumeSetting(soundEffectsVolume.getValue(), this);
			musicVolume = new VolumeSetting(buffer.readUByte(), this);
			areaSoundsVolume = new VolumeSetting(buffer.readUByte(), this);
			if (version >= 21)
				themeMusicVolume = new VolumeSetting(buffer.readUByte(), this);
			else
				themeMusicVolume = new VolumeSetting(musicVolume.getValue(), this);
			if (version >= 1) {
				buffer.readUShort();
				buffer.readUShort();
			}
			if (version >= 3 && version < 6)
				buffer.readUByte();
			if (version >= 4)
				particles = new ParticleSetting(buffer.readUByte(), this);
			buffer.readInt();
			if (version >= 6)
				screenSize = new ScreenSizeSetting(buffer.readUByte(), this);
			if (version >= 7)
				safeMode = new SafeModeSetting(buffer.readUByte(), this);
			if (version >= 8)
				buffer.readUByte();
			if (version >= 9)
				buildArea = new BuildAreaSettings(buffer.readUByte(), this);
			if (version >= 10)
				bloom = new BloomSettings(buffer.readUByte(), this);
			if (version >= 11)
				customCursors = new CustomCursorSetting(buffer.readUByte(), this);
			if (version >= 12)
				idleAnimations = new IdleAnimationsSetting(buffer.readUByte(), this);
			if (version >= 13)
				groundBlending = new GroundBlendingSetting(buffer.readUByte(), this);
			if (version >= 14)
				desiredToolkit = new ToolkitSetting(buffer.readUByte(), this);
			if (version >= 15)
				cpu = new CPUUsageSetting(buffer.readUByte(), this);
			if (version >= 16)
				textures = new TextureSetting(buffer.readUByte(), this);
			if (version >= 18)
				graphics = new GraphicsLevelSetting(buffer.readUByte(), this);
			if (version >= 19)
				maxScreenSize = new MaxScreenSizeSetting(buffer.readUByte(), this);
			if (version >= 22)
				aClass422_Sub20_7578 = new Class422_Sub20(buffer.readUByte(), this);
	}

	public void setLive(ToolkitSetting setting, boolean live) {
			setting.setLive(live);
			validate();
	}

	public void setValue(GameSettings setting, int value) {
			setting.set(value);
			validate();
	}

	public GameContext getGame() {
			return this.game;
	}

	public EnvironmentContext getEnvironment() {
			return this.environment;
	}
	
	public Buffer encode() {
			Buffer buffer = new Buffer(40);
			buffer.writeByte(27);
			buffer.writeByte(antiAliasing.getValue());
			buffer.writeByte(bloom.getValue());
			buffer.writeByte(brightness.getValue());
			buffer.writeByte(buildArea.getValue());
			buffer.writeByte(aClass422_Sub24_7554.getValue());
			buffer.writeByte(flickeringEffects.getValue());
			buffer.writeByte(fog.getValue());
			buffer.writeByte(groundBlending.getValue());
			buffer.writeByte(groundDecoration.getValue());
			buffer.writeByte(idleAnimations.getValue());
			buffer.writeByte(lighting.getValue());
			buffer.writeByte(sceneryShadows.getValue());
			buffer.writeByte(aClass422_Sub10_7548.getValue());
			buffer.writeByte(particles.getValue());
			buffer.writeByte(removeRoofs.getValue());
			buffer.writeByte(maxScreenSize.getValue());
			buffer.writeByte(skybox.getValue());
			buffer.writeByte(modShadows.getValue());
			buffer.writeByte(textures.getValue());
			buffer.writeByte(desiredToolkit.getValue());
			buffer.writeByte(0);
			buffer.writeByte(water.getValue());
			buffer.writeByte(screenSize.getValue());
			buffer.writeByte(customCursors.getValue());
			buffer.writeByte(graphics.getValue());
			buffer.writeByte(cpu.getValue());
			buffer.writeByte(aClass422_Sub20_7578.getValue());
			buffer.writeByte(safeMode.getValue());
			buffer.writeByte(aClass422_Sub21_7580.getValue());
			buffer.writeByte(soundEffectsVolume.getValue());
			buffer.writeByte(areaSoundsVolume.getValue());
			buffer.writeByte(voiceOverVolume.getValue());
			buffer.writeByte(musicVolume.getValue());
			buffer.writeByte(themeMusicVolume.getValue());
			buffer.writeByte(stereoSound.getValue());
			return buffer;
	}

	void decode(Buffer buffer) {
			if (buffer == null || null == buffer.buffer)
				setDefaults(true);
			else {
				int version = buffer.readUByte();
				if (version < 23) {
					try {
						decodeLegacy(buffer, version);
					} catch (Exception exception) {
						setDefaults(true);
					}
					setDefaults(false);
				} else if (version > 27)
					setDefaults(true);
				else {
					antiAliasing = new AntiAliasingSetting(buffer.readUByte(), this);
					multisample = new AntiAliasingSetting(antiAliasing.getValue(), this);
					bloom = new BloomSettings(buffer.readUByte(), this);
					brightness = new BrightnessSetting(buffer.readUByte(), this);
					buildArea = new BuildAreaSettings(buffer.readUByte(), this);
					if (version >= 27)
						aClass422_Sub24_7554 = new Class422_Sub24(buffer.readUByte(), this);
					flickeringEffects = new FlickeringEffectsSetting(buffer.readUByte(), this);
					fog = new FogSetting(buffer.readUByte(), this);
					groundBlending = new GroundBlendingSetting(buffer.readUByte(), this);
					groundDecoration = new GroundDecorationSetting(buffer.readUByte(), this);
					idleAnimations = new IdleAnimationsSetting(buffer.readUByte(), this);
					lighting = new LightDetailSetting(buffer.readUByte(), this);
					sceneryShadows = new SceneryShadowsSettings(buffer.readUByte(), this);
					if (version >= 24)
						aClass422_Sub10_7548 = new Class422_Sub10(buffer.readUByte(), this);
					particles = new ParticleSetting(buffer.readUByte(), this);
					removeRoofs = new RemoveRoofsSetting(buffer.readUByte(), this);
					currentRoofs = new RemoveRoofsSetting(removeRoofs.getValue(), this);
					maxScreenSize = new MaxScreenSizeSetting(buffer.readUByte(), this);
					if (version >= 25)
						skybox = new SkyBoxSetting(buffer.readUByte(), this);
					modShadows = new ModShadowsSettings(buffer.readUByte(), this);
					if (version <= 25)
						buffer.offset += 116413311;
					textures = new TextureSetting(buffer.readUByte(), this);
					desiredToolkit = new ToolkitSetting(buffer.readUByte(), this);
					toolkitSetting = new ToolkitSetting(desiredToolkit.getValue(), this);
					buffer.readUByte();
					water = new WaterSetting(buffer.readUByte(), this);
					screenSize = new ScreenSizeSetting(buffer.readUByte(), this);
					currentScreen = new ScreenSizeSetting(screenSize.getValue(), this);
					customCursors = new CustomCursorSetting(buffer.readUByte(), this);
					graphics = new GraphicsLevelSetting(buffer.readUByte(), this);
					cpu = new CPUUsageSetting(buffer.readUByte(), this);
					aClass422_Sub20_7578 = new Class422_Sub20(buffer.readUByte(), this);
					safeMode = new SafeModeSetting(buffer.readUByte(), this);
					if (version >= 26)
					aClass422_Sub21_7580 = new Class422_Sub21(buffer.readUByte(), this);
					soundEffectsVolume = new VolumeSetting(buffer.readUByte(), this);
					areaSoundsVolume = new VolumeSetting(buffer.readUByte(), this);
					voiceOverVolume = new VolumeSetting(buffer.readUByte(), this);
					musicVolume = new VolumeSetting(buffer.readUByte(), this);
					themeMusicVolume = new VolumeSetting(buffer.readUByte(), this);
					stereoSound = new StereoSoundSetting(buffer.readUByte(), this);
					setDefaults(false);
				}
			}
			validate();
	}

	public static void loadHighSettings() {
			settingsManager.setValue(settingsManager.removeRoofs, 2);
			settingsManager.setValue(settingsManager.currentRoofs, 2);
			settingsManager.setValue(settingsManager.groundDecoration, 1);
			settingsManager.setValue(settingsManager.groundBlending, 1);
			settingsManager.setValue(settingsManager.idleAnimations, 1);
			settingsManager.setValue(settingsManager.flickeringEffects, 1);
			settingsManager.setValue(settingsManager.modShadows, 1);
			settingsManager.setValue(settingsManager.textures, 1);
			settingsManager.setValue(settingsManager.sceneryShadows, 2);
			settingsManager.setValue(settingsManager.lighting, 1);
			settingsManager.setValue(settingsManager.water, 2);
			settingsManager.setValue(settingsManager.fog, 1);
			settingsManager.setValue(settingsManager.antiAliasing, 0);
			settingsManager.setValue(settingsManager.multisample, 0);
			settingsManager.setValue(settingsManager.particles, 2);
			settingsManager.setValue(settingsManager.buildArea, -160182505 * Class115.aClass115_1383.anInt1387);
			settingsManager.setValue(settingsManager.bloom, 0);
			settingsManager.setValue(settingsManager.skybox, 1);
			StaticMethods.method6170();
			settingsManager.setValue(settingsManager.maxScreenSize, 0);
			settingsManager.setValue(settingsManager.graphics, 4);
			StaticMethods.method4294();
			GameClient.myRegion.getLightningDetails().method4324();
			GameClient.aBoolean8676 = true;
	}

	public static void loadMediumSettings() {
			settingsManager.setValue(settingsManager.removeRoofs, 2);
			settingsManager.setValue(settingsManager.currentRoofs, 2);
			settingsManager.setValue(settingsManager.groundDecoration, 1);
			settingsManager.setValue(settingsManager.groundBlending, 1);
			settingsManager.setValue(settingsManager.idleAnimations, 1);
			settingsManager.setValue(settingsManager.flickeringEffects, 1);
			settingsManager.setValue(settingsManager.modShadows, 1);
			settingsManager.setValue(settingsManager.textures, 1);
			settingsManager.setValue(settingsManager.sceneryShadows, 1);
			settingsManager.setValue(settingsManager.lighting, 1);
			settingsManager.setValue(settingsManager.water, 0);
			settingsManager.setValue(settingsManager.fog, 1);
			settingsManager.setValue(settingsManager.antiAliasing, 0);
			settingsManager.setValue(settingsManager.multisample, 0);
			settingsManager.setValue(settingsManager.particles, 1);
			settingsManager.setValue(settingsManager.buildArea, Class115.aClass115_1383.anInt1387 * -160182505);
			settingsManager.setValue(settingsManager.bloom, 0);
			settingsManager.setValue(settingsManager.skybox, 1);
			StaticMethods.method6170();
			settingsManager.setValue(settingsManager.maxScreenSize, 1);
			settingsManager.setValue(settingsManager.graphics, 3);
			StaticMethods.method4294();
			GameClient.myRegion.getLightningDetails().method4324();
			GameClient.aBoolean8676 = true;
	}

	public static void loadLowSettings() {
			settingsManager.setValue(settingsManager.removeRoofs, 1);
			settingsManager.setValue(settingsManager.currentRoofs, 1);
			settingsManager.setValue(settingsManager.groundDecoration, 1);
			settingsManager.setValue(settingsManager.groundBlending, 1);
			settingsManager.setValue(settingsManager.idleAnimations, 0);
			settingsManager.setValue(settingsManager.flickeringEffects, 0);
			settingsManager.setValue(settingsManager.modShadows, 0);
			settingsManager.setValue(settingsManager.sceneryShadows, 0);
			settingsManager.setValue(settingsManager.textures, 0);
			settingsManager.setValue(settingsManager.lighting, 0);
			settingsManager.setValue(settingsManager.water, 1);
			settingsManager.setValue(settingsManager.fog, 0);
			settingsManager.setValue(settingsManager.antiAliasing, 0);
			settingsManager.setValue(settingsManager.multisample, 0);
			settingsManager.setValue(settingsManager.particles, 0);
			settingsManager.setValue(settingsManager.buildArea, -160182505 * Class115.aClass115_1383.anInt1387);
			settingsManager.setValue(settingsManager.bloom, 0);
			settingsManager.setValue(settingsManager.skybox, 0);
			StaticMethods.method6170();
			settingsManager.setValue(settingsManager.maxScreenSize, 2);
			settingsManager.setValue(settingsManager.graphics, 2);
			StaticMethods.method4294();
			GameClient.myRegion.getLightningDetails().method4324();
			GameClient.aBoolean8676 = true;
	}

	public static void loadMinimumSettings() {
			settingsManager.setValue(settingsManager.removeRoofs, 1);
			settingsManager.setValue(settingsManager.currentRoofs, 1);
			settingsManager.setValue(settingsManager.groundDecoration, 0);
			settingsManager.setValue(settingsManager.fog, 0);
			settingsManager.setValue(settingsManager.groundBlending, 0);
			settingsManager.setValue(settingsManager.idleAnimations, 0);
			settingsManager.setValue(settingsManager.flickeringEffects, 0);
			settingsManager.setValue(settingsManager.modShadows, 0);
			settingsManager.setValue(settingsManager.sceneryShadows, 0);
			settingsManager.setValue(settingsManager.textures, 0);
			settingsManager.setValue(settingsManager.lighting, 0);
			settingsManager.setValue(settingsManager.water, 0);
			settingsManager.setValue(settingsManager.antiAliasing, 0);
			settingsManager.setValue(settingsManager.multisample, 0);
			settingsManager.setValue(settingsManager.particles, 0);
			settingsManager.setValue(settingsManager.buildArea, Class115.aClass115_1383.anInt1387 * -160182505);
			settingsManager.setValue(settingsManager.bloom, 0);
			settingsManager.setValue(settingsManager.skybox, 0);
			StaticMethods.method6170();
			settingsManager.setValue(settingsManager.maxScreenSize, 2);
			settingsManager.setValue(settingsManager.graphics, 1);
			StaticMethods.method4294();
			GameClient.myRegion.getLightningDetails().method4324();
			GameClient.aBoolean8676 = true;
	}

	public SettingsManager(GameContext game, int toolkit) {
		this.game = game;
		this.environment = new EnvironmentContext(GameShell.maximumMemory * 1126040225, GameShell.availableCPU * 1090452523, (Class344.aString3687.toLowerCase().indexOf("arm") != -1));
		toolkitSetting = new ToolkitSetting(toolkit, this);
		setDefaults(true);
	}

	public SettingsManager(Buffer buffer, GameContext game, int toolkit) {
		this.game = game;
		this.environment = new EnvironmentContext(GameShell.maximumMemory * 1126040225, 1090452523 * GameShell.availableCPU, Class344.aString3687.indexOf("arm") != -1);
		toolkitSetting = new ToolkitSetting(toolkit, this);
		decode(buffer);
	}
}
