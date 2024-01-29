/*
Maximum Product Subarray

Given an integer array nums, find a  subarray that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.

Example :
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.

Constraints:
1 <= nums.length <= 2 * 104
-10 <= nums[i] <= 10
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 */

package arrays.hard;

public class MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        int len = nums.length;
        int maxProduct=Integer.MIN_VALUE;
        int prefix =1, suffix=1;
        for(int i=0; i<len; i++){
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;
            prefix *= nums[i];
            suffix *= nums[len-i-1];
            maxProduct = Math.max(maxProduct, Math.max(prefix, suffix));
        }
        return maxProduct;
    }
}
