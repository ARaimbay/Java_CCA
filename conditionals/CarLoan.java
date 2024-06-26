public class CarLoan {
    static int carLoan = 10000;
    static int loanLength = 3;
    static int interestRate = 5;
    static int downPayment = 2000;
  
      public static void main(String[] args) {
  
      if (loanLength <= 0 || interestRate <= 0) {
        System.out.println("Error! You must take out a valid car loan.");
      } else if ( downPayment >= carLoan) {
        System.out.println("The car can be paid in full.");
      } else {
        int remainingBalance = carLoan - downPayment;
        int months = loanLength * 12;
        int monthlyBalance = remainingBalance / months;
        int interest = (monthlyBalance * interestRate) / 100;
        int monthlyPayment = monthlyBalance + interest;
        System.out.println(monthlyPayment);
      }
      }
  }