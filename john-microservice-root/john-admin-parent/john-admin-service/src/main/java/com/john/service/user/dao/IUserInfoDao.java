package com.john.service.user.dao;

import com.john.service.user.vo.UserInfoVo;
import org.mapstruct.Mapper;

import java.util.List;

public interface IUserInfoDao {

    List<UserInfoVo> getUserList(UserInfoVo userInfoVo);

    /**
    *
    *@author john
    *@date 2020/6/15 22:21
    *@param [id]
    *@return int
    */
    int deleteUser(Integer id);

    int updateUser(UserInfoVo userInfoVo);

    int createUser(UserInfoVo userInfoVo);

}
