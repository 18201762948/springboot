package com.springboot.handle;

import com.springboot.domain.ExceptionLog;
import com.springboot.domain.Result;
import com.springboot.utils.ExceptionUtil;
import com.springboot.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Pactera on 2017/4/7.
 */
@ControllerAdvice
public class ExceptionHandle {

    private static final Logger logger  =  LoggerFactory.getLogger(ExceptionHandle.class);

    private static final String ERROR_MSG = "系统异常";//系统异常消息提示

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        ExceptionLog exceptionLog = ExceptionUtil.getExceptionLog(e);

        logger.error("【"+ERROR_MSG+"】{}", ExceptionUtil.getExLog(exceptionLog));
        return ResultUtil.error(ERROR_MSG);
    }
}
