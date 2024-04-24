/* question-
CLASS NAME-Special number
INSTANCE VARIABLE(int n )-to take the inputs.
MEMBER METHODS-
-Special_number(int nn)-to reinitialize the number n=nn.
-Intfact(int)-will return the factorial of that number.
-IntSumOfDigits(int)-will return the sum of the factorial of each digit by calling the function intfact(int).
-Void check()-will check and print weather the number is a special number or not by calling the function IntSumOfDigits(int).
Implement the main function to create object and call the above methods.
*/
import java.util.*;
public class Special_Number{
    int n;
    Special_Number(int nn){
        n=nn;
    }

    int fact(int a){
        int f=1;
        for(int i=1;i<=a;i++){
            f=f*i;
        }
        return f;
    }

    int sumofdigits(int m){
        int s=0;
        for(int i=m;i>0;i=i/10){
            int d=i%10;
            s=s+(fact(d));
        }
        return s;
    }

    void check(){
        if(sumofdigits(n)==n)
            System.out.println("Special Number");
        else
            System.out.println("Not a Special Number");
    }

    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        Special_Number ob=new Special_Number(a);
        ob.check();        
    }
}
