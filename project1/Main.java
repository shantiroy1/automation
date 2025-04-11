package pack1;

public class Main {
	//create a method
	public int sum(int a,int b,int c){
		int result=a+b+c;
		return result;
	}
	

	public static void main(String[] args) {
		int num1=20;
		int num2=10;
		int num3=30;
				
		Main sc=new Main();
		System.out.println("sum is :" +sc.sum(num1, num2, num3) );
	}

}
