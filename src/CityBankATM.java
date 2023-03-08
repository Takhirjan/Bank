
import java.util.Scanner;

public class CityBankATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your account number:");
        String accountNumber = sc.next();
        System.out.println("Please insert your pinCode:");
        String pinCode = sc.next();
        int index=-1;

        for (int i = 0; i < Database.allAccounts.length; i++) {
            if (Database.allAccounts[i].getAccountNumber().equals(accountNumber) && Database.allAccounts[i].getPinCode().equals(pinCode)) {
                if (Database.allAccounts[i] instanceof CityBankAccount) {
                    Database.allAccounts[i].accountData();
                    System.out.println("Your card was successfully accepted " + (((CityBankAccount) Database.allAccounts[i]).getName()) + " " + ((CityBankAccount) Database.allAccounts[i]).getSurname());
                    while(true) {
                        System.out.println("            Please choose the options:");
                        System.out.println();
                        System.out.println("            PRESS [1] TO CASH WITHDRAWAL");
                        System.out.println("            PRESS [2] TO VIEW BALANCE");
                        System.out.println("            PRESS [3] TO CHANGE PIN CODE");
                        System.out.println("            PRESS [4] TO CASH IN ACCOUNT");
                        System.out.println("            PRESS [5] TO VIEW ACCOUNT DATA");
                        System.out.println("            PRESS [6] TO EXIT");
                        int choice=sc.nextInt();
                        if(choice==1){
                            System.out.println("Please input the total of cash");
                            Database.allAccounts[i].creditBalance(sc.nextInt());
                            System.out.println("Your account balance has been topped up");
                        }else if(choice==2){
                            System.out.print("Your current balance is ");
                            System.out.println(Database.allAccounts[i].totalBalance()+" KZT");
                        } else if (choice == 3) {
                            System.out.println("Switch the Pin_Code:");
                            System.out.println("Please enter the new pin code");
                            String newPincode=sc.next();
                            Database.allAccounts[i].setPinCode(newPincode);
                            System.out.println("You succesfully changed you Pin Code!");
                        }else if(choice==4){
                            System.out.println("Please drop your cash");
                            Database.allAccounts[i].debetBalance(sc.nextInt());
                            System.out.println("Successfully!");
                        }else if(choice==5){
                            System.out.println(Database.allAccounts[i].accountData());
                        }else if(choice==6){
                            System.out.println("Are you sure?");
                            String text= sc.next();
                            if(text.equals("yes")){
                                break;
                            }else if(text.equals("no")){
                                System.out.println("Select the other options");
                            }
                        }

                    }
                }else if(Database.allAccounts[i] instanceof NationalBankAccount){
                    Database.allAccounts[i].accountData();
                    System.out.println("Your card was successfully accepted "+ ((NationalBankAccount) Database.allAccounts[i]).getFullName());
                    while(true){
                        System.out.println("            Please choose the options:");
                        System.out.println("           PRESS [1] TO CASH WITHDRAWAL");
                        System.out.println("           PRESS [2] TO VIEW BALANCE");
                        System.out.println("           PRESS [3] TO EXIT");
                        int choice2=sc.nextInt();
                        if(choice2==1){
                            System.out.println("Please input the total of cash");
                            Database.allAccounts[i].creditBalance(sc.nextInt());
                            System.out.println("Your account balance has been topped up");
                        }else if(choice2==2){
                            System.out.print("Your current balance is ");
                            System.out.println(Database.allAccounts[i].totalBalance()+" KZT");
                        }else if(choice2==3){
                            System.out.println("Are you sure?");
                            String text= sc.next();
                            if(text.equals("yes")){
                                System.out.println("Please take your card");
                                break;
                            }else if(text.equals("no")){
                                System.out.println("Select the other options");
                            }
                        }
                    }
                }
//                                System.out.println(Database.allAccounts[i].accountData());
            }
            else {
                System.out.println("Invalid data");
            }
        }
    }
}




//Database,allacoounts.getacciunp[i]