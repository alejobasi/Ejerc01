public class prueba {
    public static void main(String[] args)
	{	String s1 = "Computer Science";
		int x = 307;
		String s2 = s1 + " " + x;
		String s3 = s2.substring(10,17);
		String s4 = "is fun";
		String s6 = s2 + s4;
		System.out.println("Este ficheroi se ha modificado");

		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);
		System.out.println("s4: " + s4);
		System.out.println("s5: " + s6);
		
		//showing effect of precedence
		
		x = 3;
		int y = 5;
		String s7 = x + y + "total";
		String s8 = "total " + x + y;
		System.out.println("s6: " + s6);
		System.out.println("s7: " + s7);
		System.out.println("s8: " + s8);
	 
	 System.out.println("me llamo Alejo");
	}  
}
