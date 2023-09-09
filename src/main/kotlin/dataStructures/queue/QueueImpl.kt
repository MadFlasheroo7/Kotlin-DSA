package dataStructures.queue

/**
 * Implementation of [Queue]
 */
class QueueImpl<T> : Queue<T> {
    private val list = arrayListOf<T>()

    override fun toString(): String {
        return list.toString()
    }

    override val count: Int
        get() = list.size

    override fun peek(): T? {
        return list.first()
    }

    override fun enqueue(element: T): Boolean {
        return list.add(element)
    }

    override fun dequeue(): T? {
        return if (isEmpty) null else list.removeFirstOrNull()
    }
}