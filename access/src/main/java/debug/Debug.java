/**
 * Exercise 3: (2) Create two packages: debug and debugoff,
 * containing an identical class with a debug() method. The first
 * version displays its String argument to the console, the second
 * does nothing. Use a static import line to import the class into a
 * test program, and demonstrate the conditional compilation effect.
 */
package debug;

public class Debug {
    public static void debug(String arg) {
        System.out.println("Debug: " + arg);
    }
}
