/* Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
Return the minimum integer k such that she can eat all the bananas within h hours. */


class Solution {
    //https://leetcode.com/problems/koko-eating-bananas/solutions/1703687/java-c-a-very-very-well-detailed-explanation/
    public int minEatingSpeed(int[] piles, int h) { //refer link for detailed explanation
        int start = 1,r=piles[0];
        for(int i=0;i<piles.length;i++){
            r = Math.max(r,piles[i]);
        }
        int end = r;
        
        while(start < end){
            int mid = start + (end - start) / 2;
            if(canEatInTime(piles, mid, h)) 
            end = mid;
            else 
            start = mid + 1;
        }
        return start;
    }
    public boolean canEatInTime(int piles[], int k, int h){
        int hours = 0;
        for(int pile : piles){
            int div = pile / k;
            hours += div;
            if(pile % k != 0) hours++;
        }
        return hours <= h;
    }
}
