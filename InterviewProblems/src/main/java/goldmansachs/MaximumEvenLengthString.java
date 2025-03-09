/*
Find the first maximum length even word from a string

Given a string of words separated by spaces. The task is to find the first maximum length even word from the string.
Eg: “You are given an array of n numbers” The answer would be “an” and not “of” because “an” comes before “of”.

Examples:
Input:  "this is a test string"
Output:  string
Even length words are this, is, test, string. Even
maximum length word is string.

Input:  "geeksforgeeks is a platform for geeks"
Output:  platform
Only even length word is platform.
 */

package goldmansachs;

public class MaximumEvenLengthString {
    public static void main(String[] args) {
        System.out.println(findMaximumEvenLengthString("geeksforgeeks is a platform for geeks"));
    }

    public static String findMaximumEvenLengthString(String str){
        int max = 0;
        String result = "";
        StringBuilder curr = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c==' '){
                int len = curr.length();
                if(len%2 == 0) {
                    if(max < len){
                        max = len;
                        result = curr.toString();
                    }
                }
                curr = new StringBuilder();
            }
            else
                curr.append(c);
        }

        if(max < curr.length())
            return curr.toString();
        return result;
    }
}
