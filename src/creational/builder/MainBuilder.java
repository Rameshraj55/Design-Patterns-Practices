package creational.builder;

/**
 * INTENTION
 * Builder is a creational design pattern-construct complex objects step by step
 * to produce different types and representations of an object using the same construction code.
 *
 */

/**
 * PROBLEM:---> lots of parameters & not all the parameters are needed at all times
 * a complex object that requires needs step-by-step initialization of many fields and nested objects.
 * for that object initialization big constructor needed with lots of parameters
 * E.g: House, House with Garage, House with Swimming pool, House with Garden, House with Balcony
 *  this result to increased parameters
 *
 *  The constructor with lots of parameters has its downside:
 *  1. At the Same time not all the parameters are needed at all times
 *  2. Complex Object
 *
 */

/**
 * SOLUTION
 * 1. Builder Class:
 *      1.1 Contains methods for setting various properties of the object.
 *      1.2 Allows for method chaining. Each method typically returns the Builder object itself to allow method chaining
 *      1.3 Method Chaining: Ensure that each method in the builder returns the builder itself (this).
 *      1.4 Use builders for constructing complex objects in a modular fashion, enabling easier maintenance and enhancements
 *
 *
 * 2. Product Class: The complex object that is being built.
 *      2.1 a private constructor and is accessed via the builder
 *
 * 3. Director Class: (Optional) Manages the construction process by using the builder's methods in a specific sequence.
 *      3.1 Manages the construction process using the Builder interface
 *      3.2 ensures that the steps are executed in a particular sequence.
 *
 */

/**
 * https://chatgpt.com/c/c96c53cd-be3b-42eb-a248-597544afd764
 *  REAL TIME EXAPMLES
 *  1. Java's StringBuilder and StringBuffer (E.g: Method Chaining)
 *          Use Case: Efficient string concatenation.
 *          Problem: Concatenating strings using the + operator creates multiple intermediate objects, leading to high memory usage and poor performance.
 *          Solution: The StringBuilder (or StringBuffer for thread-safe operations) class allows for efficient string construction.
 *                    It uses an internal buffer to build the string, appending new data to the existing buffer.
 *
 *  2. Apache HTTP Client
 *          Use Case: Configuring and constructing HTTP clients.
 *          Problem: Creating an HTTP client with various configurations such as timeouts, proxies, authentication, etc., can be complex.
 *          Solution: Apache's HTTP client library uses the Builder pattern to simplify the construction of clients with complex configurations.
 *
 *   3. Google's Protocol Buffers
 * Use Case: Constructing complex protocol message objects.
 *
 * Problem: Managing complex message structures with nested fields and optional/required fields.
 * Solution: Protocol Buffers use the Builder pattern to construct message objects, allowing for the setting of various fields in a clear and manageable way.
 *
 * 4. GUI Frameworks (e.g., JavaFX, Swing)
 * Use Case: Building complex user interface components.
 *
 * Problem: Constructing complex UI elements with multiple nested components and properties.
 * Solution: GUI frameworks often use the Builder pattern to manage the construction of complex UI elements.
 *
 * 5.  Android's AlertDialog
 * Use Case: Creating complex dialogs with multiple options, custom views, and configurations.
 *
 * Problem: Managing dialog configurations like title, message, buttons, custom views, etc., can be cumbersome.
 * Solution: The AlertDialog.Builder class in Android simplifies the creation of dialogs with various configurations.
 *
 *
 *
 *

 */

/**
 * TIPS AND TRICKS
 *   1. Method Chaining: Ensure that each method in the builder returns the builder itself (this). This allows for fluent method chaining.
 *
 *   2. Immutable Objects: By making the Product class’s constructor private and only accessible through the Builder, you can ensure that the constructed objects are immutable.
 *      This is a common requirement for many applications to ensure thread safety.
 *
 *   3. Director Class: Use a Director class if the construction process is complex and involves a specific sequence of steps need to be executed in a particular order.
 *      The Director can encapsulate this sequence, making the builder itself simpler and more reusable.
 *
 *   4. Optional Parameters: Only add methods for optional parameters in the builder to reduce the complexity for the end-user.
 *      This keeps the builder clean and focused on its primary role.
 *
 *   5. Validation: Include validation logic in the build method to ensure that all required parameters are set and valid.
 *      This can prevent the creation of invalid objects.
 *
 *   6. Default Values: Set default values for optional parameters in the builder's constructor.
 *      This simplifies the object construction process by allowing clients to only specify what’s necessary.
 *
 *   7. Clone Method: If your Product class needs to be cloneable,
 *      consider implementing a clone method in the Builder class to facilitate easy copying of objects.
 *       it easier to copy objects with slight variations.
 *     // public ComputerBuilder clone() {
 *          return new ComputerBuilder(this.HDD, this.RAM)
 *                .setGraphicsCardEnabled(this.isGraphicsCardEnabled)
 *                .setBluetoothEnabled(this.isBluetoothEnabled);
 *      // }
 *   8. Thread Safety: Ensure that your builder is thread-safe if it will be used in a multithreaded environment.
 *
 *   9.
 *
 *
 *
 *
 *
 */
public class MainBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(1);

    }
}
