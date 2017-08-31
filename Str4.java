package morningbatchpackage;

public class Str4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	String str1="suresh";
	String str2="mahesh";
	
	int length= str1.length();
	System.out.println("String length = "+length);
	//System.out.println(str1.length());
	int index_value=str1.indexOf("r");
	System.out.println(index_value);
	//System.out.println(str1.indexOf("r"));
	System.out.println(str1.concat(str2));
	String s=str1.substring(3); // it will print the sub string from the specified index
	System.out.println(s);
	
	String s1=str1.substring(2, 5); //starts from index 2 and will print till index 4
	System.out.println(s1);
	
	}

}
