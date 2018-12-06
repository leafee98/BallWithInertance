# 项目描述

本项目的**理想实现**为一个可以移动的球，不同之处为用户直接操作加速度，来使球可以有平滑的启动和停止，考虑添加碰撞边界弹回的效果

#  INSTALL

* 本项目为Java项目，在运行前请先确认您已正确配置Java环境。
* 本项目通过`maven`进行项目的构建，使用`mvn compile exec:java`即可进行项目的编译和运行。
* 本项目使用`VScode`进行开发

# MANIFEST

```
\---BallWithInertance
    |   .classpath
    |   .gitignore
    |   .project
    |   LICENSE
    |   pom.xml
    |   README.md
    |
    +---.settings
    |       org.eclipse.core.resources.prefs
    |       org.eclipse.jdt.apt.core.prefs
    |       org.eclipse.jdt.core.prefs
    |       org.eclipse.m2e.core.prefs
    |
    +---.vscode
    |       settings.json
    |
    \---src
        +---main
        |   \---java
        |       \---ball
        |               Ball.java
        |
        \---test
            \---java
                \---ball
                        Ball.java
```

# TAGS

见代码仓库的tags

# FAQ

* **为什么我使用`mvn compile exec:Java`会提示没有此命令呢?**

  在此之前请先确定您已经正确安装了maven，并且已经正确添加环境变量

* **这个项目最后算是个什么呢?**

  仅是一个供在学习的人们一个休闲娱乐与学习参考的代码，虽然更多的是开发者闲着没事把自己一次实验的代码拿出来并且准备做一个大大大的改进 （￣︶￣）↗　

* **我很喜欢这个项目，想要拿去做个参考，有什么许可方面的限制吗？**

  如果仅是个人使用的话，并没有什么限制，如果需要修改之后发布的话，请参照本项目的**[许可证][https://github.com/leafee98/BallWithInertance/blob/master/LICENSE] **之后酌情进行操作

* **项目描述里面的功能根本就完全没有哇，怎嘛回事？**

  由于此开发者比较懒  =￣ω￣=  ，项目还未完成，新特性敬请期待吧~

# COPYING

本项目使用`BSD 2-Clause “Simplified” License`许可证，在遵守许可证的前提下，可以尽可能玩的高兴 

(＾Ｕ＾)ノ~ＹＯ

# CREDITS

`Leafee98`

# HISTORY

本项目灵感来源于一次**面向对象程序设计Java的课程实验**，经历了由最开始勉强**创建好一个小小球和一个大大板以及四个大小不一的居左的按钮**、勉强**实现小小球在每次按钮按下后向相应方向闪现**到现在**小小球成了一个大大球并且大大板也有所收敛，而且小小球也平滑移动**

# 关于本项目

本项目原本为`面向对象程序设计Java`的一次实验，实验原本要求为“当点击按钮时使小球进行移动”，现在将其放到这里并进行进一步的改进和美化。