package task2;

public class Envelope {

	float a, b;

	public void setA(float a) {
		if (a >= 0) {
			this.a = a;
		} else {
			throw new IllegalArgumentException("Size cannot be negative");
		}
	}

	public void setB(float b) {
		if (b >= 0) {
			this.b = b;
		} else {
			throw new IllegalArgumentException("Size cannot be negative");
		}
	}

	public float getA() {
		return a;
	}

	public float getB() {
		return b;
	}
	
}
