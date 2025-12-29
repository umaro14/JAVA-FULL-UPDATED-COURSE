# A daemon thread 
==> is a low-priority background thread that does not prevent the JVM from exiting when the program finishes execution

Daemon threads run in the background to support user threads.
The JVM exits automatically when all user (non-daemon) threads complete.
They are created using the same Thread class but are marked as daemon using the setDaemon(true) method.
The setDaemon(true) method must be called before the thread starts.
Common examples include Garbage Collector and Finalizer Thread.