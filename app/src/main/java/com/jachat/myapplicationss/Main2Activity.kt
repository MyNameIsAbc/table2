package com.jachat.myapplicationss

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;

import kotlinx.android.synthetic.main.activity_main2.*
import javax.security.auth.Subject

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

    }

    var no: Int = 100
        get() = field
        set(value) {
            if (value < 10) {       // 如果传入的值小于 10 返回该值
                field = value
            } else {
                field = -1         // 如果传入的值大于等于 10 返回 -1
            }
        }

    class Runoob constructor(name: String) {
        // 大括号内是类体构成
        var url: String = "http://www.runoob.com"
        var country: String = "CN"
        var siteName = name

        init {
            println("初始化网站名: ${name}")
        }

        fun printTest() {
            println("我是类的函数")
        }
    }

    fun main(args: Array<String>) {
        val runoob = Runoob("菜鸟教程")
        println(runoob.siteName)
        println(runoob.url)
        println(runoob.country)
        runoob.printTest()
    }

    class Person {
        var lastName: String = "Zhang"
            get() = field.toUpperCase()
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
    }

    fun TestPerson(){
        var person:Person= Person()
        person.lastName="wang"
        println("lastName:${person.lastName}")

        person.no = 9
        println("no:${person.no}")

        person.no = 20
        println("no:${person.no}")
    }

    class DontCreateMe private constructor() {

    }

    open class Base{
        open fun f(){}
    }


}
