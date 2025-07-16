package com.jagex;/* Class364 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;
import com.jagex.game.settings.FogSetting;
import com.jagex.utils.TimeUtils;

public class LightingDetails {
	Atmosphere aClass385_3932;
	long time;
	
	/**
     * The default sun posX angle.
     */
	static int SUN_X_ANGLE = -50;
	
    /**
     * The default sun posY angle.
     */
	static int SUN_Y_ANGLE = -60;
	
    /**
     * The default sun z angle.
     */
	static int SUN_Z_ANGLE = -50;
	
    /**
     * The default sun angle vector.
     */
	Vector3f SUN_ANGLE = new Vector3f(SUN_X_ANGLE, SUN_Y_ANGLE, SUN_Z_ANGLE);

	static int anInt3942 = -816669807;
	
	GraphicsToolkit graphicsToolkit;
	Atmosphere[][] aClass385ArrayArray3944;
	int anInt3945 = 0;
	int anInt3946 = -1117911945;
	
	public static int[] direction;
	
	Atmosphere aClass385_3949;
	Atmosphere aClass385_3950;
	Atmosphere aClass385_3951;
	
	SoftCache environmentMapCache;
	SoftCache skyBoxCache;
	
	boolean aBoolean3954;


	public LightingDetails(GraphicsToolkit graphicsToolkit, int i, int i_0_) {
		this.time = 0L;
		this.aBoolean3954 = false;
		this.environmentMapCache = new SoftCache(8);
		this.skyBoxCache = new SoftCache(8);
		this.graphicsToolkit = graphicsToolkit;
		this.aClass385ArrayArray3944 = new Atmosphere[i][i_0_];
		if (null != direction) {
			EnvironmentMap.environmentMap = createEnvironmentMap(direction[0], direction[1], direction[2], direction[3], direction[4], direction[5]);
		}
		Skybox.skybox = null;
		this.aClass385_3949 = new Atmosphere();
		this.aClass385_3950 = new Atmosphere();
		this.aClass385_3932 = new Atmosphere();
		this.aClass385_3951 = new Atmosphere();
		method4324();
	}

	public Atmosphere getAtmosphere() {
			return this.aClass385_3950;
	}

	public void clear() {
			this.environmentMapCache.clear();
			this.skyBoxCache.clear();
	}

	void method4318() {
			this.graphicsToolkit.setModelAmbient((0.7F + ((float) SettingsManager.settingsManager.brightness.getValue() * 0.1F) + GameClient.myRegion.method2633()) * this.aClass385_3950.sunShineness);
			this.graphicsToolkit.updateSun((-1951302757 * this.aClass385_3950.sunColor), this.aClass385_3950.sunX, this.aClass385_3950.sunY, (float) ((int) this.SUN_ANGLE.x << 2), (float) ((int) this.SUN_ANGLE.y << 2), (float) ((int) this.SUN_ANGLE.z << 2));
			this.graphicsToolkit.a(this.aClass385_3950.environmentMap);
	}

	public void method4319(int i, int i_1_, Atmosphere class385, byte i_2_) {
			this.aClass385ArrayArray3944[i][i_1_] = class385;
	}

	public void method4320() {
			for (int i_3_ = 0; i_3_ < this.aClass385ArrayArray3944.length; i_3_++) {
				for (int i_4_ = 0; i_4_ < (this.aClass385ArrayArray3944[i_3_]).length; i_4_++)
					this.aClass385ArrayArray3944[i_3_][i_4_] = this.aClass385_3949;
			}
	}

	public void method4321(int i, int i_5_) {
			Atmosphere atmosphere = this.aClass385ArrayArray3944[i][i_5_];
			if (atmosphere != null) {
				this.SUN_ANGLE.setVector3fOfficial(atmosphere.vector3f);
			}
			method4318();
	}

	void method4322(int i, int i_7_, int i_8_) {
			Atmosphere atmosphere = this.aClass385ArrayArray3944[i][i_7_];
			if (null == atmosphere)
				atmosphere = this.aClass385_3949;
			if (this.aBoolean3954) {
				this.aBoolean3954 = false;
				i_8_ = 0;
			}
			if (!this.aClass385_3951.method4708(atmosphere)) {
				this.aClass385_3951.reset(atmosphere);
				this.time = TimeUtils.getTime() * 858881257410153067L;
				this.anInt3945 = ((this.anInt3946 = 1117911945 * i_8_) * -2145126213);
				if (913546523 * this.anInt3945 != 0) {
					this.aClass385_3932.reset(this.aClass385_3950);
					if ((this.aClass385_3950.skybox) != null) {
						if (this.aClass385_3950.skybox.method2586())
							this.aClass385_3950.skybox = this.aClass385_3932.skybox = this.aClass385_3950.skybox.method2587();
						if ((null != (this.aClass385_3950.skybox)) && ((this.aClass385_3951.skybox) != (this.aClass385_3950.skybox)))
							this.aClass385_3950.skybox.method2584((this.aClass385_3951.skybox));
					}
				}
			}
	}

	public void method4323(GameMap gameMap) {
			if (Class413.method5584(-1233866115 * GameClient.gameState) || GameClient.isLobbyConnected(-1233866115 * GameClient.gameState))
				method4322(GameClient.camPosX * -1740717447 >> 12, -299812095 * GameClient.camPosZ >> 12, anInt3942 * -450037889);
			else {
				int i_10_ = -1;
				int i_11_ = -1;
				if (null != Player.myPlayer) {
					i_10_ = (Player.myPlayer.scenePositionXQueue[0]) >> 3;
			
					i_11_ = (Player.myPlayer.scenePositionYQueue[0]) >> 3;
		
				}
				if (i_10_ < 0 || i_10_ >= gameMap.getMapWidth() >> 3 || i_11_ < 0 || i_11_ >= gameMap.getMapLength() >> 3)
					method4322(gameMap.getMapWidth() >> 4, gameMap.getMapLength() >> 4, 0);
				else
					method4322(i_10_, i_11_, anInt3942 * -450037889);
			}
			method4330();
			method4318();
			method4325();
			setFogIntensity();
	}

	public void method4324() {
			this.aBoolean3954 = true;
	}

	void method4325() {
			this.graphicsToolkit.method5152(this.aClass385_3950.whitepoint, this.aClass385_3950.bloom, this.aClass385_3950.brightpass);
	}

	public void setDefaults() {
			this.graphicsToolkit.setModelAmbient((0.7F + ((float) SettingsManager.settingsManager.brightness.getValue() * 0.1F) + GameClient.myRegion.method2633()) * 1.1523438F);
			this.graphicsToolkit.updateSun(Atmosphere.SUN_COLOR * 332664479, Atmosphere.SUN_X_POSITION, Atmosphere.SUN_Y_POSITION, -200.0F, -240.0F, -200.0F);
			this.graphicsToolkit.drawFog(Atmosphere.SKY_COLOR * -1971415573, -1, 0);
			this.graphicsToolkit.a(EnvironmentMap.environmentMap);
	}

	public void method4327(LightingDetails atmosphereContext) {
			this.aClass385_3950.reset(atmosphereContext.aClass385_3950);
			this.aClass385_3932.reset(atmosphereContext.aClass385_3932);
			this.aClass385_3951.reset(atmosphereContext.aClass385_3951);
			this.time = atmosphereContext.time * 1L;
			this.anInt3945 = atmosphereContext.anInt3945 * 1;
			this.anInt3946 = atmosphereContext.anInt3946 * 1;
	}

	Skybox createSkybox(int skyboxId, int a, int b, int c) {
			long l = (((long) a & 0xffffL) << 48 | ((long) b & 0xffffL) << 32 | ((long) c & 0xffffL) << 16 | (long) skyboxId & 0xffffL);
			Skybox skybox = (Skybox) this.skyBoxCache.get(l);
			if (null == skybox) {
				skybox = Js5Configs.configList.method3845(skyboxId, a, b, c, (Class138_Sub1.configs));
				this.skyBoxCache.put(skybox, l);
			}
			return skybox;
	}

	EnvironmentMap createEnvironmentMap(int faceTop, int faceBottom, int faceFront, int faceBack, int faceLeft, int faceRight) {
			long key = (67481L * (long) faceTop ^ (long) faceBottom * 97549L ^ 475427L * (long) faceFront ^ (long) faceBack * 986053L ^ (long) faceLeft * 32147369L ^ (long) faceRight * 76724863L);
			EnvironmentMap environmentMap = (EnvironmentMap) this.environmentMapCache.get(key);
			if (null != environmentMap)
				return environmentMap;
			environmentMap = this.graphicsToolkit.createEnvironmentMap(faceTop, faceBottom, faceFront, faceBack, faceLeft, faceRight);
			this.environmentMapCache.put(environmentMap, key);
			return environmentMap;
	}

	void method4330() {
			if (this.anInt3946 * -1051268423 >= 0) {
				long time = TimeUtils.getTime();
				this.anInt3946 -= ((time - 5777556104771211843L * this.time) * 1117911945L);
				if (-1051268423 * this.anInt3946 > 0)
					this.aClass385_3950.method4705(this.graphicsToolkit, this.aClass385_3932, this.aClass385_3951, ((float) (913546523 * this.anInt3945 - this.anInt3946 * -1051268423) / (float) (913546523 * this.anInt3945)));
				else {
					this.aClass385_3950.reset(this.aClass385_3951);
					if ((this.aClass385_3950.skybox) != null)
						this.aClass385_3950.skybox.method2585();
					this.anInt3946 = -1117911945;
				}
				this.time = 858881257410153067L * time;
			}
	}

	public void setFogIntensity() {
			int offset = 0;
			int intensity = offset + ((this.aClass385_3950.fogIntensity) * -1939701499 + 256 << 2);
			this.graphicsToolkit.drawFog((this.aClass385_3950.skyColor * -1269717659), SettingsManager.settingsManager.fog.getValue() == FogSetting.ON ? intensity : -1, 0);
	}

	public static Class412 method4336(int i) {
			if (null == Class525.aClass412_6299)
				return Class412.aClass412_6568;
			return Class525.aClass412_6299;
	}
}
