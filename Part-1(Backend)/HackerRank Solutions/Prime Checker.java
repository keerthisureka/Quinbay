import java.io.*;
import java.util.*;
import java.lang.reflect.*;

class Prime {
    public void checkPrime(int... num) { // Varargs
        String str = "";
        for(int n : num) {
            boolean prime = true;
            if(n <= 3 && n > 1) {
                str += n + " ";
            } 
            else {
                for(int i = 2; i <= Math.sqrt(n); i++) { // Checking if the number is prime
                    if(n % i == 0) {
                        prime = false;
                        break;
                    }
                }
                if(prime && n != 1) {
                    str += n + " ";
                }
            }
        }
        System.out.println(str);
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            Prime p = new Prime();
            p.checkPrime(n1);
            p.checkPrime(n1,n2);
            p.checkPrime(n1,n2,n3);
            p.checkPrime(n1,n2,n3,n4,n5);
            
            // Should not be overloaded method
            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for(int i=0; i<methods.length; i++) {
                if(set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());
            }
            if(overload) {
                throw new Exception("Overloading not allowed");
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}