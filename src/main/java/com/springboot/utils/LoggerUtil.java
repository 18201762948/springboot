package com.springboot.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Pactera on 2017/4/10.
 */
public class LoggerUtil {

    private static final Logger logger  =  LoggerFactory.getLogger(LoggerUtil.class);

    public static void  debug(String s){
        if(logger.isDebugEnabled())
          logger.debug(s);
    }

    public static void  debug(String s,Object obj){
        if(logger.isDebugEnabled())
            logger.debug(s,obj);
    }

    public static void  info(String s){
        if(logger.isInfoEnabled())
            logger.info(s);
    }

    public static void info(String s,Object obj){
        if(logger.isInfoEnabled())
            logger.info(s,obj);
    }

}
