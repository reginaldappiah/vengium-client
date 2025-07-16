package com.jagex;/* IComponentDefinition - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.Js5Configs;
import com.jagex.game.cache.config.prefetch.Js5List;
import com.jagex.maths.Matrix43f;
import com.jagex.maths.Matrix4f;
import com.jagex.utils.CameraUtils;
import com.jagex.utils.ColorUtils;

public class IComponentDefinition {

    public static final int CONTAINER = 0;
    public static final int LAYER = 1;
    public static final int CS2 = 2;
    public static final int RECTANGLE = 3;
    public static final int TEXT = 4;
    public static final int GRAPHIC = 5;
    public static final int ANIMABLE = 6;
    public static final int LINE = 9;

    public static final int MODELTYPE_DEFAULT = 1;
    public static final int MODELTYPE_NPC = 2;
    public static final int MODELTYPE_PLAYER = 3;
    public static final int MODELTYPE_OTHER_PLAYER = 7;

    public static final int anInt1119 = 1;
    public static final int anInt1206 = 2;
    public static final int REINALDS_SMITHING_EMPORIUM = 328;
    public static final int BASIC_SCENE = 1337;
    public static final int MINIMAP_AREA = 1338;
    public static final int MINIMAP_COMPASS = 1339;
    public static final int WORLD_MAP_AREA = 1400;
    public static final int WORLD_MAP_OVERVIEW = 1401;
    public static final int RESIZABLE_SCENE = 1403;
    public static final int DEBUG_BLOCK = 1405;
    public static final int UNKNOWN1 = 1406;
    public static final int UNKNOWN2 = 1407;
    public static final int HSV_SLIDER_BOX = 1408;
    public static final int HSV_DIAGRAM_BOX = 1409;

    public static SoftCache spriteCache;
    public static SoftCache modelsCache;
    public static boolean aBoolean1139;

    public static int anInt1266 = 0;

    public static IComponentDefinition componentDefinition;
    public static IComponentDefinitionCollection[] getIComponentDefinitionCollections;
    static SoftCache aClass348_1136;
    static SoftCache aClass348_1296;
    static boolean[] interfaceComponentsExists;

    static {
        spriteCache = new SoftCache(3000000, 200);
        aClass348_1136 = new SoftCache(8);
        aClass348_1296 = new SoftCache(4);
        modelsCache = new SoftCache(50);
        aBoolean1139 = false;
    }

    public Object[] onTargetLeaveHook;
    public Object[] onMouseLeaveHook;
    public int lineVAlign;
    public int tick;
    public Object[] onDragCompleteHook;
    public int hashcode;
    public int anInt1141;
    public int interfaceHash = -533296807;
    public int x;
    public int type;
    public int specialType;
    public byte hPositionMode;
    public byte vPositionMode;
    public byte hReizeMode;
    public byte vResizeMode;
    public Object[] onReleaseHook;
    public int modelID;
    public Animator animator;
    public int height;
    public int slot = 263105643;
    public int y;
    public int aspectWidth;
    public Object[] onVarcStrTransmitHook;
    public int anInt1158;
    public int startY;
    public int parentID;
    public boolean hidden;
    public int aspectHeight;
    public int targetLeaveCursor;
    public Object[] anObjectArray1164;
    public boolean noClickThrough;
    public int anInt1166;
    public int anInt1167;
    public int layerWidth;
    public int maxScrollVertical;
    public int color;
    public boolean filled;
    public Object[] onInvTransmitHook;
    public int lineWidth;
    public boolean aBoolean1174;
    public int graphicID;
    public int anInt1176;
    public Object[] onVarpTransmitHook;
    public int outline;
    public int targetOverCursors;
    public boolean flipV;
    public boolean flipH;
    public boolean alpha;
    public boolean clickable;
    public int modelType;
    public byte[] aByteArray1185;
    public boolean rawDepth;
    public boolean overview;
    public int[] varpTransmitList;
    public int[] anIntArray1189;
    public int xAngle;
    public int lineHeight;
    public int zAngle;
    public int originX;
    public int originY;
    public String[] rightClickOptions;
    public boolean tiling;
    public int animationID;
    public int viewportHeight;
    public boolean orthogonal;
    public Object[] onVarcTransmitHook;
    public int anInt1201;
    public int anInt1202;
    public int anInt1207;
    public int anInt1208;
    public Object[] onTimerHook;
    public int fontID;
    public boolean fontMonochrome;
    public String text;//STRING
    public boolean hasAppearance;
    public int lineHAlign;
    public int anInt1215;
    public boolean shadowed;
    public int maxLines;
    public ParticleSystem particles;
    public IComponentSettings activeProperties;
    public boolean aBoolean1220;
    public int viewportWidth;
    public byte[] aByteArray1222;
    public int transparency;
    public String opBase;
    public Object[] onScrollWheelHook;
    public String toolTip;
    public int[] optionCursors;
    public int anInt1232;
    public IComponentDefinition aClass105_1233;
    public int dragDeadTime;
    public int dragRenderBehavior;
    public String targetVerb;
    public boolean hasScript;
    public int dragDeadZone;
    public Object[] onClickHook;
    public int anInt1241;
    public int anInt1242;
    public Object[] onHoldHook;
    public Object[] onMouseOverHook;
    public Object[] onMouseRepeatHook;
    public boolean aBoolean1246;
    public Object[] onUseOnObjHook;
    public int yOffset;
    public Object[] onTargetEnterHook;
    public Object[] anObjectArray1250;
    public int shadow;
    public int anInt1252;
    public int width;
    public int[] invTransmitList;
    public Object[] onStatTransmitHook;
    public int[] statTransmitList;
    public Object[] onLoadHookParameters;
    public int[] globalVarTransmitList;
    public String aString1259;
    public int[] varcstrTransmitList;
    public Object[] anObjectArray1261;
    public int yAngle;
    public Object[] onClickRepeatHook;
    public Object[] onOptHook;
    public Object[] anObjectArray1267;
    public Object[] anObjectArray1268;
    public Object[] anObjectArray1270;
    public Object[] anObjectArray1271;
    public int mouseOverCursor;
    public Object[] anObjectArray1273;
    public Object[] anObjectArray1274;
    public Object[] anObjectArray1275;
    public int[] anIntArray1276;
    public Object[] anObjectArray1277;
    public int anInt1278;
    public int itemID;
    public int itemQuantity;
    public int originZ;
    public int anInt1283;
    public int zoom;
    public Object[] anObjectArray1285;
    public int startX;
    public Object[] anObjectArray1287;
    public int anInt1288;
    public int anInt1289;
    public int animId;
    public Object[] onDragHook;
    public IComponentDefinition[] sada;
    public IComponentDefinition[] containedComponents;
    public boolean aBoolean1294;
    public boolean aBoolean1295;
    public int xOffset;
    public int anInt1298;
    public int anInt1299;
    public int globalConfigValuesLength;
    public int anInt1301;
    public int anInt1302;
    public int anInt1303;
    public int anInt1304;
    public int[] anIntArray1305;
    public int angle2D;
    public Class498 aClass498_1307;
    short[] aShortArray1118;
    short[] aShortArray1203;
    short[] aShortArray1204;
    short[] aShortArray1234;
    LinkedList params;

    public IComponentDefinition() {
        specialType = 0;
        hPositionMode = (byte) 0;
        vPositionMode = (byte) 0;
        hReizeMode = (byte) 0;
        vResizeMode = (byte) 0;
        startX = 0;
        startY = 0;
        width = 0;
        height = 0;
        x = 0;
        y = 0;
        aspectWidth = 0;
        aspectHeight = 0;
        anInt1158 = 349940087;
        anInt1242 = 153098785;
        parentID = -1;
        hidden = false;
        targetOverCursors = -2021607495;
        targetLeaveCursor = -1830595391;
        mouseOverCursor = 1122372539;
        noClickThrough = false;
        anInt1166 = 0;
        anInt1167 = 0;
        layerWidth = 0;
        maxScrollVertical = 0;
        color = 0;
        filled = false;
        transparency = 0;
        lineWidth = -1041514725;
        aBoolean1174 = false;
        graphicID = -1986266571;
        angle2D = 0;
        tiling = false;
        outline = 0;
        shadow = 0;
        alpha = false;
        clickable = true;
        modelType = -1530138943;
        hashcode = -908204397;
        xOffset = 0;
        yOffset = 0;
        xAngle = 0;
        yAngle = 0;
        zAngle = 0;
        originX = 0;
        originY = 0;
        originZ = 0;
        zoom = 769085500;
        viewportWidth = 0;
        viewportHeight = 0;
        orthogonal = false;
        rawDepth = false;
        anInt1201 = -1251584190;
        fontID = 2074006897;
        fontMonochrome = true;
        text = "";
        lineHeight = 0;
        lineHAlign = 0;
        lineVAlign = 0;
        shadowed = false;
        maxLines = 0;
        aBoolean1246 = false;
        activeProperties = IComponentSettings.aIComponentSettings_7415;
        aBoolean1220 = false;
        opBase = "";
        anInt1232 = 7527659;
        aClass105_1233 = null;
        dragDeadZone = 0;
        dragDeadTime = 0;
        dragRenderBehavior = anInt1266 * 623805157;
        targetVerb = "";
        hasScript = false;
        itemID = -643064669;
        itemQuantity = 0;
        hasAppearance = false;
        anInt1283 = 153142767;
        anInt1289 = -1025047959;
        animId = -1587382585;
        aBoolean1294 = false;
        aBoolean1295 = false;
        anInt1215 = -607532293;
        anInt1288 = 0;
        anInt1298 = 0;
        anInt1299 = 0;
        globalConfigValuesLength = 0;
        anInt1301 = 0;
        anInt1302 = 0;
        anInt1303 = -1339690151;
        tick = 217934215;
    }

    public static final void updateComponentType(IComponentDefinition[] widgetComponents, int parentID, int clipX, int clipY, int width, int height, int x, int y, int i_8_, boolean bool) {
        GameClient.activeGraphicsToolkit.setClip(clipX, clipY, width, height);
        for (int componentID = 0; componentID < widgetComponents.length; componentID++) {
            IComponentDefinition componentDefinition = widgetComponents[componentID];
            if (componentDefinition == null) {

            } else {
                if (componentDefinition.parentID != parentID) {//Different Root
                    //If the parentID != -1, it's a root for other interfaces
                    if (parentID != -1) {
                        continue;//Jump to next iteration of loop
                    }
                    if (GameClient.fromIComponentDefinition != componentDefinition) {
                        continue;//Jump to next iteration of loop
                    }
                }
                int i_11_;
                if (-1 == i_8_) {
                    GameClient.rectangles[GameClient.anInt8686 * -112139815].setBounds(x + 1354508417 * componentDefinition.x, y + componentDefinition.y * -749038817, componentDefinition.aspectWidth * -2093041337, 457937409 * componentDefinition.aspectHeight);
                    i_11_ = ((GameClient.anInt8686 += 1339395689) * -112139815 - 1);
                } else {
                    i_11_ = i_8_;
                }
                componentDefinition.anInt1303 = 1339690151 * i_11_;
                componentDefinition.tick = 488606259 * GameClient.clientTick;
                if (isHidden(componentDefinition)) {
                    if (0 != 0) {
                        break;
                    }
                } else {
                    if (componentDefinition.specialType != 0) {
                        drawReinaldsEmporium(componentDefinition);
                    }
                    int drawX = x + componentDefinition.x * 1354508417;
                    int drawY = -749038817 * componentDefinition.y + y;
                    int transparency = -1993792969 * componentDefinition.transparency;
                    if (GameClient.aBoolean8846 && ((GameClient.getComponentSettings(componentDefinition).settings * -1266165749) != 0 || componentDefinition.type * -1215239439 == CONTAINER) && transparency > 127) {
                        transparency = 127;
                    }
                    if (GameClient.fromIComponentDefinition == componentDefinition) {
                        if (parentID != -1 && ((-2087469725 * componentDefinition.dragRenderBehavior == anInt1206 * 1432814379) || (anInt1266 * 270446479 == componentDefinition.dragRenderBehavior * -2087469725) || GameClient.getComponentSettings(componentDefinition).method3496())) {
                            Class83.updatingWidgetComponents = widgetComponents;
                            Class216.anInt6660 = -643239899 * x;
                            LinkedList.anInt5518 = -882808615 * y;
                            continue;
                        }
                        if (GameClient.aBoolean8863 && GameClient.aBoolean8855) {
                            int i_15_ = AwtMouse.mouse.getLastX();
                            int i_16_ = AwtMouse.mouse.getLastY();
                            i_15_ -= -98735103 * GameClient.anInt8734;
                            i_16_ -= GameClient.anInt8853 * -938469429;
                            if (i_15_ < -343518257 * GameClient.anInt8856) {
                                i_15_ = -343518257 * GameClient.anInt8856;
                            }
                            if (-2093041337 * componentDefinition.aspectWidth + i_15_ > (GameClient.anInt8856 * -343518257 + GameClient.anInt8858 * -1221279965)) {
                                i_15_ = (GameClient.anInt8858 * -1221279965 + -343518257 * GameClient.anInt8856 - componentDefinition.aspectWidth * -2093041337);
                            }
                            if (i_16_ < GameClient.anInt8800 * 1325631359) {
                                i_16_ = GameClient.anInt8800 * 1325631359;
                            }
                            if (i_16_ + componentDefinition.aspectHeight * 457937409 > (-609231901 * GameClient.anInt8966 + 1325631359 * GameClient.anInt8800)) {
                                i_16_ = (GameClient.anInt8966 * -609231901 + GameClient.anInt8800 * 1325631359 - 457937409 * componentDefinition.aspectHeight);
                            }
                            if (GameClient.getComponentSettings(componentDefinition).method3496()) {
                                StaticMethods.method2112(i_15_, i_16_, (-2093041337 * componentDefinition.aspectWidth), (457937409 * componentDefinition.aspectHeight));
                            }
                            drawX = i_15_;
                            drawY = i_16_;
                        }
                        if (-2087469725 * componentDefinition.dragRenderBehavior == anInt1266 * 270446479) {
                            transparency = 128;
                        }
                    }
                    int i_17_;
                    int i_18_;
                    int i_19_;
                    int i_20_;
                    if (componentDefinition.type * -1215239439 == 2) {
                        i_17_ = clipX;
                        i_18_ = clipY;
                        i_19_ = width;
                        i_20_ = height;
                    } else {
                        int i_21_ = drawX + -2093041337 * componentDefinition.aspectWidth;
                        int i_22_ = drawY + componentDefinition.aspectHeight * 457937409;
                        if (componentDefinition.type * -1215239439 == LINE) {
                            i_21_++;
                            i_22_++;
                        }
                        i_17_ = drawX > clipX ? drawX : clipX;
                        i_18_ = drawY > clipY ? drawY : clipY;
                        i_19_ = i_21_ < width ? i_21_ : width;
                        i_20_ = i_22_ < height ? i_22_ : height;
                    }
                    if (i_17_ < i_19_) {
                        if (i_18_ >= i_20_) {
                            if (0 != 0) {
                                break;
                            }
                        } else {
                            if (componentDefinition.specialType != 0) {
                                if ((componentDefinition.specialType == BASIC_SCENE) || (componentDefinition.specialType == RESIZABLE_SCENE)) {
                                    SceneRenderer.drawScreenScene(drawX, drawY, componentDefinition.aspectWidth * -2093041337, 457937409 * componentDefinition.aspectHeight, RESIZABLE_SCENE == componentDefinition.specialType);
                                    Class182.method1846(i_11_, i_17_, i_18_, i_19_, i_20_, drawX, drawY);
                                    GameClient.activeGraphicsToolkit.resetClip();
                                    GameClient.activeGraphicsToolkit.setClip(clipX, clipY, width, height);
                                    GameClient.aBooleanArray8900[i_11_] = true;
                                    continue;
                                }
                                if ((componentDefinition.specialType == MINIMAP_AREA) && (GameClient.anInt8724 * 1596783995 == 3)) {
                                    if (componentDefinition.method1116(GameClient.activeGraphicsToolkit) != null) {
                                        StaticMethods.method2365();
                                        StaticMethods.drawMinimapArea(GameClient.activeGraphicsToolkit, componentDefinition, drawX, drawY, (byte) -75);
                                        GameClient.activeGraphicsToolkit.setClip(clipX, clipY, width, height);
                                    }
                                    continue;
                                }
                                if (componentDefinition.specialType == HSV_SLIDER_BOX) {
                                    Class12.method332((GameClient.activeGraphicsToolkit), drawX, drawY, componentDefinition, 546414546);
                                    continue;
                                }
                                if (componentDefinition.specialType == HSV_DIAGRAM_BOX) {
                                    Class455.method5958(GameClient.activeGraphicsToolkit, drawX, drawY, componentDefinition, (1045422783 * componentDefinition.color % 64), 273010603);
                                    continue;
                                }
                                if (componentDefinition.specialType == MINIMAP_COMPASS) {
                                    if (componentDefinition.method1116(GameClient.activeGraphicsToolkit) != null) {
                                        Class367.method4551(componentDefinition, drawX, drawY);
                                        GameClient.activeGraphicsToolkit.setClip(clipX, clipY, width, height);
                                    }
                                    continue;
                                }
                                if (componentDefinition.specialType == WORLD_MAP_AREA) {
                                    StaticMethods.method6047(GameClient.activeGraphicsToolkit, Js5Configs.texturesList, drawX, drawY, -2093041337 * componentDefinition.aspectWidth, 457937409 * componentDefinition.aspectHeight);
                                    GameClient.aBooleanArray8900[i_11_] = true;
                                    GameClient.activeGraphicsToolkit.setClip(clipX, clipY, width, height);
                                    continue;
                                }
                                if (componentDefinition.specialType == WORLD_MAP_OVERVIEW) {
                                    drawWorlMap(GameClient.activeGraphicsToolkit, drawX, drawY, -2093041337 * componentDefinition.aspectWidth, componentDefinition.aspectHeight * 457937409);
                                    GameClient.aBooleanArray8900[i_11_] = true;
                                    GameClient.activeGraphicsToolkit.setClip(clipX, clipY, width, height);
                                    continue;
                                }
                                if (componentDefinition.specialType == DEBUG_BLOCK) {
                                    if (GameClient.viewingFPS || GameClient.aBoolean8668) {
                                        StaticMethods.updateFPSCounter(drawX, drawY, componentDefinition, -1647202011);
                                        GameClient.aBooleanArray8900[i_11_] = true;
                                    }
                                    continue;
                                }
                            }
                            if (-1215239439 * componentDefinition.type == CONTAINER) {
                                if ((componentDefinition.specialType == UNKNOWN2) && GameClient.activeGraphicsToolkit.method5054()) {
                                    GameClient.activeGraphicsToolkit.method5056(drawX, drawY, componentDefinition.aspectWidth * -2093041337, 457937409 * componentDefinition.aspectHeight);
                                }
                                updateComponentType(widgetComponents, componentDefinition.interfaceHash * -440872681, i_17_, i_18_, i_19_, i_20_, drawX - (684246511 * componentDefinition.anInt1166), drawY - (-1424956747 * componentDefinition.anInt1167), i_11_, bool);
                                if (componentDefinition.containedComponents != null) {
                                    updateComponentType(componentDefinition.containedComponents, (-440872681 * componentDefinition.interfaceHash), i_17_, i_18_, i_19_, i_20_, drawX - (componentDefinition.anInt1166 * 684246511), (drawY - (-1424956747 * componentDefinition.anInt1167)), i_11_, bool);
                                }
                                Widget widget = ((Widget) (GameClient.linkedList.get((long) (componentDefinition.interfaceHash))));
                                if (null != widget) {
                                    Class448.method5912((-1617025021 * (widget.interfaceID)), i_17_, i_18_, i_19_, i_20_, drawX, drawY, i_11_);
                                }
                                if (componentDefinition.specialType == UNKNOWN2) {
                                    if (GameClient.activeGraphicsToolkit.method5054()) {
                                        GameClient.activeGraphicsToolkit.method5112();
                                    }
                                    if (0 == 1596783995 * GameClient.anInt8724) {
                                        int i_23_ = (-876396183 * GameClient.anInt8681);
                                        int i_24_ = GameClient.anInt8731 * 549822343;
                                        int i_25_ = 127441797 * GameClient.anInt8732;
                                        int i_26_ = (GameClient.anInt8720 * -1276156339);
                                        if (443738891 * GameClient.clientTick < (-230034171 * GameClient.anInt8737)) {
                                            float f = ((float) (((GameClient.clientTick) * 443738891) - (1757243277 * (GameClient.anInt8728))) * 1.0F / (float) (((GameClient.anInt8737) * -230034171) - ((GameClient.anInt8728) * 1757243277)));
                                            i_23_ = (int) (((1.0F - f) * (float) ((Class256.anInt2801) * -503104833)) + ((float) ((GameClient.anInt8681) * -876396183) * f));
                                            i_24_ = (int) (((float) ((GameClient.anInt8731) * 549822343) * f) + ((1.0F - f) * (float) (2068723003 * StaticMethods.anInt1321)));
                                            i_25_ = (int) (((1.0F - f) * (float) ((Class474.anInt5980) * 2047797063)) + ((float) (127441797 * (GameClient.anInt8732)) * f));
                                            i_26_ = (int) (((1.0F - f) * (float) (669602755 * (Class115.anInt1389))) + ((float) (-1276156339 * (GameClient.anInt8720)) * f));
                                        }
                                        if (i_23_ > 0) {
                                            GameClient.activeGraphicsToolkit.fillRectangle(i_17_, i_18_, i_19_ - i_17_, i_20_ - i_18_, (i_23_ << 24 | i_24_ << 16 | i_25_ << 8 | i_26_));
                                        }
                                    }
                                }
                                GameClient.activeGraphicsToolkit.setClip(clipX, clipY, width, height);
                            }
                            if (!GameClient.rectangleGreen[i_11_] && GameClient.anInt8956 * 2067224717 <= 1) {

                            } else if (componentDefinition.type * -1215239439 == RECTANGLE) {
                                if (transparency == 0) {
                                    if (componentDefinition.filled) {
                                        GameClient.activeGraphicsToolkit.drawFilledRectangle(drawX, drawY, (-2093041337 * componentDefinition.aspectWidth), (componentDefinition.aspectHeight * 457937409), (componentDefinition.color * 1045422783), 0);
                                    } else {
                                        GameClient.activeGraphicsToolkit.drawRectangle(drawX, drawY, (componentDefinition.aspectWidth * -2093041337), (componentDefinition.aspectHeight * 457937409), (1045422783 * componentDefinition.color), 0);
                                    }
                                } else if (componentDefinition.filled) {
                                    GameClient.activeGraphicsToolkit.drawFilledRectangle(drawX, drawY, componentDefinition.aspectWidth * -2093041337, 457937409 * componentDefinition.aspectHeight, (255 - (transparency & 0xFF) << 24 | ((componentDefinition.color * 1045422783) & 0xffffff)), 1);
                                } else {
                                    GameClient.activeGraphicsToolkit.drawRectangle(drawX, drawY, componentDefinition.aspectWidth * -2093041337, 457937409 * componentDefinition.aspectHeight, (255 - (transparency & 0xFF) << 24 | (componentDefinition.color * 1045422783) & 0xffffff), 1);
                                }
                            } else if ((-1215239439 * componentDefinition.type) == TEXT) {
                                FontToolkit font = (componentDefinition.getFontToolkit(StaticMethods5.fonts, GameClient.defaultFontRenderProvider, 1828077661));
                                if (font == null) {
                                    if (aBoolean1139) {
                                        StaticMethods.updateComponentTick(componentDefinition);
                                    }
                                } else {
                                    int color = componentDefinition.color * 1045422783;
                                    String text = componentDefinition.text;
                                    if (-1232467723 * componentDefinition.itemID != -1) {
                                        ItemDefinition item = (Js5Configs.itemList.getItemDefinitions((-1232467723 * componentDefinition.itemID)));
                                        text = item.name;
                                        if (text == null) {
                                            text = "null";
                                        }
                                        if (((789409129 * item.stackable) == 1 || 1 != (-66163287 * (componentDefinition.itemQuantity))) && (-1 != (-66163287 * componentDefinition.itemQuantity))) {
                                            text = new StringBuilder().append(ColorUtils.htmlToHex(16748608)).append(text).append(Class26.colorMessage).append(" posX").append(StaticMethods.method5866((componentDefinition.itemQuantity * -66163287))).toString();
                                        }
                                    }
                                    if (-1 != (-324971993 * componentDefinition.anInt1289)) {
                                        text = (StaticMethods.getComponentText((-324971993 * componentDefinition.anInt1289)));
                                        if (null == text) {
                                            text = "";
                                        }
                                    }
                                    if (componentDefinition == GameClient.loadingScreen) {
                                        text = (Tradution.PLEASE_WAIT.translate(GameLanguage.CURRENT_LANGUAGE));
                                        color = (1045422783 * componentDefinition.color);
                                    }
                                    if (GameClient.aBoolean8849) {
                                        GameClient.activeGraphicsToolkit.constrainClip(drawX, drawY, drawX + (componentDefinition.aspectWidth * -2093041337), (componentDefinition.aspectHeight * 457937409) + drawY);
                                    }
                                    if (componentDefinition.aBoolean1246) {//
                                        font.drawClientText(text, drawX, drawY, (componentDefinition.aspectWidth * -2093041337), (componentDefinition.aspectHeight * 457937409), (255 - (transparency & 0xff) << 24 | color), (componentDefinition.shadowed ? 255 - (transparency & 0xff) << 24 : -1), (componentDefinition.lineHAlign * 872550387), (-1594110459 * componentDefinition.lineVAlign), GameClient.lineHeight, (Class368.random * 1401020893), GameClient.anIntArray8899, (StaticMedia.nameIconSprites), null);
                                    } else {
                                        font.drawText(text, drawX, drawY, (componentDefinition.aspectWidth * -2093041337), (457937409 * componentDefinition.aspectHeight), (255 - (transparency & 0xff) << 24 | color), (componentDefinition.shadowed ? 255 - (transparency & 0xff) << 24 : -1), (872550387 * componentDefinition.lineHAlign), (componentDefinition.lineVAlign * -1594110459), (componentDefinition.lineHeight * 418216501), (536848259 * componentDefinition.maxLines), (StaticMedia.nameIconSprites), null, null, 0, 0);
                                    }
                                    if (GameClient.aBoolean8849) {
                                        GameClient.activeGraphicsToolkit.setClip(clipX, clipY, width, height);
                                    }
                                }
                            } else if (componentDefinition.type * -1215239439 == GRAPHIC) {
                                if (componentDefinition.anInt1283 * 925824753 >= 0) {
                                    componentDefinition.method1121(Js5Configs.configList, Class138_Sub1.configs).method2590(GameClient.activeGraphicsToolkit, 0, drawX, drawY, -2093041337 * componentDefinition.aspectWidth, 457937409 * componentDefinition.aspectHeight, (452780643 * componentDefinition.anInt1241 << 3), (componentDefinition.anInt1252 * -1889859235 << 3), 0, 0, -45056444);
                                } else {
                                    SpriteToolkit renderSprite;
                                    if (-1232467723 * componentDefinition.itemID != -1) {
                                        PlayerAppearance apperance = (componentDefinition.hasAppearance ? (Player.myPlayer.appearance) : null);
                                        renderSprite = (Js5Configs.itemList.method6085(GameClient.activeGraphicsToolkit, (componentDefinition.itemID * -1232467723), (componentDefinition.itemQuantity * -66163287), (componentDefinition.outline * 547522005), (~0xffffff | (-2065110161 * componentDefinition.shadow)), (2097772641 * componentDefinition.anInt1201), apperance));
                                    } else if ((-324971993 * componentDefinition.anInt1289) != -1) {
                                        renderSprite = (Class23.method376(GameClient.activeGraphicsToolkit, (-324971993 * componentDefinition.anInt1289)));
                                    } else {
                                        renderSprite = (componentDefinition.createSprite(GameClient.activeGraphicsToolkit));
                                    }
                                    if (renderSprite != null) {
                                        int i_28_ = renderSprite.getPaddedWidth();
                                        int i_29_ = renderSprite.getPaddedHeight();
                                        int color = (255 - (transparency & 0xff) << 24 | (0 != (componentDefinition.color * 1045422783) ? ((1045422783 * componentDefinition.color) & 0xffffff) : 16777215));
                                        if (componentDefinition.tiling) {
                                            GameClient.activeGraphicsToolkit.constrainClip(drawX, drawY, (drawX + (componentDefinition.aspectWidth * -2093041337)), drawY + (457937409 * (componentDefinition.aspectHeight)));
                                            if ((componentDefinition.angle2D * 840270937) != 0) {
                                                int i_31_ = (((componentDefinition.aspectWidth * -2093041337) + (i_28_ - 1)) / i_28_);
                                                int i_32_ = (((componentDefinition.aspectHeight * 457937409) + (i_29_ - 1)) / i_29_);
                                                for (int i_33_ = 0; i_33_ < i_31_; i_33_++) {
                                                    for (int i_34_ = 0; i_34_ < i_32_; i_34_++) {
                                                        if (0 != (1045422783 * (componentDefinition.color))) {
                                                            renderSprite.method686(((float) (drawX + i_33_ * i_28_) + ((float) i_28_ / 2.0F)), (((float) i_29_ / 2.0F) + (float) (i_29_ * i_34_ + drawY)), 4096, ((componentDefinition.angle2D) * 840270937), 0, color, 1);
                                                        } else {
                                                            renderSprite.drawRotatedScaled(((float) (drawX + i_28_ * i_33_) + ((float) i_28_ / 2.0F)), (((float) i_29_ / 2.0F) + (float) (drawY + i_29_ * i_34_)), 4096, (840270937 * (componentDefinition.angle2D)));
                                                        }
                                                    }
                                                }
                                            } else if (((1045422783 * (componentDefinition.color)) != 0) || transparency != 0) {
                                                renderSprite.method694(drawX, drawY, (-2093041337 * (componentDefinition.aspectWidth)), (componentDefinition.aspectHeight * 457937409), 0, color, 1);
                                            } else {
                                                renderSprite.drawRepeat(drawX, drawY, (-2093041337 * (componentDefinition.aspectWidth)), (componentDefinition.aspectHeight * 457937409));
                                            }
                                            GameClient.activeGraphicsToolkit.setClip(clipX, clipY, width, height);
                                        } else if (((1045422783 * componentDefinition.color) != 0) || 0 != transparency) {
                                            if (0 != (840270937 * componentDefinition.angle2D)) {
                                                renderSprite.method686((((float) ((componentDefinition.aspectWidth) * -2093041337) / 2.0F) + (float) drawX), ((float) drawY + ((float) ((componentDefinition.aspectHeight) * 457937409) / 2.0F)), (-342593536 * componentDefinition.aspectWidth / i_28_), (componentDefinition.angle2D * 840270937), 0, color, 1);
                                            } else if ((i_28_ != (-2093041337 * (componentDefinition.aspectWidth))) || (((componentDefinition.aspectHeight) * 457937409) != i_29_)) {
                                                renderSprite.method691(drawX, drawY, (-2093041337 * (componentDefinition.aspectWidth)), (457937409 * (componentDefinition.aspectHeight)), 0, color, 1);
                                            } else {
                                                renderSprite.draw(drawX, drawY, 0, color, 1);
                                            }
                                        } else if ((componentDefinition.angle2D * 840270937) != 0) {
                                            renderSprite.drawRotatedScaled(((float) ((componentDefinition.aspectWidth) * -2093041337) / 2.0F) + (float) drawX, ((float) (457937409 * (componentDefinition.aspectHeight)) / 2.0F) + (float) drawY, (componentDefinition.aspectWidth * -342593536 / i_28_), (840270937 * componentDefinition.angle2D));
                                        } else if ((componentDefinition.aspectWidth * -2093041337) != i_28_ || (i_29_ != (457937409 * (componentDefinition.aspectHeight)))) {
                                            renderSprite.drawScaled(drawX, drawY, (-2093041337 * componentDefinition.aspectWidth), (componentDefinition.aspectHeight * 457937409));
                                        } else {
                                            renderSprite.draw(drawX, drawY);
                                        }
                                    } else if (aBoolean1139) {
                                        StaticMethods.updateComponentTick(componentDefinition);
                                    }
                                }
                            } else if ((componentDefinition.type * -1215239439) == ANIMABLE) {
                                GameClient.myRegion.getLightningDetails().setDefaults();
                                ModelToolkit model = null;
                                int flag = 2048;
                                if (componentDefinition.animationID * 1054312299 != 0) {
                                    flag |= 0x80000;
                                }
                                int i_36_ = 0;
                                if (componentDefinition.itemID * -1232467723 != -1) {
                                    ItemDefinition item = (Js5Configs.itemList.getItemDefinitions((componentDefinition.itemID * -1232467723)));
                                    if (item != null) {
                                        item = (item.getItem((componentDefinition.itemQuantity * -66163287)));
                                        model = (item.drawPlayerEquipmentItems(GameClient.activeGraphicsToolkit, flag, 1, (componentDefinition.hasAppearance ? (Player.myPlayer.appearance) : null), componentDefinition.animator, 0, 0, 0, 0));
                                        if (model != null) {
                                            i_36_ = -model.YA() >> 1;
                                        } else {
                                            StaticMethods.updateComponentTick(componentDefinition);
                                        }
                                    }
                                } else if ((1548853569 * componentDefinition.modelType) == MODELTYPE_PLAYER) {
                                    int playerIndex = componentDefinition.modelID * 572201537;
                                    if (playerIndex >= 0 && playerIndex < 2048) {
                                        Player player = (GameClient.entities[playerIndex]);
                                        if ((player != null) && (((-442628795 * GameClient.playerIndex) == playerIndex) || ((Class525.method6379((player.accountName))) == (1148770405 * (componentDefinition.hashcode))))) {
                                            model = (componentDefinition.retrieveModels(GameClient.activeGraphicsToolkit, flag, Class94.aClass349_913, (Js5Configs.idkList), NPCDefinitionLoader.npcList, (Js5Configs.itemList), (Class128.playerVarsProvider), (componentDefinition.animator), (player.appearance)));
                                            if (null == model && aBoolean1139) {
                                                StaticMethods.updateComponentTick(componentDefinition);
                                            }
                                        }
                                    }
                                } else if (componentDefinition.modelType * 1548853569 == 5) {
                                    int playerIndex = 572201537 * componentDefinition.modelID;
                                    if (playerIndex >= 0 && playerIndex < 2048) {
                                        Player player = (GameClient.entities[playerIndex]);
                                        if ((player != null) && (playerIndex == (GameClient.playerIndex * -442628795) || ((Class525.method6379((player.accountName))) == (componentDefinition.hashcode * 1148770405)))) {
                                            model = (player.appearance.method4545(GameClient.activeGraphicsToolkit, flag, Class94.aClass349_913, (Js5Configs.idkList), NPCDefinitionLoader.npcList, (Js5Configs.itemList), (Class128.playerVarsProvider), (componentDefinition.animator), null, null, null, 0, true, (EquipmentDefaults.defaults)));
                                        }
                                    }
                                } else if ((componentDefinition.modelType * 1548853569) == 8 || (componentDefinition.modelType * 1548853569) == 9) {
                                    Class298_Sub9 class298_sub9 = (StaticMethods.method2437(572201537 * componentDefinition.modelID, false));
                                    if (null != class298_sub9) {
                                        model = (class298_sub9.method2891(GameClient.activeGraphicsToolkit, flag, componentDefinition.animator, (1148770405 * componentDefinition.hashcode), (componentDefinition.modelType * 1548853569) == 9, (componentDefinition.hasAppearance ? (Player.myPlayer.appearance) : null)));
                                    }
                                } else if (null == componentDefinition.animator || !(componentDefinition.animator.hasAnimationDefinition())) {
                                    model = (componentDefinition.retrieveModels(GameClient.activeGraphicsToolkit, flag, Class94.aClass349_913, Js5Configs.idkList, NPCDefinitionLoader.npcList, (Js5Configs.itemList), Class128.playerVarsProvider, null, (Player.myPlayer.appearance)));
                                    if (null == model && aBoolean1139) {
                                        StaticMethods.updateComponentTick(componentDefinition);
                                    }
                                } else {
                                    model = (componentDefinition.retrieveModels(GameClient.activeGraphicsToolkit, flag, Class94.aClass349_913, Js5Configs.idkList, NPCDefinitionLoader.npcList, (Js5Configs.itemList), Class128.playerVarsProvider, componentDefinition.animator, (Player.myPlayer.appearance)));
                                    if (null == model && aBoolean1139) {
                                        StaticMethods.updateComponentTick(componentDefinition);
                                    }
                                }
                                if (model != null) {
                                    if (1054312299 * componentDefinition.animationID != 0) {
                                        model.PA((componentDefinition.anInt1278 * -2138135813), (componentDefinition.anInt1207 * 118945837), (componentDefinition.anInt1208 * -288544823), (componentDefinition.animationID * 1054312299));
                                    }
                                    int projWidth;
                                    if (componentDefinition.viewportWidth * -692202853 > 0) {
                                        projWidth = (((-2093041337 * componentDefinition.aspectWidth) << 9) / (-692202853 * componentDefinition.viewportWidth));
                                    } else {
                                        projWidth = 512;
                                    }
                                    int projHeight;
                                    if (componentDefinition.viewportHeight * 302318939 > 0) {
                                        projHeight = (((457937409 * componentDefinition.aspectHeight) << 9) / (componentDefinition.viewportHeight * 302318939));
                                    } else {
                                        projHeight = 512;
                                    }
                                    int projX = (drawX + (-2093041337 * componentDefinition.aspectWidth / 2));
                                    int projY = drawY + (componentDefinition.aspectHeight * 457937409 / 2);
                                    if (!componentDefinition.overview) {
                                        projX += projWidth * (componentDefinition.originX * 1412474881) >> 9;
                                        projY += (projHeight * (-1674106223 * (componentDefinition.originY)) >> 9);
                                    }
                                    GameClient.cameraMatrix.method2460();
                                    GameClient.activeGraphicsToolkit.cw(GameClient.cameraMatrix);
                                    Matrix4f projection = GameClient.activeGraphicsToolkit.cz();
                                    int zNear = GameClient.myRegion.getZNear();
                                    int zFar = GameClient.myRegion.getZFar();
                                    if (componentDefinition.orthogonal) {
                                        if (componentDefinition.overview) {
                                            projection.setOrthographic((float) projX, (float) projY, (float) projWidth, (float) projHeight, (float) zNear, (float) zFar, (float) ((GameShell.canvasWidth) * -2110394505), (float) ((GameShell.canvasHeight) * -1111710645), (float) ((componentDefinition.zoom) * -261021353));
                                        } else {
                                            projection.setOrthographic((float) projX, (float) projY, (float) projWidth, (float) projHeight, (float) zNear, (float) zFar, (float) ((GameShell.canvasWidth) * -2110394505), (float) ((GameShell.canvasHeight) * -1111710645), (float) (((componentDefinition.zoom) * -261021353) << 2));
                                        }
                                    } else {
                                        projection.setProjection((float) projX, (float) projY, (float) projWidth, (float) projHeight, (float) zNear, (float) zFar, (float) (-2110394505 * (GameShell.canvasWidth)), (float) (-1111710645 * (GameShell.canvasHeight)));
                                    }
                                    GameClient.activeGraphicsToolkit.ci(projection);
                                    GameClient.activeGraphicsToolkit.clear(2, 0);
                                    if (componentDefinition.rawDepth) {
                                        GameClient.activeGraphicsToolkit.RA(false);
                                    }
                                    if (componentDefinition.overview) {
                                        GameClient.modelMatrix.method2473(1.0F, 0.0F, 0.0F, (CircleAngleTable.toDegrees(componentDefinition.xAngle * 7329457)));
                                        GameClient.modelMatrix.rotate(0.0F, 1.0F, 0.0F, (CircleAngleTable.toDegrees(-1086526073 * componentDefinition.yAngle)));
                                        GameClient.modelMatrix.rotate(0.0F, 0.0F, 1.0F, (CircleAngleTable.toDegrees(1004185785 * componentDefinition.zAngle)));
                                        GameClient.modelMatrix.translate((float) (componentDefinition.originX * 1412474881), (float) (componentDefinition.originY * -1674106223), (float) (-1491626287 * (componentDefinition.originZ)));
                                    } else {
                                        int i_45_ = (((CircleAngleTable.SINE[((7329457 * componentDefinition.xAngle) << 3)]) * ((-261021353 * componentDefinition.zoom) << 2)) >> 14);
                                        int i_46_ = (((CircleAngleTable.COSINE[(componentDefinition.xAngle * 7329457) << 3]) * ((componentDefinition.zoom * -261021353) << 2)) >> 14);
                                        GameClient.modelMatrix.method2473(0.0F, 0.0F, 1.0F, (CircleAngleTable.toDegrees(-(componentDefinition.zAngle * 1004185785) << 3)));
                                        GameClient.modelMatrix.rotate(0.0F, 1.0F, 0.0F, (CircleAngleTable.toDegrees((-1086526073 * componentDefinition.yAngle) << 3)));
                                        GameClient.modelMatrix.translate((float) ((componentDefinition.xOffset * -407676483) << 2), (float) (i_36_ + (i_45_ + ((-1523987341 * (componentDefinition.yOffset)) << 2))), (float) (i_46_ + (((componentDefinition.yOffset) * -1523987341) << 2)));
                                        GameClient.modelMatrix.rotate(1.0F, 0.0F, 0.0F, (CircleAngleTable.toDegrees(componentDefinition.xAngle * 7329457 << 3)));
                                    }
                                    componentDefinition.prepareParticles(GameClient.activeGraphicsToolkit, model, GameClient.modelMatrix, 443738891 * GameClient.clientTick);
                                    if (GameClient.aBoolean8849) {
                                        GameClient.activeGraphicsToolkit.constrainClip(drawX, drawY, (drawX + (-2093041337 * componentDefinition.aspectWidth)), drawY + (componentDefinition.aspectHeight * 457937409));
                                    }
                                    model.render((GameClient.modelMatrix), null, 1);
                                    if (!componentDefinition.orthogonal && componentDefinition.particles != null) {
                                        GameClient.activeGraphicsToolkit.renderParticles(componentDefinition.particles.validateParticles());
                                    }
                                    if (GameClient.aBoolean8849) {
                                        GameClient.activeGraphicsToolkit.setClip(clipX, clipY, width, height);
                                    }
                                    if (componentDefinition.rawDepth) {
                                        GameClient.activeGraphicsToolkit.RA(true);
                                    }
                                }
                            } else if (componentDefinition.type * -1215239439 == LINE) {
                                int cWidth;
                                int cHeight;
                                int endX;
                                int endY;
                                if (componentDefinition.aBoolean1174) {
                                    cWidth = drawX;
                                    cHeight = drawY + (457937409 * componentDefinition.aspectHeight);
                                    endX = (componentDefinition.aspectWidth * -2093041337 + drawX);
                                    endY = drawY;
                                } else {
                                    cWidth = drawX;
                                    cHeight = drawY;
                                    endX = (-2093041337 * componentDefinition.aspectWidth + drawX);
                                    endY = drawY + (457937409 * componentDefinition.aspectHeight);
                                }
                                if (1 == -1753054445 * componentDefinition.lineWidth) {
                                    GameClient.activeGraphicsToolkit.drawDiagonalLine(cWidth, cHeight, endX, endY, componentDefinition.color * 1045422783, 0);
                                } else {
                                    GameClient.activeGraphicsToolkit.drawThickDiagonalLine(cWidth, cHeight, endX, endY, componentDefinition.color * 1045422783, componentDefinition.lineWidth * -1753054445, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static final void method5578(IComponentDefinition[] widget, int parentID) {
        for (int componentID = 0; componentID < widget.length; componentID++) {
            IComponentDefinition component = widget[componentID];
            if (null == component) {

            } else if (parentID != component.parentID) {

            } else if (isHidden(component)) {

            } else {
                if (CONTAINER == -1215239439 * component.type) {
                    method5578(widget, component.interfaceHash);
                    if (component.containedComponents != null) {
                        method5578(component.containedComponents, component.interfaceHash);
                    }
                    Widget class298_sub51 = ((Widget) (GameClient.linkedList.get((long) (component.interfaceHash))));
                    if (class298_sub51 != null) {
                        StaticMethods.method5884((-1617025021 * class298_sub51.interfaceID));
                    }
                }
                if (ANIMABLE == component.type * -1215239439 && component.animId * 1347982601 != -1) {
                    if (component.animator == null) {
                        component.animator = new SimpleAnimation();
                        component.animator.load(1347982601 * component.animId);
                    }
                    if (component.animator.method5981(((GameClient.animatorTick) * 614680345)) && component.animator.method5978()) {
                        component.animator.method5979();
                    }
                }
            }
        }
    }

    public static final IComponentDefinition method6331(IComponentDefinitionCollection IComponentDefinitionCollection, IComponentDefinition componentDefinition) {
        if (-1 != componentDefinition.parentID) {
            return IComponentDefinitionCollection.componentWithinInterface(componentDefinition.parentID);
        }
        if (!IComponentDefinitionCollection.accessed) {
            int i_4_ = componentDefinition.interfaceHash >>> 16;
            Class460 class460 = new Class460(GameClient.linkedList);
            for (Widget widgetExtendingNodes = (Widget) class460.method5979(-2012602178); null != widgetExtendingNodes; widgetExtendingNodes = (Widget) class460.next()) {
                if (-1617025021 * widgetExtendingNodes.interfaceID == i_4_) {
                    return getInterfaceComponent((int) (7051297995265073167L * (widgetExtendingNodes.key)));
                }
            }
        }
        return null;
    }

    static boolean isHidden(IComponentDefinition component) {
        if (GameClient.aBoolean8846) {
            if (GameClient.getComponentSettings(component).settings * -1266165749 != 0) {
                return false;
            }
            if (-1215239439 * component.type == IComponentDefinition.CONTAINER) {
                return false;
            }
        }
        return component.hidden;
    }

    public static final void updateHiddenComponents(IComponentDefinitionCollection IComponentDefinitionCollection, IComponentDefinition[] widgetComponents, int parentID, int x, int y, int width, int height, int i_57_, int i_58_, int i_59_, int i_60_) {
        for (int componentID = 0; componentID < widgetComponents.length; componentID++) {
            IComponentDefinition componentDefinition = widgetComponents[componentID];
            if (componentDefinition != null && componentDefinition.parentID == parentID) {
                int drawX = 1354508417 * componentDefinition.x + i_57_;
                int drawY = -749038817 * componentDefinition.y + i_58_;
                int bx;
                int by;
                int bWidth;
                int bHeight;
                if (-1215239439 * componentDefinition.type == CS2) {
                    bx = x;
                    by = y;
                    bWidth = width;
                    bHeight = height;
                } else {
                    int cWidth = -2093041337 * componentDefinition.aspectWidth + drawX;
                    int cHeight = componentDefinition.aspectHeight * 457937409 + drawY;
                    if (-1215239439 * componentDefinition.type == LINE) {
                        cWidth++;
                        cHeight++;
                    }
                    bx = drawX > x ? drawX : x;
                    by = drawY > y ? drawY : y;
                    bWidth = cWidth < width ? cWidth : width;
                    bHeight = cHeight < height ? cHeight : height;
                }
                if (-1215239439 * componentDefinition.type != CONTAINER && !componentDefinition.hasScript && GameClient.getComponentSettings(componentDefinition).settings * -1266165749 == 0 && GameClient.aClass105_8712 != componentDefinition && (componentDefinition.specialType != MINIMAP_AREA) && (UNKNOWN1 != componentDefinition.specialType) && (BASIC_SCENE != componentDefinition.specialType) && (componentDefinition.specialType != RESIZABLE_SCENE)) {
                    if (bx < bWidth && by < bHeight) {
                        GameContext.method5577(componentDefinition);
                    }
                } else if (!IComponentDefinition.isHidden(componentDefinition)) {
                    if (GameClient.fromIComponentDefinition == componentDefinition && Class419.method5603(GameClient.fromIComponentDefinition)) {
                        GameClient.aBoolean8938 = true;
                        GameClient.anInt8861 = drawX * -1501079155;
                        GameClient.anInt8862 = -1873720993 * drawY;
                    }
                    if (componentDefinition.aBoolean1220 || bx < bWidth && by < bHeight) {
                        if (componentDefinition.noClickThrough && i_59_ >= bx && i_60_ >= by && i_59_ < bWidth && i_60_ < bHeight) {
                            for (ScriptNode scriptNode = ((ScriptNode) GameClient.aClass453_8893.method5939()); scriptNode != null; scriptNode = ((ScriptNode) GameClient.aClass453_8893.method5944())) {
                                if (scriptNode.aBoolean7533) {
                                    scriptNode.unlink();
                                    scriptNode.aClass105_7525.aBoolean1294 = false;
                                }
                            }
                            if (0 == Class82_Sub22.anInt6917 * 379282043) {
                                GameClient.fromIComponentDefinition = null;
                                GameClient.aClass105_8712 = null;
                            }
                            GameClient.anInt8864 = 0;
                            Class301_Sub1.aBoolean7628 = false;
                            GameClient.aBoolean8866 = false;
                            if (!GameClient.menuOpen) {
                                StaticMethods.closeMenus();
                            }
                        }
                        boolean clickablePlainSprite = (componentDefinition.clickable && componentDefinition.type * -1215239439 == GRAPHIC && componentDefinition.transparency * -1993792969 == 0 && componentDefinition.anInt1283 * 925824753 < 0 && -1232467723 * componentDefinition.itemID == -1 && -1 == componentDefinition.anInt1289 * -324971993 && !componentDefinition.tiling && 840270937 * componentDefinition.angle2D == 0);
                        boolean bool_70_ = false;
                        if ((AwtMouse.mouse.getLastX() >= bx) && (AwtMouse.mouse.getLastY() >= by) && (AwtMouse.mouse.getLastX() < bWidth) && (AwtMouse.mouse.getLastY() < bHeight)) {
                            if (clickablePlainSprite) {
                                Class117 class117 = componentDefinition.method1116((GameClient.activeGraphicsToolkit));
                                if (class117 == null || (componentDefinition.aspectWidth * -2093041337 != class117.anInt1393 * 1633695381) || (class117.anInt1394 * -60174999 != 457937409 * componentDefinition.aspectHeight)) {
                                    bool_70_ = true;
                                } else {
                                    int i_71_ = (AwtMouse.mouse.getLastX() - drawX);
                                    int i_72_ = (AwtMouse.mouse.getLastY() - drawY);
                                    if (i_72_ >= 0 && i_72_ < (class117.anIntArray1396).length) {
                                        int i_73_ = class117.anIntArray1396[i_72_];
                                        if (i_71_ >= i_73_ && (i_71_ <= i_73_ + (class117.anIntArray1395[i_72_]))) {
                                            bool_70_ = true;
                                        }
                                    }
                                }
                            } else {
                                bool_70_ = true;
                            }
                        }
                        if (!GameClient.interfaceSelected && bool_70_) {
                            if (componentDefinition.mouseOverCursor * -1200030067 >= 0) {
                                GameClient.targetLeaveCursor = componentDefinition.mouseOverCursor * -133568665;
                            } else if (componentDefinition.noClickThrough) {
                                GameClient.targetLeaveCursor = 280458557;
                            }
                        }
                        if (!GameClient.menuOpen && bool_70_ && !IComponentDefinitionCollection.accessed) {
                            StaticMethods.method971(componentDefinition, i_59_ - drawX, i_60_ - drawY, -1958017189);
                        }
                        boolean bool_74_ = false;
                        if (AwtMouse.mouse.method3878() && bool_70_) {
                            bool_74_ = true;
                        }
                        boolean bool_75_ = false;
                        MouseRecord class298_sub50 = ((MouseRecord) GameClient.mouseRecords.method5939());
                        if (null != class298_sub50 && class298_sub50.getMouseType() == 0 && class298_sub50.getMouseX() >= bx && class298_sub50.getMouseY() >= by && class298_sub50.getMouseX() < bWidth && (class298_sub50.getMouseY() < bHeight)) {
                            if (clickablePlainSprite) {
                                Class117 class117 = componentDefinition.method1116((GameClient.activeGraphicsToolkit));
                                if (class117 == null || (-2093041337 * componentDefinition.aspectWidth != 1633695381 * class117.anInt1393) || (class117.anInt1394 * -60174999 != componentDefinition.aspectHeight * 457937409)) {
                                    bool_75_ = true;
                                } else {
                                    int i_76_ = (class298_sub50.getMouseX() - drawX);
                                    int i_77_ = (class298_sub50.getMouseY() - drawY);
                                    if (i_77_ >= 0 && i_77_ < (class117.anIntArray1396).length) {
                                        int i_78_ = class117.anIntArray1396[i_77_];
                                        if (i_76_ >= i_78_ && i_76_ <= (class117.anIntArray1395[i_77_]) + i_78_) {
                                            bool_75_ = true;
                                        }
                                    }
                                }
                            } else {
                                bool_75_ = true;
                            }
                        }
                        if (componentDefinition.aByteArray1185 != null && !Class423.method5734()) {
                            for (int i_79_ = 0; i_79_ < componentDefinition.aByteArray1185.length; i_79_++) {
                                if (!AwtKeyboard.keyboard.held(componentDefinition.aByteArray1185[i_79_])) {
                                    if (componentDefinition.anIntArray1305 != null) {
                                        componentDefinition.anIntArray1305[i_79_] = 0;
                                    }
                                } else if (componentDefinition.anIntArray1305 == null || (443738891 * GameClient.clientTick >= (componentDefinition.anIntArray1305[i_79_]))) {
                                    byte i_80_ = componentDefinition.aByteArray1222[i_79_];
                                    if (0 == i_80_ || (((i_80_ & 0x8) == 0 || (!(AwtKeyboard.keyboard.held(86)) && !(AwtKeyboard.keyboard.held(82)) && !(AwtKeyboard.keyboard.held(81)))) && ((i_80_ & 0x2) == 0 || (AwtKeyboard.keyboard.held(86))) && (0 == (i_80_ & 0x1) || (AwtKeyboard.keyboard.held(82))) && ((i_80_ & 0x4) == 0 || (AwtKeyboard.keyboard.held(81))))) {
                                        if (i_79_ < 10) {
                                            Class301_Sub1.method3713(i_79_ + 1, (componentDefinition.interfaceHash), (componentDefinition.slot * -1309843523), "");
                                        } else if (10 == i_79_) {
                                            method1587();
                                            IComponentSettings IComponentSettings = GameClient.getComponentSettings(componentDefinition);
                                            StaticMethods.method1600(componentDefinition, IComponentSettings.method3497(), (IComponentSettings.anInt7410 * -1133219011));
                                            GameClient.selectedInterfaceOption = (Class88.method977(componentDefinition, -1213150980));
                                            if (GameClient.selectedInterfaceOption == null) {
                                                GameClient.selectedInterfaceOption = "Null";
                                            }
                                            GameClient.aString8754 = new StringBuilder().append(componentDefinition.opBase).append(ColorUtils.htmlToHex(16777215)).toString();
                                        }
                                        int i_81_ = componentDefinition.anIntArray1276[i_79_];
                                        if (componentDefinition.anIntArray1305 == null) {
                                            componentDefinition.anIntArray1305 = (new int[(componentDefinition.aByteArray1185).length]);
                                        }
                                        if (0 != i_81_) {
                                            componentDefinition.anIntArray1305[i_79_] = (i_81_ + 443738891 * GameClient.clientTick);
                                        } else {
                                            componentDefinition.anIntArray1305[i_79_] = 2147483647;
                                        }
                                    }
                                }
                            }
                        }
                        if (bool_75_) {
                            Class523.method6330(componentDefinition, class298_sub50.getMouseX() - drawX, class298_sub50.getMouseY() - drawY);
                        }
                        if (GameClient.fromIComponentDefinition != null && GameClient.fromIComponentDefinition != componentDefinition && bool_70_ && GameClient.getComponentSettings(componentDefinition).method3494()) {
                            GameClient.toIComponentDefinition = componentDefinition;
                        }
                        if (GameClient.aClass105_8712 == componentDefinition) {
                            GameClient.aBoolean8855 = true;
                            GameClient.anInt8856 = 1246614319 * drawX;
                            GameClient.anInt8800 = drawY * -429639553;
                            GameClient.anInt8858 = -1332645491 * GameClient.aClass105_8712.aspectWidth;
                            GameClient.anInt8966 = -85522485 * GameClient.aClass105_8712.aspectHeight;
                        }
                        if (componentDefinition.hasScript || componentDefinition.specialType != 0) {
                            if (bool_70_ && 0 != GameClient.anInt8682 * 1170859143 && componentDefinition.onScrollWheelHook != null) {
                                ScriptNode scriptNode = new ScriptNode();
                                scriptNode.aBoolean7533 = true;
                                scriptNode.aClass105_7525 = componentDefinition;
                                scriptNode.anInt7527 = -1937115609 * GameClient.anInt8682;
                                scriptNode.parameters = componentDefinition.onScrollWheelHook;
                                GameClient.aClass453_8893.pushBack(scriptNode);
                            }
                            if (GameClient.fromIComponentDefinition != null) {
                                bool_75_ = false;
                                bool_74_ = false;
                            } else if (GameClient.menuOpen || (componentDefinition.specialType !=  WORLD_MAP_AREA) && GameClient.anInt8864 * -651858367 > 0) {
                                bool_75_ = false;
                                bool_74_ = false;
                                bool_70_ = false;
                            }
                            if (componentDefinition.specialType != 0) {
                                if ((BASIC_SCENE == componentDefinition.specialType) || (componentDefinition.specialType == RESIZABLE_SCENE)) {
                                    GameClient.currentSceneComponent = componentDefinition;
                                    Atmosphere atmosphere = GameClient.myRegion.getLightningDetails().getAtmosphere();
                                    if ((atmosphere.getSkybox() != null) && !Class62.aClass248_612.method2380()) {
                                        atmosphere.getSkybox().method2588(GameClient.activeGraphicsToolkit, componentDefinition.aspectHeight * 457937409, SettingsManager.settingsManager.skybox.getValue());
                                    }
                                    if ((BASIC_SCENE == componentDefinition.specialType) && !GameClient.menuOpen && i_59_ >= bx && i_60_ >= by && i_59_ < bWidth && i_60_ < bHeight) {
                                        StaticMethods.updateSceneRenderOptions((GameClient.activeGraphicsToolkit), i_59_, i_60_, 132816560);
                                        for (Class302_Sub5 class302_sub5 = ((Class302_Sub5) (GameClient.aClass442_8781.method5868())); null != class302_sub5; class302_sub5 = ((Class302_Sub5) (GameClient.aClass442_8781.method5872()))) {
                                            if (i_59_ >= (-1082644483 * (class302_sub5.anInt7659)) && i_59_ < (-989655965 * (class302_sub5.anInt7664)) && i_60_ >= ((class302_sub5.anInt7663) * 614770279) && i_60_ < (-252204233 * (class302_sub5.anInt7665))) {
                                                StaticMethods.closeMenus();
                                                Class91.method1001((class302_sub5.aClass365_Sub1_Sub1_Sub2_7660));
                                            }
                                        }
                                    }
                                    int size = Class10.entitiesInRegion * 1168366243;
                                    int[] players = Class10.players;
                                    for (int playerIndex = 0; playerIndex < size; playerIndex++) {
                                        Player player = (GameClient.entities[players[playerIndex]]);
                                        if (null != player) {
                                            Class62.method729(CS2Context.aClass502_6716, -1, -1, player, players[playerIndex]);
                                            player.method4413(bx, by, bWidth, bHeight, drawX - (componentDefinition.anInt1166 * 684246511), drawY - (componentDefinition.anInt1167 * -1424956747), i_59_, i_60_);
                                        }
                                    }
                                    for (int index = 0; index < -1230451913 * GameClient.entitySize; index++) {
                                        int i_85_ = GameClient.entityKeys[index];
                                        ObjectNode node = ((ObjectNode) GameClient.entityList.get((long) i_85_));
                                        if (null != node) {
                                            Class62.method729(CS2Context.aClass502_6720, (-407713023 * (((NPC) (node.nodeObject)).aClass503_10190.typeID)), -1, ((Entity) node.nodeObject), i_85_);
                                            ((Entity) node.nodeObject).method4413(bx, by, bWidth, bHeight, drawX - (componentDefinition.anInt1166 * 684246511), drawY - (componentDefinition.anInt1167 * -1424956747), i_59_, i_60_);
                                        }
                                    }
                                    continue;
                                }
                                if (MINIMAP_AREA == componentDefinition.specialType) {
                                    Class117 class117 = componentDefinition.method1116((GameClient.activeGraphicsToolkit));
                                    if (class117 != null && (0 == -64305285 * Minimap.anInt56 || Minimap.anInt56 * -64305285 == 3) && !GameClient.menuOpen && i_59_ >= bx && i_60_ >= by && i_59_ < bWidth && i_60_ < bHeight) {
                                        int i_86_ = i_59_ - drawX;
                                        int i_87_ = i_60_ - drawY;
                                        int i_88_ = class117.anIntArray1396[i_87_];
                                        if (i_86_ >= i_88_ && i_86_ <= (class117.anIntArray1395[i_87_]) + i_88_) {
                                            i_86_ -= (componentDefinition.aspectWidth * -2093041337 / 2);
                                            i_87_ -= (457937409 * componentDefinition.aspectHeight / 2);
                                            int xAngle;
                                            if ((-863531439 * CameraUtils.cameraType) == CameraUtils.FREE_FORM) {
                                                xAngle = ((int) GameClient.cameraXAngle & 0x3fff);
                                            } else {
                                                xAngle = (((int) GameClient.cameraXAngle + (GameClient.anInt8801 * 1227356013)) & 0x3fff);
                                            }
                                            int i_90_ = (CircleAngleTable.SINE[xAngle]);
                                            int i_91_ = (CircleAngleTable.COSINE[xAngle]);
                                            if ((CameraUtils.cameraType * -863531439) != CameraUtils.FREE_FORM ) {
                                                i_90_ = ((256 + (356727603 * GameClient.anInt8749)) * i_90_) >> 8;
                                                i_91_ = (GameClient.anInt8749 * 356727603 + 256) * i_91_ >> 8;
                                            }
                                            int i_92_ = ((i_86_ * i_91_ + i_87_ * i_90_) >> 14);
                                            int i_93_ = ((i_87_ * i_91_ - i_90_ * i_86_) >> 14);
                                            int transformX;
                                            int transformZ;
                                            if (-863531439 * (CameraUtils.cameraType)  == CameraUtils.FREE_FORM) {
                                                transformX = (-2080858977 * GameClient.anInt8753 >> 9) + (i_92_ >> 2);
                                                transformZ = (GameClient.anInt8755 * 1818837461 >> 9) - (i_93_ >> 2);
                                            } else {
                                                int i_96_ = ((Player.myPlayer.getSize()) - 1) * 256;
                                                Vector3f trans = (Player.myPlayer.getWorldTransform().trans);
                                                transformX = ((i_92_ >> 2) + (((int) (trans.x) - i_96_) >> 9));
                                                transformZ = (((int) (trans.z) - i_96_) >> 9) - (i_93_ >> 2);
                                            }
                                            if (GameClient.interfaceSelected && ((-112110875 * StaticMethods.anInt3192) & 0x40) != 0) {
                                                IComponentDefinition selectedComponent = (getContainerComponent((1262526353 * Class379.interfaceHash), 392084321 * GameClient.containerComponent));
                                                if (selectedComponent != null) {
                                                    MenuOption.add(GameClient.selectedInterfaceOption, new StringBuilder().append(" ").append(Class26.lambdaExpression).toString(), (697885143 * (Class240.targetOverCursors)), 59, (-1232467723 * (componentDefinition.itemID)), 1L, transformX, transformZ, true, false, (long) (((-1309843523 * (componentDefinition.slot)) << 32) | ((componentDefinition.interfaceHash))), true);
                                                } else {
                                                    method1587();
                                                }
                                            } else {
                                                if (GameContext.stellardawn == GameClient.game) {
                                                    MenuOption.add((Tradution.FACE_HERE.translate((GameLanguage.CURRENT_LANGUAGE))), "", -1, 60, -1, 1L, transformX, transformZ, true, false, 0L, true);
                                                }
                                                MenuOption.add(StaticMethods.mouseHoverString, "", -1471730241 * GameClient.anInt8822, 23, -1, 1L, transformX, transformZ, true, false, 0L, true);
                                            }
                                        }
                                    }
                                    continue;
                                }
                                if (componentDefinition.specialType == WORLD_MAP_AREA) {
                                    StaticMethods.aClass105_1373 = componentDefinition;
                                    if (bool_70_) {
                                        Class301_Sub1.aBoolean7628 = true;
                                    }
                                    if (bool_75_) {
                                        int i_98_ = (int) ((double) ((class298_sub50.getMouseX()) - drawX - (-2093041337 * (componentDefinition.aspectWidth) / 2)) * 2.0 / (double) (WorldMapHandler.aFloat3233));
                                        int i_99_ = (int) -((double) ((class298_sub50.getMouseY()) - drawY - (457937409 * (componentDefinition.aspectHeight) / 2)) * 2.0 / (double) (WorldMapHandler.aFloat3233));
                                        int i_100_ = (i_98_ + (Class82_Sub14.anInt6875 * 1196508279) + WorldMapHandler.mapX);
                                        int i_101_ = (WorldMapHandler.mapY + (i_99_ + (Class376.anInt4090 * 1882038855)));
                                        Class298_Sub37_Sub13 class298_sub37_sub13 = Class298_Sub7.method2864();
                                        if (null != class298_sub37_sub13) {
                                            int[] is = new int[3];
                                            class298_sub37_sub13.method3451(i_100_, i_101_, is);
                                            if (null != is) {
                                                if ((AwtKeyboard.keyboard.held(82)) && (1806357379 * GameClient.localPrivilege > 0)) {
                                                    StaticMethods.method6083(is[0], is[1], is[2]);
                                                    continue;
                                                }
                                                GameClient.aBoolean8866 = true;
                                                StaticMethods.anInt2706 = is[0] * -938951349;
                                                StaticMethods.anInt950 = -1364790753 * is[1];
                                                StaticMethods.anInt6663 = is[2] * 1686622783;
                                            }
                                            GameClient.anInt8864 = 640786881;
                                            GameClient.aBoolean8865 = false;
                                            GameClient.anInt8734 = (AwtMouse.mouse.getLastX() * -344812543);
                                            GameClient.anInt8853 = (AwtMouse.mouse.getLastY() * -1376922141);
                                        }
                                    } else if (bool_74_ && GameClient.anInt8864 * -651858367 > 0) {
                                        if (1 == GameClient.anInt8864 * -651858367 && ((-98735103 * GameClient.anInt8734 != (AwtMouse.mouse.getLastX())) || (-938469429 * GameClient.anInt8853 != (AwtMouse.mouse.getLastY())))) {
                                            Class401.anInt6562 = (Class82_Sub14.anInt6875 * -880153251);
                                            Class441.anInt5589 = (Class376.anInt4090 * 1849990747);
                                            GameClient.anInt8864 = 1281573762;
                                        }
                                        if (2 == -651858367 * GameClient.anInt8864) {
                                            GameClient.aBoolean8865 = true;
                                            Class77.method842(((Class401.anInt6562 * 100354019) + (int) ((double) ((-98735103 * GameClient.anInt8734) - (AwtMouse.mouse.getLastX())) * 2.0 / (double) (WorldMapHandler.aFloat3234))), (short) 1347);
                                            Class352.method4246(((-1026644091 * Class441.anInt5589) - (int) ((double) ((-938469429 * GameClient.anInt8853) - (AwtMouse.mouse.getLastY())) * 2.0 / (double) (WorldMapHandler.aFloat3234))));
                                        }
                                    } else {
                                        if (-651858367 * GameClient.anInt8864 > 0 && !GameClient.aBoolean8865) {
                                            if ((GameClient.anInt8830 * 2089115297 == 1 || (StaticMethods.method694(-1803643567))) && (-278777595 * Class436.menuOptionCount) > 2) {
                                                Class63.method738(-98735103 * GameClient.anInt8734, GameClient.anInt8853 * -938469429);
                                            } else if (Class63.method740(2130342678)) {
                                                Class63.method738(GameClient.anInt8734 * -98735103, -938469429 * GameClient.anInt8853);
                                            }
                                        }
                                        GameClient.anInt8864 = 0;
                                    }
                                    continue;
                                }
                                if (componentDefinition.specialType == WORLD_MAP_OVERVIEW) {
                                    if (bool_74_) {
                                        Class74.drawWorldMap((AwtMouse.mouse.getLastX() - drawX), (AwtMouse.mouse.getLastY() - drawY), -2093041337 * componentDefinition.aspectWidth, 457937409 * componentDefinition.aspectHeight, -2108838735);
                                    }
                                    continue;
                                }
                                if (componentDefinition.specialType == UNKNOWN1) {
                                    Class82_Sub17.method918(componentDefinition, drawX, drawY, -462358504);
                                    continue;
                                }
                            }
                            if (!componentDefinition.aBoolean1295 && bool_75_) {
                                componentDefinition.aBoolean1295 = true;
                                if (componentDefinition.onClickHook != null) {
                                    ScriptNode scriptNode = new ScriptNode();
                                    scriptNode.aBoolean7533 = true;
                                    scriptNode.aClass105_7525 = componentDefinition;
                                    scriptNode.anInt7526 = (class298_sub50.getMouseX() - drawX) * 622624491;
                                    scriptNode.anInt7527 = (class298_sub50.getMouseY() - drawY) * 335112545;
                                    scriptNode.parameters = componentDefinition.onClickHook;
                                    GameClient.aClass453_8893.pushBack(scriptNode);
                                }
                            }
                            if (componentDefinition.aBoolean1295 && bool_74_ && componentDefinition.onClickRepeatHook != null) {
                                ScriptNode scriptNode = new ScriptNode();
                                scriptNode.aBoolean7533 = true;
                                scriptNode.aClass105_7525 = componentDefinition;
                                scriptNode.anInt7526 = (AwtMouse.mouse.getLastX() - drawX) * 622624491;
                                scriptNode.anInt7527 = (AwtMouse.mouse.getLastY() - drawY) * 335112545;
                                scriptNode.parameters = componentDefinition.onClickRepeatHook;
                                GameClient.aClass453_8893.pushBack(scriptNode);
                            }
                            if (componentDefinition.aBoolean1295 && !bool_74_) {
                                componentDefinition.aBoolean1295 = false;
                                if (null != componentDefinition.onReleaseHook) {
                                    ScriptNode scriptNode = new ScriptNode();
                                    scriptNode.aBoolean7533 = true;
                                    scriptNode.aClass105_7525 = componentDefinition;
                                    scriptNode.anInt7526 = (AwtMouse.mouse.getLastX() - drawX) * 622624491;
                                    scriptNode.anInt7527 = (AwtMouse.mouse.getLastY() - drawY) * 335112545;
                                    scriptNode.parameters = componentDefinition.onReleaseHook;
                                    GameClient.aClass453_8895.pushBack(scriptNode);
                                }
                            }
                            if (bool_74_ && null != componentDefinition.onHoldHook) {
                                ScriptNode scriptNode = new ScriptNode();
                                scriptNode.aBoolean7533 = true;
                                scriptNode.aClass105_7525 = componentDefinition;
                                scriptNode.anInt7526 = (AwtMouse.mouse.getLastX() - drawX) * 622624491;
                                scriptNode.anInt7527 = (AwtMouse.mouse.getLastY() - drawY) * 335112545;
                                scriptNode.parameters = componentDefinition.onHoldHook;
                                GameClient.aClass453_8893.pushBack(scriptNode);
                            }
                            if (!componentDefinition.aBoolean1294 && bool_70_) {
                                componentDefinition.aBoolean1294 = true;
                                if (componentDefinition.onMouseOverHook != null) {
                                    ScriptNode scriptNode = new ScriptNode();
                                    scriptNode.aBoolean7533 = true;
                                    scriptNode.aClass105_7525 = componentDefinition;
                                    scriptNode.anInt7526 = (AwtMouse.mouse.getLastX() - drawX) * 622624491;
                                    scriptNode.anInt7527 = (AwtMouse.mouse.getLastY() - drawY) * 335112545;
                                    scriptNode.parameters = componentDefinition.onMouseOverHook;
                                    GameClient.aClass453_8893.pushBack(scriptNode);
                                }
                            }
                            if (componentDefinition.aBoolean1294 && bool_70_ && null != componentDefinition.onMouseRepeatHook) {
                                ScriptNode scriptNode = new ScriptNode();
                                scriptNode.aBoolean7533 = true;
                                scriptNode.aClass105_7525 = componentDefinition;
                                scriptNode.anInt7526 = (AwtMouse.mouse.getLastX() - drawX) * 622624491;
                                scriptNode.anInt7527 = (AwtMouse.mouse.getLastY() - drawY) * 335112545;
                                scriptNode.parameters = componentDefinition.onMouseRepeatHook;
                                GameClient.aClass453_8893.pushBack(scriptNode);
                            }
                            if (componentDefinition.aBoolean1294 && !bool_70_) {
                                componentDefinition.aBoolean1294 = false;
                                if (null != componentDefinition.onMouseLeaveHook) {
                                    ScriptNode scriptNode = new ScriptNode();
                                    scriptNode.aBoolean7533 = true;
                                    scriptNode.aClass105_7525 = componentDefinition;
                                    scriptNode.anInt7526 = (AwtMouse.mouse.getLastX() - drawX) * 622624491;
                                    scriptNode.anInt7527 = (AwtMouse.mouse.getLastY() - drawY) * 335112545;
                                    scriptNode.parameters = componentDefinition.onMouseLeaveHook;
                                    GameClient.aClass453_8895.pushBack(scriptNode);
                                }
                            }
                            if (null != componentDefinition.onTimerHook) {
                                ScriptNode scriptNode = new ScriptNode();
                                scriptNode.aClass105_7525 = componentDefinition;
                                scriptNode.parameters = componentDefinition.onTimerHook;
                                GameClient.aClass453_8660.pushBack(scriptNode);
                            }
                            if (componentDefinition.onVarcTransmitHook != null && (116700579 * GameClient.GCValueCount > -1690676599 * componentDefinition.globalConfigValuesLength)) {
                                if (null == componentDefinition.globalVarTransmitList || ((116700579 * GameClient.GCValueCount - -1690676599 * componentDefinition.globalConfigValuesLength) > 32)) {
                                    ScriptNode scriptNode = new ScriptNode();
                                    scriptNode.aClass105_7525 = componentDefinition;
                                    scriptNode.parameters = componentDefinition.onVarcTransmitHook;
                                    GameClient.aClass453_8893.pushBack(scriptNode);
                                } else {
                                    while_122_:
                                    for (int configsLength = (-1690676599 * componentDefinition.globalConfigValuesLength); configsLength < GameClient.GCValueCount * 116700579; configsLength++) {
                                        int length = GameClient.intertfaceGCValueCounts[configsLength & 0x1f];
                                        for (int index = 0; index < (componentDefinition.globalVarTransmitList).length; index++) {
                                            if (length == (componentDefinition.globalVarTransmitList[index])) {
                                                ScriptNode scriptNode = new ScriptNode();
                                                scriptNode.aClass105_7525 = componentDefinition;
                                                scriptNode.parameters = (componentDefinition.onVarcTransmitHook);
                                                GameClient.aClass453_8893.pushBack(scriptNode);
                                                break while_122_;
                                            }
                                        }
                                    }
                                }
                                componentDefinition.globalConfigValuesLength = -1610191925 * GameClient.GCValueCount;
                            }
                            if (null != componentDefinition.onVarcStrTransmitHook && (-466597939 * GameClient.GCStringCount > -954704559 * componentDefinition.anInt1301)) {
                                if (null == componentDefinition.varcstrTransmitList || ((-466597939 * GameClient.GCStringCount - componentDefinition.anInt1301 * -954704559) > 32)) {
                                    ScriptNode scriptNode = new ScriptNode();
                                    scriptNode.aClass105_7525 = componentDefinition;
                                    scriptNode.parameters = componentDefinition.onVarcStrTransmitHook;
                                    GameClient.aClass453_8893.pushBack(scriptNode);
                                } else {
                                    while_123_:
                                    for (int i_105_ = -954704559 * componentDefinition.anInt1301; i_105_ < GameClient.GCStringCount * -466597939;i_105_++) {
                                        int i_106_ = GameClient.interfaceGCStringCounts[i_105_ & 0x1F];
                                        for (int index = 0; index < (componentDefinition.varcstrTransmitList).length; index++) {
                                            if (componentDefinition.varcstrTransmitList[index] == i_106_) {
                                                ScriptNode scriptNode = new ScriptNode();
                                                scriptNode.aClass105_7525 = componentDefinition;
                                                scriptNode.parameters = (componentDefinition.onVarcStrTransmitHook);
                                                GameClient.aClass453_8893.pushBack(scriptNode);
                                                break while_123_;
                                            }
                                        }
                                    }
                                }
                                componentDefinition.anInt1301 = GameClient.GCStringCount * -1362594883;
                            }
                            if (null != componentDefinition.onVarpTransmitHook && (GameClient.anInt8783 * -1667357449 > 942876795 * componentDefinition.anInt1288)) {
                                if (null == componentDefinition.varpTransmitList || ((GameClient.anInt8783 * -1667357449 - componentDefinition.anInt1288 * 942876795) > 32)) {
                                    ScriptNode scriptNode = new ScriptNode();
                                    scriptNode.aClass105_7525 = componentDefinition;
                                    scriptNode.parameters = componentDefinition.onVarpTransmitHook;
                                    GameClient.aClass453_8893.pushBack(scriptNode);
                                } else {
                                    while_124_:
                                    for (int i_108_ = 942876795 * componentDefinition.anInt1288; i_108_ < GameClient.anInt8783 * -1667357449; i_108_++) {
                                        int i_109_ = GameClient.anIntArray8874[i_108_ & 0x1f];
                                        for (int i_110_ = 0; i_110_ < (componentDefinition.varpTransmitList).length; i_110_++) {
                                            if (i_109_ == (componentDefinition.varpTransmitList[i_110_])) {
                                                ScriptNode scriptNode = new ScriptNode();
                                                scriptNode.aClass105_7525 = componentDefinition;
                                                scriptNode.parameters = (componentDefinition.onVarpTransmitHook);
                                                GameClient.aClass453_8893.pushBack(scriptNode);
                                                break while_124_;
                                            }
                                        }
                                    }
                                }
                                componentDefinition.anInt1288 = 1037546165 * GameClient.anInt8783;
                            }
                            if (componentDefinition.onInvTransmitHook != null && (1610062389 * GameClient.anInt8873 > -745327741 * componentDefinition.anInt1298)) {
                                if (null == componentDefinition.invTransmitList || ((GameClient.anInt8873 * 1610062389 - -745327741 * componentDefinition.anInt1298) > 32)) {
                                    ScriptNode scriptNode = new ScriptNode();
                                    scriptNode.aClass105_7525 = componentDefinition;
                                    scriptNode.parameters = componentDefinition.onInvTransmitHook;
                                    GameClient.aClass453_8893.pushBack(scriptNode);
                                } else {
                                    while_125_:
                                    for (int i_111_ = componentDefinition.anInt1298 * -745327741; i_111_ < GameClient.anInt8873 * 1610062389; i_111_++) {
                                        int i_112_ = GameClient.anIntArray8823[i_111_ & 0x1f];
                                        for (int i_113_ = 0; i_113_ < (componentDefinition.invTransmitList).length; i_113_++) {
                                            if (componentDefinition.invTransmitList[i_113_] == i_112_) {
                                                ScriptNode scriptNode = new ScriptNode();
                                                scriptNode.aClass105_7525 = componentDefinition;
                                                scriptNode.parameters = (componentDefinition.onInvTransmitHook);
                                                GameClient.aClass453_8893.pushBack(scriptNode);
                                                break while_125_;
                                            }
                                        }
                                    }
                                }
                                componentDefinition.anInt1298 = GameClient.anInt8873 * 914240999;
                            }
                            if (componentDefinition.onStatTransmitHook != null && (-1048955195 * GameClient.anInt8875 > -670133479 * componentDefinition.anInt1299)) {
                                if (componentDefinition.statTransmitList == null || ((GameClient.anInt8875 * -1048955195 - -670133479 * componentDefinition.anInt1299) > 32)) {
                                    ScriptNode scriptNode = new ScriptNode();
                                    scriptNode.aClass105_7525 = componentDefinition;
                                    scriptNode.parameters = componentDefinition.onStatTransmitHook;
                                    GameClient.aClass453_8893.pushBack(scriptNode);
                                } else {
                                    while_126_:
                                    for (int i_114_ = -670133479 * componentDefinition.anInt1299; i_114_ < GameClient.anInt8875 * -1048955195; i_114_++) {
                                        int i_115_ = GameClient.anIntArray8833[i_114_ & 0x1f];
                                        for (int i_116_ = 0; i_116_ < (componentDefinition.statTransmitList).length; i_116_++) {
                                            if (componentDefinition.statTransmitList[i_116_] == i_115_) {
                                                ScriptNode scriptNode = new ScriptNode();
                                                scriptNode.aClass105_7525 = componentDefinition;
                                                scriptNode.parameters = (componentDefinition.onStatTransmitHook);
                                                GameClient.aClass453_8893.pushBack(scriptNode);
                                                break while_126_;
                                            }
                                        }
                                    }
                                }
                                componentDefinition.anInt1299 = GameClient.anInt8875 * -715849075;
                            }
                            if (componentDefinition.anObjectArray1261 != null && (-1653538697 * GameClient.anInt8881 > 1544416945 * componentDefinition.anInt1302)) {
                                if (null == componentDefinition.anIntArray1189 || ((GameClient.anInt8881 * -1653538697 - componentDefinition.anInt1302 * 1544416945) > 32)) {
                                    ScriptNode scriptNode = new ScriptNode();
                                    scriptNode.aClass105_7525 = componentDefinition;
                                    scriptNode.parameters = componentDefinition.anObjectArray1261;
                                    GameClient.aClass453_8893.pushBack(scriptNode);
                                } else {
                                    while_127_:
                                    for (int i_117_ = 1544416945 * componentDefinition.anInt1302; i_117_ < -1653538697 * GameClient.anInt8881; i_117_++) {
                                        int i_118_ = GameClient.anIntArray8880[i_117_ & 0x1f];
                                        for (int i_119_ = 0; i_119_ < (componentDefinition.anIntArray1189).length; i_119_++) {
                                            if (i_118_ == (componentDefinition.anIntArray1189[i_119_])) {
                                                ScriptNode scriptNode = new ScriptNode();
                                                scriptNode.aClass105_7525 = componentDefinition;
                                                scriptNode.parameters = (componentDefinition.anObjectArray1261);
                                                GameClient.aClass453_8893.pushBack(scriptNode);
                                                break while_127_;
                                            }
                                        }
                                    }
                                }
                                componentDefinition.anInt1302 = -1196442713 * GameClient.anInt8881;
                            }
                            if ((538810253 * GameClient.anInt8882 > 1916751821 * componentDefinition.anInt1215) && null != componentDefinition.anObjectArray1267) {
                                ScriptNode scriptNode = new ScriptNode();
                                scriptNode.aClass105_7525 = componentDefinition;
                                scriptNode.parameters = componentDefinition.anObjectArray1267;
                                GameClient.aClass453_8893.pushBack(scriptNode);
                            }
                            if ((605488971 * GameClient.anInt8883 > componentDefinition.anInt1215 * 1916751821) && null != componentDefinition.anObjectArray1285) {
                                ScriptNode scriptNode = new ScriptNode();
                                scriptNode.aClass105_7525 = componentDefinition;
                                scriptNode.parameters = componentDefinition.anObjectArray1285;
                                GameClient.aClass453_8893.pushBack(scriptNode);
                            }
                            if ((GameClient.anInt8912 * -2049433257 > componentDefinition.anInt1215 * 1916751821) && null != componentDefinition.anObjectArray1270) {
                                ScriptNode scriptNode = new ScriptNode();
                                scriptNode.aClass105_7525 = componentDefinition;
                                scriptNode.parameters = componentDefinition.anObjectArray1270;
                                GameClient.aClass453_8893.pushBack(scriptNode);
                            }
                            if ((GameClient.anInt8885 * -570891387 > componentDefinition.anInt1215 * 1916751821) && null != componentDefinition.anObjectArray1271) {
                                ScriptNode scriptNode = new ScriptNode();
                                scriptNode.aClass105_7525 = componentDefinition;
                                scriptNode.parameters = componentDefinition.anObjectArray1271;
                                GameClient.aClass453_8893.pushBack(scriptNode);
                            }
                            if ((-707528081 * GameClient.anInt8886 > componentDefinition.anInt1215 * 1916751821) && componentDefinition.anObjectArray1287 != null) {
                                ScriptNode scriptNode = new ScriptNode();
                                scriptNode.aClass105_7525 = componentDefinition;
                                scriptNode.parameters = componentDefinition.anObjectArray1287;
                                GameClient.aClass453_8893.pushBack(scriptNode);
                            }
                            if ((-53597277 * GameClient.anInt8796 > componentDefinition.anInt1215 * 1916751821) && null != componentDefinition.anObjectArray1274) {
                                ScriptNode scriptNode = new ScriptNode();
                                scriptNode.aClass105_7525 = componentDefinition;
                                scriptNode.parameters = componentDefinition.anObjectArray1274;
                                GameClient.aClass453_8893.pushBack(scriptNode);
                            }
                            if ((GameClient.anInt8888 * -1961929885 > 1916751821 * componentDefinition.anInt1215) && null != componentDefinition.anObjectArray1273) {
                                ScriptNode scriptNode = new ScriptNode();
                                scriptNode.aClass105_7525 = componentDefinition;
                                scriptNode.parameters = componentDefinition.anObjectArray1273;
                                GameClient.aClass453_8893.pushBack(scriptNode);
                            }
                            componentDefinition.anInt1215 = GameClient.anInt8933 * -1380945021;
                            if (null != componentDefinition.anObjectArray1268) {
                                for (int i_120_ = 0; i_120_ < 1351936279 * GameClient.keyRecordsSize; i_120_++) {
                                    ScriptNode scriptNode = new ScriptNode();
                                    scriptNode.aClass105_7525 = componentDefinition;
                                    scriptNode.anInt7532 = (GameClient.lastKeyRecords[i_120_].getKeyCode() * 615642911);
                                    scriptNode.anInt7531 = (GameClient.lastKeyRecords[i_120_].getCharacter() * 100528189);
                                    scriptNode.parameters = componentDefinition.anObjectArray1268;
                                    GameClient.aClass453_8893.pushBack(scriptNode);
                                }
                            }
                            if (GameClient.aBoolean8775 && null != componentDefinition.anObjectArray1277) {
                                ScriptNode scriptNode = new ScriptNode();
                                scriptNode.aClass105_7525 = componentDefinition;
                                scriptNode.parameters = componentDefinition.anObjectArray1277;
                                GameClient.aClass453_8893.pushBack(scriptNode);
                            }
                        }
                        if (componentDefinition.type * -1215239439 == GRAPHIC && -1 != 925824753 * componentDefinition.anInt1283) {
                            componentDefinition.method1121(Js5Configs.configList, Class138_Sub1.configs).method2588(GameClient.activeGraphicsToolkit, componentDefinition.aspectHeight * 457937409, SettingsManager.settingsManager.skybox.getValue());
                        }
                        GameContext.method5577(componentDefinition);
                        if (componentDefinition.type * -1215239439 == CONTAINER) {
                            updateHiddenComponents(IComponentDefinitionCollection, widgetComponents, componentDefinition.interfaceHash, bx, by, bWidth, bHeight, drawX - componentDefinition.anInt1166 * 684246511, (drawY - -1424956747 * componentDefinition.anInt1167), i_59_, i_60_);
                            if (componentDefinition.containedComponents != null) {
                                updateHiddenComponents(IComponentDefinitionCollection, componentDefinition.containedComponents, componentDefinition.interfaceHash, bx, by, bWidth, bHeight, (drawX - componentDefinition.anInt1166 * 684246511), drawY - (-1424956747 * componentDefinition.anInt1167), i_59_, i_60_);
                            }
                            Widget widgetNode = (Widget) (GameClient.linkedList.get((long) (componentDefinition.interfaceHash)));
                            if (widgetNode != null) {
                                if (GameClient.game == GameContext.VENGIUM && 0 == 27137839 * widgetNode.clipped && !GameClient.menuOpen && bool_70_ && !GameClient.aBoolean8846) {
                                    StaticMethods.closeMenus();
                                }
                                Class298_Sub32_Sub26.method3307(widgetNode, -1617025021 * widgetNode.interfaceID, bx, by, bWidth, bHeight, drawX, drawY, i_59_, i_60_);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void method1587() {
        if (GameClient.interfaceSelected) {
            IComponentDefinition componentDefinition = getContainerComponent(Class379.interfaceHash * 1262526353, 392084321 * GameClient.containerComponent);
            if (null != componentDefinition && componentDefinition.onTargetLeaveHook != null) {
                ScriptNode scriptNode = new ScriptNode();
                scriptNode.aClass105_7525 = componentDefinition;
                scriptNode.parameters = componentDefinition.onTargetLeaveHook;
                Class444.method5889(scriptNode);
            }
            GameClient.targetLeaveCursor = 280458557;
            GameClient.itemID = -398138063;
            GameClient.interfaceSelected = false;
            if (componentDefinition != null) {
                StaticMethods.updateComponentTick(componentDefinition);
            }
        }
    }

    static final void eraseChooseOptions(IComponentDefinition componentDefinition) {
        componentDefinition.rightClickOptions = null;
    }

    public static void method3080(Js5FileSystem JS5_INTERFACE, Js5FileSystem JS5_MDOELS, Js5FileSystem JS5_SPRITES) {
        Js5List.JS5_INTERFACE = JS5_INTERFACE;
        Js5List.JS5_MODEL = JS5_MDOELS;
        Sprite.JS5_SPRITES = JS5_SPRITES;
        getIComponentDefinitionCollections = new IComponentDefinitionCollection[Js5List.JS5_INTERFACE.getContainerLength()];
        interfaceComponentsExists = new boolean[Js5List.JS5_INTERFACE.getContainerLength()];
    }

    public static void deactiveInterface(int interfaceID) {
        if (interfaceID != -1 && !IComponentDefinition.interfaceComponentsExists[interfaceID]) {
            Js5List.JS5_INTERFACE.clearFileData(interfaceID);
            getIComponentDefinitionCollections[interfaceID] = null;
        }
    }

    public static IComponentDefinition getContainerComponent(int interfaceHash, int childIndex) {
        IComponentDefinition componentDefinition = getInterfaceComponent(interfaceHash);
        if (childIndex == -1) {
            return componentDefinition;
        }
        if (componentDefinition == null || componentDefinition.sada == null || childIndex >= componentDefinition.sada.length) {
            return null;
        }
        return componentDefinition.sada[childIndex];
    }

    public static IComponentDefinition getInterfaceComponent(int interfaceHash) {
        int interfaceID = interfaceHash >> 16;
        if (interfaceID > IComponentDefinition.getIComponentDefinitionCollections.length) {
            return null;
        }
        if (IComponentDefinition.getIComponentDefinitionCollections[interfaceID] == null || (IComponentDefinition.getIComponentDefinitionCollections[interfaceID].componentWithinInterface(interfaceHash) == null)) {
            boolean componentExists = Class378.componentExists(interfaceID, null);
            if (!componentExists) {
                return null;
            }
        }
        return IComponentDefinition.getIComponentDefinitionCollections[interfaceID].componentWithinInterface(interfaceHash);
    }

    static void updateResizeModes(IComponentDefinition componentDefinition, int width, int height, boolean bool) {
        int i_4_ = -2093041337 * componentDefinition.aspectWidth;
        int i_5_ = componentDefinition.aspectHeight * 457937409;
        if (componentDefinition.hReizeMode == 0) {
            componentDefinition.aspectWidth = componentDefinition.width * -86683899;
        } else if (componentDefinition.hReizeMode == 1) {
            componentDefinition.aspectWidth = -614915977 * (width - 1769572195 * componentDefinition.width);
        } else if (componentDefinition.hReizeMode == 2) {
            componentDefinition.aspectWidth = -614915977 * (width * (1769572195 * componentDefinition.width) >> 14);
        }
        if (componentDefinition.vResizeMode == 0) {
            componentDefinition.aspectHeight = -472364941 * componentDefinition.height;
        } else if (componentDefinition.vResizeMode == 1) {
            componentDefinition.aspectHeight = (height - componentDefinition.height * -1747263885) * -67604991;
        } else if (componentDefinition.vResizeMode == 2) {
            componentDefinition.aspectHeight = -67604991 * (height * (-1747263885 * componentDefinition.height) >> 14);
        }
        if (componentDefinition.hReizeMode == 4) {
            componentDefinition.aspectWidth = -614915977 * (componentDefinition.anInt1158 * 1183580231 * (componentDefinition.aspectHeight * 457937409) / (componentDefinition.anInt1242 * 1289873889));
        }
        if (componentDefinition.vResizeMode == 4) {
            componentDefinition.aspectHeight = -67604991 * (-2093041337 * componentDefinition.aspectWidth * (1289873889 * componentDefinition.anInt1242) / (1183580231 * componentDefinition.anInt1158));
        }
        if (GameClient.aBoolean8846 && (GameClient.getComponentSettings(componentDefinition).settings * -1266165749 != 0 || componentDefinition.type * -1215239439 == 0)) {
            if (componentDefinition.aspectHeight * 457937409 < 5 && -2093041337 * componentDefinition.aspectWidth < 5) {
                componentDefinition.aspectHeight = -338024955;
                componentDefinition.aspectWidth = 1220387411;
            } else {
                if (457937409 * componentDefinition.aspectHeight <= 0)
                    componentDefinition.aspectHeight = -338024955;
                if (componentDefinition.aspectWidth * -2093041337 <= 0)
                    componentDefinition.aspectWidth = 1220387411;
            }
        }
        if (componentDefinition.specialType == BASIC_SCENE) {
            GameClient.currentSceneComponent = componentDefinition;
        }
        if (bool && componentDefinition.anObjectArray1164 != null && (i_4_ != componentDefinition.aspectWidth * -2093041337 || 457937409 * componentDefinition.aspectHeight != i_5_)) {
            ScriptNode scriptNode = new ScriptNode();
            scriptNode.aClass105_7525 = componentDefinition;
            scriptNode.parameters = componentDefinition.anObjectArray1164;
            GameClient.aClass453_8893.pushBack(scriptNode);
        }
    }

    static final void method903(int interfaceID, int i_0_) {
        if (Class378.componentExists(interfaceID, null))
            Class170.method1812((getIComponentDefinitionCollections[interfaceID].componentDefinitions), i_0_);
    }

    static void updatePositionModes(IComponentDefinition component, int i, int i_6_) {
        if (component.hPositionMode == 0)
            component.x = -1672688609 * component.startX;
        else if (component.hPositionMode == 1)
            component.x = (-1014229119 * (component.startX * 1499181983 + (i - -2093041337 * component.aspectWidth) / 2));
        else if (component.hPositionMode == 2)
            component.x = -1014229119 * (i - component.aspectWidth * -2093041337 - 1499181983 * component.startX);
        else if (component.hPositionMode == 3)
            component.x = (i * (1499181983 * component.startX) >> 14) * -1014229119;
        else if (component.hPositionMode == 4)
            component.x = -1014229119 * ((i - -2093041337 * component.aspectWidth) / 2 + (i * (1499181983 * component.startX) >> 14));
        else
            component.x = (i - -2093041337 * component.aspectWidth - (1499181983 * component.startX * i >> 14)) * -1014229119;
        if (component.vPositionMode == 0)
            component.y = 705123139 * component.startY;
        else if (component.vPositionMode == 1)
            component.y = ((component.startY * -901738979 + (i_6_ - 457937409 * component.aspectHeight) / 2) * 1145252063);
        else if (component.vPositionMode == 2)
            component.y = (i_6_ - 457937409 * component.aspectHeight - -901738979 * component.startY) * 1145252063;
        else if (component.vPositionMode == 3)
            component.y = 1145252063 * (component.startY * -901738979 * i_6_ >> 14);
        else if (component.vPositionMode == 4)
            component.y = (((-901738979 * component.startY * i_6_ >> 14) + (i_6_ - 457937409 * component.aspectHeight) / 2) * 1145252063);
        else
            component.y = 1145252063 * (i_6_ - component.aspectHeight * 457937409 - (component.startY * -901738979 * i_6_ >> 14));
        if (GameClient.aBoolean8846 && (GameClient.getComponentSettings(component).settings * -1266165749 != 0 || 0 == component.type * -1215239439)) {
            if (component.x * 1354508417 < 0)
                component.x = 0;
            else if ((component.x * 1354508417 + -2093041337 * component.aspectWidth) > i)
                component.x = -1014229119 * (i - -2093041337 * component.aspectWidth);
            if (component.y * -749038817 < 0)
                component.y = 0;
            else if ((component.y * -749038817 + 457937409 * component.aspectHeight) > i_6_)
                component.y = 1145252063 * (i_6_ - 457937409 * component.aspectHeight);
        }
    }

    static void method1282(IComponentDefinition[] containedComponents, IComponentDefinition componentDefinition, boolean bool) {
        int width = (0 != 1867913305 * componentDefinition.layerWidth ? 1867913305 * componentDefinition.layerWidth : -2093041337 * componentDefinition.aspectWidth);
        int height = (0 != 2053897963 * componentDefinition.maxScrollVertical ? componentDefinition.maxScrollVertical * 2053897963 : 457937409 * componentDefinition.aspectHeight);
        Class372.method4591(containedComponents,componentDefinition.interfaceHash, width, height, bool);
        if (componentDefinition.containedComponents != null)
            Class372.method4591(componentDefinition.containedComponents, componentDefinition.interfaceHash, width, height, bool);
        Widget widget = ((Widget) GameClient.linkedList.get((long) (componentDefinition.interfaceHash)));
        if (widget != null)
            StaticMethods.method1033(-1617025021 * widget.interfaceID, width, height, bool);
        if (componentDefinition == GameClient.currentSceneComponent) {
            int length = Class10.entitiesInRegion * 1168366243;
            int[] playerList = Class10.players;
            for (int playerIndex = 0; playerIndex < length; playerIndex++) {
                Player player = (GameClient.entities[playerList[playerIndex]]);
                System.out.println(player.getPlayerName(true));
                if (player != null)
                    player.method4442(width, height, bool);
            }
            for (int index = 0; index < GameClient.entitySize * -1230451913; index++) {
                int key = GameClient.entityKeys[index];
                ObjectNode node = ((ObjectNode) GameClient.entityList.get((long) key));
                if (null != node)
                    ((Entity) node.nodeObject).method4442(width, height, bool);
            }
        }
    }

    public static void updateShapeModes(IComponentDefinitionCollection IComponentDefinitionCollection, IComponentDefinition componentDefinition) {
        IComponentDefinition referenceIComponentDefinition = method6331(IComponentDefinitionCollection, componentDefinition);
        int width;
        int height;
        if (null == referenceIComponentDefinition) {
            width = GameShell.canvasWidth * -2110394505;
            height = GameShell.canvasHeight * -1111710645;
        } else {
            width = referenceIComponentDefinition.aspectWidth * -2093041337;
            height = referenceIComponentDefinition.aspectHeight * 457937409;
        }
        updateResizeModes(componentDefinition, width, height, false);
        updatePositionModes(componentDefinition, width, height);
    }

    static final void drawReinaldsEmporium(IComponentDefinition componentDefinition) {
        if (REINALDS_SMITHING_EMPORIUM == componentDefinition.specialType) {
            if (Player.myPlayer.accountName == null) {
                componentDefinition.modelID = 0;
                componentDefinition.hashcode = 0;
            } else {
                componentDefinition.xAngle = 818038;
                componentDefinition.yAngle = ((int) (Math.sin((double) (443738891 * GameClient.clientTick) / 40.0) * 256.0) & 0x7ff) * 1590511671;
                componentDefinition.modelType = 939239877;
                componentDefinition.modelID = GameClient.playerIndex * -127794683;
                componentDefinition.hashcode = (Class525.method6379((Player.myPlayer.accountName))) * 908204397;
                Animator animator = (Player.myPlayer.aAnimator_10077);
                if (animator != null) {
                    if (componentDefinition.animator == null)
                        componentDefinition.animator = new SimpleAnimation();
                    componentDefinition.animId = animator.getAnimationID() * 1587382585;
                    componentDefinition.animator.method5840(animator);
                } else
                    componentDefinition.animator = null;
            }
        }
    }

    static final void drawWorlMap(GraphicsToolkit toolkit, int drawX, int drawY, int aspectWidth, int aspectHeight) {
        toolkit.setClip(drawX, drawY, drawX + aspectWidth, drawY + aspectHeight);
        toolkit.fillRectangle(drawX, drawY, aspectWidth, aspectHeight, -16777216);
        if (Class301_Sub1.anInt7624 * -1289394455 >= 100) {
            float f = ((float) Class301_Sub1.anInt3240 / (float) Class301_Sub1.anInt3239);
            int i_13_ = aspectWidth;
            int i_14_ = aspectHeight;
            if (f < 1.0F)
                i_14_ = (int) (f * (float) aspectWidth);
            else
                i_13_ = (int) ((float) aspectHeight / f);
            drawX += (aspectWidth - i_13_) / 2;
            drawY += (aspectHeight - i_14_) / 2;
            if (Class274.aClass57_6539 == null || Class274.aClass57_6539.getWidth() != aspectWidth || Class274.aClass57_6539.getHeight() != aspectHeight) {
                Class301_Sub1.method3709(Class301_Sub1.mapX, (Class301_Sub1.mapY + Class301_Sub1.anInt3240), (Class301_Sub1.mapX + Class301_Sub1.anInt3239), Class301_Sub1.mapY, drawX, drawY, i_13_ + drawX, i_14_ + drawY);
                Class301_Sub1.method3698(toolkit);
                Class274.aClass57_6539 = toolkit.method5033(drawX, drawY, i_13_, i_14_, false);
            }
            Class274.aClass57_6539.draw(drawX, drawY);
            int i_15_ = (i_13_ * (1484045541 * Class301_Sub1.anInt7625) / Class301_Sub1.anInt3239);
            int i_16_ = (1464638883 * Class413.anInt6590 * i_14_ / Class301_Sub1.anInt3240);
            int i_17_ = drawX + (i_13_ * (CS2CallStackEntry.anInt5232 * 331474003) / Class301_Sub1.anInt3239);
            int i_18_ = i_14_ + drawY - (1786832569 * Class261.anInt2825 * i_14_ / Class301_Sub1.anInt3240) - i_16_;
            int i_19_ = -1996554240;
            if (GameContext.stellardawn == GameClient.game)
                i_19_ = -1996488705;
            toolkit.drawFilledRectangle(i_17_, i_18_, i_15_, i_16_, i_19_, 1);
            toolkit.drawRectangle(i_17_, i_18_, i_15_, i_16_, i_19_, 0);
            if (Class137_Sub1.anInt6991 * -1983068885 > 0) {
                int i_20_;
                if (-1581933633 * Class88.anInt810 > 50)
                    i_20_ = 500 - Class88.anInt810 * 680266427;
                else
                    i_20_ = 680266427 * Class88.anInt810;
                for (Class298_Sub52 class298_sub52 = (Class298_Sub52) Class301_Sub1.aClass453_3236.method5939(); null != class298_sub52; class298_sub52 = (Class298_Sub52) Class301_Sub1.aClass453_3236.method5944()) {
                    Class352 class352 = (Class301_Sub1.aClass339_3251.method4116(-530122905 * class298_sub52.anInt7608));
                    if (!StaticMethods.method5728(class352)) {

                    } else if (Class301_Sub1.anInt7633 * -271159611 == class298_sub52.anInt7608 * -530122905) {
                        int i_21_ = ((i_13_ * (2122110429 * class298_sub52.anInt7607) / Class301_Sub1.anInt3239) + drawX);
                        int i_22_ = (drawY + ((Class301_Sub1.anInt3240 - class298_sub52.anInt7610 * -372920341) * i_14_ / Class301_Sub1.anInt3240));
                        toolkit.fillRectangle(i_21_ - 2, i_22_ - 2, 4, 4, i_20_ << 24 | 0xffff00);
                    } else if (-1 != -484575331 * Class301_Sub1.anInt7630 && (-804513353 * class352.anInt3817 == (Class301_Sub1.anInt7630 * -484575331))) {
                        int i_23_ = drawX + (2122110429 * class298_sub52.anInt7607 * i_13_ / Class301_Sub1.anInt3239);
                        int i_24_ = ((i_14_ * (Class301_Sub1.anInt3240 - class298_sub52.anInt7610 * -372920341) / Class301_Sub1.anInt3240) + drawY);
                        toolkit.fillRectangle(i_23_ - 2, i_24_ - 2, 4, 4, i_20_ << 24 | 0xffff00);
                    }
                }
            }
        }
    }

    static IComponentDefinition method4063(IComponentDefinition componentDefinition) {
            IComponentDefinition class105_291_ = GameClient.method2808(componentDefinition);
            if (null == class105_291_)
                class105_291_ = componentDefinition.aClass105_1233;
            return class105_291_;
    }

    public String getString(int key, String string) {
        if (null == this.params) {
            return string;
        }
        ObjectNode objectNode = ((ObjectNode) this.params.get((long) key));
        if (objectNode == null)

        {
            return string;
        }
        return (String) objectNode.nodeObject;

    }
    //Component Definitions working on an editor need to understand
    void decode(Buffer buffer) {
        try {
            int format = buffer.readUByte();

            if (format == 255) {
                format = -1;
            }
            type = buffer.readUByte() * -800405999;
            if ((-1215239439 * type & 0x80) != 0) {
                type = -800405999 * (type * -1215239439 & 0x7f);
                aString1259 = buffer.readString();
                System.out.println("Setting string: " + aString1259);
            }
            specialType = buffer.readUShort();
            startX = buffer.readShort() * 2145953887;
            startY = buffer.readShort() * 1215865909;
            width = buffer.readUShort() * -478399925;
            height = buffer.readUShort() * -1661995333;
            hReizeMode = buffer.readByte();
            vResizeMode = buffer.readByte();
            hPositionMode = buffer.readByte();
            vPositionMode = buffer.readByte();
            parentID = buffer.readUShort();
            if (65535 == parentID) {
                parentID = -1;
            } else {
                parentID = (parentID + (interfaceHash & ~0xffff));
            }
            int settings = buffer.readUByte();
            hidden = 0 != (settings & 0x1);
            if (format >= 0) {
                noClickThrough = (settings & 0x2) != 0;
            }
            if (type * -1215239439 == CONTAINER) {
                layerWidth = buffer.readUShort() * -1609060375;
                maxScrollVertical = buffer.readUShort() * -1638942269;
                if (format < 0) {
                    noClickThrough = buffer.readUByte() == 1;
                }
            }
            if (type * -1215239439 == RECTANGLE) {
                color = buffer.readInt() * -695431873;
                filled = buffer.readUByte() == 1;
                transparency = buffer.readUByte() * 728904583;
            }
            if (type * -1215239439 == TEXT) {
                fontID = buffer.readBigSmart() * -2074006897;
                if (format >= 10) {
                    fontMonochrome = buffer.readUByte() == 1;
                }
                text = buffer.readString();
                if (text.toLowerCase().contains("runescape")) {
                    text = text.replace("runescape", "Vengium");
                    text = text.replace("RuneScape", "Vengium");
                    text = text.replace("Runescape", "Vengium");
                }
                lineHeight = buffer.readUByte() * 1629063197;
                lineHAlign = buffer.readUByte() * -1733811909;
                lineVAlign = buffer.readUByte() * 210030285;
                shadowed = buffer.readUByte() == 1;
                color = buffer.readInt() * -695431873;
                transparency = buffer.readUByte() * 728904583;
                if (format >= 0) {
                    maxLines = buffer.readUByte() * -1455284437;
                }
            }
            if (-1215239439 * type == GRAPHIC) {
                graphicID = buffer.readInt() * 1986266571;
                angle2D = buffer.readUShort() * -216431639;
                int flag = buffer.readUByte();
                tiling = 0 != (flag & 0x1);
                alpha = (flag & 0x2) != 0;
                transparency = buffer.readUByte() * 728904583;
                outline = buffer.readUByte() * 1158843261;
                shadow = buffer.readInt() * -1448553585;
                flipV = buffer.readUByte() == 1;
                flipH = buffer.readUByte() == 1;
                color = buffer.readInt() * -695431873;
                if (format >= 3) {
                    clickable = buffer.readUByte() == 1;
                }
            }
            if (type * -1215239439 == ANIMABLE) {
                modelType = 1;
                modelID = buffer.readBigSmart() * -1825442367;
                int modelMask = buffer.readUByte();
                boolean plane = 1 == (modelMask & 0x1);
                overview = (modelMask & 0x2) == 2;
                orthogonal = 4 == (modelMask & 0x4);
                rawDepth = 8 == (modelMask & 0x8);
                if (plane) {
                    originX = buffer.readShort() * 437213185;
                    originY = buffer.readShort() * 1266800241;
                    xAngle = buffer.readUShort() * -801721775;
                    yAngle = buffer.readUShort() * 1590511671;
                    zAngle = buffer.readUShort() * -2064327287;
                    zoom = buffer.readUShort() * -1066050969;
                } else if (overview) {
                    originX = buffer.readShort() * 437213185;
                    originY = buffer.readShort() * 1266800241;
                    originZ = buffer.readShort() * -1324973519;
                    xAngle = buffer.readUShort() * -801721775;
                    yAngle = buffer.readUShort() * 1590511671;
                    zAngle = buffer.readUShort() * -2064327287;
                    zoom = buffer.readShort() * -1066050969;
                }
                animId = buffer.readBigSmart() * 1587382585;
                if (hReizeMode!= 0) {
                    viewportWidth = buffer.readUShort() * 1811727251;
                }
                if (vResizeMode != 0) {
                    viewportHeight = buffer.readUShort() * 1572578003;
                }
            }
            if (type * -1215239439 == LINE) {
                lineWidth = buffer.readUByte() * -1041514725;
                color = buffer.readInt() * -695431873;
                aBoolean1174 = buffer.readUByte() == 1;
            }

            int optionMask = buffer.readUTriByte();
            int rate = buffer.readUByte();
            if (rate != 0) {
                aByteArray1185 = new byte[11];
                aByteArray1222 = new byte[11];
                anIntArray1276 = new int[11];
                for (/**/; rate != 0; rate = buffer.readUByte()) {
                    int index = (rate >> 4) - 1;
                    rate = rate << 8 | buffer.readUByte();
                    rate &= 0xfff;
                    if (rate == 4095) {
                        rate = -1;
                    }
                    byte key = buffer.readByte();
                    if (key != 0) {
                        aBoolean1220 = true;
                    }
                    byte mask = buffer.readByte();
                    anIntArray1276[index] = rate;
                    aByteArray1185[index] = key;
                    aByteArray1222[index] = mask;
                }
            }
            opBase = buffer.readString();
            int menuMask = buffer.readUByte();
            int menuOptionsCount = menuMask & 0xf;
            int menuCursorMask = menuMask >> 4;
            if (menuOptionsCount > 0) {
                rightClickOptions = new String[menuOptionsCount];
                for (int options = 0; options < menuOptionsCount; options++) {
                    rightClickOptions[options] = buffer.readString();
                }
            }
            if (menuCursorMask > 0) {
                int option = buffer.readUByte();
                optionCursors = new int[1 + option];
                for (int index = 0; index < optionCursors.length; index++)
                    optionCursors[index] = -1;
                optionCursors[option] = buffer.readUShort();
            }
            if (menuCursorMask > 1) {
                int option = buffer.readUByte();
                optionCursors[option] = buffer.readUShort();
            }
            toolTip = buffer.readString();
            if (toolTip.equals("")) {
                toolTip = null;
            }
            dragDeadZone = buffer.readUByte() * 476443207;
            dragDeadTime = buffer.readUByte() * -978869921;
            dragRenderBehavior = buffer.readUByte() * 2138287179;
            targetVerb = buffer.readString();
            if (targetVerb.equals("")) {
                targetVerb = null;
            }
            if (targetVerb != null) {
            }
            int mask = -1;
            if (StaticMethods.getTargetMask(optionMask) != 0) {
                mask = buffer.readUShort();
                if (mask == 65535) {
                    mask = -1;
                }
                targetOverCursors = buffer.readUShort() * 2021607495;
                if (-2051415689 * targetOverCursors == 65535) {
                    targetOverCursors = -2021607495;
                }
                targetLeaveCursor = buffer.readUShort() * 1830595391;
                if (65535 == targetLeaveCursor * -1149188929) {
                    targetLeaveCursor = -1830595391;
                }
            }
            if (format >= 0) {
                mouseOverCursor = buffer.readUShort() * -1122372539;
                if (65535 == -1200030067 * mouseOverCursor) {
                    mouseOverCursor = 1122372539;
                }
            }
            activeProperties = new IComponentSettings(optionMask, mask);
            if (format >= 0) {
                int numInts = buffer.readUByte();
                for (int index = 0; index < numInts; index++) {
                    int key = buffer.readUTriByte();
                    int value = buffer.readInt();
                    this.params.connect(new IntNode(value), (long) key);
                }
                int numObjs = buffer.readUByte();
                for (int index = 0; index < numObjs; index++) {
                    int key = buffer.readUTriByte();
                    String value = buffer.readJagString();
                    this.params.connect(new ObjectNode(value), (long) key);
                }

            }
            onLoadHookParameters = decodeScript(buffer);
            onMouseOverHook = decodeScript(buffer);
            onMouseLeaveHook = decodeScript(buffer);
            onTargetLeaveHook = decodeScript(buffer);
            onTargetEnterHook = decodeScript(buffer);
            onVarpTransmitHook = decodeScript(buffer);
            onInvTransmitHook = decodeScript(buffer);
            onStatTransmitHook = decodeScript(buffer);
            onTimerHook = decodeScript(buffer);
            onOptHook = decodeScript(buffer);
            if (format >= 0) {
                onUseOnObjHook = decodeScript(buffer);
            }
            onMouseRepeatHook = decodeScript(buffer);
            onClickHook = decodeScript(buffer);
            onClickRepeatHook = decodeScript(buffer);
            onReleaseHook = decodeScript(buffer);
            onHoldHook = decodeScript(buffer);
            onDragHook = decodeScript(buffer);
            onDragCompleteHook = decodeScript(buffer);
            onScrollWheelHook = decodeScript(buffer);
            onVarcTransmitHook = decodeScript(buffer);
            onVarcStrTransmitHook = decodeScript(buffer);
            varpTransmitList = decodeTransmitList(buffer);
            invTransmitList = decodeTransmitList(buffer);
            statTransmitList = decodeTransmitList(buffer);
            globalVarTransmitList = decodeTransmitList(buffer);
            varcstrTransmitList = decodeTransmitList(buffer);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, "Unable to decode interface: " + interfaceHash);
        }
    }

    Object[] decodeScript(Buffer buffer) {
        try {
            int scriptsCount = buffer.readUByte();
            if (0 == scriptsCount) {
                return null;
            }
            Object[] objects = new Object[scriptsCount];
            for (int scriptIDX = 0; scriptIDX < scriptsCount; scriptIDX++) {
                int i_27_ = buffer.readUByte();
                if (i_27_ == 0) {
                    objects[scriptIDX] = new Integer(buffer.readInt());
                } else if (i_27_ == 1) {
                    objects[scriptIDX] = buffer.readString();
                }
            }
            hasScript = true;
            return objects;
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("eg.r(").append(')').toString());
        }
    }

    public FontToolkit getFontToolkit(FontManager fontManager, FontRenderProvider fontRenderProvider, int i) {
            FontToolkit fontToolkit = ((FontToolkit) fontManager.loadOther(fontRenderProvider, 1508815983 * fontID, false, fontMonochrome));
            aBoolean1139 = fontToolkit == null;
            return fontToolkit;
    }

    public RSFontMetrics method1113(FontManager fontManager, FontRenderProvider fontRenderProvider) {
        RSFontMetrics rsFontMetrics = fontManager.method1879(fontRenderProvider, fontID * 1508815983);
        aBoolean1139 = null == rsFontMetrics;
        return rsFontMetrics;
    }

    public void prepareParticles(GraphicsToolkit graphicsToolkit, ModelToolkit modelToolkit, Matrix43f cameraAngles, int tick) {
        modelToolkit.method4463(cameraAngles);
        EmissiveTriangle[] triangles = modelToolkit.method4464();
        EffectiveVertex[] verticies = modelToolkit.method4445();
        if ((null == particles || particles.aBoolean3992) && (null != triangles || verticies != null)) {
            particles = ParticleSystem.getSystem(tick, false);
        }
        if (particles != null) {
            particles.createObject(graphicsToolkit, (long) tick, triangles, verticies, false);
        }
    }

    public void setRightClipOptionString(int optionIndex, String optionString) {
        if (rightClickOptions == null || rightClickOptions.length <= optionIndex) {
            String[] strings = new String[1 + optionIndex];
            if (rightClickOptions != null) {
                for (int index = 0; index < rightClickOptions.length; index++)
                    strings[index] = rightClickOptions[index];
            }
            rightClickOptions = strings;
        }
        rightClickOptions[optionIndex] = optionString;
    }

    public Class117 method1116(GraphicsToolkit graphicsToolkit) {
        long key = ((long) (interfaceHash) << 32 | (long) (-1309843523 * slot) & 0xffffffffL);
        Class117 class117 = (Class117) aClass348_1136.get(key);
        if (class117 != null) {
            if (graphicID * 1411971043 != class117.graphicID * 1509093479) {
                aClass348_1136.method4193(key);
                class117 = null;
            }
            if (class117 != null) {
                return class117;
            }
        }
        Sprite imageDefinitionLoader = Sprite.loadFirst(Sprite.JS5_SPRITES, 1411971043 * graphicID, 0);
        if (imageDefinitionLoader == null) {
            return null;
        }
        int sizeX = imageDefinitionLoader.width + imageDefinitionLoader.offsetX + imageDefinitionLoader.deltaWidth;
        int sizeY = imageDefinitionLoader.offsetY + imageDefinitionLoader.height + imageDefinitionLoader.deltaHeight;
        int[] is = new int[sizeY];
        int[] is_33_ = new int[sizeY];
        for (int rowIndex = 0; rowIndex < imageDefinitionLoader.height; rowIndex++) {
            int leftInsets = 0;//Left side
            int rightInsets = imageDefinitionLoader.width;//Right side
            for (int columnIndex = 0; columnIndex < imageDefinitionLoader.width; columnIndex++) {//Left to Right
                if (imageDefinitionLoader.raster[imageDefinitionLoader.width * rowIndex + columnIndex] != 0) {//If the pixel has color
                    leftInsets = columnIndex;
                    break;
                }
            }
            for (int columnOffset = imageDefinitionLoader.width - 1; columnOffset >= leftInsets; columnOffset--) {//Right to Left
                if (imageDefinitionLoader.raster[imageDefinitionLoader.width * rowIndex + columnOffset] != 0) {//If the pixel has color
                    rightInsets = 1 + columnOffset;
                    break;
                }
            }
            is[imageDefinitionLoader.offsetY + rowIndex] = imageDefinitionLoader.offsetX + leftInsets;
            is_33_[imageDefinitionLoader.offsetY + rowIndex] = rightInsets - leftInsets;
        }
        ToolkitLoader toolkitLoader = graphicsToolkit.createClippingMask(sizeX, sizeY, is, is_33_);
        if (null == toolkitLoader) {
            return null;
        }
        class117 = new Class117(sizeX, sizeY, is_33_, is, toolkitLoader, 1411971043 * graphicID);
        aClass348_1136.put(class117, key);
        return class117;
    }

    public int method1117(int i, int i_39_) {
        if (null == this.params) {
            return i_39_;
        }
        IntNode class298_sub35 = ((IntNode) this.params.get((long) i));
        if (class298_sub35 == null) {
            return i_39_;
        }
        return class298_sub35.capacity * -774922497;
    }

    int[] decodeTransmitList(Buffer buffer) {
        int length = buffer.readUByte();
        if (0 == length) {
            return null;
        }
        int[] transmits = new int[length];
        for (int index = 0; index < length; index++)
            transmits[index] = buffer.readInt();
        return transmits;
    }

    public void method1119(int i, String string) {
        if (null == this.params) {
            this.params = new LinkedList(16);
            this.params.connect(new ObjectNode(string), (long) i);
        } else {
            ObjectNode class298_sub29 = ((ObjectNode) this.params.get((long) i));
            if (null != class298_sub29) {
                class298_sub29.unlink();
            }
            this.params.connect(new ObjectNode(string), (long) i);
        }
    }

    public void method1120(int i, short i_44_, short i_45_) {
        if (i < 5) {
            if (this.aShortArray1204 == null) {
                this.aShortArray1204 = new short[5];
                this.aShortArray1234 = new short[5];
            }
            this.aShortArray1204[i] = i_44_;
            this.aShortArray1234[i] = i_45_;
        }
    }

    public Skybox method1121(SkyBoxLoader class317, Class131 class131) {
        if (-1 == anInt1283 * 925824753) {
            return null;
        }
        long l = (((long) (1779368503 * anInt1304) & 0xffffL) << 48 | ((long) (anInt1202 * -163313477) & 0xffffL) << 32 | ((long) (anInt1176 * -1234146137) & 0xffffL) << 16 | (long) (anInt1283 * 925824753) & 0xffffL);
        Skybox class277 = (Skybox) aClass348_1296.get(l);
        if (class277 == null) {
            class277 = class317.method3845(anInt1283 * 925824753, 1779368503 * anInt1304, -163313477 * anInt1202, anInt1176 * -1234146137, class131);
            aClass348_1296.put(class277, l);
        }
        return class277;
    }

    public void resetHooks() {
        onLoadHookParameters = null;
        onClickHook = null;
        onClickRepeatHook = null;
        onReleaseHook = null;
        onHoldHook = null;
        onMouseOverHook = null;
        onMouseRepeatHook = null;
        onMouseLeaveHook = null;
        onDragHook = null;
        onDragCompleteHook = null;
        onTargetEnterHook = null;
        onTargetLeaveHook = null;
        onVarpTransmitHook = null;
        varpTransmitList = null;
        onInvTransmitHook = null;
        invTransmitList = null;
        onStatTransmitHook = null;
        statTransmitList = null;
        onVarcTransmitHook = null;
        globalVarTransmitList = null;
        onVarcStrTransmitHook = null;
        varcstrTransmitList = null;
        onTimerHook = null;
        onOptHook = null;
        onUseOnObjHook = null;
        onScrollWheelHook = null;
        anObjectArray1267 = null;
        anObjectArray1268 = null;
        anObjectArray1285 = null;
        anObjectArray1270 = null;
        anObjectArray1271 = null;
        anObjectArray1273 = null;
        anObjectArray1274 = null;
        anObjectArray1275 = null;
        anObjectArray1250 = null;
        anObjectArray1277 = null;
        anObjectArray1164 = null;
    }

    public void method1123(int i) {
        if (this.params != null) {
            Node class298 = this.params.get((long) i);
            if (class298 != null) {
                class298.unlink();
            }
        }
    }

    public ModelToolkit retrieveModels(GraphicsToolkit graphicsToolkit, int animationFlag, Class349 class349, IdentityKitDefinitionLoader idkLoader, NPCDefinitionLoader NPCDefinitionLoader, ItemDefinitionLoader itemDefLoader, Interface23 interface23, Animator animator, PlayerAppearance appearance) {
        aBoolean1139 = false;
        if (modelType * 1548853569 == 0) {
            return null;
        }
        if (modelType * 1548853569 == MODELTYPE_DEFAULT && modelID * 572201537 == -1) {
            return null;
        }
        if (modelType * 1548853569 == MODELTYPE_DEFAULT) {
            int flag = animationFlag;
            if (null != animator) {
                animationFlag |= animator.getAnimationFlag();
            }
            long l = -1L;
            long[] ls = Buffer.CRC_64;
            if (this.aShortArray1118 != null) {
                for (int i_50_ = 0; i_50_ < this.aShortArray1118.length; i_50_++) {
                    l = l >>> 8 ^ ls[(int) ((l ^ (long) ((this.aShortArray1118[i_50_]) >> 8)) & 0xffL)];
                    l = l >>> 8 ^ ls[(int) ((l ^ (long) (this.aShortArray1118[i_50_])) & 0xffL)];
                    l = l >>> 8 ^ ls[(int) ((l ^ (long) ((this.aShortArray1203[i_50_]) >> 8)) & 0xffL)];
                    l = l >>> 8 ^ ls[(int) ((l ^ (long) (this.aShortArray1203[i_50_])) & 0xffL)];
                }
                animationFlag |= 0x4000;
            }
            if (null != this.aShortArray1204) {
                for (int i_51_ = 0; i_51_ < this.aShortArray1204.length; i_51_++) {
                    l = l >>> 8 ^ ls[(int) ((l ^ (long) ((this.aShortArray1204[i_51_]) >> 8)) & 0xffL)];
                    l = l >>> 8 ^ ls[(int) ((l ^ (long) (this.aShortArray1204[i_51_])) & 0xffL)];
                    l = l >>> 8 ^ ls[(int) ((l ^ (long) ((this.aShortArray1234[i_51_]) >> 8)) & 0xffL)];
                    l = l >>> 8 ^ ls[(int) ((l ^ (long) (this.aShortArray1234[i_51_])) & 0xffL)];
                }
                animationFlag |= 0x8000;
            }
            long key = ((long) (graphicsToolkit.id * 580915349) << 59 | (long) (modelType * 1548853569) << 54 | (long) (this.modelID * 572201537) << 38 | l & 0x3fffffffffL);
            ModelToolkit modelToolkit = (ModelToolkit) modelsCache.get(key);
            if (null == modelToolkit || graphicsToolkit.method5017(modelToolkit.m(), animationFlag) != 0) {
                if (modelToolkit != null) {
                    animationFlag = graphicsToolkit.method5004(animationFlag, modelToolkit.m());
                }
                BaseModel model = BaseModel.load((Js5List.JS5_MODEL), 572201537 * this.modelID, 0);
                if (null == model) {
                    aBoolean1139 = true;
                    return null;
                }
                if (model.format < 13) {
                    model.scaleUp(2);
                }
                modelToolkit = graphicsToolkit.creatModelToolkit(model, animationFlag, StaticMethods.anInt275 * 951783317, 64, 768);
                if (null != this.aShortArray1118) {
                    for (int index = 0; index < this.aShortArray1118.length; index++)
                        modelToolkit.X((this.aShortArray1118[index]), (this.aShortArray1203[index]));
                }
                if (this.aShortArray1204 != null) {
                    for (int index = 0; index < this.aShortArray1204.length; index++)
                        modelToolkit.W((this.aShortArray1204[index]), (this.aShortArray1234[index]));
                }
                modelsCache.put(modelToolkit, key);
            }
            if (animator != null) {
                modelToolkit = modelToolkit.method4755((byte) 1, animationFlag, true);
                animator.animate(modelToolkit, 0);
            }
            modelToolkit.KA(flag);
            return modelToolkit;
        }
        if (1548853569 * modelType == MODELTYPE_NPC) {
            ModelToolkit modelToolkit = (NPCDefinitionLoader.load(572201537 * modelID).method6237(graphicsToolkit, animationFlag, interface23, animator, aClass498_1307));
            if (null == modelToolkit) {
                aBoolean1139 = true;
                return null;
            }
            return modelToolkit;
        }
        if (modelType * 1548853569 == MODELTYPE_PLAYER) {
            if (appearance == null) {
                return null;
            }
            ModelToolkit modelToolkit = appearance.method4543(graphicsToolkit, animationFlag, idkLoader, NPCDefinitionLoader, itemDefLoader, interface23, animator);
            if (modelToolkit == null) {
                aBoolean1139 = true;
                return null;
            }
            return modelToolkit;
        }
        if (modelType * 1548853569 == 4) {
            ItemDefinition itemDefinitions = itemDefLoader.getItemDefinitions(modelID * 572201537);
            ModelToolkit modelToolkit = itemDefinitions.drawPlayerEquipmentItems(graphicsToolkit, animationFlag, 10, appearance, animator, 0, 0, 0, 0);
            if (null == modelToolkit) {
                aBoolean1139 = true;
                return null;
            }
            return modelToolkit;
        }
        if (modelType * 1548853569 == 6) {
            ModelToolkit modelToolkit = (NPCDefinitionLoader.load(modelID * 572201537).method6246(graphicsToolkit, animationFlag, class349, interface23, animator, null, null, null, 0, aClass498_1307));
            if (modelToolkit == null) {
                aBoolean1139 = true;
                return null;
            }
            return modelToolkit;
        }
        if (1548853569 * modelType == MODELTYPE_OTHER_PLAYER) {
            if (null == appearance) {
                return null;
            }
            int model1 = modelID * 572201537 >>> 16;
            int model2 = modelID * 572201537 & 0xFFFF;
            int hashcode = 1148770405 * this.hashcode;
            ModelToolkit modelToolkit = appearance.method4544(graphicsToolkit, animationFlag, idkLoader, animator, model1, model2, hashcode);
            if (null == modelToolkit) {
                aBoolean1139 = true;
                return null;
            }
            return modelToolkit;
        }
        return null;
    }

    public void method1125(int i, int i_58_) {
        if (null == this.params) {
            this.params = new LinkedList(16);
            this.params.connect(new IntNode(i_58_), (long) i);
        } else {
            IntNode class298_sub35 = ((IntNode) this.params.get((long) i));
            if (class298_sub35 == null) {
                this.params.connect(new IntNode(i_58_), (long) i);
            } else {
                class298_sub35.capacity = -898670337 * i_58_;
            }
        }
    }

    public void method1126(int i, short i_60_, short i_61_) {
        if (i < 5) {
            if (null == this.aShortArray1118) {
                this.aShortArray1118 = new short[5];
                this.aShortArray1203 = new short[5];
            }
            this.aShortArray1118[i] = i_60_;
            this.aShortArray1203[i] = i_61_;
        }
    }

    public void setRightClickOptionCursor(int optionIDX, int optionCursorID) {
        if (optionCursors == null || optionCursors.length <= optionIDX) {
            int[] cursorID = new int[optionIDX + 1];
            if (optionCursors != null) {
                for (int index = 0; index < optionCursors.length; index++)
                    cursorID[index] = optionCursors[index];
                for (int index = optionCursors.length; index < optionIDX; index++)
                    cursorID[index] = -1;
            }
            optionCursors = cursorID;
        }
        optionCursors[optionIDX] = optionCursorID;
    }

    public SpriteToolkit createSprite(GraphicsToolkit graphicsToolkit) {
        aBoolean1139 = false;
        long l = (((flipV ? 1L : 0L) << 38) + (((alpha ? 1L : 0L) << 35) + (long) (graphicID * 1411971043) + ((long) (outline * 547522005) << 36)) + ((flipH ? 1L : 0L) << 39) + ((long) (shadow * -2065110161) << 40));
        SpriteToolkit spriteToolkit = (SpriteToolkit) spriteCache.get(l);
        if (null != spriteToolkit) {
            return spriteToolkit;
        }
        Sprite sprite = Sprite.loadFirst(Sprite.JS5_SPRITES, 1411971043 * graphicID, 0);
        if (sprite == null) {
            aBoolean1139 = true;
            return null;
        }
        if (flipV) {
            sprite.flipVertically();
        }
        if (flipH) {
            sprite.flipHorizontally();
        }
        if (outline * 547522005 > 0) {
            sprite.fixPadding(547522005 * outline);
        } else if (0 != -2065110161 * shadow) {
            sprite.fixPadding(1);
        }
        if (547522005 * outline >= 1) {
            sprite.addOutline(1);
        }
        if (outline * 547522005 >= 2) {
            sprite.addOutline(16777215);
        }
        if (0 != shadow * -2065110161) {
            sprite.replaceTransparent(~0xffffff | -2065110161 * shadow);
        }
        spriteToolkit = graphicsToolkit.createSpriteToolkit(sprite, true);
        spriteCache.put(spriteToolkit, l, (spriteToolkit.getWidth() * spriteToolkit.getHeight() * 4));
        return spriteToolkit;
    }

}
