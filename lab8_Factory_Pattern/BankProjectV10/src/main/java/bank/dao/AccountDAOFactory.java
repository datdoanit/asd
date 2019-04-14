package bank.dao;

public class AccountDAOFactory {

    private static IAccountDAO accountDAO;

    static {
        accountDAO = new AccountDAO();
    }

    public static IAccountDAO getAccountDAO() {
        return accountDAO;
    }
}
