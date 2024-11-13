import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        // Taking input
        List<List<Integer>> arr = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int d = sc.nextInt();
            List<Integer> temp = new ArrayList<>();
            for(int j=0; j<d; j++) {
                temp.add(sc.nextInt());
            }
            arr.add(temp);
        }
        
        // Number of queries
        int q = sc.nextInt();
        for(int i=0; i<q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            try {
                System.out.println(arr.get(x-1).get(y-1));
            }
            catch (Exception e) { // If the index does not exist
                System.out.println("ERROR!");
            }
        }
    }
}