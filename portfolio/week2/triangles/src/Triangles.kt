// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry


import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Checks if the side lengths make a valid triangle
fun isValidTriangle(triangle: Triangle): Boolean {

    val a = triangle.first

    val b = triangle.second

    val c = triangle.third

    return a < b + c && b < a + c && c < a + b
}

// Calculates area of a triangle using Heron's formula /week 1
fun triangleArea(triangle: Triangle): Double {

    val a = triangle.first

    val b = triangle.second

    val c = triangle.third

    val s = (a + b + c) / 2.0

    val area = sqrt(s * (s - a) * (s - b) * (s - c))

    return area
}
