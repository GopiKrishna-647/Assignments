import java.util.Scanner;
public class Factorial {

	public static int Recursive(int num) {
		if(num==1) {
			return num;
		}
		else {
			return num*Recursive(num-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a integer:");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int fact=1;
		for(int i=num;i>0;i--) {
			fact=fact*i;
		}
		System.out.println(fact);
		System.out.println(Recursive(num));
		in.close();
	}
}
