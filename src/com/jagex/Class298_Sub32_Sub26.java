package com.jagex;/* Class298_Sub32_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub26 extends Class298_Sub32 {
    int anInt9489 = -1528887782;

    public Class298_Sub32_Sub26() {
        super(2, false);
    }

    static final void method3307(Widget widget, int interfaceID, int i_258_, int i_259_, int i_260_, int i_261_, int i_262_, int i_263_, int i_264_, int i_265_) {
        if (Class378.componentExists(interfaceID, null)) {
            if (widget != null && !widget.method3573())
                Widget.closeInterface(widget, true, false);
            else {
                IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceID];
                IComponentDefinition.updateHiddenComponents(IComponentDefinitionCollection, IComponentDefinitionCollection.getComponentDefinitions(), -1, i_258_, i_259_, i_260_, i_261_, i_262_, i_263_, i_264_, i_265_);
            }
        }
    }

    int[] method3131(int i, int i_0_) {
        try {
            int[] is = aClass257_7384.method2448(i);
            if (aClass257_7384.aBoolean2810) {
                int[] is_1_ = method3129(0, i);
                int[] is_2_ = method3129(1, i);
                switch (1871252303 * this.anInt9489) {
                    case 5:
                        for (int i_3_ = 0; i_3_ < -1474554145 * Class250.anInt2755; i_3_++)
                            is[i_3_] = 4096 - ((4096 - is_2_[i_3_]) * (4096 - is_1_[i_3_]) >> 12);
                        break;
                    case 4:
                        for (int i_4_ = 0; i_4_ < -1474554145 * Class250.anInt2755; i_4_++) {
                            int i_5_ = is_2_[i_4_];
                            is[i_4_] = i_5_ != 0 ? (is_1_[i_4_] << 12) / i_5_ : 4096;
                        }
                        break;
                    case 10:
                        for (int i_6_ = 0; i_6_ < -1474554145 * Class250.anInt2755; i_6_++) {
                            int i_7_ = is_1_[i_6_];
                            int i_8_ = is_2_[i_6_];
                            is[i_6_] = i_7_ > i_8_ ? i_7_ : i_8_;
                        }
                        break;
                    case 1:
                        for (int i_9_ = 0; i_9_ < Class250.anInt2755 * -1474554145; i_9_++)
                            is[i_9_] = is_2_[i_9_] + is_1_[i_9_];
                        break;
                    case 8:
                        for (int i_10_ = 0; i_10_ < Class250.anInt2755 * -1474554145; i_10_++) {
                            int i_11_ = is_1_[i_10_];
                            is[i_10_] = (0 == i_11_ ? 0 : 4096 - (4096 - is_2_[i_10_] << 12) / i_11_);
                        }
                        break;
                    case 9:
                        for (int i_12_ = 0; i_12_ < -1474554145 * Class250.anInt2755; i_12_++) {
                            int i_13_ = is_1_[i_12_];
                            int i_14_ = is_2_[i_12_];
                            is[i_12_] = i_13_ < i_14_ ? i_13_ : i_14_;
                        }
                        break;
                    case 12:
                        for (int i_15_ = 0; i_15_ < -1474554145 * Class250.anInt2755; i_15_++) {
                            int i_16_ = is_1_[i_15_];
                            int i_17_ = is_2_[i_15_];
                            is[i_15_] = i_16_ + i_17_ - (i_17_ * i_16_ >> 11);
                        }
                        break;
                    case 11:
                        for (int i_18_ = 0; i_18_ < Class250.anInt2755 * -1474554145; i_18_++) {
                            int i_19_ = is_1_[i_18_];
                            int i_20_ = is_2_[i_18_];
                            is[i_18_] = i_19_ > i_20_ ? i_19_ - i_20_ : i_20_ - i_19_;
                        }
                        break;
                    case 3:
                        for (int i_21_ = 0; i_21_ < Class250.anInt2755 * -1474554145; i_21_++)
                            is[i_21_] = is_2_[i_21_] * is_1_[i_21_] >> 12;
                        break;
                    case 6:
                        for (int i_22_ = 0; i_22_ < Class250.anInt2755 * -1474554145; i_22_++) {
                            int i_23_ = is_2_[i_22_];
                            is[i_22_] = (i_23_ < 2048 ? is_1_[i_22_] * i_23_ >> 11 : 4096 - ((4096 - is_1_[i_22_]) * (4096 - i_23_) >> 11));
                        }
                        break;
                    case 7:
                        for (int i_24_ = 0; i_24_ < Class250.anInt2755 * -1474554145; i_24_++) {
                            int i_25_ = is_1_[i_24_];
                            is[i_24_] = (i_25_ == 4096 ? 4096 : (is_2_[i_24_] << 12) / (4096 - i_25_));
                        }
                        break;
                    case 2:
                        for (int i_26_ = 0; i_26_ < -1474554145 * Class250.anInt2755; i_26_++)
                            is[i_26_] = is_1_[i_26_] - is_2_[i_26_];
                        break;
                }
            }
            return is;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aho.i(").append(')').toString());
        }
    }

    void method3137(int code, Buffer buffer) {
            switch (code) {
                case 1:
                    aBoolean7382 = buffer.readUByte() == 1;
                    break;
                case 0:
                    this.anInt9489 = buffer.readUByte() * -970642513;
                    break;
            }
    }

    int[][] method3132(int i) {
        try {
            int[][] is = aClass239_7380.method2205(i);
            if (aClass239_7380.aBoolean2607) {
                int[][] is_114_ = method3134(0, i);
                int[][] is_115_ = method3134(1, i);
                int[] is_116_ = is[0];
                int[] is_117_ = is[1];
                int[] is_118_ = is[2];
                int[] is_119_ = is_114_[0];
                int[] is_120_ = is_114_[1];
                int[] is_121_ = is_114_[2];
                int[] is_122_ = is_115_[0];
                int[] is_123_ = is_115_[1];
                int[] is_124_ = is_115_[2];
                switch (1871252303 * this.anInt9489) {
                    case 7:
                        for (int i_125_ = 0; i_125_ < -1474554145 * Class250.anInt2755; i_125_++) {
                            int i_126_ = is_119_[i_125_];
                            int i_127_ = is_120_[i_125_];
                            int i_128_ = is_121_[i_125_];
                            is_116_[i_125_] = (i_126_ == 4096 ? 4096 : (is_122_[i_125_] << 12) / (4096 - i_126_));
                            is_117_[i_125_] = (i_127_ == 4096 ? 4096 : (is_123_[i_125_] << 12) / (4096 - i_127_));
                            is_118_[i_125_] = (i_128_ == 4096 ? 4096 : (is_124_[i_125_] << 12) / (4096 - i_128_));
                        }
                        break;
                    case 2:
                        for (int i_129_ = 0; i_129_ < Class250.anInt2755 * -1474554145; i_129_++) {
                            is_116_[i_129_] = is_119_[i_129_] - is_122_[i_129_];
                            is_117_[i_129_] = is_120_[i_129_] - is_123_[i_129_];
                            is_118_[i_129_] = is_121_[i_129_] - is_124_[i_129_];
                        }
                        break;
                    case 12:
                        for (int i_130_ = 0; i_130_ < -1474554145 * Class250.anInt2755; i_130_++) {
                            int i_131_ = is_119_[i_130_];
                            int i_132_ = is_120_[i_130_];
                            int i_133_ = is_121_[i_130_];
                            int i_134_ = is_122_[i_130_];
                            int i_135_ = is_123_[i_130_];
                            int i_136_ = is_124_[i_130_];
                            is_116_[i_130_] = i_131_ + i_134_ - (i_134_ * i_131_ >> 11);
                            is_117_[i_130_] = i_135_ + i_132_ - (i_132_ * i_135_ >> 11);
                            is_118_[i_130_] = i_136_ + i_133_ - (i_136_ * i_133_ >> 11);
                        }
                        break;
                    case 4:
                        for (int i_137_ = 0; i_137_ < Class250.anInt2755 * -1474554145; i_137_++) {
                            int i_138_ = is_122_[i_137_];
                            int i_139_ = is_123_[i_137_];
                            int i_140_ = is_124_[i_137_];
                            is_116_[i_137_] = (0 != i_138_ ? (is_119_[i_137_] << 12) / i_138_ : 4096);
                            is_117_[i_137_] = (0 != i_139_ ? (is_120_[i_137_] << 12) / i_139_ : 4096);
                            is_118_[i_137_] = (0 != i_140_ ? (is_121_[i_137_] << 12) / i_140_ : 4096);
                        }
                        break;
                    case 6:
                        for (int i_141_ = 0; i_141_ < Class250.anInt2755 * -1474554145; i_141_++) {
                            int i_142_ = is_122_[i_141_];
                            int i_143_ = is_123_[i_141_];
                            int i_144_ = is_124_[i_141_];
                            is_116_[i_141_] = (i_142_ < 2048 ? is_119_[i_141_] * i_142_ >> 11 : 4096 - ((4096 - is_119_[i_141_]) * (4096 - i_142_) >> 11));
                            is_117_[i_141_] = (i_143_ < 2048 ? is_120_[i_141_] * i_143_ >> 11 : 4096 - ((4096 - is_120_[i_141_]) * (4096 - i_143_) >> 11));
                            is_118_[i_141_] = (i_144_ < 2048 ? i_144_ * is_121_[i_141_] >> 11 : 4096 - ((4096 - is_121_[i_141_]) * (4096 - i_144_) >> 11));
                        }
                        break;
                    case 1:
                        for (int i_145_ = 0; i_145_ < Class250.anInt2755 * -1474554145; i_145_++) {
                            is_116_[i_145_] = is_122_[i_145_] + is_119_[i_145_];
                            is_117_[i_145_] = is_123_[i_145_] + is_120_[i_145_];
                            is_118_[i_145_] = is_124_[i_145_] + is_121_[i_145_];
                        }
                        break;
                    case 8:
                        for (int i_146_ = 0; i_146_ < Class250.anInt2755 * -1474554145; i_146_++) {
                            int i_147_ = is_119_[i_146_];
                            int i_148_ = is_120_[i_146_];
                            int i_149_ = is_121_[i_146_];
                            is_116_[i_146_] = i_147_ == 0 ? 0 : 4096 - (4096 - is_122_[i_146_] << 12) / i_147_;
                            is_117_[i_146_] = i_148_ == 0 ? 0 : 4096 - (4096 - is_123_[i_146_] << 12) / i_148_;
                            is_118_[i_146_] = 0 == i_149_ ? 0 : 4096 - (4096 - is_124_[i_146_] << 12) / i_149_;
                        }
                        break;
                    case 11:
                        for (int i_150_ = 0; i_150_ < -1474554145 * Class250.anInt2755; i_150_++) {
                            int i_151_ = is_119_[i_150_];
                            int i_152_ = is_120_[i_150_];
                            int i_153_ = is_121_[i_150_];
                            int i_154_ = is_122_[i_150_];
                            int i_155_ = is_123_[i_150_];
                            int i_156_ = is_124_[i_150_];
                            is_116_[i_150_] = (i_151_ > i_154_ ? i_151_ - i_154_ : i_154_ - i_151_);
                            is_117_[i_150_] = (i_152_ > i_155_ ? i_152_ - i_155_ : i_155_ - i_152_);
                            is_118_[i_150_] = (i_153_ > i_156_ ? i_153_ - i_156_ : i_156_ - i_153_);
                        }
                        break;
                    case 3:
                        for (int i_157_ = 0; i_157_ < -1474554145 * Class250.anInt2755; i_157_++) {
                            is_116_[i_157_] = is_122_[i_157_] * is_119_[i_157_] >> 12;
                            is_117_[i_157_] = is_120_[i_157_] * is_123_[i_157_] >> 12;
                            is_118_[i_157_] = is_121_[i_157_] * is_124_[i_157_] >> 12;
                        }
                        break;
                    case 5:
                        for (int i_158_ = 0; i_158_ < -1474554145 * Class250.anInt2755; i_158_++) {
                            is_116_[i_158_] = 4096 - (((4096 - is_122_[i_158_]) * (4096 - is_119_[i_158_])) >> 12);
                            is_117_[i_158_] = 4096 - (((4096 - is_123_[i_158_]) * (4096 - is_120_[i_158_])) >> 12);
                            is_118_[i_158_] = 4096 - (((4096 - is_121_[i_158_]) * (4096 - is_124_[i_158_])) >> 12);
                        }
                        break;
                    case 10:
                        for (int i_159_ = 0; i_159_ < -1474554145 * Class250.anInt2755; i_159_++) {
                            int i_160_ = is_119_[i_159_];
                            int i_161_ = is_120_[i_159_];
                            int i_162_ = is_121_[i_159_];
                            int i_163_ = is_122_[i_159_];
                            int i_164_ = is_123_[i_159_];
                            int i_165_ = is_124_[i_159_];
                            is_116_[i_159_] = i_160_ > i_163_ ? i_160_ : i_163_;
                            is_117_[i_159_] = i_161_ > i_164_ ? i_161_ : i_164_;
                            is_118_[i_159_] = i_162_ > i_165_ ? i_162_ : i_165_;
                        }
                        break;
                    case 9:
                        for (int i_166_ = 0; i_166_ < -1474554145 * Class250.anInt2755; i_166_++) {
                            int i_167_ = is_119_[i_166_];
                            int i_168_ = is_120_[i_166_];
                            int i_169_ = is_121_[i_166_];
                            int i_170_ = is_122_[i_166_];
                            int i_171_ = is_123_[i_166_];
                            int i_172_ = is_124_[i_166_];
                            is_116_[i_166_] = i_167_ < i_170_ ? i_167_ : i_170_;
                            is_117_[i_166_] = i_168_ < i_171_ ? i_168_ : i_171_;
                            is_118_[i_166_] = i_169_ < i_172_ ? i_169_ : i_172_;
                        }
                        break;
                }
            }
            return is;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aho.k(").append(')').toString());
        }
    }

}
