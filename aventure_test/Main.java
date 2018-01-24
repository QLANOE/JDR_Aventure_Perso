package aventure_test;

public class Main {

	public static void main(String[] args) {

		CreationPerso CP = new CreationPerso();

		Personnage Billy = new Personnage();
		Billy.setNom("Billy");

		Billy.setStatPrimaire(CP.choisirStatsPrincipalesPJ());
		for (int i = 0; i < Billy.getStatPrimaire().size(); i++) {

			System.out.println(
					Billy.getStatPrimaire().get(i).getNom() + ": " + Billy.getStatPrimaire().get(i).getNiveau());
		}

		Billy.setStatSecondaire(CP.choisirStatsSecondairesPJ());
		for (int i = 0; i < Billy.getStatSecondaire().size(); i++) {

			System.out.println(
					Billy.getStatSecondaire().get(i).getNom() + ": " + Billy.getStatSecondaire().get(i).getNiveau());
		}

	}

}
