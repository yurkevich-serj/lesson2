import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите время в секундах: ");
		int a = in.nextInt();
		int hours, minutes, seconds;
		hours = a/3600;
		minutes = (a%3600)/60;
		seconds = (a%3600)%60;
		System.out.println(hours + "ч." + minutes + "м." + seconds + "с.");
	}
}
