package com.study.day11.object;

import com.study.bean.Student;

public class Demo_HashCode {
	public static void main(String[] args) {
		Object obj1 = new Object();
		int hashCode = obj1.hashCode();
		System.out.println(hashCode);
		Student s1 = new Student();
		Student s2 = new Student();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());//Ctrl + Alt+ 下键----复制一行
		
	}
}
