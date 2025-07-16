package com.jagex;/* Class298_Sub37_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.prefetch.Js5List;

public class CS2ScriptDefinition extends Cacheable {
    public String name;
    public int objectArgs;
    public CS2Instruction[] instruction;
    public int[] intOperands;
    public long[] longOperands;
    public CS2Context aClass502_9678;
    public int maxIntLocals;
    public int maxObjectLocals;
    public int maxLongLocals;
    public int intArgs;
    public Object[] objectOperands;
    public int longArgs;
    public LinkedList[] switches;

    public CS2ScriptDefinition(Buffer buffer) {
        int signatureSize = readSignature(buffer);
        int count = 0;
        CS2Instruction[] allInstructions = CS2Instruction.getInstruction();
        while (385051775 * buffer.offset < signatureSize) {
            CS2Instruction instruction = readInstruction(buffer, allInstructions);
            deserializeOperand(buffer, count, instruction);
            count++;
        }
    }

    static CS2ScriptDefinition decodeScriptData(byte[] data) {
        return new CS2ScriptDefinition(new Buffer(data));
    }

    static CS2ScriptDefinition lookup(CS2Context context, int hash, int hash2) {
        int contextID = -1650162241 * context.id | hash << 10;
        CS2ScriptDefinition scriptDefinition = ((CS2ScriptDefinition) StaticMethods.aClass354_5218.retrieve((long) contextID << 16));
        if (null != scriptDefinition)
            return scriptDefinition;
        byte[] data = Js5List.JS5_CLIENTSCRIPTS.get(Js5List.JS5_CLIENTSCRIPTS.method2299(contextID));
        if (data != null) {
            if (data.length <= 1)
                return null;
            scriptDefinition = CS2ScriptDefinition.decodeScriptData(data);
            scriptDefinition.aClass502_9678 = context;
            StaticMethods.aClass354_5218.add(scriptDefinition, (long) contextID << 16);
            return scriptDefinition;
        }
        contextID = -1650162241 * context.id | hash2 + 65536 << 10;
        scriptDefinition = ((CS2ScriptDefinition) StaticMethods.aClass354_5218.retrieve((long) contextID << 16));
        if (null != scriptDefinition)
            return scriptDefinition;
        data = (Js5List.JS5_CLIENTSCRIPTS.get(Js5List.JS5_CLIENTSCRIPTS.method2299(contextID)));
        if (data != null) {
            if (data.length <= 1)
                return null;
            scriptDefinition = CS2ScriptDefinition.decodeScriptData(data);
            scriptDefinition.aClass502_9678 = context;
            StaticMethods.aClass354_5218.add(scriptDefinition, (long) contextID << 16);
            return scriptDefinition;
        }
        contextID = context.id * -1650162241 | 0x3fffc00;
        scriptDefinition = ((CS2ScriptDefinition) StaticMethods.aClass354_5218.retrieve((long) contextID << 16));
        if ( scriptDefinition!= null)
            return scriptDefinition;
        data = (Js5List.JS5_CLIENTSCRIPTS.get(Js5List.JS5_CLIENTSCRIPTS.method2299(contextID)));
        if (data != null) {
            if (data.length <= 1)
                return null;
            scriptDefinition = CS2ScriptDefinition.decodeScriptData(data);
            scriptDefinition.aClass502_9678 = context;
            StaticMethods.aClass354_5218.add(scriptDefinition, (long) contextID << 16);
            return scriptDefinition;
        }
        return null;
    }

    static CS2ScriptDefinition getClientScript(int scriptID) {
        try {
            CS2ScriptDefinition scriptDefinition = ((CS2ScriptDefinition) StaticMethods.aClass354_5218.retrieve((long) scriptID));
            if (scriptDefinition != null)
                return scriptDefinition;
            byte[] data = Js5List.JS5_CLIENTSCRIPTS.getFileFromArchive(scriptID, 0);
            if (data == null || data.length <= 1)
                return null;
            try {
                scriptDefinition = CS2ScriptDefinition.decodeScriptData(data);
            } catch (Exception exception) {
                exception.printStackTrace();
                return null;
            }
            StaticMethods.aClass354_5218.add(scriptDefinition, (long) scriptID);
            return scriptDefinition;
        } catch (RuntimeException runtimeexception) {
            runtimeexception.printStackTrace();
            throw ErrorReporter.generateReport(runtimeexception, "Error loading script: " + scriptID);
        }
    }

    int readSignature(Buffer buffer) {
        try {
            buffer.offset = 116413311 * (buffer.buffer.length - 2);
            int switchBlocksSize = buffer.readUShort();
            int headerOffset = buffer.buffer.length - 2 - switchBlocksSize - 16;
            buffer.offset = headerOffset * 116413311;
            int instrCount = buffer.readInt();
            maxIntLocals = buffer.readUShort() * 1835188737;
            maxObjectLocals = buffer.readUShort() * 906205405;
            maxLongLocals = buffer.readUShort() * 229244435;
            intArgs = buffer.readUShort() * 1421877143;
            objectArgs = buffer.readUShort() * -479946185;
            longArgs = buffer.readUShort() * 896501837;
            int numSwitchBlocks = buffer.readUByte();
            if (numSwitchBlocks > 0) {
                switches = new LinkedList[numSwitchBlocks];
                for (int index = 0; index < numSwitchBlocks; index++) {
                    int caseCount = buffer.readUShort();
                    LinkedList map = new LinkedList(LinkedList.getNextBitValue(caseCount));
                    switches[index] = map;
                    while (caseCount-- > 0) {
                        int target = buffer.readInt();
                        int case_ = buffer.readInt();
                        map.connect(new IntNode(case_), (long) target);
                    }
                }
            }
            buffer.offset = 0;
            name = buffer.readNullString();
            instruction = new CS2Instruction[instrCount];
            return headerOffset;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, "Error reading script header");
        }
    }

    CS2Instruction readInstruction(Buffer buffer, CS2Instruction[] instructions) {
        try {
            int opcode = buffer.readUShort();
            if (opcode < 0 || opcode >= instructions.length)
                throw new RuntimeException("Invalid opcode: " + opcode);
            CS2Instruction instruction = instructions[opcode];
            return instruction;
        } catch (RuntimeException runtimeexception) {
            runtimeexception.printStackTrace();
            return null;
        }
    }

    void deserializeOperand(Buffer buffer, int opcode, CS2Instruction instruction) {
        int instructionSize = this.instruction.length;
        if (instruction == CS2Instruction.PUSH_STR) {
            if (objectOperands == null)
                objectOperands = new Object[instructionSize];
            String string = buffer.readString();
            if (string.toLowerCase().contains("runescape")) {
                string = string.replace("runescape", "vengium");
                string = string.replace("RuneScape", "Vengium");
                string = string.replace("Runescape", "Vengium");
            }
            if (string.contains("display mode")) {
                System.out.println(buffer);
            }
            objectOperands[opcode] = string.intern();
        } else if (CS2Instruction.PUSH_OR_STORE_VAR_BIT == instruction) {
            if (null == longOperands)
                longOperands = new long[instructionSize];
            longOperands[opcode] = buffer.readLong();
        } else {
            if (intOperands == null)
                intOperands = new int[instructionSize];
            if (instruction.isBigOp)
                intOperands[opcode] = buffer.readInt();
            else
                intOperands[opcode] = buffer.readUByte();
        }
        this.instruction[opcode] = instruction;
    }
}
