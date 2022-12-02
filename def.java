public class def
{
  static int a=5,b=6,c;
  public static void main (String[] args)
  {
    c=a+b;
    System.out.println("Sum = "+c);
    XYZ obj=new XYZ();
    obj.get();
  }  
}
class XYZ
{

  int x=5;
  public void get()
  {
     System.out.println(x);
  }
}
