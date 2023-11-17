
package oopbankaccount;

public class Main {

    public static void main(String[] args) {
       BankAccount account= new BankAccount("Shaa", 23, 697076279, 160.0);
        
        account.deposit(200.0);
       account.deposit(310.0);

        
        System.out.println(account.getSummary());
    }
}
