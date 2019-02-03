import java.util.Scanner;
import java.util.ArrayList;

public class StringCalculator {
	public static void main(String[] args) {
		while(true) {		
			Scanner scan = new Scanner(System.in);
			System.out.print("식을 입력하세요 : ");
			
			String value = scan.nextLine();
			String[] values = value.split(" ");
			
			int first = Integer.parseInt(values[0]);
			System.out.println("first: " + first);
			int i = 1, result = first;
			while(i < values.length) {
				String operator = values[i];		
				int second = Integer.parseInt(values[i+1]);			
				result = Calculator.calculate(result, operator, second);			
				i += 2;
			}
		}
	}
}