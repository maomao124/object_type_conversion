/**
 * Project name(项目名称)：对象类型转换
 * Package(包名): PACKAGE_NAME
 * Class(类名): Ca
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/10
 * Time(创建时间)： 18:53
 * Version(版本): 1.0
 * Description(描述)： 通过引用类型变量来访问所引用对象的属性和方法时，Java 虚拟机将采用以下绑定规则：
 * 实例方法与引用变量实际引用的对象的方法进行绑定，这种绑定属于动态绑定，因为是在运行时由 Java 虚拟机动态决定的。
 * 例如，animal.eat() 是将 eat() 方法与 Cat 类绑定。
 * 静态方法与引用变量所声明的类型的方法绑定，这种绑定属于静态绑定，因为是在编译阶段已经做了绑定。
 * 例如，animal.staticEat() 是将 staticEat() 方法与 Animal 类进行绑定。
 * 成员变量（包括静态变量和实例变量）与引用变量所声明的类型的成员变量绑定，这种绑定属于静态绑定，因为在编译阶段已经做了绑定。
 * 例如，animal.name 和 animal.staticName 都是与 Animal 类进行绑定。
 */

public class Cat extends Animal
{
    public String name = "Cat：猫";
    public String str = "Cat：可爱的小猫";
    public static String staticName = "Dog：我是喵星人";

    public void eat()
    {
        System.out.println("Cat：吃饭");
    }

    public static void staticEat()
    {
        System.out.println("Cat：猫在吃饭");
    }

    public void eatMethod()
    {
        System.out.println("Cat：猫喜欢吃鱼");
    }

    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        Animal animal = new Cat();
        Cat cat = (Cat) animal; // 向下转型
        System.out.println(animal.name); // 输出Animal类的name变量
        System.out.println(animal.staticName); // 输出Animal类的staticName变量
        animal.eat(); // 输出Cat类的eat()方法
        animal.staticEat(); // 输出Animal类的staticEat()方法
        System.out.println(cat.str); // 调用Cat类的str变量
        cat.eatMethod(); // 调用Cat类的eatMethod()方法
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        Runtime r = Runtime.getRuntime();
        float memory;
        memory = r.totalMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("JVM总内存：%.3fMB\n", memory);
        memory = r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf(" 空闲内存：%.3fMB\n", memory);
        memory = r.totalMemory() - r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("已使用的内存：%.4fMB\n", memory);
        //------------------------------------------------------
    }
}
