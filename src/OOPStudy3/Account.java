package OOPStudy3;

public class Account {

    private int id;//账户
    private double balance;//余额
    private double annualInterestRate;//年利率


    public Account(int id, double balance, double annualInterestRate) {//构造器初始化
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

//    访问器方法
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void withdraw(double amount) {//取款方法
        if (amount > this.balance){
            System.out.println("余额不足，取款失败！");
        }else {
            this.balance -= amount;
            System.out.println("本次取款"+amount+"元，账户余额"+this.balance);
        }
    }

    public void deposit(double amount) {//存款方法
        if (amount < 0){
            System.out.println("请输入正数！");
            return;
        }
        this.balance += amount;
        System.out.println("本次存款"+amount+"元，账户余额"+this.balance);
    }
}
