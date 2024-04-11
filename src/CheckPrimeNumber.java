import java.util.Scanner;

public class CheckPrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        for(int i =2;i<=n;i++) {
                System.out.println(i+"\t"+(checkPrime1(i) ?" It is an Prime Number":"It is not an Prime Number")+"\t"+(checkPrime2(i,i/2)?" It is an Prime Number":" It is not an Prime Number"));
        }
    }

    private static boolean checkPrime1(int n) {
        /*check is divisible by itself and 1*/
        //loop
        int factor=0;
        for(int i =1;i<=n;i++){
            if (n%i==0){
                factor++;
            }
        }
        return factor==2;
    }
    private static boolean checkPrime2(int n,int i) {
        /*check is divisible by itself and 1*/
        //recursion
        if(i==1)
            return true;
        else if (n%i==0)
            return false;
       else
           return checkPrime2(n,--i);
    }
}
