package com.study.day11.object;

import com.study.bean.Student;

public class Demo4_Equals {
/*
 *  比较两个对象是否相等
  public boolean equals(Object obj) {
        return (this == obj);
    }
 
 */
	public static void main(String[] args) {
		
		Student s1 = new Student("张三",23);
		Student s2 = new Student("张三",23);
		boolean b = s1.equals(s2);
		System.out.println(s1 == s2);
		System.out.println(b);//重写后比较的是对象的属性值
	}

}
