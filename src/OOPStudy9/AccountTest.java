package OOPStudy9;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-07-01  20:55
 * @Description: Account的测试类
 * @Version: 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account(1122, 20000, 0.045);
        acc.withdraw(30000);
        System.out.println("您的账户余额为：" + acc.getBalance());
        acc.withdraw(2500);
//        System.out.println("您的账户余额为：" + acc.getBalance());
        acc.deposit(3000);
        System.out.println("您的账户余额为：" + acc.getBalance());
        System.out.println("月利率为：" + acc.getMonthlyInterest());
    }
}