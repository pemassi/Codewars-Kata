/**
 * Codewars
 *
 * https://www.codewars.com/kata/54ff3102c1bad923760001f3/train/kotlin
 *
 * @author pemassi(ruddbs5302@gmail.com)
 */
package solution

fun getCount(str : String) : Int {
    return str.replace("[^aeiou]".toRegex(), "").length
}
