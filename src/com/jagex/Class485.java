package com.jagex;/* Class485 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.StringUtils;

public class Class485 {
    public char symbol;

    Class485() {
    }

    public static char keyCodeToSymbol(byte keyHash) {
        int keycode = keyHash & 0xFF;
        if (keycode == 0)
            throw new IllegalArgumentException(new StringBuilder().append("").append(Integer.toString(keycode, 16)).toString());
        if (keycode >= 128 && keycode < 160) {
            int symbolKeyCode = StringUtils.symbolSet[keycode - 128];
            if (symbolKeyCode == 0)
                symbolKeyCode = 63;
            keycode = symbolKeyCode;
        }
        return (char) keycode;
    }

    void readValueLoop(Buffer buffer) {
        for (; ; ) {
            int opcode = buffer.readUByte();
            if (opcode == 0) {
                break;
            }
            decode(buffer, opcode);
        }
    }

    void decode(Buffer buffer, int opcode) {
        if (opcode == 1)
            symbol = keyCodeToSymbol(buffer.readByte());
    }

}
