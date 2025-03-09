/*
Count With K Different Characters

You are given a string 'str' of lowercase alphabets and an integer 'k' .
Your task is to return the count all the possible substrings that have exactly 'k' distinct characters.
For example:
'str' = abcad and 'k' = 2.
We can see that the substrings {ab, bc, ca, ad} are the only substrings with 2 distinct characters.
Therefore, the answer will be 4.

Example 1:
Input: str=aacfssa , k=3
Sample Output : 5
Explanation :
Given 'str' = “aacfssa”. We can see that the substrings with only 3 distinct characters are {aacf, acf, cfs, cfss, fssa}.

Constraints:
1 <= |str| <= 10^5
1 <= k <= 26
Time Limit: 1 second
 */

package strings.medium;

public class CountWithKDifferentCharacters {
    public static int countSubStrings(String str, int k) {
        int count=0;
        for(int i=0; i<str.length(); i++){
            boolean[] duplicate = new boolean[26];
            int dist = 0;
            for(int j=i; j<str.length(); j++){
                char c = str.charAt(j);
                if(!duplicate[c-'a']){
                    duplicate[c-'a']=true;
                    dist++;
                }
                if(dist==k)
                    count++;
            }
        }
        return count;
    }
}
