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
while(N!=0){
rem=N%10;
sum=sum+rem;
N=N/10;
}

if(N%sum==0)
{
System.out.println(n+" Is harshed number");
}
else
{
System.out.println(n+" Is Not harshed number");
}
}
}