import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
	
	private String clientName;
	private String CPF;
	private String age;
	
	public static List<Client> clients = new ArrayList<Client>();
	
	private void showMenu() {
		System.out.println("-------------------------------------");
		System.out.println("1-Add CLIENT");
		System.out.println("2-Search CLIENT");
		System.out.println("3-Remove CLIENT");
		System.out.println("4-Update CLIENT");
		System.out.println("5-Back to MAIN MENU");
		System.out.println("-------------------------------------");
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	public static int returnClientId(String cpf) {
		String cpfSearch = cpf;
		Client client = new Client();
		int i = -1;
		boolean found = false;
		if (clients.size() > 0) {
			do {
				i++;
				client = clients.get(i);
				if (client.CPF.equals(cpfSearch)) {
					found = true;
					return i;
				}
			} while (client.CPF != cpfSearch && i < clients.size() - 1);
			if (found == false) {
				System.out.println("Client not found!");
			}
		} else {
			System.out.println("There are no registred client");
		}
		return -1;
	}
	
	public void Options() {
		int writedNumber;
		
		showMenu();
		
		Scanner keyboard = new Scanner(System.in);
		writedNumber  = Integer.parseInt(keyboard.nextLine());
		Client objClient = new Client();
		if(writedNumber == 1) {
			//Add
			System.out.println("Write the client name: ");
			String writedName = keyboard.nextLine();
			System.out.println("Write the client CPF: ");
			String CPF = keyboard.nextLine();
			System.out.println("Write the client age: ");
			String age = keyboard.nextLine();
			
			objClient.clientName = writedName;
			objClient.CPF = CPF;
			objClient.age = age;
			clients.add(objClient);
			System.out.println("Client added!");
			
		}else if(writedNumber == 2) {
			// Search
			System.out.println("Write the client CPF: ");
			String searchName = keyboard.nextLine();
			Client client;
			int i = -1;
			boolean found = false;
			if(clients.size() > 0) {
				do{
					i++;
					client = clients.get(i);
					if(client.CPF.equals(searchName)) {
						System.out.println("Client name: "+client.clientName);
						System.out.println("Client CPF: "+client.CPF);
						System.out.println("Client age: "+client.age);
						found = true;
					}
				}while(client.clientName != searchName && i < clients.size()-1);
				if(found != true) {
					System.out.println("Client not found!!");
				}
			}else {
				System.out.println("There are no registred client");
			}
		}else if(writedNumber == 3){
			//Remove
			System.out.println("Write the client CPF: ");
			String searchName = keyboard.nextLine();
			String client;
			boolean found = false;
			int i = -1;
			if(clients.size() > 0) {
				do{
					i++;
					client = clients.get(i).CPF;
					if(client.equals(searchName)) {
						clients.remove(i);
						System.out.println("Client removed!");
						found = true;
					}
				}while(client != searchName && i < clients.size()-1);
				if(found != true) {
					System.out.println("Client not found!");
				}
			}
			
		else {
		System.out.println("There are no registred client!");
		
			}
		
		}else if(writedNumber == 4){
			//Update
			System.out.println("Write the client CPF: ");
			String searchName = keyboard.nextLine();
			Client client;
			boolean found = false;
			int i = -1;
			if(clients.size() > 0) {
				do{
					i++;
					client = clients.get(i);
					if(client.CPF.equals(searchName)) {
						System.out.println("Write the name: ");
						client.clientName = keyboard.nextLine();
						System.out.println("Write the CPF: ");
						client.CPF = keyboard.nextLine();
						System.out.println("Write the age: ");
						client.age = keyboard.nextLine();
						System.out.println("client updated!");
						found = true;
					}
				}while(client.clientName != searchName && i < clients.size()-1);
				if(found != true) {
					System.out.println("Client not found!");
				}
			}else {
				System.out.println("There are no registred client");
			}
		}else{
			Bank objBank = new Bank();
			objBank.showMenu();
		}
		Options();
		keyboard.close();
	}

}
