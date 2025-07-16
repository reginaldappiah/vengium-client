package com.jagex;/* Class385 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Atmosphere {
	public static int anInt1685;
	Vector3f vector3f;
	float sunShineness;
	float sunX;
	float whitepoint;
	int sunColor;
	int skyColor;
	int fogIntensity;
	EnvironmentMap environmentMap;
	float sunY;
	float brightpass;
	float bloom;
	Skybox skybox;
	
    /**
     * The default sky color.
     */
	public static final int  SKY_COLOR = 615272440;
	
    /**
     * The default sun colour.
     */
	public static final int SUN_COLOR = 1373663905;	
	
	/**
	 * The default sun x position.
	 */
	public static final float SUN_X_POSITION = 0.69921875F;
	
	/**
	 * The default sun y position.
	 */
	public static final float SUN_Y_POSITION = 1.2F;
	
	/**
	 * The default sun x angle.
	 */
	public static final int SUN_X_ANGLE = -50;
	
	/**
	 * The default sun y angle.
	 */
	public static final int SUN_Y_ANGLE = -60;

	/**
	 * The default sun z angle.
	 */
	public static final int SUN_Z_ANGLE = -50;
	
	/**
	 * The default sun angle vector.
	 */
	
	//public static final Vector3f SUN_ANGLE = new Vector3f(Atmosphere.SUN_X_ANGLE, Atmosphere.SUN_Y_ANGLE, Atmosphere.SUN_Z_ANGLE);

    /**
     * The default sun shininess factor.
     */
	public static final float SUN_SHININESS = 1.1523438F;
	
	
	//public static final Skybox DEFAULT_SKYBOX = null;
	
	public Atmosphere(Buffer buffer, LightingDetails atmosphereContext) {
		method4706(buffer, atmosphereContext);
	}

	void reset(Atmosphere atmosphere) {
			this.sunColor = atmosphere.sunColor * 1;
			this.sunShineness = atmosphere.sunShineness;
			this.sunX = atmosphere.sunX;
			this.sunY = atmosphere.sunY;
			this.vector3f.setVector3fOfficial(atmosphere.vector3f);
			this.skyColor = atmosphere.skyColor * 1;
			this.fogIntensity = 1 * atmosphere.fogIntensity;
			this.environmentMap = atmosphere.environmentMap;
			this.bloom = atmosphere.bloom;
			this.brightpass = atmosphere.brightpass;
			this.whitepoint = atmosphere.whitepoint;
			this.skybox = atmosphere.skybox;
	}

	void method4705(GraphicsToolkit class_ra, Atmosphere atmosphere, Atmosphere class385_2_, float f) {
			this.sunColor = StaticMethods.method4215((-1951302757 * atmosphere.sunColor), (class385_2_.sunColor * -1951302757), f * 255.0F) * 743535251;
			this.sunX = (f * (class385_2_.sunX - atmosphere.sunX) + atmosphere.sunX);
			this.sunY = ((class385_2_.sunY - atmosphere.sunY) * f + atmosphere.sunY);
			this.sunShineness = (f * (class385_2_.sunShineness - atmosphere.sunShineness) + atmosphere.sunShineness);
			this.whitepoint = ((class385_2_.whitepoint - atmosphere.whitepoint) * f + atmosphere.whitepoint);
			this.bloom = (atmosphere.bloom + f * (class385_2_.bloom - atmosphere.bloom));
			this.brightpass = (atmosphere.brightpass + f * (class385_2_.brightpass - atmosphere.brightpass));
			this.skyColor = StaticMethods.method4215((atmosphere.skyColor * -1269717659), (-1269717659 * class385_2_.skyColor), f * 255.0F) * -316996499;
			this.fogIntensity = (1820271565 * (int) ((float) (atmosphere.fogIntensity * -1939701499) + f * (float) ((class385_2_.fogIntensity * -1939701499) - (atmosphere.fogIntensity) * -1939701499)));
			if (atmosphere.environmentMap != class385_2_.environmentMap)
				this.environmentMap = class_ra.method5179((atmosphere.environmentMap), (class385_2_.environmentMap), f, this.environmentMap);
			if (class385_2_.skybox != atmosphere.skybox) {
				if (null == atmosphere.skybox) {
					this.skybox = class385_2_.skybox;
					if (this.skybox != null)
						this.skybox.method2583((int) (f * 255.0F), 0);
				} else {
					this.skybox = atmosphere.skybox;
					if (this.skybox != null)
						this.skybox.method2583((int) (f * 255.0F), 255);
				}
			}
	}

	public void method4706(Buffer buffer, LightingDetails class364) {
			int flag = buffer.readUByte();
			if (SettingsManager.settingsManager.lighting.getValue() == 1 && GameClient.activeGraphicsToolkit.method5048() > 0) {
				if (0 != (flag & 0x1))
					this.sunColor = buffer.readInt() * 743535251;
				else
					this.sunColor = -980012211 * SUN_COLOR;
				if ((flag & 0x2) != 0)
					this.sunShineness = ((float) buffer.readUShort() / 256.0F);
				else
					this.sunShineness = SUN_SHININESS;
				if ((flag & 0x4) != 0)
					this.sunX = ((float) buffer.readUShort() / 256.0F);
				else
					this.sunX = SUN_X_POSITION;
				if ((flag & 0x8) != 0)
					this.sunY = ((float) buffer.readUShort() / 256.0F);
				else
					this.sunY = SUN_Y_POSITION;
			} else {
				if ((flag & 0x1) != 0)
					buffer.readInt();
				if ((flag & 0x2) != 0)
					buffer.readUShort();
				if ((flag & 0x4) != 0)
					buffer.readUShort();
				if ((flag & 0x8) != 0)
					buffer.readUShort();
				this.sunColor = SUN_COLOR * -980012211;
				this.sunY = SUN_Y_POSITION;
				this.sunX = SUN_X_POSITION;
				this.sunShineness = SUN_SHININESS;
			}
			if ((flag & 0x10) != 0)
				this.vector3f = Vector3f.createVector3f((float) buffer.readShort(), (float) buffer.readShort(), (float) buffer.readShort());
			else
				this.vector3f = Vector3f.createVector3f(-50.0F, -60.0F, -50.0F);
			if ((flag & 0x20) != 0)
				this.skyColor = buffer.readInt() * -316996499;
			else
				this.skyColor = Atmosphere.SKY_COLOR * 1359380751;
			if (0 != (flag & 0x40))
				this.fogIntensity = buffer.readUShort() * 1820271565;
			else
				this.fogIntensity = 0;
			if (0 != (flag & 0x80)) {
				int faceTop = buffer.readUShort();
				int faceBottom = buffer.readUShort();
				int faceFront = buffer.readUShort();
				int faceBack = buffer.readUShort();
				int faceLeft = buffer.readUShort();
				int faceRight = buffer.readUShort();
				this.environmentMap = class364.createEnvironmentMap(faceTop, faceBottom, faceFront, faceBack, faceLeft, faceRight);
			} else
				this.environmentMap = EnvironmentMap.environmentMap;
			}


	public void decodeHDR(Buffer buffer) {
			this.bloom = (float) (buffer.readUByte() * 8) / 255.0F;
			this.brightpass = (float) (buffer.readUByte() * 8) / 255.0F;
			this.whitepoint = ((float) (buffer.readUByte() * 8) / 255.0F);
	}

	public Atmosphere() {
		reset();
	}

	boolean method4708(Atmosphere atmosphere) {
			return ((-1951302757 * atmosphere.sunColor == this.sunColor * -1951302757) && (this.sunShineness == atmosphere.sunShineness) && (atmosphere.sunX == this.sunX) && (atmosphere.sunY == this.sunY) && (atmosphere.brightpass == this.brightpass) && (this.bloom == atmosphere.bloom) && (atmosphere.whitepoint == this.whitepoint) && (-1269717659 * this.skyColor == atmosphere.skyColor * -1269717659) && (atmosphere.fogIntensity * -1939701499 == this.fogIntensity * -1939701499) && (atmosphere.environmentMap == this.environmentMap) && (atmosphere.skybox == this.skybox));
	}

	public int getSkyColor() {
			return -1269717659 * this.skyColor;
	}

	public Skybox getSkybox() {
			return this.skybox;
	}

	public void reset() {
			this.sunColor = SUN_COLOR * -980012211;
			this.vector3f = Vector3f.createVector3f(-50.0F, -60.0F, -50.0F);
			this.sunShineness = SUN_SHININESS;
			this.sunX = SUN_X_POSITION;
			this.sunY = SUN_Y_POSITION;
			this.skyColor = SKY_COLOR * 1359380751;
			this.fogIntensity = 0;
			this.environmentMap = EnvironmentMap.environmentMap;
			this.bloom = 1.0F;
			this.brightpass = 0.25F;
			this.whitepoint = 1.0F;
			this.skybox = Skybox.skybox;
	}

	public void decodeSkybox(Buffer buffer, LightingDetails lightingDetails) {
			int skyboxId = buffer.readUShort();
			int a = buffer.readShort();
			int b = buffer.readShort();
			int c = buffer.readShort();
			int d = buffer.readUShort();
			this.anInt1685 = 1827318333 * d;
			this.skybox = lightingDetails.createSkybox(skyboxId, a, b, c);
	}
}
