package OOPStudy8;

public class person {
    String name;
    int age;
    int id = 1996;//身份证号码

    public person(){
        System.out.println("这是一个测试");
    }

    public person(String name){
        this.name = name;
    }

    public person(String name, int age){
        this(name);
        this.age = age;
    }

    public void eat(){
        System.out.println("人吃饭");
    }

    public void walk(){
        System.out.println("人走路");
    }
}