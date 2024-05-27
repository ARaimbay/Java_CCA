/*
The calculator will be able to:

Add two integers
Subtract two integers
Multiply two integers
Divide two integers
Apply the modulo operator on two integers

*/
public class Calculator {
    public Calculator() {
  
    }
  
    public int add (int a, int b) {
      int result = a + b;
      return result;
  
    }
  
    public int substract(int a, int b) {
      int result = a - b;
      return result;
    }
  
     public int multiply(int a, int b) {
      int result = a * b;
      return result;
     }
  
      public int divide(int a, int b) {
      int result = a / b;
      return result;
      }
  
       public int modulo(int a, int b) {
       int result = a % b;
       return result;
      }
  
      public static void main (String[] args) {
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5, 7));
        System.out.println(myCalculator.substract(45, 11));
       
      }
  
  }
