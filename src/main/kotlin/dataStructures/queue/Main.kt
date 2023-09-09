package dataStructures.queue

fun main() {
    val queue = QueueImpl<Int>()

    // adds element to the stack
    queue.enqueue(1)
    queue.enqueue(2)
    queue.enqueue(3)
    queue.enqueue(4)
    queue.enqueue(5)

    println("Queue - $queue")
    println("Count - ${queue.count}")
    println("isEmpty - ${queue.isEmpty}")
    println("Peek - ${queue.peek()}")
    queue.dequeue()
    println("Queue(dequeued) - $queue")
}