fun main(){
    for (n in 1..1000)
    if (n%6==0 && n%8==0 ) {
        println("bingo")
    }
    else if (n%6==0 || n%8==0){
        println(n)
    }


   var languages= arrayOf("kiswahili","english","kinyarwanda","runyankole")
    for (language in languages){
        println(language)
    }
    for (n in 20..90){
        println(n)}
    for (m in 1..10)
        if (m%2!=0) {
            println(m * m)
        }

    var name="Tom"
    if (name=="tom"){
        println("Hello Tom")
    }
   else{
       println("Who are you?")

    }
    var x=50
    if (50%2==0){
       println("even")
    }
    else{
        println("odd")
    }
    visted("Kigali")
    visted("ugandan")

    saysomething("Timothy")
    saysomething("Dathan")
    saysomething("pascaline")
    saysomething("liz")

   println( pass("password"))
   println( pass("p00p"))
   println( pass("123gkiylsj894bnmt9"))
  println(  pass("t444tyyy898y760o"))
   println( pass("123456y89qt"))
    visted("ugandan")
    visted("rwandese")
    visted("kenyan")
}


fun visted(nationality:String){


    when(nationality){
        "kenyan" -> println("have yuou ever been to Nairobi")
        "ugandan" -> println("have yuou ever been to kampala")
        "tanzanian" -> println("have yuou ever been to dodoma")
        else -> println("have you ever been to east africa")
    }
    if (nationality.equals("ugandan")){
        println("Have you ever been to kampala")}
        else if(nationality.equals("Tanzanian")){
            println("Have you ever been to Dodomd")
        }
        else if (nationality.equals("kenyan")){
            println("Have you ever been to Nairobi")
    }
        else{
            println("Have you ever been to East Africa")
    }
}
fun saysomething(friend:String){
    if (friend.equals("Timothy")){
        println("collect your books tomorrow")
    }
   else if (friend.equals("Dathan")){
        println("i went to the zoo last weekend")
    }
    else{
        println("Hello $friend")
    }
}
fun pass(password:String):Boolean{
    if (password.length>=8 && password.length <=16 && !password.equals("password")){
    return true
    }
    return false
}

