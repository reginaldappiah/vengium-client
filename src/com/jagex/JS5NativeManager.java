package com.jagex;/* Class305 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.prefetch.JSFPrefetch;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class JS5NativeManager implements JSFPrefetch {
    public static JS5NativeManager nativeManager;
    Js5FileSystem nativeJs5;
    String nativeJs5Path;
    Hashtable fileTable = new Hashtable();
    Hashtable classTable = new Hashtable();

    public JS5NativeManager(Js5FileSystem js5) {
        this.nativeJs5 = js5;
        String dirName = "";
        if (SystemTools.osName.startsWith("win") || SystemTools.osName.startsWith("windows 7")) {
            dirName = new StringBuilder().append(dirName).append("windows/").toString();
        } else if (SystemTools.osName.startsWith("linux")) {
            dirName = new StringBuilder().append(dirName).append("linux/").toString();
        } else if (SystemTools.osName.startsWith("mac")) {
            dirName = new StringBuilder().append(dirName).append("macos/").toString();
        }
        if (SystemTools.osArch.startsWith("amd64") || SystemTools.osArch.startsWith("x86_64")) {
            dirName = new StringBuilder().append(dirName).append("x86_64/").toString();
        } else if (SystemTools.osArch.startsWith("i386") || SystemTools.osArch.startsWith("i486") || SystemTools.osArch.startsWith("i586") || SystemTools.osArch.startsWith("x86")) {
            dirName = new StringBuilder().append(dirName).append("x86/").toString();
        } else if (SystemTools.osArch.startsWith("ppc")) {
            dirName = new StringBuilder().append(dirName).append("ppc/").toString();
        } else {
            dirName = new StringBuilder().append(dirName).append("universal/").toString();
        }
        this.nativeJs5Path = dirName;
    }

    public int getProgress(String lib) {
        if (this.fileTable.containsKey(lib)) {
            return 100;
        }
        String string_3_ = Class462.method5990(lib);
        if (null == string_3_) {
            return -1;
        }
        String string_4_ = null;
        if (string_4_ == null) {
            string_4_ = new StringBuilder().append(this.nativeJs5Path).append(string_3_).toString();
            if (!this.nativeJs5.method2300(string_4_, "")) {
                return -1;
            }
        }
        if (!this.nativeJs5.method2312(string_4_)) {
            return this.nativeJs5.getGroupProgress(string_4_);
        }
        byte[] is = this.nativeJs5.getFile(string_4_, "");
        File file;
        try {
            file = Class482.method6118(string_3_);
        } catch (RuntimeException runtimeexception) {
            return -1;
        }
        if (is != null && null != file) {
            boolean bool = true;
            byte[] is_5_ = StaticMethods.method4311(file);
            if (null != is_5_ && is.length == is_5_.length) {
                for (int i_6_ = 0; i_6_ < is_5_.length; i_6_++) {
                    if (is_5_[i_6_] != is[i_6_]) {
                        bool = false;
                        break;
                    }
                }
            } else {
                bool = false;
            }
            try {
                if (!bool) {
                    try {
                        FileOutputStream fileoutputstream = new FileOutputStream(file);
                        fileoutputstream.write(is, 0, is.length);
                        fileoutputstream.close();
                    } catch (IOException ioexception) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable throwable) {
                return -1;
            }
            storeNativeFile(lib, file);
            return 100;
        }
        return -1;
    }

    void storeNativeFile(String string, File file) {
        this.fileTable.put(string, file);
    }

    public boolean isLoaded(String string) {
        return this.fileTable.containsKey(string);
    }

    public boolean load(String name) {
        return method3746(name, Class294.class);
    }

    boolean method3746(String string, Class varClass) {
        Class var_class_7_ = (Class) this.classTable.get(string);
        if (var_class_7_ != null) {
            return var_class_7_.getClassLoader() == varClass.getClassLoader();
        }
        File file = null;
        if (null == file) {
            file = (File) this.fileTable.get(string);
        }
        do {
            if (file != null) {
                boolean bool;
                try {
                    file = new File(file.getCanonicalPath());
                    Class var_class_8_ = java.lang.Runtime.class;
                    Class var_class_9_ = java.lang.reflect.AccessibleObject.class;
                    Method method = var_class_9_.getDeclaredMethod("setAccessible", (new Class[]{Boolean.TYPE}));
                    Method method_10_ = (var_class_8_.getDeclaredMethod("load0", (new Class[]{java.lang.Class.class, java.lang.String.class})));
                    method.invoke(method_10_, Boolean.TRUE);
                    method_10_.invoke(Runtime.getRuntime(), varClass, file.getPath());
                    method.invoke(method_10_, Boolean.FALSE);
                    this.classTable.put(string, varClass);
                    bool = true;
                } catch (NoSuchMethodException nosuchmethodexception) {
                    System.load(file.getPath());
                    this.classTable.put(string, Class294.class);
                    return true;
                } catch (Throwable throwable) {
                    break;
                }
                return bool;
            }
        } while (false);
        return false;
    }

    public boolean destroy() {
        Hashtable removeTable = new Hashtable();
        Enumeration enumeration = this.classTable.keys();
        while (enumeration.hasMoreElements()) {
            String string = (String) enumeration.nextElement();
            removeTable.put(string, this.classTable.get(string));
        }
        try {
            Class accessClass = java.lang.reflect.AccessibleObject.class;
            Class loaderClass = java.lang.ClassLoader.class;
            Field librariesField = loaderClass.getDeclaredField("nativeLibraries");
            Method accessMethod = accessClass.getDeclaredMethod("setAccessible", (new Class[]{Boolean.TYPE}));
            accessMethod.invoke(librariesField, Boolean.TRUE);
            try {
                enumeration = this.classTable.keys();
                while (enumeration.hasMoreElements()) {
                    String myName = (String) enumeration.nextElement();
                    try {
                        File file = (File) this.fileTable.get(myName);
                        Class representer = (Class) this.classTable.get(myName);
                        Vector vector = ((Vector) librariesField.get(representer.getClassLoader()));
                        for (int index = 0; index < vector.size(); index++) {
                            try {
                                Object nativeClass = vector.elementAt(index);
                                Field nameField = nativeClass.getClass().getDeclaredField("name");
                                accessMethod.invoke(nameField, (new Object[]{Boolean.TRUE}));
                                try {
                                    String name = (String) nameField.get(nativeClass);
                                    if (name != null && (name.equalsIgnoreCase(file.getCanonicalPath()))) {
                                        Field handleField = (nativeClass.getClass().getDeclaredField("handle"));
                                        Method finalizeMethod = (nativeClass.getClass().getDeclaredMethod("finalize"));
                                        accessMethod.invoke(handleField, (new Object[]{Boolean.TRUE}));
                                        accessMethod.invoke(finalizeMethod, (new Object[]{Boolean.TRUE}));
                                        try {
                                            finalizeMethod.invoke(nativeClass, (new Object[0]));
                                            handleField.set(nativeClass, new Integer(0));
                                            removeTable.remove(myName);
                                        } catch (Throwable throwable) {
                                                /* empty */
                                        }
                                        accessMethod.invoke(finalizeMethod, (new Object[]{Boolean.FALSE}));
                                        accessMethod.invoke(handleField, (new Object[]{Boolean.FALSE}));
                                    }
                                } catch (Throwable throwable) {
                                        /* empty */
                                }
                                accessMethod.invoke(nameField, (new Object[]{Boolean.FALSE}));
                            } catch (Throwable throwable) {
                                    /* empty */
                            }
                        }
                    } catch (Throwable throwable) {
							/* empty */
                    }
                }
            } catch (Throwable throwable) {
					/* empty */
            }
            accessMethod.invoke(librariesField, Boolean.FALSE);
        } catch (Throwable throwable) {
				/* empty */
        }
        this.classTable = removeTable;
        return this.classTable.isEmpty();
    }

    public boolean isDefined(String string) {
        return this.classTable.containsKey(string);
    }

}
