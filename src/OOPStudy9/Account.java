package OOPStudy9;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-07-01  20:50
 * @Description:
 * @Version: 1.0
 */
public class Account {
    private int id;//账号id
    private double balance;//余额
    private double annualInterestRate;//年利率

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * 返回月利率
     * @return
     */
    public double getMonthlyInterest(){
        return getAnnualInterestRate()/12;
    }

    /**
     * 取钱方法
     * @param amount
     */
    public void withdraw (double amount){
        if (amount > this.balance){
            System.out.println("余额不足！");
        }else {
            this.balance -= amount;
        }

    }

    /**
     * 存钱方法
     * @param amount
     */
    public void deposit (double amount){
        this.balance += amount;
    }

}