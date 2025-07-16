package com.jagex;/* ReferenceTable - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ReferenceTable {
	int crc;
	int[] entryVersions;
	byte[] digest;
	byte[][] entryHashes;
	int[] childSizes;
	int[] entryIndicies;
	int[] entryNames;
	LookupTable hashStore;
	int groupsCount;
	int[] entryCRCs;
	int[][] childNames;
	int[] childCounts;
	int[][] childIndicies;
	int entryCount;
	LookupTable[] children;
	int version;

	void decode(byte[] data) {
			Buffer buffer = new Buffer(Js5FileSystem.unpackContainer(data));
			int format = buffer.readUByte();
			if (format < 5 || format > 7)
				throw new RuntimeException();
			if (format >= 6)
				this.version = buffer.readInt() * 967231547;
			else
				this.version = 0;
			int attributes = buffer.readUByte();
			boolean named = 0 != (attributes & 0x1);
			boolean hashed = 0 != (attributes & 0x2);
			if (format >= 7)
				this.entryCount = buffer.readLargeSmart() * -1409433829;
			else
				this.entryCount = buffer.readUShort() * -1409433829;
			int offset = 0;
			int max = -1;
			this.entryIndicies = new int[-2145352941 * this.entryCount];
			if (format >= 7) {
				for (int index = 0; index < this.entryCount * -2145352941; index++) {
					this.entryIndicies[index] = offset += buffer.readLargeSmart();
					if (this.entryIndicies[index] > max)
						max = this.entryIndicies[index];
				}
			} else {
				for (int index = 0; index < -2145352941 * this.entryCount; index++) {
					this.entryIndicies[index] = offset += buffer.readUShort();
					if (this.entryIndicies[index] > max)
						max = this.entryIndicies[index];
				}
			}
			this.groupsCount = (max + 1) * 1621334929;
			this.entryCRCs = new int[-1583970959 * this.groupsCount];
			if (hashed)
				this.entryHashes = new byte[this.groupsCount * -1583970959][];
			this.entryVersions = new int[-1583970959 * this.groupsCount];
			this.childCounts = new int[-1583970959 * this.groupsCount];
			this.childIndicies = new int[this.groupsCount * -1583970959][];
			this.childSizes = new int[this.groupsCount * -1583970959];
			if (named) {
				this.entryNames = new int[-1583970959 * this.groupsCount];
				for (int index = 0; index < -1583970959 * this.groupsCount; index++)
					this.entryNames[index] = -1;
				for (int index = 0; index < this.entryCount * -2145352941; index++)
					this.entryNames[(this.entryIndicies[index])] = buffer.readInt();
				this.hashStore = new LookupTable(this.entryNames);
			}
			for (int index = 0; index < this.entryCount * -2145352941; index++)
				this.entryCRCs[(this.entryIndicies[index])] = buffer.readInt();
			if (hashed) {
				for (int index = 0; index < this.entryCount * -2145352941; index++) {
					byte[] hash = new byte[64];
					buffer.readBytes(hash, 0, 64);
					this.entryHashes[this.entryIndicies[index]] = hash;
				}
			}
			for (int index = 0; index < -2145352941 * this.entryCount; index++) {
				this.entryVersions[(this.entryIndicies[index])] = buffer.readInt();
			}
			if (format >= 7) {
				for (int index = 0; index < -2145352941 * this.entryCount; index++) {
					this.childCounts[(this.entryIndicies[index])] = buffer.readLargeSmart();
				}
				for (int entry = 0; entry < this.entryCount * -2145352941; entry++) {
					int entryIndex = this.entryIndicies[entry];
					int count = this.childCounts[entryIndex];
					offset = 0;
					int maxIndex = -1;
					this.childIndicies[entryIndex] = new int[count];
					for (int index = 0; index < count; index++) {
						int child = (this.childIndicies[entryIndex][index] = offset += buffer.readLargeSmart());
						if (child > maxIndex) {
							maxIndex = child;
						}
					}
					this.childSizes[entryIndex] = 1 + maxIndex;
					if (count == 1 + maxIndex)
						this.childIndicies[entryIndex] = null;
				}
			} else {
				for (int index = 0; index < this.entryCount * -2145352941; index++)
					this.childCounts[(this.entryIndicies[index])] = buffer.readUShort();
				for (int entry = 0; entry < -2145352941 * this.entryCount; entry++) {
					int entryIndex = this.entryIndicies[entry];
					int count = this.childCounts[entryIndex];
					offset = 0;
					int maxIndex = -1;
					this.childIndicies[entryIndex] = new int[count];
					for (int child = 0; child < count; child++) {
						int index = (this.childIndicies[entryIndex][child] = offset += buffer.readUShort());
						if (index > maxIndex)
							maxIndex = index;
					}
					this.childSizes[entryIndex] = 1 + maxIndex;
					if (count == 1 + maxIndex)
						this.childIndicies[entryIndex] = null;
				}
			}
			if (named) {
				this.childNames = new int[1 + max][];
				this.children = new LookupTable[1 + max];
				for (int entry = 0; entry < -2145352941 * this.entryCount; entry++) {
					int entryIndex = this.entryIndicies[entry];
					int count = this.childCounts[entryIndex];
					this.childNames[entryIndex] = new int[this.childSizes[entryIndex]];
					for (int index = 0; index < this.childSizes[entryIndex]; index++)
						this.childNames[entryIndex][index] = -1;
					for (int index = 0; index < count; index++) {
						int child;
						if (this.childIndicies[entryIndex] != null)
							child = (this.childIndicies[entryIndex][index]);
						else
							child = index;
						this.childNames[entryIndex][child] = buffer.readInt();
					}
					this.children[entryIndex] = new LookupTable(this.childNames[entryIndex]);
				}
			}
	}

	ReferenceTable(byte[] data, int expectedChecksum, byte[] hash) {
		this.crc = Class271.method2548(data, data.length) * -720041561;
		if (expectedChecksum != 1600327191 * this.crc)
			throw new RuntimeException();
		if (hash != null) {
			if (hash.length != 64)
				throw new RuntimeException();
			this.digest = Class152.whirlpool(data, 0, data.length);
			for (int index = 0; index < 64; index++) {
				if (this.digest[index] != hash[index])
					throw new RuntimeException();
			}
		}
		decode(data);
	}

}
