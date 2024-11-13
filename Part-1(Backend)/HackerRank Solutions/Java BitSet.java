import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        BitSet b1 = new BitSet(N);
        BitSet b2 = new BitSet(N);
        for(int i = 0; i < M; i++) {
            String op = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();
            switch(op) {
                case "AND": if(x == 1) // Result will be stored in B1 else in B2
                                b1.and(b2);
                            else
                                b2.and(b1);
                            break;
                case "OR":  if(x == 1) // Result will be stored in B1 else in B2
                                b1.or(b2);
                            else
                                b2.or(b1);
                            break;
                case "FLIP":if(x == 1) // B1 will be flipped at bit y
                                b1.flip(y);
                            else// Else B2 will be flipped at bit y
                                b2.flip(y);
                            break;
                case "SET": if(x == 1) // Set the yth bit of B1
                                b1.set(y);
                            else // Else set the yth bit of B2
                                b2.set(y);
                            break;
                case "XOR": if(x == 1) // Result will be stored in B1 else in B2
                                b1.xor(b2);
                            else
                                b2.xor(b1);
                            break;
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    }
}