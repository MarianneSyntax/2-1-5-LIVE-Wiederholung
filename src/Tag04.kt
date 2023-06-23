import kotlin.math.max
import kotlin.math.min
import kotlin.math.pow
import kotlin.math.sqrt

fun main(){

    // Kotlin.Math Package

    // sqrt
    var root = sqrt(49.toDouble())

    // pow
    var power = root.pow(7)

    //min und max
    var minimum = min(root,power)
    var maximum = max(root,power)

    // String Operationen

    // Konkatenation
    var age = 18
    var concatenatedString = "Ich bin " + age + " Jahre alt."

    // length
    var concatLength = concatenatedString.length

    // Escapen / Interpolation
    println("$concatenatedString Und $root x $root ist ${power.toInt()}")

    // equals
    var string1 = "Ich will zurück nach Westerland"
    var string2 = "Ich will ein Haus im Grünen"

    var string1ContainsString2 = string1.equals(string2)
    var string1ContainsWord = string1.contains("will")
}