package OOPStudy9;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-07-01  21:08
 * @Description: TODO
 * @Version: 1.0
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount acc = new CheckAccount(1122, 20000, 0.045, 5000);
        acc.withdraw(5000);
        System.out.println("您的账户余额" + acc.getBalance());
        System.out.println("您的可透额度" + acc.getOverdraft());
        System.out.println("----------------------------------");
        acc.withdraw(18000);
        System.out.println("您的账户余额" + acc.getBalance());
        System.out.println("您的可透额度" + acc.getOverdraft());
        System.out.println("----------------------------------");
        acc.withdraw(3000);
        System.out.println("您的账户余额" + acc.getBalance());
        System.out.println("您的可透额度" + acc.getOverdraft());
    }
}