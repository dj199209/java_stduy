package java.study.day11;


import java.study.bean.Student;

import com.study.animal.Cat;

public class Demo1 {
/*
 * 
 */
	public static void main(String[] args) {
		demo2();
		Student s = new Student("zhangs",23);
		System.out.println(s.getName()+ "---"+s.getAge());
		Cat c = new Cat();
		c.sleep();
		c.eat();
	}

private static void demo2() {
	int[] arr= {11,22,33,44,55};
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	print(arr);
}

private static void print(int[] arr) {
	// TODO Auto-generated method stub
	
}
}
