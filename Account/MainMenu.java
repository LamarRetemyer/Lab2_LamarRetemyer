package Account;
import java.util.*;


public class MainMenu{
    private static Account[] accounts;
    public  static void main(String[] args) {
        initializeAccounts();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("\nEnter account id: ");
            int id = scanner.nextInt();

            if (isValidID(id)){
                displayMainMenu();
                int userInput = scanner.nextInt();

                switch (userInput){
                    case 1:
                       System.out.println("Balance: $" + accounts[id].getBalance());
                       break;
                    case 2:
                        withdrawMoney(id, scanner);
                        System.out.println("Balance: $" + accounts[id].getBalance());
                        break;
                    case 3:
                        depositMoney(id, scanner);
                        System.out.println("Balance: $" + accounts[id].getBalance());
                        break;
                    case 4:
                        System.out.println("Account " + id + "logged out...");
                }
            }
            else{
                System.out.println("Invalid account id. Please try again");
            }
        }
    }    

    private static void initializeAccounts(){
        accounts = new Account[10];
        int i = 0;

        while (i < 10){
            accounts[i] = new Account();
            accounts[i].setID(i);
            accounts[i].setBalance(100);
            i++;
        }
    }

    private static boolean isValidID(int id){
        if (id > 0  && id < 10){
            return true;
        }
        return false;
    }

    private static void displayMainMenu() {
        System.out.println("\nMain Menu");
        System.out.println("1. View Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        System.out.print("Enter User Input: ");
    }
   
    private static void withdrawMoney(int id, Scanner scanner) {
        System.out.print("Enter amount to withdraw: $");
        double amount = scanner.nextDouble();
        accounts[id].withdraw(amount);
    }

    private static void depositMoney(int id, Scanner scanner) {
        System.out.print("Enter amount to deposit: $");
        double amount = scanner.nextDouble();
        accounts[id].deposit(amount);
    }
}

   

