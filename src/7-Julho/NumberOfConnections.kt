package `7-Julho`

class NumberOfConnections {
    fun numberOfConnections(gridOfNodes: List<List<Int>>): Int {
        val n = gridOfNodes.size
        if (n == 0) return 0

        val contagemNodes = IntArray(n)
        for (i in 0 until n) {
            var count = 0
            for (valor in gridOfNodes[i]) {
                if (valor == 1) count++
            }
            contagemNodes[i] = count
        }

        var totalLigacoes = 0

        for (i in 0 until n - 1) {
            if (contagemNodes[i] == 0) continue

            var proximaLinha = -1
            for (j in i + 1 until n) {
                if (contagemNodes[j] > 0) {
                    proximaLinha = j
                    break
                }
            }

            if (proximaLinha != -1) {
                totalLigacoes += contagemNodes[i] * contagemNodes[proximaLinha]
            }
        }
        println(totalLigacoes)
        return totalLigacoes
    }
}