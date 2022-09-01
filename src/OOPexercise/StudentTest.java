package OOPexercise;

public class StudentTest {
    public static void main(String[] args){
        Student[] student = new Student[20];
        for (int i = 0;i < student.length;i++){
            student[i] = new Student();
            student[i].number = i+1;
            //1-6年级
            student[i].state = (int)((Math.random()*6)+1);
            //1-100分
            student[i].score = (int)((Math.random()*100)+1);
        }
//        创建一个测试对象test
        StudentTest test = new StudentTest();

//        打印学生信息
        test.infos(student);
        System.out.println("*****************");

//        打印指定年级学生信息
        test.searchStats(student, 3);
        System.out.println("*****************");

//        根据成绩冒泡排序成绩
        test.sort(student);
        test.infos(student);
        System.out.println("*****************");

//        匿名对象的使用
        Student2 stu = new Student2();
        stu.infos(new Student());
    }



//    匿名对象的使用
    Student2 stu = new Student2();

    /**
     *
     * @param student 实例化一个学生数组
     */
    public void infos(Student[] student){
        for (int i = 0;i < student.length;i++){
            student[i].info();
        }
    }

    /**
     *
     * @param student 实例化一个学生数组
     * @param stats 指定查找的年级
     */
    public void searchStats(Student[] student, int stats){
        for (int i = 0;i < student.length;i++){
            if (student[i].state == stats){
                student[i].info();
            }
        }
    }

    /**
     *
     * @param student 实例化一个学生数组
     */
    public void sort(Student[] student){
        for (int i = 0;i < student.length -1;i++){
            for (int j = 0;j < student.length - 1 - i;j++){
                if (student[j].score > student[j + 1].score){
                    Student temp = new Student();
                    temp = student[j];
                    student[j] = student[j+1];
                    student[j+1] = temp;
                }
            }
        }
    }
}

class Student2 {
    public void infos(Student student){
        student.info();
    }
}

class Student {
    int number,state,score;//学号，年级，成绩

    public void info(){
        System.out.print("学号" + number + " ");
        System.out.print("年级" + state + " ");
        System.out.print("得分" + score + " ");
        System.out.println();
    }
}
