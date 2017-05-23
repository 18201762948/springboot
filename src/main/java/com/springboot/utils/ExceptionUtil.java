package com.springboot.utils;

import com.springboot.domain.ExceptionLog;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;

/**
 * Created by Pactera on 2017/4/7.
 */
public class ExceptionUtil {

    /**
     * 获取异常的堆栈信息并封装到异常日志类中
     * @param t 异常
     * @return ExceptionLog 异常日志类
     */
    public static ExceptionLog getExceptionLog(Throwable t)
    {
        ExceptionLog exceptionLog = new ExceptionLog();
        StackTraceElement[] st = t.getStackTrace();
        exceptionLog.setCreateDate(new Date());
        exceptionLog.setId(StringUtil.getUUID());
        exceptionLog.setClassName(st[0].getClassName());
        exceptionLog.setMethodName(st[0].getMethodName());
        exceptionLog.setLineNumber(st[0].getLineNumber());
        exceptionLog.setMessage(t.getMessage());
        exceptionLog.setStackTrace(getStackTrace(t));
        return exceptionLog;
    }

    /**
     *  根据异常日志类 获取友好的异常日志输出方式
     * @param exceptionLog 异常日志类
     * @return String
     */
    public static String getExLog(ExceptionLog exceptionLog)
    {
        String str = "[类名]["+exceptionLog.getClassName()+"]";
        str += "[方法名]["+exceptionLog.getMethodName()+"]";
        str += "[行号]["+exceptionLog.getLineNumber()+"]";
        str += "[异常信息]["+exceptionLog.getMessage()+"]";
        str += "[异常堆栈]["+exceptionLog.getStackTrace()+"]";
        return str;
    }

    /**
     *  根据异常 获取友好的异常日志输出方式
     * @param t
     * @return String
     */
    public static String getExLog(Throwable t)
    {
        return getExLog(getExceptionLog(t));
    }



    /**
     * 获取异常的堆栈信息
     *
     * @param t 异常
     * @return String  异常的堆栈信息
     */
    private static String getStackTrace(Throwable t)
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        try
        {
            t.printStackTrace(pw);
            return sw.toString();
        }
        finally
        {
            pw.close();
        }
    }
}
