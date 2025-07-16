package com.jagex;/* CacheRequest - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CacheRequest extends Class298_Sub37_Sub16 {
	int type;
	static int anInt10007 = 1;
	static int anInt10008 = 3;
	static int anInt10009 = 2;
	ResourceCache cache;
	byte[] data;

	CacheRequest() {

	}

	byte[] method3469() {
		if (this.waiting)
			throw new RuntimeException();
		return this.data;
	}

	int method3471() {
		if (this.waiting)
			return 0;
		return 100;
	}

	byte[] method3467() {
		if (this.waiting)
			throw new RuntimeException();
		return this.data;
	}

	byte[] method3466() {
		if (this.waiting)
			throw new RuntimeException();
		return this.data;
	}

	int method3468() {
			if (this.waiting)
				return 0;
			return 100;
	}

	int method3470() {
		if (this.waiting)
			return 0;
		return 100;
	}

	byte[] method3465() {
			if (this.waiting)
				throw new RuntimeException();
			return this.data;
	}

	int method3472() {
		if (this.waiting)
			return 0;
		return 100;
	}
}
