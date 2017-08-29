package com.tapan.opps;


public class ObjectOriented {

	private String name;
	private int age;

	 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name = "+name+" "+"Age = "+age;
	}
	
	
	
	public static void main(String[] args) {

		/*final List<String> modifiable = new ArrayList<>();
		modifiable.add("Java");
		modifiable.add("is");
		final List<String> unmodifiable = Collections.unmodifiableList(new ArrayList<String>(modifiable));
		System.out.println("Before modification: " + unmodifiable);
		modifiable.add("the");
		modifiable.add("best");
		System.out.println("After modification: " + unmodifiable);*/
		
				
		ObjectOriented  obj1 = new ObjectOriented();
		obj1.setName("Tapan");
		obj1.setAge(32);
		
		ObjectOriented  obj2 = new ObjectOriented();
		obj2.setName("Ashok");
		obj2.setAge(42);
		
		System.out.println("Obj1: "+obj1);
		System.out.println("Obj2: "+obj2);
		
		ObjectOriented  obj3 = new ObjectOriented();
		System.out.println("Obj3: "+obj3);
		
		obj3=obj1;
		System.out.println("Obj3: "+obj3);
		
		
		
	}

}
