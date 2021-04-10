package kata.four

/**
 * Codewars - Strings Mix (4 kyu)
 *
 * https://www.codewars.com/kata/5629db57620258aa9d000014
 *
 * @author pemassi(ruddbs5302@gmail.com)
 * @since 2021.04.10
 */
fun mix(s1:String, s2:String): String {
    //pre-process
    val processed1 = s1.filter { it in 'a'..'z'}.groupingBy { it }.eachCount()
    val processed2 = s2.filter { it in 'a'..'z'}.groupingBy { it }.eachCount()

    //intersect
    val keys = processed1.map { it.key }.union(processed2.map { it.key })

    //Compute
    val ret = ArrayList<Pair<String, String>>()

    loop@ for(key in keys)
    {
        val v1 = processed1[key] ?: 0
        val v2 = processed2[key] ?: 0

        when {
            v1 > v2 -> {
                ret.add(Pair("1", "".padStart(v1, key)))
            }
            v1 < v2 -> {
                ret.add(Pair("2", "".padStart(v2, key)))
            }
            else -> {
                ret.add(Pair("=", "".padStart(v1, key)))
            }
        }
    }

    return ret
        .filter { it.second.length != 1 }
        .sortedWith(compareByDescending<Pair<String, String>> {it.second.length}.thenBy { it.first }.thenBy { it.second })
        .joinToString("/") { "${it.first}:${it.second}" }
}