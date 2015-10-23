package com.choonster.scalajava8test;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "ScalaJava8Test", name = "Scala Java 8 Test")
public class ScalaJava8Test {
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		TestObject.callInterfaceMethod();
	}
}
