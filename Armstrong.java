package morningbatchpackage;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=153;
int original = n;
int s=0;
int r=0;
while (n!=0)
{
	r=n%10;
	System.out.println(r);
	s=s+(r*r*r);
	System.out.println(s);
    n=n/10;
    System.out.println(n);
}
if (s==original)
System.out.println("it is armstrong");
else
	System.out.println("it is not armstrong");}

}
