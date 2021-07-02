import java.util.*;
class primecount
{
public static void main(String args[])
{
int start,end;
int count=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter starting range");
start=sc.nextInt();
System.out.println("Enter end range");
end=sc.nextInt();
for(int i=start;i<=end;i++)
{
if(i%2==0)
{
count+=1;
}
}
System.out.println(" prime count="+count);
}
}