package com.jagex;/* DiskFile - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class DiskFile {
	long aLong5983;
	RandomAccessFile randomAccessFile;
	long aLong5985;
	static Class453 aClass453_5986;

	final void method6077(long l) throws IOException {
		try {
			this.randomAccessFile.seek(l);
			this.aLong5985 = 5892097441890682535L * l;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tp.a(").append(')').toString());
		}
	}

	public final void method6078(byte[] is, int i, int i_0_) throws IOException {
		try {
			if ((-1855833292870549225L * this.aLong5985 + (long) i_0_) > this.aLong5983 * -1095537870969537929L) {
				this.randomAccessFile.seek(-1095537870969537929L * this.aLong5983);
				this.randomAccessFile.write(1);
				throw new EOFException();
			}
			this.randomAccessFile.write(is, i, i_0_);
			this.aLong5985 += 5892097441890682535L * (long) i_0_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tp.f(").append(')').toString());
		}
	}

	public final void method6079() throws IOException {
		try {
			if (null != this.randomAccessFile) {
				this.randomAccessFile.close();
				this.randomAccessFile = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tp.b(").append(')').toString());
		}
	}

	public final long getFileLength() throws IOException {
			return this.randomAccessFile.length();
	}

	public final int method6081(byte[] is, int i, int i_2_, short i_3_) throws IOException {
		try {
			int i_4_ = this.randomAccessFile.read(is, i, i_2_);
			if (i_4_ > 0)
				this.aLong5985 += (long) i_4_ * 5892097441890682535L;
			return i_4_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tp.i(").append(')').toString());
		}
	}

	protected void finalize() throws Throwable {
		try {
			if (null != this.randomAccessFile) {
				method6079();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("tp.finalize(").append(')').toString());
		}
	}

	public static DiskFile method962(String string, String string_7_, boolean bool) {
		try {
			File file = new File(GameShell.aFile6500, new StringBuilder().append("preferences").append(string).append(".dat").toString());
			do {
				if (file.exists()) {
					DiskFile diskFile;
					try {
						DiskFile diskFile_8_ = new DiskFile(file, "rw", 10000L);
						diskFile = diskFile_8_;
					} catch (IOException ioexception) {
						break;
					}
					return diskFile;
				}
			} while (false);
			String string_9_ = "";
			if (33 == Class139.anInt1548 * -518493991)
				string_9_ = "_rc";
			else if (Class139.anInt1548 * -518493991 == 34)
				string_9_ = "_wip";
			File file_10_ = new File(Class83.userDirectory, new StringBuilder().append("noregret_").append(string_7_).append("_preferences").append(string).append(string_9_).append(".dat").toString());
			do {
				if (!bool && file_10_.exists()) {
					DiskFile diskFile;
					try {
						DiskFile diskFile_11_ = new DiskFile(file_10_, "rw", 10000L);
						diskFile = diskFile_11_;
					} catch (IOException ioexception) {
						break;
					}
					return diskFile;
				}
			} while (false);
			DiskFile diskFile;
			try {
				DiskFile diskFile_12_ = new DiskFile(file, "rw", 10000L);
				diskFile = diskFile_12_;
			} catch (IOException ioexception) {
				throw new RuntimeException();
			}
			return diskFile;
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("dm.u(").append(')').toString());
		}
	}

	public DiskFile(File file, String string, long l) throws IOException {
		if (l == -1L)
			l = 9223372036854775807L;
		if (file.length() > l) {
			System.out.println("Error!" + file.getName() + " is corrupted. Deleting.");
			file.delete();
		}
		this.randomAccessFile = new RandomAccessFile(file, string);
		this.aLong5983 = l * 1728399846774964039L;
		this.aLong5985 = 0L;
		int i = this.randomAccessFile.read();
		if (-1 != i && !string.equals("r")) {
			this.randomAccessFile.seek(0L);
			this.randomAccessFile.write(i);
		}
		this.randomAccessFile.seek(0L);
	}

}
