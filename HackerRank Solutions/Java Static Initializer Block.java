import java.io.*;
import java.util.*;

public class Solution {
    
    static int B, H;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        
        try {
            if(B <= 0 || H <= 0)
                throw new Exception("Breadth and height must be positive");
            System.out.println(B * H);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}