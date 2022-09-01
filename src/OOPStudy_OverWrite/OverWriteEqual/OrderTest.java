package OOPStudy_OverWrite.OverWriteEqual;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-07-03  19:50
 * @Description: TODO
 * @Version: 1.0
 */

public class OrderTest{
    public static void main(String[] args) {
        Order o = new Order(2001, "name");
        Order o1 = new Order(2001, "name");
        System.out.println(o.equals(o1));
    }
}
class Order {
    private int orderID;
    private String orderName;

    public Order(int orderID, String orderName) {
        this.orderID = orderID;
        this.orderName = orderName;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (obj instanceof Order){
            Order order = (Order)obj;
            return this.orderID == order.orderID && this.orderName.equals(order.orderName);
        }
        return false;
    }
}