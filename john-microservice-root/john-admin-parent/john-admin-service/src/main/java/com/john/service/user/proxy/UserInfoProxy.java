package com.john.service.user.proxy;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.john.admin.vo.PageVo;
import com.john.service.user.dao.IUserInfoDao;
import com.john.service.user.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author john
 * @description UserInfoService的代理层
 * @date 2020/6/6 16:24
 */

@Repository
public class UserInfoProxy {

    @Autowired
    private IUserInfoDao iUserInfoDao;

    /**
    *
    *@author john
    *@date 2020/6/6 16:26
    *@param userInfoVo
    *@return java.util.List<com.john.service.user.vo.UserInfoVo>
    */
    public List<UserInfoVo> getUserList(UserInfoVo userInfoVo){
        return iUserInfoDao.getUserList(userInfoVo);
    }

    /**
     *
     *@author john
     *@date 2020/6/6 16:26
     *@param userInfoVo
     *@return java.util.List<com.john.service.user.vo.UserInfoVo>
     */
    public List<UserInfoVo> getUserListPage(UserInfoVo userInfoVo){
        //分页
        PageVo pageVo = userInfoVo.getPageVo();
        Page page = PageHelper.startPage(pageVo.getPageNum(),pageVo.getPageSize());
        return iUserInfoDao.getUserList(userInfoVo);
    }

    /**
    *
    *@author john
    *@date 2020/6/6 16:26
    *@param id
    *@return int
    */
    @Transactional
    public int deleteUser(Integer id){
        return iUserInfoDao.deleteUser(id);
    }

    /**
    *
    *@author john
    *@date 2020/6/6 16:26
    *@param userInfoVo
    *@return int
    */
    @Transactional
    public int updateUser(UserInfoVo userInfoVo){
        return iUserInfoDao.updateUser(userInfoVo);
    }

    /**
    *
    *@author john
    *@date 2020/6/6 16:26
    *@param userInfoVo
    *@return int
    */
    @Transactional
    public int createUser(UserInfoVo userInfoVo){
        return iUserInfoDao.createUser(userInfoVo);
    }

}
