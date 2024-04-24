/*question-
int n = to store the number
Member Methods-
Perfect(int num)-parameterise constructor to initialise n with num.
int sum_of_fact(int num)-return the sum of factors of the number.
void check()-check whether the number is perfect or not by calling int sum_of_fact(int num). If the number is perfect print “Perfect Number” else print “Not Perfect Number”.
Write a main() to create the objectof the class and call the above functions properly.
*/
import java.util.*;
public class Perfect{
    int n;
Perfect(int num){
        n=num;
}
   int sum_of_fact(int num)  {
    int sum=0;
for(int i=1;i<num;i++){
    if(num%i==0)
    {
    sum+=i;
    }
    }
    return sum;
}
  void check(){
    int t = sum_of_fact(n);
    if(n==t)
System.out.println(" Perfect Number ");
    else
System.out.println(" Not Perfect Number ");
}
public static void main(){
     Scanner sc = new Scanner(System.in);
System.out.print("Enter the number to be checked : ");
     int a = sc.nextInt();
      Perfect obj = new Perfect(a);
obj.check();
}
}
