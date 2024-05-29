package calculatordev; 

import java.util.Scanner;

public class calulatordev {
	
	public static int add(int number1, int number2) {
		return number1 + number2;
	}
	public static int sub(int number1, int number2) {
		return number1 - number2;
	}
	public static int mul(int number1, int number2) {
		return number1 * number2;
	}
	public static double div(double number1, double number2) {
		if(number2 == 0) {
			throw new IllegalArgumentException("Number can not be divide by 0!");
		}
		
		return number1 / number2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int input = sc.nextInt();
		
		Scanner = new Scanner(System.in);
		System.out.println("Enter Second Number : ");
		int input1 = sc.nextInt();
		
		System.out.println("The Addition is : " + calulatordev.add(input, input1));
		System.out.println("The Substraction is : " + calulatordev.sub(input, input1));
		System.out.println("The Multiplication is : " + calulatordev.mul(input, input1));
		System.out.println("The Division is : " + calulatordev.div(input, input1));
	}
	
	}



  