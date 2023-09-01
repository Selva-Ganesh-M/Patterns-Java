package PatternsPackage;

public class Pattern3 {
	public void drawPattern(int num) {
		for (int i=0; i<num; i++) {
			for (int j=0; j<i+1; j++) {
				System.out.print((j+1)+" ");
			}
			System.out.println("\n");
		}
	}
}
