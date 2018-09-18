import java.util.Scanner;

public class Task2 {
	static double square(double c){
        return c*c;
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите длину отверстия: ");
		double a = in.nextDouble();
		System.out.print("Введите ширину отверстия: ");
		double b = in.nextDouble();
		System.out.print("Введите радиус фигуры: ");
		double r = in.nextInt();
		double r1 = (Math.sqrt( square(a) + square(b)))/2;
		if (r >= r1) {
			System.out.println("Картонка полностью закроет Ваше отверстие");
		}
		else {
			System.out.println("Картонка слишком мала, чтобы закрыть отверстие");
		} 
	}
}
    