package OOPStudy8;

public class student extends person{
    String school;
    int id = 1001;//学号

    public student(){}

    public student(String name, int age, String school, int id){
        super(name, age);
        this.school = school;
        this.id = id;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("学生需要更多营养的食物");
    }

    public void study(){
        System.out.println("学生需要学习。");
    }

    public void show(){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("school = " + school);
        System.out.println("id = " + id);
    }
}