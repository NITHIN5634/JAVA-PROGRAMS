package javaprograms;

public class BubblesortExample {

	public static void main(String[] args) {
		int[] numbers= {6,7,5,4,8,2,9} ;
		for(int i=0;i<numbers.length-1;i++) {
			for(int j=0;j<numbers.length-1;j++) {
				if(numbers[j]>numbers[j+1]) {
					int temp=numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp;
				}
			}
		}
	System.out.println("sorted List");
	for(int num:numbers) {
		System.out.println(num+"");
	}

	}

}