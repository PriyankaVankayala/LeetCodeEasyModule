package easy;

import java.util.Arrays;

public class MaximumSubArray {
	
	  public int maxSubArray(int[] nums) {
		  int length = nums.length;
		  int largestSum = 0;
		  int sum = 0;
          if (length == 1)
        	  return nums[0];
          if(length > 1)
          {
        	for(int i:nums)
        	{
        		sum = sum+i;
        		if(sum < 0)
        		{
        			sum = 0;
        		}
        		else if(sum > largestSum)
        		{
        			largestSum = sum;
        		}
        			
        	}
        	if(length > 1 && largestSum == 0)
        	{
        		Arrays.sort(nums);
        		largestSum = nums[length-1];
        	}
          }
	        return largestSum;
	    }

}
