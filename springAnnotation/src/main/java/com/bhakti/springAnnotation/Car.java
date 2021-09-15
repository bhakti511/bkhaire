package com.bhakti.springAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	
	public void drive()
	{
		System.out.println("It is car");
	}

}
