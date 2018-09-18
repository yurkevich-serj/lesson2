import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите сообщение, состоящее только из символов \'?\' и \'#\':");
		String message = scan.nextLine();
		char[] symbols = message.toCharArray();
		int j = 0;
		for (int i = 0; i < symbols.length; i++) {
			if (symbols[i] == '?') {
				j++;
			}		
			else {
				continue;
			}
		}
		String[] hello = new String[j];
		
		for (int i = 0; i < symbols.length; i++) {
			if (symbols[i] == '?') {
				int k = 0;
				hello[k] = "Hello";
				System.out.print(hello[k]);
				k++;
			}		
			else {
				continue;
			}
		}
		System.out.println("");
	}
}