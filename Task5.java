public class Task5 {
	public static void main(String[] args) {
		String str = "ProgLangHllfc wefwefcwerxwo"; 
      	char[] strToArray = str.toCharArray();
      	int b = strToArray.length;
      	int a = b/2;
      	System.out.print("Первая половина строки- \"");
      	
      	for(int i = 0; i < a; i++) {
      		System.out.print(strToArray[i]);
      	}
      	System.out.println("\"");
      	System.out.print("Вторая половина строки- \"");
      	for(int i = a; i < b; i++) {
      		System.out.print(strToArray[i]);
      	}
      	System.out.println("\"");
	}
}