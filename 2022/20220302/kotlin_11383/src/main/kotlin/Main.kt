fun main(args: Array<String>) {

    val (n, m) = readLine()!!.split(" ").map{ it.toInt() }

    val firImg = List<String>(n) { readLine()!! }
    val secImg = List<String>(n) { readLine()!! }

    val answer = if(firImg.zip(secImg).all { (p, q) ->
                    p.map { it.toString().repeat(2) }
                     .joinToString("") == q })
                     "Eyfa" else "Not Eyfa"

    println(answer)
}

