import java.text.AttributedString;
import java.util.Scanner;

public class deger_alma {

	public static void main(String[] args) {
		
		// kullancı dan değer alma kısa örnekleri
		/*
		 * nextLine()    -> String
		 * nextInt()     -> Integer
		 * nextByte()    -> Byte
		 * nextFloat()   -> Float
		 * nextDouble()  -> Double
		 */
		Scanner Scanner = new Scanner(System.in);
		
		System.out.print("Adınız Giriniz : ");
		String isim = Scanner.nextLine();
		
		System.out.print("Soyadınız Giriniz : ");
		String soyisim = Scanner.nextLine();
		
		System.out.print("Yaşınız Giriniz : ");
		int yas = Scanner.nextInt();
		
		System.out.print("Boyunuz Giriniz : ");
		double boy = Scanner.nextDouble();
		
		System.out.println("Adınız : "+isim);
		System.out.println("Soyadınız : "+soyisim);
		System.out.println("Yaşınız : "+yas);
		System.out.println("Boyunuz : "+boy);
		
	}

}
