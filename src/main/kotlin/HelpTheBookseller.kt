package solution

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