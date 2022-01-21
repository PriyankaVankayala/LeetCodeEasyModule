package easy;

import java.util.HashMap;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	 public int romanToInt(String s) {
		 int length = s.length();
		 HashMap<Character,Integer> romanInt = new HashMap<Character,Integer>();
		 romanInt.put('I', 1);
		 romanInt.put('V', 5);
		 romanInt.put('X', 10);
		 romanInt.put('L', 50);
		 romanInt.put('C', 100);
		 romanInt.put('D', 500);
		 romanInt.put('M', 1000);
		 
		 
		 if(length < 1 || length >15)
			 return -1;
		char[] inputString =  s.toCharArray();
		char previousChar = inputString[0];
		int previousValue = romanInt.get(previousChar);
		int result = 0;
		
		for (char c : inputString)
		{
			if(!romanInt.containsKey(c))
				return -1;
			int value = romanInt.get(c);
			if(value > previousValue)
			{
				result = result + value - previousValue - previousValue;
			}
			else
			{
				result = result +value;
	
			}
			previousChar = c;
			previousValue =value; 
			
			
		}
		 
		 
		 return result;
	        
	    }

}
