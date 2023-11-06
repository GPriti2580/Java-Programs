import java.awt.desktop.SystemEventListener;

public class Operations {
    void addition()
    {
        System.out.println("Addition method called");
        int a= 10;
        int b= 20;
        int addition;
        addition=a+b;
        System.out.println(addition);
        Operations obj1 = new Operations();
        obj1.substraction();
    }
    void substraction()
    {
        System.out.println("Substraction method called");
        int a=30;
        int b=56;
        int substraction;
        substraction= a-b;
        System.out.println(substraction);
        Operations obj2 = new Operations();
        obj2.multiplication();

    }
    void multiplication()
    {
        System.out.println("Multiplication method called");
        int a= 4;
        int b=2;
        int multiplication;
        multiplication= a*b;
        System.out.println(multiplication);
        Operations obj3 = new Operations();
        obj3.division();
    }
    void division()
    {
        System.out.println("division method called");
        int a= 25;
        int b= 5;
        int division;
        division= a/b;
        System.out.println(division);
    }
    public static void main(String args[])
    {
        System.out.println("Arithmatic operations start");
        Operations obj = new Operations();
        obj.addition();
        System.out.println("Operation End Sucessfully");

    }

}
