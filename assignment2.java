import java.util.*;
class digit{
public static void main(String args[]){
int n;
int odd=0;
int even=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter n value:");
n=sc.nextInt();
while(n!=0)
{
int rem=n%10;
if(rem%2==1)
{
odd++;
}
else{
even++;
}
n=n/10;
}
System.out.println("odd="+odd);
System.out.println("even="+even);
}
}