package com.jagex;/* Class323_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.StringUtils;
import com.jagex.utils.TimeUtils;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class AwtKeyboard extends KeyRecorder implements KeyListener, FocusListener {
    static final int[] KEY_CODE_MAP = {0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static final int KEY_COUNT = 112;
    public static KeyRecorder keyboard;
    Class453 submitted = new Class453();
    boolean[] heldKeys;
    Component component;
    Class453 records = new Class453();

    AwtKeyboard(Component component) {
        this.heldKeys = new boolean[KEY_COUNT];
        adjustCodeMap();
        setComponent(component);
    }

    public static void adjustCodeMap() {
        KEY_CODE_MAP[44] = 71;
        KEY_CODE_MAP[45] = 26;
        KEY_CODE_MAP[46] = 72;
        KEY_CODE_MAP[47] = 73;
        KEY_CODE_MAP[59] = 57;
        KEY_CODE_MAP[61] = 27;
        KEY_CODE_MAP[91] = 42;
        KEY_CODE_MAP[92] = 74;
        KEY_CODE_MAP[93] = 43;
        KEY_CODE_MAP[192] = 28;
        KEY_CODE_MAP[222] = 58;
        KEY_CODE_MAP[520] = 59;
    }

    public static KeyRecorder create(Component component) {
            return new AwtKeyboard(component);
    }

    void setComponent(Component component) {
        reset();
        this.component = component;
        this.component.addKeyListener(this);
        this.component.addFocusListener(this);
    }

    void reset() {
        if (null != this.component) {
            this.component.removeKeyListener(this);
            this.component.removeFocusListener(this);
            this.component = null;
            for (int index = 0; index < 112; index++)
                this.heldKeys[index] = false;
            this.submitted.clean();
            this.records.clean();
        }
    }

    void record(int type, char character, int keycode) {
        ComponentKeyRecord componentKeyRecord = new ComponentKeyRecord();
        componentKeyRecord.type = type * -492671955;
        componentKeyRecord.character = character;
        componentKeyRecord.keycode = keycode * 666762723;
        componentKeyRecord.time = TimeUtils.getTime() * -6780259989437506341L;
        this.records.pushBack(componentKeyRecord);
    }

    public KeyRecord getNext() {
        return (KeyRecord) this.submitted.popHead();
    }

    public boolean held(int index) {
        if (index < 0 || index >= 112)
            return false;
        return this.heldKeys[index];
    }

    public void stop() {
        reset();
    }

    void record(KeyEvent keyevent, int type) {
        int code = keyevent.getKeyCode();
        if (code != 0) {
            if (code >= 0 && code < KEY_CODE_MAP.length) {
                code = KEY_CODE_MAP[code];
                if (type == 0 && 0 != (code & 0x80))
                    code = 0;
                else
                    code &= ~0x80;
            } else
                code = 0;
        } else
            code = 0;
        if (code != 0) {
            record(type, '\uffff', code);
            keyevent.consume();
        }
    }

    public synchronized void sync() {
        this.submitted.clean();
        for (ComponentKeyRecord componentKeyRecord = (ComponentKeyRecord) this.records.popHead(); null != componentKeyRecord; componentKeyRecord = (ComponentKeyRecord) this.records.popHead()) {
            componentKeyRecord.flags = getFlags() * -387842989;
            if (KeyRecord.KEY_PRESSED_TYPE == (componentKeyRecord.type * 1490207653)) {
                if (!this.heldKeys[(componentKeyRecord.keycode * 122236875)]) {
                    ComponentKeyRecord submission = new ComponentKeyRecord();
                    submission.type = 0;
                    submission.character = '\uffff';
                    submission.keycode = componentKeyRecord.keycode * 1;
                    submission.time = componentKeyRecord.time * 1L;
                    submission.flags = 1 * componentKeyRecord.flags;
                    this.submitted.pushBack(submission);
                    this.heldKeys[(componentKeyRecord.keycode * 122236875)] = true;
                }
                componentKeyRecord.type = -985343910;
                this.submitted.pushBack(componentKeyRecord);
            } else if (KeyRecord.KEY_RELEASED_TYPE == (componentKeyRecord.type * 1490207653)) {
                if (this.heldKeys[(componentKeyRecord.keycode * 122236875)]) {
                    this.submitted.pushBack(componentKeyRecord);
                    this.heldKeys[(componentKeyRecord.keycode * 122236875)] = false;
                }
            } else if ((1490207653 * componentKeyRecord.type) == -1) {
                for (int code = 0; code < 112; code++) {
                    if (this.heldKeys[code]) {
                        ComponentKeyRecord submission = new ComponentKeyRecord();
                        submission.type = -492671955;
                        submission.character = '\uffff';
                        submission.keycode = 666762723 * code;
                        submission.time = 1L * (componentKeyRecord.time);
                        submission.flags = (componentKeyRecord.flags * 1);
                        this.submitted.pushBack(submission);
                        this.heldKeys[code] = false;
                    }
                }
            } else if (KeyRecord.KEY_TYPED_TYPE == (componentKeyRecord.type * 1490207653))
                this.submitted.pushBack(componentKeyRecord);
        }
    }

    public synchronized void keyReleased(KeyEvent keyevent) {
        record(keyevent, KeyRecord.KEY_RELEASED_TYPE);
    }

    public synchronized void keyTyped(KeyEvent keyevent) {
        char keyCharacter = keyevent.getKeyChar();
        if (keyCharacter != '\uffff' && StringUtils.isSymbol(keyCharacter)) {
            record(KeyRecord.KEY_TYPED_TYPE, keyCharacter, -1);
            keyevent.consume();
        }
    }

    public void focusGained(FocusEvent focusevent) {

    }

    int getFlags() {
        int flags = 0;
        if (this.heldKeys[81])
            flags |= 0x1;
        if (this.heldKeys[82])
            flags |= 0x4;
        if (this.heldKeys[86])
            flags |= 0x2;
        return flags;
    }

    public synchronized void focusLost(FocusEvent focusevent) {
        record(-1, '\0', 0);
    }

    public synchronized void keyPressed(KeyEvent keyevent) {
        record(keyevent, KeyRecord.KEY_PRESSED_TYPE);
    }
}
