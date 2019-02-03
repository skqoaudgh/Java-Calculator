
public class Calculator {
	
	static int calculate(int a, String operator, int b) {
		int result = a;
		if(operator.equals("+"))
			result = a+b;
		else if(operator.equals("-"))
			result = a-b;
		else if(operator.equals("*"))
			result = a*b;
		else if(operator.equals("/"))
			result = a/b;
		return result;
	}
}
