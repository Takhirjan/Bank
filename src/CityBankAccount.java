public class CityBankAccount implements BankAccount {
    String name;
    String surname;
    int balance;
    String accountNumber;
    String pinCode;

    public CityBankAccount(String name, String surname, String accountNumber, String pinCode, int balance) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getPinCode() {
        return pinCode;
    }

    @Override
    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public int totalBalance() {
        return balance;
    }

    @Override
    public void creditBalance(int credit) {
        balance=balance+credit;
    }

    @Override
    public void debetBalance(int debet) {
    balance=balance-debet;
    }

    @Override
    public String accountData() {
        return name+" "+surname+" your account number is "+ accountNumber;
    }
    }
