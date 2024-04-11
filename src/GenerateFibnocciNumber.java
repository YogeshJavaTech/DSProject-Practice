import java.util.ArrayList;
import java.util.Scanner;

public class GenerateFibnocciNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter value :");
        int input = sc.nextInt();

        System.out.println(createFibnocciSeries(input));

    }

    private static ArrayList<Integer> createFibnocciSeries(int input) {

        ArrayList<Integer> al = new ArrayList<>();
        int a,b,c;
        a=0;
        b=1;
        al.add(a);
        al.add(b);
        for (int i=1;i<=input-2;i++){
            c= a+b;
            al.add(c);
            a=b;
            b=c;
        }
        return al;

    }
}
