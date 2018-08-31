package modelClasses;

public class Branches {
	public String state;
	public float value;

	/**
	 * @param state
	 * @param value
	 */
	public Branches(String state, float value) {
		super();
		this.state = state;
		this.value = value;
	}

	public Branches() {

	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public String numFormatter(double d) {
		return String.format("%.2f", d);
	}

	@Override
	public String toString() {
		return "\nBranches \n-------------\n" + 
				"state  =  " + state + "\n" + 
				"value$ =  " + numFormatter(value) + "\n";
	}
}
