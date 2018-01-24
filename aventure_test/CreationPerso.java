package aventure_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreationPerso {

	public List<Competence> choisirStatsPrincipalesPJ() {

		Scanner sc = new Scanner(System.in);
		List<Competence> statPrimaire = new ArrayList<Competence>();
		Competence physique = new Competence("Physique");
		Competence social = new Competence("Social");
		Competence mental = new Competence("Mental");

		statPrimaire.add(physique);
		statPrimaire.add(social);
		statPrimaire.add(mental);

		int sommeStat = 0;
		while (sommeStat != 170) {
			for (int i = 0; i < 3; i++) {
				System.out.println("Veuillez saisir la valeur pour le " + statPrimaire.get(i).getNom());
				statPrimaire.get(i).setNiveau(sc.nextInt());
				sommeStat = physique.getNiveau() + social.getNiveau() + mental.getNiveau();
			}
			if (sommeStat != 170) {
				System.out.println("La somme des valeurs des statistiques primaires doit être égal à 170.");
			}

		}

		return statPrimaire;
	}

	public List<Competence> choisirStatsSecondairesPJ() {

		List<Competence> statSecondaire = new ArrayList<Competence>();
		boolean bienrempli = false;
		while (bienrempli == false) {

			int sommeStat = 0;
			while (sommeStat != 60 && sommeStat < 60) {
				Competence competence = new Competence();
				competence.editerCompetence();
				sommeStat = sommeStat + competence.getNiveau();
				statSecondaire.add(competence);
			}
			if (sommeStat != 60) {
				bienrempli = false;
				System.out.println("La somme des compétences doit être égale à 60.");
				statSecondaire.removeAll(statSecondaire);
			} else {
				bienrempli = true;
			}
		}
		return statSecondaire;
	}

}
