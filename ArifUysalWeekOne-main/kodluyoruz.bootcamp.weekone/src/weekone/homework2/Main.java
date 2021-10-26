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
   		//For döngüsü ile pattern'da girilen * larý ayýrdýk.
   		//kalan harfleri yeni bir string içerisine atadýk.
   		
   		for (int i = 0; i <= pattern.length()-1; i++) {
			if (pattern.charAt(i) != '*') {
				patternNew = patternNew + pattern.charAt(i);
			}
		}
   		/* Bu for döngüleri ile yýldýzsýz oluþturdugumuz pattern'in içinde 
   		 * str olarak girilen harflerin olup olmadýgýna bakýyoruz.
   		 * girilen harf ve yeni pattern'deki harf aynýysa sayacý ve substringi 1 arttýrýyoruz.
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
		/* Sayac sayýmýz yeni patternin sayýsýndan fazla veya eþit olursa aradýðýmýz
		 * harfleri buldugumuz anlamýna geliyor. 
		 * bulduysak true bulamadýysak false döndürüyoruz.
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
