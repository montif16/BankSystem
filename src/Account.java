public class Account {
    private String name;
    private int balance;
    public Account(String name){
        this.name = name;
    }
    public void setBalance(int amount){
        this.balance = amount;
    }
    public String toString(){
        return "name: "+this.name+"\nBalance: "+this.getBalance();

    }
    public String getName(){
        return this.name;
    }

    public int getBalance() {
        return balance;
    }
    //todo: follow the classdiagram as you implement this very simple class. Try to guess what the methods should do
}
