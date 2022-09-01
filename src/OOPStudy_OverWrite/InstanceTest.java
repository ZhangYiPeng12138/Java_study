package OOPStudy_OverWrite;

public class InstanceTest {
    public static void main(String[] args) {
        Person p = new Person();
        Person p1 = new Student();
        Person p3 = (Person)p1;
        Person p2 = new Graduate();
        InstanceTest test = new InstanceTest();
        test.method(p);
        System.out.println("----------------");
        test.method(p1);
        System.out.println("----------------");
        test.method(p2);
        System.out.println("----------------");
        test.method(p3);
    }

    public void method(Person e){
        if (e instanceof Graduate){
            System.out.println(e.getInfo());
            System.out.println("a graduated student");
            System.out.println("a student");
            System.out.println("a person");
        }else if(e instanceof Student){
            System.out.println(e.getInfo());
            System.out.println("a student");
            System.out.println("a person");
        }else {
            System.out.println(e.getInfo());
            System.out.println("a person");
        }
    }
}