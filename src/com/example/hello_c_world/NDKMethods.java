package com.example.hello_c_world;

public class NDKMethods {
	public native static String set_msg(String text);
	
	static{
		System.loadLibrary("com_example_hello_c_world_NDKMethods");
	}
}
