public class NationalBankAccount implements BankAccount {
    String fullName;
    String accountNumber;
    int balance;

    String pinCode;
    public NationalBankAccount(String fullName, String accountNumber, String pinCode,int balance){
        this.fullName=fullName;
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.pinCode=pinCode;
    }
    public String getFullName(){
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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
        this.pinCode=pinCode;
    }

    @Override
    public int totalBalance() {
        return balance;
    }

    @Override
    public void creditBalance(int credit) {
balance=balance-credit;
    }

    @Override
    public void debetBalance(int debet) {
        balance=balance+debet;
    }

    @Override
    public String accountData() {
        return getFullName()+" " ;
    }
}
