package com.jagex;

import com.jagex.game.cache.config.Js5Configs;
import com.jagex.game.cache.definition.widget.modes.HResizeMode;
import com.jagex.game.cache.definition.widget.modes.VResizeMode;
import com.jagex.network.OutgoingPacket;

/**
 * Created by Krimsonowl on 7/11/2017.
 */
public class ToMoveIComponentScripts {
    static final void method3801(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition class105 = IComponentScripter.componentDefinition;
        if (null == class105.opBase)
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = "";
        else
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = class105.opBase;
    }

    static final void method3802(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        componentDefinition.layerWidth = (-1609060375 * (runtime.integerStack[runtime.integerStackOffset * 681479919]));
        componentDefinition.maxScrollVertical = (-1638942269 * (runtime.integerStack[1 + 681479919 * runtime.integerStackOffset]));
        StaticMethods.updateComponentTick(componentDefinition);
        if (componentDefinition.type * -1215239439 == IComponentDefinition.CONTAINER)
            Class65.method761(IComponentDefinitionCollection, componentDefinition, false);
    }

    static final void method3803(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        method6177(componentDefinition, runtime);
    }

    static final void method1478(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        method4292(componentDefinition, runtime);
    }

    static final void method1479(ScriptRuntime runtime) {
        int interfaceID = runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)];
        if (IComponentDefinition.getIComponentDefinitionCollections[interfaceID] == null)
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = "";
        else {
            String string = (IComponentDefinition.getIComponentDefinitionCollections[interfaceID].componentDefinitions[0].aString1259);
            System.out.println("INSTRUCTION METHOD1479: " + string);
            if (null == string)
                runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = "";
            else
                runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = string.substring(0, string.indexOf(':'));
        }
    }

    static final void method1583(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition component = IComponentScripter.componentDefinition;
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
        Class377.method4665(component, IComponentDefinitionCollection, runtime);
    }

    static final void method2078(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition component = IComponentDefinition.getInterfaceComponent(interfaceHash);
        method912(component, runtime);
    }

    static final void method2079(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition component = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        Class465.method6018(component, IComponentDefinitionCollection, runtime, 1442704062);
    }

    static final void method2083(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition component = IComponentScripter.componentDefinition;
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
        method337(component, IComponentDefinitionCollection, runtime);
    }

    static final void method4885(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition component = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        method2461(component, IComponentDefinitionCollection, runtime);
    }

    static final void method4402(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(interfaceHash);
        method2323(class105, runtime);
    }

    static final void method3683(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition component = IComponentScripter.componentDefinition;
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
        method3850(component, IComponentDefinitionCollection, runtime);
    }

    static final void method3684(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        method5664(componentDefinition, runtime);
    }

    static final void method6315(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
        componentDefinition.shadow = (runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]) * -1448553585;
        StaticMethods.updateComponentTick(componentDefinition);
    }

    static final void setRightClipOptionString(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
        int optionIDX = ((runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]) - 1);
        if (optionIDX < 0 || optionIDX > 9)
            runtime.objectArgs -= 969361751;
        else
            componentDefinition.setRightClipOptionString(optionIDX, (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]));
    }

    static final void setRightClickOptionCursor(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
        int cursorID = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        int optionIDX = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        if (optionIDX >= 1 && optionIDX <= 10)
            componentDefinition.setRightClickOptionCursor(optionIDX - 1, cursorID);
    }

    static final void method1907(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
        method4854(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method1889(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(interfaceHash);
        ToMoveScripts.method4606(class105, runtime);
    }

    static final void method1890(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
        String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
        if (Class298_Sub6.method2863(string, runtime) != null)
            string = string.substring(0, string.length() - 1);
        componentDefinition.onMouseOverHook = Class128_Sub2.method1441(string, runtime);
        componentDefinition.hasScript = true;
    }

    static final void SET_DRAG_DEADZONE(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
        componentDefinition.dragDeadZone = (runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]) * 476443207;
    }

    static final void method1776(boolean bool, ScriptRuntime r) {
        IComponentScripter IComponentScripter = (r.currentInstrBool ? r.aIComponentScripter_5247 : r.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
        if (bool)
            Class131.method1470(IComponentDefinitionCollection, componentDefinition, -1270501871);
        else
            Class53.method599(IComponentDefinitionCollection, componentDefinition, (byte) -3);
    }

    static final void method3419(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        if (-1 != -1232467723 * componentDefinition.itemID)
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -66163287 * componentDefinition.itemQuantity;
        else
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
    }

    static final void method5591(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        method310(componentDefinition, runtime);
    }

    static final void method4893(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = componentDefinition.xOffset * -407676483;
    }

    static final void method4895(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = 684246511 * componentDefinition.anInt1166;
    }

    static final void method4137(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition interfaceComponent = IComponentDefinition.getInterfaceComponent(interfaceHash);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = -749038817 * interfaceComponent.y;
    }

    static final void method2230(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
        componentDefinition.toolTip = (String) (runtime.objectStack[((runtime.objectArgs -= 969361751) * -203050393)]);
    }

    static final void method4138(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = componentDefinition.transparency * -1993792969;
    }

    static final void method2323(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        componentDefinition.originX = (runtime.integerStack[runtime.integerStackOffset * 681479919]) * 437213185;
        componentDefinition.originY = (1266800241 * (runtime.integerStack[681479919 * runtime.integerStackOffset + 1]));
        StaticMethods.updateComponentTick(componentDefinition);
    }

    static final void method1283(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
        Class298_Sub32_Sub34.method3364(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    public static void sendDialogueContinuePacket(int interfaceHash, int dynamicChildIndex) {
        OutgoingPacketBuffer outgoingPacketBuffer = Class18.method359(OutgoingPacket.DIALOGUE_CONTINUE_PACKET, ConnectionType.gameConnection.encryptor);
        outgoingPacketBuffer.payload.writeInt(interfaceHash);
        outgoingPacketBuffer.payload.writeShort128(dynamicChildIndex);
        ConnectionType.gameConnection.sendFrame(outgoingPacketBuffer);
    }

    static final void RESET_HOOKS(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        Class365_Sub1_Sub3_Sub1.resetHooks(componentDefinition);
    }

    static final void method3829(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        StaticMethods.method1298(componentDefinition, IComponentDefinitionCollection);
    }

    static final void method947(ScriptRuntime scriptRuntime) {
        int interfaceHash = (scriptRuntime.integerStack[((scriptRuntime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        GameMap.method2677(componentDefinition, IComponentDefinitionCollection, scriptRuntime);
    }

    static final void method950(ScriptRuntime runtime) {
        IComponentScripter widget = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = widget.componentDefinition;
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = componentDefinition.fontID * 1508815983;
    }

    static final void method951(ScriptRuntime runtime) {
        IComponentDefinition componentDefinition = (runtime.entity.IComponentDefinitionCollection.componentWithinInterface((runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)])));
        componentDefinition.sada = null;
        componentDefinition.containedComponents = null;
        StaticMethods.updateComponentTick(componentDefinition);
    }

    static final void method590(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
        method821(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method588(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        Class377.method4665(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method5698(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
        method730(componentDefinition, runtime);
    }

    static final void method2129(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
        Class363.method4314(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method821(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
        int i_8_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        if (i_8_ != componentDefinition.animId * 1347982601) {
            if (-1 != i_8_) {
                if (null == componentDefinition.animator)
                    componentDefinition.animator = new SimpleAnimation();
                componentDefinition.animator.load(i_8_);
            } else
                componentDefinition.animator = null;
            componentDefinition.animId = 1587382585 * i_8_;
            StaticMethods.updateComponentTick(componentDefinition);
        }
        if (-1 == -1309843523 * componentDefinition.slot && !IComponentDefinitionCollection.accessed)
            IComponentUpdateNode.appendAnimationUpdate( componentDefinition.interfaceHash);
    }

    static final void method819(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        SET_RESIZE_MODES(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method820(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        method4887(componentDefinition, runtime);
    }

    static final void method3399(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        Class298_Sub32_Sub34.method3364(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method5896(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
        GameMap.method2677(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method6145(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        method2696(componentDefinition, runtime);
    }

    static final void method6146(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        Class436.method5805(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static void method4291(IComponentDefinitionCollection IComponentDefinitionCollection, int componentID, int type, int dynamicChildIndex, boolean currentInstrBool, ScriptRuntime runtime) {
        if (type == 0)
            throw new RuntimeException();
        IComponentDefinition originalComponent = IComponentDefinitionCollection.componentDefinitions[componentID];
        if (null == originalComponent.sada) {
            originalComponent.sada = new IComponentDefinition[dynamicChildIndex + 1];
            originalComponent.containedComponents = originalComponent.sada;
        }
        if (originalComponent.sada.length <= dynamicChildIndex) {
            if (originalComponent.containedComponents == originalComponent.sada) {
                IComponentDefinition[] class105s = new IComponentDefinition[1 + dynamicChildIndex];
                for (int childIndex = 0; childIndex < originalComponent.sada.length; childIndex++)
                    class105s[childIndex] = originalComponent.sada[childIndex];
                originalComponent.sada = originalComponent.containedComponents = class105s;
            } else {
                IComponentDefinition[] class105s = new IComponentDefinition[1 + dynamicChildIndex];
                IComponentDefinition[] class105s_9_ = new IComponentDefinition[1 + dynamicChildIndex];
                for (int i_10_ = 0; i_10_ < originalComponent.sada.length; i_10_++) {
                    class105s[i_10_] = originalComponent.sada[i_10_];
                    class105s_9_[i_10_] = originalComponent.containedComponents[i_10_];
                }
                originalComponent.sada = class105s;
                originalComponent.containedComponents = class105s_9_;
            }
        }
        if (dynamicChildIndex > 0 && null == originalComponent.sada[dynamicChildIndex - 1])
            throw new RuntimeException(new StringBuilder().append("").append(dynamicChildIndex - 1).toString());
        IComponentDefinition defaultComponent = new IComponentDefinition();
        defaultComponent.type = type * -800405999;
        defaultComponent.parentID = (defaultComponent.interfaceHash = originalComponent.interfaceHash);
        defaultComponent.slot = dynamicChildIndex * -263105643;
        originalComponent.sada[dynamicChildIndex] = defaultComponent;
        if (originalComponent.containedComponents != originalComponent.sada)
            originalComponent.containedComponents[dynamicChildIndex] = defaultComponent;
        IComponentScripter IComponentScripter;
        if (currentInstrBool)
            IComponentScripter = runtime.aIComponentScripter_5247;
        else
            IComponentScripter = runtime.aIComponentScripter_5246;
        IComponentScripter.IComponentDefinitionCollection = IComponentDefinitionCollection;
        IComponentScripter.componentDefinition = defaultComponent;
        StaticMethods.updateComponentTick(originalComponent);
    }

    static final void method4292(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
        String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
        if (Class298_Sub6.method2863(string, runtime) != null)
            string = string.substring(0, string.length() - 1);
        componentDefinition.anObjectArray1270 = Class128_Sub2.method1441(string, runtime);
        componentDefinition.hasScript = true;
    }

    static final void method3947(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
        if (componentDefinition.type * -1215239439 == IComponentDefinition.TEXT)
            Class165.method1781(componentDefinition, IComponentDefinitionCollection, runtime, (short) 8629);
    }

    static final void method5952(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246;
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        GameDefaults.method4582(componentDefinition, runtime);
    }

    static final void method3526(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        setRightClipOptionString(componentDefinition, runtime);
    }

    static final void setIComponentFontID(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
        componentDefinition.fontID = (runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]) * -2074006897;
        StaticMethods.updateComponentTick(componentDefinition);
        if (-1 == componentDefinition.slot * -1309843523 && !IComponentDefinitionCollection.accessed)
            IComponentUpdateNode.appendFontIDUpdate(componentDefinition.interfaceHash );
    }

    static final void method4166(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        set2DAngle(componentDefinition, runtime);
    }

    static final void method4167(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        setRightClickOptionCursor(componentDefinition, runtime);
    }

    static final void method4169(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        Class372_Sub1.method4597(componentDefinition, runtime);
    }

    static final void method4943(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition class105 = IComponentScripter.componentDefinition;
        SET_DRAG_DEADTIME(class105, runtime);
    }

    static final void method538(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition class105 = IComponentScripter.componentDefinition;
        setRightClipOptionString(class105, runtime);
    }

    static final void method4854(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
        componentDefinition.fontMonochrome = (runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]) == 1;
        StaticMethods.updateComponentTick(componentDefinition);
        if (-1 == -1309843523 * componentDefinition.slot && !IComponentDefinitionCollection.accessed)
            IComponentUpdateNode.appendFontMonocrhomeUpdate( componentDefinition.interfaceHash);
    }

    static final void method1444(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        method5887(componentDefinition, runtime);
    }

    static final void method4973(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        componentDefinition.anInt1158 = (runtime.integerStack[runtime.integerStackOffset * 681479919]) * 349940087;
        componentDefinition.anInt1242 = ((runtime.integerStack[1 + 681479919 * runtime.integerStackOffset]) * 153098785);
        StaticMethods.updateComponentTick(componentDefinition);
        IComponentDefinition.updateShapeModes(IComponentDefinitionCollection, componentDefinition);
        if (0 == -1215239439 * componentDefinition.type)
            Class65.method761(IComponentDefinitionCollection, componentDefinition, false);
    }

    static final void method5722(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
        if (-300634099 * runtime.anInt5254 >= 10)
            throw new RuntimeException();
        if (componentDefinition.anObjectArray1164 != null) {
            ScriptNode scriptNode = new ScriptNode();
            scriptNode.aClass105_7525 = componentDefinition;
            scriptNode.parameters = componentDefinition.anObjectArray1164;
            scriptNode.anInt7524 = (1954090355 * runtime.anInt5254 + -171453569);
            GameClient.aClass453_8893.pushBack(scriptNode);
        }
    }

    static final void method5668(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
        String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
        if (Class298_Sub6.method2863(string, runtime) != null)
            string = string.substring(0, string.length() - 1);
        componentDefinition.onScrollWheelHook = Class128_Sub2.method1441(string, runtime);
        componentDefinition.hasScript = true;
    }

    static final void method5664(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
        String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
        if (Class298_Sub6.method2863(string, runtime) != null)
            string = string.substring(0, string.length() - 1);
        componentDefinition.anObjectArray1277 = Class128_Sub2.method1441(string, runtime);
        componentDefinition.hasScript = true;
    }

    static final void method1260(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(interfaceHash);
        method5668(class105, runtime);
    }

    static final void method1262(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        Class472.method6065(class105, IComponentDefinitionCollection, runtime, 788007280);
    }

    static final void method5991(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        method4973(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method6360(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinition.eraseChooseOptions(componentDefinition);
    }

    static final void method6361(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        method1397(componentDefinition, runtime);
    }

    static final void method2493(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        int componentID = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
        IComponentScripter IComponentScripter;
        if (runtime.currentInstrBool)
            IComponentScripter = runtime.aIComponentScripter_5247;
        else
            IComponentScripter = runtime.aIComponentScripter_5246;
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = IComponentScripter.clearComponent((runtime.entity.IComponentDefinitionCollection), componentID) ? 1 : 0;
    }

    static final void method2495(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
        method365(componentDefinition, IComponentDefinitionCollection, false, 2, runtime);
    }

    static final void method2498(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        IComponentDefinition.eraseChooseOptions(componentDefinition);
    }

    static final void method6266(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        runtime.integerStackOffset -= -783761378;
        int i_83_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
        int i_84_ = (runtime.integerStack[1 + 681479919 * runtime.integerStackOffset]);
        Class497 class497 = Class92.aClass504_905.get(i_83_);
        if (i_84_ != class497.size * -388931549)
            componentDefinition.method1125(i_83_, i_84_);
        else
            componentDefinition.method1123(i_83_);
    }

    static final void method1068(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = 2053897963 * componentDefinition.maxScrollVertical;
    }

    static final void method3150(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        Class301_Sub1.method3712(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method310(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
        String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
        int[] is = Class298_Sub6.method2863(string, runtime);
        if (null != is)
            string = string.substring(0, string.length() - 1);
        componentDefinition.onVarcStrTransmitHook = Class128_Sub2.method1441(string, runtime);
        componentDefinition.varcstrTransmitList = is;
        componentDefinition.hasScript = true;
    }

    static final void method782(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
        String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
        if (Class298_Sub6.method2863(string, runtime) != null)
            string = string.substring(0, string.length() - 1);
        componentDefinition.anObjectArray1250 = Class128_Sub2.method1441(string, runtime);
        componentDefinition.hasScript = true;
    }

    static final void method3972(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        method365(componentDefinition, IComponentDefinitionCollection, true, 1, runtime);
    }

    static final void method1302(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        Class410.method4981(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method4872(ScriptRuntime runtime) {
        int interfaceID = runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919];
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceID);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = componentDefinition.yAngle * -1086526073;
    }

    static final void method1131(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
        Class321.method3925(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method5803(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentScripter IComponentScripter;
        if (runtime.currentInstrBool)
            IComponentScripter = runtime.aIComponentScripter_5247;
        else
            IComponentScripter = runtime.aIComponentScripter_5246;
        runtime.integerStack[(runtime.integerStackOffset += -391880689) * 681479919 - 1] = IComponentScripter.containerComponentExists(interfaceHash, -1) ? 1 : 0;
    }

    static final void method3654(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        method4887(componentDefinition, runtime);
    }

    static final void method391(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        Class241.method2247(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method4887(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
        componentDefinition.filled = runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919] == 1;
        StaticMethods.updateComponentTick(componentDefinition);
    }

    static final void method873(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        Class298_Sub39.method3507(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method5887(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
        runtime.integerStackOffset -= -1175642067;
        int optionsLength = ((runtime.integerStack[runtime.integerStackOffset * 681479919]) - 1);
        int i_23_ = (runtime.integerStack[681479919 * runtime.integerStackOffset + 1]);
        int i_24_ = (runtime.integerStack[2 + 681479919 * runtime.integerStackOffset]);
        if (optionsLength < 0 || optionsLength > 9)
            throw new RuntimeException();
        Class127.method1423(componentDefinition, optionsLength, i_23_, i_24_);
    }

    static final void method3545(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        Class321.method3925(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method6277(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        SET_DRAG_DEADTIME(componentDefinition, runtime);
    }

    static final void method4700(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
        Class436.method5805(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method4695(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        method6157(componentDefinition, runtime);
    }

    static final void method4180(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
        method6157(componentDefinition, runtime);
    }

    static final void method4181(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        Js5ArchiveEnum.method1235(componentDefinition, runtime);
    }

    static final void method6301(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        Class240_Sub1.method2244(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method6303(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = componentDefinition.fontID * 1508815983;
    }

    static final void method3911(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        Class257.method2451(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method2110(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition class105 = IComponentScripter.componentDefinition;
        SET_DRAG_RENDER_BEHAVIOR(class105, runtime);
    }

    static final void method1909(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
        IComponentDefinition componentDefinition1 = IComponentDefinition.method6331(IComponentDefinitionCollection, componentDefinition);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (null == componentDefinition1 ? -1 : componentDefinition1.interfaceHash );
    }

    static final void getComponentLineWidth(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        getLineWidth(componentDefinition, runtime);
    }

    static final void method1397(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
        String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
        if (Class298_Sub6.method2863(string, runtime) != null)
            string = string.substring(0, string.length() - 1);
        componentDefinition.anObjectArray1275 = Class128_Sub2.method1441(string, runtime);
        componentDefinition.hasScript = true;
    }

    static final void method786(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        method365(componentDefinition, IComponentDefinitionCollection, true, 2, runtime);
    }

    static final void method5193(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        method5887(componentDefinition, runtime);
    }

    static final void method2046(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = 1508815983 * componentDefinition.fontID;
    }

    static final void method2048(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393 - 1)] = componentDefinition.text;
    }

    static final void method6010(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        method821(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method6008(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
        Class225.method2102(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method4297(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        int interfaceHash = runtime.integerStack[681479919 * runtime.integerStackOffset];
        int slot = runtime.integerStack[1 + runtime.integerStackOffset * 681479919];
        IComponentScripter IComponentScripter;
        if (runtime.currentInstrBool)
            IComponentScripter = runtime.aIComponentScripter_5247;
        else
            IComponentScripter = runtime.aIComponentScripter_5246;
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (slot != -1 && IComponentScripter.containerComponentExists(interfaceHash, slot) ? 1 : 0);
    }

    static final void method4298(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        method365(componentDefinition, IComponentDefinitionCollection, false, 2, runtime);
    }

    static final void method4299(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
        Class298_Sub39.method3507(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method1248(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        Class298_Sub33.method3396(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method1249(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        Class356.method4270(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method1250(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = -1424956747 * componentDefinition.anInt1167;
    }

    static final void method6106(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        Class116.method1271(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method6107(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        Class298_Sub14.method2907(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method1241(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        method1419(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method2106(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = 1508815983 * componentDefinition.fontID;
    }

    static final void method4861(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
        method1699(componentDefinition, runtime);
    }

    static final void method4862(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
        componentDefinition.noClickThrough = (runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]) == 1;
    }

    static final void method2394(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        method5664(componentDefinition, runtime);
    }

    static final void SET_RESIZE_MODES(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
        runtime.integerStackOffset -= -1567522756;
        componentDefinition.width = -478399925 * (runtime.integerStack[runtime.integerStackOffset * 681479919]);
        componentDefinition.height = (-1661995333 * (runtime.integerStack[1 + 681479919 * runtime.integerStackOffset]));
        componentDefinition.viewportWidth = 0;
        componentDefinition.viewportHeight = 0;
        int hResizeMode = (runtime.integerStack[681479919 * runtime.integerStackOffset + 2]);
        if (hResizeMode < 0)
            hResizeMode = HResizeMode.DEFAULT;
        else if (hResizeMode > 4)
            hResizeMode = 4;
        int vResizeMode = (runtime.integerStack[681479919 * runtime.integerStackOffset + 3]);
        if (vResizeMode < 0)
            vResizeMode = VResizeMode.DEFAULT;
        else if (vResizeMode > 4)
            vResizeMode = 4;
        componentDefinition.hReizeMode = (byte) hResizeMode;
        componentDefinition.vResizeMode = (byte) vResizeMode;
        StaticMethods.updateComponentTick(componentDefinition);
        IComponentDefinition.updateShapeModes(IComponentDefinitionCollection, componentDefinition);
        if (componentDefinition.type * -1215239439 == IComponentDefinition.CONTAINER)
            Class65.method761(IComponentDefinitionCollection, componentDefinition, false);
    }

    static final void method6002(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        Class308_Sub1.method3786(componentDefinition, runtime);
    }

    static final void method4164(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        method4862(componentDefinition, runtime);
    }

    static final void method5798(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        Class298_Sub45.method3533(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method969(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        Class298_Sub32_Sub5.method3174(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method2118(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        method3947(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method2115(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
        method1595(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method2438(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
        Class499.method6218(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method1886(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = -1086526073 * componentDefinition.yAngle;
    }

    static final void method1887(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        method310(componentDefinition, runtime);
    }

    static final void method5865(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
        String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
        if (Class298_Sub6.method2863(string, runtime) != null)
            string = string.substring(0, string.length() - 1);
        componentDefinition.onHoldHook = Class128_Sub2.method1441(string, runtime);
        componentDefinition.hasScript = true;
    }

    static final void setModelZoom(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
        componentDefinition.zoom = (runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]) * -1066050969;
        StaticMethods.updateComponentTick(componentDefinition);
        if (-1 == componentDefinition.slot * -1309843523 && !IComponentDefinitionCollection.accessed)
            IComponentUpdateNode.appendModelRotationUpdate(componentDefinition.interfaceHash );
    }

    static final void method1932(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
        setModelZoom(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method1929(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = componentDefinition.slot * -1309843523;
    }

    static final void method2696(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        int i_25_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
        int i_26_ = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]);
        Class497 class497 = Class92.aClass504_905.get(i_25_);
        if (class497.size * -388931549 != i_26_)
            componentDefinition.method1125(i_25_, i_26_);
        else
            componentDefinition.method1123(i_25_);
    }

    static final void method2694(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
        int i_23_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        int i_24_ = ((runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]) - 1);
        if (componentDefinition.modelType * 1548853569 != 6 && 2 != componentDefinition.modelType * 1548853569)
            throw new RuntimeException("");
        NPCDefinition npcDefinition = NPCDefinitionLoader.npcList.load(componentDefinition.modelID * 572201537);
        if (componentDefinition.aClass498_1307 == null)
            componentDefinition.aClass498_1307 = new Class498(npcDefinition, 1548853569 * componentDefinition.modelType == 6);
        componentDefinition.aClass498_1307.aLong6110 = StaticMethods.method4686() * 3177550440302969639L;
        if (null == npcDefinition.recolorToReplace || i_24_ < 0 || i_24_ >= npcDefinition.recolorToReplace.length)
            throw new RuntimeException("");
        componentDefinition.aClass498_1307.aShortArray6109[i_24_] = (short) i_23_;
        StaticMethods.updateComponentTick(componentDefinition);
    }

    static final void method2693(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = componentDefinition.aspectWidth * -2093041337;
    }

    static final void method1141(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        method2696(componentDefinition, runtime);
    }

    static final void getModelZoom(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = componentDefinition.zoom * -261021353;
    }

    static final void method2903(ScriptRuntime class403) {
        method1138(class403);
    }

    static final void method1138(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        int key = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
        int interfaceID = (runtime.integerStack[1 + runtime.integerStackOffset * 681479919]);
        Widget widget = ((Widget) GameClient.linkedList.get((long) key));
        if (null != widget && widget.interfaceID * -1617025021 == interfaceID)
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 1;
        else
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
    }

    static final void method1404(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        Class499.method6218(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method6095(ScriptRuntime runtime) {
        StaticMethods.method3401(0, 0, (GameClient.currentSceneComponent.aspectWidth * -2093041337), (GameClient.currentSceneComponent.aspectHeight * 457937409), false);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = -505673857 * GameClient.anInt8664;
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = 1387083365 * GameClient.anInt8939;
    }

    static final void method3850(IComponentDefinition component, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
        runtime.integerStackOffset -= -1567522756;
        component.modelID = (-1825442367 * (runtime.integerStack[681479919 * runtime.integerStackOffset]));
        component.hashcode = ((runtime.integerStack[1 + runtime.integerStackOffset * 681479919]) * 908204397);
        if (1 == (runtime.integerStack[681479919 * runtime.integerStackOffset + 2]))
            component.modelType = -886348599;
        else
            component.modelType = 643790344;
        component.hasAppearance = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 3]) == 1;
        if (-1 == component.slot * -1309843523 && !IComponentDefinitionCollection.accessed)
            IComponentUpdateNode.appendModelTypeUpdate(component.interfaceHash );
    }

    static final void method3852(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >>> 16];
        IComponentDefinition class105_8_ = IComponentDefinition.method6331(IComponentDefinitionCollection, componentDefinition);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (class105_8_ == null ? -1 :  class105_8_.interfaceHash);
    }

    static final void method3967(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        SET_DRAG_RENDER_BEHAVIOR(componentDefinition, runtime);
    }

    static final void method3964(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = 1004185785 * componentDefinition.zAngle;
    }

    static final void SET_DRAG_RENDER_BEHAVIOR(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
        int dragRenderBehavior = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        if (dragRenderBehavior == 270446479 * IComponentDefinition.anInt1266 || -1179480373 * IComponentDefinition.anInt1119 == dragRenderBehavior || 1432814379 * IComponentDefinition.anInt1206 == dragRenderBehavior)
            componentDefinition.dragRenderBehavior = dragRenderBehavior * 2138287179;
    }

    static final void method4335(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
        Class522.method6326(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method768(ScriptRuntime runtime) {
        ToMoveScripts.method1135((runtime.entity), runtime);
    }

    static final void method766(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = componentDefinition.hidden ? 1 : 0;
    }

    static final void method765(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        method730(componentDefinition, runtime);
    }

    static final void getLineWidth(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
        componentDefinition.lineWidth = (runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]) * -1041514725;
        StaticMethods.updateComponentTick(componentDefinition);
    }

    static final void method912(IComponentDefinition component, ScriptRuntime runtime) {
        runtime.integerStackOffset -= -1567522756;
        component.anInt1283 = (runtime.integerStack[runtime.integerStackOffset * 681479919]) * -153142767;
        component.anInt1304 = (395465607 * (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]));
        component.anInt1202 = ((runtime.integerStack[681479919 * runtime.integerStackOffset + 2]) * -754385805);
        component.anInt1176 = (654211863 * (runtime.integerStack[3 + 681479919 * runtime.integerStackOffset]));
        StaticMethods.updateComponentTick(component);
    }

    static final void method343(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        method851(componentDefinition, runtime);
    }

    static final void method1550(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        setFlippedHorizontal(componentDefinition, runtime);
    }

    static final void method2202(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -1175642067;
        int interfaceHash = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
        int type = (runtime.integerStack[681479919 * runtime.integerStackOffset + 1]);
        int childIndex = (runtime.integerStack[2 + 681479919 * runtime.integerStackOffset]);
        IComponentDefinition.getInterfaceComponent(interfaceHash);
        method4291(IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >>> 16], interfaceHash & 0xFFFF, type, childIndex, runtime.currentInstrBool, runtime);
    }

    static final void method6177(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
        int i_8_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        int i_9_ = ((runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]) - 1);
        if (6 != 1548853569 * componentDefinition.modelType && componentDefinition.modelType * 1548853569 != 2)
            throw new RuntimeException("");
        NPCDefinition npcDefinition = NPCDefinitionLoader.npcList.load(componentDefinition.modelID * 572201537);
        if (null == componentDefinition.aClass498_1307)
            componentDefinition.aClass498_1307 = new Class498(npcDefinition, componentDefinition.modelType * 1548853569 == 6);
        componentDefinition.aClass498_1307.aLong6110 = StaticMethods.method4686() * 3177550440302969639L;
        if (npcDefinition.retextureToReplace == null || i_9_ < 0 || i_9_ >= npcDefinition.retextureToReplace.length)
            throw new RuntimeException("");
        componentDefinition.aClass498_1307.aShortArray6107[i_9_] = (short) i_8_;
        StaticMethods.updateComponentTick(componentDefinition);
    }

    static final void method1035(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
        method365(componentDefinition, IComponentDefinitionCollection, true, 1, runtime);
    }

    static final void method1031(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition class105 = IComponentScripter.componentDefinition;
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = 840270937 * class105.angle2D;
    }

    static final void method2725(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
        Class225.method2101(componentDefinition, IComponentDefinitionCollection, runtime, -1329146498);
    }

    static final void method2726(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        method6177(componentDefinition, runtime);
    }

    static final void method2728(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
        String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
        if (!string.equals(componentDefinition.text)) {
            componentDefinition.text = string;
            StaticMethods.updateComponentTick(componentDefinition);
        }
        if (-1 == componentDefinition.slot * -1309843523 && !IComponentDefinitionCollection.accessed)
            IComponentUpdateNode.appendTextUpdate( componentDefinition.interfaceHash);
    }

    static final void method2724(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        method2536(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method4488(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        method714(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void setIComponentHiddenInstruction(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
        boolean hidden = ((runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]) == 1);
        if (componentDefinition.hidden != hidden) {
            componentDefinition.hidden = hidden;
            StaticMethods.updateComponentTick(componentDefinition);
        }
        if (-1 == -1309843523 * componentDefinition.slot && !IComponentDefinitionCollection.accessed)
            IComponentUpdateNode.appendHideUpdate( componentDefinition.interfaceHash);
    }

    static final void method4891(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
        componentDefinition.modelType = 1234689410;
        componentDefinition.aClass498_1307 = null;
        componentDefinition.modelID = (runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]) * -1825442367;
        if (componentDefinition.slot * -1309843523 == -1 && !IComponentDefinitionCollection.accessed)
            IComponentUpdateNode.appendModelTypeUpdate(componentDefinition.interfaceHash );
    }

    static final void method714(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
        runtime.integerStackOffset -= -1175642067;
        int i_22_ = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
        short i_23_ = (short) (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]);
        short i_24_ = (short) (runtime.integerStack[runtime.integerStackOffset * 681479919 + 2]);
        if (i_22_ >= 0 && i_22_ < 5) {
            componentDefinition.method1126(i_22_, i_23_, i_24_);
            StaticMethods.updateComponentTick(componentDefinition);
            if (componentDefinition.slot * -1309843523 == -1 && !IComponentDefinitionCollection.accessed)
                IComponentUpdateNode.method5862(componentDefinition.interfaceHash , i_22_);
        }
    }

    static final void method711(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        Js5ArchiveEnum.method1235(componentDefinition, runtime);
    }

    static final void method2461(IComponentDefinition component, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
        runtime.integerStackOffset -= -1175642067;
        int i_2_ = (runtime.integerStack[runtime.integerStackOffset * 681479919]);
        short i_3_ = (short) (runtime.integerStack[1 + 681479919 * runtime.integerStackOffset]);
        short i_4_ = (short) (runtime.integerStack[2 + 681479919 * runtime.integerStackOffset]);
        if (i_2_ >= 0 && i_2_ < 5) {
            component.method1120(i_2_, i_3_, i_4_);
            StaticMethods.updateComponentTick(component);
            if (component.slot * -1309843523 == -1 && !IComponentDefinitionCollection.accessed)
                IComponentUpdateNode.method958( component.interfaceHash, i_2_);
        }
    }

    static final void method2459(ScriptRuntime runtime) {
        try {
            int i_1_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            Class343_Sub1 class343_sub1 = StaticMethods.method2105(i_1_);
            if (null != class343_sub1) {
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -877023375 * class343_sub1.anInt3670;
                runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = class343_sub1.aString7719;
                Class353 class353 = class343_sub1.method4163();
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = class353.anInt3820 * 1675394033;
                runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = class353.aString3819;
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = class343_sub1.anInt3666 * -945794709;
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 512449113 * class343_sub1.address;
                runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = class343_sub1.aString7718;
            } else {
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = -1;
                runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = "";
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
                runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = "";
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
                runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919) - 1] = 0;
                runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = "";
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kw.alq(").append(')').toString());
        }
    }

    static final void method2458(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        method2317(componentDefinition, runtime);
    }

    static final void method1435(boolean bool, ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        if (bool)
            Class131.method1470(IComponentDefinitionCollection, componentDefinition, -1270501871);
        else
            Class53.method599(IComponentDefinitionCollection, componentDefinition, (byte) -21);
    }

    static final void method1436(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
        componentDefinition.clickable = (runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]) == 1;
        StaticMethods.updateComponentTick(componentDefinition);
        if (-1 == componentDefinition.slot * -1309843523 && !IComponentDefinitionCollection.accessed)
            IComponentUpdateNode.appendClickableUpdate(componentDefinition.interfaceHash );
    }

    static final void method2536(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        componentDefinition.anInt1166 = -970389233 * (runtime.integerStack[681479919 * runtime.integerStackOffset]);
        if (componentDefinition.anInt1166 * 684246511 > (1867913305 * componentDefinition.layerWidth - componentDefinition.aspectWidth * -2093041337))
            componentDefinition.anInt1166 = (1227329079 * componentDefinition.layerWidth - componentDefinition.aspectWidth * 2072992297);
        if (684246511 * componentDefinition.anInt1166 < 0)
            componentDefinition.anInt1166 = 0;
        componentDefinition.anInt1167 = (-1915192419 * (runtime.integerStack[1 + 681479919 * runtime.integerStackOffset]));
        if (-1424956747 * componentDefinition.anInt1167 > (componentDefinition.maxScrollVertical * 2053897963 - 457937409 * componentDefinition.aspectHeight))
            componentDefinition.anInt1167 = (2097037087 * componentDefinition.maxScrollVertical - -900266595 * componentDefinition.aspectHeight);
        if (componentDefinition.anInt1167 * -1424956747 < 0)
            componentDefinition.anInt1167 = 0;
        StaticMethods.updateComponentTick(componentDefinition);
        if (-1 == componentDefinition.slot * -1309843523 && !IComponentDefinitionCollection.accessed)
            IComponentUpdateNode.appendContainerScrollUpdate(componentDefinition.interfaceHash );
    }

    static final void method1569(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        SET_DRAG_DEADZONE(componentDefinition, runtime);
    }

    static final void method337(IComponentDefinition component, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
        int graphicID = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        if (graphicID != 1411971043 * component.graphicID) {
            component.graphicID = 1986266571 * graphicID;
            StaticMethods.updateComponentTick(component);
        }
        if (component.slot * -1309843523 == -1 && !IComponentDefinitionCollection.accessed)
            IComponentUpdateNode.appendGraphicIDUpdate( component.interfaceHash);
    }

    static final void method1284(ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        int interfaceID = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
        int componentID = (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]);
        if (null == IComponentDefinition.getIComponentDefinitionCollections[interfaceID])
            runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = "";
        else {
            String string = (IComponentDefinition.getIComponentDefinitionCollections[interfaceID].componentDefinitions[componentID].aString1259);
            System.out.println("INSTRUCTION METHOD1284: " + string);
            if (string == null)
                runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = "";
            else
                runtime.objectStack[((runtime.objectArgs += 969361751) * -203050393) - 1] = string;
        }
    }

    static final void method1956(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = 7329457 * componentDefinition.xAngle;
    }

    static final void method2812(ScriptRuntime runtime) {
        int componentID = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition component = IComponentDefinition.getInterfaceComponent(componentID);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[componentID >> 16];
        Class522.method6326(component, IComponentDefinitionCollection, runtime);
    }

    static final void method760(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        Class410.method4984(componentDefinition, runtime);
    }

    static final void method1419(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
        if (-1215239439 * componentDefinition.type == IComponentDefinition.GRAPHIC)
            Class165.method1781(componentDefinition, IComponentDefinitionCollection, runtime, (short) -9019);
    }

    static final void method365(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, boolean bool, int i, ScriptRuntime runtime) {
        runtime.integerStackOffset -= -783761378;
        int itemID = (runtime.integerStack[681479919 * runtime.integerStackOffset]);
        int itemQuantity = (runtime.integerStack[681479919 * runtime.integerStackOffset + 1]);
        if (-1 == componentDefinition.slot * -1309843523 && !IComponentDefinitionCollection.accessed) {
            IComponentUpdateNode.appendItemModelUpdate( componentDefinition.interfaceHash);
            IComponentUpdateNode.appendModelRotationUpdate( componentDefinition.interfaceHash);
            IComponentUpdateNode.appendModelOffsetUpdate(componentDefinition.interfaceHash );
        }
        if (itemID == -1) {
            componentDefinition.modelType = -1530138943;
            componentDefinition.modelID = 1825442367;
            componentDefinition.itemID = -643064669;
        } else {
            componentDefinition.itemID = itemID * 643064669;
            componentDefinition.itemQuantity = itemQuantity * -160790887;
            componentDefinition.hasAppearance = bool;
            ItemDefinition itemDefinition = Js5Configs.itemList.getItemDefinitions(itemID);
            componentDefinition.xAngle = itemDefinition.primaryModelRotation * 1147619461;
            componentDefinition.yAngle = -953332053 * itemDefinition.secondaryModelRotation;
            componentDefinition.zAngle = 1018171305 * itemDefinition.primaryModelZoom;
            componentDefinition.xOffset = itemDefinition.primaryModelOffset * 216639237;
            componentDefinition.yOffset = itemDefinition.secondaryModelOffset * 2135145581;
            componentDefinition.zoom = itemDefinition.secondaryModelZoom * -1056736627;
            componentDefinition.anInt1201 = i * -625792095;
            if (-692202853 * componentDefinition.viewportWidth > 0)
                componentDefinition.zoom = (componentDefinition.zoom * 237251296 / (componentDefinition.viewportWidth * -692202853) * -1066050969);
            else if (1769572195 * componentDefinition.width > 0)
                componentDefinition.zoom = (237251296 * componentDefinition.zoom / (componentDefinition.width * 1769572195) * -1066050969);
        }
    }

    static final void method366(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
        method3850(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method851(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
        runtime.integerStackOffset -= -1567522756;
        componentDefinition.anInt1278 = 730470451 * (runtime.integerStack[runtime.integerStackOffset * 681479919]);
        componentDefinition.anInt1207 = ((runtime.integerStack[1 + runtime.integerStackOffset * 681479919]) * 792598437);
        componentDefinition.anInt1208 = (1652793977 * (runtime.integerStack[2 + 681479919 * runtime.integerStackOffset]));
        componentDefinition.animationID = ((runtime.integerStack[681479919 * runtime.integerStackOffset + 3]) * 1502440771);
        StaticMethods.updateComponentTick(componentDefinition);
    }

    static final void SET_DRAG_DEADTIME(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
        componentDefinition.dragDeadTime = (runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]) * -978869921;
    }

    static final void method360(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        method851(componentDefinition, runtime);
    }

    static final void method4680(ScriptRuntime runtime) {
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = SettingsManager.settingsManager.sceneryShadows.isActivated() ? 1 : 0;
    }

    static final void method4681(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
        String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
        if (Class298_Sub6.method2863(string, runtime) != null)
            string = string.substring(0, string.length() - 1);
        componentDefinition.onDragCompleteHook = Class128_Sub2.method1441(string, runtime);
        componentDefinition.hasScript = true;
    }

    static final void RESET_HOOKS_2(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        Class365_Sub1_Sub3_Sub1.resetHooks(componentDefinition);
    }

    static final void method4121(ScriptRuntime runtime) {
            int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
            IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
            Class225.method2102(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method4122(ScriptRuntime runtime) {
            IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
            IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
            IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
            Class261.method2463(componentDefinition, IComponentDefinitionCollection, runtime, (byte) -60);
    }

    static final void method778(ScriptRuntime runtime) {
            int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
            GameLanguage.method5758(componentDefinition);
    }

    static final void SET_TARGET_OVER_AND_LEAVE(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
            componentDefinition.targetLeaveCursor = (runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]) * 1830595391;
            componentDefinition.targetOverCursors = (runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]) * 2021607495;
    }

    static final void method730(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
            int i_3_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
            Class497 class497 = Class92.aClass504_905.get(i_3_);
            if (!class497.aString6101.equals(string))
                componentDefinition.method1119(i_3_, string);
            else
                componentDefinition.method1123(i_3_);
    }

    static final void method6156(ScriptRuntime runtime) {
        int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = (componentDefinition.modelType * 1548853569 == 1 ? 572201537 * componentDefinition.modelID : -1);
    }

    static final void method6157(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
        int i_5_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
        componentDefinition.aBoolean1174 = i_5_ == 1;
        StaticMethods.updateComponentTick(componentDefinition);
    }

    static final void method6147(ScriptRuntime runtime) {
            IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
            IComponentDefinition class105 = IComponentScripter.componentDefinition;
            Class118.method1288(class105, runtime);
    }

    static final void method6148(ScriptRuntime runtime) {
            IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
            IComponentDefinition class105 = IComponentScripter.componentDefinition;
            IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
            Class324.method3958(class105, IComponentDefinitionCollection, runtime, 760062987);
    }

    static final void method4552(ScriptRuntime runtime) {
            int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = componentDefinition.hidden ? 1 : 0;
    }

    static final void method1594(ScriptRuntime runtime) {
            IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
            IComponentDefinition class105 = IComponentScripter.componentDefinition;
            ToMoveScripts.method4606(class105, runtime);
    }

    static final void method1595(IComponentDefinition componentDefinition, IComponentDefinitionCollection componentDefinitionCollection, ScriptRuntime runtime) {
            String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
            int[] is = Class298_Sub6.method2863(string, runtime);
            if (null != is)
                string = string.substring(0, string.length() - 1);
            componentDefinition.onInvTransmitHook = Class128_Sub2.method1441(string, runtime);
            componentDefinition.invTransmitList = is;
            componentDefinition.hasScript = true;
    }

    static final void method1596(ScriptRuntime runtime) {
            IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
            IComponentDefinition class105 = IComponentScripter.componentDefinition;
            IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
            Class240_Sub1.method2244(class105, IComponentDefinitionCollection, runtime);
    }

    static final void method1224(ScriptRuntime runtime) {
            IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
            IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
            IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
            SET_RESIZE_MODES(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method2786(ScriptRuntime runtime) {
            IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
            IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
            IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
            setIComponentFontID(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method2787(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
            componentDefinition.outline = (runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]) * 1158843261;
            StaticMethods.updateComponentTick(componentDefinition);
    }

    static final void method2788(ScriptRuntime runtime) {
            IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
            IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = -1424956747 * componentDefinition.anInt1167;
    }

    static final void method2790(ScriptRuntime runtime) {
            runtime.integerStack[runtime.integerStackOffset * 681479919 - 1] = (runtime.aClass162_5252.method1756((byte) 4)[(runtime.integerStack[runtime.integerStackOffset * 681479919 - 1])]);
    }

    static final void method1314(ScriptRuntime runtime) {
            int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
            IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
            Class363.method4314(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method1316(ScriptRuntime runtime) {
            IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
            IComponentDefinition class105 = IComponentScripter.componentDefinition;
            setFlippedHorizontal(class105, runtime);

    }

    static final void method4675(ScriptRuntime runtime) {
            IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
            IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = 2053897963 * componentDefinition.maxScrollVertical;
    }

    static final void method1148(ScriptRuntime runtime) {
            int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
            IComponentDefinitionCollection IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
            method365(componentDefinition, IComponentDefinitionCollection, false, 1, runtime);
    }

    static final void method1563(ScriptRuntime runtime) {
            IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
            IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
            IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
            method2461(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method1564(ScriptRuntime runtime) {
            IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
            IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
            IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
            method365(componentDefinition, IComponentDefinitionCollection, false, 0, runtime);
    }

    static final void method1565(ScriptRuntime runtime) {
            IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
            IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
            Class241.method2248(componentDefinition, runtime);
    }

    static final void method2317(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
            String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
            if (Class298_Sub6.method2863(string, runtime) != null) {
                string = string.substring(0, string.length() - 1);
            }
            componentDefinition.anObjectArray1273 = Class128_Sub2.method1441(string, runtime);
            componentDefinition.hasScript = true;
    }

    static final void method1699(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
            String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
            if (Class298_Sub6.method2863(string, runtime) != null)
                string = string.substring(0, string.length() - 1);
            componentDefinition.onTimerHook = Class128_Sub2.method1441(string, runtime);
            componentDefinition.hasScript = true;
    }

    static final void method1700(ScriptRuntime runtime) {
            int i_2_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(i_2_);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = componentDefinition.color * 1045422783;
    }

    static final void method3996(ScriptRuntime runtime) {
            int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
            ToMoveScripts.method2131(componentDefinition, runtime);
    }

    static final void method6142(IComponentDefinition componentDefinition, IComponentDefinitionCollection IComponentDefinitionCollection, ScriptRuntime runtime) {
            runtime.integerStackOffset -= 1943683162;
            componentDefinition.xOffset = ((runtime.integerStack[681479919 * runtime.integerStackOffset]) * -2075416171);
            componentDefinition.yOffset = (-1373128517 * (runtime.integerStack[runtime.integerStackOffset * 681479919 + 1]));
            componentDefinition.xAngle = (-801721775 * (runtime.integerStack[runtime.integerStackOffset * 681479919 + 2]));
            componentDefinition.yAngle = ((runtime.integerStack[runtime.integerStackOffset * 681479919 + 3]) * 1590511671);
            componentDefinition.zAngle = ((runtime.integerStack[681479919 * runtime.integerStackOffset + 4]) * -2064327287);
            componentDefinition.zoom = (-1066050969 * (runtime.integerStack[5 + 681479919 * runtime.integerStackOffset]));
            StaticMethods.updateComponentTick(componentDefinition);
            if (componentDefinition.slot * -1309843523 == -1 && !IComponentDefinitionCollection.accessed) {
                IComponentUpdateNode.appendModelRotationUpdate(componentDefinition.interfaceHash);
                IComponentUpdateNode.appendModelOffsetUpdate(componentDefinition.interfaceHash);
            }
    }

    static final void method2364(ScriptRuntime runtime) {
            int interfaceHash = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
            IComponentDefinitionCollection componentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
            method4854(componentDefinition, componentDefinitionCollection, runtime);
    }

    static final void setFlippedHorizontal(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
        componentDefinition.flipH = (runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]) == 1;
        StaticMethods.updateComponentTick(componentDefinition);
    }

    static final void method2378(ScriptRuntime runtime) {
            IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
            IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
            method1890(componentDefinition, runtime);
    }

    static final void method540(ScriptRuntime runtime) {
            String string = (String) (runtime.objectStack[(runtime.objectArgs -= 969361751) * -203050393]);
            int i_0_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            IComponentSettings.sendChangeFriendChat(string, i_0_);
    }

    static final void method1073(ScriptRuntime runtime) {
            IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent((runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]));
            componentDefinition.sada = null;
            componentDefinition.containedComponents = null;
            StaticMethods.updateComponentTick(componentDefinition);
    }

    static final void method4099(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = -1993792969 * componentDefinition.transparency;
    }

    static final void method2404(ScriptRuntime runtime) {
        IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
        IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
        method782(componentDefinition, runtime);
    }

    static final void set2DAngle(IComponentDefinition componentDefinition, ScriptRuntime runtime) {
            componentDefinition.angle2D = (runtime.integerStack[(runtime.integerStackOffset -= -391880689) * 681479919]) * -216431639;
            StaticMethods.updateComponentTick(componentDefinition);
    }

    static final void method2595(ScriptRuntime runtime) {
            IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
            IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
            setRightClickOptionCursor(componentDefinition, runtime);
    }

    static final void method2596(ScriptRuntime runtime) {
            IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
            IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
            method5722(componentDefinition, runtime);
    }

    static final void method854(ScriptRuntime runtime) {
            int i_13_ = (runtime.integerStack[((runtime.integerStackOffset -= -391880689) * 681479919)]);
            IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent(i_13_);
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = class105.aspectHeight * 457937409;
    }

    static final void method6117(ScriptRuntime runtime) {
            IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
            IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
            IComponentDefinitionCollection IComponentDefinitionCollection = IComponentScripter.IComponentDefinitionCollection;
            Class116.method1271(componentDefinition, IComponentDefinitionCollection, runtime);
    }

    static final void method4062(ScriptRuntime runtime) {
            IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
            IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = 1045422783 * componentDefinition.color;
    }

    static final void method1227(ScriptRuntime runtime) {
            IComponentScripter IComponentScripter = (runtime.currentInstrBool ? runtime.aIComponentScripter_5247 : runtime.aIComponentScripter_5246);
            IComponentDefinition componentDefinition = IComponentScripter.componentDefinition;
            runtime.integerStack[((runtime.integerStackOffset += -391880689) * 681479919 - 1)] = componentDefinition.x * 1354508417;
    }
}
