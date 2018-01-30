> 需求：创建一辆车，车有配置、价格，还有车的parts部分属性，包括车轮的配置、价格，车门的配置、价格

## 我的做法
1. Car实体类，包括String model, String price, List<Part> parts属性， addPart(Part part)添加部件
2. Part部件类，包括model，price，type属性

这样子开发起来很简单，添加部门只需要addpart。

## 抽象文档模式
1. 创建model、type、price、parts接口，即将属性分离出来。
2. 所有的部件继承Document接口，包括get,put方法
3. car的构造方法为一个Map参数，map放入车的属性，车的部件，存在Document的map中
4. 所有东西都在map中，car继承的AbstractDocument，直接取即可。

## 区别

我的想法比较简单，但是维护比较麻烦，用文档模式，比较抽象，但是维护简单，一目了然。


