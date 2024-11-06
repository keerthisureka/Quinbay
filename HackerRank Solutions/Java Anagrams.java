import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() != b.length()) {
            return false;
        }
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        int count1 = 0;
        int count2 = 0;
        
        for(int i=0; i<a.length(); i++) {
            char ch = a.charAt(i);
            for(int j=0; j<a.length(); j++) {
                if(a.charAt(j) == ch)
                    count1++;
                if(b.charAt(j) == ch)
                    count2++;
            }
            if(count1 != count2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}