import java.util.*;
class day20
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
LinkedList<Integer> N= new LinkedList<Integer>();
int size;
int k;
int num;
System.out.println("Enter linkedlist Size");
size=sc.nextInt();
System.out.println("Enter linked list values");
for(int i=0;i<size;i++)
{
k=sc.nextInt();
N.add(k);
}
System.out.println("list values="+N);
System.out.println("Enter a value to delte ");
num=sc.nextInt();
if(N.indexOf(num)>0)
{
System.out.println("Eliment Found");
N.remove(N.indexOf(num));
System.out.println("list values="+N);
}
else
{
System.out.println(" Eliment Not Found");
}
}
}
