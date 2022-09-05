package se.mbaeumer.javalab.virtualthreads;

public class VirtualThreadsDemo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Demo virtual threads");

        var vthread = Thread.ofVirtual().start(() -> {
            System.out.println("Hello World from " + Thread.currentThread());
        });
        vthread.join();
    }
}
