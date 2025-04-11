package pack1;

public class HWMain {
	//create a method;
	public int add(int a,int b){
		int result=a+b;
		return result;
	}
	public int sub(int a,int b) {
		int result=a-b;
		return result;
	}
	public int mul(int a,int b) {
		int result=a*b;
		return result;
	}
	public int div(int a,int b) {
		int result=a/b;
		return result;
	}
	public int remainder(int a,int b) {
		int result=a%b;
		return result;
	}
	

	public static void main(String[] args) {
		int a=30;
		int b=20;
		HWMain sc=new HWMain();
		System.out.println("add is "+sc.add(a , b));
		System.out.println("sub is " +sc.sub(a,b));
		System.out.println("mul is " +sc.mul(a,b));
		System.out.println("div is " +sc.div(a,b));
		System.out.println("remainder is " +sc.remainder(a,b));
	}

}
