import java.util.*;
class arraylist
{
public static void main(String args[])
{
ArrayList<String> a=new ArrayList<String>();
ArrayList<String> b=new ArrayList<String>();
a.add("red");
a.add("blue");
a.add("green");
a.add("pink");
b.addAll(a);
b.add("white");
b.add("yellow");
b.add("pink");
for(String s:b)
System.out.print(s+" ");
}
}