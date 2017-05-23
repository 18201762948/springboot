package com.springboot.web;

import com.github.pagehelper.PageInfo;
import com.springboot.Constants;
import com.springboot.service.TestService;
import com.springboot.utils.ResultUtil;
import com.springboot.domain.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Pactera on 2017/4/5.
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService testService;

//    @GetMapping
//    public Result<Test> getAll(Integer pageNum){
//        List<Test> tests = null;
//        //PageHelper.startPage(pageNum, Constants.pageSize);
//        //List<Test> tests = testService.selectByExample(new TestExample());
//        PageInfo<Test> pageInfo = testService.selectPage(new TestExample(), pageNum, Constants.PAGE_SIZE);
//        tests = pageInfo.getList();
//
//        return ResultUtil.success(tests);
//    }
//
//    @GetMapping(value="/{id}")
//    public Result<Test> getOne(@PathVariable("id") Integer id){
//        Test test = testService.selectByPrimaryKey(id);
//        return ResultUtil.success(test);
//    }
//
//    @PostMapping
//    public  Result post(@Valid Test test, BindingResult bindingResult){
//        if(bindingResult.hasErrors()){
//            return ResultUtil.error(1,bindingResult.getFieldError().getDefaultMessage());
//        }
//        testService.insertSelective(test);
//        return ResultUtil.success();
//    }
//
//    @PutMapping
//    public  Result put(@Valid Test test, BindingResult bindingResult){
//        if(bindingResult.hasErrors()){
//            return ResultUtil.error(1,bindingResult.getFieldError().getDefaultMessage());
//        }
//        testService.updateByPrimaryKey(test);
//        return ResultUtil.success();
//    }
//
//    @DeleteMapping(value = "{id}")
//    public  Result delete(@PathVariable("id") Integer id){
//        testService.deleteByPrimaryKey(id);
//        return ResultUtil.success();
//    }

}
