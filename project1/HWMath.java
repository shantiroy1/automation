package pack1;

import java.util.*;

public class HWMath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter your number ");
		int math = sc.nextInt();
		if (math >=90 && math <=100)
		System.out.println(" Your grade is A+ ");
		else if (math >=80 && math <90)
		System.out.println(" Your grade is A ");
		else if (math >=70 && math <80)
		System.out.println(" Your grade is B+ ");
		else if (math >=60 && math <70)
		System.out.println(" Your grade is B ");
		else if (math >=50 && math <60)
		System.out.println(" Your grade is C ");
		else if (math <50 && math >=0)
		System.out.println(" You are fail ");
		else
			System.out.println("Invalid input");
		
	}

}
