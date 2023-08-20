package com.driver;

public class CurrentAccount extends BankAccount {
    public String tradeLicenseId; // Private field

    public CurrentAccount(String name, double balance, String tradeLicenseId) throws Exception {
        super(name, balance, 5000);
        this.tradeLicenseId = tradeLicenseId;

        if (balance < 5000) {
            throw new Exception("Insufficient Balance");
        }
    }

    public String getTradeLicenseId() {
        return tradeLicenseId;
    }

    public void validateLicenseId() throws Exception {
        char[] chars = tradeLicenseId.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                rearrangeLicenseId(chars, i);
                return;
            }
        }
        throw new Exception("Valid License can not be generated");
    }

    private void rearrangeLicenseId(char[] chars, int index) throws Exception {
        for (int i = index + 1; i < chars.length; i++) {
            if (chars[i] != chars[index]) {
                char temp = chars[i];
                chars[i] = chars[index + 1];
                chars[index + 1] = temp;
                tradeLicenseId = new String(chars);
                return;
            }
        }
        throw new Exception("Valid License can not be generated");
    }

    // Other methods if needed
}
