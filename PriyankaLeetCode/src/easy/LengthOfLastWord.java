package easy;

public class LengthOfLastWord {
	public static void main(String args[])
	{
		
	}
	
	 public int lengthOfLastWord(String s) {
	       
		 String[] stringsArray = s.split(" ");
		 int length = stringsArray.length;
		 if(length < 1 || length > 10000)
			 return 0;
		 
		 String lastWord = stringsArray[length-1];
		 int lastWordLength = lastWord.strip().length(); 
		 
		 
		 
	        return lastWordLength;
	    }

}
