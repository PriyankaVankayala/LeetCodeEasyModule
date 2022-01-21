package easy;

public class PalindromeNumber {
	boolean isPalindrome(int x)
	{int input = x;
	int rev = 0;
    if(x < 0)
    {
        return false;
    }
    
	while (x != 0)
	{
		int remainder = x%10;
		 rev= rev*10+remainder;
		 x = x/10;
		
	}
	if(rev == input)
	{
		return true;
	}
	return false;

    }

}
