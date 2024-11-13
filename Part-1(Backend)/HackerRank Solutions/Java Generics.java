import java.io.*;
import java.util.*;

public class Solution {
    
    public static <T> void printArray(T[] arr) {
        for(T a : arr) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Integer[] intArray   = {1, 2, 3}; // It will not work with primitive data types such as int, float, double, etc., hence use reference types like Integer
        String[] stringArray = {"Hello", "World"};
        printArray(intArray);
        printArray(stringArray);
    }
}