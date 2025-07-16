package com.jagex;/* GameShell - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.ConfigType;
import com.jagex.game.cache.config.prefetch.JS5PrefetchType;
import com.jagex.utils.StringUtils;
import com.jagex.utils.TimeUtils;
import jaclib.nanotime.QueryPerformanceCounter;

import java.applet.Applet;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;

public abstract class GameShell implements Interface14, Runnable, FocusListener, WindowListener {
    public static int fps;
    public static int availableCPU;
    public static int leftMargin;
    public static int topMargin;
    public static int maximumMemory;
    public static Class309 frameBase;
    public static int canvasWidth;
    public static int canvasHeight;
    public static long updateInterval = 8126035193609507072L;
    public static long killtime;
    public static int missedLogicTicks;
    protected static volatile boolean aBoolean6471;
    protected static BufferedFile aBufferedFile_6476;
    protected static volatile boolean aBoolean6478;
    protected static boolean aBoolean6480;
    protected static String aString6485;
    static Class292 aClass292_6466;
    static BufferedFile aBufferedFile_6475;
    static int anInt6477;
    static long[] aLongArray6479;
    static volatile boolean aBoolean6481;
    static long[] aLongArray6486;
    static volatile long aLong6491;
    static boolean started;
    static BufferedFile aBufferedFile_6499;
    static File aFile6500;

    static {
        fps = 0;
        aLongArray6486 = new long[32];
        aLongArray6479 = new long[32];
        leftMargin = 0;
        topMargin = 0;
        aString6485 = null;
        aBoolean6471 = true;
        anInt6477 = -806102940;
        aBoolean6478 = false;
        aLong6491 = 0L;
        aBoolean6480 = false;
        aBoolean6481 = true;
        aBufferedFile_6499 = null;
        aBufferedFile_6476 = null;
        aBufferedFile_6475 = null;
        aClass292_6466 = null;
        killtime = 0L;
        started = false;
        maximumMemory = 1855823519;
        availableCPU = 1245045379;
    }

    boolean aBoolean6498 = false;
    boolean aBoolean6501 = false;

    public GameShell() {

    }

    public static Class309 createFrameTimeBase() {
        Class309_Sub2 class309_sub2;
        try {
            class309_sub2 = new Class309_Sub2();
        } catch (Throwable throwable) {
            return new Class309_Sub1();
        }
        return class309_sub2;
    }

    public static void cleanSystemQueue(Object object) {
        if (null != ScriptRuntime.anEventQueue5262) {
            for (int i_17_ = 0; (i_17_ < 50 && ScriptRuntime.anEventQueue5262.peekEvent() != null); i_17_++)
                IPAddress.method6060(1L);
            try {
                if (object != null)
                    ScriptRuntime.anEventQueue5262.postEvent(new ActionEvent(object, 1001, "dummy"));
            } catch (Exception exception) {
                    /* empty */
            }
        }
    }

    public final void windowOpened(WindowEvent windowevent) {
        try {
            /* empty */
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mc.windowOpened(").append(')').toString());
        }
    }

    public void supplyApplet(Applet applet) {
        GameClient.applet = applet;
    }

    final void idkyet(Class311 class311, String frameName, String buildName, int i, int i_1_, int buildMajor, int buildMinor, boolean bool) {
        try {
            method2762(Class292.aClass292_3163, bool, (short) -2229);
            GameClient.frameWidth = ((canvasWidth = class311.method3811((byte) -35) * -2010408377) * 1228593773);
            GameClient.frameHeight = ((canvasHeight = class311.method3815(2024501789) * 1445266787) * 1864178979);
            leftMargin = 0;
            topMargin = 0;
            if (StaticMethods.method4865() == Class292.aClass292_3164) {
                GameClient.frameWidth += -1643230090 * class311.method3812((byte) 52);
                GameClient.frameHeight += 63301394 * class311.method3813(-974427485);
                method2780(class311.method3814(1376340372));
            }
            RuntimeException_Sub2.applet = GameClient.applet;
            startCommon(frameName, buildName, i, i_1_, buildMajor, buildMinor);
        } catch (Throwable throwable) {
            IPAddress.reportError(null, throwable);
            method2778("crash");
        }
    }

    public final void startCommon(String frameName, String buildName, int i, int i_6_, int buildMajor, int buildMinor) throws Exception {
        try {
            Class310.anInt6512 = i_6_ * -652430819;
            Class139.anInt1548 = i * 19765097;
            Settings.BUILD_MAJOR = buildMajor * 715279939;
            Settings.BUILD_MINOR = buildMinor * 1366053379;
            Class350.aString3759 = "Unknown";
            ConfigType.aString1462 = "1.1";
            try {
                Class350.aString3759 = System.getProperty("java.vendor");
                ConfigType.aString1462 = System.getProperty("java.version");
            } catch (Exception exception) {
                /* empty */
            }
            try {
                Class365_Sub1_Sub3_Sub2.aString9932 = System.getProperty("os.name");
            } catch (Exception exception) {
                Class365_Sub1_Sub3_Sub2.aString9932 = "Unknown";
            }
            Class82_Sub8.operatingSystem = Class365_Sub1_Sub3_Sub2.aString9932.toLowerCase();
            try {
                Class344.aString3687 = System.getProperty("os.arch").toLowerCase();
            } catch (Exception exception) {
                Class344.aString3687 = "";
            }
            try {
                Class250.aString2765 = System.getProperty("os.version").toLowerCase();
            } catch (Exception exception) {
                Class250.aString2765 = "";
            }
            try {
                Class83.userDirectory = System.getProperty("user.home");
                if (Class83.userDirectory != null)
                    Class83.userDirectory = new StringBuilder().append(Class83.userDirectory).append("/").toString();
            } catch (Exception exception) {
                /* empty */
            }
            try {
                if (Class82_Sub8.operatingSystem.startsWith("win")) {
                    if (null == Class83.userDirectory) Class83.userDirectory = System.getenv("USERPROFILE");
                } else if (Class83.userDirectory == null) Class83.userDirectory = System.getenv("HOME");
                if (Class83.userDirectory != null)
                    Class83.userDirectory = new StringBuilder().append(Class83.userDirectory).append("/").toString();
            } catch (Exception exception) {
                /* empty */
            }
            if (null == Class83.userDirectory) Class83.userDirectory = "~/";
            try {
                ScriptRuntime.anEventQueue5262 = Toolkit.getDefaultToolkit().getSystemEventQueue();
            } catch (Throwable throwable) {
				/* empty */
            }
            Class216.folder_localdrive_location = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class83.userDirectory, "/tmp/", ""};
            EffectiveVertex.filestore_cache_location = (new String[]{new StringBuilder().append(".vengium_cache_").append(Class139.anInt1548 * -518493991).toString(), new StringBuilder().append(".file_store_").append(-518493991 * Class139.anInt1548).toString()});
            while_73_:
            for (int index = 0; index < 4; index++) {
                aFile6500 = method2783(frameName, buildName, index);
                if (!aFile6500.exists()) aFile6500.mkdirs();
                File[] files = aFile6500.listFiles();
                if (null == files) break;
                File[] files_11_ = files;
                int i_12_ = 0;
                for (; ; ) {
                    if (i_12_ >= files_11_.length) break while_73_;
                    File file = files_11_[i_12_];
                    if (!method2753(file, false, -547060345)) {
                        break;
                    }
                    i_12_++;
                }
            }
            StaticMethods.method4528(aFile6500);
            IsaacCipher.method5920(527600768);
            aBufferedFile_6476 = (new BufferedFile(new DiskFile(Class482.method6118("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0));
            aBufferedFile_6475 = (new BufferedFile(new DiskFile(Class482.method6118("main_file_cache.idx255"), "rw", 1048576L), 6000, 0));
            StaticMethods.aBufferedFileArray6106 = new BufferedFile[Class310.anInt6512 * 1210163253];
            for (int i_13_ = 0; i_13_ < 1210163253 * Class310.anInt6512; i_13_++)
                StaticMethods.aBufferedFileArray6106[i_13_] = new BufferedFile(new DiskFile((Class482.method6118(new StringBuilder().append("main_file_cache.idx").append(i_13_).toString())), "rw", 1048576L), 6000, 0);
            try {
                GameClient.display = new Display();
            } catch (Exception exception) {
                GameClient.fullscreen = false;
            }
            Class82_Sub23.aClass295_6921 = new Class295();
            ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
            for (ThreadGroup threadgroup_14_ = threadgroup.getParent(); threadgroup_14_ != null; threadgroup_14_ = threadgroup.getParent())
                threadgroup = threadgroup_14_;
            Thread[] threads = new Thread[1000];
            threadgroup.enumerate(threads);
            for (int i_15_ = 0; i_15_ < threads.length; i_15_++) {
                if (null != threads[i_15_] && threads[i_15_].getName().startsWith("AWT")) threads[i_15_].setPriority(1);
            }
            Thread thread = new Thread(this);
            thread.setDaemon(true);
            thread.start();
            thread.setPriority(1);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mc.f(").append(')').toString());
        }
    }

    boolean method2753(File file, boolean bool, int i) {
        try {
            boolean bool_16_;
            try {
                RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
                int i_17_ = randomaccessfile.read();
                randomaccessfile.seek(0L);
                randomaccessfile.write(i_17_);
                randomaccessfile.seek(0L);
                randomaccessfile.close();
                if (bool) file.delete();
                bool_16_ = true;
            } catch (Exception exception) {
                return false;
            }
            return bool_16_;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mc.k(").append(')').toString());
        }
    }

    public boolean method2754(File file, int i) {
        try {
            if (null == file) return false;
            if (!file.exists()) return false;
            if (!file.isDirectory()) return false;
            if (file.listFiles().length != 0) return false;
            if (!method2753(new File(file, "test.dat"), true, -1050192338)) return false;
            method2755(file, aFile6500, 285238690);
            return true;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mc.p(").append(')').toString());
        }
    }

    void method2755(File file, File file_18_, int i) {
        try {
            try {
                DiskFile diskFile = new DiskFile(Class180.aFile6528, "rw", 10000L);
                Buffer class298_sub53 = new Buffer(500);
                class298_sub53.writeByte(2);
                class298_sub53.writeByte(null != file_18_ ? 1 : 0);
                class298_sub53.putJagString(file.getPath());
                if (file_18_ != null) class298_sub53.putJagString(file_18_.getPath());
                diskFile.method6078(class298_sub53.buffer, 0, 385051775 * class298_sub53.offset);
                diskFile.method6079();
            } catch (IOException ioexception) {
                ioexception.printStackTrace();
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mc.i(").append(')').toString());
        }
    }

    synchronized void buildScreenContext() {
        clearContext();
        Container container = StaticMethods.getParent();
        DirectXContext.canvas = new CanvasWrapper(container);
        updateClickableWindow(container);
    }

    public final void method203(Graphics graphics) {
        method195(graphics);
    }

    void clearContext() {
            if (DirectXContext.canvas != null) {
                DirectXContext.canvas.removeFocusListener(this);
                DirectXContext.canvas.getParent().setBackground(Color.black);
                DirectXContext.canvas.getParent().remove(DirectXContext.canvas);
            }
    }

    final boolean isValidHost() {
        String string = GameClient.applet.getDocumentBase().getHost().toLowerCase();
        if (string.equals("jagex.com") || string.endsWith(".jagex.com")) return true;
        if (string.equals("runescape.com") || string.endsWith(".runescape.com")) return true;
        if (string.endsWith(Loader.IP)) return true;
        //if (string.endsWith("192.168.1."))
        //	return true;
        method2778("invalidhost");
        return false;
    }

    public void run() {
        do {
            try {
                try {
                    runInner();
                } catch (ThreadDeath threaddeath) {
                    throw threaddeath;
                } catch (Throwable throwable) {
                    IPAddress.reportError(method2761(), throwable);
                    method2778("crash");
                    method2776();
                    break;
                }
                method2776();
            } catch (RuntimeException object) {
                method2776();
                throw object;
            }
        } while (false);
    }

    public void runInner() {
        if (null != Class350.aString3759) {
            String string = Class350.aString3759.toLowerCase();
            if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
                String javaVersion = ConfigType.aString1462;
                if (javaVersion.equals("1.1") || javaVersion.startsWith("1.1.") || javaVersion.equals("1.2") || javaVersion.startsWith("1.2.") || javaVersion.equals("1.3") || javaVersion.startsWith("1.3.") || javaVersion.equals("1.4") || javaVersion.startsWith("1.4.") || javaVersion.equals("1.5") || javaVersion.startsWith("1.5.") || javaVersion.equals("1.6.0")) {
                    method2778("wrongjava");
                    return;
                }
                if (javaVersion.startsWith("1.6.0_")) {
                    int index;
                    for (index = 6; (index < javaVersion.length() && Class431.method5764(javaVersion.charAt(index))); index++) {

                    }
                    String string_21_ = javaVersion.substring(6, index);
                    if (Class51.method543(string_21_) && (StringUtils.method1998(string_21_) < 10)) {
                        method2778("wrongjava");
                        return;
                    }
                }
            }
        }
        StaticMethods.getParent().setFocusCycleRoot(true);
        maximumMemory = ((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * -1855823519;
        availableCPU = Runtime.getRuntime().availableProcessors() * 1245045379;
        buildScreenContext();
        mainInit();
        frameBase = createFrameTimeBase();
        while (0L == 2916456661870185289L * killtime || (TimeUtils.getTime() < killtime * 2916456661870185289L)) {
            missedLogicTicks = (frameBase.waitForNextFrame(updateInterval * -4639622049358970979L) * -2090388391);
            for (int index = 0; index < missedLogicTicks * -1597189143; index++)
                mainLoopWrapper();
            mainRedrawWrapper();
            cleanSystemQueue(DirectXContext.canvas);
        }
    }

    public void mainRedrawWrapper() {
        long currentTime = TimeUtils.getTime();
        long l_23_ = aLongArray6486[-1371443851 * Class272.anInt2903];
        aLongArray6486[-1371443851 * Class272.anInt2903] = currentTime;
        Class272.anInt2903 = 1423456989 * (-1371443851 * Class272.anInt2903 + 1 & 0x1f);
        if (l_23_ != 0L && currentTime > l_23_) {
            int i_24_ = (int) (currentTime - l_23_);
            fps = ((i_24_ >> 1) + 32000) / i_24_ * -863758789;
        }
        if ((anInt6477 += -2020246835) * 698024453 - 1 > 50) {
            anInt6477 -= 2066873354;
            aBoolean6471 = true;
            DirectXContext.canvas.setSize(canvasWidth * -2110394505, canvasHeight * -1111710645);
            DirectXContext.canvas.setVisible(true);
            if (null != GameClient.windowFrame && GameClient.fullScreenFrame == null) {
                Insets insets = GameClient.windowFrame.getInsets();
                DirectXContext.canvas.setLocation(insets.left + leftMargin * 1898544019, 540368727 * topMargin + insets.top);
            } else DirectXContext.canvas.setLocation((leftMargin * 1898544019), (540368727 * topMargin));
        }
        mainRedraw();
    }

    String method2761() {
        try {
            return null;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mc.j(").append(')').toString());
        }
    }

    void method2762(Class292 class292, boolean bool, short i) {
        try {
            if (class292 == null) throw new NullPointerException();
            if (class292 != Class292.aClass292_3163 && Class292.aClass292_3162 != class292)
                throw new IllegalStateException();
            aClass292_6466 = class292;
            if (aClass292_6466 != Class292.aClass292_3162) {
                if (bool) aClass292_6466 = Class292.aClass292_3164;
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mc.az(").append(')').toString());
        }
    }

    public void method192() {
        try {
            if (!started) killtime = ((TimeUtils.getTime() + 4000L) * -5427437724707662087L);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mc.stop(").append(')').toString());
        }
    }

    public final synchronized void method195(Graphics graphics) {
        try {
            if (!started) {
                aBoolean6471 = true;
                if ((TimeUtils.getTime() - -4623726814665285853L * aLong6491) > 1000L) {
                    Rectangle rectangle = graphics.getClipBounds();
                    if (rectangle == null || (rectangle.width >= -639974669 * GameClient.frameWidth && rectangle.height >= GameClient.frameHeight * 1282634425))
                        aBoolean6478 = true;
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mc.paint(").append(')').toString());
        }
    }

    public final void focusGained(FocusEvent focusevent) {
        try {
            aBoolean6481 = true;
            aBoolean6471 = true;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mc.focusGained(").append(')').toString());
        }
    }

    public final void windowActivated(WindowEvent windowevent) {
        try {
			/* empty */
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mc.windowActivated(").append(')').toString());
        }
    }

    public final void windowClosed(WindowEvent windowevent) {
        try {
			/* empty */
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mc.windowClosed(").append(')').toString());
        }
    }

    public final void windowClosing(WindowEvent windowevent) {
        try {
            aBoolean6480 = true;
            method193();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mc.windowClosing(").append(')').toString());
        }
    }

    public final void windowDeiconified(WindowEvent windowevent) {
        try {
			/* empty */
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mc.windowDeiconified(").append(')').toString());
        }
    }

    public final void windowIconified(WindowEvent windowevent) {
        try {
			/* empty */
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mc.windowIconified(").append(')').toString());
        }
    }

    public void start() {
            if (!started)
                killtime = 0L;
    }

    public abstract void init();

    public abstract void mainInit();

    public void mainLoopWrapper() {
            long currentTime = TimeUtils.getTime();
            long l_25_ = aLongArray6479[CS2CallStackEntry.anInt5227 * -1495088089];
            aLongArray6479[CS2CallStackEntry.anInt5227 * -1495088089] = currentTime;
            CS2CallStackEntry.anInt5227 = -1259443305 * (1 + CS2CallStackEntry.anInt5227 * -1495088089 & 0x1f);
            if (0L != l_25_ && currentTime <= l_25_) {
				/* empty */
            }
            synchronized (this) {
                StaticMethods.aBoolean8385 = aBoolean6481;
            }
            mainLoop();
    }

    public abstract void mainQuit();

    public abstract void method204();

    public boolean method2766() {
            this.aBoolean6501 = JS5PrefetchType.getPrefetch().load("jaclib");
            if (this.aBoolean6501) {
                try {
                    QueryPerformanceCounter.init();
                } catch (Throwable throwable) {
					/* empty */
                }
            }
            return this.aBoolean6501;
    }

    public boolean method2767(int i) {
        try {
            return JS5PrefetchType.getPrefetch().load("jagtheora");
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mc.al(").append(')').toString());
        }
    }

    public final synchronized void method191(Graphics graphics) {
        if (!started) {
            aBoolean6471 = true;
            if ((TimeUtils.getTime() - -4623726814665285853L * aLong6491) > 1000L) {
                Rectangle rectangle = graphics.getClipBounds();
                if (rectangle == null || (rectangle.width >= -639974669 * GameClient.frameWidth && rectangle.height >= GameClient.frameHeight * 1282634425))
                    aBoolean6478 = true;
            }
        }
    }

    public final void method194(Graphics graphics) {
        try {
            method195(graphics);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mc.update(").append(')').toString());
        }
    }

    public abstract void method211();

    public final synchronized void method201(Graphics graphics) {
        if (!started) {
            aBoolean6471 = true;
            if ((TimeUtils.getTime() - -4623726814665285853L * aLong6491) > 1000L) {
                Rectangle rectangle = graphics.getClipBounds();
                if (rectangle == null || (rectangle.width >= -639974669 * GameClient.frameWidth && rectangle.height >= GameClient.frameHeight * 1282634425))
                    aBoolean6478 = true;
            }
        }
    }

    public void method196() {
        if (!started) killtime = 0L;
    }

    public void method200() {
        if (!started) {
            killtime = TimeUtils.getTime() * -5427437724707662087L;
            IPAddress.method6060(5000L);
            method2776();
        }
    }

    public void method193() {
        try {
            if (!started) {
                killtime = TimeUtils.getTime() * -5427437724707662087L;
                IPAddress.method6060(5000L);
                method2776();
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mc.destroy(").append(')').toString());
        }
    }

    public abstract void mainLoop();

    public abstract void mainRedraw();

    final void method2776() {
        synchronized (this) {
            if (started) return;
            started = true;
        }
        try {
            mainQuit();
        } catch (Exception exception) {
				/* empty */
        }
        try {
            aBufferedFile_6476.method6133(23087728);
            for (int i_26_ = 0; i_26_ < 1210163253 * Class310.anInt6512; i_26_++)
                StaticMethods.aBufferedFileArray6106[i_26_].method6133(1779540289);
            aBufferedFile_6475.method6133(1551725262);
            aBufferedFile_6499.method6133(1640504231);
        } catch (Exception exception) {
				/* empty */
        }
        if (this.aBoolean6501) {
            try {
                QueryPerformanceCounter.quit();
            } catch (Throwable throwable) {
					/* empty */
            }
        }
        Class71.method813(true, 32768);
        if (JS5PrefetchType.prefetchUnavailable()) JS5PrefetchType.getPrefetch().destroy();
        if (DirectXContext.canvas != null) {
            try {
                DirectXContext.canvas.removeFocusListener(this);
                DirectXContext.canvas.getParent().remove(DirectXContext.canvas);
            } catch (Exception exception) {
					/* empty */
            }
        }
        if (GameClient.windowFrame != null) {
            GameClient.windowFrame.setVisible(false);
            GameClient.windowFrame.dispose();
            GameClient.windowFrame = null;
        }
    }

    void updateClickableWindow(Container container) {
        try {
            container.setBackground(Color.BLACK);
            container.setLayout(null);
            container.add(DirectXContext.canvas);
            DirectXContext.canvas.setSize(-2110394505 * canvasWidth, -1111710645 * canvasHeight);
            DirectXContext.canvas.setVisible(true);
            if (container == GameClient.windowFrame) {
                Insets insets = GameClient.windowFrame.getInsets();
                DirectXContext.canvas.setLocation(insets.left + 1898544019 * leftMargin, topMargin * 540368727 + insets.top);
            } else DirectXContext.canvas.setLocation((1898544019 * leftMargin), (540368727 * topMargin));
            DirectXContext.canvas.addFocusListener(this);
            DirectXContext.canvas.requestFocus();
            StaticMethods.aBoolean8385 = true;
            aBoolean6481 = true;
            DirectXContext.canvas.setFocusTraversalKeysEnabled(false);
            aBoolean6471 = true;
            aBoolean6478 = false;
            aLong6491 = TimeUtils.getTime() * -4845717340640327541L;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mc.h(").append(')').toString());
        }
    }

    public void method197() {
        if (!started) killtime = ((TimeUtils.getTime() + 4000L) * -5427437724707662087L);
    }

    public void method198() {
        if (!started) killtime = ((TimeUtils.getTime() + 4000L) * -5427437724707662087L);
    }

    public void method199() {
        if (!started) killtime = ((TimeUtils.getTime() + 4000L) * -5427437724707662087L);
    }

    public void method202() {
        if (!started) {
            killtime = TimeUtils.getTime() * -5427437724707662087L;
            IPAddress.method6060(5000L);
            method2776();
        }
    }

    public final void method209(Graphics graphics) {
        method195(graphics);
    }

    void method2778(String string) {
        try {
            if (!this.aBoolean6498) {
                this.aBoolean6498 = true;
                System.out.println(new StringBuilder().append("error_game_").append(string).toString());
                try {
                    Class466.method6021(GameClient.applet, "loggedout");
                } catch (Throwable throwable) {
					/* empty */
                }
                try {
                    GameClient.applet.getAppletContext().showDocument(new URL(GameClient.applet.getCodeBase(), new StringBuilder().append("error_game_").append(string).append(".ws").toString()), "_top");
                } catch (Exception exception) {
					/* empty */
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mc.ah(").append(')').toString());
        }
    }

    public final void windowDeactivated(WindowEvent windowevent) {
        try {
			/* empty */
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mc.windowDeactivated(").append(')').toString());
        }
    }

    synchronized void method2780(String string) {
        try {
            GameClient.windowFrame = new Frame();
            GameClient.windowFrame.setTitle(string);
            GameClient.windowFrame.setResizable(true);
            GameClient.windowFrame.addWindowListener(this);
            GameClient.windowFrame.setBackground(Color.black);
            GameClient.windowFrame.setVisible(true);
            GameClient.windowFrame.toFront();
            Insets insets = GameClient.windowFrame.getInsets();
            GameClient.windowFrame.setSize((insets.right + (GameClient.frameWidth * -639974669 + insets.left)), (GameClient.frameHeight * 1282634425 + insets.top + insets.bottom));
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mc.z(").append(')').toString());
        }
    }

    public abstract void method208();

    public abstract void method205();

    public abstract void method206();

    public abstract void method207();

    public abstract void method210();

    public final void focusLost(FocusEvent focusevent) {
        try {
            aBoolean6481 = false;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mc.focusLost(").append(')').toString());
        }
    }

    File method2783(String frameName, String buildName, int i) {
        try {
            String string_29_ = (i == 0 ? "" : new StringBuilder().append("").append(i).toString());
            Class180.aFile6528 = new File(Class83.userDirectory, new StringBuilder().append("vengium_cl_").append(frameName).append("_").append(buildName).append(string_29_).append(".dat").toString());
            String string_30_ = null;
            String string_31_ = null;
            boolean bool = false;
            if (Class180.aFile6528.exists()) {
                try {
                    DiskFile diskFile = new DiskFile(Class180.aFile6528, "rw", 10000L);
                    int i_32_;
                    Buffer class298_sub53;
                    for (class298_sub53 = (new Buffer((int) diskFile.getFileLength())); (class298_sub53.offset * 385051775 < class298_sub53.buffer.length); class298_sub53.offset += i_32_ * 116413311) {
                        i_32_ = (diskFile.method6081(class298_sub53.buffer, class298_sub53.offset * 385051775, (class298_sub53.buffer.length - class298_sub53.offset * 385051775), (short) -10746));
                        if (i_32_ == -1) throw new IOException();
                    }
                    class298_sub53.offset = 0;
                    i_32_ = class298_sub53.readUByte();
                    if (i_32_ < 1 || i_32_ > 2)
                        throw new IOException(new StringBuilder().append("").append(i_32_).toString());
                    int i_33_ = 0;
                    if (i_32_ > 1) i_33_ = class298_sub53.readUByte();
                    string_30_ = class298_sub53.readJagString();
                    if (1 == i_33_) string_31_ = class298_sub53.readJagString();
                    diskFile.method6079();
                } catch (IOException ioexception) {
                    ioexception.printStackTrace();
                }
                if (null != string_30_) {
                    File file = new File(string_30_);
                    if (!file.exists()) string_30_ = null;
                }
                if (null != string_30_) {
                    File file = new File(string_30_, "test.dat");
                    if (!method2753(file, true, -332239711)) string_30_ = null;
                }
            }
            if (string_30_ == null && 0 == i) {
                while_74_:
                for (int i_34_ = 0; i_34_ < EffectiveVertex.filestore_cache_location.length; i_34_++) {
                    for (int i_35_ = 0; i_35_ < Class216.folder_localdrive_location.length; i_35_++) {
                        File file = new File(new StringBuilder().append(Class216.folder_localdrive_location[i_35_]).append(EffectiveVertex.filestore_cache_location[i_34_]).append(File.separatorChar).append(frameName).append(File.separatorChar).toString());
                        if (file.exists() && method2753(new File(file, "test.dat"), true, -1984790861)) {
                            string_30_ = file.toString();
                            bool = true;
                            break while_74_;
                        }
                    }
                }
            }
            if (string_30_ == null) {
                string_30_ = new StringBuilder().append(Class83.userDirectory).append(File.separatorChar).append("VengiumCache").append(string_29_).append(File.separatorChar).append(frameName).append(File.separatorChar).append(buildName).append(File.separatorChar).toString();
                bool = true;
            }
            if (null != string_31_) {
                File file = new File(string_31_);
                File file_36_ = new File(string_30_);
                try {
                    File[] files = file.listFiles();
                    File[] files_37_ = files;
                    for (int i_38_ = 0; i_38_ < files_37_.length; i_38_++) {
                        File file_39_ = files_37_[i_38_];
                        File file_40_ = new File(file_36_, file_39_.getName());
                        boolean bool_41_ = file_39_.renameTo(file_40_);
                        if (!bool_41_) throw new IOException();
                    }
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                bool = true;
            }
            if (bool) method2755(new File(string_30_), null, 359278649);
            return new File(string_30_);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("mc.b(").append(')').toString());
        }
    }
}
