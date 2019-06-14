package com.jachat.myapplicationss

public class Test3 {
    var no: Int = 100
        get() = no
        set(value) {
            if (value < 10) {
                field = value
            } else {
                field = -1
            }
        }//如果不使用field

    private val bar: Int = -1

    class Outer {                  // 外部类
        private val bar: Int = 1

        class Nested {             // 嵌套类
            var ot: Outer = Outer()
            fun foo() = 2
        }
    }

    class Outer2() {
        private val bar: Int = 1
        var v = "成员属性"

        /**嵌套内部类**/
        inner class Inner {
            fun foo() = 2
            fun innerTest() {
                var o = this@Outer2
                println("内部类可以引用外部类的成员，例如：" + o.v)
            }
        }
    }

    fun main(args: Array<String>) {
        val s =  Student("Runoob", 18, "S12346", 89)
        println("学生名:${s.name}")
        println("年龄： ${s.age}")
        println("学生号:${s.no}")
        println("成绩： ${s.score}")

        var ss=Student2("Runoob", 18, "S12346", 89)
        ss.study()


    }

    open class Base(p:Int)
    class Derived(p:Int):Base(p)

    open class Person(var name : String, var age : Int){// 基类

    }

    class Student (name: String, age:Int,var no:String, var score:Int):Person(name,age){

    }

    /**用户基类**/
    open class Person2(name: String){
        /**次级构造函数**/
        constructor(name: String,age: Int):this(name){
            //初始化
            println("-------基类次级构造函数---------")
        }
        open fun study(){
            println("我在读大学")
        }
    }

    /**子类继承 Person 类**/
    class Student2:Person2{
        /**次级构造函数**/
        constructor(name:String,age:Int,no:String,score:Int):super(name,age){
            println("-------继承类次级构造函数---------")
            println("学生名： ${name}")
            println("年龄： ${age}")
            println("学生号： ${no}")
            println("成绩： ${score}")
        }

        override fun study() {
           super.study()
            println("我在读核能专业")
        }
    }


}
