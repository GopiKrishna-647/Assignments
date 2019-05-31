import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char temp='a';
		Scanner in=new Scanner(System.in);
		String rev=in.nextLine();
		in.close();
		int len=rev.length();
		char[] revarr=rev.toCharArray();
		for(int i=0;i<len/2;i++) {
			temp=revarr[i];
			revarr[i]=revarr[len-i-1];
			revarr[len-i-1]=temp;
		}
		rev=String.copyValueOf(revarr);
		System.out.println(rev);
	}

}
