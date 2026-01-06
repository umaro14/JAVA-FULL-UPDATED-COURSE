# Deadlock in Java Multithreading
Deadlock is a situation in multithreading where two or more threads are permanently blocked because each one is waiting for the other to release a required lock. In simple terms, threads get stuck forever, and the program never continues.

Each thread holds a lock and waits for another lock held by a different thread.
This creates a circular wait, causing the application to freeze indefinitely.
