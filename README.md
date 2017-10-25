# Effective Java
Learn java with a book of effective java

## 1.前言(Preface)

## 2.创建和销毁对象(Create and Destroy objects)
### 第1条：考虑用静态方法代替构造器(Consider using static method instead of constructor)
```
public static Boolean valueOf(boolean b){
    return b ? Boolean.TRUE : Boolean.FALSE;
}
```
> 静态工厂方法与构造器不同的优势在于：
- 有名称，例如构造器BigInteger(int,int,Random),返回的BigInteger可能为素数，如果用名为BigInteger.probablePrime的静态方法来表示更清楚
- 不必在每次调用它们的时候都创建一个新的对象
- 可以返回原返回类型的任何子类型的对象
- 在创建参数化类型实例的时候使代码变得简单

> 缺点：
- 类如果不含有公有的或者受保护的构造器就不能被子类化
- 它们与其他的静态方法实际上没有任何区别

> 总结
- 当一个类需要多个带有相同签名的构造器时，就用静态工厂方法代替构造器
- Builder模式可以解决多参数问题，最好也是只在很多参数的情况下使用

### 第2条：遇到多个构造器参数时要考虑用构建器

## 3.对于所有对象都通用的方法(Common methods for all objects)

## 4.类和接口(Class and Interface)

## 5.泛型(Generics)

## 6.枚举和注解(Enumeration and Annotation)

## 7.方法(Methods)

## 8.通用程序设计(General Programming)

## 9.异常(Exception)

## 10.并发(Concurrent)

## 11.序列化(serialization)