package com.john.service.user.service;

import com.john.service.user.dto.UserInfoDto;
import com.john.service.user.proxy.UserInfoProxy;
import com.john.service.user.vo.UserInfoVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
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

    private static final Logger logger = LoggerFactory.getLogger(UserInfoService.class);

    @Autowired
    private UserInfoProxy userInfoProxy;

    public List<UserInfoVo> getUserList(UserInfoVo userInfoVo){
        return userInfoProxy.getUserList(userInfoVo);
    }

    public List<UserInfoVo> getUserListPage(UserInfoDto userInfoDto){
        UserInfoVo userInfoVo = fixedUserInfoVo(userInfoDto);
        logger.info("userInfo:"+userInfoVo.getId());
//        return userInfoProxy.getUserListPage(userInfoVo);
        return null;
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
    *@param userInfoDto
    *@return int
    */
    public int updateUser(UserInfoDto userInfoDto){
        UserInfoVo userInfoVo = fixedUserInfoVo(userInfoDto);
        return userInfoProxy.updateUser(userInfoVo);
    }

    /**
    *封装VO
    *@author john
    *@date 2020/6/13 10:14
    *@param userInfoDto
    *@return com.john.service.user.vo.UserInfoVo
    */
    private UserInfoVo fixedUserInfoVo(UserInfoDto userInfoDto) {
        UserInfoVo userInfoVo = new UserInfoVo();
        if(null != userInfoDto){
            BeanUtils.copyProperties(userInfoDto, userInfoVo);
        }
        return userInfoVo;
    }

    /**
    *
    *@author john
    *@date 2020/6/5 22:44
    *@return int
    */
    public int createUser(UserInfoDto userInfoDto){
        UserInfoVo userInfoVo = fixedUserInfoVo(userInfoDto);
        return userInfoProxy.createUser(userInfoVo);
    }

}
