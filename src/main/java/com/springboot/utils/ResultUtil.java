package com.springboot.utils;

import com.springboot.Constants;
import com.springboot.domain.Result;

/**
 * Created by Pactera on 2017/4/5.
 */
public class ResultUtil {

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(Constants.SUCCESS_CODE);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(String msg) { return error(Constants.ERROR_CODE,msg);}




}
