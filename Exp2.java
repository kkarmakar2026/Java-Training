class Exp2
{
  // Method taking argument and return the value
  public int method1(int x, String y)
 {
     System.out.println("method1");
     return 10;
 }
  
 // Method not taking argument and not return the value
  public void method2()
{
   System.out.println("method2");
}

 // Method taking argument and not return the value
  public void method3(String name)
{
   System.out.println("method3");
}

 // Method not taking argument and not return the value
public String method4()
{
  System.out.println("method4");
  return "hello";
}

   public static void main(String[] args)
{
   Exp2 obj = new Exp2();

   System.out.println(obj.method1(1,"abc"));
   obj.method2();
   obj.method3("xyz");
   obj.method4();
}
}  