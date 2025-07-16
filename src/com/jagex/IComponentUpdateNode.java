package com.jagex;/* Class298_Sub37_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.definition.widget.ComponentUpdateType;
import com.jagex.utils.TimeUtils;

public class IComponentUpdateNode extends Cacheable {

    static CircularDoubleLinkedList circularDoubleLinkedList = new CircularDoubleLinkedList();
    static LinkedList linkedList = new LinkedList(16);
    static CircularDoubleLinkedList doubleLinkedList = new CircularDoubleLinkedList();
    int secondAttribute;
    int thirdAttribute;
    int firstAttribute;
    String text;


    IComponentUpdateNode(int updateType, long interfaceHash) {
        key = ((long) updateType << 56 | interfaceHash) * 4191220306876042991L;
    }

    static void setIComponentHidden(int componentID, int hidden) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.VISIBILITY, (long) componentID);
        iComponentUpdateNode.increment();
        iComponentUpdateNode.firstAttribute = hidden * 1274450087;
    }

    static IComponentUpdateNode getUpdateNode(int updateType, long key) {
        IComponentUpdateNode iComponentUpdateNode = (IComponentUpdateNode) linkedList.get((long) updateType << 56 | key);
        if (iComponentUpdateNode == null) {
            iComponentUpdateNode = new IComponentUpdateNode(updateType, key);
            linkedList.connect(iComponentUpdateNode, 7051297995265073167L * iComponentUpdateNode.key);
        }
        return iComponentUpdateNode;
    }

    static void setItemOnIComponent(int interfaceHash, int itemID, int amount) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.ITEMMODEL, (long) interfaceHash);
        iComponentUpdateNode.increment();
        iComponentUpdateNode.firstAttribute = 1274450087 * itemID;
        iComponentUpdateNode.secondAttribute = 293101103 * amount;
    }

    static void setItemModelRotation(int interfaceHash, int primaryRotation, int secondaryRotation, int modelZoom) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.MODELROTATION, (long) interfaceHash);
        iComponentUpdateNode.increment();
        iComponentUpdateNode.firstAttribute = primaryRotation * 1274450087;
        iComponentUpdateNode.secondAttribute = 293101103 * secondaryRotation;
        iComponentUpdateNode.thirdAttribute = modelZoom * -80288087;
    }


    static void setItemModelOffset(int interfaceHash, int primaryModelOffset, int secondaryModelOffset, int primaryModelZoom) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.MODELOFFSET, (long) interfaceHash);
        iComponentUpdateNode.increment();
        iComponentUpdateNode.firstAttribute = primaryModelOffset * 1274450087;
        iComponentUpdateNode.secondAttribute = secondaryModelOffset * 293101103;
        iComponentUpdateNode.thirdAttribute = -80288087 * primaryModelZoom;
    }

    public static void appendFontMonocrhomeUpdate(int interfaceHash) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.FONTMONOCHROME, (long) interfaceHash);
        iComponentUpdateNode.add();
    }

    static void method6282(int interfaceHash, boolean bool) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.UNKNOWNUPDATE22, (long) interfaceHash);
        iComponentUpdateNode.increment();
        iComponentUpdateNode.firstAttribute = (bool ? 1 : 0) * 1274450087;
    }

    static void setModelOnIComponent(int interfaceHash, int modelType, int secondAttribute, int thirdAttribute) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.MODELTYPE, (long) interfaceHash);
        iComponentUpdateNode.increment();
        iComponentUpdateNode.firstAttribute = 1274450087 * modelType;
        iComponentUpdateNode.secondAttribute = secondAttribute * 293101103;
        iComponentUpdateNode.thirdAttribute = thirdAttribute * -80288087;
    }

    public static void appendHideUpdate(int interfaceHash) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.VISIBILITY, (long) interfaceHash);
        iComponentUpdateNode.add();
    }

    public static void appendFontIDUpdate(int interfaceHash) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.FONTID, (long) interfaceHash);
        iComponentUpdateNode.add();
    }

    static void method935(int i, int i_1_, int i_2_, int i_3_) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.UNKNOWNUPDATE18, (long) i_1_ << 32 | (long) i);
        iComponentUpdateNode.increment();
        iComponentUpdateNode.firstAttribute = 1274450087 * i_2_;
        iComponentUpdateNode.secondAttribute = i_3_ * 293101103;
    }

    static void setIComponentScenePosition(int interfaceHash, int x, int y) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.POSITION, (long) interfaceHash);
        iComponentUpdateNode.increment();
        iComponentUpdateNode.firstAttribute = 1274450087 * x;
        iComponentUpdateNode.secondAttribute = y * 293101103;
    }

    static void setIComponentGlobalString(int configID, String string) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.GLOBAL_STRING, (long) configID);
        iComponentUpdateNode.increment();
        iComponentUpdateNode.text = string;
    }

    static void setIComponentClickable(int interfaceHash, boolean clickable) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.CLICKABLE, (long) interfaceHash);
        iComponentUpdateNode.increment();
        iComponentUpdateNode.firstAttribute = 1274450087 * (clickable ? 1 : 0);
    }

    static void setIComponentColor(int interfaceHash, int colorID) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.COLOR, (long) interfaceHash);
        iComponentUpdateNode.increment();
        iComponentUpdateNode.firstAttribute = colorID * 1274450087;
    }

    static void setIComponentGraphicID(int interfaceHash, int spriteID) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.GRAPHICID, (long) interfaceHash);
        iComponentUpdateNode.increment();
        iComponentUpdateNode.firstAttribute = 1274450087 * spriteID;
    }

    public static void appendGlobalStringUpdate(int interfaceHash) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.GLOBAL_STRING, (long) interfaceHash);
        iComponentUpdateNode.add();
    }

    public static void appendPositionUpdate(int interfaceHash) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.POSITION, (long) interfaceHash);
        iComponentUpdateNode.add();
    }

    public static void method2750(int interfaceHash) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.UNKNOWNUPDATE22, (long) interfaceHash);
        iComponentUpdateNode.add();
    }

    public static void appendColorUpdate(int interfaceHash) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.COLOR, (long) interfaceHash);
        iComponentUpdateNode.add();
    }

    public static void appendClickableUpdate(int interfaceHash) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.CLICKABLE, (long) interfaceHash);
        iComponentUpdateNode.add();
    }

    public static void method3720(int interfaceHash) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.UNKNOWNUPDATE17, (long) interfaceHash);
        iComponentUpdateNode.add();
    }

    static void createResetWalkingEdit() {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.RESET_WALKING, 0L);
        iComponentUpdateNode.add();
    }

    public static void appendTextUpdate(int interfaceHash) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.TEXT, (long) interfaceHash);
        iComponentUpdateNode.add();
    }

    public static void appendAnimationUpdate(int interfaceHash) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.ANIMATION, (long) interfaceHash);
        iComponentUpdateNode.add();
    }

    public static void method5862(int i, int i_11_) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.UNKNOWNUPDATE18, (long) i_11_ << 32 | (long) i);
        iComponentUpdateNode.add();
    }

    static void method5600(int interfaceHash, int i_3_) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.UNKNOWNUPDATE17, (long) interfaceHash);
        iComponentUpdateNode.increment();
        iComponentUpdateNode.firstAttribute = i_3_ * 1274450087;
    }

    public static void appendGlobalConfigUpdate(int interfaceHash) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.GLOABAL_CONFIG, (long) interfaceHash);
        iComponentUpdateNode.add();
    }

    public static void appendModelRotationUpdate(int interfaceHash) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.MODELROTATION, (long) interfaceHash);
        iComponentUpdateNode.add();
    }

    static void setIComponentFontID(int interfaceHash, int fontID) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.FONTID, (long) interfaceHash);
        iComponentUpdateNode.increment();
        iComponentUpdateNode.firstAttribute = 1274450087 * fontID;
    }

    static void setIComponentScenePosition(int i, int i_0_) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.RESET_WALKING, 0L);
        iComponentUpdateNode.increment();
        iComponentUpdateNode.firstAttribute = 1274450087 * i;
        iComponentUpdateNode.secondAttribute = i_0_ * 293101103;
    }

    public static void appendModelOffsetUpdate(int interfaceHash) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.MODELOFFSET, (long) interfaceHash);
        iComponentUpdateNode.add();
    }

    public static void appendItemModelUpdate(int interfaceHash) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.ITEMMODEL, (long) interfaceHash);
        iComponentUpdateNode.add();
    }

    public static void appendModelTypeUpdate(int interfaceHash) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.MODELTYPE, (long) interfaceHash);
        iComponentUpdateNode.add();
    }

    public static void method958(int interfaceHash, int idk) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.UNKNOWNUPDATE19, (long) idk << 32 | (long) interfaceHash);
        iComponentUpdateNode.add();
    }

    static void method2269(int interfaceHash, int i_6_) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.UNKNOWNUPDATE13, (long) interfaceHash);
        iComponentUpdateNode.increment();
        iComponentUpdateNode.firstAttribute = i_6_ * 1274450087;
    }

    static void method2198(int i, int i_10_, int i_11_, int i_12_) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.UNKNOWNUPDATE19, (long) i_10_ << 32 | (long) i);
        iComponentUpdateNode.increment();
        iComponentUpdateNode.firstAttribute = 1274450087 * i_11_;
        iComponentUpdateNode.secondAttribute = 293101103 * i_12_;
    }

    static void setIComponentScroll(int interfaceHash, int scrollSize) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.CONTAINER_SCROLL, (long) interfaceHash);
        iComponentUpdateNode.increment();
        iComponentUpdateNode.firstAttribute = 1274450087 * scrollSize;
    }

    public static void appendGraphicIDUpdate(int interfaceHash) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.GRAPHICID, (long) interfaceHash);
        iComponentUpdateNode.add();
    }

    public static void appendContainerScrollUpdate(int interfaceHash) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.CONTAINER_SCROLL, (long) interfaceHash);
        iComponentUpdateNode.add();
    }

    static void setIComponentAnimation(int interfaceHash, int animationID) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.ANIMATION, (long) interfaceHash);
        iComponentUpdateNode.increment();
        iComponentUpdateNode.firstAttribute = animationID * 1274450087;
    }

    static void setIComponentGlobalConfig(int configID, int configValue) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.GLOABAL_CONFIG, (long) configID);
        iComponentUpdateNode.increment();
        iComponentUpdateNode.firstAttribute = configValue * 1274450087;
    }

    static void setIComponentText(int interfaceHash, String text) {
        IComponentUpdateNode iComponentUpdateNode = getUpdateNode(ComponentUpdateType.TEXT, (long) interfaceHash);
        iComponentUpdateNode.increment();
        iComponentUpdateNode.text = text;
    }

    static final void checkComponentUpdateNodes() {
        for (int i_3_ = Class128.playerVarsProvider.nextChangedVar(true, -2004625733); i_3_ != -1; i_3_ = Class128.playerVarsProvider.nextChangedVar(false, -1890624062)) {
            ItemDefinitionLoader.method6094(i_3_);
            GameClient.anIntArray8874[((GameClient.anInt8783 += -1763975993) * -1667357449) - 1 & 0x1f] = i_3_;
        }
        for (IComponentUpdateNode componentUpdateNode = Class97_Sub1.method1045((byte) 12); componentUpdateNode != null; componentUpdateNode = Class97_Sub1.method1045((byte) 12)) {
            int updateType = componentUpdateNode.getUpdateType();
            long interfaceHash = componentUpdateNode.getInterfaceHash();
            if (updateType == ComponentUpdateType.GLOABAL_CONFIG) {
                Class374.interfaceGCValue[(int) interfaceHash] = 479598359 * componentUpdateNode.firstAttribute;
                GameClient.aBoolean8736 |= Class254.interfaceGC[(int) interfaceHash];
                GameClient.intertfaceGCValueCounts[((GameClient.GCValueCount += 163718667) * 116700579) - 1 & 0x1f] = (int) interfaceHash;
            } else if (updateType == ComponentUpdateType.GLOBAL_STRING) {
                StaticMethods.interfaceGCString[(int) interfaceHash] = (componentUpdateNode.text);
                GameClient.interfaceGCStringCounts[((GameClient.GCStringCount += -646054651) * -466597939) - 1 & 0x1f] = (int) interfaceHash;
            } else if (updateType == ComponentUpdateType.TEXT) {
                IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent((int) interfaceHash);
                if (!componentUpdateNode.text.equals(componentDefinition.text)) {
                    componentDefinition.text = (componentUpdateNode.text);
                    StaticMethods.updateComponentTick(componentDefinition);
                }

            } else if (updateType == ComponentUpdateType.MODELTYPE) {
                IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent((int) interfaceHash);
                int modelType = ((componentUpdateNode.firstAttribute) * 479598359);
                int key = ((componentUpdateNode.secondAttribute) * -1447843633);
                int hashcode = -1074324071 * componentUpdateNode.thirdAttribute;
                if (componentDefinition.modelType * 1548853569 != modelType || key != componentDefinition.modelID * 572201537 || hashcode != 1148770405 * componentDefinition.hashcode) {
                    componentDefinition.modelType = modelType * -1530138943;
                    componentDefinition.modelID = key * -1825442367;
                    componentDefinition.hashcode = 908204397 * hashcode;
                    componentDefinition.aClass498_1307 = null;
                    StaticMethods.updateComponentTick(componentDefinition);
                }
            } else if (updateType == ComponentUpdateType.ANIMATION) {
                IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent((int) interfaceHash);
                if (componentDefinition.animId * 1347982601 != (componentUpdateNode.firstAttribute) * 479598359) {
                    if (479598359 * componentUpdateNode.firstAttribute != -1) {
                        if (null == componentDefinition.animator)
                            componentDefinition.animator = new SimpleAnimation();
                        componentDefinition.animator.load((componentUpdateNode.firstAttribute) * 479598359);
                    } else
                        componentDefinition.animator = null;
                    componentDefinition.animId = (componentUpdateNode.firstAttribute) * 1256289055;
                    StaticMethods.updateComponentTick(componentDefinition);
                }
            } else if (updateType == ComponentUpdateType.COLOR) {
                int rgb = ((componentUpdateNode.firstAttribute) * 479598359);
                int red = rgb >> 10 & 0x1f;
                int green = rgb >> 5 & 0x1f;
                int blue = rgb & 0x1f;
                int color = (green << 11) + (red << 19) + (blue << 3);
                IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent((int) interfaceHash);
                if (color != componentDefinition.color * 1045422783) {
                    componentDefinition.color = -695431873 * color;
                    StaticMethods.updateComponentTick(componentDefinition);
                }
            } else if (updateType == ComponentUpdateType.VISIBILITY) {
                IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent((int) interfaceHash);
                boolean hidden = 1 == 479598359 * componentUpdateNode.firstAttribute;
                if (hidden != componentDefinition.hidden) {
                    componentDefinition.hidden = hidden;
                    StaticMethods.updateComponentTick(componentDefinition);
                }
            } else if (updateType == ComponentUpdateType.MODELROTATION) {
                IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent((int) interfaceHash);
                if ((479598359 * componentUpdateNode.firstAttribute != componentDefinition.xAngle * 7329457) || ((componentUpdateNode.secondAttribute) * -1447843633 != componentDefinition.yAngle * -1086526073) || (-1074324071 * componentUpdateNode.thirdAttribute != componentDefinition.zoom * -261021353)) {
                    componentDefinition.xAngle = (componentUpdateNode.firstAttribute) * -161133497;
                    componentDefinition.yAngle = (componentUpdateNode.secondAttribute) * 752254073;
                    componentDefinition.zoom = (componentUpdateNode.thirdAttribute) * 1673638543;
                    if (-1232467723 * componentDefinition.itemID != -1) {
                        if (-692202853 * componentDefinition.viewportWidth > 0)
                            componentDefinition.zoom = (componentDefinition.zoom * 237251296 / (-692202853 * componentDefinition.viewportWidth) * -1066050969);
                        else if (componentDefinition.width * 1769572195 > 0)
                            componentDefinition.zoom = (componentDefinition.zoom * 237251296 / (componentDefinition.width * 1769572195) * -1066050969);
                    }
                    StaticMethods.updateComponentTick(componentDefinition);
                }
            } else if (updateType == ComponentUpdateType.ITEMMODEL) {
                IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent((int) interfaceHash);
                if (((componentUpdateNode.firstAttribute) * 479598359 != componentDefinition.itemID * -1232467723) || (-1447843633 * componentUpdateNode.secondAttribute != -66163287 * componentDefinition.itemQuantity)) {
                    componentDefinition.itemID = (componentUpdateNode.firstAttribute) * 1795180635;
                    componentDefinition.itemQuantity = (componentUpdateNode.secondAttribute) * 1181892023;
                    StaticMethods.updateComponentTick(componentDefinition);
                }
            } else if (updateType == ComponentUpdateType.MODELOFFSET) {
                IComponentDefinition class105 = IComponentDefinition.getInterfaceComponent((int) interfaceHash);
                if ((-407676483 * class105.xOffset != (componentUpdateNode.firstAttribute) * 479598359) || ((componentUpdateNode.secondAttribute) * -1447843633 != -1523987341 * class105.yOffset) || (1004185785 * class105.zAngle != -1074324071 * (componentUpdateNode.thirdAttribute))) {
                    class105.xOffset = 1482071907 * componentUpdateNode.firstAttribute;
                    class105.yOffset = -2128996555 * componentUpdateNode.secondAttribute;
                    class105.zAngle = 698346465 * componentUpdateNode.thirdAttribute;
                    StaticMethods.updateComponentTick(class105);
                }
            } else if (updateType == ComponentUpdateType.POSITION) {
                IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent((int) interfaceHash);
                componentDefinition.hPositionMode = (byte) 0;
                componentDefinition.x = ((componentDefinition.startX = 1890691465 * componentUpdateNode.firstAttribute) * -1672688609);
                componentDefinition.vPositionMode = (byte) 0;
                componentDefinition.y = (componentDefinition.startY = (componentUpdateNode.secondAttribute) * -1822519589) * 705123139;
                StaticMethods.updateComponentTick(componentDefinition);
            } else if (updateType == ComponentUpdateType.CONTAINER_SCROLL) {
                IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent((int) interfaceHash);
                int scrollVertical = 479598359 * componentUpdateNode.firstAttribute;
                if (null != componentDefinition && 0 == componentDefinition.type * -1215239439) {
                    if (scrollVertical > (componentDefinition.maxScrollVertical * 2053897963 - 457937409 * componentDefinition.aspectHeight))
                        scrollVertical = (componentDefinition.maxScrollVertical * 2053897963 - 457937409 * componentDefinition.aspectHeight);
                    if (scrollVertical < 0)
                        scrollVertical = 0;
                    if (componentDefinition.anInt1167 * -1424956747 != scrollVertical) {
                        componentDefinition.anInt1167 = -1915192419 * scrollVertical;
                        StaticMethods.updateComponentTick(componentDefinition);
                    }
                }
            } else if (updateType == ComponentUpdateType.GRAPHICID) {
                IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent((int) interfaceHash);
                componentDefinition.graphicID = 947110461 * componentUpdateNode.firstAttribute;
            } else if (updateType == ComponentUpdateType.RESET_WALKING) {
                Minimap.aBoolean63 = true;
                Minimap.flagX = (componentUpdateNode.firstAttribute) * 20118889;
                Minimap.flagY = (componentUpdateNode.secondAttribute) * 1038073637;
            } else if (updateType == ComponentUpdateType.FONTID) {
                IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent((int) interfaceHash);
                componentDefinition.fontID = 861383641 * componentUpdateNode.firstAttribute;
            } else if (updateType == ComponentUpdateType.UNKNOWNUPDATE17) {
                IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent((int) interfaceHash);
                componentDefinition.anInt1289 = -696165999 * componentUpdateNode.firstAttribute;
            } else if (updateType == ComponentUpdateType.UNKNOWNUPDATE18) {
                IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent((int) interfaceHash);
                int i_14_ = (int) (interfaceHash >> 32);
                componentDefinition.method1126(i_14_, (short) (479598359 * (componentUpdateNode.firstAttribute)), (short) (-1447843633 * (componentUpdateNode.secondAttribute)));
            } else if (updateType == ComponentUpdateType.UNKNOWNUPDATE19) {
                IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent((int) interfaceHash);
                int i_15_ = (int) (interfaceHash >> 32);
                componentDefinition.method1120(i_15_, (short) ((componentUpdateNode.firstAttribute) * 479598359), (short) (-1447843633 * (componentUpdateNode.secondAttribute)));
            } else if (updateType == ComponentUpdateType.FONTMONOCHROME) {
                IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent((int) interfaceHash);
                componentDefinition.fontMonochrome = 1 == (componentUpdateNode.firstAttribute) * 479598359;
            } else if (updateType == ComponentUpdateType.CLICKABLE) {
                IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent((int) interfaceHash);
                componentDefinition.clickable = 1 == 479598359 * componentUpdateNode.firstAttribute;
            } else if (updateType == ComponentUpdateType.UNKNOWNUPDATE22) {
                IComponentDefinition componentDefinition = IComponentDefinition.getInterfaceComponent((int) interfaceHash);
                if (componentDefinition.aBoolean1246 != (1 == 479598359 * componentUpdateNode.firstAttribute)) {
                    componentDefinition.aBoolean1246 = 1 == (componentUpdateNode.firstAttribute) * 479598359;
                    StaticMethods.updateComponentTick(componentDefinition);
                }
            }
        }
    }

    void add() {
        cachedKey = ((cachedKey * -5533549728640346679L & ~0x7fffffffffffffffL | TimeUtils.getTime() + 500L) * 1476940603538232441L);
        circularDoubleLinkedList.offer(this);
    }

    int getUpdateType() {
        return (int) (key * 7051297995265073167L >>> 56 & 0xffL);
    }

    long getInterfaceHash() {
        return 7051297995265073167L * key & 0xffffffffffffffL;
    }

    long getCount() {
        return cachedKey * -5533549728640346679L & 0x7fffffffffffffffL;
    }

    void increment() {
        cachedKey = (cachedKey * -5533549728640346679L | ~0x7fffffffffffffffL) * 1476940603538232441L;
        if (getCount() == 0L)
            doubleLinkedList.offer(this);
    }
}
