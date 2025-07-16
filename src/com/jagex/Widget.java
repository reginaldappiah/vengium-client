package com.jagex;/* Class298_Sub51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Widget extends Node {
    public int clipped;
    public int interfaceID;

    public Widget(int interfaceID, int clipped) {
        this.interfaceID = interfaceID * 84132523;
        this.clipped = clipped * -1287090225;
    }

    public static final Widget connectComponent(int parentHash, Widget widget, int[] xteas, boolean bool) {
        Widget widgetMirror = (Widget) GameClient.linkedList.get((long) parentHash);
        if (widgetMirror != null)
            closeInterface(widgetMirror, (widgetMirror.interfaceID * -1617025021 != (-1617025021 * widget.interfaceID)), bool);
        GameClient.linkedList.connect(widget, (long) parentHash);
        StaticMethods.method321(-1617025021 * widget.interfaceID, xteas);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(parentHash);
        if (componentDefinition != null)
            StaticMethods.updateComponentTick(componentDefinition);
        if (GameClient.loadingScreen != null) {
            StaticMethods.updateComponentTick(GameClient.loadingScreen);
            GameClient.loadingScreen = null;
        }
        StaticMethods.method2376(-662741241);
        if (componentDefinition != null)
            Class65.method761((IComponentDefinition.getIComponentDefinitionCollections[componentDefinition.interfaceHash>>> 16]), componentDefinition, !bool);
        if (!bool)
            Class14.method341(-1617025021 * widget.interfaceID, xteas);
        if (!bool && -257444687 * GameClient.WINDOW_PANE_ID != -1)
            IComponentDefinition.method903(GameClient.WINDOW_PANE_ID * -257444687, 1);
        return widget;
    }

    public static final void closeInterface(Widget widget, boolean clipped, boolean bool_14_) {
        int interfaceID = widget.interfaceID * -1617025021;
        int interfaceHash = (int) (7051297995265073167L * widget.key);
        widget.unlink();
        if (clipped)
            Class82_Sub8.deactivateComponents(interfaceID);
        method2280(interfaceID);
        IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent(interfaceHash);
        if (null != componentDefinition)
            StaticMethods.updateComponentTick(componentDefinition);
        StaticMethods.method2376(-1483926701);
        if (!bool_14_ && GameClient.WINDOW_PANE_ID * -257444687 != -1)
            IComponentDefinition.method903(-257444687 * GameClient.WINDOW_PANE_ID, 1);
        Class460 class460 = new Class460(GameClient.linkedList);
        for (Widget widgetNode = (Widget) class460.method5979(-2012602178); null != widgetNode; widgetNode = (Widget) class460.next()) {
            if (!widgetNode.isNextAvailable()) {
                widgetNode = (Widget) class460.method5979(-2012602178);
                if (null == widgetNode) {
                    break;
                }
            }
            if (widgetNode.clipped * 27137839 == 3) {
                int key = (int) (7051297995265073167L * widgetNode.key);
                if (key >>> 16 == interfaceID)
                    closeInterface(widgetNode, true, bool_14_);
            }
        }
    }

    static void method2280(int containerID) {
        for (Node node = GameClient.aClass437_8896.method5816(); null != node; node = GameClient.aClass437_8896.method5815()) {
            if ((long) containerID == (7051297995265073167L * node.key >> 48 & 0xffffL))
                node.unlink();
        }
    }

    public boolean method3573() {
        return true;
    }

}
