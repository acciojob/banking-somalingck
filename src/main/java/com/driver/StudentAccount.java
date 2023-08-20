package com.driver;

public class StudentAccount extends BankAccount {
    private final String institutionName;

    public StudentAccount(String name, double balance, String institutionName) {
        super(name, balance, 0);
        this.institutionName = institutionName;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    // You can use 'institutionName' in other methods as well
}
