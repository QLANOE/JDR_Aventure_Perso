package aventure_test;

public class Main {

	public static void main(String[] args) {

		CreationPerso CP = new CreationPerso();
		GestionPersonnage gp = new GestionPersonnage();

		Personnage Billy = new Personnage();
		Billy.setNom("Billy");

		Billy.setStatPrimaire(CP.choisirStatsPrincipalesLvl1());
		System.out.println(Billy.competenceToString(Billy.getStatPrimaire()));

		Billy.setCompetences(CP.choisirCompetencesLvl1());
		System.out.println(Billy.competenceToString(Billy.getCompetences()));

		Billy.setCompetences(CP.choisirCompetences());
		System.out.println(Billy.competenceToString(Billy.getCompetences()));

		Billy.setStatSecondaire(CP.choisirStatsSecondaires());
		System.out.println(Billy.competenceToString(Billy.getStatSecondaire()));

		CP.saisirDonneesPersonnage(Billy);
		System.out.println(Billy.toString());

	}

}
