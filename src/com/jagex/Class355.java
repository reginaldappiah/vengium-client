package com.jagex;/* Class355 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class355 implements Recorder {
	int[] anIntArray6524;

	public boolean record(MouseRecord mouseRecord, KeyRecord[] keyRecords, int maxHeld, KeyRecorder keyRecorder) {
			int[] is = this.anIntArray6524;
			for (int i_3_ = 0; i_3_ < is.length; i_3_++) {
				int i_4_ = is[i_3_];
				if (!keyRecorder.held(i_4_))
					return false;
			}
			return true;
	}

	Class355(int[] is) {
		this.anIntArray6524 = is;
	}

}
