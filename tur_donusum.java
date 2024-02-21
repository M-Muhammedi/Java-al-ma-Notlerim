import java.util.function.DoubleToIntFunction;

public class tur_donusum {

	public static void main(String[] args) {
		// -------------- TÜR DÖNÜSÜMÜLERİ -----------------------

		/*
		 * 
		 * 1- String tipinden int tipine dönüştürme
		 * 
		 * 2- Int tipinden String tipine dönüştürme
		 * 
		 * 3- Double tipinden int tipine dönüştürme
		 * 
		 * 4- Int tipinden double tipine dönüştürme
		 * 
		 * 5- //Float tipinden long tipine dönüştürme
		 * 
		 * 6- Long tipinden float tipine dönüştürme
		 * 
		 * 7- Long tipinden string tipine dönüştürme
		 * 
		 * 8- Float tipinden string tipine dönüştürme
		 * 
		 * 9- Byte tipinden string tipine dönüştürme
		 * 
		 */

		// 1
		String a = "5";

		int b = Integer.valueOf(a);

		// ikinci türü
		// * int b = Integer.parseInt(a);
		System.out.println(b);

		// 2
		int c = 21;

		String d = String.valueOf(c);
		System.out.println(d);

		// 3
		double e = 5.50;

		int f = (int) e;
		System.out.println(f);

		// 4
		int g = 5;

		double h = (double) g;
		System.out.println(h);

		// 5
		float t = 5.12f;

		long u = (long) t;
		System.out.println(u);

		// 6
		long i = 5;

		float j = (float) i;
		System.out.println(j);

		// 7
		long k = 5;

		String l = String.valueOf(k);
		System.out.println(l);

		// 8
		float m = 5.12f;

		String n = String.valueOf(m);
		System.out.println(n);

		// 9
		byte o = 55;

		String p = Byte.toString(o);
		System.out.println(p);
	}

}
