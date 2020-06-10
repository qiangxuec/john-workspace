package com.john.service.user.service;

import com.john.service.user.dao.IUserInfoDao;
import com.john.service.user.proxy.UserInfoProxy;
import com.john.service.user.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
*
*@author john
*@date 2020/6/5 22:43
*/
@Service
public class UserInfoService {

    @Autowired
    private UserInfoProxy userInfoProxy;

    public List<UserInfoVo> getUserList(UserInfoVo userInfoVo){
        return userInfoProxy.getUserList(userInfoVo);
    }

    public List<UserInfoVo> getUserListPage(UserInfoVo userInfoVo){
        return userInfoProxy.getUserListPage(userInfoVo);
    }

    /**
     * 根据ID删除用户
     * @param id
     * @return
     */
    public int deleteUser(Integer id){
        return userInfoProxy.deleteUser(id);
    }
    
    /**
    * 根据ID更新用户信息
    *@author john
    *@date 2020/6/5 22:43
    *@param userInfoVo
    *@return int
    */
    public int updateUser(UserInfoVo userInfoVo){
        return userInfoProxy.updateUser(userInfoVo);
    }

    /**
    *
    *@author john
    *@date 2020/6/5 22:44
    *@return int
    */
    public int createUser(UserInfoVo userInfoVo){
        return userInfoProxy.createUser(userInfoVo);
    }

}
