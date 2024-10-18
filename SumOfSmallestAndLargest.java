import java.util.Scanner;

public class SumOfSmallestAndLargest {
    public static void main(String[] args) {
        // Create a Scanner object to get input from user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Calculate the smallest and largest numbers
        int smallest = num1;
        int largest = num1;

        if (num2 < smallest) smallest = num2;
        if (num3 < smallest) smallest = num3;

        if (num2 > largest) largest = num2;
        if (num3 > largest) largest = num3;

        // Calculate the sum of the smallest and largest numbers
        int sum = smallest + largest;

        // Display the result
        System.out.println("The sum of the smallest and largest numbers is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
