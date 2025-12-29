# How to Use Locks in Multi-Threaded Java Program?

In Java, a lock is a synchronization mechanism that ensures mutual exclusion for critical sections in a multi-threaded program. It controls access to shared resources, ensuring thread safety. Some locks, like

# Exclusive Lock(ReentrantLock): 
    Only one thread can acquire the lock at a time.
# Shared Lock(ReadWriteLock): 
    Multiple threads can hold the lock simultaneously under certain conditions.


# Basic usage of a Lock:
Lock lock = new ReentrantLock();
lock.lock();   // Acquire the lock
// Critical section
lock.unlock(); // Release the lock

# Types of Locks in Java: 

# 1. ReentrantLock
A ReentrantLock() is an implementation of Lock that allows a thread to reacquire the lock it already holds.
import java.util.concurrent.locks.ReentrantLock;

class Worker implements Runnable {

    private ReentrantLock lock;
    private String name;

    Worker(ReentrantLock lock, String name)
    {

        this.lock = lock;
        this.name = name;
    }

    @Override public void run()
    {

        lock.lock(); // Acquire lock
        try {
            System.out.println(name + " acquired lock");
            Thread.sleep(1000); // Simulate work
            System.out.println(name + " finished work");
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock(); // Release lock
        }
    }
}

public class GFG{
    
    public static void main(String[] args){
        
        ReentrantLock lock = new ReentrantLock();

        Thread t1
            = new Thread(new Worker(lock, "Thread-1"));
        Thread t2
            = new Thread(new Worker(lock, "Thread-2"));

        t1.start();
        t2.start();
    }
}

# 2. ReadWriteLock
A ReadWriteLock allows multiple threads to read a resource concurrently, but only one thread to write, ensuring no reads happen during writin.

# import java.util.ArrayList;
# import java.util.List;
# import java.util.concurrent.locks.Lock;
# import java.util.concurrent.locks.ReadWriteLock;
# import java.util.concurrent.locks.ReentrantReadWriteLock;

# class SharedData{
    private final List<String> list = new ArrayList<>();
    private final ReadWriteLock rwLock
        = new ReentrantReadWriteLock();
    private final Lock readLock = rwLock.readLock();
    private final Lock writeLock = rwLock.writeLock();

    // Writer
    public void add(String value)
    {
        writeLock.lock();
        try {
            list.add(value);
            System.out.println(
                Thread.currentThread().getName()
                + " added: " + value);
        }
        finally {
            writeLock.unlock();
        }
    }

    // Reader
    public void read(int index)
    {
        readLock.lock();
        try {
            if (index < list.size()) {
                System.out.println(
                    Thread.currentThread().getName()
                    + " read: " + list.get(index));
            }
        }
        finally {
            readLock.unlock();
        }
    }
}

# public class GFG{
    public static void main(String[] args)
    {
        SharedData data = new SharedData();

        // Writers
        Thread writer1
            = new Thread(() -> data.add("Hi"), "Geek-1");
        Thread writer2 = new Thread(
            () -> data.add("Hello"), "Geek-2");

        // Readers
        Thread reader1
            = new Thread(() -> data.read(0), "Geek-1");
        Thread reader2
            = new Thread(() -> data.read(1), "Geek-2");

        writer1.start();
        writer2.start();

        reader1.start();
        reader2.start();
    }
# }

# -----------------------------------------------------------------------------------------------------
# Difference Between Lock and Monitor in Java Concurrency.
Last Updated : 4 Dec, 2025
# Java Concurrency 
    deals with concepts like Multithreading and other concurrent operations. To manage shared resources effectively, tools like Locks (Mutex) and Monitors are used to ensure thread synchronization and avoid race conditions. Locks represent a low-level synchronization mechanism and Monitors provide a higher-level abstraction to manage thread coordination efficiently.

# Monitor in Java
    In Java, a Monitor is a synchronization construct that controls access to shared resources among multiple threads. Every Java object can act as a monitor.

A monitor allows only one thread at a time to execute a synchronized method or block on that object. Other threads requesting the same object’s synchronized block are blocked until the lock is released. Monitors use intrinsic locks (object-level locks).

# Lock in Java
Lock is a tool for controlling access to shared resources by multiple threads. It’s part of the java.util.concurrent.locks package, introduced in Java 5 and is an alternative to the traditional synchronized keyword.

Below is the illustration which demonstrates the functioning of basic locks.

