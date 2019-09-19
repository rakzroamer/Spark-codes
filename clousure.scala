/* explains clousure and power of local variable[outer val] when use of inner function object*/

def getAreaClosure = {
  val pi = 3.14159
  val getArea = (radius:Double) => {
    pi * radius * radius
   }:Double
  getArea
 }
 
 val areaCalc:(Double) => Double = getAreaClosure
 val r = 10
 val pi = 10 //doesnt use it
 
 println(areaCalc(r))
 314.159
