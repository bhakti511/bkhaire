package com.bhakti.springGetterSetter;

public class Demo {

	public String name;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString() {
		return "Welcome " + name + "";
	}
	
	
}
