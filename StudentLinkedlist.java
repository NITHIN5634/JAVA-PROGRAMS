package javaprograms;
import java.util.*;

public class StudentLinkedList {
	public static void main(String[] args) {
		// HashSet Implementation 
		HashSet<String> std = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Names of 5 Students");
		
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter the name of student" + (i + 1) + ":");
			String name = sc.next();
			std.add(name);
			
		}
		
		for(String st : std) {
			System.out.print(st + " ");
		}
		sc.close();
	}

}