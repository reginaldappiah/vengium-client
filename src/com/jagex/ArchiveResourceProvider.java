package com.jagex;/* Js5IndexSystem - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.utils.TimeUtils;

import java.util.zip.CRC32;

public class ArchiveResourceProvider extends ResourceProvider {
	LinkedList linkedList;
	PaddedResourceWorker net;
	byte[] tableHash;
	int type;
	ResourceCache meta;
	Class298_Sub37_Sub16 tableRequest;
	CacheResourceWorker cacheWorker;
	int anInt7092 = 0;
	ResourceCache archives;
	ReferenceTable table;
	byte[] aByteArray7098;
	Class453 extras;
	int anInt7101;
	boolean updateOutdated;
	int tableVersion;
	Class453 aClass453_7105;
	boolean clearIdle;
	long aLong7107;
	int tableChecksum;
	static CRC32 crc = new CRC32();
	boolean aBoolean7111;

	public int method2270() {
			if (getTable() == null) {
				if (null == this.tableRequest)
					return 0;
				return this.tableRequest.method3468();
			}
			return 100;
	}

	void requestGroup(int i) {
			if (null != this.archives) {
				for (Node class298 = this.aClass453_7105.method5939(); null != class298; class298 = this.aClass453_7105.method5944()) {
					if (7051297995265073167L * class298.key == (long) i)
						return;
				}
				Node node = new Node();
				node.key = (long) i * 4191220306876042991L;
				this.aClass453_7105.pushBack(node);
			}
	}

	Class298_Sub37_Sub16 method2271(int key, int i_1_) {
			Class298_Sub37_Sub16 class298_sub37_sub16 = ((Class298_Sub37_Sub16) this.linkedList.get((long) key));
			if (class298_sub37_sub16 != null && 0 == i_1_ && !class298_sub37_sub16.highPriority && (class298_sub37_sub16.waiting)) {
				class298_sub37_sub16.unlink();
				class298_sub37_sub16 = null;
			}
			if (null == class298_sub37_sub16) {
				if (i_1_ == 0) {
					if (this.archives != null && this.aByteArray7098[key] != -1)
						class298_sub37_sub16 = (this.cacheWorker.priorityRead(key, this.archives));
					else if (!this.net.method2340())
						class298_sub37_sub16 = (this.net.method2338(-553176479 * this.type, key, (byte) 2, true));
					else
						return null;
				} else if (i_1_ == 1) {
					if (this.archives == null)
						throw new RuntimeException();
					class298_sub37_sub16 = (this.cacheWorker.requestRead(key, this.archives));
				} else if (2 == i_1_) {
					if (null == this.archives)
						throw new RuntimeException();
					if (-1 != this.aByteArray7098[key])
						throw new RuntimeException();
					if (!this.net.extraUnavailable())
						class298_sub37_sub16 = (this.net.method2338(this.type * -553176479, key, (byte) 2, false));
					else
						return null;
				} else
					throw new RuntimeException();
				this.linkedList.connect(class298_sub37_sub16, (long) key);
			}
			if (class298_sub37_sub16.waiting)
				return null;
			byte[] is = class298_sub37_sub16.method3465();
			if (class298_sub37_sub16 instanceof CacheRequest) {
				Class298_Sub37_Sub16 class298_sub37_sub16_3_;
				try {
					if (null == is || is.length <= 2)
						throw new RuntimeException();
					crc.reset();
					crc.update(is, 0, is.length - 2);
					int i_4_ = (int) crc.getValue();
					if ((this.table.entryCRCs[key]) != i_4_)
						throw new RuntimeException();
					if ((this.table.entryHashes) != null && null != (this.table.entryHashes[key])) {
						byte[] is_5_ = (this.table.entryHashes[key]);
						byte[] is_6_ = Class152.whirlpool(is, 0, is.length - 2);
						for (int i_7_ = 0; i_7_ < 64; i_7_++) {
							if (is_5_[i_7_] != is_6_[i_7_])
								throw new RuntimeException();
						}
					}
					int i_8_ = ((is[is.length - 1] & 0xff) + ((is[is.length - 2] & 0xff) << 8));
					if (i_8_ != ((this.table.entryVersions[key]) & 0xffff))
						throw new RuntimeException();
					if (this.aByteArray7098[key] != 1) {
						if (this.aByteArray7098[key] != 0) {
							/* empty */
						}
						this.anInt7092 += 13538129;
						this.aByteArray7098[key] = (byte) 1;
					}
					if (!class298_sub37_sub16.highPriority)
						class298_sub37_sub16.unlink();
					class298_sub37_sub16_3_ = class298_sub37_sub16;
				} catch (Exception exception) {
					this.aByteArray7098[key] = (byte) -1;
					class298_sub37_sub16.unlink();
					if ((class298_sub37_sub16.highPriority) && !this.net.method2340()) {
						PaddedResourceRequest paddedResourceRequest = (this.net.method2338(-553176479 * this.type, key, (byte) 2, true));
						this.linkedList.connect(paddedResourceRequest, (long) key);
					}
					return null;
				}
				return class298_sub37_sub16_3_;
			}
			try {
				if (is == null || is.length <= 2)
					throw new RuntimeException();
				crc.reset();
				crc.update(is, 0, is.length - 2);
				int i_9_ = (int) crc.getValue();
				if (i_9_ != (this.table.entryCRCs[key]))
					throw new RuntimeException();
				if ((this.table.entryHashes) != null && (null != (this.table.entryHashes[key]))) {
					byte[] is_10_ = (this.table.entryHashes[key]);
					byte[] is_11_ = Class152.whirlpool(is, 0, is.length - 2);
					for (int i_12_ = 0; i_12_ < 64; i_12_++) {
						if (is_10_[i_12_] != is_11_[i_12_])
							throw new RuntimeException();
					}
				}
				this.net.anInt2735 = 0;
				this.net.anInt2745 = 0;
			} catch (RuntimeException runtimeexception) {
				this.net.method2359();
				class298_sub37_sub16.unlink();
				if (class298_sub37_sub16.highPriority && !this.net.method2340()) {
					PaddedResourceRequest paddedResourceRequest = (this.net.method2338(-553176479 * this.type, key, (byte) 2, true));
					this.linkedList.connect(paddedResourceRequest, (long) key);
				}
				return null;
			}
			is[is.length - 2] = (byte) ((this.table.entryVersions[key]) >>> 8);
			is[is.length - 1] = (byte) (this.table.entryVersions[key]);
			if (this.archives != null) {
				this.cacheWorker.requestWrite(key, is, this.archives);
				if (this.aByteArray7098[key] != 1) {
					this.anInt7092 += 13538129;
					this.aByteArray7098[key] = (byte) 1;
				}
			}
			if (!class298_sub37_sub16.highPriority)
				class298_sub37_sub16.unlink();
			return class298_sub37_sub16;
	}

	void method2272() {
		try {
			if (null != this.extras && getTable() != null) {
				for (Node class298 = this.aClass453_7105.method5939(); class298 != null; class298 = this.aClass453_7105.method5944()) {
					int i_13_ = (int) (7051297995265073167L * class298.key);
					if (i_13_ < 0 || i_13_ >= -1583970959 * this.table.groupsCount || 0 == (this.table.childCounts[i_13_]))
						class298.unlink();
					else {
						if (this.aByteArray7098[i_13_] == 0)
							method2271(i_13_, 1);
						if (-1 == this.aByteArray7098[i_13_])
							method2271(i_13_, 2);
						if (1 == this.aByteArray7098[i_13_])
							class298.unlink();
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("aaz.e(").append(')').toString());
		}
	}

	void method2273(int i) {
			if (null != this.extras) {
				if (getTable() == null)
					return;
				if (this.updateOutdated) {
					boolean bool = true;
					for (Node class298 = this.extras.method5939(); null != class298; class298 = this.extras.method5944()) {
						int i_14_ = (int) (class298.key * 7051297995265073167L);
						if (this.aByteArray7098[i_14_] == 0)
							method2271(i_14_, 1);
						if (0 != this.aByteArray7098[i_14_])
							class298.unlink();
						else
							bool = false;
					}
					while (this.anInt7101 * 2044090087 < (this.table.childCounts).length) {
						if (0 == (this.table.childCounts[(2044090087 * this.anInt7101)]))
							this.anInt7101 += -303145769;
						else {
							if ((-2031048721 * this.cacheWorker.remaining) >= 250) {
								bool = false;
								break;
							}
							if ((this.aByteArray7098[(2044090087 * this.anInt7101)]) == 0)
								method2271(2044090087 * (this.anInt7101), 1);
							if ((this.aByteArray7098[(this.anInt7101 * 2044090087)]) == 0) {
								Node class298 = new Node();
								class298.key = ((long) this.anInt7101 * -1525375729483922519L);
								this.extras.pushBack(class298);
								bool = false;
							}
							this.anInt7101 += -303145769;
						}
					}
					if (bool) {
						this.updateOutdated = false;
						this.anInt7101 = 0;
					}
				} else if (this.aBoolean7111) {
					boolean bool = true;
					for (Node class298 = this.extras.method5939(); null != class298; class298 = this.extras.method5944()) {
						int i_15_ = (int) (7051297995265073167L * class298.key);
						if (this.aByteArray7098[i_15_] != 1)
							method2271(i_15_, 2);
						if (1 == this.aByteArray7098[i_15_])
							class298.unlink();
						else
							bool = false;
					}
					while (2044090087 * this.anInt7101 < (this.table.childCounts).length) {
						if ((this.table.childCounts[2044090087 * this.anInt7101]) == 0)
							this.anInt7101 += -303145769;
						else {
							if (this.net.extraUnavailable()) {
								bool = false;
								break;
							}
							if (1 != (this.aByteArray7098[(2044090087 * this.anInt7101)]))
								method2271((this.anInt7101 * 2044090087), 2);
							if (1 != (this.aByteArray7098[(this.anInt7101 * 2044090087)])) {
								Node class298 = new Node();
								class298.key = (-1525375729483922519L * (long) (this.anInt7101));
								this.extras.pushBack(class298);
								bool = false;
							}
							this.anInt7101 += -303145769;
						}
					}
					if (bool) {
						this.aBoolean7111 = false;
						this.anInt7101 = 0;
					}
				} else
					this.extras = null;
			}
			if (this.clearIdle && (TimeUtils.getTime() >= (this.aLong7107 * 2822951764100643313L))) {
				for (Class298_Sub37_Sub16 class298_sub37_sub16 = (Class298_Sub37_Sub16) this.linkedList.method5816(); null != class298_sub37_sub16; class298_sub37_sub16 = ((Class298_Sub37_Sub16) this.linkedList.method5815())) {
					if (class298_sub37_sub16.waiting) {
						if (i == -1065641321)
							return;
					} else if (class298_sub37_sub16.aBoolean9671) {
						if (!class298_sub37_sub16.highPriority)
							throw new RuntimeException();
						class298_sub37_sub16.unlink();
					} else
						class298_sub37_sub16.aBoolean9671 = true;
				}
				this.aLong7107 = ((TimeUtils.getTime() + 1000L) * -7842795960219478255L);
			}
	}

	ArchiveResourceProvider(int type, ResourceCache archives, ResourceCache meta, PaddedResourceWorker net, CacheResourceWorker cache, int tableChecksum, byte[] tableHash, int tableVersion, boolean clearIdle) {
		this.linkedList = new LinkedList(16);
		this.anInt7101 = 0;
		this.aClass453_7105 = new Class453();
		this.aLong7107 = 0L;
		this.type = type * 160231841;
		this.archives = archives;
		if (null == this.archives)
			this.updateOutdated = false;
		else {
			this.updateOutdated = true;
			this.extras = new Class453();
		}
		this.meta = meta;
		this.net = net;
		this.cacheWorker = cache;
		this.tableChecksum = tableChecksum * 235523743;
		this.tableHash = tableHash;
		this.tableVersion = 1761064455 * tableVersion;
		this.clearIdle = clearIdle;
		if (null != this.meta)
			this.tableRequest = (this.cacheWorker.priorityRead(this.type * -553176479, this.meta));
	}

	public int method2274() {
			return this.anInt7092 * -150039119;
	}

	public int method2275() {
			if (null == this.table)
				return 0;
			if (!this.updateOutdated)
				return (-2145352941 * (this.table.entryCount));
			Node node = this.extras.method5939();
			if (null == node)
				return 0;
			return (int) (7051297995265073167L * node.key);
	}

	int getGroupProgress(int file) {
			Class298_Sub37_Sub16 class298_sub37_sub16 = ((Class298_Sub37_Sub16) this.linkedList.get((long) file));
			if (class298_sub37_sub16 != null)
				return class298_sub37_sub16.method3468();
			return 0;
	}

	byte[] get(int file) {
			Class298_Sub37_Sub16 class298_sub37_sub16 = method2271(file, 0);
			if (null == class298_sub37_sub16)
				return null;
			byte[] is = class298_sub37_sub16.method3465();
			class298_sub37_sub16.unlink();
			return is;
	}

	public void method2278() {
			if (this.archives != null) {
				this.aBoolean7111 = true;
				if (this.extras == null)
					this.extras = new Class453();
			}
	}

	ReferenceTable getTable() {
			if (this.table != null)
				return this.table;
			if (null == this.tableRequest) {
				if (this.net.method2340())
					return null;
				this.tableRequest = (this.net.method2338(255, -553176479 * this.type, (byte) 0, true));
			}
			if (this.tableRequest.waiting)
				return null;
			byte[] data = this.tableRequest.method3465();
			do {
				if (this.tableRequest instanceof CacheRequest) {
					try {
						if (null == data)
							throw new RuntimeException();
						this.table = new ReferenceTable(data, 28953951 * (this.tableChecksum), (this.tableHash));
						if (1598805943 * this.tableVersion != 201380083 * (this.table.version))
							throw new RuntimeException();
						break;
					} catch (RuntimeException runtimeexception) {
						this.table = null;
						if (this.net.method2340())
							this.tableRequest = null;
						else
							this.tableRequest = (this.net.method2338(255, (-553176479 * this.type), (byte) 0, true));
						return null;
					}
				}
				try {
					if (null == data)
						throw new RuntimeException();
					this.table = new ReferenceTable(data, (28953951 * this.tableChecksum), this.tableHash);
				} catch (RuntimeException runtimeexception) {
					this.net.method2359();
					this.table = null;
					if (this.net.method2340())
						this.tableRequest = null;
					else
						this.tableRequest = (this.net.method2338(255, this.type * -553176479, (byte) 0, true));
					return null;
				}
				if (this.meta != null)
					this.cacheWorker.requestWrite(-553176479 * this.type, data, this.meta);
			} while (false);
			this.tableRequest = null;
			if (this.archives != null) {
				this.aByteArray7098 = (new byte[(this.table.groupsCount) * -1583970959]);
				this.anInt7092 = 0;
			}
			return this.table;
	}

	public int method2279() {
			if (this.table == null)
				return 0;
			return ((this.table.entryCount) * -2145352941);
	}

}
