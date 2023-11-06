public class Demo {
    void method1()
    {
        int x = 10;
        System.out.println("method1 called");
        System.out.println(x);
        System.out.println(x+90);
        System.out.println(10+90);

        Demo obj = new Demo();
        obj.method2();
        System.out.println("x");
        System.out.println("x+90");


    }
    void method2()
    {
        System.out.println("Method2 called");
        int x =99;
        System.out.println(x);
        Demo obj1 = new Demo();
        obj1.method3();
    }
    void method3()
    {
        System.out.println("Method3 called");

    }
    public static void main(String args[])
    {
        System.out.println("Start");
        Demo obj2 = new Demo();
        obj2.method1();
        System.out.println("End");
    }
}
