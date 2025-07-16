package com.jagex;/* ClanChannelChat - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.BitSet;

public class ClanChannelChat extends Node {
    public static ClanChannelChat clanManager;

    static {
        new BitSet(65536);
    }

    public byte minimumRankToKick;
    public int channelSize = 0;
    public String channelName = null;
    public ClanMember[] clanMembers;
    public byte minimumRankToChat;
    boolean readNameAsString;
    boolean readNameAsLong = true;
    int[] nameIndicies;
    long nextUpdateNumber;

    public ClanChannelChat(Buffer buffer) {
        method3098(buffer);
    }

    public int[] method3095() {
        if (this.nameIndicies == null) {
            String[] strings = new String[channelSize * 649879491];
            this.nameIndicies = new int[649879491 * channelSize];
            for (int index = 0; index < channelSize * 649879491; index++) {
                strings[index] = clanMembers[index].playerDisplayName;
                this.nameIndicies[index] = index;
            }
            Class298_Sub32_Sub32.method3345(strings, (this.nameIndicies));
        }
        return this.nameIndicies;
    }

    void method3096(ClanMember clanMember) {
        if (clanMembers == null || 649879491 * channelSize >= clanMembers.length)
            method3099(5 + 649879491 * channelSize);
        clanMembers[(channelSize += 506595563) * 649879491 - 1] = clanMember;
        this.nameIndicies = null;
    }

    public int method3097(String string) {
        for (int index = 0; index < 649879491 * channelSize; index++) {
            if (clanMembers[index].playerDisplayName.equalsIgnoreCase(string))
                return index;
        }
        return -1;
    }

    void method3098(Buffer buffer) {
        int nameMask = buffer.readUByte();
        if ((nameMask & 0x1) != 0)
            this.readNameAsString = true;
        if ((nameMask & 0x2) != 0)
            this.readNameAsLong = true;
        key = (buffer.readLong() * 4191220306876042991L);
        this.nextUpdateNumber = (buffer.readLong() * 8816161044679006451L);
        channelName = buffer.readString();
        buffer.readUByte();
        minimumRankToKick = buffer.readByte();
        minimumRankToChat = buffer.readByte();
        channelSize = buffer.readUShort() * 506595563;
        if (channelSize * 649879491 > 0) {
            clanMembers = new ClanMember[649879491 * channelSize];
            for (int index = 0; index < channelSize * 649879491; index++) {
                ClanMember clanMember = new ClanMember();
                if (this.readNameAsString)
                    buffer.readLong();
                if (this.readNameAsLong)
                    clanMember.playerDisplayName = buffer.readString();
                clanMember.playerRank = buffer.readByte();
                clanMember.playerWorldID = buffer.readUShort() * -62810701;
                clanMembers[index] = clanMember;
            }
        }
    }

    void method3099(int i) {
        if (null != clanMembers)
            Class425.method5737(clanMembers, 0, clanMembers = new ClanMember[i], 0, channelSize * 649879491);
        else
            clanMembers = new ClanMember[i];
    }

    void method3100(int i) {
        channelSize -= 506595563;
        if (0 == channelSize * 649879491)
            clanMembers = null;
        else
            Class425.method5737(clanMembers, 1 + i, clanMembers, i, channelSize * 649879491 - i);
        this.nameIndicies = null;
    }

}
