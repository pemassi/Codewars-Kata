package kata.six

/**
 * Codewars - Help The Bookseller (6 kyu)
 *
 * https://www.codewars.com/kata/54dc6f5a224c26032800005c
 *
 * @author pemassi(ruddbs5302@gmail.com)
 * @since 2021.04.10
 */
object StockList {
    fun stockSummary(lstOfArt: Array<String>, lstOfCat: Array<String>): String {

        if(lstOfArt.isEmpty() || lstOfCat.isEmpty())
            return ""

        val ret = ArrayList<String>()

        for(c in lstOfCat)
        {
            var weight = 0
            for(b in lstOfArt)
            {
                if(b.startsWith(c))
                    weight += b.split(" ")[1].toInt()
            }

            ret.add("($c : $weight)")
        }

        return ret.joinToString(" - ")
    }
}