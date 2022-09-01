package OOPStudy_OverWrite;

public class Student extends Person{
    protected String school = "pku";

    @Override
    public String getInfo() {
        return "Name:"+name+"\nage:"+age+"\nschool:"+school;
    }
}