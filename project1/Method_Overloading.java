package pack1;
import java.util.*;

public class Method_Overloading {
	
	public void sum(int a,int b){
		
		System.out.println(" This is method 1");
	}
		
	public void sum(int a,int b,int c){
		
		System.out.println(" This is method 2");
	}
		
	public void sum(int a,int b,int c,int d){
			System.out.println(" This is method 3");
		}
			
	 public static void main(String[] args) {
		Method_Overloading sc = new Method_Overloading();
		Scanner obj =new Scanner(System.in);
		System.out.println(" Enter your 1 number ");
		int a=obj.nextInt();
		System.out.println(" Enter your 2 number ");
		int b=obj.nextInt();
		System.out.println(" Enter your 3 number ");
		int c=obj.nextInt();
		System.out.println(" Enter your 4 number ");
		int d=obj.nextInt();
		sc.sum(a, b);
		sc.sum(a, b, c);
		sc.sum(a, b, c, d);
		
		
		
		
		
		

	}

}
