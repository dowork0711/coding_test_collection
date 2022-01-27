import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {

    val n:Int = nextInt()    // 공의 개수
    val m:Int = nextInt()    // 조작 횟수

    var index = 1
    val box:Array<Int> = Array(n) { index++ }

    for(i in 0 until m) {
        val x:Int = nextInt()
        val y:Int = nextInt()
        box[x-1] = y
    }

    for(ball in box) {
        println(ball)
    }

}

