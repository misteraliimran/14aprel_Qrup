package bank.accounts;

public class AccountService {

	public void deposit(account acc, double amount) {
		acc.setBalance(acc.getBalance() + amount);
		System.out.println(amount + " əlavə edildi");
	}
}