package Lesson_5.DZ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Race {
    private ArrayList<Stage> stages;
    CyclicBarrier cb;
    private int cars_count;
    public ArrayList<Stage> getStages() { return stages; }
    public Race(int count, Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
        cb = new CyclicBarrier(count);
        cars_count = count;
    }
    public int getCars_count(){
        return cars_count;
    }
}