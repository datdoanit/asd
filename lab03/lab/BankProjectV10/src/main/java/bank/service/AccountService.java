package bank.service;

import java.util.Collection;

import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.domain.*;


public class AccountService implements IAccountService {
	private IAccountDAO accountDAO;

	public AccountService(){
		accountDAO=new AccountDAO();
	}

	public Account createAccount(long accountNumber, AccountType accountType, String customerName) {
		Account account = new Account(accountNumber);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);
		if (accountType == AccountType.CHECKING) {
			account.setAccountType(AccountType.CHECKING);
			account.setInterestStrategy(new CheckingInterestStrategy());
		} else {
			account.setAccountType(AccountType.SAVING);
			account.setInterestStrategy(new SavingInterestStrategy());
		}
		accountDAO.saveAccount(account);
		return account;
	}

	public void deposit(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.deposit(amount);
		accountDAO.updateAccount(account);
	}

	public Account getAccount(long accountNumber) {
		Account account = accountDAO.loadAccount(accountNumber);
		return account;
	}

	public Collection<Account> getAllAccounts() {
		return accountDAO.getAccounts();
	}

	public void withdraw(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.withdraw(amount);
		accountDAO.updateAccount(account);
	}

	public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);
	}

	@Override
	public void addInterest(long accountNumber) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.addInterest();
	}
}
