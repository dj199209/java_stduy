### eclipse的运用
#### 源码加载

```java
1.点 “window“-> “Preferences”-> “Java” -> “Installed JRES”；
2.此时"Installed JRES"右边是列表窗格，列出了系统中的JRE 环境，选择你的JRE，然后点边上的“Edit...“， 会出现一个窗口(Edit JRE) ；
3.选中rt.jar文件的这一项：“C:\Java\jdk1.5.0_04\jre\lib\rt.jar” 点 左边的“+”号展开它（JDK实际安装路径以你的为准）； 
4.展开后，可以看到“Source Attachment:(none)”，点这一项，点右边的按钮“Source Attachment...“，选择你的JDK目录下的 “src.zip”文件；
5.一路点“ok”结束。
```
![image](http://wx2.sinaimg.cn/mw690/9df884d2gy1g2kqj5afb9j20jt0gbt9p.jpg)

![](http://ww1.sinaimg.cn/large/9df884d2gy1g2kqks1yuwj20el0fe3ze.jpg)

![](http://ww1.sinaimg.cn/large/9df884d2gy1g2kqkzroqyj20gq099t91.jpg)

![](http://ww1.sinaimg.cn/large/9df884d2gy1g2kql4pu2pj20qo0f0dgx.jpg)
#### class文件的使用
![image](https://ws3.sinaimg.cn/large/9df884d2gy1g2jigdk65gj20fx0iqjsv.jpg)
![image](https://ws3.sinaimg.cn/large/9df884d2gy1g2jklrj2v2j213f0j9tc5.jpg)
![image](https://ws4.sinaimg.cn/large/9df884d2gy1g2jknoe0h4j20hv0powfo.jpg)
```java
A:程序的编译和运行的环境配置(一般不改)

- window -- Preferences -- Java
- 编译环境：Compiler	默认选中的就是最高版本。
- 运行环境：Installed JREs	默认会找你安装的那个JDK。建议配置了Java的环境变量。
- 问题：
  - 低编译，高运行。可以。
  - 高编译，低运行。不可以。
  - 建议，编译和运行的版本一致。
```
![image](https://ws3.sinaimg.cn/large/9df884d2gy1g2jkqzjk7uj214r0jcaew.jpg)

```java
B:如何去掉默认注释?
- window -- Preferences -- Java -- Code Style -- Code Templates
- 选择你不想要的内容，通过右边Edit编辑。
- 注意：请只删除注释部分，不是注释部分的不要删除。
```

![image](https://wx3.sinaimg.cn/large/9df884d2gy1g2jkx4cxg6j20l10jljtr.jpg)

```java
C:行号的显示和隐藏

- 显示：在代码区域的最左边的空白区域，右键 -- Show Line Numbers即可。
- 隐藏：把上面的动作再做一次。
```

![image](https://ws2.sinaimg.cn/large/9df884d2gy1g2jkymxoe9j20a809r74i.jpg)
```java
D:字体大小及颜色

- a:Java代码区域的字体大小和颜色：
  - window -- Preferences -- General -- Appearance -- Colors And Fonts --Java修改 -- Java Edit Text Font
- b:控制台
  - window -- Preferences -- General -- Appearance -- Colors And Fonts -- Debug -- Console font
- c:其他文件
  - window -- Preferences -- General -- Appearance -- Colors And Fonts -- Basic -- Text Font
```
![image](https://ws3.sinaimg.cn/large/9df884d2gy1g2jl3fvewqj212j0fd0wm.jpg)
改变console台的字体
![image](https://ws2.sinaimg.cn/large/9df884d2gy1g2jl5mf48lj213m0jm424.jpg)
![image](https://wx2.sinaimg.cn/large/9df884d2gy1g2jl8fbk2oj20jn0sw0w5.jpg)
```java
E:窗体给弄乱了，怎么办?
- window -- Reset Perspective
```
![image](https://ws3.sinaimg.cn/large/9df884d2gy1g2jlabplwwj20eh07ojsc.jpg)
```java
G:取消悬浮提示

- window -- Preferences -- Java--Editor--Hovers。右边将Combined Hover勾去掉。
- 这样代码的悬浮框就不会自动出现了。如果想看提示，将光标悬浮在代码上，按F2即可。
```
![image](https://wx3.sinaimg.cn/large/9df884d2gy1g2jld6f18qj20kt0i4wgq.jpg)

```java
A:Alt+/ 起提示作用
```

![image](https://wx3.sinaimg.cn/large/9df884d2gy1g2jlf82i2rj20k306xjrr.jpg)

![image](https://ws4.sinaimg.cn/large/9df884d2gy1g2jlgiv9ehj20ic07wmxv.jpg)

![image](https://ws4.sinaimg.cn/large/9df884d2gy1g2jlhejx79j20et06u0tc.jpg)
```java
B:main+alt+/,syso+alt+/,给出其他提示
```
![image](https://ws1.sinaimg.cn/large/9df884d2gy1g2jljcclh6j20mp0cnjt7.jpg)

```java
Alt+/的配置
```
![image](https://ws3.sinaimg.cn/large/9df884d2gy1g2jlobol9mj214i0m3gpp.jpg)
```java
/*+回车    生成多行注释
```
![image](https://ws2.sinaimg.cn/large/9df884d2gy1g2jlqb4yu6j210o07p3za.jpg)
#### A:新建 ctrl + n
##### 新建项目
![image](https://wx4.sinaimg.cn/large/9df884d2gy1g2jlu73aqwj216k0qdaf3.jpg)
##### 新建包
![image](https://ws3.sinaimg.cn/large/9df884d2gy1g2jlwsjw94j21d80p80we.jpg)
##### 新建class
![image](https://wx4.sinaimg.cn/large/9df884d2gy1g2jlz8khisj216e0neae1.jpg)
#### B:格式化  ctrl+shift+f
#### C:导入包  ctrl+shift+o 

#### D:注释  ctrl+/,ctrl+shift+/,ctrl+shift+\

![image](https://wx3.sinaimg.cn/large/9df884d2gy1g2jm9lwnnej20kh06k74n.jpg)

#### E:代码上下移动 选中代码alt+上/下箭头

#### F:查看源码  选中类名(F3或者Ctrl+鼠标点击)

#### G:查找具体的类 ctrl + shift + t
![image](https://ws3.sinaimg.cn/large/9df884d2gy1g2ke2sa69mj20ih0hnabw.jpg)

#### H:查找具体类的具体方法 ctrl + o(相当于大纲视窗)
![image](https://wx4.sinaimg.cn/large/9df884d2gy1g2ke489uplj20hs0hnt9g.jpg)

#### I:给建议 ctrl+1,根据右边生成左边的数据类型,生成方法
![image](https://wx2.sinaimg.cn/large/9df884d2gy1g2keh2a6tej20rl0cgtan.jpg)
![image](https://ws3.sinaimg.cn/large/9df884d2gy1g2kek7g4jxj20ni0h6wgg.jpg)

#### J:删除代码 ctrl + d

#### K:抽取方法alt + shift + m 
![image](https://wx2.sinaimg.cn/large/9df884d2gy1g2keo27mqvj20u20l6q68.jpg)

#### L:改名alt + shift + r 

![image](https://wx4.sinaimg.cn/large/9df884d2gy1g2kepscwusj20ff056dg2.jpg)
#### alt + shift + s
```java
* A:自动生成构造方法
* B:自动生成get/set方法
```
![image](https://wx3.sinaimg.cn/large/9df884d2gy1g2kexlj0ldj20i40g9q42.jpg)
#### Java开发工具
```java
* A:jar是什么?
	* jar是多个class文件的压缩包。
* B:jar有什么用?
	* 用别人写好的东西	
* C:打jar包
	* 选中项目--右键--Export--Java--Jar--自己指定一个路径和一个名称--Finish
* D:导入jar包
	* 复制到项目路径下并添加至构建路径。
```
![image](https://ws2.sinaimg.cn/large/9df884d2gy1g2kfdva7z9j21hc0r6wm4.jpg)
![image](https://ws1.sinaimg.cn/large/9df884d2gy1g2kfjyoh0xj20ke0pugof.jpg)
#### Eclipse中如何删除项目和导入项目
```java
* A:删除项目
	* 选中项目 – 右键 – 删除
		* 从项目区域中删除
		* 从硬盘上删除
* B:导入项目
	* 在项目区域右键找到import
	* 找到General，展开，并找到
	* Existing Projects into Workspace
	* 点击next,然后选择你要导入的项目
	* 注意：这里选择的是项目名称
```
![image](https://wx3.sinaimg.cn/large/9df884d2gy1g2kfqk14qqj20oo0fgmzb.jpg)
#### API
* 就是Java提供给我们使用的类，这些类将底层的实现封装了起来
* 我们不需要关心这些类是如何实现的，只需要学习这些类如何使用。
##### Object类的概述(顶层父类)
```java
* A:Object类概述
	* 类层次结构的根类
	* 所有类都直接或者间接的继承自该类
* B:构造方法
	* public Object()
	* 回想面向对象中为什么说：
	* 子类的构造方法默认访问的是父类的无参构造方法
```
##### Object类的hashCode()方法
![image](https://wx4.sinaimg.cn/large/9df884d2gy1g2kpyqz26lj20gq01qa9v.jpg)
![image](https://ws2.sinaimg.cn/large/9df884d2gy1g2kqokq91ej20ms03wglr.jpg)
![image](https://ws3.sinaimg.cn/large/9df884d2gy1g2kqsr0emdj20mo0noabu.jpg)
##### Object类的getClass()方法
* 返回此对象的运行实类
* getclass返回的一个class
![image](https://wx1.sinaimg.cn/large/9df884d2gy1g2kqyug30bj20cq01kjr9.jpg)
![image](https://ws2.sinaimg.cn/large/9df884d2gy1g2kqvgoquvj20g20bujrv.jpg)
![image](https://ws3.sinaimg.cn/large/9df884d2gy1g2kr57knq7j20fx024jr9.jpg)

![image](https://ws2.sinaimg.cn/large/9df884d2gy1g2kr9l94zvj20k30lfta7.jpg)

##### Object类的toString()方法
![image](https://wx1.sinaimg.cn/large/9df884d2gy1g2krb6gifnj20aq01ijrd.jpg)
![image](https://wx2.sinaimg.cn/large/9df884d2gy1g2krdenx6qj20iz09a0uv.jpg)
![image](https://wx3.sinaimg.cn/large/9df884d2gy1g2krhmi65oj20pe04mabc.jpg)
![image](https://ws4.sinaimg.cn/large/9df884d2gy1g2kriso8rsj20lf01iaa6.jpg)
你是哪个类然后以16进制返回了

![image](https://wx4.sinaimg.cn/large/9df884d2gy1g2kryieg2pj212d0j042g.jpg)

![image](https://ws4.sinaimg.cn/large/9df884d2gy1g2ks5q83nsj20oa086t9d.jpg)

![image](https://wx2.sinaimg.cn/large/9df884d2gy1g2ks7fxoh1j20q904vtaf.jpg)

![image](https://wx3.sinaimg.cn/large/9df884d2gy1g2ks9jvoysj20c50c2jrx.jpg)

![image](https://ws4.sinaimg.cn/large/9df884d2gy1g2ksa07jooj20i102ujrb.jpg)

##### Object类的equals()方法

![image](https://ws1.sinaimg.cn/large/9df884d2gy1g2ksdzoal1j20c301m0sq.jpg)

![image](https://wx3.sinaimg.cn/large/9df884d2gy1g2ksn0fjy7j20pg05yac3.jpg)

![1556617617313](C:\Users\dj\AppData\Roaming\Typora\typora-user-images\1556617617313.png)

![image](https://ws3.sinaimg.cn/large/9df884d2gy1g2ksyw5da2j20i10ed3ze.jpg)

* 重写后比较的是对象的属性值

  ##### ==号和equals方法的区别

  共同点:都可以作比较,返回值都是boolean

  区别:1.==号比较运算符,既可以比较基本数据类型.也可以比较引用数据类型,基本数据类型比较的是指,引用数据类型比较的是地址值

  2.equals方法在没重写之前,比较的是地址值,底层依赖的是==号,但是比较地址值是没意义的,我们需要重写equals方法,比较对象中的属性值,只能比较引用数据类型.

