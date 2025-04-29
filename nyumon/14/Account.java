public class Account {
    String accountNumber;
    int balance;

    public String toString() {
        return "\\" + this.balance + "(口座番号：" + this.accountNumber + ")";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Account a) {
            if (this.accountNumber.equals(a.accountNumber)) {
                return true;
            }
        }
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
}