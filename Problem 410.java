/* Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.
Return the minimized largest sum of the split. A subarray is a contiguous part of the array. */


class Solution {
    public int splitArray(int[] nums, int k) {

        int start,end,mid=0,sum=0,max=nums[0],pieces=1;

        for(int i=0;i<nums.length;i++){ 
            sum += nums[i];            //max range = sum
            if(nums[i]>max)
            max = nums[i];            //min range = max number
        }

        start = max; end = sum;
        while(start!=end){
            mid = start + (end-start)/2; 
            sum = 0; pieces = 1;
            for(int i=0;i<nums.length;i++)
            {
                sum = sum + nums[i];
                if(sum <= mid)
                continue;
                else{
                pieces++;
                sum=nums[i];
                    }
            }
            
            if(pieces>k)
            start = mid + 1;
            else
            end = mid;
    }
    return end;
}}
