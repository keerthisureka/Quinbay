import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat n1 = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat n2 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat n3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat n4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        String us = n1.format(payment);
        String india = n2.format(payment);
        String china = n3.format(payment);
        String france = n4.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}