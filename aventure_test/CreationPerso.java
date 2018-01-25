package aventure_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreationPerso {

	public List<Competence> choisirStatsPrincipalesLvl1() {

		List<Competence> statPrimaire = new ArrayList<>();
		int sommeStat = 0;
		do {

			statPrimaire = choisirStatsPrincipales();
			sommeStat = statPrimaire.get(0).getNiveau() + statPrimaire.get(1).getNiveau()
					+ statPrimaire.get(2).getNiveau();
			if (sommeStat != 170) {
				System.out.println("La somme des valeurs des statistiques primaires doit être égal à 170.");
			}

		} while (sommeStat != 170);

		return statPrimaire;
	}

	public List<Competence> choisirStatsPrincipales() {

		Scanner sc = new Scanner(System.in);
		List<Competence> statPrimaire = creerStatsPrincipales();

		for (int i = 0; i < 3; i++) {
			System.out.println("Veuillez saisir la valeur pour le " + statPrimaire.get(i).getNom());
			statPrimaire.get(i).setNiveau(sc.nextInt());
		}

		return statPrimaire;
	}

	public List<Competence> creerStatsPrincipales() {

		List<Competence> statPrimaire = new ArrayList<>();
		Competence physique = new Competence("Physique");
		Competence social = new Competence("Social");
		Competence mental = new Competence("Mental");

		statPrimaire.add(physique);
		statPrimaire.add(social);
		statPrimaire.add(mental);
		return statPrimaire;

	}

	public List<Competence> creerStatSecondaires() {

		List<Competence> statSecondaires = new ArrayList<>();
		Competence force = new Competence("Force");
		Competence agilite = new Competence("Agilité");
		Competence endurance = new Competence("Endurance");
		Competence charisme = new Competence("Charisme");
		Competence apparence = new Competence("Apparence");
		Competence truc = new Competence("Truc");
		Competence intelligence = new Competence("Intelligence");
		Competence volonte = new Competence("Volonté");
		Competence sagesse = new Competence("Sagesse");

		statSecondaires.add(force);
		statSecondaires.add(agilite);
		statSecondaires.add(endurance);
		statSecondaires.add(charisme);
		statSecondaires.add(apparence);
		statSecondaires.add(truc);
		statSecondaires.add(intelligence);
		statSecondaires.add(volonte);
		statSecondaires.add(sagesse);

		return statSecondaires;
	}

	public List<Competence> choisirStatsSecondaires() {

		Scanner sc = new Scanner(System.in);
		List<Competence> statSecondaire = creerStatSecondaires();

		for (int i = 0; i < statSecondaire.size(); i++) {
			System.out.println("Veuillez saisir la valeur pour le " + statSecondaire.get(i).getNom());
			statSecondaire.get(i).setNiveau(sc.nextInt());
		}

		return statSecondaire;
	}

	public List<Competence> choisirCompetencesLvl1() {

		List<Competence> statSecondaire = new ArrayList<>();
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

	public List<Competence> choisirCompetences() {

		List<Competence> statSecondaire = new ArrayList<>();
		String str;
		Scanner sc = new Scanner(System.in);
		do {
			Competence competence = new Competence();
			competence.editerCompetence();
			statSecondaire.add(competence);
			System.out.println("Voulez-vous continuer?\n oui/non");
			str = sc.nextLine();
		} while (str.equals("oui"));

		return statSecondaire;
	}

	public void saisirDonneesPersonnage(Personnage personnage) {

		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir le nom du personnage");
		personnage.setNom(sc.nextLine());
		System.out.println("veuillez saisir la description de votre personnage");
		personnage.setDescription(sc.nextLine());
		System.out.println("Veuillez saisir les langues de votre personnage");
		personnage.setLangue(sc.nextLine());
		System.out.println(
				"Veuillez choisir la posture de base de votre personnage \n 1-Posture offensive\n 2-Posture Défensive\n 3-Posture de focus");
		boolean saisieBonne = false;
		while (saisieBonne == false) {
			saisieBonne = true;
			int index = sc.nextInt();
			switch (index) {
			case 1:
				personnage.setPostureBase(Posture.OFFENSIVE);
				break;
			case 2:
				personnage.setPostureBase(Posture.DEFENSIVE);
				break;
			case 3:
				personnage.setPostureBase(Posture.FOCUS);
				break;
			default:
				System.out.println("Vous n'avez pas saisi un chiffre valide");
				System.out.println(
						"Veuillez choisir la posture de base de votre personnage \n 1-Posture offensive\n 2-Posture Défensive\n 3-Posture de focus");
			}
		}

		System.out.println("Veuillez choisir la vie max de votre personnage");
		personnage.setVieMax(sc.nextInt());
		System.out.println("Veuillez choisir la psy max de votre personnage");
		personnage.setPsyMax(sc.nextInt());
		personnage.setVieActuelle(personnage.getVieMax());
		personnage.setPsyActuelle(personnage.getPsyMax());
	}

}
