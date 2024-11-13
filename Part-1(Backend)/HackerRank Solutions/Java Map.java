//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
        
		int n = sc.nextInt();
		sc.nextLine();
        HashMap<String, Integer> mp = new HashMap<>();
        
        // Storing the data in HashMap
		for(int i=0; i<n; i++) {
			String name = sc.nextLine();
			int phone = sc.nextInt();
			sc.nextLine();
            mp.put(name, phone);
        }
        
        // Displaying the result
		while(sc.hasNext()) {
			String s = sc.nextLine();
            if(mp.get(s) != null) {
                System.out.println(s + "=" + mp.get(s));
            }
            else {
                System.out.println("Not found");
            }
		}
	}
}