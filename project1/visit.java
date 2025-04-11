package pack1;
import java.util.*;

public class visit {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter your Budget");
		int money = sc.nextInt();
		if (money>=5000 && money<=10000) {
			System.out.println("you can visit Nevada");
		}
		else if(money>10000 && money<=15000) {
			System.out.println("you can visit canada");
		}
		else if(money>15000 && money<=20000) {
			System.out.println("you can visit Texas");
		}
		else if(money>20000 && money<=30000) {
			System.out.println("you can visit Bangladesh");
		}
		
		else {
			System.out.println("you can visit anywhere ");
		}
	}

}
