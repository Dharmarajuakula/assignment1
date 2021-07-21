import java.util.*; 
class one
{
public static void main(String args[])
{
HashMap<String,Integer> m=new HashMap<String,Integer>();
String[] s={"rama","gita","rama","lakshmi","rama","gita","lakshmi","sita","lakshmi"};
for(int i=0;i<s.length;i++)
{
String key=s[i];
if(m.containsKey(key))
m.put(key,m.get(key)+1);
else
m.put(key,1);
}
for(Map.Entry<String,Integer> n:m.entrySet())
{
if(n.getValue()>2)
System.out.println(n.getKey()+"="+n.getValue()); 
}
}
}