package kata.six

/**
 * Codewars - Find The Parity Outlier
 *
 * https://www.codewars.com/kata/5526fc09a1bbd946250002dc
 *
 * @author pemassi(ruddbs5302@gmail.com)
 * @since 2021.04.10
 */
fun find(integers: Array<Int>): Int {
    val b = integers.map { Pair(isEven(it), it) }
    val odd = b.filter { !it.first }
    val even = b.filter { it.first }

    return if (odd.size == 1)
        odd[0].second
    else
        even[0].second
}

fun isEven(v: Int): Boolean = v % 2 == 0