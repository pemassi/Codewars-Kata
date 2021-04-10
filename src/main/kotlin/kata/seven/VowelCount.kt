package kata.seven

/**
 * Codewars - Vowel Count
 *
 * https://www.codewars.com/kata/54ff3102c1bad923760001f3
 *
 * @author pemassi(ruddbs5302@gmail.com)
 * @since 2021.04.10
 */
fun getCount(str : String) : Int {
    return str.replace("[^aeiou]".toRegex(), "").length
}
