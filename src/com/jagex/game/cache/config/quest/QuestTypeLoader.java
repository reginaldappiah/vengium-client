package com.jagex.game.cache.config.quest;/* Class362 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.Buffer;
import com.jagex.Interface23;
import com.jagex.Js5FileSystem;
import com.jagex.game.cache.config.ConfigType;

public class QuestTypeLoader {
    QuestType[] questTypes;
    int totalQuests;
    Js5FileSystem JS5_QUESTS;

    public QuestTypeLoader(Js5FileSystem fileSystem, boolean refresh) {
        this.JS5_QUESTS = fileSystem;
        if (this.JS5_QUESTS != null)
            this.totalQuests = (this.JS5_QUESTS.getFileSystem(-1006924897 * ConfigType.QUESTS.type)) * 70760625;
        else
            this.totalQuests = 0;
        if (refresh) {
            this.questTypes = new QuestType[1223397457 * this.totalQuests];
            for (int fileID = 0; fileID < this.totalQuests * 1223397457; fileID++) {
                byte[] data;
                synchronized (this.JS5_QUESTS) {
                    data = (this.JS5_QUESTS.getFileFromArchive(ConfigType.QUESTS.type * -1006924897, fileID));
                }
                QuestType questType = new QuestType();
                if (data != null)
                    questType.readValueLoop(new Buffer(data));
                questType.checkSortName();
                this.questTypes[fileID] = questType;
                this.questTypes[fileID].questTypeLoader = this;
            }
        }
    }

    public QuestType getQuestType(int questIndex) {
        return this.questTypes[questIndex];
    }

    public int getRewardPoints(Interface23 interface23) {
        int rewardPoints = 0;
        for (int questIndex = 0; questIndex < 1223397457 * this.totalQuests; questIndex++) {
            QuestType questType = getQuestType(questIndex);
            if (questType.method4562(interface23))
                rewardPoints += questType.rewardPoints * 1646094589;
        }
        return rewardPoints;
    }
}
