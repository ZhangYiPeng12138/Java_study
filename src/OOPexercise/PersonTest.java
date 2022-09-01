package OOPexercise;

public class PersonTest {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "张三";
        person1.age = 25;
        person1.sex = 2;
        person1.study();
        person1.showAge();
        person1.addAge(2);
        person1.showAge();

        Person person2 = new Person();
        person2.showAge();
        person2.study();
    }
}
