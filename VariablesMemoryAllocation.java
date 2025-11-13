class Calculator {
    int num = 10; // Instance variable, stored in heap memory as part of the Calculator object

    // The add method takes two parameters, a and b, which are local variables and stored in stack memory.
    public int add(int a, int b) {
        return a + b; // Returns the sum of a and b.
    }
}

public class VariablesMemoryAllocation {
    public static void main(String[] args) {
        // 'obj' is a reference variable, stored in the stack, pointing to a Calculator object in the heap memory.
        Calculator obj = new Calculator();

        // 'res' is a local variable in the main method, stored in the stack.
        // The add method is called, and its return value is stored in 'res'.
        int res = obj.add(2, 2);

        // Printing the result to the error stream (System.err).
        System.err.println(res); // Expected output: 4
    }
}
