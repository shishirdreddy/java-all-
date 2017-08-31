package morningbatchpackage;


class Oops31{
	
	
	void dispay(int a, int b) // a, b method parameters or method variables
	{ 
		
		//int x=a; // x and y are local variables
		//int y=b;
		System.out.print(a);
		System.out.println(b);
		}
	}


public class oops3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Oops31 obj1=new Oops31(); //obj1 reference variable for the class Oops31
	
	
	obj1.dispay(10, 20);
	obj1.dispay(20, 20);
	obj1.dispay(50, 20);
	obj1.dispay(60, 20);
	
	}

}
