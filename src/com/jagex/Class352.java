package com.jagex;/* Class352 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.utils.TimeUtils;

public class Class352 {
    public static int anInt3786 = 2;
    public static int anInt3809 = 0;
    public static int anInt3818 = 1;
    public byte[] aByteArray3777;
    public String[] rightClickOptions;
    public int anInt3779;
    public boolean aBoolean3780;
    public int anInt3781;
    public int anInt3782;
    public int anInt3783;
    public int anInt3784;
    public int anInt3785 = 1126107561;
    public int anInt3787;
    public int anInt3788;
    public String aString3789;
    public boolean aBoolean3791;
    public String aString3792;
    public int anInt3793;
    public int anInt3799;
    public int anInt3802;
    public int[] anIntArray3803;
    public int anInt3804;
    public int anInt3805;
    public int anInt3806;
    public int anInt3807;
    public int anInt3808;
    public boolean aBoolean3810;
    public int anInt3812;
    public int anInt3813;
    public int[] anIntArray3814;
    public boolean aBoolean3816;
    public int anInt3817;
    Class339 aClass339_3776;
    int anInt3790;
    int anInt3794;
    int anInt3795;
    int anInt3796;
    int anInt3797;
    int anInt3798;
    int anInt3800;
    int anInt3801;
    LinkedList aClass437_3811;
    int anInt3815;

    Class352() {
        anInt3779 = 1006024925;
        anInt3782 = -1266787663;
        anInt3783 = 0;
        aBoolean3810 = true;
        aBoolean3780 = false;
        aBoolean3791 = true;
        rightClickOptions = new String[5];
        this.anInt3794 = 1998808761;
        this.anInt3797 = -1896723045;
        this.anInt3798 = 1225014007;
        this.anInt3801 = 1125434795;
        this.anInt3790 = 1435131889;
        anInt3804 = -459671533;
        anInt3805 = -80646725;
        anInt3793 = -2147483648;
        anInt3807 = -2147483648;
        anInt3806 = 799363989;
        anInt3799 = -234302495;
        anInt3788 = 1952866083;
        aBoolean3816 = true;
        anInt3817 = 1012984825;
    }

    public static GameContext method4244(int i) {
        GameContext[] class411s = Class499.method6216((byte) 75);
        for (int i_22_ = 0; i_22_ < class411s.length; i_22_++) {
            GameContext class411 = class411s[i_22_];
            if (class411.id * -937307905 == i)
                return class411;
        }
        return null;
    }

    public static int method4245(long l) {
        TimeUtils.method5658(l);
        return Class490.aCalendar6073.get(1);
    }

    static void method4246(int i) {
        Class376.anInt4090 = i * -435591305;
        Class301_Sub1.anInt7627 = 789877945;
        Class301_Sub1.anInt7627 = 789877945;
        Class225.method2103(65536);
    }

    void readValueLoop(Buffer buffer) {
        for (; ; ) {
            int opcode = buffer.readUByte();
            if (opcode == 0) {
                break;
            }
            decode(buffer, opcode);
        }
    }

    void decode(Buffer buffer, int opcode) {
        if (1 == opcode)
            anInt3785 = buffer.readBigSmart() * -1126107561;
        else if (opcode == 2)
            anInt3779 = buffer.readBigSmart() * -1006024925;
        else if (3 == opcode)
            aString3792 = buffer.readString();
        else if (4 == opcode)
            anInt3781 = buffer.readUTriByte() * 1851662915;
        else if (5 == opcode)
            anInt3782 = buffer.readUTriByte() * 1266787663;
        else if (opcode == 6)
            anInt3783 = buffer.readUByte() * -2108294259;
        else if (7 == opcode) {
            int i_2_ = buffer.readUByte();
            if (0 == (i_2_ & 0x1))
                aBoolean3810 = false;
            if ((i_2_ & 0x2) == 2)
                aBoolean3780 = true;
        } else if (8 == opcode)
            aBoolean3791 = buffer.readUByte() == 1;
        else if (9 == opcode) {
            this.anInt3797 = buffer.readUShort() * 1896723045;
            if (65535 == -539447443 * this.anInt3797)
                this.anInt3797 = -1896723045;
            this.anInt3798 = buffer.readUShort() * -1225014007;
            if (-869705415 * this.anInt3798 == 65535)
                this.anInt3798 = 1225014007;
            this.anInt3795 = buffer.readInt() * -166802393;
            this.anInt3796 = buffer.readInt() * -1288246043;
        } else if (opcode >= 10 && opcode <= 14) {
            rightClickOptions[opcode - 10] = buffer.readString();
        } else if (opcode == 15) {
            int i_3_ = buffer.readUByte();
            anIntArray3803 = new int[2 * i_3_];
            for (int i_4_ = 0; i_4_ < 2 * i_3_; i_4_++)
                anIntArray3803[i_4_] = buffer.readShort();
            anInt3808 = buffer.readInt() * 88246575;
            int i_5_ = buffer.readUByte();
            anIntArray3814 = new int[i_5_];
            for (int i_6_ = 0; i_6_ < anIntArray3814.length; i_6_++)
                anIntArray3814[i_6_] = buffer.readInt();
            aByteArray3777 = new byte[i_3_];
            for (int i_7_ = 0; i_7_ < i_3_; i_7_++)
                aByteArray3777[i_7_] = buffer.readByte();
        } else if (opcode == 16)
            aBoolean3816 = false;
        else if (17 == opcode)
            aString3789 = buffer.readString();
        else if (18 == opcode)
            this.anInt3794 = buffer.readBigSmart() * -1998808761;
        else if (19 == opcode)
            anInt3817 = buffer.readUShort() * -1012984825;
        else if (20 == opcode) {
            this.anInt3801 = buffer.readUShort() * -1125434795;
            if (this.anInt3801 * 769127165 == 65535)
                this.anInt3801 = 1125434795;
            this.anInt3790 = buffer.readUShort() * -1435131889;
            if (-1461367057 * this.anInt3790 == 65535)
                this.anInt3790 = 1435131889;
            this.anInt3815 = buffer.readInt() * 1428832641;
            this.anInt3800 = buffer.readInt() * 1701861307;
        } else if (opcode == 21)
            anInt3802 = buffer.readInt() * -264999113;
        else if (22 == opcode)
            anInt3787 = buffer.readInt() * 1977581169;
        else if (opcode == 23) {
            anInt3806 = buffer.readUByte() * -799363989;
            anInt3799 = buffer.readUByte() * 234302495;
            anInt3788 = buffer.readUByte() * -1952866083;
        } else if (opcode == 24) {
            anInt3812 = buffer.readShort() * -1983273215;
            anInt3813 = buffer.readShort() * 1940877605;
        } else if (opcode == 249) {
            int i_8_ = buffer.readUByte();
            if (this.aClass437_3811 == null) {
                int i_9_ = LinkedList.getNextBitValue(i_8_);
                this.aClass437_3811 = new LinkedList(i_9_);
            }
            for (int i_10_ = 0; i_10_ < i_8_; i_10_++) {
                boolean bool = buffer.readUByte() == 1;
                int i_11_ = buffer.readUTriByte();
                Node class298;
                if (bool)
                    class298 = new ObjectNode(buffer.readString());
                else
                    class298 = new IntNode(buffer.readInt());
                this.aClass437_3811.connect(class298, (long) i_11_);
            }
        }
    }

    void method4236() {
        if (null != anIntArray3803) {
            for (int i_12_ = 0; i_12_ < anIntArray3803.length; i_12_ += 2) {
                if (anIntArray3803[i_12_] < anInt3804 * 1281846757)
                    anInt3804 = anIntArray3803[i_12_] * -1687812115;
                else if (anIntArray3803[i_12_] > 968926443 * anInt3793)
                    anInt3793 = anIntArray3803[i_12_] * -426581053;
                if (anIntArray3803[i_12_ + 1] < anInt3805 * -1901940595)
                    anInt3805 = -2066836923 * anIntArray3803[i_12_ + 1];
                else if (anIntArray3803[1 + i_12_] > -1294057761 * anInt3807)
                    anInt3807 = -812843745 * anIntArray3803[1 + i_12_];
            }
        }
    }

    public boolean method4237(Interface23 interface23) {
        int i_13_;
        if (-1 != -869705415 * this.anInt3798)
            i_13_ = interface23.method252((-869705415 * this.anInt3798));
        else if (-1 != -539447443 * this.anInt3797)
            i_13_ = interface23.method250((-539447443 * this.anInt3797));
        else
            return true;
        if (i_13_ < 338289559 * this.anInt3795 || i_13_ > -959385363 * this.anInt3796)
            return false;
        boolean bool = false;
        int i_14_;
        if (-1461367057 * this.anInt3790 != -1)
            i_14_ = interface23.method252((this.anInt3790 * -1461367057));
        else if (-1 != this.anInt3801 * 769127165)
            i_14_ = interface23.method250((this.anInt3801 * 769127165));
        else
            return true;
        return !(i_14_ < this.anInt3815 * 372768385 || i_14_ > 520017267 * this.anInt3800);
    }

    public SpriteToolkit method4238(GraphicsToolkit graphicsToolkit, boolean bool) {
        int i_15_ = bool ? anInt3779 * -1413078901 : anInt3785 * 715019623;
        int i_16_ = i_15_ | 580915349 * graphicsToolkit.id << 29;
        SpriteToolkit spriteToolkit = (SpriteToolkit) this.aClass339_3776.aClass348_3635.get((long) i_16_);
        if (spriteToolkit != null)
            return spriteToolkit;
        if (!this.aClass339_3776.aClass243_3638.exists(i_15_))
            return null;
        Sprite class89 = Sprite.loadFirst((this.aClass339_3776.aClass243_3638), i_15_, 0);
        if (class89 != null) {
            spriteToolkit = graphicsToolkit.createSpriteToolkit(class89, true);
            this.aClass339_3776.aClass348_3635.put(spriteToolkit, (long) i_16_);
        }
        return spriteToolkit;
    }

    public String method4239(int i, String string) {
        if (null == this.aClass437_3811)
            return string;
        ObjectNode class298_sub29 = ((ObjectNode) this.aClass437_3811.get((long) i));
        if (null == class298_sub29)
            return string;
        return (String) class298_sub29.nodeObject;
    }

    public SpriteToolkit method4240(GraphicsToolkit graphicsToolkit) {
        SpriteToolkit spriteToolkit = ((SpriteToolkit) (this.aClass339_3776.aClass348_3635.get((long) (this.anInt3794 * 1027948663 | 0x20000 | graphicsToolkit.id * 580915349 << 29))));
        if (null != spriteToolkit)
            return spriteToolkit;
        this.aClass339_3776.aClass243_3638.exists(1027948663 * this.anInt3794);
        Sprite class89 = Sprite.loadFirst((this.aClass339_3776.aClass243_3638), this.anInt3794 * 1027948663, 0);
        if (class89 != null) {
            spriteToolkit = graphicsToolkit.createSpriteToolkit(class89, true);
            this.aClass339_3776.aClass348_3635.put(spriteToolkit, (long) (this.anInt3794 * 1027948663 | 0x20000 | graphicsToolkit.id * 580915349 << 29));
        }
        return spriteToolkit;
    }

    public int method4241(int i, int i_18_) {
        if (this.aClass437_3811 == null)
            return i_18_;
        IntNode class298_sub35 = ((IntNode) this.aClass437_3811.get((long) i));
        if (class298_sub35 == null)
            return i_18_;
        return class298_sub35.capacity * -774922497;
    }
}
