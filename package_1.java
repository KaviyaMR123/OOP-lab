package packageone;
public class A 
{
    public void methodClassOne() 
    {
        System.out.println("Message from class A in packageone");
    }
}

package packagetwo;
public class B 
{
    public void methodClassTwo()
    {
        System.out.println("Message from class B in packagetwo");
    }
}

import packageone.A;
import packagetwo.B;
public class Main 
{
    public static void main(String[] args) 
    {
        A instanceA = new A();
        B instanceB = new B();
        instanceA.methodClassOne();
        instanceB.methodClassTwo();
    }
}


