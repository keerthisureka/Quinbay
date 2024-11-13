import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        
        s = s.trim(); // Very important to handle extra spaces or it will lead to empty strings

        if(s.length() == 0) {
            System.out.println(0);
            System.exit(0);
        }
        
        // Splitting on all non-alphabetic characters
        String[] arr = s.split("[^a-zA-Z]+");
        System.out.println(arr.length);
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        scan.close();
    }
}