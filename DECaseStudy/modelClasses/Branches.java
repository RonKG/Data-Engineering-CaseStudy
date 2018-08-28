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

	@Override
	public String toString() {
		return "\nBranches [state=" + state + ", value$=" + value + "]";
	}
}
