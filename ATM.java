import java.util.Scanner;
public class ATM extends User{
    void withdraw(int amount){
        
        if(accountBalance >= amount){
            System.out.println("Withdrawing money from Account...");
            accountBalance -= amount;
            System.out.println("Money withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
            System.out.println("Sorry, you cannot withdraw money.");
        }
    }
    void deposit(int amount){
        accountBalance += amount;
        System.out.println("Money deposited successfully.");
    }
    void checkBalance(){
        System.out.println("Your Account Balance is: " + accountBalance);
    }   
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Welcome to the ATM!");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Please select an option: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter the amount to withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    atm.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    int depositAmount = sc.nextInt();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

    }

}
class User{
    int accountBalance = 0;
}