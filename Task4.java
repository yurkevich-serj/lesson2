import java.text.DateFormat;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Task4 {
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите дату в формате year-mm-dd: ");
		String myDateString = scan.nextLine();
		
		LocalDate myDate = LocalDate.parse(myDateString);
		LocalDate myDatePlusDay = myDate.plusDays(1);
		System.out.println("Добавлен один день к Вашей дате- " + myDatePlusDay);
	}
}