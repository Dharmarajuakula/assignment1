import java.util.*;
class sortarray
{
public static void main(String args[])
{
int nums[] = {2,4,5,7};
int l=nums.length;
int[] res = new int[l];
int index=0; 
for (int i = 0; i<l; i++)
{
if(nums[i]%2==0)
{
res[index]=nums[i];
index=index+2;
}
}
int index1=1; 
for (int i = 1; i<l; i++)
{
if(nums[i]%2!=0)
{
res[index1]=nums[i];
index1=index1+2;
}
}
for(int i=0;i<res.length;i++)
{
System.out.print(res[i]+" ");
}
}
}
 