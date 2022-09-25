package _02Objects

//简单的类
class Simple(name: String)

//定义方法
class Simple2(var name: String) {
    fun getNickName() {
        "nick $name"
    }

    // 成员变量和 get set方法
    var nikeName: String
        get() = "good $name"
        set(value) {
            name = value.startsWith("good ").let { value.substringAfter("good ") }
        }

}

//抽象类
abstract class Simple3(val name: String) {
    abstract fun echo()
}

class Simple4 : Simple3("zhangsan") {
    //使用override标记重写方法
    override fun echo() {
        println("$name")
    }
}

//非抽象类需要标记为open才可以继承
open class Simple5 {
    // 同时也只有被标记为open的方法可以被重写
    open fun echo() {}
}

//接口
interface EchoServer {
    //同时也允许有属性
    var enable: Boolean
}

class Simple6(override var enable: Boolean) : Simple5(), EchoServer {
    override fun echo() {}
    fun echo(name: String) {}

    //相当于java的static内部类
    class Simple7

    //普通内部类
    inner class Simple8
}