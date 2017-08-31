package morningbatchpackage;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
		/*
		 * Array is a co
		 * 
		 * mbination Homogeneous elements type
		 * Array Syntax:  <<datatype>> <<variable_name>> []
		 * e.g. int a[];
		 * Array initialization: int a[]= {10,20,30};  
		 *  Here a[] -> integer array
		 *  Array size will automatically detected
		 *  If you want to array size use length() method and which returns an integer value
		 *  Each elment in the array containing an index starting from zero
		 *  Array index ends with (arraysize-1)
		 *  if an array contains 5 elements means array index starts from 0 and ends with 4
		 *  Anytime if you try to access, beyond the array index, then Array Index out of Bounds exception will thrown
		 *  
		 */
				
		int a[]={10,20};
		int array_size=a.length;
		
		System.out.println("Array size="+array_size);
		System.out.println("Array First element="+a[0]);
		System.out.println("Array Second element"+a[1]);
		//System.out.println(a[2]); // Array of Bounds Exception
	}

}
