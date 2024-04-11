import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array index");
        int index = sc.nextInt();
        System.out.println("Enter the values");
        int[] a = new int[index+1];
        for(int i=0; i<a.length-1;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the values");

        System.out.println("\n Entered the values");
        for(int j=0;j<a.length-1;j++){
            System.out.println(a[j]);
        }

    }
}
