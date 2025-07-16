package com.jagex.utils;

/**
 * Created by Krimsonowl on 7/11/2017.
 */
public class ColorUtils {
    public static String htmlToHex(int htmlColorCode) {
            return new StringBuilder().append("<col=").append(Integer.toHexString(htmlColorCode)).append(">").toString();
    }

    public static int rgbToHsl(int rgb) {
            if (rgb == 16711935)
                return -1;
            return fromRgb(rgb);
        }

    public static int fromRgb(int rgb) {
            double r = (double) (rgb >> 16 & 0xff) / 256.0;
            double g = (double) (rgb >> 8 & 0xff) / 256.0;
            double b = (double) (rgb & 0xff) / 256.0;
            double minimum = r;
            if (g < minimum)
                minimum = g;
            if (b < minimum)
                minimum = b;
            double maximum = r;
            if (g > maximum)
                maximum = g;
            if (b > maximum)
                maximum = b;
            double h = 0.0;
            double s = 0.0;
            double l = (maximum + minimum) / 2.0;
            if (maximum != minimum) {
                if (l < 0.5)
                    s = (maximum - minimum) / (minimum + maximum);
                if (l >= 0.5)
                    s = (maximum - minimum) / (2.0 - maximum - minimum);
                if (r == maximum)
                    h = (g - b) / (maximum - minimum);
                else if (g == maximum)
                    h = (b - r) / (maximum - minimum) + 2.0;
                else if (b == maximum)
                    h = 4.0 + (r - g) / (maximum - minimum);
            }
            h /= 6.0;
            int hue = (int) (256.0 * h);
            int saturation = (int) (s * 256.0);
            int luminance = (int) (256.0 * l);
            if (saturation < 0)
                saturation = 0;
            else if (saturation > 255)
                saturation = 255;
            if (luminance < 0)
                luminance = 0;
            else if (luminance > 255)
                luminance = 255;
            if (luminance > 243)
                saturation >>= 4;
            else if (luminance > 217)
                saturation >>= 3;
            else if (luminance > 192)
                saturation >>= 2;
            else if (luminance > 179)
                saturation >>= 1;
            return ((hue & 0xff) >> 2 << 10) + (saturation >> 5 << 7) + (luminance >> 1);
        }
    }
