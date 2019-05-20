package com.jachat.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebView
import org.jetbrains.anko.*
import java.net.URL

class MainActivity : AppCompatActivity() {
    private lateinit var webview: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var age:String?="23"//加?可为空
        var age2=age!!.toInt()//空指针
        var ages1=age?.toInt()
        var ages2=age?.toInt()-1
//        var intent = Intent()
//        intent.setClass(this,SecondActivity::class.java)
//        startActivity(intent)

        var oneMillion=1000000
        print("oneMillion"+oneMillion)
        Log.e("TAG","oneMillion"+oneMillion)
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

    fun test(args:Array<String>){
        for (i in 1..4){
            print(i)
        }
        for (j in 1..10){
            print(j)
        }
        var i:Int?=0
        if (i in 1..10) { // 等同于 1 <= i && i <= 10
            println(i)
        }
    }
    fun Test2(){
        var a:Int=1000
        println(a===a)

        //经过了装箱，创建了两个不同的对象
        val boxedA: Int? = a
        val anotherBoxedA: Int? = a

        //虽然经过了装箱，但是值是相等的，都是10000
        println(boxedA === anotherBoxedA) //  false，值相等，对象地址不一样
        println(boxedA == anotherBoxedA) // true，值相等
    }
    fun type2(){
        val b:Byte=1
        val i:Int=b.toInt()
    }

}


