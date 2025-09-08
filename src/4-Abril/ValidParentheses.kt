package `4-Abril`

class ValidParentheses {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        val mapping = mapOf(
            ')' to '(',
            ']' to '[',
            '}' to '{'
        )

        for (char in s) {
            if (mapping.containsValue(char)) {
                stack.addLast(char)
            } else if (mapping.containsKey(char)) {
                if (stack.isEmpty() || stack.removeLast() != mapping[char]) {
                    return false
                }
            }
        }

        return stack.isEmpty()
    }
}