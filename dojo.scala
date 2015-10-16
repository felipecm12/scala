object funcional{
     def main(args: Array[String]) 
     {
     	var lista = List (1,2,3,4)

     	lista.map((x:Int)=> println(x+10))	

     	println(suma2(2,2))

     }

     def suma(x:Int,y:Int)=x+y
     //FUNCIONAL
     val suma2=(x:Int,y:Int) => x+y

}