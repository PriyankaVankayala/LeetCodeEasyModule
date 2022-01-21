package easy;

public class StringIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack = "Helloel";
		String needle = "el";
		System.out.println(strStr(haystack,needle));

	}
	public static int strStr(String haystack, String needle) {
        if(needle.isEmpty() || haystack.isEmpty())
        {
        	return 0;
        }
        
        int index = haystack.indexOf(needle);
        return index;
        
    }

}
