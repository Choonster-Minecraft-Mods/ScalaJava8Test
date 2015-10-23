package com.choonster.scalajava8test;

import scala.Function1;
import scala.Unit;

public interface TestInterface {
	default void sayHello() {
		System.out.println("Hello from Java");
	}

	static void callScalaFunction(Function1<String, Unit> function) {
		function.apply("Hello from the inteface");
	}
}
