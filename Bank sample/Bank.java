import java.util.Scanner;

public class Bank {
	

	public void showMenu() {
		
		int writedNumber;
		System.out.println("1-Manange CLIENTS");
		System.out.println("2-Manange ACCOUNTS");
		System.out.println("3-EXIT");
		Scanner keyboard = new Scanner(System.in);
		writedNumber  = Integer.parseInt(keyboard.nextLine());
		Client objClient = new Client();
		Account objAccount = new Account();
		
		
		if(writedNumber == 1) {
			objClient.Options();
			
		}else if(writedNumber == 2) {
			objAccount.Options();
			
		}else if(writedNumber == 3){
			System.exit(0);
		}
		
		keyboard.close();
	}

}
