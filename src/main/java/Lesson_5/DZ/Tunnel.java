package Lesson_5.DZ;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class Tunnel extends Stage {
    private AtomicInteger currentCars =  new AtomicInteger(0);;
    private ReentrantLock r1 = new ReentrantLock();
    public Tunnel() {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
    }
    @Override
    public void go(Car c) {
        try {
            try {
                System.out.println(c.getName() + " готовится к этапу(ждет): " + description);


                currentCars.incrementAndGet();
                if(currentCars.intValue()==c.getRace().getCars_count()/2 && !(r1.isLocked())) {
                    r1.lock();
                }

                System.out.println(c.getName() + " начал этап: " + description);
                Thread.sleep(length / c.getSpeed() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                currentCars.decrementAndGet();
                if(currentCars.intValue()<c.getRace().getCars_count()/2 && r1.isLocked()) {
                    r1.unlock();
                }
                System.out.println(c.getName() + " закончил этап: " + description);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}