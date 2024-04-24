/*question-
CLASS NAME-Armstrong
DATA MEMBERS-int n(to store the number)
MEMBER METHODS-
-Armstrong(int nn)-initialize n with nn
-Int sumOfDigits(int n)-calculate the sum of cube of the digits in it.
-Void check()-check weather the number is armstrong number or not by calling innt sumOfDigits(int n) method.
Write a main ()to create the object of the class to call the method properly.
*/
import java.util.*;
public class Armstrong{
int n;
Armstrong(int nn){
n=nn;
}
int sumofdigits(int m){
int s=0;
for(int i=m;i>0;i=i/10)
{
int d=i%10;
s=s+((int)Math.pow(d,3));
}
return s;
}
void check(){
if(sumofdigits(n)==n)
System.out.println("its an armstrong number");
else
System.out.println("its not an armstrong number");
}
public static void main(){
Scanner sc =new Scanner(System.in);
System.out.println("enter a number");
int l=sc.nextInt();
Armstrong obj=new Armstrong(l);
obj.check();
}
}
