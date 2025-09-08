package `6-Junho`

class FizzBuzz {
    fun fizzBuzz(n: Int): Unit {
        if ((n.rem(3) == 0) && (n.rem(5) == 0)) {
            println("FizzBuzz")
        } else if ((n.rem(3) == 0)) {
            println("Fizz")
        } else if ((n.rem(5) == 0)) {
            println("Buzz")
        } else {
            println(n)
        }
    }
}