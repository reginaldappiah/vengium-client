package com.jagex;/* Class298_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class298_Sub32 extends Node {
	Class298_Sub32[] aClass298_Sub32Array7371;
	protected Class239 aClass239_7380;
	int anInt7381;
	protected boolean aBoolean7382;
	protected Class257 aClass257_7384;

	void method3128(int i) {
			if (aBoolean7382) {
				aClass257_7384.method2447();
				aClass257_7384 = null;
			} else {
				aClass239_7380.method2203(1128240518);
				aClass239_7380 = null;
			}
	}

	final int[] method3129(int i, int i_0_) {
			if (!this.aClass298_Sub32Array7371[i].aBoolean7382)
				return (this.aClass298_Sub32Array7371[i].method3132(i_0_)[0]);
			return this.aClass298_Sub32Array7371[i].method3131(i_0_, 891860141);
	}

	void method3130(int i, int i_2_, int i_3_) {
			int i_4_ = (255 == this.anInt7381 * -1006569959 ? i_2_ : this.anInt7381 * -1006569959);
			if (aBoolean7382)
				aClass257_7384 = new Class257(i_4_, i_2_, i);
			else
				aClass239_7380 = new Class239(i_4_, i_2_, i);
	}

	int[] method3131(int i, int i_5_) {
			throw new IllegalStateException();
	}

	int[][] method3132(int i) {
			throw new IllegalStateException();
	}

	void method3133(int i) {

	}

	final int[][] method3134(int i, int i_7_) {
		if (this.aClass298_Sub32Array7371[i].aBoolean7382) {
			int[] is = this.aClass298_Sub32Array7371[i].method3131(i_7_, 1101139178);
			int[][] is_9_ = new int[3][];
			is_9_[0] = is;
			is_9_[1] = is;
			is_9_[2] = is;
			return is_9_;
		}
		return this.aClass298_Sub32Array7371[i].method3132(i_7_);
	}

	Class298_Sub32(int i, boolean bool) {
		aBoolean7382 = bool;
		this.aClass298_Sub32Array7371 = new Class298_Sub32[i];
	}

	int method3135(short i) {
			return -1;
	}

	int method3136(byte i) {
			return -1;
	}

	void method3137(int i, Buffer buffer) {

	}

}
