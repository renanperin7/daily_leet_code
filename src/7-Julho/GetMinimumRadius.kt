package `7-Julho`

class GetMinimumRadius {
    fun getMinimumRadius(xCord: List<Int>, yCord: List<Int>): Int {
        val n = xCord.size
        var distanciaMaxima = 0L

        for (i in 0 until n) {
            var distanciaMinima = Long.MAX_VALUE

            for (j in 0 until n) {
                if (i == j) continue

                val distanciaX = xCord[i].toLong() - xCord[j]
                val distanciaY = yCord[i].toLong() - yCord[j]
                val distancia = distanciaX * distanciaX + distanciaY * distanciaY

                if (distancia < distanciaMinima) {
                    distanciaMinima = distancia
                }
            }

            if (distanciaMinima > distanciaMaxima) {
                distanciaMaxima = distanciaMinima
            }
        }

        val distance = Math.sqrt(distanciaMaxima.toDouble())

        println(Math.ceil(distance).toInt())
        return Math.ceil(distance).toInt()
    }
}