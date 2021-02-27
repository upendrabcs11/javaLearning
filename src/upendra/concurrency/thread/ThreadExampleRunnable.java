package upendra.concurrency.thread;

public class ThreadExampleRunnable {
    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
            String currentThreadName = Thread.currentThread().getName();
            System.out.println("thread started running "+ currentThreadName);
            System.out.println("thread finished running " + currentThreadName);
        }
    }
    public static void main(String[] args) {
        MyRunnable x = new MyRunnable();
        Thread thread1 = new Thread(x);
        thread1.start();
        Thread thread2 = new Thread(x);
        thread2.start();
    }
}
