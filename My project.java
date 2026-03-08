// MyProgram.java
public class MyProgram {
    public static void main(String[] args) {
        // Print a welcome message
        System.out.println("Hello GitHub! This Java program is running from your repo.");

        // Simple calculation example
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);

        // Loop example
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Conditional example
        if (sum > 15) {
            System.out.println("The sum is greater than 15!");
        } else {
            System.out.println("The sum is 15 or less!");
        }
    }
}