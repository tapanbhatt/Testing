package com.tapan.basic;

public class ConstructorBasic {

	private String name = "Tapan Bhatt";
	//private String name = getLogicalName();

	/*public ConstructorBasic(final Class dataType) {
		this(buildClassText(dataType),dataType.getName(),this);
	}*/

	public ConstructorBasic(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public String getCorrectName(final String name){
		 name = "Tapan";
		return name;
	}
	protected String buildClassText(final Class dataType){
		return dataType.getName().substring(dataType.getName().lastIndexOf('.') +1);
	}
	public static void main(String[] args) {
		ConstructorBasic  constructorBasic = new ConstructorBasic("Aditi");
		System.out.println("Method name = "+constructorBasic.getCorrectName("AditiBhatt"));
		System.out.println("Actual Name = "+constructorBasic.getName());
	
	}
}
