fun main() {
    print("введите строку: ")
    val text = readLine() ?:""

    val chars = text.toList()
    val unique = chars.distinct().sorted()

    /*for (i in unique)
    {
        val count = chars.count{it == i}
        println("$i - $count")
    }*/

    for(i in unique)
    {
        var count = 0
        for(c in chars)
        {
            if(i == c)
            {
                count++
            }
        }
        println("$i - $count")
    }
}