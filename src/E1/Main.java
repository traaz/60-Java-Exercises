//Birbirinden farkli olarak verilen iki adet sayidan, buyuk olani bulup gosteren kod
package E1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("�lk sayiyi giriniz");
		int a=scanner.nextInt();
		System.out.println("�kinci sayiyi giriniz");
		int b=scanner.nextInt();
		if(a>b) {
			System.out.println("Girdiginiz sayilardan buyuk olani "+a+"'dir.");
		}else if(a<b) {
			System.out.println("Girdiginiz sayilardan buyuk olani "+b+"'dir.");
		}else {
			System.out.println("Girdiginiz iki sayi birbirine esittir.");
		}
		
		
		
		
		
	}
	

}
