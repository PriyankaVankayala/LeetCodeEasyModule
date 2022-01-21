package easy;

import java.util.HashMap;
import java.util.LinkedList;

public class ValidParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public boolean isValid(String s) {
	HashMap<Character,Character> brackets = new HashMap<Character,Character>();
	brackets.put('(', ')');
	brackets.put('{', '}');
	brackets.put('[', ']');
	
	char[] inputChar = s.toCharArray();
	int length = inputChar.length;
	if(length%2 != 0)
		return false;
	LinkedList<Character> sequence =new LinkedList<Character>();
	for(char c: inputChar)
	{
		if(brackets.containsKey(c))
		{
			sequence.add(c);
		}
		else
		{
			if(!sequence.isEmpty() && brackets.get(sequence.getLast()) == c)
			{
				sequence.removeLast();
			}
			else
				return false;
		}
		
	}
		
        return sequence.isEmpty();
    }

}
