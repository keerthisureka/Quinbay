import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        //Write your code here
        Set<String> set = new HashSet<String>();
        for(int i = 0; i < t; i++) {
            set.add(pair_left[i] + "." + pair_right[i]); // A separator is added because it may be possible that 2 names when joined form the same sequence of characters as a name already seen but both are different names
            System.out.println(set.size());
        }
        s.close();
   }
}