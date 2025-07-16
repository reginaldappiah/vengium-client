package com.jagex;/* Class298_Sub47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.ColorUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class298_Sub47 extends Node {
    int[] anIntArray7535;
    int[] anIntArray7536;
    int[] anIntArray7537;
    int anInt7538;
    Field[] aFieldArray7539;
    byte[][][] aByteArrayArrayArray7540;
    Method[] aMethodArray7541;
    int anInt7542;

    Class298_Sub47() {
        /* empty */
    }

    static void method3535(Player player, boolean samePlane) {
        if (-278777595 * Class436.menuOptionCount < 410) {
            if (player == Player.myPlayer) {
                if (GameClient.interfaceSelected && (StaticMethods.anInt3192 * -112110875 & 0x10) != 0)
                    MenuOption.add(GameClient.selectedInterfaceOption, new StringBuilder().append(GameClient.aString8754).append(" ").append(Class26.lambdaExpression).append(" ").append(ColorUtils.htmlToHex(16777215)).append(Tradution.aClass470_5922.translate(GameLanguage.CURRENT_LANGUAGE)).toString(), Class240.targetOverCursors * 697885143, 16, -1, 0L, 0, 0, true, false, (long) (1888274983 * (player.entityIndex)), false);
            } else {
                String string;
                if (player.skillRating * 242930343 == 0) {
                    boolean bool_0_ = true;
                    if (-1 != (Player.myPlayer.combatRange) * 1792775047 && -1 != 1792775047 * (player.combatRange)) {
                        int i_1_ = (((1792775047 * (Player.myPlayer.combatRange)) < (player.combatRange * 1792775047)) ? (1792775047 * (Player.myPlayer.combatRange)) : (player.combatRange * 1792775047));
                        int i_2_ = ((696798311 * (Player.myPlayer.combat)) - 696798311 * (player.combat));
                        if (i_2_ < 0)
                            i_2_ = -i_2_;
                        if (i_2_ > i_1_)
                            bool_0_ = false;
                    }
                    String string_3_ = (GameClient.game == GameContext.stellardawn ? (Tradution.aClass470_5928.translate(GameLanguage.CURRENT_LANGUAGE)) : (Tradution.LEVEL.translate(GameLanguage.CURRENT_LANGUAGE)));
                    if (player.combat * 696798311 >= (player.boosted * 1868645317))
                        string = new StringBuilder().append(player.getPlayerName(true)).append(bool_0_ ? (Class18.method358((player.combat) * 696798311, (696798311 * (Player.myPlayer.combat)))) : ColorUtils.htmlToHex(16777215)).append(Class26.leftParenthesis).append(string_3_).append(player.combat * 696798311).append(Class26.rightParenthesis).toString();
                    else
                        string = new StringBuilder().append(player.getPlayerName(true)).append(bool_0_ ? (Class18.method358((player.combat) * 696798311, (696798311 * (Player.myPlayer.combat)))) : ColorUtils.htmlToHex(16777215)).append(Class26.leftParenthesis).append(string_3_).append(696798311 * (player.combat)).append("+").append((1868645317 * (player.boosted)) - (player.combat) * 696798311).append(Class26.rightParenthesis).toString();
                } else if (-1 == (player.skillRating * 242930343))
                    string = player.getPlayerName(true);
                else
                    string = new StringBuilder().append(player.getPlayerName(true)).append(Class26.leftParenthesis).append(Tradution.aClass470_5912.translate(GameLanguage.CURRENT_LANGUAGE)).append(242930343 * (player.skillRating)).append(Class26.rightParenthesis).toString();
                if (GameClient.interfaceSelected && !samePlane && (-112110875 * StaticMethods.anInt3192 & 0x8) != 0)
                    MenuOption.add(GameClient.selectedInterfaceOption, new StringBuilder().append(GameClient.aString8754).append(" ").append(Class26.lambdaExpression).append(" ").append(ColorUtils.htmlToHex(16777215)).append(string).toString(), 697885143 * Class240.targetOverCursors, 15, -1, (long) (1888274983 * (player.entityIndex)), 0, 0, true, false, (long) (1888274983 * (player.entityIndex)), false);
                if (!samePlane) {
                    for (int i_4_ = 7; i_4_ >= 0; i_4_--) {
                        if (GameClient.aStringArray8820[i_4_] != null) {
                            short i_5_ = 0;
                            if ((GameClient.game == GameContext.VENGIUM) && (GameClient.aStringArray8820[i_4_].equalsIgnoreCase(Tradution.ATTACK.translate(GameLanguage.CURRENT_LANGUAGE)))) {
                                if (GameClient.aBoolean8815 && ((player.combat) * 696798311 > (Player.myPlayer.combat) * 696798311))
                                    i_5_ = (short) 2000;
                                if ((0 != (Player.myPlayer.team) * -1473655357) && (-1473655357 * (player.team)) != 0) {
                                    if ((player.team) * -1473655357 == (Player.myPlayer.team) * -1473655357)
                                        i_5_ = (short) 2000;
                                    else
                                        i_5_ = (short) 0;
                                } else if (player.aBoolean10222)
                                    i_5_ = (short) 2000;
                            } else if (GameClient.aBooleanArray8821[i_4_])
                                i_5_ = (short) 2000;
                            short i_6_ = (short) (i_5_ + GameClient.aShortArray8818[i_4_]);
                            int i_7_ = (-1 != GameClient.anIntArray8904[i_4_] ? GameClient.anIntArray8904[i_4_] : GameClient.cursor * 1395924385);
                            MenuOption.add(GameClient.aStringArray8820[i_4_], new StringBuilder().append(ColorUtils.htmlToHex(16777215)).append(string).toString(), i_7_, i_6_, -1, (long) (1888274983 * (player.entityIndex)), 0, 0, true, false, (long) ((player.entityIndex) * 1888274983), false);
                        }
                    }
                } else
                    MenuOption.add(new StringBuilder().append(ColorUtils.htmlToHex(13421772)).append(string).toString(), "", -1, -1, 0, 0L, 0, 0, false, true, (long) (player.entityIndex * 1888274983), false);
                if (!samePlane) {
                    for (MenuOption menuOption = ((MenuOption) Class436.aClass453_5480.method5939()); menuOption != null; menuOption = ((MenuOption) Class436.aClass453_5480.method5944())) {
                        if (23 == 946432351 * (menuOption.componentID)) {
                            menuOption.aString9669 = new StringBuilder().append(ColorUtils.htmlToHex(16777215)).append(string).toString();
                            break;
                        }
                    }
                }
            }
        }
    }
}
