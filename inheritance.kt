import java.util.Arrays

open class ABC {
   open fun think () {
      print("Hey!! i am thinking ")
   }
}
class BCD: ABC() { // inheritance happens using default constructor 
   override fun think() {
      print("I Am from Child")
   }
}
fun main(args: Array<String>) {
   var  a = BCD()
   a.think()
