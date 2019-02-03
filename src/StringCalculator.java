import java.util.Scanner;
import java.util.ArrayList;

public class StringCalculator {
	public static void main(String[] args) {
		while(true) {		
			Scanner scan = new Scanner(System.in);
			System.out.print("식을 입력하세요 : ");
			
			String value = scan.nextLine();
			String[] values = value.split(" ");
			
			if(values.length < 3) {
				Output.print("식이 부적절합니다.");
			}
			else {
				try {
					int first = Integer.parseInt(values[0]);
					int result = first;
					for(int i=1; i<values.length; i+=2) {
						String operator = values[i];
						int second = Integer.parseInt(values[i+1]);
						result = Calculator.calculate(result, operator, second);
					}
					Output.print(result);
				}
				catch(NumberFormatException e) {
					Output.print("식이 부적절합니다.");
				}
			}
		}
	}
}