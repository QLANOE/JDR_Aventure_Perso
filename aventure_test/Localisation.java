package aventure_test;

public enum Localisation {

	FORET("Forêt"), MARECAGE("Marécage"), MONTAGNE("Montagne"), PLAGE("Plage"), AQUATIQUE("Aquatique"), PLAINE(
			"Plaine"), SOUSTERRAIN("Sous-terrain"), URBAIN("Urbain");

	private String name;

	Localisation(String str) {
		this.name = str;
	}

	public String toString() {
		return name;
	}

}
