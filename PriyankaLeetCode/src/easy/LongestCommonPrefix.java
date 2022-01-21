package easy;

import java.util.Arrays;

public class LongestCommonPrefix {
	
public String longestCommonPrefix(String[] strs) {
    
 String result = "";

 Arrays.sort(strs);
 int length = strs.length;
 String first = strs[0];
 String last = strs[length-1];
 int i =0;
 while(i < first.length())
 {
if (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i))    		 
	result = result + first.charAt(i);
     else
		 return result;
	 i++;
 }
 
return result;
    

    
}

}
