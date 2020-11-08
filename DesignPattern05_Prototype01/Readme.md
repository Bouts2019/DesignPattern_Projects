- 需求：
    1. 克隆羊，其中所有的羊的属性都是一样的
- 原始方式；
  ```java
  Sheep sheep1 = new Sheep();
  Sheep sheep2 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
  Sheep sheep3 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
  Sheep sheep4 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
  Sheep sheep5 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
  // ...
  ```
- 原型方式：
    1. 实现`Cloneable`接口
    2. 重写clone方法