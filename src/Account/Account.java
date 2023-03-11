package Account;

public class Account {
    public String id;
    public String name;
    public int balance;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void credit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Nap tien vao tai khoan thanh cong, balance = " + balance);
        }
        return;
    }

    public void debit(int amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Thanh toan tien thanh cong, balance = " + balance);
        } else if (amount > 0 && amount > balance)
            System.out.println("Thanh toan tien KO thanh cong, balance = " + balance);
        else if (amount < 0)
            System.out.println("Gia tri ko hop le");
    }

    public void tranferTo(Account account, int amount) {
        if (this.balance > amount) {
            this.balance = this.balance - amount;
            account.balance = account.balance + amount;
            System.out.println("Chuyen tien thanh cong, tai khoan A: " + this.balance + " tai khoan B: " + account.balance);
        }
        return;
    }

    public static void main(String[] args) {
        Account A = new Account("0221", "Nguyen Van A", 2000);
        A.credit(500);
        A.debit(300);

        Account B = new Account("0222", "Nguyen Van B", 5000);
        A.tranferTo(B, 1500);
    }
}
