package java.study.bean;

public class Person {
	private String name;
	private int age;
	public Person() {		//atl+shift+s+c成成空参构造
	}
	public Person(String name, int age) {//alt+shift+s+o
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {//alt+shift+s+r
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
	
}
