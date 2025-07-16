package com.jagex;/* Class26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class26 {
    public static String breakMessage;
    static String leftParenthesis;
    static String lambdaExpression;
    static String rightParenthesis;
    static String comma;
    static String ipAddress;
    static String trueBoolean = "true";
    static String colorMessage;

    static {
        comma = ",";
        leftParenthesis = " (";
        rightParenthesis = ")";
        lambdaExpression = "->";
        ipAddress = Loader.IP;// "127.0.0.1";
        breakMessage = "<br>";
        colorMessage = "</col>";
    }

    Class26() throws Throwable {
        throw new Error();
    }

    public static Class367 method398(int i) {
        Class367[] class367s = Class69.method790();
        for (int i_17_ = 0; i_17_ < class367s.length; i_17_++) {
            if (i == class367s[i_17_].anInt3996 * -1682932563)
                return class367s[i_17_];
        }
        return null;
    }

}
