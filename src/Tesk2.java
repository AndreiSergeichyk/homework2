import java.util.Scanner;

public class Tesk2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = 20;
        int f = 50;

        ychastok(a, b, c, d, e, f);
    }

    private static void ychastok(int a, int b, int c, int d, int e, int f) {
        if((e >= a && e >= c && f >= (b + d))||
                (e >= b && e >= c && f >= (a + d))||
                (e >= a && e >= d && f >= (b + c))||
                (e >= b && e >= d && f >= (a + c))||
                (f >= a && f >= c && e >= (b + d))||
                (f >= b && f >= c && e >= (a + d)) ||
                (f >= a && f >= d && e >= (b + c))||
                (f >= b && f >= d && e >= (a + c))){
            System.out.println("Да могут");
        }else System.out.println("нет не могут");
    }
}
