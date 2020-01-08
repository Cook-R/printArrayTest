/**
 * @ClassName printArrayTest
 * @description 打印一个等腰三角形图案
 * @Author Mr.Ren
 * @Date 2020/1/8 3:20 下午
 **/


public class PrintTriangle {
    public static void main(String[] args) {
        int length = 9;
        printTree(length);
    }

    private static void printTree(int length) {
        for (int i = 1; i <= length; i++) {
            int j = i;
            for (int i1 = 1; i1 <= j; i1++) {
                int result = i1 * i;
                if (i1==j) {
                    System.out.print(i + "*" + i1 + "=" + result+" ");
                    break;
                }
                System.out.print(i + "*" + i1 + "=" + result+","+ "\t");
            }
            System.out.print("\n");
        }
    }
}
