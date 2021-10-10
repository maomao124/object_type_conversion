/**
 * Project name(项目名称)：对象类型转换
 * Package(包名): PACKAGE_NAME
 * Class(类名): Animal
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/10
 * Time(创建时间)： 18:51
 * Version(版本): 1.0
 * Description(描述)： 将一个类型强制转换成另一个类型的过程被称为类型转换。
 * 当对不存在继承关系的对象进行强制类型转换时，会抛出 Java 强制类型转换（java.lang.ClassCastException）异常。
 * Java 语言允许某个类型的引用变量引用子类的实例，而且可以对这个引用变量进行类型转换。
 * Java 中引用类型之间的类型转换（前提是两个类是父子关系）主要有两种，分别是向上转型（upcasting）和向下转型（downcasting）。
 * 1）向上转型
 * 父类引用指向子类对象为向上转型，语法格式如下：
 * fatherClass obj = new sonClass();
 * 其中，fatherClass 是父类名称或接口名称，obj 是创建的对象，sonClass 是子类名称。
 * 向上转型就是把子类对象直接赋给父类引用，不用强制转换。使用向上转型可以调用父类类型中的所有成员，
 * 不能调用子类类型中特有成员，最终运行效果看子类的具体实现。
 * 2）向下转型
 * 与向上转型相反，子类对象指向父类引用为向下转型，语法格式如下：
 * sonClass obj = (sonClass) fatherClass;
 * 其中，fatherClass 是父类名称，obj 是创建的对象，sonClass 是子类名称。
 *
 * 向下转型可以调用子类类型中所有的成员，不过需要注意的是如果父类引用对象指向的是子类对象，那么在向下转型的过程中是安全的，
 * 也就是编译是不会出错误。但是如果父类引用对象是父类本身，那么在向下转型的过程中是不安全的，编译不会出错，
 * 但是运行时会出现我们开始提到的 Java 强制类型转换异常，一般使用 instanceof 运算符来避免出此类错误。
 */

public class Animal
{
    public String name = "Animal：动物";
    public static String staticName = "Animal：可爱的动物";

    public void eat()
    {
        System.out.println("Animal：吃饭");
    }

    public static void staticEat()
    {
        System.out.println("Animal：动物在吃饭");
    }
}
