package dataStructures.stack

/**
 * Implementation of [Stack]
 */
class StackImpl<T : Any> : Stack<T> {
    private var list = arrayListOf<T>()

    override fun toString(): String {
        return list.toString()
    }

    override fun pop(): T? {
        return list.removeLastOrNull()
    }

    override fun peek(): T? {
        return list.lastOrNull()
    }

    override val count: Int
        get() = list.size

    override fun push(element: T) {
        list.add(element)
    }
}