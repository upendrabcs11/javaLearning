package upendra.concurrency.thread;

public class ThreadExampleExtendThread {
    public static class MyThread extends Thread {
        public void run() {
            String currentThreadName = Thread.currentThread().getName();
            System.out.println("thread started running "+ currentThreadName);
            System.out.println("thread finished running " + currentThreadName);
        }
    }
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
