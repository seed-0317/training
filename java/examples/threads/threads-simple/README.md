# Simple Thread Example

* [Implement the `Runnable` interface](#implement-the-runnable-interface)

## Implement the `Runnable` interface
The `run` method is the first method on the thread's stack  

```java
class DogRunnable implements Runnable {
    
    @Override
    public void run() {
       for(int i = 0; i < 50; i++) {
            System.out.println("\tdog");
        }
    }
    
}
```

## `start()` the thread

```java
public class Example {
    public static void main(String[] args) throws InterruptedException {
        Runnable job = new DogRunnable();
        Thread worker = new Thread(job); //give worker a job
        worker.start();
    }
}
```

## Print in `main` thread
Notice the output is different each time you run it

```java
public class Example {
    public static void main(String[] args) throws InterruptedException {
        Runnable job = new DogRunnable();
        Thread worker = new Thread(job); //give worker a job
        worker.start();
        
        for(int i = 0; i < 50; i++) {
            System.out.println("main");
        }
    }
}
```

## `isAlive()` and `join()`

#### Print "End"
Notice that "End" need not be the last thing printed

```java
public class Example {
    public static void main(String[] args) {
        .
        .
        .
		
        System.out.println("END");
    }
}
```

### Invoke `join()`
Main thread waits for other thread to die

```java
public class Example {
    public static void main(String[] args) throws InterruptedException {
        .
        .
        .
		
        worker.join();
        System.out.println("END");
    }
}
```

### Invoke `isAlive()`
Before `join()` worker is alive  
After `join()` worker is not alive

```java
public class Example {
    public static void main(String[] args) throws InterruptedException {
        .
        .
        .
    
        System.out.println("Alive: " + worker.isAlive());
        worker.join();
        System.out.println("Alive: " + worker.isAlive());
        System.out.println("END");
    }
}
```
