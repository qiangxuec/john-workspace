package com.john.leetcode.service.array.service;

/**
 * @author john
 * @description TODO
 * @date 2020/9/1 22:16
 */
public interface IArrayService {

    /**
     * 给定一个二进制数组， 计算其中最大连续1的个数。
     * 输入: [1,1,0,1,1,1]
     * 输出: 3
     * 解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
     *
    *@author john
    *@date 2020/9/1 22:18
    *@param [nums]
    *@return int
    */
    public int findMaxConsecutiveOnes(int[] nums);

}
