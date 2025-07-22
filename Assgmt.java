import java.util.*;

public class Assgmt { // Problem 1
  
  static char staticvar = 'M';

  int instancevar = 23;

  final String finalvar = "Final variable is here";


  public void block(){

   String localvar = "1st problem";
   System.out.println(localvar);

   if(true){
     
     String blockvar = "Assignment 1";
     System.out.println(blockvar);

    }
  }

  public static void main (String []args){
   
   Assgmt asgn = new Assgmt();

   System.out.println(asgn.instancevar);
   System.out.println(staticvar);
   asgn.block();

   }

}

//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem2 { // problem 2.

  public static void main (String [] args){

    byte bvar = 126 ; 
    int ivar = 56;
    char cvar  = 'M';
    float fvar = 56.96f; // either f or F, our wish to use any one of them.
    double dvar = 3.14d; // same d or D.
    String svar = "Monster";

   System.out.println("Byte :" + bvar);
   System.out.println("Integer :" + ivar);
   System.out.println("Character :"+ cvar);
   System.out.println("Float :" + fvar);
   System.out.println("Double :" + dvar);
   System.out.println("String :" + svar);
  }
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem3 { // Problem 3 : to find a max number using ternary operator

  public static void main (String [] args){
      
     int a = 5;
     int b = 6;
     System.out.println("Maximum number :" +" "+ (a > b ? a : b));
  }
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem4 { // Problem 4 : To check given 2 numbers are equal without using comparison operator

   
   public static void main (String[] args){
      
      int a = 5;
      int b = 5;
       if((a ^ b) == 0){
      System.out.println("Equal");
       }
       else {
      System.out.println("Not Equal");
      }
      
   }
}
    
//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem5 {

  static {
   System.out.println("static block");
  }

  {

  System.out.println("Instance block");
 
  }

  public static void main (String [] args){
       
      System.out.println("Main block");
      problem5 obj1 = new problem5();
   
    
  }
}
   
//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem6 {

  public static void main (String [] args){

    int a = 9 ;
    int b = 4;
    double res = (double) a / b;
    System.out.println(res);
    
  }
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem7 {

  public static void main (String [] args){

      int num = 33;
      
      if((num &(num - 1)) == 0) {
        System.out.println("It is a power of 2");
      }
       else System.out.println("It is not a power of 2");
    
  }
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem8 {

  public static void main (String [] args){
  
      int num = 12;
      int lowestbit = Integer.lowestOneBit(num);
      int pos = Integer.numberOfTrailingZeros(lowestbit)+1;

      System.out.println(pos);
  }
}
   
//------------------------------------------------------------------------------------------------------------------------------------------------------------

class Employee { // Problem 9

  int empId;
  String name;
  String department;
  double salary;

  public Employee( int empId, String name, String department, double salary){
    this.empId = empId;
    this.name = name;
    this.department = department;
    this.salary = salary;
  } 

 public void display(){
   System.out.println("Employee ID: " + empId);
   System.out.println("Name: " + name);
   System.out.println("Department: " + department);
   System.out.println("Salary: " + salary);
 }

  public static void main (String [] args){

      Employee obj1 = new Employee(001,"Dorian","Dr",300000.00);

      System.out.println("Employee Details:");
      obj1.display();

    
  }
}
   
//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem10 {

  public static void main (String [] args){

      ParentClass obj1 = new ParentClass();
      ChildClass obj2 = new ChildClass();

     System.out.println("Obj1 is instance of ParentClass : " + (obj1 instanceof ParentClass));
     System.out.println("Obj1 is instance of ChildClass : " + (obj1 instanceof ParentClass));
     System.out.println("Obj1 is instance of MyInterface : " + (obj1 instanceof ParentClass));
     System.out.println("Obj2 is instance of ParentClass : " + (obj2 instanceof ParentClass));
     System.out.println("Obj2 is instance of ChildClass : " + (obj2 instanceof ParentClass));
     System.out.println("Obj2 is instance of MyInterface : " + (obj2 instanceof ParentClass));
    
  }
}

class ParentClass{
}

interface MyInterface{
}

class ChildClass extends ParentClass implements MyInterface{
}
   
//------------------------------------------------------------------------------------------------------------------------------------------------------------

//Day - 2 (Part 1)

class problem11 {

  public static void main (String [] args){
     
     int a = 5, b = 6, c = 9;
      
     if( a < b && a < c){
       System.out.println("A is the Minimum number");
     }
     else if( b < c && b < a){
      System.out.println("B is the minimum number");
     }
     else {
      System.out.println("C is the minimum number");
     }
  }
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem12 {

  public static void main (String [] args){
    int[][] pattern = {
            {2, 4},
            {2, 2},
            {1, 4},
            {2, 2},
            {2, 2}
        };

        for (int i = 0; i < pattern.length; i++) {
            int ones = pattern[i][0];
            int rs = pattern[i][1];

            
            for (int j = 0; j < ones; j++) {
                System.out.print("1 ");
            }

           
            for (int j = 0; j < rs; j++) {
                System.out.print("R ");
            }

            System.out.println();         }

  }
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem13 {

  public static int sumOfEven(int n){
    int sum = 0;
    for(int i=1; i <= n; i++){
       if(i %2 != 0){
         continue;
       }
      sum += i;         
    }
   return sum;
  }

  public static void main (String [] args){
     int n = 12;
    System.out.println("Sum of even numbers from 1 to n :" + sumOfEven(n));
  }
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem14 {
  
  public static String conversion(int n ){
     if(n < 1) {
      return "0";
     }
      
     String binary = "";
     while( n >0){
      int rem = n % 2;
      binary = rem + binary;
      n = n/2;
     }
    return binary;
 }

  public static void main (String [] args){
    
     	int decimal = 10;

        String binary = conversion(decimal);

        System.out.println("Binary value of " + decimal + "is :"  + binary);
  }
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem15 {

  public static void usingIf( int p){
       if(p >= 85 && p <= 100){
       System.out.println("Grade A");
       }
       else if(p >= 70){
        System.out.println("Grade B");
       }
       else if(p >= 50){
        System.out.println("Grade C");
       }
       else {
        System.out.println("Fail!");
       }   
  }

  public static void usingSwitch(int p){
    switch(p /10){

      case 10: 
      case 9:
      case 8: 
           if(p >= 85){
             System.out.println("Grade A");
             break;
           }
      case 7: System.out.println("Grade B");
              break;
      case 6 : 
      case 5 : System.out.println("Grade C");
              break;
      default: 
         System.out.println("Fail");
    }
  }

  public static void main (String [] args){
         int percent = 96;
      System.out.println("Using if statement, The Grade is : " );
     usingIf(percent);
      System.out.println("Using switch case : ");
      usingSwitch(percent);
  }
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem16 {

  public static void main (String [] args){
      String[] words = {"ZOHO", "CORP", "ORAT", "IONS"};
        int i = 0;

        do {
            System.out.println(words[i]);
            i++;
        } while (i < words.length);


  }
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------


class problem17 {

   public static void main (String[] args){
     int rows = 5;
        int i = 0;

        do {
            int space = rows - i;
            while (space-- > 0) System.out.print("  ");

             int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + "   ");
                value = value * (i - j) / (j + 1);
            }

           System.out.println();
            i++;
        } while (i < rows);
    
   }
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem18 {

 public static void main (String [] args){
      int num = 1; 
        int row = 1; 

        while (row <= 5) { 
            int colNum = 1; 
            int colW = 1;  

            while (colNum <= row && num <= 9) { 
                System.out.print(num + " ");
                num++;
                colNum++;
            }

            // Print 'w' characters
            while (colW <= row) { 
                System.out.print("w ");
                colW++;
            }
            
            System.out.println(); 
            row++;
        }
 }
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem19 {


  public static void main (String [] args){
    int row = 1, num = 1;
        while (row <= 5) {
            int count = (row <= 3) ? row : 6 - row;
            int i = 0;
            while (i < count) {
                System.out.print(num++ + " ");
                i++;
            }
            i = 0;
            while (i < count) {
                System.out.print("w ");
                i++;
            }
            System.out.println();
            row++;
        }

  }
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------

// Day 2 -  part2
class problem20 {
 
 public static void main (String [] args){
   
  int []arr  = new int[10];

  int sum = 0;

  Scanner scan = new Scanner(System.in);

  System.out.println("Enter 10 Integers:");
  
  for(int i=0; i < arr.length;i++){
   arr[i] = scan.nextInt();
   if(arr[i] % 2 !=0){
     sum+= i;
   }
  }

  System.out.println("Sum of Oddnumbers: " + sum);

 }
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem21 {

 public static boolean isPrime(int n){
   if (n <= 1) return false;

   for(int i =2; i*i <= n ; i++){
     if(n % i == 0) return false;
   }

  return true;
 }

 public static void main (String [] args){
    Scanner scan = new Scanner (System.in);

    int [] arr = new int [10];

    System.out.println("Enter 10 Integers:");
   for(int i=0; i < 10; i++){
    arr[i] = scan.nextInt();
   }
   
    System.out.println("Prime numbers:");
    
    for(int i=0; i< 10; i++){
     if(isPrime(arr[i])){
      System.out.println(arr[i] + "");
     }
    }
     
 }

}

//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem22 {
 
public static void main(String [] args){
   int [] arr = new int[30];

      arr[0] = 0; 
      arr[1] = 1;

  for(int i = 2; i < 30; i++){
     arr[i] = arr[i-1] + arr[i -2];
  }

  for( int i=0; i < 30; i++){
   System.out.println(arr[i]);
  }
}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem23 {
  
 static void print(int [] arr, int n) {

     int singledigsum =0, doubledigsum =0; 
     
    for(int i=0; i < n; i++){
      if(arr[i] >= 0 && arr[i] <= 9){
        singledigsum += arr[i];
      }
     else if(arr[i] >= 10 && arr[i] <= 99){
        doubledigsum += arr[i];
     }
    }
    System.out.println("Sum of singlr digit number:" + singledigsum);
    System.out.println("Sum of multiple digit number:" + doubledigsum);
 }
 public static void main (String[]args){

  Scanner scan =  new Scanner(System.in);
  
  System.out.println("Enter the size of the Array:");

  int n = scan.nextInt();

  System.out.println("Enter th elements of the array:");
  int [] arr = new int [n];
  for(int i=0; i < n ; i++){
    arr[i] = scan.nextInt();
  }
  
  print(arr, n);
  scan.close();
  
 }

}

//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem24 {
 
 public static void main(String[]args){
   char[] x = {'m','n','o','p'};
   char[] y = {'m','n','o','p'};
   
   boolean isMatch = true;
   
   if(x.length != y.length) {

      isMatch = false;
    }
   else{

     for(int i=0; i < x.length; i++){
      if(x[i] != y[i]){
        isMatch= false;
        break;
      }
    }
   }
  
  if(isMatch){
   System.out.println("The array x and Y are matched");
  }
  else{
   System.out.println("The array x and y are not matched");
  }
  
}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem25 {
 
  public static void main (String [] args){
   
    int [] year = {1982, 1987, 1993, 1996, 1999, 2002, 2003, 2006, 2007, 2009, 2010, 2016};
    
    Scanner scan = new Scanner(System.in);

   System.out.println("Enter the Graduation year:");

   int userip = scan.nextInt();

   int s = 0, e = year.length-1;
    boolean exist = true;

   while(s <= e){
     int mid = (s+e)/2;
     
     if(year[mid] == userip){
      exist = true;
      break;
     }
     else if(year[mid] < userip){
        s = mid + 1;
     }
     else{
       e= mid - 1;
     }
     }
   if(exist){
    System.out.println("Record Exists!");
}
  else{
    System.out.println("Record doesn't exist!!!");
  }
     
   }
  }

//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem26 {

  public static void main (String[]args){
     Scanner scan = new Scanner(System.in);

    int[]arr = new int[10];
    System.out.println("Enter the weights: ");

   for(int i=0; i < 10; i++){
     arr[i] = scan.nextInt();
   }

   for(int i=0; i < arr.length-1; i++){
     int max = i;

    for(int j = i+1; j < arr.length; j++){
      if(arr[j] > arr[max]){
         max = j;
      }
    }
    
    int temp = arr[i];
    arr[i] = arr[max];
    arr[max] = temp; 
   }

   System.out.println("Given weights in DEscending order:");
   
   for(int i = 0; i < arr.length; i++){
     System.out.println(arr[i]+" ");
   }
  }
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem27 {

  public static void main(String[]args){
     
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the ages:");
    int [] arr = new int[10];

    for(int i =0; i < 10; i++){
      arr[i] = scan.nextInt();
    }
    
    int count1 =0, count2 =0, count3 = 0;
     
    for(int i=0; i < arr.length;i++){
      if(arr[i] < 18){
       count1++;
      }
      else if(arr[i] >= 18 && arr[i] <= 60){
       count2++;
      } 
      else{
       count3++;
      }
    }
    System.out.println("People under 18:" + count1);
    System.out.println("People 18-60:" + count2);
    System.out.println("People above 60:" + count3);

  }
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem28 {
 
  public static void main (String[]args){
    
    Scanner scan =  new Scanner(System.in);
    
    int[] rollno = new int[10];
    int[][] marks = new int [10] [3] ;
    int [] total = new int [10];
    double [] avg = new double[10];
   
    for(int i=0; i < 10; i++){
     System.out.println("Enter roll number:" );
     rollno[i] = scan.nextInt();
       System.out.println("Enter the marks:");
      for(int j =0; j < 10; j++){
         System.out.println("Subject:" );
         marks[i][j] = scan.nextInt();
          total[i] = marks[i][j];
      }
     avg[i] = total[i] /3.0;
    }
    System.out.printf("%-10s %-15s %-10s%n", "Roll No", "Total Marks", "Average");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10d %-15d %-10.2f%n", rollno[i], total[i], avg[i]);
        }

        scan.close();
  }
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem29 {

    static void inputMatrix(int[][] A, int m, int n, Scanner scanner) {
        System.out.println("Enter elements of the matrix (" + m + " x " + n + "):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
    }

    static void displayMatrix(int[][] A, int m, int n) {
        System.out.println("Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
            System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void totalSum(int[][] A, int m, int n) {
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += A[i][j];
            }
        }
        System.out.println("Sum of all elements: " + sum);
    }

    static void rowWiseSum(int[][] A, int m, int n) {
        System.out.println("Row-wise sum:");
        for (int i = 0; i < m; i++) {
            int rowSum = 0;
           for (int j = 0; j < n; j++) {
                rowSum += A[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }
    }
    static void columnWiseSum(int[][] A, int m, int n) {
        System.out.println("Column-wise sum:");
        for (int j = 0; j < n; j++) {
             int colSum = 0;
            for (int i = 0; i < m; i++) {
                 colSum += A[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + colSum);
        }
    }

    // Method to display transpose (n × m)
    static void transposeMatrix(int[][] A, int m, int n) {
        System.out.println("Transpose (" + n + " x " + m + "):");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter number of columns (n): ");
        int n = scanner.nextInt();

        int[][] A = new int[m][n];
        int choice;

        do {
            System.out.println("MENU:");
            System.out.println("1. Input Matrix");
            System.out.println("2. Display Matrix");
            System.out.println("3. Sum of All Elements");
            System.out.println("4. Row-wise Sum");
            System.out.println("5. Column-wise Sum");
            System.out.println("6. Transpose Matrix");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: inputMatrix(A, m, n, scanner); break;
                case 2: displayMatrix(A, m, n); break;
                case 3: totalSum(A, m, n); break;
                case 4: rowWiseSum(A, m, n); break;
                case 5: columnWiseSum(A, m, n); break;
                case 6: transposeMatrix(A, m, n); break;
                case 7: System.out.println("Exiting program."); break;
                default: System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 7);

        scanner.close();
    }
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem30 {  // Part-3

  public static String sumBinary (String a, String b){
     int i = a.length()-1;
     int j = b.length()-1;
      int carry = 0;
      int max = Math.max(a.length(), b.length())+1;
      char[] res = new char[max];
      int k = max - 1;
      while( i >= 0 || j >= 0|| carry >0){

       int A = (i >= 0) ? a.charAt(i--) - '0': 0;
       int B = (j >= 0) ? b.charAt(j--) - '0': 0;
       int sum = A + B + carry;
       res[k--] = (char)((sum%2 )+'0');
       carry = sum /2;
      }
  return new String (res, k+1, max-k-1);
  }

  public static void main (String [] args){
     System.out.println(sumBinary("11", "1"));
     System.out.println(sumBinary("1010", "1011"));
  }
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem31{

  public static String columnTitle(int n ){
    String s = "";
   while(n >0){
     n--;
     char ch = (char) ('A' + (n %26));
     s = ch + s;
     n /= 26;
   }
  return s;
  }
  public static void main(String [] args){
    System.out.println(columnTitle(18));
    System.out.println(columnTitle(25));
   System.out.println(columnTitle(28)); 
    System.out.println(columnTitle(306));
  }
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem32 {
 public static String revVowels(String s){
   char[] ch =  s.toCharArray();
   int st =0, e = s.length()-1;
   while( st < e){
    if(!vowel(ch[st])){
      st++;
    }
   else if(!vowel(ch[e])){
      e--;
    }
   else{
     char temp = ch[st];
     ch[st] = ch[e];
     ch[e] = temp;
     st++;
     e--;
    }
   }
   return String.valueOf(ch);
 }
  public static boolean vowel(char ch){
     return "aeiouAEIOU".indexOf(ch) != -1;
  }
 public static void main (String[]args){
   Scanner scan = new Scanner (System.in);
   String s = scan.next();
   System.out.println(revVowels(s));
 }
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem33 {
  
  public static String moreLetter(String s, String t){
     int sumS = 0;
        int sumT = 0;

        for (int i = 0; i < s.length(); i++) {
            sumS += s.charAt(i);
        }

        for (int i = 0; i < t.length(); i++) {
            sumT += t.charAt(i);
        }

        char extraChar = (char)(sumT - sumS);
        return String.valueOf(extraChar);
 
  }
  public static void main (String[]args){
    Scanner scan = new Scanner (System.in);
    String s = scan.next();
    String t = scan.next();
     System.out.println(moreLetter(s,t));
  }
}


//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem34 {

  public static String subSequence( String s, String t){
    int i=0, j=0;
    while(i < s.length() && j < t.length()){

       if(s.charAt(i)== t.charAt(j)){
         i++;
       }
       j++;
    }
return (i == s.length()) ? "true" : "false";
  } 

  public static void main (String[]args){
    Scanner scan = new Scanner (System.in);
    String s = scan.next();
    String t = scan.next();
    System.out.println(subSequence(s,t));
  }
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem35 {

 public static String addString(String n, String m){
    int i = n.length() - 1;
    int j = m.length() -1;
    int carry = 0;
    StringBuilder res = new StringBuilder();
    
     while(i>=0 || j >=0 || carry >0){
        int dig1 = (i>=0) ? n.charAt(i--) - '0' : 0;
        int dig2 = (j>=0) ? m.charAt(j--) - '0' : 0;

     int sum = dig1 + dig2 + carry;
      res.append(sum%10);
      carry = sum/10;
     }
   return res.reverse().toString();
 }
 
 public static void main (String [] args){
   System.out.println(addString("11","123"));
   System.out.println(addString("456","1"));
 }

}

//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem36 {

 public static int countWords(String s){
   int count = 0;
   boolean noSpace = false;

   for(int i=0; i < s.length(); i++){
     if(s.charAt(i) != ' '){
        if(!noSpace){
         count++;
         noSpace = true;
        }
     }else{
       noSpace = false;
      }
   }
  return count;
 }
 
 public static void main (String[]args){
   System.out.println(countWords("Hello, my name is John"));
   System.out.println(countWords("Hello"));
   System.out.println(countWords("Word with space"));
 }
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------

class problem37 {
 
 public static boolean checkCapital(String word){
   if (word.equals(word.toUpperCase())) return true;       
        if (word.equals(word.toLowerCase())) return true;       
        if (Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase())) {
            return true;                                      
        }
        return false;
 }
  
 public static void main (String [] args){
   System.out.println(checkCapital("USA"));
   System.out.println(checkCapital("FlaG"));
   System.out.println(checkCapital("leetcode"));
 }
}