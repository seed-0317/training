package com.example;


class Count {

    int count;

    /**
     * Try making this method synchronized
     */
    public void increment(){
        count = count + 1;
    }

}

class TestRunnable implements Runnable {

    Count c;

    public TestRunnable(Count c) {
        this.c = c;
    }

    public void run() {

        for(int i = 0; i < 5000; i++) {
            c.increment();
        }

    }
}

public class MyMain {
    public static void main(String[] args) throws InterruptedException {

        Count c = new Count();

        Runnable job = new TestRunnable(c);

        Thread t1 = new Thread(job);
        Thread t2 = new Thread(job);

        t1.start();
        t2.start();

        //Wait for threads to finish
        t1.join();
        t2.join();

        //Should print 10000
        System.out.println("Count: " + c.count);

    }
}
