import Abril.*

fun main() {

    val longestBalancedSubstring = LongestBalancedSubstring()
    val twoSum = TwoSum()
    val isPalindrome = IsPalindrome()
    val countCharacters = CountCharacters()
    val romanToInt = RomanToInt()
    val maximumLengthSubstring = MaximumLengthSubstring()

    longestBalancedSubstring.findTheLongestBalancedSubstring("000001111")

    twoSum.twoSum(intArrayOf(2, 7, 11, 15), 9)

    isPalindrome.isPalindrome(121)

    countCharacters.countCharacters(arrayOf("cat", "swap", "dereame", "atack"), "cataak")

    romanToInt.romanToInt("MCMXCIV")

    maximumLengthSubstring.maximumLengthSubstring("bcbbbcba")
}