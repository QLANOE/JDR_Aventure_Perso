package aventure_test;

public enum Posture {

	OFFENSIVE("Posture offensive"), DEFENSIVE("Posture défensive"), FOCUS("Posture de focus");

	private String name;

	Posture(String str) {
		this.name = str;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
