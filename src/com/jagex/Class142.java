package com.jagex;/* Class142 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class142 {
    String aString1552;
    String aString1553;
    String aString1554;

    Class142(String string, String string_0_, String string_1_) {
        this.aString1553 = string;
        this.aString1554 = string_0_;
        this.aString1552 = string_1_;
    }

    static void submitConsoleMessage(boolean bool) {
        if (Class8.consoleText.length() != 0) {
            StaticMethods.sendConsoleMessage(new StringBuilder().append("--> ").append(Class8.consoleText).toString());
            Class419.executeCommand(Class8.consoleText, false, bool);
            Class8.anInt105 = 0;
            if (!bool) {
                Class8.consoleTextIndex = 0;
                Class8.consoleText = "";
            }
        }
    }

}
