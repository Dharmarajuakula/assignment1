import java.util.*;
class method1
{
static void primenumber(int x,int y) 
{
int twincount=0;
int i;
for( i=x;i<=y;i++)
{

int count=0;
for(int j=1;j<=i;j++)
{
if(i%j==0)
count++;
}
if(count==2)
System.out.print(i+",");
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Starting range=");
int n=sc.nextInt();
System.out.print("Enter Ending range=");
int p=sc.nextInt();
primenumber(n,p);
}
}