import java.util.*;
class day20
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
ArrayList<Integer> N= new ArrayList<Integer>();
int size;
int k;
int num;
System.out.println("Enter larraylist Size");
size=sc.nextInt();
System.out.println("Enter array list values");
for(int i=0;i<size;i++)
{
k=sc.nextInt();
N.add(k);
}
System.out.println("list values="+N);
System.out.println("Enter a value in arraylist");
num=sc.nextInt();
N.indexOf(num);
System.out.println("Enter a values to replace");
int rep=sc.nextInt();
N.set(N.indexOf(num),rep);
System.out.println("list values="+N);
}
}