package se.mbaeumer.javalab.virtualthreads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class VirtualThreadDemo {
    public static void main(String[] args){
        System.out.println("ExecutorService demo");
        System.out.println(Thread.currentThread().getName());
        Callable<String> runnablleTask = () -> {
            try {
                TimeUnit.MILLISECONDS.sleep(5000);
                System.out.println(Thread.currentThread().getName());
                System.out.println("Runnable execution finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Task completed successfully";
        };

        List<Callable<String>> tasks = new ArrayList<>();
        tasks.add(runnablleTask);
        tasks.add(runnablleTask);
        tasks.add(runnablleTask);
        tasks.add(runnablleTask);
        tasks.add(runnablleTask);

        ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor();
        try {
            executorService.invokeAll(tasks);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
    }
}
