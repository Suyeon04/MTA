package Q38;

class Pickle {
	boolean isPreserved = false;
	private boolean isCreared = false;

	void preserve() {
		isPreserved = true;
	}

	public static void main(String[] args) {
		Pickle pickle = new Pickle();
		pickle.isCreared = true;
		pickle.preserve();

	}
}
