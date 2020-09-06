package com.john.leetcode.service.array.controller;

import com.john.core.vo.CommonResultInfo;
import com.john.leetcode.service.array.service.IArrayService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author john
 * @description TODO
 * @date 2020/9/1 22:13
 */
@RestController
@RequestMapping("/array")
public class ArrayController {

    @Autowired
    private IArrayService iArrayService;

    @RequestMapping(value = "/findMaxConsecutiveOnes",method = RequestMethod.POST)
    @ApiOperation(value = "findMaxConsecutiveOnes")
    public CommonResultInfo<Integer> findMaxConsecutiveOnes(){
        Integer num = iArrayService.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1});
        return CommonResultInfo.buildSuccess(num);
    }
}

