package Lesson_4;

public class TestInt {
    private static Integer n = new Integer(300);
    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                synchronized (n) {
//                    System.out.println("x");
//                   // n++;
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                synchronized (n) {
//                    System.out.println("y");
//                    n++;
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                synchronized (n) {
//                    System.out.println("z");
//                   // n++;
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }).start();

        DeadThreadOne deadThreadOne = new DeadThreadOne();
        deadThreadOne.start();

        DeadThreadTwo deadThreadTwo = new DeadThreadTwo();
        deadThreadTwo.start();
    }




    static Object lock1 = new Object();
    static Object lock2 = new Object();


    static class DeadThreadOne extends Thread {
        @Override
        public void run() {
            synchronized (lock1) {
                System.out.println("DeadThreadOne держит lock1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("DeadThreadOne ждет lock2");
                synchronized (lock2) {
                    System.out.println("DeadThreadOne держит lock1 и lock2");
                }
            }
        }
    }

    static class DeadThreadTwo extends Thread {
        @Override
        public void run() {
            synchronized (lock2) {
                System.out.println("DeadThreadTwo держит lock2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("DeadThreadTwo ждет lock1");
                synchronized (lock1) {
                    System.out.println("DeadThreadTwo держит lock1 и lock2");
                }
            }
        }
    }








}



























