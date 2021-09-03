/*public class SavingsAccount {

  int balance;

  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }

  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);

    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);

    //Withdrawing:
    int afterWithdraw = savings.balance - 300;
    savings.balance = afterWithdraw;
    System.out.println("You just withdrew "+300);

    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);

    //Deposit:
    int afterDeposit = savings.balance + 600;
    savings.balance = afterDeposit;
    System.out.println("You just deposited "+600);

    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);

    //Deposit:
    int afterDeposit2 = savings.balance + 600;
    savings.balance = afterDeposit2;
    System.out.println("You just deposited "+600);

    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);

  }
}
*/
package com.bnta;

public class reversePractice {
    public static void main(String[] args) {
        String[] group5 = {"Busayo ", "Bianca ", "Cindy ", "Jessica "};
        for (int i = 0; i < group5.length / 2; i++) {
            String reverseGroup5 = group5[i];
            group5[i] = group5[group5.length - i - 1];
            group5[group5.length - i - 1] = reverseGroup5;
        }
        for (String s : group5) System.out.println(s);
        }
    }