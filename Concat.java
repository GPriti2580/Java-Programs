public class Concat {
    int method1()
    {
        System.out.println("Method 1 called");
        return 100;
    }
    int method2()
    {
        System.out.println("method 2 called");
        return 400;
    }
    public static void main(String args[])
    {
        System.out.println(new Concat().method1()+new Concat().method2());
    }


}

