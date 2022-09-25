package _02Objects

data class User(val id: Long, var name: String, var age: Int)

fun main() {
    val user = User(1, "张三", 12)
    // 析构函数
    val(name, age) = user
    val copy = user.copy(id = 2)
}