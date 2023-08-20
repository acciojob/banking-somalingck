package com.driver;

public class Main {
    public static void main(String[] args) {
        try {
            // Test your classes here
            // Create instances, call methods, and handle exceptions
            SavingsAccount savingsAccount = new SavingsAccount("John", 1000, 500, 0.05);
            savingsAccount.deposit(200);
            System.out.println("Balance after deposit: " + savingsAccount.getBalance());
            savingsAccount.withdraw(300);
            System.out.println("Balance after withdrawal: " + savingsAccount.getBalance());
            System.out.println("Simple Interest: " + savingsAccount.getSimpleInterest(2));
            System.out.println("Compound Interest: " + savingsAccount.getCompoundInterest(2, 2));

            StudentAccount studentAccount = new StudentAccount("Alice", 0, "XYZ University");
            studentAccount.deposit(500);
            System.out.println("Balance after deposit: " + studentAccount.getBalance());

            CurrentAccount currentAccount = new CurrentAccount("Company XYZ", 6000, "LICENSE123");
            System.out.println("Trade License ID: " + currentAccount.tradeLicenseId);
            currentAccount.validateLicenseId();
            System.out.println("Validated License ID: " + currentAccount.tradeLicenseId);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
