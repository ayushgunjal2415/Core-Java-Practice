package oop.Encapsulation;

public class Customer {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("443781", "Ayush Gunjal");
        acc.depositMoney(600);
        System.out.println("Withdrawal money: " + acc.withdrawMoney(400));
        acc.depositMoney(800);
        System.out.println("Withdrawal money: " + acc.withdrawMoney(1000));
        acc.depositMoney(100);
        acc.withdrawMoney(-100);
    }
}
