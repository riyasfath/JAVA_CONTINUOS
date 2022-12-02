class teacherr
{ 
	public int rollno = 25;
	
}
class employee extends teacherr
{
	public int salary=15000;
	public static void main(String[] args)
	{
		employee e= new employee();
		System.out.println("teacher rollno is : " + e.rollno );
		System.out.println("teacher salary is :"+ e.salary);
	}
}	