package com.fourdev.wshopbackend.commons.utils;

/**
 * @author stevenreis
 * @since 1.0 (03/05/24)
 */
public class HashUtils {

    public static String hashData(String data) {
        return data.concat("HASHED");
    }
}
