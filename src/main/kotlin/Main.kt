import java.time.LocalDate
import java.util.*
import kotlin.math.sqrt

const val CONST: Int = 100
fun main(args: Array<String>) {

    /*val row = 7

    val seatsAvailable = 8

    val listNumber = mutableListOf<Int>()
    listNumber.add(CONST * CONST)
    listNumber.add(CONST * CONST * CONST)
    listNumber.add(CONST * CONST * CONST * CONST)
    println(listNumber)
    var a = 1
    ++a
    val b =a--
    a++
    println(b)
    println("Cinema:")
    print(" ")
    for (seat in 1..seatsAvailable){
        print("$seat"+" ")
    }
    println()
    for (i in 1..row){
        print("$i"+" ")
        for (k in 1..seatsAvailable){
            print("S"+" ")
        }
        println()
    }*/
    /*//println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
   // println("Program arguments: ${args.joinToString()}")
    val reader = Scanner(System.`in`)
    print("Enter a number: ")

    var grade:Int = reader.nextInt()
     if (grade==100){
         println("A")
     }else if (grade==90){
         println("B")
     }
    println("PLease Enter your country")
    var name = readLine()
    when(name){
        "Uganda" -> println("Pearl of Africa")
        "Kenya" -> println("")
        "Tanzania" -> println("")
        else -> {
            println("Not in your region")
        }
    }

    var result = 50
    when(result){
        0 -> println("fail")
        in 1..39 -> println()
        else -> print("")
    }

    println("Enter teacher name")
    var teacherName = readLine()
    when(teacherName){
        "Gilbert" -> {
            println("Enter your comment")
            var comment = readLine()
            println(comment)
        }
        "Alex" -> print("hI")

    }
    *
     */
    /*val cars = arrayOf("Volvo","Benz","BMW","Ford","Mazda")
    for (x in cars){
        println(x)
    }
    for (i in 1..5){
        println(i)
    }
     val integerss= arrayOf(1,2,3,4)
    for (i in integerss){
        println(i)
    }*/
//DRIVER CLASS

    //var age = 0

    //Class referencing the code of assignments
    //val assignmentClass = AssignmentPractice1()

    //val reader = Scanner(System.`in`)

    //print("Enter your age: ")
    //age = reader.nextInt()
    //val resultage = assignmentClass.calculateTicketPrice(age)
    //println(resultage)


    //println("Please Enter Temperature scale:")
    //val scale = readLine()
    //println("Enter Temperature to be converted:")
    //val temp = reader.nextInt()
    //var temperatureConverted = temp.toDouble()


    //val result = assignmentClass.calculateTemperatureScale(temperatureConverted, scale!!)

    //println(result)

    //val listofArr = assignmentClass.printElementsStartsWithS()
    //println("Elements that start with S are: $listofArr")
    var sum = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).sum()
    //println("The sum of all the elements of an array is: $sum")
//    var num1 = 26
//    var num2 = 3
//    var result = num1.rem(num2)
//    var sqq = 250
//    var sqqr =sqq.toDouble()
//    var squr = sqrt(sqqr)
//    println(squr)


    // var sumoftwo = sumOfTwo(10,15)
    // println(sumoftwo)

    // var studentDetail = studentDetails("Gilbert Ayoma","1234", 25, 60)
    // println("Student Details are: $studentDetail")
    //A program which checks if a number is greater than 100
    val number = 40
    val isGreater100 = if (number > 100) "The number is greater than hundred" else "The number is less Hundred"
    println(isGreater100)

    //Lambda function
    var fullName: (String, String) -> String = { firstName, secondName ->
        firstName + " " + secondName
    }

    var result = fullNume("Gilbert", "Ayoma", fullName)
    println(result)


    val scanner = Scanner(System.`in`)
    print("Please Enter num1: ")
    val num1 = scanner.nextInt()
    println("Please Enter num2:")
    val num2 = scanner.nextInt()
    val sumOfTwoNumbers: (Int, Int) -> (String) = { x, y ->
        val sum = x + y
        "Sum of Two is: $sum"
//    val sumOfTwo = sumOfTwo(num1,num2)
    }

    val sumTwo = sumOfTwoLambda(num1, num2, sumOfTwoNumbers)

    println("SumOfTwoIs:$sumTwo")

}

// function return type of Int()
fun sumOfTwo(num1: Int, num2: Int): Int {
    var sumoftwo = num1 + num2
    return sumoftwo
}

//function return type of String()
fun studentDetails(studentName: String, studentRollNumber: String, studentAge: Int, grade: Int): String {
    var result = "Student Name is : $studentName roll number is: $studentRollNumber" +
            " student age is : ${studentAge.toString()} and grade is: ${grade.toString()}"
    return result
}

//High Order function
fun fullNume(firstName: String, secondName: String, fullName: (String, String) -> String): String {
    return fullName(firstName, secondName)

}

fun sumOfTwoLambda(num1: Int, num2: Int, addtwoTwoNumbers: (Int, Int) -> (String)): String {
    return addtwoTwoNumbers(num1, num2)
}







