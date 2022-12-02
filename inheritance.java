class teacherr
{ 
	public int rollno = 25;
	void show(){
	System.out.println("base class");
	
	
}
}
class employee extends teacherr {
	public int salary=15000;
	void display()
	{
        System.out.println("first subclass");
            }
}
class human extends teacherr{
       
 	public int age=24;
      void print()
	{
	 System.out.println("second subclass");
}
}
class inheritance
{
	public static void main(String[] args)
	{
		human h= new human();
		System.out.println("teacher rollno is : " + h.rollno );
		//System.out.println("teacher salary is :"+ h.salary);
		System.out.println("teacher salary is :"+ h.age);
		h.show();
		
		h.print();
	}
}
	