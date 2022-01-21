package easy;

public class RemoveElementArray {

	public static void main(String[] args) {
		int[]nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(nums,2));

	}
	
	public static int removeDuplicates(int[] nums, int val) {
		int outputLength = 0;
		int length = nums.length;
		if(length > 100 || length <=0 || val > 100 || val < 0)
		{
			return outputLength;
		
		}
		int nextValIndex = 0;
		for(int i =0;i< length;i++)
		{
			if(nums[i] == val)
			{
				continue;
			}
			else
			{
				nums[nextValIndex]=nums[i];
				nextValIndex = nextValIndex+1;
			}
		}
		System.out.println(nums);
			
		return nextValIndex;
	        
	    }


}
