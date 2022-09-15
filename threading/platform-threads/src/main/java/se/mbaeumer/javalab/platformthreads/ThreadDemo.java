package se.mbaeumer.javalab.platformthreads;

public class ThreadDemo {
    public static void main(String[] args){
        System.out.println("Threading demo");
        System.out.println(Thread.currentThread().getName());
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.demoSingleThread();

        new Thread("some-new-thread") {
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                threadDemo.demoSingleThread();
            }
        }.start();

        System.out.println(Thread.currentThread().getName());
    }

    public void demoSingleThread(){
        System.out.println(Thread.currentThread().getName());
    }
}
