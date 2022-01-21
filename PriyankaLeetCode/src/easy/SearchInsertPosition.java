package easy;

public class SearchInsertPosition {
	public static void main(String args[])
	{
		int[] nums = {1};
		int result = searchInsert(nums,0);
		System.out.println(result);
		
	}
public static int searchInsert(int[] nums, int target) {
	int length = nums.length;
	int i = 0;
	while(i <= length-1)
	{
	if(nums[i]	== target || nums[i] > target)
	{
		return i;
	}
			i++;
	
	}
	
	return i;
        
    }

}
