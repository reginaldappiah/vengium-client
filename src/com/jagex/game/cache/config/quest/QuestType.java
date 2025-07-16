package com.jagex.game.cache.config.quest;/* Class369 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.*;

public class QuestType {
    public int requiredQuestPoints;
    public String sortName;
    public int anInt4011 = 0;
    public int anInt4012 = 0;
    public int rewardPoints;
    public int[] requiredQuests;
    public int[][] requiredSkills;
    public int[] requiredVarpsID;
    public String[] requiredVarpsText;
    public int[] requiredVarpBitsID;
    public String title;
    public String[] requiredVarpBitsText;
    public boolean aBoolean4027 = false;
    public int contextMenuSprite = -301919677;
    public QuestTypeLoader questTypeLoader;
    int[] requiredVarpBitsMaxValue;
    int[][] stateVarps;
    int[] requiredVarpsMaxValue;
    int[] anIntArray4015;
    LinkedList params;
    int[] requiredVarpsMinValue;
    int[][] stateVarpBits;
    int[] requiredVarpBitsMinValue;

    QuestType() {

    }

    public void readValueLoop(Buffer buffer) {
        for (; ; ) {
            int opcode = buffer.readUByte();
            if (opcode == 0) {
                break;
            }
            decode(buffer, opcode);
        }
    }

    void decode(Buffer buffer, int opcode) {
        if (opcode == 1)
            title = buffer.readJagString();
        else if (opcode == 2)
            sortName = buffer.readJagString();
        else if (opcode == 3) {
            int length = buffer.readUByte();
            this.stateVarps = new int[length][3];
            for (int offset = 0; offset < length; offset++) {
                this.stateVarps[offset][0] = buffer.readUShort();//VarpID
                this.stateVarps[offset][1] = buffer.readInt();//Not Started Value
                this.stateVarps[offset][2] = buffer.readInt();//Completed Value
            }
        } else if (4 == opcode) {
            int length = buffer.readUByte();
            this.stateVarpBits = new int[length][3];
            for (int offset = 0; offset < length; offset++) {
                this.stateVarpBits[offset][0] = buffer.readUShort();//VarpID
                this.stateVarpBits[offset][1] = buffer.readInt();//Not Started Value
                this.stateVarpBits[offset][2] = buffer.readInt();//Completed Value
            }
        } else if (opcode == 5)
            buffer.readUShort();
        else if (6 == opcode)
            anInt4011 = buffer.readUByte() * -1975598225;
        else if (7 == opcode)
            anInt4012 = buffer.readUByte() * 203571345;
        else if (8 == opcode)
            aBoolean4027 = true;
        else if (9 == opcode)
            rewardPoints = buffer.readUByte() * 1044902997;
        else if (10 == opcode) {
            int length = buffer.readUByte();
            this.anIntArray4015 = new int[length];
            for (int offset = 0; offset < length; offset++)
                this.anIntArray4015[offset] = buffer.readInt();
        } else if (12 == opcode)
            buffer.readInt();
        else if (opcode == 13) {
            int length = buffer.readUByte();
            requiredQuests = new int[length];
            for (int offset = 0; offset < length; offset++)
                requiredQuests[offset] = buffer.readUShort();
        } else if (opcode == 14) {
            int length = buffer.readUByte();
            requiredSkills = new int[length][2];//Required Skills
            for (int offset = 0; offset < length; offset++) {
                requiredSkills[offset][0] = buffer.readUByte();//SkillID
                requiredSkills[offset][1] = buffer.readUByte();//Required Level
            }
        } else if (15 == opcode)
            requiredQuestPoints = buffer.readUShort() * 96808193;
        else if (opcode == 17)
            contextMenuSprite = buffer.readBigSmart() * 301919677;
        else if (opcode == 18) {
            int length = buffer.readUByte();
            requiredVarpsID = new int[length];
            this.requiredVarpsMinValue = new int[length];
            this.requiredVarpsMaxValue = new int[length];
            requiredVarpsText = new String[length];
            for (int offset = 0; offset < length; offset++) {
                requiredVarpsID[offset] = buffer.readInt();
                this.requiredVarpsMinValue[offset] = buffer.readInt();
                this.requiredVarpsMaxValue[offset] = buffer.readInt();
                requiredVarpsText[offset] = buffer.readString();
            }
        } else if (opcode == 19) {
            int length = buffer.readUByte();
            requiredVarpBitsID = new int[length];
            this.requiredVarpBitsMinValue = new int[length];
            this.requiredVarpBitsMaxValue = new int[length];
            requiredVarpBitsText = new String[length];
            for (int offset = 0; offset < length; offset++) {
                requiredVarpBitsID[offset] = buffer.readInt();
                this.requiredVarpBitsMinValue[offset] = buffer.readInt();
                this.requiredVarpBitsMaxValue[offset] = buffer.readInt();
                requiredVarpBitsText[offset] = buffer.readString();
            }
        } else if (opcode == 249) {
            int length = buffer.readUByte();
            if (this.params == null) {
                int capacity = LinkedList.getNextBitValue(length);
                this.params = new LinkedList(capacity);
            }
            for (int offset = 0; offset < length; offset++) {
                boolean string = buffer.readUByte() == 1;
                int key = buffer.readUTriByte();
                Node value;
                if (string)
                    value = new ObjectNode(buffer.readString());
                else
                    value = new IntNode(buffer.readInt());
                this.params.connect(value, (long) key);
            }
        }
    }

    public void checkSortName() {
        if (sortName == null)
            sortName = title;
    }

    public boolean method4561(Interface23 interface23) {
        if (null != this.stateVarps) {
            for (int i_20_ = 0; i_20_ < this.stateVarps.length; i_20_++) {
                if (interface23.method252((this.stateVarps[i_20_][0])) >= this.stateVarps[i_20_][1])
                    return true;
            }
        }
        if (null != this.stateVarpBits) {
            for (int i_21_ = 0; i_21_ < this.stateVarpBits.length; i_21_++) {
                if (interface23.method250((this.stateVarpBits[i_21_][0])) >= this.stateVarpBits[i_21_][1])
                    return true;
            }
        }
        return false;
    }

    public boolean method4562(Interface23 interface23) {
        if (null != this.stateVarps) {
            for (int i_22_ = 0; i_22_ < this.stateVarps.length; i_22_++) {
                if (interface23.method252((this.stateVarps[i_22_][0])) >= this.stateVarps[i_22_][2])
                    return true;
            }
        }
        if (null != this.stateVarpBits) {
            for (int i_23_ = 0; i_23_ < this.stateVarpBits.length; i_23_++) {
                if (interface23.method250((this.stateVarpBits[i_23_][0])) >= this.stateVarpBits[i_23_][2])
                    return true;
            }
        }
        return false;
    }

    public boolean method4563(Interface23 interface23, int[] is) {
        if (this.questTypeLoader.getRewardPoints(interface23) < requiredQuestPoints * 1327747841)
            return false;
        if (requiredSkills != null) {
            for (int i_24_ = 0; i_24_ < requiredSkills.length; i_24_++) {
                if (is[requiredSkills[i_24_][0]] < requiredSkills[i_24_][1])
                    return false;
            }
        }
        if (requiredQuests != null) {
            for (int i_25_ = 0; i_25_ < requiredQuests.length; i_25_++) {
                if (!this.questTypeLoader.getQuestType(requiredQuests[i_25_]).method4562(interface23))
                    return false;
            }
        }
        if (requiredVarpsID != null) {
            for (int i_26_ = 0; i_26_ < requiredVarpsID.length; i_26_++) {
                int i_27_ = interface23.method252(requiredVarpsID[i_26_]);
                if (i_27_ < this.requiredVarpsMinValue[i_26_] || i_27_ > this.requiredVarpsMaxValue[i_26_])
                    return false;
            }
        }
        if (null != requiredVarpBitsID) {
            for (int i_28_ = 0; i_28_ < requiredVarpBitsID.length; i_28_++) {
                int i_29_ = interface23.method250(requiredVarpBitsID[i_28_]);
                if (i_29_ < this.requiredVarpBitsMinValue[i_28_] || i_29_ > this.requiredVarpBitsMaxValue[i_28_])
                    return false;
            }
        }
        return true;
    }

    public boolean method4564(Interface23 interface23, int i) {
        try {
            if (requiredVarpBitsID == null || i < 0 || i >= requiredVarpBitsID.length)
                return false;
            int i_31_ = interface23.method250(requiredVarpBitsID[i]);
            return !(i_31_ < this.requiredVarpBitsMinValue[i] || i_31_ > this.requiredVarpBitsMaxValue[i]);
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("pi.s(").append(')').toString());
        }
    }

    public boolean method4565(int[] is, int i) {
        if (null == requiredSkills || i < 0 || i >= requiredSkills.length)
            return false;
        return is[requiredSkills[i][0]] >= requiredSkills[i][1];
    }

    public boolean method4566(Interface23 interface23, int i) {
        if (null == requiredQuests || i < 0 || i >= requiredQuests.length)
            return false;
        return this.questTypeLoader.getQuestType(requiredQuests[i]).method4562(interface23);
    }

    public boolean method4567(Interface23 interface23, int i) {
        if (null == requiredVarpsID || i < 0 || i >= requiredVarpsID.length)
            return false;
        int i_35_ = interface23.method252(requiredVarpsID[i]);
        return !(i_35_ < this.requiredVarpsMinValue[i] || i_35_ > this.requiredVarpsMaxValue[i]);
    }

    public int method4568(int i, int i_36_) {
        if (null == this.params)
            return i_36_;
        IntNode class298_sub35 = ((IntNode) this.params.get((long) i));
        if (class298_sub35 == null)
            return i_36_;
        return class298_sub35.capacity * -774922497;
    }

    public boolean method4569(Interface23 interface23) {
        return this.questTypeLoader.getRewardPoints(interface23) >= requiredQuestPoints * 1327747841;
    }

    public String method4570(int i, String string) {
        if (null == this.params)
            return string;
        ObjectNode class298_sub29 = ((ObjectNode) this.params.get((long) i));
        if (class298_sub29 == null)
            return string;
        return (String) class298_sub29.nodeObject;
    }
}
