package easy;

public class RemoveDuplicatesSortedArray {

	public static void main(String[] args) {
		int[]nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(nums));

	}
	
public static int removeDuplicates(int[] nums) {
	int outputLength = 0;
	int length = nums.length;
	if(length > 100 || length <=0)
	{
		return outputLength;
	
	}
	int prevNumber =nums[0];
	int nextIndex = 1;
	for(int i =1;i< length;i++)
	{
		if(prevNumber == nums[i])
		{
			continue;
		}
		else
		{
			nums[nextIndex]=nums[i];
			nextIndex = nextIndex+1;
			prevNumber = nums[i];
		}
	}
	System.out.println(nums);
		
	return nextIndex;
        
    }

}
