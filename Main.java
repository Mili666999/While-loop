import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Zbroj brojeva od 1 do N
        System.out.print("Unesi broj N: ");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int x = 1;
        int sum = 0;
        while (x <= N){
            sum = (sum+x);
            x++;
        }
        System.out.print(sum);
    }
}