package com.jagex;/* Class182 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class182 {
    public static int anInt1816 = 1;
    public static int anInt1817 = 2;
    public static int anInt1849 = -1;
    static SoftCache aClass348_1815 = new SoftCache(64);
    static Js5FileSystem aClass243_1821;
    static int anInt1861 = 0;
    public boolean aBoolean1818;
    public int anInt1819 = 0;
    public short aShort1820;
    public short aShort1822;
    public int[] anIntArray1823;
    public int anInt1824;
    public int anInt1826;
    public int anInt1828 = -460402411;
    public int[] anIntArray1829;
    public int anInt1831;
    public int anInt1832 = -1186467237;
    public boolean aBoolean1836;
    public int anInt1837;
    public int anInt1840;
    public int anInt1841;
    public int anInt1842;
    public int anInt1843;
    public int anInt1844;
    public int anInt1845;
    public int[] anIntArray1846;
    public int anInt1847;
    public int[] anIntArray1848;
    public int anInt1850;
    public int anInt1851;
    public int anInt1852;
    public short aShort1853;
    public boolean aBoolean1854;
    public int anInt1855;
    public int anInt1856;
    public int anInt1857;
    public int anInt1858;
    public int anInt1859;
    public boolean aBoolean1860 = true;
    public boolean aBoolean1862;
    public boolean aBoolean1863;
    public boolean aBoolean1864;
    public int anInt1865;
    public int anInt1867;
    public int anInt1868;
    public int anInt1869;
    public int anInt1870;
    public int anInt1871;
    public int anInt1873;
    public boolean aBoolean1874;
    public short aShort1875;
    public int anInt1876;
    public boolean aBoolean1877;
    public int anInt1878;
    public int anInt1879;
    public int anInt1880;
    public int anInt1881;
    public int anInt1882;
    public int anInt1883;
    public int anInt1884;
    public int anInt1885;
    public int anInt1886;
    int anInt1825;
    int anInt1827;
    int anInt1830 = 551876020;
    int anInt1833 = -82525436;
    int anInt1834;
    int anInt1835;
    int anInt1838;
    int anInt1839;
    int anInt1866;
    int anInt1872;

    Class182() {
        this.anInt1838 = -1351633244;
        this.anInt1839 = 59539036;
        anInt1840 = -313955239;
        anInt1850 = 894014710;
        anInt1851 = -1054767914;
        anInt1852 = 0;
        aBoolean1836 = true;
        aBoolean1854 = true;
        anInt1855 = -1971154607;
        anInt1859 = -2053470659;
        anInt1857 = 0;
        aBoolean1877 = true;
        anInt1873 = -891363123;
        aBoolean1818 = false;
        aBoolean1874 = true;
        aBoolean1862 = false;
        aBoolean1863 = true;
        aBoolean1864 = false;
    }

    static final void method1846(int i, int i_13_, int i_14_, int width, int height, int x, int y) {
        if (GameClient.anInt8724 * 1596783995 == 3) {
            int size = Class10.entitiesInRegion * 1168366243;
            int[] players = Class10.players;
            for (int playerIndex = 0; playerIndex < size; playerIndex++) {
                Player player = (GameClient.entities[players[playerIndex]]);
                if (player != null)
                    player.method4441(i, i_13_, i_14_, width, height, x, y);
            }
            for (int entityIndex = 0; entityIndex < -1230451913 * GameClient.entitySize; entityIndex++) {
                int key = GameClient.entityKeys[entityIndex];
                ObjectNode objectNode = ((ObjectNode) GameClient.entityList.get((long) key));
                if (objectNode != null)
                    ((Entity) objectNode.nodeObject).method4441(i, i_13_, i_14_, width, height, x, y);
            }
        }
    }

    static void method1847() {
        IComponentUpdateNode.linkedList.clear();
        IComponentUpdateNode.circularDoubleLinkedList.clear();
        IComponentUpdateNode.doubleLinkedList.clear();
    }

    void method1843(Buffer class298_sub53, byte i) {
        try {
            for (; ; ) {
                int i_0_ = class298_sub53.readUByte();
                if (0 == i_0_) {
                    if (i <= 0) {
                        /* empty */
                    }
                    break;
                }
                decode(class298_sub53, i_0_);
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("hp.b(").append(')').toString());
        }
    }

    void decode(Buffer buffer, int opcode) {
        if (opcode == 1) {
            aShort1820 = (short) buffer.readUShort();
            aShort1853 = (short) buffer.readUShort();
            aShort1822 = (short) buffer.readUShort();
            aShort1875 = (short) buffer.readUShort();
            int i_2_ = 3;
            aShort1820 <<= i_2_;
            aShort1853 <<= i_2_;
            aShort1822 <<= i_2_;
            aShort1875 <<= i_2_;
        } else if (2 == opcode)
            buffer.readUByte();
        else if (opcode == 3) {
            anInt1824 = buffer.readInt() * -387057077;
            anInt1858 = buffer.readInt() * -1853520269;
        } else if (opcode == 4) {
            anInt1819 = buffer.readUByte() * -687561841;
            anInt1847 = buffer.readByte() * -1070610169;
        } else if (opcode == 5)
            anInt1869 = (anInt1831 = (buffer.readUShort() << 12 << 2) * -1969619697) * -2077217427;
        else if (6 == opcode) {
            this.anInt1834 = buffer.readInt() * -1365954181;
            this.anInt1835 = buffer.readInt() * 902519911;
        } else if (7 == opcode) {
            anInt1841 = buffer.readUShort() * 704499925;
            anInt1842 = buffer.readUShort() * -1653481859;
        } else if (opcode == 8) {
            anInt1843 = buffer.readUShort() * -517504949;
            anInt1844 = buffer.readUShort() * -1502909185;
        } else if (9 == opcode) {
            int i_3_ = buffer.readUByte();
            anIntArray1823 = new int[i_3_];
            for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
                anIntArray1823[i_4_] = buffer.readUShort();
        } else if (10 == opcode) {
            int i_5_ = buffer.readUByte();
            anIntArray1829 = new int[i_5_];
            for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
                anIntArray1829[i_6_] = buffer.readUShort();
        } else if (12 == opcode)
            anInt1850 = buffer.readByte() * 1700476293;
        else if (opcode == 13)
            anInt1851 = buffer.readByte() * -1620099691;
        else if (14 == opcode)
            anInt1852 = buffer.readUShort() * -629947759;
        else if (15 == opcode)
            anInt1840 = buffer.readUShort() * 313955239;
        else if (opcode == 16) {
            aBoolean1836 = buffer.readUByte() == 1;
            anInt1855 = buffer.readUShort() * 1971154607;
            anInt1859 = buffer.readUShort() * 2053470659;
            aBoolean1854 = buffer.readUByte() == 1;
        } else if (opcode == 17)
            anInt1873 = buffer.readUShort() * 891363123;
        else if (18 == opcode)
            anInt1837 = buffer.readInt() * 661695111;//32 BITS or FFFFFFFF
        else if (opcode == 19)
            anInt1857 = buffer.readUByte() * 709275159;//8 BITS or FF
        else if (opcode == 20)
            this.anInt1838 = buffer.readUByte() * 587779089;//8 BITS or FF
        else if (21 == opcode)
            this.anInt1839 = buffer.readUByte() * 1460884271;//8 BITS or FF
        else if (opcode == 22)
            anInt1828 = buffer.readInt() * 460402411;
        else if (23 == opcode)
            this.anInt1830 = buffer.readUByte() * -853474699;//8 BITS or FF
        else if (24 == opcode)
            aBoolean1860 = false;
        else if (25 == opcode) {
            int i_7_ = buffer.readUByte();//8 BITS or FF
            anIntArray1846 = new int[i_7_];
            for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
                anIntArray1846[i_8_] = buffer.readUShort();//16 BITS or FFFF
        } else if (opcode == 26)
            aBoolean1877 = false;
        else if (opcode == 27)
            anInt1832 = ((buffer.readUShort() << 12 << 2) * 1186467237);
        else if (opcode == 28)
            this.anInt1833 = buffer.readUByte() * -1461114135;
        else if (29 == opcode)
            buffer.readShort();
        else if (30 == opcode)
            aBoolean1818 = true;
        else if (opcode == 31) {
            anInt1869 = ((buffer.readUShort() << 12 << 2) * 1138516579);
            anInt1831 = (buffer.readUShort() << 12 << 2) * -1969619697;
        } else if (32 == opcode)
            aBoolean1874 = false;
        else if (33 == opcode)
            aBoolean1862 = true;
        else if (34 == opcode)
            aBoolean1863 = false;
    }

    void method1845(int i) {
        try {
            if (anInt1850 * -275612851 > -2 || -1831524931 * anInt1851 > -2)
                aBoolean1864 = true;
            anInt1865 = 1630521741 * (737478067 * this.anInt1834 >> 16 & 0xff);
            this.anInt1866 = ((1522532183 * this.anInt1835 >> 16 & 0xff) * -231735957);
            anInt1867 = (this.anInt1866 * 147388659 - anInt1865 * -902341611);
            anInt1868 = 313528669 * (this.anInt1834 * 737478067 >> 8 & 0xff);
            this.anInt1825 = -339699839 * (this.anInt1835 * 1522532183 >> 8 & 0xff);
            anInt1870 = (this.anInt1825 * -1096760557 - 1588068271 * anInt1868);
            anInt1871 = ((this.anInt1834 * 737478067 & 0xff) * -573588505);
            this.anInt1827 = ((1522532183 * this.anInt1835 & 0xff) * -1720855383);
            anInt1856 = (-844298861 * this.anInt1827 - 1351662653 * anInt1871);
            anInt1826 = ((737478067 * this.anInt1834 >> 24 & 0xff) * -1453810947);
            this.anInt1872 = 1322388433 * (1522532183 * this.anInt1835 >> 24 & 0xff);
            anInt1876 = (this.anInt1872 * 1784226905 - 1139279133 * anInt1826);
            if (0 != 1558182711 * anInt1837) {
                anInt1886 = -1525995331 * (1395500273 * this.anInt1838 * (1940196053 * anInt1842) / 100);
                anInt1845 = -323160919 * (anInt1842 * 1940196053 * (-1087319089 * this.anInt1839) / 100);
                if (0 == -1703669099 * anInt1886)
                    anInt1886 = -1525995331;
                anInt1879 = 220598105 * ((((anInt1837 * 1558182711 >> 16 & 0xff) - (anInt1867 * -447935375 / 2 + anInt1865 * 1443995973)) << 8) / (-1703669099 * anInt1886));
                anInt1880 = 1551625825 * ((((1558182711 * anInt1837 >> 8 & 0xff) - (-1237529867 * anInt1868 + -1154628453 * anInt1870 / 2)) << 8) / (anInt1886 * -1703669099));
                anInt1881 = (((1558182711 * anInt1837 & 0xff) - (anInt1871 * -1297143849 + anInt1856 * -564637277 / 2)) << 8) / (anInt1886 * -1703669099) * 1145782203;
                if (0 == anInt1845 * -966201447)
                    anInt1845 = -323160919;
                anInt1882 = 756703809 * ((((1558182711 * anInt1837 >> 24 & 0xff) - (629527125 * anInt1826 + anInt1876 * 1235129497 / 2)) << 8) / (-966201447 * anInt1845));
                Class182 class182_9_ = this;
                class182_9_.anInt1879 = (class182_9_.anInt1879 + 220598105 * (-1778169623 * anInt1879 > 0 ? -4 : 4));
                Class182 class182_10_ = this;
                class182_10_.anInt1880 = (class182_10_.anInt1880 + (anInt1880 * 936719777 > 0 ? -4 : 4) * 1551625825);
                Class182 class182_11_ = this;
                class182_11_.anInt1881 = (class182_11_.anInt1881 + 1145782203 * (anInt1881 * 1137945971 > 0 ? -4 : 4));
                Class182 class182_12_ = this;
                class182_12_.anInt1882 = (class182_12_.anInt1882 + 756703809 * (anInt1882 * 825667009 > 0 ? -4 : 4));
            }
            if (anInt1828 * 799607235 != -1) {
                anInt1883 = -1215468705 * (this.anInt1830 * 635387357 * (anInt1842 * 1940196053) / 100);
                if (anInt1883 * -1035489121 == 0)
                    anInt1883 = -1215468705;
                anInt1884 = (799607235 * anInt1828 - (anInt1824 * 373784419 + ((anInt1858 * -439251269 - 373784419 * anInt1824) / 2))) / (anInt1883 * -1035489121) * -1441694519;
            }
            if (-1628433875 * anInt1832 != -1) {
                anInt1885 = (1204309337 * this.anInt1833 * (1940196053 * anInt1842) / 100 * -1190650305);
                if (-1648307777 * anInt1885 == 0)
                    anInt1885 = -1190650305;
                anInt1878 = ((-1628433875 * anInt1832 - ((-769306129 * anInt1831 - -992661685 * anInt1869) / 2 + -992661685 * anInt1869)) / (-1648307777 * anInt1885) * -1770208597);
            }
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("hp.i(").append(')').toString());
        }
    }
}
