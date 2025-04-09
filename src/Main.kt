import Abril.*

fun main() {

    val longestBalancedSubstring = LongestBalancedSubstring()
    val twoSum = TwoSum()
    val isPalindrome = IsPalindrome()
    val countCharacters = CountCharacters()
    val romanToInt = RomanToInt()
    val maximumLengthSubstring = MaximumLengthSubstring()
    val mergeSortedArray = MergeSortedArray()

    longestBalancedSubstring.findTheLongestBalancedSubstring("000001111")

    twoSum.twoSum(intArrayOf(2, 7, 11, 15), 9)

    isPalindrome.isPalindrome(121)

    countCharacters.countCharacters(arrayOf("cat", "swap", "dereame", "atack"), "cataak")

    romanToInt.romanToInt("MCMXCIV")

    maximumLengthSubstring.maximumLengthSubstring("bcbbbcba")

    mergeSortedArray.merge(intArrayOf(1,2,3,0,0,0), 3, intArrayOf(2,5,6), 3)
}