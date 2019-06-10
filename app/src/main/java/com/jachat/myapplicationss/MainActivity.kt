package com.jachat.myapplicationss

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    private lateinit var webview: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var age: String? = "23"//加?可为空
        var age2 = age!!.toInt()//空指针
        var ages1 = age?.toInt()
        var ages2 = age?.toInt() - 1
//        var intent = Intent()
//        intent.setClass(this,SecondActivity::class.java)
//        startActivity(intent)

        var oneMillion = 1000000
        print("oneMillion" + oneMillion)
        Log.e("TAG", "oneMillion" + oneMillion)
    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun sum2(a: Int, b: Int) = a + b

    public fun sum3(a: Int, b: Int): Int {
        return a + b
    }

    fun vars(vararg v: Int) {
        for (vt in v) {
            print(vt)
        }
    }

    fun test(args: Array<String>) {
        for (i in 1..4) {
            print(i)
        }
        for (j in 1..10) {
            print(j)
        }
        var i: Int? = 0
        if (i in 1..10) { // 等同于 1 <= i && i <= 10
            println(i)
        }
    }

    fun Test2() {
        var a: Int = 1000
        println(a === a)

        //经过了装箱，创建了两个不同的对象
        val boxedA: Int? = a
        val anotherBoxedA: Int? = a

        //虽然经过了装箱，但是值是相等的，都是10000
        println(boxedA === anotherBoxedA) //  false，值相等，对象地址不一样
        println(boxedA == anotherBoxedA) // true，值相等
    }

    fun type2() {
        val b: Byte = 1
        val i: Int = b.toInt()
    }

    fun trim() {
        val text = """
    |多行字符串
    |菜鸟教程
    |多行字符串
    |Runoob
    """.trimMargin()
        println(text)    // 前置空格删除了
    }

    fun ss() {
        var i = 10
        var s = "i=$i"
        println(s)
    }

    fun sss() {
        val s = "runoob"
        val str = "$s.length is ${s.length}"
        println(str)
        Log.e("TAG", str)
    }

    val items = listOf("apple", "banana", "kiwi")
    fun test22() {
        for (item in items) {
            println(item)
        }

        for (index in items.indices) {
            println("item at $index is ${items[index]}")
        }
    }

    fun foo() {
        items.forEach lit@{
            if (it == "") return@lit
            print(it)
        }
    }

    class Runoob {
        fun foo() {
            print("Foo")
            var site = Runoob2() // Kotlin 中没有 new 关键字
            site.city
        }
    }

    class Runoob2 {
        var name: String = ""
        var url: String = ""
        var city: String = ""
    }

    class Person {
        var lastName: String = "zhang"
            get() = field.toUpperCase()   // 将变量赋值后转换为大写
            set

        var no: Int = 100
            get() = field                // 后端变量
            set(value) {
                if (value < 10) {       // 如果传入的值小于 10 返回该值
                    field = value
                } else {
                    field = -1         // 如果传入的值大于等于 10 返回 -1
                }
            }

        var heiht: Float = 145.4f
            private set
        fun setName(name:String){
            lastName=name;
        }
    }

    fun aa(){
        var person: Person = Person()
        person.setName("abc")
        Log.e("TAG","name:"+person.lastName)
    }

}


