import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите сумму в рублях: ");
        int a = in.nextInt();
        int b = a % 100;
        int c = a % 10;
        if ( b >= 11 && b <= 19) {
        	System.out.println("У вас есть " + a + " рублей!");
        }
        else if ( c == 1) {
			System.out.println("У вас есть " + a + " рубль!");
		}
		else if (c <= 4 && c >= 2) {
			System.out.println("У вас есть " + a + " рубля!");
		}
		else {
			System.out.println("У вас есть " + a + " рублей!");
		}
	}
}