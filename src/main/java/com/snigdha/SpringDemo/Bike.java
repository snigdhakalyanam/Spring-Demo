package com.snigdha.SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	public void drive()
	{
		System.out.println("running in good condition");
	}
}
