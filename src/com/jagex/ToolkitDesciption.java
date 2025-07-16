package com.jagex;/* ToolkitDesciption - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ToolkitDesciption {
    public static final int NVIDIA = 4318;
    public static final int ATI = 4098;
    public static final int DEFAULT = -1;
    public static final int SSE = 0;
    public static final int INTEL = 32902;
    public int vendor;
    public String device;
    public int version;
    public String renderer;
    public long driverVersion;

    public ToolkitDesciption(int vendor, String renderer, int version, String extensions, long driverVersion) {
        this.vendor = vendor * -665725969;
        this.renderer = renderer;
        this.version = -364036995 * version;
        this.device = extensions;
        this.driverVersion = driverVersion * -6963750442385516415L;
    }
}
