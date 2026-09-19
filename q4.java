public class q4 {

    private String name;
    private double balance;

    public q4(String name, double balance) {
        this.name = name;

        if (balance > 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0) {
            balance += depositAmount;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        q4 account = new q4("John", 100);

        System.out.println(account.getName());
        System.out.println(account.getBalance());

        account.deposit(50);

        System.out.println(account.getBalance());
    }
}