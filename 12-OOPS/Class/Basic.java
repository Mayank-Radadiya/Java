// Demonstrates core CLASS concepts in OOP
// A class is a **blueprint** for creating objects
// It encapsulates data (fields) and behavior (methods)

/*
| Element     | Purpose                                    | In Code                     |
|-------------|---------------------------------------------|-----------------------------|
| Fields      | Hold the object’s state (variables)         | `color`, `price`, `modelNo`|
| Constructor | Initializes new object                      | `Car(String, int, String)` |
| Methods     | Define behavior / expose data safely        | `getModelNo()`, `setModelNo()` |
| Access Mod. | Control visibility (public/private)         | `private`, `public`         |
*/

public class Basic {

    // Class: Car
    public class Car {
        // Fields (object state)
        String color; // Public by default (package-private)
        int price;
        private String modelNo; // Only accessible via methods below

        // Constructor: initializes the car's attributes
        public Car(String color, int price, String modelNo) {
            this.color = color;
            this.price = price;
            this.modelNo = modelNo;
        }

        // Getter: allow controlled read access to private field
        public String getModelNo() {
            return modelNo;
        }

        // Setter: allow controlled write access to private field
        public void setModelNo(String modelNo) {
            this.modelNo = modelNo;
        }

        // Behavior method: simulate driving
        public void drive() {
            System.out.println("Driving a " + color + " car worth Rs." + price);
        }

        // Behavior method: display info
        public void showDetails() {
            System.out.println("[Details] Color: " + color + ", Price: Rs." + price + ", Model: " + modelNo);
        }
    }

    // Main method: test the Car class
    public static void main(String[] args) {
        // To access inner class Car, we must first create an instance of outer class
        Basic outer = new Basic();
        Car myCar = outer.new Car("Red", 500000, "X123Y");

        // Access and print object details
        myCar.drive();
        myCar.showDetails();

        // Demonstrate getter & setter
        System.out.println("Model before change: " + myCar.getModelNo());
        myCar.setModelNo("Z999Z");
        System.out.println("Model after change: " + myCar.getModelNo());
    }
}

// ? This Keyword is used to refer to current Object.

/*
 * ✅ Summary:
 * ──────────────
 * • A class groups related **data** and **methods** into one structure.
 * • Use **private** to hide fields, and **getters/setters** to control access.
 * • Constructors are special methods that prepare a new object.
 * • You can define actions (like `drive()` and `showDetails()`) to simulate
 * behavior.
 */
