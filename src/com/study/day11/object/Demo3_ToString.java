package com.study.day11.object;

import com.study.bean.Student;

public class Demo3_ToString {

	public static void main(String[] args) {
		Student st = new Student("张三",23);
		String str = st.toString();
		System.out.println(str);
		System.out.println("我的姓名是:"+st.getName()+ ",我的年龄是:"+st.getAge());
	}

}
