// Step 1: Class Declaration
// Syntax: class ClassName {   }
class Car {

    // Step 2: Declaration of Variables (Properties)
    // Syntax: dataType variableName = variableValue;
    String brandName = "Maruti";

    // Step 3: Declaration of Methods (Functionalities)
    // Syntax: returnType methodName(parameters) {   }
    String start(String key) {
        System.out.println("Inserting the key: " + key);
        System.out.println("Turning the key to start...");
        System.out.println("Engine started successfully!");
        return "Speeding Up...";
    }

    // Step 4: Declaration of main() method (Entry point)
    public static void main(String[] args) {

        // Step 5: Object Creation
        // Syntax: ClassName obj = new ClassName();
        Car obj = new Car();

        // Step 6: Accessing variables and methods using the object
        System.out.println("Car Brand: " + obj.brandName);

        // Calling the start() method and capturing the return value
        String str = obj.start("Key01");

        // Printing the returned value
        System.out.println("Car Status: " + str);
    }
}
