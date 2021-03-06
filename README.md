

# 概述

[![GitHub](https://img.shields.io/github/license/leafee98/BallWithInertance.svg)](https://github.com/leafee98/BallWithInertance/blob/master/LICENSE)  ![GitHub last commit](https://img.shields.io/github/last-commit/leafee98/BallWithInertance.svg)  ![GitHub tag (latest SemVer)](https://img.shields.io/github/tag/leafee98/BallWithInertance.svg)  [![GitHub issues](https://img.shields.io/github/issues/leafee98/BallWithInertance.svg)](https://github.com/leafee98/BallWithInertance/issues)  ![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/leafee98/BallWithInertance.svg)  ![GitHub repo size in bytes](https://img.shields.io/github/repo-size/leafee98/BallWithInertance.svg)

本项目的**~~理想~~实现**为一个可以移动的球，不同之处为用户直接操作加速度，来使球可以有平滑的启动和停止，考虑添加碰撞边界弹回的效果

#  INSTALL

* 本项目为`maven`管理的Java项目，在运行前请先确认您已正确配置Java环境。
* 本项目`jdk`版本为`11`，不保证其它版本正常运行（不过一般都能运行就是了）。
* 本项目通过`maven`进行项目的构建，使用`mvn compile exec:java`即可进行项目的编译和运行。
* 本项目使用`VScode`进行开发
* 本项目依赖的图形包为`openjfx`，如果使用`maven`进行编译运行则不会有任何问题，如果自己使用其他IDE或其他图形包尝试构建，不保证项目能够运行

# MANIFEST

```
\---BALLWITHINERTANCE
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
        |               BallPane.java
        |               Frame.java
        |               MyAnimationTimer.java
        |
        \---test
            \---java
                \---ball
                        Ball.java
```

# TAGS

见代码仓库的tags，就是文件列表左上角切换分支的那里，可以查看标签，项目的标签会同步打过去的。

当前已有的是

```
v0.3     点击按钮即可向对应方向移动的球
v0.3.1   美化了代码
v0.5     使移动可以平滑启动平滑停止
v1.0     可以使用键盘操控小球
```



# FAQ

* **为什么我使用`mvn compile exec:Java`会提示没有此命令呢?**

  在此之前请先确定您已经正确安装了maven，并且已经正确添加环境变量

* **这个项目定位是个什么呢?**

  仅是一个供在学习的人们一个休闲娱乐与学习参考的代码，虽然更多的是开发者闲着没事把自己一次实验的代码拿出来并且准备做一个大大大的改进 `（￣︶￣）↗　`

* **我很喜欢这个项目，想要拿去做个参考，有什么许可方面的限制吗？**

  如果仅是个人使用的话，并没有什么限制，如果需要修改之后发布的话，请参照本项目的**[许可证][https://github.com/leafee98/BallWithInertance/blob/master/LICENSE] **之后酌情进行操作

* **项目描述里面的功能根本就完全没有哇，怎嘛回事？**

  由于此开发者比较懒  `=￣ω￣=`  ，项目还未完成，新特性敬请期待吧~

  好啦好啦\~惯性什么的在**这个`v0.5`版本**已经加上了哒\~       `(～o￣3￣)～`

* **我听说还有可能加上碰撞边界反弹的特性，什么时候会加上呢？**

  由于这个开发这特别特别的懒，下次写代码还不知道要什么时候，加上最近课程确实有点忙（借口），有一大堆莫名其妙的事情（借口），碰撞边界反弹的特性就随缘更新吧，咕咕咕\~\~

* **这个项目的平滑移动是怎么实现的呢？**

  哇\~哇\~，终于来了个和编程知识相关的问题，基本实现思路就是在把一个在`Pane`上的`shape`不断地`setCenterX`和`setCenterY`，然后关于平滑移动是使用`javafx`的`AnimationTimer`来实现每帧重绘一下`shape`的位置，于是看起来就像是平滑的一样

* **我想到一个问题，如果是逐帧绘制的话，我200多Hz的刷新率的屏幕上会不会唰唰唰的就跑了？**

  emm....`(￣_￣|||)`在下贫穷，没办法在200多Hz的屏幕上测试`...( ＿ ＿)ノ｜`，当然了，如果您有什么好的解决办法欢迎提出`Pull Request`

# COPYING

本项目使用`BSD 2-Clause “Simplified” License`许可证，在遵守许可证的前提下，可以尽可能玩的高兴 

`(＾Ｕ＾)ノ~ＹＯ`

# CREDITS

`Leafee98` 没错，我就是本项目有且仅有的唯一一位开发者\~`(￣▽￣)"`

# NEWS

* 12/06/2018  --- 不知道怎么回事突然想起来想写一写这一份代码，且做娱乐，搞起\~ `<(￣︶￣)↗[GO!]`于是便有了今天的`commit`和`push`，也就有了今天的`v0.5`版本，普天同庆\~\~`o(*≧▽≦)ツ┏━┓`
* 12/08/2018  --- 突然又想写点儿什么，于是就把本项目拿出来啦，本次截至到`v1.0`版本，已经添加了键盘按键监听，即可以使用你们最最最喜欢的`WASD`操作小球的运动方向啦\~~

# HISTORY

本项目灵感来源于一次**面向对象程序设计Java的课程实验**，
经历了由最开始勉强**创建好一个小小球和一个大大板以及四个大小不一的居左的按钮**、
勉强**实现小小球在每次按钮按下后向相应方向闪现**，
到现在**小小球成了一个大大球并且大大板也有所收敛，而且小小球也平滑移动** 可谓是历尽波折十分辛苦`＞﹏＜`
不过到现在这个`v0.5`版本呢，**惯性的特点加进去了**（不就是个渐变增加速度嘛\~怎么难得倒我呢~`(￣y▽,￣)╭ `）
在12/08/2018，那个想要咕咕咕的开发者滚回来又把**键盘操作**的特性加进去啦\~\~

# 关于

本项目原本为`面向对象程序设计Java`的一次实验，实验原本要求为“当点击按钮时使小球进行移动”，现在将其放到这里并进行进一步的改进和美化，并且加上一点儿自己奇怪的想法`(●ˇ∀ˇ●)`。