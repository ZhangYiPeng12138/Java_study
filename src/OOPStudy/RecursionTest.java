package OOPStudy;
/*
* 递归方法的使用
*
* 递归：一个方法体内调用它自身
* 递归包含了一种隐式的循环，但这种循环无需循环控制
* 但是递归一定要向着已知方向递归，否则会无穷递归
* */
public class RecursionTest {
    public static void main(String[] args){
        RecursionTest recursionTest = new RecursionTest();
        System.out.println(recursionTest.geSumRecursion(1000));
        System.out.println(recursionTest.getMultiRecursion(10));
        System.out.println(recursionTest.sequenceRecursion(10));
        System.out.println(recursionTest.Febonacci(20));
    }


//    例一，计算1-n之间所有自然数的和
    public int geSumRecursion(int n){
        if (n == 1)
            return 1;
        else
            return n + geSumRecursion(n-1);

    }

//    例二，计算1-n之间所有自然数的乘积
    public int getMultiRecursion(int n){
        if (n == 1)
            return 1;
        else
            return n * getMultiRecursion(n-1);
    }

//    例三：已知一个数列，f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n)
//    求f(10)的值
    public int sequenceRecursion(int n){
        if (n == 0)
            return 1;
        else if (n == 1)
            return 4;
        else
            return 2*sequenceRecursion(n-1)+sequenceRecursion(n-2);
    }

//    计算斐波那契数列的第n个值：1 1 2 3 5 8 13 21 34 55...f(n) = f(n-1)+f(n-2)
    public int Febonacci(int n){
        if (n == 0)
            return 1;
        else if (n == 1)
            return 1;
        else
            return Febonacci(n-1) + Febonacci(n-2);
    }

//    汉诺塔问题
//    快速排序

}
