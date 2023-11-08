public class ParamertriezedMethod {
    void Method1()
    {
        System.out.println(10);
        System.out.println(64);
        System.out.println("End");
    }
    int Method2(int a, int b, int c)
    {
        System.out.println(a);
        ParamertriezedMethod obj1 = new ParamertriezedMethod();
        String s= obj1.method5(100,"Java is awsome ");

        System.out.print(s);
        return a-b;
    }
    String Method3(String s, int b, int d)
    {
        System.out.println(b+d);
        return s;
    }
    int Method4(int c, int k)
    {
        System.out.println(k);
        ParamertriezedMethod obj2 = new ParamertriezedMethod();
        int result = obj2.Method2(50,50,50);
        System.out.println(result);
        return k+10;
    }
    String method5(int a, String l)
    {
        System.out.println(a+a);
        ParamertriezedMethod obj3= new ParamertriezedMethod();
        String s= obj3.Method3("Hi",15,10);
        System.out.println(s);
        return l;

    }
    public static void main(String args[]){
        ParamertriezedMethod obj = new ParamertriezedMethod();
        System.out.println("Start");
        int result = obj.Method4(20,40);
        System.out.println(result);
        obj.Method1();

    }

}
