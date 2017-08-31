package morningbatchpackage;

public class Palendrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=143;
int m=143;
int s=0;
int r=0;
while (n!=0)
{
	r=n%10;
	System.out.println(r);
	s=(s*10)+r;
	System.out.println(s);
	n=n/10;
	System.out.println(n);
}
	if (s==m)
		System.out.println("It is a palendrome");
	else
		System.out.println("It is not a palendrome");
			
	}

}
