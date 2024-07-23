/*fun main()
{
    println("enter a value")
    val a= readLine()
    val a1=a?.toIntOrNull()
    if(a1==null){
        println("enter valid number")
        return
    }
    if(a1%2==0){
        println("a1 is even number $a1")
    }
    else if(a1%2==1){
        println("a1 is odd number $a1")
    }
    else{
        println("a1 is either zero or negative number $a1")
    }
}*/
fun main(){
    println("enter age")
    val a= readLine()
    val age=a?.toIntOrNull()
    if(age==null){
        println("enter valid age")
        return
    }
    val res = when(age){
        in 0 ..12 ->"child"
        in 13 .. 19 ->"teenager"
        in 20.. 60 ->"adult"
        in 61 .. 100 -> "senior citizen"
        else ->"Invalid age"
    }
    println(res)
}
