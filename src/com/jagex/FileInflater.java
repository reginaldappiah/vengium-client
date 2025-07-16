package com.jagex;/* Class519 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.Inflater;

public class FileInflater {
	Inflater inflater;
	public static int[] anIntArray6274;

	public byte[] method6317(byte[] data) {
			Buffer buffer = new Buffer(data);
			buffer.offset = (data.length - 4) * 116413311;
			int size = buffer.method3600();
			byte[] is_1_ = new byte[size];
			buffer.offset = 0;
			readUncompressedBytes(buffer, is_1_);
			return is_1_;
	}

	public void readUncompressedBytes(Buffer buffer, byte[] data) {
			if ( (buffer.buffer[buffer.offset * 385051775]) != 31||  (buffer.buffer[buffer.offset * 385051775 + 1] != -117))
				throw new RuntimeException("");
			if (this.inflater == null)
				this.inflater = new Inflater(true);
			try {
				this.inflater.setInput(buffer.buffer, 10 + 385051775 * buffer.offset, (buffer.buffer.length - (8 + (385051775 * buffer.offset + 10))));
				this.inflater.inflate(data);
			} catch (Exception exception) {
				this.inflater.reset();
				throw new RuntimeException("");
			}
			this.inflater.reset();
	}

	public FileInflater() {
		this(-1, 1000000, 1000000);
	}

	FileInflater(int i, int i_2_, int i_3_) {

	}

}
