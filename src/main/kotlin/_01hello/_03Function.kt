package _01hello


/**
 * fun 方法名(参数名: 类型): 返回值{
 * }
 */
fun echo(name: String): String {
    return "Hello $name !"
}

//一行代码可以省略括号
fun echo2(name: String): String = "Hello $name"

//返回值可以自动推导
fun echo3(name: String) = "Hello $name"

//默认参数
fun echo4(prefix: String = "ECHO", name: String) = "$prefix $name"

fun main() {
    //命名参数调用
    println(echo4(name = "zhang san", prefix = "hello"))
}