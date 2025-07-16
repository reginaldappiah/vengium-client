package com.jagex;/* Class308_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;

public class Class308_Sub1 extends Class308 {
    int anInt7668;
    Js5FileSystem aClass243_7670;
    byte[][] aByteArrayArray7671 = new byte[10][];
    int[] anIntArray7672;
    int anInt7673;
    Buffer aClass298_Sub53_7674 = new Buffer(null);
    Buffer aClass298_Sub53_7675 = new Buffer(null);

    public Class308_Sub1(int i, Js5FileSystem class243, int i_19_) {
        super(i);
        this.aClass243_7670 = class243;
        this.anInt7668 = -2133150071 * i_19_;
    }

    static final void method3786(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
            String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
            if (Class298_Sub6.method2863(string, runtime) != null) {
                string = string.substring(0, string.length() - 1);
            }
            componentDefinition.onReleaseHook = Class128_Sub2.method1441(string, runtime);
            componentDefinition.hasScript = true;
    }

    int method3775(byte[] buffer) throws IOException {
        if (this.anIntArray7672 == null) {
            if (!this.aClass243_7670.fileExists(this.anInt7668 * -247750727, 0)) {
                return 0;
            }
            byte[] is_0_ = (this.aClass243_7670.getFileFromArchive(-247750727 * this.anInt7668, 0));
            if (null == is_0_) {
                throw new IllegalStateException("");
            }
            this.aClass298_Sub53_7675.buffer = is_0_;
            this.aClass298_Sub53_7675.offset = 0;
            int i_1_ = is_0_.length >> 1;
            this.anIntArray7672 = new int[i_1_];
            for (int index = 0; index < i_1_; index++)
                this.anIntArray7672[index] = this.aClass298_Sub53_7675.readUShort();
        }
        if (this.anInt7673 * 352672983 >= this.anIntArray7672.length) {
            return -1;
        }
        method3785();
        this.aClass298_Sub53_7675.buffer = buffer;
        this.aClass298_Sub53_7675.offset = 0;
        while_9_:
        do {
            do {
                if ((this.aClass298_Sub53_7675.offset * 385051775) >= (this.aClass298_Sub53_7675.buffer).length) {
                    break while_9_;
                }
                if ((this.aClass298_Sub53_7674.buffer) == null) {
                    if (this.aByteArrayArray7671[0] == null) {
                        this.aClass298_Sub53_7675.buffer = null;
                        return ((this.aClass298_Sub53_7675.offset) * 385051775);
                    }
                    this.aClass298_Sub53_7674.buffer = this.aByteArrayArray7671[0];
                }
                int i_3_ = ((this.aClass298_Sub53_7675.buffer).length - 385051775 * (this.aClass298_Sub53_7675.offset));
                int i_4_ = ((this.aClass298_Sub53_7674.buffer).length - 385051775 * (this.aClass298_Sub53_7674.offset));
                if (i_3_ < i_4_) {
                    this.aClass298_Sub53_7674.readBytes((this.aClass298_Sub53_7675.buffer), (this.aClass298_Sub53_7675.offset) * 385051775, i_3_);
                    this.aClass298_Sub53_7675.buffer = null;
                    return buffer.length;
                }
                this.aClass298_Sub53_7675.writeBytes((this.aClass298_Sub53_7674.buffer), (this.aClass298_Sub53_7674.offset * 385051775), i_4_);
                this.aClass298_Sub53_7674.buffer = null;
                this.aClass298_Sub53_7674.offset = 0;
                this.anInt7673 += -592488729;
                for (int i_5_ = 0; i_5_ < 9; i_5_++)
                    this.aByteArrayArray7671[i_5_] = (this.aByteArrayArray7671[1 + i_5_]);
                this.aByteArrayArray7671[9] = null;
            } while (this.anInt7673 * 352672983 < this.anIntArray7672.length);
            this.aClass298_Sub53_7675.buffer = null;
            return (this.aClass298_Sub53_7675.offset * 385051775);
        } while (false);
        this.aClass298_Sub53_7675.buffer = null;
        return buffer.length;
    }

    public void method3785() {
        if (null != this.anIntArray7672) {
            for (int i_6_ = 0; (i_6_ < 10 && (i_6_ + 352672983 * this.anInt7673 < this.anIntArray7672.length)); i_6_++) {
                if ((this.aByteArrayArray7671[i_6_] == null) && (this.aClass243_7670.fileExists((this.anIntArray7672[i_6_ + (352672983 * this.anInt7673)]), 0))) {
                    this.aByteArrayArray7671[i_6_] = (this.aClass243_7670.getFileFromArchive((this.anIntArray7672[(352672983 * this.anInt7673 + i_6_)]), 0));
                }
            }
        }

    }
}
