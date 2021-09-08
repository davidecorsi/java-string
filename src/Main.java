public class Main {
	public static void main(String[] args) {
		String s = new String("Java");
		String s1 = "Java"; // meccanismo implicito
		String s2 = "\""; // per utilizzare il simbolo dei doppi apici nelle stringhe si utilizza l'escape(\)
		String s3 = "Ciao";
		System.out.println(s3.toUpperCase());
		System.out.println("Ciao".toUpperCase());
		System.out.println(s3.length());
		System.out.println(s1.concat(s3));
		System.out.println(s1 + s3); // concatenazione implicita
		String s4 = "Buongiorno";
		System.out.println(s4.substring(2, 6));
		String s5 = s3.toUpperCase();
		String s6 = s3.toUpperCase();
		System.out.println(s5 == s6);
		System.out.println(s5.equals(s6));
		System.out.println("Ciao\nCiao");
	}
}
