
# Java Thread Priority in Multithreading

Java allows multiple threads to run concurrently, and the Thread Scheduler decides the order of execution. Each thread has a priority between 1 and 10, which indicates its importance. Threads with higher priority are generally preferred by the scheduler, though execution order is not guaranteed.

# JAVA THREAD PRIORITY
min_priority ---->   1
norm_priority ---->   1
Max_priority ---->   1

# Java provides three constant values in the Thread class:

Thread.MIN_PRIORITY (1): Lowest possible priority for a thread.
Thread.NORM_PRIORITY (5): Default priority assigned to a thread.
Thread.MAX_PRIORITY (10): Highest possible priority for a thread.

# Setting and Getting Thread Priority
We can use the following methods of the Thread class to manage thread priority:

# setPriority(int newPriority): This method is used to sets the priority of a thread.
# getPriority(): This method is used to returns the current priority of the thread.

# NOTE:
If multiple threads have the same priority, their execution order is decided by the thread scheduler. The example below demonstrates this, followed by an explanation of the output for better conceptual and practical understanding.