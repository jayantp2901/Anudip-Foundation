
import java.util.Scanner;

public class BankingOperations {
    
    static Scanner sc = new Scanner(System.in);
    static int accountBalance = 0;
    
        public static void main(String[] args) {
            bankingOp(); 
        }
    
        public static void bankingOp() {
            System.out.println("\nWelcome! What do you want to do?");
            System.out.println("1.Create New account \n2.Deposit \n3.Withdraw \n4.Check Balance \n5.Loan \n6.Fixed Deposit \n7.Passbook Print \n8.Exit");
            System.out.print("Enter your choice: ");
            
            int action = sc.nextInt();
            switch (action) {
                case 1:
                    createAcc();
                    bankingOp(); 
                    break;
                case 2: 
                    deposit();
                    bankingOp();
                    break;
                case 3:
                    withdraw();
                    bankingOp();
                    break;
                case 4: 
                    System.out.println("Available Balance is : " + accountBalance);
                    bankingOp();
                    break;
                case 5:
                    loan();
                    bankingOp();
                    break;
                case 6: 
                    fd();
                    bankingOp();
                    break;
                case 7:
                    System.out.println("Exiting... Thank you for using our banking system!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    bankingOp();
            }
        }
    
        public static void createAcc() {
            System.out.println("Fill the following details");
    
            sc.nextLine(); // Clear buffer
    
            System.out.println("Enter Full Name");
            String name = sc.nextLine();
    
            System.out.println("Enter Aadhar Number");
            long adhar = sc.nextLong();
            sc.nextLine();
    
            System.out.println("Enter Mobile Number");
            long mono = sc.nextLong();
            sc.nextLine();
    
            System.out.println("Account Created Succefully!");
        }
    
        public static void deposit() {
            System.out.println("How much amount do you want to deposit?");
            int amount = sc.nextInt();
            System.out.println("₹ " + amount + " has been successfully deposited.");
        }
    
        public static void withdraw() {
            System.out.println("How much amount do you want to withdraw?");
            int amount = sc.nextInt();
    
            if(accountBalance < amount ){
            System.out.println("Oops! Insufficient Balance.");
        }else{
            accountBalance -= amount;
            System.out.println("₹ " + amount + " has been successfully withdrawn.");
        }
    }

    public static void loan() {
        System.out.println("Enter Principal Amount ");
        int principal = sc.nextInt();
        System.out.println("Enter Rate of Interest");
        int interestRate = sc.nextInt();
        System.out.println("Enter period (in years)");
        int period = sc.nextInt();

        int SI = (principal * interestRate * period) / 100;
        System.out.println("Your Simple Interest on ₹" + principal + " will be ₹" + SI);
    }

    public static void fd() {
        System.out.println("Enter the amount you wish to invest in Fixed Deposit.");
        int fd = sc.nextInt();
        System.out.println("Enter the duration of Fixed Deposit (in years)");
        int period = sc.nextInt();
        System.out.println("₹" + fd + " added to your Fixed Deposit Account for " + period + " years.");
    }

    public static void passbook() {
        System.out.println("Printing your passbook...");
    }
}