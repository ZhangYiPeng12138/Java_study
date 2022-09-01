package OOPStudy4;

public class Bank {
    private Customer[] customers = new Customer[10];//存放多个客户的数组
    private int numberOfCustomers;//记录客户的个数

    public Bank(){

    }
//添加客户
    public void addCustomers(String f, String l){
        Customer cus = new Customer(f, l);
        customers[numberOfCustomers++] = cus;
    }
//获取客户个数
    public int getNumOfCustomers(){
        return numberOfCustomers;
    }
//获取指定位置的客户
    public Customer getCustomer(int index) {
        if (index >= 0 && index < numberOfCustomers)
            return customers[index];
        else
            return null;
    }
}
