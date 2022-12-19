/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    val string = "Annika är snygg"
    val map = sort(string)
    println("Räknade bokstäver: $map")
    var countArray = map.values
    while (countArray.size > 2) {
        countArray = calculateCountArray(countArray.toList())
        println(countArray)
    }
    println("\"$string\" is ${countArray.first()}${countArray.last()}%")
}

fun calculateCountArray(source: List<Int>): List<Int> {
    val newList = mutableListOf<Int>()
    for (i in 0 until source.size-1) {
        newList.add(add(source[i], source[i+1]))
    }
    return newList
}

fun sort(string: String): Map<Char, Int> {
    val map = mutableMapOf<Char, Int>()
    string.toLowerCase().replace(" ", "").forEach{
        char -> 
        if (map.containsKey(char)) {
            map.put(char, map.getOrDefault(char, 0)+1)
        } else {
            map[char] = 1
        }
    }
    return map
}

fun add(a: Int, b: Int): Int {
    return if (a+b < 10) {
        a+b
    } else {
        val sum = a+b
    
        val ental = sum%10
        val tiotal = (sum - ental)/10
        tiotal + ental
    }
}
