package medium;

public class AddBinary {
	public static void main(String args[])
	{
		String a = "11";
		String b = "1";
		System.out.println(addBinary(a,b));
	}
	public static String addBinary(String a, String b) {
		int lengthOfA = a.length();
		int lengthOfB = b.length();
		int maxLength = lengthOfA > lengthOfB ? lengthOfA : lengthOfB;
		String output ="";
		int carryNumber = 0;
		int outputNumber = 0;
		for (int i = 1; i <= maxLength; i++) {
			if (lengthOfA >= i && lengthOfB >= i) {
				if (a.charAt(lengthOfA - i) == '0' && b.charAt(lengthOfB - i) == '0') {
					outputNumber = 0;
				} else if ((a.charAt(lengthOfA - i) == '0' && b.charAt(lengthOfB - i) == '1')
						|| (a.charAt(lengthOfA - i) == '1' && b.charAt(lengthOfB - i) == '0')) {
					outputNumber = 1;
				} else {
					outputNumber = 2; 

				}
				outputNumber = outputNumber + carryNumber;
			} else {
				if (lengthOfA >= i)
					outputNumber = a.charAt(lengthOfA - i) == '0'?0:1;
				else

					outputNumber = b.charAt(lengthOfB - i)  == '0'?0:1;
				outputNumber = outputNumber + carryNumber;

			}
			if (outputNumber == 0 || outputNumber == 2) {
				output = output + '0';
			} else
				output = output + '1';

			if (outputNumber == 3 || outputNumber == 2)
				carryNumber = 1;
			else
				carryNumber = 0;

		}
		if(carryNumber == 1)
		{
			output = output + '1';

		}
		StringBuilder sb=new StringBuilder(output);  
			
		return sb.reverse().toString();

	}

}
