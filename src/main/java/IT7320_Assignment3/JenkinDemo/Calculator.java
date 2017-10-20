package IT7320_Assignment3.JenkinDemo;

public class Calculator implements Icalculator {

	public double add(double... number) {
		double total=0;
		for(double num: number){
			total += num;
			
		}
		return total;
	}

	public double multiply(double... number) {
		double total=1;
		for(double num: number){
			total=total*num;
			
		}
		return total;
	}

	public double substract(double number1, double number2) {
		return number1-number2;
	}

}
