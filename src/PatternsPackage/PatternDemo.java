package PatternsPackage;

public class PatternDemo {

	private static void p4(int num) {
		for (int i=0; i<num; i++) {
			for (int j=0; j<i+1; j++) {
				System.out.print((i+1)+" ");
			}
			System.out.println("\n");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Pattern1 pattern1 = new Pattern1(5);
//		pattern1.drawPattern();
//		new Pattern2().drawPattern(7);
//		new Pattern3().drawPattern(8);
		p4(5);
	}

}
