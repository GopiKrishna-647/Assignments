
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<6;i+=2) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=3;i>0;i-=2) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
