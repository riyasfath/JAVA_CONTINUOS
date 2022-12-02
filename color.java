class color{
string color="red";
}
class colour extends color{
	string color="black";
	void display(){
		System.out.println(color);
		System.out.println(super.color);                                                                                     
}

class superr{

	public static void main (String args[]){
	colour c= new colour();
	c.display();
}
}