public class Account {
  //todo: follow the classdiagram as you implement this very simple class. Try to guess what the methods should do

    private String name;
    private int balance;
    public Account(String name){
        this.name = name;
   }
    public void setBalance(int newBalance){
        this.balance= newBalance;
    }
    public int getBalance(){
        return this.balance;
    }

    public String toString(){


        return "";


    }

   public String getName(){
        return this.name;

   }
}
