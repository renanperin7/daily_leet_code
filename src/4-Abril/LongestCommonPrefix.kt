package `4-Abril`

class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        if (strs.size == 1) return strs[0]

        val menorPalavra = strs.minBy { it.length }
        var prefixoComum = ""

        for (i in menorPalavra.indices) {
            val charAtual = menorPalavra[i]

            for (str in strs) {
                if (i >= str.length || str[i] != charAtual) {
                    return prefixoComum
                }
            }

            prefixoComum += charAtual
        }

        return prefixoComum
    }
}