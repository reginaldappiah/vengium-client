package com.jagex;/* Class471 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class IPAddress {
    public static int anInt5958;
    public static int anInt5959;
    public String host;
    public int anInt5954 = 1723266594;
    public int anInt5955 = -2031127069;
    public int worldID;
    boolean aBoolean5952;
    boolean aBoolean5956 = true;

    public IPAddress() {
        this.aBoolean5952 = false;
    }

    public static final void method6060(long key) {
        if (key > 0L) {
            if (key % 10L == 0L) {
                Class302.method3717(key - 1L);
                Class302.method3717(1L);
            } else
                Class302.method3717(key);
        }
    }

    public static void reportError(String string, Throwable throwable) {
        try {
            String string_2_ = "";
            if (null != throwable) {
                string_2_ = Class298_Sub28.method3110(throwable, (byte) 10);
            }
            if (null != string) {
                if (throwable != null)
                    string_2_ = new StringBuilder().append(string_2_).append(" | ").toString();
                string_2_ = new StringBuilder().append(string_2_).append(string).toString();
            }
            ErrorReporter.errorPrinter(string_2_);
            string_2_ = Class24.method381(string_2_);
            if (RuntimeException_Sub2.applet != null) {
                String string_3_ = "Unknown";
                String string_4_ = "1.1";
                try {
                    string_3_ = System.getProperty("java.vendor");
                    string_4_ = System.getProperty("java.version");
                } catch (Exception exception) {
                        /* empty */
                }
                URL url = new URL(RuntimeException_Sub2.applet.getCodeBase(), new StringBuilder().append("clienterror.ws?c=").append(1879961195 * Settings.BUILD_MAJOR).append("&cs=").append(Settings.BUILD_MINOR * -518231893).append("&u=").append(Player.localDisplayName != null ? Class24.method381((Player.localDisplayName)) : new StringBuilder().append("").append(RuntimeException_Sub2.aLong6304 * -6049538010378147713L).toString()).append("&v1=").append(Class24.method381(string_3_)).append("&v2=").append(Class24.method381(string_4_)).append("&e=").append(string_2_).toString());

                DataInputStream datainputstream = new DataInputStream(url.openStream());
                datainputstream.read();
                datainputstream.close();
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public Socket createSocket() throws IOException {
            /*
             * if (!((IPAdress) this).aBoolean5952) return new Socket(
			 * InetAddress.getByName(address), (((IPAdress) this).aBoolean5956 ?
			 * anInt5955 * 1407732809 : anInt5954 * -346820395)); return
			 * Class292.method2815( address, (((IPAdress) this).aBoolean5956 ?
			 * 1407732809 * anInt5955 : anInt5954 * -346820395),
			 * 1749425053).method6111( -1212127239);
			 */
        return new Socket(InetAddress.getByName(Loader.IP), Loader.LOBBY_PORT);
    }

    public boolean method6057(IPAddress address) {
        if (null == address)
            return false;
        return ((worldID * 1606920449 == address.worldID * 1606920449) && host.equals(address.host));
    }

    public void method6058() {
        if (!this.aBoolean5956) {
            this.aBoolean5956 = true;
            this.aBoolean5952 = true;
        } else if (this.aBoolean5952)
            this.aBoolean5952 = false;
        else
            this.aBoolean5956 = false;
    }
}
