fun filterNumbers(numbers: List<Int>, predicate:(Int)->(Boolean)): List<Int> {
    val filteredList: MutableList<Int> = mutableListOf()

    for(number in numbers){
        if(predicate(number)){
            filteredList.add(number)
        }
    }

    return filteredList
}


fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(filterNumbers(numbers, {it->it%2==0}))
    println(filterNumbers(numbers, {it->it%2!=0}))

}
