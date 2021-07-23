import java.util.*;
class divisibility
{
public static void main(String args[])
{
ArrayList<Integer> n=new ArrayList<Integer>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter arraylist size");
int five=0;
int three=0;
int a=sc.nextInt();
for(int i=0;i<a;i++)
{
n.add(sc.nextInt());
}
System.out.println("array list"+n);
for(int j=0;j<a;j++)
{
int m=n.get(j);
if(m%5==0)
{
five=five+1;
}
if(m%3==0)
{
three=three+1;
}

}
System.out.println("5="+five);
System.out.println("3="+three);

}
}