package com.jagex;/* Class383 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ClientScriptsExecutor {

    ClientScriptsExecutor() throws Throwable {
        throw new Error();
    }

    static void executeScript(CS2ScriptDefinition scriptDefinition, int limit, ScriptRuntime runtime) {
        runtime.integerStackOffset = 0;
        runtime.objectArgs = 0;
        runtime.integerPos = -286750741;
        runtime.script = scriptDefinition;
        runtime.instruction = (runtime.script.instruction);
        runtime.integerstack = (runtime.script.intOperands);
        CS2Instruction instruction = null;
        runtime.stackIndex = 0;
        try {
            try {
                Class388.iterations = 0;
                for (; ; ) {
                    Class388.iterations += -138185287;
                    if (-560594807 * Class388.iterations > limit)
                        throw new RuntimeException("");
                    instruction = (runtime.instruction[(runtime.integerPos += 286750741) * 1883543357]);
                    if (Class388.aBoolean4154 && (null == Class388.aString4155 || (null != (runtime.script.name) && (runtime.script.name.indexOf(Class388.aString4155) != -1))))
                        System.out.println(new StringBuilder().append(runtime.script.name).append(": ").append(instruction).toString());
                    runtime.currentInstrBool = (runtime.integerstack[1883543357 * runtime.integerPos]) == 1;
                    if (CS2Instruction.END_SCRIPT_INSTRUCTIONS == instruction && (runtime.stackIndex * -932179775 == 0)) {
                        StaticMethods.method531();
                        break;
                    }
                    ScriptInstructions.scriptInsturctions(instruction, runtime);
                }
            } catch (Exception exception) {
                StringBuilder stringbuilder = new StringBuilder(30);
                stringbuilder.append("").append(7051297995265073167L * (runtime.script.key)).append(" ");
                for (int i_1_ = (runtime.stackIndex * -932179775) - 1; i_1_ >= 0; i_1_--)
                    stringbuilder.append("").append(7051297995265073167L * (runtime.callStack[i_1_].script.key)).append(" ");
                stringbuilder.append("").append(Integer.valueOf(-2008816077 * instruction.opcode));
                IPAddress.reportError(stringbuilder.toString(), exception);
                StaticMethods.method531();
            }
        } catch (RuntimeException e) {
            StaticMethods.method531();
            throw e;
        }
    }

}
