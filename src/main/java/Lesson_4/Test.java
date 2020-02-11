package Lesson_4;

public class Test {

    Object obj = new Object();

    public synchronized void m1() {
        System.out.println("m1");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("m2");
    }

    public synchronized void m2() {
        System.out.println("m3");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("m4");
    }

    public synchronized static void ms1() {
        System.out.println("ms1");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("ms2");
    }
}
