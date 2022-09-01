package OOPStudy4;

public class Account {

    private double balance;

    public Account(double init_balance) {
        System.out.println("初始金额为："+init_balance);
        this.balance = init_balance;
    }
/**
 *
 *
 * @return {@link double}
 * @throws
 * @author dell
 * @date 2022/5/17 17:48
 */
        
    public double getBalance() {
        return this.balance;
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
