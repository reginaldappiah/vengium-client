package com.jagex.utils;

import com.jagex.Class490;
import com.jagex.ErrorReporter;
import com.jagex.GameContext;

import java.util.Date;

/**
 * Created by Krimsonowl on 7/12/2017.
 */
public class TimeUtils {
    public static long aLong762;
    public static long aLong763;

    public static void method5658(long l) {
            Class490.aCalendar6073.setTime(new Date(l));
    }

    public static String method4275(long l) {
        try {
            method5658(l);
            int i_1_ = Class490.aCalendar6073.get(5);
            int i_2_ = Class490.aCalendar6073.get(2) + 1;
            int i_3_ = Class490.aCalendar6073.get(1);
            return new StringBuilder().append(Integer.toString(i_1_ / 10)).append(i_1_ % 10).append("/").append(i_2_ / 10).append(i_2_ % 10).append("/").append(i_3_ % 100 / 10).append(i_3_ % 10).toString();
        } catch (RuntimeException runtimeexception) {
            throw ErrorReporter.generateReport(runtimeexception, new StringBuilder().append("ox.p(").append(')').toString());
        }
    }

    public static int[] getDate(int i)  {
            int[] date = new int[3];
            method5658(GameContext.method5574(i));
            date[0] = Class490.aCalendar6073.get(5);//DAY
            date[1] = Class490.aCalendar6073.get(2);//MONTH
            date[2] = Class490.aCalendar6073.get(1);//YEAR
            return date;
    }

    public static final synchronized long getTime() {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis < -1072184856876656313L * aLong763)
                aLong762 += (-7920182256634826327L * (-1072184856876656313L * aLong763 - currentTimeMillis));
            aLong763 = -8643661642579214217L * currentTimeMillis;
            return aLong762 * 8643379242525344409L + currentTimeMillis;
    }
}
