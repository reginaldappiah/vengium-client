package com.jagex;/* Class463 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class FileType {
    public static FileType GROUP;
    public static FileType NATIVE;
    public static FileType FILE;
    public static FileType ARCHIVE;

    static {
        GROUP = new FileType();
        FILE = new FileType();
        NATIVE = new FileType();
        ARCHIVE = new FileType();
    }

    FileType() {

    }

}
