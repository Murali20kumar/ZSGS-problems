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

class VowelConsonantCheck { //11) To check if a character is a vowel or consonant
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if ("AEIOUaeiou".indexOf(ch) != -1) {
            System.out.println(ch + " is a Vowel.");
        } else {
            System.out.println(ch + " is a Consonant.");
        }

        scanner.close();
    }
}

class LargestOfFour { // 12) To find the largest of four numbers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter four numbers: ");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt(), d = scanner.nextInt();

        int largest = Math.max(Math.max(a, b), Math.max(c, d));

        System.out.println("Largest number: " + largest);

        scanner.close();
    }
}

class QuadraticEquation { // 13) To find the roots of a quadratic equation
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coefficients a, b, and c: ");
        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots: " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            System.out.println("Root: " + (-b / (2 * a)));
        } else {
            System.out.println("No real roots.");
        }

        scanner.close();
    }
}

class PNCheck { // 14) To check if a number is positive or negative
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        scanner.close();
    }
}

class SumNaturalNumbers { // 15) To find the sum of first n natural numbers and the smallest digit in that sum
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int sum = n * (n + 1) / 2;
        System.out.println("Sum of natural numbers: " + sum);

        int smallestDigit = 9;
        while (sum > 0) {
            smallestDigit = Math.min(smallestDigit, sum % 10);
            sum /= 10;
        }
        System.out.println("Smallest digit of the sum: " + smallestDigit);

        scanner.close();
    }
}

class AlphabetCheck {// 16) To check if a character is an alphabet
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if (Character.isLetter(ch)) {
            System.out.println(ch + " is an Alphabet.");
        } else {
            System.out.println(ch + " is not an Alphabet.");
        }

        scanner.close();
    }
}

class ConditionalOperators { // 17) To define the functionality of conditional operators
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
        System.out.println("The number is: " + result);

        scanner.close();
    }
}

class areaofspace { //18 ) To find the area of space between two circles
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of outer circle: ");
        double outerRadius = scanner.nextDouble();
        System.out.print("Enter radius of inner circle: ");
        double innerRadius = scanner.nextDouble();

        double area = Math.PI * (outerRadius * outerRadius - innerRadius * innerRadius);
        System.out.println("Area of space between circles: " + area);

        scanner.close();
    }
}

 class EvaluateExpressions { // 19) To evaluate expressions using pre and post increment/decrement operators
    public static void main(String[] args) {
        int a = 10, b = 5, x = 69;

        int result1 = ++a - --b;
        int result2 = a-- % b++;
        int result3 = (a *= (b += 5));
        int result4 = (x = 69 >>> 2);

        System.out.println("i) ++a - --b = " + result1);
        System.out.println("ii) a-- % b++ = " + result2);
        System.out.println("iii) a *= b += 5 = " + result3);
        System.out.println("iv) x = 69 >>> 2 = " + result4);
        System.out.println("Value of x: " + x);
    }
}

class EvaluateA { // 20) To evaluate an expression with given value

    public static void main(String[] args) {
        int a = 28;
        a = ++a + ++a + --a + a--;
        System.out.println("Result when a = 28: " + a);
    }
}

class EvaluateX {// 21) To evaluate an expression with given value
    public static void main(String[] args) {
        int x = 5; 
        x = ++x * 2 + 3 * --x;
        System.out.println("Result: " + x);
    }
}





