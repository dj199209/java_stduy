# �߼�������Ļ����÷�
	*&,|,^,!	
	*&&,|| 
## &&��&������
	* a:���ս��һ����
	* b:&&���ж�·Ч���������false���ұ߲�ִ�С�

## ||��|������
	* a:���յĽ����һ��
	* b:||���ж�·Ч��,���Ϊtrue,�ұ߲�ִ��
	```java
	class Demo2_Operator {
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		System.out.println((++x==3)&(++y == 4));
		System.out.println("x="+x);
		System.out.println("y="+y);
		int x1 =3;
		int y1 =4;
		System.out.println((++x1 == 3)&&(++y1 ==4));
		System.out.println("x1="+x1);
		System.out.println("y1="+y1);
	}
}
	```
# λ�����
## λ�����������ص�
	* ^���ص㣺һ�����ݶ���һ������λ������Σ����������䡣
	```java
	class Demo2_Operator {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		System.out.println(5^10^10);//һ�����������,�Ǹ���������.-----5
		System.out.println(5^10^5);//һ�����������,�Ǹ���������.------10
	}
}
```
## ��:
	* ���Լ�ʵ���������������Ľ���
	* ע�⣺�Ժ󽲿εĹ����У���û����ȷָ�����ݵ����ͣ�Ĭ��int���͡�
	```java
	class Demo2_1_Operator {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		int x= 10;
		int y =5;
		//����1:�������������
		/*int  temp;
		temp = x;
		x = y;
		y =temp;*/
		//����2:����Ҫ���������������һ
		x = x +y;  //x=15
		y = x -y;  //y=10
		x = x -y;  //x=5
		//�˷������ܻᳬ��int��ȡֵ��λ
		//����3 ��^����
		/*x= x^y;
		y=x^y;
		x=x^y;*/
		System.out.println("x="+x+",y="+y);
	}
}
```
# ��Ԫ�����
```java
class Demo1_Operator {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		int x = 10;
		int y = 165;
		int z;
		z= (x >y)?x:y;
		System.out.println("z= "+z);
	}
}
```
# ����¼��
* ���ո�ʽ��
```java
* a:����
	* ��ʽ��
		* import java.util.Scanner; 
		* λ�ã� ��class���档
* b:��������¼�����
		* ��ʽ��
		* Scanner sc = new Scanner(System.in);
* c:ͨ�������ȡ����	
	* ��ʽ��
		* int x = sc.nextInt();
```
```java
import java.util.Scanner;
class Demo2_Operator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������:");
		int x = sc.nextInt();
		System.out.println("x = "+x);
	}
}
```
## ��ȡ���������е����ֵ
```java
class Test1_1_Operator {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		//��ȡ���������е����ֵ
		int a = 10;
		int b = 20;
		int c = 30;
		int temp =(a>b)?a:b;
		int max =(temp>c)?temp:c;
		System.out.println("max="+max);
	}
}
```
## �Ƚ����������Ƿ���ͬ
```java
class Test1_Operator {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		//�Ƚ����������Ƿ���ͬ
		int x = 10;
		int y = 10;
		boolean b = (x==y) ? true :false;
		//boolean b =(x==y);
		System.out.println("������" +b);
	}
}
```
## ����¼����ϰ������¼���������ݣ�����������������ͣ��������
```java
import java.util.Scanner;
class Text2_1_Scaner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������:");
		int x = sc.nextInt();
		System.out.println("������ڶ�������:");
		int y = sc.nextInt();
		int max = (x>y)?x:y;
		System.out.println("���ֵΪ:"+max);
	}
}
```
## ����¼����ϰ������¼���������ݣ���ȡ�����������е����ֵ
```java
import java.util.Scanner;
class Text2_2_Scaner {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ��ֵ");
		int x = sc.nextInt();
		System.out.println("������ڶ���ֵ");
		int y =sc.nextInt();
		int max =(x>y) ? x:y;
		System.out.println("����������ֵΪ:"+max);
	}
}
```
## ����¼����ϰ������¼���������ݣ��Ƚ������������Ƿ����
```java
import java.util.Scanner;
class Text3_1_Scaner {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ�Ƚϵĵĵ�һ��ֵ");
		int x = sc.nextInt();
		System.out.println("��������Ҫ�Ƚϵĵڶ���ֵ");
		int y = sc.nextInt();
		boolean b = (x==y) ;
		System.out.println(b);
		
	}
}
```
## ����¼����ϰ������¼���������ݣ���ȡ�����������е����ֵ
```java
import java.util.Scanner;
class Text3_2_Scaner {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ��ֵ");
		int x = sc.nextInt();
		System.out.println("������ڶ���ֵ");
		int y = sc.nextInt();
		System.out.println("�����������ֵ");
		int z = sc.nextInt();
		int temp = (x>y) ? x:y;
		int max = (temp>z) ? temp:z;
		System.out.println(max);
	}
}
```
# ѡ��ṹif
## ѡ��ṹ�ķ���
	* if���
	* switch���
## if����м��ָ�ʽ
	* ��ʽ1
	* ��ʽ2
	* ��ʽ3
## ���ĸ�ʽ1
```java
	if(�Ƚϱ��ʽ) {
		�����;
	}
```
 D:ִ�����̣�
	* �ȼ���Ƚϱ��ʽ��ֵ�����䷵��ֵ��true����false��
	* �����true����ִ������壻
	* �����false���Ͳ�ִ������壻
```java
class Demo1_If {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		int age = 19;
		
		if (age >= 18){
			System.out.println("�����������վ");
			
		}
		System.out.println("����");
		
	}
}
```
## ������ʾ
* a:�Ƚϱ��ʽ���ۼ򵥻��Ǹ��ӣ����������boolean����
* b:if�����Ƶ�����������һ����䣬�����ſ���ʡ�ԣ�
* ����Ƕ�����䣬�Ͳ���ʡ�ԡ�������Զ��Ҫʡ�ԡ�
* c:һ����˵����������ž�û�зֺţ��зֺž�û���������
```java
class Dmeo2_If {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		int age = 17;
		if(age >= 18 && age <= 69){
			System.out.println("�����������ҳ");
			
		}
		System.out.println("����");
	}
}
```
## if���ĸ�ʽ2
```java
if(�Ƚϱ��ʽ) {
			�����1;
		}else {
			�����2;
		}
```
##  ִ�����̣�
* ���ȼ���Ƚϱ��ʽ��ֵ�����䷵��ֵ��true����false��
* �����true����ִ�������1��
* �����false����ִ�������2��
## ������ʾ
* a:��ȡ���������нϴ��ֵ
* b:�ж�һ����������������ż��,���������������ż��
* ע�����else������û�бȽϱ��ʽ�ģ�ֻ��if�����С�
```java
class Demo3_If {
	public static void main(String[] args) {
		int x = 0;
		if (x ==1){
			System.out.println("�в�����ӭ��");
		}
		else{
			System.out.println("Ů������ӭ��");
		}
		
	}
}
```
```java
class Dmoe3_1_If {
	public static void main(String[] args) {
		//��ȡ���������нϴ��ֵ
		int x = 10;
		int y = 20;
		int z;
		if(x>y){
			z=x;
		}
		else{
			z=x;
		}
		System.out.println(z);
	}
}
```
```java
class Dmoe3_2_If {
	public static void main(String[] args) {
		//�ж�һ����������������ż��,���������������ż��
	int num = 11;
		if(num%2==0){
			System.out.println(num +"��һ��ż��");
		}
		else{
			System.out.println(num+"��һ������");
		}
	}
}
```
## if������Ԫ��������ͬһ��Ч��
## if������Ԫ�����������
	*��Ԫ�����ʵ�ֵģ������Բ���if���ʵ�֡���֮��������
## if����Ƕ��ʹ��
```java
class Demo6_If {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		int a =40;
		int b =50;
		int c =30;
		if(a>b){
			if (a>c){
			System.out.println(a + "�����ֵ");}
			else{
				System.out.println(c +"�����ֵ");
		}}
		else{
			if(b>c){
				System.out.println(b +"�����ֵ");
		}
			else{
				System.out.println(c + "�����ֵ");
			}
		}
	}
}
```
### ��ϰ1����¼��һ���ɼ����жϲ�����ɼ��ĵȼ���
90-100 ��
80-89  ��
70-79  ��
60-69  ��
0-59   ��
```java
import java.util.Scanner;
class Text1_If {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		//����¼��һ���ɼ����жϲ�����ɼ��ĵȼ���
		// 90-100 ��
		// 80-89  ��
		// 70-79  ��
		// 60-69  ��
		// 0-59   ��
		System.out.println("��������Ҫ��ѯ�ɼ��ĵȼ�,������0-100����ֵ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x > 90 && x <= 100){
			System.out.println("��");
		}
		else if(x>80 && x<=89){
			System.out.println("��");
		}
		else if(x>70 && x<=79){
			System.out.println("��");
			
		}
		else if(x>60 && x<69){
			System.out.println("����");
		}
		else if(x>0 && x<=59){
			System.out.println("��");
		}
		else{
			System.out.println("�������");
		}
	}
}
```
## switch���ĸ�ʽ
```java
switch(���ʽ) {
		      case ֵ1��
				�����1;
				break;
			    case ֵ2��
				�����2;
				break;
			    ��
			    default��	
				�����n+1;
				break;
	    }
```
```java
class Demo1_Switch {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
	String name = "rose";
	String gender = "����";
	switch(gender) {
	case "��ʿ":
		System.out.println(name +"��һ��"+gender +"ϲ���Է�˯����dota");
	break;
	case "Ůʿ":
		System.out.println(name + "��һλ"+ gender +"ϲ����ֹ�������");
	break;
	default:
		System.out.println(name + "��һλ"+ gender+ "����Լ���ά����ò");
	break;
	}
}
}
	
```
```java
class Tset2_Switch {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		int x = 2;
		int y = 3;
	switch(x){
	

		
			default:
				y++;
			case 3:
				y++;
			case 4:
				y++;
	}

System.out.println("y= "+y);
	}
}
```
