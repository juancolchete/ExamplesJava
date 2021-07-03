import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account {

	private int number;
	private String type;
	private double balance;
	private static List<Account> accounts = new ArrayList<Account>();
	private Client Client;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static int returnAccountId(int number) {
		int accountNumber = number;
		Account account = new Account();
		int i = -1;
		boolean achou = false;
		if (accounts.size() > 0) {
			do {
				i++;
				account = accounts.get(i);
				if (account.number == accountNumber) {
					achou = true;
					return i;
				}
			} while (account.number != accountNumber && i < accounts.size() - 1);
			if (achou == false) {
				System.out.println("Account not found!");
			}
		} else {
			System.out.println("There are no registred accounts");
		}
		return -1;
	}

	public static boolean balanceCheck(double operationValue, Account objAccount) {

		Scanner keyboard = new Scanner(System.in);
		if (operationValue > objAccount.balance) {
			System.out.println("insuficient balance!");
			return false;
		}else {
			return true;
		}
		

	}

	public void showMenu() {
		System.out.println("-------------------------------------");
		System.out.println("1-Create an ACCOUNT for a CLIENT");
		System.out.println("2-Withdraw money from an ACCOUNT to a CLIENT");
		System.out.println("3-Deposit money from an ACCOUNT to a CLIENT");
		System.out.println("4-Verify the ACCOUNT balance of a CLIENT");
		System.out.println("5-Transfer money from an CLIENT ACCOUNT to another CLIENT");
		System.out.println("6-Back to MAIN MENU");
		System.out.println("-------------------------------------");
	}

	public void Options() {

		showMenu();

		Scanner keyboard = new Scanner(System.in);
		int writedNumber = Integer.parseInt(keyboard.nextLine());
		Account objAccount = new Account();
		if (writedNumber == 1) {
			// Cadastro
			System.out.println("Write the client account number: ");
			int writedAccountNumber = Integer.parseInt(keyboard.nextLine());
			System.out.println("Write the type da account: ");
			String typeWrited = keyboard.nextLine();
			System.out.println("Write the Client CPF: ");
			String writedCPF = keyboard.nextLine();
			Client objClient = new Client();
			int idClient = Client.returnIdClient(writedCPF);
			if (idClient >= 0) {
				objClient = Client.clients.get(idClient);
				objAccount.number = writedAccountNumber;
				objAccount.type = typeWrited;
				objAccount.Client = objClient;
				accounts.add(objAccount);
				System.out.println("account added in name of " + objAccount.Client.getClientName() + "!");
			}else {
				Options();
			}
		} else if (writedNumber == 2) {
			// Sacar
			System.out.println("Write the number of client account:");
			writedNumber = Integer.parseInt(keyboard.nextLine());
			int AccountId = returnAccountId(writedNumber);
			if (AccountId >= 0) {
				objAccount = accounts.get(AccountId);
				System.out.println("Write the withdraw value: ");
				double withdrawValue = Double.parseDouble(keyboard.nextLine());
				if(balanceCheck(withdrawValue, objAccount)) {
					System.out.println("Account in name of: " + objAccount.Client.getClientName());
					System.out.println("previus balance: " + objAccount.balance);
					objAccount.balance -= withdrawValue;
					System.out.println("balance now: " + objAccount.balance);
				}else {
					Options();
				}
				
			} else {
				Options();
			}

		} else if (writedNumber == 3) {
			// Deposit
			System.out.println("Write the number of client account:");
			writedNumber = Integer.parseInt(keyboard.nextLine());
			int AccountId = returnAccountId(writedNumber);
			if (AccountId >= 0) {
				objAccount = accounts.get(AccountId);
				System.out.println("Write the deposit value: ");
				double depositValue = Double.parseDouble(keyboard.nextLine());
				System.out.println("Account in name of: " + objAccount.Client.getClientName());
				System.out.println("previus balance: " + objAccount.balance);
				objAccount.balance += depositValue;
				System.out.println("balance now: " + objAccount.balance);
			} else {
				Options();
			}

		} else if (writedNumber == 4) {
			// balance
			System.out.println("Write the client account number do Client:");
			writedNumber = Integer.parseInt(keyboard.nextLine());
			int AccountId = returnAccountId(writedNumber);
			if (AccountId >= 0) {
				objAccount = accounts.get(AccountId);
				System.out.println("Account in name of: " + objAccount.Client.getClientName());
				System.out.println("client account number: " + objAccount.number);
				System.out.println("type da account: " + objAccount.type);
				System.out.println("balance: " + objAccount.balance);
			} else {
				Options();
			}

		} else if (writedNumber == 5) {
			// To an account to another
			System.out.println("Write the client account number FROM client:");
			writedNumber = Integer.parseInt(keyboard.nextLine());
			int AccountId = returnAccountId(writedNumber);
			System.out.println("Write the client account number TO do client:");
			writedNumber = Integer.parseInt(keyboard.nextLine());
			int AccountIdDestino = returnAccountId(writedNumber);
			Account objAccountDestino = new Account();
			if (AccountId >= 0 && AccountIdDestino >= 0) {
				objAccount = accounts.get(AccountId);
				System.out.println("Write the transfer value: ");
				double transferValue = Double.parseDouble(keyboard.nextLine());
				if(balanceCheck(transferValue, objAccount)) {
					objAccountDestino = accounts.get(AccountId);
					objAccountDestino = accounts.get(AccountIdDestino);
					objAccount.balance -= transferValue;
					objAccountDestino.balance += transferValue;
					System.out.println("balance FROM account is : " + objAccount.balance + " in name of "
							+ objAccount.Client.getClientName());
					System.out.println("balance of account TO is: " + objAccountDestino.balance + " in name of "
							+ objAccountDestino.Client.getClientName());
				}else {
					Options();
				}
			}else {
				Options();
			}

		} else {
			Bank objBank = new Bank();
			objBank.showMenu();
		}

		Options();
		keyboard.close();

	}

}
