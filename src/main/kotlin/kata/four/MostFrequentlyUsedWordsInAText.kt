package kata.four

/**
 * Codewars - Most frequently used words in a text (4 kyu)
 *
 * https://www.codewars.com/kata/51e056fe544cf36c410000fb
 *
 * @author pemassi(ruddbs5302@gmail.com)
 * @since 2021.04.10
 */
fun top3(s: String): List<String> {

    println("INPUT - [$s]")
    println()

    //Make Lowercase
    val temp = s.toLowerCase()

    //Split
    var strArray = temp.split(Regex("[^a-z']"))

    //Filter
    strArray = strArray
        .map { it.replace(Regex("[^a-z']"), "")} //Replace trash characters
        .filter { it.isNotEmpty() && Regex("[a-z]").containsMatchIn(it)}  //Should not blank, and has at least a-z word

    //Count
    val countMap = HashMap<String, Int>()
    for (str in strArray)
    {
        countMap[str] = (countMap[str] ?: 0) + 1
    }

    //Make top 3 array
    val countArray = countMap.toList()
        .sortedByDescending { it.second }
        .map { it.first }

    println(countArray)
    println()

    val ret = if(countArray.size < 3)
        countArray
    else
        countArray.slice(0..2)

    println("ANS - $ret")

    return ret
}