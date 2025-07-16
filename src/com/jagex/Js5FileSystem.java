package com.jagex;/* Class243 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.StringUtils;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class Js5FileSystem {

    static int anInt2722 = 0;
    static FileInflater inflater = new FileInflater();
    static boolean existsDebug = false;
    ReferenceTable index = null;
    boolean discardEntryBuffers;
    Object[] groupsData;
    Object[][] filesData;
    int discardUnpacked;
    ResourceProvider resourceProvider;

    public Js5FileSystem(ResourceProvider resourceProvider, boolean bool, int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("");
        }
        this.resourceProvider = resourceProvider;
        discardEntryBuffers = bool;
        discardUnpacked = -98387179 * i;
    }

    static final byte[] unpackContainer(byte[] data) {
        try {
            Buffer buffer = new Buffer(data);
            int opcode = buffer.readUByte();
            int i_1_ = buffer.readInt();
            if (i_1_ < 0 || (-989796335 * anInt2722 != 0 && i_1_ > -989796335 * anInt2722))
                throw new RuntimeException();
            if (opcode == 0) {
                byte[] is_2_ = new byte[i_1_];
                buffer.readBytes(is_2_, 0, i_1_);
                return is_2_;
            }
            int i_3_ = buffer.readInt();
            if (i_3_ < 0 || (0 != -989796335 * anInt2722 && i_3_ > anInt2722 * -989796335))
                throw new RuntimeException();
            byte[] is_4_ = new byte[i_3_];
            if (opcode == 1)
                Class450.method5921(is_4_, i_3_, data, i_1_, 9);
            else {
                synchronized (inflater) {
                    inflater.readUncompressedBytes(buffer, is_4_);
                }
            }
            return is_4_;
        } catch (Throwable runtimeexception) {
            if (Loader.DISABLE_XTEA_CRASH)
                return new byte[100];
            else
                throw ErrorReporter.generateReport(runtimeexception, "Error unpacking container");
        }
    }

    public static Object packArray(byte[] data, boolean copy) {
        if (data == null)
            return null;
        if (data.length > 136) {
            ByteBuffer buffer = ByteBuffer.allocateDirect(data.length);
            buffer.position(0);
            buffer.put(data);
            return buffer;
        }
        if (copy)
            return Arrays.copyOf(data, data.length);
        return data;
    }

    public synchronized boolean isReady() {
        if (index == null) {
            index = resourceProvider.getTable();
            if (index == null) {
                return false;
            }
            groupsData = new Object[-1583970959 * ((index).groupsCount)];
            filesData = new Object[-1583970959 * ((index).groupsCount)][];
        }
        return true;
    }

    public int getCRC() {
        if (!isReady()) {
            throw new IllegalStateException("");
        }
        return (index.crc * 1600327191);
    }

    synchronized boolean exists(int archiveID, int fileID) {
        if (!isReady()) {
            return false;
        }
        if (archiveID < 0 || fileID < 0 || archiveID >= (index.childSizes).length || fileID >= (index.childSizes[archiveID])) {
            if (existsDebug) {
                throw new IllegalArgumentException(new StringBuilder().append(archiveID).append(" ").append(fileID).toString());
            }
            return false;
        }
        return true;
    }

    synchronized void download(int archiveID) {
        if (discardEntryBuffers) {
            groupsData[archiveID] = resourceProvider.get(archiveID);
        } else {
            groupsData[archiveID] = packArray(resourceProvider.get(archiveID), false);
        }
    }

    void downloadGroup(int groupID) {
        resourceProvider.requestGroup(groupID);
    }

    public synchronized byte[] getFile(int containerID, int fileID, int[] keys) {
        if (!exists(containerID, fileID)) {
            return null;
        }
        byte[] data = null;
        if (null == filesData[containerID] || null == filesData[containerID][fileID]) {
            boolean loaded = loadData(containerID, fileID, keys);
            if (!loaded) {
                download(containerID);
                loaded = loadData(containerID, fileID, keys);
                if (!loaded) {
                    return null;
                }
            }
        }
        if (null == filesData[containerID]) {
            throw new RuntimeException("");
        }
        if (filesData[containerID][fileID] != null) {
            data = Class338.unwrapBuffer((filesData[containerID][fileID]), false);
            if (data == null) {
                throw new RuntimeException("");
            }
        }
        if (data != null) {
            if (discardUnpacked * -1870742467 == 1) {
                filesData[containerID][fileID] = null;
                if ((index.childSizes[containerID]) == 1) {
                    filesData[containerID] = null;
                }
            } else if (discardUnpacked * -1870742467 == 2) {
                filesData[containerID] = null;
            }
        }
        return data;
    }

    public synchronized boolean fileExists(int containerID, int fileID) {
        if (!exists(containerID, fileID)) {
            return false;
        }
        if (filesData[containerID] != null && filesData[containerID][fileID] != null) {
            return true;
        }
        if (groupsData[containerID] != null) {
            return true;
        }
        download(containerID);
        return groupsData[containerID] != null;
    }

    public synchronized boolean loadContainer(int containerID) {
        if (!groupExists(containerID)) {
            return false;
        }
        if (null != groupsData[containerID]) {
            return true;
        }
        download(containerID);
        return groupsData[containerID] != null;
    }

    public synchronized boolean archiveFilled() {
        if (!isReady()) {
            return false;
        }
        boolean containerAvailable = true;
        for (int index = 0; index < (this.index.entryIndicies).length; index++) {
            int containerID = (this.index.entryIndicies[index]);
            if (groupsData[containerID] == null) {
                download(containerID);
                if (groupsData[containerID] == null) {
                    containerAvailable = false;
                }
            }
        }
        return containerAvailable;
    }

    public synchronized int getProgress() {
        if (!isReady()) {
            return 0;
        }
        int total = 0;
        int completed = 0;
        for (int archiveID = 0; archiveID < groupsData.length; archiveID++) {
            if ((this.index.childCounts[archiveID]) > 0) {
                total += 100;
                completed += getGroupProgress(archiveID);
            }
        }
        if (0 == total) {
            return 100;
        }
        int size = completed * 100 / total;
        return size;
    }

    public synchronized byte[] get(int file) {
        if (!isReady()) {
            return null;
        }
        if ((index.childSizes).length == 1) {
            return getFileFromArchive(0, file);
        }
        if (!groupExists(file)) {
            return null;
        }
        if (index.childSizes[file] == 1) {
            return getFileFromArchive(file, 0);
        }
        throw new RuntimeException();
    }

    public boolean method2295(String string, int i) {
        try {
            if (!isReady()) {
                return false;
            }
            string = string.toLowerCase();
            int i_17_ = (index.hashStore.getId(StringUtils.hash(string)));
            return i_17_ >= 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ke.j(").append(')').toString());
        }
    }

    public int getContainerLength() {
            if (!isReady()) {
                return -1;
            }
            return (index.childSizes).length;
    }

    public synchronized void clearFileData(int fileID) {
        if (groupExists(fileID)) {
            if (filesData != null) {
                filesData[fileID] = null;
            }
        }
    }

    public void clearNames(boolean entries, boolean children) {
        if (isReady()) {
            if (entries) {
                index.entryNames = null;
                index.hashStore = null;
            }
            if (children) {
                index.childNames = null;
                index.children = null;
            }
        }
    }

    public int method2299(int i) {
        if (!isReady()) {
            return -1;
        }
        int i_21_ = index.hashStore.getId(i);
        if (!groupExists(i_21_)) {
            return -1;
        }
        return i_21_;
    }

    public boolean method2300(String string, String string_22_) {
        try {
            if (!isReady()) {
                return false;
            }
            string = string.toLowerCase();
            string_22_ = string_22_.toLowerCase();
            int i_23_ = (index.hashStore.getId(StringUtils.hash(string)));
            if (i_23_ < 0) {
                return false;
            }
            int i_24_ = (index.children[i_23_].getId(StringUtils.hash(string_22_)));
            return i_24_ >= 0;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ke.o(").append(')').toString());
        }
    }

    public synchronized byte[] getFile(String groupName, String fileName) {
            if (!isReady()) {
                return null;
            }
            groupName = groupName.toLowerCase();
            fileName = fileName.toLowerCase();
            int file = (index.hashStore.getId(StringUtils.hash(groupName)));
            if (!groupExists(file)) {
                return null;
            }
            int fileID = (index.children[file].getId(StringUtils.hash(fileName)));
            return getFileFromArchive(file, fileID);
    }

    boolean method2302(String string, String string_28_) {
        try {
            if (!isReady()) {
                return false;
            }
            string = string.toLowerCase();
            string_28_ = string_28_.toLowerCase();
            int containerID = (index.hashStore.getId(StringUtils.hash(string)));
            if (!groupExists(containerID)) {
                return false;
            }
            int fileID = (index.children[containerID].getId(StringUtils.hash(string_28_)));
            return fileExists(containerID, fileID);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ke.ax(").append(')').toString());
        }
    }

    synchronized int getGroupProgress(int archiveID) {
        if (!groupExists(archiveID)) {
            return 0;
        }
        if (groupsData[archiveID] != null) {
            return 100;
        }
        return resourceProvider.getGroupProgress(archiveID);
    }

    public void method2304(String string, int i) {
        try {
            if (isReady()) {
                string = string.toLowerCase();
                int i_32_ = (index.hashStore.getId(StringUtils.hash(string)));
                downloadGroup(i_32_);
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ke.ae(").append(')').toString());
        }
    }

    public int getGroupProgress(String groupName) {
            if (!isReady()) {
                return 0;
            }
            groupName = groupName.toLowerCase();
            int groupID = (index.hashStore.getId(StringUtils.hash(groupName)));
            return getGroupProgress(groupID);
    }

    synchronized boolean loadData(int containerID, int fileID, int[] keys) {
        if (!groupExists(containerID)) {
            return false;
        }
        if (null == groupsData[containerID]) {
            return false;
        }
        int count = (index.childCounts[containerID]);
        int[] ids = (index.childIndicies[containerID]);
        if (null == filesData[containerID]) {
            filesData[containerID] = new Object[(index.childSizes[containerID])];
        }
        Object[] filesDataBuffer = filesData[containerID];
        boolean emptyFile = true;
        for (int i = 0; i < count; i++) {
            int index;
            if (ids == null) {
                index = i;
            } else {
                index = ids[i];
            }
            if (null == filesDataBuffer[index]) {
                emptyFile = false;
                break;
            }
        }
        if (emptyFile) {
            return true;
        }
        byte[] decrypted;
        if (null != keys && (0 != keys[0] || keys[1] != 0 || keys[2] != 0 || 0 != keys[3])) {
            decrypted = Class338.unwrapBuffer((groupsData[containerID]), true);
            Buffer buffer = new Buffer(decrypted);
            buffer.decrypt(keys, 5, buffer.buffer.length);
        } else {
            decrypted = Class338.unwrapBuffer((groupsData[containerID]), false);
        }
        byte[] unpacked;
        try {
            unpacked = unpackContainer(decrypted);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append(null != keys).append(" ").append(containerID).append(" ").append(decrypted.length).append(" ").append(Class271.method2548(decrypted, decrypted.length)).append(" ").append(Class271.method2548(decrypted, decrypted.length - 2)).append(" ").append(index.entryCRCs[containerID]).append(" ").append(1600327191 * ((index).crc)).toString());
        }
        if (discardEntryBuffers) {
            groupsData[containerID] = null;
        }
        if (count > 1) {
            if (2 != discardUnpacked * -1870742467) {
                int header_section_pos = unpacked.length;
                int sectors = unpacked[--header_section_pos] & 0xff;
                header_section_pos -= 4 * (sectors * count);
                Buffer buffer = new Buffer(unpacked);
                int[] lengths = new int[count];
                buffer.offset = header_section_pos * 116413311;
                for (int i_45_ = 0; i_45_ < sectors; i_45_++) {
                    int delata = 0;
                    for (int x = 0; x < count; x++) {
                        delata += buffer.readInt();
                        lengths[x] += delata;
                    }
                }
                byte[][] filedata = new byte[count][];
                for (int i = 0; i < count; i++) {
                    filedata[i] = new byte[lengths[i]];
                    lengths[i] = 0;
                }
                buffer.offset = header_section_pos * 116413311;
                int dataOffset = 0;
                for (int i_51_ = 0; i_51_ < sectors; i_51_++) {
                    int delta = 0;
                    for (int i = 0; i < count; i++) {
                        delta += buffer.readInt();
                        System.arraycopy(unpacked, dataOffset, filedata[i], lengths[i], delta);
                        lengths[i] += delta;
                        dataOffset += delta;
                    }
                }
                for (int i = 0; i < count; i++) {
                    int index;
                    if (null == ids) {
                        index = i;
                    } else {
                        index = ids[i];
                    }
                    if (-1870742467 * discardUnpacked == 0) {
                        filesDataBuffer[index] = packArray(filedata[i], false);
                    } else {
                        filesDataBuffer[index] = filedata[i];
                    }
                }
            } else {
                int header_section_pos = unpacked.length;
                int sectors = unpacked[--header_section_pos] & 0xff;
                header_section_pos -= count * sectors * 4;
                Buffer buffer = new Buffer(unpacked);
                int len = 0;
                int fileIndex = 0;
                buffer.offset = 116413311 * header_section_pos;
                for (int i_60_ = 0; i_60_ < sectors; i_60_++) {
                    int delta = 0;
                    for (int x = 0; x < count; x++) {
                        delta += buffer.readInt();
                        int index;
                        if (null == ids) {
                            index = x;
                        } else {
                            index = ids[x];
                        }
                        if (index == fileID) {
                            len += delta;
                            fileIndex = index;
                        }
                    }
                }
                if (len == 0) {
                    return true;
                }
                byte[] filedata = new byte[len];
                len = 0;
                buffer.offset = header_section_pos * 116413311;
                int dataOffset = 0;
                for (int i = 0; i < sectors; i++) {
                    int delta = 0;
                    for (int x = 0; x < count; x++) {
                        delta += buffer.readInt();
                        int index;
                        if (null == ids) {
                            index = x;
                        } else {
                            index = ids[x];
                        }
                        if (index == fileID) {
                            System.arraycopy(unpacked, dataOffset, filedata, len, delta);
                            len += delta;
                        }
                        dataOffset += delta;
                    }
                }
                filesDataBuffer[fileIndex] = filedata;
            }
        } else {
            int index;
            if (null == ids) {
                index = 0;
            } else {
                index = ids[0];
            }
            if (0 == discardUnpacked * -1870742467) {
                filesDataBuffer[index] = packArray(unpacked, false);
            } else {
                filesDataBuffer[index] = unpacked;
            }
        }
        return true;
    }

    public synchronized int[] getFileIDs(int containerID) {
        if (!groupExists(containerID)) {
            return null;
        }
        int[] containerSize = (index.childIndicies[containerID]);
        if (containerSize == null) {
            containerSize = new int[(index.childCounts[containerID])];
            for (int fileID = 0; fileID < containerSize.length; fileID++) {
                containerSize[fileID] = fileID;
            }
        }
        return containerSize;
    }

    synchronized boolean groupExists(int containerID) {
        if (!isReady()) {
            return false;
        }
        if (containerID < 0 || containerID >= (index.childSizes).length || 0 == (index.childSizes[containerID])) {
            if (existsDebug) {
                throw new IllegalArgumentException(Integer.toString(containerID));
            }
            return false;
        }
        return true;
    }

    public synchronized boolean exists(int id) {
        try {
            if (!isReady()) {
                return false;
            }
            if (1 == (index.childSizes).length) {
                return fileExists(0, id);
            }
            if (!groupExists(id)) {
                return false;
            }
            if (index.childSizes[id] == 1) {
                return fileExists(id, 0);
            }
            throw new RuntimeException();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, "Unable to determine if id is groupid or fileid");
        }
    }

    public int getArchiveIdByName(String string) {
            if (!isReady()) {
                return -1;
            }
            string = string.toLowerCase();
            int archiveID = (index.hashStore.getId(StringUtils.hash(string)));
            if (!groupExists(archiveID)) {
                return -1;
            }
            return archiveID;
    }

    public boolean method2312(String string) {
        try {
            if (!isReady()) {
                return false;
            }
            string = string.toLowerCase();
            int i_112_ = (index.hashStore.getId(StringUtils.hash(string)));
            return loadContainer(i_112_);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ke.ak(").append(')').toString());
        }
    }

    public boolean isLoaded(String string) {
        int archiveID = getArchiveIdByName("");
        if (archiveID != -1) {
            return method2302("", string);
        }
        return method2302(string, "");
    }

    public byte[] getFileFromArchive(int type, int file) {
        if (type != 35 && type != 26) {
        }
        return getFile(type, file, null);
    }

    public int getFileSystem(int containerID) {
        if (!groupExists(containerID)) {
            return 0;
        }
        return (index.childSizes[containerID]);
    }
}
