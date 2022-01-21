package easy;

public class ReverseNumber {
	
	public int reverseNum(int number)
	{
		String s = String.valueOf(number);
		System.out.println(s);
		String revString = "";
		char[] revnumber = s.toCharArray();
		for(int i=revnumber.length-1 ;i>=0 ;i--)
		{
			revString = revString+revnumber[i];
		}
		System.out.println("Inside Method"+revString);
		int rev = Integer.valueOf(revString).intValue();
		return Integer.valueOf(revString);
		
	}

}
