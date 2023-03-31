class Account{
	private String name;
	private static int id;
	private double balance;
	private double withdraw;
	private double deposit;
    
	public Account(String name, double balance, double withdraw, double deposit) {
		this.name = name;
		this.balance = balance;
		this.withdraw = withdraw;
		this.deposit = deposit;
	}

    //return the id
    public int getId(){
        return id;
    }

	 //return the name
	 
	public String getName() {
		return name;
	}
	
	 
	public void setName(String name) {
		this.name = name;
		Account.id++;
	}
	

	 //return the balance
	 
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	 //return the withdraw
	
	public double getWithdraw() {
		return withdraw;
	}
	
	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}
	
	 //return the deposit
	 
	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
}