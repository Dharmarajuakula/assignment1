import java.util.*;
class assign3
{
public static void main(String args[])
{
int size,n[];
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size");
size=sc.nextInt();
System.out.println("enter array eliments");
int[] arr1 = new int[size];
for(int i=0;i<size;i++)
{
arr1[i]=sc.nextInt();
}
for(int i=0;i<size;i++)
{

if(i==size-1)
{
arr1[i]=arr1[size-1]+1;
}
if(arr1[i]==0)
{
arr1[i]=arr1[size-1]+1;
}
System.out.print(" "+arr1[i]);
}

}
}