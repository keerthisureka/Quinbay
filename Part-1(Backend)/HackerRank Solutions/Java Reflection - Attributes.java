// Has some error in Java 8. So execute in Java 7.
public class Solution {
    public static void main(String[] args) {
        Class student = Student.class; // Class literal
        Method[] methods = student.getDeclaredMethods();
        
        // Get method names
        ArrayList<String> methodList = new ArrayList<>();
        for(Method method : methods){
            methodList.add(method.getName());
        }
        
        // Sort the names
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }
}