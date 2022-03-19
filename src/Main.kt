fun main(){
    people("Joan","Mollen","Whitney","Ashley")
    place()
    numbers()
    var name = names(name1 = "Tonny","Husni","Joe")
    println(name.contentToString())

}
 //function that takes in 4 strings  and creates an array out of them then
 //prints out the array
fun people(a:String,b:String,c:String,d:String){
    var p= arrayOf(a,b,c,d)
    println(p.contentToString())
}
// function that given an array below: var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
// prints out the names of the cities in the correct grammatical case.
fun place(){
    var cities= arrayOf("harare", "mumbai", "dodoma", "jakarta")
    cities.forEach {city ->
        println(city.capitalize())
    }
}
// Function that given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elementS
//(ii) prints out the index of 158                                                                                (1 point)
//(iii) prints out the elements in ascending order
fun numbers() {
    var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
    var sum = numbers[1] + numbers[4]
    var index = numbers.indexOf(158)
    var ascending=numbers.sorted()
    println(sum)
    println(index)
    println(ascending)
}
// function that takes in 3 names and returns a string array containing
//all 3 names.
fun names(name1:String,name2:String,name3:String):Array<String>{
    var names = (arrayOf(name1,name2,name3))
    return names

}

