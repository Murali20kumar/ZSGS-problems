import java.util.*;

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

class EvaluteZ { // 22) To evaluate an expression of Z
     public static void main(String[] args) {
        int y = 10;
        int z = (++y * (y++ + 5));

        System.out.println("z = " + z);
    }

}

class EvaluateX1 { // 23) To evaluate an expression of X1
    public static void main(String[] args) {
        int x = 5;
        int x1 = ++x - x++ + --x;

        System.out.println("x1 = " + x1);
    }
}

class FinalKeyword { // 24) To demonstrate the use of final keyword
    final int VALUE = 100;

    public static void main(String[] args) {
        FinalKeyword obj = new FinalKeyword();
        System.out.println("Final variable VALUE: " + obj.VALUE);
    }
}

 class MergeArrays { // 25) To merge two arrays and find repeated elements
    public static void main(String[] args) {
        int[] arr1 = {2,4,5,6,7,9,10,13};
        int[] arr2 = {2,3,4,5,6,7,8,9,11,15};

        Set<Integer> mergedSet = new LinkedHashSet<>();
        Set<Integer> repeatedSet = new LinkedHashSet<>();

        for (int num : arr1) mergedSet.add(num);
        for (int num : arr2) {
            if (!mergedSet.add(num)) repeatedSet.add(num);
        }

        System.out.println("Merged array: " + mergedSet);
        System.out.println("Repeated elements: " + repeatedSet);
    }
}

class RightRotateMatrix { // 26) To right rotate a matrix 
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};

        int rows = matrix.length, cols = matrix[0].length;
        int[][] rotated = new int[cols][rows];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                rotated[j][rows - 1 - i] = matrix[i][j];

        System.out.println("Rotated Matrix:");
        for (int[] row : rotated) System.out.println(Arrays.toString(row));
    }
}

class AlternateSort { // 27) To sort an array in alternate order
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 7, 5, 6, 4};
        Arrays.sort(arr);

        int[] result = new int[arr.length];
        int left = 0, right = arr.length - 1, index = 0;

        while (left <= right) {
            if (index % 2 == 0) result[index++] = arr[left++];
            else result[index++] = arr[right--];
        }

        System.out.println("Alternate Sorted Array: " + Arrays.toString(result));
    }
}

class FactorialReverse { // 28) To find the factorial of a number and its reverse
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        long fact = 1;
        for (int i = 1; i <= num; i++) fact *= i;

        String reverseFact = new StringBuilder(String.valueOf(fact)).reverse().toString();

        System.out.println("Factorial: " + fact);
        System.out.println("Reverse of Factorial: " + reverseFact);

        scanner.close();
    }
}

class SumEvenPositions {   // 29) To find the sum of elements at even positions in an array
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int sum = 0;
        for (int i = 0; i < arr.length; i += 2)
            sum += arr[i];

        System.out.println("Sum of elements at even positions: " + sum);
    }
}

class SumOddPositions { // 30) To find the sum of elements at odd positions in an array
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int sum = 0;
        for (int i = 1; i < arr.length; i += 2)
            sum += arr[i];

        System.out.println("Sum of elements at odd positions: " + sum);
    }
}

class SecondLargest { // 31) To find the second largest element in an array
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 9, 3};
        Arrays.sort(arr);

        System.out.println("Second largest element: " + arr[arr.length - 2]);
    }
}

class SecondSmallest { // 32) To find the second smallest element in an array
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 9, 3};
        Arrays.sort(arr);

        System.out.println("Second smallest element: " + arr[1]);
    }
}

class ArraySize { // 33) To find the number of elements in an array
    public static void main(String[] args) {
        int[] arr = {3, 8, 2, 5, 1, 6};

        System.out.println("Number of elements in the array: " + arr.length);
    }
}

class CopyArray { // 34) To copy elements from one array to another 
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8};
        int[] arr2 = new int[arr1.length]; // Create a new array with same size

        // Manually copying elements
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        // Display copied array
        System.out.print("Copied array: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}


class FrequencyCount { // 35) To count the frequency of elements in an array
    public static void main(String[] args) {
        int[] arr = {3, 5, 3, 8, 5, 5, 3, 8};
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Element frequencies: " + freqMap);
    }
}

class ReverseArray { // 36) To reverse the given array
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}

 class ArrayAverage { // 37) To find the average of elements in an array
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        double avg = sum / (double) arr.length;
        System.out.println("Average of elements: " + avg);
    }
}

class DeleteElement { // 38) To delete an element from an array 
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int target = 3; // Element to delete

        // Remove the target element
        list.remove(Integer.valueOf(target));

        // Print the updated list
        System.out.println("Array after deletion: " + list);
    }
}

class InverseArray { // 39) To find the inverse of an array
    public static int[] inverseElements(int[] arr) {
        int[] inverseArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            inverseArr[arr[i]] = i;
        }

        return inverseArr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 4, 1, 2};
        int[] result = inverseElements(arr);

        System.out.println("Inversed array: " + Arrays.toString(result));
    }
}

class OddInRange { // 40) To print odd numbers in a given range
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        for (int i = low + 1; i < high; i++) {
            if (i % 2 != 0) {
                System.out.print(i + (i < high - 2 ? ", " : ""));
            }
        }

        sc.close();
    }
}

class PrintLetters { // 41) To print letters from A to a given letter
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the letter:");
        char end = sc.next().charAt(0);

        for (char c = 'A'; c <= end; c++) {
            System.out.print(c);
        }

        sc.close();
    }
}

class ReverseSentence { // 42) To reverse the words in a sentence
    public static void main(String[] args) {
        String input = "I love India";
        reverseWords(input.split(" "), 0);
    }

    static void reverseWords(String[] words, int index) {
        if (index == words.length) return;
        reverseWords(words, index + 1);
        System.out.print(words[index] + " ");
    }
}

class NumberToWords { // 43) To convert a number to words
    static String[] ones = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
        "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };
    static String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(convert(num));
        sc.close();
    }

    static String convert(int num) {
        if (num == 0) return "Zero";

        StringBuilder result = new StringBuilder();
        if (num >= 100) {
            result.append(ones[num / 100]).append(" Hundred ");
            num %= 100;
        }

        if (num >= 20) {
            result.append(tens[num / 10]).append(" ");
            num %= 10;
        }

        if (num > 0) {
            result.append(ones[num]).append(" ");
        }

        return result.toString().trim();
    }
}

class WithoutString { // 44) To print all substrings of a string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); 
        char[] arr = input.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

class MismatchedElements { // 45) To find mismatched elements in two arrays
    public static void main(String[] args) {
        String[] arr1 = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
        String[] arr2 = {"a", "b", "d", "e", "e", "g", "g", "i", "i"};

        Set<String> set1 = new HashSet<>(Arrays.asList(arr1));
        Set<String> set2 = new HashSet<>(Arrays.asList(arr2));

        Set<String> mismatch = new HashSet<>(set1);
        mismatch.addAll(set2);
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        mismatch.removeAll(intersection);

        for (String s : mismatch) {
            System.out.print(s + " ");
        }
    }
}

class HugeNumbers { // 46) To add two huge numbers represented as arrays
    public static void main(String[] args) {
        int[] num1 = {9, 2, 8, 1, 3, 5, 6, 7, 3, 1, 1, 6};
        int[] num2 = {7, 8, 4, 6, 2, 1, 9, 9, 7};

        int n1 = num1.length, n2 = num2.length;
        int maxLength = Math.max(n1, n2);
        int[] result = new int[maxLength + 1];

        int i = n1 - 1, j = n2 - 1, k = maxLength, carry = 0;

        while (i >= 0 || j >= 0) {
            int digit1 = (i >= 0) ? num1[i] : 0;
            int digit2 = (j >= 0) ? num2[j] : 0;

            int sum = digit1 + digit2 + carry;
            result[k] = sum % 10;
            carry = sum / 10;

            i--; j--; k--;
        }

        result[k] = carry;

        // Print result without leading zero
        int start = (result[0] == 0) ? 1 : 0;
        for (int m = start; m < result.length; m++) {
            System.out.print(result[m]);
        }
        System.out.println();
    }
}

class SumWithReverse { // 47) To find the sum of a number and its reverse
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt(), rev = 0, original = num;

        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }

        int sum = original + rev;
        System.out.println(original + " + " + rev + " = " + sum);

        sc.close();
    }
}


