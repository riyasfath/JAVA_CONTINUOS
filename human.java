class teacherr
{ 
	public int rollno = 25;
	
}
class employee extends teacherr {
	public int salary=15000;
            }
class human extends employee{
       
 	public int age=24;
      
	public static void main(String[] args)
	{
		human h= new human();
		System.out.println("teacher rollno is : " + h.rollno );
		System.out.println("teacher salary is :"+ h.salary);
		System.out.println("teacher salary is :"+ h.age);
	}
}	