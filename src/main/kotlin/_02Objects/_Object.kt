package _02Objects

//单例对象
object AddAction{
    val op = "add";
}
class Action{

    // 伴生对象
    // 方法可以直接由外部class调用
    companion object Add{

        fun op1(){}
        //  静态方法
        @JvmStatic
        fun op2(){}
    }
}
fun main() {
    //匿名内部类
    val l = object : ArrayList<Int>(){
        val name = "ids"
    }
    AddAction.op
    Action.op1()
}
