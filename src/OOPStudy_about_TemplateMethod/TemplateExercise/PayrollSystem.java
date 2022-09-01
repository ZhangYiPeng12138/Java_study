package OOPStudy_about_TemplateMethod.TemplateExercise;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-07-15  17:22
 * @Description: TODO
 * @Version: 1.0
 */
public class PayrollSystem {
    public static void main(String[] args) {
        //方式一：从控制台输入月份
        Scanner scanner = new Scanner(System.in);
        //方式二：调用方法
        Calendar calendar = Calendar.getInstance();
        int month1 = calendar.get(Calendar.MONTH);
        Employee[] employees = new Employee[4];
        employees[0] = new SalariedEmployee("tom", new Mydate(1996,4,19),15000);
        employees[1] = new SalariedEmployee("jerry", new Mydate(1997, 5, 10), 15454);
        employees[2] = new HourlyEmployee("张三", new Mydate(1998, 7, 17), 70, 200);
        employees[3] = new HourlyEmployee("李四", new Mydate(1999, 5, 26), 69, 195);
        System.out.println("请输入本月月份：");
        int month = scanner.nextInt();
        for (int i = 0;i < employees.length;i++){
            System.out.println(employees[i]);
            if (employees[i].getBirthday().getMonth() == month1+1)
                System.out.println("该员工本月生日，本月工资为："+(employees[i].earnings()+100));
            System.out.println("工资为："+(employees[i].earnings()));
            System.out.println();
        }


    }
}