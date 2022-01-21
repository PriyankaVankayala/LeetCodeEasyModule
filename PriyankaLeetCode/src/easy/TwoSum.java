package easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TwoSum {
	
	    public static int[] twoSum(int[] nums, int target) {
	    	int[] val = new int[2];
	        int length = nums.length;
	        if(length > 1){
	            int i= 0, j=1;
	            while(i < length-1 && j< length){
	                if(nums[i] + nums[j] == target){
	                    val[0] = i;
	                    val[1] = j;
	                   break;
	                }
	                if(j< length-1){
	                    j++; 
	                }else if(j == length-1){
	                    i++;
	                    j = i+1;
	                }
	            }
	        }
	        return val;
	    }
	
	public static void main(String args[])
	{
	int[]target =twoSum(new int[] {3,2,4,5}, 6);
	System.out.println(target[0]+","+target[1]);
	}

}
