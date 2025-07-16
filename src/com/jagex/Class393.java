package com.jagex;/* Class393 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class393 implements Runnable {
	public void run() {
		try {
			try {
				IcmpService_Sub1.anIcmpService_Sub1_8551.run();
			} catch (Throwable throwable) {

			}
			IcmpService_Sub1.anIcmpService_Sub1_8551 = null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("qg.run(").append(')').toString());
		}
	}

}
