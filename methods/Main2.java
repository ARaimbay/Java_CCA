public class Main2 {
    public static void main(String[] args) {
      Store lemonadeStand = new Store("Lemonade", 3.75);
      lemonadeStand.increasePrice(1.5);
      System.out.println(lemonadeStand.price);
    }
  }
