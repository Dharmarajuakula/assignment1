import java.util.*;
class vowel{
public static void main(String args[])
{
char alphabet;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a charecter");
alphabet=sc.next().charAt(0);
switch (alphabet) {
case 'a':
case 'e':
case 'i':
case 'o': 
case 'u':
    System.out.println(alphabet+" is vowel");
    break;
  default:
    System.out.println(alphabet+" is consonant");
}
}
}