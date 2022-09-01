package OOPStudy_static;

public class ArrayUtilsStaticTest {
    public static void main(String[] args) {
        int[] a = new int[]{1,5,7,8,2,11};
        int max = ArrayUtilStatic.getMax(a);
        int min = ArrayUtilStatic.getMin(a);
        ArrayUtilStatic.bubbleSort(a);
        ArrayUtilStatic.traverse(a);
    }

}