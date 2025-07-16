package com.jagex;/* PaddedResourceRequest - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class PaddedResourceRequest extends Class298_Sub37_Sub16 {
	byte padding;
	Buffer aClass298_Sub53_10004;
	int anInt10005;

	int method3472() {
		if (null == this.aClass298_Sub53_10004)
			return 0;
		return (-149528164 * (this.aClass298_Sub53_10004.offset) / ((this.aClass298_Sub53_10004.buffer).length - this.padding));
	}

	byte[] method3465() {
		try {
			if (this.waiting || ((this.aClass298_Sub53_10004.offset) * 385051775 < ((this.aClass298_Sub53_10004.buffer).length - this.padding)))
				throw new RuntimeException();
			return (this.aClass298_Sub53_10004.buffer);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akb.a(").append(')').toString());
		}
	}

	int method3468() {
		try {
			if (null == this.aClass298_Sub53_10004)
				return 0;
			return (-149528164 * (this.aClass298_Sub53_10004.offset) / ((this.aClass298_Sub53_10004.buffer).length - this.padding));
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("akb.f(").append(')').toString());
		}
	}

	byte[] method3467() {
		if (this.waiting || ((this.aClass298_Sub53_10004.offset) * 385051775 < ((this.aClass298_Sub53_10004.buffer).length - this.padding)))
			throw new RuntimeException();
		return (this.aClass298_Sub53_10004.buffer);
	}

	byte[] method3466() {
		if (this.waiting || ((this.aClass298_Sub53_10004.offset) * 385051775 < ((this.aClass298_Sub53_10004.buffer).length - this.padding)))
			throw new RuntimeException();
		return (this.aClass298_Sub53_10004.buffer);
	}

	byte[] method3469() {
		if (this.waiting || ((this.aClass298_Sub53_10004.offset) * 385051775 < ((this.aClass298_Sub53_10004.buffer).length - this.padding)))
			throw new RuntimeException();
		return (this.aClass298_Sub53_10004.buffer);
	}

	int method3470() {
		if (null == this.aClass298_Sub53_10004)
			return 0;
		return (-149528164 * (this.aClass298_Sub53_10004.offset) / ((this.aClass298_Sub53_10004.buffer).length - this.padding));
	}

	int method3471() {
		if (null == this.aClass298_Sub53_10004)
			return 0;
		return (-149528164 * (this.aClass298_Sub53_10004.offset) / ((this.aClass298_Sub53_10004.buffer).length - this.padding));
	}

	PaddedResourceRequest() {
		/* empty */
	}
}
