import java.util.*;

class MyList<T> {
    private Object[] data;
    private int size;

    // Constructor to initialize the array with a size of 100
    public MyList() {
        data = new Object[100];
        size = 0;
    }

    // Method to add a new value
    public void add(T value) {
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
    public void deleteByValue(T value) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(value)) {
                deleteByIndex(i);
                return;
            }
        }
        throw new NoSuchElementException("Value not found");
    }

    // Method to retrieve a value at a specific index
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return (T) data[index];
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

    // Main method to test the generic MyList class
    public static void main(String[] args) {
        // Testing with Integer type
    	System.out.println("--------------------------Integer type--------------------------");
        MyList<Integer> intList = new MyList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);
        intList.add(50);
        System.out.println("After adding 5 values: " + intList);
        System.out.println("Array size: " + intList.getSize());
        intList.deleteByIndex(0);
        System.out.println("After deleting at index 0 (deleting by index): " + intList);
        intList.deleteByValue(30);
        System.out.println("After deleting 30 (deleting by value): " + intList);
        System.out.println("Array size: " + intList.getSize());
        System.out.println("Retrieving a value at index 1: " + intList.get(1));
        
        System.out.println();
        
        // Testing with String type
        System.out.println("--------------------------String type--------------------------");
        MyList<String> stringList = new MyList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Welcome");
        System.out.println("After adding 3 values: " + stringList);
        System.out.println("Array size: " + stringList.getSize());
        stringList.deleteByIndex(1);
        System.out.println("After deleting at index 1 (deleting by index): " + stringList);
        stringList.deleteByValue("Hello");
        System.out.println("After deleting 'Hello' (deleting by value): " + stringList);
        System.out.println("Array size: " + stringList.getSize());
        System.out.println("Retrieving a value at index 0: " + stringList.get(0));
        
        System.out.println();

        // Testing with custom type
        System.out.println("--------------------------Custom type--------------------------");
        MyList<Person> personList = new MyList<>();
        personList.add(new Person(123, "Alice"));
        personList.add(new Person(234, "Bob"));
        personList.add(new Person(345, "John"));
        personList.add(new Person(456, "Zoya"));
        System.out.println("After adding 4 values: " + personList);
        System.out.println("Array size: " + personList.getSize());
        personList.deleteByIndex(3);
        System.out.println("After deleting at index 3 (deleting by index): " + personList);
        System.out.println("Array size: " + personList.getSize());
        personList.deleteByValue(new Person(123, "Alice"));
        System.out.println("After deleting '123 Alice' (deleting by value): " + personList);
        System.out.println("Retrieving a value at index 2: " + personList.get(1));
    }
}

// Custom Person class for demonstration
class Person {
	private int ID;
    private String name;

    public Person(int ID, String name) {
    	this.ID = ID;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return name.equals(person.name) && ID == person.ID;
    }

    @Override
    public String toString() {
        return String.valueOf(ID) + " " + name;
    }
}