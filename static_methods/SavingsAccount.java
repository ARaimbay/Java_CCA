public class SavingsAccount{

    public String owner;
    public double balanceDollar;
    public double balanceEuro;
  
    public SavingsAccount(String owner, double balanceDollar){
      // Complete the constructor
      this.owner = owner;
      this.balanceDollar = balanceDollar;
      this.balanceEuro = balanceDollar * 0.85;
  
    }
  
    public void addMoney(int balanceDollar){
      // Complete this method
      this.balanceDollar += balanceDollar;
    }
  
  }