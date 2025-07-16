package com.jagex;

import com.jagex.game.cache.config.prefetch.Js5List;
import com.jagex.game.settings.RemoveRoofsSetting;
import com.jagex.utils.CameraUtils;

/**
 * Created by Krimsonowl on 8/19/2017.
 */
public class SceneRenderer {
    static final void drawScreenScene(int x, int y, int width, int height, boolean resizable) {
        if (GameClient.myRegion.getRegion() == null)
            GameClient.activeGraphicsToolkit.fillRectangle(x, y, width, height, -16777216);
        else {
            Vector3f vertex3f = (Player.myPlayer.getWorldTransform().trans);
            boolean bool_6_ = false;
            if (3 != 1596783995 * GameClient.anInt8724) {
                if (!GameClient.cameraGloballyUpdated)
                    bool_6_ = true;
            } else if ((int) vertex3f.x < 0 || ((int) vertex3f.x >= GameClient.myRegion.getMapWidth() * 512) || (int) vertex3f.z < 0 || ((int) vertex3f.z >= (GameClient.myRegion.getMapLength() * 512)))
                bool_6_ = true;
            if (bool_6_)
                GameClient.activeGraphicsToolkit.fillRectangle(x, y, width, height, -16777216);
            else {
                GameClient.flashTick += 859732235;
                if (null != Player.myPlayer && ((int) vertex3f.x - (Player.myPlayer.getSize() - 1) * 256) >> 9 == Minimap.flagX * 2076926079 && (((int) vertex3f.z - (Player.myPlayer.getSize() - 1) * 256) >> 9 == -376303645 * Minimap.flagY)) {
                    Minimap.flagX = 1129029761;
                    Minimap.flagY = 1835291189;
                    IComponentUpdateNode.createResetWalkingEdit();
                }
                Class80.method855();
                if (!resizable)
                    StaticMethods.sendProjectileFixedScene();
                StaticMethods.method3401(x, y, width, height, true);
                x = GameClient.anInt8936 * -1868355265;
                y = GameClient.anInt8747 * -689948187;
                width = GameClient.anInt8664 * -505673857;
                height = 1387083365 * GameClient.anInt8939;
                StaticMethods.method3138(x, y);
                if (CameraUtils.cameraType * -863531439 == 4) {
                    int yOffset = (int) GameClient.cameraYAngle;
                    if (-523207831 * GameClient.cameraYOffset >> 8 > yOffset)
                        yOffset = GameClient.cameraYOffset * -523207831 >> 8;
                    if (GameClient.enabledCameraShakeSlots[4] && GameClient.cameraShakeDistance[4] + 128 > yOffset)
                        yOffset = 128 + GameClient.cameraShakeDistance[4];
                    int xOffset = ((-1419578297 * GameClient.cameraXOffset + (int) GameClient.cameraXAngle) & 0x3fff);
                    Class482.method6121(1103750049 * Class75.anInt708, Class356.getAverageHeight((int) vertex3f.x, (int) vertex3f.z, GameClient.plane * 1855729883, -1979916029) - 200, Class106.anInt1309 * 1346160791, yOffset, xOffset, (yOffset >> 3) * 3 + 600 << 2, height);
                } else if (CameraUtils.FREE_FORM == -863531439 * CameraUtils.cameraType) {
                    int yAngle = (int) GameClient.cameraYAngle;
                    if (-523207831 * GameClient.cameraYOffset >> 8 > yAngle)
                        yAngle = -523207831 * GameClient.cameraYOffset >> 8;
                    if (GameClient.enabledCameraShakeSlots[4] && 128 + GameClient.cameraShakeDistance[4] > yAngle)
                        yAngle = 128 + GameClient.cameraShakeDistance[4];
                    int xAngle = (int) GameClient.cameraXAngle & 0x3fff;
                    Class482.method6121(Class75.anInt708 * 1103750049, Class356.getAverageHeight((-2080858977 * GameClient.anInt8753), 1818837461 * GameClient.anInt8755, 1855729883 * GameClient.plane, -898849874) - 200, Class106.anInt1309 * 1346160791, yAngle, xAngle, 3 * (yAngle >> 3) + 600 << 2, height);
                } else if (5 == -863531439 * CameraUtils.cameraType)
                    StaticMethods.method535(height);
                int positionX = GameClient.camPosX * -1740717447;
                int positionY = GameClient.camPosY * 1449634147 ;
                int positionZ = GameClient.camPosZ * -299812095;
                int rotationX = GameClient.camRotX * -104436553;
                int rotationY = GameClient.camRotY * -1847894591;
                for (int index = 0; index < 5; index++) {
                    if (GameClient.enabledCameraShakeSlots[index]) {
                        int cameraHash = (int) ((Math.random() * (double) (2 * (GameClient.anIntArray8860[index]) + 1)) - (double) (GameClient.anIntArray8860[index]) + ((Math.sin((double) (GameClient.anIntArray8790[index]) * ((double) (GameClient.anIntArray8926[index]) / 100.0))) * (double) (GameClient.cameraShakeDistance[index])));
                        if (index == 0)
                            GameClient.camPosX += (cameraHash << 2) * 547882953;
                        if (index == 1)
                            GameClient.camPosY += 1078403147 * (cameraHash << 2);
                        if (2 == index)
                            GameClient.camPosZ += 309839105 * (cameraHash << 22);
                        if (index == 3)
                            GameClient.camRotY = (cameraHash + GameClient.camRotY * -1847894591 & 0x3fff) * -1587695039;
                        if (4 == index) {
                            GameClient.camRotX += -648269561 * cameraHash;
                            if (GameClient.camRotX * -104436553 < 1024)
                                GameClient.camRotX = 1891900416;
                            else if (-104436553 * GameClient.camRotX > 3072)
                                GameClient.camRotX = 1380733952;
                        }
                    }
                }
                if (-1740717447 * GameClient.camPosX < 0)
                    GameClient.camPosX = 0;
                if (GameClient.camPosX * -1740717447 > ((GameClient.myRegion.getRegion().cameraXLimit) * 1988988347 << 9) - 1)
                    GameClient.camPosX = (((GameClient.myRegion.getRegion().cameraXLimit) * 1988988347 << 9) - 1) * 547882953;
                if (-299812095 * GameClient.camPosZ < 0)
                    GameClient.camPosZ = 0;
                if (-299812095 * GameClient.camPosZ > ((GameClient.myRegion.getRegion().cameraYLimit) * 1340714547 << 9) - 1)
                    GameClient.camPosZ = (((GameClient.myRegion.getRegion().cameraYLimit) * 1340714547 << 9) - 1) * 309839105;

                StaticMethods.configRoofAngle();
                GameClient.activeGraphicsToolkit.method5187(x, y, width, height);
                GameClient.activeGraphicsToolkit.setClip(x, y, x + width, y + height);
                Atmosphere atmosphere = GameClient.myRegion.getLightningDetails().getAtmosphere();
                int skyColor = atmosphere.getSkyColor();
                if (Loader.OLDSCHOOL_RSMVER)
                    skyColor = 13156520;
                GameClient.cameraMatrix.setMatrix((float) -(GameClient.camPosX * -1740717447), (float) -(1449634147 * GameClient.camPosY), (float) -(GameClient.camPosZ * -299812095));
                GameClient.cameraMatrix.rotate(0.0F, -1.0F, 0.0F, CircleAngleTable.toDegrees(-(GameClient.camRotY * -1847894591) & 0x3fff));
                GameClient.cameraMatrix.rotate(-1.0F, 0.0F, 0.0F, CircleAngleTable.toDegrees(-(GameClient.camRotX * -104436553) & 0x3fff));
                GameClient.cameraMatrix.rotate(0.0F, 0.0F, -1.0F, CircleAngleTable.toDegrees(-(GameClient.camRotZ * -1466297851) & 0x3fff));
                GameClient.activeGraphicsToolkit.cw(GameClient.cameraMatrix);
                StaticMethods.method889(GameClient.viewMatrix, true, (float) (width / 2), (float) (height / 2), (float) (-2134375937 * GameClient.anInt8940 << 1), (float) (-2134375937 * GameClient.anInt8940 << 1), width, height);
                GameClient.activeGraphicsToolkit.ci(GameClient.viewMatrix);
                if (atmosphere.getSkybox() != null) {
                    GameClient.activeGraphicsToolkit.setModelAmbient(1.0F);
                    GameClient.activeGraphicsToolkit.updateSun(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
                    atmosphere.getSkybox().render(GameClient.activeGraphicsToolkit, Atmosphere.anInt1685 * -1285178091 << 3, x, y, width, height, GameClient.camRotX * -104436553, GameClient.camRotY * -1847894591, GameClient.camRotZ * -1466297851, skyColor, true, false);
                } else
                    GameClient.activeGraphicsToolkit.clear(3, skyColor);
                Class298_Sub40_Sub13.method3518(GameClient.cameraMatrix, GameClient.viewMatrix, width, height, -1854574289);
                GameClient.myRegion.getLightningDetails().method4323(GameClient.myRegion);
                byte roofValue = (SettingsManager.settingsManager.currentRoofs.getValue() == RemoveRoofsSetting.SELECTIVELY ? (byte) (-1953789277 * GameClient.flashTick) : (byte) 1);
                GameClient.myRegion.getRegion().method4040(GameClient.clientTick * 443738891, GameClient.camPosX * -1740717447, 1449634147 * GameClient.camPosY, GameClient.camPosZ * -299812095, GameClient.myRegion.getRoofFlags(), GameClient.anIntArray8793, GameClient.anIntArray8670, GameClient.anIntArray8795, GameClient.anIntArray8641, GameClient.anIntArray8797, 1 + (Player.myPlayer.plane), roofValue, (int) vertex3f.x >> 9, (int) vertex3f.z >> 9, SettingsManager.settingsManager.flickeringEffects.getValue() == 0, true, 0, true);
                GameClient.stateTicks += -2109562397;
                StaticMethods.method2365();
                if (-1233866115 * GameClient.gameState == 0) {
                    renderTileMessages(x, y);
                    renderPlayerOverHead(x, y, width, height);
                    renderHintIcons(x, y);
                    renderMouseCross();
                }
                System.out.println("Camera Type: " + CameraUtils.cameraType / 863531439);
                GameClient.myRegion.getRegion().resetDynamics();
                GameClient.aBoolean8917 = false;
                GameClient.camPosX = positionX * 547882953;
                GameClient.camPosY = positionY * 1078403147;
                GameClient.camPosZ = positionZ * 309839105;
                GameClient.camRotX = rotationX * -648269561;
                GameClient.camRotY = rotationY * -1587695039;
                if (GameClient.isLoading && PaddedResourceWorker.protocol.getHighPriorityRequestsCount() == 0)
                    GameClient.isLoading = false;
                if (GameClient.isLoading) {
                    GameClient.activeGraphicsToolkit.fillRectangle(x, y, width, height, -16777216);
                    StaticMethods.drawCornerLoadingBox((Tradution.LOADING_PLEASE_WAIT.translate(GameLanguage.CURRENT_LANGUAGE)), false, GameClient.activeGraphicsToolkit, StaticMethods.aClass264_3673, StaticMethods.aClass505_8369);
                }
                StaticMethods.method889(GameClient.viewMatrix, false, (float) (width / 2 + x), (float) (height / 2 + y), (float) (-2134375937 * GameClient.anInt8940 << 1), (float) (-2134375937 * GameClient.anInt8940 << 1), width, height);
                GameClient.activeGraphicsToolkit.ci(GameClient.viewMatrix);
                Class252.method2410(GameClient.viewMatrix);
            }
        }
    }

    static final void renderHintIcons(int i, int i_2_) {
        HintIcon[] hintIcons = HintIcon.loadedIcons;
        for (int index = 0; index < hintIcons.length; index++) {
            HintIcon hintIcon = hintIcons[index];
            if (hintIcon != null) {
                if (hintIcon.targetType * 958933333 == 2) {
                    StaticMethods.translateTo3DPosition((hintIcon.plane * -458864019), -1338192389 * hintIcon.coordX, 1018128075 * hintIcon.coordY, (hintIcon.arrowHeight * 143254950));
                    if (GameClient.translated3DCoord[0] > -1.0F && 443738891 * GameClient.clientTick % 20 < 10) {
                        SpriteToolkit renderSprite = (HintIcon.arrowTypeSprites[-92466201 * hintIcon.arrowType]);
                        int worldX = (int) ((float) i + GameClient.translated3DCoord[0] - 12.0F);
                        int worldY = (int) ((float) i_2_ + GameClient.translated3DCoord[1] - 28.0F);
                        renderSprite.draw(worldX, worldY);
                    }
                }
            }
        }
    }

    static final void renderTileMessages(int x, int y) {
        for (TileMessage message = ((TileMessage) GameClient.aClass442_8650.method5868()); null != message; message = (TileMessage) GameClient.aClass442_8650.method5872()) {
            if (GameClient.clientTick * 443738891 >= 591467947 * message.anInt7655)
                message.unlink();
            else {
                StaticMethods.translateTo3DPosition((message.plane * 1759796085), 256 + ((message.x * 1495033107) << 9), 256 + ((-1852462101 * message.y) << 9), 587842750 * message.height);
                StaticMethods.b12_full_monochrome.drawTextCentered(message.message, (int) ((float) x + GameClient.translated3DCoord[0]), (int) (GameClient.translated3DCoord[1] + (float) y), ~0xffffff | 1160845051 * message.color, 0);
            }
        }
    }

    static final void renderMouseCross() {
        int clickX = -933698717 * GameClient.anInt8784;
        int clickY = 1036219865 * GameClient.anInt8785;
        if (1 == GameClient.mouseClickTargetType * -392325587) {
            SpriteToolkit renderSprite = (StaticMethods.aClass57Array6861[GameClient.mouseClickTicker * 1347929875 / 100]);
            renderSprite.draw(clickX - 8, clickY - 8);
        }
        if (2 == GameClient.mouseClickTargetType * -392325587) {
            SpriteToolkit renderSprite = (StaticMethods.aClass57Array6861[4 + GameClient.mouseClickTicker * 1347929875 / 100]);
            renderSprite.draw(clickX - 8, clickY - 8);
        }
    }

    static final void renderPlayerOverHead(int i, int i_344_, int i_345_, int i_346_) {
        try {
            int i_350_ = 1168366243 * Class10.entitiesInRegion;
            int[] is = Class10.players;
            GameClient.anInt8905 = 0;
            int i_351_;
            if (GameClient.anInt8724 * 1596783995 == 0)
                i_351_ = Class87.aClass94Array794.length;
            else
                i_351_ = i_350_ + GameClient.entitySize * -1230451913;
            for (int i_352_ = 0; i_352_ < i_351_; i_352_++) {
                NPCDefinition class503 = null;
                Entity class365_sub1_sub1_sub2;
                if (0 == 1596783995 * GameClient.anInt8724) {
                    Class94 class94 = Class87.aClass94Array794[i_352_];
                    if (!class94.aBoolean912) {
                        continue;
                    }
                    class365_sub1_sub1_sub2 = class94.method1015();
                    if (class365_sub1_sub1_sub2.anInt10066 * -1706825291 != -1953789277 * GameClient.flashTick) {
                        continue;
                    }
                    if (class94.anInt909 * 1762367763 >= 0) {
                        class503 = ((NPC) class365_sub1_sub1_sub2).aClass503_10190;
                        if (class503.morphisms != null) {
                            class503 = class503.morph(Class128.playerVarsProvider);
                            if (class503 == null) {
                                continue;
                            }
                        }
                    }
                } else {
                    if (i_352_ < i_350_)
                        class365_sub1_sub1_sub2 = (GameClient.entities[is[i_352_]]);
                    else {
                        class365_sub1_sub1_sub2 = ((Entity) ((ObjectNode) (GameClient.entityList.get((long) GameClient.entityKeys[i_352_ - i_350_]))).nodeObject);
                        class503 = ((NPC) class365_sub1_sub1_sub2).aClass503_10190;
                        if (null != class503.morphisms) {
                            class503 = class503.morph(Class128.playerVarsProvider);
                            if (null == class503) {
                                continue;
                            }
                        }
                    }
                    if (class365_sub1_sub1_sub2.anInt10071 * 648883167 < 0) {
                        continue;
                    }
                    if ((-1706825291 * class365_sub1_sub1_sub2.anInt10066 != -1953789277 * GameClient.flashTick) && (class365_sub1_sub1_sub2.plane != (Player.myPlayer.plane))) {
                        continue;
                    }
                }
                StaticMethods.method2440(class365_sub1_sub1_sub2, class365_sub1_sub1_sub2.method4363());
                if (GameClient.translated3DCoord[0] < 0.0F) {

                } else {
                    if (class365_sub1_sub1_sub2.method4429((byte) -114)) {
                        Class62 class62 = class365_sub1_sub1_sub2.method4437(-593782084);
                        if (class62 != null && (-559111197 * GameClient.anInt8905 < 547709851 * GameClient.anInt8644)) {
                            GameClient.anIntArray8909[(GameClient.anInt8905 * -559111197)] = (Class82_Sub19_Sub1.aClass505_9111.method6264(class62.method721())) / 2;
                            GameClient.anIntArray8907[(-559111197 * GameClient.anInt8905)] = (int) GameClient.translated3DCoord[0];
                            GameClient.anIntArray8908[(GameClient.anInt8905 * -559111197)] = (int) GameClient.translated3DCoord[1];
                            GameClient.aClass62Array8657[(-559111197 * GameClient.anInt8905)] = class62;
                            GameClient.anInt8905 += -392578613;
                        }
                    }
                    int i_353_ = (int) (GameClient.translated3DCoord[1] + (float) i_344_);
                    if (!class365_sub1_sub1_sub2.aBoolean10123 && (-1472450313 * class365_sub1_sub1_sub2.anInt10116 > 443738891 * GameClient.clientTick)) {
                        int i_354_ = -1;
                        int i_355_ = 1;
                        if (null == class503) {
                            Player class365_sub1_sub1_sub2_sub2 = (GameClient.entities[is[i_352_]]);
                            i_354_ = (class365_sub1_sub1_sub2.method4426().anInt3738) * 2108452425;
                            if (class365_sub1_sub1_sub2_sub2.aBoolean10203)
                                i_355_ = 2;
                        } else {
                            i_354_ = -1362808149 * class503.anInt6167;
                            if (-1 == i_354_)
                                i_354_ = (class365_sub1_sub1_sub2.method4426().anInt3738) * 2108452425;
                        }
                        SpriteToolkit[] class57s = Class160.aClass57Array1646;
                        if (i_354_ != -1) {
                            SpriteToolkit[] class57s_356_ = (SpriteToolkit[]) GameClient.aClass348_8780.get((long) i_354_);
                            if (null == class57s_356_) {
                                Sprite[] class89s = Sprite.load((Js5List.JS5_SPRITES), i_354_, 0);
                                if (class89s != null) {
                                    class57s_356_ = new SpriteToolkit[class89s.length];
                                    for (int i_357_ = 0; i_357_ < class89s.length; i_357_++)
                                        class57s_356_[i_357_] = (GameClient.activeGraphicsToolkit.createSpriteToolkit(class89s[i_357_], true));
                                    GameClient.aClass348_8780.put(class57s_356_, (long) i_354_);
                                }
                            }
                            if (null != class57s_356_ && class57s_356_.length >= 2)
                                class57s = class57s_356_;
                        }
                        if (i_355_ >= class57s.length)
                            i_355_ = 1;
                        SpriteToolkit class57 = class57s[0];
                        SpriteToolkit class57_358_ = class57s[i_355_];
                        i_353_ -= Math.max((Class82_Sub19_Sub1.aClass505_9111.anInt6202) * 1110385787, class57.getHeight());
                        int i_359_ = (int) (GameClient.translated3DCoord[0] + (float) i - (float) (class57.getWidth() >> 1));
                        int i_360_ = (class57.getWidth() * (class365_sub1_sub1_sub2.anInt10063 * -766383861) / 255);
                        int i_361_ = class57.getHeight();
                        if (-766383861 * class365_sub1_sub1_sub2.anInt10063 > 0 && i_360_ < 2)
                            i_360_ = 2;
                        class57.draw(i_359_, i_353_);
                        GameClient.activeGraphicsToolkit.constrainClip(i_359_, i_353_, i_359_ + i_360_, i_353_ + i_361_);
                        class57_358_.draw(i_359_, i_353_);
                        GameClient.activeGraphicsToolkit.setClip(i, i_344_, i_345_ + i, i_346_ + i_344_);
                    } else
                        i_353_ -= Math.max(1110385787 * (Class82_Sub19_Sub1.aClass505_9111.anInt6202), Class160.aClass57Array1646[0].getHeight());
                    i_353_ -= 2;
                    if (!class365_sub1_sub1_sub2.aBoolean10123) {
                        if (-424347101 * class365_sub1_sub1_sub2.anInt10086 > 443738891 * GameClient.clientTick) {
                            SpriteToolkit class57 = (Class401.aClass57Array6561[(class365_sub1_sub1_sub2.aBoolean10119 ? 2 : 0)]);
                            SpriteToolkit class57_362_ = (Class401.aClass57Array6561[(class365_sub1_sub1_sub2.aBoolean10119 ? 3 : 1)]);
                            int i_363_ = -1;
                            if (class365_sub1_sub1_sub2 instanceof NPC) {
                                i_363_ = class503.anInt6184 * -1088584623;
                                if (-1 == i_363_)
                                    i_363_ = ((class365_sub1_sub1_sub2.method4426().anInt3754) * -2139195165);
                            } else
                                i_363_ = (class365_sub1_sub1_sub2.method4426().anInt3754) * -2139195165;
                            if (-1 != i_363_) {
                                SpriteToolkit[] class57s = ((SpriteToolkit[]) GameClient.aClass348_8898.get((long) i_363_));
                                if (class57s == null) {
                                    Sprite[] class89s = Sprite.load((Js5List.JS5_SPRITES), i_363_, 0);
                                    if (class89s != null) {
                                        class57s = new SpriteToolkit[class89s.length];
                                        for (int i_364_ = 0; i_364_ < class89s.length; i_364_++)
                                            class57s[i_364_] = (GameClient.activeGraphicsToolkit.createSpriteToolkit(class89s[i_364_], true));
                                        GameClient.aClass348_8898.put(class57s, (long) i_363_);
                                    }
                                }
                                if (class57s != null && class57s.length == 4) {
                                    class57 = class57s[(class365_sub1_sub1_sub2.aBoolean10119) ? 2 : 0];
                                    class57_362_ = class57s[(class365_sub1_sub1_sub2.aBoolean10119) ? 3 : 1];
                                }
                            }
                            int i_365_ = ((class365_sub1_sub1_sub2.anInt10086 * -424347101) - GameClient.clientTick * 443738891);
                            int i_366_;
                            if (i_365_ <= (-1547810795 * class365_sub1_sub1_sub2.anInt10088))
                                i_366_ = class57.getWidth();
                            else {
                                i_365_ -= (-1547810795 * class365_sub1_sub1_sub2.anInt10088);
                                int i_367_ = ((class365_sub1_sub1_sub2.anInt10096 * 293281353) == 0 ? 0 : (((class365_sub1_sub1_sub2.anInt10087 * 878490761) - i_365_) / (class365_sub1_sub1_sub2.anInt10096 * 293281353) * (293281353 * (class365_sub1_sub1_sub2.anInt10096))));
                                i_366_ = (class57.getWidth() * i_367_ / (class365_sub1_sub1_sub2.anInt10087 * 878490761));
                            }
                            int i_368_ = class57.getHeight();
                            i_353_ -= i_368_;
                            int i_369_ = (int) (GameClient.translated3DCoord[0] + (float) i - (float) (class57.getWidth() >> 1));
                            class57.draw(i_369_, i_353_);
                            GameClient.activeGraphicsToolkit.constrainClip(i_369_, i_353_, i_366_ + i_369_, i_368_ + i_353_);
                            class57_362_.draw(i_369_, i_353_);
                            GameClient.activeGraphicsToolkit.setClip(i, i_344_, i_345_ + i, i_346_ + i_344_);
                            i_353_ -= 2;
                        }
                        if (class503 == null) {
                            Player class365_sub1_sub1_sub2_sub2 = ((Player) class365_sub1_sub1_sub2);
                            if (-1 != (class365_sub1_sub1_sub2_sub2.skullIconID * -1126079563)) {
                                SpriteToolkit class57 = (StaticMethods.aClass57Array5334[(class365_sub1_sub1_sub2_sub2.skullIconID) * -1126079563]);
                                i_353_ -= class57.getHeight();
                                class57.draw((int) ((float) i + (GameClient.translated3DCoord[0]) - 12.0F), i_353_);
                                i_353_ -= 2;
                            }
                            if (-1 != (class365_sub1_sub1_sub2_sub2.prayerIconID * -2031128911)) {
                                SpriteToolkit class57 = (StaticMethods.aClass57Array5351[(-2031128911 * (class365_sub1_sub1_sub2_sub2.prayerIconID))]);
                                i_353_ -= class57.getHeight();
                                class57.draw((int) ((GameClient.translated3DCoord[0]) + (float) i - 12.0F), i_353_);
                                i_353_ -= 2;
                            }
                        } else if (-986687803 * class503.headIcons >= 0 && (-986687803 * class503.headIcons < StaticMethods.aClass57Array5351.length)) {
                            SpriteToolkit class57 = (StaticMethods.aClass57Array5351[class503.headIcons * -986687803]);
                            i_353_ -= class57.getHeight();
                            class57.draw((int) ((float) i + GameClient.translated3DCoord[0] - (float) (class57.getWidth() >> 1)), i_353_);
                            i_353_ -= 2;
                        }
                    }
                    if (class365_sub1_sub1_sub2 instanceof Player) {
                        if (i_352_ >= 0) {
                            int i_370_ = 0;
                            HintIcon[] hintIcons = HintIcon.loadedIcons;
                            for (int i_371_ = 0; i_371_ < hintIcons.length; i_371_++) {
                                HintIcon hintIcon = hintIcons[i_371_];
                                if (hintIcon != null && 10 == hintIcon.targetType * 958933333 && (is[i_352_] == -841622081 * hintIcon.targetIndex)) {
                                    SpriteToolkit class57 = (HintIcon.arrowTypeSprites[(hintIcon.arrowType * -92466201)]);
                                    if (class57.getHeight() > i_370_)
                                        i_370_ = class57.getHeight();
                                    class57.draw((int) (GameClient.translated3DCoord[0] + (float) i - 12.0F), i_353_ - class57.getHeight());
                                }
                            }
                            if (i_370_ > 0)
                                i_353_ -= 2 + i_370_;
                        }
                    } else {
                        int i_372_ = 0;
                        HintIcon[] hintIcons = HintIcon.loadedIcons;
                        for (int index = 0; index < hintIcons.length; index++) {
                            HintIcon hintIcon = hintIcons[index];
                            if (null != hintIcon && hintIcon.targetType * 958933333 == 1 && (hintIcon.targetIndex * -841622081 == (GameClient.entityKeys[i_352_ - i_350_]))) {
                                SpriteToolkit arrowTypeSprite = (HintIcon.arrowTypeSprites[(-92466201 * hintIcon.arrowType)]);
                                if (arrowTypeSprite.getHeight() > i_372_)
                                    i_372_ = arrowTypeSprite.getHeight();
                                boolean bool;
                                if (hintIcon.arrowFlashRate * -519856529 == 0)
                                    bool = true;
                                else {
                                    int i_374_ = (StaticMethods.method883() * 1000 / (-519856529 * hintIcon.arrowFlashRate) / 2);
                                    bool = (443738891 * GameClient.clientTick % (2 * i_374_)) < i_374_;
                                }
                                if (bool)
                                    arrowTypeSprite.draw((int) ((float) i + GameClient.translated3DCoord[0] - 12.0F), i_353_ - arrowTypeSprite.getHeight());
                            }
                        }
                        if (i_372_ > 0)
                            i_353_ -= i_372_ + 2;
                    }
                    int i_375_ = 0;
                    for (/**/; (i_375_ < Js5List.JS5_DEFAULTS.maxHitsplats * -942466371); i_375_++) {
                        int i_376_ = class365_sub1_sub1_sub2.anIntArray10080[i_375_];
                        int i_377_ = class365_sub1_sub1_sub2.anIntArray10102[i_375_];
                        HitsplatDefinition hitsplatDefinition = null;
                        int i_378_ = 0;
                        if (i_377_ >= 0) {
                            if (i_376_ <= GameClient.clientTick * 443738891) {
                                continue;
                            }
                            hitsplatDefinition = (HitsplatDefinitionLoader.aClass347_6117.method4176((class365_sub1_sub1_sub2.anIntArray10102[i_375_])));
                            i_378_ = -169339039 * hitsplatDefinition.duration;
                        } else if (i_376_ < 0) {
                            continue;
                        }
                        int i_379_ = class365_sub1_sub1_sub2.anIntArray10127[i_375_];
                        HitsplatDefinition hitsplatDefinition_380_ = null;
                        if (i_379_ >= 0)
                            hitsplatDefinition_380_ = HitsplatDefinitionLoader.aClass347_6117.method4176(i_379_);
                        if (i_376_ - i_378_ > 443738891 * GameClient.clientTick) {

                        } else {
                            int i_381_ = (class365_sub1_sub1_sub2.anIntArray10081[i_375_]);
                            if (i_381_ >= 0) {
                                class365_sub1_sub1_sub2.anInt10063 = 1207474851 * i_381_;
                                class365_sub1_sub1_sub2.anInt10116 = (GameClient.clientTick * -1044781683 + -362436300);
                                class365_sub1_sub1_sub2.anIntArray10081[i_375_] = -1;
                            }
                            if (null == hitsplatDefinition)
                                class365_sub1_sub1_sub2.anIntArray10080[i_375_] = -1;
                            else {
                                int i_382_ = (class365_sub1_sub1_sub2.method4363() / 2);
                                StaticMethods.method2440(class365_sub1_sub1_sub2, i_382_);
                                if (GameClient.translated3DCoord[0] > -1.0F) {
                                    GameClient.translated3DCoord[0] += (float) (Js5List.JS5_DEFAULTS.anIntArray4033[i_375_]);
                                    GameClient.translated3DCoord[1] += (float) (Js5List.JS5_DEFAULTS.anIntArray4034[i_375_]);
                                    Object object = null;
                                    Object object_383_ = null;
                                    Object object_384_ = null;
                                    Object object_385_ = null;
                                    int i_386_ = 0;
                                    int i_387_ = 0;
                                    int i_388_ = 0;
                                    int i_389_ = 0;
                                    int i_390_ = 0;
                                    int i_391_ = 0;
                                    int i_392_ = 0;
                                    int i_393_ = 0;
                                    SpriteToolkit class57 = null;
                                    SpriteToolkit class57_394_ = null;
                                    SpriteToolkit class57_395_ = null;
                                    SpriteToolkit class57_396_ = null;
                                    int i_397_ = 0;
                                    int i_398_ = 0;
                                    int i_399_ = 0;
                                    int i_400_ = 0;
                                    int i_401_ = 0;
                                    int i_402_ = 0;
                                    int i_403_ = 0;
                                    int i_404_ = 0;
                                    int i_405_ = 0;
                                    SpriteToolkit class57_406_ = hitsplatDefinition.getIconSprite((GameClient.activeGraphicsToolkit));
                                    if (class57_406_ != null) {
                                        i_386_ = class57_406_.getWidth();
                                        int i_407_ = class57_406_.getHeight();
                                        if (i_407_ > i_405_)
                                            i_405_ = i_407_;
                                        class57_406_.method622(GameClient.anIntArray8977);
                                        i_390_ = GameClient.anIntArray8977[0];
                                    }
                                    SpriteToolkit class57_408_ = hitsplatDefinition.method4284((GameClient.activeGraphicsToolkit));
                                    if (class57_408_ != null) {
                                        i_387_ = class57_408_.getWidth();
                                        int i_409_ = class57_408_.getHeight();
                                        if (i_409_ > i_405_)
                                            i_405_ = i_409_;
                                        class57_408_.method622(GameClient.anIntArray8977);
                                        i_391_ = GameClient.anIntArray8977[0];
                                    }
                                    SpriteToolkit class57_410_ = hitsplatDefinition.getLeftSprite((GameClient.activeGraphicsToolkit));
                                    if (null != class57_410_) {
                                        i_388_ = class57_410_.getWidth();
                                        int i_411_ = class57_410_.getHeight();
                                        if (i_411_ > i_405_)
                                            i_405_ = i_411_;
                                        class57_410_.method622(GameClient.anIntArray8977);
                                        i_392_ = GameClient.anIntArray8977[0];
                                    }
                                    SpriteToolkit class57_412_ = hitsplatDefinition.getRightSprite((GameClient.activeGraphicsToolkit));
                                    if (class57_412_ != null) {
                                        i_389_ = class57_412_.getWidth();
                                        int i_413_ = class57_412_.getHeight();
                                        if (i_413_ > i_405_)
                                            i_405_ = i_413_;
                                        class57_412_.method622(GameClient.anIntArray8977);
                                        i_393_ = GameClient.anIntArray8977[0];
                                    }
                                    if (hitsplatDefinition_380_ != null) {
                                        class57 = (hitsplatDefinition_380_.getIconSprite(GameClient.activeGraphicsToolkit));
                                        if (null != class57) {
                                            i_397_ = class57.getWidth();
                                            int i_414_ = class57.getHeight();
                                            if (i_414_ > i_405_)
                                                i_405_ = i_414_;
                                            class57.method622(GameClient.anIntArray8977);
                                            i_401_ = GameClient.anIntArray8977[0];
                                        }
                                        class57_394_ = (hitsplatDefinition_380_.method4284(GameClient.activeGraphicsToolkit));
                                        if (null != class57_394_) {
                                            i_398_ = class57_394_.getWidth();
                                            int i_415_ = class57_394_.getHeight();
                                            if (i_415_ > i_405_)
                                                i_405_ = i_415_;
                                            class57_394_.method622(GameClient.anIntArray8977);
                                            i_402_ = GameClient.anIntArray8977[0];
                                        }
                                        class57_395_ = (hitsplatDefinition_380_.getLeftSprite(GameClient.activeGraphicsToolkit));
                                        if (null != class57_395_) {
                                            i_399_ = class57_395_.getWidth();
                                            int i_416_ = class57_395_.getHeight();
                                            if (i_416_ > i_405_)
                                                i_405_ = i_416_;
                                            class57_395_.method622(GameClient.anIntArray8977);
                                            i_403_ = GameClient.anIntArray8977[0];
                                        }
                                        class57_396_ = (hitsplatDefinition_380_.getRightSprite(GameClient.activeGraphicsToolkit));
                                        if (class57_396_ != null) {
                                            i_400_ = class57_396_.getWidth();
                                            int i_417_ = class57_396_.getHeight();
                                            if (i_417_ > i_405_)
                                                i_405_ = i_417_;
                                            class57_396_.method622(GameClient.anIntArray8977);
                                            i_404_ = GameClient.anIntArray8977[0];
                                        }
                                    }
                                    FontToolkit class264 = FontToolkit.fontToolkit;
                                    FontToolkit class264_418_ = FontToolkit.fontToolkit;
                                    RSFontMetrics class505 = Class74.aClass505_695;
                                    RSFontMetrics class505_419_ = Class74.aClass505_695;
                                    int i_420_ = -160359777 * hitsplatDefinition.font;
                                    if (i_420_ >= 0) {
                                        FontToolkit class264_421_ = ((FontToolkit) (StaticMethods5.fonts.loadOther(GameClient.defaultFontRenderProvider, i_420_, true, true)));
                                        RSFontMetrics class505_422_ = (StaticMethods5.fonts.method1879(GameClient.defaultFontRenderProvider, i_420_));
                                        if (class264_421_ != null && class505_422_ != null) {
                                            class264 = class264_421_;
                                            class505 = class505_422_;
                                        }
                                    }
                                    if (hitsplatDefinition_380_ != null) {
                                        i_420_ = (hitsplatDefinition_380_.font * -160359777);
                                        if (i_420_ >= 0) {
                                            FontToolkit class264_423_ = ((FontToolkit) (StaticMethods5.fonts.loadOther(GameClient.defaultFontRenderProvider, i_420_, true, true)));
                                            RSFontMetrics class505_424_ = (StaticMethods5.fonts.method1879(GameClient.defaultFontRenderProvider, i_420_));
                                            if (class264_423_ != null && null != class505_424_) {
                                                class264_418_ = class264_423_;
                                                class505_419_ = class505_424_;
                                            }
                                        }
                                    }
                                    Object object_425_ = null;
                                    String string = null;
                                    boolean bool = false;
                                    int i_426_ = 0;
                                    String string_427_ = (hitsplatDefinition.formatAmount((class365_sub1_sub1_sub2.anIntArray10079[i_375_])));
                                    int i_428_ = class505.method6264(string_427_);
                                    if (hitsplatDefinition_380_ != null) {
                                        string = (hitsplatDefinition_380_.formatAmount((class365_sub1_sub1_sub2.anIntArray10083[i_375_])));
                                        i_426_ = (class505_419_.method6264(string));
                                    }
                                    int i_429_ = 0;
                                    int i_430_ = 0;
                                    if (i_387_ > 0)
                                        i_429_ = 1 + i_428_ / i_387_;
                                    if (hitsplatDefinition_380_ != null && i_398_ > 0)
                                        i_430_ = i_426_ / i_398_ + 1;
                                    int i_431_ = 0;
                                    int i_432_ = i_431_;
                                    if (i_386_ > 0)
                                        i_431_ += i_386_;
                                    i_431_ += 2;
                                    int i_433_ = i_431_;
                                    if (i_388_ > 0)
                                        i_431_ += i_388_;
                                    int i_434_ = i_431_;
                                    int i_435_ = i_431_;
                                    if (i_387_ > 0) {
                                        int i_436_ = i_387_ * i_429_;
                                        i_431_ += i_436_;
                                        i_435_ += (i_436_ - i_428_) / 2;
                                    } else
                                        i_431_ += i_428_;
                                    int i_437_ = i_431_;
                                    if (i_389_ > 0)
                                        i_431_ += i_389_;
                                    int i_438_ = 0;
                                    int i_439_ = 0;
                                    int i_440_ = 0;
                                    int i_441_ = 0;
                                    int i_442_ = 0;
                                    if (null != hitsplatDefinition_380_) {
                                        i_431_ += 2;
                                        i_438_ = i_431_;
                                        if (i_397_ > 0)
                                            i_431_ += i_397_;
                                        i_431_ += 2;
                                        i_439_ = i_431_;
                                        if (i_399_ > 0)
                                            i_431_ += i_399_;
                                        i_440_ = i_431_;
                                        i_442_ = i_431_;
                                        if (i_398_ > 0) {
                                            int i_443_ = i_398_ * i_430_;
                                            i_431_ += i_443_;
                                            i_442_ += (i_443_ - i_426_) / 2;
                                        } else
                                            i_431_ += i_426_;
                                        i_441_ = i_431_;
                                        if (i_400_ > 0)
                                            i_431_ += i_400_;
                                    }
                                    int i_444_ = ((class365_sub1_sub1_sub2.anIntArray10080[i_375_]) - GameClient.clientTick * 443738891);
                                    int i_445_ = (hitsplatDefinition.offsetX * 584392085 - (hitsplatDefinition.offsetX * 584392085 * i_444_ / (-169339039 * hitsplatDefinition.duration)));
                                    int i_446_ = (-(hitsplatDefinition.offsetY * 639965299) + (i_444_ * (639965299 * hitsplatDefinition.offsetY) / (hitsplatDefinition.duration * -169339039)));
                                    int i_447_ = (int) ((float) i_445_ + (GameClient.translated3DCoord[0] + (float) i - (float) (i_431_ >> 1)));
                                    int i_448_ = (int) ((float) i_344_ + GameClient.translated3DCoord[1] - 12.0F + (float) i_446_);
                                    int i_449_ = i_448_;
                                    int i_450_ = i_448_ + i_405_;
                                    int i_451_ = (-176522889 * hitsplatDefinition.anInt3862 + (i_448_ + 15));
                                    int i_452_ = (i_451_ - class505.anInt6202 * 1110385787);
                                    int i_453_ = (i_451_ + class505.anInt6197 * -1883958527);
                                    if (i_452_ < i_449_)
                                        i_449_ = i_452_;
                                    if (i_453_ > i_450_)
                                        i_450_ = i_453_;
                                    int i_454_ = 0;
                                    if (hitsplatDefinition_380_ != null) {
                                        i_454_ = (hitsplatDefinition_380_.anInt3862 * -176522889) + (i_448_ + 15);
                                        int i_455_ = i_454_ - (class505_419_.anInt6202 * 1110385787);
                                        int i_456_ = (i_454_ + (-1883958527 * class505_419_.anInt6197));
                                        if (i_455_ < i_449_)
                                            i_449_ = i_455_;
                                        if (i_456_ > i_450_)
                                            i_450_ = i_456_;
                                    }
                                    int i_457_ = 255;
                                    if (hitsplatDefinition.fade * 1445195441 >= 0)
                                        i_457_ = ((i_444_ << 8) / ((-169339039 * hitsplatDefinition.duration) - (1445195441 * hitsplatDefinition.fade)));
                                    if (i_457_ >= 0 && i_457_ < 255) {
                                        int i_458_ = i_457_ << 24;
                                        int i_459_ = i_458_ | 0xffffff;
                                        if (class57_406_ != null)
                                            class57_406_.draw((i_432_ + i_447_ - i_390_), i_448_, 0, i_459_, 1);
                                        if (class57_410_ != null)
                                            class57_410_.draw((i_433_ + i_447_ - i_392_), i_448_, 0, i_459_, 1);
                                        if (class57_408_ != null) {
                                            for (int i_460_ = 0; i_460_ < i_429_; i_460_++)
                                                class57_408_.draw((i_434_ + i_447_ - i_391_ + i_387_ * i_460_), i_448_, 0, i_459_, 1);
                                        }
                                        if (null != class57_412_)
                                            class57_412_.draw((i_437_ + i_447_ - i_393_), i_448_, 0, i_459_, 1);
                                        class264.method2488(string_427_, i_435_ + i_447_, i_451_, ((1473512559 * (hitsplatDefinition.textColor)) | i_458_), 0);
                                        if (hitsplatDefinition_380_ != null) {
                                            if (class57 != null)
                                                class57.draw((i_447_ + i_438_ - i_401_), i_448_, 0, i_459_, 1);
                                            if (null != class57_395_)
                                                class57_395_.draw(i_447_ + i_439_ - i_403_, i_448_, 0, i_459_, 1);
                                            if (class57_394_ != null) {
                                                for (int i_461_ = 0; i_461_ < i_430_; i_461_++)
                                                    class57_394_.draw((i_461_ * i_398_ + (i_440_ + i_447_ - i_402_)), i_448_, 0, i_459_, 1);
                                            }
                                            if (null != class57_396_)
                                                class57_396_.draw(i_447_ + i_441_ - i_404_, i_448_, 0, i_459_, 1);
                                            class264_418_.method2488(string, i_447_ + i_442_, i_454_, (hitsplatDefinition_380_.textColor * 1473512559) | i_458_, 0);
                                        }
                                    } else {
                                        if (class57_406_ != null)
                                            class57_406_.draw((i_447_ + i_432_ - i_390_), i_448_);
                                        if (class57_410_ != null)
                                            class57_410_.draw((i_433_ + i_447_ - i_392_), i_448_);
                                        if (class57_408_ != null) {
                                            for (int i_462_ = 0; i_462_ < i_429_; i_462_++)
                                                class57_408_.draw((i_387_ * i_462_ + (i_447_ + i_434_ - i_391_)), i_448_);
                                        }
                                        if (class57_412_ != null)
                                            class57_412_.draw((i_437_ + i_447_ - i_393_), i_448_);
                                        class264.method2488(string_427_, i_435_ + i_447_, i_451_, (((hitsplatDefinition.textColor) * 1473512559) | ~0xffffff), 0);
                                        if (hitsplatDefinition_380_ != null) {
                                            if (class57 != null)
                                                class57.draw((i_438_ + i_447_ - i_401_), i_448_);
                                            if (class57_395_ != null)
                                                class57_395_.draw(i_447_ + i_439_ - i_403_, i_448_);
                                            if (null != class57_394_) {
                                                for (int i_463_ = 0; i_463_ < i_430_; i_463_++)
                                                    class57_394_.draw((i_440_ + i_447_ - i_402_ + i_463_ * i_398_), i_448_);
                                            }
                                            if (null != class57_396_)
                                                class57_396_.draw(i_441_ + i_447_ - i_404_, i_448_);
                                            class264_418_.method2488(string, i_442_ + i_447_, i_454_, (hitsplatDefinition_380_.textColor * 1473512559) | ~0xffffff, 0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (int i_464_ = 0; i_464_ < 1306491689 * GameClient.anInt8659; i_464_++) {
                int i_465_ = GameClient.anIntArray8851[i_464_];
                Entity entity1;
                if (i_465_ < 2048)
                    entity1 = (GameClient.entities[i_465_]);
                else
                    entity1 = ((Entity) (((ObjectNode) GameClient.entityList.get((long) (i_465_ - 2048))).nodeObject));
                int playerIndex = GameClient.anIntArray8779[i_464_];
                Entity entity;
                if (playerIndex < 2048)
                    entity = (GameClient.entities[playerIndex]);
                else
                    entity = ((Entity) (((ObjectNode) GameClient.entityList.get((long) (playerIndex - 2048))).nodeObject));
                StaticMethods.method1320(entity1, entity, (entity1.anInt10069 -= 512067143) * -152681609, i, i_344_);
            }
            int i_468_ = (1110385787 * Class82_Sub19_Sub1.aClass505_9111.anInt6202 + -1883958527 * Class82_Sub19_Sub1.aClass505_9111.anInt6197 + 2);
            for (int i_469_ = 0; i_469_ < GameClient.anInt8905 * -559111197; i_469_++) {
                int i_470_ = GameClient.anIntArray8907[i_469_];
                int i_471_ = GameClient.anIntArray8908[i_469_];
                int i_472_ = GameClient.anIntArray8909[i_469_];
                boolean bool = true;
                while (bool) {
                    bool = false;
                    for (int i_473_ = 0; i_473_ < i_469_; i_473_++) {
                        if (2 + i_471_ > GameClient.anIntArray8908[i_473_] - i_468_ && (i_471_ - i_468_ < GameClient.anIntArray8908[i_473_] + 2) && (i_470_ - i_472_ < (GameClient.anIntArray8909[i_473_] + GameClient.anIntArray8907[i_473_])) && (i_470_ + i_472_ > (GameClient.anIntArray8907[i_473_] - GameClient.anIntArray8909[i_473_])) && (GameClient.anIntArray8908[i_473_] - i_468_ < i_471_)) {
                            i_471_ = GameClient.anIntArray8908[i_473_] - i_468_;
                            bool = true;
                        }
                    }
                }
                GameClient.anIntArray8908[i_469_] = i_471_;
                String string = GameClient.aClass62Array8657[i_469_].method721();
                if (0 == GameClient.anInt8842 * 1805045055) {
                    int i_474_ = 16776960;
                    int i_475_ = GameClient.aClass62Array8657[i_469_].method720();
                    if (i_475_ < 6)
                        i_474_ = GameClient.anIntArray8911[i_475_];
                    if (i_475_ == 6)
                        i_474_ = (GameClient.flashTick * -1953789277 % 20 < 10 ? 16711680 : 16776960);
                    if (i_475_ == 7)
                        i_474_ = (-1953789277 * GameClient.flashTick % 20 < 10 ? 255 : 65535);
                    if (8 == i_475_)
                        i_474_ = (-1953789277 * GameClient.flashTick % 20 < 10 ? 45056 : 8454016);
                    if (i_475_ == 9) {
                        int i_476_ = 150 - (GameClient.aClass62Array8657[i_469_].method722() * 150 / GameClient.aClass62Array8657[i_469_].getChatOverHeadDuration());
                        if (i_476_ < 50)
                            i_474_ = i_476_ * 1280 + 16711680;
                        else if (i_476_ < 100)
                            i_474_ = 16776960 - 327680 * (i_476_ - 50);
                        else if (i_476_ < 150)
                            i_474_ = (i_476_ - 100) * 5 + 65280;
                    }
                    if (10 == i_475_) {
                        int i_477_ = 150 - (GameClient.aClass62Array8657[i_469_].method722() * 150 / GameClient.aClass62Array8657[i_469_].getChatOverHeadDuration());
                        if (i_477_ < 50)
                            i_474_ = 5 * i_477_ + 16711680;
                        else if (i_477_ < 100)
                            i_474_ = 16711935 - (i_477_ - 50) * 327680;
                        else if (i_477_ < 150)
                            i_474_ = (255 + 327680 * (i_477_ - 100) - (i_477_ - 100) * 5);
                    }
                    if (i_475_ == 11) {
                        int i_478_ = 150 - (GameClient.aClass62Array8657[i_469_].method722() * 150 / GameClient.aClass62Array8657[i_469_].getChatOverHeadDuration());
                        if (i_478_ < 50)
                            i_474_ = 16777215 - 327685 * i_478_;
                        else if (i_478_ < 100)
                            i_474_ = 327685 * (i_478_ - 50) + 65280;
                        else if (i_478_ < 150)
                            i_474_ = 16777215 - 327680 * (i_478_ - 100);
                    }
                    int i_479_ = i_474_ | ~0xffffff;
                    int i_480_ = GameClient.aClass62Array8657[i_469_].method719();
                    if (0 == i_480_)
                        StaticMethods.b12_full_monochrome.drawTextCentered(string, i + i_470_, i_471_ + i_344_, i_479_, -16777216);
                    if (1 == i_480_)
                        StaticMethods.b12_full_monochrome.method2477(string, i + i_470_, i_471_ + i_344_, i_479_, -16777216, -1953789277 * GameClient.flashTick);
                    if (2 == i_480_)
                        StaticMethods.b12_full_monochrome.method2478(string, i_470_ + i, i_471_ + i_344_, i_479_, -16777216, (GameClient.flashTick * -1953789277));
                    if (i_480_ == 3) {
                        int i_481_ = 150 - (GameClient.aClass62Array8657[i_469_].method722() * 150 / GameClient.aClass62Array8657[i_469_].getChatOverHeadDuration());
                        StaticMethods.b12_full_monochrome.method2479(string, i_470_ + i, i_471_ + i_344_, i_479_, -16777216, (GameClient.flashTick * -1953789277), i_481_);
                    }
                    if (i_480_ == 4) {
                        int i_482_ = 150 - (GameClient.aClass62Array8657[i_469_].method722() * 150 / GameClient.aClass62Array8657[i_469_].getChatOverHeadDuration());
                        int i_483_ = i_482_ * (Class82_Sub19_Sub1.aClass505_9111.method6264(string) + 100) / 150;
                        GameClient.activeGraphicsToolkit.constrainClip(i_470_ + i - 50, i_344_, i + i_470_ + 50, i_344_ + i_346_);
                        StaticMethods.b12_full_monochrome.method2488(string, (50 + (i_470_ + i) - i_483_), i_344_ + i_471_, i_479_, -16777216);
                        GameClient.activeGraphicsToolkit.setClip(i, i_344_, i + i_345_, i_346_ + i_344_);
                    }
                    if (i_480_ == 5) {
                        int i_484_ = 150 - (GameClient.aClass62Array8657[i_469_].method722() * 150 / GameClient.aClass62Array8657[i_469_].getChatOverHeadDuration());
                        int i_485_ = 0;
                        if (i_484_ < 25)
                            i_485_ = i_484_ - 25;
                        else if (i_484_ > 125)
                            i_485_ = i_484_ - 125;
                        int i_486_ = ((Class82_Sub19_Sub1.aClass505_9111.anInt6202 * 1110385787) + -1883958527 * (Class82_Sub19_Sub1.aClass505_9111.anInt6197));
                        GameClient.activeGraphicsToolkit.constrainClip(i, i_344_ + i_471_ - i_486_ - 1, i_345_ + i, i_471_ + i_344_ + 5);
                        StaticMethods.b12_full_monochrome.drawTextCentered(string, i + i_470_, i_485_ + (i_344_ + i_471_), i_479_, -16777216);
                        GameClient.activeGraphicsToolkit.setClip(i, i_344_, i_345_ + i, i_344_ + i_346_);
                    }
                } else
                    StaticMethods.b12_full_monochrome.drawTextCentered(string, i_470_ + i, i_344_ + i_471_, -256, -16777216);
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("kb.jm(").append(')').toString());
        }
    }
}
