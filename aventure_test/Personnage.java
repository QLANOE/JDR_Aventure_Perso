package aventure_test;

import java.util.List;

public class Personnage {

	private String nom;
	private String niveau;
	private List<Competence> statPrimaire;
	private List<Competence> statSecondaire;
	private List<Competence> competences;
	private String description;
	private int vieActuelle;
	private int vieMax;
	private int psyActuelle;
	private int psyMax;
	private String langue;
	private String postureBase;
	private List<Objet> equipement;
	private List<Don> dons;

	public String getNom() {
		return nom;
	}

	public String getNiveau() {
		return niveau;
	}

	public List<Competence> getStatPrimaire() {
		return statPrimaire;
	}

	public List<Competence> getStatSecondaire() {
		return statSecondaire;
	}

	public List<Competence> getCompetences() {
		return competences;
	}

	public String getDescription() {
		return description;
	}

	public int getVieActuelle() {
		return vieActuelle;
	}

	public int getVieMax() {
		return vieMax;
	}

	public int getPsyActuelle() {
		return psyActuelle;
	}

	public int getPsyMax() {
		return psyMax;
	}

	public String getLangue() {
		return langue;
	}

	public String getPostureBase() {
		return postureBase;
	}

	public List<Objet> getEquipement() {
		return equipement;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public void setStatPrimaire(List<Competence> statPrimaire) {
		this.statPrimaire = statPrimaire;
	}

	public void setStatSecondaire(List<Competence> statSecondaire) {
		this.statSecondaire = statSecondaire;
	}

	public void setCompetences(List<Competence> competences) {
		this.competences = competences;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setVieActuelle(int vieActuelle) {
		this.vieActuelle = vieActuelle;
	}

	public void setVieMax(int vieMax) {
		this.vieMax = vieMax;
	}

	public void setPsyActuelle(int psyActuelle) {
		this.psyActuelle = psyActuelle;
	}

	public void setPsyMax(int psyMax) {
		this.psyMax = psyMax;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public void setPostureBase(String postureBase) {
		this.postureBase = postureBase;
	}

	public void setEquipement(List<Objet> equipement) {
		this.equipement = equipement;
	}

	public List<Don> getDons() {
		return dons;
	}

	public void setDons(List<Don> dons) {
		this.dons = dons;
	}

}
