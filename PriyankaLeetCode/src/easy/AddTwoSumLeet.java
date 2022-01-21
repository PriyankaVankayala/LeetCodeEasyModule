package easy;

import java.util.HashMap;

public class AddTwoSumLeet {
	
    public static int[] twoSum(int[] nums, int target) {
    	HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
    	for(int i = 0; i<nums.length; i++)
    	{
    		int secondInteger = target - nums[i];
    		if(map.containsKey(secondInteger))
    		{
    	    	return new int[] {map.get(secondInteger),i};	

    		}
    		map.put(nums[i], i);
    	}
    	return new int[2];	
    }
    
    
    public static int[] secondTwoSum(int[] nums, int target) {
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
	long startTime = System.nanoTime();
int[]target =twoSum(new int[] {1,3,2,4,5,2,4,5,3,2,5,7,4,6,8,9}, 17);
System.out.println(System.nanoTime()-startTime);
System.out.println(target[0]+","+target[1]);


long whileStartTime = System.nanoTime();
int[]targetWhile =secondTwoSum(new int[] {1,3,2,4,5,2,4,5,3,2,5,7,4,6,8,9}, 17);
System.out.println(System.nanoTime()-whileStartTime);
System.out.println(targetWhile[0]+","+targetWhile[1]);
}



}
