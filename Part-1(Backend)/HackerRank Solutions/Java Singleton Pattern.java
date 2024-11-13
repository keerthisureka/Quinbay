import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

class Singleton{
    // public String instance variable named str
    public String str;
    // Non-parameterized constructor
    private Singleton() {
    }
    // Static method named getSingleInstance that returns the single instance of the Singleton class.
    public static Singleton getSingleInstance() {
        return new Singleton();
    }
}