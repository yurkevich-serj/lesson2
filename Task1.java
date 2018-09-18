import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите целое положительное или отрицательное числo: ");
		int num = in.nextInt();
		if( num >= 0 && num%10 == 7 ) {
			System.out.println("Введеное Вами число " + num + " оканчивается на цифру семь");
		}
		else if (num < 0 && num%10 == -7) {
			System.out.println("Введеное Вами число " + num + " оканчивается на цифру семь");
		}
		else {
			System.out.println("Введеное Вами число " + num + " не оканчивается на цифру семь");
		}
	}
}