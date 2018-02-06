package aventure_test;

public class Main {

	public static void main(String[] args) {

		GestionPersonnage gp = new GestionPersonnage();

		Personnage Billy = gp.creationPersonnageLvl1();

		// Personnage Billy = gp.testFonctionalite();

		System.out.println(Billy.toString());

	}

}
