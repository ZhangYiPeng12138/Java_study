package OOPStudy4;

public class BankTest {
    public static void main(String[] args){
        Bank bank = new Bank();
        bank.addCustomers("张", "一鹏");
        System.out.println("["+bank.getCustomer(0).getFirstname()+bank.getCustomer(0).getLastname()+"]");
        bank.getCustomer(0).setAccount(new Account(2000));
        bank.getCustomer(0).getAccount().deposit(500);
        bank.getCustomer(0).getAccount().withdraw(1000);
        bank.addCustomers("朱", "碧玉");
        System.out.println("["+bank.getCustomer(1).getFirstname()+bank.getCustomer(1).getLastname()+"]");
        bank.getCustomer(1).setAccount(new Account(12000));
        bank.addCustomers("张", "三");
        System.out.println("["+bank.getCustomer(2).getFirstname()+bank.getCustomer(2).getLastname()+"]");
        System.out.println("目前银行客户数量为："+bank.getNumOfCustomers());
    }
}
