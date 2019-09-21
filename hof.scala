scala> def pairVal[K,V](k:K,v:V) = {
     |   val key = k.getClass
     |   val value = v.getClass
     |   println(s"$k,$v is from the $key, $value")
     | }
pairVal: [K, V](k: K, v: V)Unit

scala> pairVal(2,"2")
2,2 is from the class java.lang.Integer, class java.lang.String

scala> val chkMe = pairVal _
chkMe: (Any, Any) => Unit = $$Lambda$1006/1564588329@6dd0e2f4

scala> chkMe(2,"raj")
2,raj is from the class java.lang.Integer, class java.lang.String

scala> val newMe:(Any, Any) => Unit = pairVal _
newMe: (Any, Any) => Unit = $$Lambda$1007/649699940@2c1a86e1

scala> newMe(3,3)
3,3 is from the class java.lang.Integer, class java.lang.Integer
