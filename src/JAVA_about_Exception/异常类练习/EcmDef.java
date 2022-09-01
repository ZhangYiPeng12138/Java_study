package JAVA_about_Exception.异常类练习;

/**
 * 接受命令行的两个参数，要求不能输入负数，计算两数相除
 * 数据类型不一
 * 缺少命令行参数
 * 除0
 * 输入负数
 */
public class EcmDef {
    public static void main(String[] args) {

        try {
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            ecm(i, j);
        } catch (EcDef ecDef) {
            ecDef.getMessage();
        } catch (NumberFormatException e){
            System.out.println("数据类型不一致");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("缺少参数");
        } catch (ArithmeticException e){
            System.out.println("处0");
        }
    }

    public static double ecm(int i,int j)throws EcDef{
        if (i <0 || j <0){
         throw new EcDef("不能有负数");
        }return i / j;
    }
}