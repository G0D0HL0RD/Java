import java.util.*;
abstract class BankAccount{
	String name;
	String dob;
	String address;
	String accNo;
	int balance;
}
public class SavingsAccount extends BankAccount {
	SavingsAccount() {
		name = "";
		dob = "";
		address = "";
		accNo = "";
		balance = 0;
	}

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		name = sc.nextLine();
		System.out.print("Enter your date of birth: ");
		dob = sc.nextLine();
		System.out.print("Enter your address: ");
		address = sc.next();
		System.out.print("Enter your account number: ");
		accNo = sc.next();
		sc.close();
	}


	void display() {
		System.out.println("Name: " + name);
		System.out.println("Date of birth: " + dob);
		System.out.println("Address: " + address);
		System.out.println("Account number: " + accNo);
		System.out.println("Account balance: " + balance);
	}

	void printBalance() {
		System.out.println("New balance: " + balance);
	}

	void withdraw(int amt) {
		if (balance >= amt) {
			balance -= amt;
			System.out.println("Transacntion successful");
			printBalance();
		} else {
			System.out.println("Account does not have enough amount.");
		}
	}

	void deposit(int amt) {
		balance += amt;
		System.out.println("Amount deposited successfully");
		printBalance();
	}

	public static void main(String[] args) {
		SavingsAccount[] obj = new SavingsAccount[10];
		Scanner sc = new Scanner(System.in);
		String s;
		int amt, i;
		while (true) {
			System.out.println(
					"To create a new account: 1\nTo withdraw: 2\nTo deposit: 3\nTo delete account: 4\nto exit.: 5");
			int choice = sc.nextInt();
			switch (choice) {
				case 1:
					for (i = 0; i < 10; i++) {
						if (obj[i] == null) {
							obj[i] = new SavingsAccount();
							obj[i].input();
							System.out.println("\nCreation of account successful");
							obj[i].display();
							break;
						}
					}
					if (i == 10)
						System.out.println("Limit of creation of accounts is reached");
					break;
				case 2:
					System.out.print("Enter the account number from which you want to withdraw: ");
					s = sc.next();
					for (i = 0; i < 10; i++) {
						if (obj[i] != null && obj[i].accNo.equals(s)) {
							System.out.print("Enter the amount to be withdrawn: ");
							amt = sc.nextInt();
							obj[i].withdraw(amt);
							break;
						}
					}
					if (i == 10)
						System.out.println("Such acoount is not there in database");
					break;
				case 3:
					System.out.print("Enter the account number to which you want to deposit: ");
					s = sc.next();
					for (i = 0; i < 10; i++) {
						if (obj[i] != null && obj[i].accNo.equals(s)) {
							System.out.print("Enter the amount to be deposited: ");
							amt = sc.nextInt();
							obj[i].deposit(amt);
							break;
						}
					}
					if (i == 10)
						System.out.println("Such acoount is not there in database");
					break;
				case 4:
					System.out.print("Enter the account number that you want to delete: ");
					s = sc.next();
					for (i = 0; i < 10; i++) {
						if (obj[i] != null && obj[i].accNo.equals(s)) {
							obj[i] = null;
							System.out.println("Account deleted successfully");
							break;
						}
					}
					if (i == 10)
						System.out.println("Such acoount is not there in database");
					break;
				case 5:
					sc.close();
					System.exit(0);
				default:
					System.out.println("Enter a valid choice");
			}
		}
	}
}