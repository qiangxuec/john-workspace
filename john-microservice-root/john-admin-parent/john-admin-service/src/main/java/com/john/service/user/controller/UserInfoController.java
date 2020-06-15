package com.john.service.user.controller;

import com.john.core.vo.CommonResultInfo;
import com.john.service.user.dto.UserInfoDto;
import com.john.service.user.service.UserInfoService;
import com.john.service.user.vo.UserInfoVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserInfoController {

    private final UserInfoService userInfoService;

    /**
     * 构造器注入
     * 变量方式注入应该尽量避免，使用set方式注入或者构造器注入，这两种方式的选择就要看这个类是强制依赖的话就用构造器方式，选择依赖的话就用set方法注入。
     * @param UserInfoService
     */
    @Autowired
    public UserInfoController(UserInfoService UserInfoService) {
        this.userInfoService = UserInfoService;
    }

    @RequestMapping(value = "/list/page",method = RequestMethod.POST)
    @ApiOperation(value = "分页查询用户列表")
    public CommonResultInfo<List<UserInfoVo>> getUserListPage(@RequestBody() UserInfoDto userInfoDto){
        List<UserInfoVo> list = userInfoService.getUserListPage(userInfoDto);
        return CommonResultInfo.buildSuccess(list);
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ApiOperation(value = "查询用户列表")
    public CommonResultInfo<List<UserInfoVo>> profile(){
        List<UserInfoVo> list = userInfoService.getUserList(null);
        return CommonResultInfo.buildSuccess(list);
    }

    @RequestMapping(value="/",method = RequestMethod.POST)
    @ApiOperation(value = "创建用户信息")
    public CommonResultInfo<Integer> createUser(@RequestBody() UserInfoDto userInfoDto){
        return CommonResultInfo.buildSuccess(userInfoService.createUser(userInfoDto));
    }

    @RequestMapping(value="/{id}",method = RequestMethod.PUT)
    @ApiOperation(value = "更新用户信息")
    public CommonResultInfo<Integer> updateUser(@PathVariable("id") long id,@RequestBody() UserInfoDto userInfoDto){
        userInfoDto.setId(id);
        return CommonResultInfo.buildSuccess(userInfoService.updateUser(userInfoDto));
    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    @ApiOperation(value = "删除用户信息")
    public CommonResultInfo<Integer> deleteUser(@PathVariable("id") Integer id){
        return CommonResultInfo.buildSuccess(userInfoService.deleteUser(id));
    }

}
