package easy;

public class EncodingString {
	public String encoding(String input)
	{
		if(input.isBlank())
		{
			System.out.println("EncodingString:encode - Input String is blank");
		return input;
		}
		char[] inputcharArray = input.toCharArray();
		String output = new String();
		int counter = 0;
		char prevChar = inputcharArray[0];
		for(char XYZ:inputcharArray)
		{
				if(prevChar == XYZ)
				{
					counter++;
				}
			else
			{
				output = output+counter +prevChar;
				prevChar = XYZ;
				counter = 1;
			}
		}
		output = output+counter +prevChar;
		System.out.println("Encoded output String is" +output);
		return null;
	}

}
