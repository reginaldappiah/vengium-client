package com.jagex;/* Class345 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class345 implements Recorder {
	int mouseRotation;
	int mouseType;
	int[] records;

    static Class345 method2201(Buffer buffer) {
            int i_9_ = buffer.readUByte();
            int i_10_ = buffer.readUByte();
            int i_11_ = buffer.readUByte();
            int[] is = new int[i_11_];
            for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
                is[i_12_] = buffer.readUByte();
            return new Class345(i_9_, i_10_, is);
    }

    public boolean record(MouseRecord mouseRecord, KeyRecord[] keyRecords, int maxHeld, KeyRecorder keyRecorder) {
			if (mouseRecord == null) {
				if (this.mouseType * 1099340307 != -1)
					return false;
			} else {
				if (this.mouseType * 1099340307 != mouseRecord.getMouseType())
					return false;
				if (this.mouseRotation * 1026337135 > mouseRecord.getMousRotation())
					return false;
				int[] records = this.records;
				for (int index = 0; index < records.length; index++) {
					int mouse = records[index];
					if (!keyRecorder.held(mouse))
						return false;
				}
			}
			return true;
	}

    Class345(int type, int rotation, int[] records) {
		this.mouseType = type * 397623323;
		this.mouseRotation = rotation * 875353487;
		this.records = records;
	}

}
