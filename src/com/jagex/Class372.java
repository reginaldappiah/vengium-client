package com.jagex;/* Class372 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class372 {
    static int[][] anIntArrayArray4047;
    static int anInt4048;
    static int anInt4049;
    static int anInt4050;
    static int anInt4051 = 0;

    static {
        anInt4048 = -153061732;
        anInt4049 = 0;
        anInt4050 = -2050841580;
    }

    Class372() throws Throwable {
        throw new Error();
    }

    public static boolean method4589(int i, String string) {
            Class474.activeConnectionInfo = new IPAddress();
            Class474.activeConnectionInfo.worldID = i * 348739329;
            Class474.activeConnectionInfo.host = string;
            if (StaticMethods.aClass401_2708 != Class401.aClass401_6557) {
                Class474.activeConnectionInfo.anInt5954 = (815680320 + -1670427267 * Class474.activeConnectionInfo.worldID);
                Class474.activeConnectionInfo.anInt5955 = (-52655920 + 925746937 * Class474.activeConnectionInfo.worldID);
            }
            return true;
    }

    public static Js5FileSystem loadIndex(Js5ArchiveEnum archiveEnum, boolean bool, int i) {
            if (null == OverlayDefinition.aJs5IndexSystemArray4072)
                OverlayDefinition.aJs5IndexSystemArray4072 = new ArchiveResourceProvider[Class356.method4268()];
            ResourceCache resourceCache = null;
            int i_7_ = archiveEnum.getIndex();
            if (null != GameClient.aBufferedFile_6476)
                resourceCache = new ResourceCache(i_7_, GameClient.aBufferedFile_6476, StaticMethods.aBufferedFileArray6106[i_7_], 1500000);
            OverlayDefinition.aJs5IndexSystemArray4072[i_7_] = StaticMethods.aClass225_2337.method2095(i_7_, resourceCache, (Class365_Sub1_Sub3_Sub2.aResourceCache_9933), 311001416);
            OverlayDefinition.aJs5IndexSystemArray4072[i_7_].method2278();
            return new Js5FileSystem(OverlayDefinition.aJs5IndexSystemArray4072[i_7_], bool, i);
    }

    public static void method4591(IComponentDefinition[] containedComponents, int parentID, int width, int height, boolean bool) {
        for (int index = 0; index < containedComponents.length; index++) {
            IComponentDefinition componentDefinition = containedComponents[index];
            if (null == componentDefinition) {
            } else if (componentDefinition.parentID != parentID) {
            } else {
                IComponentDefinition.updateResizeModes(componentDefinition, width, height, bool);
                IComponentDefinition.updatePositionModes(componentDefinition, width, height);
                if (684246511 * componentDefinition.anInt1166 > (1867913305 * componentDefinition.layerWidth - -2093041337 * componentDefinition.aspectWidth))
                    componentDefinition.anInt1166 = (1227329079 * componentDefinition.layerWidth - 2072992297 * componentDefinition.aspectWidth);
                if (684246511 * componentDefinition.anInt1166 < 0)
                    componentDefinition.anInt1166 = 0;
                if (-1424956747 * componentDefinition.anInt1167 > (2053897963 * componentDefinition.maxScrollVertical - componentDefinition.aspectHeight * 457937409))
                    componentDefinition.anInt1167 = (2097037087 * componentDefinition.maxScrollVertical - componentDefinition.aspectHeight * -900266595);
                if (-1424956747 * componentDefinition.anInt1167 < 0)
                    componentDefinition.anInt1167 = 0;
                if (componentDefinition.type * -1215239439 == IComponentDefinition.CONTAINER)
                    IComponentDefinition.method1282(containedComponents, componentDefinition, bool);
            }
        }
    }

    static void method4592() {
        Class10.entitiesInRegion = 0;
        for (int i_12_ = 0; i_12_ < 2048; i_12_++) {
            Class10.aClass298_Sub53Array133[i_12_] = null;
            Class10.playersMovementTypes[i_12_] = Class282.aClass282_6540.aByte6542;
            Class10.aClass410Array138[i_12_] = null;
        }
    }

    static final boolean method4593(int i, int i_13_, int i_14_, Class336 class336, Class289 class289, byte i_15_) {
        try {
            int i_16_ = i;
            int i_17_ = i_13_;
            int i_18_ = 64;
            int i_19_ = 64;
            int i_20_ = i - i_18_;
            int i_21_ = i_13_ - i_19_;
            Class285.anIntArrayArray3076[i_18_][i_19_] = 99;
            Class285.anIntArrayArray3080[i_18_][i_19_] = 0;
            int i_22_ = 0;
            int i_23_ = 0;
            Class285.routeFinderXArray[i_22_] = i_16_;
            Class285.routeFinderYArray[i_22_++] = i_17_;
            int[][] is = class289.anIntArrayArray3155;
            while_101_:
            while (i_23_ != i_22_) {
                i_16_ = Class285.routeFinderXArray[i_23_];
                i_17_ = Class285.routeFinderYArray[i_23_];
                i_23_ = i_23_ + 1 & 0xfff;
                i_18_ = i_16_ - i_20_;
                i_19_ = i_17_ - i_21_;
                int i_24_ = i_16_ - 1487776559 * class289.anInt3151;
                int i_25_ = i_17_ - class289.anInt3152 * 1415525851;
                if (class336.method4090(i_14_, i_16_, i_17_, class289, -16711936)) {
                    Class285.anInt3078 = i_16_ * 1021042197;
                    ClanMember.anInt1684 = -575994451 * i_17_;
                    return true;
                }
                int i_26_ = Class285.anIntArrayArray3080[i_18_][i_19_] + 1;
                while_94_:
                do {
                    if (i_18_ > 0) {
                        if (Class285.anIntArrayArray3076[i_18_ - 1][i_19_] != 0) {
                            if (i_15_ <= 36) {
                                /* empty */
                            }
                        } else if (0 != (is[i_24_ - 1][i_25_] & 0x43a40000)) {
                            if (i_15_ <= 36)
                                throw new IllegalStateException();
                        } else if (0 != (is[i_24_ - 1][i_14_ + i_25_ - 1] & 0x4e240000)) {
                            if (i_15_ <= 36) {
                                /* empty */
                            }
                        } else {
                            for (int i_27_ = 1; i_27_ < i_14_ - 1; i_27_++) {
                                if (0 != (is[i_24_ - 1][i_25_ + i_27_] & 0x4fa40000)) {
                                    if (i_15_ <= 36)
                                        throw new IllegalStateException();
                                    break while_94_;
                                }
                            }
                            Class285.routeFinderXArray[i_22_] = i_16_ - 1;
                            Class285.routeFinderYArray[i_22_] = i_17_;
                            i_22_ = 1 + i_22_ & 0xfff;
                            Class285.anIntArrayArray3076[i_18_ - 1][i_19_] = 2;
                            Class285.anIntArrayArray3080[i_18_ - 1][i_19_] = i_26_;
                        }
                    }
                } while (false);
                while_95_:
                do {
                    if (i_18_ < 128 - i_14_) {
                        if (0 != (Class285.anIntArrayArray3076[1 + i_18_][i_19_])) {
                            if (i_15_ <= 36)
                                throw new IllegalStateException();
                        } else if (0 != (is[i_24_ + i_14_][i_25_] & 0x60e40000)) {
                            if (i_15_ <= 36) {
								/* empty */
                            }
                        } else if ((is[i_14_ + i_24_][i_14_ + i_25_ - 1] & 0x78240000) != 0) {
                            if (i_15_ <= 36) {
								/* empty */
                            }
                        } else {
                            for (int i_28_ = 1; i_28_ < i_14_ - 1; i_28_++) {
                                if (0 != (is[i_14_ + i_24_][i_25_ + i_28_] & 0x78e40000)) {
                                    if (i_15_ <= 36)
                                        throw new IllegalStateException();
                                    break while_95_;
                                }
                            }
                            Class285.routeFinderXArray[i_22_] = 1 + i_16_;
                            Class285.routeFinderYArray[i_22_] = i_17_;
                            i_22_ = 1 + i_22_ & 0xfff;
                            Class285.anIntArrayArray3076[i_18_ + 1][i_19_] = 8;
                            Class285.anIntArrayArray3080[i_18_ + 1][i_19_] = i_26_;
                        }
                    }
                } while (false);
                while_96_:
                do {
                    if (i_19_ > 0) {
                        if (0 != (Class285.anIntArrayArray3076[i_18_][i_19_ - 1])) {
                            if (i_15_ <= 36)
                                throw new IllegalStateException();
                        } else if ((is[i_24_][i_25_ - 1] & 0x43a40000) != 0) {
                            if (i_15_ <= 36)
                                throw new IllegalStateException();
                        } else if (0 != (is[i_24_ + i_14_ - 1][i_25_ - 1] & 0x60e40000)) {
                            if (i_15_ <= 36) {
								/* empty */
                            }
                        } else {
                            for (int i_29_ = 1; i_29_ < i_14_ - 1; i_29_++) {
                                if (0 != (is[i_29_ + i_24_][i_25_ - 1] & 0x63e40000)) {
                                    if (i_15_ <= 36) {
										/* empty */
                                    }
                                    break while_96_;
                                }
                            }
                            Class285.routeFinderXArray[i_22_] = i_16_;
                            Class285.routeFinderYArray[i_22_] = i_17_ - 1;
                            i_22_ = 1 + i_22_ & 0xfff;
                            Class285.anIntArrayArray3076[i_18_][i_19_ - 1] = 1;
                            Class285.anIntArrayArray3080[i_18_][i_19_ - 1] = i_26_;
                        }
                    }
                } while (false);
                while_97_:
                do {
                    if (i_19_ < 128 - i_14_) {
                        if (Class285.anIntArrayArray3076[i_18_][i_19_ + 1] != 0) {
                            if (i_15_ <= 36) {
								/* empty */
                            }
                        } else if ((is[i_24_][i_14_ + i_25_] & 0x4e240000) != 0) {
                            if (i_15_ <= 36) {
								/* empty */
                            }
                        } else if (0 != (is[i_24_ + i_14_ - 1][i_25_ + i_14_] & 0x78240000)) {
                            if (i_15_ <= 36) {
								/* empty */
                            }
                        } else {
                            for (int i_30_ = 1; i_30_ < i_14_ - 1; i_30_++) {
                                if (0 != (is[i_30_ + i_24_][i_14_ + i_25_] & 0x7e240000)) {
                                    if (i_15_ <= 36)
                                        throw new IllegalStateException();
                                    break while_97_;
                                }
                            }
                            Class285.routeFinderXArray[i_22_] = i_16_;
                            Class285.routeFinderYArray[i_22_] = i_17_ + 1;
                            i_22_ = i_22_ + 1 & 0xfff;
                            Class285.anIntArrayArray3076[i_18_][1 + i_19_] = 4;
                            Class285.anIntArrayArray3080[i_18_][i_19_ + 1] = i_26_;
                        }
                    }
                } while (false);
                while_98_:
                do {
                    if (i_18_ > 0 && i_19_ > 0) {
                        if (Class285.anIntArrayArray3076[i_18_ - 1][i_19_ - 1] != 0) {
                            if (i_15_ <= 36)
                                throw new IllegalStateException();
                        } else if ((is[i_24_ - 1][i_25_ - 1] & 0x43a40000) != 0) {
                            if (i_15_ <= 36)
                                throw new IllegalStateException();
                        } else {
                            for (int i_31_ = 1; i_31_ < i_14_; i_31_++) {
                                if ((is[i_24_ - 1][i_25_ - 1 + i_31_] & 0x4fa40000) != 0) {
                                    if (i_15_ <= 36) {
										/* empty */
                                    }
                                    break while_98_;
                                }
                                if ((is[i_24_ - 1 + i_31_][i_25_ - 1] & 0x63e40000) != 0) {
                                    if (i_15_ <= 36) {
										/* empty */
                                    }
                                    break while_98_;
                                }
                            }
                            Class285.routeFinderXArray[i_22_] = i_16_ - 1;
                            Class285.routeFinderYArray[i_22_] = i_17_ - 1;
                            i_22_ = i_22_ + 1 & 0xfff;
                            Class285.anIntArrayArray3076[i_18_ - 1][i_19_ - 1] = 3;
                            Class285.anIntArrayArray3080[i_18_ - 1][i_19_ - 1] = i_26_;
                        }
                    }
                } while (false);
                while_99_:
                do {
                    if (i_18_ < 128 - i_14_ && i_19_ > 0) {
                        if (Class285.anIntArrayArray3076[1 + i_18_][i_19_ - 1] != 0) {
                            if (i_15_ <= 36) {
								/* empty */
                            }
                        } else if ((is[i_14_ + i_24_][i_25_ - 1] & 0x60e40000) != 0) {
                            if (i_15_ <= 36) {
								/* empty */
                            }
                        } else {
                            for (int i_32_ = 1; i_32_ < i_14_; i_32_++) {
                                if (0 != (is[i_24_ + i_14_][i_25_ - 1 + i_32_] & 0x78e40000)) {
                                    if (i_15_ <= 36)
                                        throw new IllegalStateException();
                                    break while_99_;
                                }
                                if ((is[i_24_ + i_32_][i_25_ - 1] & 0x63e40000) != 0) {
                                    if (i_15_ <= 36) {
										/* empty */
                                    }
                                    break while_99_;
                                }
                            }
                            Class285.routeFinderXArray[i_22_] = i_16_ + 1;
                            Class285.routeFinderYArray[i_22_] = i_17_ - 1;
                            i_22_ = i_22_ + 1 & 0xfff;
                            Class285.anIntArrayArray3076[i_18_ + 1][i_19_ - 1] = 9;
                            Class285.anIntArrayArray3080[i_18_ + 1][i_19_ - 1] = i_26_;
                        }
                    }
                } while (false);
                while_100_:
                do {
                    if (i_18_ > 0 && i_19_ < 128 - i_14_) {
                        if (0 != (Class285.anIntArrayArray3076[i_18_ - 1][1 + i_19_])) {
                            if (i_15_ <= 36) {
								/* empty */
                            }
                        } else if (0 != (is[i_24_ - 1][i_14_ + i_25_] & 0x4e240000)) {
                            if (i_15_ <= 36) {
								/* empty */
                            }
                        } else {
                            for (int i_33_ = 1; i_33_ < i_14_; i_33_++) {
                                if ((is[i_24_ - 1][i_33_ + i_25_] & 0x4fa40000) != 0) {
                                    if (i_15_ <= 36)
                                        throw new IllegalStateException();
                                    break while_100_;
                                }
                                if (0 != (is[i_33_ + (i_24_ - 1)][i_14_ + i_25_] & 0x7e240000)) {
                                    if (i_15_ <= 36) {
										/* empty */
                                    }
                                    break while_100_;
                                }
                            }
                            Class285.routeFinderXArray[i_22_] = i_16_ - 1;
                            Class285.routeFinderYArray[i_22_] = 1 + i_17_;
                            i_22_ = 1 + i_22_ & 0xfff;
                            Class285.anIntArrayArray3076[i_18_ - 1][1 + i_19_] = 6;
                            Class285.anIntArrayArray3080[i_18_ - 1][1 + i_19_] = i_26_;
                        }
                    }
                } while (false);
                if (i_18_ < 128 - i_14_ && i_19_ < 128 - i_14_) {
                    if (0 != (Class285.anIntArrayArray3076[1 + i_18_][1 + i_19_])) {
                        if (i_15_ <= 36) {
							/* empty */
                        }
                    } else if ((is[i_14_ + i_24_][i_25_ + i_14_] & 0x78240000) != 0) {
                        if (i_15_ <= 36)
                            throw new IllegalStateException();
                    } else {
                        for (int i_34_ = 1; i_34_ < i_14_; i_34_++) {
                            if (0 != (is[i_24_ + i_34_][i_25_ + i_14_] & 0x7e240000)) {
                                if (i_15_ <= 36) {
									/* empty */
                                }
                                continue while_101_;
                            }
                            if (0 != (is[i_24_ + i_14_][i_34_ + i_25_] & 0x78e40000)) {
                                if (i_15_ <= 36) {
									/* empty */
                                }
                                continue while_101_;
                            }
                        }
                        Class285.routeFinderXArray[i_22_] = i_16_ + 1;
                        Class285.routeFinderYArray[i_22_] = 1 + i_17_;
                        i_22_ = i_22_ + 1 & 0xfff;
                        Class285.anIntArrayArray3076[i_18_ + 1][1 + i_19_] = 12;
                        Class285.anIntArrayArray3080[i_18_ + 1][i_19_ + 1] = i_26_;
                    }
                }
            }
            Class285.anInt3078 = 1021042197 * i_16_;
            ClanMember.anInt1684 = -575994451 * i_17_;
            return false;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pl.p(").append(')').toString());
        }
    }

    static void method4594(int i) {
        Class481.anInt6035 = 259213147 * i;
        HintIcon.cache.clear();
    }

    static void method4595() {
        FontToolkit.fontToolkit = null;
        StaticMethods.aClass264_3673 = null;
        StaticMethods.b12_full_monochrome = null;
        Class160.aClass57Array1646 = null;
        Class401.aClass57Array6561 = null;
        StaticMethods.aClass57Array5334 = null;
        StaticMethods.aClass57Array5351 = null;
        HintIcon.arrowTypeSprites = null;
        Class74.arrowSprites = null;
        Class234.aClass57Array2598 = null;
        StaticMethods.aClass57Array6861 = null;
        SubIncommingPacket.aClass57Array2349 = null;
        StaticMedia.nameIconSprites = null;
        StaticMethods.activeSpriteToolkit = null;
        Graphics.aClass57_573 = null;
        Class250.aClass57Array2766 = null;
    }
}
