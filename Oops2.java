package morningbatchpackage;

class Oops {

	
	void display(){
		System.out.println("hi there this is first oops program");
				}
	
    void show()
	{
		System.out.println("show");
		
	}
	
}

class Oops2{
public static void main(String args[]){
	
Oops s=new Oops(); // Instantiation
Oops s1=new Oops();

s.display(); // Method calling with Object/reference variable
s.show();

s1.display();
s1.show();

	}// End of main()
} // End of class