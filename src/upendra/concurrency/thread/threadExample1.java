package upendra.concurrency.thread;

public class threadExample1 {
    public static class MyThread extends Thread {
        public void run() {
            System.out.println("thread started running");
            System.out.println("thread finished running");
        }
    }
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
