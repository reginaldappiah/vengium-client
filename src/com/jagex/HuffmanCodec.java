package com.jagex;

public class HuffmanCodec {
    int[] codeTable;
    byte[] codeLengths;
    int[] tree;

    public HuffmanCodec(byte[] data) {
        int symbolCount = data.length;
        this.codeTable = new int[symbolCount];
        this.codeLengths = data;
        int[] nextCodes = new int[33];
        this.tree = new int[8];
        int treeSize = 0;
        for (int index = 0; index < symbolCount; index++) {
            int i_3_ = data[index];
            if (0 != i_3_) {
                int bit = 1 << 32 - i_3_;
                int i_5_ = nextCodes[i_3_];
                this.codeTable[index] = i_5_;
                int i_6_;
                if ((i_5_ & bit) != 0) i_6_ = nextCodes[i_3_ - 1];
                else {
                    i_6_ = i_5_ | bit;
                    for (int i_7_ = i_3_ - 1; i_7_ >= 1; i_7_--) {
                        int i_8_ = nextCodes[i_7_];
                        if (i_5_ != i_8_) break;
                        int i_9_ = 1 << 32 - i_7_;
                        if (0 != (i_8_ & i_9_)) {
                            nextCodes[i_7_] = nextCodes[i_7_ - 1];
                            break;
                        }
                        nextCodes[i_7_] = i_8_ | i_9_;
                    }
                }
                nextCodes[i_3_] = i_6_;
                for (int i_10_ = 1 + i_3_; i_10_ <= 32; i_10_++) {
                    if (nextCodes[i_10_] == i_5_) nextCodes[i_10_] = i_6_;
                }
                int i_11_ = 0;
                for (int i_12_ = 0; i_12_ < i_3_; i_12_++) {
                    int i_13_ = -2147483648 >>> i_12_;
                    if ((i_5_ & i_13_) != 0) {
                        if (this.tree[i_11_] == 0) this.tree[i_11_] = treeSize;
                        i_11_ = this.tree[i_11_];
                    } else i_11_++;
                    if (i_11_ >= this.tree.length) {
                        int[] is_14_ = (new int[2 * this.tree.length]);
                        for (int i_15_ = 0; i_15_ < this.tree.length; i_15_++)
                            is_14_[i_15_] = this.tree[i_15_];
                        this.tree = is_14_;
                    }
                    i_13_ >>>= 1;
                }
                this.tree[i_11_] = index ^ 0xffffffff;
                if (i_11_ >= treeSize) treeSize = 1 + i_11_;
            }
        }
    }

    int method1245(byte[] is, int i, byte[] is_16_, int i_17_, int i_18_, int i_19_) {
        if (0 == i_18_) return 0;
        int i_20_ = 0;
        i_18_ += i_17_;
        int i_21_ = i;
        for (; ; ) {
            byte i_22_ = is[i_21_];
            if (i_22_ < 0) i_20_ = this.tree[i_20_];
            else i_20_++;
            int i_23_;
            if ((i_23_ = this.tree[i_20_]) < 0) {
                is_16_[i_17_++] = (byte) (i_23_ ^ 0xffffffff);
                if (i_17_ >= i_18_) {
                    if (i_19_ == 787727170) {
                            /* empty */
                    }
                    break;
                }
                i_20_ = 0;
            }
            if ((i_22_ & 0x40) != 0) i_20_ = this.tree[i_20_];
            else i_20_++;
            if ((i_23_ = this.tree[i_20_]) < 0) {
                is_16_[i_17_++] = (byte) (i_23_ ^ 0xffffffff);
                if (i_17_ >= i_18_) {
                    if (i_19_ == 787727170) throw new IllegalStateException();
                    break;
                }
                i_20_ = 0;
            }
            if (0 != (i_22_ & 0x20)) i_20_ = this.tree[i_20_];
            else i_20_++;
            if ((i_23_ = this.tree[i_20_]) < 0) {
                is_16_[i_17_++] = (byte) (i_23_ ^ 0xffffffff);
                if (i_17_ >= i_18_) {
                    if (i_19_ == 787727170) {
							/* empty */
                    }
                    break;
                }
                i_20_ = 0;
            }
            if ((i_22_ & 0x10) != 0) i_20_ = this.tree[i_20_];
            else i_20_++;
            if ((i_23_ = this.tree[i_20_]) < 0) {
                is_16_[i_17_++] = (byte) (i_23_ ^ 0xffffffff);
                if (i_17_ >= i_18_) {
                    if (i_19_ == 787727170) {
							/* empty */
                    }
                    break;
                }
                i_20_ = 0;
            }
            if ((i_22_ & 0x8) != 0) i_20_ = this.tree[i_20_];
            else i_20_++;
            if ((i_23_ = this.tree[i_20_]) < 0) {
                is_16_[i_17_++] = (byte) (i_23_ ^ 0xffffffff);
                if (i_17_ >= i_18_) {
                    if (i_19_ == 787727170) throw new IllegalStateException();
                    break;
                }
                i_20_ = 0;
            }
            if ((i_22_ & 0x4) != 0) i_20_ = this.tree[i_20_];
            else i_20_++;
            if ((i_23_ = this.tree[i_20_]) < 0) {
                is_16_[i_17_++] = (byte) (i_23_ ^ 0xffffffff);
                if (i_17_ >= i_18_) {
                    if (i_19_ == 787727170) {
							/* empty */
                    }
                    break;
                }
                i_20_ = 0;
            }
            if (0 != (i_22_ & 0x2)) i_20_ = this.tree[i_20_];
            else i_20_++;
            if ((i_23_ = this.tree[i_20_]) < 0) {
                is_16_[i_17_++] = (byte) (i_23_ ^ 0xffffffff);
                if (i_17_ >= i_18_) {
                    if (i_19_ == 787727170) throw new IllegalStateException();
                    break;
                }
                i_20_ = 0;
            }
            if ((i_22_ & 0x1) != 0) i_20_ = this.tree[i_20_];
            else i_20_++;
            if ((i_23_ = this.tree[i_20_]) < 0) {
                is_16_[i_17_++] = (byte) (i_23_ ^ 0xffffffff);
                if (i_17_ >= i_18_) {
                    if (i_19_ == 787727170) throw new IllegalStateException();
                    break;
                }
                i_20_ = 0;
            }
            i_21_++;
        }
        return i_21_ + 1 - i;
    }

    int method1246(byte[] is, int i, int i_24_, byte[] is_25_, int i_26_, byte i_27_) {
        int i_28_ = 0;
        int i_29_ = i_26_ << 3;
        for (i_24_ += i; i < i_24_; i++) {
            int i_30_ = is[i] & 0xff;
            int i_31_ = this.codeTable[i_30_];
            int i_32_ = this.codeLengths[i_30_];
            if (0 == i_32_) throw new RuntimeException(new StringBuilder().append("").append(i_30_).toString());
            int i_33_ = i_29_ >> 3;
            int i_34_ = i_29_ & 0x7;
            i_28_ &= -i_34_ >> 31;
            int i_35_ = i_33_ + (i_34_ + i_32_ - 1 >> 3);
            i_34_ += 24;
            is_25_[i_33_] = (byte) (i_28_ |= i_31_ >>> i_34_);
            if (i_33_ >= i_35_) {
                if (i_27_ >= 23) throw new IllegalStateException();
            } else {
                i_33_++;
                i_34_ -= 8;
                is_25_[i_33_] = (byte) (i_28_ = i_31_ >>> i_34_);
                if (i_33_ >= i_35_) {
                    if (i_27_ >= 23) {
							/* empty */
                    }
                } else {
                    i_33_++;
                    i_34_ -= 8;
                    is_25_[i_33_] = (byte) (i_28_ = i_31_ >>> i_34_);
                    if (i_33_ >= i_35_) {
                        if (i_27_ >= 23) {
								/* empty */
                        }
                    } else {
                        i_33_++;
                        i_34_ -= 8;
                        is_25_[i_33_] = (byte) (i_28_ = i_31_ >>> i_34_);
                        if (i_33_ >= i_35_) {
                            if (i_27_ >= 23) {
									/* empty */
                            }
                        } else {
                            i_33_++;
                            i_34_ -= 8;
                            is_25_[i_33_] = (byte) (i_28_ = i_31_ << -i_34_);
                        }
                    }
                }
            }
            i_29_ += i_32_;
        }
        return (i_29_ + 7 >> 3) - i_26_;
    }

}
