package OOPStudy3;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane", "Smith");
//        Account account = new Account(1000, 2000, 0.0123);
        customer.setAccount(new Account(1000, 2000, 0.0123));
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);

        System.out.println("账户信息：");
        System.out.println("姓名："+customer.getFirstname()+" "+customer.getLastname());
        System.out.println("账户id："+customer.getAccount().getId()+"账户余额"+customer.getAccount().getBalance()+"年利率"+customer.getAccount().getAnnualInterestRate());

        customer.getAccount();
    }
}
