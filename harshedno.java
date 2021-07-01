import java.util.*;
class harsed
{
public static void main(String args[])
{
int N,sum=0,n,rem=0,r;
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value");
N=sc.nextInt();
n=N;
while(n!=0){
rem=n%10;
sum=sum+rem;
n=n/10;
}

if(N%sum==0)
{
System.out.println(N+" Is harshed number");
}
else
{
System.out.println(N+" Is Not harshed number");
}
}
}
