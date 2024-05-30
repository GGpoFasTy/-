import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Compare two integers
        System.out.println("Enter two integers:");
        int intA = scanner.nextInt();
        int intB = scanner.nextInt();
        CompareNumbers.compareAndOperate(intA, intB);

        // 2. Compare two strings
        System.out.println("Enter two strings:");
        scanner.nextLine();  // Consume newline
        String strA = scanner.nextLine();
        String strB = scanner.nextLine();
        CompareStrings.compareStrings(strA, strB);

        // 3. Display even numbers in the array
        EvenNumbers.displayEvenNumbers();
    }
}


