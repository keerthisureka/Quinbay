import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        // Reading the initial array elements
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; i++) {
            arr.add(sc.nextInt());
        }
        
        // Processing the queries
        int q = sc.nextInt();
        for(int i=0; i<q; i++) {
            String s = sc.next();
            if(s.equals("Insert")) {
                int index = sc.nextInt();
                int val = sc.nextInt();
                arr.add(index, val);
            }
            else {
                int index = sc.nextInt();
                arr.remove(index);
            }
        }
        
        // Displaying the final array elements
        for(int i=0; i<arr.size(); i++) {
            if(i == arr.size() - 1)
                System.out.print(arr.get(i));
            else
                System.out.print(arr.get(i) + " ");
        }
    }
}