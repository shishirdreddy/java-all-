package morningbatchpackage;


class Oops344{
	
	
	void add(int a, int b) // a, b method parameters or method variables
	{ 
		System.out.println(a+b);
		}
	
	void sub(int a, int b) // a, b method parameters or method variables
	{ 
		System.out.println(a-b);
		}
	
	void mul(int a, int b) // a, b method parameters or method variables
	{ 
		System.out.println(a*b);
		}
	
	void div(int a, int b) // a, b method parameters or method variables
	                       // method with arguments and without return type
	
	{ 
		System.out.println(a/b);
		}
	




}


public class Oops5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Oops344 obj1=new Oops344(); //obj1 reference variable for the class Oops344
	
	
	obj1.add(10, 20);
	obj1.add(30, 40);
	obj1.add(30, 70);
	obj1.sub(20, 20);
	obj1.mul(50, 20);
	obj1.div(60, 20);
	
	}

}
