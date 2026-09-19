public class q5 {

    private q4[] accounts;

    public q5(int maxSize) {
        accounts = new q4[maxSize];
    }

    public boolean appendAccount(q4 account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return true;
            }
        }

        return false;
    }

    public q4 getAccount(int index) {
        if (index >= 0 && index < accounts.length && accounts[index] != null) {
            return accounts[index];
        }

        System.out.println("Invalid account index");
        return null;
    }

    public static void main(String[] args) {

        q5 list = new q5(2);

        q4 account1 = new q4("John", 100);
        q4 account2 = new q4("Alice", 200);

        System.out.println(list.appendAccount(account1));
        System.out.println(list.appendAccount(account2));

        System.out.println(list.getAccount(0).getName());
        System.out.println(list.getAccount(0).getBalance());
    }
}