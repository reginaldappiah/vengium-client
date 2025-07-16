package com.jagex;/* FileFilter_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import javax.swing.filechooser.FileFilter;
import java.io.File;

public class FileFilter_Sub1 extends FileFilter {
	Class214 aClass214_6317;
	Class214 aClass214_6318;

	public boolean accept(File file) {
		try {
			if (this.aClass214_6318.method1987(564359284) && file.isDirectory())
				return true;
            return !this.aClass214_6318.method1987(842824305);
        } catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aeo.accept(").append(')').toString());
		}
	}

	public String getDescription() {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aeo.getDescription(").append(')').toString());
		}
	}

	FileFilter_Sub1(Class214 class214, Class214 class214_0_) {
		super();
		this.aClass214_6317 = class214;
		this.aClass214_6318 = class214_0_;
	}
}
