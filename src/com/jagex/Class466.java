package com.jagex;

import netscape.javascript.JSObject;
import java.applet.Applet;

/**
 * Class466 - JavaScript bridge utility for Applet JSObject communication.
 * DO NOT instantiate.
 */
public class Class466 {

    // Private constructor to prevent instantiation
    private Class466() throws Throwable {
        throw new Error("Class466 is a static utility class and cannot be instantiated.");
    }

    /**
     * Evaluates JavaScript code using JSObject.eval.
     *
     * @param applet the Applet instance
     * @param script the JavaScript code to evaluate
     * @param i      an unused parameter (kept for compatibility)
     */
    public static void method6020(Applet applet, String script, int i) throws Throwable {
        try {
            JSObject.getWindow(applet).eval(script);
        } catch (Throwable t) {
            System.err.println("JS eval error: " + script);
            t.printStackTrace();
            throw t;
        }
    }

    /**
     * Calls a JavaScript function with no arguments.
     *
     * @param applet the Applet instance
     * @param functionName the name of the JavaScript function
     * @return the result from JavaScript
     */
    public static Object method6021(Applet applet, String functionName) throws Throwable {
        try {
            return JSObject.getWindow(applet).call(functionName, null);
        } catch (Throwable t) {
            System.err.println("JS call error: " + functionName);
            t.printStackTrace();
            throw t;
        }
    }

    /**
     * Calls a JavaScript function with arguments.
     *
     * @param applet the Applet instance
     * @param functionName the name of the JavaScript function
     * @param args the arguments to pass
     * @return the result from JavaScript
     */
    public static Object method6022(Applet applet, String functionName, Object[] args) throws Throwable {
        try {
            return JSObject.getWindow(applet).call(functionName, args);
        } catch (Throwable t) {
            System.err.println("JS call error: " + functionName);
            t.printStackTrace();
            throw t;
        }
    }
}