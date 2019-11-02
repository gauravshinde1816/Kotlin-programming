/*Writing the main functin and creating the class in kotlin */
fun main(args: Array<String>){
    var name:String    //declaring the variable
    name="gaurav"
    var personobj=Person()    //creating an object
    personobj.display(name)   //accessing the function using the object
    
}
//writing the class
class Person{                                  /* First letter the class name should be capital*/ 
    fun display(name:String){
    print(name)
}
}
