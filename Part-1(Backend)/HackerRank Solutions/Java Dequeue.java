import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        HashMap<Integer, Integer> mp = new HashMap<>(); // Tracks the frequency of integers in the current subarray.
        Deque<Integer> deque = new ArrayDeque<>(); // Maintains the order of elements in the current subarray. -> We can use either LinkedList<>() or ArrayDeque<>() collection for Deque implementation
        
        int n = in.nextInt(); // Total count of elements
        int m = in.nextInt(); // Size of subarray
        
        int max = Integer.MIN_VALUE; // Keeps track of the maximum number of unique elements in the subarray of size m
        for(int i = 0; i < n; i++) {
            int num = in.nextInt();
            if(i >= m) {
                int val = deque.removeFirst();
                if(mp.get(val) == 1)
                    mp.remove(val);
                else
                    mp.put(val, mp.getOrDefault(val, 0) - 1);
            }
            // Add the new number into deque
            deque.addLast(num);
            mp.put(num, mp.getOrDefault(num, 0) + 1);
            max = Math.max(max, mp.size());
            if(max == m) { // If the size is equal to m, it's not possible to have a size greater than m further because the subarray size is m
                break;
            }
        }
        
        System.out.println(max);
    }
}