import java.util.ArrayList;
import java.util.Scanner;

public class GenerateTribnocciNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter value :");
        int input = sc.nextInt();

        System.out.println(createFibnocciSeries(input));

    }

    private static ArrayList<Integer> createFibnocciSeries(int input) {

        ArrayList<Integer> al = new ArrayList<>();
        int a,b,c,d;
        a=0;
        b=1;
        c=2;
        al.add(a);
        al.add(b);
        al.add(c);
        for (int i=1;i<=input-3;i++){
            d= a+b+c;
            al.add(d);
            a=b;
            b=c;
            c=d;
        }
        return al;

    }
}
