package javaprograms;
import java.util.*;
public class hashmap {
	public static void main(String[] args) {
		//HashMap is a key and Value pair
		//HashMap is like a locker with leaver to store data with the help of key
		HashMap<Float, String> hmap = new HashMap<Float, String>();
        HashMap<String, Integer> hmap1 = new HashMap<String, Integer>();
        hmap.put(0.1F, "SREE");
        hmap.put(0.2F, "DHO");
        hmap.put(0.3F, "VAM");
        hmap.put(0.5F, "SAK");
        hmap.put(0.4F, "PRAV");    // Key Override
        System.out.println(hmap);

        hmap1.put("NITHIN", 739027193);
        hmap1.put("NITHIN 1", 739207294);
        hmap1.put("NITHIN 2", 739200974);
        hmap1.put("NITHIN 3", 894724923);
        hmap1.put("NITHIN 4", 923050934);

        System.out.println(hmap1);
        
        System.out.println(hmap.get(0.9F));
;
		
	}
}