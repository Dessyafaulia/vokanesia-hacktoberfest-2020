fun main() {
    println("Hello World")
    showYourName("hafiz")
    showYourNameInLoop(0..5, "hafiz")

    val months = arrayListOf(0,1,2,3,4,5,6,7,8,9,10,11,12)
    doHack(months)
}

fun showYourName(name: String){
    print(name)
}

fun showYourNameInLoop(size: IntRange, name: String){
    for(i in size){
        println(name)
    }
}

fun doHack(months: ArrayList<Int>){
    for (i in months.indices){
        if (i == 10) {
            println("We Love Hacktoberfest <3")
        } else {
            println("bored")
        }
    }
}