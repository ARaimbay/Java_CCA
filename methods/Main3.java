public class Main3 {
    public static void main(String[] args) {
      Store lemonadeStand = new Store("Lemonade", 3.75);
      double lemonadePrice = lemonadeStand.getPriceWithTax();
      System.out.println(lemonadePrice);
  
    }
  }