# Java Notes: String, StringBuilder, StringBuffer & Thread Safety

# 1. String
String in Java is immutable. Once a String object is created, its value cannot be changed. Any
operation that seems to modify a String actually creates a new object. Because there is no
shared mutable state, String objects are thread-safe by default.

• Immutable (cannot be modified after creation)
• Stored in the String Constant Pool
• Thread-safe due to immutability

# 2. StringBuilder
StringBuilder is a mutable class used to create and modify strings efficiently. Unlike String, it
modifies the same object in memory. For performance reasons, its methods are not
synchronized.
• Mutable (content can change)
• Not thread-safe
• Faster than StringBuffer

# Why StringBuilder is NOT Thread-Safe ?
StringBuilder is not thread-safe because its methods are not synchronized. This means multiple
threads can execute methods like append(), insert(), or delete() at the same time on the same
object. Since these operations modify shared internal data (a character array), concurrent
execution can corrupt data and produce unpredictable results.

• No synchronization or locking is used
• Multiple threads can modify the same internal char array
• Race conditions may occur
• Designed for speed in single-threaded scenarios.

# StringBuilder Constructors:
StringBuilder class provides multiple constructors for different use cases.

StringBuilder() : Creates an empty builder with a default capacity of 16 characters.
StringBuilder(int capacity) : Creates an empty builder with a specified initial capacity.
StringBuilder(String str) : Initializes the builder with the content of the given String.
StringBuilder(CharSequence cs) : Initializes the builder with the given CharSequence (for example, String or StringBuffer)

# 3. StringBuffer
StringBuffer is similar to StringBuilder but is thread-safe. All its public methods are synchronized,
ensuring that only one thread can modify the object at a time. This prevents race conditions but
adds overhead.

• Mutable
• Thread-safe (methods synchronized)
• Slower than StringBuilder

# 4. What Does 'Synchronized' Mean?
Synchronization ensures mutual exclusion, meaning only one thread can execute a
synchronized method or block at a time. Other threads must wait until the lock is released.

# 5. Race Condition
A race condition occurs when multiple threads access and modify shared mutable data
concurrently, and the final result depends on the timing and order of execution of threads.
• Occurs with shared mutable state
• Caused by lack of synchronization
• Influenced by thread scheduling and speed

# 6. Making StringBuilder Thread-Safe
Although StringBuilder itself is not thread-safe, its usage can be made thread-safe by
synchronizing access externally. All threads must use the same lock when accessing it.
• Use synchronized blocks or synchronized methods
• Ensure no unsynchronized access exists
• Alternatively, use StringBuffer

# 7. Summary
Immutability guarantees thread safety, as seen with String. Mutability does not automatically
mean lack of thread safety; synchronization or atomic operations can make mutable objects
thread-safe. StringBuilder sacrifices thread safety for performance, while StringBuffer prioritizes
safety over speed.