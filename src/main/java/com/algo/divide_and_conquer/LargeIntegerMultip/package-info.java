/**
 * @author : mawei
 * @description : 大整数乘法
 * @since : 2018/9/25
 */
package com.algo.divide_and_conquer.LargeIntegerMultip;
//大整数乘法问题
/*求两个不超过200位的非负整数的积。
输入数据 :有两行，每行是一个不超过200位的非负整数，没有多余的前导0。
输出要求:一行，即相乘后的结果。结果里不能有多余的前导0，即如果结果是342，那么就不能输出为0342。 输入样例  12345678900    98765432100
输出样例 1219326311126352690000*/


//思路一:
      /*  1.一个数的第i位和另一个数的第j位相乘所得的数，一定是要累加到结果的第i+j位上。这里i,j都是从右往左，从0开始数。
        2.对1中计算的结果做进位处理
        时间复杂度O(n^2)*/

//思路二：
      /*模拟手工列竖式计算两个大整数的乘积*/