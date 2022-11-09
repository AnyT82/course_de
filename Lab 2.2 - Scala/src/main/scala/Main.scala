import scala.io.StdIn.readLine
import scala.collection.mutable.ListBuffer

object Main {
  def main(args: Array[String]): Unit = {

    // task A

    println("Hello, Scala!")

    var str1= "Hello, Scala!"

    println(str1.toLowerCase())

    println(str1.reverse)

    println(str1.replace("!", ""))

    println(str1 + " and goodbye python!")

    // task B

    println("Input year salary")
    val yearSalary = readLine().toFloat

    println("Input bonus in %")
    val bonus = readLine().toFloat

    println("Input eat bonus")
    val eatBonus = readLine().toFloat

    var monthSalary = (yearSalary * 0.87 + yearSalary * bonus / 100 + eatBonus) / 12
    println( "Month Salary = " + monthSalary )

    // task C

    val salaryList = List(100, 150, 200, 80, 120, 75)
    val sumSalary = salaryList.sum.toFloat
    val numberPerson = salaryList.size.toFloat
    val avrSalary = (sumSalary / numberPerson)

    println (avrSalary)
    println("Отклонение от средней")
    for (n <- salaryList) println("Оклад сотрудника =" + n ,  "  Отклонение от средней =" + (1 - n/avrSalary))

    // task D

    val newMonthSalary = 110
    val salaryList1 = salaryList ::: newMonthSalary :: Nil
    println(salaryList1)
    println(salaryList1.max)
    println(salaryList1.min)

    // task E
    val salaryList2 = salaryList1 :+ 350 :+ 90
    val salaryList3 = salaryList2.sorted
      println(salaryList3)

    // task F
    val salaryList4 = salaryList3.take(5) ++ List(130) ++ salaryList3.drop(5)
    println(salaryList4)

    // task G
    var i = 0
    for (k <- salaryList4)
      {
        if ((k>=100) && (k<=200)) println(i, f"{$k} middle")
        i=i+1
      }

    // task H

    var salaryList5 = ListBuffer[Double]()

    for (t <- salaryList4)
    {
      var m = t * 1.07
      salaryList5  += m
      }

    println(salaryList5 )
  }
}

