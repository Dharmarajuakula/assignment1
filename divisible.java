import java.util.*;
class divisibility
{
public static void main(String args[])
{
HashMap<Integer,Integer> n=new HashMap<Integer,Integer>();
Scanner sc=new Scanner(System.in);
int five=0;
int three=0;
Integer m[]={12,5,10,20,9,3,6,7,8,11};
for(int i=0;i<m.length;i++)
{
if(n.containsKey(m[i]))
n.put(m[i],n.get(m[i])+1);
else
n.put(m[i],1);
}
for(Map.Entry<Integer,Integer>i:n.entrySet())
{
if(i.getKey()%5==0)
five=five+1;
else if(i.getKey()%3==0)
three=three+1;
}
System.out.println("5="+five);
System.out.println("3="+three);
}
}
