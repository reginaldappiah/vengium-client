package com.jagex;/* Class486 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.prefetch.Js5List;

public class Js5CacheWrite {
    public static SpriteToolkit aClass57_6062;
    static Js5CacheWrite aClass486_6060 = new Js5CacheWrite();
    static Js5CacheWrite aClass486_6061 = new Js5CacheWrite();
    static String aString6063;

    Js5CacheWrite() {
        /* empty */
    }

    static void writeCacheCRCs(RsBitsBuffer bitsBuffer) {
        bitsBuffer.writeInt(Js5List.JS5_ANIMSKINS.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_BASES.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_CONFIG.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_INTERFACES.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_SOUND_EFFECTS.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_MAPS.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_MUSIC.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_MDOELS.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_SPRITES.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_TEXTURES.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_BINARY.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_MUSIC2.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_CLIENTSCRIPTS.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_FONTMETRICS.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_SOUND_EFFECTS2.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_SOUND_EFFECTS3.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_CONFIG_OBJECTS.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_CONFIG_ENUM.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_CONFIG_NPC.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_CONFIG_ITEMS.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_CONFIG_SEQ.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_CONFIG_SPOT.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_CONFIG_SCRIPT.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_WORLDMAPDATA.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_QUICKCHAT.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_QUICKCHAT_GLOBAL.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_MATERIALS.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_CONFIG_PARTICLE.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_DEFAULTS_FILE.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_CONFIG_BILLBOARD.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_NATIVE_LIBRARIES.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_SHADERS.getCRC());
        bitsBuffer.writeInt(Class436.method5810());
        bitsBuffer.writeInt(Exception_Sub2.method274((byte) 53));
        bitsBuffer.writeInt(Js5List.JS5_CUTSCENES.getCRC());
        bitsBuffer.writeInt(Js5List.JS5_VORBIS.getCRC());
    }

}
