# `synchronized` example

## `Count` class

```java
class Count {
    
    int count;
    
    public void increment(){
        count = count + 1;
    }
    
}
```

## `TestRunnable` class
Runnable that calls `increment()` 5000 times

```java
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
```

## Create and `start()` two threads
Should print 10000 because each thread calls `increment()` 5000 times.  

However, it doesn't print 10000 :(

This happens because each thread is accessing `increment()` at the same time.

```java
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
```

## `synchronized`
Only one thread can use `increment()` at a time

Should print 10000 now

```java
    public synchronized void increment(){
        count = count + 1;
    }
```
