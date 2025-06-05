package javaprograms;

import java.util.HashSet;

public class hashset {
	public static void main(String[] args) {
		HashSet<String> hs =  new HashSet<String>();
		//It is unordered it doesn't allow the duplicate values
		//HashSet lets you store a group of unique items its like a basket where duplicates are not allowed if you try to add the same item again it will be ignored and removed
		hs.add("Vamsi Krishna");
		hs.add("Muralidhar");
		hs.add("Muralidhar");
		System.out.println(hs);
		
	}
}