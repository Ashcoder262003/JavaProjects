/*****************************************************THE AUTOMATED TELLER MACHINE***************************************************************************************/
package project1;
import java.util.Scanner;
public class ATM {
    private int Amount = 10000;
    private int withdraw;
    Scanner sc = new Scanner(System.in);

    //1st method
    public void cashwithdrawl() {

        if (Amount > 0) {

            System.out.println("enter the amount cash:");
            withdraw = sc.nextInt();
            Amount = Amount - withdraw;
        } else {
            System.out.println("insufficient balance");
        }

    }

    public void deposit() {
        int deposit_money;
        deposit_money = sc.nextInt();
        Amount = Amount + deposit_money;
    }

    public void remaining() {
        System.out.println("the remaining amount is:" + Amount);
    }

    public void last_transation() {
        System.out.println("the last transation was an amount of:" + withdraw);
    }

    //THE MAIN METHOD
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM obj = new ATM();
        int choice;
        while (true) {
            System.out.println("_______________________________________");
            System.out.println("******AUTOMATED_TELLER_MACHINE******\n1:Cash_WITHDRAWL\n2:DEPOSIT\n3:BANK_BALANCE\n4:lastTransation\n5:exit");
            System.out.println("enter the choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    obj.cashwithdrawl();
                    break;
                case 2:
                    obj.deposit();
                    break;
                case 3:
                    obj.remaining();
                    break;
                case 4:
                    obj.last_transation();
                    break;
                case 5:
                    System.exit(0);
            }


        }

    }
//end of the project
}