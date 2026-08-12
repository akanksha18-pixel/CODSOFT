import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double balance = 5000;
		int choice;
		
		System.out.println("===== ATM INTERFACE =====");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit Money");
		System.out.println("3. Withdraw Money");
		System.out.println("4. Exit");
		
		System.out.print("Enter your choice: ");
		choice = sc.nextInt();
		
		switch (choice) {
			case 1:
			         System.out.println("Balance = " + balance);
			         break;
			         
			 case 2:
			          System.out.print("Enter deposit amount: ");
			          double deposite = sc.nextDouble();
			          balance += deposite;
			          System.out.println("New Balance = " + balance);
			          break;
			          
			   case 3:
			          System.out.print("Enter withdrawal amount: ");
			          double withdraw = sc.nextDouble();
			          if (withdraw <= balance) {
			          	balance -= withdraw;
			          	System.out.println("New Balance = " + balance);
			          } else {
			          	System.out.println("Insufficient Balance");
			          }
			          break;
			     
			     case 4:
			            System.out.println("Thank  you for using ATM!");
			            break;
			            
			      default:
			            System.out.println("Invalid Choice");
		}
		
		sc.close();
	}
}

			           	
			          
			           
			         