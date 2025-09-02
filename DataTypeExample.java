// Step 1: Class Declaration
class DataTypeExample {

    // Step 2: Declare variables with different data types

    // Primitive Data Types
    byte age = 25;              // byte: 1 byte ? -128 to 127
    short year = 2025;          // short: 2 bytes ? -32,768 to 32,767
    int population = 1400000;   // int: 4 bytes ? commonly used for integers
    long distance = 9876543210L; // long: 8 bytes ? use L at the end

    float price = 99.99f;       // float: 4 bytes ? use f at the end
    double pi = 3.14159265359;  // double: 8 bytes ? more precision

    char grade = 'A';           // char: 2 bytes ? stores a single character
    boolean isJavaFun = true;   // boolean: 1 bit ? true or false

    // Non-Primitive (Reference) Data Type
    String name = "Vishnu";     // String is a class ? used for text

    // Step 3: Method to display all variables
    void displayData() {
        System.out.println("---- Primitive Data Types ----");
        System.out.println("Age (byte): " + age);
        System.out.println("Year (short): " + year);
        System.out.println("Population (int): " + population);
        System.out.println("Distance (long): " + distance);
        System.out.println("Price (float): " + price);
        System.out.println("Pi (double): " + pi);
        System.out.println("Grade (char): " + grade);
        System.out.println("Is Java Fun? (boolean): " + isJavaFun);

        System.out.println("\n---- Non-Primitive Data Type ----");
        System.out.println("Name (String): " + name);
    }

    // Step 4: Main Method
    public static void main(String[] args) {
        // Object Creation
        DataTypeExample obj = new DataTypeExample();

        // Calling method to display all data types
        obj.displayData();
    }
}

/*
Explanation     Table (Quick Reference for Students):-
-----------------------------------------------------
DataType	Size	  Example	                   Range/Usage
byte	   1 byte	  byte age = 25;	            Small integers (-128 to 127)
short	   2 byte	  short year = 2025;	        Medium integers (-32,768 to 32,767)
int	       4 byte	  int population = 140000;	    Commonly used integers
long	   8 byte	  long distance = 9876543210L;	Very large integers
float	   4 byte	  float price = 99.99f;	        Decimal numbers (less precision)
double	   8 byte	  double pi = 3.14159;	        Decimal numbers (more precision)
char	   2 byte	  char grade = 'A';	            Single character
boolean	   1 bit	  boolean isJavaFun = true;	    true / false
String	   Varies	  String name = "Vishnu";	    Text data





*/
