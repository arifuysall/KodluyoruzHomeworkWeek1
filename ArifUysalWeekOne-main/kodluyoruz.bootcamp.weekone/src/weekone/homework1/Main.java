package weekone.homework1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // 1. satýrdaki * lar için for döngüsü.
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        if ( n%2  == 0 ){
            // 2 ile bölünebilen n sayýlarýndaki iç desendeki boþluk + lar için for döngüleri.
            for (int j = 0; j < n - 2; j++) {
                System.out.println();
                if ( j % 2 == 1){
                    for (int k = 0; k <= n / 2; k++) {
                        if (k == 0 || k == n / 2) {
                            System.out.print("*");
                        } else {
                            System.out.print(" +");
                        }
                    }
                }
                else {
                    for (int k = 0; k <= (n / 2); k++) {
                        if (k == 0 || k == (n / 2)) {
                            System.out.print("*");
                        } else {
                            System.out.print("+");
                            System.out.print(" ");
                        }
                    }
                }
            }
            System.out.println();
            // son satýrdaki yýldýzlar için for döngüsü.
            for ( int l = 0 ; l < n ; l++){
                System.out.print("*");
            }
        }
        else{
            //2 ile bölünemeyen n sayýlarýndaki iç desendeki boþluk ve + lar için for döngüleri.
            for (int j = 0; j < n-2; j++) {
                System.out.println();
                if ( j % 2 == 1){
                    for (int k = 0; k <= (n/2); k++) {
                        if (k == 0 || k == (n / 2)+1) {
                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                            if (k == (n/2) ) {
                                System.out.print("*");
                                break;
                            }
                            else {
                                System.out.print("+");
                            }
                        }
                    }
                }
                else {
                    for (int k = 0; k <= (n / 2)+1; k++) {
                        if (k == 0 || k == (n / 2)+1) {
                            System.out.print("*");
                            }
                        else {
                            System.out.print("+");
                            if (k == (n/2) ) {
                                System.out.print("*");
                                break;
                            }
                            else {
                                System.out.print(" ");
                            }
                        }
                    }
                }
            }

            System.out.println();
            // son satýrdaki yýldýzlar için for döngüsü.
            for ( int l = 0 ; l < n ; l++){
                if (n>1) {
                    System.out.print("*");
                }
            }
        }
    }
}


	
	

