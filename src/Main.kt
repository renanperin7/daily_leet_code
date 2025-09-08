import `4-Abril`.*
import `6-Junho`.FindSecurityLevel
import `6-Junho`.FizzBuzz
import `6-Junho`.MinimumSets
import `7-Julho`.GetMinimumRadius
import `7-Julho`.NumberOfConnections

fun main() {

    val longestBalancedSubstring = LongestBalancedSubstring()
    val twoSum = TwoSum()
    val isPalindrome = IsPalindrome()
    val countCharacters = CountCharacters()
    val romanToInt = RomanToInt()
    val maximumLengthSubstring = MaximumLengthSubstring()
    val mergeSortedArray = MergeSortedArray()
    val longestCommonPrefix = LongestCommonPrefix()
    val validParentheses = ValidParentheses()
    val singleNumber = SingleNumber()
    val fizzBuzz = FizzBuzz()
    val findSecurityLevel = FindSecurityLevel()
    val minimumSets = MinimumSets()
    val getMinimumRadius = GetMinimumRadius()
    val numberOfConnections = NumberOfConnections()

    longestBalancedSubstring.findTheLongestBalancedSubstring("000001111")

    twoSum.twoSum(intArrayOf(2, 7, 11, 15), 9)

    isPalindrome.isPalindrome(121)

    countCharacters.countCharacters(arrayOf("cat", "swap", "dereame", "atack"), "cataak")

    romanToInt.romanToInt("MCMXCIV")

    maximumLengthSubstring.maximumLengthSubstring("bcbbbcba")

    mergeSortedArray.merge(intArrayOf(1,2,3,0,0,0), 3, intArrayOf(2,5,6), 3)

    longestCommonPrefix.longestCommonPrefix(arrayOf("flower","flow","flight"))

    validParentheses.isValid("(}")

    singleNumber.singleNumber(intArrayOf(2, 1, 2))

    fizzBuzz.fizzBuzz(5)

    findSecurityLevel.findSecurityLevel(arrayOf(1,3,2,4, 5), 100)

    minimumSets.minimumSets(arrayOf(1,3,2,4, 5), arrayOf(1,3,2,4, 5), 2)

    getMinimumRadius.getMinimumRadius(listOf(0,3,6), listOf(0,0,0))

    numberOfConnections.numberOfConnections(listOf(listOf(0,0,0,1), listOf(1,1,1,0), listOf(0,0,0,0), listOf(1,1,1,1)))
}