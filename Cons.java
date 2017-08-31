package morningbatchpackage;

class Oops317 {
	Oops317() {

	}
	

	Oops317(int a, int b) {

		System.out.println("constructor passed values" + a + "\t" + b );
	}

	Oops317(int a, int b, int c) {

		System.out.println("constructor passed values" + a + "\t" + b + "\t" + c);
	}

}

public class Cons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Oops317 obj1 = new Oops317(); // default Constructor will be created
										// automatically.

		/*
		 * Constructor is also method, but always with class name and it dont
		 * have return type.
		 * 
		 * 
		 * 
		 * 
		 */

		Oops317 obj2 = new Oops317(10, 20, 30); // parameterized constructor
		Oops317 obj5 = new Oops317(10, 20, 30); // parameterized constructor
		Oops317 obj3 = new Oops317(30, 20); // parameterized constructor
		Oops317 obj7 = new Oops317(30, 20); // parameterized constructor
		Oops317 obj4 = new Oops317(10, 20, 40); // parameterized constructor

	}

}
