package OOPexercise;

public class Person {
    String name;
    int age,sex;

    public void study(){
        System.out.println("Studying");
    }
    public void showAge(){
        System.out.println("age = " + age);
    }
    public int addAge(int i){
        age = age+i;
        return age;
    }
}
