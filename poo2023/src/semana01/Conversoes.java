package semana01;

public class Conversoes {
	public static void main(String[] args) {
		double d = 12.32423;
		int v = (int)d;
		
		float f = 5.6f;
		byte b = (byte)f;
		
		String s = "100";
		int a = Integer.parseInt(s);
		float c = Float.parseFloat(s);
		double e = Double.parseDouble(s);
		
		//print

		System.out.println(d);
		System.out.println(v);
		System.out.println(f);
		System.out.println(b);
		System.out.println(s);
		System.out.println(a);
		System.out.println(c);
		System.out.println(e);
		
		System.out.println(5 & 3); //1
		System.out.println(5 | 3); //7
	}
}
