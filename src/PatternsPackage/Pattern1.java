package PatternsPackage;

public class Pattern1 {
	private int number;
	public Pattern1 (int number) {
		this.number = number;
	}
	public void drawPattern() {
		for (int i=0; i<this.number; i++) {
			for (int j=0; j<this.number; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
