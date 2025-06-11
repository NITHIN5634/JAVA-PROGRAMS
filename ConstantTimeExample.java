package javaprograms;

public class ConstantTimeExample {
	public static void printFirstElement(int[]arr) {
		if(arr.length>0) {
			System.out.println("FirstElement is:"+arr[2]);
		}
		else {
			System.out.println("Array is Empty");
		}
	}
	public static void main (String[] args) {
		int[] num= {10,85,30,56,36,95};
		printFirstElement(num);
	}
}
