package JAVA_about_Exception;

import JAVA_about_Exception.自定义异常类.MyException;

/**
 * 手动抛出异常举例
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        try {
            p.setId(-1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Person{
    private int id;

    public void setId(int id)throws Exception{
        if (id > 0){
            this.id = id;
        }else {
            throw new MyException("自定义异常类");
        }

    }
}