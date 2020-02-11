package Lesson_4;

public class Event {


    public static void main(String[] args) {
        Object стул1 = new Object();
        Object стул2 = new Object();

        Thread человек1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Человек 1 подошел к стулу 1");
                synchronized (стул1) {
                    System.out.println("Человек 1 сел на стул 1");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Человек 1 встал со стула 1");
                }
            }
        });
        человек1.start();

        Thread человек2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Человек 2 подошел к стулу 2");
                synchronized (стул2) {
                    System.out.println("Человек 2 сел на стул 2");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Человек 2 встал со стула 2");
                }
            }
        });
        человек2.start();

        Thread человек3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Человек 3 подошел к стулу 2");
                synchronized (стул2) {
                    System.out.println("Человек 3 сел на стул 2");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Человек 3 встал со стула 2");
                }
            }
        });
        человек3.start();
    }
}
