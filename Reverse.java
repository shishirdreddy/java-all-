
package morningbatchpackage;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n =758;
int s=0;
int r;
while (n!=0)
{
	r = n%10;
	s =(s*10)+r;
	n = n/10;
}
System.out.println(s);
	}

}
