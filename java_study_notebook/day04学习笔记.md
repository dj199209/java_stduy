# ѭ�����for���
## ѭ�����for���ĸ�ʽ:
```java
for(��ʼ���ʽ;�������ʽ;ѭ����Ĳ������ʽ){
ѭ����;
	}
```
## forѭ����ִ������
a.ִ�г�ʼ�������
b.ִ���ж��������,���䷵��ֵ��true����false
	*�����true,�ͼ���ִ��
	*�����false,�ͽ���ѭ����
c.ִ���������;
d.ִ��ѭ����Ĳ������ʽ
e.�ص�B����ִ��
## �ڿ���̨���10��"helloworld"
```javaclass Demo1_For {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		for (int i = 1 ;i <= 10; i++){
			System.out.println("hello,world");
		}
	}
}
```
## ���ڿ���̨�������1-10
```java
class Test1_1_For {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		for (int i = 1; i <=10 ;i++){
		System.out.println("i=" +i);
		}
	}
}
```
## ���ڿ���̨�������10-1
```java
class Test1_2_For {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		for (int i = 10; i >=1 ;i--){
		System.out.println("i=" +i);
		}
	}
}
```
## ���1-10֮������֮��
```java
class Test_2_1_For {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		int sum = 0;
		for(int i=1 ;i <=10;i++){
			sum=sum+i;
		}
		System.out.println("sum="+sum);
	}
}
```
## ���1-100֮��ż����
```java
class Test_2_2_For {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		int sum = 0;
		for(int i=1;i<=100;i++){
			if(i % 2== 0) {
			sum=sum+i;
			}
		}
		System.out.println("ż����Ϊ"+sum);
	}
}
```
## ���1-100֮��������
```java
class Test_2_3_For {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		int sum = 0;
		for(int i = 1;i<=100;i++){
			if(i % 2 == 1){
				sum = sum +i;
			}
		}
		System.out.println("������λ"+sum);
	}
}
```
## �ڿ���̨������еġ�ˮ�ɻ�����
	* ��ν��ˮ�ɻ�����ָһ����λ�������λ���ֵ������͵��ڸ�������
	* ������153����һ��ˮ�ɻ�����
	* 153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153

	����:
	1,100 - 999
	2,��ȡÿһ��λ����ֵ,��λ,ʮλ,��λ
	3,�жϸ���λ�ϵ��������Ƿ���������,������ڴ�ӡ
```java
class Test3_Flower {
	public static void main(String[] args) {
		// System.out.println("Hello World!");
		for (int i = 100; i<=999;i++ ){
			int ge = i %10;
			int shi = i/10%10;
			int bai = i /100%10;
			if (ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
				System.out.println(i);
			}
		}
	}
}
```
## ͳ�ơ�ˮ�ɻ��������ж��ٸ�
```java
class Test14_Flowercount {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		 int count = 0;
		for(int i= 100;i<=999;i++){
			int ge = i % 10;
			int shi = i /10 %10;
			int bai = i /100 %10;
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
				count++;
			}
		}
		System.out.println(count);
	}
}
```
# ѭ���ṹwhile
## ���ĸ�ʽ
```java
whileѭ���Ļ�����ʽ��
		while(�ж��������) {
			ѭ�������;
		}
		
������ʽ��

��ʼ�����;
while(�ж��������) {
	 ѭ�������;
	 �����������;
}
```
## ִ������
* a:ִ�г�ʼ�����
* b:ִ���ж��������,���䷵��ֵ��true����false
	* �����true���ͼ���ִ��
	* �����false���ͽ���ѭ��
* c:ִ��ѭ�������;
* d:ִ�п����������
* e:�ص�B������
## ���ڿ���̨�������1-10
```java
class Demo1_While {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		int x = 1;
		while (x <= 10){
			System.out.println("x="+x);
			x++;
		}
	}
}
```
## ���˼��
* ��1-100֮��
```java
class Test1_1_while {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		int sum = 0;
		int i = 1;
		while (i <= 100){
			sum +=1;
			i++;
		}
		System.out.println(i);
	}
}
```
## :ͳ��˼��
* ͳ�ơ�ˮ�ɻ��������ж��ٸ�
```java
class Test1_2_while {
	public static void main(String[] args) {
		//Test1_2_whileSystem.out.println("Hello World!");
		int count = 0;
		int i = 100;
		while (i<=999){
			int ge = i %10;
			int shi =i/10%10;
			int bai = i/100%10;
			if (ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
				count++;
			}
			i++;
		}
		System.out.println(count);
	}
}
```
# ѭ���ṹdo...while
## ���ĸ�ʽ
```java
do {
			ѭ�������;
		}while(�ж��������);
		
		������ʽ��
		��ʼ�����;
		do {
			ѭ�������;
			�����������;
		}while(�ж��������);
```
## ִ������
* a:ִ�г�ʼ�����
* b:ִ��ѭ�������;
* c:ִ�п����������
* d:ִ���ж��������,���䷵��ֵ��true����false
	* �����true���ͼ���ִ��
	* �����false���ͽ���ѭ��
* e:�ص�b������
## ���ڿ���̨�������1-10

