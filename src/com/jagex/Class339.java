package com.jagex;/* Class339 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.ConfigType;

public class Class339 {
    SoftCache aClass348_3633 = new SoftCache(128);
    Js5FileSystem aClass243_3634;
    SoftCache aClass348_3635 = new SoftCache(64);
    Js5FileSystem aClass243_3638;

    public Class339(Js5FileSystem class243, Js5FileSystem class243_4_) {
        this.aClass243_3634 = class243;
        this.aClass243_3638 = class243_4_;
        this.aClass243_3634.getFileSystem(((ConfigType.WORLD_MAP_INFO.type) * -1006924897));
    }

    public Class352 method4116(int fileID) {
        Class352 class352;
        synchronized (this.aClass348_3633) {
            class352 = (Class352) this.aClass348_3633.get((long) fileID);
        }
        if (null != class352)
            return class352;
        byte[] is;
        synchronized (this.aClass243_3634) {
            is = (this.aClass243_3634.getFileFromArchive(-1006924897 * ConfigType.WORLD_MAP_INFO.type, fileID));
        }
        class352 = new Class352();
        class352.anInt3784 = fileID * -1314224517;
        class352.aClass339_3776 = this;
        if (null != is)
            class352.readValueLoop(new Buffer(is));
        class352.method4236();
        synchronized (this.aClass348_3633) {
            this.aClass348_3633.put(class352, (long) fileID);
        }
        return class352;
    }

    public void method4117(int i) {
        synchronized (this.aClass348_3633) {
            this.aClass348_3633.method4186(i);
        }
        synchronized (this.aClass348_3635) {
            this.aClass348_3635.method4186(i);
        }
    }

    public void clear() {
        synchronized (this.aClass348_3633) {
            this.aClass348_3633.clear();
        }
        synchronized (this.aClass348_3635) {
            this.aClass348_3635.clear();
        }
    }

    public void method4119(int i, int i_2_) {
        this.aClass348_3633 = new SoftCache(i);
        this.aClass348_3635 = new SoftCache(i_2_);
    }

    public void sweep() {
        synchronized (this.aClass348_3633) {
            this.aClass348_3633.sweep();
        }
        synchronized (this.aClass348_3635) {
            this.aClass348_3635.sweep();
        }
    }

}
