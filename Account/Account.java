package Account;

public class Account {
    private int id = 0;
    private double balance;

    protected int getID(){
        return id;
    }
    protected void setID(int identity ){
        id = identity;
    }

    protected double getBalance(){
        return balance;
    }
    protected void setBalance(int bal$){
        balance = bal$;
    }

    protected void deposit(double deposit){
        balance = balance + deposit;
    }

    protected void withdraw(double withdraw){
        balance = balance - withdraw;
    }
}
