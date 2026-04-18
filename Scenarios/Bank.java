class Bankaccount {
    int accountnumber;
    String name;
    double balance;
    Bankaccount (int account, String name, double balance) {
        this.accountnumber = account;
        this.name= name;
        this.balance= balance;
    }
    void deposit(double ammount) {
        balance= balance + ammount;
    }
    void withdraw (double ammount) {
        if (ammount <= balance) {
            balance= balance - ammount;
        } else {
            System.out.println("Balance insuffeciant");
        }
    }
    void DisplayBalance() {
        System.out.println("Account:" + accountnumber);
        System.out.println("Name:" + name);
        System.out.println("Balance:" + balance);
    }
}
public class Bank{
    public static void main(String[] args){
        Bankaccount account1= new Bankaccount(100, "Hari", 50000);
        Bankaccount account2= new Bankaccount(101, "Ram", 20000);
        account1.deposit(10000);
        account1.withdraw(15000);
        account2.deposit(1000);
        account2.withdraw(2000);
        account1.DisplayBalance();
        account2.DisplayBalance();
    }
}