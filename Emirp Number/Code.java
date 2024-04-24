/*Class name-emirp
Instance variable- int n
Member method –emirp(int nn)-reinitialize to n=nn
int isprime(int m)will return 1 if prime number or else return 0.
int reverse (int num)-will return the reverse of the number .
void check()-will check the number is emirp number or not,by calling its functions.
Implement the main function to create object and call the above methods.
*/
import java.util.*;
public class emirp{
    int n;
    emirp(int nn){
        n=nn;
    }

    int isprime(int m){
        int c=0;
        for(int i=1;i<=m;i++){
            if(m%i==0)
                c++;
        }
        if(c==2)
            return 1;
        else 
            return 2;
    }

    int reverse(int num){
        int r=0;
        for(int i=num;i>0;i=i/10){
            int d=i%10;
            r=r*10+d;
        }
        return r;
    }

    void check(){
        if((isprime(n)==1)&&(isprime(reverse(n))==1))
            System.out.println("It is an emirp number");
        else
            System.out.println("It is not an emirp number");
    }

    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        emirp ob=new emirp(a);
        ob.check();
    }
}
