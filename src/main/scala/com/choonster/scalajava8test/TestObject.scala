package com.choonster.scalajava8test

object TestObject {
  def callInterfaceMethod(): Unit = {
    val x = (a: String) => System.out.print(a)
    TestInterface.callScalaFunction(x)

    new TestInterface {
      override def sayHello(): Unit = {
        System.out.println("Hello from Scala")
      }
    }.sayHello()

    new TestInterface {}.sayHello()
  }
}
