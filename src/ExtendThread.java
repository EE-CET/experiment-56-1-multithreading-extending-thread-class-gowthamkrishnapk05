class MyThread extends Thread {
    // TODO: Override the run() method
    // Inside run(), print "Thread is running"
    @Override
    public void run()
    {
        System.out.print("Thread is running");
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        // TODO: Create an object of MyThread
        // TODO: Start the thread using start() method
        MyThread obj  = new MyThread();
        obj.start();
    }
}
