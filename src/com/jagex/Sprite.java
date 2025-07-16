package com.jagex;/* Class89 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Sprite {
    public static Js5FileSystem JS5_SPRITES;
    public int offsetY;
    public int width;
    public int deltaHeight;
    public int deltaWidth;
    public int offsetX;
    public int height;
    public int[] palette;
    public byte[] raster;
    public byte[] alpha;

    Sprite() {

    }

    public static Sprite loadFirst(Js5FileSystem fileSystem, int fileID) {
        byte[] data = fileSystem.get(fileID);
        if (data == null)
            return null;
        return decode(data)[0];
    }

    public static Sprite[] load(Js5FileSystem fileSystem, int fileID) {
        byte[] data = fileSystem.get(fileID);
        if (data == null)
            return null;
        return decode(data);
    }

    public static Sprite[] decode(byte[] data) {
        Buffer buffer = new Buffer(data);
        buffer.offset = (data.length - 2) * 116413311;
        int count = buffer.readUShort();
        Sprite[] sprites = new Sprite[count];
        for (int index = 0; index < count; index++)
            sprites[index] = new Sprite();
        buffer.offset = (data.length - 7 - count * 8) * 116413311;
        int resizeWidth = buffer.readUShort();
        int resizeHeight = buffer.readUShort();
        int paletteSize = (buffer.readUByte() & 0xff) + 1;
        for (int index = 0; index < count; index++)
            sprites[index].offsetX = buffer.readUShort();
        for (int index = 0; index < count; index++)
            sprites[index].offsetY = buffer.readUShort();
        for (int index = 0; index < count; index++)
            sprites[index].width = buffer.readUShort();
        for (int index = 0; index < count; index++)
            sprites[index].height = buffer.readUShort();
        for (int index = 0; index < count; index++) {
            Sprite sprite = sprites[index];
            sprite.deltaWidth = resizeWidth - sprite.width - sprite.offsetX;
            sprite.deltaHeight = resizeHeight - sprite.height - sprite.offsetY;
        }
        buffer.offset = (data.length - 7 - count * 8 - (paletteSize - 1) * 3) * 116413311;
        int[] palette = new int[paletteSize];
        for (int index = 1; index < paletteSize; index++) {
            palette[index] = buffer.readUTriByte();
            if (palette[index] == 0)
                palette[index] = 1;
        }
        for (int index = 0; index < count; index++)
            sprites[index].palette = palette;
        buffer.offset = 0;
        for (int index = 0; index < count; index++) {
            Sprite sprite = sprites[index];
            int rasterSize = sprite.width * sprite.height;
            sprite.raster = new byte[rasterSize];
            int attributes = buffer.readUByte();
            if ((attributes & 0x2) == 0) {
                if ((attributes & 0x1) == 0) {
                    for (int pixel = 0; pixel < rasterSize; pixel++)
                        sprite.raster[pixel] = buffer.readByte();
                } else {
                    for (int x = 0; x < sprite.width; x++) {
                        for (int y = 0; y < sprite.height; y++)
                            sprite.raster[(x + y * sprite.width)] = buffer.readByte();
                    }
                }
            } else {
                boolean transparent = false;
                sprite.alpha = new byte[rasterSize];
                if ((attributes & 0x1) == 0) {
                    for (int pixel = 0; pixel < rasterSize; pixel++)
                        sprite.raster[pixel] = buffer.readByte();
                    for (int pixel = 0; pixel < rasterSize; pixel++) {
                        byte alpha = (sprite.alpha[pixel] = buffer.readByte());
                        transparent = transparent | alpha != -1;
                    }
                } else {
                    for (int x = 0; x < sprite.width; x++) {
                        for (int y = 0; y < sprite.height; y++)
                            sprite.raster[(x + y * sprite.width)] = buffer.readByte();
                    }
                    for (int x = 0; x < sprite.width; x++) {
                        for (int y = 0; y < sprite.height; y++) {
                            byte alpha = (sprite.alpha[x + y * sprite.width] = buffer.readByte());
                            transparent = transparent | alpha != -1;
                        }
                    }
                }
                if (!transparent)
                    sprite.alpha = null;
            }
        }
        return sprites;
    }

    public static Sprite loadFirst(Js5FileSystem fileSystem, int type, int fileID) {
        byte[] data = fileSystem.getFileFromArchive(type, fileID);
        if (data == null)
            return null;
        return decode(data)[0];
    }

    public static Sprite[] load(Js5FileSystem fileSystem, int type, int fileID) {
        byte[] data = fileSystem.getFileFromArchive(type, fileID);
        if (data == null)
            return null;
        return decode(data);
    }

    public void flipVertically() {
        byte[] raster = this.raster;
        if (alpha == null) {
            for (int y = (height >> 1) - 1; y >= 0; y--) {
                int index = y * width;
                int max = (height - y - 1) * width;
                for (int count = -width; count < 0; count++) {
                    byte tmp = raster[index];
                    raster[index] = raster[max];
                    raster[max] = tmp;
                    index++;
                    max++;
                }
            }
        } else {
            byte[] alpha = this.alpha;
            for (int y = (height >> 1) - 1; y >= 0; y--) {
                int index = y * width;
                int max = (height - y - 1) * width;
                for (int count = -width; count < 0; count++) {
                    byte tmp = raster[index];
                    raster[index] = raster[max];
                    raster[max] = tmp;
                    tmp = alpha[index];
                    alpha[index] = alpha[max];
                    alpha[max] = tmp;
                    index++;
                    max++;
                }
            }
        }
        int tmp = offsetY;
        offsetY = deltaHeight;
        deltaHeight = tmp;
    }

    public int getScaleWidth() {
        return width + offsetX + deltaWidth;
    }

    public void fixPadding() {
        int scaleWidth = getScaleWidth();
        int scaleHeight = getScaleHeight();
        if (this.width != scaleWidth || this.height != scaleHeight) {
            byte[] raster = new byte[scaleWidth * scaleHeight];
            if (alpha != null) {
                byte[] alpha = new byte[scaleWidth * scaleHeight];
                for (int y = 0; y < this.height; y++) {
                    int source = y * this.width;
                    int dest = (y + offsetY) * scaleWidth + offsetX;
                    for (int i_40_ = 0; i_40_ < this.width; i_40_++) {
                        raster[dest] = this.raster[source];
                        alpha[dest++] = this.alpha[source++];
                    }
                }
                this.alpha = alpha;
            } else {
                for (int y = 0; y < this.height; y++) {
                    int source = y * this.width;
                    int dest = (y + offsetY) * scaleWidth + offsetX;
                    for (int i_44_ = 0; i_44_ < this.width; i_44_++)
                        raster[dest++] = this.raster[source++];
                }
            }
            deltaHeight = 0;
            offsetY = 0;
            deltaWidth = 0;
            offsetX = 0;
            this.width = scaleWidth;
            this.height = scaleHeight;
            this.raster = raster;
        }
    }

    public void fixPadding(int border) {
        int scaleWidth = getScaleWidth();
        int scaleHeight = getScaleHeight();
        if (this.width != scaleWidth || this.height != scaleHeight) {
            int dx = border;
            if (dx > offsetX)
                dx = offsetX;
            int dw = border;
            if (dw + offsetX + this.width > scaleWidth)
                dw = scaleWidth - offsetX - this.width;
            int dy = border;
            if (dy > offsetY)
                dy = offsetY;
            int dh = border;
            if (dh + offsetY + this.height > scaleHeight)
                dh = scaleHeight - offsetY - this.height;
            int width = this.width + dx + dw;
            int height = this.height + dy + dh;
            byte[] raster = new byte[width * height];
            if (alpha == null) {
                for (int y = 0; y < this.height; y++) {
                    int source = y * this.width;
                    int dest = (y + dy) * width + dx;
                    for (int x = 0; x < this.width; x++)
                        raster[dest++] = this.raster[source++];
                }
            } else {
                byte[] alpha = new byte[width * height];
                for (int y = 0; y < this.height; y++) {
                    int sourceOffset = y * this.width;
                    int destOffset = (y + dy) * width + dx;
                    for (int i_61_ = 0; i_61_ < this.width; i_61_++) {
                        alpha[destOffset] = this.alpha[sourceOffset];
                        raster[destOffset++] = this.raster[sourceOffset++];
                    }
                }
                this.alpha = alpha;
            }
            offsetX -= dx;
            offsetY -= dy;
            deltaWidth -= dw;
            deltaHeight -= dh;
            this.width = width;
            this.height = height;
            this.raster = raster;
        }
    }

    public void addOutline(int color) {
        int paletteIndex = -1;
        if (palette.length < 255) {
            for (int index = 0; index < palette.length; index++) {
                if (palette[index] == color) {
                    paletteIndex = index;
                    break;
                }
            }
            if (paletteIndex == -1) {
                paletteIndex = palette.length;
                int[] modified = new int[palette.length + 1];
                Class425.method5741(palette, 0, modified, 0, palette.length);
                palette = modified;
                modified[paletteIndex] = color;
            }
        } else {
            int minimum = 2147483647;
            int newR = color >> 16 & 0xff;
            int newG = color >> 8 & 0xff;
            int newB = color & 0xff;
            for (int index = 0; index < palette.length; index++) {
                int current = palette[index];
                int r = current >> 16 & 0xff;
                int g = current >> 8 & 0xff;
                int b = current & 0xff;
                int dr = newR - r;
                if (dr < 0)
                    dr = -dr;
                int dg = newG - g;
                if (dg < 0)
                    dg = -dg;
                int db = newB - b;
                if (db < 0)
                    db = -db;
                int sum = dr + dg + db;
                if (sum < minimum) {
                    minimum = sum;
                    paletteIndex = index;
                }
            }
        }
        int index = 0;
        byte[] recolored = new byte[width * height];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int current = this.raster[index] & 0xff;
                if (palette[current] == 0) {
                    if (x > 0 && palette[this.raster[index - 1] & 0xff] != 0)
                        current = paletteIndex;
                    else if (y > 0 && palette[(this.raster[index - width] & 0xff)] != 0)
                        current = paletteIndex;
                    else if (x < width - 1 && (palette[this.raster[index + 1] & 0xff] != 0))
                        current = paletteIndex;
                    else if (y < height - 1 && palette[(this.raster[index + width] & 0xff)] != 0)
                        current = paletteIndex;
                }
                recolored[index++] = (byte) current;
            }
        }
        this.raster = recolored;
    }

    public void replaceTransparent(int color) {
        int paletteIndex = -1;
        if (palette.length < 255) {
            for (int index = 0; index < palette.length; index++) {
                if (palette[index] == color) {
                    paletteIndex = index;
                    break;
                }
            }
            if (paletteIndex == -1) {
                paletteIndex = palette.length;
                int[] modified = new int[palette.length + 1];
                Class425.method5741(palette, 0, modified, 0, palette.length);
                palette = modified;
                modified[paletteIndex] = color;
            }
        } else {
            int minimum = 2147483647;
            int newR = color >> 16 & 0xff;
            int newG = color >> 8 & 0xff;
            int newB = color & 0xff;
            for (int index = 0; index < palette.length; index++) {
                int current = palette[index];
                int r = current >> 16 & 0xff;
                int g = current >> 8 & 0xff;
                int b = current & 0xff;
                int dr = newR - r;
                if (dr < 0)
                    dr = -dr;
                int dg = newG - g;
                if (dg < 0)
                    dg = -dg;
                int db = newB - b;
                if (db < 0)
                    db = -db;
                int sum = dr + dg + db;
                if (sum < minimum) {
                    minimum = sum;
                    paletteIndex = index;
                }
            }
        }
        for (int y = height - 1; y > 0; y--) {
            int index = y * width;
            for (int x = width - 1; x > 0; x--) {
                if (palette[raster[x + index] & 0xff] == 0 && ((palette[raster[x + index - 1 - width] & 0xff]) != 0))
                    raster[x + index] = (byte) paletteIndex;
            }
        }
    }

    public void rotateClockwise() {
        byte[] rotated = new byte[width * height];
        int index = 0;
        if (alpha == null) {
            for (int x = 0; x < width; x++) {
                for (int y = height - 1; y >= 0; y--)
                    rotated[index++] = raster[x + y * width];
            }
            raster = rotated;
        } else {
            byte[] alpha = new byte[width * height];
            for (int x = 0; x < width; x++) {
                for (int y = height - 1; y >= 0; y--) {
                    rotated[index] = raster[x + y * width];
                    alpha[index++] = this.alpha[x + y * width];
                }
            }
            raster = rotated;
            this.alpha = alpha;
        }
        int temp = offsetY;
        offsetY = offsetX;
        offsetX = deltaHeight;

        deltaHeight = deltaWidth;
        deltaWidth = temp;

        temp = height;
        height = width;
        width = temp;
    }

    public int[] argb() {
        int scaleWidth = getScaleWidth();
        int[] argb = new int[scaleWidth * getScaleHeight()];
        if (alpha != null) {
            for (int y = 0; y < height; y++) {
                int source = y * width;
                int dest = offsetX + (y + offsetY) * scaleWidth;
                for (int x = 0; x < width; x++) {
                    argb[dest++] = (alpha[source] << 24 | palette[raster[source] & 0xff]);
                    source++;
                }
            }
        } else {
            for (int y = 0; y < height; y++) {
                int source = y * width;
                int dest = offsetX + (y + offsetY) * scaleWidth;
                for (int x = 0; x < width; x++) {
                    int color = palette[raster[source++] & 0xff];
                    if (color != 0)
                        argb[dest++] = ~0xffffff | color;
                    else
                        argb[dest++] = 0;
                }
            }
        }
        return argb;
    }

    public void offsetColour(int dr, int dg, int db) {
        for (int index = 1; index < palette.length; index++) {
            if (palette[index] != 1 && palette[index] != 16711935) {
                int red = palette[index] >> 16 & 0xff;
                red += dr;
                if (red < 0)
                    red = 0;
                else if (red > 255)
                    red = 255;
                int greem = palette[index] >> 8 & 0xff;
                greem += dg;
                if (greem < 0)
                    greem = 0;
                else if (greem > 255)
                    greem = 255;
                int blue = palette[index] >> 0 & 0xff;
                blue += db;
                if (blue < 0)
                    blue = 0;
                else if (blue > 255)
                    blue = 255;
                palette[index] = red << 16 | greem << 8 | blue;
            }
        }
    }

    public void flipHorizontally() {
        byte[] raster = this.raster;
        if (alpha == null) {
            for (int y = height - 1; y >= 0; y--) {
                int index = y * width;
                for (int max = (y + 1) * width; index < max; index++) {
                    max--;
                    byte tmp = raster[index];
                    raster[index] = raster[max];
                    raster[max] = tmp;
                }
            }
        } else {
            byte[] alpha = this.alpha;
            for (int y = height - 1; y >= 0; y--) {
                int index = y * width;
                for (int max = (y + 1) * width; index < max; index++) {
                    max--;
                    byte tmp = raster[index];
                    raster[index] = raster[max];
                    raster[max] = tmp;
                    tmp = alpha[index];
                    alpha[index] = alpha[max];
                    alpha[max] = tmp;
                }
            }
        }
        int tmp = offsetX;
        offsetX = deltaWidth;
        deltaWidth = tmp;
    }

    public int getScaleHeight() {
        return height + offsetY + deltaHeight;
    }
}
