# 火星救援车

## 初始需求

火星车收到的指令分为四类：

* 探索区域信息：告知火星车，整片区域的长度（X）和宽度（Y）有多大；
* 初始化信息：火星车的降落地点（x, y）和朝向（N, S, E, W）信息；
* 移动指令：火星车可以前进（f）或后退（b）；
* 转向指令：火星车可以左转90度（l）或右转90度（r）。

由于地球和火星之间的距离很远，指令必须批量发送，火星车执行完整批指令之后，再回报自己所在的位置坐标和朝向。

## 扩展需求
下面是火星探索团队提出的其他一些需求：

应该阻止小车跑到超出整片区域坐标系的地方去

火星不是平的，而是球体，所以如果小车从坐标系的一边跑了出去，应该从另一边跑进来

火星地面上有障碍物，如果火星车遇到了障碍物导致后续指令受阻，应该停留在原地，放弃执行后续指令，并立即向地球回报

你需要自己判断，是否采纳这些需求。


