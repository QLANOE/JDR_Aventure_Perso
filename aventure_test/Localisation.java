package aventure_test;

public enum Localisation {

	FORET("For�t"), MARECAGE("Mar�cage"), MONTAGNE("Montagne"), PLAGE("Plage"), AQUATIQUE("Aquatique"), PLAINE(
			"Plaine"), SOUSTERRAIN("Sous-terrain"), URBAIN("Urbain");

	private String name;

	Localisation(String str) {
		this.name = str;
	}

	public String toString() {
		return name;
	}

}
