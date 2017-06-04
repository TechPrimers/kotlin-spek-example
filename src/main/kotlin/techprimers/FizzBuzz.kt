package techprimers

class FizzBuzz : FizzBuzzI {
    override fun calculate(num: Int): String {

        if (num % 3 == 0) return "Fizz"
        if (num % 5 == 0) return "Buzz"

        return num.toString()
    }
}


interface FizzBuzzI {
    fun calculate(num: Int): String
}