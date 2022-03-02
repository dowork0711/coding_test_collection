fun main(args: Array<String>){

    val input = readLine()!!

    val charArr = arrayOfNulls<Char>(input.length)

    for (i in input.indices) {
        charArr[i] = if (input[i] - 3 < 'A') input[i] + 23
                     else                    input[i] - 3
    }

    charArr.forEach { print(it) }
}
