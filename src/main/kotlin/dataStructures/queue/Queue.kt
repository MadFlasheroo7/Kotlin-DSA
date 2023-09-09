package dataStructures.queue

/**
 * Queue is a Linear Data Structure that stores elements in sequential order.
 * Queue follows **FIFO** (First In First Out) it has operations like
 * **ENQUEUE**, **DEQUEUE**, **PEEK**
 */
interface Queue<T> {
    /**
     * **PEEK** - Returns the First element of the stack
     */
    fun peek(): T?

    /**
     * **ENQUEUE** - Adds element to the queue
     */
    fun enqueue(element: T): Boolean

    /**
     * **DEQUEUE** - Removes the first element from the stack
     */
    fun dequeue(): T?

    /**
     * **COUNT** - Returns the number of the elements in the stack
     */
    val count: Int

    /**
     * Checks if the queue is empty
     */
    val isEmpty: Boolean
        get() = count == 0
}