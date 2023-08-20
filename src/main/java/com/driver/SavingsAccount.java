package com.driver;

public class SavingsAccount extends BankAccount {
    private final double rate;
    private final double maxWithdrawalLimit;

    public SavingsAccount(String name, double balance, double maxWithdrawalLimit, double rate) {
        super(name, balance, 0);
        this.rate = rate;
        this.maxWithdrawalLimit = maxWithdrawalLimit;
    }

    @Override
    public void withdraw(double amount) throws Exception {
        if (amount > maxWithdrawalLimit) {
            throw new Exception("Maximum Withdraw Limit Exceeded");
        }
        super.withdraw(amount);
    }

    public double getSimpleInterest(int years) {
        return getBalance() * rate * years;
    }

    public double getCompoundInterest(int times, int years) {
        double compoundInterestRate = Math.pow(1 + rate / times, times * years);
        return getBalance() * (compoundInterestRate - 1);
    }
}
