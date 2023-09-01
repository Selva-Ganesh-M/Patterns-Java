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
	
	private static void p5(int num) {
		for (int i=0; i<num; i++) {
			for (int j=num-i; j>0; j--) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
	}
	
	private static void p6(int num) {
		for (int i=0; i<num; i++) {
			for (int j=0; j<num-i; j++) {
				System.out.print((j+1)+" ");
			}
			System.out.println('\n');
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Pattern1 pattern1 = new Pattern1(5);
//		pattern1.drawPattern();
//		new Pattern2().drawPattern(7);
//		new Pattern3().drawPattern(8);
//		p4(5);
//		p5(5);
		p6(5);
	}

}
