import java.util.Scanner;

public class exemple {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Adınızı Giriniz : ");
		String isim = scanner.nextLine();
		
		System.out.print("Soyadınızı Giriniz : ");
		String soyisim = scanner.nextLine();
		
		System.out.print("Vize Notunuzu Giriniz : ");
		int vize1 = scanner.nextInt();
		
		System.out.print("Final Notunuzu Giriniz : ");
		int final1 = scanner.nextInt();
		
		double ortalama = (vize1*0.4)+(final1*0.6);
		
		System.out.println("Adınız : "+ isim);
		System.out.println("Soyadınız : "+ soyisim);
		System.out.print("Sınav Ortalamanız :"+ ortalama);

	}

}
