package pack1;
import java.util.*;

public class HWaddsub {

	public static void main(String[] args) {
		String name = " Shanti Roy ";
		int age = 43;
		String city = " Virginia ";
		System.out.println("I am " + name);
		System.out.println("I am " + age + " years old ");
		System.out.println("I am live in"+city);
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your first number:");
		Double num1 = sc.nextDouble();
		System.out.print("Enter your second number:");
		Double num2 = sc.nextDouble();
		Double sum = num1+num2;
		System.out.println("the sum of the number is:"+sum);
		Double sub = num1-num2;
		System.out.println("the subtraction:"+sub);
		Double mul = num1*num2;
		System.out.println("the multiplication:"+mul);
		Double div = num1/num2;
		System.out.println("the division:"+div);
		
		
		
				
				
		
	}

}
