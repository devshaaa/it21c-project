
package oopbankaccount;


public class BankAccount {
    
    private String name;
    private int age;
    private long accountNumber;
    private double balance;
    
public BankAccount(String name, int age, long accountNumber, double balance){
    
this.name=name;
this.age=age;
this.accountNumber=accountNumber;
this.balance=balance;


}

    public void getName(String name){
        this.name=name;}
    public int getAge(){
        return age;}
    public void deposit(double amount){
        balance += amount;}
    public double getBalance(){
        return balance;}
    public String getSummary(){
        return "\n Name: "+ name +"\n Age: "+ age+ "\n Account Number: "+ accountNumber+ "\n Balance: "+ balance;}
}

