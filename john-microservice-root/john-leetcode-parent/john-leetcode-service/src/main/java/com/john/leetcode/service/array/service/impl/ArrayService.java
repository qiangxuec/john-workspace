package com.john.leetcode.service.array.service.impl;

import com.john.leetcode.service.array.service.IArrayService;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author john
 * @description TODO
 * @date 2020/9/1 21:32
 */
@Service
public class ArrayService implements IArrayService {

    public static void main(String[] args) {

        ArrayService service = new ArrayService();
//        System.out.println(service.findMaxConsecutiveOnes(new int[]{1, 1, 1, 0, 0, 1, 1, 0}));
//        System.out.println(service.findPoisonedDuration(new int[]{1, 4}, 3));
//        System.out.println(service.thirdMax(new int[]{1,2,-2147483648}));
//        System.out.println(service.findErrorNums(new int[]{2, 2}));
//        List list = service.findDisappearedNumbers2(new int[]{1, 1, 1});
//        for (Object item : list) {
//            System.out.println(item);
//        }
        List list = service.findDuplicates(new int[]{4, 1, 3, 2, 4, 2, 1});
        for (Object item : list) {
//            System.out.println(item);
        }
    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            System.out.println("index----->  "+index);

            if (nums[index] < 0) {
                result.add(Math.abs(nums[i]));
                System.out.println(-1);
                continue;
            }else{
                nums[index] = -nums[index];
                System.out.println(nums[index]);
            }
//            System.out.println(nums[index]);
        }

        return result;
    }

    public List<Integer> findDisappearedNumbers2(int[] nums) {
        HashMap<Integer, Boolean> hashTable = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashTable.put(nums[i], true);
        }
        List<Integer> res = new LinkedList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!hashTable.containsKey(i)) {
                res.add(i);
            }
        }
        return res;
    }

    /**
     * 超时！！！！！！！！
     *
     * @param
     * @return java.util.List<java.lang.Integer>
     * @author john
     * @date 2020/9/6 16:21
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new LinkedList();
        for (int i = 1; i <= nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i == nums[j]) {
                    count++;
                }
            }
            if (count == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int dup = -1;
        int miss = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                dup = nums[i];
            } else if (nums[i] > nums[i - 1] + 1) {
                miss = nums[i - 1] + 1;
            }
        }
        int[] res = new int[]{dup, nums[nums.length - 1] != nums.length ? nums.length : miss};
        System.out.print(res[0] + ":" + res[1]);
        return res;
    }

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
    }

    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int num : nums) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num < first) {
                third = second;
                second = num;
            } else if (num > third && num < second) {
                third = num;
            }
        }
        return third != Long.MIN_VALUE ? new Long(third).intValue() : new Long(first).intValue();
    }

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n = timeSeries.length;
        if (n <= 0) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < n - 1; ++i) {
            if (timeSeries[i + 1] - timeSeries[i] >= duration) {
                res += duration;
            } else {
                res += (timeSeries[i + 1] - timeSeries[i]);
            }
        }
        return res + duration;
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            max = Math.max(max, count);
        }
        return max;
    }

}
