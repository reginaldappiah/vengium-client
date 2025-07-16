package com.jagex.network;/* Class198 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class OutgoingPacket {

	
    public static OutgoingPacket aClass198_1995 = new OutgoingPacket(2, -1);
    public static OutgoingPacket SEND_SETTINGS = new OutgoingPacket(10, -1);
    public static OutgoingPacket aClass198_2085 = new OutgoingPacket(11, -1);
    public static OutgoingPacket aClass198_2005 = new OutgoingPacket(12, -1);
    public static OutgoingPacket aClass198_2008 = new OutgoingPacket(15, 6);
    public static OutgoingPacket aClass198_2073 = new OutgoingPacket(18, -1);
    public static OutgoingPacket aClass198_2072 = new OutgoingPacket(19, -2);
    public static OutgoingPacket aClass198_2004 = new OutgoingPacket(28, 4);
    public static OutgoingPacket aClass198_2028 = new OutgoingPacket(35, -1);
    public static OutgoingPacket aClass198_2032 = new OutgoingPacket(39, 4);
    public static OutgoingPacket aClass198_2034 = new OutgoingPacket(41, -1);
    public static OutgoingPacket aClass198_2037 = new OutgoingPacket(44, -2);
    public static OutgoingPacket aClass198_2040 = new OutgoingPacket(47, 4);
    public static OutgoingPacket aClass198_2045 = new OutgoingPacket(52, -1);
    public static OutgoingPacket aClass198_2087 = new OutgoingPacket(63, 12);
    public static OutgoingPacket aClass198_2082 = new OutgoingPacket(64, 4);
    public static OutgoingPacket aClass198_2062 = new OutgoingPacket(69, 15);
    public static OutgoingPacket aClass198_2063 = new OutgoingPacket(70, 1);
    public static OutgoingPacket aClass198_2068 = new OutgoingPacket(75, -2);
    public static OutgoingPacket aClass198_2011 = new OutgoingPacket(78, 1);
    public static OutgoingPacket aClass198_2053 = new OutgoingPacket(79, 3);
    public static OutgoingPacket aClass198_2021 = new OutgoingPacket(84, 1);
    public static OutgoingPacket aClass198_2071 = new OutgoingPacket(87, 4);
    public static OutgoingPacket aClass198_2084 = new OutgoingPacket(91, -2);
    public static OutgoingPacket aClass198_2059 = new OutgoingPacket(93, -1);
    public static OutgoingPacket aClass198_1998 = new OutgoingPacket(94, 9);
    public static OutgoingPacket aClass198_2088 = new OutgoingPacket(95, -2);
    public static OutgoingPacket aClass198_2036 = new OutgoingPacket(99, 2);
    public static OutgoingPacket aClass198_2093 = new OutgoingPacket(100, -2);

    //Player Movement
    public static OutgoingPacket WALKING_PACKET = new OutgoingPacket(8, -1);
    public static OutgoingPacket MINI_WALKING_PACKET = new OutgoingPacket(58, -1);

    //Map
    public static OutgoingPacket MINI_UNWALKABLE = new OutgoingPacket(13, 7);

    //Action Buttons
    public static OutgoingPacket ACTION_BUTTON1_PACKET = new OutgoingPacket(14, 8);
    public static OutgoingPacket ACTION_BUTTON2_PACKET = new OutgoingPacket(67, 8);
    public static OutgoingPacket ACTION_BUTTON3_PACKET = new OutgoingPacket(5, 8);
    public static OutgoingPacket ACTION_BUTTON4_PACKET = new OutgoingPacket(55, 8);
    public static OutgoingPacket ACTION_BUTTON5_PACKET = new OutgoingPacket(68, 8);
    public static OutgoingPacket ACTION_BUTTON6_PACKET = new OutgoingPacket(90, 8);
    public static OutgoingPacket ACTION_BUTTON7_PACKET = new OutgoingPacket(6, 8);
    public static OutgoingPacket ACTION_BUTTON8_PACKET = new OutgoingPacket(32, 8);
    public static OutgoingPacket ACTION_BUTTON9_PACKET = new OutgoingPacket(27, 8);
    public static OutgoingPacket ACTION_BUTTON10_PACKET = new OutgoingPacket(96, 8);

    //Player Options
    public static OutgoingPacket PLAYER_OPTION_1_PACKET = new OutgoingPacket(42, 3);
    public static OutgoingPacket PLAYER_OPTION_2_PACKET = new OutgoingPacket(46, 3);
    public static OutgoingPacket PLAYER_OPTION_3_PACKET = new OutgoingPacket(88, 3);
    public static OutgoingPacket PLAYER_OPTION_4_PACKET = new OutgoingPacket(17, 3);
    public static OutgoingPacket PLAYER_OPTION_5_PACKET = new OutgoingPacket(77, 3);
    public static OutgoingPacket PLAYER_OPTION_6_PACKET = new OutgoingPacket(49, 3);
    public static OutgoingPacket PLAYER_OPTION_7_PACKET = new OutgoingPacket(51, 3);
    public static OutgoingPacket PLAYER_OPTION_8_PACKET = new OutgoingPacket(85, 3);
    public static OutgoingPacket PLAYER_OPTION_9_PACKET = new OutgoingPacket(56, 3);
    public static OutgoingPacket PLAYER_OPTION_10_PACKET = new OutgoingPacket(7, 3);

    //NPC Options
    public static OutgoingPacket ATTACK_NPC_PACKET = new OutgoingPacket(20, 3);
    public static OutgoingPacket NPC_CLICK1_PACKET = new OutgoingPacket(31, 3);
    public static OutgoingPacket NPC_CLICK2_PACKET = new OutgoingPacket(101, 3);
    public static OutgoingPacket NPC_CLICK3_PACKET = new OutgoingPacket(34, 3);
    public static OutgoingPacket NPC_CLICK4_PACKET = new OutgoingPacket(65, 3);
    public static OutgoingPacket NPC_EXAMINE_PACKET = new OutgoingPacket(9, 3);

    //Object Options
    public static OutgoingPacket OBJECT_CLICK1_PACKET = new OutgoingPacket(26, 9);
    public static OutgoingPacket OBJECT_CLICK2_PACKET = new OutgoingPacket(59, 9);
    public static OutgoingPacket OBJECT_CLICK3_PACKET = new OutgoingPacket(40, 9);
    public static OutgoingPacket OBJECT_CLICK4_PACKET = new OutgoingPacket(23, 9);
    public static OutgoingPacket OBJECT_CLICK5_PACKET = new OutgoingPacket(80, 9);
    public static OutgoingPacket EXAMINE_OBJECT_PACKET = new OutgoingPacket(25, 9);

    //Keyboard and Mouse
    public static OutgoingPacket KEY_TYPED = new OutgoingPacket(1, -2);

    //Screen
    public static OutgoingPacket SCREEN_PACKET = new OutgoingPacket(98, 6);
    public static OutgoingPacket MOVE_CAMERA_PACKET = new OutgoingPacket(103, 4);

    //Interface
    public static OutgoingPacket INTERFACE_ON_PLAYER = new OutgoingPacket(50, 11);
    public static OutgoingPacket INTERFACE_ON_NPC = new OutgoingPacket(66, 11);
    public static OutgoingPacket INTERFACE_ON_OBJECT = new OutgoingPacket(37, 17);
    public static OutgoingPacket ITEM_ON_ITEM = new OutgoingPacket(3, 16);
    public static OutgoingPacket CLOSE_INTERFACE_PACKET = new OutgoingPacket(54, 0);
    public static OutgoingPacket SWITCH_INTERFACE_ITEM_PACKET = new OutgoingPacket(76, 16);

    //Interface Component Buttons
    public static OutgoingPacket WORLD_MAP_CLICK_PACKET = new OutgoingPacket(38, 4);
    public static OutgoingPacket REPORT_ABUSE = new OutgoingPacket(16, 2);

    //Item
    public static OutgoingPacket aClass198_2002 = new OutgoingPacket(61, 7);
    public static OutgoingPacket aClass198_2050 = new OutgoingPacket(43, 7);
    public static OutgoingPacket ITEM_TAKE_PACKET = new OutgoingPacket(57, 7);
    public static OutgoingPacket aClass198_2055 = new OutgoingPacket(62, 7);
    public static OutgoingPacket aClass198_2038 = new OutgoingPacket(45, 7);
    public static OutgoingPacket ITEM_ON_FLOOR_EXAMINE = new OutgoingPacket(102, 7);

    //Scripts
    public static OutgoingPacket ENTER_INTEGER_PACKET = new OutgoingPacket(81, 4);
    public static OutgoingPacket ENTER_LONG_TEXT_PACKET = new OutgoingPacket(48, -1);
    public static OutgoingPacket ENTER_NAME_PACKET = new OutgoingPacket(29, -1);
    public static OutgoingPacket COLOR_ID_PACKET = new OutgoingPacket(97, 2);
    public static OutgoingPacket GRAND_EXCHANGE_ITEM_SELECT = new OutgoingPacket(71, 2);
    public static OutgoingPacket DIALOGUE_CONTINUE_PACKET = new OutgoingPacket(72, 6);

    //Messaging
    public static OutgoingPacket CHAT_PACKET = new OutgoingPacket(53, -1);
    public static OutgoingPacket CHAT_TYPE_PACKET = new OutgoingPacket(83, 1);
    public static OutgoingPacket PUBLIC_QUICK_CHAT_PACKET = new OutgoingPacket(86, -1);
    public static OutgoingPacket SEND_FRIEND_MESSAGE_PACKET = new OutgoingPacket(82, -2);
    public static OutgoingPacket SEND_FRIEND_QUICK_CHAT_PACKET = new OutgoingPacket(0, -2);

    //Friends, Ignore, and FC/CC List
    public static OutgoingPacket ADD_FRIEND_PACKET = new OutgoingPacket(89, -1);
    public static OutgoingPacket REMOVE_FRIEND_PACKET = new OutgoingPacket(24, -1);
    public static OutgoingPacket ADD_IGNORE_PACKET = new OutgoingPacket(4, -1);
    public static OutgoingPacket REMOVE_IGNORE_PACKET = new OutgoingPacket(73, -1);
    public static OutgoingPacket JOIN_FRIEND_CHAT_PACKET = new OutgoingPacket(36, -1);
    public static OutgoingPacket KICK_FRIEND_CHAT_PACKET = new OutgoingPacket(74, -1);
    public static OutgoingPacket CHANGE_FRIEND_CHAT_PACKET = new OutgoingPacket(22, -1);
    public static OutgoingPacket KICK_CLAN_CHAT_PACKET = new OutgoingPacket(92, -1);

    //Other
    public static OutgoingPacket PING_PACKET = new OutgoingPacket(21, 0);
    public static OutgoingPacket COMMANDS_PACKET = new OutgoingPacket(60, -1);
    public static OutgoingPacket DONE_LOADING_REGION_PACKET = new OutgoingPacket(30, 0);
    public static OutgoingPacket RECEIVE_PACKET_COUNT_PACKET = new OutgoingPacket(33, 4);
    public static OutgoingPacket RECIEVE_PLAYER_COORDINATE_SYSTEM_PACKET = new OutgoingPacket(104, -1);
    public static OutgoingPacket BUTTON_TILE_PACKET = new OutgoingPacket(105,1);

    public int id;
    public int length;

    OutgoingPacket(int id, int length) {
        this.id = -525230381 * id;
        this.length = 1381077963 * length;
    }

}
