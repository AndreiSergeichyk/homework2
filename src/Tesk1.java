import java.util.Scanner;

public class Tesk1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        if(day>0&&year>=0){//проверяет корректность введения дня и года
            nextDay(day,month,year);
        }else System.out.println("введены некорректные данные");
    }

    private static void nextDay(int day, int month, int year) {
        switch (month){
            //для месяцов в которых 31 день
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:{
                if(++day<=31){
                    System.out.println(day+"."+month+"."+year+"г.");
                }else if(day>31 && (month>=1 && month<12)){
                    System.out.println(1+"."+(++month)+"."+year+"г.");
                }else {
                    System.out.println(1+"."+1+"."+(++year)+"г.");
                }
                break;
            }
            //для месяцов в которых 30 дней
            case 4:
            case 6:
            case 9:
            case 11:{
                int maxDay = 30;
                data(day, month, year, maxDay);
                break;
                }
                //для месяца в котором 28 дней
            case 2:{
                int maxDay = 28;
                data(day, month, year, maxDay);
                break;
            }
            //для некорректно введенных месяца
            default:{
                System.out.println("введены некорректные данные");
                break;
            }
        }
    }

    private static void data(int day, int month, int year, int maxDay) {
        if(++day<=maxDay){
            System.out.println(day+"."+month+"."+year+"г.");
        }else System.out.println(1+"."+(++month)+"."+year+"г.");
    }
}
