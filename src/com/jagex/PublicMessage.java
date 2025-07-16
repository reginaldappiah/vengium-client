package com.jagex;/* Class102 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class PublicMessage {
	public int anInt1085;
	public int anInt1086 = Class107.method1403() * -740789311;
	public int rights;
	public String playerTitle;
	public String aString1089;
	public String playerMessageRights;
	public String playerName;
	public int anInt1092;
	public int anInt1093;
	public String rawPublicMessage;
	static int messageCapacity;
	static PublicMessage[] maxCharacterCount = new PublicMessage[300];


	PublicMessage(int rights, int i_7_, String playerTitle, String playerMessageRights, String playerName, String string_10_, int i_11_, String rawPublicMessage) {
		/*
		System.out.println("PUBLICMESSAGE CONSTRUCTIOR: " + 
		"\n rights: " + rights + 
		"\n i_7_: " + i_7_/849125275 + 
		"\n playerTitle: " + playerTitle + 
		"\n playerMessageRights: " + playerMessageRights +
		"\n displayName: " + displayName +
		"\n string_10_: " + string_10_ + 
		"\n i_11_: " + i_11_ + 
		"\n rawPublicMessage: " + rawPublicMessage);*/
		
		anInt1085 = GameClient.clientTick * -1698852737;
		this.rights = rights * 392659741;
		anInt1092 = 849125275 * i_7_;
		this.playerTitle = playerTitle;
		this.playerMessageRights = playerMessageRights;
		this.playerName = playerName;
		aString1089 = string_10_;
		anInt1093 = i_11_ * 1644525439;
		this.rawPublicMessage = rawPublicMessage;
	}
	
	void setPublicMessage(int rights, int i_0_, String playerTitle, String playerMessageRights, String playerName, String string_3_, int i_4_, String rawPublicMessage) {
			anInt1086 = Class107.method1403() * -740789311;
			anInt1085 = -1698852737 * GameClient.clientTick;
			this.rights = rights * 392659741;
			anInt1092 = i_0_ * 849125275;
			this.playerTitle = playerTitle;
			this.playerMessageRights = playerMessageRights;
			this.playerName = playerName;
			aString1089 = string_3_;
			anInt1093 = i_4_ * 1644525439;
			this.rawPublicMessage = rawPublicMessage;
	}

	public static void sendPublicMessage(int rights, int messageType, String playerTitle, String playerMessageRights, String playerName, String rawPublicMessage) {
			createPublicMessage(rights, messageType, playerTitle, playerMessageRights, playerName, rawPublicMessage, null, -1);
	}

	public static void clearMessage() {
			for (int index = 0; index < 100; index++)
				maxCharacterCount[index] = null;
			PublicMessage.messageCapacity = 0;
	}

	public static void createPublicMessage(int rights, int messageType, String playerTitle, String playerMessageRights, String playerName, String rawPublicMessage, String string_24_, int i_25_) {
			PublicMessage message = maxCharacterCount[99];
			for (int i_27_ = 99; i_27_ > 0; i_27_--)
				maxCharacterCount[i_27_] = maxCharacterCount[i_27_ - 1];
			if (message == null) {
				message = new PublicMessage(rights, messageType, playerTitle, playerMessageRights, playerName, string_24_, i_25_, rawPublicMessage);
			} else {
				message.setPublicMessage(rights, messageType, playerTitle, playerMessageRights, playerName, string_24_, i_25_, rawPublicMessage);
			}
			maxCharacterCount[0] = message;
			PublicMessage.messageCapacity += 760013237;
			GameClient.anInt8882 = GameClient.anInt8933 * 1619726147;
	}

	public static PublicMessage getMessageCharacterCount(int characters) {
			if (characters < 0 || characters >= 300)
				return null;
			return maxCharacterCount[characters];
	}

}
