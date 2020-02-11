package Lesson_4;

public class MainThread {
    public static void main(String[] args) {

        Test t1 = new Test();
        Test t2 = new Test();

        new Thread(new Runnable() {
            @Override
            public void run() {
                t1.m1();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Test.ms1();
            }
        }).start();












//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(1);
//            }
//        });
//
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(2);
//            }
//        });
//
////        t1.setDaemon(true);
////        t2.setDaemon(true);
//
//        t1.setPriority(10);
//        t2.setPriority(1);
//
//
//
//        t2.start();
//
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        t1.start();
//        while (true) {
//            if (!t1.isAlive()) {
//                break;
//            }
//        }
//
//        while (true) {
//            if (!t2.isAlive()) {
//                break;
//            }
//        }



//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        System.out.println("END!");
    }
}












//class MyThread extends Thread {
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
//class MyRunnableClass implements Runnable {
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}