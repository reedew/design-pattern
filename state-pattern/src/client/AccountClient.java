package client;

import ctxt.Account;

/**
 * 客户端测试
 */
public class AccountClient {
    public static void main(String[] args) {
        Account account = new Account("石中玉", 0.0);
        account.deposit(1000);
        account.withdraw(2000);
        account.deposit(3000);
        account.withdraw(4000);
        account.withdraw(1000);
        account.computeInterest();
    }
}
