package dataStructures.stack

/**
 * Stack is a Linear Data Structure that stores elements in sequential order.
 * Stack follows **LIFO** (Last In First Out) it has operations like
 * **POP**, **PUSH**, **PEEK**
 */
interface Stack<T: Any> {
    /**
     * **POP** - Removes the top element from the stack
     */
    fun pop(): T?

    /**
     * **PUSH** - Adds element to the top of the stack
     */
    fun push(element: T)

    /**
     * **PEEK** - Returns the Last element of the stack
     */
    fun peek(): T?

    /**
     * **COUNT** - Returns the number of the elements in the stack
     */
    val count: Int

    /**
     * Checks if the stack is empty
     */
    val isEmpty: Boolean
        get() = count == 0
}