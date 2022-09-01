package OOPStudy9;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-07-01  21:00
 * @Description: TODO
 * @Version: 1.0
 */
public class CheckAccount extends Account{
   private double overdraft;//可透支额度

   public CheckAccount(int id, double balance, double annualInterestRate, double overdraft){
       super(id, balance, annualInterestRate);
       this.overdraft = overdraft;
   }

    public double getOverdraft() {
        return overdraft;
    }

    /**
     * 重写父类中的取钱方法
     * @param amount
     */
    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()){
            //方法一
//            setBalance(getBalance() - amount);
            //方法二
            super.withdraw(amount);
        }else if(amount - getBalance() <= overdraft){
            overdraft -= (amount - getBalance());
            //方法一
//            setBalance(0);
            //方法二
            super.withdraw(getBalance());
        }else {
            System.out.println("超过可透支额度");
        }
    }
}