import java.util.ArrayList;
public class ListString {
	public static ArrayList<String> clone(ArrayList<String> ls1,ArrayList<String> ls2){
		for(int i=0;i<ls1.size();i++){
			ls1.set(i, ls2.get(i));
		}
		return ls1;
	}
	public static ArrayList<String> swap(int i1,int i2,ArrayList<String> ls1){
		String temp=ls1.get(i1);
		ls1.set(i1, ls1.get(i2));
		ls1.set(i2, temp);
		return ls1;
	}
	public static ArrayList<String> start(ArrayList<String> ls){
		ArrayList<String> a=new ArrayList<String>();
		int len=ls.size();
		for(int i=0;i<len;i++) {
			String temp=ls.get(i);
			char c=temp.charAt(0);
			if(temp.length()==3 && (c=='a' || c=='A')) {
				a.add(temp);
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ls=new ArrayList<String>();
		ls.add("Gopi");
		ls.add("Api");
		ls.add("AAP");
		ls.add("Apijm");
		ls.add("abc");
		ArrayList<String> another=new ArrayList<String>();
		another.add("maths");
		another.add("labst");
		another.add("bio");
		another.add("physics");
		another.add("chem");
		another.add("Mech");
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
		
		ls=start(ls);
		System.out.println("Size after modification is:"+ls.size());
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
		ls=swap(1,0,ls);
		System.out.println("##########After swap###############");
		System.out.println(ls.size());
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
		ls.addAll(ls);
		System.out.println("##########After Joining############");
		System.out.println("Size is:"+ls.size());
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
		clone(ls,another);
		System.out.println("##########After Cloning############");
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
	}

}
