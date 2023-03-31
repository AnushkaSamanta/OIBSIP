import java.util.ArrayList;
import java.util.Scanner;

class ATM {

	static void showInfoAll(Account ac){
        System.out.println();
        System.out.println();
        System.out.println(ac.getId() + "\t" + ac.getName() + "\t" + ac.getBalance() + "\t\t" + ac.getWithdraw() + "\t\t" + ac.getDeposit());
    }
	public static void main(String[] args) {
		ArrayList<Account> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Account ac;
		String name;
		int id;
		while (true) {
			System.out.println("\t\t--- Welcome to Anushka's International ATM ---");
			System.out.println("Choose 1. for Add an Account");
			System.out.println("Choose 2. for Deposit");
			System.out.println("Choose 3. for Withdraw");
			System.out.println("Choose 4. for All account Balance");
			System.out.println("Choose 5. for Check Balance");
			System.out.println("Choose 6. for Remove an Account");
			System.out.println("Choose 7. for Exit ");
			int choice = sc.nextInt();

			switch (choice) {
				case 1:
					System.out.println("Enter Account Name: ");
					name = sc.next();
					al.add(new Account(name, 0, 0, 0));
					System.out.println("Account added Successfully");
				break;

				case 2:
					System.out.println("Choose Id:");
					id = sc.nextInt();
					if (id > 0 && id <= al.size()) {
						System.out.println("Enter money to be deposited:");
						ac = al.get(id -1);
						ac.setDeposit(sc.nextDouble());
						ac.setBalance(ac.getBalance() + ac.getDeposit());
						System.out.println("Successfully deposited, Now Current Balance: " + ac.getBalance());
					} else {
						System.out.println("Id not found! Choose a Valid Id");
					}
				break;

				case 3:
					System.out.println("Choose Id:");
					id = sc.nextInt();
					if (id > 0 && id <= al.size()) {
						ac = al.get(id - 1);
						System.out.println("Enter money to be withdrawn:");
						if (ac.getBalance() >= ac.getWithdraw()) {
							ac.setBalance(ac.getBalance() - ac.getWithdraw());
							System.out.println("Withdraw! Successful");
						} else
							System.out.println("Insufficient Balance");
					} else {
						System.out.println("Id not found! Choose a Valid Id");
					}
				break;

				case 4:
					System.out.println("Available Customers");
					System.out.println("Id\tName\tBalance\t\tRecent Withdraw\t\tRecent Deposit");
					for (int i=0; i<al.size(); i++)
						showInfoAll(al.get(i));
				break;
				
				case 5:
					System.out.println("Choose Id:");
					id = sc.nextInt();
					if (id > 0 && id <= al.size())
						showInfoAll(al.get(id - 1));
					else
						System.out.println("Id not found! Choose a Valid Id");
				break;

				case 6:
					System.out.println("Choose Id:");
					id = sc.nextInt();
					if (id > 0 && id <= al.size())
						al.remove(al.get(id - 1));
					else
						System.out.println("Id not found! Choose a Valid Id");
				break;
				case 7:
					System.exit(0);
				break;

				default:
					System.out.println("Invalid Choice");
			}
		}
				
	}
}