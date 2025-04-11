package pack1;

import java.util.*;

public class HW2 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner (System.in);
		System.out.print("Enter your first number:");
		int num1 = sc.nextInt();
		System.out.print("Enter your second number:");
		int num2 = sc.nextInt();
		int sum = num1+num2;
		System.out.println("Sum of two numbers are:" +sum);
		int sub = num1-num2;
		System.out.println("the subtraction:" +sub);
		int mul =num1*num2;
		System.out.println("the multiplication:" +mul);
		int div =num1/num2;
		System.out.println("the division:" +div);
		
	}

}