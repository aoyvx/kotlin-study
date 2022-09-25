package _01hello

//标准的变量申明
var userName: String = "xiao ming"

//自动类型推导
var nikeName = "kang ye nan hai"

// 常量
val userNumber = "1580319665"

// 可空对象 如果希望一个变量可以为空就在变量类型后边追加一个?号
//var girlFriend: String = null; 错误
var girlFriend: String? = null

// kotlin 中 int不能自动升级为long
var age: Int = 18
var sunAge: Long = age.toLong()

// 模板字符串 使用$取值
var description = "username: $userName age : $age"

// 可以使用${}在字符串中运算
var description2 = "username: $userName age : ${age * 12} month"

//多行字符串
var description3 = """
    username: $userName
    age : ${age * 12} month
""".trimIndent()

// array
var arr = arrayOf(1, 2, 3)

