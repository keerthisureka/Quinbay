import java.sql.Date;
import java.util.*;

class Employee {
	private String id;
    private String name;
    private int age;
    private Date dateOfJoining;

    public Employee(String id, String name, int age, Date dateOfJoining) {
    	this.id = id;
        this.name = name;
        this.age = age;
        this.dateOfJoining = dateOfJoining;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee emp = (Employee) obj;
        return name.equals(emp.name) && id.equals(emp.id) && age == emp.age && dateOfJoining.equals(emp.dateOfJoining);
    }

    @Override
    public String toString() {
        return "\nID: " + id + "\nName: " + name + "\nAge: " + age + "\nDate of Joining: " + dateOfJoining + "\n";
    }
}

class MyList {
    private Employee[] data;
    private int size;

    // Constructor to initialize the array with a size of 100
    public MyList() {
        data = new Employee[100];
        size = 0;
    }

    // Method to add a new value
    public void add(Employee value) {
        if (size == data.length) {
            resize(data.length * 2); // Double the array size when full
        }
        data[size++] = value;
    }

    // Method to delete an element by index
    public void deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = null;  // Nullify the last element after shifting
        if (size < data.length / 4) {
            resize(data.length / 2);  // Halve the array size when mostly empty
        }
    }

    // Method to delete the first occurrence of an element by value
    public void deleteByValue(Employee value) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(value)) {
                deleteByIndex(i);
                return;
            }
        }
        throw new NoSuchElementException("Value not found");
    }

    // Method to retrieve a value at a specific index
    public Employee get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return data[index];
    }

    // Method to resize the internal array
    private void resize(int newCapacity) {
        data = Arrays.copyOf(data, newCapacity);
    }

    // Method to get the current size of the list
    public int getSize() {
        return size;
    }

    // For displaying the list
    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(data, size));
    }

    // Main method to test the MyList class
    public static void main(String[] args) {
        // Testing with custom type Employee
        MyList empList = new MyList();
        empList.add(new Employee("E001", "Alice", 25, java.sql.Date.valueOf("2020-01-20")));
        empList.add(new Employee("E002", "Bob", 30, java.sql.Date.valueOf("2018-01-01")));
        empList.add(new Employee("E003", "John", 24, java.sql.Date.valueOf("2023-06-01")));
        empList.add(new Employee("E004", "Zoya", 28, java.sql.Date.valueOf("2023-06-08")));
        System.out.println("After adding 4 values: " + empList);
        System.out.println();
        System.out.println("Array size: " + empList.getSize());
        System.out.println();
        
        empList.deleteByIndex(3);
        System.out.println("After deleting at index 3 (deleting by index): " + empList);
        System.out.println();
        System.out.println("Array size: " + empList.getSize());
        System.out.println();
        
        empList.deleteByValue(new Employee("E001", "Alice", 25, java.sql.Date.valueOf("2020-01-20")));
        System.out.println("After deleting employee with name='Alice' (deleting by value): " + empList);
        System.out.println();
        
        System.out.println("Retrieving a value at index 1: " + empList.get(1));
    }
}