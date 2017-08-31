package morningbatchpackage;

public class SearchIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String strOrig= "Qedge bangalore";
int intindex= strOrig.indexOf("Qedge");

if(intindex==-1)
{
System.out.println("Qedge not found");	
}
else
	{
	System.out.println("Found Qedge at index " + intindex);
	}
	}

}
