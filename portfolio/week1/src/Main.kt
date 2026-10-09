// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

/*
use herons formula to find the area of a triangle

herons formula = (s(s-a)(s-b)(s-c))^1/2

s = half perimeter
find all lengths: a , b , c

s = (a +b + c)* 0.5



 */

fun main(args: Array<string>)
{
    
    if (args.size < 3)
    {
        println("Error: values for a, b, c required on command line")
        System.exit(1)

    }
    val a= args[0].toDouble()
    val b= args[1].toDouble()
    val c= args[2].toDouble()

    val s = (a+b+c)*0.5

    val area = sqrt(s*(s-a)*(s-b)*(s-c))

    println("Area = %.5f".format(area))

}