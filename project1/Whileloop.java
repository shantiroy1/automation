package pack1;

public class Whileloop {

	public static void main(String[] args) {
		int i=1;
		while(i<= 30) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Shanti Roy");
			}
			else if(i % 3 == 0) {
				System.out.println("Aryan");
			}
			else if (i % 5 == 0) {
				System.out.println("Anik");
			}
			else 
			{
				System.out.println(i);
			}
		    i++;
				
	}
	}

}
