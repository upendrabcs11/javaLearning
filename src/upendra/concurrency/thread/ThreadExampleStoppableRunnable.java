package upendra.concurrency.thread;

public class ThreadExampleStoppableRunnable {
    public static class MyRunnable implements Runnable {
        private boolean stopRequested = false;
        private void stopRequested() {
            this.stopRequested = true;
        }
        public boolean isStopRequested(){
            return this.stopRequested;
        }
        private void sleep(long millis) {
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            String currentThreadName = Thread.currentThread().getName();
            System.out.println("thread started running  stoppable"+ currentThreadName);
            while (! isStopRequested()){
                sleep(20000);
                System.out.println("...");
            }
            System.out.println("thread finished running " + currentThreadName);
        }
    }
    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        MyRunnable x = new MyRunnable();
        Thread thread1 = new Thread(x);
        thread1.start();
        Thread thread2 = new Thread(x);
        thread2.start();
        System.out.println("before stop requested ");
        x.stopRequested();
        System.out.println("after stop requested ");

    }
}
