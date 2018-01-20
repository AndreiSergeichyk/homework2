import java.util.Scanner;

public class Tesk3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double d = discriminant(a,b,c);

        if(d>0){
            isPositive(a,b,d);
        }else if(d==0){
            isZero(a,b);
        }else System.out.println("Уравнение не имеет корней");
    }

    private static void isPositive(double a, double b, double d) {
        double x1;
        double x2;

        x1 = (-b+Math.pow(d,0.5))/2*a;
        x2 = (-b-Math.pow(d,0.5))/2*a;

        System.out.println("x1 = "+x1+" x2 = "+x2);
    }

    private static double discriminant(double a, double b, double c) {
        return (Math.pow(b,2) - 4*a*c);
    }

    public static void isZero(double a, double b) {
        double x1;

        x1 = -b/2*a;

        System.out.println("x1 = x2 = "+x1);
    }
}
