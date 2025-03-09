/*
Koko Eating Bananas

Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and
will come back in h hours. Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile
of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and
will not eat any more bananas during this hour.
Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
Return the minimum integer k such that she can eat all the bananas within h hours.

Example :
Input: piles = [3,6,7,11], h = 8
Output: 4

Constraints:
1 <= piles.length <= 104
piles.length <= h <= 109
1 <= piles[i] <= 109
 */

package binarysearch.easyAnswers;

public class KokoEatingBananas {
    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1,  right = findMaximumInPiles(piles);
        int minimum = Integer.MAX_VALUE;
        while(left<=right){
            int mid = left + (right-left)/2;
            int number = findNumber(piles, mid);
            if(number>h) left=mid+1;
            else{
                right=mid-1;
                minimum = Math.min(minimum, mid);
            }
        }
        return minimum;
    }

    public static int findMaximumInPiles(int[] piles){
        int maximum = Integer.MAX_VALUE;
        for(int pile : piles)
            maximum = Math.max(pile, maximum);
        return maximum;
    }

    public static int findNumber(int[] piles, int n){
        int count = 0;
        for(int i=0; i<piles.length; i++){
            count += piles[i]/n;
            if(piles[i]%n != 0) count++;
        }
        return count;
    }
}
