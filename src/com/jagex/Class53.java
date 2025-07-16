package com.jagex;/* Class53 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class53 {
    public byte aByte509;
    public boolean aBoolean518;
    public int anInt519;
    public boolean aBoolean524;
    public boolean aBoolean527;
    public int anInt528;
    public byte aByte529;
    public int anInt531;
    public short aShort532;
    public byte aByte533;
    public byte aByte534;
    public byte aByte535;
    public byte aByte536;
    public byte aByte537;
    public boolean aBoolean538;
    public boolean aBoolean540;
    public boolean aBoolean541;
    public boolean aBoolean543;
    public boolean aBoolean544;

    static void method599(IComponentDefinitionCollection IComponentDefinitionCollection, IComponentDefinition component, byte i) {
        if (null != component) {
            if (-1 != -1309843523 * component.slot) {
                IComponentDefinition class105_0_ = (IComponentDefinitionCollection.componentDefinitions[component.parentID & 0xffff]);
                if (class105_0_ != null) {
                    if (class105_0_.containedComponents == class105_0_.sada) {
                        class105_0_.containedComponents = (new IComponentDefinition[class105_0_.sada.length]);
                        class105_0_.containedComponents[0] = component;
                        Class425.method5737(class105_0_.sada, 0, class105_0_.containedComponents, 1, (component.slot * -1309843523));
                        Class425.method5737(class105_0_.sada, 1 + component.slot * -1309843523, class105_0_.containedComponents, 1 + -1309843523 * component.slot, (class105_0_.sada.length - component.slot * -1309843523 - 1));
                    } else {
                        int i_1_ = 0;
                        IComponentDefinition[] class105s;
                        for (class105s = class105_0_.containedComponents; i_1_ < class105s.length; i_1_++) {
                            if (component == class105s[i_1_]) {
                                if (i >= 0)
                                    throw new IllegalStateException();
                                break;
                            }
                        }
                        if (i_1_ < class105s.length) {
                            Class425.method5737(class105s, 0, class105s, 1, i_1_);
                            class105s[0] = component;
                        }
                    }
                }
            } else {
                IComponentDefinition[] class105s = IComponentDefinitionCollection.resetComponents();
                int i_2_;
                for (i_2_ = 0; i_2_ < class105s.length; i_2_++) {
                    if (class105s[i_2_] == component) {
                        if (i >= 0) {
                                /* empty */
                        }
                        break;
                    }
                }
                if (i_2_ < class105s.length) {
                    Class425.method5737(class105s, 0, class105s, 1, i_2_);
                    class105s[0] = component;
                }
            }
        }
    }

    static final void method602() {
        StaticMethods.updateComponentTick(GameClient.fromIComponentDefinition);
        Class82_Sub22.anInt6917 += -1137234765;
        if (!GameClient.aBoolean8938 || !GameClient.aBoolean8855) {
            if (379282043 * Class82_Sub22.anInt6917 > 1) {
                GameClient.fromIComponentDefinition = null;
                GameClient.aClass105_8712 = null;
            }
        } else {
            int i_3_ = AwtMouse.mouse.getLastX();
            int i_4_ = AwtMouse.mouse.getLastY();
            i_3_ -= -98735103 * GameClient.anInt8734;
            i_4_ -= -938469429 * GameClient.anInt8853;
            if (i_3_ < GameClient.anInt8856 * -343518257)
                i_3_ = -343518257 * GameClient.anInt8856;
            if (i_3_ + -2093041337 * GameClient.fromIComponentDefinition.aspectWidth > (GameClient.anInt8858 * -1221279965 + -343518257 * GameClient.anInt8856))
                i_3_ = (-343518257 * GameClient.anInt8856 + GameClient.anInt8858 * -1221279965 - -2093041337 * GameClient.fromIComponentDefinition.aspectWidth);
            if (i_4_ < 1325631359 * GameClient.anInt8800)
                i_4_ = 1325631359 * GameClient.anInt8800;
            if (457937409 * GameClient.fromIComponentDefinition.aspectHeight + i_4_ > (1325631359 * GameClient.anInt8800 + -609231901 * GameClient.anInt8966))
                i_4_ = (-609231901 * GameClient.anInt8966 + GameClient.anInt8800 * 1325631359 - 457937409 * GameClient.fromIComponentDefinition.aspectHeight);
            int i_5_;
            int i_6_;
            if (IComponentDefinition.componentDefinition == GameClient.aClass105_8712) {
                i_5_ = i_3_;
                i_6_ = i_4_;
            } else {
                i_5_ = (i_3_ - GameClient.anInt8856 * -343518257 + 684246511 * GameClient.aClass105_8712.anInt1166);
                i_6_ = (i_4_ - GameClient.anInt8800 * 1325631359 + GameClient.aClass105_8712.anInt1167 * -1424956747);
            }
            if (!AwtMouse.mouse.method3881()) {
                if (GameClient.aBoolean8863) {
                    IComponentDefinition.method1587();
                    if (GameClient.fromIComponentDefinition.onDragCompleteHook != null) {
                        ScriptNode scriptNode = new ScriptNode();
                        scriptNode.aClass105_7525 = GameClient.fromIComponentDefinition;
                        scriptNode.anInt7526 = 622624491 * i_5_;
                        scriptNode.anInt7527 = i_6_ * 335112545;
                        scriptNode.aClass105_7529 = GameClient.toIComponentDefinition;
                        scriptNode.parameters = GameClient.fromIComponentDefinition.onDragCompleteHook;
                        Class444.method5889(scriptNode);
                    }
                    if (GameClient.toIComponentDefinition != null && (GameClient.method2808(GameClient.fromIComponentDefinition) != null))
                        Class380.switchInterfaceItem(GameClient.fromIComponentDefinition, GameClient.toIComponentDefinition);
                } else if ((2089115297 * GameClient.anInt8830 == 1 || StaticMethods.method694(-1591809416)) && Class436.menuOptionCount * -278777595 > 2)
                    Class63.method738((-1040412347 * GameClient.anInt8861 + -98735103 * GameClient.anInt8734), (GameClient.anInt8862 * 601707167 + GameClient.anInt8853 * -938469429));
                else if (Class63.method740(2078410937))
                    Class63.method738((GameClient.anInt8734 * -98735103 + -1040412347 * GameClient.anInt8861), (GameClient.anInt8862 * 601707167 + -938469429 * GameClient.anInt8853));
                GameClient.fromIComponentDefinition = null;
                GameClient.aClass105_8712 = null;
            } else {
                if (379282043 * Class82_Sub22.anInt6917 > 2117401247 * GameClient.fromIComponentDefinition.dragDeadTime) {
                    int i_7_ = i_3_ - GameClient.anInt8861 * -1040412347;
                    int i_8_ = i_4_ - 601707167 * GameClient.anInt8862;
                    if ((i_7_ > GameClient.fromIComponentDefinition.dragDeadZone * -1855449225) || i_7_ < -(-1855449225 * GameClient.fromIComponentDefinition.dragDeadZone) || i_8_ > (-1855449225 * GameClient.fromIComponentDefinition.dragDeadZone) || i_8_ < -(-1855449225 * GameClient.fromIComponentDefinition.dragDeadZone))
                        GameClient.aBoolean8863 = true;
                }
                if (null != GameClient.fromIComponentDefinition.onDragHook && GameClient.aBoolean8863) {
                    ScriptNode scriptNode = new ScriptNode();
                    scriptNode.aClass105_7525 = GameClient.fromIComponentDefinition;
                    scriptNode.anInt7526 = 622624491 * i_5_;
                    scriptNode.anInt7527 = i_6_ * 335112545;
                    scriptNode.parameters = GameClient.fromIComponentDefinition.onDragHook;
                    Class444.method5889(scriptNode);
                }
            }
        }
    }
}
