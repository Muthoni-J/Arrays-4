fun main(){
    people("Joan","Mollen","Whitney","Ashley")
    place()
    numbers()
    }

//Function that takes in 4 strings and create an array
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

