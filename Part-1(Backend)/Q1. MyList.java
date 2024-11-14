import java.util.*;

public class MyList {
    private Integer[] data;
    private int size;

    // Constructor to initialize the array with a size of 100
    public MyList() {
        data = new Integer[100];
        size = 0;
    }

    // Method to add a new value
    public void add(Integer value) {
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
    public void deleteByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(value)) {
                deleteByIndex(i);
                return;
            }
        }
        throw new NoSuchElementException("Value not found");
    }

    // Method to retrieve a value at a specific index
    public int get(int index) {
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
        MyList list = new MyList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("After adding 5 values: " + list);
        System.out.println("Array size: " + list.getSize());
        list.deleteByIndex(0);
        System.out.println("After deleting at index 0 (deleting by index): " + list);
        list.deleteByValue(30);
        System.out.println("After deleting 30 (deleting by value): " + list);
        System.out.println("Array size: " + list.getSize());
        System.out.println("Retrieving a value at index 1: " + list.get(1));
    }
}

/* Output:
    After adding 5 values: [10, 20, 30, 40, 50]
    Array size: 5
    After deleting at index 0 (deleting by index): [20, 30, 40, 50]
    After deleting 30 (deleting by value): [20, 40, 50]
    Array size: 3
    Retrieving a value at index 1: 40
*/