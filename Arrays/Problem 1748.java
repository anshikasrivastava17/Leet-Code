class Solution {
    public int sumOfUnique(int[] nums) {
        if(nums.length==1)
        return nums[0];
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i==0 && nums[0]!=nums[1])
                sum += nums[0];
            if(i==nums.length-1 && nums[nums.length-2]!=nums[i])
                sum += nums[i];    
            if(i>0 && i<nums.length-1)
            { 
                if(nums[i]!=nums[i-1]&& nums[i]!=nums[i+1])
                sum = sum + nums[i];
            }
        }
        return sum;
    }
}
