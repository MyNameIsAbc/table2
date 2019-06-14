package com.jachat.myapplicationss

class Test4 {

    open class A {
        open fun f() {
            print("A")
        }

        fun a() {
            print("a")
        }
    }

    interface B {
        fun f() {
            print("B")
        } //接口的成员变量默认是 open 的

        fun b() {
            print("b")
        }
    }

    class C() : A(), B {
        override fun b() {
            super.b()
        }

        override fun f() {
            super<A>.f()//调用 A.f()
            super<B>.f()//调用 B.f()
        }
    }

    fun main(args: Array<String>) {
        val c = C()
        c.f()
    }

    interface Foo {
        val count: Int
    }

    class Bar1(override val count:Int):Foo

    class Bar2:Foo{
        override var count: Int = 0
    }


}
