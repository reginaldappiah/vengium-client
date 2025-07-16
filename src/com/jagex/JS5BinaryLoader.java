package com.jagex;/* Class237 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class JS5BinaryLoader implements FileLoader {
    Js5FileSystem fileSystem;
    String type;

    JS5BinaryLoader(Js5FileSystem fileSystem, String type) {
        this.fileSystem = fileSystem;
        this.type = type;
    }

    public int getProgress() {
        if (this.fileSystem.isLoaded(this.type)) {
            return 100;
        }
        return 0;
    }

    public FileType getFileType() {
        return FileType.GROUP;
    }

}
