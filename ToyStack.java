package javaprograms;

import java.util.Stack;

public class ToyStack {
	public static void main(String[]args) {
		Stack<String> ty=new Stack<String>();
		ty.push("ball");
		ty.push("blocks");
		ty.push("puzzle");
		System.out.println("stacking of toys:"+ty);
		for(int i=1;i<=3;i++) {
			
		
			String user=ty.pop();
			System.out.println("\nprocessing the stack of toys:"+user);
			System.out.println("after stacking:"+ty);
		}
	}

}