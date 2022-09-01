package OOPStudy4;

public class Customer {
//    属性
    private String firstname;
    private String lastname;
    private Account account;
//    构造器
    public Customer(String f, String l) {
        this.firstname = f;
        this.lastname = l;
    }
//    方法
    public void setAccount(Account acct){

        this.account = acct;
    }

    public Account getAccount() {
        return account;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
