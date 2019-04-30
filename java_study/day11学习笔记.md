### eclipse的运用
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

#### H:查找具体类的具体方法 ctrl + o

#### I:给建议 ctrl+1,根据右边生成左边的数据类型,生成方法

#### J:删除代码 ctrl + d

#### K:抽取方法alt + shift + m 

#### L:改名alt + shift + r 

