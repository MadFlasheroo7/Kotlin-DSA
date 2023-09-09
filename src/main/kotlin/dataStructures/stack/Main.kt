package dataStructures.stack

fun main() {
    val stack = StackImpl<Int>()

    // adds element to the stack
    stack.push(1)
    stack.push(2)
    stack.push(3)
    stack.push(4)
    stack.push(5)

    println("Stack - $stack")
    println("Count - ${stack.count}")
    println("isEmpty - ${stack.isEmpty}")
    println("Peek - ${stack.peek()}")
    stack.pop()
    println("Stack(popped) - $stack")
}