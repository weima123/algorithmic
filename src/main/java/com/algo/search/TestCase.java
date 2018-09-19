package com.algo.search;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StopWatch;

/**
 * @author : mawei
 * @description : TODO
 * @since : 2018/9/18
 */
public class TestCase {
    private static final Logger log = LoggerFactory.getLogger(TestCase.class);

    public static void main(String []args){
        int []nums = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int keyWord = 10;
        int result ;

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        result = PollingSearch.pollingSearch(nums,keyWord);
        stopWatch.stop();
        log.info("【pollingSearch】 result:{} ,costTime:{}ms",result,stopWatch.getTotalTimeMillis());

        stopWatch.start();
        result = BinarySearch.binarySearch(nums,keyWord);
        stopWatch.stop();
        log.info("【binarySearch】 result:{},costTime:{}ms",result,stopWatch.getTotalTimeMillis());
    }
}
