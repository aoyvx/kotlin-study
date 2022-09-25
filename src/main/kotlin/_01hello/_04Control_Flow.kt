package _01hello

fun main() {
    // 基本if
    var i = 1
    if(i == 1){
        i = 2
    }else{
        i = 3
    }
    //带返回值的if 类三元表达式
    i = if (i%2==0) 1 else 1
    //可空变量链式表达
    var userName: String? = null
    println(userName?.length ?:0)

    //when 模式匹配同时有返回值
    var x : Any = "1"
    when(x){
        1 -> println("one")
        "two" -> println(2)
        is Long -> println("long")
        else -> println("default")
    }
    //while 和 do while 与java相同

    //for
    for (i in listOf(1,2,3)){

    }
    // range 左闭右闭
    for (i in 1 .. 3){

    }

    // 逆序
    for(i in 6 downTo 0){

    }

    // 步长
    for (i in 1 .. 10 step 3){

    }
}

