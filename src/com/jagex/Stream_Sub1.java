package com.jagex;/* Class318_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

public class Stream_Sub1 extends Stream {
	Socket aSocket7688;
	Class316 aClass316_7689;
	Class330 aClass330_7690;

    public boolean isAvailable(int i) throws IOException {
		try {
			return this.aClass316_7689.method3840(i, 1797469509);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("acl.f(").append(')').toString());
		}
	}

	public int method3857(int i) throws IOException {
		try {
			return this.aClass316_7689.method3841((byte) 19);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("acl.b(").append(')').toString());
		}
	}

	public int readBytes(byte[] is, int i, int i_2_) throws IOException {
		try {
			return this.aClass316_7689.method3843(is, i, i_2_, (byte) 54);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("acl.p(").append(')').toString());
		}
	}

	public void method3868(byte[] is, int i, int i_4_) throws IOException {
		try {
			this.aClass330_7690.method3998(is, i, i_4_, -2010830691);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("acl.i(").append(')').toString());
		}
	}

	public void close() {
		try {
			this.aClass330_7690.method4001(678482839);
			try {
				this.aSocket7688.close();
			} catch (IOException ioexception) {
				/* empty */
			}
			this.aClass316_7689.method3842(2033353307);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("acl.k(").append(')').toString());
		}
	}

	public void method3867(byte i) {
		try {
			this.aClass316_7689.method3839(-867525250);
			this.aClass330_7690.method4000((byte) 103);
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("acl.d(").append(')').toString());
		}
	}

	protected void finalize() {
		try {
			close();
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("acl.finalize(").append(')').toString());
		}
	}

	Stream_Sub1(Socket socket, int i) throws IOException {
		this.aSocket7688 = socket;
		this.aSocket7688.setSoTimeout(30000); // 30000
		this.aSocket7688.setTcpNoDelay(true);
		this.aClass316_7689 = new Class316(this.aSocket7688.getInputStream(), i);
		this.aClass330_7690 = new Class330(this.aSocket7688.getOutputStream(), i);
	}

    static final void method3876(ScriptRuntime runtime) {
		try {
			runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("acl.uv(").append(')').toString());
		}
	}
}
