package com.springboot.utils;

import java.util.UUID;

/**
 * Created by Pactera on 2017/4/7.
 */
public class StringUtil {

    /**
     * 获取uuid
     * @return
     */
    public static String getUUID(){
        return UUID.randomUUID().toString();
    }
}
