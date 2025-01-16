class A {

 int x = 10;

public void m1()
{ 
 System.out.println("m1 called");
 int y = 20;
 System.out.println(y);

public static void main(String[] args)
{

System.out.println(" main method called");
A a = new A();
a.m1();
int z = 30;
System.out.println(z);
System.out.println(a.x);
}
}

  
