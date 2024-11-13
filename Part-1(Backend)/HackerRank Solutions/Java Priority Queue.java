import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
/*
 * Create the Student and Priorities classes here.
 */
class Student {
    private int id;
    private String name;
    private double cgpa;
    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public int getID() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public double getCGPA() {
        return this.cgpa;
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {
        List<Student> ans = new ArrayList<>();
        
        // Custom PriorityQueue sorting based on given conditions
        PriorityQueue<Student> pq = new PriorityQueue<Student>(new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                if(s1.getCGPA() != s2.getCGPA()) {
                    return s1.getCGPA() > s2.getCGPA() ? -1 : 1; // Descending order
                }
                else if(s1.getName().equals(s2.getName())) {
                    return s1.getID() - s2.getID();
                }
                else {
                    return (s1.getName()).compareTo(s2.getName());
                }
            }
        });
        
        for(int i=0; i<events.size(); i++) {
            String[] temp = events.get(i).split(" ");
            if(temp[0].equals("ENTER")) {
                Student s = new Student(Integer.parseInt(temp[3]), temp[1], Double.parseDouble(temp[2]));
                pq.add(s);
            }
            else if(temp[0].equals("SERVED")) {
                if(pq.isEmpty()) {
                    continue;
                }
                pq.remove();
            }
        }
        
        // Return the final list containing the students who are not yet served
        while(!pq.isEmpty()) {
            Student s = pq.poll();
            ans.add(s);
        }
        return ans;
    }
}


public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}