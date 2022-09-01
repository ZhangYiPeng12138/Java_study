package OOPStudy_OverWrite.OverWriteEqual;

/**
 * @BelongsProject: Java_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-07-03  20:10
 * @Description: TODO
 * @Version: 1.0
 */
public class MyDateTest {
    public static void main(String[] args) {
        Mydate m1 = new Mydate(14, 3, 2022);
        Mydate m2 = new Mydate(14, 3, 2022);
        System.out.println(m1.toString());
        System.out.println(m1);
        System.out.println(m1.equals(m2));
    }
}

class Mydate{
    private int day;
    private int month;
    private int year;

    public Mydate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof Mydate){
            Mydate mydate = (Mydate)obj;
            return this.day == mydate.day &&
                    this.month == mydate.month &&
                    this.year == mydate.year;
        }
        return false;
    }


    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Mydate mydate = (Mydate) o;
//        return day == mydate.day &&
//                month == mydate.month &&
//                year == mydate.year;
//    }

}