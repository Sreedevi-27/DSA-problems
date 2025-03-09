/*
Sum of Beauty of All Substrings

The beauty of a string is the difference in frequencies between the most frequent and least frequent characters.
For example, the beauty of "abaacc" is 3 - 1 = 2.
Given a string s, return the sum of beauty of all of its substrings.

Example 1:
Input: s = "aabcb"
Output: 5
Explanation: The substrings with non-zero beauty are ["aab","aabc","aabcb","abcb","bcb"], each with beauty equal to 1.

Constraints:
1 <= s.length <= 500
s consists of only lowercase English letters.
 */

package strings.medium;

public class SumOfBeautyOfAllStrings {
    public static int beautySum(String s) {
        int len=s.length(), count = 0;
        for(int i=0; i<len; i++){
            for(int j=i+1; j<=len; j++){
                String str = s.substring(i,j);
                count += beautyOfString(str);
            }
        }
        return count;
    }

    public static int beautyOfString(String str){
        int[] freq = new int[26];
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            freq[ch-'a']++;
        }

        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        for(int i=0; i<26; i++){
            int count = freq[i];
            if(count!=0){
                max = Math.max(max, count);
                min = Math.min(min, count);
            }
        }
        return max-min;
    }
}
