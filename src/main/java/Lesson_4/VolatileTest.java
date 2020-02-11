package Lesson_4;

public class VolatileTest {
    private static volatile int MY_INT = 0;

    public static void main(String[] args) {
        final int side = 10;
        int[][] mass4 = new int[side][side];
        crossFill(mass4);
        for(int i = 0; i < mass4.length; i++) {
            for(int j = 0; j < mass4.length; j++) {
                System.out.print(mass4[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void crossFill(int[][] mass) {
        int str, bkw;
        for(str = 0, bkw = mass.length - 1; str < mass.length; str++, bkw--) {
            mass[str][bkw] = 1;
            mass[str][str] = 1;
        }
    }

}
