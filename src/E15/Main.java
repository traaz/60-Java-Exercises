//Tarihi,yuzyila ceviren fonksiyon
package E15;

public class Main {
	
	public static void hangiYuzyil(int tarih) {
		int yuzy�l=(tarih/100)+1;
		
		System.out.println(yuzy�l+". yuzy�l.");
	}

	public static void main(String[] args) {
		hangiYuzyil(2021);
	}

}
