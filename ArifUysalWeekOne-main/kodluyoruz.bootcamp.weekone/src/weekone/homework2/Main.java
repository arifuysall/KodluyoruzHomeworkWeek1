package weekone.homework2;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		String str = null; 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a pattern!");
		String pattern = scanner.nextLine();
		
		while(str != "exit") {
		System.out.println("Enter a string!");
		str = scanner.nextLine();
		if (str.equals("exit")){
			System.out.println("BYE!");
			break;
		}
		else {
		occursIn(pattern, str);
		}}
		
}
	
	public static boolean occursIn(String pattern, String str) {
   		String patternNew ="";
   		//For d�ng�s� ile pattern'da girilen * lar� ay�rd�k.
   		//kalan harfleri yeni bir string i�erisine atad�k.
   		
   		for (int i = 0; i <= pattern.length()-1; i++) {
			if (pattern.charAt(i) != '*') {
				patternNew = patternNew + pattern.charAt(i);
			}
		}
   		/* Bu for d�ng�leri ile y�ld�zs�z olu�turdugumuz pattern'in i�inde 
   		 * str olarak girilen harflerin olup olmad�g�na bak�yoruz.
   		 * girilen harf ve yeni pattern'deki harf ayn�ysa sayac� ve substringi 1 artt�r�yoruz.
   		 */
		
   		int counter= 0;
		for (int j = 0; j < patternNew.length(); j++) {
			for( int k = 0; k < str.length(); k++) {
					char x = patternNew.charAt(j);
					if (str.charAt(k) == x){
						counter++;
						str=str.substring(k+1);
						}
					
			}
		/* Sayac say�m�z yeni patternin say�s�ndan fazla veya e�it olursa arad���m�z
		 * harfleri buldugumuz anlam�na geliyor. 
		 * bulduysak true bulamad�ysak false d�nd�r�yoruz.
		 */
			
		}
		
		if (counter>=patternNew.length()) {
			System.out.println(pattern+" occurs!");
			return true;
		}
		else {
			System.out.println(pattern+" does NOT occur");
			return false;
		}
   	}
}
