package com.jachat.myapplicationss;

public class Test2 {

    var v = "成员属性"

    fun setInterFace(test: TestInterFace) {
        test.test()
    }

    /**
     * 定义接口
     */
    interface TestInterFace {
        fun test()
    }

    fun main(args: Array<String>) {
        var test = Test2()

        /**
         * 采用对象表达式来创建接口对象，即匿名内部类的实例。
         */
        test.setInterFace(object : TestInterFace {
            override fun test() {
                println("对象表达式创建匿名内部类的实例")
            }
        })
    }


}
