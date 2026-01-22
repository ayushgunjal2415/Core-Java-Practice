package oop.Encapsulation;

 class BankAccount {
    private String accNumber;
    private String accHolderName;
    private double balance;

    public String getAccHolderName(){
        return accHolderName;
    }

     public String getAccNum(){
        return accNumber;
    }

    public void depositMoney(double money){
        if ( money <= 0){
            System.out.println("Invalid Deposit..");
        }else{
            balance += money;
        }
    }

    public double withdrawMoney(double money){
         if ( money <= 0){
            System.out.println("Invalid Withdrawal");
        } else if( balance >= money){
            balance -= money;
        } else {
            money = balance;
            balance = 0;
        }
        return money;
    }

    public BankAccount(String accNumber, String accHolderName) {
        this.accNumber = accNumber;
        this.accHolderName = accHolderName;
    }

}
