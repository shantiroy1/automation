package pack1;

import java.util.Scanner;

public class array3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int [5];
		int a_plus=0;
		for(int i=0;i<numbers.length;i++) {
			System.out.print(" Enter "  +(i+1)+ "  " + "number:" );
			numbers[i]=sc.nextInt();
			
		}
		for(int i =0; i<numbers.length;i++) {
			if (numbers[i]>80 && numbers[i]<=100) {
				a_plus++;
			}
		}
		System.out.println(a_plus);
		
	}

}
