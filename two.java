import java.util.*;
class two
{
public static void main(String args[])
{
ArrayList<Integer> l=new ArrayList<Integer>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of values on a array");
int k=sc.nextInt();
System.out.println("Enter values");
for(int i=0;i<k;i++)
{
int n=sc.nextInt();
l.add(n);
}
System.out.println(l);
System.out.println("Enter a number range");
int m=sc.nextInt();
Iterator<Integer> x=l.iterator();
while(x.hasNext())
{
if(x.next()<m+1)
{
x.remove();
}

}
for(int t=0;t<l.size();t++)
{
System.out.print(l.get(t)+" ");
}
}
}