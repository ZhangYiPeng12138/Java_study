package OOPStudy3;

public class Customer {
    private String firstname;//姓名属性
    private String lastname;//姓名属性
    private Account account;//账户属性

    public Customer(String f, String l) {//构造器初始化
        this.firstname = f;
        this.lastname = l;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return this.account;
    }
}
