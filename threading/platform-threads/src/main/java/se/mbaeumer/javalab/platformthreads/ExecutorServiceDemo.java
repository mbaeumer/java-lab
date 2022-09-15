package se.mbaeumer.javalab.platformthreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo {

    public static void main(String[] args){
        System.out.println("ExecutorService demo");
        System.out.println(Thread.currentThread().getName());
        Runnable runnablleTask = () -> {
            try {
                TimeUnit.MILLISECONDS.sleep(5000);
                System.out.println(Thread.currentThread().getName());
                System.out.println("Runnable execution finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(runnablleTask);

        executorService.shutdown();
    }
}
