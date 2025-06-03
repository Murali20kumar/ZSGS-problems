import java.util.Scanner;

public class zsgs { //1) Converts an integer to its binary, octal, and hexadecimal representations.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        System.out.println("Binary: " + Integer.toBinaryString(num));
        System.out.println("Octal: " + Integer.toOctalString(num));
        System.out.println("Hexadecimal: " + Integer.toHexString(num));

        scanner.close();
    }
}

class SquareCircumference { // 2)To find the circumference of a square
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side length: ");
        double side = scanner.nextDouble();

        System.out.println("Circumference: " + (4 * side));

        scanner.close();
    }
}

class Rectangle { // 3)To find the cirucumference of a reactangle
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        System.out.println("Circumference: " + (2 * (length + width)));

        scanner.close();
    }
}

class Cylinder { // T4)o find the circumference of a cylinder
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        System.out.println("Circumference: " + (2 * Math.PI * radius));

        scanner.close();
    }
}

class Tables { // 5)To print division and addition tables for a given number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Division Table:");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d / %d = %.2f%n", num, i, (num / (double) i));
        }

        System.out.println("Addition Table:");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d + %d = %d%n", num, i, (num + i));
        }

        scanner.close();
    }
}
class ASCIIValues { // 6)To print ASCII values
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch + " : " + (int) ch);
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch + " : " + (int) ch);
        }
    }
}
class QuotientRemainder { // 7)To find the quotient and remainder of two integers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int dividend = scanner.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();

        System.out.println("Quotient: " + (dividend / divisor));
        System.out.println("Remainder: " + (dividend % divisor));

        scanner.close();
    }
}
class LongDouble { // 8)To demo long and double data types
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter a long number: ");
        long largeNumber = scanner.nextLong();
         System.out.print("Enter a decimal number: ");
        double decimalNumber = scanner.nextDouble();

        System.out.println("Long Value: " + largeNumber);
        System.out.println("Double Value: " + decimalNumber);
        scanner.close();
    }
}
class Swap { // 9)To swap two integers without using a third variable
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: First number = " + a + ", Second number = " + b);

        scanner.close();
    }
}

class EvenOdd { //10) To check if a number is even or odd
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println((num % 2 == 0) ? "Given number is Even" : "Given number is Odd");

        scanner.close();
    }
}



