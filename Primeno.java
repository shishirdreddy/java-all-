package morningbatchpackage;

public class Primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=9;
int start=1;
int count=0;
while (start<=n)
{
if(n%start==0)
count = count +1;
System.out.println(count);
start++;
System.out.println(start);

}

if (count ==2)
	System.out.println(n + "is prime");
else if (count ==3)
System.out.println(n + "is not prime");	
}
}
