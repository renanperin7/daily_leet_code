package `4-Abril`

class IsPalindrome {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false

        var invertido = 0
        var num = x

        while (num > 0) {
            val digito = num % 10
            invertido = invertido * 10 + digito
            num /= 10
        }

        return x == invertido
    }
}