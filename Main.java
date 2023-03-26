import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Faktorijel od N
        System.out.print("Unesi broj N: ");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int x = 1;
        int F = 1;
        for (x = 1; x <= N; x++) {
            F = F * x;}
        System.out.print(F);
    }
}