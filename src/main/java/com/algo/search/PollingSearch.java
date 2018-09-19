package com.algo.search;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author : mawei
 * @description : 轮询搜索  时间复杂度O(n)
 * @since : 2018/9/18
 */
public class PollingSearch {
    private Logger log = LoggerFactory.getLogger(PollingSearch.class);

    public static int pollingSearch(int[] nums, int keyWord) {
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] == keyWord) {
                return i;
            }
        }
        return -1;
    }
}
