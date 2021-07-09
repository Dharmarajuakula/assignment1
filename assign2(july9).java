class sumchar
{  
public static void main(String[] args)
{  
String str= "Aditya Degree College";  
int sum=0;  
for(int i=0;i<str.length();i++) 
{  
  if(str.charAt(i)!=' ')  
  sum++;  
}  
System.out.println("sum of strings: "+sum);  
}  
} 
