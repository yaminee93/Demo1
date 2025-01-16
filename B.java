class B 
{
int x = 100;

public void m1()
{ 
System.out.println(" m1 called");
int y = 200;
System.out.println(y);
}

public static void main(String[] args)
{
System.out.println(" main method called");
B b = new B();
System.out.println(b.x);
b.m1();
int z = 300;
System.out.println(z);
System.out.println("value of z: "+z);
}
}


