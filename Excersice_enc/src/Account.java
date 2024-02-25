public class Account {

    private String id;
    private String neme;
    private int balance = 0;
    private int amount = 0;

    public Account(String id, String neme) {
        this.id = id;
        this.neme = neme;
    }

    public Account(String id, String neme, int balance) {
        this.id = id;
        this.neme = neme;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getNeme() {
        return neme;
    }

    public int getBalance() {

        return balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNeme(String neme) {
        this.neme = neme;
    }

    public void setBalance(int balance) {
        this.balance = balance;

    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {

            this.amount = amount;
    }

    public int credite(int amount) {
        if (this.balance >= amount) {
            this.balance-=amount;
            return amount;
        } else
            System.out.println("balance is not enough");
        return 0;
    }


    public int debite(int amount) {
         this.balance +=amount;
        return amount;
    }
    public int transferTo(Account another, int amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            another.setBalance(another.getBalance() + amount);
            return amount;
        } else {
            System.out.println("Transfer failed.");
            return 0;
        }
    }
}
