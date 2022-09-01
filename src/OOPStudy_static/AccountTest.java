package OOPStudy_static;

public class AccountTest {
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account();
        Account a3 = new Account("zypgood123", 500);
        System.out.println("a1 id is"+a1.getId());
        System.out.println("a2 id is"+a2.getId());
        System.out.println("a3 id is"+a3.getId());
        Account.getRate();
        Account.getMinBalance();
    }
}

class Account{
    private int id;//账号
    private String password;//密码
    private double balance;//余额
    private static double rate = 0.05;//利率
    private static double minBalance = 1000;//最小余额
    private static int init = 1001;//账号初始值

    public Account(){
        id = init++;
    }

    public Account(String password, double balance){
        this();
        this.password = password;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public static double getRate() {
        return rate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

}