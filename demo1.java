import java.time.Year;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        System.out.println("Nhap vao nam :");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " la nam nhuan");
        }
        else if (year % 100 != 0 && year % 400 != 0) {
            System.out.println(year + " khong phai nam nhuan");
        }
        else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " la nam nhuan");
        }
        else {
            System.out.println(year + " khong phai nam nhuan");
        }
    }
}
