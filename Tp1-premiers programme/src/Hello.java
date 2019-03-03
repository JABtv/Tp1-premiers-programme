import java.util.Scanner;

public class Hello {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("bonjour et bienvenu sur mon programme java");
		
		System.out.println("quel est votre nom ?");
		String nom = scan.nextLine();
		System.out.println("bonjour " + nom);
		
		System.out.println("quel est votre prenom ?");
		String prenom = scan.nextLine();
		System.out.println("bonjour " + nom + " " + prenom);
		
		System.out.println("quel est votre age ?");
		int age = scan.nextInt();
		if (age >= 18) {
		System.out.println("bonjour " + nom + " " + prenom + " " + age + " , vous êtes majeur");
		}
		else System.out.println("bonjour " + nom + " " + prenom + " " + age + " , vous n'êtes pas majeur");
	}

}
