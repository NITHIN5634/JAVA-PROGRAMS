package javaprograms;
import java.util.Scanner;
import java.util.*;

public class ifelse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("It is raining(yes/no)");
		String answer=sc.next();
		
		if(answer.equals("yes")) {
			System.out.println("Take an umbrella");
		}
		else {
			System.out.println("No need of an umbrella");
		}
		sc.close();
	}
	

}
