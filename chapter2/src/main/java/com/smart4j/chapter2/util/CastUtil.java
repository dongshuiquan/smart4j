package com.smart4j.chapter2.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by DELL on 2018/3/31.
 */
public class CastUtil {

    public static String castString(Object obj) {
        return castString(obj, "");
    }

    public static String castString(Object obj, String defaultValue) {
        return obj == null ? defaultValue : String.valueOf(obj);
    }

    public static double castDouble(Object obj) {
        return castDouble(obj, 0);
    }

    public static double castDouble(Object obj, double defaultValue) {
        double doubleValue = defaultValue;
        if(obj != null) {
            String strValue = castString(obj);
            if(StringUtils.isNotEmpty(strValue)) {
                try {
                    doubleValue = Double.parseDouble(strValue);
                } catch (NumberFormatException e) {
                    doubleValue = defaultValue;
                }
            }
        }
        return doubleValue;
    }

    public static long castLong(Object obj) {
        return castLong(obj, 0);
    }

    public static long castLong(Object obj, long defaultValue) {
        long longValue = defaultValue;
        if(obj != null) {
            String strValue = castString(obj);
            if(StringUtils.isNotEmpty(strValue)) {
                try {
                    longValue = Long.parseLong(strValue);
                } catch (NumberFormatException e) {
                    longValue = defaultValue;
                }
            }
        }
        return longValue;
    }

    public static int castInt(Object obj) {
        return castInt(obj, 0);
    }

    public static int castInt(Object obj, int defaultValue) {
        int intValue = defaultValue;
        if(obj != null) {
            String strValue = castString(obj);
            if(StringUtils.isNotEmpty(strValue)) {
                try {
                    intValue = Integer.valueOf(strValue);
                } catch (NumberFormatException e) {
                    intValue = defaultValue;
                }
            }
        }
        return intValue;
    }

    public static boolean castBoolean(Object obj) {
        return castBoolean(obj, false);
    }

    public static boolean castBoolean(Object obj, boolean defaultValue) {
        boolean value = defaultValue;
        if(obj != null) {
            String strValue = castString(obj);
            if(StringUtils.isNotEmpty(strValue)) {
                try {
                    value = Boolean.parseBoolean(strValue);
                } catch (NumberFormatException e) {
                    value = defaultValue;
                }
            }
        }
        return value;
    }
}
