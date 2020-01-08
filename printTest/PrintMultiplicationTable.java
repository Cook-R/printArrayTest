/**
 * @ClassName printArrayTest
 * @description 打印99乘法表
 * @Author Mr.Ren
 * @Date 2020/1/8 2:57 下午
 **/


public class PrintMultiplicationTable {

    public static void main(String[] args) {
        int length = 9;
        printSheet(length);
    }

    private static void printSheet(int length) {
        for (int i = 1; i <= length; i++) {
            int takeSurplus = i % 2;
            int arrangement = i / 2;
                if (takeSurplus==1) {
                    for (int i1=0; Math.abs(length)-arrangement > i1; i1++) {
                        System.out.print(" ");
                    }
                    for (int i2 = 0; i2 < i; i2++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
        }
    }
}
