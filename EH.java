package javaprograms;

public class EH {
	public static void main(String[] args) {
		
		//Exception Handling 
		int a = 10;
		int b = 0;
		
		try {
			int c = a / b;
			System.out.println(c);
		}
		catch(Exception e){
			System.out.println("The Exception raised is "+ e);
		}
		finally {
			System.out.println("This is a finally block , which executes after try block even if there is not exception");
		}
	}
}